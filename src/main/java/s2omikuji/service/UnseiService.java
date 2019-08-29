package s2omikuji.service;

import java.util.List;
import javax.annotation.Generated;
import s2omikuji.entity.Unsei;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static s2omikuji.entity.UnseiNames.*;

/**
 * {@link Unsei}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2019/08/20 19:02:29")
public class UnseiService extends AbstractService<Unsei> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param unseiId
     *            識別子
     * @return エンティティ
     */
    public Unsei findById(Integer unseiId) {
        return select().id(unseiId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Unsei> findAllOrderById() {
        return select().orderBy(asc(unseiId())).getResultList();
    }
}