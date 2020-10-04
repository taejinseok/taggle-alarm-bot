package kr.taggle.alarmbot.client.scheduler.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "slack.alarm.message.pretext")
public class PreTextProperties {
    private String role;
    private String timeSchedule;
    private String offWork;
}
