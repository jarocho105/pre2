/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.nomina.util.PreguntaNomiConstantesFunciones;
import com.bydan.erp.nomina.util.PreguntaNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.PreguntaNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.PreguntaNomiBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PreguntaNomiBeanSwingJInternalFrame extends PreguntaNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PreguntaNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PreguntaNomi> preguntanomiValidator = new ClassValidator<PreguntaNomi>(PreguntaNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PreguntaNomi preguntanomi;	
	public PreguntaNomi preguntanomiAux;
	public PreguntaNomi preguntanomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PreguntaNomi preguntanomiTotales;
	public Long idPreguntaNomiActual;
	public Long iIdNuevoPreguntaNomi=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboFactorNomi="";

	public List<FactorNomi> factornomisForeignKey;

	public List<FactorNomi> getfactornomisForeignKey() {
		return factornomisForeignKey;
	}

	public void setfactornomisForeignKey(List<FactorNomi> factornomisForeignKey) {
		this.factornomisForeignKey = factornomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public FactorNomi factornomiForeignKey;

	public FactorNomi getfactornomiForeignKey() {
		return factornomiForeignKey;
	}

	public void setfactornomiForeignKey(FactorNomi factornomiForeignKey) {
		this.factornomiForeignKey = factornomiForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosFormatoNomiPreguntaNomi=false;

	public Boolean getIsTienePermisosFormatoNomiPreguntaNomi() {
		return isTienePermisosFormatoNomiPreguntaNomi;
	}

	public void setIsTienePermisosFormatoNomiPreguntaNomi(Boolean isTienePermisosFormatoNomiPreguntaNomi) {
		this.isTienePermisosFormatoNomiPreguntaNomi= isTienePermisosFormatoNomiPreguntaNomi;
	}


	public Boolean isTienePermisosDetalleEvaluacionNomi=false;

	public Boolean getIsTienePermisosDetalleEvaluacionNomi() {
		return isTienePermisosDetalleEvaluacionNomi;
	}

	public void setIsTienePermisosDetalleEvaluacionNomi(Boolean isTienePermisosDetalleEvaluacionNomi) {
		this.isTienePermisosDetalleEvaluacionNomi= isTienePermisosDetalleEvaluacionNomi;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoPreguntaNomi;
	public Boolean isPermisoNuevoPreguntaNomi;
	public Boolean isPermisoActualizarPreguntaNomi;
	public Boolean isPermisoActualizarOriginalPreguntaNomi;
	public Boolean isPermisoEliminarPreguntaNomi;
	public Boolean isPermisoGuardarCambiosPreguntaNomi;
	public Boolean isPermisoConsultaPreguntaNomi;
	public Boolean isPermisoBusquedaPreguntaNomi;
	public Boolean isPermisoReportePreguntaNomi;
	public Boolean isPermisoPaginacionMedioPreguntaNomi;
	public Boolean isPermisoPaginacionAltoPreguntaNomi;
	public Boolean isPermisoPaginacionTodoPreguntaNomi;
	public Boolean isPermisoCopiarPreguntaNomi;
	public Boolean isPermisoVerFormPreguntaNomi;
	public Boolean isPermisoDuplicarPreguntaNomi;
	public Boolean isPermisoOrdenPreguntaNomi;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public PreguntaNomiParameterReturnGeneral preguntanomiReturnGeneral;
	public PreguntaNomiParameterReturnGeneral preguntanomiParameterGeneral;
	
	

	public FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic=null;

	public FormatoNomiPreguntaNomiLogic getFormatoNomiPreguntaNomiLogic() {
		return formatonomipreguntanomiLogic;
	}

	public void setFormatoNomiPreguntaNomiLogic(FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic) {
		this.formatonomipreguntanomiLogic = formatonomipreguntanomiLogic;
	}


	public DetalleEvaluacionNomiLogic detalleevaluacionnomiLogic=null;

	public DetalleEvaluacionNomiLogic getDetalleEvaluacionNomiLogic() {
		return detalleevaluacionnomiLogic;
	}

	public void setDetalleEvaluacionNomiLogic(DetalleEvaluacionNomiLogic detalleevaluacionnomiLogic) {
		this.detalleevaluacionnomiLogic = detalleevaluacionnomiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPreguntaNomi=false;
	public Boolean esParaAccionDesdeFormularioPreguntaNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PreguntaNomiSessionBeanAdditional preguntanomiSessionBeanAdditional=null;
	
	public PreguntaNomiSessionBeanAdditional getPreguntaNomiSessionBeanAdditional() {
		return this.preguntanomiSessionBeanAdditional;
	}
	
	public void setPreguntaNomiSessionBeanAdditional(PreguntaNomiSessionBeanAdditional preguntanomiSessionBeanAdditional) {
		try {
			this.preguntanomiSessionBeanAdditional=preguntanomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PreguntaNomiBeanSwingJInternalFrameAdditional preguntanomiBeanSwingJInternalFrameAdditional=null;
	//public class PreguntaNomiBeanSwingJInternalFrame
	
	public PreguntaNomiBeanSwingJInternalFrameAdditional getPreguntaNomiBeanSwingJInternalFrameAdditional() {
		return this.preguntanomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setPreguntaNomiBeanSwingJInternalFrameAdditional(PreguntaNomiBeanSwingJInternalFrameAdditional preguntanomiBeanSwingJInternalFrameAdditional) {
		try {
			this.preguntanomiBeanSwingJInternalFrameAdditional=preguntanomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PreguntaNomiLogic preguntanomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PreguntaNomi preguntanomiBean;
	public PreguntaNomiConstantesFunciones preguntanomiConstantesFunciones;
	//public PreguntaNomiParameterReturnGeneral preguntanomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public FactorNomiLogic factornomiLogic;
	
	//PARAMETROS
	
	
	//public List<PreguntaNomi> preguntanomis;	
	//public List<PreguntaNomi> preguntanomisEliminados;
	//public List<PreguntaNomi> preguntanomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPreguntaNomi=false;
	public Boolean isVisibilidadCeldaDuplicarPreguntaNomi=true;
	public Boolean isVisibilidadCeldaCopiarPreguntaNomi=true;
	public Boolean isVisibilidadCeldaVerFormPreguntaNomi=true;
	public Boolean isVisibilidadCeldaOrdenPreguntaNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPreguntaNomi=false;
	public Boolean isVisibilidadCeldaModificarPreguntaNomi=false;
	public Boolean isVisibilidadCeldaActualizarPreguntaNomi=false;
	public Boolean isVisibilidadCeldaEliminarPreguntaNomi=false;
	public Boolean isVisibilidadCeldaCancelarPreguntaNomi=false;
	public Boolean isVisibilidadCeldaGuardarPreguntaNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPreguntaNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactorNomi=false;
	
	public Long getiIdNuevoPreguntaNomi() {
		return this.iIdNuevoPreguntaNomi;
	}

	public void setiIdNuevoPreguntaNomi(Long iIdNuevoPreguntaNomi) {
		this.iIdNuevoPreguntaNomi = iIdNuevoPreguntaNomi;
	}
	
	public Long getidPreguntaNomiActual() {
		return this.idPreguntaNomiActual;
	}

	public void setidPreguntaNomiActual(Long idPreguntaNomiActual) {
		this.idPreguntaNomiActual = idPreguntaNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PreguntaNomi getpreguntanomi() {
		return this.preguntanomi;
	}

	public void setpreguntanomi(PreguntaNomi preguntanomi) {
		this.preguntanomi = preguntanomi;
	}
	
	public PreguntaNomi getpreguntanomiAux() {
		return this.preguntanomiAux;
	}

	public void setpreguntanomiAux(PreguntaNomi preguntanomiAux) {
		this.preguntanomiAux = preguntanomiAux;
	}				
	
	public PreguntaNomi getpreguntanomiAnterior() {
		return this.preguntanomiAnterior;
	}

	public void setpreguntanomiAnterior(PreguntaNomi preguntanomiAnterior) {
		this.preguntanomiAnterior = preguntanomiAnterior;
	}	
	
	public PreguntaNomi getpreguntanomiTotales() {
		return this.preguntanomiTotales;
	}

	public void setpreguntanomiTotales(PreguntaNomi preguntanomiTotales) {
		this.preguntanomiTotales = preguntanomiTotales;
	}	
	
	public PreguntaNomi getpreguntanomiBean() {
		return this.preguntanomiBean;
	}

	public void setpreguntanomiBean(PreguntaNomi preguntanomiBean) {
		this.preguntanomiBean = preguntanomiBean;
	}	
	
	public PreguntaNomiParameterReturnGeneral getpreguntanomiReturnGeneral() {
		return this.preguntanomiReturnGeneral;
	}

	public void setpreguntanomiReturnGeneral(PreguntaNomiParameterReturnGeneral preguntanomiReturnGeneral) {
		this.preguntanomiReturnGeneral = preguntanomiReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_factor_nomiFK_IdFactorNomi=-1L;

	public Long getid_factor_nomiFK_IdFactorNomi() {
		return this.id_factor_nomiFK_IdFactorNomi;
	}

	public void setid_factor_nomiFK_IdFactorNomi(Long id_factor_nomiFK_IdFactorNomi) {
		this.id_factor_nomiFK_IdFactorNomi = id_factor_nomiFK_IdFactorNomi;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PreguntaNomiLogic getPreguntaNomiLogic()	{		
		return preguntanomiLogic;
	}

	public void setPreguntaNomiLogic(PreguntaNomiLogic preguntanomiLogic) {
		this.preguntanomiLogic = preguntanomiLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoPreguntaNomi() {
		return isEsNuevoPreguntaNomi;
	}

	public void setIsEsNuevoPreguntaNomi(Boolean isEsNuevoPreguntaNomi) {
		this.isEsNuevoPreguntaNomi = isEsNuevoPreguntaNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioPreguntaNomi() {
		return esParaAccionDesdeFormularioPreguntaNomi;
	}
	
	public void setEsParaAccionDesdeFormularioPreguntaNomi(Boolean esParaAccionDesdeFormularioPreguntaNomi) {
		this.esParaAccionDesdeFormularioPreguntaNomi = esParaAccionDesdeFormularioPreguntaNomi;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.preguntanomiSessionBean==null) {
				this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
			}

			if(!this.preguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(preguntanomiSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosFactorNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.factornomisForeignKey=new ArrayList<FactorNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FactorNomiLogic factornomiLogic=new FactorNomiLogic();

			//factornomiLogic.getFactorNomiDataAccess().setIsForForeingKeyData(true);

			if(this.preguntanomiSessionBean==null) {
				this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
			}

			if(!this.preguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionFactorNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//factornomiLogic.getFactorNomiDataAccess().setIsForForeingKeyData(true);

					factornomiLogic.getTodosFactorNomisWithConnection(sFinalQuery,new Pagination());

					this.factornomisForeignKey=factornomiLogic.getFactorNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactorNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					factornomiLogic.getEntityWithConnection(preguntanomiSessionBean.getlidFactorNomiActual());
					this.factornomisForeignKey.add(factornomiLogic.getFactorNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.preguntanomi!=null) {
						this.preguntanomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
						this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPreguntaNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
						if(this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPreguntaNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaPreguntaNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPreguntaNomiGenerico!=null && jComboBoxid_empresaPreguntaNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaPreguntaNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFactorNomiForeignKey(Long idFactorNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			FactorNomi  factornomiTemp=null;

			for(FactorNomi factornomiAux:factornomisForeignKey) {
				if(factornomiAux.getId()!=null && factornomiAux.getId().equals(idFactorNomiSeleccionado)) {
					factornomiTemp=factornomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(factornomiTemp!=null) {

					if(this.preguntanomi!=null) {
						this.preguntanomi.setFactorNomi(factornomiTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
						this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.setSelectedItem(factornomiTemp);
					}
				} else {
					//jComboBoxid_factor_nomiPreguntaNomi.setSelectedItem(factornomiTemp);
					if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
						if(this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactorNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(factornomiTemp!=null && jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi!=null) {
						jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.setSelectedItem(factornomiTemp);
					} else {
						if(jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi!=null) {
							//jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.setSelectedItem(factornomiTemp);
							if(jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.getItemCount()>0) {
								jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualFactorNomiForeignKeyDescripcion(Long idFactorNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			FactorNomi  factornomiTemp=null;

			for(FactorNomi factornomiAux:factornomisForeignKey) {
				if(factornomiAux.getId()!=null && factornomiAux.getId().equals(idFactorNomiSeleccionado)) {
					factornomiTemp=factornomiAux;
					break;
				}
			}


			sDescripcion=FactorNomiConstantesFunciones.getFactorNomiDescripcion(factornomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFactorNomiForeignKeyGenerico(Long idFactorNomiSeleccionado,JComboBox jComboBoxid_factor_nomiPreguntaNomiGenerico)throws Exception
	{
		try
		{
			FactorNomi  factornomiTemp=null;

			for(FactorNomi factornomiAux:factornomisForeignKey) {
				if(factornomiAux.getId()!=null && factornomiAux.getId().equals(idFactorNomiSeleccionado)) {
					factornomiTemp=factornomiAux;
					break;
				}
			}

			if(factornomiTemp!=null) {
				jComboBoxid_factor_nomiPreguntaNomiGenerico.setSelectedItem(factornomiTemp);
			} else {
				if(jComboBoxid_factor_nomiPreguntaNomiGenerico!=null && jComboBoxid_factor_nomiPreguntaNomiGenerico.getItemCount()>0) {
					jComboBoxid_factor_nomiPreguntaNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PreguntaNomi preguntanomi,JComboBox jComboBoxid_empresaPreguntaNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPreguntaNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPreguntaNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				preguntanomi.setid_empresa(empresaAux.getId());
				preguntanomi.setempresa_descripcion(PreguntaNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				preguntanomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFactorNomiForeignKey(PreguntaNomi preguntanomi,JComboBox jComboBoxid_factor_nomiPreguntaNomiGenerico)throws Exception
	{
		try
		{
			FactorNomi  factornomiAux=new FactorNomi();

			if(jComboBoxid_factor_nomiPreguntaNomiGenerico==null) {
				factornomiAux=(FactorNomi)this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.getSelectedItem();
			} else {
				factornomiAux=(FactorNomi)jComboBoxid_factor_nomiPreguntaNomiGenerico.getSelectedItem();
			}

			if(factornomiAux!=null && factornomiAux.getId()!=null) {
				preguntanomi.setid_factor_nomi(factornomiAux.getId());
				preguntanomi.setfactornomi_descripcion(PreguntaNomiConstantesFunciones.getFactorNomiDescripcion(factornomiAux));
				preguntanomi.setFactorNomi(factornomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { 
							this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { 
					}

					if(!PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFactorNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactorNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { 
							this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.removeAllItems();

							for(FactorNomi factornomi:this.factornomisForeignKey) {
								this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.addItem(factornomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { 
					}

					if(!PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactorNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.removeAllItems();

							for(FactorNomi factornomi:this.factornomisForeignKey) {
								this.jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.addItem(factornomi);
							}
						}

						if(!PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFactorNomiForeignKey(FactorNomi factornomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.setSelectedItem(factornomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.setSelectedItem(factornomi);
						} else {
							this.jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPreguntaNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PreguntaNomiConstantesFunciones.refrescarForeignKeysDescripcionesPreguntaNomi(this.preguntanomiLogic.getPreguntaNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PreguntaNomiConstantesFunciones.refrescarForeignKeysDescripcionesPreguntaNomi(this.preguntanomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(FactorNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//preguntanomiLogic.setPreguntaNomis(this.preguntanomis);
			preguntanomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public PreguntaNomiParameterReturnGeneral getPreguntaNomiParameterGeneral() {
		return this.preguntanomiParameterGeneral;
	}
	
	public void setPreguntaNomiParameterGeneral(PreguntaNomiParameterReturnGeneral preguntanomiParameterGeneral) {
		this.preguntanomiParameterGeneral = preguntanomiParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoPreguntaNomi() {
		return isPermisoTodoPreguntaNomi;
	}

	public void setIsPermisoTodoPreguntaNomi(Boolean isPermisoTodoPreguntaNomi) {
		this.isPermisoTodoPreguntaNomi = isPermisoTodoPreguntaNomi;
	}

	public Boolean getIsPermisoNuevoPreguntaNomi() {
		return isPermisoNuevoPreguntaNomi;
	}

	public void setIsPermisoNuevoPreguntaNomi(Boolean isPermisoNuevoPreguntaNomi) {
		this.isPermisoNuevoPreguntaNomi = isPermisoNuevoPreguntaNomi;
	}

	public Boolean getIsPermisoActualizarPreguntaNomi() {
		return isPermisoActualizarPreguntaNomi;
	}

	public void setIsPermisoActualizarPreguntaNomi(Boolean isPermisoActualizarPreguntaNomi) {
		this.isPermisoActualizarPreguntaNomi = isPermisoActualizarPreguntaNomi;
	}

	public Boolean getIsPermisoEliminarPreguntaNomi() {
		return isPermisoEliminarPreguntaNomi;
	}

	public void setIsPermisoEliminarPreguntaNomi(Boolean isPermisoEliminarPreguntaNomi) {
		this.isPermisoEliminarPreguntaNomi = isPermisoEliminarPreguntaNomi;
	}

	public Boolean getIsPermisoGuardarCambiosPreguntaNomi() {
		return isPermisoGuardarCambiosPreguntaNomi;
	}

	public void setIsPermisoGuardarCambiosPreguntaNomi(Boolean isPermisoGuardarCambiosPreguntaNomi) {
		this.isPermisoGuardarCambiosPreguntaNomi = isPermisoGuardarCambiosPreguntaNomi;
	}
	
	public Boolean getIsPermisoConsultaPreguntaNomi() {
		return isPermisoConsultaPreguntaNomi;
	}

	public void setIsPermisoConsultaPreguntaNomi(Boolean isPermisoConsultaPreguntaNomi) {
		this.isPermisoConsultaPreguntaNomi = isPermisoConsultaPreguntaNomi;
	}

	public Boolean getIsPermisoBusquedaPreguntaNomi() {
		return isPermisoBusquedaPreguntaNomi;
	}

	public void setIsPermisoBusquedaPreguntaNomi(Boolean isPermisoBusquedaPreguntaNomi) {
		this.isPermisoBusquedaPreguntaNomi = isPermisoBusquedaPreguntaNomi;
	}

	public Boolean getIsPermisoReportePreguntaNomi() {
		return isPermisoReportePreguntaNomi;
	}

	public void setIsPermisoReportePreguntaNomi(Boolean isPermisoReportePreguntaNomi) {
		this.isPermisoReportePreguntaNomi = isPermisoReportePreguntaNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioPreguntaNomi() {
		return isPermisoPaginacionMedioPreguntaNomi;
	}

	public void setIsPermisoPaginacionMedioPreguntaNomi(Boolean isPermisoPaginacionMedioPreguntaNomi) {
		this.isPermisoPaginacionMedioPreguntaNomi = isPermisoPaginacionMedioPreguntaNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoPreguntaNomi() {
		return isPermisoPaginacionTodoPreguntaNomi;
	}

	public void setIsPermisoPaginacionTodoPreguntaNomi(Boolean isPermisoPaginacionTodoPreguntaNomi) {
		this.isPermisoPaginacionTodoPreguntaNomi = isPermisoPaginacionTodoPreguntaNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoPreguntaNomi() {
		return isPermisoPaginacionAltoPreguntaNomi;
	}

	public void setIsPermisoPaginacionAltoPreguntaNomi(Boolean isPermisoPaginacionAltoPreguntaNomi) {
		this.isPermisoPaginacionAltoPreguntaNomi = isPermisoPaginacionAltoPreguntaNomi;
	}
	
	public Boolean getIsPermisoCopiarPreguntaNomi() {
		return isPermisoCopiarPreguntaNomi;
	}

	public void setIsPermisoCopiarPreguntaNomi(Boolean isPermisoCopiarPreguntaNomi) {
		this.isPermisoCopiarPreguntaNomi = isPermisoCopiarPreguntaNomi;
	}
	
	public Boolean getIsPermisoVerFormPreguntaNomi() {
		return isPermisoVerFormPreguntaNomi;
	}

	public void setIsPermisoVerFormPreguntaNomi(Boolean isPermisoVerFormPreguntaNomi) {
		this.isPermisoVerFormPreguntaNomi = isPermisoVerFormPreguntaNomi;
	}
	
	public Boolean getIsPermisoDuplicarPreguntaNomi() {
		return isPermisoDuplicarPreguntaNomi;
	}

	public void setIsPermisoDuplicarPreguntaNomi(Boolean isPermisoDuplicarPreguntaNomi) {
		this.isPermisoDuplicarPreguntaNomi = isPermisoDuplicarPreguntaNomi;
	}
	
	public Boolean getIsPermisoOrdenPreguntaNomi() {
		return isPermisoOrdenPreguntaNomi;
	}

	public void setIsPermisoOrdenPreguntaNomi(Boolean isPermisoOrdenPreguntaNomi) {
		this.isPermisoOrdenPreguntaNomi = isPermisoOrdenPreguntaNomi;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoPreguntaNomi() {
		return isVisibilidadCeldaNuevoPreguntaNomi;
	}

	public void setIsVisibilidadCeldaNuevoPreguntaNomi(Boolean isVisibilidadCeldaNuevoPreguntaNomi) {
		this.isVisibilidadCeldaNuevoPreguntaNomi = isVisibilidadCeldaNuevoPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPreguntaNomi() {
		return isVisibilidadCeldaDuplicarPreguntaNomi;
	}

	public void setIsVisibilidadCeldaDuplicarPreguntaNomi(Boolean isVisibilidadCeldaDuplicarPreguntaNomi) {
		this.isVisibilidadCeldaDuplicarPreguntaNomi = isVisibilidadCeldaDuplicarPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPreguntaNomi() {
		return isVisibilidadCeldaCopiarPreguntaNomi;
	}

	public void setIsVisibilidadCeldaCopiarPreguntaNomi(Boolean isVisibilidadCeldaCopiarPreguntaNomi) {
		this.isVisibilidadCeldaCopiarPreguntaNomi = isVisibilidadCeldaCopiarPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPreguntaNomi() {
		return isVisibilidadCeldaVerFormPreguntaNomi;
	}

	public void setIsVisibilidadCeldaVerFormPreguntaNomi(Boolean isVisibilidadCeldaVerFormPreguntaNomi) {
		this.isVisibilidadCeldaVerFormPreguntaNomi = isVisibilidadCeldaVerFormPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPreguntaNomi() {
		return isVisibilidadCeldaOrdenPreguntaNomi;
	}

	public void setIsVisibilidadCeldaOrdenPreguntaNomi(Boolean isVisibilidadCeldaOrdenPreguntaNomi) {
		this.isVisibilidadCeldaOrdenPreguntaNomi = isVisibilidadCeldaOrdenPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPreguntaNomi() {
		return isVisibilidadCeldaNuevoRelacionesPreguntaNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPreguntaNomi(Boolean isVisibilidadCeldaNuevoRelacionesPreguntaNomi) {
		this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi = isVisibilidadCeldaNuevoRelacionesPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPreguntaNomi() {
		return isVisibilidadCeldaModificarPreguntaNomi;
	}

	public void setIsVisibilidadCeldaModificarPreguntaNomi(Boolean isVisibilidadCeldaModificarPreguntaNomi) {
		this.isVisibilidadCeldaModificarPreguntaNomi = isVisibilidadCeldaModificarPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPreguntaNomi() {
		return isVisibilidadCeldaActualizarPreguntaNomi;
	}

	public void setIsVisibilidadCeldaActualizarPreguntaNomi(Boolean isVisibilidadCeldaActualizarPreguntaNomi) {
		this.isVisibilidadCeldaActualizarPreguntaNomi = isVisibilidadCeldaActualizarPreguntaNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarPreguntaNomi() {
		return isVisibilidadCeldaEliminarPreguntaNomi;
	}

	public void setIsVisibilidadCeldaEliminarPreguntaNomi(Boolean isVisibilidadCeldaEliminarPreguntaNomi) {
		this.isVisibilidadCeldaEliminarPreguntaNomi = isVisibilidadCeldaEliminarPreguntaNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarPreguntaNomi() {
		return isVisibilidadCeldaCancelarPreguntaNomi;
	}

	public void setIsVisibilidadCeldaCancelarPreguntaNomi(Boolean isVisibilidadCeldaCancelarPreguntaNomi) {
		this.isVisibilidadCeldaCancelarPreguntaNomi = isVisibilidadCeldaCancelarPreguntaNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarPreguntaNomi() {
		return isVisibilidadCeldaGuardarPreguntaNomi;
	}

	public void setIsVisibilidadCeldaGuardarPreguntaNomi(Boolean isVisibilidadCeldaGuardarPreguntaNomi) {
		this.isVisibilidadCeldaGuardarPreguntaNomi = isVisibilidadCeldaGuardarPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPreguntaNomi() {
		return isVisibilidadCeldaGuardarCambiosPreguntaNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPreguntaNomi(Boolean isVisibilidadCeldaGuardarCambiosPreguntaNomi) {
		this.isVisibilidadCeldaGuardarCambiosPreguntaNomi = isVisibilidadCeldaGuardarCambiosPreguntaNomi;
	}
		
	public PreguntaNomiSessionBean getpreguntanomiSessionBean() {
		return this.preguntanomiSessionBean;
	}
	
	public void setpreguntanomiSessionBean(PreguntaNomiSessionBean preguntanomiSessionBean) {
		this.preguntanomiSessionBean=preguntanomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFactorNomi() {
		return this.isVisibilidadFK_IdFactorNomi;
	}

	public void setisVisibilidadFK_IdFactorNomi(Boolean isVisibilidadFK_IdFactorNomi) {
		this.isVisibilidadFK_IdFactorNomi=isVisibilidadFK_IdFactorNomi;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(PreguntaNomi preguntanomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(preguntanomi,null);
				this.setActualParaGuardarFactorNomiForeignKey(preguntanomi,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(PreguntaNomi preguntanomi,PreguntaNomi preguntanomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPreguntaNomi(preguntanomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		preguntanomiAux.setId(preguntanomi.getId());
		preguntanomiAux.setVersionRow(preguntanomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPreguntaNomi();
		
			int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = preguntanomiValidator.getInvalidValues(this.preguntanomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			preguntanomiLogic.setDatosCliente(datosCliente);
			preguntanomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				preguntanomiAux=new  PreguntaNomi();
				
				preguntanomiAux.setIsNew(true);
				preguntanomiAux.setIsChanged(true);
				
				preguntanomiAux.setPreguntaNomiOriginal(this.preguntanomi);
				
				preguntanomiAux.setId(this.preguntanomi.getId());	
				preguntanomiAux.setVersionRow(this.preguntanomi.getVersionRow());	
				preguntanomiAux.setid_empresa(this.preguntanomi.getid_empresa());	
				preguntanomiAux.setid_factor_nomi(this.preguntanomi.getid_factor_nomi());	
				preguntanomiAux.setpregunta(this.preguntanomi.getpregunta());	
				preguntanomiAux.setorden(this.preguntanomi.getorden());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.preguntanomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.preguntanomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(preguntanomiAux,preguntanomiLogic.getPreguntaNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntanomiAux,preguntanomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.preguntanomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.preguntanomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntanomiLogic.savePreguntaNomis();//WithConnection
						//preguntanomiLogic.getSetVersionRowPreguntaNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.preguntanomi,preguntanomiAux);
					
					this.refrescarForeignKeysDescripcionesPreguntaNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.preguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis.addAll(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis.addAll(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								preguntanomiLogic.savePreguntaNomiRelaciones(preguntanomiAux,this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());//WithConnection
								//preguntanomiLogic.getSetVersionRowPreguntaNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.preguntanomi,preguntanomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis= new ArrayList<FormatoNomiPreguntaNomi>();
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis= new ArrayList<DetalleEvaluacionNomi>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntanomiAux.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());

							if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntanomiAux.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.preguntanomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.preguntanomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(preguntanomiAux,preguntanomiLogic.getPreguntaNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(preguntanomiAux,preguntanomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.preguntanomi,preguntanomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				preguntanomiAux=new  PreguntaNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.preguntanomiSessionBean.getEsGuardarRelacionado() 
					|| (this.preguntanomiSessionBean.getEsGuardarRelacionado() && this.preguntanomi.getId()>=0)) {
						
					preguntanomiAux.setIsNew(false);
				}
				
				preguntanomiAux.setIsDeleted(false);
			
				preguntanomiAux.setId(this.preguntanomi.getId());	
				preguntanomiAux.setVersionRow(this.preguntanomi.getVersionRow());	
				preguntanomiAux.setid_empresa(this.preguntanomi.getid_empresa());	
				preguntanomiAux.setid_factor_nomi(this.preguntanomi.getid_factor_nomi());	
				preguntanomiAux.setpregunta(this.preguntanomi.getpregunta());	
				preguntanomiAux.setorden(this.preguntanomi.getorden());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(preguntanomiAux,preguntanomiLogic.getPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntanomiAux,preguntanomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.preguntanomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.preguntanomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntanomiLogic.savePreguntaNomis();//WithConnection
						//preguntanomiLogic.getSetVersionRowPreguntaNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.preguntanomi,preguntanomiAux);
					
					this.refrescarForeignKeysDescripcionesPreguntaNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.preguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis.addAll(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis.addAll(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								preguntanomiLogic.savePreguntaNomiRelaciones(preguntanomiAux,this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());//WithConnection
								//preguntanomiLogic.getSetVersionRowPreguntaNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.preguntanomi,preguntanomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis= new ArrayList<FormatoNomiPreguntaNomi>();
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis= new ArrayList<DetalleEvaluacionNomi>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntanomiAux.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());

							if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntanomiAux.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.preguntanomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.preguntanomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(preguntanomiAux,preguntanomiLogic.getPreguntaNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(preguntanomiAux,preguntanomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.preguntanomi,preguntanomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				preguntanomiAux=new  PreguntaNomi();
				
				preguntanomiAux.setIsNew(false);
				preguntanomiAux.setIsChanged(false);
				
				preguntanomiAux.setIsDeleted(true);
				
				preguntanomiAux.setId(this.preguntanomi.getId());	
				preguntanomiAux.setVersionRow(this.preguntanomi.getVersionRow());	
				preguntanomiAux.setid_empresa(this.preguntanomi.getid_empresa());	
				preguntanomiAux.setid_factor_nomi(this.preguntanomi.getid_factor_nomi());	
				preguntanomiAux.setpregunta(this.preguntanomi.getpregunta());	
				preguntanomiAux.setorden(this.preguntanomi.getorden());	
				
				if(this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.preguntanomiAux.getId()>=0) {	
						this.preguntanomisEliminados.add(preguntanomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(preguntanomiAux,preguntanomiLogic.getPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntanomiAux,preguntanomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.preguntanomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.preguntanomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntanomiLogic.savePreguntaNomis();//WithConnection
						//preguntanomiLogic.getSetVersionRowPreguntaNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.preguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis.addAll(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis.addAll(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								preguntanomiLogic.savePreguntaNomiRelaciones(preguntanomiAux,this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());//WithConnection
								//preguntanomiLogic.getSetVersionRowPreguntaNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis= new ArrayList<FormatoNomiPreguntaNomi>();
							this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis= new ArrayList<DetalleEvaluacionNomi>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntanomiAux.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());

							if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntanomiAux.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.preguntanomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.preguntanomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(preguntanomiAux,preguntanomiLogic.getPreguntaNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(preguntanomiAux,preguntanomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.getPreguntaNomis().addAll(this.preguntanomisEliminados);
					
					preguntanomiLogic.savePreguntaNomis();//WithConnection
					//preguntanomiLogic.getSetVersionRowPreguntaNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPreguntaNomi();
				
				this.preguntanomisEliminados= new ArrayList<PreguntaNomi>();		
			}
			
			if(this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Pregunta Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.preguntanomi=preguntanomiAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessPreguntaNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(PreguntaNomi preguntanomiLocal) throws Exception {
		
		if(this.preguntanomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				preguntanomiLocal.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				preguntanomiLocal.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
			
			} else {
			
				preguntanomiLocal.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis);
				preguntanomiLocal.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PreguntaNomi preguntanomiLocal) throws Exception {	
		if(this.preguntanomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				preguntanomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FactorNomiDetalleFormJInternalFrame.class)) {
				FactorNomiBeanSwingJInternalFrame factornomiBeanSwingJInternalFrameLocal=(FactorNomiBeanSwingJInternalFrame) ((FactorNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				factornomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactorNomi(factornomiBeanSwingJInternalFrameLocal.getfactornomi(),true);
				factornomiBeanSwingJInternalFrameLocal.actualizarLista(factornomiBeanSwingJInternalFrameLocal.factornomi,this.factornomisForeignKey);

				factornomiBeanSwingJInternalFrameLocal.actualizarRelaciones(factornomiBeanSwingJInternalFrameLocal.factornomi);

				preguntanomiLocal.setFactorNomi(factornomiBeanSwingJInternalFrameLocal.factornomi);

				this.addItemDefectoCombosForeignKeyFactorNomi();
				this.cargarCombosFrameFactorNomisForeignKey("Formulario");
				this.setActualFactorNomiForeignKey(factornomiBeanSwingJInternalFrameLocal.factornomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPreguntaNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = preguntanomiValidator.getInvalidValues(this.preguntanomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PreguntaNomi preguntanomi,List<PreguntaNomi> preguntanomis) throws Exception {
		try	{		
			PreguntaNomiConstantesFunciones.actualizarLista(preguntanomi,preguntanomis,this.preguntanomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PreguntaNomi preguntanomi,List<PreguntaNomi> preguntanomis) throws Exception {
		try	{			
			PreguntaNomiConstantesFunciones.actualizarSelectedLista(preguntanomi,preguntanomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PreguntaNomi> preguntanomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				preguntanomisLocal=this.preguntanomiLogic.getPreguntaNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				preguntanomisLocal=this.preguntanomis;
			}
			//ARCHITECTURE
		
			for(PreguntaNomi preguntanomiLocal:preguntanomisLocal) {
				if(this.permiteMantenimiento(preguntanomiLocal) && preguntanomiLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+PreguntaNomiConstantesFunciones.getPreguntaNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PreguntaNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaNomi.jLabelid_empresaPreguntaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaNomiConstantesFunciones.IDFACTORNOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaNomi.jLabelid_factor_nomiPreguntaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaNomiConstantesFunciones.PREGUNTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaNomi.jLabelpreguntaPreguntaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaNomiConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaNomi.jLabelordenPreguntaNomi,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaNomi.jLabelid_empresaPreguntaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaNomi.jLabelid_factor_nomiPreguntaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaNomi.jLabelpreguntaPreguntaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaNomi.jLabelordenPreguntaNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FormatoNomiPreguntaNomi")) {
			if(this.preguntanomi==null) {
				this.preguntanomi= new PreguntaNomi();
			}

			if(this.preguntanomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPreguntaNomi
				this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);

				this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getformatonomipreguntanomi().setPreguntaNomi(this.preguntanomi);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleEvaluacionNomi")) {
			if(this.preguntanomi==null) {
				this.preguntanomi= new PreguntaNomi();
			}

			if(this.preguntanomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPreguntaNomi
				this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);

				this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getdetalleevaluacionnomi().setPreguntaNomi(this.preguntanomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPreguntaNomi--;	
		
		
		this.preguntanomiAux=new PreguntaNomi();
		
		this.preguntanomiAux.setId(this.iIdNuevoPreguntaNomi);
		this.preguntanomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.preguntanomiLogic.getPreguntaNomis().add(this.preguntanomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.preguntanomis.add(this.preguntanomiAux);
		}
		//ARCHITECTURE
		
		this.preguntanomi=this.preguntanomiAux;
		
		if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPreguntaNomi(this.preguntanomi);
			this.setVariablesObjetoActualToFormularioForeignKeyPreguntaNomi(this.preguntanomi);
		}
				
		//this.setDefaultControlesPreguntaNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPreguntaNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPreguntaNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPreguntaNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPreguntaNomi(this.preguntanomiBean,this.preguntanomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PreguntaNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.preguntanomiSessionBean.getConGuardarRelaciones()) {
			classes=PreguntaNomiConstantesFunciones.getClassesRelationshipsOfPreguntaNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.preguntanomiReturnGeneral=preguntanomiLogic.procesarEventosPreguntaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.preguntanomiLogic.getPreguntaNomis(),this.preguntanomi,this.preguntanomiParameterGeneral,this.isEsNuevoPreguntaNomi,classes);//this.preguntanomiLogic.getPreguntaNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPreguntaNomi(this.preguntanomiReturnGeneral,this.preguntanomiBean,false);
		
		if(this.preguntanomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPreguntaNomi(this.preguntanomiReturnGeneral.getPreguntaNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPreguntaNomi(this.preguntanomiReturnGeneral.getPreguntaNomi());
		}
		
		if(this.preguntanomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPreguntaNomi(this.preguntanomiReturnGeneral.getPreguntaNomi(),classes);//this.preguntanomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPreguntaNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPreguntaNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.RecargarFormPreguntaNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPreguntaNomi(false);
						
			if(preguntanomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() && FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiPreguntaNomiActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionNomiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreguntaNomi();
			}
			
			this.actualizarVisualTableDatosPreguntaNomi();
			
			this.jTableDatosPreguntaNomi.setRowSelectionInterval(this.getIndiceNuevoPreguntaNomi(), this.getIndiceNuevoPreguntaNomi());
			
			this.seleccionarFilaTablaPreguntaNomiActual();
						
			this.actualizarEstadoCeldasBotonesPreguntaNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPreguntaNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPreguntaNomi.jTextAreapreguntaPreguntaNomi.setEnabled(isHabilitar && this.preguntanomiConstantesFunciones.activarpreguntaPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jTextFieldordenPreguntaNomi.setEnabled(isHabilitar && this.preguntanomiConstantesFunciones.activarordenPreguntaNomi);	
		//
		this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.setEnabled(isHabilitar && this.preguntanomiConstantesFunciones.activarid_empresaPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.setEnabled(isHabilitar && this.preguntanomiConstantesFunciones.activarid_factor_nomiPreguntaNomi);
	};
	
	public void setDefaultControlesPreguntaNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPreguntaNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.preguntanomiSessionBean.setConGuardarRelaciones(true);			
			this.preguntanomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.preguntanomiSessionBean.setConGuardarRelaciones(false);			
			this.preguntanomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPreguntaNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaNomi preguntanomiAux:this.preguntanomiLogic.getPreguntaNomis()) {
				if(preguntanomiAux.getId().equals(this.iIdNuevoPreguntaNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaNomi preguntanomiAux:this.preguntanomis) {
				if(preguntanomiAux.getId().equals(this.iIdNuevoPreguntaNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualPreguntaNomi(PreguntaNomi preguntanomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaNomi preguntanomiAux:this.preguntanomiLogic.getPreguntaNomis()) {
				if(preguntanomiAux.getId().equals(preguntanomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaNomi preguntanomiAux:this.preguntanomis) {
				if(preguntanomiAux.getId().equals(preguntanomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalPreguntaNomi(PreguntaNomi preguntanomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaNomi preguntanomiAux:this.preguntanomiLogic.getPreguntaNomis()) {
				if(preguntanomiAux.getPreguntaNomiOriginal().getId().equals(preguntanomiOriginal.getId())) {
					existe=true;
					preguntanomiOriginal.setId(preguntanomiAux.getId());
					preguntanomiOriginal.setVersionRow(preguntanomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaNomi preguntanomiAux:this.preguntanomis) {
				if(preguntanomiAux.getPreguntaNomiOriginal().getId().equals(preguntanomiOriginal.getId())) {
					existe=true;
					preguntanomiOriginal.setId(preguntanomiAux.getId());
					preguntanomiOriginal.setVersionRow(preguntanomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPreguntaNomi(Boolean esParaCancelar) throws Exception {
		preguntanomisAux=new ArrayList<PreguntaNomi>();
		preguntanomiAux=new PreguntaNomi();
		
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PreguntaNomi preguntanomiAux:this.preguntanomiLogic.getPreguntaNomis()) {
					if(preguntanomiAux.getId()<0) {
						preguntanomisAux.add(preguntanomiAux);
					}		
				}
				this.iIdNuevoPreguntaNomi=0L;
				this.preguntanomiLogic.getPreguntaNomis().removeAll(preguntanomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaNomi preguntanomiAux:this.preguntanomis) {
					if(preguntanomiAux.getId()<0) {
						preguntanomisAux.add(preguntanomiAux);
					}		
				}
				this.iIdNuevoPreguntaNomi=0L;
				this.preguntanomis.removeAll(preguntanomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPreguntaNomi 
					&& this.preguntanomiLogic.getPreguntaNomis().size()>0
					) {
					preguntanomiAux=this.preguntanomiLogic.getPreguntaNomis().get(this.preguntanomiLogic.getPreguntaNomis().size() - 1);
				
					if(preguntanomiAux.getId()<0) {
						this.preguntanomiLogic.getPreguntaNomis().remove(preguntanomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPreguntaNomi && this.preguntanomis.size()>0) {
					preguntanomiAux=this.preguntanomis.get(this.preguntanomis.size() - 1);
				
					if(preguntanomiAux.getId()<0) {
						this.preguntanomis.remove(preguntanomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPreguntaNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(preguntanomi.getId()<0) {
				this.preguntanomiLogic.getPreguntaNomis().remove(this.preguntanomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(preguntanomi.getId()<0) {
				this.preguntanomis.remove(this.preguntanomi);
			}
		}			
	}
	
	public void setEstadosInicialesPreguntaNomi(List<PreguntaNomi> preguntanomisAux) throws Exception {
		PreguntaNomiConstantesFunciones.setEstadosInicialesPreguntaNomi(preguntanomisAux);
	}
	
	public void setEstadosInicialesPreguntaNomi(PreguntaNomi preguntanomiAux) throws Exception {
		PreguntaNomiConstantesFunciones.setEstadosInicialesPreguntaNomi(preguntanomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPreguntaNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPreguntaNomiActual()) {
				if(!this.isEsNuevoPreguntaNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPreguntaNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPreguntaNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pregunta Nomi ?", "MANTENIMIENTO DE Pregunta Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PreguntaNomi preguntanomi) throws Exception {
		PreguntaNomiConstantesFunciones.seleccionarAsignar(this.preguntanomi,preguntanomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPreguntaNomi=this.isPermisoActualizarOriginalPreguntaNomi;
			
			
			this.seleccionarAsignar(preguntanomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PreguntaNomiConstantesFunciones.quitarEspaciosPreguntaNomi(this.preguntanomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPreguntaNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.preguntanomiSessionBean.setsFuncionBusquedaRapida(this.preguntanomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPreguntaNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPreguntaNomi(esParaCancelar);				
				this.cancelarNuevoPreguntaNomi(esParaCancelar);								
			}
			
			this.preguntanomi=new PreguntaNomi();
			
			this.inicializarPreguntaNomi();
			
			this.actualizarEstadoCeldasBotonesPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPreguntaNomi() throws Exception {
		try {
			PreguntaNomiConstantesFunciones.inicializarPreguntaNomi(this.preguntanomi);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.preguntanomiLogic.getPreguntaNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePreguntaNomis(String sAccionBusqueda,List<PreguntaNomi> preguntanomisParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="PreguntaNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PreguntaNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PreguntaNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PreguntaNomi"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Pregunta Nomis");		
		parameters.put("busquedapor", PreguntaNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FormatoNomiPreguntaNomi.class));
			classes.add(new Classe(DetalleEvaluacionNomi.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PreguntaNomiLogic preguntanomiLogicAuxiliar=new PreguntaNomiLogic();
					preguntanomiLogicAuxiliar.setDatosCliente(preguntanomiLogic.getDatosCliente());				
					preguntanomiLogicAuxiliar.setPreguntaNomis(preguntanomisParaReportes);
					
					preguntanomiLogicAuxiliar.cargarRelacionesLoteForeignKeyPreguntaNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					preguntanomisParaReportes=preguntanomiLogicAuxiliar.getPreguntaNomis();
					
					//preguntanomiLogic.getNewConnexionToDeep();
					
					//for (PreguntaNomi preguntanomi:preguntanomisParaReportes) {
					//	preguntanomiLogic.deepLoad(preguntanomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//preguntanomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//preguntanomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFormatoNomiPreguntaNomi = AuxiliarReportes.class.getResourceAsStream("FormatoNomiPreguntaNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formatonomipreguntanomi", reportFileFormatoNomiPreguntaNomi);

			InputStream reportFileDetalleEvaluacionNomi = AuxiliarReportes.class.getResourceAsStream("DetalleEvaluacionNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleevaluacionnomi", reportFileDetalleEvaluacionNomi);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePreguntaNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PreguntaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PreguntaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePreguntaNomi=new JRBeanArrayDataSource(PreguntaNomiJInternalFrame.TraerPreguntaNomiBeans(preguntanomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePreguntaNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PreguntaNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PreguntaNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PreguntaNomiBean.TraerPreguntaNomiBeans(preguntanomisParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReportePreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,preguntanomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,preguntanomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPreguntaNomiActionPerformed(null);
					//this.generarExcelReportePreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,preguntanomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,preguntanomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,preguntanomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,preguntanomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePreguntaNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<PreguntaNomi> preguntanomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntanomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreguntaNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPreguntaNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PreguntaNomi preguntanomi : preguntanomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PreguntaNomiConstantesFunciones.generarExcelReporteDataPreguntaNomi("NORMAL",row,workbook,preguntanomi,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPreguntaNomi(String sTipo,Row row,Workbook workbook) {
		
		PreguntaNomiConstantesFunciones.generarExcelReporteHeaderPreguntaNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPreguntaNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<PreguntaNomi> preguntanomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntanomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreguntaNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PreguntaNomi preguntanomi : preguntanomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PreguntaNomiConstantesFunciones.getPreguntaNomiDescripcion(preguntanomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntanomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntanomi.getfactornomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaNomiConstantesFunciones.LABEL_PREGUNTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_PREGUNTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntanomi.getpregunta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaNomiConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntanomi.getorden());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPreguntaNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<PreguntaNomi> preguntanomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PreguntaNomi> preguntanomisRespaldo=null;
		
		classes=PreguntaNomiConstantesFunciones.getClassesRelationshipsOfPreguntaNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.preguntanomiLogic.setDatosCliente(this.datosCliente);
		this.preguntanomiLogic.setDatosDeep(this.datosDeep);
		this.preguntanomiLogic.setIsConDeep(true);
		
		preguntanomisRespaldo=this.preguntanomiLogic.getPreguntaNomis();
		
		this.preguntanomiLogic.setPreguntaNomis(preguntanomisParaReportes);	
		this.preguntanomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		preguntanomisParaReportes=this.preguntanomiLogic.getPreguntaNomis();
		this.preguntanomiLogic.setPreguntaNomis(preguntanomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntanomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreguntaNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPreguntaNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PreguntaNomi preguntanomi : preguntanomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPreguntaNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PreguntaNomiConstantesFunciones.generarExcelReporteDataPreguntaNomi("NORMAL",row,workbook,preguntanomi,cellStyleDataAux);
		
			
			


				//FormatoNomiPreguntaNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(preguntanomi.getFormatoNomiPreguntaNomis()!=null && preguntanomi.getFormatoNomiPreguntaNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormatoNomiPreguntaNomiConstantesFunciones.generarExcelReporteHeaderFormatoNomiPreguntaNomi("RELACIONADO",row,workbook);
				}

				if(preguntanomi.getFormatoNomiPreguntaNomis()!=null) {
					i2=0;
					for(FormatoNomiPreguntaNomi formatonomipreguntanomi : preguntanomi.getFormatoNomiPreguntaNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormatoNomiPreguntaNomiConstantesFunciones.generarExcelReporteDataFormatoNomiPreguntaNomi("RELACIONADO",row,workbook,formatonomipreguntanomi,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleEvaluacionNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(preguntanomi.getDetalleEvaluacionNomis()!=null && preguntanomi.getDetalleEvaluacionNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleEvaluacionNomiConstantesFunciones.generarExcelReporteHeaderDetalleEvaluacionNomi("RELACIONADO",row,workbook);
				}

				if(preguntanomi.getDetalleEvaluacionNomis()!=null) {
					i2=0;
					for(DetalleEvaluacionNomi detalleevaluacionnomi : preguntanomi.getDetalleEvaluacionNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleEvaluacionNomiConstantesFunciones.generarExcelReporteDataDetalleEvaluacionNomi("RELACIONADO",row,workbook,detalleevaluacionnomi,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PreguntaNomiConstantesFunciones.getPreguntaNomiDescripcion(preguntanomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPreguntaNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPreguntaNomi() throws Exception {		
		this.startProcessPreguntaNomi(true);
	}
	
	public void startProcessPreguntaNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPreguntaNomi ,this.jPanelParametrosReportesPreguntaNomi, this.jScrollPanelDatosPreguntaNomi,this.jPanelPaginacionPreguntaNomi, this.jScrollPanelDatosEdicionPreguntaNomi, this.jPanelAccionesPreguntaNomi,this.jPanelAccionesFormularioPreguntaNomi,this.jmenuBarPreguntaNomi,this.jmenuBarDetallePreguntaNomi,this.jTtoolBarPreguntaNomi,this.jTtoolBarDetallePreguntaNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasPreguntaNomi=this.jTabbedPaneBusquedasPreguntaNomi; 
		
		final JPanel jPanelParametrosReportesPreguntaNomi=this.jPanelParametrosReportesPreguntaNomi;
		//final JScrollPane jScrollPanelDatosPreguntaNomi=this.jScrollPanelDatosPreguntaNomi;
		final JTable jTableDatosPreguntaNomi=this.jTableDatosPreguntaNomi;		
		final JPanel jPanelPaginacionPreguntaNomi=this.jPanelPaginacionPreguntaNomi;
		//final JScrollPane jScrollPanelDatosEdicionPreguntaNomi=this.jScrollPanelDatosEdicionPreguntaNomi;
		final JPanel jPanelAccionesPreguntaNomi=this.jPanelAccionesPreguntaNomi;
		
		JPanel jPanelCamposAuxiliarPreguntaNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPreguntaNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			jPanelCamposAuxiliarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jPanelCamposPreguntaNomi;
			jPanelAccionesFormularioAuxiliarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jPanelAccionesFormularioPreguntaNomi;
		}
		
		final JPanel jPanelCamposPreguntaNomi=jPanelCamposAuxiliarPreguntaNomi;
		final JPanel jPanelAccionesFormularioPreguntaNomi=jPanelAccionesFormularioAuxiliarPreguntaNomi;
		
		
		final JMenuBar jmenuBarPreguntaNomi=this.jmenuBarPreguntaNomi;
		final JToolBar jTtoolBarPreguntaNomi=this.jTtoolBarPreguntaNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPreguntaNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPreguntaNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			jmenuBarDetalleAuxiliarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jmenuBarDetallePreguntaNomi;
			jTtoolBarDetalleAuxiliarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jTtoolBarDetallePreguntaNomi;
		}
		
		final JMenuBar jmenuBarDetallePreguntaNomi=jmenuBarDetalleAuxiliarPreguntaNomi;
		final JToolBar jTtoolBarDetallePreguntaNomi=jTtoolBarDetalleAuxiliarPreguntaNomi;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPreguntaNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPreguntaNomi;
			processRunnable.jTableDatos=jTableDatosPreguntaNomi;
			processRunnable.jPanelCampos=jPanelCamposPreguntaNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionPreguntaNomi;
			processRunnable.jPanelAcciones=jPanelAccionesPreguntaNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPreguntaNomi;
			
			
			processRunnable.jmenuBar=jmenuBarPreguntaNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePreguntaNomi;
			processRunnable.jTtoolBar=jTtoolBarPreguntaNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePreguntaNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPreguntaNomi ,jPanelParametrosReportesPreguntaNomi,jTableDatosPreguntaNomi, /*jScrollPanelDatosPreguntaNomi,*/jPanelCamposPreguntaNomi,jPanelPaginacionPreguntaNomi, /*jScrollPanelDatosEdicionPreguntaNomi,*/ jPanelAccionesPreguntaNomi,jPanelAccionesFormularioPreguntaNomi,jmenuBarPreguntaNomi,jmenuBarDetallePreguntaNomi,jTtoolBarPreguntaNomi,jTtoolBarDetallePreguntaNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPreguntaNomi ,jPanelParametrosReportesPreguntaNomi, jScrollPanelDatosPreguntaNomi,jPanelPaginacionPreguntaNomi, jScrollPanelDatosEdicionPreguntaNomi, jPanelAccionesPreguntaNomi,jPanelAccionesFormularioPreguntaNomi,jmenuBarPreguntaNomi,jmenuBarDetallePreguntaNomi,jTtoolBarPreguntaNomi,jTtoolBarDetallePreguntaNomi);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessPreguntaNomi() {// throws Exception 
		this.finishProcessPreguntaNomi(true);
	}
	
	public void finishProcessPreguntaNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPreguntaNomi ,this.jPanelParametrosReportesPreguntaNomi, this.jScrollPanelDatosPreguntaNomi,this.jPanelPaginacionPreguntaNomi, this.jScrollPanelDatosEdicionPreguntaNomi, this.jPanelAccionesPreguntaNomi,this.jPanelAccionesFormularioPreguntaNomi,this.jmenuBarPreguntaNomi,this.jmenuBarDetallePreguntaNomi,this.jTtoolBarPreguntaNomi,this.jTtoolBarDetallePreguntaNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasPreguntaNomi=this.jTabbedPaneBusquedasPreguntaNomi; 
		
		final JPanel jPanelParametrosReportesPreguntaNomi=this.jPanelParametrosReportesPreguntaNomi;
		//final JScrollPane jScrollPanelDatosPreguntaNomi=this.jScrollPanelDatosPreguntaNomi;
		final JTable jTableDatosPreguntaNomi=this.jTableDatosPreguntaNomi;		
		final JPanel jPanelPaginacionPreguntaNomi=this.jPanelPaginacionPreguntaNomi;
		//final JScrollPane jScrollPanelDatosEdicionPreguntaNomi=this.jScrollPanelDatosEdicionPreguntaNomi;
		final JPanel jPanelAccionesPreguntaNomi=this.jPanelAccionesPreguntaNomi;
		
		JPanel jPanelCamposAuxiliarPreguntaNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPreguntaNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			jPanelCamposAuxiliarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jPanelCamposPreguntaNomi;
			jPanelAccionesFormularioAuxiliarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jPanelAccionesFormularioPreguntaNomi;
		}
		
		final JPanel jPanelCamposPreguntaNomi=jPanelCamposAuxiliarPreguntaNomi;
		final JPanel jPanelAccionesFormularioPreguntaNomi=jPanelAccionesFormularioAuxiliarPreguntaNomi;
		
		
		final JMenuBar jmenuBarPreguntaNomi=this.jmenuBarPreguntaNomi;		
		final JToolBar jTtoolBarPreguntaNomi=this.jTtoolBarPreguntaNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarPreguntaNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPreguntaNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			jmenuBarDetalleAuxiliarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jmenuBarDetallePreguntaNomi;
			jTtoolBarDetalleAuxiliarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jTtoolBarDetallePreguntaNomi;		
		}
		
		final JMenuBar jmenuBarDetallePreguntaNomi=jmenuBarDetalleAuxiliarPreguntaNomi;
		final JToolBar jTtoolBarDetallePreguntaNomi=jTtoolBarDetalleAuxiliarPreguntaNomi;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPreguntaNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPreguntaNomi;
			processRunnable.jTableDatos=jTableDatosPreguntaNomi;
			processRunnable.jPanelCampos=jPanelCamposPreguntaNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionPreguntaNomi;
			processRunnable.jPanelAcciones=jPanelAccionesPreguntaNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPreguntaNomi;
			
			
			processRunnable.jmenuBar=jmenuBarPreguntaNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePreguntaNomi;
			processRunnable.jTtoolBar=jTtoolBarPreguntaNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePreguntaNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPreguntaNomi ,jPanelParametrosReportesPreguntaNomi, jTableDatosPreguntaNomi,/*jScrollPanelDatosPreguntaNomi,*/jPanelCamposPreguntaNomi,jPanelPaginacionPreguntaNomi, /*jScrollPanelDatosEdicionPreguntaNomi,*/ jPanelAccionesPreguntaNomi,jPanelAccionesFormularioPreguntaNomi,jmenuBarPreguntaNomi,jmenuBarDetallePreguntaNomi,jTtoolBarPreguntaNomi,jTtoolBarDetallePreguntaNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPreguntaNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPreguntaNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPreguntaNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPreguntaNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPreguntaNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePreguntaNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPreguntaNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPreguntaNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePreguntaNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.preguntanomiConstantesFunciones.getsFinalQueryPreguntaNomi();
		String  finalQueryPaginacionTodos=this.preguntanomiConstantesFunciones.getsFinalQueryPreguntaNomi();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=PreguntaNomiConstantesFunciones.getArrayColumnasGlobalesNoPreguntaNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PreguntaNomiConstantesFunciones.getArrayColumnasGlobalesPreguntaNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PreguntaNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.preguntanomisEliminados= new ArrayList<PreguntaNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPreguntaNomi();
		
				///*PreguntaNomiSessionBean*/this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
			
			if(this.preguntanomiSessionBean==null) {
				this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=PreguntaNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PreguntaNomiConstantesFunciones.getClassesForeignKeysOfPreguntaNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/preguntanomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			preguntanomisAux= new ArrayList<PreguntaNomi>();
			
				
			preguntanomiLogic.setDatosCliente(this.datosCliente);
			preguntanomiLogic.setDatosDeep(this.datosDeep);
			preguntanomiLogic.setIsConDeep(true);
			
			
			preguntanomiLogic.getPreguntaNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					preguntanomiLogic.getTodosPreguntaNomis(finalQueryGlobal,pagination);
					
					//preguntanomiLogic.getTodosPreguntaNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(preguntanomiLogic.getPreguntaNomis()==null|| preguntanomiLogic.getPreguntaNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							preguntanomisAux= new ArrayList<PreguntaNomi>();
							preguntanomisAux.addAll(preguntanomiLogic.getPreguntaNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntanomisAux= new ArrayList<PreguntaNomi>();
							preguntanomisAux.addAll(preguntanomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							preguntanomiLogic.getTodosPreguntaNomis(finalQueryGlobal+"",this.pagination);												
							
							//preguntanomiLogic.getTodosPreguntaNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePreguntaNomis("Todos",preguntanomiLogic.getPreguntaNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							preguntanomiLogic.setPreguntaNomis(new ArrayList<PreguntaNomi>());					
							preguntanomiLogic.getPreguntaNomis().addAll(preguntanomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntanomis=new ArrayList<PreguntaNomi>();
							preguntanomis.addAll(preguntanomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPreguntaNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPreguntaNomi=this.idActual;
				
				} else if(this.idPreguntaNomiActual!=null && this.idPreguntaNomiActual!=0L) {
					idPreguntaNomi=idPreguntaNomiActual;
				}
				
					
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndicePorId(idPreguntaNomi);
				
				this.preguntanomis=new ArrayList<PreguntaNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					preguntanomiLogic.getEntity(idPreguntaNomi);
					
					//preguntanomiLogic.getEntityWithConnection(idPreguntaNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntanomiLogic.setPreguntaNomis(new ArrayList<PreguntaNomi>());
					preguntanomiLogic.getPreguntaNomis().add(preguntanomiLogic.getPreguntaNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntanomis=new ArrayList<PreguntaNomi>();
					this.preguntanomis.add(preguntanomi);
				}
				
				if(preguntanomiLogic.getPreguntaNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					preguntanomiLogic.getPreguntaNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=preguntanomiLogic.getPreguntaNomis()==null||preguntanomiLogic.getPreguntaNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=preguntanomis==null|| preguntanomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntanomisAux=new ArrayList<PreguntaNomi>();
						preguntanomisAux.addAll(preguntanomiLogic.getPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntanomisAux=new ArrayList<PreguntaNomi>();
							preguntanomisAux.addAll(preguntanomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							preguntanomiLogic.getPreguntaNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePreguntaNomis("FK_IdEmpresa",preguntanomiLogic.getPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePreguntaNomis("FK_IdEmpresa",preguntanomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntanomiLogic.setPreguntaNomis(new ArrayList<PreguntaNomi>());
						preguntanomiLogic.getPreguntaNomis().addAll(preguntanomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntanomis=new ArrayList<PreguntaNomi>();
							preguntanomis.addAll(preguntanomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactorNomi")) {
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					preguntanomiLogic.getPreguntaNomisFK_IdFactorNomi(finalQueryGlobal,pagination,id_factor_nomiFK_IdFactorNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=preguntanomiLogic.getPreguntaNomis()==null||preguntanomiLogic.getPreguntaNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=preguntanomis==null|| preguntanomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntanomisAux=new ArrayList<PreguntaNomi>();
						preguntanomisAux.addAll(preguntanomiLogic.getPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntanomisAux=new ArrayList<PreguntaNomi>();
							preguntanomisAux.addAll(preguntanomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							preguntanomiLogic.getPreguntaNomisFK_IdFactorNomi(finalQueryGlobal,pagination,id_factor_nomiFK_IdFactorNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePreguntaNomis("FK_IdFactorNomi",preguntanomiLogic.getPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePreguntaNomis("FK_IdFactorNomi",preguntanomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntanomiLogic.setPreguntaNomis(new ArrayList<PreguntaNomi>());
						preguntanomiLogic.getPreguntaNomis().addAll(preguntanomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntanomis=new ArrayList<PreguntaNomi>();
							preguntanomis.addAll(preguntanomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPreguntaNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPreguntaNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=preguntanomiLogic.getPreguntaNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=preguntanomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=preguntanomiLogic.getPreguntaNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=preguntanomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PreguntaNomi preguntanomi) {
		Boolean permite=true;
		
		if(this.preguntanomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PreguntaNomiConstantesFunciones.getOrderByListaPreguntaNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PreguntaNomiConstantesFunciones.getOrderByListaPreguntaNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaNomi preguntanomi:preguntanomiLogic.getPreguntaNomis()) {
				if(preguntanomi.getsType().equals(Constantes2.S_TOTALES)) {
					preguntanomiTotales=preguntanomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaNomi preguntanomi:this.preguntanomis) {
				if(preguntanomi.getsType().equals(Constantes2.S_TOTALES)) {
					preguntanomiTotales=preguntanomi;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.preguntanomiAux=new PreguntaNomi();
			this.preguntanomiAux.setsType(Constantes2.S_TOTALES);
			this.preguntanomiAux.setIsNew(false);
			this.preguntanomiAux.setIsChanged(false);
			this.preguntanomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PreguntaNomiConstantesFunciones.TotalizarValoresFilaPreguntaNomi(this.preguntanomiLogic.getPreguntaNomis(),this.preguntanomiAux);
				
				this.preguntanomiLogic.getPreguntaNomis().add(this.preguntanomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PreguntaNomiConstantesFunciones.TotalizarValoresFilaPreguntaNomi(this.preguntanomis,this.preguntanomiAux);
				
				this.preguntanomis.add(this.preguntanomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		preguntanomiTotales=new PreguntaNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.preguntanomiLogic.getPreguntaNomis().remove(preguntanomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.preguntanomis.remove(preguntanomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		preguntanomiTotales=new PreguntaNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaNomi preguntanomi:preguntanomiLogic.getPreguntaNomis()) {
				if(preguntanomi.getsType().equals(Constantes2.S_TOTALES)) {
					preguntanomiTotales=preguntanomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PreguntaNomiConstantesFunciones.TotalizarValoresFilaPreguntaNomi(this.preguntanomiLogic.getPreguntaNomis(),preguntanomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaNomi preguntanomi:this.preguntanomis) {
				if(preguntanomi.getsType().equals(Constantes2.S_TOTALES)) {
					preguntanomiTotales=preguntanomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PreguntaNomiConstantesFunciones.TotalizarValoresFilaPreguntaNomi(this.preguntanomis,preguntanomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPreguntaNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaNomisFK_IdFactorNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactorNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPreguntaNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntanomiLogic.getPreguntaNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaNomisFK_IdFactorNomi(String sFinalQuery,Long id_factor_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntanomiLogic.getPreguntaNomisFK_IdFactorNomi(sFinalQuery,this.pagination,id_factor_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosPreguntaNomi() {
		this.isPermisoTodoPreguntaNomi=false;
		this.isPermisoNuevoPreguntaNomi=false;
		this.isPermisoActualizarPreguntaNomi=false;
		this.isPermisoActualizarOriginalPreguntaNomi=false;
		this.isPermisoEliminarPreguntaNomi=false;
		this.isPermisoGuardarCambiosPreguntaNomi=false;
		this.isPermisoConsultaPreguntaNomi=false;
		this.isPermisoBusquedaPreguntaNomi=false;
		this.isPermisoReportePreguntaNomi=false;		
		this.isPermisoOrdenPreguntaNomi=false;		
		this.isPermisoPaginacionMedioPreguntaNomi=false;		
		this.isPermisoPaginacionAltoPreguntaNomi=false;
		this.isPermisoPaginacionTodoPreguntaNomi=false;
		this.isPermisoCopiarPreguntaNomi=false;		
		this.isPermisoVerFormPreguntaNomi=false;		
		this.isPermisoDuplicarPreguntaNomi=false;		
		this.isPermisoOrdenPreguntaNomi=false;		
	}
	
	public void setPermisosUsuarioPreguntaNomi(Boolean isPermiso) {
		this.isPermisoTodoPreguntaNomi=isPermiso;
		this.isPermisoNuevoPreguntaNomi=isPermiso;
		this.isPermisoActualizarPreguntaNomi=isPermiso;
		this.isPermisoActualizarOriginalPreguntaNomi=isPermiso;
		this.isPermisoEliminarPreguntaNomi=isPermiso;
		this.isPermisoGuardarCambiosPreguntaNomi=isPermiso;
		this.isPermisoConsultaPreguntaNomi=isPermiso;
		this.isPermisoBusquedaPreguntaNomi=isPermiso;
		this.isPermisoReportePreguntaNomi=isPermiso;
		this.isPermisoOrdenPreguntaNomi=isPermiso;		
		this.isPermisoPaginacionMedioPreguntaNomi=isPermiso;		
		this.isPermisoPaginacionAltoPreguntaNomi=isPermiso;		
		this.isPermisoPaginacionTodoPreguntaNomi=isPermiso;		
		this.isPermisoCopiarPreguntaNomi=isPermiso;		
		this.isPermisoVerFormPreguntaNomi=isPermiso;		
		this.isPermisoDuplicarPreguntaNomi=isPermiso;
		this.isPermisoOrdenPreguntaNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPreguntaNomi(Boolean isPermiso) {
		//this.isPermisoTodoPreguntaNomi=isPermiso;
		this.isPermisoNuevoPreguntaNomi=isPermiso;
		this.isPermisoActualizarPreguntaNomi=isPermiso;
		this.isPermisoActualizarOriginalPreguntaNomi=isPermiso;
		this.isPermisoEliminarPreguntaNomi=isPermiso;
		this.isPermisoGuardarCambiosPreguntaNomi=isPermiso;
		//this.isPermisoConsultaPreguntaNomi=isPermiso;
		//this.isPermisoBusquedaPreguntaNomi=isPermiso;
		//this.isPermisoReportePreguntaNomi=isPermiso;
		//this.isPermisoOrdenPreguntaNomi=isPermiso;		
		//this.isPermisoPaginacionMedioPreguntaNomi=isPermiso;		
		//this.isPermisoPaginacionAltoPreguntaNomi=isPermiso;		
		//this.isPermisoPaginacionTodoPreguntaNomi=isPermiso;		
		//this.isPermisoCopiarPreguntaNomi=isPermiso;		
		//this.isPermisoDuplicarPreguntaNomi=isPermiso;
		//this.isPermisoOrdenPreguntaNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPreguntaNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION);
		
		if(PreguntaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFormatoNomiPreguntaNomi=false;
		this.isTienePermisosFormatoNomiPreguntaNomi=this.verificarGetPermisosUsuarioOpcionPreguntaNomiClaseRelacionada(this.opcionsRelacionadas,FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetalleEvaluacionNomi=false;
		this.isTienePermisosDetalleEvaluacionNomi=this.verificarGetPermisosUsuarioOpcionPreguntaNomiClaseRelacionada(this.opcionsRelacionadas,DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPreguntaNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPreguntaNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormatoNomiPreguntaNomi=conPermiso;
		this.isTienePermisosDetalleEvaluacionNomi=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPreguntaNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPreguntaNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPreguntaNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormatoNomiPreguntaNomi && this.jInternalFrameDetalleFormPreguntaNomi!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.remove(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetalleEvaluacionNomi && this.jInternalFrameDetalleFormPreguntaNomi!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.remove(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPreguntaNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PreguntaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PreguntaNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPreguntaNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPreguntaNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPreguntaNomi=this.isPermisoActualizarPreguntaNomi;
			this.isPermisoEliminarPreguntaNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPreguntaNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPreguntaNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPreguntaNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPreguntaNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePreguntaNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPreguntaNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPreguntaNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPreguntaNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPreguntaNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPreguntaNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPreguntaNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPreguntaNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPreguntaNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPreguntaNomi.setToolTipText(this.jTableDatosPreguntaNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPreguntaNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPreguntaNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PreguntaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(PreguntaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioPreguntaNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormatoNomiPreguntaNomi && this.preguntanomiConstantesFunciones.mostrarFormatoNomiPreguntaNomiPreguntaNomi && !PreguntaNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formato Nomi Pregunta Nomi");
			reporte.setsDescripcion("Formato Nomi Pregunta Nomi");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleEvaluacionNomi && this.preguntanomiConstantesFunciones.mostrarDetalleEvaluacionNomiPreguntaNomi && !PreguntaNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Evaluacion Nomi");
			reporte.setsDescripcion("Detalle Evaluacion Nomi");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyPreguntaNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.factornomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPreguntaNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PreguntaNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPreguntaNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFactorNomiListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFactorNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.factornomisForeignKey==null||this.factornomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FactorNomiConstantesFunciones.getArrayColumnasGlobalesFactorNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FactorNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FactorNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosFactorNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPreguntaNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PreguntaNomiParameterReturnGeneral preguntanomiReturnGeneral=new PreguntaNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.preguntanomiConstantesFunciones.cargarid_empresaPreguntaNomi)
					 || (this.esRecargarFks && this.preguntanomiConstantesFunciones.cargarid_empresaPreguntaNomi)) {

					if(!this.preguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+preguntanomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalFactorNomi="";

				if(((this.factornomisForeignKey==null||this.factornomisForeignKey.size()<=0) && this.preguntanomiConstantesFunciones.cargarid_factor_nomiPreguntaNomi)
					 || (this.esRecargarFks && this.preguntanomiConstantesFunciones.cargarid_factor_nomiPreguntaNomi)) {

					if(!this.preguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionFactorNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FactorNomiConstantesFunciones.getArrayColumnasGlobalesFactorNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactorNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FactorNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalFactorNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalFactorNomi, "");
						finalQueryGlobalFactorNomi+=FactorNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFactorNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactorNomi=" WHERE " + ConstantesSql.ID + "="+preguntanomiSessionBean.getlidFactorNomiActual();
					}
				} else {
					finalQueryGlobalFactorNomi="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				preguntanomiReturnGeneral=preguntanomiLogic.cargarCombosLoteForeignKeyPreguntaNomi(finalQueryGlobalEmpresa,finalQueryGlobalFactorNomi);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=preguntanomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalFactorNomi.equals("NONE")) {
				this.factornomisForeignKey=preguntanomiReturnGeneral.getfactornomisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPreguntaNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyFactorNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.preguntanomiSessionBean==null) {
				this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
			}

			if(!this.preguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactorNomi()throws Exception {
		try {

			if(!this.preguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionFactorNomi()) {
				FactorNomi factornomi=new FactorNomi();
				FactorNomiConstantesFunciones.setFactorNomiDescripcion(factornomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				factornomi.setId(null);

				if(!FactorNomiConstantesFunciones.ExisteEnLista(this.factornomisForeignKey,factornomi,true)) {

					this.factornomisForeignKey.add(0,factornomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPreguntaNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPreguntaNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPreguntaNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPreguntaNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPreguntaNomi(PreguntaNomi preguntanomi)throws Exception {	
		try {
			
			this.setActualFactorNomiForeignKey(preguntanomi.getid_factor_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPreguntaNomi(PreguntaNomi preguntanomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPreguntaNomi()throws Exception {	
		try {
			
			this.setActualFactorNomiForeignKey(this.preguntanomiConstantesFunciones.getid_factor_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPreguntaNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPreguntaNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPreguntaNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPreguntaNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPreguntaNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameFactorNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPreguntaNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFactorNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPreguntaNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi!=null && this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi!=null && this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public PreguntaNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PreguntaNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PreguntaNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.preguntanomiSessionBean=new PreguntaNomiSessionBean(); 
		this.preguntanomiConstantesFunciones=new PreguntaNomiConstantesFunciones(); 
		this.preguntanomiBean=new PreguntaNomi();//(this.preguntanomiConstantesFunciones); 		
		this.preguntanomiReturnGeneral=new PreguntaNomiParameterReturnGeneral(); 
		
		this.preguntanomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.preguntanomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PreguntaNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PreguntaNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PreguntaNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPreguntaNomi(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.preguntanomiConstantesFunciones=new PreguntaNomiConstantesFunciones(); 
			this.preguntanomiBean=new PreguntaNomi();//this.preguntanomiConstantesFunciones); 			
			this.preguntanomiReturnGeneral=new PreguntaNomiParameterReturnGeneral(); 
		
			PreguntaNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pregunta Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.preguntanomi=new PreguntaNomi();
			this.preguntanomis = new ArrayList<PreguntaNomi>();
			this.preguntanomisAux = new ArrayList<PreguntaNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic=new PreguntaNomiLogic();
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}
			
			//this.preguntanomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.preguntanomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPreguntaNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPreguntaNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPreguntaNomi);	
					}
					
					if(this.jInternalFrameImportacionPreguntaNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPreguntaNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPreguntaNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPreguntaNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPreguntaNomi);
				this.jInternalFrameDetalleFormPreguntaNomi.setVisible(false);
				this.jInternalFrameDetalleFormPreguntaNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPreguntaNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPreguntaNomi);
					this.jInternalFrameReporteDinamicoPreguntaNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoPreguntaNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPreguntaNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPreguntaNomi);
					this.jInternalFrameImportacionPreguntaNomi.setVisible(false);
					this.jInternalFrameImportacionPreguntaNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPreguntaNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPreguntaNomi);
					this.jInternalFrameOrderByPreguntaNomi.setVisible(false);
					this.jInternalFrameOrderByPreguntaNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPreguntaNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PreguntaNomiConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.preguntanomiReturnGeneral=new PreguntaNomiParameterReturnGeneral();
			
			this.preguntanomiParameterGeneral=new PreguntaNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.preguntanomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(PreguntaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PreguntaNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.preguntanomiSessionBean.getEsGuardarRelacionado(),this.preguntanomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PreguntaNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.preguntanomiSessionBean.getEsGuardarRelacionado(),this.preguntanomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoPreguntaNomi=false;
			this.isVisibilidadCeldaDuplicarPreguntaNomi=true;
			this.isVisibilidadCeldaCopiarPreguntaNomi=true;
			this.isVisibilidadCeldaVerFormPreguntaNomi=true;
			this.isVisibilidadCeldaOrdenPreguntaNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=false;
			this.isVisibilidadCeldaModificarPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactorNomi=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPreguntaNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPreguntaNomi(false);
			
			this.setPermisosUsuarioPreguntaNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.preguntanomiSessionBean.getEsGuardarRelacionado() 
				|| (this.preguntanomiSessionBean.getEsGuardarRelacionado() && this.preguntanomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPreguntaNomiClasesRelacionadas();
			}
			
			if(this.preguntanomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPreguntaNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPreguntaNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPreguntaNomi();
			}
			
			if(!this.isPermisoBusquedaPreguntaNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPreguntaNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPreguntaNomi,this.isPermisoPaginacionMedioPreguntaNomi,this.isPermisoPaginacionTodoPreguntaNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PreguntaNomiConstantesFunciones.getTiposSeleccionarPreguntaNomi());
				
				this.tiposColumnasSelect=PreguntaNomiConstantesFunciones.getTiposSeleccionarPreguntaNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPreguntaNomi();				
				//this.tiposRelacionesSelect=PreguntaNomiConstantesFunciones.getTiposRelacionesPreguntaNomi(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPreguntaNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPreguntaNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPreguntaNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaNomi() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.formatonomipreguntanomiLogic=new FormatoNomiPreguntaNomiLogic();
			this.detalleevaluacionnomiLogic=new DetalleEvaluacionNomiLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.factornomiLogic=new FactorNomiLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				preguntanomiImplementable= (PreguntaNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PreguntaNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				preguntanomiImplementableHome= (PreguntaNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PreguntaNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.preguntanomis= new ArrayList<PreguntaNomi>();
			this.preguntanomisEliminados= new ArrayList<PreguntaNomi>();
						
			this.isEsNuevoPreguntaNomi=false;
			this.esParaAccionDesdeFormularioPreguntaNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.factornomisForeignKey=new ArrayList<FactorNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPreguntaNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPreguntaNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PreguntaNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PreguntaNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPreguntaNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPreguntaNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPreguntaNomi();
			}
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPreguntaNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPreguntaNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPreguntaNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPreguntaNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PreguntaNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPreguntaNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPreguntaNomi")) {
				iIndex=this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Evaluacion Nomis")) {
					if(!DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPreguntaNomi();

						this.cargarParteTabPanelRelacionadaDetalleEvaluacionNomi(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Formato Nomi Pregunta Nomis")) {
					if(!FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPreguntaNomi();

						this.cargarParteTabPanelRelacionadaFormatoNomiPreguntaNomi(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPreguntaNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleEvaluacionNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPreguntaNomi.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(false,true,iIndex);
		this.jButtonDetalleEvaluacionNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleEvaluacionNomi();

		//this.jTabbedPaneRelacionesPreguntaNomi.updateUI();
		//this.jTabbedPaneRelacionesPreguntaNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPreguntaNomi.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaFormatoNomiPreguntaNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPreguntaNomi.cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(false,true,iIndex);
		this.jButtonFormatoNomiPreguntaNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormatoNomiPreguntaNomi();

		//this.jTabbedPaneRelacionesPreguntaNomi.updateUI();
		//this.jTabbedPaneRelacionesPreguntaNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPreguntaNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FormatoNomiPreguntaNomi")) {
				int row=this.jTableDatosPreguntaNomi.getSelectedRow();
				jButtonFormatoNomiPreguntaNomiActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleEvaluacionNomi")) {
				int row=this.jTableDatosPreguntaNomi.getSelectedRow();
				jButtonDetalleEvaluacionNomiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Formato Nomi Pregunta Nomi")) {

					if(this.isTienePermisosFormatoNomiPreguntaNomi && this.preguntanomiConstantesFunciones.mostrarFormatoNomiPreguntaNomiPreguntaNomi && !PreguntaNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formato Nomi Pregunta Nomis"+"("+FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formato Nomi Pregunta Nomis");

						if(preguntanomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiPreguntaNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(preguntanomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiPreguntaNomi);
						}

						jmenuItem.setEnabled(this.preguntanomiConstantesFunciones.activarFormatoNomiPreguntaNomiPreguntaNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormatoNomiPreguntaNomi"));

						

						this.jInternalFrameDetalleFormPreguntaNomi.jmenuDetallePreguntaNomi.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Evaluacion Nomi")) {

					if(this.isTienePermisosDetalleEvaluacionNomi && this.preguntanomiConstantesFunciones.mostrarDetalleEvaluacionNomiPreguntaNomi && !PreguntaNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Evaluacion Nomis"+"("+DetalleEvaluacionNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Evaluacion Nomis");

						if(preguntanomiConstantesFunciones.resaltarDetalleEvaluacionNomiPreguntaNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(preguntanomiConstantesFunciones.resaltarDetalleEvaluacionNomiPreguntaNomi);
						}

						jmenuItem.setEnabled(this.preguntanomiConstantesFunciones.activarDetalleEvaluacionNomiPreguntaNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleEvaluacionNomi"));

						

						this.jInternalFrameDetalleFormPreguntaNomi.jmenuDetallePreguntaNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPreguntaNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPreguntaNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPreguntaNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPreguntaNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPreguntaNomi();
		
		this.cargarCombosFrameForeignKeyPreguntaNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPreguntaNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPreguntaNomi();
		}
	}
	
	

	public void cargarCombosForeignKeyFactorNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFactorNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactorNomi();
				this.cargarCombosFrameFactorNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactorNomi(this.factornomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPreguntaNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.preguntanomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
			
			if(jTableDatosPreguntaNomi.getRowCount()>=1) {
				jTableDatosPreguntaNomi.removeRowSelectionInterval(0, jTableDatosPreguntaNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoPreguntaNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPreguntaNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPreguntaNomi(true);			
			//this.preguntanomi=new PreguntaNomi();
			//this.preguntanomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreguntaNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaNomi() ;
			
			if(PreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreguntaNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.preguntanomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);				
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
			if(this.preguntanomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PreguntaNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPreguntaNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPreguntaNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPreguntaNomi.getSelectedRows().length;			
			}
			
			preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPreguntaNomi--;			
				//PreguntaNomi preguntanomiAux= new PreguntaNomi();			
				//preguntanomiAux.setId(this.iIdNuevoPreguntaNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PreguntaNomi preguntanomiOrigen=new PreguntaNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PreguntaNomi preguntanomiOrigen : preguntanomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							preguntanomiOrigen =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntanomiOrigen =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPreguntaNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.preguntanomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPreguntaNomi(preguntanomiOrigen,this.preguntanomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.preguntanomiLogic.getPreguntaNomis().add(this.preguntanomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.preguntanomis.add(this.preguntanomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPreguntaNomi(false);
				
				this.jTableDatosPreguntaNomi.setRowSelectionInterval(this.getIndiceNuevoPreguntaNomi(), this.getIndiceNuevoPreguntaNomi());
				
				int iLastRow =  this.jTableDatosPreguntaNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPreguntaNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPreguntaNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPreguntaNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();									
		
			PreguntaNomi preguntanomiOrigen=new PreguntaNomi();
			PreguntaNomi preguntanomiDestino=new PreguntaNomi();
				
			preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPreguntaNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || preguntanomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPreguntaNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntanomiOrigen =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						preguntanomiOrigen =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntanomiDestino =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						preguntanomiDestino =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				preguntanomiOrigen =preguntanomisSeleccionados.get(0);
				preguntanomiDestino =preguntanomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPreguntaNomi(preguntanomiOrigen,preguntanomiDestino,true,false);
				
				preguntanomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(preguntanomiDestino,preguntanomiLogic.getPreguntaNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntanomiDestino,preguntanomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPreguntaNomi(false);
				
				//this.jTableDatosPreguntaNomi.setRowSelectionInterval(this.getIndiceNuevoPreguntaNomi(), this.getIndiceNuevoPreguntaNomi());
				
				int iLastRow =  this.jTableDatosPreguntaNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPreguntaNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPreguntaNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPreguntaNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPreguntaNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPreguntaNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPreguntaNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPreguntaNomi.setVisible(!isVisible);
			this.jPanelPaginacionPreguntaNomi.setVisible(!isVisible);
			this.jPanelAccionesPreguntaNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePreguntaNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPreguntaNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPreguntaNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPreguntaNomi();
			
			this.abrirFrameOrderByPreguntaNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPreguntaNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePreguntaNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPreguntaNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPreguntaNomi.isMaximum()) {
					this.jInternalFrameDetalleFormPreguntaNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPreguntaNomi.setSize(this.jInternalFrameDetalleFormPreguntaNomi.iWidthFormulario,this.jInternalFrameDetalleFormPreguntaNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPreguntaNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPreguntaNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPreguntaNomi.isMaximum()) {
						this.jInternalFrameDetalleFormPreguntaNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPreguntaNomi.jContentPaneDetallePreguntaNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPreguntaNomi.jContentPaneDetallePreguntaNomi.getWidth(),PreguntaNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPreguntaNomi.jContentPaneDetallePreguntaNomi.getWidth(),PreguntaNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPreguntaNomi.jContentPaneDetallePreguntaNomi.getWidth(),PreguntaNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleEvaluacionNomi();
					}

					if(FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormatoNomiPreguntaNomi();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPreguntaNomi.setVisible(true);
	        this.jInternalFrameDetalleFormPreguntaNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPreguntaNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPreguntaNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPreguntaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaNomi,false,this);
				} else {
					this.jInternalFrameOrderByPreguntaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPreguntaNomi);
				this.jInternalFrameOrderByPreguntaNomi.setVisible(false);
				this.jInternalFrameOrderByPreguntaNomi.setSelected(false);
				
				this.jInternalFrameOrderByPreguntaNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPreguntaNomi"));
				
				this.inicializarActualizarBindingTablaOrderByPreguntaNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPreguntaNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPreguntaNomi==null) {
				
				this.jInternalFrameImportacionPreguntaNomi=new ImportacionJInternalFrame(PreguntaNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPreguntaNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPreguntaNomi);
				this.jInternalFrameImportacionPreguntaNomi.setVisible(false);
				this.jInternalFrameImportacionPreguntaNomi.setSelected(false);


				this.jInternalFrameImportacionPreguntaNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPreguntaNomi"));
				this.jInternalFrameImportacionPreguntaNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPreguntaNomi"));
				this.jInternalFrameImportacionPreguntaNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPreguntaNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPreguntaNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPreguntaNomi==null) {
				this.jInternalFrameReporteDinamicoPreguntaNomi=new ReporteDinamicoJInternalFrame(PreguntaNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPreguntaNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPreguntaNomi);
				this.jInternalFrameReporteDinamicoPreguntaNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoPreguntaNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPreguntaNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreguntaNomi"));
				this.jInternalFrameReporteDinamicoPreguntaNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreguntaNomi"));
				this.jInternalFrameReporteDinamicoPreguntaNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreguntaNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreguntaNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleEvaluacionNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPreguntaNomi.jContentPaneDetallePreguntaNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaFormatoNomiPreguntaNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPreguntaNomi.jContentPaneDetallePreguntaNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePreguntaNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPreguntaNomi);
			
	       	this.jInternalFrameDetalleFormPreguntaNomi.setVisible(false);
	        this.jInternalFrameDetalleFormPreguntaNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormPreguntaNomi.dispose();
			//this.jInternalFrameDetalleFormPreguntaNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPreguntaNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPreguntaNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoPreguntaNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPreguntaNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPreguntaNomi.setVisible(true);
	        this.jInternalFrameImportacionPreguntaNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPreguntaNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPreguntaNomi.setVisible(true);
	        this.jInternalFrameOrderByPreguntaNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPreguntaNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPreguntaNomi.setVisible(false);
	        this.jInternalFrameOrderByPreguntaNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPreguntaNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPreguntaNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoPreguntaNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPreguntaNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPreguntaNomi.setVisible(false);
	        this.jInternalFrameImportacionPreguntaNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPreguntaNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPreguntaNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPreguntaNomi(true);
			//this.isEsNuevoPreguntaNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPreguntaNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreguntaNomi(false) ;
			
			if(preguntanomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() && FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiPreguntaNomiActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionNomiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreguntaNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPreguntaNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPreguntaNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPreguntaNomi(true);
			//this.isEsNuevoPreguntaNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.preguntanomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPreguntaNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPreguntaNomi(false) ;
			
			if(PreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreguntaNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaFactorNomi(List<FactorNomi> factornomisForeignKey)throws Exception{
		TableColumn tableColumnFactorNomi=this.jTableDatosPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaNomi,PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI));
		TableCellEditor tableCellEditorFactorNomi =tableColumnFactorNomi.getCellEditor();

		FactorNomiTableCell factornomiTableCellFk=(FactorNomiTableCell)tableCellEditorFactorNomi;

		if(factornomiTableCellFk!=null) {
			factornomiTableCellFk.setfactornomisForeignKey(factornomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreguntaNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//factornomiTableCellFk.setRowActual(intSelectedRow);
			//factornomiTableCellFk.setfactornomisForeignKeyActual(factornomisForeignKey);
		//}


		if(factornomiTableCellFk!=null) {
			factornomiTableCellFk.RecargarFactorNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPreguntaNomi(false);
			
			//if(!this.isEsNuevoPreguntaNomi) {								
				int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
				
			}
			
			if(this.permiteMantenimiento(this.preguntanomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPreguntaNomi=true;
					this.inicializarActualizarBindingTablaPreguntaNomi(false);
					this.isEsNuevoPreguntaNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPreguntaNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPreguntaNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPreguntaNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreguntaNomi(false);
				
				this.habilitarDeshabilitarControlesPreguntaNomi(false);
			
												
				
				if(PreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePreguntaNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPreguntaNomiActionPerformed(evt,preguntanomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPreguntaNomi(this.preguntanomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPreguntaNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,preguntanomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.preguntanomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				this.preguntanomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				this.preguntanomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.preguntanomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PreguntaNomiModel) this.jTableDatosPreguntaNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPreguntaNomi=true;
				this.inicializarActualizarBindingTablaPreguntaNomi(false);
				this.isEsNuevoPreguntaNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPreguntaNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreguntaNomi(false);
				
				this.habilitarDeshabilitarControlesPreguntaNomi(false);
				
				
				
				if(PreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePreguntaNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPreguntaNomi.getRowCount()>=1) {
				jTableDatosPreguntaNomi.removeRowSelectionInterval(0, jTableDatosPreguntaNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPreguntaNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPreguntaNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreguntaNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaNomi(false) ;
			
			this.isEsNuevoPreguntaNomi=false;
			
			if(PreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePreguntaNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPreguntaNomi(false);
				
				//SI ES MANUAL
				if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPreguntaNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPreguntaNomi--;			
			//PreguntaNomi preguntanomiAux= new PreguntaNomi();			
			//preguntanomiAux.setId(this.iIdNuevoPreguntaNomi);
			
			if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPreguntaNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
			
			this.preguntanomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.preguntanomiLogic.getPreguntaNomis().add(this.preguntanomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.preguntanomis.add(this.preguntanomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPreguntaNomi(false);
			
			this.jTableDatosPreguntaNomi.setRowSelectionInterval(this.getIndiceNuevoPreguntaNomi(), this.getIndiceNuevoPreguntaNomi());
			
			int iLastRow =  this.jTableDatosPreguntaNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPreguntaNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPreguntaNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPreguntaNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPreguntaNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaNomi(false);
			
			//SI ES MANUAL
			if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreguntaNomi();
			}
			
			//this.abrirFrameTreePreguntaNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Pregunta NomiS ?", "MANTENIMIENTO DE Pregunta Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPreguntaNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPreguntaNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.preguntanomiReturnGeneral=preguntanomiLogic.procesarImportacionPreguntaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.preguntanomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPreguntaNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPreguntaNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPreguntaNomi.setFileImportacion(this.jInternalFrameImportacionPreguntaNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPreguntaNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPreguntaNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPreguntaNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPreguntaNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();		

		preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PreguntaNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PreguntaNomiBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReportePreguntaNomis("Todos",preguntanomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FactorNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FactorNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FactorNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FactorNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaNomiConstantesFunciones.LABEL_PREGUNTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_egunta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_egunta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_egunta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_egunta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaNomiConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoPreguntaNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					sNombreCampoCategoria="id_factor_nomi";
					break;

				case PreguntaNomiConstantesFunciones.LABEL_PREGUNTA:
					sNombreCampoCategoria="pregunta";
					break;

				case PreguntaNomiConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					sNombreCampoCategoriaValor="id_factor_nomi";
					break;

				case PreguntaNomiConstantesFunciones.LABEL_PREGUNTA:
					sNombreCampoCategoriaValor="pregunta";
					break;

				case PreguntaNomiConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factor Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factor_nomi");
					break;

				case PreguntaNomiConstantesFunciones.LABEL_PREGUNTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pregunta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pregunta");
					break;

				case PreguntaNomiConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();		
		
		preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntanomi";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("PreguntaNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PreguntaNomi preguntanomi:preguntanomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntanomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI);
					iRow++;

					for(PreguntaNomi preguntanomi:preguntanomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntanomi.getfactornomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaNomiConstantesFunciones.LABEL_PREGUNTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_PREGUNTA);
					iRow++;

					for(PreguntaNomi preguntanomi:preguntanomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntanomi.getpregunta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaNomiConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(PreguntaNomi preguntanomi:preguntanomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntanomi.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelPreguntaNomi(row);				
			//	iRow++;
			//}				
			
			//for(PreguntaNomi preguntanomiAux:preguntanomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPreguntaNomi(preguntanomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaNomi(false);
			
			//SI ES MANUAL
			if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreguntaNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaNomi(false);
			
			//SI ES MANUAL
			if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPreguntaNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaNomi(false);
			
			//SI ES MANUAL
			if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPreguntaNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPreguntaNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPreguntaNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPreguntaNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPreguntaNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPreguntaNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPreguntaNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosPreguntaNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosPreguntaNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPreguntaNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPreguntaNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPreguntaNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPreguntaNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPreguntaNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPreguntaNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPreguntaNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPreguntaNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPreguntaNomi();
		
		this.inicializarActualizarBindingBotonesManualPreguntaNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPreguntaNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPreguntaNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPreguntaNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPreguntaNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPreguntaNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePreguntaNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPreguntaNomi.jCheckBoxPostAccionNuevoPreguntaNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPreguntaNomi.jCheckBoxPostAccionSinCerrarPreguntaNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPreguntaNomi.jCheckBoxPostAccionSinMensajePreguntaNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPreguntaNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPreguntaNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePreguntaNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
				this.jInternalFrameDetalleFormPreguntaNomi.jCheckBoxPostAccionNuevoPreguntaNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPreguntaNomi.jCheckBoxPostAccionSinCerrarPreguntaNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPreguntaNomi.jCheckBoxPostAccionSinMensajePreguntaNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPreguntaNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPreguntaNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPreguntaNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPreguntaNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPreguntaNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPreguntaNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPreguntaNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPreguntaNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPreguntaNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPreguntaNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPreguntaNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPreguntaNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPreguntaNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaNomi() throws Exception {
		try	{
			if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPreguntaNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePreguntaNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPreguntaNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPreguntaNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPreguntaNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPreguntaNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPreguntaNomi.addItem(reporte);
			}
			
			
			if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPreguntaNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPreguntaNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPreguntaNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPreguntaNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPreguntaNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPreguntaNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreguntaNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreguntaNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPreguntaNomi!=null) {
				this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPreguntaNomi!=null) {
				this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPreguntaNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPreguntaNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreguntaNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPreguntaNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreguntaNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPreguntaNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.getSelectedItem()!=null){this.id_factor_nomiFK_IdFactorNomi=((FactorNomi)this.jComboBoxid_factor_nomiFK_IdFactorNomiPreguntaNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPreguntaNomi(Boolean esInicializar) throws Exception {				
		if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPreguntaNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPreguntaNomi() throws Exception {
		this.inicializarActualizarBindingTablaPreguntaNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPreguntaNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PreguntaNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PreguntaNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPreguntaNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PreguntaNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PreguntaNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPreguntaNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=preguntanomiLogic.getPreguntaNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=preguntanomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPreguntaNomi.setModel(new PreguntaNomiModel(this.preguntanomiLogic.getPreguntaNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPreguntaNomi.setModel(new PreguntaNomiModel(this.preguntanomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPreguntaNomi!=null && this.jInternalFrameOrderByPreguntaNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPreguntaNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PreguntaNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO,preguntanomiConstantesFunciones.resaltarSeleccionarPreguntaNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO,preguntanomiConstantesFunciones.resaltarSeleccionarPreguntaNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaNomi,PreguntaNomiConstantesFunciones.LABEL_ID));

		if(this.preguntanomiConstantesFunciones.mostraridPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.preguntanomiConstantesFunciones.resaltaridPreguntaNomi,this.preguntanomiConstantesFunciones.activaridPreguntaNomi,this,true,"idPreguntaNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntanomiConstantesFunciones.resaltaridPreguntaNomi,this.preguntanomiConstantesFunciones.activaridPreguntaNomi,this,true,"idPreguntaNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaNomi,PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.preguntanomiConstantesFunciones.mostrarid_empresaPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.preguntanomiConstantesFunciones.resaltarid_empresaPreguntaNomi,this,this.preguntanomiConstantesFunciones.activarid_empresaPreguntaNomi));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.preguntanomiConstantesFunciones.resaltarid_empresaPreguntaNomi,this,this.preguntanomiConstantesFunciones.activarid_empresaPreguntaNomi,false,"id_empresaPreguntaNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaNomi,PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI));

		if(this.preguntanomiConstantesFunciones.mostrarid_factor_nomiPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FactorNomiTableCell(this.factornomisForeignKey,this.preguntanomiConstantesFunciones.resaltarid_factor_nomiPreguntaNomi,this,this.preguntanomiConstantesFunciones.activarid_factor_nomiPreguntaNomi));
			tableColumn.setCellEditor(new FactorNomiTableCell(this.factornomisForeignKey,this.preguntanomiConstantesFunciones.resaltarid_factor_nomiPreguntaNomi,this,this.preguntanomiConstantesFunciones.activarid_factor_nomiPreguntaNomi,true,"id_factor_nomiPreguntaNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaNomi,PreguntaNomiConstantesFunciones.LABEL_PREGUNTA));

		if(this.preguntanomiConstantesFunciones.mostrarpreguntaPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaNomiConstantesFunciones.LABEL_PREGUNTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.preguntanomiConstantesFunciones.resaltarpreguntaPreguntaNomi,this.preguntanomiConstantesFunciones.activarpreguntaPreguntaNomi,this,true,"preguntaPreguntaNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntanomiConstantesFunciones.resaltarpreguntaPreguntaNomi,this.preguntanomiConstantesFunciones.activarpreguntaPreguntaNomi,this,true,"preguntaPreguntaNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaNomi,PreguntaNomiConstantesFunciones.LABEL_ORDEN));

		if(this.preguntanomiConstantesFunciones.mostrarordenPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaNomiConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.preguntanomiConstantesFunciones.resaltarordenPreguntaNomi,this.preguntanomiConstantesFunciones.activarordenPreguntaNomi,this,true,"ordenPreguntaNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntanomiConstantesFunciones.resaltarordenPreguntaNomi,this.preguntanomiConstantesFunciones.activarordenPreguntaNomi,this,true,"ordenPreguntaNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PreguntaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormatoNomiPreguntaNomi && this.preguntanomiConstantesFunciones.mostrarFormatoNomiPreguntaNomiPreguntaNomi && !PreguntaNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formato Nomi Pregunta Nomis");
				tableColumn.setHeaderValue("Formato Nomi Pregunta Nomis");
				tableColumn.setCellRenderer(new FormatoNomiPreguntaNomiTableCell(preguntanomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiPreguntaNomi,this,this.preguntanomiConstantesFunciones.activarFormatoNomiPreguntaNomiPreguntaNomi));
				tableColumn.setCellEditor(new FormatoNomiPreguntaNomiTableCell(preguntanomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiPreguntaNomi,this,this.preguntanomiConstantesFunciones.activarFormatoNomiPreguntaNomiPreguntaNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPreguntaNomi.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleEvaluacionNomi && this.preguntanomiConstantesFunciones.mostrarDetalleEvaluacionNomiPreguntaNomi && !PreguntaNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Evaluacion Nomis");
				tableColumn.setHeaderValue("Detalle Evaluacion Nomis");
				tableColumn.setCellRenderer(new DetalleEvaluacionNomiTableCell(preguntanomiConstantesFunciones.resaltarDetalleEvaluacionNomiPreguntaNomi,this,this.preguntanomiConstantesFunciones.activarDetalleEvaluacionNomiPreguntaNomi));
				tableColumn.setCellEditor(new DetalleEvaluacionNomiTableCell(preguntanomiConstantesFunciones.resaltarDetalleEvaluacionNomiPreguntaNomi,this,this.preguntanomiConstantesFunciones.activarDetalleEvaluacionNomiPreguntaNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPreguntaNomi.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.preguntanomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.preguntanomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPreguntaNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.preguntanomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.preguntanomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPreguntaNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.preguntanomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.preguntanomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPreguntaNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.preguntanomiSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosPreguntaNomi.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosPreguntaNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.preguntanomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPreguntaNomi.moveColumn(this.jTableDatosPreguntaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPreguntaNomi.moveColumn(this.jTableDatosPreguntaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.preguntanomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPreguntaNomi.moveColumn(this.jTableDatosPreguntaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPreguntaNomi.moveColumn(this.jTableDatosPreguntaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPreguntaNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPreguntaNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPreguntaNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPreguntaNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPreguntaNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPreguntaNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPreguntaNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPreguntaNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=preguntanomiLogic.getPreguntaNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=preguntanomis.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosPreguntaNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPreguntaNomi();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoPreguntaNomi=false;
					
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
				if(this.preguntanomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPreguntaNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPreguntaNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPreguntaNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.preguntanomi.getsType().equals("DUPLICADO")
				   || this.preguntanomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPreguntaNomi=true;
				
				} else {
					this.isEsNuevoPreguntaNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
					if(this.preguntanomi.getId()>=0 && !this.preguntanomi.getIsNew()) {						
						this.isEsNuevoPreguntaNomi=false;
						
					} else {
						this.isEsNuevoPreguntaNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPreguntaNomi(esRelaciones);						
				
				this.seleccionarPreguntaNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.preguntanomi.getId()<0) {
					this.isEsNuevoPreguntaNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPreguntaNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPreguntaNomi(evt,rowIndex);
				}	
				
				if(this.preguntanomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PreguntaNomi: " + this.dDif); 
					}
				}								
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPreguntaNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.preguntanomi)) {
					if(this.preguntanomi.getId()>0) {
						this.preguntanomi.setIsDeleted(true);
						
						this.preguntanomisEliminados.add(this.preguntanomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.preguntanomiLogic.getPreguntaNomis().remove(this.preguntanomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.preguntanomis.remove(this.preguntanomi);				
					}
					
					
					((PreguntaNomiModel) this.jTableDatosPreguntaNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPreguntaNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPreguntaNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPreguntaNomi) {
			
			if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPreguntaNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPreguntaNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPreguntaNomi(this.preguntanomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.preguntanomiConstantesFunciones.cargarid_empresaPreguntaNomi || this.preguntanomiConstantesFunciones.event_dependid_empresaPreguntaNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.preguntanomi.getid_empresa());
									//this.inicializarActualizarBindingPreguntaNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(preguntanomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(preguntanomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.preguntanomi.getid_empresa(),false,"Formulario");

					//FactorNomi
					if(!this.preguntanomiConstantesFunciones.cargarid_factor_nomiPreguntaNomi || this.preguntanomiConstantesFunciones.event_dependid_factor_nomiPreguntaNomi) {
						//this.cargarCombosFactorNomisForeignKeyLista(" where id="+this.preguntanomi.getid_factor_nomi());
									//this.inicializarActualizarBindingPreguntaNomi(false,false);
						this.factornomisForeignKey=new ArrayList<FactorNomi>();

						if(preguntanomi.getFactorNomi()!=null) {
							this.factornomisForeignKey.add(preguntanomi.getFactorNomi());
						}

						this.addItemDefectoCombosForeignKeyFactorNomi();
						this.cargarCombosFrameFactorNomisForeignKey("Todos");
					}
					this.setActualFactorNomiForeignKey(this.preguntanomi.getid_factor_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPreguntaNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPreguntaNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreguntaNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPreguntaNomi(PreguntaNomi preguntanomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPreguntaNomi(preguntanomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPreguntaNomi(PreguntaNomi preguntanomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPreguntaNomi(preguntanomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPreguntaNomi(preguntanomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPreguntaNomi(preguntanomi);
	}
	
	public void setVariablesObjetoActualToFormularioPreguntaNomi(PreguntaNomi preguntanomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.setText(preguntanomi.getId().toString());
			this.jInternalFrameDetalleFormPreguntaNomi.jTextAreapreguntaPreguntaNomi.setText(preguntanomi.getpregunta());
			this.jInternalFrameDetalleFormPreguntaNomi.jTextFieldordenPreguntaNomi.setText(preguntanomi.getorden().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PreguntaNomi preguntanomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,preguntanomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PreguntaNomi preguntanomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				preguntanomiLocal=this.preguntanomi;
			} else {
				preguntanomiLocal=this.preguntanomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(preguntanomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPreguntaNomi(preguntanomiLocal,true);
					
					if(preguntanomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(preguntanomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(preguntanomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPreguntaNomi(PreguntaNomi preguntanomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPreguntaNomi(preguntanomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(preguntanomi);
	}
	
	public void setVariablesFormularioToObjetoActualPreguntaNomi(PreguntaNomi preguntanomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPreguntaNomi(preguntanomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPreguntaNomi(PreguntaNomi preguntanomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.getText()==null || this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.getText()=="" || this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.setText("0");
			}

			if(conColumnasBase) {preguntanomi.setId(Long.parseLong(this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaNomi.jLabelIdPreguntaNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			preguntanomi.setpregunta(this.jInternalFrameDetalleFormPreguntaNomi.jTextAreapreguntaPreguntaNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaNomiConstantesFunciones.LABEL_PREGUNTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaNomi.jLabelpreguntaPreguntaNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			preguntanomi.setorden(Integer.parseInt(this.jInternalFrameDetalleFormPreguntaNomi.jTextFieldordenPreguntaNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaNomiConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaNomi.jLabelordenPreguntaNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPreguntaNomi(PreguntaNomi preguntanomiBean,PreguntaNomi preguntanomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && preguntanomiBean.getid_factor_nomi()!=null && !preguntanomiBean.getid_factor_nomi().equals(-1L))) {preguntanomi.setid_factor_nomi(preguntanomiBean.getid_factor_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPreguntaNomi(PreguntaNomi preguntanomiOrigen,PreguntaNomi preguntanomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && preguntanomiOrigen.getId()!=null && !preguntanomiOrigen.getId().equals(0L))) {preguntanomi.setId(preguntanomiOrigen.getId());}}
			if(conDefault || (!conDefault && preguntanomiOrigen.getid_factor_nomi()!=null && !preguntanomiOrigen.getid_factor_nomi().equals(-1L))) {preguntanomi.setid_factor_nomi(preguntanomiOrigen.getid_factor_nomi());}
			if(conDefault || (!conDefault && preguntanomiOrigen.getpregunta()!=null && !preguntanomiOrigen.getpregunta().equals(""))) {preguntanomi.setpregunta(preguntanomiOrigen.getpregunta());}
			if(conDefault || (!conDefault && preguntanomiOrigen.getorden()!=null && !preguntanomiOrigen.getorden().equals(0))) {preguntanomi.setorden(preguntanomiOrigen.getorden());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPreguntaNomi(PreguntaNomi preguntanomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.setText(preguntanomi.getId().toString());
			this.jInternalFrameDetalleFormPreguntaNomi.jTextAreapreguntaPreguntaNomi.setText(preguntanomi.getpregunta());
			this.jInternalFrameDetalleFormPreguntaNomi.jTextFieldordenPreguntaNomi.setText(preguntanomi.getorden().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPreguntaNomi(PreguntaNomiBean preguntanomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.setText(preguntanomiBean.getId().toString());
			this.jInternalFrameDetalleFormPreguntaNomi.jTextAreapreguntaPreguntaNomi.setText(preguntanomiBean.getpregunta());
			this.jInternalFrameDetalleFormPreguntaNomi.jTextFieldordenPreguntaNomi.setText(preguntanomiBean.getorden().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPreguntaNomi(PreguntaNomiParameterReturnGeneral preguntanomiReturnGeneral,PreguntaNomiBean preguntanomiBean,Boolean conDefault) throws Exception { 
		try {
			PreguntaNomi preguntanomiLocal=new PreguntaNomi();
			
			preguntanomiLocal=preguntanomiReturnGeneral.getPreguntaNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && preguntanomiLocal.getId()!=null && !preguntanomiLocal.getId().equals(0L))) {preguntanomiBean.setId(preguntanomiLocal.getId());}}
			if(conDefault || (!conDefault && preguntanomiLocal.getid_factor_nomi()!=null && !preguntanomiLocal.getid_factor_nomi().equals(-1L))) {preguntanomiBean.setid_factor_nomi(preguntanomiLocal.getid_factor_nomi());}
			if(conDefault || (!conDefault && preguntanomiLocal.getpregunta()!=null && !preguntanomiLocal.getpregunta().equals(""))) {preguntanomiBean.setpregunta(preguntanomiLocal.getpregunta());}
			if(conDefault || (!conDefault && preguntanomiLocal.getorden()!=null && !preguntanomiLocal.getorden().equals(0))) {preguntanomiBean.setorden(preguntanomiLocal.getorden());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPreguntaNomiGenerico(Long idPreguntaNomiSeleccionado,JComboBox jComboBoxPreguntaNomi,List<PreguntaNomi> preguntanomisLocal)throws Exception {
		try {
			PreguntaNomi  preguntanomiTemp=null;

			for(PreguntaNomi preguntanomiAux:preguntanomisLocal) {
				if(preguntanomiAux.getId()!=null && preguntanomiAux.getId().equals(idPreguntaNomiSeleccionado)) {
					preguntanomiTemp=preguntanomiAux;
					break;
				}
			}

			jComboBoxPreguntaNomi.setSelectedItem(preguntanomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPreguntaNomiGenerico(JComboBox jComboBoxPreguntaNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPreguntaNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPreguntaNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPreguntaNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPreguntaNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("FormatoNomiPreguntaNomi")) {
			jButtonFormatoNomiPreguntaNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetalleEvaluacionNomi")) {
			jButtonDetalleEvaluacionNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			preguntanomi=(PreguntaNomi) preguntanomiLogic.getPreguntaNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			preguntanomi =(PreguntaNomi) preguntanomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!preguntanomi.getIsNew() && !preguntanomi.getIsChanged() && !preguntanomi.getIsDeleted()) {
				sDescripcion=preguntanomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=preguntanomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("FactorNomi")) {
			//sDescripcion=this.getActualFactorNomiForeignKeyDescripcion((Long)value);
			if(!preguntanomi.getIsNew() && !preguntanomi.getIsChanged() && !preguntanomi.getIsDeleted()) {
				sDescripcion=preguntanomi.getfactornomi_descripcion();
			} else {
				//sDescripcion=this.getActualFactorNomiForeignKeyDescripcion((Long)value);
				sDescripcion=preguntanomi.getfactornomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PreguntaNomi preguntanomiRow=new PreguntaNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			preguntanomiRow=(PreguntaNomi) preguntanomiLogic.getPreguntaNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			preguntanomiRow=(PreguntaNomi) preguntanomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PreguntaNomi preguntanomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPreguntaNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntanomi = (PreguntaNomi)this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.preguntanomi = (PreguntaNomi)this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(preguntanomi!=null) {
						this.preguntanomi = preguntanomi;
					} else {
						this.preguntanomi = new PreguntaNomi();
					}
				}

				if(this.isTienePermisosFormatoNomiPreguntaNomi && this.permiteMantenimiento(this.preguntanomi)) {
					FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formatonomipreguntanomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup;
					} else {
						formatonomipreguntanomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame;
					}

					List<PreguntaNomi> preguntanomis=new ArrayList<PreguntaNomi>();
					preguntanomis.add(this.preguntanomi);
					if(!esRelacionado) {
						//formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(false);
						//formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formatonomipreguntanomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPreguntaNomi.cargarFormatoNomiPreguntaNomiBeanSwingJInternalFrame(preguntanomis,this.preguntanomi,formatonomipreguntanomiBeanSwingJInternalFrame,/*conInicializar,*/formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getConGuardarRelaciones(),formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
					formatonomipreguntanomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiPreguntaNomi("no_relacionado");

						formatonomipreguntanomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormatoNomiPreguntaNomiConstantesFunciones.ITAMANIOFILATABLA + (FormatoNomiPreguntaNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						formatonomipreguntanomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPreguntaNomi=(TitledBorder)this.jScrollPanelDatosPreguntaNomi.getBorder();
						TitledBorder titledBorderFormatoNomiPreguntaNomi=(TitledBorder)formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();

						titledBorderFormatoNomiPreguntaNomi.setTitle(titledBorderPreguntaNomi.getTitle() + " -> Formato Nomi Pregunta Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formatonomipreguntanomiBeanSwingJInternalFrame);
						}

						formatonomipreguntanomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formatonomipreguntanomiBeanSwingJInternalFrame);

						formatonomipreguntanomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.preguntanomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formato Nomi Pregunta Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetalleEvaluacionNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PreguntaNomi preguntanomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPreguntaNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntanomi = (PreguntaNomi)this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.preguntanomi = (PreguntaNomi)this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(preguntanomi!=null) {
						this.preguntanomi = preguntanomi;
					} else {
						this.preguntanomi = new PreguntaNomi();
					}
				}

				if(this.isTienePermisosDetalleEvaluacionNomi && this.permiteMantenimiento(this.preguntanomi)) {
					DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup=new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleevaluacionnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup;
					} else {
						detalleevaluacionnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame;
					}

					List<PreguntaNomi> preguntanomis=new ArrayList<PreguntaNomi>();
					preguntanomis.add(this.preguntanomi);
					if(!esRelacionado) {
						//detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(false);
						//detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleevaluacionnomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPreguntaNomi.cargarDetalleEvaluacionNomiBeanSwingJInternalFrame(preguntanomis,this.preguntanomi,detalleevaluacionnomiBeanSwingJInternalFrame,/*conInicializar,*/detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getConGuardarRelaciones(),detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
					detalleevaluacionnomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleevaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionNomi("no_relacionado");

						detalleevaluacionnomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleEvaluacionNomiConstantesFunciones.ITAMANIOFILATABLA + (DetalleEvaluacionNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleevaluacionnomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPreguntaNomi=(TitledBorder)this.jScrollPanelDatosPreguntaNomi.getBorder();
						TitledBorder titledBorderDetalleEvaluacionNomi=(TitledBorder)detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.getBorder();

						titledBorderDetalleEvaluacionNomi.setTitle(titledBorderPreguntaNomi.getTitle() + " -> Detalle Evaluacion Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleevaluacionnomiBeanSwingJInternalFrame);
						}

						detalleevaluacionnomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleevaluacionnomiBeanSwingJInternalFrame);

						detalleevaluacionnomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.preguntanomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Evaluacion Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPreguntaNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoPreguntaNomi && this.isPermisoNuevoPreguntaNomi));			
			this.jButtonDuplicarPreguntaNomi.setVisible((this.isVisibilidadCeldaDuplicarPreguntaNomi && this.isPermisoDuplicarPreguntaNomi));			
			this.jButtonCopiarPreguntaNomi.setVisible((this.isVisibilidadCeldaCopiarPreguntaNomi && this.isPermisoCopiarPreguntaNomi));
			this.jButtonVerFormPreguntaNomi.setVisible((this.isVisibilidadCeldaVerFormPreguntaNomi && this.isPermisoVerFormPreguntaNomi));
			
			this.jButtonAbrirOrderByPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenPreguntaNomi && this.isPermisoOrdenPreguntaNomi));			
			
			this.jButtonNuevoRelacionesPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi && this.isPermisoNuevoPreguntaNomi));			
			this.jButtonNuevoGuardarCambiosPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoPreguntaNomi && this.isPermisoNuevoPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi));
			
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonModificarPreguntaNomi.setVisible((this.isVisibilidadCeldaModificarPreguntaNomi && this.isPermisoActualizarPreguntaNomi));	
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonActualizarPreguntaNomi.setVisible((this.isVisibilidadCeldaActualizarPreguntaNomi && this.isPermisoActualizarPreguntaNomi));	
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonEliminarPreguntaNomi.setVisible((this.isVisibilidadCeldaEliminarPreguntaNomi && this.isPermisoEliminarPreguntaNomi));
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonCancelarPreguntaNomi.setVisible(this.isVisibilidadCeldaCancelarPreguntaNomi);							
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoPreguntaNomi && this.isPermisoNuevoPreguntaNomi));						
			this.jButtonDuplicarToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaDuplicarPreguntaNomi && this.isPermisoDuplicarPreguntaNomi));						
			this.jButtonCopiarToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaCopiarPreguntaNomi && this.isPermisoCopiarPreguntaNomi));			
			this.jButtonVerFormToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaVerFormPreguntaNomi && this.isPermisoVerFormPreguntaNomi));			
			this.jButtonAbrirOrderByToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenPreguntaNomi && this.isPermisoOrdenPreguntaNomi));
			this.jButtonNuevoRelacionesToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi && this.isPermisoNuevoPreguntaNomi));			
			this.jButtonNuevoGuardarCambiosToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoPreguntaNomi && this.isPermisoNuevoPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi));			
			
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonModificarToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaModificarPreguntaNomi && this.isPermisoActualizarPreguntaNomi));	
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonActualizarToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaActualizarPreguntaNomi  && this.isPermisoActualizarPreguntaNomi));	
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonEliminarToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaEliminarPreguntaNomi && this.isPermisoEliminarPreguntaNomi));
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonCancelarToolBarPreguntaNomi.setVisible(this.isVisibilidadCeldaCancelarPreguntaNomi);				
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoPreguntaNomi && this.isPermisoNuevoPreguntaNomi));			
			this.jMenuItemDuplicarPreguntaNomi.setVisible((this.isVisibilidadCeldaDuplicarPreguntaNomi && this.isPermisoDuplicarPreguntaNomi));			
			this.jMenuItemCopiarPreguntaNomi.setVisible((this.isVisibilidadCeldaCopiarPreguntaNomi && this.isPermisoCopiarPreguntaNomi));			
			this.jMenuItemVerFormPreguntaNomi.setVisible((this.isVisibilidadCeldaVerFormPreguntaNomi && this.isPermisoVerFormPreguntaNomi));			
			this.jMenuItemAbrirOrderByPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenPreguntaNomi && this.isPermisoOrdenPreguntaNomi));			
			//this.jMenuItemMostrarOcultarPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenPreguntaNomi && this.isPermisoOrdenPreguntaNomi));
			this.jMenuItemDetalleAbrirOrderByPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenPreguntaNomi && this.isPermisoOrdenPreguntaNomi));			
			//this.jMenuItemDetalleMostrarOcultarPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenPreguntaNomi && this.isPermisoOrdenPreguntaNomi));			
			this.jMenuItemNuevoRelacionesPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi && this.isPermisoNuevoPreguntaNomi));			
			this.jMenuItemNuevoGuardarCambiosPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoPreguntaNomi && this.isPermisoNuevoPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi));									
			
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemModificarPreguntaNomi.setVisible((this.isVisibilidadCeldaModificarPreguntaNomi && this.isPermisoActualizarPreguntaNomi));	
			this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemActualizarPreguntaNomi.setVisible((this.isVisibilidadCeldaActualizarPreguntaNomi && this.isPermisoActualizarPreguntaNomi));	
			this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemEliminarPreguntaNomi.setVisible((this.isVisibilidadCeldaEliminarPreguntaNomi && this.isPermisoEliminarPreguntaNomi));
			this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemCancelarPreguntaNomi.setVisible(this.isVisibilidadCeldaCancelarPreguntaNomi);				
			}
			
			this.jMenuItemGuardarCambiosPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi));						
			this.jMenuItemGuardarCambiosTablaPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPreguntaNomi=this.jButtonNuevoPreguntaNomi.isVisible();
			this.isVisibilidadCeldaDuplicarPreguntaNomi=this.jButtonDuplicarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaCopiarPreguntaNomi=this.jButtonCopiarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaVerFormPreguntaNomi=this.jButtonVerFormPreguntaNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenPreguntaNomi=this.jButtonAbrirOrderByPreguntaNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=this.jButtonNuevoRelacionesPreguntaNomi.isVisible();
			this.isVisibilidadCeldaModificarPreguntaNomi=this.jButtonModificarPreguntaNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			this.isVisibilidadCeldaActualizarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jButtonActualizarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaEliminarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jButtonEliminarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaCancelarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jButtonCancelarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaGuardarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosPreguntaNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=this.jButtonGuardarCambiosTablaPreguntaNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPreguntaNomi=this.jButtonNuevoToolBarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=this.jButtonNuevoRelacionesToolBarPreguntaNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			this.isVisibilidadCeldaModificarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jButtonModificarToolBarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaActualizarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jButtonActualizarToolBarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaEliminarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jButtonEliminarToolBarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaCancelarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jButtonCancelarToolBarPreguntaNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPreguntaNomi=this.jButtonGuardarCambiosToolBarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=this.jButtonGuardarCambiosTablaToolBarPreguntaNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPreguntaNomi=this.jMenuItemNuevoPreguntaNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=this.jMenuItemNuevoRelacionesPreguntaNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			this.isVisibilidadCeldaModificarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemModificarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaActualizarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemActualizarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaEliminarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemEliminarPreguntaNomi.isVisible();
			this.isVisibilidadCeldaCancelarPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemCancelarPreguntaNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPreguntaNomi=this.jMenuItemGuardarCambiosPreguntaNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=this.jMenuItemGuardarCambiosTablaPreguntaNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPreguntaNomi(Boolean esInicializar) {
		if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.preguntanomiSessionBean.getConGuardarRelaciones()) {
				//if(this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPreguntaNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualPreguntaNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPreguntaNomi() {
		this.jButtonNuevoPreguntaNomi.setVisible(this.isPermisoNuevoPreguntaNomi);			
		this.jButtonDuplicarPreguntaNomi.setVisible(this.isPermisoDuplicarPreguntaNomi);			
		this.jButtonCopiarPreguntaNomi.setVisible(this.isPermisoCopiarPreguntaNomi);			
		this.jButtonVerFormPreguntaNomi.setVisible(this.isPermisoVerFormPreguntaNomi);			
		
		this.jButtonAbrirOrderByPreguntaNomi.setVisible(this.isPermisoOrdenPreguntaNomi);					
		
		this.jButtonNuevoRelacionesPreguntaNomi.setVisible(this.isPermisoNuevoPreguntaNomi);			
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonModificarPreguntaNomi.setVisible(this.isPermisoActualizarPreguntaNomi);	
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonActualizarPreguntaNomi.setVisible(this.isPermisoActualizarPreguntaNomi);	
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonEliminarPreguntaNomi.setVisible(this.isPermisoEliminarPreguntaNomi);
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonCancelarPreguntaNomi.setVisible(this.isVisibilidadCeldaCancelarPreguntaNomi);						
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosPreguntaNomi.setVisible(this.isPermisoGuardarCambiosPreguntaNomi);							
		}
		
		this.jButtonGuardarCambiosTablaPreguntaNomi.setVisible(this.isPermisoActualizarPreguntaNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePreguntaNomi() {
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonModificarPreguntaNomi.setVisible(this.isPermisoActualizarPreguntaNomi);	
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonActualizarPreguntaNomi.setVisible(this.isPermisoActualizarPreguntaNomi);	
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonEliminarPreguntaNomi.setVisible(this.isPermisoEliminarPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonCancelarPreguntaNomi.setVisible(this.isVisibilidadCeldaCancelarPreguntaNomi);							
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarPreguntaNomi && this.isPermisoGuardarCambiosPreguntaNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPreguntaNomi() {
		if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPreguntaNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPreguntaNomi() {
	}
	
	public void jTableDatosPreguntaNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPreguntaNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.getpreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntanomi==null) {
						this.preguntanomi = new PreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
				}

				if(this.preguntanomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.preguntanomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPreguntaNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPreguntaNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaNomi(this.getpreguntanomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.preguntanomiLogic.getConnexion());

				if(this.preguntanomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.preguntanomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaNomi=(TitledBorder)this.jScrollPanelDatosPreguntaNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPreguntaNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.getpreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntanomi==null) {
						this.preguntanomi = new PreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
				}

				if(this.preguntanomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.preguntanomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_factor_nomiPreguntaNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactornomi=true;

			idTienePermisofactornomi=this.tienePermisosUsuarioEnPaginaWebPreguntaNomi(FactorNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisofactornomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaNomi(this.getpreguntanomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);

				this.factornomiBeanSwingJInternalFrame=new FactorNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.factornomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.factornomiBeanSwingJInternalFrame.getFactorNomiLogic().setConnexion(this.preguntanomiLogic.getConnexion());

				if(this.preguntanomi.getid_factor_nomi()!=null) {
					this.factornomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.factornomiBeanSwingJInternalFrame.setIdActual(this.preguntanomi.getid_factor_nomi());
					this.factornomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.factornomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.factornomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactorNomi();
				}

				JInternalFrameBase jinternalFrame =this.factornomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaNomi=(TitledBorder)this.jScrollPanelDatosPreguntaNomi.getBorder();
				TitledBorder titledBorderfactornomi=(TitledBorder)this.factornomiBeanSwingJInternalFrame.jScrollPanelDatosFactorNomi.getBorder();

				titledBorderfactornomi.setTitle(titledBorderPreguntaNomi.getTitle() + " -> Factor Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_factor_nomiPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.getpreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntanomi==null) {
						this.preguntanomi = new PreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
				}

				if(this.preguntanomi.getid_factor_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factor_nomi = "+this.preguntanomi.getid_factor_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpreguntaPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.getpreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntanomi==null) {
						this.preguntanomi = new PreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
				}

				if(this.preguntanomi.getpregunta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pregunta like '%"+this.preguntanomi.getpregunta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.getpreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntanomi==null) {
						this.preguntanomi = new PreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);
				}

				if(this.preguntanomi.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.preguntanomi.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaNomi(false,false);

			this.getPreguntaNomisFK_IdEmpresa();

			this.inicializarActualizarBindingPreguntaNomi(false);

			//if(PreguntaNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFactorNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaNomi(false,false);

			this.getPreguntaNomisFK_IdFactorNomi();

			this.inicializarActualizarBindingPreguntaNomi(false);

			//if(PreguntaNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePreguntaNomi() {
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
		

		if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
			this.jInternalFrameDetalleFormPreguntaNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormPreguntaNomi.dispose();
			this.jInternalFrameDetalleFormPreguntaNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPreguntaNomi!=null) {
			this.jInternalFrameReporteDinamicoPreguntaNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPreguntaNomi.dispose();
			this.jInternalFrameReporteDinamicoPreguntaNomi=null;
		}
		
		if(this.jInternalFrameImportacionPreguntaNomi!=null) {
			this.jInternalFrameImportacionPreguntaNomi.setVisible(false);	    			
			this.jInternalFrameImportacionPreguntaNomi.dispose();
			this.jInternalFrameImportacionPreguntaNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPreguntaNomi();
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoPreguntaNomi")) {
				jButtonNuevoPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPreguntaNomi")) {
				jButtonDuplicarPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPreguntaNomi")) {
				jButtonCopiarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormPreguntaNomi")) {
				jButtonVerFormPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPreguntaNomi")) {
				jButtonNuevoPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPreguntaNomi")) {
				jButtonDuplicarPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPreguntaNomi")) {
				jButtonNuevoPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPreguntaNomi")) {
				jButtonDuplicarPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPreguntaNomi")) {
				jButtonNuevoPreguntaNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPreguntaNomi")) {
				jButtonNuevoPreguntaNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPreguntaNomi")) {
				jButtonNuevoPreguntaNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPreguntaNomi")) {
				jButtonModificarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPreguntaNomi")) {
				jButtonModificarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPreguntaNomi")) {
				jButtonModificarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPreguntaNomi")) {
				jButtonActualizarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPreguntaNomi")) {
				jButtonActualizarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPreguntaNomi")) {
				jButtonActualizarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarPreguntaNomi")) {
				jButtonEliminarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPreguntaNomi")) {
				jButtonEliminarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPreguntaNomi")) {
				jButtonEliminarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarPreguntaNomi")) {
				jButtonCancelarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPreguntaNomi")) {
				jButtonCancelarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPreguntaNomi")) {
				jButtonCancelarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarPreguntaNomi")) {
				jButtonCerrarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPreguntaNomi")) {
				jButtonCerrarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPreguntaNomi")) {
				jButtonCerrarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPreguntaNomi")) {
				jButtonMostrarOcultarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPreguntaNomi")) {
				jButtonCancelarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPreguntaNomi")) {
				jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPreguntaNomi")) {
				jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPreguntaNomi")) {
				jButtonCopiarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPreguntaNomi")) {
				jButtonVerFormPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPreguntaNomi")) {
				jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPreguntaNomi")) {
				jButtonCopiarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPreguntaNomi")) {
				jButtonVerFormPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPreguntaNomi")) {
				jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPreguntaNomi")) {
				jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPreguntaNomi")) {
				jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPreguntaNomi")) {
				jButtonRecargarInformacionPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPreguntaNomi")) {
				jButtonRecargarInformacionPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPreguntaNomi")) {
				jButtonRecargarInformacionPreguntaNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPreguntaNomi")) {
				jButtonAnterioresPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPreguntaNomi")) {
				jButtonAnterioresPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePreguntaNomi")) {
				jButtonAnterioresPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPreguntaNomi")) {
				jButtonSiguientesPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPreguntaNomi")) {
				jButtonSiguientesPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPreguntaNomi")) {
				jButtonSiguientesPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPreguntaNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByPreguntaNomi")) {
				jButtonAbrirOrderByPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPreguntaNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarPreguntaNomi")) {
				jButtonMostrarOcultarPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPreguntaNomi")) {
				jButtonNuevoGuardarCambiosPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPreguntaNomi")) {
				jButtonNuevoGuardarCambiosPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPreguntaNomi")) {
				jButtonNuevoGuardarCambiosPreguntaNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPreguntaNomi")) {
				jButtonCerrarReporteDinamicoPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPreguntaNomi")) {
				jButtonGenerarReporteDinamicoPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPreguntaNomi")) {
				
				jButtonGenerarExcelReporteDinamicoPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPreguntaNomi")) {
				jButtonCerrarImportacionPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPreguntaNomi")) {
				
				jButtonGenerarImportacionPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPreguntaNomi")) {
				
				jButtonAbrirImportacionPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPreguntaNomi")) {
				jComboBoxTiposAccionesPreguntaNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPreguntaNomi")) {
				jComboBoxTiposRelacionesPreguntaNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPreguntaNomi")) {
				jComboBoxTiposAccionesPreguntaNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPreguntaNomi")) {
				
				jComboBoxTiposSeleccionarPreguntaNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPreguntaNomi")) {
				jTextFieldValorCampoGeneralPreguntaNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPreguntaNomi")) {
				jButtonAbrirOrderByPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPreguntaNomi")) {
				jButtonAbrirOrderByPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPreguntaNomi")) {
				jButtonCerrarOrderByPreguntaNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPreguntaNomiBusqueda")) {
				this.jButtonidPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPreguntaNomiUpdate")) {
				this.jButtonid_empresaPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPreguntaNomiBusqueda")) {
				this.jButtonid_empresaPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_factor_nomiPreguntaNomiUpdate")) {
				this.jButtonid_factor_nomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_factor_nomiPreguntaNomiBusqueda")) {
				this.jButtonid_factor_nomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("preguntaPreguntaNomiBusqueda")) {
				this.jButtonpreguntaPreguntaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenPreguntaNomiBusqueda")) {
				this.jButtonordenPreguntaNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdFactorNomiPreguntaNomi")) {
				this.jButtonFK_IdFactorNomiPreguntaNomiActionPerformed(evt);
			}
			
			;
			
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPreguntaNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaNomiActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				


				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PreguntaNomi preguntanomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				preguntanomiLocal=this.preguntanomi;
			} else {
				preguntanomiLocal=this.preguntanomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
							
				
				


				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaNomiActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
								
						
				


				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
								
				
				


				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
							
				
				


				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
								
				
				


				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaNomiActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPreguntaNomi")) {
					jCheckBoxSeleccionarTodosPreguntaNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPreguntaNomi")) {
					jCheckBoxSeleccionadosPreguntaNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPreguntaNomi")) {
					
				}
				
				


				
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
												
				
				


				
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaNomiActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntanomi);
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntanomiAnterior =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPreguntaNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPreguntaNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPreguntaNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.preguntanomi =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.preguntanomi =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.preguntanomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPreguntaNomi")) {
				
				}
				
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPreguntaNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPreguntaNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPreguntaNomi")) {
			
			}
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPreguntaNomi();
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
			if(sTipo.equals("NuevoPreguntaNomi")) {
				jButtonNuevoPreguntaNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPreguntaNomi")) {
				jButtonDuplicarPreguntaNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPreguntaNomi")) {
				jButtonCopiarPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPreguntaNomi")) {
				jButtonVerFormPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPreguntaNomi")) {
				jButtonNuevoPreguntaNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPreguntaNomi")) {
				jButtonModificarPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPreguntaNomi")) {
				jButtonActualizarPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPreguntaNomi")) {
				jButtonEliminarPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPreguntaNomi")) {
				jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPreguntaNomi")) {
				jButtonCancelarPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPreguntaNomi")) {
				jButtonCerrarPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPreguntaNomi")) {
				jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPreguntaNomi")) {
				jButtonNuevoGuardarCambiosPreguntaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPreguntaNomi")) {
				jButtonAbrirOrderByPreguntaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPreguntaNomi")) {
				jButtonRecargarInformacionPreguntaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPreguntaNomi")) {
				jButtonAnterioresPreguntaNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPreguntaNomi")) {
				jButtonSiguientesPreguntaNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPreguntaNomiBusqueda")) {
				this.jButtonidPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPreguntaNomiUpdate")) {
				this.jButtonid_empresaPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPreguntaNomiBusqueda")) {
				this.jButtonid_empresaPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_factor_nomiPreguntaNomiUpdate")) {
				this.jButtonid_factor_nomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_factor_nomiPreguntaNomiBusqueda")) {
				this.jButtonid_factor_nomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("preguntaPreguntaNomiBusqueda")) {
				this.jButtonpreguntaPreguntaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenPreguntaNomiBusqueda")) {
				this.jButtonordenPreguntaNomiBusquedaActionPerformed(evt);
			}
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPreguntaNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePreguntaNomi")) {
				closingInternalFramePreguntaNomi();
				
			} else if(sTipo.equals("jButtonCancelarPreguntaNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormPreguntaNomi = (JInternalFrameBase)evt.getSource();
	            	
	            PreguntaNomiBeanSwingJInternalFrame jInternalFrameParent=(PreguntaNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormPreguntaNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPreguntaNomiActionPerformed(null);
			}
			
			PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.preguntanomi,new Object(),this.preguntanomiParameterGeneral,this.preguntanomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPreguntaNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPreguntaNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPreguntaNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.preguntanomi)) {
			if(!esControlTabla) {
				if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);			
				}
				
				if(this.preguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPreguntaNomi(this.preguntanomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.preguntanomiReturnGeneral=preguntanomiLogic.procesarEventosPreguntaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntanomiLogic.getPreguntaNomis(),this.preguntanomi,this.preguntanomiParameterGeneral,this.isEsNuevoPreguntaNomi,classes);//this.preguntanomiLogic.getPreguntaNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPreguntaNomi(this.preguntanomiReturnGeneral,this.preguntanomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.preguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPreguntaNomi(classes,this.preguntanomiReturnGeneral,this.preguntanomiBean,false);
					}
						
					if(this.preguntanomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPreguntaNomi(this.preguntanomiReturnGeneral.getPreguntaNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPreguntaNomi(this.preguntanomiReturnGeneral.getPreguntaNomi());	
					}
						
					if(this.preguntanomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPreguntaNomi(this.preguntanomiReturnGeneral.getPreguntaNomi(),classes);//this.preguntanomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPreguntaNomi(this.preguntanomi,classes);//this.preguntanomiBean);									
				}
			
				if(PreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPreguntaNomi(this.preguntanomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaNomi(this.preguntanomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.preguntanomiAnterior!=null) {
						this.preguntanomi=this.preguntanomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.preguntanomiReturnGeneral=preguntanomiLogic.procesarEventosPreguntaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntanomiLogic.getPreguntaNomis(),this.preguntanomi,this.preguntanomiParameterGeneral,this.isEsNuevoPreguntaNomi,classes);//this.preguntanomiLogic.getPreguntaNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.preguntanomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.preguntanomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.preguntanomiReturnGeneral.getPreguntaNomi(),preguntanomiLogic.getPreguntaNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.preguntanomiReturnGeneral.getPreguntaNomi(),this.preguntanomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPreguntaNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosPreguntaNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPreguntaNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosPreguntaNomi() throws Exception {
		
		PreguntaNomiModel preguntanomiModel=(PreguntaNomiModel)this.jTableDatosPreguntaNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			preguntanomiModel.preguntanomis=this.preguntanomiLogic.getPreguntaNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			preguntanomiModel.preguntanomis=this.preguntanomis;
		}
		
		
		((PreguntaNomiModel) this.jTableDatosPreguntaNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPreguntaNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpreguntanomiAnterior(),this.preguntanomiLogic.getPreguntaNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpreguntanomiAnterior(),this.preguntanomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPreguntaNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPreguntaNomi(PreguntaNomi preguntanomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiPreguntaNomi.class)) {
					this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(preguntanomi.getFormatoNomiPreguntaNomis());
					this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionNomi.class)) {
					this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(preguntanomi.getDetalleEvaluacionNomis());
					this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntanomi,new Object(),generalEntityParameterGeneral,this.preguntanomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.preguntanomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PreguntaNomiConstantesFunciones.getClassesRelationshipsOfPreguntaNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PreguntaNomiConstantesFunciones.getClassesRelationshipsFromStringsOfPreguntaNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPreguntaNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntanomi,new Object(),generalEntityParameterGeneral,this.preguntanomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPreguntaNomi(PreguntaNomiBean preguntanomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiPreguntaNomi.class)) {
					this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(preguntanomi.getFormatoNomiPreguntaNomis());
					this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionNomi.class)) {
					this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(preguntanomi.getDetalleEvaluacionNomis());
					this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPreguntaNomi(ArrayList<Classe> classes,PreguntaNomiReturnGeneral preguntanomiReturnGeneral,PreguntaNomiBean preguntanomiBean,Boolean conDefault) throws Exception {
		
			this.preguntanomiBean.setFormatoNomiPreguntaNomis(preguntanomiReturnGeneral.getPreguntaNomi().getFormatoNomiPreguntaNomis());
			this.preguntanomiBean.setDetalleEvaluacionNomis(preguntanomiReturnGeneral.getPreguntaNomi().getDetalleEvaluacionNomis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPreguntaNomi(PreguntaNomi preguntanomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiPreguntaNomi.class)) {
					preguntanomi.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionNomi.class)) {
					preguntanomi.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.preguntanomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPreguntaNomi = new PreguntaNomiDetalleFormJInternalFrame(jDesktopPane,this.preguntanomiSessionBean.getConGuardarRelaciones(),this.preguntanomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.setVisible(false);
		this.jInternalFrameDetalleFormPreguntaNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormPreguntaNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPreguntaNomi.preguntanomiLogic=this.preguntanomiLogic;
		
		this.cargarCombosFrameForeignKeyPreguntaNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePreguntaNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePreguntaNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPreguntaNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPreguntaNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPreguntaNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPreguntaNomi"));
		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonModificarPreguntaNomi.addActionListener(new ButtonActionListener(this,"ModificarPreguntaNomi"));

		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonModificarToolBarPreguntaNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarPreguntaNomi"));
					
		this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemModificarPreguntaNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarPreguntaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonActualizarPreguntaNomi.addActionListener (new ButtonActionListener(this,"ActualizarPreguntaNomi"));
		
		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonActualizarToolBarPreguntaNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPreguntaNomi"));
						
		this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemActualizarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPreguntaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonEliminarPreguntaNomi.addActionListener (new ButtonActionListener(this,"EliminarPreguntaNomi"));
		
		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonEliminarToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarPreguntaNomi"));
								
		this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemEliminarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPreguntaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonCancelarPreguntaNomi.addActionListener (new ButtonActionListener(this,"CancelarPreguntaNomi"));
		
		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonCancelarToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarPreguntaNomi"));
					
		this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemCancelarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPreguntaNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemDetalleCerrarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPreguntaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreguntaNomi"));
		
		
		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreguntaNomi"));
		
		
		
		this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPreguntaNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonidPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"idPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_empresaPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_empresaPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_factor_nomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_factor_nomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_factor_nomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_factor_nomiPreguntaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonpreguntaPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"preguntaPreguntaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonordenPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"ordenPreguntaNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPreguntaNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePreguntaNomi"));
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPreguntaNomi"));
		}
		
		this.jTableDatosPreguntaNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPreguntaNomi"));
		
		this.jTableDatosPreguntaNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPreguntaNomi"));
		
		this.jButtonNuevoPreguntaNomi.addActionListener(new ButtonActionListener(this,"NuevoPreguntaNomi"));
		
		this.jButtonDuplicarPreguntaNomi.addActionListener(new ButtonActionListener(this,"DuplicarPreguntaNomi"));
		
		this.jButtonCopiarPreguntaNomi.addActionListener(new ButtonActionListener(this,"CopiarPreguntaNomi"));
		
		this.jButtonVerFormPreguntaNomi.addActionListener(new ButtonActionListener(this,"VerFormPreguntaNomi"));
		
		
		this.jButtonNuevoToolBarPreguntaNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarPreguntaNomi"));
			
		this.jButtonDuplicarToolBarPreguntaNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPreguntaNomi"));
			
		this.jMenuItemNuevoPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPreguntaNomi"));
			
		this.jMenuItemDuplicarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPreguntaNomi"));		
		
		
		this.jButtonNuevoRelacionesPreguntaNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPreguntaNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarPreguntaNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPreguntaNomi"));
			
		this.jMenuItemNuevoRelacionesPreguntaNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPreguntaNomi"));		
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonModificarPreguntaNomi.addActionListener(new ButtonActionListener(this,"ModificarPreguntaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonModificarToolBarPreguntaNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarPreguntaNomi"));
			
			this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemModificarPreguntaNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarPreguntaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonActualizarPreguntaNomi.addActionListener (new ButtonActionListener(this,"ActualizarPreguntaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonActualizarToolBarPreguntaNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPreguntaNomi"));
				
			this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemActualizarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPreguntaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonEliminarPreguntaNomi.addActionListener (new ButtonActionListener(this,"EliminarPreguntaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonEliminarToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarPreguntaNomi"));
						
			this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemEliminarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPreguntaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonCancelarPreguntaNomi.addActionListener (new ButtonActionListener(this,"CancelarPreguntaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonCancelarToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarPreguntaNomi"));
			
			this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemCancelarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPreguntaNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPreguntaNomi"));		
		
		
		this.jButtonCerrarPreguntaNomi.addActionListener (new ButtonActionListener(this,"CerrarPreguntaNomi"));
		
		
		this.jButtonCerrarToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarPreguntaNomi"));
			
		this.jMenuItemCerrarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPreguntaNomi"));
			
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jMenuItemDetalleCerrarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPreguntaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosPreguntaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreguntaNomi"));
		}
		
		this.jButtonCopiarToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarPreguntaNomi"));
			
		this.jButtonVerFormToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarPreguntaNomi"));
		
		this.jMenuItemGuardarCambiosPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPreguntaNomi"));
			
		this.jMenuItemCopiarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPreguntaNomi"));		
		
		this.jMenuItemVerFormPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPreguntaNomi"));		
		
		
		this.jButtonGuardarCambiosTablaPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPreguntaNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPreguntaNomi"));
			
		this.jMenuItemGuardarCambiosTablaPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPreguntaNomi"));		
		
		
		
		this.jButtonRecargarInformacionPreguntaNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionPreguntaNomi"));
					
		this.jButtonRecargarInformacionToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPreguntaNomi"));
		
		this.jMenuItemRecargarInformacionPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPreguntaNomi"));		
		
		
		
		this.jButtonAnterioresPreguntaNomi.addActionListener (new ButtonActionListener(this,"AnterioresPreguntaNomi"));
		
		
		this.jButtonAnterioresToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPreguntaNomi"));
		
		this.jMenuItemAnterioresPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPreguntaNomi"));		
		
		
		this.jButtonSiguientesPreguntaNomi.addActionListener (new ButtonActionListener(this,"SiguientesPreguntaNomi"));
		
		
		this.jButtonSiguientesToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPreguntaNomi"));
			
		this.jMenuItemSiguientesPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPreguntaNomi"));
			
		this.jMenuItemAbrirOrderByPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPreguntaNomi"));
			
		this.jMenuItemMostrarOcultarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPreguntaNomi"));
			
		this.jMenuItemDetalleAbrirOrderByPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPreguntaNomi"));
			
		this.jMenuItemDetalleMostarOcultarPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPreguntaNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosPreguntaNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPreguntaNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPreguntaNomi"));
			
		this.jMenuItemNuevoGuardarCambiosPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPreguntaNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPreguntaNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPreguntaNomi"));

		this.jCheckBoxSeleccionadosPreguntaNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPreguntaNomi"));
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPreguntaNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesPreguntaNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesPreguntaNomi"));
			
		this.jComboBoxTiposAccionesPreguntaNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesPreguntaNomi"));
					
		this.jComboBoxTiposSeleccionarPreguntaNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPreguntaNomi"));
			
		this.jTextFieldValorCampoGeneralPreguntaNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPreguntaNomi"));		
		
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonidPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"idPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_empresaPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_empresaPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_factor_nomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_factor_nomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_factor_nomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_factor_nomiPreguntaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonpreguntaPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"preguntaPreguntaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonordenPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"ordenPreguntaNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdFactorNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"FK_IdFactorNomiPreguntaNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPreguntaNomi!=null) {
				this.jInternalFrameReporteDinamicoPreguntaNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreguntaNomi"));
				this.jInternalFrameReporteDinamicoPreguntaNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreguntaNomi"));
				this.jInternalFrameReporteDinamicoPreguntaNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreguntaNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoPreguntaNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreguntaNomi"));				
			//this.jButtonGenerarReporteDinamicoPreguntaNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreguntaNomi"));
			//this.jButtonGenerarExcelReporteDinamicoPreguntaNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreguntaNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPreguntaNomi!=null) {
				this.jInternalFrameImportacionPreguntaNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPreguntaNomi"));
				this.jInternalFrameImportacionPreguntaNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPreguntaNomi"));
				this.jInternalFrameImportacionPreguntaNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPreguntaNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPreguntaNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByPreguntaNomi"));
			
			this.jButtonAbrirOrderByToolBarPreguntaNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPreguntaNomi"));			
			
			if(this.jInternalFrameOrderByPreguntaNomi!=null) {
				this.jInternalFrameOrderByPreguntaNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPreguntaNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaNomi.jTabbedPaneRelacionesPreguntaNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPreguntaNomi"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFramePreguntaNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPreguntaNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPreguntaNomi = (JInternalFrameBase)event.getSource();
	            	
	            PreguntaNomiBeanSwingJInternalFrame jInternalFrameParent=(PreguntaNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormPreguntaNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPreguntaNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPreguntaNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPreguntaNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPreguntaNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPreguntaNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPreguntaNomi";
		inputMap = this.jButtonNuevoPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPreguntaNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPreguntaNomi";
		inputMap = this.jButtonNuevoRelacionesPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPreguntaNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPreguntaNomi";
		inputMap = this.jButtonModificarPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPreguntaNomi";
		inputMap = this.jButtonActualizarPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPreguntaNomi";
		inputMap = this.jButtonEliminarPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPreguntaNomi";
		inputMap = this.jButtonCancelarPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPreguntaNomi";
		inputMap = this.jButtonCerrarPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPreguntaNomi";
		inputMap = this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonGuardarCambiosPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPreguntaNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPreguntaNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPreguntaNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPreguntaNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPreguntaNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPreguntaNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPreguntaNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPreguntaNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonidPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"idPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_empresaPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_empresaPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_factor_nomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_factor_nomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonid_factor_nomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_factor_nomiPreguntaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonpreguntaPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"preguntaPreguntaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaNomi.jButtonordenPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"ordenPreguntaNomiBusqueda"));
		
		
		this.jButtonFK_IdFactorNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"FK_IdFactorNomiPreguntaNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPreguntaNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPreguntaNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPreguntaNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PreguntaNomi preguntanomiAux:this.preguntanomiLogic.getPreguntaNomis()) {
					preguntanomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaNomi preguntanomiAux:preguntanomis) {
					preguntanomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPreguntaNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPreguntaNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PreguntaNomi preguntanomiAux:this.preguntanomiLogic.getPreguntaNomis()) {
						preguntanomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreguntaNomi preguntanomiAux:preguntanomis) {
						preguntanomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PreguntaNomi preguntanomiAux:this.preguntanomiLogic.getPreguntaNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreguntaNomi preguntanomiAux:preguntanomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPreguntaNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPreguntaNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPreguntaNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPreguntaNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPreguntaNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPreguntaNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPreguntaNomi.getSelectedRows();
			
			PreguntaNomi preguntanomiLocal=new PreguntaNomi();
			
			//this.seleccionarTodosPreguntaNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntanomiLocal =(PreguntaNomi) this.preguntanomiLogic.getPreguntaNomis().toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					preguntanomiLocal =(PreguntaNomi) this.preguntanomis.toArray()[this.jTableDatosPreguntaNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				preguntanomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PreguntaNomi preguntanomiAux:this.preguntanomiLogic.getPreguntaNomis()) {
						preguntanomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreguntaNomi preguntanomiAux:preguntanomis) {
						preguntanomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPreguntaNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPreguntaNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPreguntaNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPreguntaNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPreguntaNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPreguntaNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPreguntaNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPreguntaNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPreguntaNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PreguntaNomi preguntanomiAux:this.preguntanomiLogic.getPreguntaNomis()) {
				
						if(sTipoSeleccionar.equals(PreguntaNomiConstantesFunciones.LABEL_PREGUNTA)) {
							existe=true;
							preguntanomiAux.setpregunta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreguntaNomiConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							preguntanomiAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaNomi preguntanomiAux:preguntanomis) {
					
						if(sTipoSeleccionar.equals(PreguntaNomiConstantesFunciones.LABEL_PREGUNTA)) {
							existe=true;
							preguntanomiAux.setpregunta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreguntaNomiConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							preguntanomiAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPreguntaNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPreguntaNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPreguntaNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPreguntaNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPreguntaNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePreguntaNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessPreguntaNomi(conSplash);
				
					this.generarReportePreguntaNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPreguntaNomisSeleccionados();
				//this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPreguntaNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPreguntaNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPreguntaNomi();
				
				this.exportarPreguntaNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPreguntaNomis();
				//this.importarPreguntaNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPreguntaNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPreguntaNomisSeleccionados();
				//this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pregunta Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPreguntaNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPreguntaNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPreguntaNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(PreguntaNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePreguntaNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPreguntaNomi(conSplash);
					
						//this.actualizarParametrosGeneralPreguntaNomi();
						
						this.generarReporteProcesoAccionPreguntaNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PreguntaNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Pregunta NomiS SELECCIONADOS?", "MANTENIMIENTO DE Pregunta Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPreguntaNomi();
				
						this.actualizarParametrosGeneralPreguntaNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.preguntanomiReturnGeneral=preguntanomiLogic.procesarAccionPreguntaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.preguntanomiLogic.getPreguntaNomis(),this.preguntanomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPreguntaNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPreguntaNomi();
					
					PreguntaNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPreguntaNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPreguntaNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxTiposAccionesFormularioPreguntaNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPreguntaNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPreguntaNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPreguntaNomi();
			
			if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();		
			PreguntaNomi preguntanomi=new PreguntaNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPreguntaNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPreguntaNomi.getSelectedItem();
			
			
			
			
			preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(preguntanomisSeleccionados.size()==1) {
				for(PreguntaNomi preguntanomiAux:preguntanomisSeleccionados) {
					preguntanomi=preguntanomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Formato Nomi Pregunta Nomi")) {
					jButtonFormatoNomiPreguntaNomiActionPerformed(null,rowIndex,true,false,preguntanomi);
				}
				else if(this.sTipoRelacion.equals("Detalle Evaluacion Nomi")) {
					jButtonDetalleEvaluacionNomiActionPerformed(null,rowIndex,true,false,preguntanomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPreguntaNomi();
			
      		//this.finishProcessPreguntaNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPreguntaNomiReturnGeneral() throws Exception {
		if(this.preguntanomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.preguntanomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.preguntanomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.preguntanomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.preguntanomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.preguntanomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPreguntaNomi(false);
		}
		
		if(this.preguntanomiReturnGeneral.getConRetornoLista() || this.preguntanomiReturnGeneral.getConRetornoObjeto()) {
			if(this.preguntanomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.preguntanomiLogic.setPreguntaNomis(this.preguntanomiReturnGeneral.getPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.preguntanomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.preguntanomiLogic.setPreguntaNomi(this.preguntanomiReturnGeneral.getPreguntaNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPreguntaNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralPreguntaNomi() throws Exception {
		
		
	}
	
	public ArrayList<PreguntaNomi> getPreguntaNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPreguntaNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PreguntaNomi preguntanomiAux:preguntanomiLogic.getPreguntaNomis()) {
					if(preguntanomiAux.getIsSelected()) {
						preguntanomisSeleccionados.add(preguntanomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaNomi preguntanomiAux:this.preguntanomis) {
					if(preguntanomiAux.getIsSelected()) {
						preguntanomisSeleccionados.add(preguntanomiAux);				
					}
				}
			}
			
			if(preguntanomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						preguntanomisSeleccionados.addAll(this.preguntanomiLogic.getPreguntaNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						preguntanomisSeleccionados.addAll(this.preguntanomis);				
					}
				}
			}
		} else {
			preguntanomisSeleccionados.add(this.preguntanomi);
		}
		
		return preguntanomisSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReportePreguntaNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPreguntaNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPreguntaNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPreguntaNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPreguntaNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPreguntaNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pregunta Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPreguntaNomisSeleccionados() throws Exception {
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();		
		
		preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePreguntaNomis("Todos",preguntanomisSeleccionados);
		
	}	
	
	public void generarReporteNormalPreguntaNomisSeleccionados() throws Exception {
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();		
		
		preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePreguntaNomis("Todos",preguntanomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPreguntaNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();
		
		preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePreguntaNomis("Todos",preguntanomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPreguntaNomisSeleccionados() throws Exception {
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPreguntaNomi();
		
		
		preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPreguntaNomi();
		
		
		//this.generarReportePreguntaNomis("Todos",preguntanomisSeleccionados ,preguntanomiImplementable,preguntanomiImplementableHome);
	}
	
	public void mostrarImportacionPreguntaNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPreguntaNomi();
		
		this.abrirFrameImportacionPreguntaNomi();		
		
			
		//this.generarReportePreguntaNomis("Todos",preguntanomisSeleccionados ,preguntanomiImplementable,preguntanomiImplementableHome);
	}
	
	public void importarPreguntaNomis() throws Exception {		
	
	}
	
	public void exportarPreguntaNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPreguntaNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPreguntaNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPreguntaNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pregunta Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPreguntaNomisSeleccionados() throws Exception {
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();		
		
		preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntanomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPreguntaNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PreguntaNomi preguntanomiAux:preguntanomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPreguntaNomi(preguntanomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//preguntanomiAux.setsDetalleGeneralEntityReporte(preguntanomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPreguntaNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PreguntaNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaNomiConstantesFunciones.LABEL_PREGUNTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaNomiConstantesFunciones.LABEL_ORDEN;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPreguntaNomi(PreguntaNomi preguntanomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=preguntanomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntanomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntanomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntanomi.getfactornomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntanomi.getpregunta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntanomi.getorden().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPreguntaNomisSeleccionados() throws Exception {
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();		
		
		preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntanomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PreguntaNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPreguntaNomi(row);				
				iRow++;
			}				
			
			for(PreguntaNomi preguntanomiAux:preguntanomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPreguntaNomi(preguntanomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPreguntaNomisSeleccionados() throws Exception {
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();		
		
		preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntanomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("preguntanomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("preguntanomi");
			//elementRoot.appendChild(element);
		
			for(PreguntaNomi preguntanomiAux:preguntanomisSeleccionados) {
				element = document.createElement("preguntanomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPreguntaNomi(preguntanomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPreguntaNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_PREGUNTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaNomiConstantesFunciones.LABEL_ORDEN);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPreguntaNomi(PreguntaNomi preguntanomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(preguntanomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntanomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntanomi.getfactornomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntanomi.getpregunta());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntanomi.getorden());				
	}
	
	public void setFilaDatosExportarXmlPreguntaNomi(PreguntaNomi preguntanomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PreguntaNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(preguntanomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PreguntaNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(preguntanomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PreguntaNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(preguntanomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfactornomi_descripcion = document.createElement(PreguntaNomiConstantesFunciones.IDFACTORNOMI);
		elementfactornomi_descripcion.appendChild(document.createTextNode(preguntanomi.getfactornomi_descripcion()));
		element.appendChild(elementfactornomi_descripcion);

		Element elementpregunta = document.createElement(PreguntaNomiConstantesFunciones.PREGUNTA);
		elementpregunta.appendChild(document.createTextNode(preguntanomi.getpregunta().trim()));
		element.appendChild(elementpregunta);

		Element elementorden = document.createElement(PreguntaNomiConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(preguntanomi.getorden().toString().trim()));
		element.appendChild(elementorden);
	}
	
	public void generarReporteGroupGenericoPreguntaNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PreguntaNomi> preguntanomisSeleccionados=new ArrayList<PreguntaNomi>();
		
		preguntanomisSeleccionados=this.getPreguntaNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoPreguntaNomi(preguntanomisSeleccionados);
		
		this.generarReportePreguntaNomis("Todos",preguntanomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPreguntaNomi(ArrayList<PreguntaNomi> preguntanomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PreguntaNomi preguntanomiAux:preguntanomisSeleccionados) {
				preguntanomiAux.setsDetalleGeneralEntityReporte(preguntanomiAux.toString());
			
				if(sTipoSeleccionar.equals(PreguntaNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					preguntanomiAux.setsDescripcionGeneralEntityReporte1(preguntanomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI)) {
					existe=true;
					preguntanomiAux.setsDescripcionGeneralEntityReporte1(preguntanomiAux.getfactornomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaNomiConstantesFunciones.LABEL_PREGUNTA)) {
					existe=true;
					preguntanomiAux.setsDescripcionGeneralEntityReporte1(preguntanomiAux.getpregunta());
				}
				 else if(sTipoSeleccionar.equals(PreguntaNomiConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					preguntanomiAux.setsDescripcionGeneralEntityReporte1(preguntanomiAux.getorden().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPreguntaNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPreguntaNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=true;
				this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=true;
			}
			
			this.isVisibilidadCeldaModificarPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarPreguntaNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPreguntaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=false;
			this.isVisibilidadCeldaModificarPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarPreguntaNomi=true;
			this.isVisibilidadCeldaEliminarPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarPreguntaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPreguntaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=false;
			this.isVisibilidadCeldaModificarPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarPreguntaNomi=true;
			this.isVisibilidadCeldaEliminarPreguntaNomi=true;
			this.isVisibilidadCeldaCancelarPreguntaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPreguntaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=false;
			this.isVisibilidadCeldaModificarPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarPreguntaNomi=true;
			this.isVisibilidadCeldaEliminarPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarPreguntaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPreguntaNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=true;
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=true;
			this.isVisibilidadCeldaModificarPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarPreguntaNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPreguntaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarPreguntaNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPreguntaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=false;
			this.isVisibilidadCeldaModificarPreguntaNomi=true;
			this.isVisibilidadCeldaActualizarPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarPreguntaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PreguntaNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPreguntaNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=true;
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=true;
		} else {
			this.actualizarEstadoPanelsPreguntaNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPreguntaNomi=false;
			//this.isVisibilidadCeldaVerFormPreguntaNomi=false;
			this.isVisibilidadCeldaDuplicarPreguntaNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!preguntanomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(preguntanomiSessionBean.getEsGuardarRelacionado()) {
			if(!preguntanomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=false;												
			}
			
			this.jButtonCerrarPreguntaNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPreguntaNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.preguntanomi)) {
			this.isVisibilidadCeldaActualizarPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarPreguntaNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPreguntaNomi() {
		this.isVisibilidadCeldaNuevoPreguntaNomi=false;
		this.isVisibilidadCeldaGuardarCambiosPreguntaNomi=false;
	}
	
	public void actualizarEstadoPanelsPreguntaNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionPreguntaNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasPreguntaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaNomi!=null) {
				this.jScrollPanelDatosPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaNomi!=null) {
				this.jPanelPaginacionPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaNomi!=null) {
				this.jPanelParametrosReportesPreguntaNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionPreguntaNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasPreguntaNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPreguntaNomi!=null) {
				this.jScrollPanelDatosPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreguntaNomi!=null) {
				this.jPanelPaginacionPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreguntaNomi!=null) {
				this.jPanelParametrosReportesPreguntaNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionPreguntaNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasPreguntaNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaNomi!=null) {
				this.jScrollPanelDatosPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreguntaNomi!=null) {
				this.jPanelPaginacionPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreguntaNomi!=null) {
				this.jPanelParametrosReportesPreguntaNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionPreguntaNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasPreguntaNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaNomi!=null) {
				this.jScrollPanelDatosPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreguntaNomi!=null) {
				this.jPanelPaginacionPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreguntaNomi!=null) {
				this.jPanelParametrosReportesPreguntaNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionPreguntaNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasPreguntaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaNomi!=null) {
				this.jScrollPanelDatosPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaNomi!=null) {
				this.jPanelPaginacionPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaNomi!=null) {
				this.jPanelParametrosReportesPreguntaNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionPreguntaNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasPreguntaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaNomi!=null) {
				this.jScrollPanelDatosPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaNomi!=null) {
				this.jPanelPaginacionPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaNomi!=null) {
				this.jPanelParametrosReportesPreguntaNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionPreguntaNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasPreguntaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaNomi!=null) {
				this.jScrollPanelDatosPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaNomi!=null) {
				this.jPanelPaginacionPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaNomi!=null) {
				this.jPanelParametrosReportesPreguntaNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPreguntaNomi!=null) {
					this.jTabbedPaneBusquedasPreguntaNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPreguntaNomi!=null) {
				this.jPanelParametrosReportesPreguntaNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasPreguntaNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPreguntaNomi!=null) {
				this.jPanelParametrosReportesPreguntaNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdFactorNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasPreguntaNomi.remove(jPanelFK_IdFactorNomiPreguntaNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactorNomi(Boolean isParaFactorNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFactorNomiNegation=!isParaFactorNomi;

			this.isVisibilidadFK_IdFactorNomi=isParaFactorNomi;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasPreguntaNomi.remove(jPanelFK_IdFactorNomiPreguntaNomi);}
		}
		
	}
	
	

	public String registrarSesionPreguntaNomiParaFormatoNomiPreguntaNomis() throws Exception {
		Boolean isPaginaPopupFormatoNomiPreguntaNomi=false;

		try {

			if(this.preguntanomiSessionBean==null) {
				this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiSessionBean==null) {
				this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			}

			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiSessionBean.setsPathNavegacionActual(preguntanomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiPreguntaNomi(true);
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiPreguntaNomi(PreguntaNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionPreguntaNomi(true);
			this.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiSessionBean.setlidPreguntaNomiActual(this.idPreguntaNomiActual);

			preguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPreguntaNomi(true);
			preguntanomiSessionBean.setlIdPreguntaNomiActualForeignKey(this.idPreguntaNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPreguntaNomiParaDetalleEvaluacionNomis() throws Exception {
		Boolean isPaginaPopupDetalleEvaluacionNomi=false;

		try {

			if(this.preguntanomiSessionBean==null) {
				this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiSessionBean==null) {
				this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
			}

			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiSessionBean.setsPathNavegacionActual(preguntanomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleEvaluacionNomi=this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi(true);
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi(PreguntaNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiSessionBean.setisBusquedaDesdeForeignKeySesionPreguntaNomi(true);
			this.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiSessionBean.setlidPreguntaNomiActual(this.idPreguntaNomiActual);

			preguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPreguntaNomi(true);
			preguntanomiSessionBean.setlIdPreguntaNomiActualForeignKey(this.idPreguntaNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PreguntaNomiSessionBean preguntanomiSessionBean=new PreguntaNomiSessionBean();
		
		if(this.preguntanomiSessionBean==null) {
			this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
		}
		
		this.preguntanomiSessionBean.setsUltimaBusquedaPreguntaNomi(this.getsAccionBusqueda());
		this.preguntanomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.preguntanomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			preguntanomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactorNomi")) {
			preguntanomiSessionBean.setid_factor_nomi(this.getid_factor_nomiFK_IdFactorNomi());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PreguntaNomiSessionBean preguntanomiSessionBean=new PreguntaNomiSessionBean();
		
		if(this.preguntanomiSessionBean==null) {
			this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
		}
		
		if(this.preguntanomiSessionBean.getsUltimaBusquedaPreguntaNomi()!=null&&!this.preguntanomiSessionBean.getsUltimaBusquedaPreguntaNomi().equals("")) {
			this.setsAccionBusqueda(preguntanomiSessionBean.getsUltimaBusquedaPreguntaNomi());
			this.setiNumeroPaginacion(preguntanomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(preguntanomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(preguntanomiSessionBean.getid_empresa());
				preguntanomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactorNomi")) {
				this.setid_factor_nomiFK_IdFactorNomi(preguntanomiSessionBean.getid_factor_nomi());
				preguntanomiSessionBean.setid_factor_nomi(-1L);
			}
		}
		
		this.preguntanomiSessionBean.setsUltimaBusquedaPreguntaNomi("");
		this.preguntanomiSessionBean.setiNumeroPaginacion(PreguntaNomiConstantesFunciones.INUMEROPAGINACION);
		this.preguntanomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPreguntaNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPreguntaNomi() {
		this.updateBorderResaltarBusquedasFormularioPreguntaNomi();
		this.updateVisibilidadBusquedasFormularioPreguntaNomi();
		this.updateHabilitarBusquedasFormularioPreguntaNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioPreguntaNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPreguntaNomi.getComponents().length>0) {
	

		if(this.preguntanomiConstantesFunciones.resaltarFK_IdFactorNomiPreguntaNomi!=null) {
			index= this.jTabbedPaneBusquedasPreguntaNomi.indexOfComponent(this.jPanelFK_IdFactorNomiPreguntaNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaNomi.getComponent(index);
				jPanel.setBorder(this.preguntanomiConstantesFunciones.resaltarFK_IdFactorNomiPreguntaNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPreguntaNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPreguntaNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPreguntaNomi.indexOfComponent(this.jPanelFK_IdFactorNomiPreguntaNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.preguntanomiConstantesFunciones.mostrarFK_IdFactorNomiPreguntaNomi);
			if(!this.preguntanomiConstantesFunciones.mostrarFK_IdFactorNomiPreguntaNomi && index>-1) {
				this.jTabbedPaneBusquedasPreguntaNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPreguntaNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPreguntaNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPreguntaNomi.indexOfComponent(this.jPanelFK_IdFactorNomiPreguntaNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.preguntanomiConstantesFunciones.activarFK_IdFactorNomiPreguntaNomi);
				this.jTabbedPaneBusquedasPreguntaNomi.setEnabledAt(index,this.preguntanomiConstantesFunciones.activarFK_IdFactorNomiPreguntaNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPreguntaNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdFactorNomi")) {
			index= this.jTabbedPaneBusquedasPreguntaNomi.indexOfComponent(this.jPanelFK_IdFactorNomiPreguntaNomi);

			this.jTabbedPaneBusquedasPreguntaNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaNomi.getComponent(index);

			this.preguntanomiConstantesFunciones.setResaltarFK_IdFactorNomiPreguntaNomi(resaltar);

			jPanel.setBorder(this.preguntanomiConstantesFunciones.resaltarFK_IdFactorNomiPreguntaNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPreguntaNomi.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioPreguntaNomi() throws Exception {

		if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPreguntaNomi();
		this.updateVisibilidadResaltarControlesFormularioPreguntaNomi();
		this.updateHabilitarResaltarControlesFormularioPreguntaNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioPreguntaNomi() throws Exception {
		if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.preguntanomiConstantesFunciones.resaltaridPreguntaNomi!=null && this.jInternalFrameDetalleFormPreguntaNomi!=null) {this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.setBorder(this.preguntanomiConstantesFunciones.resaltaridPreguntaNomi);}
		if(this.preguntanomiConstantesFunciones.resaltarid_empresaPreguntaNomi!=null && this.jInternalFrameDetalleFormPreguntaNomi!=null) {this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.setBorder(this.preguntanomiConstantesFunciones.resaltarid_empresaPreguntaNomi);}
		if(this.preguntanomiConstantesFunciones.resaltarid_factor_nomiPreguntaNomi!=null && this.jInternalFrameDetalleFormPreguntaNomi!=null) {this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.setBorder(this.preguntanomiConstantesFunciones.resaltarid_factor_nomiPreguntaNomi);}
		if(this.preguntanomiConstantesFunciones.resaltarpreguntaPreguntaNomi!=null && this.jInternalFrameDetalleFormPreguntaNomi!=null) {this.jInternalFrameDetalleFormPreguntaNomi.jTextAreapreguntaPreguntaNomi.setBorder(this.preguntanomiConstantesFunciones.resaltarpreguntaPreguntaNomi);}
		if(this.preguntanomiConstantesFunciones.resaltarordenPreguntaNomi!=null && this.jInternalFrameDetalleFormPreguntaNomi!=null) {this.jInternalFrameDetalleFormPreguntaNomi.jTextFieldordenPreguntaNomi.setBorder(this.preguntanomiConstantesFunciones.resaltarordenPreguntaNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPreguntaNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
	
		//this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.setVisible(this.preguntanomiConstantesFunciones.mostraridPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jPanelidPreguntaNomi.setVisible(this.preguntanomiConstantesFunciones.mostraridPreguntaNomi);
		//this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.setVisible(this.preguntanomiConstantesFunciones.mostrarid_empresaPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jPanelid_empresaPreguntaNomi.setVisible(this.preguntanomiConstantesFunciones.mostrarid_empresaPreguntaNomi);
		//this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.setVisible(this.preguntanomiConstantesFunciones.mostrarid_factor_nomiPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jPanelid_factor_nomiPreguntaNomi.setVisible(this.preguntanomiConstantesFunciones.mostrarid_factor_nomiPreguntaNomi);
		//this.jInternalFrameDetalleFormPreguntaNomi.jTextAreapreguntaPreguntaNomi.setVisible(this.preguntanomiConstantesFunciones.mostrarpreguntaPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jPanelpreguntaPreguntaNomi.setVisible(this.preguntanomiConstantesFunciones.mostrarpreguntaPreguntaNomi);
		//this.jInternalFrameDetalleFormPreguntaNomi.jTextFieldordenPreguntaNomi.setVisible(this.preguntanomiConstantesFunciones.mostrarordenPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jPanelordenPreguntaNomi.setVisible(this.preguntanomiConstantesFunciones.mostrarordenPreguntaNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPreguntaNomi() throws Exception {
		if(this.jInternalFrameDetalleFormPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPreguntaNomi!=null) {
	
		this.jInternalFrameDetalleFormPreguntaNomi.jLabelidPreguntaNomi.setEnabled(this.preguntanomiConstantesFunciones.activaridPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_empresaPreguntaNomi.setEnabled(this.preguntanomiConstantesFunciones.activarid_empresaPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jComboBoxid_factor_nomiPreguntaNomi.setEnabled(this.preguntanomiConstantesFunciones.activarid_factor_nomiPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jTextAreapreguntaPreguntaNomi.setEnabled(this.preguntanomiConstantesFunciones.activarpreguntaPreguntaNomi);
		this.jInternalFrameDetalleFormPreguntaNomi.jTextFieldordenPreguntaNomi.setEnabled(this.preguntanomiConstantesFunciones.activarordenPreguntaNomi);
		}
	}
	
		
}