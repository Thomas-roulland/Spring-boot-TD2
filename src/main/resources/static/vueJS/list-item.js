//Script generated with VueComponent at Fri Oct 08 10:13:10 CEST 2021
Vue.component('list-item',{
	"props":{
		list:{
			"default":[]
			}
		}
	,"template":"<ul>    <li v-for=\"item in list\">         <slot v-bind:item=\"item\"></slot>    </li>    </ul>"
	}
);