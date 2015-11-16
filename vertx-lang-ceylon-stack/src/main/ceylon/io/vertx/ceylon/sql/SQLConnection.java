package io.vertx.ceylon.sql;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.json.JsonArray;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class SQLConnection implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLConnection, SQLConnection> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.sql.SQLConnection, SQLConnection>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLConnection, SQLConnection> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.sql.SQLConnection, SQLConnection>() {
        public SQLConnection convert(io.vertx.ext.sql.SQLConnection src) {
          return new SQLConnection(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SQLConnection, io.vertx.ext.sql.SQLConnection> TO_JAVA = new io.vertx.lang.ceylon.Converter<SQLConnection, io.vertx.ext.sql.SQLConnection>() {
    public io.vertx.ext.sql.SQLConnection convert(SQLConnection src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SQLConnection.class);
  @Ignore private final io.vertx.ext.sql.SQLConnection delegate;

  public SQLConnection(io.vertx.ext.sql.SQLConnection delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection setAutoCommit(
    final @TypeInfo("ceylon.language::Boolean") @Name("autoCommit") @DocAnnotation$annotation$(description = "todo") boolean autoCommit, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    boolean arg_0 = autoCommit;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.setAutoCommit(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection execute(
    final @TypeInfo("ceylon.language::String") @Name("sql") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.execute(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection query(
    final @TypeInfo("ceylon.language::String") @Name("sql") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.ext.sql.ResultSet>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.ResultSet event) {
        return io.vertx.ceylon.sql.resultSet_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.query(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection queryWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params") @DocAnnotation$annotation$(description = "todo") ceylon.json.Array params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::ResultSet)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(params);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.ResultSet>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.ext.sql.ResultSet>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.ResultSet event) {
        return io.vertx.ceylon.sql.resultSet_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.queryWithParams(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection update(
    final @TypeInfo("ceylon.language::String") @Name("sql") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sql, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::UpdateResult)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.UpdateResult>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.ext.sql.UpdateResult>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.UpdateResult event) {
        return io.vertx.ceylon.sql.updateResult_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.update(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection updateWithParams(
    final @TypeInfo("ceylon.language::String") @Name("sql") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sql, 
    final @TypeInfo("ceylon.json::Array") @Name("params") @DocAnnotation$annotation$(description = "todo") ceylon.json.Array params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.sql::UpdateResult)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sql);
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(params);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.sql.UpdateResult>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.ext.sql.UpdateResult>(resultHandler) {
      public Object toCeylon(io.vertx.ext.sql.UpdateResult event) {
        return io.vertx.ceylon.sql.updateResult_.get_().getToCeylon().safeConvert(event);
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.updateWithParams(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.close(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection commit(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.commit(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.sql::SQLConnection")
  public SQLConnection rollback(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    SQLConnection ret = io.vertx.ceylon.sql.SQLConnection.TO_CEYLON.converter().safeConvert(delegate.rollback(arg_0));
    return this;
  }

}
