BEGIN TRANSACTION;
DROP TABLE IF EXISTS Medicaments;
CREATE TABLE IF NOT EXISTS Medicaments (
	ID	INTEGER PRIMARY KEY AUTO_INCREMENT,  
	Medicament_Name_Comercial	TEXT,
	Compound	TEXT,
	Contraindications	TEXT,
	Side_And_Adverse_Reactions	TEXT,
	Restrictions_On_Use_During_Pregnancy_And_Lactation	TEXT,
	Drug_And_Other_Interactions	TEXT,
	Protection_Legends	TEXT,
	General_Precautions	TEXT,
	Precautions_Regarding_Carcinogenesis_Mutagenesis_Teratogenesis_And_Fertility_Effects	TEXT,
	Manifestations_And_Management_Of_Overdose_And_Accidental_Ingestion	TEXT
);
INSERT INTO Medicaments (ID,Medicament_Name_Comercial,Compound,Contraindications,Side_And_Adverse_Reactions,Restrictions_On_Use_During_Pregnancy_And_Lactation,Drug_And_Other_Interactions,Protection_Legends,General_Precautions,Precautions_Regarding_Carcinogenesis_Mutagenesis_Teratogenesis_And_Fertility_Effects,Manifestations_And_Management_Of_Overdose_And_Accidental_Ingestion) VALUES (1,'ACTRON','Ibuprofeno','• Hipersensibilidad conocida al ibuprofeno así como a cualquiera de los componentes de la fórmula.



• Antecedente de reacciones tipo alergia después de tomar ácido acetilsalicílico u otros agentes antiinflamatorios no esteroideos.



• Antecedente de sangrado gastrointestinal o perforación relacionada con terapia previa de AINEs.



• Úlcera péptica activa o antecedente de úlcera péptica recurrente o hemorragia (dos o más episodios distintos de ulceración o sangrado comprobados).



• Insuficiencia cardiaca severa.



• Insuficiencia hepática y/o renal severa.



• Último trimestre de embarazo (véase Restricciones de uso durante el embarazo y la lactancia).



• Cápsulas de ibuprofeno 600 mg en niños menores de 12 años.



• Ibuprofeno no está indicado para el dolor de origen gastrointestinal.



Suspensión está contraindicado en los siguientes casos:



• Hipersensibilidad conocida a ibuprofeno o cualquiera de los componentes de la formulación.



• Úlcera péptica activa.','Las reacciones adversas enumeradas a continuación se basan en reportes espontáneos, por lo que no resulta pertinente su organización de acuerdo con las categorías de frecuencia CIOMS III.



Trastornos hemolinfáticos: En casos aislados se han descrito anemia debida a hemorragia, leucopenia, trombocitopenia, pancitopenia y agranulocitosis.



Trastornos cardiacos y vasculares: Se han descrito edema, hipertensión e insuficiencia cardiaca asociados al tratamiento con AINEs.



Estudios clínicos y datos epidemiológicos revelan que la administración de ibuprofeno, sobre todo a dosis altas (2,400 mg al día) y en tratamientos prolongados, pueden asociarse a un ligero incremento en el riesgo de eventos trombóticos arteriales (por ejemplo infarto de miocardio o EVC) (véase Precauciones generales).



Trastornos otovestibulares: Acúfenos.



Trastornos oculares: Anomalías visuales.



Trastornos gastrointestinales: Se han descrito úlcera péptica, perforación y sangrado gastrointestinal, algunas de ellas mortales, sobre todo entre los adultos mayores. Se han reportado náuseas, vómito, diarrea, flatulencia, estreñimiento, dispepsia, dolor abdominal, melena, hematemesis, úlceras bucales, agudización de la colitis y de la enfermedad de Crohn posteriores a la administración de ibuprofeno (véase Precauciones generales) y con menor frecuencia, gastritis.



Trastornos generales: Fatiga.



Trastornos hepatobiliares: Alteraciones transitorias de la función hepática.



Trastornos inmunológicos: Reacción alérgica, reacción anafiláctica, choque anafiláctico (véase Precauciones generales). Se han descrito reacciones de hipersensibilidad con sus respectivas manifestaciones clínicas y de laboratorio, como el síndrome asmático o reacciones leves o moderadas que dañan potencialmente la piel, la vía respiratoria, el tracto gastrointestinal y el sistema cardiovascular incluyendo síntomas como rash, urticaria, edema, prurito, dificultad cardiorrespiratoria y, excepcionalmente, reacciones severas, incluyendo choque anafiláctico (véase Precauciones generales).



Trastornos del sistema nervioso/trastornos psiquiátricos: Se ha observado cefalea, mareo, insomnio, agitación, irritabilidad, estados de confusión y desorientación; de manera aislada se ha observado depresión y reacciones psicóticas. Rara vez se han descrito síntomas de meningitis aséptica, como rigidez de cuello, cefalea, náuseas, vómito, fiebre y/o desorientación, sobre todo entre pacientes con trastornos autoinmunes conocidos (lupus eritematoso sistémico, enfermedad mixta del tejido conjuntivo).



Trastornos renales y urinarios: El tratamiento con ibuprofeno se ha asociado a alteraciones de la función renal, insuficiencia renal aguda, síndrome nefrótico, nefritis intersticial y necrosis papilar renal.



Lesiones de la piel y del tejido subcutáneo: Alopecia, urticaria, rash, lesiones bulosas incluyendo el síndrome de Stevens-Johnson y necrólisis epidérmica tóxica (muy rara) (véase Precauciones generales).



Suspensión:



Sistema gastrointestinal: En general, los AINEs como ibuprofeno son bien tolerados por los niños. El perfil de efectos adversos es diferente al de los adultos, presentando menor toxicidad gastrointestinal y renal. Los efectos adversos de ibuprofeno a las dosis antipiréticas utilizadas en niños son poco frecuentes, leves y principalmente a nivel gastrointestinal como diarrea, vómito, dolor abdominal, dispepsia, náuseas y enfermedad ácido péptica. En casos excepcionales, la enfermedad ácido péptica puede producir anemia por sangrado. El uso indiscriminado y sin la valoración y seguimiento del médico puede causar daño hepático.



Sistema nervioso central: Cefalea, vértigo, tinnitus, insomnio, somnolencia, agitación, irritabilidad.



En casos aislados se puede presentar depresión, reacciones psicóticas o meningitis aséptica que cursa con rigidez de nuca, cefalea, náuseas, vómito, fiebre y desorientación; en particular en pacientes con antecedentes de trastornos autoinmunes (lupus eritematoso sistémico o enfermedad mixta del tejido conectivo).



Sistema hematopoyético y linfático: En casos raros se pueden observar anemia, leucopenia, trombocitopenia, pancitopenia o agranulocitosis.



Piel y anexos: Reacciones severas de la piel como eritema multiforme, alopecia, reacciones de hipersensibilidad (erupción cutánea, prurito incluso facial, angioedema, disnea, asma, taquicardia, hipotensión y estado de choque).



Órganos de los sentidos: Visión borrosa, ambliopía y escotomas.



Sistema renal/genitourinario: Puede aumentar la concentración de urea sérica, así como edema, insuficiencia renal, síndrome nefrótico, nefritis intersticial, necrosis papilar y poliuria.



Toxicidad aguda: Ibuprofeno cuenta con un amplio margen de seguridad ya que no se han observado síntomas graves de intoxicación en humanos aun con dosis superiores a 40 g.



Toxicidad crónica: La toxicidad subcrónica y crónica de ibuprofeno se ha manifestado en varias especies animales, principalmente en forma de lesiones y úlceras en el tracto gastrointestinal.



La acción ulcerogénica se desarrolló con una dosis de 300 mg/kg en ratones,180 mg/kg en ratas y con una dosis baja de 8 mg/kg en perros.','No se aconseja el uso de ibuprofeno durante el embarazo. El tratamiento puede repercutir negativamente sobre el embarazo, el desarrollo embrionario y fetal, o ambos. Los estudios con animales y humanos indican un incremento en el riesgo de aborto, malformación cardiaca y gastrosquisis tras el uso de ibuprofeno.



Se sabe que la administración de un inhibidor de la síntesis de prostaglandinas aumenta las pérdidas previas y posteriores a la implantación y la letalidad embriofetal entre los animales. Además, se ha descrito un incremento en la incidencia de diversas malformaciones, incluidas las cardiovasculares, entre los animales tratados con un inhibidor de la síntesis de prostaglandinas durante el periodo organogenético. Ibuprofeno no debe administrarse durante el primer y segundo trimestre de embarazo, salvo que resulte estrictamente necesario.



Si se decide administrar ibuprofeno en mujeres que estén intentando quedar embarazadas o si se decide administrarlo a mujeres que se encuentren en el primer y segundo trimestre de embarazo, se deberá utilizar ibuprofeno en la menor dosis posible y durante el menor periodo de tiempo.



Ibuprofeno está contraindicado en el último trimestre del embarazo, puede inhibir las contracciones uterinas y retrasar o prolongar la labor de parto, además de prolongar el tiempo de sangrado debido a su efecto antiagregante plaquetario. la administración de ibuprofeno en las últimas fases del embarazo puede ocasionar un cierre prematuro del conducto arterioso e hipertensión pulmonar o puede ocasionar una disfunción renal fetal, que podría evolucionar hacia insuficiencia renal con oligohidramnios.



Lactancia: Ibuprofeno puede pasar en pequeñas cantidades a la leche materna pero el riesgo de afectar al lactante es poco probable a dosis terapéuticas.



En caso de que se indique un tratamiento prolongado o si se indicaran dosis más elevadas, se deberá considerar la interrupción de la lactancia.



Suspensión: No aplica.

','Litio: La administración simultánea de y productos que contienen litio pueden incrementar la concentración sérica del litio.



Otros antiinflamatorios no esteroideos (AINEs): La administración simultánea de con otros AINEs puede incrementar el riesgo de úlcera péptica y sangrado gastrointestinal.



Anticoagulantes, por ejemplo cumarina, heparina: La administración simultánea y anticoagulantes incrementa el riesgo de sangrado por inhibición de la función plaquetaria.



Los AINEs pueden potenciar el efecto de los anticoagulantes como la warfarina (véase Precauciones generales).



Ciclosporina: Puede aumentar la nefrotoxicidad de ciclosporina.



Metotrexate: La coadministración de con metotrexate puede elevar la concentración sérica de éste e incrementar la toxicidad de esta sustancia.



Diuréticos y antihipertensivos, por ejemplo inhibidores de la Enzima Convertidora de la Angiotensina (ECA): Puede disminuir el efecto antihipertensivo.



Diuréticos ahorradores de potasio: La administración conjunta de con diuréticos ahorradores de potasio puede provocar hipercalemia.



Glucocorticoide sistémico y alcohol: Puede aumentar el riesgo de daño a la mucosa gastrointestinal y causar sangrado prolongado debido a los efectos aditivos.



Ácido acetilsalicílico:



Ibuprofeno interfiere con el efecto de la inhibición de la agregación plaquetaria del ácido acetilsalicílico si se toma antes o hasta dos horas después de este.

','Su venta requiere receta médica. No se deje al alcance

de los niños. No se use en el embarazo ni la lactancia.

No debe usarse después de su fecha de caducidad.



Suspensión:



Contiene aspartame.



Cápsulas:



Hecho en Argentina por:



Catalent Argentina S.A.I.C.



Av. Márquez 691, Loma Hermosa

Buenos Aires



Suspensión:



Hecho en El Salvador por:



Bayer, S. A.



Carretera Panamericana Km. 11

Ilopango, San Salvador, El Salvador



Acondicionado y distribuido por:



BAYER DE MÉXICO, S. A. de C. V.



Miguel de Cervantes Saavedra Núm. 259



Col. Granada, 11520 México, D. F.



Regs. Núms. 124M2004 y 280M2009, SSA IV

','Cápsulas:



• Ibuprofeno puede interferir con el efecto antiagregante plaquetario del ácido acetilsalicílico (véase Interacciones medicamentosas y de otro género). El paciente deberá informar al médico si se encuentra bajo un régimen terapéutico con ácido acetilsalicílico y toma ibuprofeno para el dolor.



• Se debe evitar el uso concomitante de ibuprofeno con otros AINEs incluyendo inhibidores selectivos de la ciclooxigenasa-2 (véase Interacciones medicamentosas y de otro género).



• Las reacciones secundarias se pueden minimizar utilizando la dosis efectiva durante el periodo más breve que se precise para controlar los síntomas (véase Dosis y vía de administración).



• Lupus eritematoso sistémico o enfermedad mixta del tejido conjuntivo.



• Insuficiencia hepática reciente o antecedente de la misma.



• Nefropatía reciente o antecedente de la misma.



Precauciones para pacientes geriátricos: Los pacientes geriátricos presentan con mayor frecuencia reacciones adversas a los AINEs especialmente sangrado gastrointestinal y perforación lo cual puede ser mortal.



Sangrado, ulceración y perforación gastrointestinales: Sangrado, ulceración o perforación gastrointestinal han sido reportados con todos los AINEs en cualquier momento durante el tratamiento, con o sin síntomas de advertencia o antecedentes previos de eventos gastrointestinales serios, los cuales pueden ser mortales.



El riesgo de sangrado gastrointestinal, ulceración o perforación es mayor con dosis incrementadas de AINEs, en pacientes con antecedente de úlcera péptica especialmente si se complicó con hemorragia o perforación (véase Contraindicaciones) y en pacientes geriátricos. Estos pacientes deben comenzar el tratamiento con la dosis más baja posible. Se debe considerar una terapia combinada con agentes protectores (por ejemplo misoprostol o inhibidores de la bomba de protones) para estos pacientes y también para pacientes que requieran de manera concomitante dosis bajas de ácido acetilsalicílico o de otros fármacos que de manera probable puedan incrementar el riesgo gastrointestinal (véase Interacciones medicamentosas y de otro género).



Pacientes con antecedente de toxicidad gastrointestinal, particularmente en pacientes geriátricos, deben reportar cualquier síntoma abdominal inusual (especialmente sangrado gastrointestinal) particularmente en las primeras etapas del tratamiento.



Se debe advertir precaución en los pacientes recibiendo medicamentos concomitantes los cuales pueden incrementar el riesgo de ulceración o sangrado, como corticoesteroides orales, anticoagulantes como warfarina, inhibidores selectivos de la recaptura de serotonina o agentes con efecto antiagregante plaquetario como el ácido acetilsalicílico (véase Interacciones medicamentosas y de otro género).



En caso que un paciente tratado con ibuprofeno experimente sangrado gastrointestinal o ulceración, el tratamiento deberá ser suspendido.



Los AINEs deben ser administrados con cautela a pacientes con antecedente de enfermedad gastrointestinal (colitis ulcerosa, enfermedad de Crohn) ya que su condición puede verse exacerbada (véase Reacciones adversas).



Retención de sodio y líquido en trastornos cardiovasculares y edema periférico: Se aconseja prudencia antes de comenzar el tratamiento en pacientes con antecedente de hipertensión y/o insuficiencia cardiaca ya que se ha reportado retención de líquido, hipertensión y edema asociados al tratamiento con AINEs (véase Reacciones adversas).



Efectos cardiovasculares y cerebrovasculares: Estudios clínicos y datos epidemiológicos sugieren que el uso de ibuprofeno, particularmente a dosis altas (2,400 mg diariamente) y en tratamientos prolongados puede asociarse a un ligero incremento en el riesgo de eventos trombóticos arteriales (por ejemplo infarto de miocardio o EVC). En conjunto los estudios epidemiológicos no indican que ibuprofeno a dosis bajas (por ejemplo £ 1,200 mg al día) esté asociado con un mayor riesgo de infarto del miocardio (véase Reacciones secundarias y adversas).



Reacciones cutáneas: Muy rara vez, se han reportado reacciones cutáneas graves asociadas al tratamiento con AINEs, algunas de ellas mortales, incluyendo dermatitis exfoliativa, síndrome de Stevens-Johnson y necrólisis epidérmica tóxica (véase Reacciones secundarias y adversas). Al parecer, el riesgo máximo de este tipo de reacciones se da en las fases tempranas del tratamiento. Ibuprofeno debe suspenderse ante el menor signo de rash cutáneo, lesiones de la mucosa o cualquier otra manifestación de hipersensibilidad (véase Reacciones secundarias y adversas).



Reacciones anafilácticas (anafilactoides): Ibuprofeno puede acelerar el broncoespasmo e inducir crisis asmáticas u otras reacciones de hipersensibilidad. Los factores de riesgo comprenden la presencia de asma bronquial, fiebre del heno, pólipos nasales o enfermedad respiratoria crónica. Lo mismo cabe decir de los pacientes que presentan reacciones alérgicas (por ejemplo, reacciones cutáneas, prurito, urticaria) a ibuprofeno o a otros AINEs.



Precauciones relacionadas con la fertilidad: Existe evidencia de que los fármacos que inhiben la síntesis de ciclooxigenasa/prostaglandinas pueden causar impedimento en la fertilidad femenina a través de un efecto sobre la ovulación, mismo que se revierte al suspender el tratamiento.



Suspensión: Se deberá tener especial precaución en los siguientes casos:



- Lupus eritematoso sistémico (LES) o enfermedad mixta del tejido conectivo.



- Antecedente de enfermedad ácidopeptica activa o enfermedad inflamatoria intestinal (colitis ulcerosa, enfermedad de Crohn).



- Hipertensión arterial y/o insuficiencia cardiaca.



- Enfermedad renal, (creatinina sérica mayor de 8 mg/dl, o depuración renal de creatinina menor de 15 ml/min).



- Insuficiencia hepática severa (Child-Pugh C).



- Hipersensibilidad a antiinflamatorios o antirreumáticos.



- Asma bronquial, fiebre de heno, pólipos nasales o enfermedad respiratoria crónica, debido a que ibuprofeno puede provocar broncoespasmo e inducir crisis de asma u otras reacciones de hipersensibilidad. Esto también aplica a pacientes con reacciones alérgicas (erupción cutánea, prurito, urticaria) a otras sustancias.



ACTRON® Suspensión contiene aspartame y otros azúcares (sorbitol).



Contiene 37.7% de sorbitol. Cada 5 ml de suspensión infantil contiene 1.88 mg de sorbitol. El sorbitol constituyente de la fórmula puede ocasionar diarrea en personas hipersensibles.



ACTRON® no altera la capacidad para conducir o manejar máquinas.

','Toxicidad aguda: Estudios de toxicidad aguda realizados en animales no han mostrado una sensibilidad inusual.

Toxicidad crónica: La toxicidad subcrónica y crónica de ibuprofeno se ha manifestado en varias especies animales principalmente en forma de lesiones y úlceras en el tracto gastrointestinal.

La acción ulcerogénica se desarrolló primero con una dosis de 300 mg/kg en ratones, 180 mg/kg en ratas y con 8 mg/kg
en perros.

Potencial carcinogénico: Estudios in vitro (bacterias, linfocitos humanos) e in vivo no demostraron evidencias de una acción mutagénica de ibuprofeno.

Estudios en ratas y ratones no mostraron evidencia carcinogénica de ibuprofeno.

Toxicidad reproductiva:

Estudios experimentales en dos especies de animales demostraron que ibuprofeno atraviesa la barrera placentaria pero no evidenciaron efectos teratogénicos.','Sintomatología: Los síntomas de sobredosis pueden incluir trastornos del sistema nervioso central como cefalea, vértigo, confusión, pérdida del estado de alerta, dolor abdominal, náuseas, vómito, hipotensión, depresión respiratoria y cianosis.



Sobredosis leve: La mayoría de los pacientes se muestran asintomáticos. Los efectos leves se caracterizan por dolor abdominal, náuseas, vómito, letargia, somnolencia, cefalea, acúfenos y ataxia.



Sobredosis grave: Rara vez pueden aparecer apnea (sobre todo entre los niños más pequeños), síndrome de dificultad respiratoria del adulto, acidosis metabólica, coma, convulsiones, insuficiencia renal aguda, rabdomiólisis, hipotensión e hipotermia. Los efectos graves son más comunes tras la ingestión de una cantidad superior a 400 mg/kg.



Manejo en caso de emergencia: No existe un antídoto específico. La sobredosis o intoxicación deben ser tratadas sintomáticamente.

'),
 (2,'CARBAGER-PLUS','IBUPROFENO METOCARBAMOL ','Hipersensibilidad a cualquiera de los componentes de la fórmula, en pacientes con hipertensión arterial severa, con antecedentes de asma, urticaria o rinitis provocada por cualquier medicamento antiinflamatorio no esteroideo. Insuficiencia cardiaca, renal o hepática.

','Las reacciones adversas más frecuentes de metocarbamol son mareo o aturdimiento y náuseas. Éstas se presentan en aproximadamente de 4 a 5% de los pacientes. Otras reacciones menos frecuentes son somnolencia, visión borrosa, cefalea, fiebre, manifestaciones alérgicas como urticaria, conjuntivitis con congestión nasal, prurito y erupciones cutáneas.



Las reacciones reportadas con mayor frecuencia con respecto al ibuprofeno son: trastornos gastrointestinales, náuseas, dolor epigástrico, vómitos, anorexia, diarrea, constipación.



Ocasionalmente se han reportado, cefalea, prurito, urticaria, hipotensión, taquicardia, hematuria, disminución de la función renal, en casos aislados ha sido reportada ambliopía tóxica, retención de líquidos y edema.



','No se administre el producto en mujeres embarazadas ni durante el periodo de lactancia.

','El metocarbamol debe emplearse con precaución en pacientes que estén recibiendo agentes anticolinesterásicos, no se debe administrar junto con otros medicamentos depresores del SNC.



No debe administrarse paracetamol, ácido acetilsalicílico, fenilbutazona o indometacina concomitantemente con ibuprofeno; debe prestarse especial atención a pacientes con terapia con anticoagulantes (warfarina) o agentes trombolíticos (estreptoquinasa).



El ibuprofeno puede incrementar los niveles plasmáticos de digoxina, fenitoína o litio. Puede reducir los efectos de los diuréticos y los antihipertensivos.

','No se deje al alcance de los niños. Su venta requiere receta médica. No se use durante el embarazo, ni en la lactancia, ni a menores de 12 años.

STREGER, S. A.

Reg. Núm. 560M95, SSA IV

CEAR-03361202198/RM2004','Debe evitarse el uso de alcohol y otros depresores del SNC ya que el metocarbamol tiene un efecto depresor sobre éste.



Se debe advertir al paciente que puede experimentar mareos o somnolencia y que en estos casos no deben conducir vehículos automotores o maquinaria peligrosa, ni realizar actividades peligrosas que requieran estar alerta.



Los pacientes con asma, pólipos nasales o infecciones crónicas del tracto respiratorio pueden presentar reacciones de hipersensibilidad al ibuprofeno (intolerancia analgésica/asma inducido por analgésicos).





','No se han reportado a la fecha.','Es improbable que haya toxicidad atribuible a la sobredosificación de metocarbamol, la información disponible acerca de sobredosificación reporta somnolencia.



Si la ingesta de metocarbamol es reciente, el lavado de estómago o el vómito inducido puede reducir la absorción del mismo.



En el caso de ibuprofeno no existen antídotos específicos para casos de sobredosificación, las manifestaciones clínicas de una sobredosis puede presentarse con vómito, náuseas, dolor abdominal, cefalea, apnea, cianosis.



Su tratamiento se efectúa con lavado gástrico, la administración de carbón activado también reduce la absorción del ibuprofeno. Deberán aplicarse medidas generales de sostén.

'),
 (3,'A.F. VALDECASAS','ÁCIDO FÓLICO','Hipersensibilidad a los componentes de la fórmula. No se emplee en anemias perniciosas o megaloblásticas producidas por deficiencia de vitamina B12.','Principalmente a dosis superiores a las indicadas (por ejemplo, 20 mg al día) puede producir: a) alteraciones del sueño, excitabilidad e irritabilidad, las cuales normalmente desaparecen al interrumpir el tratamiento, b) efectos gastrointestinales: náusea, distensión abdominal, mal sabor de boca, c) reacciones de tipo alérgico (eritema, prurito, urticaria), d) disminución del efecto del zinc.

Antagonistas del ácido fólico: Metotrexato, pirimetamina, triamtereno, compuestos de diamicina, trimetoprim, anticonvulsivantes (con posible aumento de convulsiones) cortisona y cloranfenicol.','Ninguno a las dosis indicadas, sin embargo es prudente que su empleo sea supervisado por un médico.
','Disminuyen la absorción del ácido fólico: La fenitoína, sulfasalazina, primidona, nicloserina y anticonceptivos orales.

Barbitúricos: Dificultan la utilización del ácido fólico.

Metformina y metotrexato: Interfieren en el aprovechamiento del ácido fólico.

Enzimas pancréaticas: Pacientes que ingieren pancreatina, requieren suplementación de ácido fólico.','Literatura exclusiva para médicos. No se deje al alcance de los niños.

Hecho en México por:

LABORATORIOS VALDECASAS, S.A.

Reg. Núm. 045V2000, SSA VI

CAS/1/OR/PA01/0120/2009',' El ácido fólico puede enmascarar deficiencias de vitamina B12. En estos casos, aunque raramente, puede ocurrir remisión hematológica mientras el padecimiento neurológico sigue progresando.

En una persona con buenas reservas, si la vitamina B12 se dejara de absorber de repente (por ejemplo, gastrectomía total) se necesitarían de 2 a 4 años para que se manifestara la deficiencia.

El ácido fólico se destruye a un pH inferior a 4.
','No se han reportado datos comprobados de los efectos sobre ninguno de los puntos anteriores ni sobre la función sexual.',' Por vía oral no se conocen efectos tóxicos. Rarísimamente se pueden presentar eritema, prurito, ictisemia, irritabilidad, excitabilidad, náusea, edema y flatulencia.
'),
 (4,'INTRAFER F-800



','HIERRO VITAMINA B12 (COBALAMINA, CIANOCOBALAMINA, HIDROXOCOBALAMINA) ÁCIDO FÓLICO','Está contraindicado en pacientes con anemia perniciosa, también está contraindicado en hipersensibilidad a los componentes de la fórmula, gastritis y úlcera péptica. La administración del ácido fólico sólo es una medida terapéutica inadecuada en el tratamiento de la anemia perniciosa y otras anemias megaloblásticas donde hay deficiencia de vitamina B12.

INTRAFER® F-800 está contraindicado en casos de anemia perniciosa, en casos raros de hipersensibilidad al ácido fólico y en casos de hipersensibilidad al hierro. Administrar con sumo cuidado o no emplearse junto con hierro parenteral, en úlcera gastroduodenal, carcinoma del estómago y colitis ulcerosa, hemosiderosis y hemocromatosis.

El ácido fólico solo es una terapia inapropiada para el tratamiento de anemia perniciosa, pudiendo ocurrir una remisión de las manifestaciones hematológicas, mientras que las manifestaciones neurológicas pueden progresar.

Una ingesta masiva de este producto puede resultar en intoxicación peligrosa, por lo que debe mantenerse fuera del alcance de los niños.','La probabilidad de intolerancia gástrica al hierro en el vehículo de liberación controlada es remota.

Si esto llegara a ocurrir, la cápsula deberá ser tomada después de los alimentos. Se ha reportado la sensibilización alérgica después de la administración oral.

Las dosis terapéuticas de hierro pueden causar malestar gastrointestinal, constipación, diarrea y vómito. Sin embargo, estudios con hierro aminoquelado han demostrado que la frecuencia e intensidad de estos efectos secundarios es menor con este complejo que con otras sales de hierro, tales como el sulfato o fumarato ferroso. No se han encontrado efectos secundarios con el ácido fólico.',' Los estudios en mujeres embarazadas no han demostrado que se aumente el riesgo de anormalidades fetales cuando se administra durante el embarazo. Si INTRAFER® F-800 se usa durante el embarazo es remoto que aparezca la posibilidad de daño fetal. Como los estudios no pueden descartar la posibilidad de daño, se debe usar en el embarazo sólo si está claramente indicado. El ácido fólico se excreta en la leche materna.

Cuando existe anemia, su naturaleza debe ser establecida. El ácido fólico, especialmente en dosis arriba de 0.1 mg al día, puede oscurecer una anemia perniciosa, pudiendo ocurrir una remisión de las manifestaciones hematológicas, mientras que las manifestaciones neurológicas pueden progresar.

Una ingesta masiva de este producto puede resultar en intoxicación peligrosa, por lo que debe mantenerse fuera del alcance de los niños.

No debe administrarse conjuntamente con tiroxina y metildopa, ya que el hierro disminuye la absorción de éstos.

Cantidades elevadas de ácido fólico pueden contrarrestar el efecto de antiepilépticos del fenobarbital y primidona y aumentar la frecuencia de convulsiones en los niños susceptibles.
','La absorción de hierro por trisilicato de magnesio y por los antiácidos que contienen carbonatos. El hierro puede interferir con la absorción de tetraciclinas, penicilinas, quinolonas, cloranfenicol, cimetidina y quinolona (ciprofloxacinas, norfloxacinas, ofloxacinas). Los efectos antiparkinsonianos de la levodopa pueden ser revertidos con piridoxina. La absorción de hierro puede ser inhibida con la ingesta de huevos y leche.
','"No se deje al alcance de los niños. Literatura exclusiva para médicos.

Hecho en México por:

UNIPHARM DE MÉXICO, S. A. de C. V.

Tamarindos XV-A Lote 10
Col. Cd. Industrial Bruno Pagliai
91697 Veracruz, Ver.

Reg. Núm. 009V/99, SSA IV

FVAR-21899/R99"
',' No hay datos reportados.
','"No hay datos reportados.
"
','"Los signos de intoxicación grave se retrasan en su aparición debido a su forma farmacéutica de liberación controlada.

En la intoxicación aguda por hierro se presenta aumento de la permeabilidad capilar, reducción de volumen plasmático, puede ocurrir colapso cardiaco repentino.

Manejo: Lavado gástrico y/o administración de una solución hemética. Puede hacerse estudio radiológico para determinar la posición y cantidad de cápsulas en el tracto gastrointestinal.

Dosis grandes de sales de hierro pueden tener efectos corrosivos e irritantes sobre la mucosa gastrointestinal y puede ocurrir necrosis y perforación. Los síntomas incluyen dolor epigástrico, diarrea y vómito. Puede seguir de fallo circulatorio si la hemorragia y la diarrea son severas. Horas o días después puede ocurrir acidosis metabólica, convulsiones y coma.

Si el paciente sobrevive, pueden desarrollarse síntomas de necrosis hepática aguda y conducir a la muerte debido a coma hepático.

El tratamiento por intoxicación aguda consiste en la administración de eméticos, lavado gástrico, administración de drogas antidiarreicas y, principalmente, administración de deferoxamina por sonda gástrica y por vía intravenosa. Si existe shock se efectuará transfusión sanguínea y administración de líquidos y electrólitos
"
'),
 (5,'CAPSICOF','BENZONATATO
','Hipersensibilidad a los componentes de la fórmula.

No se administre simultáneamente con anestésicos locales del tipo de la procaína (vía oral).','Se han reportado casos de erupción cutánea, molestias intestinales leves, sedación, dolor de cabeza y mareo, alucinaciones, confusión mental.
','No se administre durante el embarazo y la lactancia. Aunque no se dispone de datos sobre los efectos teratogénicos obtenidos en experimentos con animales ni de las experiencias terapéuticas recogidas durante muchos años; se tienen indicios de que tiene una influencia nociva sobre el desarrollo embrionario y/o fetal.
','No se disponen de datos al respecto, pero puede potenciar los efectos de anestésicos locales.','Literatura exclusiva para médicos. No se deje al alcance de los niños. Contiene colorante rojo núm. 6 que puede producir reacciones alérgicas.

GELCAPS EXPORTADORA DE MÉXICO, S. A. de C. V.

Calle 7 Núm. 6 Fracc. Ind. Alce Blanco
53370 Naucalpan, Estado de México

Reg. Núm. 433M89, SSA VI

HEAR-03361201058/6RM2003
',' Las perlas se tragan enteras, no deberán triturarse ni masticarse, de lo contrario se produce insensibilidad en la boca y en la garganta. No se use en menores de 10 años.','Aunque no se dispone de datos sobre los efectos teratogénicos obtenidos en experimentos en animales ni de las experiencias terapéuticas recogidas por muchos años, se tienen indicios de que tiene una influencia nociva sobre el desarrollo embrionario y fetal.
','Es limitada la información disponible acerca de la sobredosificación con benzonatato.

Por ello no está bien definida la sintomatología específica en caso de sobredosis. Se han comunicado los síntomas siguientes: anestesia bucofaríngea (cuando las perlas se mastican o disuelven en la boca), vértigos, náuseas, ""sensación de embriaguez"", depresión del SNC, shock y fallo respiratorio.

Tratamiento: Debido a la experiencia limitada, no se conocen medidas específicas. No existe un antídoto. Las medidas generales consisten en lavado gástrico y aplicación de carbón activado. Dado que están deprimidos los reflejos de la tos y las náuseas, se prestará atención especial a la protección contra la aspiración del contenido gástrico de materias administradas oralmente. Se recomienda un tratamiento sintomático y vigilar estrechamente las funciones vitales del paciente.
'),
 (6,'CELLTIUS','AMBROXOL BENZONATATO','Hipersensibilidad a los componentes de la fórmula, pacientes con úlcera péptica activa, gastritis, primer trimestre de embarazo, durante la lactancia y niños menores de 12 años.
','Ocasionalmente se han reportado erupciones cutáneas, efectos secundarios gastrointestinales leves como náuseas, diarrea, vómito, cefalea y dolores abdominales.','Aunque no se ha demostrado acción teratógena (siguiendo las reglas internacionales), no se recomienda su uso durante el primer trimestre del embarazo ni en la lactancia, sólo valorando riesgo-beneficio.','Puede ser administrado con fármacos y antibióticos de uso rutinario, siempre y cuando éstos no sean de naturaleza alcalina. El uso frecuente puede potenciar los efectos de medicamentos depresores del sistema nervioso central.','Literatura exclusiva para médicos. No se deje al alcance de los niños. No se use en el embarazo y la lactancia ni en niños menores de 12 años.

Hecho en México por:

Gelpharma, S. A. de C. V.

Av. Paseo del Pacífico Núm. 380
Guadalajara Technology Park
45010 Zapopan, Jalisco, México

Distribuido por:

MORE PHARMA CORPORATION, S. de R. L. de C. V.

Av. Ejército Nacional Núm. 926, Int. 203
Col. Los Morales, Sección Palmas
11540, Deleg. Miguel Hidalgo, México, D. F.
Reg. Núm. 416M2005, SSA VI
',' Debe administrarse con precaución a pacientes con úlcera gastroduodenal. Interrumpir inmediatamente en caso de aparición de reacciones de hipersensibilidad. En caso de insuficiencia renal severa puede existir una acumulación de metabolitos hepáticos.

Considerar una disminución de la dosis o un aumento del intervalo interdosis. Este producto contiene el colorante azul núm. 1 que puede producir reacciones alérgicas.

Las cápsulas de ambroxol y benzonatato deben tragarse enteras, no deben triturarse ni masticarse, pues de lo contrario se produce una insensibilidad en la cavidad bucofaríngea.','Aunque no se dispone de datos sobre los efectos teratogénicos obtenidos en experimentos con animales ni de las experiencias terapéuticas recogidas durante años, se tienen indicios de que tiene una influencia nociva sobre el desarrollo embrionario y/o fetal, por lo que no se recomienda su uso durante el embarazo.
','Dada su escasa toxicidad, no se han reportado casos de intoxicación. En caso de ingesta masiva se recomienda lavado y aspiración gástrica y en caso de alguna manifestación el tratamiento debe ser sintomático.
'),
 (7,'BRUNACOL','KETOROLACO',' Úlcera péptica, perforación o sangrado gastrointestinal. Ketorolaco trometamina no debe usarse en pacientes que hayan exhibido cualquier manifestación de alergias al mismo. Síndrome de pólipos nasales, angioedema y asma.



No administrar en niños en el posoperatorio de amigdalectomía. No se recomienda como medicación preoperatoria debido a la inhibición de la agregación plaquetaria.



No se recomienda en analgesia obstétrica.','Gastrointestinales: Úlcera péptica, sangrado gastrointestinal, sangrado rectal, melona, náuseas, dispepsia, dolor gastrointestinal, diarrea, constipación, flatulencia, disfunción hepática, vómito, gastritis y eructos.



Cuerpo en general: Edema, astenia, mialgia y aumento de peso.



Cardiovascular: Rubor, palidez e hipertensión.



Sistema nervioso central: Somnolencia, mareo, cefalea, sudación, boca seca, nerviosismo, depresión, insomnio y vértigo.



Respiratorio: Disnea y asma.



Urogenitales: Incremento en la frecuencia urinaria, oliguria y hematuria.','No se recomienda ketorolaco trometamina durante el embarazo o el parto. Tampoco se recomienda durante la lactancia.

','Ketorolaco tiene un alto grado de fijación a las proteínas plasmáticas humanas (media 99.2%) y la fijación es independiente de la concentración.

El probenecid reduce la depuración de ketorolaco lo cual aumenta la concentración plasmática (triplica el área bajo la curva), así como la vida media (aproximadamente el doble). Ketorolaco reduce la respuesta diurética a la furosemida en aproximadamente 20%.

Metotrexato: Reduce el aclaramiento del metotrexato y posiblemente aumente su toxicidad.

Inhibidores de la ECA: La administración concomitante de ketorolaco e inhibidores, aumenta el daño renal, par-ticularmente en pacientes depletados de volumen.','No se deje al alcance de los niños. Su venta requiere receta médica. No se administre durante el embarazo ni en la lactancia.

IMPORTADORA Y MANUFACTURERA
BRULUART, S. A.

Reg. Núm. 111M2000, SSA IV

DEAR-310251/R2000','','No existen reportes de ketorolaco asociado con tumorogenicidad ni mutagenicidad y no demostró potencial teratogénico','Se ha administrado 200 mg por vía oral a voluntarios sin efectos adversos aparentes. Se ha reportado acidosis metabólica después de la sobredosificación intencional. La diálisis no depura significativamente al ketorolaco'),
 (8,'MAVIDOL TR','TRAMADOL KETOROLACO ','MAVIDOL TR* está contraindicado en pacientes con hipersensibilidad a los componentes de la fórmula, en pacientes con úlcera gastroduodenal activa, hemorragia digestiva reciente, en intoxicación con alcohol, somníferos y psicotrópicos, con insuficiencia renal moderada o grave (creatinina sérica > 442 µmol/L), embarazo, lactancia.

','Cuerpo en general: Edema, astenia, mialgia y aumento de peso.','No se recomienda el uso de MAVIDOL TR* durante el embarazo y la lactancia.',' Los pacientes en tratamiento con carbamazepina pueden tener una reducción significativa del efecto analgésico de MAVIDOL TR*.



La administración concomitante de quinidina y MAVIDOL TR* resulta en concentraciones incrementadas de MAVIDOL TR* y reducidas del principal metabolito de tramadol, se desconocen las consecuencias clínicas de estos hallazgos.



La administración concomitante con inhibidores de la CYP2D6 como fluoxetina, paroxetina y amitriptilina puede resultar en cierta inhibición del metabolismo de MAVIDOL TR*. No se presentan cambios en la farmacocinética de ketorolaco/tramadol con la administración concurrente de cimetidina.



Ha habido algunos reportes de toxicidad por digoxina y alteración del efecto de la warfarina, incluyendo elevación del tiempo de protrombina.



La administración concurrente de ketorolaco/tramadol con metotrexato potencializa su toxicidad. Al usarse simultáneamente con otros medicamentos de acción central (tranquilizantes, somníferos) es posible un incremento del efecto depresor de inhibidores de la MAO.



Se debe tener especial precaución en aquellos pacientes que estén bajo algún tratamiento que afecta la hemostasia.



','Léase instructivo impreso en el interior de la caja o instructivo anexo. No se deje al alcance de los niños. No se use en el embarazo ni la lactancia. Evite manejar vehículos u operar maquinaria mientras esté tomando este medicamento, debido a la somnolencia que puede provocar. No se use en personas con antecedentes de crisis convulsivas. No exceda la dosis recomendada.

MAVI FARMACÉUTICA, S. A. de C. V.

Reg. Núm. 009M2011, SSA IV','Debe tenerse precaución cuando se administre ketorolaco/tramadol concomitantemente con antidepresivos tricíclicos, serotoninérgicos. Debe ser administrado con precaución en pacientes con antecedentes de dependencia o adicción a opioides.

MAVIDOL TR* puede causar somnolencia y mareo, estos efectos pueden potenciarse por otros medicamentos de acción central o por el alcohol. Se debe advertir a los pacientes ambulatorios que no efectúen tareas potencialmente peligrosas, como conducir automóviles u operar maquinaria. MAVIDOL TR* se debe administrar con precaución en pacientes con función hepática alterada o con historia de hepatopatía, ya que puede causar elevación de enzimas hepáticas en pacientes con disfunción preexistente.

No se recomienda como medicación preoperatoria debido a la inhibición de la agregación plaquetaria.

No se recomienda en analgesia obstétrica.

La duración total de la terapia no debe exceder 7 días.','No se han reportado efectos sobre la carcinogénesis, teratogénesis, mutagénesis y sobre la fertilidad.','Puede presentarse dolor abdominal, náusea, vómito, hiperventilación, úlcera gastroduodenal, gastritis erosiva y disfunción renal, debe suspenderse de inmediato el tratamiento para que desaparezcan los síntomas. Las consecuencias serias potenciales de la sobredosis incluyen depresión respiratoria, letargia, coma, convulsiones. En el tratamiento de la sobredosis se debe dar atención primaria al mantenimiento de una ventilación adecuada.

Los efectos originados por tramadol se revierten con la administración de naloxona. La hemodiálisis no es útil, ya que elimina menos de 7% de la dosis administrada en un periodo de 4 horas de diálisis. Al administrar una sobredosis controlada (3 veces la dosis máxima recomendada) se presentó dolor abdominal y úlceras pépticas que se resolvieron al suspender el medicamento.');
-- COMMIT;
