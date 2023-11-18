import { Component } from '@angular/core';
import { GLOBAL } from '../app-config';
import { member } from 'src/Model/Members';
@Component({
  selector: 'app-member',
  templateUrl: './member.component.html',
  styleUrls: ['./member.component.css']
})
export class MemberComponent {
  dataSource:member[]=GLOBAL._DB.members;
  displayedColumns: string[] = ['ID', 'CIN', 'Name', 'CreatedDate', 'CV','Type','Actions'];
}
