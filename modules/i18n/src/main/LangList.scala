package lila.i18n

import play.api.i18n.Lang

object LangList:

  val all = Map(
    Lang("en", "GB")  -> "English",
    Lang("af", "ZA")  -> "Afrikaans",
    Lang("an", "ES")  -> "Aragonés",
    Lang("ar", "SA")  -> "العربية",
    Lang("as", "IN")  -> "অসমীয়া",
    Lang("av", "DA")  -> "авар мацӀ",
    Lang("az", "AZ")  -> "Azərbaycanca",
    Lang("be", "BY")  -> "Беларуская",
    Lang("bg", "BG")  -> "български език",
    Lang("bn", "BD")  -> "বাংলা",
    Lang("br", "FR")  -> "Brezhoneg",
    Lang("bs", "BA")  -> "Bosanski",
    Lang("ca", "ES")  -> "Català, valencià",
    Lang("co", "FR")  -> "Corsu",
    Lang("cs", "CZ")  -> "Čeština",
    Lang("cv", "CU")  -> "чӑваш чӗлхи",
    Lang("cy", "GB")  -> "Cymraeg",
    Lang("da", "DK")  -> "Dansk",
    Lang("de", "DE")  -> "Deutsch",
    Lang("el", "GR")  -> "Ελληνικά",
    Lang("en", "US")  -> "English (US)",
    Lang("eo", "UY")  -> "Esperanto",
    Lang("es", "ES")  -> "Español",
    Lang("et", "EE")  -> "Eesti keel",
    Lang("eu", "ES")  -> "Euskara",
    Lang("fa", "IR")  -> "فارسی",
    Lang("fi", "FI")  -> "Suomen kieli",
    Lang("fo", "FO")  -> "Føroyskt",
    Lang("fr", "FR")  -> "Français",
    Lang("frp", "IT") -> "Arpitan",
    Lang("fy", "NL")  -> "Frysk",
    Lang("ga", "IE")  -> "Gaeilge",
    Lang("gd", "GB")  -> "Gàidhlig",
    Lang("gl", "ES")  -> "Galego",
    Lang("gsw", "CH") -> "Schwizerdütsch",
    Lang("gu", "IN")  -> "ગુજરાતી",
    Lang("he", "IL")  -> "עִבְרִית",
    Lang("hi", "IN")  -> "हिन्दी, हिंदी",
    Lang("hr", "HR")  -> "Hrvatski",
    Lang("hu", "HU")  -> "Magyar",
    Lang("hy", "AM")  -> "Հայերեն",
    Lang("ia", "IA")  -> "Interlingua",
    Lang("id", "ID")  -> "Bahasa Indonesia",
    Lang("io", "EN")  -> "Ido",
    Lang("is", "IS")  -> "Íslenska",
    Lang("it", "IT")  -> "Italiano",
    Lang("ja", "JP")  -> "日本語",
    Lang("jbo", "EN") -> "Lojban",
    Lang("jv", "ID")  -> "Basa Jawa",
    Lang("ka", "GE")  -> "ქართული",
    Lang("kab", "DZ") -> "Taqvaylit",
    Lang("kk", "KZ")  -> "қазақша",
    Lang("kmr", "TR") -> "Kurdî (Kurmancî)",
    Lang("kn", "IN")  -> "ಕನ್ನಡ",
    Lang("ko", "KR")  -> "한국어",
    Lang("ky", "KG")  -> "кыргызча",
    Lang("la", "LA")  -> "Lingua Latina",
    Lang("lb", "LU")  -> "Lëtzebuergesch",
    Lang("lt", "LT")  -> "Lietuvių kalba",
    Lang("lv", "LV")  -> "Latviešu valoda",
    Lang("mg", "MG")  -> "Fiteny malagasy",
    Lang("mk", "MK")  -> "македонски јази",
    Lang("ml", "IN")  -> "മലയാളം",
    Lang("mn", "MN")  -> "монгол",
    Lang("mr", "IN")  -> "मराठी",
    Lang("nb", "NO")  -> "Norsk bokmål",
    Lang("ne", "NP")  -> "नेपाली",
    Lang("nl", "NL")  -> "Nederlands",
    Lang("nn", "NO")  -> "Norsk nynorsk",
    Lang("pi", "IN")  -> "पालि",
    Lang("pl", "PL")  -> "Polski",
    Lang("ps", "AF")  -> "پښتو",
    Lang("pt", "PT")  -> "Português",
    Lang("pt", "BR")  -> "Português (BR)",
    Lang("ro", "RO")  -> "Română",
    Lang("ru", "RU")  -> "русский язык",
    Lang("ry", "UA")  -> "Русинська бисїда",
    Lang("sa", "IN")  -> "संस्कृत",
    Lang("sk", "SK")  -> "Slovenčina",
    Lang("sl", "SI")  -> "Slovenščina",
    Lang("sq", "AL")  -> "Shqip",
    Lang("sr", "SP")  -> "Српски језик",
    Lang("sv", "SE")  -> "Svenska",
    Lang("sw", "KE")  -> "Kiswahili",
    Lang("ta", "IN")  -> "தமிழ்",
    Lang("tg", "TJ")  -> "тоҷикӣ",
    Lang("th", "TH")  -> "ไทย",
    Lang("tk", "TM")  -> "Türkmençe",
    Lang("tl", "PH")  -> "Tagalog",
    Lang("tp", "TP")  -> "Toki pona",
    Lang("tr", "TR")  -> "Türkçe",
    Lang("uk", "UA")  -> "українська",
    Lang("ur", "PK")  -> "اُردُو",
    Lang("uz", "UZ")  -> "oʻzbekcha",
    Lang("vi", "VN")  -> "Tiếng Việt",
    Lang("yo", "NG")  -> "Yorùbá",
    Lang("zh", "CN")  -> "中文",
    Lang("zh", "TW")  -> "繁體中文",
    Lang("zu", "ZA")  -> "isiZulu"
  )

  val defaultRegions = Map[String, Lang](
    "de" -> Lang("de", "DE"),
    "en" -> Lang("en", "US"),
    "pt" -> Lang("pt", "PT"),
    "zh" -> Lang("zh", "CN")
  )

  def removeRegion(lang: Lang): Lang =
    defaultRegions.get(lang.language) | lang

  private lazy val popular: List[Lang] =
    // 26/04/2020 based on db.user4.aggregate({$sortByCount:'$lang'}).toArray()
    val langs =
      "en-US en-GB ru-RU es-ES tr-TR fr-FR de-DE pt-BR it-IT pl-PL ar-SA fa-IR nl-NL id-ID nb-NO el-GR sv-SE uk-UA cs-CZ vi-VN sr-SP hr-HR hu-HU pt-PT he-IL fi-FI ca-ES da-DK ro-RO zh-CN bg-BG sk-SK ko-KR az-AZ ja-JP sl-SI lt-LT ka-GE mn-MN bs-BA hy-AM zh-TW lv-LV et-EE th-TH gl-ES sq-AL eu-ES hi-IN mk-MK uz-UZ be-BY ms-MY bn-BD is-IS af-ZA nn-NO ta-IN as-IN la-LA kk-KZ tl-PH mr-IN eo-UY gu-IN ky-KG kn-IN ml-IN cy-GB no-NO fo-FO zu-ZA jv-ID ga-IE ur-PK ur-IN te-IN sw-KE am-ET ia-IA sa-IN si-LK ps-AF mg-MG kmr-TR ne-NP tk-TM fy-NL pa-PK br-FR tt-RU cv-CU tg-TJ tp-TP yo-NG frp-IT pi-IN my-MM pa-IN kab-DZ io-EN gd-GB jbo-EN io-IO ckb-IR ceb-PH an-ES"
        .split(' ')
        .flatMap(Lang.get)
        .zipWithIndex
        .toMap
    all.keys.toList.sortBy(l => langs.getOrElse(l, Int.MaxValue))

  lazy val popularNoRegion: List[Lang] = popular.collect {
    case l if defaultRegions.get(l.language).forall(_ == l) => l
  }

  lazy val popularAlternateLanguageCodes: List[String] =
    popularNoRegion.drop(1).take(20).map(fixJavaLanguageCode)

  def name(lang: Lang): String   = all.getOrElse(lang, lang.code)
  def name(code: String): String = Lang.get(code).fold(code)(name)

  def nameByStr(str: String): String = I18nLangPicker.byStr(str).fold(str)(name)

  lazy val allChoices: List[(String, String)] = all.view
    .map { case (l, name) =>
      l.code -> name
    }
    .toList
    .sortBy(_._1)

  private val rtlCache = scala.collection.mutable.AnyRefMap.empty[Lang, Boolean]

  def isRTL(lang: Lang): Boolean =
    rtlCache.getOrElseUpdate(
      lang,
      lang.locale
        .getDisplayName(lang.locale)
        .headOption
        .map(_.getDirectionality)
        .exists { dir =>
          dir == Character.DIRECTIONALITY_RIGHT_TO_LEFT ||
          dir == Character.DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC
        }
    )
