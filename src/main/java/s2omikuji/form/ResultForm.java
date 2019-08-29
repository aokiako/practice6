package s2omikuji.form;

import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Required;

/**
 * 結果表示の値を保持するform
 * @author a_aoki
 */
public class ResultForm {

	@Required
	//正規表現で入力チェック
	@Mask(mask = "^(\\d{4})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$", arg0 = @Arg(key = "birthday", resource = false))
	public String birthday;

	public ActionMessages validate() {
		ActionMessages errors = new ActionMessages();
		if (!birthday.equals("^(\\d{4})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$")) {
		}
		return errors;
	}

	/** 運勢名文字列*/
	public String unsei_name;
	/** 願い事文字列*/
	public String negaigoto;
	/** 商い文字列*/
	public String akinai;
	/** 学問文字列*/
	public String gakumon;

}
