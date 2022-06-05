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
	private Double lessLethalMinimum;
	private Double emptyHandMaximum;
	private Double emptyHandMinimum;
	private Double verbalizationMaximum;
	private Double verbalizationMinimum;
	private Double presenceMaximum;
}
