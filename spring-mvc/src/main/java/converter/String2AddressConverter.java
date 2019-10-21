package converter;

import entity.Address;
import org.springframework.core.convert.converter.Converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 将String转为Address对象的转换器
 */
public class String2AddressConverter implements Converter<String, Address> {

    /*
    具体的转换逻辑需要自己写
     */
    @Override
    public Address convert(String source) {
        Pattern pattern = Pattern.compile("\\[(.*)-(.*)\\]");
        Matcher matcher = pattern.matcher(source);
        if(matcher.matches()){
            String city = matcher.group(1);
            String street = matcher.group(2);
            Address address=new Address();
            address.setCity(city);
            address.setStreet(street);
            return address;
        }else{
            throw new RuntimeException("地址转换失败");
        }

    }
}
