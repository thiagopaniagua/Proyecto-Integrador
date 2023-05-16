import { Component } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-acercademi',
  templateUrl: './acercademi.component.html',
  styleUrls: ['./acercademi.component.css']
})
export class AcercademiComponent {
  persona: persona = new persona("","","");
  constructor(public personaService: PersonaService) { }

  ngOnInit(): void{
    this.personaService.getPersona().subscribe(data => {this.persona = data})
  }
}
