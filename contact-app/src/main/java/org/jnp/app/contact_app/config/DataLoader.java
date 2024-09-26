package org.jnp.app.contact_app.config;
import org.jnp.app.contact_app.Entity.Contact;
import org.jnp.app.contact_app.Repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ContactRepository  contactRepository;
    
    public DataLoader(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;

    }


    public void run(String... args) throws Exception {
       // Load initial data into the database
       // Load initial data into the database
Contact contact1= new Contact (null,"Chelsea","Grace","Parker","408-285-4290","chelsea.parker@ymail.com","404-40-7254","Married","F","Asian","Doctoral degree"); 
contactRepository.save(contact1);
Contact contact2= new Contact (null,"Claire","Lee","Patterson","505-810-2413","cpatterson79@ymail.com","939-92-8950","Divorced","F","Native Hawaiian or Other Pacific Islander","High school diploma or equivalent"); 
contactRepository.save(contact2);
Contact contact3= new Contact (null,"Evelyn","Renee","Powell","704-970-8081","er@ymail.com","574-65-7899","Divorced","F","Black or African American","Doctoral degree"); 
contactRepository.save(contact3);
Contact contact4= new Contact (null,"Timothy","David","Carter","708-054-0480","tcarter@outlook.com","049-11-7735","Divorced","M","Native Hawaiian or Other Pacific Islander","Less than high school"); 
contactRepository.save(contact4);
Contact contact5= new Contact (null,"Brandon","Alexander","Adams","916-491-3857","brandon_adams@outlook.com","940-34-7893","Married","M","White","High school diploma or equivalent"); 
contactRepository.save(contact5);
Contact contact6= new Contact (null,"Jeremy","Charles","Young","585-566-8594","j_c_young37@ymail.com","241-39-9006","Married","M","Native Hawaiian or Other Pacific Islander","Doctoral degree"); 
contactRepository.save(contact6);
Contact contact7= new Contact (null,"Jennifer","Margaret","Reed","458-881-8088","j.m.reed34@rocketmail.com","437-81-3837","Married","F","Asian","Master’s degree"); 
contactRepository.save(contact7);
Contact contact8= new Contact (null,"William","Francis","Foster","808-840-2530","williamfrancisfoster@live.com","620-82-5864","Married","M","Black or African American","Master’s degree"); 
contactRepository.save(contact8);
Contact contact9= new Contact (null,"Oliver","Michael","Gray","920-981-1080","ogray@hotmail.com","225-37-4539","Single","M","Native Hawaiian or Other Pacific Islander","Some college, no degree"); 
contactRepository.save(contact9);
Contact contact10= new Contact (null,"Layla","Elizabeth","Miller","903-979-6194","layla_miller@aol.com","467-27-9029","Single","F","Native Hawaiian or Other Pacific Islander","Master’s degree"); 
contactRepository.save(contact10);
Contact contact11= new Contact (null,"Rachel","Lou","Hughes","737-554-8552","rachel_hughes@outlook.com","788-80-4333","Divorced","F","Native Hawaiian or Other Pacific Islander","Some college, no degree"); 
contactRepository.save(contact11);
Contact contact12= new Contact (null,"Jose","Francis","Brown","208-936-3452","jose_francis_brown@rocketmail.com","134-87-6010","Divorced","M","White","Less than high school"); 
contactRepository.save(contact12);
Contact contact13= new Contact (null,"Mateo","Matthew","Diaz","757-830-5124","mateo_diaz@gmail.com","983-00-5695","Married","M","Native Hawaiian or Other Pacific Islander","Master’s degree"); 
contactRepository.save(contact13);
Contact contact14= new Contact (null,"William","Matthew","Simmons","941-936-2144","wmsimmons@ymail.com","116-80-9442","Married","M","White","High school diploma or equivalent"); 
contactRepository.save(contact14);
Contact contact15= new Contact (null,"Megan","Grace","Phillips","331-390-7225","mphillips47@ymail.com","905-65-7945","Married","F","Asian","Doctoral degree"); 
contactRepository.save(contact15);
Contact contact16= new Contact (null,"Michelle","Elizabeth","Bryant","517-416-1132","m.e.bryant32@rocketmail.com","060-68-5698","Married","F","White","High school diploma or equivalent"); 
contactRepository.save(contact16);
Contact contact17= new Contact (null,"Sarah","Dawn","Martinez","727-222-2899","s_martinez@live.com","434-36-4520","Married","F","Black or African American","High school diploma or equivalent"); 
contactRepository.save(contact17);
Contact contact18= new Contact (null,"Benjamin","Anthony","Gray","620-367-7165","bgray2@yahoo.com","330-84-7071","Divorced","M","Native Hawaiian or Other Pacific Islander","Master’s degree"); 
contactRepository.save(contact18);
Contact contact19= new Contact (null,"Henry","Alexander","Henderson","318-697-7744","henry_henderson79@aol.com","530-61-3291","Married","M","Native Hawaiian or Other Pacific Islander","High school diploma or equivalent"); 
contactRepository.save(contact19);
Contact contact20= new Contact (null,"Gabriel","Andrew","Parker","502-136-1673","g.parker84@gmail.com","945-29-3930","Single","M","Asian","Bachelor’s degree"); 
contactRepository.save(contact20);
Contact contact21= new Contact (null,"Taylor","Jane","Evans","209-886-7220","t_evans@aol.com","244-38-7664","Single","F","Native Hawaiian or Other Pacific Islander","Less than high school"); 
contactRepository.save(contact21);
Contact contact22= new Contact (null,"Jack","William","Young","920-305-6462","jack.young@rocketmail.com","922-68-7584","Married","M","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact22);
Contact contact23= new Contact (null,"Kayla","May","Stewart","935-197-7880","kaylastewart@yahoo.com","538-29-5726","Married","F","Native Hawaiian or Other Pacific Islander","Doctoral degree"); 
contactRepository.save(contact23);
Contact contact24= new Contact (null,"Austin","Scott","Kelly","234-811-4825","austin_kelly@hotmail.com","592-40-5994","Married","M","Native Hawaiian or Other Pacific Islander","Less than high school"); 
contactRepository.save(contact24);
Contact contact25= new Contact (null,"Benjamin","Edward","Thompson","347-979-6277","benjaminedwardthompson@ymail.com","727-78-8904","Divorced","M","White","Doctoral degree"); 
contactRepository.save(contact25);
Contact contact26= new Contact (null,"Kevin","Michael","Young","507-155-5922","kevinmyoung@yahoo.com","923-37-8329","Separated","M","Black or African American","Less than high school"); 
contactRepository.save(contact26);
Contact contact27= new Contact (null,"Victoria","Mary","Washington","857-619-6864","victoria_washington@outlook.com","812-92-1728","Separated","F","Asian","Bachelor’s degree"); 
contactRepository.save(contact27);
Contact contact28= new Contact (null,"Eleanor","Mary","Morris","313-018-7356","emorris@yahoo.com","414-62-1518","Divorced","F","White","Doctoral degree"); 
contactRepository.save(contact28);
Contact contact29= new Contact (null,"Emma","Jean","Walker","918-739-8645","e_walker@aol.com","718-46-5806","Widowed","F","Native Hawaiian or Other Pacific Islander","Associate degree"); 
contactRepository.save(contact29);
Contact contact30= new Contact (null,"James","Michael","Sanders","906-958-1178","j.sanders@ymail.com","826-96-3320","Single","M","White","Associate degree"); 
contactRepository.save(contact30);
Contact contact31= new Contact (null,"Tiffany","May","Parker","754-625-2556","tmparker@rocketmail.com","295-66-8785","Divorced","F","Black or African American","Some college, no degree"); 
contactRepository.save(contact31);
Contact contact32= new Contact (null,"Sara","Dawn","Turner","505-795-1966","s.d.turner@hotmail.com","711-91-3831","Single","F","White","Bachelor’s degree"); 
contactRepository.save(contact32);
Contact contact33= new Contact (null,"Sean","Anthony","Cooper","380-696-0772","s.a.cooper75@rocketmail.com","380-66-4582","Married","M","White","Master’s degree"); 
contactRepository.save(contact33);
Contact contact34= new Contact (null,"Courtney","Dawn","Ramirez","510-388-5778","courtney64@yahoo.com","888-93-2248","Married","F","White","Master’s degree"); 
contactRepository.save(contact34);
Contact contact35= new Contact (null,"Lauren","Lou","Murphy","870-602-2232","laurenlmurphy@gmail.com","736-72-6783","Married","F","White","Less than high school"); 
contactRepository.save(contact35);
Contact contact36= new Contact (null,"Austin","Michael","Parker","313-754-0471","amparker@rocketmail.com","891-26-5634","Married","M","Native Hawaiian or Other Pacific Islander","Some college, no degree"); 
contactRepository.save(contact36);
Contact contact37= new Contact (null,"Joseph","Eugene","Long","567-514-4771","joseph@aol.com","245-45-3592","Divorced","M","Native Hawaiian or Other Pacific Islander","Some college, no degree"); 
contactRepository.save(contact37);
Contact contact38= new Contact (null,"Adam","Scott","Johnson","267-435-4940","a.s.johnson5@live.com","056-69-2432","Separated","M","Native Hawaiian or Other Pacific Islander","High school diploma or equivalent"); 
contactRepository.save(contact38);
Contact contact39= new Contact (null,"Theodore","Robert","Garcia","802-710-9700","t.r.garcia@live.com","660-94-7620","Divorced","M","White","Associate degree"); 
contactRepository.save(contact39);
Contact contact40= new Contact (null,"Erin","Renee","Evans","210-071-3635","erin.evans15@live.com","606-00-4508","Married","F","Black or African American","Some college, no degree"); 
contactRepository.save(contact40);
Contact contact41= new Contact (null,"Katherine","Renee","Brooks","937-114-0184","katherine.renee.brooks@aol.com","656-72-4188","Divorced","F","Asian","Associate degree"); 
contactRepository.save(contact41);
Contact contact42= new Contact (null,"Haley","Jean","Robinson","573-033-7863","haley.robinson@gmail.com","077-04-4007","Single","F","Black or African American","Master’s degree"); 
contactRepository.save(contact42);
Contact contact43= new Contact (null,"Robert","Scott","Griffin","479-700-0758","r_griffin@rocketmail.com","161-41-1087","Married","M","White","Master’s degree"); 
contactRepository.save(contact43);
Contact contact44= new Contact (null,"Heather","Sue","Sanchez","320-043-1098","heathersue@gmail.com","203-49-2829","Single","F","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact44);
Contact contact45= new Contact (null,"Charlotte","Jane","White","224-383-4835","charlottewhite@ymail.com","549-88-5523","Married","F","Native Hawaiian or Other Pacific Islander","Some college, no degree"); 
contactRepository.save(contact45);
Contact contact46= new Contact (null,"Mary","Anne","Bailey","681-256-5186","mary.a.bailey@ymail.com","299-87-8898","Separated","F","White","Associate degree"); 
contactRepository.save(contact46);
Contact contact47= new Contact (null,"Jose","David","Hughes","614-052-4308","j_d_hughes@ymail.com","953-25-0329","Married","M","Native Hawaiian or Other Pacific Islander","Associate degree"); 
contactRepository.save(contact47);
Contact contact48= new Contact (null,"Christopher","Charles","Powell","430-574-4209","christopherpowell54@aol.com","237-99-0510","Married","M","Native Hawaiian or Other Pacific Islander","Doctoral degree"); 
contactRepository.save(contact48);
Contact contact49= new Contact (null,"Isabella","Ann","Lopez","661-881-1469","isabellalopez77@hotmail.com","391-78-6810","Divorced","F","White","Associate degree"); 
contactRepository.save(contact49);
Contact contact50= new Contact (null,"Jack","Francis","Harris","912-320-4497","jack_francis_harris@yahoo.com","237-57-5619","Married","M","Asian","Less than high school"); 
contactRepository.save(contact50);
Contact contact51= new Contact (null,"Melissa","Irene","Howard","863-355-7933","m.i.howard14@aol.com","653-37-2913","Divorced","F","Native Hawaiian or Other Pacific Islander","High school diploma or equivalent"); 
contactRepository.save(contact51);
Contact contact52= new Contact (null,"Samuel","Allen","Taylor","307-895-5908","samuel_allen@live.com","826-37-3424","Married","M","Native Hawaiian or Other Pacific Islander","Some college, no degree"); 
contactRepository.save(contact52);
Contact contact53= new Contact (null,"Haley","Renee","Foster","337-374-4595","h_foster@gmail.com","960-25-9471","Married","F","American Indian or Alaska Native","Less than high school"); 
contactRepository.save(contact53);
Contact contact54= new Contact (null,"Sebastian","John","Johnson","606-325-0081","sebastian_johnson@ymail.com","216-58-7897","Divorced","M","Native Hawaiian or Other Pacific Islander","Less than high school"); 
contactRepository.save(contact54);
Contact contact55= new Contact (null,"Erin","Rose","Moore","325-582-3270","erin_rose_moore@aol.com","045-42-4865","Married","F","White","Associate degree"); 
contactRepository.save(contact55);
Contact contact56= new Contact (null,"Erin","Mae","Torres","769-080-1511","erinmaetorres16@ymail.com","967-31-9303","Divorced","F","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact56);
Contact contact57= new Contact (null,"Patrick","David","Morgan","619-959-8685","pmorgan@gmail.com","924-96-9204","Married","M","Native Hawaiian or Other Pacific Islander","Master’s degree"); 
contactRepository.save(contact57);
Contact contact58= new Contact (null,"Richard","Joseph","Jenkins","617-418-2759","r_jenkins12@live.com","779-66-8089","Married","M","White","Bachelor’s degree"); 
contactRepository.save(contact58);
Contact contact59= new Contact (null,"Emma","May","Miller","757-268-0079","e_m_miller@live.com","693-74-1298","Married","F","Asian","Associate degree"); 
contactRepository.save(contact59);
Contact contact60= new Contact (null,"Daniel","Alan","Wood","719-374-3276","d.a.wood@outlook.com","028-57-2217","Married","M","Black or African American","Master’s degree"); 
contactRepository.save(contact60);
Contact contact61= new Contact (null,"Lillian","Faith","Morgan","808-438-6754","l.morgan71@hotmail.com","216-78-0472","Separated","F","Black or African American","High school diploma or equivalent"); 
contactRepository.save(contact61);
Contact contact62= new Contact (null,"Jasmine","Mary","Turner","718-329-7002","jasmine.turner@outlook.com","268-94-1353","Divorced","F","White","Master’s degree"); 
contactRepository.save(contact62);
Contact contact63= new Contact (null,"Matthew","David","Cox","415-737-8726","md@rocketmail.com","977-62-0051","Married","M","White","Less than high school"); 
contactRepository.save(contact63);
Contact contact64= new Contact (null,"Eleanor","Lee","Richardson","832-582-8823","eleanor_richardson@live.com","373-84-5557","Married","F","White","Less than high school"); 
contactRepository.save(contact64);
Contact contact65= new Contact (null,"Justin","Allen","Williams","321-034-3191","j_a@outlook.com","880-87-2543","Single","M","White","Bachelor’s degree"); 
contactRepository.save(contact65);
Contact contact66= new Contact (null,"Evelyn","Ruth","Barnes","212-547-6975","evelyn_barnes@gmail.com","452-49-7643","Married","F","Black or African American","Some college, no degree"); 
contactRepository.save(contact66);
Contact contact67= new Contact (null,"Benjamin","Michael","Flores","927-996-0345","benjamin_flores@ymail.com","002-39-8887","Single","M","Native Hawaiian or Other Pacific Islander","Some college, no degree"); 
contactRepository.save(contact67);
Contact contact68= new Contact (null,"Abigail","Mae","Rodriguez","574-807-3859","arodriguez@outlook.com","264-05-4577","Married","F","Black or African American","Associate degree"); 
contactRepository.save(contact68);
Contact contact69= new Contact (null,"Hannah","Rose","Russell","773-746-5301","hannah_r_russell@gmail.com","641-63-5064","Divorced","F","Black or African American","Associate degree"); 
contactRepository.save(contact69);
Contact contact70= new Contact (null,"John","John","Watson","570-930-7371","j_j3@aol.com","894-08-7949","Married","M","White","Bachelor’s degree"); 
contactRepository.save(contact70);
Contact contact71= new Contact (null,"Tiffany","Nicole","James","283-194-7185","t_n_james@aol.com","870-98-9898","Married","F","Native Hawaiian or Other Pacific Islander","Associate degree"); 
contactRepository.save(contact71);
Contact contact72= new Contact (null,"Kyle","Wayne","Price","760-600-2878","kprice@live.com","344-27-0301","Married","M","White","Associate degree"); 
contactRepository.save(contact72);
Contact contact73= new Contact (null,"Abigail","May","Washington","267-828-6522","amwashington@rocketmail.com","641-69-8143","Single","F","White","Bachelor’s degree"); 
contactRepository.save(contact73);
Contact contact74= new Contact (null,"Kevin","Allen","White","828-628-1080","kevin.white79@hotmail.com","659-61-4723","Married","M","White","High school diploma or equivalent"); 
contactRepository.save(contact74);
Contact contact75= new Contact (null,"Brittany","Margaret","King","901-131-7539","brittanymargaretking@rocketmail.com","246-53-8406","Single","F","Native Hawaiian or Other Pacific Islander","Doctoral degree"); 
contactRepository.save(contact75);
Contact contact76= new Contact (null,"Amelia","Anne","Wilson","385-656-9903","amelia@ymail.com","019-22-0407","Divorced","F","White","Some college, no degree"); 
contactRepository.save(contact76);
Contact contact77= new Contact (null,"Ethan","Ray","Cox","409-718-7930","ethan.r@live.com","559-95-1028","Divorced","M","Native Hawaiian or Other Pacific Islander","Less than high school"); 
contactRepository.save(contact77);
Contact contact78= new Contact (null,"David","Robert","Ward","919-972-9769","david_r@gmail.com","990-22-7811","Married","M","Native Hawaiian or Other Pacific Islander","High school diploma or equivalent"); 
contactRepository.save(contact78);
Contact contact79= new Contact (null,"Mary","Sue","Wood","270-526-1854","mwood@aol.com","484-79-3035","Single","F","Black or African American","Master’s degree"); 
contactRepository.save(contact79);
Contact contact80= new Contact (null,"Thomas","Michael","Hill","831-544-3155","t_hill@outlook.com","620-87-3269","Single","M","Asian","Less than high school"); 
contactRepository.save(contact80);
Contact contact81= new Contact (null,"Ethan","Ray","Rogers","509-414-0146","e.rogers@gmail.com","990-64-5267","Single","M","Black or African American","Bachelor’s degree"); 
contactRepository.save(contact81);
Contact contact82= new Contact (null,"Joshua","Alan","Gonzales","816-323-3473","joshuaa89@hotmail.com","572-08-3217","Divorced","M","Native Hawaiian or Other Pacific Islander","Associate degree"); 
contactRepository.save(contact82);
Contact contact83= new Contact (null,"Andrew","Eugene","Flores","216-936-9939","a.flores@rocketmail.com","122-43-9289","Separated","M","Native Hawaiian or Other Pacific Islander","Less than high school"); 
contactRepository.save(contact83);
Contact contact84= new Contact (null,"Danielle","Margaret","Gonzales","732-166-0100","d_m_gonzales@outlook.com","349-36-3273","Divorced","F","Black or African American","Bachelor’s degree"); 
contactRepository.save(contact84);
Contact contact85= new Contact (null,"Chelsea","Rose","Morgan","856-953-0976","c.r.morgan@yahoo.com","185-65-0795","Married","F","White","Associate degree"); 
contactRepository.save(contact85);
Contact contact86= new Contact (null,"Grace","Jane","Roberts","580-711-2965","g_j_roberts@hotmail.com","686-52-2391","Divorced","F","White","Bachelor’s degree"); 
contactRepository.save(contact86);
Contact contact87= new Contact (null,"Jessica","Grace","Moore","423-663-0427","jessica_grace_moore@aol.com","698-41-1128","Single","F","White","Associate degree"); 
contactRepository.save(contact87);
Contact contact88= new Contact (null,"Allison","May","Wood","603-529-5763","a_wood@outlook.com","768-52-2290","Separated","F","White","Doctoral degree"); 
contactRepository.save(contact88);
Contact contact89= new Contact (null,"Anthony","Alan","Sanders","414-121-6636","anthonyalansanders12@yahoo.com","809-88-7464","Married","M","Asian","Less than high school"); 
contactRepository.save(contact89);
Contact contact90= new Contact (null,"Eleanor","Marie","Johnson","217-001-3869","e_m_johnson@yahoo.com","276-79-2037","Single","F","Native Hawaiian or Other Pacific Islander","Less than high school"); 
contactRepository.save(contact90);
Contact contact91= new Contact (null,"Chelsea","Margaret","Walker","779-047-5815","c_m_walker@live.com","471-10-0931","Divorced","F","American Indian or Alaska Native","Master’s degree"); 
contactRepository.save(contact91);
Contact contact92= new Contact (null,"Grace","Louise","Nelson","516-414-4632","grace.l.nelson@aol.com","032-59-6616","Divorced","F","Native Hawaiian or Other Pacific Islander","Associate degree"); 
contactRepository.save(contact92);
Contact contact93= new Contact (null,"Sarah","Irene","Price","979-018-7527","s.i.price@rocketmail.com","500-07-9328","Married","F","Native Hawaiian or Other Pacific Islander","Master’s degree"); 
contactRepository.save(contact93);
Contact contact94= new Contact (null,"Lauren","Jean","Cox","907-762-1324","lauren@hotmail.com","974-42-3132","Divorced","F","White","Some college, no degree"); 
contactRepository.save(contact94);
Contact contact95= new Contact (null,"Katherine","Dawn","Ward","641-231-8830","katherinedawnward@gmail.com","305-39-4290","Single","F","Black or African American","Some college, no degree"); 
contactRepository.save(contact95);
Contact contact96= new Contact (null,"Thomas","Charles","Rivera","267-512-0719","thomas@yahoo.com","449-42-2211","Married","M","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact96);
Contact contact97= new Contact (null,"Amelia","Lou","Hill","620-772-2083","ahill10@yahoo.com","034-61-5744","Separated","F","Asian","Master’s degree"); 
contactRepository.save(contact97);
Contact contact98= new Contact (null,"Christopher","Francis","Jackson","309-022-2172","christopherfjackson@live.com","268-49-6428","Divorced","M","American Indian or Alaska Native","Master’s degree"); 
contactRepository.save(contact98);
Contact contact99= new Contact (null,"Courtney","Michelle","Perez","815-297-4941","courtney.michelle.perez@hotmail.com","763-63-5053","Widowed","F","White","Associate degree"); 
contactRepository.save(contact99);
Contact contact100= new Contact (null,"Courtney","Dawn","Martinez","914-300-3546","c_d_martinez@rocketmail.com","044-66-8118","Divorced","F","White","High school diploma or equivalent"); 
contactRepository.save(contact100);
Contact contact101= new Contact (null,"Nicholas","Charles","Diaz","628-899-3953","nicholascharlesdiaz@ymail.com","351-67-5366","Married","M","American Indian or Alaska Native","High school diploma or equivalent"); 
contactRepository.save(contact101);
Contact contact102= new Contact (null,"Charles","Anthony","Scott","832-150-0639","charlesascott@ymail.com","896-90-0281","Divorced","M","Native Hawaiian or Other Pacific Islander","Associate degree"); 
contactRepository.save(contact102);
Contact contact103= new Contact (null,"Austin","Michael","Jackson","352-308-1446","austin.jackson@yahoo.com","807-49-6419","Married","M","American Indian or Alaska Native","Bachelor’s degree"); 
contactRepository.save(contact103);
Contact contact104= new Contact (null,"Amanda","Mary","Washington","480-822-7789","amanda@aol.com","419-64-9742","Divorced","F","American Indian or Alaska Native","Master’s degree"); 
contactRepository.save(contact104);
Contact contact105= new Contact (null,"Samuel","Ray","Wood","651-542-8721","s.wood@rocketmail.com","227-49-6141","Married","M","Asian","Some college, no degree"); 
contactRepository.save(contact105);
Contact contact106= new Contact (null,"Austin","Henry","Perry","828-790-4632","austin_perry@rocketmail.com","769-15-3098","Widowed","M","Asian","High school diploma or equivalent"); 
contactRepository.save(contact106);
Contact contact107= new Contact (null,"Zachary","William","Diaz","835-488-2029","z.w@hotmail.com","255-76-0427","Divorced","M","Asian","Associate degree"); 
contactRepository.save(contact107);
Contact contact108= new Contact (null,"Jeremy","William","Morris","619-316-5204","jeremywmorris@rocketmail.com","558-28-5855","Divorced","M","White","High school diploma or equivalent"); 
contactRepository.save(contact108);
Contact contact109= new Contact (null,"Jonathan","Andrew","Cook","609-038-0778","j_a_cook@yahoo.com","527-77-2805","Single","M","Asian","Doctoral degree"); 
contactRepository.save(contact109);
Contact contact110= new Contact (null,"Melissa","Jean","Thomas","957-985-1375","melissa_j_thomas@hotmail.com","146-66-2500","Married","F","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact110);
Contact contact111= new Contact (null,"Austin","George","Bell","484-341-3153","ag@yahoo.com","043-20-6735","Single","M","American Indian or Alaska Native","Master’s degree"); 
contactRepository.save(contact111);
Contact contact112= new Contact (null,"Patrick","Matthew","Jackson","754-754-5561","p_jackson@rocketmail.com","632-39-6338","Divorced","M","Asian","Associate degree"); 
contactRepository.save(contact112);
Contact contact113= new Contact (null,"Samuel","George","Jackson","201-611-7262","s.jackson@outlook.com","172-03-3593","Divorced","M","Black or African American","Less than high school"); 
contactRepository.save(contact113);
Contact contact114= new Contact (null,"Melissa","Louise","Bennett","339-444-5198","melissalbennett@rocketmail.com","863-60-6768","Married","F","Native Hawaiian or Other Pacific Islander","Master’s degree"); 
contactRepository.save(contact114);
Contact contact115= new Contact (null,"Brittany","Faith","Richardson","585-415-3032","brittany_faith_richardson56@live.com","496-91-1814","Single","F","White","Master’s degree"); 
contactRepository.save(contact115);
Contact contact116= new Contact (null,"Jason","Richard","Baker","253-832-4531","jrbaker@aol.com","174-12-1792","Separated","M","White","Associate degree"); 
contactRepository.save(contact116);
Contact contact117= new Contact (null,"Katherine","Lynn","Edwards","501-530-6512","katherine_l_edwards70@gmail.com","051-29-5600","Divorced","F","Native Hawaiian or Other Pacific Islander","Master’s degree"); 
contactRepository.save(contact117);
Contact contact118= new Contact (null,"Maria","Grace","Clark","916-158-1521","mclark@ymail.com","595-80-1320","Divorced","F","White","High school diploma or equivalent"); 
contactRepository.save(contact118);
Contact contact119= new Contact (null,"Patrick","Thomas","Adams","351-861-6003","patrick.thomas.adams@yahoo.com","251-55-9986","Divorced","M","White","Bachelor’s degree"); 
contactRepository.save(contact119);
Contact contact120= new Contact (null,"Nicholas","Alexander","Sanchez","757-036-9131","nicholas.a.sanchez@yahoo.com","343-14-8071","Divorced","M","Native Hawaiian or Other Pacific Islander","Doctoral degree"); 
contactRepository.save(contact120);
Contact contact121= new Contact (null,"Olivia","Lou","Patterson","716-794-0280","oliviapatterson42@live.com","335-04-7416","Married","F","White","Master’s degree"); 
contactRepository.save(contact121);
Contact contact122= new Contact (null,"David","James","Turner","209-771-0558","dj5@hotmail.com","526-08-8145","Divorced","M","White","Master’s degree"); 
contactRepository.save(contact122);
Contact contact123= new Contact (null,"Owen","Joseph","Bailey","856-538-9306","owenj@rocketmail.com","246-26-7962","Single","M","White","Doctoral degree"); 
contactRepository.save(contact123);
Contact contact124= new Contact (null,"Jack","Michael","Sanchez","551-484-8178","j_m21@yahoo.com","067-90-1819","Married","M","Black or African American","Bachelor’s degree"); 
contactRepository.save(contact124);
Contact contact125= new Contact (null,"Grace","Ann","Jones","276-766-2239","grace.jones@hotmail.com","584-77-8431","Separated","F","White","Master’s degree"); 
contactRepository.save(contact125);
Contact contact126= new Contact (null,"Eric","Michael","Sanders","325-872-6935","eric.michael.sanders@ymail.com","244-71-8451","Married","M","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact126);
Contact contact127= new Contact (null,"Joshua","Robert","Lewis","234-009-4293","joshualewis75@ymail.com","193-69-7262","Divorced","M","Asian","Less than high school"); 
contactRepository.save(contact127);
Contact contact128= new Contact (null,"Aaron","Richard","Diaz","806-730-8798","a.r.diaz94@live.com","471-30-9181","Married","M","Asian","Master’s degree"); 
contactRepository.save(contact128);
Contact contact129= new Contact (null,"Dylan","John","Bennett","828-447-9949","dylan.bennett@yahoo.com","241-45-0647","Married","M","Black or African American","Doctoral degree"); 
contactRepository.save(contact129);
Contact contact130= new Contact (null,"Alexis","Mae","Williams","843-137-3684","a_m_williams@ymail.com","025-15-6686","Divorced","F","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact130);
Contact contact131= new Contact (null,"Ashley","Renee","Rodriguez","630-095-2817","ashley.r@rocketmail.com","916-11-4098","Married","F","Native Hawaiian or Other Pacific Islander","Some college, no degree"); 
contactRepository.save(contact131);
Contact contact132= new Contact (null,"Amber","Ruth","Cook","317-136-6937","amberruth@outlook.com","257-77-7343","Married","F","Native Hawaiian or Other Pacific Islander","Doctoral degree"); 
contactRepository.save(contact132);
Contact contact133= new Contact (null,"Aiden","James","Wright","757-268-6846","aiden_james_wright66@hotmail.com","288-30-7430","Married","M","Black or African American","Bachelor’s degree"); 
contactRepository.save(contact133);
Contact contact134= new Contact (null,"Isabella","Nicole","Hayes","607-020-7749","i.n.hayes@ymail.com","559-37-3221","Single","F","Native Hawaiian or Other Pacific Islander","High school diploma or equivalent"); 
contactRepository.save(contact134);
Contact contact135= new Contact (null,"Joseph","Alan","Jones","314-854-3175","joseph.a@rocketmail.com","954-82-5398","Divorced","M","White","Master’s degree"); 
contactRepository.save(contact135);
Contact contact136= new Contact (null,"Gabriel","Anthony","Perez","325-868-7602","gabriel.perez@yahoo.com","307-37-4341","Separated","M","White","Some college, no degree"); 
contactRepository.save(contact136);
Contact contact137= new Contact (null,"Brian","Alexander","Hughes","432-594-5865","brian_hughes@aol.com","346-37-9253","Single","M","White","Bachelor’s degree"); 
contactRepository.save(contact137);
Contact contact138= new Contact (null,"Lillian","Renee","White","234-114-8641","lrwhite@yahoo.com","202-08-9024","Divorced","F","Native Hawaiian or Other Pacific Islander","Master’s degree"); 
contactRepository.save(contact138);
Contact contact139= new Contact (null,"Aubrey","Dawn","Diaz","906-286-9766","aubrey_dawn_diaz79@gmail.com","229-71-6564","Married","F","White","High school diploma or equivalent"); 
contactRepository.save(contact139);
Contact contact140= new Contact (null,"Jack","Joseph","Turner","770-257-0658","jturner@rocketmail.com","997-37-2032","Single","M","White","Master’s degree"); 
contactRepository.save(contact140);
Contact contact141= new Contact (null,"Kaitlyn","Kay","Hernandez","513-205-4354","kaitlyn_hernandez@hotmail.com","344-95-2530","Divorced","F","Asian","Less than high school"); 
contactRepository.save(contact141);
Contact contact142= new Contact (null,"Sebastian","Joseph","Washington","321-132-8752","s.j@yahoo.com","118-36-7847","Married","M","Black or African American","Some college, no degree"); 
contactRepository.save(contact142);
Contact contact143= new Contact (null,"Kyle","John","Patterson","901-404-9877","k_patterson@live.com","643-33-5347","Separated","M","American Indian or Alaska Native","Associate degree"); 
contactRepository.save(contact143);
Contact contact144= new Contact (null,"John","Joseph","Hall","636-133-9100","john.hall@gmail.com","787-80-6102","Widowed","M","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact144);
Contact contact145= new Contact (null,"Audrey","Ann","Peterson","732-815-8974","audrey.a.peterson@gmail.com","912-62-4207","Divorced","F","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact145);
Contact contact146= new Contact (null,"Anna","Ruth","Simmons","470-793-2517","anna@aol.com","861-87-1477","Married","F","Native Hawaiian or Other Pacific Islander","Master’s degree"); 
contactRepository.save(contact146);
Contact contact147= new Contact (null,"Sarah","Louise","Long","575-949-2978","s_l_long73@ymail.com","673-20-1268","Divorced","F","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact147);
Contact contact148= new Contact (null,"Christina","May","Allen","434-049-8252","c.allen@rocketmail.com","518-96-9028","Married","F","Asian","Some college, no degree"); 
contactRepository.save(contact148);
Contact contact149= new Contact (null,"Olivia","Dawn","Bailey","573-046-9963","oliviadawnbailey@ymail.com","034-02-4762","Divorced","F","Native Hawaiian or Other Pacific Islander","Associate degree"); 
contactRepository.save(contact149);
Contact contact150= new Contact (null,"Mary","Grace","Perry","773-623-7453","mary_g_perry@gmail.com","104-08-8337","Divorced","F","White","Doctoral degree"); 
contactRepository.save(contact150);
Contact contact151= new Contact (null,"Rebecca","May","Thompson","225-536-1550","rmthompson22@aol.com","929-14-3067","Married","F","Native Hawaiian or Other Pacific Islander","Bachelor’s degree"); 
contactRepository.save(contact151);
Contact contact152= new Contact (null,"Patrick","Charles","Watson","984-770-7441","p_c_watson@outlook.com","525-50-6687","Single","M","Black or African American","Master’s degree"); 
contactRepository.save(contact152);
Contact contact153= new Contact (null,"Daniel","Francis","White","505-360-3920","daniel_white@rocketmail.com","262-22-6038","Married","M","Black or African American","Some college, no degree"); 
contactRepository.save(contact153);
Contact contact154= new Contact (null,"Hannah","Lee","Bennett","984-729-5533","h_l_bennett@rocketmail.com","196-74-9648","Single","F","Asian","Less than high school"); 
contactRepository.save(contact154);
Contact contact155= new Contact (null,"Alexander","Eugene","Griffin","714-688-1068","alexanderegriffin@live.com","154-73-3242","Divorced","M","Asian","Master’s degree"); 
contactRepository.save(contact155);
Contact contact156= new Contact (null,"Lauren","Dawn","Jenkins","501-401-7190","l.jenkins@gmail.com","144-66-7600","Divorced","F","American Indian or Alaska Native","Master’s degree"); 
contactRepository.save(contact156);
Contact contact157= new Contact (null,"Grace","Marie","Butler","586-946-1014","gracebutler@gmail.com","038-47-0473","Married","F","White","High school diploma or equivalent"); 
contactRepository.save(contact157);
	    }
}