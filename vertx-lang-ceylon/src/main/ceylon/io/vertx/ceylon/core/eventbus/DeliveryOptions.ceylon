import ceylon.json {
  JsonObject=Object,
  JsonArray=Array,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter,
  ToJava
}
import io.vertx.core.eventbus {
  DeliveryOptions_=DeliveryOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.eventbus.DeliveryOptions */
shared class DeliveryOptions(
  shared String? codecName = null,
  shared Integer? sendTimeout = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists codecName) {
      json.put("codecName", codecName);
    }
    if (exists sendTimeout) {
      json.put("sendTimeout", sendTimeout);
    }
    return json;
  }
}

shared object deliveryOptions {

  shared object toJava extends Converter<DeliveryOptions, DeliveryOptions_>() {
    shared actual DeliveryOptions_ convert(DeliveryOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DeliveryOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DeliveryOptions obj) => obj.toJson();
}