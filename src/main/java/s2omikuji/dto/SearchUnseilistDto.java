package s2omikuji.dto;

import java.util.Date;

/**
 *
 * sqlファイルの検索結果を受け取るDTO
 * @author a_aoki
 *
 */
public class SearchUnseilistDto {
	/** 運勢名文字列*/
	public String unseiName;
	/** 願い事文字列*/
	public String negaigoto;
	/** 商い文字列*/
	public String akinai;
	/** 学問文字列*/
	public String gakumon;
	/** 占い日の日付*/
	public Date fortuneDay;

	/**
	 * 占い日を取得
	 * @return 占い日の日付
	 */
	public Date getFortuneDay() {
		return fortuneDay;
	}
	/**
	 * 占い日を設定
	 * @param fortuneDay 占い日の日付
	 */
	public void setFortuneDay(Date fortuneDay) {
		this.fortuneDay = fortuneDay;
	}
	/**
	 * 運勢名を取得
	 * @return 運勢名文字列
	 */
	public String getUnseiName() {
		return unseiName;
	}
	/**
	 * 運勢名を設定
	 * @param unseiName 運勢名文字列
	 */
	public void setUnseiName(String unseiName) {
		this.unseiName = unseiName;
	}
	/**
	 * 願い事を取得
	 * @return 願い事文字列
	 */
	public String getNegaigoto() {
		return negaigoto;
	}
	/**
	 * 願い事を設定
	 * @param negaigoto 願い事文字列
	 */
	public void setNegaigoto(String negaigoto) {
		this.negaigoto = negaigoto;
	}
	/**
	 * 商いを取得
	 * @return 商い文字列
	 */
	public String getAkinai() {
		return akinai;
	}
	/**
	 * 商いを設定
	 * @param akinai 商い文字列
	 */
	public void setAkinai(String akinai) {
		this.akinai = akinai;
	}
	/**
	 * 学問を取得
	 * @return 学問文字列
	 */
	public String getGakumon() {
		return gakumon;
	}
	/**
	 * 学問を設定
	 * @param gakumon 学問文字列
	 */
	public void setGakumon(String gakumon) {
		this.gakumon = gakumon;
	}

}
