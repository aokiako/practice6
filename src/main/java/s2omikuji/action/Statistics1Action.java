package s2omikuji.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import s2omikuji.dto.SearchUnseiname;
import s2omikuji.form.Statistics1Form;
import s2omikuji.service.OmikujiService;
import s2omikuji.service.ResultService;

/**
 * @author a_aoki
 *
 */
public class Statistics1Action {
	/**アクションフォーム */
	@ActionForm
	@Resource
	protected Statistics1Form statistics1Form;
	@Resource
	protected HttpServletRequest request;
	@Resource
	protected HttpServletResponse response;
	@Resource
	protected JdbcManager jdbcManager;
	@Resource
	protected ResultService resultService;
	@Resource
	protected OmikujiService omikujiService;

	/**
	 * 統計1のアクションクラス
	 * @return おみくじの割合
	 */
	@Execute(validator = false)
	public String execute() {

		//日付の形式を(yyyyMMdd)へ変換
		Date birthday = new Date();
		birthday = statistics1Form.birthday;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String birthday2 = sdf.format(birthday);
		//統計から結果へ戻る時に使う
		request.setAttribute("birthday2", birthday2);

		Calendar cal1 = Calendar.getInstance();
		//今日
		java.sql.Date date1 = new java.sql.Date(cal1.getTime().getTime());
		//過去半年の計算
		Date date = new Date();
		cal1.setTime(date);
		cal1.add(Calendar.MONTH, -6);
		java.sql.Date date2 = new java.sql.Date(cal1.getTime().getTime());

		//Serviceから全件取得
		int count = (int) resultService.getCount(date1);
		int count2 = (int) resultService.getCount(date2);
		//今日と過去半年の日付を入れる
		List<SearchUnseiname> stlist1 = resultService.selectPercentage(date1);
		List<SearchUnseiname> stlist2 = resultService.selectPercentage(date2);

		//パーセント計算してMapに詰める
		//今日
		Map<String, Integer> map = new LinkedHashMap<>();
		for (SearchUnseiname sta1 : stlist1) {
			int stat1 = sta1.cnt;

			double per = (double) stat1 / count;
			per = per * 100;
			int pertoday = (int) per;

			map.put(sta1.unseiName, pertoday);
		}
		request.setAttribute("percent", map);

		//過去半年
		Map<String, Integer> map2 = new LinkedHashMap<>();

		for (SearchUnseiname sta2 : stlist2) {
			int stat2 = sta2.cnt;

			double per2 = (double) stat2 / count2;
			per2 = per2 * 100;
			int perpast = (int) per2;

			map2.put(sta2.unseiName, perpast);
		}
		request.setAttribute("percent2", map2);

		return "statistics1.jsp";
	}
}
