package s2omikuji.service;

import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import s2omikuji.dto.SearchUnseilist;
import s2omikuji.dto.SearchUnseilistDto;
import s2omikuji.dto.SearchUnseiname;
import s2omikuji.entity.Result;

/**
 * {@link Result}のサービスクラスです。
 *
 * @author a_aoki
 *
 */
@Generated(value = { "S2JDBC-Gen 2.4.46",
		"org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2019/08/08 10:41:32")
public class ResultService extends AbstractService<Result> {
	public Date birthday;

	/**
	 * 一度入力された誕生日か調べる
	 *
	 * @param birthday 入力された誕生日
	 * @return　入力された誕生日で出たおみくじ
	 *
	 * */
	public Result findByBirthday(Date birthday) {
		return jdbcManager
				.from(Result.class)
				.where("fortune_day=current_date and birthday=?", birthday)
				.getSingleResult();

	}

	/**
	 * 運勢ごとの件数取得(統計1)
	 *
	 * @param date1 今日の日付
	 * @return 運勢名と件数
	 *
	 * */
	public List<SearchUnseiname> selectPercentage(Date date1) {
		return jdbcManager
				.selectBySqlFile(SearchUnseiname.class,
						"s2omikuji/service/statistics1.sql",
						date1)
				.getResultList();
	}

	/**
	 *期間ごとの全件数取得(統計1)
	 *
	 *@param targetDay 今日の日付
	 *@return 期間ごとの全件数
	 */
	public long getCount(Date targetDay) {
		return jdbcManager
				.from(Result.class)
				.where("fortune_day>=?", targetDay)
				.getCount();
	}

	/**
	 * 出た運勢リスト(統計2)
	 *
	 * @param birthday 誕生日
	 * @param date3 今日の日付
	 * @return 入力された誕生日の運勢リスト
	 *
	 * */
	public List<SearchUnseilistDto> pastresult(Date birthday, Date date3) {
		SearchUnseilist unseilist = new SearchUnseilist();
		unseilist.past = date3;
		unseilist.birthday = birthday;

		return jdbcManager
				.selectBySqlFile(SearchUnseilistDto.class, "s2omikuji/service/statistics2.sql", unseilist)
				.getResultList();

	}
}
