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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.DatoFormularioIvaConstantesFunciones;
import com.bydan.erp.contabilidad.util.DatoFormularioIvaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.DatoFormularioIvaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.DatoFormularioIvaBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class DatoFormularioIvaBeanSwingJInternalFrame extends DatoFormularioIvaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DatoFormularioIvaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DatoFormularioIva> datoformularioivaValidator = new ClassValidator<DatoFormularioIva>(DatoFormularioIva.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DatoFormularioIva datoformularioiva;	
	public DatoFormularioIva datoformularioivaAux;
	public DatoFormularioIva datoformularioivaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DatoFormularioIva datoformularioivaTotales;
	public Long idDatoFormularioIvaActual;
	public Long iIdNuevoDatoFormularioIva=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

	public String sFinalQueryComboSemestre="";

	public List<Semestre> semestresForeignKey;

	public List<Semestre> getsemestresForeignKey() {
		return semestresForeignKey;
	}

	public void setsemestresForeignKey(List<Semestre> semestresForeignKey) {
		this.semestresForeignKey = semestresForeignKey;
	}

	//OBJETO FK ACTUAL
	public Semestre semestreForeignKey;

	public Semestre getsemestreForeignKey() {
		return semestreForeignKey;
	}

	public void setsemestreForeignKey(Semestre semestreForeignKey) {
		this.semestreForeignKey = semestreForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosFormularioIva=false;

	public Boolean getIsTienePermisosFormularioIva() {
		return isTienePermisosFormularioIva;
	}

	public void setIsTienePermisosFormularioIva(Boolean isTienePermisosFormularioIva) {
		this.isTienePermisosFormularioIva= isTienePermisosFormularioIva;
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
	
	public Boolean isPermisoTodoDatoFormularioIva;
	public Boolean isPermisoNuevoDatoFormularioIva;
	public Boolean isPermisoActualizarDatoFormularioIva;
	public Boolean isPermisoActualizarOriginalDatoFormularioIva;
	public Boolean isPermisoEliminarDatoFormularioIva;
	public Boolean isPermisoGuardarCambiosDatoFormularioIva;
	public Boolean isPermisoConsultaDatoFormularioIva;
	public Boolean isPermisoBusquedaDatoFormularioIva;
	public Boolean isPermisoReporteDatoFormularioIva;
	public Boolean isPermisoPaginacionMedioDatoFormularioIva;
	public Boolean isPermisoPaginacionAltoDatoFormularioIva;
	public Boolean isPermisoPaginacionTodoDatoFormularioIva;
	public Boolean isPermisoCopiarDatoFormularioIva;
	public Boolean isPermisoVerFormDatoFormularioIva;
	public Boolean isPermisoDuplicarDatoFormularioIva;
	public Boolean isPermisoOrdenDatoFormularioIva;
	
	
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
	
	public DatoFormularioIvaParameterReturnGeneral datoformularioivaReturnGeneral;
	public DatoFormularioIvaParameterReturnGeneral datoformularioivaParameterGeneral;
	
	

	public FormularioIvaLogic formularioivaLogic=null;

	public FormularioIvaLogic getFormularioIvaLogic() {
		return formularioivaLogic;
	}

	public void setFormularioIvaLogic(FormularioIvaLogic formularioivaLogic) {
		this.formularioivaLogic = formularioivaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDatoFormularioIva=false;
	public Boolean esParaAccionDesdeFormularioDatoFormularioIva=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DatoFormularioIvaSessionBeanAdditional datoformularioivaSessionBeanAdditional=null;
	
	public DatoFormularioIvaSessionBeanAdditional getDatoFormularioIvaSessionBeanAdditional() {
		return this.datoformularioivaSessionBeanAdditional;
	}
	
	public void setDatoFormularioIvaSessionBeanAdditional(DatoFormularioIvaSessionBeanAdditional datoformularioivaSessionBeanAdditional) {
		try {
			this.datoformularioivaSessionBeanAdditional=datoformularioivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DatoFormularioIvaBeanSwingJInternalFrameAdditional datoformularioivaBeanSwingJInternalFrameAdditional=null;
	//public class DatoFormularioIvaBeanSwingJInternalFrame
	
	public DatoFormularioIvaBeanSwingJInternalFrameAdditional getDatoFormularioIvaBeanSwingJInternalFrameAdditional() {
		return this.datoformularioivaBeanSwingJInternalFrameAdditional;
	}
	
	public void setDatoFormularioIvaBeanSwingJInternalFrameAdditional(DatoFormularioIvaBeanSwingJInternalFrameAdditional datoformularioivaBeanSwingJInternalFrameAdditional) {
		try {
			this.datoformularioivaBeanSwingJInternalFrameAdditional=datoformularioivaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DatoFormularioIvaLogic datoformularioivaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DatoFormularioIva datoformularioivaBean;
	public DatoFormularioIvaConstantesFunciones datoformularioivaConstantesFunciones;
	//public DatoFormularioIvaParameterReturnGeneral datoformularioivaReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	public SemestreLogic semestreLogic;
	
	//PARAMETROS
	
	
	//public List<DatoFormularioIva> datoformularioivas;	
	//public List<DatoFormularioIva> datoformularioivasEliminados;
	//public List<DatoFormularioIva> datoformularioivasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDatoFormularioIva=false;
	public Boolean isVisibilidadCeldaDuplicarDatoFormularioIva=true;
	public Boolean isVisibilidadCeldaCopiarDatoFormularioIva=true;
	public Boolean isVisibilidadCeldaVerFormDatoFormularioIva=true;
	public Boolean isVisibilidadCeldaOrdenDatoFormularioIva=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=false;
	public Boolean isVisibilidadCeldaModificarDatoFormularioIva=false;
	public Boolean isVisibilidadCeldaActualizarDatoFormularioIva=false;
	public Boolean isVisibilidadCeldaEliminarDatoFormularioIva=false;
	public Boolean isVisibilidadCeldaCancelarDatoFormularioIva=false;
	public Boolean isVisibilidadCeldaGuardarDatoFormularioIva=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDatoFormularioIva=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdAnioIdSemestre=false;
	public Boolean isVisibilidadBusquedaPorIdAnioPorIdMes=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdSemestre=false;
	
	public Long getiIdNuevoDatoFormularioIva() {
		return this.iIdNuevoDatoFormularioIva;
	}

	public void setiIdNuevoDatoFormularioIva(Long iIdNuevoDatoFormularioIva) {
		this.iIdNuevoDatoFormularioIva = iIdNuevoDatoFormularioIva;
	}
	
	public Long getidDatoFormularioIvaActual() {
		return this.idDatoFormularioIvaActual;
	}

	public void setidDatoFormularioIvaActual(Long idDatoFormularioIvaActual) {
		this.idDatoFormularioIvaActual = idDatoFormularioIvaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DatoFormularioIva getdatoformularioiva() {
		return this.datoformularioiva;
	}

	public void setdatoformularioiva(DatoFormularioIva datoformularioiva) {
		this.datoformularioiva = datoformularioiva;
	}
	
	public DatoFormularioIva getdatoformularioivaAux() {
		return this.datoformularioivaAux;
	}

	public void setdatoformularioivaAux(DatoFormularioIva datoformularioivaAux) {
		this.datoformularioivaAux = datoformularioivaAux;
	}				
	
	public DatoFormularioIva getdatoformularioivaAnterior() {
		return this.datoformularioivaAnterior;
	}

	public void setdatoformularioivaAnterior(DatoFormularioIva datoformularioivaAnterior) {
		this.datoformularioivaAnterior = datoformularioivaAnterior;
	}	
	
	public DatoFormularioIva getdatoformularioivaTotales() {
		return this.datoformularioivaTotales;
	}

	public void setdatoformularioivaTotales(DatoFormularioIva datoformularioivaTotales) {
		this.datoformularioivaTotales = datoformularioivaTotales;
	}	
	
	public DatoFormularioIva getdatoformularioivaBean() {
		return this.datoformularioivaBean;
	}

	public void setdatoformularioivaBean(DatoFormularioIva datoformularioivaBean) {
		this.datoformularioivaBean = datoformularioivaBean;
	}	
	
	public DatoFormularioIvaParameterReturnGeneral getdatoformularioivaReturnGeneral() {
		return this.datoformularioivaReturnGeneral;
	}

	public void setdatoformularioivaReturnGeneral(DatoFormularioIvaParameterReturnGeneral datoformularioivaReturnGeneral) {
		this.datoformularioivaReturnGeneral = datoformularioivaReturnGeneral;
	}	
	
	
	public Long id_anioBusquedaPorIdAnioIdSemestre=null;

	public Long getid_anioBusquedaPorIdAnioIdSemestre() {
		return this.id_anioBusquedaPorIdAnioIdSemestre;
	}

	public void setid_anioBusquedaPorIdAnioIdSemestre(Long id_anioBusquedaPorIdAnioIdSemestre) {
		this.id_anioBusquedaPorIdAnioIdSemestre = id_anioBusquedaPorIdAnioIdSemestre;
	}

;
	public Long id_semestreBusquedaPorIdAnioIdSemestre=-1L;

	public Long getid_semestreBusquedaPorIdAnioIdSemestre() {
		return this.id_semestreBusquedaPorIdAnioIdSemestre;
	}

	public void setid_semestreBusquedaPorIdAnioIdSemestre(Long id_semestreBusquedaPorIdAnioIdSemestre) {
		this.id_semestreBusquedaPorIdAnioIdSemestre = id_semestreBusquedaPorIdAnioIdSemestre;
	}

	public Long id_anioBusquedaPorIdAnioPorIdMes=null;

	public Long getid_anioBusquedaPorIdAnioPorIdMes() {
		return this.id_anioBusquedaPorIdAnioPorIdMes;
	}

	public void setid_anioBusquedaPorIdAnioPorIdMes(Long id_anioBusquedaPorIdAnioPorIdMes) {
		this.id_anioBusquedaPorIdAnioPorIdMes = id_anioBusquedaPorIdAnioPorIdMes;
	}

;
	public Long id_mesBusquedaPorIdAnioPorIdMes=null;

	public Long getid_mesBusquedaPorIdAnioPorIdMes() {
		return this.id_mesBusquedaPorIdAnioPorIdMes;
	}

	public void setid_mesBusquedaPorIdAnioPorIdMes(Long id_mesBusquedaPorIdAnioPorIdMes) {
		this.id_mesBusquedaPorIdAnioPorIdMes = id_mesBusquedaPorIdAnioPorIdMes;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_semestreFK_IdSemestre=-1L;

	public Long getid_semestreFK_IdSemestre() {
		return this.id_semestreFK_IdSemestre;
	}

	public void setid_semestreFK_IdSemestre(Long id_semestreFK_IdSemestre) {
		this.id_semestreFK_IdSemestre = id_semestreFK_IdSemestre;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DatoFormularioIvaLogic getDatoFormularioIvaLogic()	{		
		return datoformularioivaLogic;
	}

	public void setDatoFormularioIvaLogic(DatoFormularioIvaLogic datoformularioivaLogic) {
		this.datoformularioivaLogic = datoformularioivaLogic;
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
	
	public Boolean getIsEsNuevoDatoFormularioIva() {
		return isEsNuevoDatoFormularioIva;
	}

	public void setIsEsNuevoDatoFormularioIva(Boolean isEsNuevoDatoFormularioIva) {
		this.isEsNuevoDatoFormularioIva = isEsNuevoDatoFormularioIva;
	}

	public Boolean getEsParaAccionDesdeFormularioDatoFormularioIva() {
		return esParaAccionDesdeFormularioDatoFormularioIva;
	}
	
	public void setEsParaAccionDesdeFormularioDatoFormularioIva(Boolean esParaAccionDesdeFormularioDatoFormularioIva) {
		this.esParaAccionDesdeFormularioDatoFormularioIva = esParaAccionDesdeFormularioDatoFormularioIva;
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
	
	
	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.datoformularioivaSessionBean==null) {
				this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
			}

			if(!this.datoformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(datoformularioivaSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.datoformularioivaSessionBean==null) {
				this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
			}

			if(!this.datoformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(datoformularioivaSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

	public void cargarCombosSemestresForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.semestresForeignKey=new ArrayList<Semestre>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SemestreLogic semestreLogic=new SemestreLogic();

			semestreLogic.getSemestreDataAccess().setIsForForeingKeyData(true);

			if(this.datoformularioivaSessionBean==null) {
				this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
			}

			if(!this.datoformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionSemestre()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					semestreLogic.getSemestreDataAccess().setIsForForeingKeyData(true);

					semestreLogic.getTodosSemestresWithConnection(sFinalQuery,new Pagination());

					this.semestresForeignKey=semestreLogic.getSemestres();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSemestre(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					semestreLogic.getEntityWithConnection(datoformularioivaSessionBean.getlidSemestreActual());
					this.semestresForeignKey.add(semestreLogic.getSemestre());
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

	
	
	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.datoformularioiva!=null) {
						this.datoformularioiva.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
						this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioDatoFormularioIva.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioIdSemestre") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva!=null) {
						jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva!=null) {
							//jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.getItemCount()>0) {
								jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioPorIdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva!=null) {
						jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva!=null) {
							//jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.getItemCount()>0) {
								jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioDatoFormularioIva!=null) {
						jComboBoxid_anioFK_IdAnioDatoFormularioIva.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioDatoFormularioIva!=null) {
							//jComboBoxid_anioFK_IdAnioDatoFormularioIva.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioDatoFormularioIva.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioDatoFormularioIva.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioDatoFormularioIvaGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioDatoFormularioIvaGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioDatoFormularioIvaGenerico!=null && jComboBoxid_anioDatoFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_anioDatoFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.datoformularioiva!=null) {
						this.datoformularioiva.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
						this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesDatoFormularioIva.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioPorIdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva!=null) {
						jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva!=null) {
							//jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setSelectedItem(mesTemp);
							if(jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.getItemCount()>0) {
								jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesDatoFormularioIvaGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesDatoFormularioIvaGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesDatoFormularioIvaGenerico!=null && jComboBoxid_mesDatoFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_mesDatoFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSemestreForeignKey(Long idSemestreSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Semestre  semestreTemp=null;

			for(Semestre semestreAux:semestresForeignKey) {
				if(semestreAux.getId()!=null && semestreAux.getId().equals(idSemestreSeleccionado)) {
					semestreTemp=semestreAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(semestreTemp!=null) {

					if(this.datoformularioiva!=null) {
						this.datoformularioiva.setSemestre(semestreTemp);
					}

					if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
						this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.setSelectedItem(semestreTemp);
					}
				} else {
					//jComboBoxid_semestreDatoFormularioIva.setSelectedItem(semestreTemp);
					if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioIdSemestre") || sFormularioTipoBusqueda.equals("Todos")){
					if(semestreTemp!=null && jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva!=null) {
						jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setSelectedItem(semestreTemp);
					} else {
						if(jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva!=null) {
							//jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setSelectedItem(semestreTemp);
							if(jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.getItemCount()>0) {
								jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setSelectedIndex(0);
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

	public String getActualSemestreForeignKeyDescripcion(Long idSemestreSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Semestre  semestreTemp=null;

			for(Semestre semestreAux:semestresForeignKey) {
				if(semestreAux.getId()!=null && semestreAux.getId().equals(idSemestreSeleccionado)) {
					semestreTemp=semestreAux;
					break;
				}
			}


			sDescripcion=SemestreConstantesFunciones.getSemestreDescripcion(semestreTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSemestreForeignKeyGenerico(Long idSemestreSeleccionado,JComboBox jComboBoxid_semestreDatoFormularioIvaGenerico)throws Exception
	{
		try
		{
			Semestre  semestreTemp=null;

			for(Semestre semestreAux:semestresForeignKey) {
				if(semestreAux.getId()!=null && semestreAux.getId().equals(idSemestreSeleccionado)) {
					semestreTemp=semestreAux;
					break;
				}
			}

			if(semestreTemp!=null) {
				jComboBoxid_semestreDatoFormularioIvaGenerico.setSelectedItem(semestreTemp);
			} else {
				if(jComboBoxid_semestreDatoFormularioIvaGenerico!=null && jComboBoxid_semestreDatoFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_semestreDatoFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(DatoFormularioIva datoformularioiva,JComboBox jComboBoxid_anioDatoFormularioIvaGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioDatoFormularioIvaGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioDatoFormularioIvaGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				datoformularioiva.setid_anio(anioAux.getId());
				datoformularioiva.setanio_descripcion(DatoFormularioIvaConstantesFunciones.getAnioDescripcion(anioAux));
				datoformularioiva.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(DatoFormularioIva datoformularioiva,JComboBox jComboBoxid_mesDatoFormularioIvaGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesDatoFormularioIvaGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesDatoFormularioIvaGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				datoformularioiva.setid_mes(mesAux.getId());
				datoformularioiva.setmes_descripcion(DatoFormularioIvaConstantesFunciones.getMesDescripcion(mesAux));
				datoformularioiva.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSemestreForeignKey(DatoFormularioIva datoformularioiva,JComboBox jComboBoxid_semestreDatoFormularioIvaGenerico)throws Exception
	{
		try
		{
			Semestre  semestreAux=new Semestre();

			if(jComboBoxid_semestreDatoFormularioIvaGenerico==null) {
				semestreAux=(Semestre)this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.getSelectedItem();
			} else {
				semestreAux=(Semestre)jComboBoxid_semestreDatoFormularioIvaGenerico.getSelectedItem();
			}

			if(semestreAux!=null && semestreAux.getId()!=null) {
				datoformularioiva.setid_semestre(semestreAux.getId());
				datoformularioiva.setsemestre_descripcion(DatoFormularioIvaConstantesFunciones.getSemestreDescripcion(semestreAux));
				datoformularioiva.setSemestre(semestreAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { 
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { 
					}

					if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioIdSemestre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.addItem(anio);
							}
						}

						if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioPorIdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.addItem(anio);
							}
						}

						if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioDatoFormularioIva.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioDatoFormularioIva.addItem(anio);
							}
						}

						if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { 
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { 
					}

					if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioPorIdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.addItem(mes);
							}
						}

						if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSemestresForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSemestre=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { 
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.removeAllItems();

							for(Semestre semestre:this.semestresForeignKey) {
								this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.addItem(semestre);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { 
					}

					if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioIdSemestre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.removeAllItems();

							for(Semestre semestre:this.semestresForeignKey) {
								this.jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.addItem(semestre);
							}
						}

						if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioDatoFormularioIva.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioDatoFormularioIva.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSemestreForeignKey(Semestre semestre,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.setSelectedItem(semestre);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setSelectedItem(semestre);
						} else {
							this.jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDatoFormularioIva() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DatoFormularioIvaConstantesFunciones.refrescarForeignKeysDescripcionesDatoFormularioIva(this.datoformularioivaLogic.getDatoFormularioIvas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DatoFormularioIvaConstantesFunciones.refrescarForeignKeysDescripcionesDatoFormularioIva(this.datoformularioivas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
		classes.add(new Classe(Semestre.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//datoformularioivaLogic.setDatoFormularioIvas(this.datoformularioivas);
			datoformularioivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DatoFormularioIvaParameterReturnGeneral getDatoFormularioIvaParameterGeneral() {
		return this.datoformularioivaParameterGeneral;
	}
	
	public void setDatoFormularioIvaParameterGeneral(DatoFormularioIvaParameterReturnGeneral datoformularioivaParameterGeneral) {
		this.datoformularioivaParameterGeneral = datoformularioivaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDatoFormularioIva() {
		return isPermisoTodoDatoFormularioIva;
	}

	public void setIsPermisoTodoDatoFormularioIva(Boolean isPermisoTodoDatoFormularioIva) {
		this.isPermisoTodoDatoFormularioIva = isPermisoTodoDatoFormularioIva;
	}

	public Boolean getIsPermisoNuevoDatoFormularioIva() {
		return isPermisoNuevoDatoFormularioIva;
	}

	public void setIsPermisoNuevoDatoFormularioIva(Boolean isPermisoNuevoDatoFormularioIva) {
		this.isPermisoNuevoDatoFormularioIva = isPermisoNuevoDatoFormularioIva;
	}

	public Boolean getIsPermisoActualizarDatoFormularioIva() {
		return isPermisoActualizarDatoFormularioIva;
	}

	public void setIsPermisoActualizarDatoFormularioIva(Boolean isPermisoActualizarDatoFormularioIva) {
		this.isPermisoActualizarDatoFormularioIva = isPermisoActualizarDatoFormularioIva;
	}

	public Boolean getIsPermisoEliminarDatoFormularioIva() {
		return isPermisoEliminarDatoFormularioIva;
	}

	public void setIsPermisoEliminarDatoFormularioIva(Boolean isPermisoEliminarDatoFormularioIva) {
		this.isPermisoEliminarDatoFormularioIva = isPermisoEliminarDatoFormularioIva;
	}

	public Boolean getIsPermisoGuardarCambiosDatoFormularioIva() {
		return isPermisoGuardarCambiosDatoFormularioIva;
	}

	public void setIsPermisoGuardarCambiosDatoFormularioIva(Boolean isPermisoGuardarCambiosDatoFormularioIva) {
		this.isPermisoGuardarCambiosDatoFormularioIva = isPermisoGuardarCambiosDatoFormularioIva;
	}
	
	public Boolean getIsPermisoConsultaDatoFormularioIva() {
		return isPermisoConsultaDatoFormularioIva;
	}

	public void setIsPermisoConsultaDatoFormularioIva(Boolean isPermisoConsultaDatoFormularioIva) {
		this.isPermisoConsultaDatoFormularioIva = isPermisoConsultaDatoFormularioIva;
	}

	public Boolean getIsPermisoBusquedaDatoFormularioIva() {
		return isPermisoBusquedaDatoFormularioIva;
	}

	public void setIsPermisoBusquedaDatoFormularioIva(Boolean isPermisoBusquedaDatoFormularioIva) {
		this.isPermisoBusquedaDatoFormularioIva = isPermisoBusquedaDatoFormularioIva;
	}

	public Boolean getIsPermisoReporteDatoFormularioIva() {
		return isPermisoReporteDatoFormularioIva;
	}

	public void setIsPermisoReporteDatoFormularioIva(Boolean isPermisoReporteDatoFormularioIva) {
		this.isPermisoReporteDatoFormularioIva = isPermisoReporteDatoFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionMedioDatoFormularioIva() {
		return isPermisoPaginacionMedioDatoFormularioIva;
	}

	public void setIsPermisoPaginacionMedioDatoFormularioIva(Boolean isPermisoPaginacionMedioDatoFormularioIva) {
		this.isPermisoPaginacionMedioDatoFormularioIva = isPermisoPaginacionMedioDatoFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionTodoDatoFormularioIva() {
		return isPermisoPaginacionTodoDatoFormularioIva;
	}

	public void setIsPermisoPaginacionTodoDatoFormularioIva(Boolean isPermisoPaginacionTodoDatoFormularioIva) {
		this.isPermisoPaginacionTodoDatoFormularioIva = isPermisoPaginacionTodoDatoFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionAltoDatoFormularioIva() {
		return isPermisoPaginacionAltoDatoFormularioIva;
	}

	public void setIsPermisoPaginacionAltoDatoFormularioIva(Boolean isPermisoPaginacionAltoDatoFormularioIva) {
		this.isPermisoPaginacionAltoDatoFormularioIva = isPermisoPaginacionAltoDatoFormularioIva;
	}
	
	public Boolean getIsPermisoCopiarDatoFormularioIva() {
		return isPermisoCopiarDatoFormularioIva;
	}

	public void setIsPermisoCopiarDatoFormularioIva(Boolean isPermisoCopiarDatoFormularioIva) {
		this.isPermisoCopiarDatoFormularioIva = isPermisoCopiarDatoFormularioIva;
	}
	
	public Boolean getIsPermisoVerFormDatoFormularioIva() {
		return isPermisoVerFormDatoFormularioIva;
	}

	public void setIsPermisoVerFormDatoFormularioIva(Boolean isPermisoVerFormDatoFormularioIva) {
		this.isPermisoVerFormDatoFormularioIva = isPermisoVerFormDatoFormularioIva;
	}
	
	public Boolean getIsPermisoDuplicarDatoFormularioIva() {
		return isPermisoDuplicarDatoFormularioIva;
	}

	public void setIsPermisoDuplicarDatoFormularioIva(Boolean isPermisoDuplicarDatoFormularioIva) {
		this.isPermisoDuplicarDatoFormularioIva = isPermisoDuplicarDatoFormularioIva;
	}
	
	public Boolean getIsPermisoOrdenDatoFormularioIva() {
		return isPermisoOrdenDatoFormularioIva;
	}

	public void setIsPermisoOrdenDatoFormularioIva(Boolean isPermisoOrdenDatoFormularioIva) {
		this.isPermisoOrdenDatoFormularioIva = isPermisoOrdenDatoFormularioIva;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDatoFormularioIva() {
		return isVisibilidadCeldaNuevoDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaNuevoDatoFormularioIva(Boolean isVisibilidadCeldaNuevoDatoFormularioIva) {
		this.isVisibilidadCeldaNuevoDatoFormularioIva = isVisibilidadCeldaNuevoDatoFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDatoFormularioIva() {
		return isVisibilidadCeldaDuplicarDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaDuplicarDatoFormularioIva(Boolean isVisibilidadCeldaDuplicarDatoFormularioIva) {
		this.isVisibilidadCeldaDuplicarDatoFormularioIva = isVisibilidadCeldaDuplicarDatoFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDatoFormularioIva() {
		return isVisibilidadCeldaCopiarDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaCopiarDatoFormularioIva(Boolean isVisibilidadCeldaCopiarDatoFormularioIva) {
		this.isVisibilidadCeldaCopiarDatoFormularioIva = isVisibilidadCeldaCopiarDatoFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDatoFormularioIva() {
		return isVisibilidadCeldaVerFormDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaVerFormDatoFormularioIva(Boolean isVisibilidadCeldaVerFormDatoFormularioIva) {
		this.isVisibilidadCeldaVerFormDatoFormularioIva = isVisibilidadCeldaVerFormDatoFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDatoFormularioIva() {
		return isVisibilidadCeldaOrdenDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaOrdenDatoFormularioIva(Boolean isVisibilidadCeldaOrdenDatoFormularioIva) {
		this.isVisibilidadCeldaOrdenDatoFormularioIva = isVisibilidadCeldaOrdenDatoFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDatoFormularioIva() {
		return isVisibilidadCeldaNuevoRelacionesDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDatoFormularioIva(Boolean isVisibilidadCeldaNuevoRelacionesDatoFormularioIva) {
		this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva = isVisibilidadCeldaNuevoRelacionesDatoFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDatoFormularioIva() {
		return isVisibilidadCeldaModificarDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaModificarDatoFormularioIva(Boolean isVisibilidadCeldaModificarDatoFormularioIva) {
		this.isVisibilidadCeldaModificarDatoFormularioIva = isVisibilidadCeldaModificarDatoFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDatoFormularioIva() {
		return isVisibilidadCeldaActualizarDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaActualizarDatoFormularioIva(Boolean isVisibilidadCeldaActualizarDatoFormularioIva) {
		this.isVisibilidadCeldaActualizarDatoFormularioIva = isVisibilidadCeldaActualizarDatoFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaEliminarDatoFormularioIva() {
		return isVisibilidadCeldaEliminarDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaEliminarDatoFormularioIva(Boolean isVisibilidadCeldaEliminarDatoFormularioIva) {
		this.isVisibilidadCeldaEliminarDatoFormularioIva = isVisibilidadCeldaEliminarDatoFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaCancelarDatoFormularioIva() {
		return isVisibilidadCeldaCancelarDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaCancelarDatoFormularioIva(Boolean isVisibilidadCeldaCancelarDatoFormularioIva) {
		this.isVisibilidadCeldaCancelarDatoFormularioIva = isVisibilidadCeldaCancelarDatoFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaGuardarDatoFormularioIva() {
		return isVisibilidadCeldaGuardarDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaGuardarDatoFormularioIva(Boolean isVisibilidadCeldaGuardarDatoFormularioIva) {
		this.isVisibilidadCeldaGuardarDatoFormularioIva = isVisibilidadCeldaGuardarDatoFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDatoFormularioIva() {
		return isVisibilidadCeldaGuardarCambiosDatoFormularioIva;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDatoFormularioIva(Boolean isVisibilidadCeldaGuardarCambiosDatoFormularioIva) {
		this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva = isVisibilidadCeldaGuardarCambiosDatoFormularioIva;
	}
		
	public DatoFormularioIvaSessionBean getdatoformularioivaSessionBean() {
		return this.datoformularioivaSessionBean;
	}
	
	public void setdatoformularioivaSessionBean(DatoFormularioIvaSessionBean datoformularioivaSessionBean) {
		this.datoformularioivaSessionBean=datoformularioivaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdAnioIdSemestre() {
		return this.isVisibilidadBusquedaPorIdAnioIdSemestre;
	}

	public void setisVisibilidadBusquedaPorIdAnioIdSemestre(Boolean isVisibilidadBusquedaPorIdAnioIdSemestre) {
		this.isVisibilidadBusquedaPorIdAnioIdSemestre=isVisibilidadBusquedaPorIdAnioIdSemestre;
	}

	public Boolean getisVisibilidadBusquedaPorIdAnioPorIdMes() {
		return this.isVisibilidadBusquedaPorIdAnioPorIdMes;
	}

	public void setisVisibilidadBusquedaPorIdAnioPorIdMes(Boolean isVisibilidadBusquedaPorIdAnioPorIdMes) {
		this.isVisibilidadBusquedaPorIdAnioPorIdMes=isVisibilidadBusquedaPorIdAnioPorIdMes;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdSemestre() {
		return this.isVisibilidadFK_IdSemestre;
	}

	public void setisVisibilidadFK_IdSemestre(Boolean isVisibilidadFK_IdSemestre) {
		this.isVisibilidadFK_IdSemestre=isVisibilidadFK_IdSemestre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(DatoFormularioIva datoformularioiva)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(datoformularioiva,null);
				this.setActualParaGuardarMesForeignKey(datoformularioiva,null);
				this.setActualParaGuardarSemestreForeignKey(datoformularioiva,null);
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
	
	public void bugActualizarReferenciaActual(DatoFormularioIva datoformularioiva,DatoFormularioIva datoformularioivaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDatoFormularioIva(datoformularioiva);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		datoformularioivaAux.setId(datoformularioiva.getId());
		datoformularioivaAux.setVersionRow(datoformularioiva.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDatoFormularioIva();
		
			int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = datoformularioivaValidator.getInvalidValues(this.datoformularioiva);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			datoformularioivaLogic.setDatosCliente(datosCliente);
			datoformularioivaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				datoformularioivaAux=new  DatoFormularioIva();
				
				datoformularioivaAux.setIsNew(true);
				datoformularioivaAux.setIsChanged(true);
				
				datoformularioivaAux.setDatoFormularioIvaOriginal(this.datoformularioiva);
				
				datoformularioivaAux.setId(this.datoformularioiva.getId());	
				datoformularioivaAux.setVersionRow(this.datoformularioiva.getVersionRow());	
				datoformularioivaAux.setes_mensual(this.datoformularioiva.getes_mensual());	
				datoformularioivaAux.setid_anio(this.datoformularioiva.getid_anio());	
				datoformularioivaAux.setid_mes(this.datoformularioiva.getid_mes());	
				datoformularioivaAux.setid_semestre(this.datoformularioiva.getid_semestre());	
				datoformularioivaAux.setes_sustitutiva(this.datoformularioiva.getes_sustitutiva());	
				datoformularioivaAux.setnumero_formulario(this.datoformularioiva.getnumero_formulario());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.datoformularioivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(datoformularioivaAux,datoformularioivaLogic.getDatoFormularioIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoformularioivaAux,datoformularioivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datoformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivaLogic.saveDatoFormularioIvas();//WithConnection
						//datoformularioivaLogic.getSetVersionRowDatoFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.datoformularioiva,datoformularioivaAux);
					
					this.refrescarForeignKeysDescripcionesDatoFormularioIva();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas().addAll(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivas.addAll(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datoformularioivaLogic.saveDatoFormularioIvaRelaciones(datoformularioivaAux,this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());//WithConnection
								//datoformularioivaLogic.getSetVersionRowDatoFormularioIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.datoformularioiva,datoformularioivaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivas= new ArrayList<FormularioIva>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();}
							datoformularioivaAux.setFormularioIvas(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.datoformularioivaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(datoformularioivaAux,datoformularioivaLogic.getDatoFormularioIvas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(datoformularioivaAux,datoformularioivas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.datoformularioiva,datoformularioivaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				datoformularioivaAux=new  DatoFormularioIva();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado() 
					|| (this.datoformularioivaSessionBean.getEsGuardarRelacionado() && this.datoformularioiva.getId()>=0)) {
						
					datoformularioivaAux.setIsNew(false);
				}
				
				datoformularioivaAux.setIsDeleted(false);
			
				datoformularioivaAux.setId(this.datoformularioiva.getId());	
				datoformularioivaAux.setVersionRow(this.datoformularioiva.getVersionRow());	
				datoformularioivaAux.setes_mensual(this.datoformularioiva.getes_mensual());	
				datoformularioivaAux.setid_anio(this.datoformularioiva.getid_anio());	
				datoformularioivaAux.setid_mes(this.datoformularioiva.getid_mes());	
				datoformularioivaAux.setid_semestre(this.datoformularioiva.getid_semestre());	
				datoformularioivaAux.setes_sustitutiva(this.datoformularioiva.getes_sustitutiva());	
				datoformularioivaAux.setnumero_formulario(this.datoformularioiva.getnumero_formulario());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(datoformularioivaAux,datoformularioivaLogic.getDatoFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoformularioivaAux,datoformularioivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datoformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivaLogic.saveDatoFormularioIvas();//WithConnection
						//datoformularioivaLogic.getSetVersionRowDatoFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.datoformularioiva,datoformularioivaAux);
					
					this.refrescarForeignKeysDescripcionesDatoFormularioIva();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas().addAll(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivas.addAll(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datoformularioivaLogic.saveDatoFormularioIvaRelaciones(datoformularioivaAux,this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());//WithConnection
								//datoformularioivaLogic.getSetVersionRowDatoFormularioIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.datoformularioiva,datoformularioivaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivas= new ArrayList<FormularioIva>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();}
							datoformularioivaAux.setFormularioIvas(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.datoformularioivaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(datoformularioivaAux,datoformularioivaLogic.getDatoFormularioIvas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(datoformularioivaAux,datoformularioivas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.datoformularioiva,datoformularioivaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				datoformularioivaAux=new  DatoFormularioIva();
				
				datoformularioivaAux.setIsNew(false);
				datoformularioivaAux.setIsChanged(false);
				
				datoformularioivaAux.setIsDeleted(true);
				
				datoformularioivaAux.setId(this.datoformularioiva.getId());	
				datoformularioivaAux.setVersionRow(this.datoformularioiva.getVersionRow());	
				datoformularioivaAux.setes_mensual(this.datoformularioiva.getes_mensual());	
				datoformularioivaAux.setid_anio(this.datoformularioiva.getid_anio());	
				datoformularioivaAux.setid_mes(this.datoformularioiva.getid_mes());	
				datoformularioivaAux.setid_semestre(this.datoformularioiva.getid_semestre());	
				datoformularioivaAux.setes_sustitutiva(this.datoformularioiva.getes_sustitutiva());	
				datoformularioivaAux.setnumero_formulario(this.datoformularioiva.getnumero_formulario());	
				
				if(this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.datoformularioivaAux.getId()>=0) {	
						this.datoformularioivasEliminados.add(datoformularioivaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(datoformularioivaAux,datoformularioivaLogic.getDatoFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoformularioivaAux,datoformularioivas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datoformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivaLogic.saveDatoFormularioIvas();//WithConnection
						//datoformularioivaLogic.getSetVersionRowDatoFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas().addAll(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivas.addAll(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datoformularioivaLogic.saveDatoFormularioIvaRelaciones(datoformularioivaAux,this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());//WithConnection
								//datoformularioivaLogic.getSetVersionRowDatoFormularioIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivas= new ArrayList<FormularioIva>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();}
							datoformularioivaAux.setFormularioIvas(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.datoformularioivaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(datoformularioivaAux,datoformularioivaLogic.getDatoFormularioIvas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(datoformularioivaAux,datoformularioivas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.getDatoFormularioIvas().addAll(this.datoformularioivasEliminados);
					
					datoformularioivaLogic.saveDatoFormularioIvas();//WithConnection
					//datoformularioivaLogic.getSetVersionRowDatoFormularioIvas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDatoFormularioIva();
				
				this.datoformularioivasEliminados= new ArrayList<DatoFormularioIva>();		
			}
			
			if(this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Dato Formulario Iva GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Dato Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.datoformularioiva=datoformularioivaAux;
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
      		//this.finishProcessDatoFormularioIva();
      	}
		
	}	
	
	public void actualizarRelaciones(DatoFormularioIva datoformularioivaLocal) throws Exception {
		
		if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				datoformularioivaLocal.setFormularioIvas(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());
			
			} else {
			
				datoformularioivaLocal.setFormularioIvas(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DatoFormularioIva datoformularioivaLocal) throws Exception {	
		if(this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				datoformularioivaLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				datoformularioivaLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SemestreDetalleFormJInternalFrame.class)) {
				SemestreBeanSwingJInternalFrame semestreBeanSwingJInternalFrameLocal=(SemestreBeanSwingJInternalFrame) ((SemestreDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				semestreBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSemestre(semestreBeanSwingJInternalFrameLocal.getsemestre(),true);
				semestreBeanSwingJInternalFrameLocal.actualizarLista(semestreBeanSwingJInternalFrameLocal.semestre,this.semestresForeignKey);

				semestreBeanSwingJInternalFrameLocal.actualizarRelaciones(semestreBeanSwingJInternalFrameLocal.semestre);

				datoformularioivaLocal.setSemestre(semestreBeanSwingJInternalFrameLocal.semestre);

				this.addItemDefectoCombosForeignKeySemestre();
				this.cargarCombosFrameSemestresForeignKey("Formulario");
				this.setActualSemestreForeignKey(semestreBeanSwingJInternalFrameLocal.semestre.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDatoFormularioIvaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = datoformularioivaValidator.getInvalidValues(this.datoformularioiva);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DatoFormularioIva datoformularioiva,List<DatoFormularioIva> datoformularioivas) throws Exception {
		try	{		
			DatoFormularioIvaConstantesFunciones.actualizarLista(datoformularioiva,datoformularioivas,this.datoformularioivaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DatoFormularioIva datoformularioiva,List<DatoFormularioIva> datoformularioivas) throws Exception {
		try	{			
			DatoFormularioIvaConstantesFunciones.actualizarSelectedLista(datoformularioiva,datoformularioivas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DatoFormularioIva> datoformularioivasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				datoformularioivasLocal=this.datoformularioivaLogic.getDatoFormularioIvas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				datoformularioivasLocal=this.datoformularioivas;
			}
			//ARCHITECTURE
		
			for(DatoFormularioIva datoformularioivaLocal:datoformularioivasLocal) {
				if(this.permiteMantenimiento(datoformularioivaLocal) && datoformularioivaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DatoFormularioIvaConstantesFunciones.getDatoFormularioIvaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DatoFormularioIvaConstantesFunciones.ESMENSUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioIva.jLabeles_mensualDatoFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoFormularioIvaConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioIva.jLabelid_anioDatoFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoFormularioIvaConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioIva.jLabelid_mesDatoFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoFormularioIvaConstantesFunciones.IDSEMESTRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioIva.jLabelid_semestreDatoFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoFormularioIvaConstantesFunciones.ESSUSTITUTIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioIva.jLabeles_sustitutivaDatoFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoFormularioIvaConstantesFunciones.NUMEROFORMULARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioIva.jLabelnumero_formularioDatoFormularioIva,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioIva.jLabeles_mensualDatoFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioIva.jLabelid_anioDatoFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioIva.jLabelid_mesDatoFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioIva.jLabelid_semestreDatoFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioIva.jLabeles_sustitutivaDatoFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioIva.jLabelnumero_formularioDatoFormularioIva,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FormularioIva")) {
			if(this.datoformularioiva==null) {
				this.datoformularioiva= new DatoFormularioIva();
			}

			if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoDatoFormularioIva
				this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);

				this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.getformularioiva().setDatoFormularioIva(this.datoformularioiva);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoDatoFormularioIva--;	
		
		
		this.datoformularioivaAux=new DatoFormularioIva();
		
		this.datoformularioivaAux.setId(this.iIdNuevoDatoFormularioIva);
		this.datoformularioivaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.datoformularioivaLogic.getDatoFormularioIvas().add(this.datoformularioivaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.datoformularioivas.add(this.datoformularioivaAux);
		}
		//ARCHITECTURE
		
		this.datoformularioiva=this.datoformularioivaAux;
		
		if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDatoFormularioIva(this.datoformularioiva);
			this.setVariablesObjetoActualToFormularioForeignKeyDatoFormularioIva(this.datoformularioiva);
		}
				
		//this.setDefaultControlesDatoFormularioIva();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDatoFormularioIva();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDatoFormularioIva();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDatoFormularioIva();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDatoFormularioIva(this.datoformularioivaBean,this.datoformularioiva,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
			classes=DatoFormularioIvaConstantesFunciones.getClassesRelationshipsOfDatoFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.datoformularioivaReturnGeneral=datoformularioivaLogic.procesarEventosDatoFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datoformularioivaLogic.getDatoFormularioIvas(),this.datoformularioiva,this.datoformularioivaParameterGeneral,this.isEsNuevoDatoFormularioIva,classes);//this.datoformularioivaLogic.getDatoFormularioIva()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDatoFormularioIva(this.datoformularioivaReturnGeneral,this.datoformularioivaBean,false);
		
		if(this.datoformularioivaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDatoFormularioIva(this.datoformularioivaReturnGeneral.getDatoFormularioIva());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDatoFormularioIva(this.datoformularioivaReturnGeneral.getDatoFormularioIva());
		}
		
		if(this.datoformularioivaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDatoFormularioIva(this.datoformularioivaReturnGeneral.getDatoFormularioIva(),classes);//this.datoformularioivaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDatoFormularioIva();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDatoFormularioIva();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.RecargarFormDatoFormularioIva(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDatoFormularioIva(false);
						
			if(datoformularioivaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.getEsGuardarRelacionado() && FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormularioIvaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoFormularioIva();
			}
			
			this.actualizarVisualTableDatosDatoFormularioIva();
			
			this.jTableDatosDatoFormularioIva.setRowSelectionInterval(this.getIndiceNuevoDatoFormularioIva(), this.getIndiceNuevoDatoFormularioIva());
			
			this.seleccionarFilaTablaDatoFormularioIvaActual();
						
			this.actualizarEstadoCeldasBotonesDatoFormularioIva("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDatoFormularioIva(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_mensualDatoFormularioIva.setEnabled(isHabilitar && this.datoformularioivaConstantesFunciones.activares_mensualDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_sustitutivaDatoFormularioIva.setEnabled(isHabilitar && this.datoformularioivaConstantesFunciones.activares_sustitutivaDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jTextFieldnumero_formularioDatoFormularioIva.setEnabled(isHabilitar && this.datoformularioivaConstantesFunciones.activarnumero_formularioDatoFormularioIva);	
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.setEnabled(isHabilitar && this.datoformularioivaConstantesFunciones.activarid_anioDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.setEnabled(isHabilitar && this.datoformularioivaConstantesFunciones.activarid_mesDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.setEnabled(isHabilitar && this.datoformularioivaConstantesFunciones.activarid_semestreDatoFormularioIva);
	};
	
	public void setDefaultControlesDatoFormularioIva() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDatoFormularioIva(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.datoformularioivaSessionBean.setConGuardarRelaciones(true);			
			this.datoformularioivaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDatoFormularioIva.jTabbedPaneRelacionesDatoFormularioIva.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.datoformularioivaSessionBean.setConGuardarRelaciones(false);			
			this.datoformularioivaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDatoFormularioIva.jTabbedPaneRelacionesDatoFormularioIva.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoDatoFormularioIva() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoFormularioIva datoformularioivaAux:this.datoformularioivaLogic.getDatoFormularioIvas()) {
				if(datoformularioivaAux.getId().equals(this.iIdNuevoDatoFormularioIva)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoFormularioIva datoformularioivaAux:this.datoformularioivas) {
				if(datoformularioivaAux.getId().equals(this.iIdNuevoDatoFormularioIva)) {
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
	
	public int getIndiceActualDatoFormularioIva(DatoFormularioIva datoformularioiva,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoFormularioIva datoformularioivaAux:this.datoformularioivaLogic.getDatoFormularioIvas()) {
				if(datoformularioivaAux.getId().equals(datoformularioiva.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoFormularioIva datoformularioivaAux:this.datoformularioivas) {
				if(datoformularioivaAux.getId().equals(datoformularioiva.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDatoFormularioIva(DatoFormularioIva datoformularioivaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoFormularioIva datoformularioivaAux:this.datoformularioivaLogic.getDatoFormularioIvas()) {
				if(datoformularioivaAux.getDatoFormularioIvaOriginal().getId().equals(datoformularioivaOriginal.getId())) {
					existe=true;
					datoformularioivaOriginal.setId(datoformularioivaAux.getId());
					datoformularioivaOriginal.setVersionRow(datoformularioivaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoFormularioIva datoformularioivaAux:this.datoformularioivas) {
				if(datoformularioivaAux.getDatoFormularioIvaOriginal().getId().equals(datoformularioivaOriginal.getId())) {
					existe=true;
					datoformularioivaOriginal.setId(datoformularioivaAux.getId());
					datoformularioivaOriginal.setVersionRow(datoformularioivaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDatoFormularioIva(Boolean esParaCancelar) throws Exception {
		datoformularioivasAux=new ArrayList<DatoFormularioIva>();
		datoformularioivaAux=new DatoFormularioIva();
		
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DatoFormularioIva datoformularioivaAux:this.datoformularioivaLogic.getDatoFormularioIvas()) {
					if(datoformularioivaAux.getId()<0) {
						datoformularioivasAux.add(datoformularioivaAux);
					}		
				}
				this.iIdNuevoDatoFormularioIva=0L;
				this.datoformularioivaLogic.getDatoFormularioIvas().removeAll(datoformularioivasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoFormularioIva datoformularioivaAux:this.datoformularioivas) {
					if(datoformularioivaAux.getId()<0) {
						datoformularioivasAux.add(datoformularioivaAux);
					}		
				}
				this.iIdNuevoDatoFormularioIva=0L;
				this.datoformularioivas.removeAll(datoformularioivasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDatoFormularioIva 
					&& this.datoformularioivaLogic.getDatoFormularioIvas().size()>0
					) {
					datoformularioivaAux=this.datoformularioivaLogic.getDatoFormularioIvas().get(this.datoformularioivaLogic.getDatoFormularioIvas().size() - 1);
				
					if(datoformularioivaAux.getId()<0) {
						this.datoformularioivaLogic.getDatoFormularioIvas().remove(datoformularioivaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDatoFormularioIva && this.datoformularioivas.size()>0) {
					datoformularioivaAux=this.datoformularioivas.get(this.datoformularioivas.size() - 1);
				
					if(datoformularioivaAux.getId()<0) {
						this.datoformularioivas.remove(datoformularioivaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDatoFormularioIva(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(datoformularioiva.getId()<0) {
				this.datoformularioivaLogic.getDatoFormularioIvas().remove(this.datoformularioiva);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(datoformularioiva.getId()<0) {
				this.datoformularioivas.remove(this.datoformularioiva);
			}
		}			
	}
	
	public void setEstadosInicialesDatoFormularioIva(List<DatoFormularioIva> datoformularioivasAux) throws Exception {
		DatoFormularioIvaConstantesFunciones.setEstadosInicialesDatoFormularioIva(datoformularioivasAux);
	}
	
	public void setEstadosInicialesDatoFormularioIva(DatoFormularioIva datoformularioivaAux) throws Exception {
		DatoFormularioIvaConstantesFunciones.setEstadosInicialesDatoFormularioIva(datoformularioivaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDatoFormularioIvaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDatoFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDatoFormularioIvaActual()) {
				if(!this.isEsNuevoDatoFormularioIva) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDatoFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDatoFormularioIva=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDatoFormularioIvaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Dato Formulario Iva ?", "MANTENIMIENTO DE Dato Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDatoFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DatoFormularioIva datoformularioiva) throws Exception {
		DatoFormularioIvaConstantesFunciones.seleccionarAsignar(this.datoformularioiva,datoformularioiva);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDatoFormularioIva=this.isPermisoActualizarOriginalDatoFormularioIva;
			
			
			this.seleccionarAsignar(datoformularioiva);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DatoFormularioIvaConstantesFunciones.quitarEspaciosDatoFormularioIva(this.datoformularioiva,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDatoFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.datoformularioivaSessionBean.setsFuncionBusquedaRapida(this.datoformularioivaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDatoFormularioIva) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDatoFormularioIva(esParaCancelar);				
				this.cancelarNuevoDatoFormularioIva(esParaCancelar);								
			}
			
			this.datoformularioiva=new DatoFormularioIva();
			
			this.inicializarDatoFormularioIva();
			
			this.actualizarEstadoCeldasBotonesDatoFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDatoFormularioIva() throws Exception {
		try {
			DatoFormularioIvaConstantesFunciones.inicializarDatoFormularioIva(this.datoformularioiva);
			
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
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.datoformularioivaLogic.getDatoFormularioIvas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDatoFormularioIvas(String sAccionBusqueda,List<DatoFormularioIva> datoformularioivasParaReportes) throws Exception {
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
					sPathReporteFinal="DatoFormularioIva"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DatoFormularioIvaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DatoFormularioIvaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DatoFormularioIva"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Dato Formulario Ivas");		
		parameters.put("busquedapor", DatoFormularioIvaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FormularioIva.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					DatoFormularioIvaLogic datoformularioivaLogicAuxiliar=new DatoFormularioIvaLogic();
					datoformularioivaLogicAuxiliar.setDatosCliente(datoformularioivaLogic.getDatosCliente());				
					datoformularioivaLogicAuxiliar.setDatoFormularioIvas(datoformularioivasParaReportes);
					
					datoformularioivaLogicAuxiliar.cargarRelacionesLoteForeignKeyDatoFormularioIvaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					datoformularioivasParaReportes=datoformularioivaLogicAuxiliar.getDatoFormularioIvas();
					
					//datoformularioivaLogic.getNewConnexionToDeep();
					
					//for (DatoFormularioIva datoformularioiva:datoformularioivasParaReportes) {
					//	datoformularioivaLogic.deepLoad(datoformularioiva, false, DeepLoadType.INCLUDE, classes);
					//}						
					//datoformularioivaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//datoformularioivaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFormularioIva = AuxiliarReportes.class.getResourceAsStream("FormularioIvaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formularioiva", reportFileFormularioIva);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDatoFormularioIva=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DatoFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DatoFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDatoFormularioIva=new JRBeanArrayDataSource(DatoFormularioIvaJInternalFrame.TraerDatoFormularioIvaBeans(datoformularioivasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDatoFormularioIva);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DatoFormularioIvaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DatoFormularioIvaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DatoFormularioIvaBean.TraerDatoFormularioIvaBeans(datoformularioivasParaReportes).toArray()));
							
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
				this.generarExcelReporteDatoFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,datoformularioivasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDatoFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,datoformularioivasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDatoFormularioIvaActionPerformed(null);
					//this.generarExcelReporteDatoFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,datoformularioivasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDatoFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,datoformularioivasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDatoFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,datoformularioivasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDatoFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,datoformularioivasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDatoFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoFormularioIva> datoformularioivasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformularioiva";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoFormularioIvas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDatoFormularioIva("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DatoFormularioIva datoformularioiva : datoformularioivasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DatoFormularioIvaConstantesFunciones.generarExcelReporteDataDatoFormularioIva("NORMAL",row,workbook,datoformularioiva,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDatoFormularioIva(String sTipo,Row row,Workbook workbook) {
		
		DatoFormularioIvaConstantesFunciones.generarExcelReporteHeaderDatoFormularioIva(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDatoFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoFormularioIva> datoformularioivasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformularioiva_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoFormularioIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DatoFormularioIva datoformularioiva : datoformularioivasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DatoFormularioIvaConstantesFunciones.getDatoFormularioIvaDescripcion(datoformularioiva));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(datoformularioiva.getes_mensual()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioIvaConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoformularioiva.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioIvaConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoformularioiva.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoformularioiva.getsemestre_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(datoformularioiva.getes_sustitutiva()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoformularioiva.getnumero_formulario());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDatoFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoFormularioIva> datoformularioivasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DatoFormularioIva> datoformularioivasRespaldo=null;
		
		classes=DatoFormularioIvaConstantesFunciones.getClassesRelationshipsOfDatoFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.datoformularioivaLogic.setDatosCliente(this.datosCliente);
		this.datoformularioivaLogic.setDatosDeep(this.datosDeep);
		this.datoformularioivaLogic.setIsConDeep(true);
		
		datoformularioivasRespaldo=this.datoformularioivaLogic.getDatoFormularioIvas();
		
		this.datoformularioivaLogic.setDatoFormularioIvas(datoformularioivasParaReportes);	
		this.datoformularioivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		datoformularioivasParaReportes=this.datoformularioivaLogic.getDatoFormularioIvas();
		this.datoformularioivaLogic.setDatoFormularioIvas(datoformularioivasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformularioiva_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoFormularioIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDatoFormularioIva("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DatoFormularioIva datoformularioiva : datoformularioivasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDatoFormularioIva("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DatoFormularioIvaConstantesFunciones.generarExcelReporteDataDatoFormularioIva("NORMAL",row,workbook,datoformularioiva,cellStyleDataAux);
		
			
			


				//FormularioIva
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormularioIvaConstantesFunciones.SCLASSWEBTITULO))) {

				if(datoformularioiva.getFormularioIvas()!=null && datoformularioiva.getFormularioIvas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormularioIvaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormularioIvaConstantesFunciones.generarExcelReporteHeaderFormularioIva("RELACIONADO",row,workbook);
				}

				if(datoformularioiva.getFormularioIvas()!=null) {
					i2=0;
					for(FormularioIva formularioiva : datoformularioiva.getFormularioIvas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormularioIvaConstantesFunciones.generarExcelReporteDataFormularioIva("RELACIONADO",row,workbook,formularioiva,cellStyleDataAuxHijo);
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
		cell.setCellValue(DatoFormularioIvaConstantesFunciones.getDatoFormularioIvaDescripcion(datoformularioiva));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDatoFormularioIva() throws Exception {		
		this.startProcessDatoFormularioIva(true);
	}
	
	public void startProcessDatoFormularioIva(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDatoFormularioIva ,this.jPanelParametrosReportesDatoFormularioIva, this.jScrollPanelDatosDatoFormularioIva,this.jPanelPaginacionDatoFormularioIva, this.jScrollPanelDatosEdicionDatoFormularioIva, this.jPanelAccionesDatoFormularioIva,this.jPanelAccionesFormularioDatoFormularioIva,this.jmenuBarDatoFormularioIva,this.jmenuBarDetalleDatoFormularioIva,this.jTtoolBarDatoFormularioIva,this.jTtoolBarDetalleDatoFormularioIva);		
		
		final JTabbedPane jTabbedPaneBusquedasDatoFormularioIva=this.jTabbedPaneBusquedasDatoFormularioIva; 
		
		final JPanel jPanelParametrosReportesDatoFormularioIva=this.jPanelParametrosReportesDatoFormularioIva;
		//final JScrollPane jScrollPanelDatosDatoFormularioIva=this.jScrollPanelDatosDatoFormularioIva;
		final JTable jTableDatosDatoFormularioIva=this.jTableDatosDatoFormularioIva;		
		final JPanel jPanelPaginacionDatoFormularioIva=this.jPanelPaginacionDatoFormularioIva;
		//final JScrollPane jScrollPanelDatosEdicionDatoFormularioIva=this.jScrollPanelDatosEdicionDatoFormularioIva;
		final JPanel jPanelAccionesDatoFormularioIva=this.jPanelAccionesDatoFormularioIva;
		
		JPanel jPanelCamposAuxiliarDatoFormularioIva=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDatoFormularioIva=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			jPanelCamposAuxiliarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jPanelCamposDatoFormularioIva;
			jPanelAccionesFormularioAuxiliarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jPanelAccionesFormularioDatoFormularioIva;
		}
		
		final JPanel jPanelCamposDatoFormularioIva=jPanelCamposAuxiliarDatoFormularioIva;
		final JPanel jPanelAccionesFormularioDatoFormularioIva=jPanelAccionesFormularioAuxiliarDatoFormularioIva;
		
		
		final JMenuBar jmenuBarDatoFormularioIva=this.jmenuBarDatoFormularioIva;
		final JToolBar jTtoolBarDatoFormularioIva=this.jTtoolBarDatoFormularioIva;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDatoFormularioIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDatoFormularioIva=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			jmenuBarDetalleAuxiliarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jmenuBarDetalleDatoFormularioIva;
			jTtoolBarDetalleAuxiliarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jTtoolBarDetalleDatoFormularioIva;
		}
		
		final JMenuBar jmenuBarDetalleDatoFormularioIva=jmenuBarDetalleAuxiliarDatoFormularioIva;
		final JToolBar jTtoolBarDetalleDatoFormularioIva=jTtoolBarDetalleAuxiliarDatoFormularioIva;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDatoFormularioIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDatoFormularioIva;
			processRunnable.jTableDatos=jTableDatosDatoFormularioIva;
			processRunnable.jPanelCampos=jPanelCamposDatoFormularioIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionDatoFormularioIva;
			processRunnable.jPanelAcciones=jPanelAccionesDatoFormularioIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDatoFormularioIva;
			
			
			processRunnable.jmenuBar=jmenuBarDatoFormularioIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDatoFormularioIva;
			processRunnable.jTtoolBar=jTtoolBarDatoFormularioIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDatoFormularioIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDatoFormularioIva ,jPanelParametrosReportesDatoFormularioIva,jTableDatosDatoFormularioIva, /*jScrollPanelDatosDatoFormularioIva,*/jPanelCamposDatoFormularioIva,jPanelPaginacionDatoFormularioIva, /*jScrollPanelDatosEdicionDatoFormularioIva,*/ jPanelAccionesDatoFormularioIva,jPanelAccionesFormularioDatoFormularioIva,jmenuBarDatoFormularioIva,jmenuBarDetalleDatoFormularioIva,jTtoolBarDatoFormularioIva,jTtoolBarDetalleDatoFormularioIva);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDatoFormularioIva ,jPanelParametrosReportesDatoFormularioIva, jScrollPanelDatosDatoFormularioIva,jPanelPaginacionDatoFormularioIva, jScrollPanelDatosEdicionDatoFormularioIva, jPanelAccionesDatoFormularioIva,jPanelAccionesFormularioDatoFormularioIva,jmenuBarDatoFormularioIva,jmenuBarDetalleDatoFormularioIva,jTtoolBarDatoFormularioIva,jTtoolBarDetalleDatoFormularioIva);
						
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
	
	public void finishProcessDatoFormularioIva() {// throws Exception 
		this.finishProcessDatoFormularioIva(true);
	}
	
	public void finishProcessDatoFormularioIva(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDatoFormularioIva ,this.jPanelParametrosReportesDatoFormularioIva, this.jScrollPanelDatosDatoFormularioIva,this.jPanelPaginacionDatoFormularioIva, this.jScrollPanelDatosEdicionDatoFormularioIva, this.jPanelAccionesDatoFormularioIva,this.jPanelAccionesFormularioDatoFormularioIva,this.jmenuBarDatoFormularioIva,this.jmenuBarDetalleDatoFormularioIva,this.jTtoolBarDatoFormularioIva,this.jTtoolBarDetalleDatoFormularioIva);		
		
		final JTabbedPane jTabbedPaneBusquedasDatoFormularioIva=this.jTabbedPaneBusquedasDatoFormularioIva; 
		
		final JPanel jPanelParametrosReportesDatoFormularioIva=this.jPanelParametrosReportesDatoFormularioIva;
		//final JScrollPane jScrollPanelDatosDatoFormularioIva=this.jScrollPanelDatosDatoFormularioIva;
		final JTable jTableDatosDatoFormularioIva=this.jTableDatosDatoFormularioIva;		
		final JPanel jPanelPaginacionDatoFormularioIva=this.jPanelPaginacionDatoFormularioIva;
		//final JScrollPane jScrollPanelDatosEdicionDatoFormularioIva=this.jScrollPanelDatosEdicionDatoFormularioIva;
		final JPanel jPanelAccionesDatoFormularioIva=this.jPanelAccionesDatoFormularioIva;
		
		JPanel jPanelCamposAuxiliarDatoFormularioIva=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDatoFormularioIva=new JPanel();
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			jPanelCamposAuxiliarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jPanelCamposDatoFormularioIva;
			jPanelAccionesFormularioAuxiliarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jPanelAccionesFormularioDatoFormularioIva;
		}
		
		final JPanel jPanelCamposDatoFormularioIva=jPanelCamposAuxiliarDatoFormularioIva;
		final JPanel jPanelAccionesFormularioDatoFormularioIva=jPanelAccionesFormularioAuxiliarDatoFormularioIva;
		
		
		final JMenuBar jmenuBarDatoFormularioIva=this.jmenuBarDatoFormularioIva;		
		final JToolBar jTtoolBarDatoFormularioIva=this.jTtoolBarDatoFormularioIva;
				
		JMenuBar jmenuBarDetalleAuxiliarDatoFormularioIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDatoFormularioIva=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			jmenuBarDetalleAuxiliarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jmenuBarDetalleDatoFormularioIva;
			jTtoolBarDetalleAuxiliarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jTtoolBarDetalleDatoFormularioIva;		
		}
		
		final JMenuBar jmenuBarDetalleDatoFormularioIva=jmenuBarDetalleAuxiliarDatoFormularioIva;
		final JToolBar jTtoolBarDetalleDatoFormularioIva=jTtoolBarDetalleAuxiliarDatoFormularioIva;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDatoFormularioIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDatoFormularioIva;
			processRunnable.jTableDatos=jTableDatosDatoFormularioIva;
			processRunnable.jPanelCampos=jPanelCamposDatoFormularioIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionDatoFormularioIva;
			processRunnable.jPanelAcciones=jPanelAccionesDatoFormularioIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDatoFormularioIva;
			
			
			processRunnable.jmenuBar=jmenuBarDatoFormularioIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDatoFormularioIva;
			processRunnable.jTtoolBar=jTtoolBarDatoFormularioIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDatoFormularioIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDatoFormularioIva ,jPanelParametrosReportesDatoFormularioIva, jTableDatosDatoFormularioIva,/*jScrollPanelDatosDatoFormularioIva,*/jPanelCamposDatoFormularioIva,jPanelPaginacionDatoFormularioIva, /*jScrollPanelDatosEdicionDatoFormularioIva,*/ jPanelAccionesDatoFormularioIva,jPanelAccionesFormularioDatoFormularioIva,jmenuBarDatoFormularioIva,jmenuBarDetalleDatoFormularioIva,jTtoolBarDatoFormularioIva,jTtoolBarDetalleDatoFormularioIva));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDatoFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDatoFormularioIva(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDatoFormularioIva(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDatoFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDatoFormularioIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDatoFormularioIva,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDatoFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDatoFormularioIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDatoFormularioIva,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.datoformularioivaConstantesFunciones.getsFinalQueryDatoFormularioIva();
		String  finalQueryPaginacionTodos=this.datoformularioivaConstantesFunciones.getsFinalQueryDatoFormularioIva();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DatoFormularioIvaConstantesFunciones.getArrayColumnasGlobalesNoDatoFormularioIva(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DatoFormularioIvaConstantesFunciones.getArrayColumnasGlobalesDatoFormularioIva(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DatoFormularioIvaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.datoformularioivasEliminados= new ArrayList<DatoFormularioIva>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDatoFormularioIva();
		
				///*DatoFormularioIvaSessionBean*/this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
			
			if(this.datoformularioivaSessionBean==null) {
				this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
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
					this.iNumeroPaginacion=DatoFormularioIvaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DatoFormularioIvaConstantesFunciones.getClassesForeignKeysOfDatoFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/datoformularioiva."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			datoformularioivasAux= new ArrayList<DatoFormularioIva>();
			
				
			datoformularioivaLogic.setDatosCliente(this.datosCliente);
			datoformularioivaLogic.setDatosDeep(this.datosDeep);
			datoformularioivaLogic.setIsConDeep(true);
			
			
			datoformularioivaLogic.getDatoFormularioIvaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					datoformularioivaLogic.getTodosDatoFormularioIvas(finalQueryGlobal,pagination);
					
					//datoformularioivaLogic.getTodosDatoFormularioIvasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(datoformularioivaLogic.getDatoFormularioIvas()==null|| datoformularioivaLogic.getDatoFormularioIvas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datoformularioivasAux= new ArrayList<DatoFormularioIva>();
							datoformularioivasAux.addAll(datoformularioivaLogic.getDatoFormularioIvas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformularioivasAux= new ArrayList<DatoFormularioIva>();
							datoformularioivasAux.addAll(datoformularioivas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datoformularioivaLogic.getTodosDatoFormularioIvas(finalQueryGlobal+"",this.pagination);												
							
							//datoformularioivaLogic.getTodosDatoFormularioIvasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDatoFormularioIvas("Todos",datoformularioivaLogic.getDatoFormularioIvas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datoformularioivaLogic.setDatoFormularioIvas(new ArrayList<DatoFormularioIva>());					
							datoformularioivaLogic.getDatoFormularioIvas().addAll(datoformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformularioivas=new ArrayList<DatoFormularioIva>();
							datoformularioivas.addAll(datoformularioivasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDatoFormularioIva=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDatoFormularioIva=this.idActual;
				
				} else if(this.idDatoFormularioIvaActual!=null && this.idDatoFormularioIvaActual!=0L) {
					idDatoFormularioIva=idDatoFormularioIvaActual;
				}
				
					
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndicePorId(idDatoFormularioIva);
				
				this.datoformularioivas=new ArrayList<DatoFormularioIva>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					datoformularioivaLogic.getEntity(idDatoFormularioIva);
					
					//datoformularioivaLogic.getEntityWithConnection(idDatoFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformularioivaLogic.setDatoFormularioIvas(new ArrayList<DatoFormularioIva>());
					datoformularioivaLogic.getDatoFormularioIvas().add(datoformularioivaLogic.getDatoFormularioIva());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoformularioivas=new ArrayList<DatoFormularioIva>();
					this.datoformularioivas.add(datoformularioiva);
				}
				
				if(datoformularioivaLogic.getDatoFormularioIva()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdAnioIdSemestre")) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioIdSemestre(id_anioBusquedaPorIdAnioIdSemestre,id_semestreBusquedaPorIdAnioIdSemestre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datoformularioivaLogic.getDatoFormularioIvasBusquedaPorIdAnioIdSemestre(finalQueryGlobal,pagination,id_anioBusquedaPorIdAnioIdSemestre,id_semestreBusquedaPorIdAnioIdSemestre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioIdSemestre(id_anioBusquedaPorIdAnioIdSemestre,id_semestreBusquedaPorIdAnioIdSemestre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioIdSemestre(id_anioBusquedaPorIdAnioIdSemestre,id_semestreBusquedaPorIdAnioIdSemestre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datoformularioivaLogic.getDatoFormularioIvas()==null||datoformularioivaLogic.getDatoFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datoformularioivas==null|| datoformularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivasAux=new ArrayList<DatoFormularioIva>();
						datoformularioivasAux.addAll(datoformularioivaLogic.getDatoFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformularioivasAux=new ArrayList<DatoFormularioIva>();
							datoformularioivasAux.addAll(datoformularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datoformularioivaLogic.getDatoFormularioIvasBusquedaPorIdAnioIdSemestre(finalQueryGlobal,pagination,id_anioBusquedaPorIdAnioIdSemestre,id_semestreBusquedaPorIdAnioIdSemestre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioIdSemestre(id_anioBusquedaPorIdAnioIdSemestre,id_semestreBusquedaPorIdAnioIdSemestre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioIdSemestre(id_anioBusquedaPorIdAnioIdSemestre,id_semestreBusquedaPorIdAnioIdSemestre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoFormularioIvas("BusquedaPorIdAnioIdSemestre",datoformularioivaLogic.getDatoFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoFormularioIvas("BusquedaPorIdAnioIdSemestre",datoformularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivaLogic.setDatoFormularioIvas(new ArrayList<DatoFormularioIva>());
						datoformularioivaLogic.getDatoFormularioIvas().addAll(datoformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformularioivas=new ArrayList<DatoFormularioIva>();
							datoformularioivas.addAll(datoformularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorIdAnioPorIdMes")) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioPorIdMes(id_anioBusquedaPorIdAnioPorIdMes,id_mesBusquedaPorIdAnioPorIdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datoformularioivaLogic.getDatoFormularioIvasBusquedaPorIdAnioPorIdMes(finalQueryGlobal,pagination,id_anioBusquedaPorIdAnioPorIdMes,id_mesBusquedaPorIdAnioPorIdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioPorIdMes(id_anioBusquedaPorIdAnioPorIdMes,id_mesBusquedaPorIdAnioPorIdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioPorIdMes(id_anioBusquedaPorIdAnioPorIdMes,id_mesBusquedaPorIdAnioPorIdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datoformularioivaLogic.getDatoFormularioIvas()==null||datoformularioivaLogic.getDatoFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datoformularioivas==null|| datoformularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivasAux=new ArrayList<DatoFormularioIva>();
						datoformularioivasAux.addAll(datoformularioivaLogic.getDatoFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformularioivasAux=new ArrayList<DatoFormularioIva>();
							datoformularioivasAux.addAll(datoformularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datoformularioivaLogic.getDatoFormularioIvasBusquedaPorIdAnioPorIdMes(finalQueryGlobal,pagination,id_anioBusquedaPorIdAnioPorIdMes,id_mesBusquedaPorIdAnioPorIdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioPorIdMes(id_anioBusquedaPorIdAnioPorIdMes,id_mesBusquedaPorIdAnioPorIdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioPorIdMes(id_anioBusquedaPorIdAnioPorIdMes,id_mesBusquedaPorIdAnioPorIdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoFormularioIvas("BusquedaPorIdAnioPorIdMes",datoformularioivaLogic.getDatoFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoFormularioIvas("BusquedaPorIdAnioPorIdMes",datoformularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivaLogic.setDatoFormularioIvas(new ArrayList<DatoFormularioIva>());
						datoformularioivaLogic.getDatoFormularioIvas().addAll(datoformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformularioivas=new ArrayList<DatoFormularioIva>();
							datoformularioivas.addAll(datoformularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datoformularioivaLogic.getDatoFormularioIvasFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datoformularioivaLogic.getDatoFormularioIvas()==null||datoformularioivaLogic.getDatoFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datoformularioivas==null|| datoformularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivasAux=new ArrayList<DatoFormularioIva>();
						datoformularioivasAux.addAll(datoformularioivaLogic.getDatoFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformularioivasAux=new ArrayList<DatoFormularioIva>();
							datoformularioivasAux.addAll(datoformularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datoformularioivaLogic.getDatoFormularioIvasFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoFormularioIvas("FK_IdAnio",datoformularioivaLogic.getDatoFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoFormularioIvas("FK_IdAnio",datoformularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivaLogic.setDatoFormularioIvas(new ArrayList<DatoFormularioIva>());
						datoformularioivaLogic.getDatoFormularioIvas().addAll(datoformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformularioivas=new ArrayList<DatoFormularioIva>();
							datoformularioivas.addAll(datoformularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDatoFormularioIva();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDatoFormularioIva();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=datoformularioivaLogic.getDatoFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datoformularioivas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=datoformularioivaLogic.getDatoFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datoformularioivas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DatoFormularioIva datoformularioiva) {
		Boolean permite=true;
		
		if(this.datoformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DatoFormularioIvaConstantesFunciones.getOrderByListaDatoFormularioIva();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DatoFormularioIvaConstantesFunciones.getOrderByListaDatoFormularioIva();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoFormularioIva datoformularioiva:datoformularioivaLogic.getDatoFormularioIvas()) {
				if(datoformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					datoformularioivaTotales=datoformularioiva;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoFormularioIva datoformularioiva:this.datoformularioivas) {
				if(datoformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					datoformularioivaTotales=datoformularioiva;
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
			this.datoformularioivaAux=new DatoFormularioIva();
			this.datoformularioivaAux.setsType(Constantes2.S_TOTALES);
			this.datoformularioivaAux.setIsNew(false);
			this.datoformularioivaAux.setIsChanged(false);
			this.datoformularioivaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DatoFormularioIvaConstantesFunciones.TotalizarValoresFilaDatoFormularioIva(this.datoformularioivaLogic.getDatoFormularioIvas(),this.datoformularioivaAux);
				
				this.datoformularioivaLogic.getDatoFormularioIvas().add(this.datoformularioivaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DatoFormularioIvaConstantesFunciones.TotalizarValoresFilaDatoFormularioIva(this.datoformularioivas,this.datoformularioivaAux);
				
				this.datoformularioivas.add(this.datoformularioivaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		datoformularioivaTotales=new DatoFormularioIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.datoformularioivaLogic.getDatoFormularioIvas().remove(datoformularioivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.datoformularioivas.remove(datoformularioivaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		datoformularioivaTotales=new DatoFormularioIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoFormularioIva datoformularioiva:datoformularioivaLogic.getDatoFormularioIvas()) {
				if(datoformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					datoformularioivaTotales=datoformularioiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DatoFormularioIvaConstantesFunciones.TotalizarValoresFilaDatoFormularioIva(this.datoformularioivaLogic.getDatoFormularioIvas(),datoformularioivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoFormularioIva datoformularioiva:this.datoformularioivas) {
				if(datoformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					datoformularioivaTotales=datoformularioiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DatoFormularioIvaConstantesFunciones.TotalizarValoresFilaDatoFormularioIva(this.datoformularioivas,datoformularioivaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDatoFormularioIvasBusquedaPorIdAnioIdSemestre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdAnioIdSemestre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDatoFormularioIvasBusquedaPorIdAnioPorIdMes()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdAnioPorIdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDatoFormularioIvasFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDatoFormularioIvasFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDatoFormularioIvasFK_IdSemestre()throws Exception {
		try {
			sAccionBusqueda="FK_IdSemestre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDatoFormularioIvasBusquedaPorIdAnioIdSemestre(String sFinalQuery,Long id_anio,Long id_semestre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformularioivaLogic.getDatoFormularioIvasBusquedaPorIdAnioIdSemestre(sFinalQuery,this.pagination,id_anio,id_semestre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDatoFormularioIvasBusquedaPorIdAnioPorIdMes(String sFinalQuery,Long id_anio,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformularioivaLogic.getDatoFormularioIvasBusquedaPorIdAnioPorIdMes(sFinalQuery,this.pagination,id_anio,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDatoFormularioIvasFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformularioivaLogic.getDatoFormularioIvasFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDatoFormularioIvasFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformularioivaLogic.getDatoFormularioIvasFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDatoFormularioIvasFK_IdSemestre(String sFinalQuery,Long id_semestre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformularioivaLogic.getDatoFormularioIvasFK_IdSemestre(sFinalQuery,this.pagination,id_semestre);
				
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
	
	public void inicializarPermisosDatoFormularioIva() {
		this.isPermisoTodoDatoFormularioIva=false;
		this.isPermisoNuevoDatoFormularioIva=false;
		this.isPermisoActualizarDatoFormularioIva=false;
		this.isPermisoActualizarOriginalDatoFormularioIva=false;
		this.isPermisoEliminarDatoFormularioIva=false;
		this.isPermisoGuardarCambiosDatoFormularioIva=false;
		this.isPermisoConsultaDatoFormularioIva=false;
		this.isPermisoBusquedaDatoFormularioIva=false;
		this.isPermisoReporteDatoFormularioIva=false;		
		this.isPermisoOrdenDatoFormularioIva=false;		
		this.isPermisoPaginacionMedioDatoFormularioIva=false;		
		this.isPermisoPaginacionAltoDatoFormularioIva=false;
		this.isPermisoPaginacionTodoDatoFormularioIva=false;
		this.isPermisoCopiarDatoFormularioIva=false;		
		this.isPermisoVerFormDatoFormularioIva=false;		
		this.isPermisoDuplicarDatoFormularioIva=false;		
		this.isPermisoOrdenDatoFormularioIva=false;		
	}
	
	public void setPermisosUsuarioDatoFormularioIva(Boolean isPermiso) {
		this.isPermisoTodoDatoFormularioIva=isPermiso;
		this.isPermisoNuevoDatoFormularioIva=isPermiso;
		this.isPermisoActualizarDatoFormularioIva=isPermiso;
		this.isPermisoActualizarOriginalDatoFormularioIva=isPermiso;
		this.isPermisoEliminarDatoFormularioIva=isPermiso;
		this.isPermisoGuardarCambiosDatoFormularioIva=isPermiso;
		this.isPermisoConsultaDatoFormularioIva=isPermiso;
		this.isPermisoBusquedaDatoFormularioIva=isPermiso;
		this.isPermisoReporteDatoFormularioIva=isPermiso;
		this.isPermisoOrdenDatoFormularioIva=isPermiso;		
		this.isPermisoPaginacionMedioDatoFormularioIva=isPermiso;		
		this.isPermisoPaginacionAltoDatoFormularioIva=isPermiso;		
		this.isPermisoPaginacionTodoDatoFormularioIva=isPermiso;		
		this.isPermisoCopiarDatoFormularioIva=isPermiso;		
		this.isPermisoVerFormDatoFormularioIva=isPermiso;		
		this.isPermisoDuplicarDatoFormularioIva=isPermiso;
		this.isPermisoOrdenDatoFormularioIva=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDatoFormularioIva(Boolean isPermiso) {
		//this.isPermisoTodoDatoFormularioIva=isPermiso;
		this.isPermisoNuevoDatoFormularioIva=isPermiso;
		this.isPermisoActualizarDatoFormularioIva=isPermiso;
		this.isPermisoActualizarOriginalDatoFormularioIva=isPermiso;
		this.isPermisoEliminarDatoFormularioIva=isPermiso;
		this.isPermisoGuardarCambiosDatoFormularioIva=isPermiso;
		//this.isPermisoConsultaDatoFormularioIva=isPermiso;
		//this.isPermisoBusquedaDatoFormularioIva=isPermiso;
		//this.isPermisoReporteDatoFormularioIva=isPermiso;
		//this.isPermisoOrdenDatoFormularioIva=isPermiso;		
		//this.isPermisoPaginacionMedioDatoFormularioIva=isPermiso;		
		//this.isPermisoPaginacionAltoDatoFormularioIva=isPermiso;		
		//this.isPermisoPaginacionTodoDatoFormularioIva=isPermiso;		
		//this.isPermisoCopiarDatoFormularioIva=isPermiso;		
		//this.isPermisoDuplicarDatoFormularioIva=isPermiso;
		//this.isPermisoOrdenDatoFormularioIva=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDatoFormularioIvaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormularioIvaConstantesFunciones.SNOMBREOPCION);
		
		if(DatoFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFormularioIva=false;
		this.isTienePermisosFormularioIva=this.verificarGetPermisosUsuarioOpcionDatoFormularioIvaClaseRelacionada(this.opcionsRelacionadas,FormularioIvaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebDatoFormularioIva(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDatoFormularioIvaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormularioIva=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioDatoFormularioIvaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDatoFormularioIvaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDatoFormularioIvaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormularioIva && this.jInternalFrameDetalleFormDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jTabbedPaneRelacionesDatoFormularioIva.remove(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioDatoFormularioIva() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DatoFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DatoFormularioIvaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDatoFormularioIva=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDatoFormularioIva=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDatoFormularioIva=this.isPermisoActualizarDatoFormularioIva;
			this.isPermisoEliminarDatoFormularioIva=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDatoFormularioIva=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDatoFormularioIva=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDatoFormularioIva=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDatoFormularioIva=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDatoFormularioIva=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDatoFormularioIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDatoFormularioIva=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDatoFormularioIva=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDatoFormularioIva=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDatoFormularioIva=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDatoFormularioIva=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDatoFormularioIva=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDatoFormularioIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDatoFormularioIva.setToolTipText(this.jTableDatosDatoFormularioIva.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDatoFormularioIva(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDatoFormularioIva(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DatoFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DatoFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDatoFormularioIva() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormularioIva && this.datoformularioivaConstantesFunciones.mostrarFormularioIvaDatoFormularioIva && !DatoFormularioIvaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formulario Iva");
			reporte.setsDescripcion("Formulario Iva");
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
	public void inicializarCombosForeignKeyDatoFormularioIvaListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.semestresForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDatoFormularioIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DatoFormularioIvaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDatoFormularioIvaListas(false);
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySemestreListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySemestreListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.semestresForeignKey==null||this.semestresForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SemestreConstantesFunciones.getArrayColumnasGlobalesSemestre(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SemestreConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SemestreConstantesFunciones.SFINALQUERY;

				this.cargarCombosSemestresForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDatoFormularioIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DatoFormularioIvaParameterReturnGeneral datoformularioivaReturnGeneral=new DatoFormularioIvaParameterReturnGeneral();
						
			


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.datoformularioivaConstantesFunciones.cargarid_anioDatoFormularioIva)
					 || (this.esRecargarFks && this.datoformularioivaConstantesFunciones.cargarid_anioDatoFormularioIva)) {

					if(!this.datoformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+datoformularioivaSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.datoformularioivaConstantesFunciones.cargarid_mesDatoFormularioIva)
					 || (this.esRecargarFks && this.datoformularioivaConstantesFunciones.cargarid_mesDatoFormularioIva)) {

					if(!this.datoformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+datoformularioivaSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}


				String finalQueryGlobalSemestre="";

				if(((this.semestresForeignKey==null||this.semestresForeignKey.size()<=0) && this.datoformularioivaConstantesFunciones.cargarid_semestreDatoFormularioIva)
					 || (this.esRecargarFks && this.datoformularioivaConstantesFunciones.cargarid_semestreDatoFormularioIva)) {

					if(!this.datoformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionSemestre()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SemestreConstantesFunciones.getArrayColumnasGlobalesSemestre(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSemestre=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SemestreConstantesFunciones.TABLENAME);

						finalQueryGlobalSemestre=Funciones.GetFinalQueryAppend(finalQueryGlobalSemestre, "");
						finalQueryGlobalSemestre+=SemestreConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSemestresForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSemestre=" WHERE " + ConstantesSql.ID + "="+datoformularioivaSessionBean.getlidSemestreActual();
					}
				} else {
					finalQueryGlobalSemestre="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				datoformularioivaReturnGeneral=datoformularioivaLogic.cargarCombosLoteForeignKeyDatoFormularioIva(finalQueryGlobalAnio,finalQueryGlobalMes,finalQueryGlobalSemestre);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=datoformularioivaReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=datoformularioivaReturnGeneral.getmessForeignKey();
			}

			if(!finalQueryGlobalSemestre.equals("NONE")) {
				this.semestresForeignKey=datoformularioivaReturnGeneral.getsemestresForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDatoFormularioIva()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeySemestre();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.datoformularioivaSessionBean==null) {
				this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
			}

			if(!this.datoformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.datoformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySemestre()throws Exception {
		try {

			if(!this.datoformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionSemestre()) {
				Semestre semestre=new Semestre();
				SemestreConstantesFunciones.setSemestreDescripcion(semestre,Constantes.SMENSAJE_ESCOJA_OPCION);
				semestre.setId(null);

				if(!SemestreConstantesFunciones.ExisteEnLista(this.semestresForeignKey,semestre,true)) {

					this.semestresForeignKey.add(0,semestre);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDatoFormularioIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDatoFormularioIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDatoFormularioIva()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDatoFormularioIva();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDatoFormularioIva(DatoFormularioIva datoformularioiva)throws Exception {	
		try {
			
			this.setActualSemestreForeignKey(datoformularioiva.getid_semestre(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDatoFormularioIva(DatoFormularioIva datoformularioiva,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDatoFormularioIva()throws Exception {	
		try {
			
			this.setActualSemestreForeignKey(this.datoformularioivaConstantesFunciones.getid_semestre(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDatoFormularioIva()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDatoFormularioIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDatoFormularioIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDatoFormularioIva()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDatoFormularioIva()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameSemestresForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDatoFormularioIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSemestresForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDatoFormularioIva()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public DatoFormularioIvaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DatoFormularioIvaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DatoFormularioIvaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean(); 
		this.datoformularioivaConstantesFunciones=new DatoFormularioIvaConstantesFunciones(); 
		this.datoformularioivaBean=new DatoFormularioIva();//(this.datoformularioivaConstantesFunciones); 		
		this.datoformularioivaReturnGeneral=new DatoFormularioIvaParameterReturnGeneral(); 
		
		this.datoformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datoformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DatoFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DatoFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DatoFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDatoFormularioIva(true);
			
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
			
			this.datoformularioivaConstantesFunciones=new DatoFormularioIvaConstantesFunciones(); 
			this.datoformularioivaBean=new DatoFormularioIva();//this.datoformularioivaConstantesFunciones); 			
			this.datoformularioivaReturnGeneral=new DatoFormularioIvaParameterReturnGeneral(); 
		
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dato Formulario Iva Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.datoformularioiva=new DatoFormularioIva();
			this.datoformularioivas = new ArrayList<DatoFormularioIva>();
			this.datoformularioivasAux = new ArrayList<DatoFormularioIva>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic=new DatoFormularioIvaLogic();
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}
			
			//this.datoformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.datoformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDatoFormularioIva);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDatoFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDatoFormularioIva);	
					}
					
					if(this.jInternalFrameImportacionDatoFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDatoFormularioIva);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDatoFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDatoFormularioIva);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDatoFormularioIva);
				this.jInternalFrameDetalleFormDatoFormularioIva.setVisible(false);
				this.jInternalFrameDetalleFormDatoFormularioIva.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDatoFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDatoFormularioIva);
					this.jInternalFrameReporteDinamicoDatoFormularioIva.setVisible(false);
					this.jInternalFrameReporteDinamicoDatoFormularioIva.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDatoFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDatoFormularioIva);
					this.jInternalFrameImportacionDatoFormularioIva.setVisible(false);
					this.jInternalFrameImportacionDatoFormularioIva.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDatoFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDatoFormularioIva);
					this.jInternalFrameOrderByDatoFormularioIva.setVisible(false);
					this.jInternalFrameOrderByDatoFormularioIva.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDatoFormularioIvaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DatoFormularioIvaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.datoformularioivaReturnGeneral=new DatoFormularioIvaParameterReturnGeneral();
			
			this.datoformularioivaParameterGeneral=new DatoFormularioIvaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.datoformularioivaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DatoFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormularioIvaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DatoFormularioIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.datoformularioivaSessionBean.getEsGuardarRelacionado(),this.datoformularioivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DatoFormularioIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.datoformularioivaSessionBean.getEsGuardarRelacionado(),this.datoformularioivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDatoFormularioIva=false;
			this.isVisibilidadCeldaDuplicarDatoFormularioIva=true;
			this.isVisibilidadCeldaCopiarDatoFormularioIva=true;
			this.isVisibilidadCeldaVerFormDatoFormularioIva=true;
			this.isVisibilidadCeldaOrdenDatoFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=false;
			this.isVisibilidadCeldaModificarDatoFormularioIva=false;
			this.isVisibilidadCeldaActualizarDatoFormularioIva=false;
			this.isVisibilidadCeldaEliminarDatoFormularioIva=false;
			this.isVisibilidadCeldaCancelarDatoFormularioIva=false;
			this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=false;
			
			
			this.isVisibilidadBusquedaPorIdAnioIdSemestre=true;
			this.isVisibilidadBusquedaPorIdAnioPorIdMes=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdSemestre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDatoFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDatoFormularioIva();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDatoFormularioIva(false);
			
			this.setPermisosUsuarioDatoFormularioIva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado() 
				|| (this.datoformularioivaSessionBean.getEsGuardarRelacionado() && this.datoformularioivaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDatoFormularioIvaClasesRelacionadas();
			}
			
			if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDatoFormularioIvaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDatoFormularioIva();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDatoFormularioIva();
			}
			
			if(!this.isPermisoBusquedaDatoFormularioIva) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDatoFormularioIva,this.isPermisoPaginacionMedioDatoFormularioIva,this.isPermisoPaginacionTodoDatoFormularioIva);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DatoFormularioIvaConstantesFunciones.getTiposSeleccionarDatoFormularioIva());
				
				this.tiposColumnasSelect=DatoFormularioIvaConstantesFunciones.getTiposSeleccionarDatoFormularioIva(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectDatoFormularioIva();				
				//this.tiposRelacionesSelect=DatoFormularioIvaConstantesFunciones.getTiposRelacionesDatoFormularioIva(true);
				
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
			//if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDatoFormularioIva();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDatoFormularioIva(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDatoFormularioIva(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoFormularioIva() ;
			
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
			
			
			this.formularioivaLogic=new FormularioIvaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			this.semestreLogic=new SemestreLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				datoformularioivaImplementable= (DatoFormularioIvaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DatoFormularioIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				datoformularioivaImplementableHome= (DatoFormularioIvaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DatoFormularioIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.datoformularioivas= new ArrayList<DatoFormularioIva>();
			this.datoformularioivasEliminados= new ArrayList<DatoFormularioIva>();
						
			this.isEsNuevoDatoFormularioIva=false;
			this.esParaAccionDesdeFormularioDatoFormularioIva=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.semestresForeignKey=new ArrayList<Semestre>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDatoFormularioIva(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDatoFormularioIva();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DatoFormularioIvaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDatoFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDatoFormularioIva(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDatoFormularioIva();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDatoFormularioIva();
			}
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDatoFormularioIva.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDatoFormularioIva.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDatoFormularioIva.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDatoFormularioIva(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DatoFormularioIva: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDatoFormularioIva() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDatoFormularioIva")) {
				iIndex=this.jInternalFrameDetalleFormDatoFormularioIva.jTabbedPaneRelacionesDatoFormularioIva.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDatoFormularioIva.jTabbedPaneRelacionesDatoFormularioIva.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();	
				
				

				if(sTitle.equals("Formulario Ivas")) {
					if(!FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessDatoFormularioIva();

						this.cargarParteTabPanelRelacionadaFormularioIva(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDatoFormularioIva();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormularioIva(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormDatoFormularioIva.cargarSessionConBeanSwingJInternalFrameFormularioIva(false,true,iIndex);
		this.jButtonFormularioIvaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormularioIva();

		//this.jTabbedPaneRelacionesDatoFormularioIva.updateUI();
		//this.jTabbedPaneRelacionesDatoFormularioIva.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesDatoFormularioIva.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FormularioIva")) {
				int row=this.jTableDatosDatoFormularioIva.getSelectedRow();
				jButtonFormularioIvaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Formulario Iva")) {

					if(this.isTienePermisosFormularioIva && this.datoformularioivaConstantesFunciones.mostrarFormularioIvaDatoFormularioIva && !DatoFormularioIvaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formulario Ivas"+"("+FormularioIvaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formulario Ivas");

						if(datoformularioivaConstantesFunciones.resaltarFormularioIvaDatoFormularioIva!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(datoformularioivaConstantesFunciones.resaltarFormularioIvaDatoFormularioIva);
						}

						jmenuItem.setEnabled(this.datoformularioivaConstantesFunciones.activarFormularioIvaDatoFormularioIva);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormularioIva"));

						

						this.jInternalFrameDetalleFormDatoFormularioIva.jmenuDetalleDatoFormularioIva.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyDatoFormularioIva(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDatoFormularioIva(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDatoFormularioIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDatoFormularioIvaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDatoFormularioIva();
		
		this.cargarCombosFrameForeignKeyDatoFormularioIva();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDatoFormularioIva();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDatoFormularioIva();
		}
	}
	
	

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySemestre(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySemestreListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySemestre();
				this.cargarCombosFrameSemestresForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaSemestre(this.semestresForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDatoFormularioIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
			
			if(jTableDatosDatoFormularioIva.getRowCount()>=1) {
				jTableDatosDatoFormularioIva.removeRowSelectionInterval(0, jTableDatosDatoFormularioIva.getRowCount()-1);						
			}
			
			this.isEsNuevoDatoFormularioIva=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDatoFormularioIva(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDatoFormularioIva(true);			
			//this.datoformularioiva=new DatoFormularioIva();
			//this.datoformularioiva.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoFormularioIva(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoFormularioIva() ;
			
			if(DatoFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoFormularioIva(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.datoformularioiva);	
			this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);				
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
			if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DatoFormularioIva: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDatoFormularioIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDatoFormularioIva.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDatoFormularioIva.getSelectedRows().length;			
			}
			
			datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDatoFormularioIva--;			
				//DatoFormularioIva datoformularioivaAux= new DatoFormularioIva();			
				//datoformularioivaAux.setId(this.iIdNuevoDatoFormularioIva);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DatoFormularioIva datoformularioivaOrigen=new DatoFormularioIva();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DatoFormularioIva datoformularioivaOrigen : datoformularioivasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							datoformularioivaOrigen =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformularioivaOrigen =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDatoFormularioIva();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.datoformularioiva.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDatoFormularioIva(datoformularioivaOrigen,this.datoformularioiva,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.datoformularioivaLogic.getDatoFormularioIvas().add(this.datoformularioivaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.datoformularioivas.add(this.datoformularioivaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDatoFormularioIva(false);
				
				this.jTableDatosDatoFormularioIva.setRowSelectionInterval(this.getIndiceNuevoDatoFormularioIva(), this.getIndiceNuevoDatoFormularioIva());
				
				int iLastRow =  this.jTableDatosDatoFormularioIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDatoFormularioIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDatoFormularioIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoFormularioIva(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();									
		
			DatoFormularioIva datoformularioivaOrigen=new DatoFormularioIva();
			DatoFormularioIva datoformularioivaDestino=new DatoFormularioIva();
				
			datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDatoFormularioIva.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || datoformularioivasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDatoFormularioIva.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivaOrigen =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						datoformularioivaOrigen =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformularioivaDestino =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						datoformularioivaDestino =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				datoformularioivaOrigen =datoformularioivasSeleccionados.get(0);
				datoformularioivaDestino =datoformularioivasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDatoFormularioIva(datoformularioivaOrigen,datoformularioivaDestino,true,false);
				
				datoformularioivaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(datoformularioivaDestino,datoformularioivaLogic.getDatoFormularioIvas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoformularioivaDestino,datoformularioivas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDatoFormularioIva(false);
				
				//this.jTableDatosDatoFormularioIva.setRowSelectionInterval(this.getIndiceNuevoDatoFormularioIva(), this.getIndiceNuevoDatoFormularioIva());
				
				int iLastRow =  this.jTableDatosDatoFormularioIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDatoFormularioIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDatoFormularioIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoFormularioIva(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDatoFormularioIva.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDatoFormularioIva.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDatoFormularioIva.setVisible(!isVisible);
			this.jPanelPaginacionDatoFormularioIva.setVisible(!isVisible);
			this.jPanelAccionesDatoFormularioIva.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDatoFormularioIva();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDatoFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDatoFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDatoFormularioIva();
			
			this.abrirFrameOrderByDatoFormularioIva();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDatoFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDatoFormularioIva(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDatoFormularioIva);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDatoFormularioIva.isMaximum()) {
					this.jInternalFrameDetalleFormDatoFormularioIva.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDatoFormularioIva.setSize(this.jInternalFrameDetalleFormDatoFormularioIva.iWidthFormulario,this.jInternalFrameDetalleFormDatoFormularioIva.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDatoFormularioIva.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDatoFormularioIva.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDatoFormularioIva.isMaximum()) {
						this.jInternalFrameDetalleFormDatoFormularioIva.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDatoFormularioIva.jContentPaneDetalleDatoFormularioIva.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDatoFormularioIva.jTabbedPaneRelacionesDatoFormularioIva.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDatoFormularioIva.jContentPaneDetalleDatoFormularioIva.getWidth(),DatoFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDatoFormularioIva.jTabbedPaneRelacionesDatoFormularioIva.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDatoFormularioIva.jContentPaneDetalleDatoFormularioIva.getWidth(),DatoFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDatoFormularioIva.jTabbedPaneRelacionesDatoFormularioIva.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDatoFormularioIva.jContentPaneDetalleDatoFormularioIva.getWidth(),DatoFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormularioIva();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDatoFormularioIva.setVisible(true);
	        this.jInternalFrameDetalleFormDatoFormularioIva.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDatoFormularioIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDatoFormularioIva==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDatoFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoFormularioIva,false,this);
				} else {
					this.jInternalFrameOrderByDatoFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoFormularioIva,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDatoFormularioIva);
				this.jInternalFrameOrderByDatoFormularioIva.setVisible(false);
				this.jInternalFrameOrderByDatoFormularioIva.setSelected(false);
				
				this.jInternalFrameOrderByDatoFormularioIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDatoFormularioIva"));
				
				this.inicializarActualizarBindingTablaOrderByDatoFormularioIva();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDatoFormularioIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDatoFormularioIva==null) {
				
				this.jInternalFrameImportacionDatoFormularioIva=new ImportacionJInternalFrame(DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDatoFormularioIva);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDatoFormularioIva);
				this.jInternalFrameImportacionDatoFormularioIva.setVisible(false);
				this.jInternalFrameImportacionDatoFormularioIva.setSelected(false);


				this.jInternalFrameImportacionDatoFormularioIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDatoFormularioIva"));
				this.jInternalFrameImportacionDatoFormularioIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDatoFormularioIva"));
				this.jInternalFrameImportacionDatoFormularioIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDatoFormularioIva"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDatoFormularioIva() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDatoFormularioIva==null) {
				this.jInternalFrameReporteDinamicoDatoFormularioIva=new ReporteDinamicoJInternalFrame(DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDatoFormularioIva);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDatoFormularioIva);
				this.jInternalFrameReporteDinamicoDatoFormularioIva.setVisible(false);
				this.jInternalFrameReporteDinamicoDatoFormularioIva.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDatoFormularioIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoFormularioIva"));
				this.jInternalFrameReporteDinamicoDatoFormularioIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoFormularioIva"));
				this.jInternalFrameReporteDinamicoDatoFormularioIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoFormularioIva"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoFormularioIva();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormularioIva() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.jScrollPanelDatosFormularioIva.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormDatoFormularioIva.jContentPaneDetalleDatoFormularioIva.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.jScrollPanelDatosFormularioIva.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.jScrollPanelDatosFormularioIva.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.jScrollPanelDatosFormularioIva.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleDatoFormularioIva() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDatoFormularioIva);
			
	       	this.jInternalFrameDetalleFormDatoFormularioIva.setVisible(false);
	        this.jInternalFrameDetalleFormDatoFormularioIva.setSelected(false);
			
			//this.jInternalFrameDetalleFormDatoFormularioIva.dispose();
			//this.jInternalFrameDetalleFormDatoFormularioIva=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDatoFormularioIva() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDatoFormularioIva.setVisible(true);
	        this.jInternalFrameReporteDinamicoDatoFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDatoFormularioIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDatoFormularioIva.setVisible(true);
	        this.jInternalFrameImportacionDatoFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDatoFormularioIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDatoFormularioIva.setVisible(true);
	        this.jInternalFrameOrderByDatoFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDatoFormularioIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDatoFormularioIva.setVisible(false);
	        this.jInternalFrameOrderByDatoFormularioIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDatoFormularioIva() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDatoFormularioIva.setVisible(false);
	        this.jInternalFrameReporteDinamicoDatoFormularioIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDatoFormularioIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDatoFormularioIva.setVisible(false);
	        this.jInternalFrameImportacionDatoFormularioIva.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDatoFormularioIva(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDatoFormularioIva(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDatoFormularioIva(true);
			//this.isEsNuevoDatoFormularioIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDatoFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoFormularioIva(false) ;
			
			if(datoformularioivaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.getEsGuardarRelacionado() && FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormularioIvaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(DatoFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoFormularioIva(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoFormularioIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDatoFormularioIvaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDatoFormularioIva(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDatoFormularioIva(true);
			//this.isEsNuevoDatoFormularioIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.datoformularioiva.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDatoFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDatoFormularioIva(false) ;
			
			if(DatoFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoFormularioIva(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoFormularioIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,DatoFormularioIvaConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoFormularioIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,DatoFormularioIvaConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoFormularioIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaSemestre(List<Semestre> semestresForeignKey)throws Exception{
		TableColumn tableColumnSemestre=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE));
		TableCellEditor tableCellEditorSemestre =tableColumnSemestre.getCellEditor();

		SemestreTableCell semestreTableCellFk=(SemestreTableCell)tableCellEditorSemestre;

		if(semestreTableCellFk!=null) {
			semestreTableCellFk.setsemestresForeignKey(semestresForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoFormularioIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//semestreTableCellFk.setRowActual(intSelectedRow);
			//semestreTableCellFk.setsemestresForeignKeyActual(semestresForeignKey);
		//}


		if(semestreTableCellFk!=null) {
			semestreTableCellFk.RecargarSemestresForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDatoFormularioIva(false);
			
			//if(!this.isEsNuevoDatoFormularioIva) {								
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
				
			}
			
			if(this.permiteMantenimiento(this.datoformularioiva)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDatoFormularioIva=true;
					this.inicializarActualizarBindingTablaDatoFormularioIva(false);
					this.isEsNuevoDatoFormularioIva=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDatoFormularioIva=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDatoFormularioIva=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDatoFormularioIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoFormularioIva(false);
				
				this.habilitarDeshabilitarControlesDatoFormularioIva(false);
			
												
				
				if(DatoFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDatoFormularioIva();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDatoFormularioIvaActionPerformed(evt,datoformularioivaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDatoFormularioIva(this.datoformularioiva,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDatoFormularioIva.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,datoformularioivaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.datoformularioiva.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				this.datoformularioiva.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				this.datoformularioiva.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.datoformularioiva)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DatoFormularioIvaModel) this.jTableDatosDatoFormularioIva.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDatoFormularioIva=true;
				this.inicializarActualizarBindingTablaDatoFormularioIva(false);
				this.isEsNuevoDatoFormularioIva=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDatoFormularioIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoFormularioIva(false);
				
				this.habilitarDeshabilitarControlesDatoFormularioIva(false);
				
				
				
				if(DatoFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDatoFormularioIva();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDatoFormularioIva.getRowCount()>=1) {
				jTableDatosDatoFormularioIva.removeRowSelectionInterval(0, jTableDatosDatoFormularioIva.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDatoFormularioIva(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDatoFormularioIva(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoFormularioIva(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoFormularioIva(false) ;
			
			this.isEsNuevoDatoFormularioIva=false;
			
			if(DatoFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDatoFormularioIva();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDatoFormularioIva(false);
				
				//SI ES MANUAL
				if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDatoFormularioIva();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDatoFormularioIva--;			
			//DatoFormularioIva datoformularioivaAux= new DatoFormularioIva();			
			//datoformularioivaAux.setId(this.iIdNuevoDatoFormularioIva);
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDatoFormularioIva();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
			
			this.datoformularioiva.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.datoformularioivaLogic.getDatoFormularioIvas().add(this.datoformularioivaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.datoformularioivas.add(this.datoformularioivaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDatoFormularioIva(false);
			
			this.jTableDatosDatoFormularioIva.setRowSelectionInterval(this.getIndiceNuevoDatoFormularioIva(), this.getIndiceNuevoDatoFormularioIva());
			
			int iLastRow =  this.jTableDatosDatoFormularioIva.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDatoFormularioIva.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDatoFormularioIva.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDatoFormularioIva(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDatoFormularioIva(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoFormularioIva(false);
			
			//SI ES MANUAL
			if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoFormularioIva();
			}
			
			//this.abrirFrameTreeDatoFormularioIva();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Dato Formulario IvaS ?", "MANTENIMIENTO DE Dato Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDatoFormularioIva.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDatoFormularioIva();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.datoformularioivaReturnGeneral=datoformularioivaLogic.procesarImportacionDatoFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.datoformularioivaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDatoFormularioIvaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDatoFormularioIva.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDatoFormularioIva.setFileImportacion(this.jInternalFrameImportacionDatoFormularioIva.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDatoFormularioIva.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDatoFormularioIva.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDatoFormularioIva.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDatoFormularioIva.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();		

		datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DatoFormularioIvaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DatoFormularioIvaBaseDesign.jrxml";
			
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
			
			this.generarReporteDatoFormularioIvas("Todos",datoformularioivasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mensual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mensual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mensual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mensual_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Semestre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Semestre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Semestre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Semestre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sustitutiva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sustitutiva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sustitutiva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sustitutiva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFormulario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFormulario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFormulario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFormulario_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDatoFormularioIva.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL:
					sNombreCampoCategoria="es_mensual";
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE:
					sNombreCampoCategoria="id_semestre";
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA:
					sNombreCampoCategoria="es_sustitutiva";
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO:
					sNombreCampoCategoria="numero_formulario";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL:
					sNombreCampoCategoriaValor="es_mensual";
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE:
					sNombreCampoCategoriaValor="id_semestre";
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA:
					sNombreCampoCategoriaValor="es_sustitutiva";
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO:
					sNombreCampoCategoriaValor="numero_formulario";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Mensual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_mensual");
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Semestre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_semestre");
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Sustitutiva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_sustitutiva");
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Formulario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_formulario");
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
	
	public void jButtonGenerarExcelReporteDinamicoDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();		
		
		datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformularioiva";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DatoFormularioIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL);
					iRow++;

					for(DatoFormularioIva datoformularioiva:datoformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformularioiva.getes_mensual());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(DatoFormularioIva datoformularioiva:datoformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformularioiva.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(DatoFormularioIva datoformularioiva:datoformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformularioiva.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE);
					iRow++;

					for(DatoFormularioIva datoformularioiva:datoformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformularioiva.getsemestre_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA);
					iRow++;

					for(DatoFormularioIva datoformularioiva:datoformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformularioiva.getes_sustitutiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO);
					iRow++;

					for(DatoFormularioIva datoformularioiva:datoformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformularioiva.getnumero_formulario());
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
			//	this.getFilaCabeceraExportarExcelDatoFormularioIva(row);				
			//	iRow++;
			//}				
			
			//for(DatoFormularioIva datoformularioivaAux:datoformularioivasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDatoFormularioIva(datoformularioivaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
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
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoFormularioIva(false);
			
			//SI ES MANUAL
			if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoFormularioIva();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoFormularioIva(false);
			
			//SI ES MANUAL
			if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDatoFormularioIva();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoFormularioIva(false);
			
			//SI ES MANUAL
			if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDatoFormularioIva();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDatoFormularioIva() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDatoFormularioIva.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDatoFormularioIva.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDatoFormularioIva.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDatoFormularioIva.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDatoFormularioIva.setMinimumSize(dimensionMinimum);
		this.jTableDatosDatoFormularioIva.setMaximumSize(dimensionMaximum);
		this.jTableDatosDatoFormularioIva.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDatoFormularioIva(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDatoFormularioIva(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDatoFormularioIva(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDatoFormularioIva(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDatoFormularioIva(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDatoFormularioIva(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoFormularioIva(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDatoFormularioIva(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDatoFormularioIva() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDatoFormularioIva();
		
		this.inicializarActualizarBindingBotonesManualDatoFormularioIva(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDatoFormularioIva();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoFormularioIva() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDatoFormularioIva(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDatoFormularioIva(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDatoFormularioIva.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDatoFormularioIva.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDatoFormularioIva.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxPostAccionNuevoDatoFormularioIva.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxPostAccionSinCerrarDatoFormularioIva.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxPostAccionSinMensajeDatoFormularioIva.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDatoFormularioIva.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDatoFormularioIva.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDatoFormularioIva.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
				this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxPostAccionNuevoDatoFormularioIva.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxPostAccionSinCerrarDatoFormularioIva.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxPostAccionSinMensajeDatoFormularioIva.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDatoFormularioIva.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDatoFormularioIva.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDatoFormularioIva.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDatoFormularioIva!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDatoFormularioIva.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDatoFormularioIva.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDatoFormularioIva.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDatoFormularioIva.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDatoFormularioIva!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDatoFormularioIva.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDatoFormularioIva.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDatoFormularioIva(Boolean esInicializar) throws Exception {
		try	{	
			if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDatoFormularioIva(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDatoFormularioIva() throws Exception {
		try	{
			if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDatoFormularioIva();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDatoFormularioIva() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDatoFormularioIva() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDatoFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDatoFormularioIva.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDatoFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDatoFormularioIva.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDatoFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDatoFormularioIva.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDatoFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDatoFormularioIva.addItem(reporte);
			}
			
			
			if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDatoFormularioIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDatoFormularioIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDatoFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDatoFormularioIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDatoFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDatoFormularioIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDatoFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDatoFormularioIva.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDatoFormularioIva.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoFormularioIva();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoFormularioIva() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDatoFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDatoFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDatoFormularioIva.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDatoFormularioIva!=null) {
				
				if(this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDatoFormularioIva.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDatoFormularioIva()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.getSelectedItem()!=null){this.id_anioBusquedaPorIdAnioIdSemestre=((Anio)this.jComboBoxid_anioBusquedaPorIdAnioIdSemestreDatoFormularioIva.getSelectedItem()).getId();}
		if(this.jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.getSelectedItem()!=null){this.id_semestreBusquedaPorIdAnioIdSemestre=((Semestre)this.jComboBoxid_semestreBusquedaPorIdAnioIdSemestreDatoFormularioIva.getSelectedItem()).getId();}
		if(this.jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.getSelectedItem()!=null){this.id_anioBusquedaPorIdAnioPorIdMes=((Anio)this.jComboBoxid_anioBusquedaPorIdAnioPorIdMesDatoFormularioIva.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.getSelectedItem()!=null){this.id_mesBusquedaPorIdAnioPorIdMes=((Mes)this.jComboBoxid_mesBusquedaPorIdAnioPorIdMesDatoFormularioIva.getSelectedItem()).getId();}
		if(this.jComboBoxid_anioFK_IdAnioDatoFormularioIva.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioDatoFormularioIva.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDatoFormularioIva(Boolean esInicializar) throws Exception {				
		if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDatoFormularioIva();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDatoFormularioIva() throws Exception {
		this.inicializarActualizarBindingTablaDatoFormularioIva(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDatoFormularioIva() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDatoFormularioIvaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIvaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDatoFormularioIva(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=datoformularioivaLogic.getDatoFormularioIvas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=datoformularioivas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDatoFormularioIva.setModel(new DatoFormularioIvaModel(this.datoformularioivaLogic.getDatoFormularioIvas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDatoFormularioIva.setModel(new DatoFormularioIvaModel(this.datoformularioivas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDatoFormularioIva!=null && this.jInternalFrameOrderByDatoFormularioIva.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDatoFormularioIva();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO,datoformularioivaConstantesFunciones.resaltarSeleccionarDatoFormularioIva,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO,datoformularioivaConstantesFunciones.resaltarSeleccionarDatoFormularioIva,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,DatoFormularioIvaConstantesFunciones.LABEL_ID));

		if(this.datoformularioivaConstantesFunciones.mostraridDatoFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioIvaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.datoformularioivaConstantesFunciones.resaltaridDatoFormularioIva,this.datoformularioivaConstantesFunciones.activaridDatoFormularioIva,this,true,"idDatoFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoformularioivaConstantesFunciones.resaltaridDatoFormularioIva,this.datoformularioivaConstantesFunciones.activaridDatoFormularioIva,this,true,"idDatoFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL));

		if(this.datoformularioivaConstantesFunciones.mostrares_mensualDatoFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.datoformularioivaConstantesFunciones.resaltares_mensualDatoFormularioIva,this.datoformularioivaConstantesFunciones.activares_mensualDatoFormularioIva));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.datoformularioivaConstantesFunciones.resaltares_mensualDatoFormularioIva,this.datoformularioivaConstantesFunciones.activares_mensualDatoFormularioIva,this,true,"es_mensualDatoFormularioIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,DatoFormularioIvaConstantesFunciones.LABEL_IDANIO));

		if(this.datoformularioivaConstantesFunciones.mostrarid_anioDatoFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioIvaConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.datoformularioivaConstantesFunciones.resaltarid_anioDatoFormularioIva,this,this.datoformularioivaConstantesFunciones.activarid_anioDatoFormularioIva));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.datoformularioivaConstantesFunciones.resaltarid_anioDatoFormularioIva,this,this.datoformularioivaConstantesFunciones.activarid_anioDatoFormularioIva,true,"id_anioDatoFormularioIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,DatoFormularioIvaConstantesFunciones.LABEL_IDMES));

		if(this.datoformularioivaConstantesFunciones.mostrarid_mesDatoFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioIvaConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.datoformularioivaConstantesFunciones.resaltarid_mesDatoFormularioIva,this,this.datoformularioivaConstantesFunciones.activarid_mesDatoFormularioIva));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.datoformularioivaConstantesFunciones.resaltarid_mesDatoFormularioIva,this,this.datoformularioivaConstantesFunciones.activarid_mesDatoFormularioIva,true,"id_mesDatoFormularioIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE));

		if(this.datoformularioivaConstantesFunciones.mostrarid_semestreDatoFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SemestreTableCell(this.semestresForeignKey,this.datoformularioivaConstantesFunciones.resaltarid_semestreDatoFormularioIva,this,this.datoformularioivaConstantesFunciones.activarid_semestreDatoFormularioIva));
			tableColumn.setCellEditor(new SemestreTableCell(this.semestresForeignKey,this.datoformularioivaConstantesFunciones.resaltarid_semestreDatoFormularioIva,this,this.datoformularioivaConstantesFunciones.activarid_semestreDatoFormularioIva,true,"id_semestreDatoFormularioIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA));

		if(this.datoformularioivaConstantesFunciones.mostrares_sustitutivaDatoFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.datoformularioivaConstantesFunciones.resaltares_sustitutivaDatoFormularioIva,this.datoformularioivaConstantesFunciones.activares_sustitutivaDatoFormularioIva));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.datoformularioivaConstantesFunciones.resaltares_sustitutivaDatoFormularioIva,this.datoformularioivaConstantesFunciones.activares_sustitutivaDatoFormularioIva,this,true,"es_sustitutivaDatoFormularioIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO));

		if(this.datoformularioivaConstantesFunciones.mostrarnumero_formularioDatoFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datoformularioivaConstantesFunciones.resaltarnumero_formularioDatoFormularioIva,this.datoformularioivaConstantesFunciones.activarnumero_formularioDatoFormularioIva,this,true,"numero_formularioDatoFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoformularioivaConstantesFunciones.resaltarnumero_formularioDatoFormularioIva,this.datoformularioivaConstantesFunciones.activarnumero_formularioDatoFormularioIva,this,true,"numero_formularioDatoFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormularioIva && this.datoformularioivaConstantesFunciones.mostrarFormularioIvaDatoFormularioIva && !DatoFormularioIvaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formulario Ivas");
				tableColumn.setHeaderValue("Formulario Ivas");
				tableColumn.setCellRenderer(new FormularioIvaTableCell(datoformularioivaConstantesFunciones.resaltarFormularioIvaDatoFormularioIva,this,this.datoformularioivaConstantesFunciones.activarFormularioIvaDatoFormularioIva));
				tableColumn.setCellEditor(new FormularioIvaTableCell(datoformularioivaConstantesFunciones.resaltarFormularioIvaDatoFormularioIva,this,this.datoformularioivaConstantesFunciones.activarFormularioIvaDatoFormularioIva));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosDatoFormularioIva.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.datoformularioivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.datoformularioivaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDatoFormularioIva.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.datoformularioivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.datoformularioivaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDatoFormularioIva.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.datoformularioivaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.datoformularioivaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDatoFormularioIva.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosDatoFormularioIva.addColumn(tableColumn);
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
			
			this.jTableDatosDatoFormularioIva.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.datoformularioivaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDatoFormularioIva.moveColumn(this.jTableDatosDatoFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDatoFormularioIva.moveColumn(this.jTableDatosDatoFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.datoformularioivaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosDatoFormularioIva.moveColumn(this.jTableDatosDatoFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDatoFormularioIva.moveColumn(this.jTableDatosDatoFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDatoFormularioIva.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDatoFormularioIva.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDatoFormularioIva,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDatoFormularioIva.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDatoFormularioIva.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDatoFormularioIva.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDatoFormularioIva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=datoformularioivaLogic.getDatoFormularioIvas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=datoformularioivas.size()-1;
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
		//this.jTableDatosDatoFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDatoFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDatoFormularioIva();
			
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
				
				//this.isEsNuevoDatoFormularioIva=false;
					
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
				if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDatoFormularioIva==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDatoFormularioIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDatoFormularioIva.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.datoformularioiva.getsType().equals("DUPLICADO")
				   || this.datoformularioiva.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDatoFormularioIva=true;
				
				} else {
					this.isEsNuevoDatoFormularioIva=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
					if(this.datoformularioiva.getId()>=0 && !this.datoformularioiva.getIsNew()) {						
						this.isEsNuevoDatoFormularioIva=false;
						
					} else {
						this.isEsNuevoDatoFormularioIva=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDatoFormularioIva(esRelaciones);						
				
				this.seleccionarDatoFormularioIva(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.datoformularioiva.getId()<0) {
					this.isEsNuevoDatoFormularioIva=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDatoFormularioIva(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDatoFormularioIva(evt,rowIndex);
				}	
				
				if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DatoFormularioIva: " + this.dDif); 
					}
				}								
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDatoFormularioIva(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.datoformularioiva)) {
					if(this.datoformularioiva.getId()>0) {
						this.datoformularioiva.setIsDeleted(true);
						
						this.datoformularioivasEliminados.add(this.datoformularioiva);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.datoformularioivaLogic.getDatoFormularioIvas().remove(this.datoformularioiva);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.datoformularioivas.remove(this.datoformularioiva);				
					}
					
					
					((DatoFormularioIvaModel) this.jTableDatosDatoFormularioIva.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoFormularioIva(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDatoFormularioIva(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDatoFormularioIva) {
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDatoFormularioIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDatoFormularioIva.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDatoFormularioIva(this.datoformularioiva);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.datoformularioivaConstantesFunciones.cargarid_anioDatoFormularioIva || this.datoformularioivaConstantesFunciones.event_dependid_anioDatoFormularioIva) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.datoformularioiva.getid_anio());
									//this.inicializarActualizarBindingDatoFormularioIva(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(datoformularioiva.getAnio()!=null) {
							this.aniosForeignKey.add(datoformularioiva.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.datoformularioiva.getid_anio(),false,"Formulario");

					//Mes
					if(!this.datoformularioivaConstantesFunciones.cargarid_mesDatoFormularioIva || this.datoformularioivaConstantesFunciones.event_dependid_mesDatoFormularioIva) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.datoformularioiva.getid_mes());
									//this.inicializarActualizarBindingDatoFormularioIva(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(datoformularioiva.getMes()!=null) {
							this.messForeignKey.add(datoformularioiva.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.datoformularioiva.getid_mes(),false,"Formulario");

					//Semestre
					if(!this.datoformularioivaConstantesFunciones.cargarid_semestreDatoFormularioIva || this.datoformularioivaConstantesFunciones.event_dependid_semestreDatoFormularioIva) {
						//this.cargarCombosSemestresForeignKeyLista(" where id="+this.datoformularioiva.getid_semestre());
									//this.inicializarActualizarBindingDatoFormularioIva(false,false);
						this.semestresForeignKey=new ArrayList<Semestre>();

						if(datoformularioiva.getSemestre()!=null) {
							this.semestresForeignKey.add(datoformularioiva.getSemestre());
						}

						this.addItemDefectoCombosForeignKeySemestre();
						this.cargarCombosFrameSemestresForeignKey("Todos");
					}
					this.setActualSemestreForeignKey(this.datoformularioiva.getid_semestre(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDatoFormularioIva("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDatoFormularioIva(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoFormularioIva() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDatoFormularioIva(DatoFormularioIva datoformularioiva) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDatoFormularioIva(datoformularioiva,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDatoFormularioIva(DatoFormularioIva datoformularioiva,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDatoFormularioIva(datoformularioiva);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDatoFormularioIva(datoformularioiva,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDatoFormularioIva(datoformularioiva);
	}
	
	public void setVariablesObjetoActualToFormularioDatoFormularioIva(DatoFormularioIva datoformularioiva) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.setText(datoformularioiva.getId().toString());
			this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_mensualDatoFormularioIva.setSelected(datoformularioiva.getes_mensual());
			this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_sustitutivaDatoFormularioIva.setSelected(datoformularioiva.getes_sustitutiva());
			this.jInternalFrameDetalleFormDatoFormularioIva.jTextFieldnumero_formularioDatoFormularioIva.setText(datoformularioiva.getnumero_formulario());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DatoFormularioIva datoformularioivaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,datoformularioivaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DatoFormularioIva datoformularioivaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				datoformularioivaLocal=this.datoformularioiva;
			} else {
				datoformularioivaLocal=this.datoformularioivaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(datoformularioivaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDatoFormularioIva(datoformularioivaLocal,true);
					
					if(datoformularioivaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(datoformularioivaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(datoformularioivaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDatoFormularioIva(DatoFormularioIva datoformularioiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDatoFormularioIva(datoformularioiva,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(datoformularioiva);
	}
	
	public void setVariablesFormularioToObjetoActualDatoFormularioIva(DatoFormularioIva datoformularioiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDatoFormularioIva(datoformularioiva,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDatoFormularioIva(DatoFormularioIva datoformularioiva,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.getText()==null || this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.getText()=="" || this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.getText()=="Id") {
				this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.setText("0");
			}

			if(conColumnasBase) {datoformularioiva.setId(Long.parseLong(this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoFormularioIvaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioIva.jLabelIdDatoFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoformularioiva.setes_mensual(this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_mensualDatoFormularioIva.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioIva.jLabeles_mensualDatoFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoformularioiva.setes_sustitutiva(this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_sustitutivaDatoFormularioIva.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioIva.jLabeles_sustitutivaDatoFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoformularioiva.setnumero_formulario(this.jInternalFrameDetalleFormDatoFormularioIva.jTextFieldnumero_formularioDatoFormularioIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioIva.jLabelnumero_formularioDatoFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDatoFormularioIva(DatoFormularioIva datoformularioivaBean,DatoFormularioIva datoformularioiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDatoFormularioIva(DatoFormularioIva datoformularioivaOrigen,DatoFormularioIva datoformularioiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datoformularioivaOrigen.getId()!=null && !datoformularioivaOrigen.getId().equals(0L))) {datoformularioiva.setId(datoformularioivaOrigen.getId());}}
			if(conDefault || (!conDefault && datoformularioivaOrigen.getes_mensual()!=null && !datoformularioivaOrigen.getes_mensual().equals(false))) {datoformularioiva.setes_mensual(datoformularioivaOrigen.getes_mensual());}
			if(conDefault || (!conDefault && datoformularioivaOrigen.getes_sustitutiva()!=null && !datoformularioivaOrigen.getes_sustitutiva().equals(false))) {datoformularioiva.setes_sustitutiva(datoformularioivaOrigen.getes_sustitutiva());}
			if(conDefault || (!conDefault && datoformularioivaOrigen.getnumero_formulario()!=null && !datoformularioivaOrigen.getnumero_formulario().equals(""))) {datoformularioiva.setnumero_formulario(datoformularioivaOrigen.getnumero_formulario());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDatoFormularioIva(DatoFormularioIva datoformularioiva) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.setText(datoformularioiva.getId().toString());
			this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_mensualDatoFormularioIva.setSelected(datoformularioiva.getes_mensual());
			this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_sustitutivaDatoFormularioIva.setSelected(datoformularioiva.getes_sustitutiva());
			this.jInternalFrameDetalleFormDatoFormularioIva.jTextFieldnumero_formularioDatoFormularioIva.setText(datoformularioiva.getnumero_formulario());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDatoFormularioIva(DatoFormularioIvaBean datoformularioivaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.setText(datoformularioivaBean.getId().toString());
			this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_mensualDatoFormularioIva.setSelected(datoformularioivaBean.getes_mensual());
			this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_sustitutivaDatoFormularioIva.setSelected(datoformularioivaBean.getes_sustitutiva());
			this.jInternalFrameDetalleFormDatoFormularioIva.jTextFieldnumero_formularioDatoFormularioIva.setText(datoformularioivaBean.getnumero_formulario());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDatoFormularioIva(DatoFormularioIvaParameterReturnGeneral datoformularioivaReturnGeneral,DatoFormularioIvaBean datoformularioivaBean,Boolean conDefault) throws Exception { 
		try {
			DatoFormularioIva datoformularioivaLocal=new DatoFormularioIva();
			
			datoformularioivaLocal=datoformularioivaReturnGeneral.getDatoFormularioIva();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datoformularioivaLocal.getId()!=null && !datoformularioivaLocal.getId().equals(0L))) {datoformularioivaBean.setId(datoformularioivaLocal.getId());}}
			if(conDefault || (!conDefault && datoformularioivaLocal.getes_mensual()!=null && !datoformularioivaLocal.getes_mensual().equals(false))) {datoformularioivaBean.setes_mensual(datoformularioivaLocal.getes_mensual());}
			if(conDefault || (!conDefault && datoformularioivaLocal.getes_sustitutiva()!=null && !datoformularioivaLocal.getes_sustitutiva().equals(false))) {datoformularioivaBean.setes_sustitutiva(datoformularioivaLocal.getes_sustitutiva());}
			if(conDefault || (!conDefault && datoformularioivaLocal.getnumero_formulario()!=null && !datoformularioivaLocal.getnumero_formulario().equals(""))) {datoformularioivaBean.setnumero_formulario(datoformularioivaLocal.getnumero_formulario());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDatoFormularioIvaGenerico(Long idDatoFormularioIvaSeleccionado,JComboBox jComboBoxDatoFormularioIva,List<DatoFormularioIva> datoformularioivasLocal)throws Exception {
		try {
			DatoFormularioIva  datoformularioivaTemp=null;

			for(DatoFormularioIva datoformularioivaAux:datoformularioivasLocal) {
				if(datoformularioivaAux.getId()!=null && datoformularioivaAux.getId().equals(idDatoFormularioIvaSeleccionado)) {
					datoformularioivaTemp=datoformularioivaAux;
					break;
				}
			}

			jComboBoxDatoFormularioIva.setSelectedItem(datoformularioivaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDatoFormularioIvaGenerico(JComboBox jComboBoxDatoFormularioIva,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDatoFormularioIva.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDatoFormularioIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDatoFormularioIva.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDatoFormularioIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FormularioIva")) {
			jButtonFormularioIvaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datoformularioiva=(DatoFormularioIva) datoformularioivaLogic.getDatoFormularioIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			datoformularioiva =(DatoFormularioIva) datoformularioivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!datoformularioiva.getIsNew() && !datoformularioiva.getIsChanged() && !datoformularioiva.getIsDeleted()) {
				sDescripcion=datoformularioiva.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=datoformularioiva.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!datoformularioiva.getIsNew() && !datoformularioiva.getIsChanged() && !datoformularioiva.getIsDeleted()) {
				sDescripcion=datoformularioiva.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=datoformularioiva.getmes_descripcion();
			}
		}

		if(sTipo.equals("Semestre")) {
			//sDescripcion=this.getActualSemestreForeignKeyDescripcion((Long)value);
			if(!datoformularioiva.getIsNew() && !datoformularioiva.getIsChanged() && !datoformularioiva.getIsDeleted()) {
				sDescripcion=datoformularioiva.getsemestre_descripcion();
			} else {
				//sDescripcion=this.getActualSemestreForeignKeyDescripcion((Long)value);
				sDescripcion=datoformularioiva.getsemestre_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DatoFormularioIva datoformularioivaRow=new DatoFormularioIva();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datoformularioivaRow=(DatoFormularioIva) datoformularioivaLogic.getDatoFormularioIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			datoformularioivaRow=(DatoFormularioIva) datoformularioivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormularioIvaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,DatoFormularioIva datoformularioiva) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormDatoFormularioIva==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformularioiva = (DatoFormularioIva)this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.datoformularioiva = (DatoFormularioIva)this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(datoformularioiva!=null) {
						this.datoformularioiva = datoformularioiva;
					} else {
						this.datoformularioiva = new DatoFormularioIva();
					}
				}

				if(this.isTienePermisosFormularioIva && this.permiteMantenimiento(this.datoformularioiva)) {
					FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFramePopup=new FormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formularioivaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFramePopup;
					} else {
						formularioivaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame;
					}

					List<DatoFormularioIva> datoformularioivas=new ArrayList<DatoFormularioIva>();
					datoformularioivas.add(this.datoformularioiva);
					if(!esRelacionado) {
						//formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setConGuardarRelaciones(false);
						//formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formularioivaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormDatoFormularioIva.cargarFormularioIvaBeanSwingJInternalFrame(datoformularioivas,this.datoformularioiva,formularioivaBeanSwingJInternalFrame,/*conInicializar,*/formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.getConGuardarRelaciones(),formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.getEsGuardarRelacionado());
					formularioivaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioIva("no_relacionado");

						formularioivaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormularioIvaConstantesFunciones.ITAMANIOFILATABLA + (FormularioIvaConstantesFunciones.ITAMANIOFILATABLA/2));

						formularioivaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderDatoFormularioIva=(TitledBorder)this.jScrollPanelDatosDatoFormularioIva.getBorder();
						TitledBorder titledBorderFormularioIva=(TitledBorder)formularioivaBeanSwingJInternalFrame.jScrollPanelDatosFormularioIva.getBorder();

						titledBorderFormularioIva.setTitle(titledBorderDatoFormularioIva.getTitle() + " -> Formulario Iva");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formularioivaBeanSwingJInternalFrame);
						}

						formularioivaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formularioivaBeanSwingJInternalFrame);

						formularioivaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formulario Iva",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDatoFormularioIva(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDatoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioIva && this.isPermisoNuevoDatoFormularioIva));			
			this.jButtonDuplicarDatoFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarDatoFormularioIva && this.isPermisoDuplicarDatoFormularioIva));			
			this.jButtonCopiarDatoFormularioIva.setVisible((this.isVisibilidadCeldaCopiarDatoFormularioIva && this.isPermisoCopiarDatoFormularioIva));
			this.jButtonVerFormDatoFormularioIva.setVisible((this.isVisibilidadCeldaVerFormDatoFormularioIva && this.isPermisoVerFormDatoFormularioIva));
			
			this.jButtonAbrirOrderByDatoFormularioIva.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioIva && this.isPermisoOrdenDatoFormularioIva));			
			
			this.jButtonNuevoRelacionesDatoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva && this.isPermisoNuevoDatoFormularioIva));			
			this.jButtonNuevoGuardarCambiosDatoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioIva && this.isPermisoNuevoDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva));
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonModificarDatoFormularioIva.setVisible((this.isVisibilidadCeldaModificarDatoFormularioIva && this.isPermisoActualizarDatoFormularioIva));	
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonActualizarDatoFormularioIva.setVisible((this.isVisibilidadCeldaActualizarDatoFormularioIva && this.isPermisoActualizarDatoFormularioIva));	
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonEliminarDatoFormularioIva.setVisible((this.isVisibilidadCeldaEliminarDatoFormularioIva && this.isPermisoEliminarDatoFormularioIva));
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonCancelarDatoFormularioIva.setVisible(this.isVisibilidadCeldaCancelarDatoFormularioIva);							
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosDatoFormularioIva.setVisible((this.isVisibilidadCeldaGuardarDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva));			
			
			}
						
			this.jButtonGuardarCambiosTablaDatoFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioIva && this.isPermisoNuevoDatoFormularioIva));						
			this.jButtonDuplicarToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarDatoFormularioIva && this.isPermisoDuplicarDatoFormularioIva));						
			this.jButtonCopiarToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaCopiarDatoFormularioIva && this.isPermisoCopiarDatoFormularioIva));			
			this.jButtonVerFormToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaVerFormDatoFormularioIva && this.isPermisoVerFormDatoFormularioIva));			
			this.jButtonAbrirOrderByToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioIva && this.isPermisoOrdenDatoFormularioIva));
			this.jButtonNuevoRelacionesToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva && this.isPermisoNuevoDatoFormularioIva));			
			this.jButtonNuevoGuardarCambiosToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioIva && this.isPermisoNuevoDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva));			
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonModificarToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaModificarDatoFormularioIva && this.isPermisoActualizarDatoFormularioIva));	
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonActualizarToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaActualizarDatoFormularioIva  && this.isPermisoActualizarDatoFormularioIva));	
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonEliminarToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaEliminarDatoFormularioIva && this.isPermisoEliminarDatoFormularioIva));
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonCancelarToolBarDatoFormularioIva.setVisible(this.isVisibilidadCeldaCancelarDatoFormularioIva);				
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaGuardarDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDatoFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDatoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioIva && this.isPermisoNuevoDatoFormularioIva));			
			this.jMenuItemDuplicarDatoFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarDatoFormularioIva && this.isPermisoDuplicarDatoFormularioIva));			
			this.jMenuItemCopiarDatoFormularioIva.setVisible((this.isVisibilidadCeldaCopiarDatoFormularioIva && this.isPermisoCopiarDatoFormularioIva));			
			this.jMenuItemVerFormDatoFormularioIva.setVisible((this.isVisibilidadCeldaVerFormDatoFormularioIva && this.isPermisoVerFormDatoFormularioIva));			
			this.jMenuItemAbrirOrderByDatoFormularioIva.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioIva && this.isPermisoOrdenDatoFormularioIva));			
			//this.jMenuItemMostrarOcultarDatoFormularioIva.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioIva && this.isPermisoOrdenDatoFormularioIva));
			this.jMenuItemDetalleAbrirOrderByDatoFormularioIva.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioIva && this.isPermisoOrdenDatoFormularioIva));			
			//this.jMenuItemDetalleMostrarOcultarDatoFormularioIva.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioIva && this.isPermisoOrdenDatoFormularioIva));			
			this.jMenuItemNuevoRelacionesDatoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva && this.isPermisoNuevoDatoFormularioIva));			
			this.jMenuItemNuevoGuardarCambiosDatoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioIva && this.isPermisoNuevoDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva));									
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemModificarDatoFormularioIva.setVisible((this.isVisibilidadCeldaModificarDatoFormularioIva && this.isPermisoActualizarDatoFormularioIva));	
			this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemActualizarDatoFormularioIva.setVisible((this.isVisibilidadCeldaActualizarDatoFormularioIva && this.isPermisoActualizarDatoFormularioIva));	
			this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemEliminarDatoFormularioIva.setVisible((this.isVisibilidadCeldaEliminarDatoFormularioIva && this.isPermisoEliminarDatoFormularioIva));
			this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemCancelarDatoFormularioIva.setVisible(this.isVisibilidadCeldaCancelarDatoFormularioIva);				
			}
			
			this.jMenuItemGuardarCambiosDatoFormularioIva.setVisible((this.isVisibilidadCeldaGuardarDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva));						
			this.jMenuItemGuardarCambiosTablaDatoFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDatoFormularioIva=this.jButtonNuevoDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaDuplicarDatoFormularioIva=this.jButtonDuplicarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaCopiarDatoFormularioIva=this.jButtonCopiarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaVerFormDatoFormularioIva=this.jButtonVerFormDatoFormularioIva.isVisible();
			
			this.isVisibilidadCeldaOrdenDatoFormularioIva=this.jButtonAbrirOrderByDatoFormularioIva.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=this.jButtonNuevoRelacionesDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaModificarDatoFormularioIva=this.jButtonModificarDatoFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			this.isVisibilidadCeldaActualizarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jButtonActualizarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jButtonEliminarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jButtonCancelarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosDatoFormularioIva.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=this.jButtonGuardarCambiosTablaDatoFormularioIva.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDatoFormularioIva=this.jButtonNuevoToolBarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=this.jButtonNuevoRelacionesToolBarDatoFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			this.isVisibilidadCeldaModificarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jButtonModificarToolBarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaActualizarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jButtonActualizarToolBarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jButtonEliminarToolBarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jButtonCancelarToolBarDatoFormularioIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDatoFormularioIva=this.jButtonGuardarCambiosToolBarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=this.jButtonGuardarCambiosTablaToolBarDatoFormularioIva.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDatoFormularioIva=this.jMenuItemNuevoDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=this.jMenuItemNuevoRelacionesDatoFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			this.isVisibilidadCeldaModificarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemModificarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaActualizarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemActualizarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemEliminarDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarDatoFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemCancelarDatoFormularioIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDatoFormularioIva=this.jMenuItemGuardarCambiosDatoFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=this.jMenuItemGuardarCambiosTablaDatoFormularioIva.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDatoFormularioIva(Boolean esInicializar) {
		if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
				//if(this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDatoFormularioIva();
			}
			
			this.inicializarActualizarBindingBotonesManualDatoFormularioIva(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDatoFormularioIva() {
		this.jButtonNuevoDatoFormularioIva.setVisible(this.isPermisoNuevoDatoFormularioIva);			
		this.jButtonDuplicarDatoFormularioIva.setVisible(this.isPermisoDuplicarDatoFormularioIva);			
		this.jButtonCopiarDatoFormularioIva.setVisible(this.isPermisoCopiarDatoFormularioIva);			
		this.jButtonVerFormDatoFormularioIva.setVisible(this.isPermisoVerFormDatoFormularioIva);			
		
		this.jButtonAbrirOrderByDatoFormularioIva.setVisible(this.isPermisoOrdenDatoFormularioIva);					
		
		this.jButtonNuevoRelacionesDatoFormularioIva.setVisible(this.isPermisoNuevoDatoFormularioIva);			
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonModificarDatoFormularioIva.setVisible(this.isPermisoActualizarDatoFormularioIva);	
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonActualizarDatoFormularioIva.setVisible(this.isPermisoActualizarDatoFormularioIva);	
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonEliminarDatoFormularioIva.setVisible(this.isPermisoEliminarDatoFormularioIva);
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonCancelarDatoFormularioIva.setVisible(this.isVisibilidadCeldaCancelarDatoFormularioIva);						
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosDatoFormularioIva.setVisible(this.isPermisoGuardarCambiosDatoFormularioIva);							
		}
		
		this.jButtonGuardarCambiosTablaDatoFormularioIva.setVisible(this.isPermisoActualizarDatoFormularioIva);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDatoFormularioIva() {
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonModificarDatoFormularioIva.setVisible(this.isPermisoActualizarDatoFormularioIva);	
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonActualizarDatoFormularioIva.setVisible(this.isPermisoActualizarDatoFormularioIva);	
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonEliminarDatoFormularioIva.setVisible(this.isPermisoEliminarDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonCancelarDatoFormularioIva.setVisible(this.isVisibilidadCeldaCancelarDatoFormularioIva);							
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosDatoFormularioIva.setVisible((this.isVisibilidadCeldaGuardarDatoFormularioIva && this.isPermisoGuardarCambiosDatoFormularioIva));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDatoFormularioIva() {
		if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDatoFormularioIva();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDatoFormularioIva() {
	}
	
	public void jTableDatosDatoFormularioIvaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDatoFormularioIva(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDatoFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.getdatoformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformularioiva==null) {
						this.datoformularioiva = new DatoFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
				}

				if(this.datoformularioiva.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.datoformularioiva.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_mensualDatoFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.getdatoformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformularioiva==null) {
						this.datoformularioiva = new DatoFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
				}

				if(this.datoformularioiva.getes_mensual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_mensual = "+this.datoformularioiva.getes_mensual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioDatoFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebDatoFormularioIva(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.getdatoformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.datoformularioivaLogic.getConnexion());

				if(this.datoformularioiva.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.datoformularioiva.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoFormularioIva=(TitledBorder)this.jScrollPanelDatosDatoFormularioIva.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderDatoFormularioIva.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioDatoFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.getdatoformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformularioiva==null) {
						this.datoformularioiva = new DatoFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
				}

				if(this.datoformularioiva.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.datoformularioiva.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesDatoFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebDatoFormularioIva(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.getdatoformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.datoformularioivaLogic.getConnexion());

				if(this.datoformularioiva.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.datoformularioiva.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoFormularioIva=(TitledBorder)this.jScrollPanelDatosDatoFormularioIva.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderDatoFormularioIva.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesDatoFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.getdatoformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformularioiva==null) {
						this.datoformularioiva = new DatoFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
				}

				if(this.datoformularioiva.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.datoformularioiva.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_semestreDatoFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosemestre=true;

			idTienePermisosemestre=this.tienePermisosUsuarioEnPaginaWebDatoFormularioIva(SemestreConstantesFunciones.CLASSNAME);

			if(idTienePermisosemestre) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.getdatoformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);

				this.semestreBeanSwingJInternalFrame=new SemestreBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.semestreBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.semestreBeanSwingJInternalFrame.getSemestreLogic().setConnexion(this.datoformularioivaLogic.getConnexion());

				if(this.datoformularioiva.getid_semestre()!=null) {
					this.semestreBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.semestreBeanSwingJInternalFrame.setIdActual(this.datoformularioiva.getid_semestre());
					this.semestreBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.semestreBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.semestreBeanSwingJInternalFrame.inicializarActualizarBindingTablaSemestre();
				}

				JInternalFrameBase jinternalFrame =this.semestreBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoFormularioIva=(TitledBorder)this.jScrollPanelDatosDatoFormularioIva.getBorder();
				TitledBorder titledBordersemestre=(TitledBorder)this.semestreBeanSwingJInternalFrame.jScrollPanelDatosSemestre.getBorder();

				titledBordersemestre.setTitle(titledBorderDatoFormularioIva.getTitle() + " -> Semestre");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_semestreDatoFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.getdatoformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformularioiva==null) {
						this.datoformularioiva = new DatoFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
				}

				if(this.datoformularioiva.getid_semestre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_semestre = "+this.datoformularioiva.getid_semestre().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_sustitutivaDatoFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.getdatoformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformularioiva==null) {
						this.datoformularioiva = new DatoFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
				}

				if(this.datoformularioiva.getes_sustitutiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_sustitutiva = "+this.datoformularioiva.getes_sustitutiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_formularioDatoFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.getdatoformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformularioiva==null) {
						this.datoformularioiva = new DatoFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);
				}

				if(this.datoformularioiva.getnumero_formulario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_formulario like '%"+this.datoformularioiva.getnumero_formulario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoFormularioIva(false,false);

			this.getDatoFormularioIvasBusquedaPorIdAnioIdSemestre();

			this.inicializarActualizarBindingDatoFormularioIva(false);

			//if(DatoFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoFormularioIva(false,false);

			this.getDatoFormularioIvasBusquedaPorIdAnioPorIdMes();

			this.inicializarActualizarBindingDatoFormularioIva(false);

			//if(DatoFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoFormularioIva(false,false);

			this.getDatoFormularioIvasFK_IdAnio();

			this.inicializarActualizarBindingDatoFormularioIva(false);

			//if(DatoFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoFormularioIva(false,false);

			this.getDatoFormularioIvasFK_IdMes();

			this.inicializarActualizarBindingDatoFormularioIva(false);

			//if(DatoFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSemestreDatoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoFormularioIva(false,false);

			this.getDatoFormularioIvasFK_IdSemestre();

			this.inicializarActualizarBindingDatoFormularioIva(false);

			//if(DatoFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDatoFormularioIva() {
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
		

		if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
			this.jInternalFrameDetalleFormDatoFormularioIva.setVisible(false);	    			
			this.jInternalFrameDetalleFormDatoFormularioIva.dispose();
			this.jInternalFrameDetalleFormDatoFormularioIva=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDatoFormularioIva!=null) {
			this.jInternalFrameReporteDinamicoDatoFormularioIva.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDatoFormularioIva.dispose();
			this.jInternalFrameReporteDinamicoDatoFormularioIva=null;
		}
		
		if(this.jInternalFrameImportacionDatoFormularioIva!=null) {
			this.jInternalFrameImportacionDatoFormularioIva.setVisible(false);	    			
			this.jInternalFrameImportacionDatoFormularioIva.dispose();
			this.jInternalFrameImportacionDatoFormularioIva=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDatoFormularioIva();
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
			
			if(sTipo.equals("NuevoDatoFormularioIva")) {
				jButtonNuevoDatoFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDatoFormularioIva")) {
				jButtonDuplicarDatoFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDatoFormularioIva")) {
				jButtonCopiarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormDatoFormularioIva")) {
				jButtonVerFormDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDatoFormularioIva")) {
				jButtonNuevoDatoFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDatoFormularioIva")) {
				jButtonDuplicarDatoFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDatoFormularioIva")) {
				jButtonNuevoDatoFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDatoFormularioIva")) {
				jButtonDuplicarDatoFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDatoFormularioIva")) {
				jButtonNuevoDatoFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDatoFormularioIva")) {
				jButtonNuevoDatoFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDatoFormularioIva")) {
				jButtonNuevoDatoFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDatoFormularioIva")) {
				jButtonModificarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDatoFormularioIva")) {
				jButtonModificarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDatoFormularioIva")) {
				jButtonModificarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDatoFormularioIva")) {
				jButtonActualizarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDatoFormularioIva")) {
				jButtonActualizarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDatoFormularioIva")) {
				jButtonActualizarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarDatoFormularioIva")) {
				jButtonEliminarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDatoFormularioIva")) {
				jButtonEliminarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDatoFormularioIva")) {
				jButtonEliminarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarDatoFormularioIva")) {
				jButtonCancelarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDatoFormularioIva")) {
				jButtonCancelarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDatoFormularioIva")) {
				jButtonCancelarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarDatoFormularioIva")) {
				jButtonCerrarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDatoFormularioIva")) {
				jButtonCerrarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDatoFormularioIva")) {
				jButtonCerrarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDatoFormularioIva")) {
				jButtonMostrarOcultarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDatoFormularioIva")) {
				jButtonCancelarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDatoFormularioIva")) {
				jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDatoFormularioIva")) {
				jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDatoFormularioIva")) {
				jButtonCopiarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDatoFormularioIva")) {
				jButtonVerFormDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDatoFormularioIva")) {
				jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDatoFormularioIva")) {
				jButtonCopiarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDatoFormularioIva")) {
				jButtonVerFormDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDatoFormularioIva")) {
				jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDatoFormularioIva")) {
				jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDatoFormularioIva")) {
				jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDatoFormularioIva")) {
				jButtonRecargarInformacionDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDatoFormularioIva")) {
				jButtonRecargarInformacionDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDatoFormularioIva")) {
				jButtonRecargarInformacionDatoFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDatoFormularioIva")) {
				jButtonAnterioresDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDatoFormularioIva")) {
				jButtonAnterioresDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDatoFormularioIva")) {
				jButtonAnterioresDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDatoFormularioIva")) {
				jButtonSiguientesDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDatoFormularioIva")) {
				jButtonSiguientesDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDatoFormularioIva")) {
				jButtonSiguientesDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDatoFormularioIva") || sTipo.equals("MenuItemDetalleAbrirOrderByDatoFormularioIva")) {
				jButtonAbrirOrderByDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDatoFormularioIva") || sTipo.equals("MenuItemDetalleMostrarOcultarDatoFormularioIva")) {
				jButtonMostrarOcultarDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDatoFormularioIva")) {
				jButtonNuevoGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDatoFormularioIva")) {
				jButtonNuevoGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDatoFormularioIva")) {
				jButtonNuevoGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDatoFormularioIva")) {
				jButtonCerrarReporteDinamicoDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDatoFormularioIva")) {
				jButtonGenerarReporteDinamicoDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDatoFormularioIva")) {
				
				jButtonGenerarExcelReporteDinamicoDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDatoFormularioIva")) {
				jButtonCerrarImportacionDatoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDatoFormularioIva")) {
				
				jButtonGenerarImportacionDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDatoFormularioIva")) {
				
				jButtonAbrirImportacionDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDatoFormularioIva")) {
				jComboBoxTiposAccionesDatoFormularioIvaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDatoFormularioIva")) {
				jComboBoxTiposRelacionesDatoFormularioIvaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDatoFormularioIva")) {
				jComboBoxTiposAccionesDatoFormularioIvaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDatoFormularioIva")) {
				
				jComboBoxTiposSeleccionarDatoFormularioIvaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDatoFormularioIva")) {
				jTextFieldValorCampoGeneralDatoFormularioIvaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDatoFormularioIva")) {
				jButtonAbrirOrderByDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDatoFormularioIva")) {
				jButtonAbrirOrderByDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDatoFormularioIva")) {
				jButtonCerrarOrderByDatoFormularioIvaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDatoFormularioIvaBusqueda")) {
				this.jButtonidDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_mensualDatoFormularioIvaBusqueda")) {
				this.jButtones_mensualDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDatoFormularioIvaUpdate")) {
				this.jButtonid_anioDatoFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDatoFormularioIvaBusqueda")) {
				this.jButtonid_anioDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDatoFormularioIvaUpdate")) {
				this.jButtonid_mesDatoFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDatoFormularioIvaBusqueda")) {
				this.jButtonid_mesDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_semestreDatoFormularioIvaUpdate")) {
				this.jButtonid_semestreDatoFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_semestreDatoFormularioIvaBusqueda")) {
				this.jButtonid_semestreDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_sustitutivaDatoFormularioIvaBusqueda")) {
				this.jButtones_sustitutivaDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_formularioDatoFormularioIvaBusqueda")) {
				this.jButtonnumero_formularioDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdAnioIdSemestreDatoFormularioIva")) {
				this.jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdAnioPorIdMesDatoFormularioIva")) {
				this.jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdAnioDatoFormularioIva")) {
				this.jButtonFK_IdAnioDatoFormularioIvaActionPerformed(evt);
			}
			
			;
			
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDatoFormularioIva();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				


				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DatoFormularioIva datoformularioivaLocal=null;
			
			if(!this.getEsControlTabla()) {
				datoformularioivaLocal=this.datoformularioiva;
			} else {
				datoformularioivaLocal=this.datoformularioivaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
							
				
				


				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
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
			
			


			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
								
						
				


				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
								
				
				


				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
							
				
				


				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
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
			
			


			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioIvaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
								
				
				


				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDatoFormularioIva")) {
					jCheckBoxSeleccionarTodosDatoFormularioIvaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDatoFormularioIva")) {
					jCheckBoxSeleccionadosDatoFormularioIvaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDatoFormularioIva")) {
					
				}
				
				


				
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
												
				
				


				
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioIvaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
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
			
			


			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformularioiva);
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
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
				
				


				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioIva.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformularioivaAnterior =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDatoFormularioIva")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDatoFormularioIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDatoFormularioIva.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.datoformularioiva =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.datoformularioiva =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.datoformularioiva);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDatoFormularioIva")) {
				
				}
				
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDatoFormularioIva")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDatoFormularioIva.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDatoFormularioIva")) {
			
			}
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDatoFormularioIva();
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
			if(sTipo.equals("NuevoDatoFormularioIva")) {
				jButtonNuevoDatoFormularioIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDatoFormularioIva")) {
				jButtonDuplicarDatoFormularioIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDatoFormularioIva")) {
				jButtonCopiarDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDatoFormularioIva")) {
				jButtonVerFormDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDatoFormularioIva")) {
				jButtonNuevoDatoFormularioIvaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDatoFormularioIva")) {
				jButtonModificarDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDatoFormularioIva")) {
				jButtonActualizarDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDatoFormularioIva")) {
				jButtonEliminarDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDatoFormularioIva")) {
				jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDatoFormularioIva")) {
				jButtonCancelarDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDatoFormularioIva")) {
				jButtonCerrarDatoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDatoFormularioIva")) {
				jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDatoFormularioIva")) {
				jButtonNuevoGuardarCambiosDatoFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDatoFormularioIva")) {
				jButtonAbrirOrderByDatoFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDatoFormularioIva")) {
				jButtonRecargarInformacionDatoFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDatoFormularioIva")) {
				jButtonAnterioresDatoFormularioIvaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDatoFormularioIva")) {
				jButtonSiguientesDatoFormularioIvaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDatoFormularioIvaBusqueda")) {
				this.jButtonidDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_mensualDatoFormularioIvaBusqueda")) {
				this.jButtones_mensualDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDatoFormularioIvaUpdate")) {
				this.jButtonid_anioDatoFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDatoFormularioIvaBusqueda")) {
				this.jButtonid_anioDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDatoFormularioIvaUpdate")) {
				this.jButtonid_mesDatoFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDatoFormularioIvaBusqueda")) {
				this.jButtonid_mesDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_semestreDatoFormularioIvaUpdate")) {
				this.jButtonid_semestreDatoFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_semestreDatoFormularioIvaBusqueda")) {
				this.jButtonid_semestreDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_sustitutivaDatoFormularioIvaBusqueda")) {
				this.jButtones_sustitutivaDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_formularioDatoFormularioIvaBusqueda")) {
				this.jButtonnumero_formularioDatoFormularioIvaBusquedaActionPerformed(evt);
			}
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDatoFormularioIva();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDatoFormularioIva")) {
				closingInternalFrameDatoFormularioIva();
				
			} else if(sTipo.equals("jButtonCancelarDatoFormularioIva")) {
				JInternalFrameBase jInternalFrameDetalleFormDatoFormularioIva = (JInternalFrameBase)evt.getSource();
	            	
	            DatoFormularioIvaBeanSwingJInternalFrame jInternalFrameParent=(DatoFormularioIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormDatoFormularioIva.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDatoFormularioIvaActionPerformed(null);
			}
			
			DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.datoformularioiva,new Object(),this.datoformularioivaParameterGeneral,this.datoformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDatoFormularioIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDatoFormularioIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDatoFormularioIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.datoformularioiva)) {
			if(!esControlTabla) {
				if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);			
				}
				
				if(this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDatoFormularioIva(this.datoformularioiva,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.datoformularioivaReturnGeneral=datoformularioivaLogic.procesarEventosDatoFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoformularioivaLogic.getDatoFormularioIvas(),this.datoformularioiva,this.datoformularioivaParameterGeneral,this.isEsNuevoDatoFormularioIva,classes);//this.datoformularioivaLogic.getDatoFormularioIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDatoFormularioIva(this.datoformularioivaReturnGeneral,this.datoformularioivaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDatoFormularioIva(classes,this.datoformularioivaReturnGeneral,this.datoformularioivaBean,false);
					}
						
					if(this.datoformularioivaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDatoFormularioIva(this.datoformularioivaReturnGeneral.getDatoFormularioIva());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDatoFormularioIva(this.datoformularioivaReturnGeneral.getDatoFormularioIva());	
					}
						
					if(this.datoformularioivaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDatoFormularioIva(this.datoformularioivaReturnGeneral.getDatoFormularioIva(),classes);//this.datoformularioivaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDatoFormularioIva(this.datoformularioiva,classes);//this.datoformularioivaBean);									
				}
			
				if(DatoFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDatoFormularioIva(this.datoformularioiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioIva(this.datoformularioiva);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.datoformularioivaAnterior!=null) {
						this.datoformularioiva=this.datoformularioivaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.datoformularioivaReturnGeneral=datoformularioivaLogic.procesarEventosDatoFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoformularioivaLogic.getDatoFormularioIvas(),this.datoformularioiva,this.datoformularioivaParameterGeneral,this.isEsNuevoDatoFormularioIva,classes);//this.datoformularioivaLogic.getDatoFormularioIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.datoformularioivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.datoformularioivaReturnGeneral.getDatoFormularioIva(),datoformularioivaLogic.getDatoFormularioIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.datoformularioivaReturnGeneral.getDatoFormularioIva(),this.datoformularioivas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDatoFormularioIva.repaint();
				
				//((AbstractTableModel) this.jTableDatosDatoFormularioIva.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDatoFormularioIva();
			}
		}
	}
	
	public void actualizarVisualTableDatosDatoFormularioIva() throws Exception {
		
		DatoFormularioIvaModel datoformularioivaModel=(DatoFormularioIvaModel)this.jTableDatosDatoFormularioIva.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datoformularioivaModel.datoformularioivas=this.datoformularioivaLogic.getDatoFormularioIvas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			datoformularioivaModel.datoformularioivas=this.datoformularioivas;
		}
		
		
		((DatoFormularioIvaModel) this.jTableDatosDatoFormularioIva.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDatoFormularioIva() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdatoformularioivaAnterior(),this.datoformularioivaLogic.getDatoFormularioIvas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdatoformularioivaAnterior(),this.datoformularioivas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDatoFormularioIva();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDatoFormularioIva(DatoFormularioIva datoformularioiva,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioIva.class)) {
					this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.setFormularioIvas(datoformularioiva.getFormularioIvas());
					this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioIva(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
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
										
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoformularioiva,new Object(),generalEntityParameterGeneral,this.datoformularioivaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DatoFormularioIvaConstantesFunciones.getClassesRelationshipsOfDatoFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DatoFormularioIvaConstantesFunciones.getClassesRelationshipsFromStringsOfDatoFormularioIva(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDatoFormularioIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DatoFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoformularioiva,new Object(),generalEntityParameterGeneral,this.datoformularioivaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDatoFormularioIva(DatoFormularioIvaBean datoformularioivaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioIva.class)) {
					this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.setFormularioIvas(datoformularioiva.getFormularioIvas());
					this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioIva(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDatoFormularioIva(ArrayList<Classe> classes,DatoFormularioIvaReturnGeneral datoformularioivaReturnGeneral,DatoFormularioIvaBean datoformularioivaBean,Boolean conDefault) throws Exception {
		
			this.datoformularioivaBean.setFormularioIvas(datoformularioivaReturnGeneral.getDatoFormularioIva().getFormularioIvas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDatoFormularioIva(DatoFormularioIva datoformularioiva,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioIva.class)) {
					datoformularioiva.setFormularioIvas(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.datoformularioiva)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDatoFormularioIva = new DatoFormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.datoformularioivaSessionBean.getConGuardarRelaciones(),this.datoformularioivaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.setVisible(false);
		this.jInternalFrameDetalleFormDatoFormularioIva.setSelected(false);						
		
		this.jInternalFrameDetalleFormDatoFormularioIva.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDatoFormularioIva.datoformularioivaLogic=this.datoformularioivaLogic;
		
		this.cargarCombosFrameForeignKeyDatoFormularioIva("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDatoFormularioIva();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDatoFormularioIva();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDatoFormularioIva("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDatoFormularioIva();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDatoFormularioIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDatoFormularioIva"));
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonModificarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarDatoFormularioIva"));

		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonModificarToolBarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarDatoFormularioIva"));
					
		this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemModificarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarDatoFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonActualizarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"ActualizarDatoFormularioIva"));
		
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonActualizarToolBarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDatoFormularioIva"));
						
		this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemActualizarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDatoFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonEliminarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarDatoFormularioIva"));
		
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonEliminarToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarDatoFormularioIva"));
								
		this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemEliminarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDatoFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonCancelarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarDatoFormularioIva"));
		
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonCancelarToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarDatoFormularioIva"));
					
		this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemCancelarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDatoFormularioIva"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemDetalleCerrarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDatoFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoFormularioIva"));
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoFormularioIva"));
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDatoFormularioIva"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonidDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idDatoFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtones_mensualDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_mensualDatoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_anioDatoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_anioDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_mesDatoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_mesDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_semestreDatoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_semestreDatoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_semestreDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_semestreDatoFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtones_sustitutivaDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_sustitutivaDatoFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonnumero_formularioDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"numero_formularioDatoFormularioIvaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDatoFormularioIva.jTabbedPaneRelacionesDatoFormularioIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDatoFormularioIva"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDatoFormularioIva"));
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDatoFormularioIva"));
		}
		
		this.jTableDatosDatoFormularioIva.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDatoFormularioIva"));
		
		this.jTableDatosDatoFormularioIva.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDatoFormularioIva"));
		
		this.jButtonNuevoDatoFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoDatoFormularioIva"));
		
		this.jButtonDuplicarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"DuplicarDatoFormularioIva"));
		
		this.jButtonCopiarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"CopiarDatoFormularioIva"));
		
		this.jButtonVerFormDatoFormularioIva.addActionListener(new ButtonActionListener(this,"VerFormDatoFormularioIva"));
		
		
		this.jButtonNuevoToolBarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoToolBarDatoFormularioIva"));
			
		this.jButtonDuplicarToolBarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDatoFormularioIva"));
			
		this.jMenuItemNuevoDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDatoFormularioIva"));
			
		this.jMenuItemDuplicarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDatoFormularioIva"));		
		
		
		this.jButtonNuevoRelacionesDatoFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDatoFormularioIva"));
		
		
		this.jButtonNuevoRelacionesToolBarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDatoFormularioIva"));
			
		this.jMenuItemNuevoRelacionesDatoFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDatoFormularioIva"));		
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonModificarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarDatoFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonModificarToolBarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarDatoFormularioIva"));
			
			this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemModificarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarDatoFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonActualizarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"ActualizarDatoFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonActualizarToolBarDatoFormularioIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDatoFormularioIva"));
				
			this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemActualizarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDatoFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonEliminarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarDatoFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonEliminarToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarDatoFormularioIva"));
						
			this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemEliminarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDatoFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonCancelarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarDatoFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonCancelarToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarDatoFormularioIva"));
			
			this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemCancelarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDatoFormularioIva"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDatoFormularioIva"));		
		
		
		this.jButtonCerrarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarDatoFormularioIva"));
		
		
		this.jButtonCerrarToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarToolBarDatoFormularioIva"));
			
		this.jMenuItemCerrarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDatoFormularioIva"));
			
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jMenuItemDetalleCerrarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDatoFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosDatoFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosDatoFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoFormularioIva"));
		}
		
		this.jButtonCopiarToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"CopiarToolBarDatoFormularioIva"));
			
		this.jButtonVerFormToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"VerFormToolBarDatoFormularioIva"));
		
		this.jMenuItemGuardarCambiosDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDatoFormularioIva"));
			
		this.jMenuItemCopiarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDatoFormularioIva"));		
		
		this.jMenuItemVerFormDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDatoFormularioIva"));		
		
		
		this.jButtonGuardarCambiosTablaDatoFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDatoFormularioIva"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDatoFormularioIva"));
			
		this.jMenuItemGuardarCambiosTablaDatoFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDatoFormularioIva"));		
		
		
		
		this.jButtonRecargarInformacionDatoFormularioIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionDatoFormularioIva"));
					
		this.jButtonRecargarInformacionToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDatoFormularioIva"));
		
		this.jMenuItemRecargarInformacionDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDatoFormularioIva"));		
		
		
		
		this.jButtonAnterioresDatoFormularioIva.addActionListener (new ButtonActionListener(this,"AnterioresDatoFormularioIva"));
		
		
		this.jButtonAnterioresToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDatoFormularioIva"));
		
		this.jMenuItemAnterioresDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDatoFormularioIva"));		
		
		
		this.jButtonSiguientesDatoFormularioIva.addActionListener (new ButtonActionListener(this,"SiguientesDatoFormularioIva"));
		
		
		this.jButtonSiguientesToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDatoFormularioIva"));
			
		this.jMenuItemSiguientesDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDatoFormularioIva"));
			
		this.jMenuItemAbrirOrderByDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDatoFormularioIva"));
			
		this.jMenuItemMostrarOcultarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDatoFormularioIva"));
			
		this.jMenuItemDetalleAbrirOrderByDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDatoFormularioIva"));
			
		this.jMenuItemDetalleMostarOcultarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDatoFormularioIva"));		
		
		
		this.jButtonNuevoGuardarCambiosDatoFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDatoFormularioIva"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDatoFormularioIva"));
			
		this.jMenuItemNuevoGuardarCambiosDatoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDatoFormularioIva"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDatoFormularioIva.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDatoFormularioIva"));

		this.jCheckBoxSeleccionadosDatoFormularioIva.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDatoFormularioIva"));
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDatoFormularioIva"));
		}
		
		
		this.jComboBoxTiposRelacionesDatoFormularioIva.addActionListener (new ButtonActionListener(this,"TiposRelacionesDatoFormularioIva"));
			
		this.jComboBoxTiposAccionesDatoFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesDatoFormularioIva"));
					
		this.jComboBoxTiposSeleccionarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDatoFormularioIva"));
			
		this.jTextFieldValorCampoGeneralDatoFormularioIva.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDatoFormularioIva"));		
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonidDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idDatoFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtones_mensualDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_mensualDatoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_anioDatoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_anioDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_mesDatoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_mesDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_semestreDatoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_semestreDatoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_semestreDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_semestreDatoFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtones_sustitutivaDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_sustitutivaDatoFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonnumero_formularioDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"numero_formularioDatoFormularioIvaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorIdAnioIdSemestreDatoFormularioIva"));

			this.jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorIdAnioPorIdMesDatoFormularioIva"));

			this.jButtonFK_IdAnioDatoFormularioIva.addActionListener(new ButtonActionListener(this,"FK_IdAnioDatoFormularioIva"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDatoFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoDatoFormularioIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoFormularioIva"));
				this.jInternalFrameReporteDinamicoDatoFormularioIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoFormularioIva"));
				this.jInternalFrameReporteDinamicoDatoFormularioIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoFormularioIva"));
			}
			
			//this.jButtonCerrarReporteDinamicoDatoFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoFormularioIva"));				
			//this.jButtonGenerarReporteDinamicoDatoFormularioIva.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoFormularioIva"));
			//this.jButtonGenerarExcelReporteDinamicoDatoFormularioIva.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoFormularioIva"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDatoFormularioIva!=null) {
				this.jInternalFrameImportacionDatoFormularioIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDatoFormularioIva"));
				this.jInternalFrameImportacionDatoFormularioIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDatoFormularioIva"));
				this.jInternalFrameImportacionDatoFormularioIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDatoFormularioIva"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDatoFormularioIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByDatoFormularioIva"));
			
			this.jButtonAbrirOrderByToolBarDatoFormularioIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDatoFormularioIva"));			
			
			if(this.jInternalFrameOrderByDatoFormularioIva!=null) {
				this.jInternalFrameOrderByDatoFormularioIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDatoFormularioIva"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioIva.jTabbedPaneRelacionesDatoFormularioIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDatoFormularioIva"));
		
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
            		closingInternalFrameDatoFormularioIva();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDatoFormularioIva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDatoFormularioIva = (JInternalFrameBase)event.getSource();
	            	
	            DatoFormularioIvaBeanSwingJInternalFrame jInternalFrameParent=(DatoFormularioIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormDatoFormularioIva.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDatoFormularioIvaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDatoFormularioIva.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDatoFormularioIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDatoFormularioIva.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDatoFormularioIva.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDatoFormularioIva";
		inputMap = this.jButtonNuevoDatoFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDatoFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDatoFormularioIvaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDatoFormularioIva";
		inputMap = this.jButtonNuevoRelacionesDatoFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDatoFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDatoFormularioIvaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDatoFormularioIva";
		inputMap = this.jButtonModificarDatoFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDatoFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDatoFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDatoFormularioIva";
		inputMap = this.jButtonActualizarDatoFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDatoFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDatoFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDatoFormularioIva";
		inputMap = this.jButtonEliminarDatoFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDatoFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDatoFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDatoFormularioIva";
		inputMap = this.jButtonCancelarDatoFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDatoFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDatoFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDatoFormularioIva";
		inputMap = this.jButtonCerrarDatoFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDatoFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDatoFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDatoFormularioIva";
		inputMap = this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosDatoFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonGuardarCambiosDatoFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDatoFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDatoFormularioIva.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDatoFormularioIvaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDatoFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDatoFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDatoFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDatoFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDatoFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDatoFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonidDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idDatoFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtones_mensualDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_mensualDatoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_anioDatoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_anioDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_mesDatoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_mesDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_semestreDatoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_semestreDatoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonid_semestreDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_semestreDatoFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtones_sustitutivaDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_sustitutivaDatoFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioIva.jButtonnumero_formularioDatoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"numero_formularioDatoFormularioIvaBusqueda"));
		
		
		this.jButtonBusquedaPorIdAnioIdSemestreDatoFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorIdAnioIdSemestreDatoFormularioIva"));

		this.jButtonBusquedaPorIdAnioPorIdMesDatoFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorIdAnioPorIdMesDatoFormularioIva"));

		this.jButtonFK_IdAnioDatoFormularioIva.addActionListener(new ButtonActionListener(this,"FK_IdAnioDatoFormularioIva"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDatoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDatoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDatoFormularioIvaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDatoFormularioIva.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDatoFormularioIva(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DatoFormularioIva datoformularioivaAux:this.datoformularioivaLogic.getDatoFormularioIvas()) {
					datoformularioivaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoFormularioIva datoformularioivaAux:datoformularioivas) {
					datoformularioivaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDatoFormularioIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDatoFormularioIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DatoFormularioIva datoformularioivaAux:this.datoformularioivaLogic.getDatoFormularioIvas()) {
						datoformularioivaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoFormularioIva datoformularioivaAux:datoformularioivas) {
						datoformularioivaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DatoFormularioIva datoformularioivaAux:this.datoformularioivaLogic.getDatoFormularioIvas()) {
					
						if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL)) {
							existe=true;
							datoformularioivaAux.setes_mensual(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA)) {
							existe=true;
							datoformularioivaAux.setes_sustitutiva(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoFormularioIva datoformularioivaAux:datoformularioivas) {
						
						if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL)) {
							existe=true;
							datoformularioivaAux.setes_mensual(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA)) {
							existe=true;
							datoformularioivaAux.setes_sustitutiva(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDatoFormularioIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDatoFormularioIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDatoFormularioIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDatoFormularioIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDatoFormularioIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDatoFormularioIva.getSelectedRows();
			
			DatoFormularioIva datoformularioivaLocal=new DatoFormularioIva();
			
			//this.seleccionarTodosDatoFormularioIva(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformularioivaLocal =(DatoFormularioIva) this.datoformularioivaLogic.getDatoFormularioIvas().toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					datoformularioivaLocal =(DatoFormularioIva) this.datoformularioivas.toArray()[this.jTableDatosDatoFormularioIva.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				datoformularioivaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DatoFormularioIva datoformularioivaAux:this.datoformularioivaLogic.getDatoFormularioIvas()) {
						datoformularioivaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoFormularioIva datoformularioivaAux:datoformularioivas) {
						datoformularioivaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDatoFormularioIva(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDatoFormularioIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDatoFormularioIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDatoFormularioIvaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDatoFormularioIvaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDatoFormularioIvaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDatoFormularioIva(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDatoFormularioIva.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DatoFormularioIva datoformularioivaAux:this.datoformularioivaLogic.getDatoFormularioIvas()) {
				
						if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO)) {
							existe=true;
							datoformularioivaAux.setnumero_formulario(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoFormularioIva datoformularioivaAux:datoformularioivas) {
					
						if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO)) {
							existe=true;
							datoformularioivaAux.setnumero_formulario(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDatoFormularioIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDatoFormularioIvaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDatoFormularioIva(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDatoFormularioIva=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDatoFormularioIva.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDatoFormularioIva) {				
					conSplash=true;//false;										
					
					//this.startProcessDatoFormularioIva(conSplash);
				
					this.generarReporteDatoFormularioIvasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDatoFormularioIvasSeleccionados();
				//this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDatoFormularioIvasSeleccionados(false);
				//this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDatoFormularioIvasSeleccionados(true);
				//this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDatoFormularioIva();
				
				this.exportarDatoFormularioIvasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDatoFormularioIvas();
				//this.importarDatoFormularioIvas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDatoFormularioIva();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDatoFormularioIvasSeleccionados();
				//this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Dato Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDatoFormularioIva();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDatoFormularioIva)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDatoFormularioIva(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Dato Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.setSelectedIndex(0);					
				}	
			} 			
			else if(DatoFormularioIvaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDatoFormularioIva) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDatoFormularioIva(conSplash);
					
						//this.actualizarParametrosGeneralDatoFormularioIva();
						
						this.generarReporteProcesoAccionDatoFormularioIvasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DatoFormularioIvaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Dato Formulario IvaS SELECCIONADOS?", "MANTENIMIENTO DE Dato Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDatoFormularioIva();
				
						this.actualizarParametrosGeneralDatoFormularioIva();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.datoformularioivaReturnGeneral=datoformularioivaLogic.procesarAccionDatoFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.datoformularioivaLogic.getDatoFormularioIvas(),this.datoformularioivaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDatoFormularioIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDatoFormularioIva();
					
					DatoFormularioIvaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDatoFormularioIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDatoFormularioIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxTiposAccionesFormularioDatoFormularioIva.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDatoFormularioIva(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDatoFormularioIvaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDatoFormularioIva();
			
			if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();		
			DatoFormularioIva datoformularioiva=new DatoFormularioIva();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDatoFormularioIva(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDatoFormularioIva.getSelectedItem();
			
			
			
			
			datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
			//this.sTipoAccion;
			
			if(datoformularioivasSeleccionados.size()==1) {
				for(DatoFormularioIva datoformularioivaAux:datoformularioivasSeleccionados) {
					datoformularioiva=datoformularioivaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Formulario Iva")) {
					jButtonFormularioIvaActionPerformed(null,rowIndex,true,false,datoformularioiva);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDatoFormularioIva();
			
      		//this.finishProcessDatoFormularioIva(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDatoFormularioIvaReturnGeneral() throws Exception {
		if(this.datoformularioivaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.datoformularioivaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.datoformularioivaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.datoformularioivaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.datoformularioivaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.datoformularioivaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDatoFormularioIva(false);
		}
		
		if(this.datoformularioivaReturnGeneral.getConRetornoLista() || this.datoformularioivaReturnGeneral.getConRetornoObjeto()) {
			if(this.datoformularioivaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.datoformularioivaLogic.setDatoFormularioIvas(this.datoformularioivaReturnGeneral.getDatoFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.datoformularioivaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.datoformularioivaLogic.setDatoFormularioIva(this.datoformularioivaReturnGeneral.getDatoFormularioIva());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDatoFormularioIva(false);
		}
	}
	
	public void actualizarParametrosGeneralDatoFormularioIva() throws Exception {
		
		
	}
	
	public ArrayList<DatoFormularioIva> getDatoFormularioIvasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDatoFormularioIva) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DatoFormularioIva datoformularioivaAux:datoformularioivaLogic.getDatoFormularioIvas()) {
					if(datoformularioivaAux.getIsSelected()) {
						datoformularioivasSeleccionados.add(datoformularioivaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoFormularioIva datoformularioivaAux:this.datoformularioivas) {
					if(datoformularioivaAux.getIsSelected()) {
						datoformularioivasSeleccionados.add(datoformularioivaAux);				
					}
				}
			}
			
			if(datoformularioivasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						datoformularioivasSeleccionados.addAll(this.datoformularioivaLogic.getDatoFormularioIvas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						datoformularioivasSeleccionados.addAll(this.datoformularioivas);				
					}
				}
			}
		} else {
			datoformularioivasSeleccionados.add(this.datoformularioiva);
		}
		
		return datoformularioivasSeleccionados;
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
	
	public void generarReporteDatoFormularioIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDatoFormularioIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDatoFormularioIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDatoFormularioIvasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDatoFormularioIvasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesDatoFormularioIvasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Dato Formulario Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDatoFormularioIvasSeleccionados() throws Exception {
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();		
		
		datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDatoFormularioIvas("Todos",datoformularioivasSeleccionados);
		
	}	
	
	public void generarReporteNormalDatoFormularioIvasSeleccionados() throws Exception {
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();		
		
		datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDatoFormularioIvas("Todos",datoformularioivasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDatoFormularioIvasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();
		
		datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDatoFormularioIvas("Todos",datoformularioivasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDatoFormularioIvasSeleccionados() throws Exception {
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDatoFormularioIva();
		
		
		datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDatoFormularioIva();
		
		
		//this.generarReporteDatoFormularioIvas("Todos",datoformularioivasSeleccionados ,datoformularioivaImplementable,datoformularioivaImplementableHome);
	}
	
	public void mostrarImportacionDatoFormularioIvas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDatoFormularioIva();
		
		this.abrirFrameImportacionDatoFormularioIva();		
		
			
		//this.generarReporteDatoFormularioIvas("Todos",datoformularioivasSeleccionados ,datoformularioivaImplementable,datoformularioivaImplementableHome);
	}
	
	public void importarDatoFormularioIvas() throws Exception {		
	
	}
	
	public void exportarDatoFormularioIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDatoFormularioIvasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDatoFormularioIvasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDatoFormularioIvasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Dato Formulario Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDatoFormularioIvasSeleccionados() throws Exception {
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();		
		
		datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformularioiva."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDatoFormularioIva(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DatoFormularioIva datoformularioivaAux:datoformularioivasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDatoFormularioIva(datoformularioivaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//datoformularioivaAux.setsDetalleGeneralEntityReporte(datoformularioivaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDatoFormularioIva(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DatoFormularioIvaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioIvaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioIvaConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioIvaConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDatoFormularioIva(DatoFormularioIva datoformularioiva,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=datoformularioiva.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformularioiva.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformularioiva.getes_mensual().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformularioiva.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformularioiva.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformularioiva.getsemestre_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformularioiva.getes_sustitutiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformularioiva.getnumero_formulario();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDatoFormularioIvasSeleccionados() throws Exception {
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();		
		
		datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformularioiva.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DatoFormularioIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDatoFormularioIva(row);				
				iRow++;
			}				
			
			for(DatoFormularioIva datoformularioivaAux:datoformularioivasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDatoFormularioIva(datoformularioivaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDatoFormularioIvasSeleccionados() throws Exception {
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();		
		
		datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformularioiva.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("datoformularioivas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("datoformularioiva");
			//elementRoot.appendChild(element);
		
			for(DatoFormularioIva datoformularioivaAux:datoformularioivasSeleccionados) {
				element = document.createElement("datoformularioiva");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDatoFormularioIva(datoformularioivaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDatoFormularioIva(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDatoFormularioIva(DatoFormularioIva datoformularioiva,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(datoformularioiva.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformularioiva.getes_mensual());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformularioiva.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformularioiva.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformularioiva.getsemestre_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformularioiva.getes_sustitutiva());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformularioiva.getnumero_formulario());				
	}
	
	public void setFilaDatosExportarXmlDatoFormularioIva(DatoFormularioIva datoformularioiva,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DatoFormularioIvaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(datoformularioiva.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DatoFormularioIvaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(datoformularioiva.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementes_mensual = document.createElement(DatoFormularioIvaConstantesFunciones.ESMENSUAL);
		elementes_mensual.appendChild(document.createTextNode(datoformularioiva.getes_mensual().toString().trim()));
		element.appendChild(elementes_mensual);

		Element elementanio_descripcion = document.createElement(DatoFormularioIvaConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(datoformularioiva.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(DatoFormularioIvaConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(datoformularioiva.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementsemestre_descripcion = document.createElement(DatoFormularioIvaConstantesFunciones.IDSEMESTRE);
		elementsemestre_descripcion.appendChild(document.createTextNode(datoformularioiva.getsemestre_descripcion()));
		element.appendChild(elementsemestre_descripcion);

		Element elementes_sustitutiva = document.createElement(DatoFormularioIvaConstantesFunciones.ESSUSTITUTIVA);
		elementes_sustitutiva.appendChild(document.createTextNode(datoformularioiva.getes_sustitutiva().toString().trim()));
		element.appendChild(elementes_sustitutiva);

		Element elementnumero_formulario = document.createElement(DatoFormularioIvaConstantesFunciones.NUMEROFORMULARIO);
		elementnumero_formulario.appendChild(document.createTextNode(datoformularioiva.getnumero_formulario().trim()));
		element.appendChild(elementnumero_formulario);
	}
	
	public void generarReporteGroupGenericoDatoFormularioIvasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DatoFormularioIva> datoformularioivasSeleccionados=new ArrayList<DatoFormularioIva>();
		
		datoformularioivasSeleccionados=this.getDatoFormularioIvasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDatoFormularioIva(datoformularioivasSeleccionados);
		
		this.generarReporteDatoFormularioIvas("Todos",datoformularioivasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDatoFormularioIva(ArrayList<DatoFormularioIva> datoformularioivasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DatoFormularioIva datoformularioivaAux:datoformularioivasSeleccionados) {
				datoformularioivaAux.setsDetalleGeneralEntityReporte(datoformularioivaAux.toString());
			
				if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL)) {
					existe=true;
					datoformularioivaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(datoformularioivaAux.getes_mensual()));
				}
				 else if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					datoformularioivaAux.setsDescripcionGeneralEntityReporte1(datoformularioivaAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					datoformularioivaAux.setsDescripcionGeneralEntityReporte1(datoformularioivaAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE)) {
					existe=true;
					datoformularioivaAux.setsDescripcionGeneralEntityReporte1(datoformularioivaAux.getsemestre_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA)) {
					existe=true;
					datoformularioivaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(datoformularioivaAux.getes_sustitutiva()));
				}
				 else if(sTipoSeleccionar.equals(DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO)) {
					existe=true;
					datoformularioivaAux.setsDescripcionGeneralEntityReporte1(datoformularioivaAux.getnumero_formulario());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDatoFormularioIva(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDatoFormularioIva=true;
				this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=true;
				this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=true;
			}
			
			this.isVisibilidadCeldaModificarDatoFormularioIva=false;
			this.isVisibilidadCeldaActualizarDatoFormularioIva=false;
			this.isVisibilidadCeldaEliminarDatoFormularioIva=false;
			this.isVisibilidadCeldaCancelarDatoFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDatoFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=false;
			this.isVisibilidadCeldaModificarDatoFormularioIva=false;
			this.isVisibilidadCeldaActualizarDatoFormularioIva=true;
			this.isVisibilidadCeldaEliminarDatoFormularioIva=false;
			this.isVisibilidadCeldaCancelarDatoFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDatoFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=false;
			this.isVisibilidadCeldaModificarDatoFormularioIva=false;
			this.isVisibilidadCeldaActualizarDatoFormularioIva=true;
			this.isVisibilidadCeldaEliminarDatoFormularioIva=true;
			this.isVisibilidadCeldaCancelarDatoFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDatoFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=false;
			this.isVisibilidadCeldaModificarDatoFormularioIva=false;
			this.isVisibilidadCeldaActualizarDatoFormularioIva=true;
			this.isVisibilidadCeldaEliminarDatoFormularioIva=false;
			this.isVisibilidadCeldaCancelarDatoFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDatoFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=true;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=true;
			this.isVisibilidadCeldaModificarDatoFormularioIva=false;
			this.isVisibilidadCeldaActualizarDatoFormularioIva=false;
			this.isVisibilidadCeldaEliminarDatoFormularioIva=false;
			this.isVisibilidadCeldaCancelarDatoFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDatoFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=false;
			this.isVisibilidadCeldaActualizarDatoFormularioIva=false;
			this.isVisibilidadCeldaEliminarDatoFormularioIva=false;
			this.isVisibilidadCeldaCancelarDatoFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDatoFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=false;
			this.isVisibilidadCeldaModificarDatoFormularioIva=true;
			this.isVisibilidadCeldaActualizarDatoFormularioIva=false;
			this.isVisibilidadCeldaEliminarDatoFormularioIva=false;
			this.isVisibilidadCeldaCancelarDatoFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioIva=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DatoFormularioIvaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDatoFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=true;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=true;
		} else {
			this.actualizarEstadoPanelsDatoFormularioIva(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDatoFormularioIva=false;
			//this.isVisibilidadCeldaVerFormDatoFormularioIva=false;
			this.isVisibilidadCeldaDuplicarDatoFormularioIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!datoformularioivaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=false;
		} else {
			this.isVisibilidadCeldaNuevoDatoFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(!datoformularioivaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=false;												
			}
			
			this.jButtonCerrarDatoFormularioIva.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioIva=false;
		}
		
		if(!this.permiteMantenimiento(this.datoformularioiva)) {
			this.isVisibilidadCeldaActualizarDatoFormularioIva=false;
			this.isVisibilidadCeldaEliminarDatoFormularioIva=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDatoFormularioIva() {
		this.isVisibilidadCeldaNuevoDatoFormularioIva=false;
		this.isVisibilidadCeldaGuardarCambiosDatoFormularioIva=false;
	}
	
	public void actualizarEstadoPanelsDatoFormularioIva(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDatoFormularioIva!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioIva!=null) {
				this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioIva!=null) {
				this.jScrollPanelDatosDatoFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoFormularioIva!=null) {
				this.jPanelPaginacionDatoFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioIva!=null) {
				this.jPanelParametrosReportesDatoFormularioIva.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDatoFormularioIva!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioIva!=null) {
				this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDatoFormularioIva!=null) {
				this.jScrollPanelDatosDatoFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoFormularioIva!=null) {
				this.jPanelPaginacionDatoFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioIva!=null) {
				this.jPanelParametrosReportesDatoFormularioIva.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDatoFormularioIva!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioIva.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioIva!=null) {
				this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioIva!=null) {
				this.jScrollPanelDatosDatoFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoFormularioIva!=null) {
				this.jPanelPaginacionDatoFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioIva!=null) {
				this.jPanelParametrosReportesDatoFormularioIva.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDatoFormularioIva!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioIva!=null) {
				this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioIva!=null) {
				this.jScrollPanelDatosDatoFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoFormularioIva!=null) {
				this.jPanelPaginacionDatoFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioIva!=null) {
				this.jPanelParametrosReportesDatoFormularioIva.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDatoFormularioIva!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioIva!=null) {
				this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioIva!=null) {
				this.jScrollPanelDatosDatoFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoFormularioIva!=null) {
				this.jPanelPaginacionDatoFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioIva!=null) {
				this.jPanelParametrosReportesDatoFormularioIva.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDatoFormularioIva!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioIva!=null) {
				this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioIva!=null) {
				this.jScrollPanelDatosDatoFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoFormularioIva!=null) {
				this.jPanelPaginacionDatoFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioIva!=null) {
				this.jPanelParametrosReportesDatoFormularioIva.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDatoFormularioIva!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioIva!=null) {
				this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioIva!=null) {
				this.jScrollPanelDatosDatoFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoFormularioIva!=null) {
				this.jPanelPaginacionDatoFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioIva!=null) {
				this.jPanelParametrosReportesDatoFormularioIva.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDatoFormularioIva!=null) {
					this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDatoFormularioIva!=null) {
				this.jPanelParametrosReportesDatoFormularioIva.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioIva!=null) {
				this.jTabbedPaneBusquedasDatoFormularioIva.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDatoFormularioIva!=null) {
				this.jPanelParametrosReportesDatoFormularioIva.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaPorIdAnioIdSemestre=isParaAnio;
			if(!this.isVisibilidadBusquedaPorIdAnioIdSemestre) {this.jTabbedPaneBusquedasDatoFormularioIva.remove(jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva);}

			this.isVisibilidadBusquedaPorIdAnioPorIdMes=isParaAnio;
			if(!this.isVisibilidadBusquedaPorIdAnioPorIdMes) {this.jTabbedPaneBusquedasDatoFormularioIva.remove(jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva);}

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDatoFormularioIva.remove(jPanelFK_IdAnioDatoFormularioIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaPorIdAnioIdSemestre=isParaMesNegation;
			if(!this.isVisibilidadBusquedaPorIdAnioIdSemestre) {this.jTabbedPaneBusquedasDatoFormularioIva.remove(jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva);}

			this.isVisibilidadBusquedaPorIdAnioPorIdMes=isParaMes;
			if(!this.isVisibilidadBusquedaPorIdAnioPorIdMes) {this.jTabbedPaneBusquedasDatoFormularioIva.remove(jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva);}

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDatoFormularioIva.remove(jPanelFK_IdAnioDatoFormularioIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaSemestre(Boolean isParaSemestre){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSemestreNegation=!isParaSemestre;

			this.isVisibilidadBusquedaPorIdAnioIdSemestre=isParaSemestre;
			if(!this.isVisibilidadBusquedaPorIdAnioIdSemestre) {this.jTabbedPaneBusquedasDatoFormularioIva.remove(jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva);}

			this.isVisibilidadBusquedaPorIdAnioPorIdMes=isParaSemestreNegation;
			if(!this.isVisibilidadBusquedaPorIdAnioPorIdMes) {this.jTabbedPaneBusquedasDatoFormularioIva.remove(jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva);}

			this.isVisibilidadFK_IdAnio=isParaSemestreNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDatoFormularioIva.remove(jPanelFK_IdAnioDatoFormularioIva);}
		}
		
	}
	
	

	public String registrarSesionDatoFormularioIvaParaFormularioIvas() throws Exception {
		Boolean isPaginaPopupFormularioIva=false;

		try {

			if(this.datoformularioivaSessionBean==null) {
				this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
			}

			if(this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaSessionBean==null) {
				this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaSessionBean=new FormularioIvaSessionBean();
			}

			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaSessionBean.setsPathNavegacionActual(datoformularioivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormularioIva=this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormularioIva(true);
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioIva(DatoFormularioIvaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaSessionBean.setisBusquedaDesdeForeignKeySesionDatoFormularioIva(true);
			this.jInternalFrameDetalleFormDatoFormularioIva.formularioivaSessionBean.setlidDatoFormularioIvaActual(this.idDatoFormularioIvaActual);

			datoformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDatoFormularioIva(true);
			datoformularioivaSessionBean.setlIdDatoFormularioIvaActualForeignKey(this.idDatoFormularioIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DatoFormularioIvaSessionBean datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
		
		if(this.datoformularioivaSessionBean==null) {
			this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
		}
		
		this.datoformularioivaSessionBean.setsUltimaBusquedaDatoFormularioIva(this.getsAccionBusqueda());
		this.datoformularioivaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.datoformularioivaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdAnioIdSemestre")) {
			datoformularioivaSessionBean.setid_anio(this.getid_anioBusquedaPorIdAnioIdSemestre());	
			datoformularioivaSessionBean.setid_semestre(this.getid_semestreBusquedaPorIdAnioIdSemestre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorIdAnioPorIdMes")) {
			datoformularioivaSessionBean.setid_anio(this.getid_anioBusquedaPorIdAnioPorIdMes());	
			datoformularioivaSessionBean.setid_mes(this.getid_mesBusquedaPorIdAnioPorIdMes());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			datoformularioivaSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DatoFormularioIvaSessionBean datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
		
		if(this.datoformularioivaSessionBean==null) {
			this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
		}
		
		if(this.datoformularioivaSessionBean.getsUltimaBusquedaDatoFormularioIva()!=null&&!this.datoformularioivaSessionBean.getsUltimaBusquedaDatoFormularioIva().equals("")) {
			this.setsAccionBusqueda(datoformularioivaSessionBean.getsUltimaBusquedaDatoFormularioIva());
			this.setiNumeroPaginacion(datoformularioivaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(datoformularioivaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdAnioIdSemestre")) {
				this.setid_anioBusquedaPorIdAnioIdSemestre(datoformularioivaSessionBean.getid_anio());
				datoformularioivaSessionBean.setid_anio(null);
				this.setid_semestreBusquedaPorIdAnioIdSemestre(datoformularioivaSessionBean.getid_semestre());
				datoformularioivaSessionBean.setid_semestre(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdAnioPorIdMes")) {
				this.setid_anioBusquedaPorIdAnioPorIdMes(datoformularioivaSessionBean.getid_anio());
				datoformularioivaSessionBean.setid_anio(null);
				this.setid_mesBusquedaPorIdAnioPorIdMes(datoformularioivaSessionBean.getid_mes());
				datoformularioivaSessionBean.setid_mes(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(datoformularioivaSessionBean.getid_anio());
				datoformularioivaSessionBean.setid_anio(null);
			}
		}
		
		this.datoformularioivaSessionBean.setsUltimaBusquedaDatoFormularioIva("");
		this.datoformularioivaSessionBean.setiNumeroPaginacion(DatoFormularioIvaConstantesFunciones.INUMEROPAGINACION);
		this.datoformularioivaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDatoFormularioIva(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDatoFormularioIva() {
		this.updateBorderResaltarBusquedasFormularioDatoFormularioIva();
		this.updateVisibilidadBusquedasFormularioDatoFormularioIva();
		this.updateHabilitarBusquedasFormularioDatoFormularioIva();
	}
	
	public void updateBorderResaltarBusquedasFormularioDatoFormularioIva() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDatoFormularioIva.getComponents().length>0) {
	

		if(this.datoformularioivaConstantesFunciones.resaltarBusquedaPorIdAnioIdSemestreDatoFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);
				jPanel.setBorder(this.datoformularioivaConstantesFunciones.resaltarBusquedaPorIdAnioIdSemestreDatoFormularioIva);
			}
		}

		if(this.datoformularioivaConstantesFunciones.resaltarBusquedaPorIdAnioPorIdMesDatoFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);
				jPanel.setBorder(this.datoformularioivaConstantesFunciones.resaltarBusquedaPorIdAnioPorIdMesDatoFormularioIva);
			}
		}

		if(this.datoformularioivaConstantesFunciones.resaltarFK_IdAnioDatoFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelFK_IdAnioDatoFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);
				jPanel.setBorder(this.datoformularioivaConstantesFunciones.resaltarFK_IdAnioDatoFormularioIva);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDatoFormularioIva() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDatoFormularioIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datoformularioivaConstantesFunciones.mostrarBusquedaPorIdAnioIdSemestreDatoFormularioIva);
			if(!this.datoformularioivaConstantesFunciones.mostrarBusquedaPorIdAnioIdSemestreDatoFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasDatoFormularioIva.remove(index);
			}

			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datoformularioivaConstantesFunciones.mostrarBusquedaPorIdAnioPorIdMesDatoFormularioIva);
			if(!this.datoformularioivaConstantesFunciones.mostrarBusquedaPorIdAnioPorIdMesDatoFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasDatoFormularioIva.remove(index);
			}

			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelFK_IdAnioDatoFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datoformularioivaConstantesFunciones.mostrarFK_IdAnioDatoFormularioIva);
			if(!this.datoformularioivaConstantesFunciones.mostrarFK_IdAnioDatoFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasDatoFormularioIva.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDatoFormularioIva() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDatoFormularioIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datoformularioivaConstantesFunciones.activarBusquedaPorIdAnioIdSemestreDatoFormularioIva);
				this.jTabbedPaneBusquedasDatoFormularioIva.setEnabledAt(index,this.datoformularioivaConstantesFunciones.activarBusquedaPorIdAnioIdSemestreDatoFormularioIva);
			}

			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datoformularioivaConstantesFunciones.activarBusquedaPorIdAnioPorIdMesDatoFormularioIva);
				this.jTabbedPaneBusquedasDatoFormularioIva.setEnabledAt(index,this.datoformularioivaConstantesFunciones.activarBusquedaPorIdAnioPorIdMesDatoFormularioIva);
			}

			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelFK_IdAnioDatoFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datoformularioivaConstantesFunciones.activarFK_IdAnioDatoFormularioIva);
				this.jTabbedPaneBusquedasDatoFormularioIva.setEnabledAt(index,this.datoformularioivaConstantesFunciones.activarFK_IdAnioDatoFormularioIva);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDatoFormularioIva(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdAnioIdSemestre")) {
			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdAnioIdSemestreDatoFormularioIva);

			this.jTabbedPaneBusquedasDatoFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);

			this.datoformularioivaConstantesFunciones.setResaltarBusquedaPorIdAnioIdSemestreDatoFormularioIva(resaltar);

			jPanel.setBorder(this.datoformularioivaConstantesFunciones.resaltarBusquedaPorIdAnioIdSemestreDatoFormularioIva);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorIdAnioPorIdMes")) {
			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdAnioPorIdMesDatoFormularioIva);

			this.jTabbedPaneBusquedasDatoFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);

			this.datoformularioivaConstantesFunciones.setResaltarBusquedaPorIdAnioPorIdMesDatoFormularioIva(resaltar);

			jPanel.setBorder(this.datoformularioivaConstantesFunciones.resaltarBusquedaPorIdAnioPorIdMesDatoFormularioIva);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasDatoFormularioIva.indexOfComponent(this.jPanelFK_IdAnioDatoFormularioIva);

			this.jTabbedPaneBusquedasDatoFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioIva.getComponent(index);

			this.datoformularioivaConstantesFunciones.setResaltarFK_IdAnioDatoFormularioIva(resaltar);

			jPanel.setBorder(this.datoformularioivaConstantesFunciones.resaltarFK_IdAnioDatoFormularioIva);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDatoFormularioIva.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDatoFormularioIva() throws Exception {

		if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDatoFormularioIva();
		this.updateVisibilidadResaltarControlesFormularioDatoFormularioIva();
		this.updateHabilitarResaltarControlesFormularioDatoFormularioIva();
		
	}
	
	public void updateBorderResaltarControlesFormularioDatoFormularioIva() throws Exception {
		if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.datoformularioivaConstantesFunciones.resaltaridDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva!=null) {this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.setBorder(this.datoformularioivaConstantesFunciones.resaltaridDatoFormularioIva);}
		if(this.datoformularioivaConstantesFunciones.resaltares_mensualDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva!=null) {this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_mensualDatoFormularioIva.setBorderPainted(true);this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_mensualDatoFormularioIva.setBorder(this.datoformularioivaConstantesFunciones.resaltares_mensualDatoFormularioIva);}
		if(this.datoformularioivaConstantesFunciones.resaltarid_anioDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva!=null) {this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.setBorder(this.datoformularioivaConstantesFunciones.resaltarid_anioDatoFormularioIva);}
		if(this.datoformularioivaConstantesFunciones.resaltarid_mesDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva!=null) {this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.setBorder(this.datoformularioivaConstantesFunciones.resaltarid_mesDatoFormularioIva);}
		if(this.datoformularioivaConstantesFunciones.resaltarid_semestreDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva!=null) {this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.setBorder(this.datoformularioivaConstantesFunciones.resaltarid_semestreDatoFormularioIva);}
		if(this.datoformularioivaConstantesFunciones.resaltares_sustitutivaDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva!=null) {this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_sustitutivaDatoFormularioIva.setBorderPainted(true);this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_sustitutivaDatoFormularioIva.setBorder(this.datoformularioivaConstantesFunciones.resaltares_sustitutivaDatoFormularioIva);}
		if(this.datoformularioivaConstantesFunciones.resaltarnumero_formularioDatoFormularioIva!=null && this.jInternalFrameDetalleFormDatoFormularioIva!=null) {this.jInternalFrameDetalleFormDatoFormularioIva.jTextFieldnumero_formularioDatoFormularioIva.setBorder(this.datoformularioivaConstantesFunciones.resaltarnumero_formularioDatoFormularioIva);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDatoFormularioIva() throws Exception {		
		if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
	
		//this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostraridDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jPanelidDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostraridDatoFormularioIva);
		//this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_mensualDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrares_mensualDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jPaneles_mensualDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrares_mensualDatoFormularioIva);
		//this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrarid_anioDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jPanelid_anioDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrarid_anioDatoFormularioIva);
		//this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrarid_mesDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jPanelid_mesDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrarid_mesDatoFormularioIva);
		//this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrarid_semestreDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jPanelid_semestreDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrarid_semestreDatoFormularioIva);
		//this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_sustitutivaDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrares_sustitutivaDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jPaneles_sustitutivaDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrares_sustitutivaDatoFormularioIva);
		//this.jInternalFrameDetalleFormDatoFormularioIva.jTextFieldnumero_formularioDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrarnumero_formularioDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jPanelnumero_formularioDatoFormularioIva.setVisible(this.datoformularioivaConstantesFunciones.mostrarnumero_formularioDatoFormularioIva);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDatoFormularioIva() throws Exception {
		if(this.jInternalFrameDetalleFormDatoFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDatoFormularioIva!=null) {
	
		this.jInternalFrameDetalleFormDatoFormularioIva.jLabelidDatoFormularioIva.setEnabled(this.datoformularioivaConstantesFunciones.activaridDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_mensualDatoFormularioIva.setEnabled(this.datoformularioivaConstantesFunciones.activares_mensualDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_anioDatoFormularioIva.setEnabled(this.datoformularioivaConstantesFunciones.activarid_anioDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_mesDatoFormularioIva.setEnabled(this.datoformularioivaConstantesFunciones.activarid_mesDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jComboBoxid_semestreDatoFormularioIva.setEnabled(this.datoformularioivaConstantesFunciones.activarid_semestreDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jCheckBoxes_sustitutivaDatoFormularioIva.setEnabled(this.datoformularioivaConstantesFunciones.activares_sustitutivaDatoFormularioIva);
		this.jInternalFrameDetalleFormDatoFormularioIva.jTextFieldnumero_formularioDatoFormularioIva.setEnabled(this.datoformularioivaConstantesFunciones.activarnumero_formularioDatoFormularioIva);
		}
	}
	
		
}