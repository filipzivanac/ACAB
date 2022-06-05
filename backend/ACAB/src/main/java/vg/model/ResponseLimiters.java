package vg.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseLimiters {
	private Double lethalForceMinimum;
	private Double lessLethalMaximum;
	private Double lessLethalForceMinimum;
	private Double emptyHandMaximum;
	private Double emptyHandMinimum;
	private Double VerbalizationMaximum;
	private Double VerbalizationMinimum;
	private Double PresenceMaximum;
}
