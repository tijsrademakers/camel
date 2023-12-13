/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elasticsearch.rest.client;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ElasticsearchRestClientEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ElasticsearchRestClientEndpoint target = (ElasticsearchRestClientEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "certificatepath":
        case "certificatePath": target.setCertificatePath(property(camelContext, java.lang.String.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "enablesniffer":
        case "enableSniffer": target.setEnableSniffer(property(camelContext, boolean.class, value)); return true;
        case "hostaddresseslist":
        case "hostAddressesList": target.setHostAddressesList(property(camelContext, java.lang.String.class, value)); return true;
        case "indexname":
        case "indexName": target.setIndexName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, org.apache.camel.component.elasticsearch.rest.client.ElasticsearchRestClientOperation.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "restclient":
        case "restClient": target.setRestClient(property(camelContext, org.elasticsearch.client.RestClient.class, value)); return true;
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": target.setSniffAfterFailureDelay(property(camelContext, int.class, value)); return true;
        case "snifferinterval":
        case "snifferInterval": target.setSnifferInterval(property(camelContext, int.class, value)); return true;
        case "sockettimeout":
        case "socketTimeout": target.setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "user": target.setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"restClient"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "certificatepath":
        case "certificatePath": return java.lang.String.class;
        case "connectiontimeout":
        case "connectionTimeout": return int.class;
        case "enablesniffer":
        case "enableSniffer": return boolean.class;
        case "hostaddresseslist":
        case "hostAddressesList": return java.lang.String.class;
        case "indexname":
        case "indexName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return org.apache.camel.component.elasticsearch.rest.client.ElasticsearchRestClientOperation.class;
        case "password": return java.lang.String.class;
        case "restclient":
        case "restClient": return org.elasticsearch.client.RestClient.class;
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": return int.class;
        case "snifferinterval":
        case "snifferInterval": return int.class;
        case "sockettimeout":
        case "socketTimeout": return int.class;
        case "user": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ElasticsearchRestClientEndpoint target = (ElasticsearchRestClientEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "certificatepath":
        case "certificatePath": return target.getCertificatePath();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConnectionTimeout();
        case "enablesniffer":
        case "enableSniffer": return target.isEnableSniffer();
        case "hostaddresseslist":
        case "hostAddressesList": return target.getHostAddressesList();
        case "indexname":
        case "indexName": return target.getIndexName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getOperation();
        case "password": return target.getPassword();
        case "restclient":
        case "restClient": return target.getRestClient();
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": return target.getSniffAfterFailureDelay();
        case "snifferinterval":
        case "snifferInterval": return target.getSnifferInterval();
        case "sockettimeout":
        case "socketTimeout": return target.getSocketTimeout();
        case "user": return target.getUser();
        default: return null;
        }
    }
}
