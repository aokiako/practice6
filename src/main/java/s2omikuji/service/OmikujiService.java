package s2omikuji.service;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static s2omikuji.entity.OmikujiNames.*;

import java.util.List;

import javax.annotation.Generated;

import s2omikuji.entity.Omikuji;

/**
 * {@link Omikuji}のサービスクラスです。
 * @author a_aoki
 */
@Generated(value = { "S2JDBC-Gen 2.4.46",
		"org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2019/08/08 10:41:32")
public class OmikujiService extends AbstractService<Omikuji> {

	/**
	 * 識別子の昇順ですべてのエンティティを検索します。
	 *
	 * @return エンティティのリスト
	 */
	public List<Omikuji> findAllOrderById() {
		return select().orderBy(asc(omikujiId())).getResultList();
	}

	/**
	 * 運勢を選ぶ
	 *@param omikuji_id おみくじID
	 *@return おみくじ
	 * */
	public Omikuji findById(int omikuji_id) {
		return jdbcManager
				.from(Omikuji.class)
				.innerJoin("unsei")
				.where(eq(omikujiId(), omikuji_id))
				.getSingleResult();

	}

}
