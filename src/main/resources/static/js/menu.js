
// セレクトボックスを初期化
function init() {
  if ($('select option[selected=selected]').attr('selected')) {
    $('select').val($('select option[selected=selected]').val());
  }
  else {
    $('select option:first').prop('selected', 'selected');
  }
}

$(function() {

    init();
    $(window).on('pageshow', init);

	var selectedValue = "";

	// セレクトボックスのvalue値を取得
	$('.selectbox').change(function() {
		selectedValue = $('[name=selectName]').val();
		//selectedTextValue = $('[name=selectName] option:selected').text();
	});

	// メニューリストクリック時の処理
	$('.menu-name').on('click', function() {

		// 押下されたhref属性の属性値取得
		var hrefValue = $(this).attr('href');

		// 押下されたa要素のパラメータ取得
		var aText = $(this).text();
		console.log(aText);

		// 選択されたメニュー名からクエリパラメータの値を生成
		var menuQueryValue = decisionMenuParam(aText);

		if (selectedValue != "" ) {
			// セレクトボックスのvalue値と
			// メニュー名をクエリパラメータとして設定
			var a = $(this).attr('href',hrefValue + '?param='
			    + selectedValue + '&menu=' +  menuQueryValue);
		} else  {
			alert("品数を選択してください");
			// 画面遷移を解除
			return false;
		}
	})

    /**
	 * 選択されたメニューのパラメータを返す
 	 *
 	 */
	function decisionMenuParam(menuName) {
		var selectedMenu = "";

		switch(menuName) {
			case '焼鳥':
				selectedMenu ='yakitori';
				break;
			case '逸品料理':
				selectedMenu ='ippin';
				break;
			case 'スピードメニュー':
				selectedMenu ='spead';
				break;
			case 'ご飯もの':
				selectedMenu ='gohan';
				break;
			case 'デザート':
				selectedMenu ='dessert';
				break;
			case 'ドリンク':
				selectedMenu ='drink';
				break;
			}
		return selectedMenu;
	}
});