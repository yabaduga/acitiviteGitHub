function lancerDes(n, callback) {
// génère 8 lancers de dés
	// script honteusement pompé sur le net /!\
if(n!=8)
{
// génère un random entre 1 et 6
var de1=Math.floor(Math.random()*6)+1;
//Affichage du score du dé dans la cellule menu
document.getElementById('menu').innerHTML =de1;
//On relance la fonction au bout de 200 ms
setTimeout(function(){lancerDes(n+1, callback)}, 200);
} else {
callback();
	/*je ne comprend pas commen s'incrémente le n pour aller jusque 8
	la fonction avec le callback joue t-elle se role automatiquement*/
}
}
 
lancerDes(1, function(){alert("8 lancés de dé ont été faits")});
