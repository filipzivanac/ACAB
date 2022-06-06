import { Component } from '@angular/core';
import Incident from './model/Incident';
import { MatSnackBar } from '@angular/material/snack-bar';
import { IncidentService } from './service/incident.service';
import { WeaponTypeEnum, weaponTypeEnumLabels } from './model/enums/WeaponTypeEnum';
import { PoliceResponseEnum, policeResponseEnumLabels } from './model/enums/PoliceResponseEnum';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'acab';
  incident! : Incident;
  response : string = "";
  incidentWeaponLabels = weaponTypeEnumLabels;
  incidentResponseLabels = policeResponseEnumLabels;

  constructor(
    private _incidentService: IncidentService,
    private _snackBar: MatSnackBar
  ) { }

  ngOnInit(): void {
    this.incident = {
      cops: 1,
      criminals: 1,
      weapon: WeaponTypeEnum.UNARMED,
      allreadyUsedPoliceResponse: PoliceResponseEnum.PRESENCE,
      suspectThreatIntention: false,
      responseWorked : false
    };
  }

  resolveIncident(): void {
    this._incidentService.resolveIncident(this.incident)?.subscribe((response) => {
      if (response){
        this.response = response as string;
        this.alertResponse("Incident Successfully resolved!");
      } else {
        this.alertResponse("Neuspeh!");
      }
    });
  }

  alertResponse(message: string) {
    this._snackBar.open(message, 'Dismiss');
  }

}
