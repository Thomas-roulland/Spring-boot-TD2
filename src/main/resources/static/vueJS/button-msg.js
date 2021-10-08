//Script generated with VueComponent at Fri Oct 08 10:13:08 CEST 2021
Vue.component('button-msg',{
	"props":{
		type:{
			"default":"success"
			}
		}
	,"data":function() {
		 return {
			"message":"Cliquer sur le bouton ..."
			}
		;
		}
	,"template":"<div>    <v-btn @click=\"message='Hello'\">Afficher Message</v-btn>    <div>        <v-alert :type=\"type\">            {{message}}        </v-alert>    </div></div>"
	}
);