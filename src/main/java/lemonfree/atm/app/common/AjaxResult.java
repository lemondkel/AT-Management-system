package lemonfree.atm.app.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@NoArgsConstructor
@Data
public class AjaxResult {
	private int status;
	private boolean result;
	private String desc;
	private Map<String, Object> data;

	public AjaxResult(boolean result, int status, String desc) {
		this.result = result;
		this.status = status;
		this.desc = desc;
	}

	public AjaxResult(boolean result, int status, String desc, Map<String, Object> data) {
		this.result = result;
		this.status = status;
		this.desc = desc;
		this.data = data;
	}
}
