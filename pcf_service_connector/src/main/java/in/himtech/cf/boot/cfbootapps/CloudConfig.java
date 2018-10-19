package in.himtech.cf.boot.cfbootapps;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Configurable
@Profile("cloud")
public class CloudConfig {

	@Bean
	public Cloud getCloud() {
		return new CloudFactory().getCloud();
	}
	
	@Bean
    public DataSource dataSource() {
		return getCloud().getServiceConnector("elephantdb", DataSource.class, null);
    }
}
