package s2omikuji.action;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import s2omikuji.dto.SearchUnseilistDto;
import s2omikuji.form.Statistics2Form;
import s2omikuji.service.ResultService;

/**
 * @author a_aoki
 *
 */
public class Statistics2Action {
	/**アクションフォーム*/
	@ActionForm
	@Resource
	protected Statistics2Form statistics2Form;
	@Resource
	protected HttpServletRequest request;
	@Resource
	protected HttpServletResponse response;
	@Resource
	protected JdbcManager jdbcManager;
	@Resource
	protected ResultService resultService;

	public SearchUnseilistDto searchUnseilistDto;
	/**
	 * 時計2のアクションクラス
	 * @return 統計2のリスト
	 */
	@Execute(validator = false)
	public String execute() {

		//Formから入力された誕生日を取得
		Date birthday = new Date(0);
		birthday = statistics2Form.birthday;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String birthday2 = sdf.format(birthday);
		//統計から結果へ戻る時に使う
		request.setAttribute("birthday2",birthday2);

		Calendar cal = Calendar.getInstance();
		//過去半年の計算
		java.util.Date date2 = new java.util.Date();
		cal.setTime(date2);
		cal.add(Calendar.MONTH, -6);
		Date date3 = new Date(cal.getTime().getTime());

		//運勢リストを持ってくる
		List<SearchUnseilistDto> stlist2 = resultService.pastresult(birthday, date3);

		request.setAttribute("pastresult", stlist2);

		return "statistics2.jsp";

	}

}
