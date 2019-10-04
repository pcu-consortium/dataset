package org.pcu.dataset.ingestion.json.model.product;

import java.util.List;

public class Product_ {

	//@JsonProperty("id")
	private Long id = null;
	//@JsonProperty("name")
	private String name = null;
	private Long[] categories = null;
	//@JsonProperty("category_name")
	private String[] category_name = null;
	private Category_position[] category_position = null;
	private Long[] show_in_categories = null;
	//@JsonProperty("description")
	private String description = null;
	private Double price = null;
	private Double price_0_1 = null;
	private Boolean has_discount_0_1 = null;
	private Double price_1_1 = null;
	private Boolean has_discount_1_1 = null;
	//@JsonProperty("tax_class")
	private List<Val> tax_class = null;
	private String sku = null;
	private List<Val> access_liseuse_type = null;
	private List<Val> access_tablette_type = null;
	private List<Val> access_tel_type = null;
	private List<Val> accord_harmonica = null;
	private List<Val> adapte_vegetariens = null;
	private List<Val> additional_flags = null;
	//@JsonProperty("age_min")
	private String age_min = null;
	private List<Val> art_collection = null;
	//private List<Val> art_collection_art_collection = null;
	private List<Val> art_gamme = null;
	//@JsonProperty("aspect_pochettes")
	private String aspect_pochettes = null;
	//private Long attribute_set_id = null;
	private List<Val> audience = null;
	private String[] availability = null;
	private String availability_updated_at = null;
	//@JsonProperty("back_cover")
	private String back_cover = null;
	private List<Val> book_collection = null;
	//private List<Val> book_collection_book_collection = null;
	private List<Val> book_editor = null;
	//private List<Val> book_editor_book_editor = null;
	//@JsonProperty("book_isbn")
	private String book_isbn = null;
	private List<Val> book_people = null;
	private List<Val> book_people_Coloriste = null;
	private List<Val> book_people_Dessinateur = null;
	private List<Val> book_people_Illustrateur = null;
	private List<Val> book_people_PrefaceWriter = null;
	private List<Val> book_people_ScriptWriter = null;
	private List<Val> book_people_Traducteur = null;
	private List<Val> book_people_author = null;
	private List<Val> book_series = null;
	//private List<Val> book_series_book_serie = null;
	//@JsonProperty("bout_gomme")
	private String bout_gomme = null;
	private List<Val> brand = null;
	//private List<Val> brand_brand = null;
	private List<Val> capacite_impression_filtre = null;
	//@JsonProperty("capacite_pages")
	private String capacite_pages = null;
	//@JsonProperty("capacity")
	private String capacity = null;
	private List<Val> casques_type = null;
	//@JsonProperty("certification_papet")
	private String certification_papet = null;
	private List<Val> classe_scolaire = null;
	private List<Val> coffret_kdo_thematique = null;
	private List<Val> color = null;
	private List<Val> color_affiliation = null;
	private List<Val> color_filter = null;
	//@JsonProperty("compartments_number")
	private String compartments_number = null;
	private List<Val> competence = null;
	private List<Val> conditionnement_peinture = null;
	//@JsonProperty("couleur_papet")
	private String couleur_papet = null;
	private List<Val> couleurencre_papet_filtre = null;
	//@JsonProperty("couleur_encre")
	private String couleur_encre = null;
	//@JsonProperty("couleurs_cartouches")
	private String couleurs_cartouches = null;
	private String created_at = null;
	private List<Val> creative_hobby_collection = null;
	//private List<Val> creative_hobby_collection_collection = null;
	//private Long cultura_sales = null;
	private Double diameter = null;
	private List<Val> diametre_bouton_lca = null;
	private List<Val> difficulte_maquette_filtre = null;
	private List<Val> dimensions_lca_papet = null;
	private Long[] disc_genre = null;
	private List<Val> disc_version = null;
	private List<Val> duree_partie_filtre = null;
	//@JsonProperty("durete_mine")
	private String durete_mine = null;
	private List<Val> echelle_maquette_filtre = null;
	//@JsonProperty("editor_description")
	private String editor_description = null;
	//@JsonProperty("effacable")
	private String effacable = null;
	private Long entity_type_id = null;
	private List<Val> ep_type_medecine_douce = null;
	private List<Val> ep_usage_huiles = null;
	//@JsonProperty("epaisseur_mine")
	private String epaisseur_mine = null;
	private List<Val> eveil_im_collection = null;
	//@JsonProperty("feuilles_micro_perforees")
	private String feuilles_micro_perforees = null;
	private List<Val> finition_peinture = null;
	private String flagged_as_favorite_date = null;
	private String[] flags = null;
	private Long[] format = null;
	private List<Val> format_papet_cm_filtre = null;
	private List<Val> forme_bouton_lca = null;
	private List<Val> fourchette_prix = null;
	private List<Val> game_collection = null;
	//private List<Val> game_collection_game_collection = null;
	private List<Val> game_type = null;
	//@JsonProperty("global_ean")
	private String global_ean = null;
	//@JsonProperty("grain_papier")
	private String grain_papier = null;
	private List<Val> grammage_papier = null;
	private List<Val> hardware_bluetooth = null;
	private List<Val> hardware_memory = null;
	private List<Val> hardware_storage = null;
	private Boolean has_options = null;
	private Double height = null;
	private List<Val> im_finition_peaux = null;
	private List<Val> im_recommande_pour = null;
	private List<Val> im_type_cable = null;
	//private String image = null;
	private List<Val> imported_flags = null;
	private List<Val> imprime_ruban = null;
	private Boolean in_stock = null;
	//@JsonProperty("ingredients")
	private String ingredients = null;
	//@JsonProperty("instrument_size")
	private String instrument_size = null;
	private List<Val> instrument_type = null;
	private List<Val> instruments_baguettes = null;
	private List<Val> is_left_handed = null;
	private List<Val> label = null;
	private List<Val> languages = null;
	private List<Val> langue_scolaire = null;
	private List<Val> largeurdos_papet_filtre = null;
	//@JsonProperty("largeur_dos")
	private String largeur_dos = null;
	private List<Val> largeurpointe_papet_filtre = null;
	//@JsonProperty("largeur_pointe")
	private String largeur_pointe = null;
	//@JsonProperty("largeur_trait")
	private String largeur_trait = null;
	//@JsonProperty("length")
	private String length = null;
	//@JsonProperty("licence")
	private String licence = null;
	private List<Val> ln_compatibilite = null;
	private List<Val> longueur_fermeture = null;
	private Boolean main_category_displayed_in_borne = null;
	private List<Val> manual_language = null;
	private List<Val> material = null;
	private List<Val> matiere_papet_filtre = null;
	//@JsonProperty("matiere")
	private String matiere = null;
	private List<Val> matiere_ruban = null;
	private List<Val> matiere_scolaire = null;
	private List<Val> medium_book = null;
	private List<Val> medium_disc = null;
	private List<Val> medium_multimedia = null;
	private List<Val> medium_video = null;
	//@JsonProperty("mention_sante")
	private String mention_sante = null;
	private List<Val> modele_agenda_filtre = null;
	private List<Val> modele_cartoucheencre_filtre = null;
	//@JsonProperty("modele")
	private String modele = null;
	private List<Val> multimedia_editor = null;
	//private List<Val> multimedia_editor_multimedia_editor = null;
	private List<Val> multimedia_genre = null;
	private List<Val> multimedia_pegi = null;
	private List<Val> multimedia_people = null;
	private List<Val> multimedia_people_developer = null;
	private List<Val> music_collection = null;
	//private List<Val> music_collection_music_collection = null;
	private List<Val> music_people = null;
	private List<Val> music_people_artist = null;
	private List<Val> music_people_composer = null;
	private List<Val> music_people_singer = null;
	private List<Val> music_people_writer = null;
	private Long nights_number = null;
	private List<Val> niveau_scolaire = null;
	private List<Val> nombre_joueurs_filtre = null;
	private List<Val> nombre_pieces_puzzles = null;
	//@JsonProperty("nombre_onglets")
	private String nombre_onglets = null;
	//@JsonProperty("nombre_pochettes")
	private String nombre_pochettes = null;
	//@JsonProperty("nombre_revues")
	private String nombre_revues = null;
	private List<Val> not_discountable = null;
	private List<Val> num_pinceau = null;
	private List<Val> numero_aiguille_crochet = null;
	//@JsonProperty("original_title")
	private String original_title = null;
	private List<Val> page_count_filtre = null;
	//@JsonProperty("page_count")
	private String page_count = null;
	private Long paper_number_of_sheet = null;
	private Long paper_ring_binders_numbers = null;
	private List<Val> paper_tip_type = null;
	private List<Val> participant_numbers = null;
	//@JsonProperty("pcb_quantity")
	private String pcb_quantity = null;
	//@JsonProperty("pcb_text")
	private String pcb_text = null;
	//@JsonProperty("perforation")
	private String perforation = null;
	private List<Val> perfumes = null;
	//@JsonProperty("personnalisable")
	private String personnalisable = null;
	//@JsonProperty("phrases_precaution")
	private String phrases_precaution = null;
	//@JsonProperty("phrases_mentions_danger")
	private String phrases_mentions_danger = null;
	private List<Val> platform_multimedia = null;
	private List<Val> pour_qui_coffret_kdo = null;
	//@JsonProperty("press_review")
	private String press_review = null;
	private List<Val> project_age = null;
	private List<Val> project_budget = null;
	private List<Val> project_difficulty = null;
	private List<Val> project_time = null;
	//@JsonProperty("provider_description")
	private String provider_description = null;
	private List<Val> quality = null;
	private List<Val> range_assortment = null;
	private Double rank1 = null;
	private Double rank2 = null;
	private Double rank3 = null;
	private Double rank4 = null;
	private Double rank5 = null;
	private Double rank6 = null;
	private Long rating_filter = null;
	private Long ratings_count = null;
	//@JsonProperty("rechargeable")
	private String rechargeable = null;
	private List<Val> regions = null;
	private String release_date = null;
	private Boolean required_options = null;
	private List<Val> saison_tricot = null;
	private List<Val> sans_bisphenol_a = null;
	private List<Val> sans_conservateur = null;
	private List<Val> sans_gluten = null;
	private List<Val> sans_lactose = null;
	private Search_terms_position[] search_terms_position = null;
	private List<Val> services = null;
	//@JsonProperty("short_description")
	private String short_description = null;
	//@JsonProperty("short_name")
	private String short_name = null;
	//@JsonProperty("special")
	private String special_from_date = null;
	private Double special_price = null;
	private String special_to_date = null;
	//@JsonProperty("specifique_gaucher")
	private String specifique_gaucher = null;
	private List<Val> status = null;
	private Long stock = null;
	private Long store_id = null;
	//@JsonProperty("taille_pointe")
	private String taille_pointe = null;
	private List<Val> target_age = null;
	private List<Val> technics = null;
	private List<Val> thematic = null;
	private List<Val> theme_jj = null;
	private List<Val> theme_maquette_filtre = null;
	//@JsonProperty("thickness")
	private String thickness = null;
	private List<Val> tricot_ideal_pour = null;
	private List<Val> type_agenda_papet_filtre = null;
	private List<Val> type_bouton_lca = null;
	//@JsonProperty("type_cellule_platine_musique")
	private String type_cellule_platine_musique = null;
	private List<Val> type_de_cartable_papet_filtre = null;
	private List<Val> type_de_methode_de_langue = null;
	private List<Val> type_dictionnaire_scolaire = null;
	private List<Val> type_enceinte = null;
	private List<Val> type_fermeture = null;
	private List<Val> type_fut = null;
	private List<Val> type_grille_agenda_filtre = null;
	private List<Val> type_harmonica = null;
	//private String type_id = null;
	private List<Val> type_ruban = null;
	//@JsonProperty("type_cahier")
	private String type_cahier = null;
	//@JsonProperty("type_chemise")
	private String type_chemise = null;
	//@JsonProperty("type_classeur")
	private String type_classeur = null;
	private List<Val> typecouverture_papet_filtre = null;
	//@JsonProperty("type_couverture")
	private String type_couverture = null;
	private List<Val> typedepapier_lca = null;
	//@JsonProperty("type_marqueur")
	private String type_marqueur = null;
	//@JsonProperty("type_pinceau")
	private String type_pinceau = null;
	//@JsonProperty("type_pochettes")
	private String type_pochettes = null;
	//@JsonProperty("type_pointe_marqeur")
	private String type_pointe_marqeur = null;
	private List<Val> typereglure_papet_filtre = null;
	//@JsonProperty("type_reglure")
	private String type_reglure = null;
	private List<Val> typereliure_papet_filtre = null;
	//@JsonProperty("type_reliure")
	private String type_reliure = null;
	//@JsonProperty("type_stylo")
	private String type_stylo = null;
	//private String unique = null;
	private String updated_at = null;
	//@JsonProperty("use_tips")
	private String use_tips = null;
	private List<Val> use_type = null;
	private List<Val> utilisation_peintures = null;
	private List<Val> video_collection = null;
	//private List<Val> video_collection_video_collection = null;
	private List<Val> video_editor = null;
	//private List<Val> video_editor_video_editor = null;
	private List<Val> video_genre = null;
	private List<Val> video_origine = null;
	private List<Val> video_people = null;
	private List<Val> video_people_actor = null;
	private List<Val> video_people_producer = null;
	private List<Val> video_people_realisator = null;
	private List<Val> video_people_scriptwriter = null;
	private String video_release_date = null;
	private List<Val> video_series = null;
	//private List<Val> video_series_video_serie = null;
	private List<Val> video_version = null;
	private List<Val> visibility = null;
	//@JsonProperty("website_description")
	private String website_description = null;
	//@JsonProperty("width")
	private String width = null;
	private List<Val> workshop_audience = null;
	private String workshop_date = null;
	private String workshop_date_weekday = null;
	private Long workshop_parent_id = null;
	private List<Val> workshop_shop = null;
	private List<Val> workshop_target_age = null;
	private List<Val> workshop_type = null;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long[] getCategories() {
		return categories;
	}
	public void setCategories(Long[] categories) {
		this.categories = categories;
	}
	public String[] getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String[] category_name) {
		this.category_name = category_name;
	}
	public Category_position[] getCategory_position() {
		return category_position;
	}
	public void setCategory_position(Category_position[] category_position) {
		this.category_position = category_position;
	}
	public Long[] getShow_in_categories() {
		return show_in_categories;
	}
	public void setShow_in_categories(Long[] show_in_categories) {
		this.show_in_categories = show_in_categories;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice_0_1() {
		return price_0_1;
	}
	public void setPrice_0_1(Double price_0_1) {
		this.price_0_1 = price_0_1;
	}
	public Boolean getHas_discount_0_1() {
		return has_discount_0_1;
	}
	public void setHas_discount_0_1(Boolean has_discount_0_1) {
		this.has_discount_0_1 = has_discount_0_1;
	}
	public Double getPrice_1_1() {
		return price_1_1;
	}
	public void setPrice_1_1(Double price_1_1) {
		this.price_1_1 = price_1_1;
	}
	public Boolean getHas_discount_1_1() {
		return has_discount_1_1;
	}
	public void setHas_discount_1_1(Boolean has_discount_1_1) {
		this.has_discount_1_1 = has_discount_1_1;
	}
	public List<Val> getTax_class() {
		return tax_class;
	}
	public void setTax_class(List<Val> tax_class) {
		this.tax_class = tax_class;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public List<Val> getAccess_liseuse_type() {
		return access_liseuse_type;
	}
	public void setAccess_liseuse_type(List<Val> access_liseuse_type) {
		this.access_liseuse_type = access_liseuse_type;
	}
	public List<Val> getAccess_tablette_type() {
		return access_tablette_type;
	}
	public void setAccess_tablette_type(List<Val> access_tablette_type) {
		this.access_tablette_type = access_tablette_type;
	}
	public List<Val> getAccess_tel_type() {
		return access_tel_type;
	}
	public void setAccess_tel_type(List<Val> access_tel_type) {
		this.access_tel_type = access_tel_type;
	}
	public List<Val> getAccord_harmonica() {
		return accord_harmonica;
	}
	public void setAccord_harmonica(List<Val> accord_harmonica) {
		this.accord_harmonica = accord_harmonica;
	}
	public List<Val> getAdapte_vegetariens() {
		return adapte_vegetariens;
	}
	public void setAdapte_vegetariens(List<Val> adapte_vegetariens) {
		this.adapte_vegetariens = adapte_vegetariens;
	}
	public List<Val> getAdditional_flags() {
		return additional_flags;
	}
	public void setAdditional_flags(List<Val> additional_flags) {
		this.additional_flags = additional_flags;
	}
	public String getAge_min() {
		return age_min;
	}
	public void setAge_min(String age_min) {
		this.age_min = age_min;
	}
	public List<Val> getArt_collection() {
		return art_collection;
	}
	public void setArt_collection(List<Val> art_collection) {
		this.art_collection = art_collection;
	}
	public List<Val> getArt_gamme() {
		return art_gamme;
	}
	public void setArt_gamme(List<Val> art_gamme) {
		this.art_gamme = art_gamme;
	}
	public String getAspect_pochettes() {
		return aspect_pochettes;
	}
	public void setAspect_pochettes(String aspect_pochettes) {
		this.aspect_pochettes = aspect_pochettes;
	}
	public List<Val> getAudience() {
		return audience;
	}
	public void setAudience(List<Val> audience) {
		this.audience = audience;
	}
	public String[] getAvailability() {
		return availability;
	}
	public void setAvailability(String[] availability) {
		this.availability = availability;
	}
	public String getAvailability_updated_at() {
		return availability_updated_at;
	}
	public void setAvailability_updated_at(String availability_updated_at) {
		this.availability_updated_at = availability_updated_at;
	}
	public String getBack_cover() {
		return back_cover;
	}
	public void setBack_cover(String back_cover) {
		this.back_cover = back_cover;
	}
	public List<Val> getBook_collection() {
		return book_collection;
	}
	public void setBook_collection(List<Val> book_collection) {
		this.book_collection = book_collection;
	}
	public List<Val> getBook_editor() {
		return book_editor;
	}
	public void setBook_editor(List<Val> book_editor) {
		this.book_editor = book_editor;
	}
	public String getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}
	public List<Val> getBook_people() {
		return book_people;
	}
	public void setBook_people(List<Val> book_people) {
		this.book_people = book_people;
	}
	public List<Val> getBook_people_Coloriste() {
		return book_people_Coloriste;
	}
	public void setBook_people_Coloriste(List<Val> book_people_Coloriste) {
		this.book_people_Coloriste = book_people_Coloriste;
	}
	public List<Val> getBook_people_Dessinateur() {
		return book_people_Dessinateur;
	}
	public void setBook_people_Dessinateur(List<Val> book_people_Dessinateur) {
		this.book_people_Dessinateur = book_people_Dessinateur;
	}
	public List<Val> getBook_people_Illustrateur() {
		return book_people_Illustrateur;
	}
	public void setBook_people_Illustrateur(List<Val> book_people_Illustrateur) {
		this.book_people_Illustrateur = book_people_Illustrateur;
	}
	public List<Val> getBook_people_PrefaceWriter() {
		return book_people_PrefaceWriter;
	}
	public void setBook_people_PrefaceWriter(List<Val> book_people_PrefaceWriter) {
		this.book_people_PrefaceWriter = book_people_PrefaceWriter;
	}
	public List<Val> getBook_people_ScriptWriter() {
		return book_people_ScriptWriter;
	}
	public void setBook_people_ScriptWriter(List<Val> book_people_ScriptWriter) {
		this.book_people_ScriptWriter = book_people_ScriptWriter;
	}
	public List<Val> getBook_people_Traducteur() {
		return book_people_Traducteur;
	}
	public void setBook_people_Traducteur(List<Val> book_people_Traducteur) {
		this.book_people_Traducteur = book_people_Traducteur;
	}
	public List<Val> getBook_people_author() {
		return book_people_author;
	}
	public void setBook_people_author(List<Val> book_people_author) {
		this.book_people_author = book_people_author;
	}
	public List<Val> getBook_series() {
		return book_series;
	}
	public void setBook_series(List<Val> book_series) {
		this.book_series = book_series;
	}
	public String getBout_gomme() {
		return bout_gomme;
	}
	public void setBout_gomme(String bout_gomme) {
		this.bout_gomme = bout_gomme;
	}
	public List<Val> getBrand() {
		return brand;
	}
	public void setBrand(List<Val> brand) {
		this.brand = brand;
	}
	public List<Val> getCapacite_impression_filtre() {
		return capacite_impression_filtre;
	}
	public void setCapacite_impression_filtre(List<Val> capacite_impression_filtre) {
		this.capacite_impression_filtre = capacite_impression_filtre;
	}
	public String getCapacite_pages() {
		return capacite_pages;
	}
	public void setCapacite_pages(String capacite_pages) {
		this.capacite_pages = capacite_pages;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public List<Val> getCasques_type() {
		return casques_type;
	}
	public void setCasques_type(List<Val> casques_type) {
		this.casques_type = casques_type;
	}
	public String getCertification_papet() {
		return certification_papet;
	}
	public void setCertification_papet(String certification_papet) {
		this.certification_papet = certification_papet;
	}
	public List<Val> getClasse_scolaire() {
		return classe_scolaire;
	}
	public void setClasse_scolaire(List<Val> classe_scolaire) {
		this.classe_scolaire = classe_scolaire;
	}
	public List<Val> getCoffret_kdo_thematique() {
		return coffret_kdo_thematique;
	}
	public void setCoffret_kdo_thematique(List<Val> coffret_kdo_thematique) {
		this.coffret_kdo_thematique = coffret_kdo_thematique;
	}
	public List<Val> getColor() {
		return color;
	}
	public void setColor(List<Val> color) {
		this.color = color;
	}
	public List<Val> getColor_affiliation() {
		return color_affiliation;
	}
	public void setColor_affiliation(List<Val> color_affiliation) {
		this.color_affiliation = color_affiliation;
	}
	public List<Val> getColor_filter() {
		return color_filter;
	}
	public void setColor_filter(List<Val> color_filter) {
		this.color_filter = color_filter;
	}
	public String getCompartments_number() {
		return compartments_number;
	}
	public void setCompartments_number(String compartments_number) {
		this.compartments_number = compartments_number;
	}
	public List<Val> getCompetence() {
		return competence;
	}
	public void setCompetence(List<Val> competence) {
		this.competence = competence;
	}
	public List<Val> getConditionnement_peinture() {
		return conditionnement_peinture;
	}
	public void setConditionnement_peinture(List<Val> conditionnement_peinture) {
		this.conditionnement_peinture = conditionnement_peinture;
	}
	public String getCouleur_papet() {
		return couleur_papet;
	}
	public void setCouleur_papet(String couleur_papet) {
		this.couleur_papet = couleur_papet;
	}
	public List<Val> getCouleurencre_papet_filtre() {
		return couleurencre_papet_filtre;
	}
	public void setCouleurencre_papet_filtre(List<Val> couleurencre_papet_filtre) {
		this.couleurencre_papet_filtre = couleurencre_papet_filtre;
	}
	public String getCouleur_encre() {
		return couleur_encre;
	}
	public void setCouleur_encre(String couleur_encre) {
		this.couleur_encre = couleur_encre;
	}
	public String getCouleurs_cartouches() {
		return couleurs_cartouches;
	}
	public void setCouleurs_cartouches(String couleurs_cartouches) {
		this.couleurs_cartouches = couleurs_cartouches;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public List<Val> getCreative_hobby_collection() {
		return creative_hobby_collection;
	}
	public void setCreative_hobby_collection(List<Val> creative_hobby_collection) {
		this.creative_hobby_collection = creative_hobby_collection;
	}
	public Double getDiameter() {
		return diameter;
	}
	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}
	public List<Val> getDiametre_bouton_lca() {
		return diametre_bouton_lca;
	}
	public void setDiametre_bouton_lca(List<Val> diametre_bouton_lca) {
		this.diametre_bouton_lca = diametre_bouton_lca;
	}
	public List<Val> getDifficulte_maquette_filtre() {
		return difficulte_maquette_filtre;
	}
	public void setDifficulte_maquette_filtre(List<Val> difficulte_maquette_filtre) {
		this.difficulte_maquette_filtre = difficulte_maquette_filtre;
	}
	public List<Val> getDimensions_lca_papet() {
		return dimensions_lca_papet;
	}
	public void setDimensions_lca_papet(List<Val> dimensions_lca_papet) {
		this.dimensions_lca_papet = dimensions_lca_papet;
	}
	public Long[] getDisc_genre() {
		return disc_genre;
	}
	public void setDisc_genre(Long[] disc_genre) {
		this.disc_genre = disc_genre;
	}
	public List<Val> getDisc_version() {
		return disc_version;
	}
	public void setDisc_version(List<Val> disc_version) {
		this.disc_version = disc_version;
	}
	public List<Val> getDuree_partie_filtre() {
		return duree_partie_filtre;
	}
	public void setDuree_partie_filtre(List<Val> duree_partie_filtre) {
		this.duree_partie_filtre = duree_partie_filtre;
	}
	public String getDurete_mine() {
		return durete_mine;
	}
	public void setDurete_mine(String durete_mine) {
		this.durete_mine = durete_mine;
	}
	public List<Val> getEchelle_maquette_filtre() {
		return echelle_maquette_filtre;
	}
	public void setEchelle_maquette_filtre(List<Val> echelle_maquette_filtre) {
		this.echelle_maquette_filtre = echelle_maquette_filtre;
	}
	public String getEditor_description() {
		return editor_description;
	}
	public void setEditor_description(String editor_description) {
		this.editor_description = editor_description;
	}
	public String getEffacable() {
		return effacable;
	}
	public void setEffacable(String effacable) {
		this.effacable = effacable;
	}
	public Long getEntity_type_id() {
		return entity_type_id;
	}
	public void setEntity_type_id(Long entity_type_id) {
		this.entity_type_id = entity_type_id;
	}
	public List<Val> getEp_type_medecine_douce() {
		return ep_type_medecine_douce;
	}
	public void setEp_type_medecine_douce(List<Val> ep_type_medecine_douce) {
		this.ep_type_medecine_douce = ep_type_medecine_douce;
	}
	public List<Val> getEp_usage_huiles() {
		return ep_usage_huiles;
	}
	public void setEp_usage_huiles(List<Val> ep_usage_huiles) {
		this.ep_usage_huiles = ep_usage_huiles;
	}
	public String getEpaisseur_mine() {
		return epaisseur_mine;
	}
	public void setEpaisseur_mine(String epaisseur_mine) {
		this.epaisseur_mine = epaisseur_mine;
	}
	public List<Val> getEveil_im_collection() {
		return eveil_im_collection;
	}
	public void setEveil_im_collection(List<Val> eveil_im_collection) {
		this.eveil_im_collection = eveil_im_collection;
	}
	public String getFeuilles_micro_perforees() {
		return feuilles_micro_perforees;
	}
	public void setFeuilles_micro_perforees(String feuilles_micro_perforees) {
		this.feuilles_micro_perforees = feuilles_micro_perforees;
	}
	public List<Val> getFinition_peinture() {
		return finition_peinture;
	}
	public void setFinition_peinture(List<Val> finition_peinture) {
		this.finition_peinture = finition_peinture;
	}
	public String getFlagged_as_favorite_date() {
		return flagged_as_favorite_date;
	}
	public void setFlagged_as_favorite_date(String flagged_as_favorite_date) {
		this.flagged_as_favorite_date = flagged_as_favorite_date;
	}
	public String[] getFlags() {
		return flags;
	}
	public void setFlags(String[] flags) {
		this.flags = flags;
	}
	public Long[] getFormat() {
		return format;
	}
	public void setFormat(Long[] format) {
		this.format = format;
	}
	public List<Val> getFormat_papet_cm_filtre() {
		return format_papet_cm_filtre;
	}
	public void setFormat_papet_cm_filtre(List<Val> format_papet_cm_filtre) {
		this.format_papet_cm_filtre = format_papet_cm_filtre;
	}
	public List<Val> getForme_bouton_lca() {
		return forme_bouton_lca;
	}
	public void setForme_bouton_lca(List<Val> forme_bouton_lca) {
		this.forme_bouton_lca = forme_bouton_lca;
	}
	public List<Val> getFourchette_prix() {
		return fourchette_prix;
	}
	public void setFourchette_prix(List<Val> fourchette_prix) {
		this.fourchette_prix = fourchette_prix;
	}
	public List<Val> getGame_collection() {
		return game_collection;
	}
	public void setGame_collection(List<Val> game_collection) {
		this.game_collection = game_collection;
	}
	public List<Val> getGame_type() {
		return game_type;
	}
	public void setGame_type(List<Val> game_type) {
		this.game_type = game_type;
	}
	public String getGlobal_ean() {
		return global_ean;
	}
	public void setGlobal_ean(String global_ean) {
		this.global_ean = global_ean;
	}
	public String getGrain_papier() {
		return grain_papier;
	}
	public void setGrain_papier(String grain_papier) {
		this.grain_papier = grain_papier;
	}
	public List<Val> getGrammage_papier() {
		return grammage_papier;
	}
	public void setGrammage_papier(List<Val> grammage_papier) {
		this.grammage_papier = grammage_papier;
	}
	public List<Val> getHardware_bluetooth() {
		return hardware_bluetooth;
	}
	public void setHardware_bluetooth(List<Val> hardware_bluetooth) {
		this.hardware_bluetooth = hardware_bluetooth;
	}
	public List<Val> getHardware_memory() {
		return hardware_memory;
	}
	public void setHardware_memory(List<Val> hardware_memory) {
		this.hardware_memory = hardware_memory;
	}
	public List<Val> getHardware_storage() {
		return hardware_storage;
	}
	public void setHardware_storage(List<Val> hardware_storage) {
		this.hardware_storage = hardware_storage;
	}
	public Boolean getHas_options() {
		return has_options;
	}
	public void setHas_options(Boolean has_options) {
		this.has_options = has_options;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public List<Val> getIm_finition_peaux() {
		return im_finition_peaux;
	}
	public void setIm_finition_peaux(List<Val> im_finition_peaux) {
		this.im_finition_peaux = im_finition_peaux;
	}
	public List<Val> getIm_recommande_pour() {
		return im_recommande_pour;
	}
	public void setIm_recommande_pour(List<Val> im_recommande_pour) {
		this.im_recommande_pour = im_recommande_pour;
	}
	public List<Val> getIm_type_cable() {
		return im_type_cable;
	}
	public void setIm_type_cable(List<Val> im_type_cable) {
		this.im_type_cable = im_type_cable;
	}
	public List<Val> getImported_flags() {
		return imported_flags;
	}
	public void setImported_flags(List<Val> imported_flags) {
		this.imported_flags = imported_flags;
	}
	public List<Val> getImprime_ruban() {
		return imprime_ruban;
	}
	public void setImprime_ruban(List<Val> imprime_ruban) {
		this.imprime_ruban = imprime_ruban;
	}
	public Boolean getIn_stock() {
		return in_stock;
	}
	public void setIn_stock(Boolean in_stock) {
		this.in_stock = in_stock;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getInstrument_size() {
		return instrument_size;
	}
	public void setInstrument_size(String instrument_size) {
		this.instrument_size = instrument_size;
	}
	public List<Val> getInstrument_type() {
		return instrument_type;
	}
	public void setInstrument_type(List<Val> instrument_type) {
		this.instrument_type = instrument_type;
	}
	public List<Val> getInstruments_baguettes() {
		return instruments_baguettes;
	}
	public void setInstruments_baguettes(List<Val> instruments_baguettes) {
		this.instruments_baguettes = instruments_baguettes;
	}
	public List<Val> getIs_left_handed() {
		return is_left_handed;
	}
	public void setIs_left_handed(List<Val> is_left_handed) {
		this.is_left_handed = is_left_handed;
	}
	public List<Val> getLabel() {
		return label;
	}
	public void setLabel(List<Val> label) {
		this.label = label;
	}
	public List<Val> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Val> languages) {
		this.languages = languages;
	}
	public List<Val> getLangue_scolaire() {
		return langue_scolaire;
	}
	public void setLangue_scolaire(List<Val> langue_scolaire) {
		this.langue_scolaire = langue_scolaire;
	}
	public List<Val> getLargeurdos_papet_filtre() {
		return largeurdos_papet_filtre;
	}
	public void setLargeurdos_papet_filtre(List<Val> largeurdos_papet_filtre) {
		this.largeurdos_papet_filtre = largeurdos_papet_filtre;
	}
	public String getLargeur_dos() {
		return largeur_dos;
	}
	public void setLargeur_dos(String largeur_dos) {
		this.largeur_dos = largeur_dos;
	}
	public List<Val> getLargeurpointe_papet_filtre() {
		return largeurpointe_papet_filtre;
	}
	public void setLargeurpointe_papet_filtre(List<Val> largeurpointe_papet_filtre) {
		this.largeurpointe_papet_filtre = largeurpointe_papet_filtre;
	}
	public String getLargeur_pointe() {
		return largeur_pointe;
	}
	public void setLargeur_pointe(String largeur_pointe) {
		this.largeur_pointe = largeur_pointe;
	}
	public String getLargeur_trait() {
		return largeur_trait;
	}
	public void setLargeur_trait(String largeur_trait) {
		this.largeur_trait = largeur_trait;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public List<Val> getLn_compatibilite() {
		return ln_compatibilite;
	}
	public void setLn_compatibilite(List<Val> ln_compatibilite) {
		this.ln_compatibilite = ln_compatibilite;
	}
	public List<Val> getLongueur_fermeture() {
		return longueur_fermeture;
	}
	public void setLongueur_fermeture(List<Val> longueur_fermeture) {
		this.longueur_fermeture = longueur_fermeture;
	}
	public Boolean getMain_category_displayed_in_borne() {
		return main_category_displayed_in_borne;
	}
	public void setMain_category_displayed_in_borne(Boolean main_category_displayed_in_borne) {
		this.main_category_displayed_in_borne = main_category_displayed_in_borne;
	}
	public List<Val> getManual_language() {
		return manual_language;
	}
	public void setManual_language(List<Val> manual_language) {
		this.manual_language = manual_language;
	}
	public List<Val> getMaterial() {
		return material;
	}
	public void setMaterial(List<Val> material) {
		this.material = material;
	}
	public List<Val> getMatiere_papet_filtre() {
		return matiere_papet_filtre;
	}
	public void setMatiere_papet_filtre(List<Val> matiere_papet_filtre) {
		this.matiere_papet_filtre = matiere_papet_filtre;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public List<Val> getMatiere_ruban() {
		return matiere_ruban;
	}
	public void setMatiere_ruban(List<Val> matiere_ruban) {
		this.matiere_ruban = matiere_ruban;
	}
	public List<Val> getMatiere_scolaire() {
		return matiere_scolaire;
	}
	public void setMatiere_scolaire(List<Val> matiere_scolaire) {
		this.matiere_scolaire = matiere_scolaire;
	}
	public List<Val> getMedium_book() {
		return medium_book;
	}
	public void setMedium_book(List<Val> medium_book) {
		this.medium_book = medium_book;
	}
	public List<Val> getMedium_disc() {
		return medium_disc;
	}
	public void setMedium_disc(List<Val> medium_disc) {
		this.medium_disc = medium_disc;
	}
	public List<Val> getMedium_multimedia() {
		return medium_multimedia;
	}
	public void setMedium_multimedia(List<Val> medium_multimedia) {
		this.medium_multimedia = medium_multimedia;
	}
	public List<Val> getMedium_video() {
		return medium_video;
	}
	public void setMedium_video(List<Val> medium_video) {
		this.medium_video = medium_video;
	}
	public String getMention_sante() {
		return mention_sante;
	}
	public void setMention_sante(String mention_sante) {
		this.mention_sante = mention_sante;
	}
	public List<Val> getModele_agenda_filtre() {
		return modele_agenda_filtre;
	}
	public void setModele_agenda_filtre(List<Val> modele_agenda_filtre) {
		this.modele_agenda_filtre = modele_agenda_filtre;
	}
	public List<Val> getModele_cartoucheencre_filtre() {
		return modele_cartoucheencre_filtre;
	}
	public void setModele_cartoucheencre_filtre(List<Val> modele_cartoucheencre_filtre) {
		this.modele_cartoucheencre_filtre = modele_cartoucheencre_filtre;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public List<Val> getMultimedia_editor() {
		return multimedia_editor;
	}
	public void setMultimedia_editor(List<Val> multimedia_editor) {
		this.multimedia_editor = multimedia_editor;
	}
	public List<Val> getMultimedia_genre() {
		return multimedia_genre;
	}
	public void setMultimedia_genre(List<Val> multimedia_genre) {
		this.multimedia_genre = multimedia_genre;
	}
	public List<Val> getMultimedia_pegi() {
		return multimedia_pegi;
	}
	public void setMultimedia_pegi(List<Val> multimedia_pegi) {
		this.multimedia_pegi = multimedia_pegi;
	}
	public List<Val> getMultimedia_people() {
		return multimedia_people;
	}
	public void setMultimedia_people(List<Val> multimedia_people) {
		this.multimedia_people = multimedia_people;
	}
	public List<Val> getMultimedia_people_developer() {
		return multimedia_people_developer;
	}
	public void setMultimedia_people_developer(List<Val> multimedia_people_developer) {
		this.multimedia_people_developer = multimedia_people_developer;
	}
	public List<Val> getMusic_collection() {
		return music_collection;
	}
	public void setMusic_collection(List<Val> music_collection) {
		this.music_collection = music_collection;
	}
	public List<Val> getMusic_people() {
		return music_people;
	}
	public void setMusic_people(List<Val> music_people) {
		this.music_people = music_people;
	}
	public List<Val> getMusic_people_artist() {
		return music_people_artist;
	}
	public void setMusic_people_artist(List<Val> music_people_artist) {
		this.music_people_artist = music_people_artist;
	}
	public List<Val> getMusic_people_composer() {
		return music_people_composer;
	}
	public void setMusic_people_composer(List<Val> music_people_composer) {
		this.music_people_composer = music_people_composer;
	}
	public List<Val> getMusic_people_singer() {
		return music_people_singer;
	}
	public void setMusic_people_singer(List<Val> music_people_singer) {
		this.music_people_singer = music_people_singer;
	}
	public List<Val> getMusic_people_writer() {
		return music_people_writer;
	}
	public void setMusic_people_writer(List<Val> music_people_writer) {
		this.music_people_writer = music_people_writer;
	}
	public Long getNights_number() {
		return nights_number;
	}
	public void setNights_number(Long nights_number) {
		this.nights_number = nights_number;
	}
	public List<Val> getNiveau_scolaire() {
		return niveau_scolaire;
	}
	public void setNiveau_scolaire(List<Val> niveau_scolaire) {
		this.niveau_scolaire = niveau_scolaire;
	}
	public List<Val> getNombre_joueurs_filtre() {
		return nombre_joueurs_filtre;
	}
	public void setNombre_joueurs_filtre(List<Val> nombre_joueurs_filtre) {
		this.nombre_joueurs_filtre = nombre_joueurs_filtre;
	}
	public List<Val> getNombre_pieces_puzzles() {
		return nombre_pieces_puzzles;
	}
	public void setNombre_pieces_puzzles(List<Val> nombre_pieces_puzzles) {
		this.nombre_pieces_puzzles = nombre_pieces_puzzles;
	}
	public String getNombre_onglets() {
		return nombre_onglets;
	}
	public void setNombre_onglets(String nombre_onglets) {
		this.nombre_onglets = nombre_onglets;
	}
	public String getNombre_pochettes() {
		return nombre_pochettes;
	}
	public void setNombre_pochettes(String nombre_pochettes) {
		this.nombre_pochettes = nombre_pochettes;
	}
	public String getNombre_revues() {
		return nombre_revues;
	}
	public void setNombre_revues(String nombre_revues) {
		this.nombre_revues = nombre_revues;
	}
	public List<Val> getNot_discountable() {
		return not_discountable;
	}
	public void setNot_discountable(List<Val> not_discountable) {
		this.not_discountable = not_discountable;
	}
	public List<Val> getNum_pinceau() {
		return num_pinceau;
	}
	public void setNum_pinceau(List<Val> num_pinceau) {
		this.num_pinceau = num_pinceau;
	}
	public List<Val> getNumero_aiguille_crochet() {
		return numero_aiguille_crochet;
	}
	public void setNumero_aiguille_crochet(List<Val> numero_aiguille_crochet) {
		this.numero_aiguille_crochet = numero_aiguille_crochet;
	}
	public String getOriginal_title() {
		return original_title;
	}
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}
	public List<Val> getPage_count_filtre() {
		return page_count_filtre;
	}
	public void setPage_count_filtre(List<Val> page_count_filtre) {
		this.page_count_filtre = page_count_filtre;
	}
	public String getPage_count() {
		return page_count;
	}
	public void setPage_count(String page_count) {
		this.page_count = page_count;
	}
	public Long getPaper_number_of_sheet() {
		return paper_number_of_sheet;
	}
	public void setPaper_number_of_sheet(Long paper_number_of_sheet) {
		this.paper_number_of_sheet = paper_number_of_sheet;
	}
	public Long getPaper_ring_binders_numbers() {
		return paper_ring_binders_numbers;
	}
	public void setPaper_ring_binders_numbers(Long paper_ring_binders_numbers) {
		this.paper_ring_binders_numbers = paper_ring_binders_numbers;
	}
	public List<Val> getPaper_tip_type() {
		return paper_tip_type;
	}
	public void setPaper_tip_type(List<Val> paper_tip_type) {
		this.paper_tip_type = paper_tip_type;
	}
	public List<Val> getParticipant_numbers() {
		return participant_numbers;
	}
	public void setParticipant_numbers(List<Val> participant_numbers) {
		this.participant_numbers = participant_numbers;
	}
	public String getPcb_quantity() {
		return pcb_quantity;
	}
	public void setPcb_quantity(String pcb_quantity) {
		this.pcb_quantity = pcb_quantity;
	}
	public String getPcb_text() {
		return pcb_text;
	}
	public void setPcb_text(String pcb_text) {
		this.pcb_text = pcb_text;
	}
	public String getPerforation() {
		return perforation;
	}
	public void setPerforation(String perforation) {
		this.perforation = perforation;
	}
	public List<Val> getPerfumes() {
		return perfumes;
	}
	public void setPerfumes(List<Val> perfumes) {
		this.perfumes = perfumes;
	}
	public String getPersonnalisable() {
		return personnalisable;
	}
	public void setPersonnalisable(String personnalisable) {
		this.personnalisable = personnalisable;
	}
	public String getPhrases_precaution() {
		return phrases_precaution;
	}
	public void setPhrases_precaution(String phrases_precaution) {
		this.phrases_precaution = phrases_precaution;
	}
	public String getPhrases_mentions_danger() {
		return phrases_mentions_danger;
	}
	public void setPhrases_mentions_danger(String phrases_mentions_danger) {
		this.phrases_mentions_danger = phrases_mentions_danger;
	}
	public List<Val> getPlatform_multimedia() {
		return platform_multimedia;
	}
	public void setPlatform_multimedia(List<Val> platform_multimedia) {
		this.platform_multimedia = platform_multimedia;
	}
	public List<Val> getPour_qui_coffret_kdo() {
		return pour_qui_coffret_kdo;
	}
	public void setPour_qui_coffret_kdo(List<Val> pour_qui_coffret_kdo) {
		this.pour_qui_coffret_kdo = pour_qui_coffret_kdo;
	}
	public String getPress_review() {
		return press_review;
	}
	public void setPress_review(String press_review) {
		this.press_review = press_review;
	}
	public List<Val> getProject_age() {
		return project_age;
	}
	public void setProject_age(List<Val> project_age) {
		this.project_age = project_age;
	}
	public List<Val> getProject_budget() {
		return project_budget;
	}
	public void setProject_budget(List<Val> project_budget) {
		this.project_budget = project_budget;
	}
	public List<Val> getProject_difficulty() {
		return project_difficulty;
	}
	public void setProject_difficulty(List<Val> project_difficulty) {
		this.project_difficulty = project_difficulty;
	}
	public List<Val> getProject_time() {
		return project_time;
	}
	public void setProject_time(List<Val> project_time) {
		this.project_time = project_time;
	}
	public String getProvider_description() {
		return provider_description;
	}
	public void setProvider_description(String provider_description) {
		this.provider_description = provider_description;
	}
	public List<Val> getQuality() {
		return quality;
	}
	public void setQuality(List<Val> quality) {
		this.quality = quality;
	}
	public List<Val> getRange_assortment() {
		return range_assortment;
	}
	public void setRange_assortment(List<Val> range_assortment) {
		this.range_assortment = range_assortment;
	}
	public Double getRank1() {
		return rank1;
	}
	public void setRank1(Double rank1) {
		this.rank1 = rank1;
	}
	public Double getRank2() {
		return rank2;
	}
	public void setRank2(Double rank2) {
		this.rank2 = rank2;
	}
	public Double getRank3() {
		return rank3;
	}
	public void setRank3(Double rank3) {
		this.rank3 = rank3;
	}
	public Double getRank4() {
		return rank4;
	}
	public void setRank4(Double rank4) {
		this.rank4 = rank4;
	}
	public Double getRank5() {
		return rank5;
	}
	public void setRank5(Double rank5) {
		this.rank5 = rank5;
	}
	public Double getRank6() {
		return rank6;
	}
	public void setRank6(Double rank6) {
		this.rank6 = rank6;
	}
	public Long getRating_filter() {
		return rating_filter;
	}
	public void setRating_filter(Long rating_filter) {
		this.rating_filter = rating_filter;
	}
	public Long getRatings_count() {
		return ratings_count;
	}
	public void setRatings_count(Long ratings_count) {
		this.ratings_count = ratings_count;
	}
	public String getRechargeable() {
		return rechargeable;
	}
	public void setRechargeable(String rechargeable) {
		this.rechargeable = rechargeable;
	}
	public List<Val> getRegions() {
		return regions;
	}
	public void setRegions(List<Val> regions) {
		this.regions = regions;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public Boolean getRequired_options() {
		return required_options;
	}
	public void setRequired_options(Boolean required_options) {
		this.required_options = required_options;
	}
	public List<Val> getSaison_tricot() {
		return saison_tricot;
	}
	public void setSaison_tricot(List<Val> saison_tricot) {
		this.saison_tricot = saison_tricot;
	}
	public List<Val> getSans_bisphenol_a() {
		return sans_bisphenol_a;
	}
	public void setSans_bisphenol_a(List<Val> sans_bisphenol_a) {
		this.sans_bisphenol_a = sans_bisphenol_a;
	}
	public List<Val> getSans_conservateur() {
		return sans_conservateur;
	}
	public void setSans_conservateur(List<Val> sans_conservateur) {
		this.sans_conservateur = sans_conservateur;
	}
	public List<Val> getSans_gluten() {
		return sans_gluten;
	}
	public void setSans_gluten(List<Val> sans_gluten) {
		this.sans_gluten = sans_gluten;
	}
	public List<Val> getSans_lactose() {
		return sans_lactose;
	}
	public void setSans_lactose(List<Val> sans_lactose) {
		this.sans_lactose = sans_lactose;
	}
	public Search_terms_position[] getSearch_terms_position() {
		return search_terms_position;
	}
	public void setSearch_terms_position(Search_terms_position[] search_terms_position) {
		this.search_terms_position = search_terms_position;
	}
	public List<Val> getServices() {
		return services;
	}
	public void setServices(List<Val> services) {
		this.services = services;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public String getSpecial_from_date() {
		return special_from_date;
	}
	public void setSpecial_from_date(String special_from_date) {
		this.special_from_date = special_from_date;
	}
	public Double getSpecial_price() {
		return special_price;
	}
	public void setSpecial_price(Double special_price) {
		this.special_price = special_price;
	}
	public String getSpecial_to_date() {
		return special_to_date;
	}
	public void setSpecial_to_date(String special_to_date) {
		this.special_to_date = special_to_date;
	}
	public String getSpecifique_gaucher() {
		return specifique_gaucher;
	}
	public void setSpecifique_gaucher(String specifique_gaucher) {
		this.specifique_gaucher = specifique_gaucher;
	}
	public List<Val> getStatus() {
		return status;
	}
	public void setStatus(List<Val> status) {
		this.status = status;
	}
	public Long getStock() {
		return stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}
	public Long getStore_id() {
		return store_id;
	}
	public void setStore_id(Long store_id) {
		this.store_id = store_id;
	}
	public String getTaille_pointe() {
		return taille_pointe;
	}
	public void setTaille_pointe(String taille_pointe) {
		this.taille_pointe = taille_pointe;
	}
	public List<Val> getTarget_age() {
		return target_age;
	}
	public void setTarget_age(List<Val> target_age) {
		this.target_age = target_age;
	}
	public List<Val> getTechnics() {
		return technics;
	}
	public void setTechnics(List<Val> technics) {
		this.technics = technics;
	}
	public List<Val> getThematic() {
		return thematic;
	}
	public void setThematic(List<Val> thematic) {
		this.thematic = thematic;
	}
	public List<Val> getTheme_jj() {
		return theme_jj;
	}
	public void setTheme_jj(List<Val> theme_jj) {
		this.theme_jj = theme_jj;
	}
	public List<Val> getTheme_maquette_filtre() {
		return theme_maquette_filtre;
	}
	public void setTheme_maquette_filtre(List<Val> theme_maquette_filtre) {
		this.theme_maquette_filtre = theme_maquette_filtre;
	}
	public String getThickness() {
		return thickness;
	}
	public void setThickness(String thickness) {
		this.thickness = thickness;
	}
	public List<Val> getTricot_ideal_pour() {
		return tricot_ideal_pour;
	}
	public void setTricot_ideal_pour(List<Val> tricot_ideal_pour) {
		this.tricot_ideal_pour = tricot_ideal_pour;
	}
	public List<Val> getType_agenda_papet_filtre() {
		return type_agenda_papet_filtre;
	}
	public void setType_agenda_papet_filtre(List<Val> type_agenda_papet_filtre) {
		this.type_agenda_papet_filtre = type_agenda_papet_filtre;
	}
	public List<Val> getType_bouton_lca() {
		return type_bouton_lca;
	}
	public void setType_bouton_lca(List<Val> type_bouton_lca) {
		this.type_bouton_lca = type_bouton_lca;
	}
	public String getType_cellule_platine_musique() {
		return type_cellule_platine_musique;
	}
	public void setType_cellule_platine_musique(String type_cellule_platine_musique) {
		this.type_cellule_platine_musique = type_cellule_platine_musique;
	}
	public List<Val> getType_de_cartable_papet_filtre() {
		return type_de_cartable_papet_filtre;
	}
	public void setType_de_cartable_papet_filtre(List<Val> type_de_cartable_papet_filtre) {
		this.type_de_cartable_papet_filtre = type_de_cartable_papet_filtre;
	}
	public List<Val> getType_de_methode_de_langue() {
		return type_de_methode_de_langue;
	}
	public void setType_de_methode_de_langue(List<Val> type_de_methode_de_langue) {
		this.type_de_methode_de_langue = type_de_methode_de_langue;
	}
	public List<Val> getType_dictionnaire_scolaire() {
		return type_dictionnaire_scolaire;
	}
	public void setType_dictionnaire_scolaire(List<Val> type_dictionnaire_scolaire) {
		this.type_dictionnaire_scolaire = type_dictionnaire_scolaire;
	}
	public List<Val> getType_enceinte() {
		return type_enceinte;
	}
	public void setType_enceinte(List<Val> type_enceinte) {
		this.type_enceinte = type_enceinte;
	}
	public List<Val> getType_fermeture() {
		return type_fermeture;
	}
	public void setType_fermeture(List<Val> type_fermeture) {
		this.type_fermeture = type_fermeture;
	}
	public List<Val> getType_fut() {
		return type_fut;
	}
	public void setType_fut(List<Val> type_fut) {
		this.type_fut = type_fut;
	}
	public List<Val> getType_grille_agenda_filtre() {
		return type_grille_agenda_filtre;
	}
	public void setType_grille_agenda_filtre(List<Val> type_grille_agenda_filtre) {
		this.type_grille_agenda_filtre = type_grille_agenda_filtre;
	}
	public List<Val> getType_harmonica() {
		return type_harmonica;
	}
	public void setType_harmonica(List<Val> type_harmonica) {
		this.type_harmonica = type_harmonica;
	}
	public List<Val> getType_ruban() {
		return type_ruban;
	}
	public void setType_ruban(List<Val> type_ruban) {
		this.type_ruban = type_ruban;
	}
	public String getType_cahier() {
		return type_cahier;
	}
	public void setType_cahier(String type_cahier) {
		this.type_cahier = type_cahier;
	}
	public String getType_chemise() {
		return type_chemise;
	}
	public void setType_chemise(String type_chemise) {
		this.type_chemise = type_chemise;
	}
	public String getType_classeur() {
		return type_classeur;
	}
	public void setType_classeur(String type_classeur) {
		this.type_classeur = type_classeur;
	}
	public List<Val> getTypecouverture_papet_filtre() {
		return typecouverture_papet_filtre;
	}
	public void setTypecouverture_papet_filtre(List<Val> typecouverture_papet_filtre) {
		this.typecouverture_papet_filtre = typecouverture_papet_filtre;
	}
	public String getType_couverture() {
		return type_couverture;
	}
	public void setType_couverture(String type_couverture) {
		this.type_couverture = type_couverture;
	}
	public List<Val> getTypedepapier_lca() {
		return typedepapier_lca;
	}
	public void setTypedepapier_lca(List<Val> typedepapier_lca) {
		this.typedepapier_lca = typedepapier_lca;
	}
	public String getType_marqueur() {
		return type_marqueur;
	}
	public void setType_marqueur(String type_marqueur) {
		this.type_marqueur = type_marqueur;
	}
	public String getType_pinceau() {
		return type_pinceau;
	}
	public void setType_pinceau(String type_pinceau) {
		this.type_pinceau = type_pinceau;
	}
	public String getType_pochettes() {
		return type_pochettes;
	}
	public void setType_pochettes(String type_pochettes) {
		this.type_pochettes = type_pochettes;
	}
	public String getType_pointe_marqeur() {
		return type_pointe_marqeur;
	}
	public void setType_pointe_marqeur(String type_pointe_marqeur) {
		this.type_pointe_marqeur = type_pointe_marqeur;
	}
	public List<Val> getTypereglure_papet_filtre() {
		return typereglure_papet_filtre;
	}
	public void setTypereglure_papet_filtre(List<Val> typereglure_papet_filtre) {
		this.typereglure_papet_filtre = typereglure_papet_filtre;
	}
	public String getType_reglure() {
		return type_reglure;
	}
	public void setType_reglure(String type_reglure) {
		this.type_reglure = type_reglure;
	}
	public List<Val> getTypereliure_papet_filtre() {
		return typereliure_papet_filtre;
	}
	public void setTypereliure_papet_filtre(List<Val> typereliure_papet_filtre) {
		this.typereliure_papet_filtre = typereliure_papet_filtre;
	}
	public String getType_reliure() {
		return type_reliure;
	}
	public void setType_reliure(String type_reliure) {
		this.type_reliure = type_reliure;
	}
	public String getType_stylo() {
		return type_stylo;
	}
	public void setType_stylo(String type_stylo) {
		this.type_stylo = type_stylo;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public String getUse_tips() {
		return use_tips;
	}
	public void setUse_tips(String use_tips) {
		this.use_tips = use_tips;
	}
	public List<Val> getUse_type() {
		return use_type;
	}
	public void setUse_type(List<Val> use_type) {
		this.use_type = use_type;
	}
	public List<Val> getUtilisation_peintures() {
		return utilisation_peintures;
	}
	public void setUtilisation_peintures(List<Val> utilisation_peintures) {
		this.utilisation_peintures = utilisation_peintures;
	}
	public List<Val> getVideo_collection() {
		return video_collection;
	}
	public void setVideo_collection(List<Val> video_collection) {
		this.video_collection = video_collection;
	}
	public List<Val> getVideo_editor() {
		return video_editor;
	}
	public void setVideo_editor(List<Val> video_editor) {
		this.video_editor = video_editor;
	}
	public List<Val> getVideo_genre() {
		return video_genre;
	}
	public void setVideo_genre(List<Val> video_genre) {
		this.video_genre = video_genre;
	}
	public List<Val> getVideo_origine() {
		return video_origine;
	}
	public void setVideo_origine(List<Val> video_origine) {
		this.video_origine = video_origine;
	}
	public List<Val> getVideo_people() {
		return video_people;
	}
	public void setVideo_people(List<Val> video_people) {
		this.video_people = video_people;
	}
	public List<Val> getVideo_people_actor() {
		return video_people_actor;
	}
	public void setVideo_people_actor(List<Val> video_people_actor) {
		this.video_people_actor = video_people_actor;
	}
	public List<Val> getVideo_people_producer() {
		return video_people_producer;
	}
	public void setVideo_people_producer(List<Val> video_people_producer) {
		this.video_people_producer = video_people_producer;
	}
	public List<Val> getVideo_people_realisator() {
		return video_people_realisator;
	}
	public void setVideo_people_realisator(List<Val> video_people_realisator) {
		this.video_people_realisator = video_people_realisator;
	}
	public List<Val> getVideo_people_scriptwriter() {
		return video_people_scriptwriter;
	}
	public void setVideo_people_scriptwriter(List<Val> video_people_scriptwriter) {
		this.video_people_scriptwriter = video_people_scriptwriter;
	}
	public String getVideo_release_date() {
		return video_release_date;
	}
	public void setVideo_release_date(String video_release_date) {
		this.video_release_date = video_release_date;
	}
	public List<Val> getVideo_series() {
		return video_series;
	}
	public void setVideo_series(List<Val> video_series) {
		this.video_series = video_series;
	}
	public List<Val> getVideo_version() {
		return video_version;
	}
	public void setVideo_version(List<Val> video_version) {
		this.video_version = video_version;
	}
	public List<Val> getVisibility() {
		return visibility;
	}
	public void setVisibility(List<Val> visibility) {
		this.visibility = visibility;
	}
	public String getWebsite_description() {
		return website_description;
	}
	public void setWebsite_description(String website_description) {
		this.website_description = website_description;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public List<Val> getWorkshop_audience() {
		return workshop_audience;
	}
	public void setWorkshop_audience(List<Val> workshop_audience) {
		this.workshop_audience = workshop_audience;
	}
	public String getWorkshop_date() {
		return workshop_date;
	}
	public void setWorkshop_date(String workshop_date) {
		this.workshop_date = workshop_date;
	}
	public String getWorkshop_date_weekday() {
		return workshop_date_weekday;
	}
	public void setWorkshop_date_weekday(String workshop_date_weekday) {
		this.workshop_date_weekday = workshop_date_weekday;
	}
	public Long getWorkshop_parent_id() {
		return workshop_parent_id;
	}
	public void setWorkshop_parent_id(Long workshop_parent_id) {
		this.workshop_parent_id = workshop_parent_id;
	}
	public List<Val> getWorkshop_shop() {
		return workshop_shop;
	}
	public void setWorkshop_shop(List<Val> workshop_shop) {
		this.workshop_shop = workshop_shop;
	}
	public List<Val> getWorkshop_target_age() {
		return workshop_target_age;
	}
	public void setWorkshop_target_age(List<Val> workshop_target_age) {
		this.workshop_target_age = workshop_target_age;
	}
	public List<Val> getWorkshop_type() {
		return workshop_type;
	}
	public void setWorkshop_type(List<Val> workshop_type) {
		this.workshop_type = workshop_type;
	}
	
	
}
