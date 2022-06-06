import { PoliceResponseEnum } from "./enums/PoliceResponseEnum";
import { WeaponTypeEnum } from "./enums/WeaponTypeEnum";

export default interface Incident {
  cops : Number,
  criminals : Number,
  weapon: WeaponTypeEnum,
  allreadyUsedPoliceResponse : PoliceResponseEnum,
  suspectThreatIntention : Boolean,
  responseWorked : Boolean,
}
