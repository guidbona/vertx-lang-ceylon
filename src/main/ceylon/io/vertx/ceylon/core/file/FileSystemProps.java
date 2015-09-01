package io.vertx.ceylon.core.file;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class FileSystemProps {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(FileSystemProps.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.file.FileSystemProps, FileSystemProps> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.file.FileSystemProps, FileSystemProps>() {
    public FileSystemProps convert(io.vertx.core.file.FileSystemProps src) {
      return new FileSystemProps(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<FileSystemProps, io.vertx.core.file.FileSystemProps> TO_JAVA = new io.vertx.lang.ceylon.Converter<FileSystemProps, io.vertx.core.file.FileSystemProps>() {
    public io.vertx.core.file.FileSystemProps convert(FileSystemProps src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.file.FileSystemProps delegate;

  public FileSystemProps(io.vertx.core.file.FileSystemProps delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long totalSpace() {
    long ret = delegate.totalSpace();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long unallocatedSpace() {
    long ret = delegate.unallocatedSpace();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long usableSpace() {
    long ret = delegate.usableSpace();
    return ret;
  }

}