package wtune.stmt.dao;

import wtune.sql.schema.SchemaPatch;
import wtune.stmt.dao.internal.DbSchemaPatchDao;

import java.util.List;

public interface SchemaPatchDao {
  List<SchemaPatch> findByApp(String appName);

  void save(SchemaPatch patch);

  void truncate(String app);

  void beginBatch();

  void endBatch();

  static SchemaPatchDao instance() {
    return DbSchemaPatchDao.instance();
  }
}
