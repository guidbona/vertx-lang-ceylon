package io.vertx.ceylon.core.http;

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
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " An asynchronous HTTP client.\n <p>\n It allows you to make requests to HTTP servers, and a single client can make requests to any server.\n <p>\n It also allows you to open WebSockets to servers.\n <p>\n The client can also pool HTTP connections.\n <p>\n For pooling to occur, keep-alive must be true on the [HttpClientOptions](../http/HttpClientOptions.type.html) (default is true).\n In this case connections will be pooled and re-used if there are pending HTTP requests waiting to get a connection,\n otherwise they will be closed.\n <p>\n This gives the benefits of keep alive when the client is loaded but means we don't keep connections hanging around\n unnecessarily when there would be no benefits anyway.\n <p>\n The client also supports pipe-lining of requests. Pipe-lining means another request is sent on the same connection\n before the response from the preceeding one has returned. Pipe-lining is not appropriate for all requests.\n <p>\n To enable pipe-lining, it must be enabled on the [HttpClientOptions](../http/HttpClientOptions.type.html) (default is false).\n <p>\n When pipe-lining is enabled the connection will be automatically closed when all in-flight responses have returned\n and there are no outstanding pending requests to write.\n <p>\n The client is designed to be reused between requests.\n")
public class HttpClient implements ReifiedType,  Measured {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpClient, HttpClient> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpClient, HttpClient>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClient, HttpClient> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClient, HttpClient>() {
        public HttpClient convert(io.vertx.core.http.HttpClient src) {
          return new HttpClient(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HttpClient, io.vertx.core.http.HttpClient> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpClient, io.vertx.core.http.HttpClient>() {
    public io.vertx.core.http.HttpClient convert(HttpClient src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpClient.class);
  @Ignore private final io.vertx.core.http.HttpClient delegate;

  public HttpClient(io.vertx.core.http.HttpClient delegate) {
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

  @DocAnnotation$annotation$(description = " Whether the metrics are enabled for this measured object\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP request to send to the server at the specified host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    int arg_1 = (int)port;
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.request(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP request to send to the server at the specified host and default port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.request(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP request to send to the server at the specified host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    int arg_1 = (int)port;
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_4 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.request(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP request to send to the server at the specified host and default port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.request(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP request to send to the server at the default host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.request(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP request to send to the server at the default host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.request(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP request to send to the server using an absolute URI\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest requestAbs(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.requestAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP request to send to the server using an absolute URI, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest requestAbs(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.requestAbs(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP GET request to send to the server at the specified host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.get(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP GET request to send to the server at the specified host and default port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.get(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP GET request to send to the server at the specified host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.get(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP GET request to send to the server at the specified host and default port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.get(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP GET request to send to the server at the default host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP GET request to send to the server at the default host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.get(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP GET request to send to the server using an absolute URI\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest getAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.getAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP GET request to send to the server using an absolute URI, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest getAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.getAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Sends an HTTP GET request to the server at the specified host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.getNow(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sends an HTTP GET request to the server at the specified host and default port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.getNow(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sends an HTTP GET request  to the server at the default host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.getNow(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP POST request to send to the server at the specified host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.post(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP POST request to send to the server at the specified host and default port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.post(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP POST request to send to the server at the specified host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.post(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP POST request to send to the server at the specified host and default port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.post(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP POST request to send to the server at the default host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.post(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP POST request to send to the server at the default host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.post(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP POST request to send to the server using an absolute URI\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest postAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.postAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP POST request to send to the server using an absolute URI, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest postAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.postAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP HEAD request to send to the server at the specified host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.head(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP HEAD request to send to the server at the specified host and default port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.head(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP HEAD request to send to the server at the specified host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.head(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP HEAD request to send to the server at the specified host and default port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.head(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP HEAD request to send to the server at the default host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.head(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP HEAD request to send to the server at the default host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.head(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP HEAD request to send to the server using an absolute URI\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest headAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.headAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP HEAD request to send to the server using an absolute URI, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest headAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.headAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Sends an HTTP HEAD request to the server at the specified host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.headNow(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sends an HTTP HEAD request to the server at the specified host and default port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.headNow(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sends an HTTP HEAD request  to the server at the default host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.headNow(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP OPTIONS request to send to the server at the specified host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.options(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP OPTIONS request to send to the server at the specified host and default port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.options(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP OPTIONS request to send to the server at the specified host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.options(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP OPTIONS request to send to the server at the specified host and default port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.options(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP OPTIONS request to send to the server at the default host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.options(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP OPTIONS request to send to the server at the default host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.options(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP OPTIONS request to send to the server using an absolute URI\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest optionsAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.optionsAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP OPTIONS request to send to the server using an absolute URI, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest optionsAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.optionsAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Sends an HTTP OPTIONS request to the server at the specified host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.optionsNow(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sends an HTTP OPTIONS request to the server at the specified host and default port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.optionsNow(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sends an HTTP OPTIONS request  to the server at the default host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.optionsNow(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP PUT request to send to the server at the specified host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.put(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP PUT request to send to the server at the specified host and default port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.put(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP PUT request to send to the server at the specified host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.put(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP PUT request to send to the server at the specified host and default port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.put(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP PUT request to send to the server at the default host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.put(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP PUT request to send to the server at the default host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.put(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP PUT request to send to the server using an absolute URI\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.putAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP PUT request to send to the server using an absolute URI, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.putAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP DELETE request to send to the server at the specified host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.delete(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP DELETE request to send to the server at the specified host and default port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.delete(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP DELETE request to send to the server at the specified host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.delete(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP DELETE request to send to the server at the specified host and default port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.delete(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP DELETE request to send to the server at the default host and port.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.delete(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP DELETE request to send to the server at the default host and port, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.delete(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP DELETE request to send to the server using an absolute URI\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest deleteAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.deleteAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an HTTP DELETE request to send to the server using an absolute URI, specifying a response handler to receive\n the response\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest deleteAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.deleteAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified port, host and relative request URI\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified port, host and relative request URI\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_4 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the host and relative request URI and default port\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the host and relative request URI and default port\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_3 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified port, host and relative request URI, and with the specified headers\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified port, host and relative request URI, and with the specified headers\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_5 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified host,relative request UR, and default port and with the specified headers\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified host,relative request UR, and default port and with the specified headers\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_4 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified port, host and relative request URI, with the specified headers and using\n the specified version of WebSockets\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified port, host and relative request URI, with the specified headers and using\n the specified version of WebSockets\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_6 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified host, relative request URI and default port with the specified headers and using\n the specified version of WebSockets\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified host, relative request URI and default port with the specified headers and using\n the specified version of WebSockets\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_5 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified port, host and relative request URI, with the specified headers, using\n the specified version of WebSockets, and the specified websocket sub protocols\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    java.lang.String arg_5 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_6 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified port, host and relative request URI, with the specified headers, using\n the specified version of WebSockets, and the specified websocket sub protocols\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    java.lang.String arg_5 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_6 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_7 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified host, relative request URI and default port, with the specified headers, using\n the specified version of WebSockets, and the specified websocket sub protocols\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    java.lang.String arg_4 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket to the specified host, relative request URI and default port, with the specified headers, using\n the specified version of WebSockets, and the specified websocket sub protocols\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    java.lang.String arg_4 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_6 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket at the relative request URI using the default host and port\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_1 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket at the relative request URI using the default host and port\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_1 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_2 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket at the relative request URI using the default host and port and the specified headers\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket at the relative request URI using the default host and port and the specified headers\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_3 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket at the relative request URI using the default host and port, the specified headers and the\n specified version of WebSockets\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket at the relative request URI using the default host and port, the specified headers and the\n specified version of WebSockets\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_4 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket at the relative request URI using the default host and port, the specified headers, the\n specified version of WebSockets and the specified sub protocols\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = " Connect a WebSocket at the relative request URI using the default host and port, the specified headers, the\n specified version of WebSockets and the specified sub protocols\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_5 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.converter().safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return this;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream to the specified port, host and relative request URI\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream to the specified host, relative request URI and default port\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream to the specified port, host and relative request URI, and with the specified headers\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream to the specified host, relative request URI and default port and with the specified headers\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream to the specified port, host and relative request URI, with the specified headers and using\n the specified version of WebSockets\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream to the specified host, relative request URI and default port and with the specified headers and using\n the specified version of WebSockets\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream to the specified port, host and relative request URI, with the specified headers, using\n the specified version of WebSockets, and the specified websocket sub protocols\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    java.lang.String arg_5 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream to the specified host, relative request URI and default port, with the specified headers, using\n the specified version of WebSockets, and the specified websocket sub protocols\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    java.lang.String arg_4 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream at the relative request URI using the default host and port and the specified headers\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream at the relative request URI using the default host and port and the specified headers\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream at the relative request URI using the default host and port, the specified headers and the\n specified version of WebSockets\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a WebSocket stream at the relative request URI using the default host and port, the specified headers, the\n specified version of WebSockets and the specified sub protocols\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.websocketVersion_.get_().getToJava().safeConvert(version);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Close the client. Closing will close down any pooled connections.\n Clients should always be closed after use.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
