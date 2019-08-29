package s2omikuji.action;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import s2omikuji.entity.Omikuji;
import s2omikuji.entity.Result;
import s2omikuji.form.ResultForm;
import s2omikuji.service.OmikujiService;
import s2omikuji.service.ResultService;

/**
 * @author a_aoki
 *
 */
public class ResultAction {
	/**  結果表示のアクションフォーム */
	@ActionForm
	@Resource
	protected ResultForm resultForm;
	@Resource
	protected HttpServletRequest request;
	@Resource
	protected HttpServletResponse response;
	@Resource
	protected JdbcManager jdbcManager;
	@Resource
	protected OmikujiService omikujiService;
	@Resource
	protected ResultService resultService;

	public Omikuji omikuji;

	/**
	 * おみくじの結果を表示するアクションクラス
	 * @return おみくじの結果
	 */
	@SuppressWarnings("unused")
	@Execute(validator = true, input = "/index.jsp")

	public String execute() {

		try {
			//omikujiidの生成
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			java.util.Date dateBirthday = sdf.parse(resultForm.birthday);
			//sql.Dateに変換
			Date birthday = new java.sql.Date(dateBirthday.getTime());
			Result result = new Result();
			result = resultService.findByBirthday(birthday);

			//			 result = new java.sql.Date() ;
			long max = omikujiService.getCount();
			//一度引いたおみくじがなかったら、ランダムで引いてDBに書き込む
			if (result == null) {
				// ランダムの処理
				Random rand2 = new Random();
				int omikujiId2 = rand2.nextInt((int) max);
				//運勢
				omikuji = omikujiService.findById(omikujiId2);

				Result result2 = new Result();
				//今日の日付を取得
				Calendar cal = Calendar.getInstance();
				//java.sqlに変換、getTimeでlong型にする
				Date today = new java.sql.Date(cal.getTime().getTime());
				result2.fortuneDay = today;
				result2.birthday = birthday;
				result2.changer = "aoki";
				result2.update = today;
				result2.creater = "aoki";
				result2.createDay = today;
				result2.omikujiId = omikujiId2;
				//serviceに書き込み
				resultService.insert(result2);
				//一度引いていたら書き込みはせずに再度引くだけ
			} else {
				//omikujiServiceから一度引いたおみくじidを取得
				omikuji = omikujiService.findById(result.omikujiId);
			}

			request.setAttribute("birthday", resultService.birthday);
//			request.setAttribute("omikuji", omikuji);
			return "result.jsp";

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}

	}
}