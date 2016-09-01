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

import com.bydan.erp.contabilidad.util.DatoFormularioRentaConstantesFunciones;
import com.bydan.erp.contabilidad.util.DatoFormularioRentaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.DatoFormularioRentaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.DatoFormularioRentaBean;
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
public class DatoFormularioRentaBeanSwingJInternalFrame extends DatoFormularioRentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DatoFormularioRentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DatoFormularioRenta> datoformulariorentaValidator = new ClassValidator<DatoFormularioRenta>(DatoFormularioRenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DatoFormularioRenta datoformulariorenta;	
	public DatoFormularioRenta datoformulariorentaAux;
	public DatoFormularioRenta datoformulariorentaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DatoFormularioRenta datoformulariorentaTotales;
	public Long idDatoFormularioRentaActual;
	public Long iIdNuevoDatoFormularioRenta=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosFormularioRenta=false;

	public Boolean getIsTienePermisosFormularioRenta() {
		return isTienePermisosFormularioRenta;
	}

	public void setIsTienePermisosFormularioRenta(Boolean isTienePermisosFormularioRenta) {
		this.isTienePermisosFormularioRenta= isTienePermisosFormularioRenta;
	}


	public Boolean isTienePermisosFormularioRentaExtra=false;

	public Boolean getIsTienePermisosFormularioRentaExtra() {
		return isTienePermisosFormularioRentaExtra;
	}

	public void setIsTienePermisosFormularioRentaExtra(Boolean isTienePermisosFormularioRentaExtra) {
		this.isTienePermisosFormularioRentaExtra= isTienePermisosFormularioRentaExtra;
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
	
	public Boolean isPermisoTodoDatoFormularioRenta;
	public Boolean isPermisoNuevoDatoFormularioRenta;
	public Boolean isPermisoActualizarDatoFormularioRenta;
	public Boolean isPermisoActualizarOriginalDatoFormularioRenta;
	public Boolean isPermisoEliminarDatoFormularioRenta;
	public Boolean isPermisoGuardarCambiosDatoFormularioRenta;
	public Boolean isPermisoConsultaDatoFormularioRenta;
	public Boolean isPermisoBusquedaDatoFormularioRenta;
	public Boolean isPermisoReporteDatoFormularioRenta;
	public Boolean isPermisoPaginacionMedioDatoFormularioRenta;
	public Boolean isPermisoPaginacionAltoDatoFormularioRenta;
	public Boolean isPermisoPaginacionTodoDatoFormularioRenta;
	public Boolean isPermisoCopiarDatoFormularioRenta;
	public Boolean isPermisoVerFormDatoFormularioRenta;
	public Boolean isPermisoDuplicarDatoFormularioRenta;
	public Boolean isPermisoOrdenDatoFormularioRenta;
	
	
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
	
	public DatoFormularioRentaParameterReturnGeneral datoformulariorentaReturnGeneral;
	public DatoFormularioRentaParameterReturnGeneral datoformulariorentaParameterGeneral;
	
	

	public FormularioRentaLogic formulariorentaLogic=null;

	public FormularioRentaLogic getFormularioRentaLogic() {
		return formulariorentaLogic;
	}

	public void setFormularioRentaLogic(FormularioRentaLogic formulariorentaLogic) {
		this.formulariorentaLogic = formulariorentaLogic;
	}


	public FormularioRentaExtraLogic formulariorentaextraLogic=null;

	public FormularioRentaExtraLogic getFormularioRentaExtraLogic() {
		return formulariorentaextraLogic;
	}

	public void setFormularioRentaExtraLogic(FormularioRentaExtraLogic formulariorentaextraLogic) {
		this.formulariorentaextraLogic = formulariorentaextraLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDatoFormularioRenta=false;
	public Boolean esParaAccionDesdeFormularioDatoFormularioRenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DatoFormularioRentaSessionBeanAdditional datoformulariorentaSessionBeanAdditional=null;
	
	public DatoFormularioRentaSessionBeanAdditional getDatoFormularioRentaSessionBeanAdditional() {
		return this.datoformulariorentaSessionBeanAdditional;
	}
	
	public void setDatoFormularioRentaSessionBeanAdditional(DatoFormularioRentaSessionBeanAdditional datoformulariorentaSessionBeanAdditional) {
		try {
			this.datoformulariorentaSessionBeanAdditional=datoformulariorentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DatoFormularioRentaBeanSwingJInternalFrameAdditional datoformulariorentaBeanSwingJInternalFrameAdditional=null;
	//public class DatoFormularioRentaBeanSwingJInternalFrame
	
	public DatoFormularioRentaBeanSwingJInternalFrameAdditional getDatoFormularioRentaBeanSwingJInternalFrameAdditional() {
		return this.datoformulariorentaBeanSwingJInternalFrameAdditional;
	}
	
	public void setDatoFormularioRentaBeanSwingJInternalFrameAdditional(DatoFormularioRentaBeanSwingJInternalFrameAdditional datoformulariorentaBeanSwingJInternalFrameAdditional) {
		try {
			this.datoformulariorentaBeanSwingJInternalFrameAdditional=datoformulariorentaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DatoFormularioRentaLogic datoformulariorentaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DatoFormularioRenta datoformulariorentaBean;
	public DatoFormularioRentaConstantesFunciones datoformulariorentaConstantesFunciones;
	//public DatoFormularioRentaParameterReturnGeneral datoformulariorentaReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<DatoFormularioRenta> datoformulariorentas;	
	//public List<DatoFormularioRenta> datoformulariorentasEliminados;
	//public List<DatoFormularioRenta> datoformulariorentasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDatoFormularioRenta=false;
	public Boolean isVisibilidadCeldaDuplicarDatoFormularioRenta=true;
	public Boolean isVisibilidadCeldaCopiarDatoFormularioRenta=true;
	public Boolean isVisibilidadCeldaVerFormDatoFormularioRenta=true;
	public Boolean isVisibilidadCeldaOrdenDatoFormularioRenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=false;
	public Boolean isVisibilidadCeldaModificarDatoFormularioRenta=false;
	public Boolean isVisibilidadCeldaActualizarDatoFormularioRenta=false;
	public Boolean isVisibilidadCeldaEliminarDatoFormularioRenta=false;
	public Boolean isVisibilidadCeldaCancelarDatoFormularioRenta=false;
	public Boolean isVisibilidadCeldaGuardarDatoFormularioRenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoDatoFormularioRenta() {
		return this.iIdNuevoDatoFormularioRenta;
	}

	public void setiIdNuevoDatoFormularioRenta(Long iIdNuevoDatoFormularioRenta) {
		this.iIdNuevoDatoFormularioRenta = iIdNuevoDatoFormularioRenta;
	}
	
	public Long getidDatoFormularioRentaActual() {
		return this.idDatoFormularioRentaActual;
	}

	public void setidDatoFormularioRentaActual(Long idDatoFormularioRentaActual) {
		this.idDatoFormularioRentaActual = idDatoFormularioRentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DatoFormularioRenta getdatoformulariorenta() {
		return this.datoformulariorenta;
	}

	public void setdatoformulariorenta(DatoFormularioRenta datoformulariorenta) {
		this.datoformulariorenta = datoformulariorenta;
	}
	
	public DatoFormularioRenta getdatoformulariorentaAux() {
		return this.datoformulariorentaAux;
	}

	public void setdatoformulariorentaAux(DatoFormularioRenta datoformulariorentaAux) {
		this.datoformulariorentaAux = datoformulariorentaAux;
	}				
	
	public DatoFormularioRenta getdatoformulariorentaAnterior() {
		return this.datoformulariorentaAnterior;
	}

	public void setdatoformulariorentaAnterior(DatoFormularioRenta datoformulariorentaAnterior) {
		this.datoformulariorentaAnterior = datoformulariorentaAnterior;
	}	
	
	public DatoFormularioRenta getdatoformulariorentaTotales() {
		return this.datoformulariorentaTotales;
	}

	public void setdatoformulariorentaTotales(DatoFormularioRenta datoformulariorentaTotales) {
		this.datoformulariorentaTotales = datoformulariorentaTotales;
	}	
	
	public DatoFormularioRenta getdatoformulariorentaBean() {
		return this.datoformulariorentaBean;
	}

	public void setdatoformulariorentaBean(DatoFormularioRenta datoformulariorentaBean) {
		this.datoformulariorentaBean = datoformulariorentaBean;
	}	
	
	public DatoFormularioRentaParameterReturnGeneral getdatoformulariorentaReturnGeneral() {
		return this.datoformulariorentaReturnGeneral;
	}

	public void setdatoformulariorentaReturnGeneral(DatoFormularioRentaParameterReturnGeneral datoformulariorentaReturnGeneral) {
		this.datoformulariorentaReturnGeneral = datoformulariorentaReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DatoFormularioRentaLogic getDatoFormularioRentaLogic()	{		
		return datoformulariorentaLogic;
	}

	public void setDatoFormularioRentaLogic(DatoFormularioRentaLogic datoformulariorentaLogic) {
		this.datoformulariorentaLogic = datoformulariorentaLogic;
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
	
	public Boolean getIsEsNuevoDatoFormularioRenta() {
		return isEsNuevoDatoFormularioRenta;
	}

	public void setIsEsNuevoDatoFormularioRenta(Boolean isEsNuevoDatoFormularioRenta) {
		this.isEsNuevoDatoFormularioRenta = isEsNuevoDatoFormularioRenta;
	}

	public Boolean getEsParaAccionDesdeFormularioDatoFormularioRenta() {
		return esParaAccionDesdeFormularioDatoFormularioRenta;
	}
	
	public void setEsParaAccionDesdeFormularioDatoFormularioRenta(Boolean esParaAccionDesdeFormularioDatoFormularioRenta) {
		this.esParaAccionDesdeFormularioDatoFormularioRenta = esParaAccionDesdeFormularioDatoFormularioRenta;
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

			if(this.datoformulariorentaSessionBean==null) {
				this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
			}

			if(!this.datoformulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(datoformulariorentaSessionBean.getlidAnioActual());
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

			if(this.datoformulariorentaSessionBean==null) {
				this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
			}

			if(!this.datoformulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(datoformulariorentaSessionBean.getlidMesActual());
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

					if(this.datoformulariorenta!=null) {
						this.datoformulariorenta.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
						this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioDatoFormularioRenta.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
						if(this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioDatoFormularioRenta!=null) {
						jComboBoxid_anioFK_IdAnioDatoFormularioRenta.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioDatoFormularioRenta!=null) {
							//jComboBoxid_anioFK_IdAnioDatoFormularioRenta.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioDatoFormularioRenta.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioDatoFormularioRenta.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioDatoFormularioRentaGenerico)throws Exception
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
				jComboBoxid_anioDatoFormularioRentaGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioDatoFormularioRentaGenerico!=null && jComboBoxid_anioDatoFormularioRentaGenerico.getItemCount()>0) {
					jComboBoxid_anioDatoFormularioRentaGenerico.setSelectedIndex(0);
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

					if(this.datoformulariorenta!=null) {
						this.datoformulariorenta.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
						this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesDatoFormularioRenta.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
						if(this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesDatoFormularioRenta!=null) {
						jComboBoxid_mesFK_IdMesDatoFormularioRenta.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesDatoFormularioRenta!=null) {
							//jComboBoxid_mesFK_IdMesDatoFormularioRenta.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesDatoFormularioRenta.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesDatoFormularioRenta.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesDatoFormularioRentaGenerico)throws Exception
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
				jComboBoxid_mesDatoFormularioRentaGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesDatoFormularioRentaGenerico!=null && jComboBoxid_mesDatoFormularioRentaGenerico.getItemCount()>0) {
					jComboBoxid_mesDatoFormularioRentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(DatoFormularioRenta datoformulariorenta,JComboBox jComboBoxid_anioDatoFormularioRentaGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioDatoFormularioRentaGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioDatoFormularioRentaGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				datoformulariorenta.setid_anio(anioAux.getId());
				datoformulariorenta.setanio_descripcion(DatoFormularioRentaConstantesFunciones.getAnioDescripcion(anioAux));
				datoformulariorenta.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(DatoFormularioRenta datoformulariorenta,JComboBox jComboBoxid_mesDatoFormularioRentaGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesDatoFormularioRentaGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesDatoFormularioRentaGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				datoformulariorenta.setid_mes(mesAux.getId());
				datoformulariorenta.setmes_descripcion(DatoFormularioRentaConstantesFunciones.getMesDescripcion(mesAux));
				datoformulariorenta.setMes(mesAux);			}
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

					if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { 
							this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { 
					}

					if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioDatoFormularioRenta.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioDatoFormularioRenta.addItem(anio);
							}
						}

						if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { 
							this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { 
					}

					if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesDatoFormularioRenta.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesDatoFormularioRenta.addItem(mes);
							}
						}

						if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
							this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
							this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioDatoFormularioRenta.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioDatoFormularioRenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
							this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
							this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesDatoFormularioRenta.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesDatoFormularioRenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDatoFormularioRenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DatoFormularioRentaConstantesFunciones.refrescarForeignKeysDescripcionesDatoFormularioRenta(this.datoformulariorentaLogic.getDatoFormularioRentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DatoFormularioRentaConstantesFunciones.refrescarForeignKeysDescripcionesDatoFormularioRenta(this.datoformulariorentas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//datoformulariorentaLogic.setDatoFormularioRentas(this.datoformulariorentas);
			datoformulariorentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DatoFormularioRentaParameterReturnGeneral getDatoFormularioRentaParameterGeneral() {
		return this.datoformulariorentaParameterGeneral;
	}
	
	public void setDatoFormularioRentaParameterGeneral(DatoFormularioRentaParameterReturnGeneral datoformulariorentaParameterGeneral) {
		this.datoformulariorentaParameterGeneral = datoformulariorentaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDatoFormularioRenta() {
		return isPermisoTodoDatoFormularioRenta;
	}

	public void setIsPermisoTodoDatoFormularioRenta(Boolean isPermisoTodoDatoFormularioRenta) {
		this.isPermisoTodoDatoFormularioRenta = isPermisoTodoDatoFormularioRenta;
	}

	public Boolean getIsPermisoNuevoDatoFormularioRenta() {
		return isPermisoNuevoDatoFormularioRenta;
	}

	public void setIsPermisoNuevoDatoFormularioRenta(Boolean isPermisoNuevoDatoFormularioRenta) {
		this.isPermisoNuevoDatoFormularioRenta = isPermisoNuevoDatoFormularioRenta;
	}

	public Boolean getIsPermisoActualizarDatoFormularioRenta() {
		return isPermisoActualizarDatoFormularioRenta;
	}

	public void setIsPermisoActualizarDatoFormularioRenta(Boolean isPermisoActualizarDatoFormularioRenta) {
		this.isPermisoActualizarDatoFormularioRenta = isPermisoActualizarDatoFormularioRenta;
	}

	public Boolean getIsPermisoEliminarDatoFormularioRenta() {
		return isPermisoEliminarDatoFormularioRenta;
	}

	public void setIsPermisoEliminarDatoFormularioRenta(Boolean isPermisoEliminarDatoFormularioRenta) {
		this.isPermisoEliminarDatoFormularioRenta = isPermisoEliminarDatoFormularioRenta;
	}

	public Boolean getIsPermisoGuardarCambiosDatoFormularioRenta() {
		return isPermisoGuardarCambiosDatoFormularioRenta;
	}

	public void setIsPermisoGuardarCambiosDatoFormularioRenta(Boolean isPermisoGuardarCambiosDatoFormularioRenta) {
		this.isPermisoGuardarCambiosDatoFormularioRenta = isPermisoGuardarCambiosDatoFormularioRenta;
	}
	
	public Boolean getIsPermisoConsultaDatoFormularioRenta() {
		return isPermisoConsultaDatoFormularioRenta;
	}

	public void setIsPermisoConsultaDatoFormularioRenta(Boolean isPermisoConsultaDatoFormularioRenta) {
		this.isPermisoConsultaDatoFormularioRenta = isPermisoConsultaDatoFormularioRenta;
	}

	public Boolean getIsPermisoBusquedaDatoFormularioRenta() {
		return isPermisoBusquedaDatoFormularioRenta;
	}

	public void setIsPermisoBusquedaDatoFormularioRenta(Boolean isPermisoBusquedaDatoFormularioRenta) {
		this.isPermisoBusquedaDatoFormularioRenta = isPermisoBusquedaDatoFormularioRenta;
	}

	public Boolean getIsPermisoReporteDatoFormularioRenta() {
		return isPermisoReporteDatoFormularioRenta;
	}

	public void setIsPermisoReporteDatoFormularioRenta(Boolean isPermisoReporteDatoFormularioRenta) {
		this.isPermisoReporteDatoFormularioRenta = isPermisoReporteDatoFormularioRenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioDatoFormularioRenta() {
		return isPermisoPaginacionMedioDatoFormularioRenta;
	}

	public void setIsPermisoPaginacionMedioDatoFormularioRenta(Boolean isPermisoPaginacionMedioDatoFormularioRenta) {
		this.isPermisoPaginacionMedioDatoFormularioRenta = isPermisoPaginacionMedioDatoFormularioRenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoDatoFormularioRenta() {
		return isPermisoPaginacionTodoDatoFormularioRenta;
	}

	public void setIsPermisoPaginacionTodoDatoFormularioRenta(Boolean isPermisoPaginacionTodoDatoFormularioRenta) {
		this.isPermisoPaginacionTodoDatoFormularioRenta = isPermisoPaginacionTodoDatoFormularioRenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoDatoFormularioRenta() {
		return isPermisoPaginacionAltoDatoFormularioRenta;
	}

	public void setIsPermisoPaginacionAltoDatoFormularioRenta(Boolean isPermisoPaginacionAltoDatoFormularioRenta) {
		this.isPermisoPaginacionAltoDatoFormularioRenta = isPermisoPaginacionAltoDatoFormularioRenta;
	}
	
	public Boolean getIsPermisoCopiarDatoFormularioRenta() {
		return isPermisoCopiarDatoFormularioRenta;
	}

	public void setIsPermisoCopiarDatoFormularioRenta(Boolean isPermisoCopiarDatoFormularioRenta) {
		this.isPermisoCopiarDatoFormularioRenta = isPermisoCopiarDatoFormularioRenta;
	}
	
	public Boolean getIsPermisoVerFormDatoFormularioRenta() {
		return isPermisoVerFormDatoFormularioRenta;
	}

	public void setIsPermisoVerFormDatoFormularioRenta(Boolean isPermisoVerFormDatoFormularioRenta) {
		this.isPermisoVerFormDatoFormularioRenta = isPermisoVerFormDatoFormularioRenta;
	}
	
	public Boolean getIsPermisoDuplicarDatoFormularioRenta() {
		return isPermisoDuplicarDatoFormularioRenta;
	}

	public void setIsPermisoDuplicarDatoFormularioRenta(Boolean isPermisoDuplicarDatoFormularioRenta) {
		this.isPermisoDuplicarDatoFormularioRenta = isPermisoDuplicarDatoFormularioRenta;
	}
	
	public Boolean getIsPermisoOrdenDatoFormularioRenta() {
		return isPermisoOrdenDatoFormularioRenta;
	}

	public void setIsPermisoOrdenDatoFormularioRenta(Boolean isPermisoOrdenDatoFormularioRenta) {
		this.isPermisoOrdenDatoFormularioRenta = isPermisoOrdenDatoFormularioRenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDatoFormularioRenta() {
		return isVisibilidadCeldaNuevoDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaNuevoDatoFormularioRenta(Boolean isVisibilidadCeldaNuevoDatoFormularioRenta) {
		this.isVisibilidadCeldaNuevoDatoFormularioRenta = isVisibilidadCeldaNuevoDatoFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDatoFormularioRenta() {
		return isVisibilidadCeldaDuplicarDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaDuplicarDatoFormularioRenta(Boolean isVisibilidadCeldaDuplicarDatoFormularioRenta) {
		this.isVisibilidadCeldaDuplicarDatoFormularioRenta = isVisibilidadCeldaDuplicarDatoFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDatoFormularioRenta() {
		return isVisibilidadCeldaCopiarDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaCopiarDatoFormularioRenta(Boolean isVisibilidadCeldaCopiarDatoFormularioRenta) {
		this.isVisibilidadCeldaCopiarDatoFormularioRenta = isVisibilidadCeldaCopiarDatoFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDatoFormularioRenta() {
		return isVisibilidadCeldaVerFormDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaVerFormDatoFormularioRenta(Boolean isVisibilidadCeldaVerFormDatoFormularioRenta) {
		this.isVisibilidadCeldaVerFormDatoFormularioRenta = isVisibilidadCeldaVerFormDatoFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDatoFormularioRenta() {
		return isVisibilidadCeldaOrdenDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaOrdenDatoFormularioRenta(Boolean isVisibilidadCeldaOrdenDatoFormularioRenta) {
		this.isVisibilidadCeldaOrdenDatoFormularioRenta = isVisibilidadCeldaOrdenDatoFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDatoFormularioRenta() {
		return isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDatoFormularioRenta(Boolean isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta) {
		this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta = isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDatoFormularioRenta() {
		return isVisibilidadCeldaModificarDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaModificarDatoFormularioRenta(Boolean isVisibilidadCeldaModificarDatoFormularioRenta) {
		this.isVisibilidadCeldaModificarDatoFormularioRenta = isVisibilidadCeldaModificarDatoFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDatoFormularioRenta() {
		return isVisibilidadCeldaActualizarDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaActualizarDatoFormularioRenta(Boolean isVisibilidadCeldaActualizarDatoFormularioRenta) {
		this.isVisibilidadCeldaActualizarDatoFormularioRenta = isVisibilidadCeldaActualizarDatoFormularioRenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarDatoFormularioRenta() {
		return isVisibilidadCeldaEliminarDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaEliminarDatoFormularioRenta(Boolean isVisibilidadCeldaEliminarDatoFormularioRenta) {
		this.isVisibilidadCeldaEliminarDatoFormularioRenta = isVisibilidadCeldaEliminarDatoFormularioRenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarDatoFormularioRenta() {
		return isVisibilidadCeldaCancelarDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaCancelarDatoFormularioRenta(Boolean isVisibilidadCeldaCancelarDatoFormularioRenta) {
		this.isVisibilidadCeldaCancelarDatoFormularioRenta = isVisibilidadCeldaCancelarDatoFormularioRenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarDatoFormularioRenta() {
		return isVisibilidadCeldaGuardarDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaGuardarDatoFormularioRenta(Boolean isVisibilidadCeldaGuardarDatoFormularioRenta) {
		this.isVisibilidadCeldaGuardarDatoFormularioRenta = isVisibilidadCeldaGuardarDatoFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDatoFormularioRenta() {
		return isVisibilidadCeldaGuardarCambiosDatoFormularioRenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDatoFormularioRenta(Boolean isVisibilidadCeldaGuardarCambiosDatoFormularioRenta) {
		this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta = isVisibilidadCeldaGuardarCambiosDatoFormularioRenta;
	}
		
	public DatoFormularioRentaSessionBean getdatoformulariorentaSessionBean() {
		return this.datoformulariorentaSessionBean;
	}
	
	public void setdatoformulariorentaSessionBean(DatoFormularioRentaSessionBean datoformulariorentaSessionBean) {
		this.datoformulariorentaSessionBean=datoformulariorentaSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(DatoFormularioRenta datoformulariorenta)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(datoformulariorenta,null);
				this.setActualParaGuardarMesForeignKey(datoformulariorenta,null);
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
	
	public void bugActualizarReferenciaActual(DatoFormularioRenta datoformulariorenta,DatoFormularioRenta datoformulariorentaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDatoFormularioRenta(datoformulariorenta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		datoformulariorentaAux.setId(datoformulariorenta.getId());
		datoformulariorentaAux.setVersionRow(datoformulariorenta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDatoFormularioRenta();
		
			int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = datoformulariorentaValidator.getInvalidValues(this.datoformulariorenta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			datoformulariorentaLogic.setDatosCliente(datosCliente);
			datoformulariorentaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				datoformulariorentaAux=new  DatoFormularioRenta();
				
				datoformulariorentaAux.setIsNew(true);
				datoformulariorentaAux.setIsChanged(true);
				
				datoformulariorentaAux.setDatoFormularioRentaOriginal(this.datoformulariorenta);
				
				datoformulariorentaAux.setId(this.datoformulariorenta.getId());	
				datoformulariorentaAux.setVersionRow(this.datoformulariorenta.getVersionRow());	
				datoformulariorentaAux.setid_anio(this.datoformulariorenta.getid_anio());	
				datoformulariorentaAux.setid_mes(this.datoformulariorenta.getid_mes());	
				datoformulariorentaAux.setes_sustitutiva(this.datoformulariorenta.getes_sustitutiva());	
				datoformulariorentaAux.setnumero_formulario(this.datoformulariorenta.getnumero_formulario());	
				datoformulariorentaAux.setcedula_representante(this.datoformulariorenta.getcedula_representante());	
				datoformulariorentaAux.setnumero_fiscal(this.datoformulariorenta.getnumero_fiscal());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.datoformulariorentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(datoformulariorentaAux,datoformulariorentaLogic.getDatoFormularioRentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoformulariorentaAux,datoformulariorentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datoformulariorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformulariorentaLogic.saveDatoFormularioRentas();//WithConnection
						//datoformulariorentaLogic.getSetVersionRowDatoFormularioRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.datoformulariorenta,datoformulariorentaAux);
					
					this.refrescarForeignKeysDescripcionesDatoFormularioRenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas().addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentasEliminados);
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras().addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextrasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentas.addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentasEliminados);
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextras.addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextrasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datoformulariorentaLogic.saveDatoFormularioRentaRelaciones(datoformulariorentaAux,this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas(),this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras());//WithConnection
								//datoformulariorentaLogic.getSetVersionRowDatoFormularioRentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.datoformulariorenta,datoformulariorentaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.setFormularioRentaExtras(new ArrayList<FormularioRentaExtra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentas= new ArrayList<FormularioRenta>();
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextras= new ArrayList<FormularioRentaExtra>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();}
							datoformulariorentaAux.setFormularioRentas(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas());

							if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.quitarFilaTotales();}
							datoformulariorentaAux.setFormularioRentaExtras(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.datoformulariorentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(datoformulariorentaAux,datoformulariorentaLogic.getDatoFormularioRentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(datoformulariorentaAux,datoformulariorentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.datoformulariorenta,datoformulariorentaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				datoformulariorentaAux=new  DatoFormularioRenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado() 
					|| (this.datoformulariorentaSessionBean.getEsGuardarRelacionado() && this.datoformulariorenta.getId()>=0)) {
						
					datoformulariorentaAux.setIsNew(false);
				}
				
				datoformulariorentaAux.setIsDeleted(false);
			
				datoformulariorentaAux.setId(this.datoformulariorenta.getId());	
				datoformulariorentaAux.setVersionRow(this.datoformulariorenta.getVersionRow());	
				datoformulariorentaAux.setid_anio(this.datoformulariorenta.getid_anio());	
				datoformulariorentaAux.setid_mes(this.datoformulariorenta.getid_mes());	
				datoformulariorentaAux.setes_sustitutiva(this.datoformulariorenta.getes_sustitutiva());	
				datoformulariorentaAux.setnumero_formulario(this.datoformulariorenta.getnumero_formulario());	
				datoformulariorentaAux.setcedula_representante(this.datoformulariorenta.getcedula_representante());	
				datoformulariorentaAux.setnumero_fiscal(this.datoformulariorenta.getnumero_fiscal());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(datoformulariorentaAux,datoformulariorentaLogic.getDatoFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoformulariorentaAux,datoformulariorentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datoformulariorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformulariorentaLogic.saveDatoFormularioRentas();//WithConnection
						//datoformulariorentaLogic.getSetVersionRowDatoFormularioRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.datoformulariorenta,datoformulariorentaAux);
					
					this.refrescarForeignKeysDescripcionesDatoFormularioRenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas().addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentasEliminados);
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras().addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextrasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentas.addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentasEliminados);
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextras.addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextrasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datoformulariorentaLogic.saveDatoFormularioRentaRelaciones(datoformulariorentaAux,this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas(),this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras());//WithConnection
								//datoformulariorentaLogic.getSetVersionRowDatoFormularioRentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.datoformulariorenta,datoformulariorentaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.setFormularioRentaExtras(new ArrayList<FormularioRentaExtra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentas= new ArrayList<FormularioRenta>();
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextras= new ArrayList<FormularioRentaExtra>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();}
							datoformulariorentaAux.setFormularioRentas(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas());

							if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.quitarFilaTotales();}
							datoformulariorentaAux.setFormularioRentaExtras(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.datoformulariorentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(datoformulariorentaAux,datoformulariorentaLogic.getDatoFormularioRentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(datoformulariorentaAux,datoformulariorentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.datoformulariorenta,datoformulariorentaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				datoformulariorentaAux=new  DatoFormularioRenta();
				
				datoformulariorentaAux.setIsNew(false);
				datoformulariorentaAux.setIsChanged(false);
				
				datoformulariorentaAux.setIsDeleted(true);
				
				datoformulariorentaAux.setId(this.datoformulariorenta.getId());	
				datoformulariorentaAux.setVersionRow(this.datoformulariorenta.getVersionRow());	
				datoformulariorentaAux.setid_anio(this.datoformulariorenta.getid_anio());	
				datoformulariorentaAux.setid_mes(this.datoformulariorenta.getid_mes());	
				datoformulariorentaAux.setes_sustitutiva(this.datoformulariorenta.getes_sustitutiva());	
				datoformulariorentaAux.setnumero_formulario(this.datoformulariorenta.getnumero_formulario());	
				datoformulariorentaAux.setcedula_representante(this.datoformulariorenta.getcedula_representante());	
				datoformulariorentaAux.setnumero_fiscal(this.datoformulariorenta.getnumero_fiscal());	
				
				if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.datoformulariorentaAux.getId()>=0) {	
						this.datoformulariorentasEliminados.add(datoformulariorentaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(datoformulariorentaAux,datoformulariorentaLogic.getDatoFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoformulariorentaAux,datoformulariorentas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datoformulariorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformulariorentaLogic.saveDatoFormularioRentas();//WithConnection
						//datoformulariorentaLogic.getSetVersionRowDatoFormularioRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas().addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentasEliminados);
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras().addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextrasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentas.addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentasEliminados);
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextras.addAll(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextrasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datoformulariorentaLogic.saveDatoFormularioRentaRelaciones(datoformulariorentaAux,this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas(),this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras());//WithConnection
								//datoformulariorentaLogic.getSetVersionRowDatoFormularioRentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.setFormularioRentaExtras(new ArrayList<FormularioRentaExtra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentas= new ArrayList<FormularioRenta>();
							this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextras= new ArrayList<FormularioRentaExtra>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.quitarFilaTotales();}
							datoformulariorentaAux.setFormularioRentas(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas());

							if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.quitarFilaTotales();}
							datoformulariorentaAux.setFormularioRentaExtras(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.datoformulariorentaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(datoformulariorentaAux,datoformulariorentaLogic.getDatoFormularioRentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(datoformulariorentaAux,datoformulariorentas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.getDatoFormularioRentas().addAll(this.datoformulariorentasEliminados);
					
					datoformulariorentaLogic.saveDatoFormularioRentas();//WithConnection
					//datoformulariorentaLogic.getSetVersionRowDatoFormularioRentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDatoFormularioRenta();
				
				this.datoformulariorentasEliminados= new ArrayList<DatoFormularioRenta>();		
			}
			
			if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Dato Formulario Renta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Dato Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.datoformulariorenta=datoformulariorentaAux;
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
      		//this.finishProcessDatoFormularioRenta();
      	}
		
	}	
	
	public void actualizarRelaciones(DatoFormularioRenta datoformulariorentaLocal) throws Exception {
		
		if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				datoformulariorentaLocal.setFormularioRentas(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas());
				datoformulariorentaLocal.setFormularioRentaExtras(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras());
			
			} else {
			
				datoformulariorentaLocal.setFormularioRentas(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentas);
				datoformulariorentaLocal.setFormularioRentaExtras(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextras);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DatoFormularioRenta datoformulariorentaLocal) throws Exception {	
		if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				datoformulariorentaLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				datoformulariorentaLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDatoFormularioRentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = datoformulariorentaValidator.getInvalidValues(this.datoformulariorenta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DatoFormularioRenta datoformulariorenta,List<DatoFormularioRenta> datoformulariorentas) throws Exception {
		try	{		
			DatoFormularioRentaConstantesFunciones.actualizarLista(datoformulariorenta,datoformulariorentas,this.datoformulariorentaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DatoFormularioRenta datoformulariorenta,List<DatoFormularioRenta> datoformulariorentas) throws Exception {
		try	{			
			DatoFormularioRentaConstantesFunciones.actualizarSelectedLista(datoformulariorenta,datoformulariorentas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DatoFormularioRenta> datoformulariorentasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				datoformulariorentasLocal=this.datoformulariorentaLogic.getDatoFormularioRentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				datoformulariorentasLocal=this.datoformulariorentas;
			}
			//ARCHITECTURE
		
			for(DatoFormularioRenta datoformulariorentaLocal:datoformulariorentasLocal) {
				if(this.permiteMantenimiento(datoformulariorentaLocal) && datoformulariorentaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DatoFormularioRentaConstantesFunciones.getDatoFormularioRentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DatoFormularioRentaConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelid_anioDatoFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoFormularioRentaConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelid_mesDatoFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoFormularioRentaConstantesFunciones.ESSUSTITUTIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabeles_sustitutivaDatoFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoFormularioRentaConstantesFunciones.NUMEROFORMULARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelnumero_formularioDatoFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoFormularioRentaConstantesFunciones.CEDULAREPRESENTANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelcedula_representanteDatoFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoFormularioRentaConstantesFunciones.NUMEROFISCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelnumero_fiscalDatoFormularioRenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelid_anioDatoFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelid_mesDatoFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabeles_sustitutivaDatoFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelnumero_formularioDatoFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelcedula_representanteDatoFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelnumero_fiscalDatoFormularioRenta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FormularioRenta")) {
			if(this.datoformulariorenta==null) {
				this.datoformulariorenta= new DatoFormularioRenta();
			}

			if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoDatoFormularioRenta
				this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);

				this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.getformulariorenta().setDatoFormularioRenta(this.datoformulariorenta);
			}

			return;
		}
		 else  if(sTipo.equals("FormularioRentaExtra")) {
			if(this.datoformulariorenta==null) {
				this.datoformulariorenta= new DatoFormularioRenta();
			}

			if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoDatoFormularioRenta
				this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);

				this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.getformulariorentaextra().setDatoFormularioRenta(this.datoformulariorenta);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoDatoFormularioRenta--;	
		
		
		this.datoformulariorentaAux=new DatoFormularioRenta();
		
		this.datoformulariorentaAux.setId(this.iIdNuevoDatoFormularioRenta);
		this.datoformulariorentaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.datoformulariorentaLogic.getDatoFormularioRentas().add(this.datoformulariorentaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.datoformulariorentas.add(this.datoformulariorentaAux);
		}
		//ARCHITECTURE
		
		this.datoformulariorenta=this.datoformulariorentaAux;
		
		if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDatoFormularioRenta(this.datoformulariorenta);
			this.setVariablesObjetoActualToFormularioForeignKeyDatoFormularioRenta(this.datoformulariorenta);
		}
				
		//this.setDefaultControlesDatoFormularioRenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDatoFormularioRenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDatoFormularioRenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDatoFormularioRenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDatoFormularioRenta(this.datoformulariorentaBean,this.datoformulariorenta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
			classes=DatoFormularioRentaConstantesFunciones.getClassesRelationshipsOfDatoFormularioRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.datoformulariorentaReturnGeneral=datoformulariorentaLogic.procesarEventosDatoFormularioRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datoformulariorentaLogic.getDatoFormularioRentas(),this.datoformulariorenta,this.datoformulariorentaParameterGeneral,this.isEsNuevoDatoFormularioRenta,classes);//this.datoformulariorentaLogic.getDatoFormularioRenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDatoFormularioRenta(this.datoformulariorentaReturnGeneral,this.datoformulariorentaBean,false);
		
		if(this.datoformulariorentaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDatoFormularioRenta(this.datoformulariorentaReturnGeneral.getDatoFormularioRenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDatoFormularioRenta(this.datoformulariorentaReturnGeneral.getDatoFormularioRenta());
		}
		
		if(this.datoformulariorentaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDatoFormularioRenta(this.datoformulariorentaReturnGeneral.getDatoFormularioRenta(),classes);//this.datoformulariorentaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDatoFormularioRenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDatoFormularioRenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.RecargarFormDatoFormularioRenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDatoFormularioRenta(false);
						
			if(datoformulariorentaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.getEsGuardarRelacionado() && FormularioRentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormularioRentaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.getEsGuardarRelacionado() && FormularioRentaExtraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormularioRentaExtraActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoFormularioRenta();
			}
			
			this.actualizarVisualTableDatosDatoFormularioRenta();
			
			this.jTableDatosDatoFormularioRenta.setRowSelectionInterval(this.getIndiceNuevoDatoFormularioRenta(), this.getIndiceNuevoDatoFormularioRenta());
			
			this.seleccionarFilaTablaDatoFormularioRentaActual();
						
			this.actualizarEstadoCeldasBotonesDatoFormularioRenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDatoFormularioRenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxes_sustitutivaDatoFormularioRenta.setEnabled(isHabilitar && this.datoformulariorentaConstantesFunciones.activares_sustitutivaDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_formularioDatoFormularioRenta.setEnabled(isHabilitar && this.datoformulariorentaConstantesFunciones.activarnumero_formularioDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldcedula_representanteDatoFormularioRenta.setEnabled(isHabilitar && this.datoformulariorentaConstantesFunciones.activarcedula_representanteDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_fiscalDatoFormularioRenta.setEnabled(isHabilitar && this.datoformulariorentaConstantesFunciones.activarnumero_fiscalDatoFormularioRenta);	
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.setEnabled(isHabilitar && this.datoformulariorentaConstantesFunciones.activarid_anioDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.setEnabled(isHabilitar && this.datoformulariorentaConstantesFunciones.activarid_mesDatoFormularioRenta);
	};
	
	public void setDefaultControlesDatoFormularioRenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDatoFormularioRenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.datoformulariorentaSessionBean.setConGuardarRelaciones(true);			
			this.datoformulariorentaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.datoformulariorentaSessionBean.setConGuardarRelaciones(false);			
			this.datoformulariorentaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoDatoFormularioRenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentaLogic.getDatoFormularioRentas()) {
				if(datoformulariorentaAux.getId().equals(this.iIdNuevoDatoFormularioRenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentas) {
				if(datoformulariorentaAux.getId().equals(this.iIdNuevoDatoFormularioRenta)) {
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
	
	public int getIndiceActualDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentaLogic.getDatoFormularioRentas()) {
				if(datoformulariorentaAux.getId().equals(datoformulariorenta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentas) {
				if(datoformulariorentaAux.getId().equals(datoformulariorenta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDatoFormularioRenta(DatoFormularioRenta datoformulariorentaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentaLogic.getDatoFormularioRentas()) {
				if(datoformulariorentaAux.getDatoFormularioRentaOriginal().getId().equals(datoformulariorentaOriginal.getId())) {
					existe=true;
					datoformulariorentaOriginal.setId(datoformulariorentaAux.getId());
					datoformulariorentaOriginal.setVersionRow(datoformulariorentaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentas) {
				if(datoformulariorentaAux.getDatoFormularioRentaOriginal().getId().equals(datoformulariorentaOriginal.getId())) {
					existe=true;
					datoformulariorentaOriginal.setId(datoformulariorentaAux.getId());
					datoformulariorentaOriginal.setVersionRow(datoformulariorentaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDatoFormularioRenta(Boolean esParaCancelar) throws Exception {
		datoformulariorentasAux=new ArrayList<DatoFormularioRenta>();
		datoformulariorentaAux=new DatoFormularioRenta();
		
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentaLogic.getDatoFormularioRentas()) {
					if(datoformulariorentaAux.getId()<0) {
						datoformulariorentasAux.add(datoformulariorentaAux);
					}		
				}
				this.iIdNuevoDatoFormularioRenta=0L;
				this.datoformulariorentaLogic.getDatoFormularioRentas().removeAll(datoformulariorentasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentas) {
					if(datoformulariorentaAux.getId()<0) {
						datoformulariorentasAux.add(datoformulariorentaAux);
					}		
				}
				this.iIdNuevoDatoFormularioRenta=0L;
				this.datoformulariorentas.removeAll(datoformulariorentasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDatoFormularioRenta 
					&& this.datoformulariorentaLogic.getDatoFormularioRentas().size()>0
					) {
					datoformulariorentaAux=this.datoformulariorentaLogic.getDatoFormularioRentas().get(this.datoformulariorentaLogic.getDatoFormularioRentas().size() - 1);
				
					if(datoformulariorentaAux.getId()<0) {
						this.datoformulariorentaLogic.getDatoFormularioRentas().remove(datoformulariorentaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDatoFormularioRenta && this.datoformulariorentas.size()>0) {
					datoformulariorentaAux=this.datoformulariorentas.get(this.datoformulariorentas.size() - 1);
				
					if(datoformulariorentaAux.getId()<0) {
						this.datoformulariorentas.remove(datoformulariorentaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDatoFormularioRenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(datoformulariorenta.getId()<0) {
				this.datoformulariorentaLogic.getDatoFormularioRentas().remove(this.datoformulariorenta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(datoformulariorenta.getId()<0) {
				this.datoformulariorentas.remove(this.datoformulariorenta);
			}
		}			
	}
	
	public void setEstadosInicialesDatoFormularioRenta(List<DatoFormularioRenta> datoformulariorentasAux) throws Exception {
		DatoFormularioRentaConstantesFunciones.setEstadosInicialesDatoFormularioRenta(datoformulariorentasAux);
	}
	
	public void setEstadosInicialesDatoFormularioRenta(DatoFormularioRenta datoformulariorentaAux) throws Exception {
		DatoFormularioRentaConstantesFunciones.setEstadosInicialesDatoFormularioRenta(datoformulariorentaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDatoFormularioRentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDatoFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDatoFormularioRentaActual()) {
				if(!this.isEsNuevoDatoFormularioRenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDatoFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDatoFormularioRenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDatoFormularioRentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Dato Formulario Renta ?", "MANTENIMIENTO DE Dato Formulario Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDatoFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DatoFormularioRenta datoformulariorenta) throws Exception {
		DatoFormularioRentaConstantesFunciones.seleccionarAsignar(this.datoformulariorenta,datoformulariorenta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDatoFormularioRenta=this.isPermisoActualizarOriginalDatoFormularioRenta;
			
			
			this.seleccionarAsignar(datoformulariorenta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DatoFormularioRentaConstantesFunciones.quitarEspaciosDatoFormularioRenta(this.datoformulariorenta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDatoFormularioRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.datoformulariorentaSessionBean.setsFuncionBusquedaRapida(this.datoformulariorentaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDatoFormularioRenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDatoFormularioRenta(esParaCancelar);				
				this.cancelarNuevoDatoFormularioRenta(esParaCancelar);								
			}
			
			this.datoformulariorenta=new DatoFormularioRenta();
			
			this.inicializarDatoFormularioRenta();
			
			this.actualizarEstadoCeldasBotonesDatoFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDatoFormularioRenta() throws Exception {
		try {
			DatoFormularioRentaConstantesFunciones.inicializarDatoFormularioRenta(this.datoformulariorenta);
			
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
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.datoformulariorentaLogic.getDatoFormularioRentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDatoFormularioRentas(String sAccionBusqueda,List<DatoFormularioRenta> datoformulariorentasParaReportes) throws Exception {
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
					sPathReporteFinal="DatoFormularioRenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DatoFormularioRentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DatoFormularioRentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DatoFormularioRenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Dato Formulario Rentas");		
		parameters.put("busquedapor", DatoFormularioRentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FormularioRenta.class));
			classes.add(new Classe(FormularioRentaExtra.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					DatoFormularioRentaLogic datoformulariorentaLogicAuxiliar=new DatoFormularioRentaLogic();
					datoformulariorentaLogicAuxiliar.setDatosCliente(datoformulariorentaLogic.getDatosCliente());				
					datoformulariorentaLogicAuxiliar.setDatoFormularioRentas(datoformulariorentasParaReportes);
					
					datoformulariorentaLogicAuxiliar.cargarRelacionesLoteForeignKeyDatoFormularioRentaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					datoformulariorentasParaReportes=datoformulariorentaLogicAuxiliar.getDatoFormularioRentas();
					
					//datoformulariorentaLogic.getNewConnexionToDeep();
					
					//for (DatoFormularioRenta datoformulariorenta:datoformulariorentasParaReportes) {
					//	datoformulariorentaLogic.deepLoad(datoformulariorenta, false, DeepLoadType.INCLUDE, classes);
					//}						
					//datoformulariorentaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//datoformulariorentaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFormularioRenta = AuxiliarReportes.class.getResourceAsStream("FormularioRentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formulariorenta", reportFileFormularioRenta);

			InputStream reportFileFormularioRentaExtra = AuxiliarReportes.class.getResourceAsStream("FormularioRentaExtraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formulariorentaextra", reportFileFormularioRentaExtra);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDatoFormularioRenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DatoFormularioRentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DatoFormularioRentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDatoFormularioRenta=new JRBeanArrayDataSource(DatoFormularioRentaJInternalFrame.TraerDatoFormularioRentaBeans(datoformulariorentasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDatoFormularioRenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DatoFormularioRentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DatoFormularioRentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DatoFormularioRentaBean.TraerDatoFormularioRentaBeans(datoformulariorentasParaReportes).toArray()));
							
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
				this.generarExcelReporteDatoFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,datoformulariorentasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDatoFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,datoformulariorentasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDatoFormularioRentaActionPerformed(null);
					//this.generarExcelReporteDatoFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,datoformulariorentasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDatoFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,datoformulariorentasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDatoFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,datoformulariorentasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDatoFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,datoformulariorentasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDatoFormularioRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoFormularioRenta> datoformulariorentasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformulariorenta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoFormularioRentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDatoFormularioRenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DatoFormularioRenta datoformulariorenta : datoformulariorentasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DatoFormularioRentaConstantesFunciones.generarExcelReporteDataDatoFormularioRenta("NORMAL",row,workbook,datoformulariorenta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDatoFormularioRenta(String sTipo,Row row,Workbook workbook) {
		
		DatoFormularioRentaConstantesFunciones.generarExcelReporteHeaderDatoFormularioRenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDatoFormularioRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoFormularioRenta> datoformulariorentasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformulariorenta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoFormularioRentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DatoFormularioRenta datoformulariorenta : datoformulariorentasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DatoFormularioRentaConstantesFunciones.getDatoFormularioRentaDescripcion(datoformulariorenta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioRentaConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoformulariorenta.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioRentaConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoformulariorenta.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(datoformulariorenta.getes_sustitutiva()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoformulariorenta.getnumero_formulario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoformulariorenta.getcedula_representante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoformulariorenta.getnumero_fiscal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDatoFormularioRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoFormularioRenta> datoformulariorentasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DatoFormularioRenta> datoformulariorentasRespaldo=null;
		
		classes=DatoFormularioRentaConstantesFunciones.getClassesRelationshipsOfDatoFormularioRenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.datoformulariorentaLogic.setDatosCliente(this.datosCliente);
		this.datoformulariorentaLogic.setDatosDeep(this.datosDeep);
		this.datoformulariorentaLogic.setIsConDeep(true);
		
		datoformulariorentasRespaldo=this.datoformulariorentaLogic.getDatoFormularioRentas();
		
		this.datoformulariorentaLogic.setDatoFormularioRentas(datoformulariorentasParaReportes);	
		this.datoformulariorentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		datoformulariorentasParaReportes=this.datoformulariorentaLogic.getDatoFormularioRentas();
		this.datoformulariorentaLogic.setDatoFormularioRentas(datoformulariorentasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformulariorenta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoFormularioRentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDatoFormularioRenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DatoFormularioRenta datoformulariorenta : datoformulariorentasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDatoFormularioRenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DatoFormularioRentaConstantesFunciones.generarExcelReporteDataDatoFormularioRenta("NORMAL",row,workbook,datoformulariorenta,cellStyleDataAux);
		
			
			


				//FormularioRenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormularioRentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(datoformulariorenta.getFormularioRentas()!=null && datoformulariorenta.getFormularioRentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormularioRentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormularioRentaConstantesFunciones.generarExcelReporteHeaderFormularioRenta("RELACIONADO",row,workbook);
				}

				if(datoformulariorenta.getFormularioRentas()!=null) {
					i2=0;
					for(FormularioRenta formulariorenta : datoformulariorenta.getFormularioRentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormularioRentaConstantesFunciones.generarExcelReporteDataFormularioRenta("RELACIONADO",row,workbook,formulariorenta,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FormularioRentaExtra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO))) {

				if(datoformulariorenta.getFormularioRentaExtras()!=null && datoformulariorenta.getFormularioRentaExtras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormularioRentaExtraConstantesFunciones.generarExcelReporteHeaderFormularioRentaExtra("RELACIONADO",row,workbook);
				}

				if(datoformulariorenta.getFormularioRentaExtras()!=null) {
					i2=0;
					for(FormularioRentaExtra formulariorentaextra : datoformulariorenta.getFormularioRentaExtras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormularioRentaExtraConstantesFunciones.generarExcelReporteDataFormularioRentaExtra("RELACIONADO",row,workbook,formulariorentaextra,cellStyleDataAuxHijo);
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
		cell.setCellValue(DatoFormularioRentaConstantesFunciones.getDatoFormularioRentaDescripcion(datoformulariorenta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDatoFormularioRenta() throws Exception {		
		this.startProcessDatoFormularioRenta(true);
	}
	
	public void startProcessDatoFormularioRenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDatoFormularioRenta ,this.jPanelParametrosReportesDatoFormularioRenta, this.jScrollPanelDatosDatoFormularioRenta,this.jPanelPaginacionDatoFormularioRenta, this.jScrollPanelDatosEdicionDatoFormularioRenta, this.jPanelAccionesDatoFormularioRenta,this.jPanelAccionesFormularioDatoFormularioRenta,this.jmenuBarDatoFormularioRenta,this.jmenuBarDetalleDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,this.jTtoolBarDetalleDatoFormularioRenta);		
		
		final JTabbedPane jTabbedPaneBusquedasDatoFormularioRenta=this.jTabbedPaneBusquedasDatoFormularioRenta; 
		
		final JPanel jPanelParametrosReportesDatoFormularioRenta=this.jPanelParametrosReportesDatoFormularioRenta;
		//final JScrollPane jScrollPanelDatosDatoFormularioRenta=this.jScrollPanelDatosDatoFormularioRenta;
		final JTable jTableDatosDatoFormularioRenta=this.jTableDatosDatoFormularioRenta;		
		final JPanel jPanelPaginacionDatoFormularioRenta=this.jPanelPaginacionDatoFormularioRenta;
		//final JScrollPane jScrollPanelDatosEdicionDatoFormularioRenta=this.jScrollPanelDatosEdicionDatoFormularioRenta;
		final JPanel jPanelAccionesDatoFormularioRenta=this.jPanelAccionesDatoFormularioRenta;
		
		JPanel jPanelCamposAuxiliarDatoFormularioRenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDatoFormularioRenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			jPanelCamposAuxiliarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jPanelCamposDatoFormularioRenta;
			jPanelAccionesFormularioAuxiliarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jPanelAccionesFormularioDatoFormularioRenta;
		}
		
		final JPanel jPanelCamposDatoFormularioRenta=jPanelCamposAuxiliarDatoFormularioRenta;
		final JPanel jPanelAccionesFormularioDatoFormularioRenta=jPanelAccionesFormularioAuxiliarDatoFormularioRenta;
		
		
		final JMenuBar jmenuBarDatoFormularioRenta=this.jmenuBarDatoFormularioRenta;
		final JToolBar jTtoolBarDatoFormularioRenta=this.jTtoolBarDatoFormularioRenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDatoFormularioRenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDatoFormularioRenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			jmenuBarDetalleAuxiliarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jmenuBarDetalleDatoFormularioRenta;
			jTtoolBarDetalleAuxiliarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jTtoolBarDetalleDatoFormularioRenta;
		}
		
		final JMenuBar jmenuBarDetalleDatoFormularioRenta=jmenuBarDetalleAuxiliarDatoFormularioRenta;
		final JToolBar jTtoolBarDetalleDatoFormularioRenta=jTtoolBarDetalleAuxiliarDatoFormularioRenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDatoFormularioRenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDatoFormularioRenta;
			processRunnable.jTableDatos=jTableDatosDatoFormularioRenta;
			processRunnable.jPanelCampos=jPanelCamposDatoFormularioRenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionDatoFormularioRenta;
			processRunnable.jPanelAcciones=jPanelAccionesDatoFormularioRenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDatoFormularioRenta;
			
			
			processRunnable.jmenuBar=jmenuBarDatoFormularioRenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDatoFormularioRenta;
			processRunnable.jTtoolBar=jTtoolBarDatoFormularioRenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDatoFormularioRenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDatoFormularioRenta ,jPanelParametrosReportesDatoFormularioRenta,jTableDatosDatoFormularioRenta, /*jScrollPanelDatosDatoFormularioRenta,*/jPanelCamposDatoFormularioRenta,jPanelPaginacionDatoFormularioRenta, /*jScrollPanelDatosEdicionDatoFormularioRenta,*/ jPanelAccionesDatoFormularioRenta,jPanelAccionesFormularioDatoFormularioRenta,jmenuBarDatoFormularioRenta,jmenuBarDetalleDatoFormularioRenta,jTtoolBarDatoFormularioRenta,jTtoolBarDetalleDatoFormularioRenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDatoFormularioRenta ,jPanelParametrosReportesDatoFormularioRenta, jScrollPanelDatosDatoFormularioRenta,jPanelPaginacionDatoFormularioRenta, jScrollPanelDatosEdicionDatoFormularioRenta, jPanelAccionesDatoFormularioRenta,jPanelAccionesFormularioDatoFormularioRenta,jmenuBarDatoFormularioRenta,jmenuBarDetalleDatoFormularioRenta,jTtoolBarDatoFormularioRenta,jTtoolBarDetalleDatoFormularioRenta);
						
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
	
	public void finishProcessDatoFormularioRenta() {// throws Exception 
		this.finishProcessDatoFormularioRenta(true);
	}
	
	public void finishProcessDatoFormularioRenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDatoFormularioRenta ,this.jPanelParametrosReportesDatoFormularioRenta, this.jScrollPanelDatosDatoFormularioRenta,this.jPanelPaginacionDatoFormularioRenta, this.jScrollPanelDatosEdicionDatoFormularioRenta, this.jPanelAccionesDatoFormularioRenta,this.jPanelAccionesFormularioDatoFormularioRenta,this.jmenuBarDatoFormularioRenta,this.jmenuBarDetalleDatoFormularioRenta,this.jTtoolBarDatoFormularioRenta,this.jTtoolBarDetalleDatoFormularioRenta);		
		
		final JTabbedPane jTabbedPaneBusquedasDatoFormularioRenta=this.jTabbedPaneBusquedasDatoFormularioRenta; 
		
		final JPanel jPanelParametrosReportesDatoFormularioRenta=this.jPanelParametrosReportesDatoFormularioRenta;
		//final JScrollPane jScrollPanelDatosDatoFormularioRenta=this.jScrollPanelDatosDatoFormularioRenta;
		final JTable jTableDatosDatoFormularioRenta=this.jTableDatosDatoFormularioRenta;		
		final JPanel jPanelPaginacionDatoFormularioRenta=this.jPanelPaginacionDatoFormularioRenta;
		//final JScrollPane jScrollPanelDatosEdicionDatoFormularioRenta=this.jScrollPanelDatosEdicionDatoFormularioRenta;
		final JPanel jPanelAccionesDatoFormularioRenta=this.jPanelAccionesDatoFormularioRenta;
		
		JPanel jPanelCamposAuxiliarDatoFormularioRenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDatoFormularioRenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			jPanelCamposAuxiliarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jPanelCamposDatoFormularioRenta;
			jPanelAccionesFormularioAuxiliarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jPanelAccionesFormularioDatoFormularioRenta;
		}
		
		final JPanel jPanelCamposDatoFormularioRenta=jPanelCamposAuxiliarDatoFormularioRenta;
		final JPanel jPanelAccionesFormularioDatoFormularioRenta=jPanelAccionesFormularioAuxiliarDatoFormularioRenta;
		
		
		final JMenuBar jmenuBarDatoFormularioRenta=this.jmenuBarDatoFormularioRenta;		
		final JToolBar jTtoolBarDatoFormularioRenta=this.jTtoolBarDatoFormularioRenta;
				
		JMenuBar jmenuBarDetalleAuxiliarDatoFormularioRenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDatoFormularioRenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			jmenuBarDetalleAuxiliarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jmenuBarDetalleDatoFormularioRenta;
			jTtoolBarDetalleAuxiliarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jTtoolBarDetalleDatoFormularioRenta;		
		}
		
		final JMenuBar jmenuBarDetalleDatoFormularioRenta=jmenuBarDetalleAuxiliarDatoFormularioRenta;
		final JToolBar jTtoolBarDetalleDatoFormularioRenta=jTtoolBarDetalleAuxiliarDatoFormularioRenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDatoFormularioRenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDatoFormularioRenta;
			processRunnable.jTableDatos=jTableDatosDatoFormularioRenta;
			processRunnable.jPanelCampos=jPanelCamposDatoFormularioRenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionDatoFormularioRenta;
			processRunnable.jPanelAcciones=jPanelAccionesDatoFormularioRenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDatoFormularioRenta;
			
			
			processRunnable.jmenuBar=jmenuBarDatoFormularioRenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDatoFormularioRenta;
			processRunnable.jTtoolBar=jTtoolBarDatoFormularioRenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDatoFormularioRenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDatoFormularioRenta ,jPanelParametrosReportesDatoFormularioRenta, jTableDatosDatoFormularioRenta,/*jScrollPanelDatosDatoFormularioRenta,*/jPanelCamposDatoFormularioRenta,jPanelPaginacionDatoFormularioRenta, /*jScrollPanelDatosEdicionDatoFormularioRenta,*/ jPanelAccionesDatoFormularioRenta,jPanelAccionesFormularioDatoFormularioRenta,jmenuBarDatoFormularioRenta,jmenuBarDetalleDatoFormularioRenta,jTtoolBarDatoFormularioRenta,jTtoolBarDetalleDatoFormularioRenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDatoFormularioRenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDatoFormularioRenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDatoFormularioRenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDatoFormularioRenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDatoFormularioRenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDatoFormularioRenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDatoFormularioRenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDatoFormularioRenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDatoFormularioRenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.datoformulariorentaConstantesFunciones.getsFinalQueryDatoFormularioRenta();
		String  finalQueryPaginacionTodos=this.datoformulariorentaConstantesFunciones.getsFinalQueryDatoFormularioRenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DatoFormularioRentaConstantesFunciones.getArrayColumnasGlobalesNoDatoFormularioRenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DatoFormularioRentaConstantesFunciones.getArrayColumnasGlobalesDatoFormularioRenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DatoFormularioRentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.datoformulariorentasEliminados= new ArrayList<DatoFormularioRenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDatoFormularioRenta();
		
				///*DatoFormularioRentaSessionBean*/this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
			
			if(this.datoformulariorentaSessionBean==null) {
				this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
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
					this.iNumeroPaginacion=DatoFormularioRentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DatoFormularioRentaConstantesFunciones.getClassesForeignKeysOfDatoFormularioRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/datoformulariorenta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			datoformulariorentasAux= new ArrayList<DatoFormularioRenta>();
			
				
			datoformulariorentaLogic.setDatosCliente(this.datosCliente);
			datoformulariorentaLogic.setDatosDeep(this.datosDeep);
			datoformulariorentaLogic.setIsConDeep(true);
			
			
			datoformulariorentaLogic.getDatoFormularioRentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					datoformulariorentaLogic.getTodosDatoFormularioRentas(finalQueryGlobal,pagination);
					
					//datoformulariorentaLogic.getTodosDatoFormularioRentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(datoformulariorentaLogic.getDatoFormularioRentas()==null|| datoformulariorentaLogic.getDatoFormularioRentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datoformulariorentasAux= new ArrayList<DatoFormularioRenta>();
							datoformulariorentasAux.addAll(datoformulariorentaLogic.getDatoFormularioRentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformulariorentasAux= new ArrayList<DatoFormularioRenta>();
							datoformulariorentasAux.addAll(datoformulariorentas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datoformulariorentaLogic.getTodosDatoFormularioRentas(finalQueryGlobal+"",this.pagination);												
							
							//datoformulariorentaLogic.getTodosDatoFormularioRentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDatoFormularioRentas("Todos",datoformulariorentaLogic.getDatoFormularioRentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datoformulariorentaLogic.setDatoFormularioRentas(new ArrayList<DatoFormularioRenta>());					
							datoformulariorentaLogic.getDatoFormularioRentas().addAll(datoformulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformulariorentas=new ArrayList<DatoFormularioRenta>();
							datoformulariorentas.addAll(datoformulariorentasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDatoFormularioRenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDatoFormularioRenta=this.idActual;
				
				} else if(this.idDatoFormularioRentaActual!=null && this.idDatoFormularioRentaActual!=0L) {
					idDatoFormularioRenta=idDatoFormularioRentaActual;
				}
				
					
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndicePorId(idDatoFormularioRenta);
				
				this.datoformulariorentas=new ArrayList<DatoFormularioRenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					datoformulariorentaLogic.getEntity(idDatoFormularioRenta);
					
					//datoformulariorentaLogic.getEntityWithConnection(idDatoFormularioRenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformulariorentaLogic.setDatoFormularioRentas(new ArrayList<DatoFormularioRenta>());
					datoformulariorentaLogic.getDatoFormularioRentas().add(datoformulariorentaLogic.getDatoFormularioRenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoformulariorentas=new ArrayList<DatoFormularioRenta>();
					this.datoformulariorentas.add(datoformulariorenta);
				}
				
				if(datoformulariorentaLogic.getDatoFormularioRenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datoformulariorentaLogic.getDatoFormularioRentasFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datoformulariorentaLogic.getDatoFormularioRentas()==null||datoformulariorentaLogic.getDatoFormularioRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datoformulariorentas==null|| datoformulariorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformulariorentasAux=new ArrayList<DatoFormularioRenta>();
						datoformulariorentasAux.addAll(datoformulariorentaLogic.getDatoFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformulariorentasAux=new ArrayList<DatoFormularioRenta>();
							datoformulariorentasAux.addAll(datoformulariorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datoformulariorentaLogic.getDatoFormularioRentasFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoFormularioRentas("FK_IdAnio",datoformulariorentaLogic.getDatoFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoFormularioRentas("FK_IdAnio",datoformulariorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformulariorentaLogic.setDatoFormularioRentas(new ArrayList<DatoFormularioRenta>());
						datoformulariorentaLogic.getDatoFormularioRentas().addAll(datoformulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformulariorentas=new ArrayList<DatoFormularioRenta>();
							datoformulariorentas.addAll(datoformulariorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datoformulariorentaLogic.getDatoFormularioRentasFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datoformulariorentaLogic.getDatoFormularioRentas()==null||datoformulariorentaLogic.getDatoFormularioRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datoformulariorentas==null|| datoformulariorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformulariorentasAux=new ArrayList<DatoFormularioRenta>();
						datoformulariorentasAux.addAll(datoformulariorentaLogic.getDatoFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformulariorentasAux=new ArrayList<DatoFormularioRenta>();
							datoformulariorentasAux.addAll(datoformulariorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datoformulariorentaLogic.getDatoFormularioRentasFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoFormularioRentaConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoFormularioRentas("FK_IdMes",datoformulariorentaLogic.getDatoFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoFormularioRentas("FK_IdMes",datoformulariorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformulariorentaLogic.setDatoFormularioRentas(new ArrayList<DatoFormularioRenta>());
						datoformulariorentaLogic.getDatoFormularioRentas().addAll(datoformulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformulariorentas=new ArrayList<DatoFormularioRenta>();
							datoformulariorentas.addAll(datoformulariorentasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDatoFormularioRenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDatoFormularioRenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=datoformulariorentaLogic.getDatoFormularioRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datoformulariorentas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=datoformulariorentaLogic.getDatoFormularioRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datoformulariorentas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DatoFormularioRenta datoformulariorenta) {
		Boolean permite=true;
		
		if(this.datoformulariorenta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DatoFormularioRentaConstantesFunciones.getOrderByListaDatoFormularioRenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DatoFormularioRentaConstantesFunciones.getOrderByListaDatoFormularioRenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoFormularioRenta datoformulariorenta:datoformulariorentaLogic.getDatoFormularioRentas()) {
				if(datoformulariorenta.getsType().equals(Constantes2.S_TOTALES)) {
					datoformulariorentaTotales=datoformulariorenta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoFormularioRenta datoformulariorenta:this.datoformulariorentas) {
				if(datoformulariorenta.getsType().equals(Constantes2.S_TOTALES)) {
					datoformulariorentaTotales=datoformulariorenta;
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
			this.datoformulariorentaAux=new DatoFormularioRenta();
			this.datoformulariorentaAux.setsType(Constantes2.S_TOTALES);
			this.datoformulariorentaAux.setIsNew(false);
			this.datoformulariorentaAux.setIsChanged(false);
			this.datoformulariorentaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DatoFormularioRentaConstantesFunciones.TotalizarValoresFilaDatoFormularioRenta(this.datoformulariorentaLogic.getDatoFormularioRentas(),this.datoformulariorentaAux);
				
				this.datoformulariorentaLogic.getDatoFormularioRentas().add(this.datoformulariorentaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DatoFormularioRentaConstantesFunciones.TotalizarValoresFilaDatoFormularioRenta(this.datoformulariorentas,this.datoformulariorentaAux);
				
				this.datoformulariorentas.add(this.datoformulariorentaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		datoformulariorentaTotales=new DatoFormularioRenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.datoformulariorentaLogic.getDatoFormularioRentas().remove(datoformulariorentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.datoformulariorentas.remove(datoformulariorentaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		datoformulariorentaTotales=new DatoFormularioRenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoFormularioRenta datoformulariorenta:datoformulariorentaLogic.getDatoFormularioRentas()) {
				if(datoformulariorenta.getsType().equals(Constantes2.S_TOTALES)) {
					datoformulariorentaTotales=datoformulariorenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DatoFormularioRentaConstantesFunciones.TotalizarValoresFilaDatoFormularioRenta(this.datoformulariorentaLogic.getDatoFormularioRentas(),datoformulariorentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoFormularioRenta datoformulariorenta:this.datoformulariorentas) {
				if(datoformulariorenta.getsType().equals(Constantes2.S_TOTALES)) {
					datoformulariorentaTotales=datoformulariorenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DatoFormularioRentaConstantesFunciones.TotalizarValoresFilaDatoFormularioRenta(this.datoformulariorentas,datoformulariorentaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDatoFormularioRentasFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDatoFormularioRentasFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDatoFormularioRentasFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformulariorentaLogic.getDatoFormularioRentasFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDatoFormularioRentasFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformulariorentaLogic.getDatoFormularioRentasFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
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
	
	public void inicializarPermisosDatoFormularioRenta() {
		this.isPermisoTodoDatoFormularioRenta=false;
		this.isPermisoNuevoDatoFormularioRenta=false;
		this.isPermisoActualizarDatoFormularioRenta=false;
		this.isPermisoActualizarOriginalDatoFormularioRenta=false;
		this.isPermisoEliminarDatoFormularioRenta=false;
		this.isPermisoGuardarCambiosDatoFormularioRenta=false;
		this.isPermisoConsultaDatoFormularioRenta=false;
		this.isPermisoBusquedaDatoFormularioRenta=false;
		this.isPermisoReporteDatoFormularioRenta=false;		
		this.isPermisoOrdenDatoFormularioRenta=false;		
		this.isPermisoPaginacionMedioDatoFormularioRenta=false;		
		this.isPermisoPaginacionAltoDatoFormularioRenta=false;
		this.isPermisoPaginacionTodoDatoFormularioRenta=false;
		this.isPermisoCopiarDatoFormularioRenta=false;		
		this.isPermisoVerFormDatoFormularioRenta=false;		
		this.isPermisoDuplicarDatoFormularioRenta=false;		
		this.isPermisoOrdenDatoFormularioRenta=false;		
	}
	
	public void setPermisosUsuarioDatoFormularioRenta(Boolean isPermiso) {
		this.isPermisoTodoDatoFormularioRenta=isPermiso;
		this.isPermisoNuevoDatoFormularioRenta=isPermiso;
		this.isPermisoActualizarDatoFormularioRenta=isPermiso;
		this.isPermisoActualizarOriginalDatoFormularioRenta=isPermiso;
		this.isPermisoEliminarDatoFormularioRenta=isPermiso;
		this.isPermisoGuardarCambiosDatoFormularioRenta=isPermiso;
		this.isPermisoConsultaDatoFormularioRenta=isPermiso;
		this.isPermisoBusquedaDatoFormularioRenta=isPermiso;
		this.isPermisoReporteDatoFormularioRenta=isPermiso;
		this.isPermisoOrdenDatoFormularioRenta=isPermiso;		
		this.isPermisoPaginacionMedioDatoFormularioRenta=isPermiso;		
		this.isPermisoPaginacionAltoDatoFormularioRenta=isPermiso;		
		this.isPermisoPaginacionTodoDatoFormularioRenta=isPermiso;		
		this.isPermisoCopiarDatoFormularioRenta=isPermiso;		
		this.isPermisoVerFormDatoFormularioRenta=isPermiso;		
		this.isPermisoDuplicarDatoFormularioRenta=isPermiso;
		this.isPermisoOrdenDatoFormularioRenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDatoFormularioRenta(Boolean isPermiso) {
		//this.isPermisoTodoDatoFormularioRenta=isPermiso;
		this.isPermisoNuevoDatoFormularioRenta=isPermiso;
		this.isPermisoActualizarDatoFormularioRenta=isPermiso;
		this.isPermisoActualizarOriginalDatoFormularioRenta=isPermiso;
		this.isPermisoEliminarDatoFormularioRenta=isPermiso;
		this.isPermisoGuardarCambiosDatoFormularioRenta=isPermiso;
		//this.isPermisoConsultaDatoFormularioRenta=isPermiso;
		//this.isPermisoBusquedaDatoFormularioRenta=isPermiso;
		//this.isPermisoReporteDatoFormularioRenta=isPermiso;
		//this.isPermisoOrdenDatoFormularioRenta=isPermiso;		
		//this.isPermisoPaginacionMedioDatoFormularioRenta=isPermiso;		
		//this.isPermisoPaginacionAltoDatoFormularioRenta=isPermiso;		
		//this.isPermisoPaginacionTodoDatoFormularioRenta=isPermiso;		
		//this.isPermisoCopiarDatoFormularioRenta=isPermiso;		
		//this.isPermisoDuplicarDatoFormularioRenta=isPermiso;
		//this.isPermisoOrdenDatoFormularioRenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDatoFormularioRentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormularioRentaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FormularioRentaExtraConstantesFunciones.SNOMBREOPCION);
		
		if(DatoFormularioRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFormularioRenta=false;
		this.isTienePermisosFormularioRenta=this.verificarGetPermisosUsuarioOpcionDatoFormularioRentaClaseRelacionada(this.opcionsRelacionadas,FormularioRentaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFormularioRentaExtra=false;
		this.isTienePermisosFormularioRentaExtra=this.verificarGetPermisosUsuarioOpcionDatoFormularioRentaClaseRelacionada(this.opcionsRelacionadas,FormularioRentaExtraConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebDatoFormularioRenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDatoFormularioRentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormularioRenta=conPermiso;
		this.isTienePermisosFormularioRentaExtra=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioDatoFormularioRentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDatoFormularioRentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDatoFormularioRentaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormularioRenta && this.jInternalFrameDetalleFormDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.remove(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFormularioRentaExtra && this.jInternalFrameDetalleFormDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.remove(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioDatoFormularioRenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DatoFormularioRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DatoFormularioRentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDatoFormularioRenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDatoFormularioRenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDatoFormularioRenta=this.isPermisoActualizarDatoFormularioRenta;
			this.isPermisoEliminarDatoFormularioRenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDatoFormularioRenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDatoFormularioRenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDatoFormularioRenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDatoFormularioRenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDatoFormularioRenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDatoFormularioRenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDatoFormularioRenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDatoFormularioRenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDatoFormularioRenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDatoFormularioRenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDatoFormularioRenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDatoFormularioRenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDatoFormularioRenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDatoFormularioRenta.setToolTipText(this.jTableDatosDatoFormularioRenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDatoFormularioRenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDatoFormularioRenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DatoFormularioRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DatoFormularioRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDatoFormularioRenta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormularioRenta && this.datoformulariorentaConstantesFunciones.mostrarFormularioRentaDatoFormularioRenta && !DatoFormularioRentaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formulario Renta");
			reporte.setsDescripcion("Formulario Renta");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFormularioRentaExtra && this.datoformulariorentaConstantesFunciones.mostrarFormularioRentaExtraDatoFormularioRenta && !DatoFormularioRentaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formulario Renta Extra");
			reporte.setsDescripcion("Formulario Renta Extra");
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
	public void inicializarCombosForeignKeyDatoFormularioRentaListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDatoFormularioRentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DatoFormularioRentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDatoFormularioRentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyDatoFormularioRentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DatoFormularioRentaParameterReturnGeneral datoformulariorentaReturnGeneral=new DatoFormularioRentaParameterReturnGeneral();
						
			


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.datoformulariorentaConstantesFunciones.cargarid_anioDatoFormularioRenta)
					 || (this.esRecargarFks && this.datoformulariorentaConstantesFunciones.cargarid_anioDatoFormularioRenta)) {

					if(!this.datoformulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+datoformulariorentaSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.datoformulariorentaConstantesFunciones.cargarid_mesDatoFormularioRenta)
					 || (this.esRecargarFks && this.datoformulariorentaConstantesFunciones.cargarid_mesDatoFormularioRenta)) {

					if(!this.datoformulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+datoformulariorentaSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				datoformulariorentaReturnGeneral=datoformulariorentaLogic.cargarCombosLoteForeignKeyDatoFormularioRenta(finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=datoformulariorentaReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=datoformulariorentaReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDatoFormularioRenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.datoformulariorentaSessionBean==null) {
				this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
			}

			if(!this.datoformulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.datoformulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyDatoFormularioRenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDatoFormularioRenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDatoFormularioRenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDatoFormularioRenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDatoFormularioRenta(DatoFormularioRenta datoformulariorenta)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDatoFormularioRenta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDatoFormularioRenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDatoFormularioRenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDatoFormularioRenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDatoFormularioRenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDatoFormularioRenta()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDatoFormularioRenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDatoFormularioRenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public DatoFormularioRentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DatoFormularioRentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DatoFormularioRentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean(); 
		this.datoformulariorentaConstantesFunciones=new DatoFormularioRentaConstantesFunciones(); 
		this.datoformulariorentaBean=new DatoFormularioRenta();//(this.datoformulariorentaConstantesFunciones); 		
		this.datoformulariorentaReturnGeneral=new DatoFormularioRentaParameterReturnGeneral(); 
		
		this.datoformulariorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datoformulariorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DatoFormularioRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DatoFormularioRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DatoFormularioRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDatoFormularioRenta(true);
			
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
			
			this.datoformulariorentaConstantesFunciones=new DatoFormularioRentaConstantesFunciones(); 
			this.datoformulariorentaBean=new DatoFormularioRenta();//this.datoformulariorentaConstantesFunciones); 			
			this.datoformulariorentaReturnGeneral=new DatoFormularioRentaParameterReturnGeneral(); 
		
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dato Formulario Renta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.datoformulariorenta=new DatoFormularioRenta();
			this.datoformulariorentas = new ArrayList<DatoFormularioRenta>();
			this.datoformulariorentasAux = new ArrayList<DatoFormularioRenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic=new DatoFormularioRentaLogic();
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}
			
			//this.datoformulariorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.datoformulariorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDatoFormularioRenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDatoFormularioRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDatoFormularioRenta);	
					}
					
					if(this.jInternalFrameImportacionDatoFormularioRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDatoFormularioRenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDatoFormularioRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDatoFormularioRenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDatoFormularioRenta);
				this.jInternalFrameDetalleFormDatoFormularioRenta.setVisible(false);
				this.jInternalFrameDetalleFormDatoFormularioRenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDatoFormularioRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDatoFormularioRenta);
					this.jInternalFrameReporteDinamicoDatoFormularioRenta.setVisible(false);
					this.jInternalFrameReporteDinamicoDatoFormularioRenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDatoFormularioRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDatoFormularioRenta);
					this.jInternalFrameImportacionDatoFormularioRenta.setVisible(false);
					this.jInternalFrameImportacionDatoFormularioRenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDatoFormularioRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDatoFormularioRenta);
					this.jInternalFrameOrderByDatoFormularioRenta.setVisible(false);
					this.jInternalFrameOrderByDatoFormularioRenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDatoFormularioRentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DatoFormularioRentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.datoformulariorentaReturnGeneral=new DatoFormularioRentaParameterReturnGeneral();
			
			this.datoformulariorentaParameterGeneral=new DatoFormularioRentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.datoformulariorentaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DatoFormularioRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormularioRentaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FormularioRentaExtraConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DatoFormularioRentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.datoformulariorentaSessionBean.getEsGuardarRelacionado(),this.datoformulariorentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DatoFormularioRentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.datoformulariorentaSessionBean.getEsGuardarRelacionado(),this.datoformulariorentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=false;
			this.isVisibilidadCeldaDuplicarDatoFormularioRenta=true;
			this.isVisibilidadCeldaCopiarDatoFormularioRenta=true;
			this.isVisibilidadCeldaVerFormDatoFormularioRenta=true;
			this.isVisibilidadCeldaOrdenDatoFormularioRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=false;
			this.isVisibilidadCeldaModificarDatoFormularioRenta=false;
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=false;
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=false;
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=false;
			this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDatoFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDatoFormularioRenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDatoFormularioRenta(false);
			
			this.setPermisosUsuarioDatoFormularioRenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado() 
				|| (this.datoformulariorentaSessionBean.getEsGuardarRelacionado() && this.datoformulariorentaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDatoFormularioRentaClasesRelacionadas();
			}
			
			if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDatoFormularioRentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDatoFormularioRenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDatoFormularioRenta();
			}
			
			if(!this.isPermisoBusquedaDatoFormularioRenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDatoFormularioRenta,this.isPermisoPaginacionMedioDatoFormularioRenta,this.isPermisoPaginacionTodoDatoFormularioRenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DatoFormularioRentaConstantesFunciones.getTiposSeleccionarDatoFormularioRenta());
				
				this.tiposColumnasSelect=DatoFormularioRentaConstantesFunciones.getTiposSeleccionarDatoFormularioRenta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectDatoFormularioRenta();				
				//this.tiposRelacionesSelect=DatoFormularioRentaConstantesFunciones.getTiposRelacionesDatoFormularioRenta(true);
				
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
			//if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDatoFormularioRenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDatoFormularioRenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDatoFormularioRenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoFormularioRenta() ;
			
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
			
			
			this.formulariorentaLogic=new FormularioRentaLogic();
			this.formulariorentaextraLogic=new FormularioRentaExtraLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				datoformulariorentaImplementable= (DatoFormularioRentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DatoFormularioRentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				datoformulariorentaImplementableHome= (DatoFormularioRentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DatoFormularioRentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.datoformulariorentas= new ArrayList<DatoFormularioRenta>();
			this.datoformulariorentasEliminados= new ArrayList<DatoFormularioRenta>();
						
			this.isEsNuevoDatoFormularioRenta=false;
			this.esParaAccionDesdeFormularioDatoFormularioRenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDatoFormularioRenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDatoFormularioRenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DatoFormularioRentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDatoFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDatoFormularioRenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDatoFormularioRenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDatoFormularioRenta();
			}
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDatoFormularioRenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDatoFormularioRenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDatoFormularioRenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDatoFormularioRenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DatoFormularioRenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDatoFormularioRenta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDatoFormularioRenta")) {
				iIndex=this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();	
				
				

				if(sTitle.equals("Formulario Rentas")) {
					if(!FormularioRentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessDatoFormularioRenta();

						this.cargarParteTabPanelRelacionadaFormularioRenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Formulario Renta Extras")) {
					if(!FormularioRentaExtraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessDatoFormularioRenta();

						this.cargarParteTabPanelRelacionadaFormularioRentaExtra(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDatoFormularioRenta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormularioRenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormDatoFormularioRenta.cargarSessionConBeanSwingJInternalFrameFormularioRenta(false,true,iIndex);
		this.jButtonFormularioRentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormularioRenta();

		//this.jTabbedPaneRelacionesDatoFormularioRenta.updateUI();
		//this.jTabbedPaneRelacionesDatoFormularioRenta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesDatoFormularioRenta.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaFormularioRentaExtra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormDatoFormularioRenta.cargarSessionConBeanSwingJInternalFrameFormularioRentaExtra(false,true,iIndex);
		this.jButtonFormularioRentaExtraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormularioRentaExtra();

		//this.jTabbedPaneRelacionesDatoFormularioRenta.updateUI();
		//this.jTabbedPaneRelacionesDatoFormularioRenta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesDatoFormularioRenta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FormularioRenta")) {
				int row=this.jTableDatosDatoFormularioRenta.getSelectedRow();
				jButtonFormularioRentaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FormularioRentaExtra")) {
				int row=this.jTableDatosDatoFormularioRenta.getSelectedRow();
				jButtonFormularioRentaExtraActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Formulario Renta")) {

					if(this.isTienePermisosFormularioRenta && this.datoformulariorentaConstantesFunciones.mostrarFormularioRentaDatoFormularioRenta && !DatoFormularioRentaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formulario Rentas"+"("+FormularioRentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formulario Rentas");

						if(datoformulariorentaConstantesFunciones.resaltarFormularioRentaDatoFormularioRenta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(datoformulariorentaConstantesFunciones.resaltarFormularioRentaDatoFormularioRenta);
						}

						jmenuItem.setEnabled(this.datoformulariorentaConstantesFunciones.activarFormularioRentaDatoFormularioRenta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormularioRenta"));

						

						this.jInternalFrameDetalleFormDatoFormularioRenta.jmenuDetalleDatoFormularioRenta.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Formulario Renta Extra")) {

					if(this.isTienePermisosFormularioRentaExtra && this.datoformulariorentaConstantesFunciones.mostrarFormularioRentaExtraDatoFormularioRenta && !DatoFormularioRentaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formulario Renta Extras"+"("+FormularioRentaExtraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formulario Renta Extras");

						if(datoformulariorentaConstantesFunciones.resaltarFormularioRentaExtraDatoFormularioRenta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(datoformulariorentaConstantesFunciones.resaltarFormularioRentaExtraDatoFormularioRenta);
						}

						jmenuItem.setEnabled(this.datoformulariorentaConstantesFunciones.activarFormularioRentaExtraDatoFormularioRenta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormularioRentaExtra"));

						

						this.jInternalFrameDetalleFormDatoFormularioRenta.jmenuDetalleDatoFormularioRenta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyDatoFormularioRenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDatoFormularioRenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDatoFormularioRenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDatoFormularioRentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDatoFormularioRenta();
		
		this.cargarCombosFrameForeignKeyDatoFormularioRenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDatoFormularioRenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDatoFormularioRenta();
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
	
	public void jButtonNuevoDatoFormularioRentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
			
			if(jTableDatosDatoFormularioRenta.getRowCount()>=1) {
				jTableDatosDatoFormularioRenta.removeRowSelectionInterval(0, jTableDatosDatoFormularioRenta.getRowCount()-1);						
			}
			
			this.isEsNuevoDatoFormularioRenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDatoFormularioRenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDatoFormularioRenta(true);			
			//this.datoformulariorenta=new DatoFormularioRenta();
			//this.datoformulariorenta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoFormularioRenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoFormularioRenta() ;
			
			if(DatoFormularioRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoFormularioRenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.datoformulariorenta);	
			this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);				
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
			if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DatoFormularioRenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDatoFormularioRentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDatoFormularioRenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDatoFormularioRenta.getSelectedRows().length;			
			}
			
			datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDatoFormularioRenta--;			
				//DatoFormularioRenta datoformulariorentaAux= new DatoFormularioRenta();			
				//datoformulariorentaAux.setId(this.iIdNuevoDatoFormularioRenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DatoFormularioRenta datoformulariorentaOrigen=new DatoFormularioRenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DatoFormularioRenta datoformulariorentaOrigen : datoformulariorentasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							datoformulariorentaOrigen =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoformulariorentaOrigen =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDatoFormularioRenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.datoformulariorenta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDatoFormularioRenta(datoformulariorentaOrigen,this.datoformulariorenta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.datoformulariorentaLogic.getDatoFormularioRentas().add(this.datoformulariorentaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.datoformulariorentas.add(this.datoformulariorentaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
				
				this.jTableDatosDatoFormularioRenta.setRowSelectionInterval(this.getIndiceNuevoDatoFormularioRenta(), this.getIndiceNuevoDatoFormularioRenta());
				
				int iLastRow =  this.jTableDatosDatoFormularioRenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDatoFormularioRenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDatoFormularioRenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();									
		
			DatoFormularioRenta datoformulariorentaOrigen=new DatoFormularioRenta();
			DatoFormularioRenta datoformulariorentaDestino=new DatoFormularioRenta();
				
			datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDatoFormularioRenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || datoformulariorentasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDatoFormularioRenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformulariorentaOrigen =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						datoformulariorentaOrigen =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoformulariorentaDestino =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						datoformulariorentaDestino =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				datoformulariorentaOrigen =datoformulariorentasSeleccionados.get(0);
				datoformulariorentaDestino =datoformulariorentasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDatoFormularioRenta(datoformulariorentaOrigen,datoformulariorentaDestino,true,false);
				
				datoformulariorentaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(datoformulariorentaDestino,datoformulariorentaLogic.getDatoFormularioRentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoformulariorentaDestino,datoformulariorentas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
				
				//this.jTableDatosDatoFormularioRenta.setRowSelectionInterval(this.getIndiceNuevoDatoFormularioRenta(), this.getIndiceNuevoDatoFormularioRenta());
				
				int iLastRow =  this.jTableDatosDatoFormularioRenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDatoFormularioRenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDatoFormularioRenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDatoFormularioRenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDatoFormularioRenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDatoFormularioRenta.setVisible(!isVisible);
			this.jPanelPaginacionDatoFormularioRenta.setVisible(!isVisible);
			this.jPanelAccionesDatoFormularioRenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDatoFormularioRenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDatoFormularioRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDatoFormularioRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDatoFormularioRenta();
			
			this.abrirFrameOrderByDatoFormularioRenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDatoFormularioRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDatoFormularioRenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDatoFormularioRenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDatoFormularioRenta.isMaximum()) {
					this.jInternalFrameDetalleFormDatoFormularioRenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDatoFormularioRenta.setSize(this.jInternalFrameDetalleFormDatoFormularioRenta.iWidthFormulario,this.jInternalFrameDetalleFormDatoFormularioRenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDatoFormularioRenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDatoFormularioRenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDatoFormularioRenta.isMaximum()) {
						this.jInternalFrameDetalleFormDatoFormularioRenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDatoFormularioRenta.jContentPaneDetalleDatoFormularioRenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDatoFormularioRenta.jContentPaneDetalleDatoFormularioRenta.getWidth(),DatoFormularioRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDatoFormularioRenta.jContentPaneDetalleDatoFormularioRenta.getWidth(),DatoFormularioRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDatoFormularioRenta.jContentPaneDetalleDatoFormularioRenta.getWidth(),DatoFormularioRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormularioRentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormularioRenta();
					}

					if(FormularioRentaExtraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormularioRentaExtra();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDatoFormularioRenta.setVisible(true);
	        this.jInternalFrameDetalleFormDatoFormularioRenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDatoFormularioRenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDatoFormularioRenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDatoFormularioRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoFormularioRenta,false,this);
				} else {
					this.jInternalFrameOrderByDatoFormularioRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoFormularioRenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDatoFormularioRenta);
				this.jInternalFrameOrderByDatoFormularioRenta.setVisible(false);
				this.jInternalFrameOrderByDatoFormularioRenta.setSelected(false);
				
				this.jInternalFrameOrderByDatoFormularioRenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDatoFormularioRenta"));
				
				this.inicializarActualizarBindingTablaOrderByDatoFormularioRenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDatoFormularioRenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDatoFormularioRenta==null) {
				
				this.jInternalFrameImportacionDatoFormularioRenta=new ImportacionJInternalFrame(DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDatoFormularioRenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDatoFormularioRenta);
				this.jInternalFrameImportacionDatoFormularioRenta.setVisible(false);
				this.jInternalFrameImportacionDatoFormularioRenta.setSelected(false);


				this.jInternalFrameImportacionDatoFormularioRenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDatoFormularioRenta"));
				this.jInternalFrameImportacionDatoFormularioRenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDatoFormularioRenta"));
				this.jInternalFrameImportacionDatoFormularioRenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDatoFormularioRenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDatoFormularioRenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDatoFormularioRenta==null) {
				this.jInternalFrameReporteDinamicoDatoFormularioRenta=new ReporteDinamicoJInternalFrame(DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDatoFormularioRenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDatoFormularioRenta);
				this.jInternalFrameReporteDinamicoDatoFormularioRenta.setVisible(false);
				this.jInternalFrameReporteDinamicoDatoFormularioRenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoFormularioRenta"));
				this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoFormularioRenta"));
				this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoFormularioRenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoFormularioRenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormularioRenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.jScrollPanelDatosFormularioRenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormDatoFormularioRenta.jContentPaneDetalleDatoFormularioRenta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.jScrollPanelDatosFormularioRenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.jScrollPanelDatosFormularioRenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.jScrollPanelDatosFormularioRenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaFormularioRentaExtra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.jScrollPanelDatosFormularioRentaExtra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormDatoFormularioRenta.jContentPaneDetalleDatoFormularioRenta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.jScrollPanelDatosFormularioRentaExtra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.jScrollPanelDatosFormularioRentaExtra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.jScrollPanelDatosFormularioRentaExtra.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleDatoFormularioRenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDatoFormularioRenta);
			
	       	this.jInternalFrameDetalleFormDatoFormularioRenta.setVisible(false);
	        this.jInternalFrameDetalleFormDatoFormularioRenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormDatoFormularioRenta.dispose();
			//this.jInternalFrameDetalleFormDatoFormularioRenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDatoFormularioRenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDatoFormularioRenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoDatoFormularioRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDatoFormularioRenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDatoFormularioRenta.setVisible(true);
	        this.jInternalFrameImportacionDatoFormularioRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDatoFormularioRenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDatoFormularioRenta.setVisible(true);
	        this.jInternalFrameOrderByDatoFormularioRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDatoFormularioRenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDatoFormularioRenta.setVisible(false);
	        this.jInternalFrameOrderByDatoFormularioRenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDatoFormularioRenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDatoFormularioRenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoDatoFormularioRenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDatoFormularioRenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDatoFormularioRenta.setVisible(false);
	        this.jInternalFrameImportacionDatoFormularioRenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDatoFormularioRenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDatoFormularioRenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDatoFormularioRenta(true);
			//this.isEsNuevoDatoFormularioRenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDatoFormularioRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoFormularioRenta(false) ;
			
			if(datoformulariorentaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.getEsGuardarRelacionado() && FormularioRentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormularioRentaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.getEsGuardarRelacionado() && FormularioRentaExtraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormularioRentaExtraActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(DatoFormularioRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoFormularioRenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoFormularioRenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDatoFormularioRentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDatoFormularioRenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDatoFormularioRenta(true);
			//this.isEsNuevoDatoFormularioRenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.datoformulariorenta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDatoFormularioRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDatoFormularioRenta(false) ;
			
			if(DatoFormularioRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoFormularioRenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoFormularioRenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,DatoFormularioRentaConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoFormularioRenta.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,DatoFormularioRentaConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoFormularioRenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDatoFormularioRenta(false);
			
			//if(!this.isEsNuevoDatoFormularioRenta) {								
				int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
				
			}
			
			if(this.permiteMantenimiento(this.datoformulariorenta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDatoFormularioRenta=true;
					this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
					this.isEsNuevoDatoFormularioRenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDatoFormularioRenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDatoFormularioRenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDatoFormularioRenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoFormularioRenta(false);
				
				this.habilitarDeshabilitarControlesDatoFormularioRenta(false);
			
												
				
				if(DatoFormularioRentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDatoFormularioRenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDatoFormularioRentaActionPerformed(evt,datoformulariorentaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDatoFormularioRenta(this.datoformulariorenta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDatoFormularioRenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,datoformulariorentaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.datoformulariorenta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				this.datoformulariorenta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				this.datoformulariorenta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.datoformulariorenta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DatoFormularioRentaModel) this.jTableDatosDatoFormularioRenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDatoFormularioRenta=true;
				this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
				this.isEsNuevoDatoFormularioRenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDatoFormularioRenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoFormularioRenta(false);
				
				this.habilitarDeshabilitarControlesDatoFormularioRenta(false);
				
				
				
				if(DatoFormularioRentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDatoFormularioRenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDatoFormularioRenta.getRowCount()>=1) {
				jTableDatosDatoFormularioRenta.removeRowSelectionInterval(0, jTableDatosDatoFormularioRenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDatoFormularioRenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoFormularioRenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoFormularioRenta(false) ;
			
			this.isEsNuevoDatoFormularioRenta=false;
			
			if(DatoFormularioRentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDatoFormularioRenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDatoFormularioRenta(false);
				
				//SI ES MANUAL
				if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDatoFormularioRenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDatoFormularioRenta--;			
			//DatoFormularioRenta datoformulariorentaAux= new DatoFormularioRenta();			
			//datoformulariorentaAux.setId(this.iIdNuevoDatoFormularioRenta);
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDatoFormularioRenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
			
			this.datoformulariorenta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.datoformulariorentaLogic.getDatoFormularioRentas().add(this.datoformulariorentaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.datoformulariorentas.add(this.datoformulariorentaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
			
			this.jTableDatosDatoFormularioRenta.setRowSelectionInterval(this.getIndiceNuevoDatoFormularioRenta(), this.getIndiceNuevoDatoFormularioRenta());
			
			int iLastRow =  this.jTableDatosDatoFormularioRenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDatoFormularioRenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDatoFormularioRenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDatoFormularioRenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoFormularioRenta(false);
			
			//SI ES MANUAL
			if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoFormularioRenta();
			}
			
			//this.abrirFrameTreeDatoFormularioRenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Dato Formulario RentaS ?", "MANTENIMIENTO DE Dato Formulario Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDatoFormularioRenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDatoFormularioRenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.datoformulariorentaReturnGeneral=datoformulariorentaLogic.procesarImportacionDatoFormularioRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.datoformulariorentaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDatoFormularioRentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDatoFormularioRenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDatoFormularioRenta.setFileImportacion(this.jInternalFrameImportacionDatoFormularioRenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDatoFormularioRenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDatoFormularioRenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDatoFormularioRenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDatoFormularioRenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();		

		datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DatoFormularioRentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DatoFormularioRentaBaseDesign.jrxml";
			
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
			
			this.generarReporteDatoFormularioRentas("Todos",datoformulariorentasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DatoFormularioRentaConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sustitutiva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sustitutiva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sustitutiva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sustitutiva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFormulario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFormulario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFormulario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFormulario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_dulaRepresentante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_dulaRepresentante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_dulaRepresentante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_dulaRepresentante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFiscal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFiscal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFiscal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFiscal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DatoFormularioRentaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA:
					sNombreCampoCategoria="es_sustitutiva";
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO:
					sNombreCampoCategoria="numero_formulario";
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE:
					sNombreCampoCategoria="cedula_representante";
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL:
					sNombreCampoCategoria="numero_fiscal";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DatoFormularioRentaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA:
					sNombreCampoCategoriaValor="es_sustitutiva";
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO:
					sNombreCampoCategoriaValor="numero_formulario";
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE:
					sNombreCampoCategoriaValor="cedula_representante";
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL:
					sNombreCampoCategoriaValor="numero_fiscal";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DatoFormularioRentaConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Sustitutiva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_sustitutiva");
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Formulario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_formulario");
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cedula Representante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cedula_representante");
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Fiscal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_fiscal");
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
	
	public void jButtonGenerarExcelReporteDinamicoDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();		
		
		datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformulariorenta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DatoFormularioRentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DatoFormularioRentaConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(DatoFormularioRenta datoformulariorenta:datoformulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformulariorenta.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(DatoFormularioRenta datoformulariorenta:datoformulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformulariorenta.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA);
					iRow++;

					for(DatoFormularioRenta datoformulariorenta:datoformulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformulariorenta.getes_sustitutiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO);
					iRow++;

					for(DatoFormularioRenta datoformulariorenta:datoformulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformulariorenta.getnumero_formulario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE);
					iRow++;

					for(DatoFormularioRenta datoformulariorenta:datoformulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformulariorenta.getcedula_representante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL);
					iRow++;

					for(DatoFormularioRenta datoformulariorenta:datoformulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoformulariorenta.getnumero_fiscal());
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
			//	this.getFilaCabeceraExportarExcelDatoFormularioRenta(row);				
			//	iRow++;
			//}				
			
			//for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDatoFormularioRenta(datoformulariorentaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
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
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoFormularioRenta(false);
			
			//SI ES MANUAL
			if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoFormularioRenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoFormularioRenta(false);
			
			//SI ES MANUAL
			if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDatoFormularioRenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoFormularioRenta(false);
			
			//SI ES MANUAL
			if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDatoFormularioRenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDatoFormularioRenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDatoFormularioRenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDatoFormularioRenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDatoFormularioRenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDatoFormularioRenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDatoFormularioRenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosDatoFormularioRenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosDatoFormularioRenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDatoFormularioRenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDatoFormularioRenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDatoFormularioRenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDatoFormularioRenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDatoFormularioRenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDatoFormularioRenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoFormularioRenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDatoFormularioRenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDatoFormularioRenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDatoFormularioRenta();
		
		this.inicializarActualizarBindingBotonesManualDatoFormularioRenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDatoFormularioRenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoFormularioRenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDatoFormularioRenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDatoFormularioRenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDatoFormularioRenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDatoFormularioRenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDatoFormularioRenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxPostAccionNuevoDatoFormularioRenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxPostAccionSinCerrarDatoFormularioRenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxPostAccionSinMensajeDatoFormularioRenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDatoFormularioRenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDatoFormularioRenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDatoFormularioRenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
				this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxPostAccionNuevoDatoFormularioRenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxPostAccionSinCerrarDatoFormularioRenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxPostAccionSinMensajeDatoFormularioRenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDatoFormularioRenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDatoFormularioRenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDatoFormularioRenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDatoFormularioRenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDatoFormularioRenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDatoFormularioRenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDatoFormularioRenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDatoFormularioRenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDatoFormularioRenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDatoFormularioRenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDatoFormularioRenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDatoFormularioRenta(Boolean esInicializar) throws Exception {
		try	{	
			if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDatoFormularioRenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDatoFormularioRenta() throws Exception {
		try	{
			if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDatoFormularioRenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDatoFormularioRenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDatoFormularioRenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDatoFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDatoFormularioRenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDatoFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDatoFormularioRenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDatoFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDatoFormularioRenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDatoFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDatoFormularioRenta.addItem(reporte);
			}
			
			
			if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDatoFormularioRenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDatoFormularioRenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDatoFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDatoFormularioRenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDatoFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDatoFormularioRenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDatoFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDatoFormularioRenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDatoFormularioRenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoFormularioRenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoFormularioRenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDatoFormularioRenta!=null) {
				this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDatoFormularioRenta!=null) {
				this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDatoFormularioRenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDatoFormularioRenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioDatoFormularioRenta.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioDatoFormularioRenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesDatoFormularioRenta.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesDatoFormularioRenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDatoFormularioRenta(Boolean esInicializar) throws Exception {				
		if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDatoFormularioRenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDatoFormularioRenta() throws Exception {
		this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDatoFormularioRenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDatoFormularioRentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDatoFormularioRenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=datoformulariorentaLogic.getDatoFormularioRentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=datoformulariorentas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDatoFormularioRenta.setModel(new DatoFormularioRentaModel(this.datoformulariorentaLogic.getDatoFormularioRentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDatoFormularioRenta.setModel(new DatoFormularioRentaModel(this.datoformulariorentas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDatoFormularioRenta!=null && this.jInternalFrameOrderByDatoFormularioRenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDatoFormularioRenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO,datoformulariorentaConstantesFunciones.resaltarSeleccionarDatoFormularioRenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO,datoformulariorentaConstantesFunciones.resaltarSeleccionarDatoFormularioRenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,DatoFormularioRentaConstantesFunciones.LABEL_ID));

		if(this.datoformulariorentaConstantesFunciones.mostraridDatoFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioRentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.datoformulariorentaConstantesFunciones.resaltaridDatoFormularioRenta,this.datoformulariorentaConstantesFunciones.activaridDatoFormularioRenta,this,true,"idDatoFormularioRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoformulariorentaConstantesFunciones.resaltaridDatoFormularioRenta,this.datoformulariorentaConstantesFunciones.activaridDatoFormularioRenta,this,true,"idDatoFormularioRenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,DatoFormularioRentaConstantesFunciones.LABEL_IDANIO));

		if(this.datoformulariorentaConstantesFunciones.mostrarid_anioDatoFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioRentaConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.datoformulariorentaConstantesFunciones.resaltarid_anioDatoFormularioRenta,this,this.datoformulariorentaConstantesFunciones.activarid_anioDatoFormularioRenta));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.datoformulariorentaConstantesFunciones.resaltarid_anioDatoFormularioRenta,this,this.datoformulariorentaConstantesFunciones.activarid_anioDatoFormularioRenta,true,"id_anioDatoFormularioRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,DatoFormularioRentaConstantesFunciones.LABEL_IDMES));

		if(this.datoformulariorentaConstantesFunciones.mostrarid_mesDatoFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioRentaConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.datoformulariorentaConstantesFunciones.resaltarid_mesDatoFormularioRenta,this,this.datoformulariorentaConstantesFunciones.activarid_mesDatoFormularioRenta));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.datoformulariorentaConstantesFunciones.resaltarid_mesDatoFormularioRenta,this,this.datoformulariorentaConstantesFunciones.activarid_mesDatoFormularioRenta,true,"id_mesDatoFormularioRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA));

		if(this.datoformulariorentaConstantesFunciones.mostrares_sustitutivaDatoFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.datoformulariorentaConstantesFunciones.resaltares_sustitutivaDatoFormularioRenta,this.datoformulariorentaConstantesFunciones.activares_sustitutivaDatoFormularioRenta));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.datoformulariorentaConstantesFunciones.resaltares_sustitutivaDatoFormularioRenta,this.datoformulariorentaConstantesFunciones.activares_sustitutivaDatoFormularioRenta,this,true,"es_sustitutivaDatoFormularioRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO));

		if(this.datoformulariorentaConstantesFunciones.mostrarnumero_formularioDatoFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datoformulariorentaConstantesFunciones.resaltarnumero_formularioDatoFormularioRenta,this.datoformulariorentaConstantesFunciones.activarnumero_formularioDatoFormularioRenta,this,true,"numero_formularioDatoFormularioRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoformulariorentaConstantesFunciones.resaltarnumero_formularioDatoFormularioRenta,this.datoformulariorentaConstantesFunciones.activarnumero_formularioDatoFormularioRenta,this,true,"numero_formularioDatoFormularioRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE));

		if(this.datoformulariorentaConstantesFunciones.mostrarcedula_representanteDatoFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datoformulariorentaConstantesFunciones.resaltarcedula_representanteDatoFormularioRenta,this.datoformulariorentaConstantesFunciones.activarcedula_representanteDatoFormularioRenta,this,true,"cedula_representanteDatoFormularioRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoformulariorentaConstantesFunciones.resaltarcedula_representanteDatoFormularioRenta,this.datoformulariorentaConstantesFunciones.activarcedula_representanteDatoFormularioRenta,this,true,"cedula_representanteDatoFormularioRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL));

		if(this.datoformulariorentaConstantesFunciones.mostrarnumero_fiscalDatoFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datoformulariorentaConstantesFunciones.resaltarnumero_fiscalDatoFormularioRenta,this.datoformulariorentaConstantesFunciones.activarnumero_fiscalDatoFormularioRenta,this,true,"numero_fiscalDatoFormularioRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoformulariorentaConstantesFunciones.resaltarnumero_fiscalDatoFormularioRenta,this.datoformulariorentaConstantesFunciones.activarnumero_fiscalDatoFormularioRenta,this,true,"numero_fiscalDatoFormularioRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoFormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormularioRenta && this.datoformulariorentaConstantesFunciones.mostrarFormularioRentaDatoFormularioRenta && !DatoFormularioRentaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formulario Rentas");
				tableColumn.setHeaderValue("Formulario Rentas");
				tableColumn.setCellRenderer(new FormularioRentaTableCell(datoformulariorentaConstantesFunciones.resaltarFormularioRentaDatoFormularioRenta,this,this.datoformulariorentaConstantesFunciones.activarFormularioRentaDatoFormularioRenta));
				tableColumn.setCellEditor(new FormularioRentaTableCell(datoformulariorentaConstantesFunciones.resaltarFormularioRentaDatoFormularioRenta,this,this.datoformulariorentaConstantesFunciones.activarFormularioRentaDatoFormularioRenta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosDatoFormularioRenta.addColumn(tableColumn);
			}

			if(this.isTienePermisosFormularioRentaExtra && this.datoformulariorentaConstantesFunciones.mostrarFormularioRentaExtraDatoFormularioRenta && !DatoFormularioRentaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formulario Renta Extras");
				tableColumn.setHeaderValue("Formulario Renta Extras");
				tableColumn.setCellRenderer(new FormularioRentaExtraTableCell(datoformulariorentaConstantesFunciones.resaltarFormularioRentaExtraDatoFormularioRenta,this,this.datoformulariorentaConstantesFunciones.activarFormularioRentaExtraDatoFormularioRenta));
				tableColumn.setCellEditor(new FormularioRentaExtraTableCell(datoformulariorentaConstantesFunciones.resaltarFormularioRentaExtraDatoFormularioRenta,this,this.datoformulariorentaConstantesFunciones.activarFormularioRentaExtraDatoFormularioRenta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosDatoFormularioRenta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.datoformulariorentaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.datoformulariorentaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDatoFormularioRenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.datoformulariorentaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.datoformulariorentaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDatoFormularioRenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.datoformulariorentaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.datoformulariorentaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDatoFormularioRenta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosDatoFormularioRenta.addColumn(tableColumn);
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
			
			this.jTableDatosDatoFormularioRenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDatoFormularioRenta.moveColumn(this.jTableDatosDatoFormularioRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDatoFormularioRenta.moveColumn(this.jTableDatosDatoFormularioRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosDatoFormularioRenta.moveColumn(this.jTableDatosDatoFormularioRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDatoFormularioRenta.moveColumn(this.jTableDatosDatoFormularioRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDatoFormularioRenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDatoFormularioRenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDatoFormularioRenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDatoFormularioRenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDatoFormularioRenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDatoFormularioRenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDatoFormularioRenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=datoformulariorentaLogic.getDatoFormularioRentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=datoformulariorentas.size()-1;
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
		//this.jTableDatosDatoFormularioRenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDatoFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDatoFormularioRenta();
			
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
				
				//this.isEsNuevoDatoFormularioRenta=false;
					
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
				if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDatoFormularioRenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDatoFormularioRenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.datoformulariorenta.getsType().equals("DUPLICADO")
				   || this.datoformulariorenta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDatoFormularioRenta=true;
				
				} else {
					this.isEsNuevoDatoFormularioRenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
					if(this.datoformulariorenta.getId()>=0 && !this.datoformulariorenta.getIsNew()) {						
						this.isEsNuevoDatoFormularioRenta=false;
						
					} else {
						this.isEsNuevoDatoFormularioRenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDatoFormularioRenta(esRelaciones);						
				
				this.seleccionarDatoFormularioRenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.datoformulariorenta.getId()<0) {
					this.isEsNuevoDatoFormularioRenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDatoFormularioRenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDatoFormularioRenta(evt,rowIndex);
				}	
				
				if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DatoFormularioRenta: " + this.dDif); 
					}
				}								
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDatoFormularioRenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.datoformulariorenta)) {
					if(this.datoformulariorenta.getId()>0) {
						this.datoformulariorenta.setIsDeleted(true);
						
						this.datoformulariorentasEliminados.add(this.datoformulariorenta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.datoformulariorentaLogic.getDatoFormularioRentas().remove(this.datoformulariorenta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.datoformulariorentas.remove(this.datoformulariorenta);				
					}
					
					
					((DatoFormularioRentaModel) this.jTableDatosDatoFormularioRenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoFormularioRenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDatoFormularioRenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDatoFormularioRenta) {
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDatoFormularioRenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDatoFormularioRenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDatoFormularioRenta(this.datoformulariorenta);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.datoformulariorentaConstantesFunciones.cargarid_anioDatoFormularioRenta || this.datoformulariorentaConstantesFunciones.event_dependid_anioDatoFormularioRenta) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.datoformulariorenta.getid_anio());
									//this.inicializarActualizarBindingDatoFormularioRenta(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(datoformulariorenta.getAnio()!=null) {
							this.aniosForeignKey.add(datoformulariorenta.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.datoformulariorenta.getid_anio(),false,"Formulario");

					//Mes
					if(!this.datoformulariorentaConstantesFunciones.cargarid_mesDatoFormularioRenta || this.datoformulariorentaConstantesFunciones.event_dependid_mesDatoFormularioRenta) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.datoformulariorenta.getid_mes());
									//this.inicializarActualizarBindingDatoFormularioRenta(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(datoformulariorenta.getMes()!=null) {
							this.messForeignKey.add(datoformulariorenta.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.datoformulariorenta.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDatoFormularioRenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDatoFormularioRenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoFormularioRenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDatoFormularioRenta(DatoFormularioRenta datoformulariorenta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDatoFormularioRenta(datoformulariorenta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDatoFormularioRenta(datoformulariorenta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDatoFormularioRenta(datoformulariorenta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDatoFormularioRenta(datoformulariorenta);
	}
	
	public void setVariablesObjetoActualToFormularioDatoFormularioRenta(DatoFormularioRenta datoformulariorenta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.setText(datoformulariorenta.getId().toString());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxes_sustitutivaDatoFormularioRenta.setSelected(datoformulariorenta.getes_sustitutiva());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_formularioDatoFormularioRenta.setText(datoformulariorenta.getnumero_formulario());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldcedula_representanteDatoFormularioRenta.setText(datoformulariorenta.getcedula_representante());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_fiscalDatoFormularioRenta.setText(datoformulariorenta.getnumero_fiscal());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DatoFormularioRenta datoformulariorentaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,datoformulariorentaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DatoFormularioRenta datoformulariorentaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				datoformulariorentaLocal=this.datoformulariorenta;
			} else {
				datoformulariorentaLocal=this.datoformulariorentaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(datoformulariorentaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDatoFormularioRenta(datoformulariorentaLocal,true);
					
					if(datoformulariorentaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(datoformulariorentaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(datoformulariorentaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDatoFormularioRenta(datoformulariorenta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(datoformulariorenta);
	}
	
	public void setVariablesFormularioToObjetoActualDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDatoFormularioRenta(datoformulariorenta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.getText()==null || this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.getText()=="" || this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.getText()=="Id") {
				this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.setText("0");
			}

			if(conColumnasBase) {datoformulariorenta.setId(Long.parseLong(this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoFormularioRentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelIdDatoFormularioRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoformulariorenta.setes_sustitutiva(this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxes_sustitutivaDatoFormularioRenta.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabeles_sustitutivaDatoFormularioRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoformulariorenta.setnumero_formulario(this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_formularioDatoFormularioRenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelnumero_formularioDatoFormularioRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoformulariorenta.setcedula_representante(this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldcedula_representanteDatoFormularioRenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelcedula_representanteDatoFormularioRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoformulariorenta.setnumero_fiscal(this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_fiscalDatoFormularioRenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelnumero_fiscalDatoFormularioRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDatoFormularioRenta(DatoFormularioRenta datoformulariorentaBean,DatoFormularioRenta datoformulariorenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDatoFormularioRenta(DatoFormularioRenta datoformulariorentaOrigen,DatoFormularioRenta datoformulariorenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datoformulariorentaOrigen.getId()!=null && !datoformulariorentaOrigen.getId().equals(0L))) {datoformulariorenta.setId(datoformulariorentaOrigen.getId());}}
			if(conDefault || (!conDefault && datoformulariorentaOrigen.getes_sustitutiva()!=null && !datoformulariorentaOrigen.getes_sustitutiva().equals(false))) {datoformulariorenta.setes_sustitutiva(datoformulariorentaOrigen.getes_sustitutiva());}
			if(conDefault || (!conDefault && datoformulariorentaOrigen.getnumero_formulario()!=null && !datoformulariorentaOrigen.getnumero_formulario().equals(""))) {datoformulariorenta.setnumero_formulario(datoformulariorentaOrigen.getnumero_formulario());}
			if(conDefault || (!conDefault && datoformulariorentaOrigen.getcedula_representante()!=null && !datoformulariorentaOrigen.getcedula_representante().equals(""))) {datoformulariorenta.setcedula_representante(datoformulariorentaOrigen.getcedula_representante());}
			if(conDefault || (!conDefault && datoformulariorentaOrigen.getnumero_fiscal()!=null && !datoformulariorentaOrigen.getnumero_fiscal().equals(""))) {datoformulariorenta.setnumero_fiscal(datoformulariorentaOrigen.getnumero_fiscal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDatoFormularioRenta(DatoFormularioRenta datoformulariorenta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.setText(datoformulariorenta.getId().toString());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxes_sustitutivaDatoFormularioRenta.setSelected(datoformulariorenta.getes_sustitutiva());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_formularioDatoFormularioRenta.setText(datoformulariorenta.getnumero_formulario());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldcedula_representanteDatoFormularioRenta.setText(datoformulariorenta.getcedula_representante());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_fiscalDatoFormularioRenta.setText(datoformulariorenta.getnumero_fiscal());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDatoFormularioRenta(DatoFormularioRentaBean datoformulariorentaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.setText(datoformulariorentaBean.getId().toString());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxes_sustitutivaDatoFormularioRenta.setSelected(datoformulariorentaBean.getes_sustitutiva());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_formularioDatoFormularioRenta.setText(datoformulariorentaBean.getnumero_formulario());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldcedula_representanteDatoFormularioRenta.setText(datoformulariorentaBean.getcedula_representante());
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_fiscalDatoFormularioRenta.setText(datoformulariorentaBean.getnumero_fiscal());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDatoFormularioRenta(DatoFormularioRentaParameterReturnGeneral datoformulariorentaReturnGeneral,DatoFormularioRentaBean datoformulariorentaBean,Boolean conDefault) throws Exception { 
		try {
			DatoFormularioRenta datoformulariorentaLocal=new DatoFormularioRenta();
			
			datoformulariorentaLocal=datoformulariorentaReturnGeneral.getDatoFormularioRenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datoformulariorentaLocal.getId()!=null && !datoformulariorentaLocal.getId().equals(0L))) {datoformulariorentaBean.setId(datoformulariorentaLocal.getId());}}
			if(conDefault || (!conDefault && datoformulariorentaLocal.getes_sustitutiva()!=null && !datoformulariorentaLocal.getes_sustitutiva().equals(false))) {datoformulariorentaBean.setes_sustitutiva(datoformulariorentaLocal.getes_sustitutiva());}
			if(conDefault || (!conDefault && datoformulariorentaLocal.getnumero_formulario()!=null && !datoformulariorentaLocal.getnumero_formulario().equals(""))) {datoformulariorentaBean.setnumero_formulario(datoformulariorentaLocal.getnumero_formulario());}
			if(conDefault || (!conDefault && datoformulariorentaLocal.getcedula_representante()!=null && !datoformulariorentaLocal.getcedula_representante().equals(""))) {datoformulariorentaBean.setcedula_representante(datoformulariorentaLocal.getcedula_representante());}
			if(conDefault || (!conDefault && datoformulariorentaLocal.getnumero_fiscal()!=null && !datoformulariorentaLocal.getnumero_fiscal().equals(""))) {datoformulariorentaBean.setnumero_fiscal(datoformulariorentaLocal.getnumero_fiscal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDatoFormularioRentaGenerico(Long idDatoFormularioRentaSeleccionado,JComboBox jComboBoxDatoFormularioRenta,List<DatoFormularioRenta> datoformulariorentasLocal)throws Exception {
		try {
			DatoFormularioRenta  datoformulariorentaTemp=null;

			for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentasLocal) {
				if(datoformulariorentaAux.getId()!=null && datoformulariorentaAux.getId().equals(idDatoFormularioRentaSeleccionado)) {
					datoformulariorentaTemp=datoformulariorentaAux;
					break;
				}
			}

			jComboBoxDatoFormularioRenta.setSelectedItem(datoformulariorentaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDatoFormularioRentaGenerico(JComboBox jComboBoxDatoFormularioRenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDatoFormularioRenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDatoFormularioRenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDatoFormularioRenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDatoFormularioRenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FormularioRenta")) {
			jButtonFormularioRentaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FormularioRentaExtra")) {
			jButtonFormularioRentaExtraActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datoformulariorenta=(DatoFormularioRenta) datoformulariorentaLogic.getDatoFormularioRentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			datoformulariorenta =(DatoFormularioRenta) datoformulariorentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!datoformulariorenta.getIsNew() && !datoformulariorenta.getIsChanged() && !datoformulariorenta.getIsDeleted()) {
				sDescripcion=datoformulariorenta.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=datoformulariorenta.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!datoformulariorenta.getIsNew() && !datoformulariorenta.getIsChanged() && !datoformulariorenta.getIsDeleted()) {
				sDescripcion=datoformulariorenta.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=datoformulariorenta.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DatoFormularioRenta datoformulariorentaRow=new DatoFormularioRenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datoformulariorentaRow=(DatoFormularioRenta) datoformulariorentaLogic.getDatoFormularioRentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			datoformulariorentaRow=(DatoFormularioRenta) datoformulariorentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormularioRentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,DatoFormularioRenta datoformulariorenta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorenta = (DatoFormularioRenta)this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.datoformulariorenta = (DatoFormularioRenta)this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(datoformulariorenta!=null) {
						this.datoformulariorenta = datoformulariorenta;
					} else {
						this.datoformulariorenta = new DatoFormularioRenta();
					}
				}

				if(this.isTienePermisosFormularioRenta && this.permiteMantenimiento(this.datoformulariorenta)) {
					FormularioRentaBeanSwingJInternalFrame formulariorentaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFramePopup=new FormularioRentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formulariorentaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFramePopup;
					} else {
						formulariorentaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame;
					}

					List<DatoFormularioRenta> datoformulariorentas=new ArrayList<DatoFormularioRenta>();
					datoformulariorentas.add(this.datoformulariorenta);
					if(!esRelacionado) {
						//formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.setConGuardarRelaciones(false);
						//formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formulariorentaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormDatoFormularioRenta.cargarFormularioRentaBeanSwingJInternalFrame(datoformulariorentas,this.datoformulariorenta,formulariorentaBeanSwingJInternalFrame,/*conInicializar,*/formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.getConGuardarRelaciones(),formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.getEsGuardarRelacionado());
					formulariorentaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formulariorentaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioRenta("no_relacionado");

						formulariorentaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormularioRentaConstantesFunciones.ITAMANIOFILATABLA + (FormularioRentaConstantesFunciones.ITAMANIOFILATABLA/2));

						formulariorentaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderDatoFormularioRenta=(TitledBorder)this.jScrollPanelDatosDatoFormularioRenta.getBorder();
						TitledBorder titledBorderFormularioRenta=(TitledBorder)formulariorentaBeanSwingJInternalFrame.jScrollPanelDatosFormularioRenta.getBorder();

						titledBorderFormularioRenta.setTitle(titledBorderDatoFormularioRenta.getTitle() + " -> Formulario Renta");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formulariorentaBeanSwingJInternalFrame);
						}

						formulariorentaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formulariorentaBeanSwingJInternalFrame);

						formulariorentaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formulario Renta",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFormularioRentaExtraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,DatoFormularioRenta datoformulariorenta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorenta = (DatoFormularioRenta)this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.datoformulariorenta = (DatoFormularioRenta)this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(datoformulariorenta!=null) {
						this.datoformulariorenta = datoformulariorenta;
					} else {
						this.datoformulariorenta = new DatoFormularioRenta();
					}
				}

				if(this.isTienePermisosFormularioRentaExtra && this.permiteMantenimiento(this.datoformulariorenta)) {
					FormularioRentaExtraBeanSwingJInternalFrame formulariorentaextraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFramePopup=new FormularioRentaExtraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formulariorentaextraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFramePopup;
					} else {
						formulariorentaextraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame;
					}

					List<DatoFormularioRenta> datoformulariorentas=new ArrayList<DatoFormularioRenta>();
					datoformulariorentas.add(this.datoformulariorenta);
					if(!esRelacionado) {
						//formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.setConGuardarRelaciones(false);
						//formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formulariorentaextraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormDatoFormularioRenta.cargarFormularioRentaExtraBeanSwingJInternalFrame(datoformulariorentas,this.datoformulariorenta,formulariorentaextraBeanSwingJInternalFrame,/*conInicializar,*/formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.getConGuardarRelaciones(),formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.getEsGuardarRelacionado());
					formulariorentaextraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formulariorentaextraBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioRentaExtra("no_relacionado");

						formulariorentaextraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormularioRentaExtraConstantesFunciones.ITAMANIOFILATABLA + (FormularioRentaExtraConstantesFunciones.ITAMANIOFILATABLA/2));

						formulariorentaextraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderDatoFormularioRenta=(TitledBorder)this.jScrollPanelDatosDatoFormularioRenta.getBorder();
						TitledBorder titledBorderFormularioRentaExtra=(TitledBorder)formulariorentaextraBeanSwingJInternalFrame.jScrollPanelDatosFormularioRentaExtra.getBorder();

						titledBorderFormularioRentaExtra.setTitle(titledBorderDatoFormularioRenta.getTitle() + " -> Formulario Renta Extra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formulariorentaextraBeanSwingJInternalFrame);
						}

						formulariorentaextraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formulariorentaextraBeanSwingJInternalFrame);

						formulariorentaextraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formulario Renta Extra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDatoFormularioRenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDatoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioRenta && this.isPermisoNuevoDatoFormularioRenta));			
			this.jButtonDuplicarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaDuplicarDatoFormularioRenta && this.isPermisoDuplicarDatoFormularioRenta));			
			this.jButtonCopiarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaCopiarDatoFormularioRenta && this.isPermisoCopiarDatoFormularioRenta));
			this.jButtonVerFormDatoFormularioRenta.setVisible((this.isVisibilidadCeldaVerFormDatoFormularioRenta && this.isPermisoVerFormDatoFormularioRenta));
			
			this.jButtonAbrirOrderByDatoFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioRenta && this.isPermisoOrdenDatoFormularioRenta));			
			
			this.jButtonNuevoRelacionesDatoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta && this.isPermisoNuevoDatoFormularioRenta));			
			this.jButtonNuevoGuardarCambiosDatoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioRenta && this.isPermisoNuevoDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta));
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonModificarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaModificarDatoFormularioRenta && this.isPermisoActualizarDatoFormularioRenta));	
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonActualizarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaActualizarDatoFormularioRenta && this.isPermisoActualizarDatoFormularioRenta));	
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonEliminarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaEliminarDatoFormularioRenta && this.isPermisoEliminarDatoFormularioRenta));
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonCancelarDatoFormularioRenta.setVisible(this.isVisibilidadCeldaCancelarDatoFormularioRenta);							
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosDatoFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaDatoFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioRenta && this.isPermisoNuevoDatoFormularioRenta));						
			this.jButtonDuplicarToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaDuplicarDatoFormularioRenta && this.isPermisoDuplicarDatoFormularioRenta));						
			this.jButtonCopiarToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaCopiarDatoFormularioRenta && this.isPermisoCopiarDatoFormularioRenta));			
			this.jButtonVerFormToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaVerFormDatoFormularioRenta && this.isPermisoVerFormDatoFormularioRenta));			
			this.jButtonAbrirOrderByToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioRenta && this.isPermisoOrdenDatoFormularioRenta));
			this.jButtonNuevoRelacionesToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta && this.isPermisoNuevoDatoFormularioRenta));			
			this.jButtonNuevoGuardarCambiosToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioRenta && this.isPermisoNuevoDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta));			
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonModificarToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaModificarDatoFormularioRenta && this.isPermisoActualizarDatoFormularioRenta));	
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonActualizarToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaActualizarDatoFormularioRenta  && this.isPermisoActualizarDatoFormularioRenta));	
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonEliminarToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaEliminarDatoFormularioRenta && this.isPermisoEliminarDatoFormularioRenta));
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonCancelarToolBarDatoFormularioRenta.setVisible(this.isVisibilidadCeldaCancelarDatoFormularioRenta);				
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDatoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioRenta && this.isPermisoNuevoDatoFormularioRenta));			
			this.jMenuItemDuplicarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaDuplicarDatoFormularioRenta && this.isPermisoDuplicarDatoFormularioRenta));			
			this.jMenuItemCopiarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaCopiarDatoFormularioRenta && this.isPermisoCopiarDatoFormularioRenta));			
			this.jMenuItemVerFormDatoFormularioRenta.setVisible((this.isVisibilidadCeldaVerFormDatoFormularioRenta && this.isPermisoVerFormDatoFormularioRenta));			
			this.jMenuItemAbrirOrderByDatoFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioRenta && this.isPermisoOrdenDatoFormularioRenta));			
			//this.jMenuItemMostrarOcultarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioRenta && this.isPermisoOrdenDatoFormularioRenta));
			this.jMenuItemDetalleAbrirOrderByDatoFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioRenta && this.isPermisoOrdenDatoFormularioRenta));			
			//this.jMenuItemDetalleMostrarOcultarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenDatoFormularioRenta && this.isPermisoOrdenDatoFormularioRenta));			
			this.jMenuItemNuevoRelacionesDatoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta && this.isPermisoNuevoDatoFormularioRenta));			
			this.jMenuItemNuevoGuardarCambiosDatoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoDatoFormularioRenta && this.isPermisoNuevoDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta));									
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemModificarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaModificarDatoFormularioRenta && this.isPermisoActualizarDatoFormularioRenta));	
			this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemActualizarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaActualizarDatoFormularioRenta && this.isPermisoActualizarDatoFormularioRenta));	
			this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemEliminarDatoFormularioRenta.setVisible((this.isVisibilidadCeldaEliminarDatoFormularioRenta && this.isPermisoEliminarDatoFormularioRenta));
			this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemCancelarDatoFormularioRenta.setVisible(this.isVisibilidadCeldaCancelarDatoFormularioRenta);				
			}
			
			this.jMenuItemGuardarCambiosDatoFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta));						
			this.jMenuItemGuardarCambiosTablaDatoFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=this.jButtonNuevoDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaDuplicarDatoFormularioRenta=this.jButtonDuplicarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaCopiarDatoFormularioRenta=this.jButtonCopiarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaVerFormDatoFormularioRenta=this.jButtonVerFormDatoFormularioRenta.isVisible();
			
			this.isVisibilidadCeldaOrdenDatoFormularioRenta=this.jButtonAbrirOrderByDatoFormularioRenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=this.jButtonNuevoRelacionesDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaModificarDatoFormularioRenta=this.jButtonModificarDatoFormularioRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonActualizarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonEliminarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonCancelarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaGuardarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosDatoFormularioRenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=this.jButtonGuardarCambiosTablaDatoFormularioRenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=this.jButtonNuevoToolBarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=this.jButtonNuevoRelacionesToolBarDatoFormularioRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			this.isVisibilidadCeldaModificarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonModificarToolBarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonActualizarToolBarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonEliminarToolBarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonCancelarToolBarDatoFormularioRenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDatoFormularioRenta=this.jButtonGuardarCambiosToolBarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=this.jButtonGuardarCambiosTablaToolBarDatoFormularioRenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=this.jMenuItemNuevoDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=this.jMenuItemNuevoRelacionesDatoFormularioRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			this.isVisibilidadCeldaModificarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemModificarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemActualizarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemEliminarDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemCancelarDatoFormularioRenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDatoFormularioRenta=this.jMenuItemGuardarCambiosDatoFormularioRenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=this.jMenuItemGuardarCambiosTablaDatoFormularioRenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDatoFormularioRenta(Boolean esInicializar) {
		if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
				//if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDatoFormularioRenta();
			}
			
			this.inicializarActualizarBindingBotonesManualDatoFormularioRenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDatoFormularioRenta() {
		this.jButtonNuevoDatoFormularioRenta.setVisible(this.isPermisoNuevoDatoFormularioRenta);			
		this.jButtonDuplicarDatoFormularioRenta.setVisible(this.isPermisoDuplicarDatoFormularioRenta);			
		this.jButtonCopiarDatoFormularioRenta.setVisible(this.isPermisoCopiarDatoFormularioRenta);			
		this.jButtonVerFormDatoFormularioRenta.setVisible(this.isPermisoVerFormDatoFormularioRenta);			
		
		this.jButtonAbrirOrderByDatoFormularioRenta.setVisible(this.isPermisoOrdenDatoFormularioRenta);					
		
		this.jButtonNuevoRelacionesDatoFormularioRenta.setVisible(this.isPermisoNuevoDatoFormularioRenta);			
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonModificarDatoFormularioRenta.setVisible(this.isPermisoActualizarDatoFormularioRenta);	
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonActualizarDatoFormularioRenta.setVisible(this.isPermisoActualizarDatoFormularioRenta);	
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonEliminarDatoFormularioRenta.setVisible(this.isPermisoEliminarDatoFormularioRenta);
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonCancelarDatoFormularioRenta.setVisible(this.isVisibilidadCeldaCancelarDatoFormularioRenta);						
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosDatoFormularioRenta.setVisible(this.isPermisoGuardarCambiosDatoFormularioRenta);							
		}
		
		this.jButtonGuardarCambiosTablaDatoFormularioRenta.setVisible(this.isPermisoActualizarDatoFormularioRenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDatoFormularioRenta() {
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonModificarDatoFormularioRenta.setVisible(this.isPermisoActualizarDatoFormularioRenta);	
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonActualizarDatoFormularioRenta.setVisible(this.isPermisoActualizarDatoFormularioRenta);	
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonEliminarDatoFormularioRenta.setVisible(this.isPermisoEliminarDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonCancelarDatoFormularioRenta.setVisible(this.isVisibilidadCeldaCancelarDatoFormularioRenta);							
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosDatoFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarDatoFormularioRenta && this.isPermisoGuardarCambiosDatoFormularioRenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDatoFormularioRenta() {
		if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDatoFormularioRenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDatoFormularioRenta() {
	}
	
	public void jTableDatosDatoFormularioRentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDatoFormularioRenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDatoFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.getdatoformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformulariorenta==null) {
						this.datoformulariorenta = new DatoFormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
				}

				if(this.datoformulariorenta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.datoformulariorenta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioDatoFormularioRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebDatoFormularioRenta(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoFormularioRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoFormularioRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.getdatoformulariorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.datoformulariorentaLogic.getConnexion());

				if(this.datoformulariorenta.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.datoformulariorenta.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoFormularioRenta=(TitledBorder)this.jScrollPanelDatosDatoFormularioRenta.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderDatoFormularioRenta.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioDatoFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.getdatoformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformulariorenta==null) {
						this.datoformulariorenta = new DatoFormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
				}

				if(this.datoformulariorenta.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.datoformulariorenta.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesDatoFormularioRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebDatoFormularioRenta(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoFormularioRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoFormularioRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.getdatoformulariorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.datoformulariorentaLogic.getConnexion());

				if(this.datoformulariorenta.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.datoformulariorenta.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoFormularioRenta=(TitledBorder)this.jScrollPanelDatosDatoFormularioRenta.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderDatoFormularioRenta.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesDatoFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.getdatoformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformulariorenta==null) {
						this.datoformulariorenta = new DatoFormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
				}

				if(this.datoformulariorenta.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.datoformulariorenta.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_sustitutivaDatoFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.getdatoformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformulariorenta==null) {
						this.datoformulariorenta = new DatoFormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
				}

				if(this.datoformulariorenta.getes_sustitutiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_sustitutiva = "+this.datoformulariorenta.getes_sustitutiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_formularioDatoFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.getdatoformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformulariorenta==null) {
						this.datoformulariorenta = new DatoFormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
				}

				if(this.datoformulariorenta.getnumero_formulario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_formulario like '%"+this.datoformulariorenta.getnumero_formulario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncedula_representanteDatoFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.getdatoformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformulariorenta==null) {
						this.datoformulariorenta = new DatoFormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
				}

				if(this.datoformulariorenta.getcedula_representante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cedula_representante like '%"+this.datoformulariorenta.getcedula_representante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_fiscalDatoFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.getdatoformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoformulariorenta==null) {
						this.datoformulariorenta = new DatoFormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);
				}

				if(this.datoformulariorenta.getnumero_fiscal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_fiscal like '%"+this.datoformulariorenta.getnumero_fiscal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoFormularioRenta(false,false);

			this.getDatoFormularioRentasFK_IdAnio();

			this.inicializarActualizarBindingDatoFormularioRenta(false);

			//if(DatoFormularioRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoFormularioRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesDatoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoFormularioRenta(false,false);

			this.getDatoFormularioRentasFK_IdMes();

			this.inicializarActualizarBindingDatoFormularioRenta(false);

			//if(DatoFormularioRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoFormularioRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoformulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDatoFormularioRenta() {
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
		

		if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormDatoFormularioRenta.dispose();
			this.jInternalFrameDetalleFormDatoFormularioRenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDatoFormularioRenta!=null) {
			this.jInternalFrameReporteDinamicoDatoFormularioRenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDatoFormularioRenta.dispose();
			this.jInternalFrameReporteDinamicoDatoFormularioRenta=null;
		}
		
		if(this.jInternalFrameImportacionDatoFormularioRenta!=null) {
			this.jInternalFrameImportacionDatoFormularioRenta.setVisible(false);	    			
			this.jInternalFrameImportacionDatoFormularioRenta.dispose();
			this.jInternalFrameImportacionDatoFormularioRenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDatoFormularioRenta();
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
			
			if(sTipo.equals("NuevoDatoFormularioRenta")) {
				jButtonNuevoDatoFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDatoFormularioRenta")) {
				jButtonDuplicarDatoFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDatoFormularioRenta")) {
				jButtonCopiarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormDatoFormularioRenta")) {
				jButtonVerFormDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDatoFormularioRenta")) {
				jButtonNuevoDatoFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDatoFormularioRenta")) {
				jButtonDuplicarDatoFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDatoFormularioRenta")) {
				jButtonNuevoDatoFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDatoFormularioRenta")) {
				jButtonDuplicarDatoFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDatoFormularioRenta")) {
				jButtonNuevoDatoFormularioRentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDatoFormularioRenta")) {
				jButtonNuevoDatoFormularioRentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDatoFormularioRenta")) {
				jButtonNuevoDatoFormularioRentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDatoFormularioRenta")) {
				jButtonModificarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDatoFormularioRenta")) {
				jButtonModificarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDatoFormularioRenta")) {
				jButtonModificarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDatoFormularioRenta")) {
				jButtonActualizarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDatoFormularioRenta")) {
				jButtonActualizarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDatoFormularioRenta")) {
				jButtonActualizarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarDatoFormularioRenta")) {
				jButtonEliminarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDatoFormularioRenta")) {
				jButtonEliminarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDatoFormularioRenta")) {
				jButtonEliminarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarDatoFormularioRenta")) {
				jButtonCancelarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDatoFormularioRenta")) {
				jButtonCancelarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDatoFormularioRenta")) {
				jButtonCancelarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarDatoFormularioRenta")) {
				jButtonCerrarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDatoFormularioRenta")) {
				jButtonCerrarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDatoFormularioRenta")) {
				jButtonCerrarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDatoFormularioRenta")) {
				jButtonMostrarOcultarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDatoFormularioRenta")) {
				jButtonCancelarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDatoFormularioRenta")) {
				jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDatoFormularioRenta")) {
				jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDatoFormularioRenta")) {
				jButtonCopiarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDatoFormularioRenta")) {
				jButtonVerFormDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDatoFormularioRenta")) {
				jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDatoFormularioRenta")) {
				jButtonCopiarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDatoFormularioRenta")) {
				jButtonVerFormDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDatoFormularioRenta")) {
				jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDatoFormularioRenta")) {
				jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDatoFormularioRenta")) {
				jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDatoFormularioRenta")) {
				jButtonRecargarInformacionDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDatoFormularioRenta")) {
				jButtonRecargarInformacionDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDatoFormularioRenta")) {
				jButtonRecargarInformacionDatoFormularioRentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDatoFormularioRenta")) {
				jButtonAnterioresDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDatoFormularioRenta")) {
				jButtonAnterioresDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDatoFormularioRenta")) {
				jButtonAnterioresDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDatoFormularioRenta")) {
				jButtonSiguientesDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDatoFormularioRenta")) {
				jButtonSiguientesDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDatoFormularioRenta")) {
				jButtonSiguientesDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDatoFormularioRenta") || sTipo.equals("MenuItemDetalleAbrirOrderByDatoFormularioRenta")) {
				jButtonAbrirOrderByDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDatoFormularioRenta") || sTipo.equals("MenuItemDetalleMostrarOcultarDatoFormularioRenta")) {
				jButtonMostrarOcultarDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDatoFormularioRenta")) {
				jButtonNuevoGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDatoFormularioRenta")) {
				jButtonNuevoGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDatoFormularioRenta")) {
				jButtonNuevoGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDatoFormularioRenta")) {
				jButtonCerrarReporteDinamicoDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDatoFormularioRenta")) {
				jButtonGenerarReporteDinamicoDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDatoFormularioRenta")) {
				
				jButtonGenerarExcelReporteDinamicoDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDatoFormularioRenta")) {
				jButtonCerrarImportacionDatoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDatoFormularioRenta")) {
				
				jButtonGenerarImportacionDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDatoFormularioRenta")) {
				
				jButtonAbrirImportacionDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDatoFormularioRenta")) {
				jComboBoxTiposAccionesDatoFormularioRentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDatoFormularioRenta")) {
				jComboBoxTiposRelacionesDatoFormularioRentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDatoFormularioRenta")) {
				jComboBoxTiposAccionesDatoFormularioRentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDatoFormularioRenta")) {
				
				jComboBoxTiposSeleccionarDatoFormularioRentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDatoFormularioRenta")) {
				jTextFieldValorCampoGeneralDatoFormularioRentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDatoFormularioRenta")) {
				jButtonAbrirOrderByDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDatoFormularioRenta")) {
				jButtonAbrirOrderByDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDatoFormularioRenta")) {
				jButtonCerrarOrderByDatoFormularioRentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDatoFormularioRentaBusqueda")) {
				this.jButtonidDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDatoFormularioRentaUpdate")) {
				this.jButtonid_anioDatoFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDatoFormularioRentaBusqueda")) {
				this.jButtonid_anioDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDatoFormularioRentaUpdate")) {
				this.jButtonid_mesDatoFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDatoFormularioRentaBusqueda")) {
				this.jButtonid_mesDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_sustitutivaDatoFormularioRentaBusqueda")) {
				this.jButtones_sustitutivaDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_formularioDatoFormularioRentaBusqueda")) {
				this.jButtonnumero_formularioDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedula_representanteDatoFormularioRentaBusqueda")) {
				this.jButtoncedula_representanteDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_fiscalDatoFormularioRentaBusqueda")) {
				this.jButtonnumero_fiscalDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioDatoFormularioRenta")) {
				this.jButtonFK_IdAnioDatoFormularioRentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesDatoFormularioRenta")) {
				this.jButtonFK_IdMesDatoFormularioRentaActionPerformed(evt);
			}
			
			;
			
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDatoFormularioRenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioRentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				


				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DatoFormularioRenta datoformulariorentaLocal=null;
			
			if(!this.getEsControlTabla()) {
				datoformulariorentaLocal=this.datoformulariorenta;
			} else {
				datoformulariorentaLocal=this.datoformulariorentaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
							
				
				


				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
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
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
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
			
			


			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioRentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
								
						
				


				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
								
				
				


				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioRentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
							
				
				


				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioRentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
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
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
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
			
			


			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioRentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
								
				
				


				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioRentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioRentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDatoFormularioRenta")) {
					jCheckBoxSeleccionarTodosDatoFormularioRentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDatoFormularioRenta")) {
					jCheckBoxSeleccionadosDatoFormularioRentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDatoFormularioRenta")) {
					
				}
				
				


				
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
												
				
				


				
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioRentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioRentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
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
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
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
			
			


			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoFormularioRentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoformulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoformulariorenta);
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
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
				
				


				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoFormularioRenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoFormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoFormularioRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoformulariorentaAnterior =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDatoFormularioRenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDatoFormularioRentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDatoFormularioRenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.datoformulariorenta =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.datoformulariorenta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDatoFormularioRenta")) {
				
				}
				
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDatoFormularioRenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDatoFormularioRenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDatoFormularioRenta")) {
			
			}
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDatoFormularioRenta();
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
			if(sTipo.equals("NuevoDatoFormularioRenta")) {
				jButtonNuevoDatoFormularioRentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDatoFormularioRenta")) {
				jButtonDuplicarDatoFormularioRentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDatoFormularioRenta")) {
				jButtonCopiarDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDatoFormularioRenta")) {
				jButtonVerFormDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDatoFormularioRenta")) {
				jButtonNuevoDatoFormularioRentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDatoFormularioRenta")) {
				jButtonModificarDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDatoFormularioRenta")) {
				jButtonActualizarDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDatoFormularioRenta")) {
				jButtonEliminarDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDatoFormularioRenta")) {
				jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDatoFormularioRenta")) {
				jButtonCancelarDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDatoFormularioRenta")) {
				jButtonCerrarDatoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDatoFormularioRenta")) {
				jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDatoFormularioRenta")) {
				jButtonNuevoGuardarCambiosDatoFormularioRentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDatoFormularioRenta")) {
				jButtonAbrirOrderByDatoFormularioRentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDatoFormularioRenta")) {
				jButtonRecargarInformacionDatoFormularioRentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDatoFormularioRenta")) {
				jButtonAnterioresDatoFormularioRentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDatoFormularioRenta")) {
				jButtonSiguientesDatoFormularioRentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDatoFormularioRentaBusqueda")) {
				this.jButtonidDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDatoFormularioRentaUpdate")) {
				this.jButtonid_anioDatoFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDatoFormularioRentaBusqueda")) {
				this.jButtonid_anioDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDatoFormularioRentaUpdate")) {
				this.jButtonid_mesDatoFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDatoFormularioRentaBusqueda")) {
				this.jButtonid_mesDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_sustitutivaDatoFormularioRentaBusqueda")) {
				this.jButtones_sustitutivaDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_formularioDatoFormularioRentaBusqueda")) {
				this.jButtonnumero_formularioDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedula_representanteDatoFormularioRentaBusqueda")) {
				this.jButtoncedula_representanteDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_fiscalDatoFormularioRentaBusqueda")) {
				this.jButtonnumero_fiscalDatoFormularioRentaBusquedaActionPerformed(evt);
			}
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDatoFormularioRenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDatoFormularioRenta")) {
				closingInternalFrameDatoFormularioRenta();
				
			} else if(sTipo.equals("jButtonCancelarDatoFormularioRenta")) {
				JInternalFrameBase jInternalFrameDetalleFormDatoFormularioRenta = (JInternalFrameBase)evt.getSource();
	            	
	            DatoFormularioRentaBeanSwingJInternalFrame jInternalFrameParent=(DatoFormularioRentaBeanSwingJInternalFrame)jInternalFrameDetalleFormDatoFormularioRenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDatoFormularioRentaActionPerformed(null);
			}
			
			DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.datoformulariorenta,new Object(),this.datoformulariorentaParameterGeneral,this.datoformulariorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDatoFormularioRenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDatoFormularioRenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDatoFormularioRenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.datoformulariorenta)) {
			if(!esControlTabla) {
				if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);			
				}
				
				if(this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDatoFormularioRenta(this.datoformulariorenta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.datoformulariorentaReturnGeneral=datoformulariorentaLogic.procesarEventosDatoFormularioRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoformulariorentaLogic.getDatoFormularioRentas(),this.datoformulariorenta,this.datoformulariorentaParameterGeneral,this.isEsNuevoDatoFormularioRenta,classes);//this.datoformulariorentaLogic.getDatoFormularioRenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDatoFormularioRenta(this.datoformulariorentaReturnGeneral,this.datoformulariorentaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDatoFormularioRenta(classes,this.datoformulariorentaReturnGeneral,this.datoformulariorentaBean,false);
					}
						
					if(this.datoformulariorentaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDatoFormularioRenta(this.datoformulariorentaReturnGeneral.getDatoFormularioRenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDatoFormularioRenta(this.datoformulariorentaReturnGeneral.getDatoFormularioRenta());	
					}
						
					if(this.datoformulariorentaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDatoFormularioRenta(this.datoformulariorentaReturnGeneral.getDatoFormularioRenta(),classes);//this.datoformulariorentaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDatoFormularioRenta(this.datoformulariorenta,classes);//this.datoformulariorentaBean);									
				}
			
				if(DatoFormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDatoFormularioRenta(this.datoformulariorenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoFormularioRenta(this.datoformulariorenta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.datoformulariorentaAnterior!=null) {
						this.datoformulariorenta=this.datoformulariorentaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.datoformulariorentaReturnGeneral=datoformulariorentaLogic.procesarEventosDatoFormularioRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoformulariorentaLogic.getDatoFormularioRentas(),this.datoformulariorenta,this.datoformulariorentaParameterGeneral,this.isEsNuevoDatoFormularioRenta,classes);//this.datoformulariorentaLogic.getDatoFormularioRenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.datoformulariorentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.datoformulariorentaReturnGeneral.getDatoFormularioRenta(),datoformulariorentaLogic.getDatoFormularioRentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.datoformulariorentaReturnGeneral.getDatoFormularioRenta(),this.datoformulariorentas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDatoFormularioRenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosDatoFormularioRenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDatoFormularioRenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosDatoFormularioRenta() throws Exception {
		
		DatoFormularioRentaModel datoformulariorentaModel=(DatoFormularioRentaModel)this.jTableDatosDatoFormularioRenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datoformulariorentaModel.datoformulariorentas=this.datoformulariorentaLogic.getDatoFormularioRentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			datoformulariorentaModel.datoformulariorentas=this.datoformulariorentas;
		}
		
		
		((DatoFormularioRentaModel) this.jTableDatosDatoFormularioRenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDatoFormularioRenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdatoformulariorentaAnterior(),this.datoformulariorentaLogic.getDatoFormularioRentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdatoformulariorentaAnterior(),this.datoformulariorentas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDatoFormularioRenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioRenta.class)) {
					this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.setFormularioRentas(datoformulariorenta.getFormularioRentas());
					this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioRenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioRentaExtra.class)) {
					this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.setFormularioRentaExtras(datoformulariorenta.getFormularioRentaExtras());
					this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioRentaExtra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
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
										
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoformulariorenta,new Object(),generalEntityParameterGeneral,this.datoformulariorentaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DatoFormularioRentaConstantesFunciones.getClassesRelationshipsOfDatoFormularioRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DatoFormularioRentaConstantesFunciones.getClassesRelationshipsFromStringsOfDatoFormularioRenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDatoFormularioRenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DatoFormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoformulariorenta,new Object(),generalEntityParameterGeneral,this.datoformulariorentaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDatoFormularioRenta(DatoFormularioRentaBean datoformulariorentaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioRenta.class)) {
					this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.setFormularioRentas(datoformulariorenta.getFormularioRentas());
					this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioRenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioRentaExtra.class)) {
					this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.setFormularioRentaExtras(datoformulariorenta.getFormularioRentaExtras());
					this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioRentaExtra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDatoFormularioRenta(ArrayList<Classe> classes,DatoFormularioRentaReturnGeneral datoformulariorentaReturnGeneral,DatoFormularioRentaBean datoformulariorentaBean,Boolean conDefault) throws Exception {
		
			this.datoformulariorentaBean.setFormularioRentas(datoformulariorentaReturnGeneral.getDatoFormularioRenta().getFormularioRentas());
			this.datoformulariorentaBean.setFormularioRentaExtras(datoformulariorentaReturnGeneral.getDatoFormularioRenta().getFormularioRentaExtras());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioRenta.class)) {
					datoformulariorenta.setFormularioRentas(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaBeanSwingJInternalFrame.formulariorentaLogic.getFormularioRentas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioRentaExtra.class)) {
					datoformulariorenta.setFormularioRentaExtras(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraLogic.getFormularioRentaExtras());
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
		if(!paraTabla && !this.permiteMantenimiento(this.datoformulariorenta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDatoFormularioRenta = new DatoFormularioRentaDetalleFormJInternalFrame(jDesktopPane,this.datoformulariorentaSessionBean.getConGuardarRelaciones(),this.datoformulariorentaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.setVisible(false);
		this.jInternalFrameDetalleFormDatoFormularioRenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.datoformulariorentaLogic=this.datoformulariorentaLogic;
		
		this.cargarCombosFrameForeignKeyDatoFormularioRenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDatoFormularioRenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDatoFormularioRenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDatoFormularioRenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDatoFormularioRenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDatoFormularioRenta"));
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonModificarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"ModificarDatoFormularioRenta"));

		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonModificarToolBarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarDatoFormularioRenta"));
					
		this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemModificarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarDatoFormularioRenta"));		
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonActualizarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"ActualizarDatoFormularioRenta"));
		
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonActualizarToolBarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDatoFormularioRenta"));
						
		this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemActualizarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDatoFormularioRenta"));		
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonEliminarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"EliminarDatoFormularioRenta"));
		
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonEliminarToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarDatoFormularioRenta"));
								
		this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemEliminarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDatoFormularioRenta"));		
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonCancelarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"CancelarDatoFormularioRenta"));
		
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonCancelarToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarDatoFormularioRenta"));
					
		this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemCancelarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDatoFormularioRenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemDetalleCerrarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDatoFormularioRenta"));		
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoFormularioRenta"));
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoFormularioRenta"));
		
		
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDatoFormularioRenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonidDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"idDatoFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_anioDatoFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_anioDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_mesDatoFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_mesDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtones_sustitutivaDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"es_sustitutivaDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonnumero_formularioDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_formularioDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtoncedula_representanteDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"cedula_representanteDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonnumero_fiscalDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_fiscalDatoFormularioRentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDatoFormularioRenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDatoFormularioRenta"));
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDatoFormularioRenta"));
		}
		
		this.jTableDatosDatoFormularioRenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDatoFormularioRenta"));
		
		this.jTableDatosDatoFormularioRenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDatoFormularioRenta"));
		
		this.jButtonNuevoDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"NuevoDatoFormularioRenta"));
		
		this.jButtonDuplicarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"DuplicarDatoFormularioRenta"));
		
		this.jButtonCopiarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"CopiarDatoFormularioRenta"));
		
		this.jButtonVerFormDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"VerFormDatoFormularioRenta"));
		
		
		this.jButtonNuevoToolBarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarDatoFormularioRenta"));
			
		this.jButtonDuplicarToolBarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDatoFormularioRenta"));
			
		this.jMenuItemNuevoDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDatoFormularioRenta"));
			
		this.jMenuItemDuplicarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDatoFormularioRenta"));		
		
		
		this.jButtonNuevoRelacionesDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDatoFormularioRenta"));
		
		
		this.jButtonNuevoRelacionesToolBarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDatoFormularioRenta"));
			
		this.jMenuItemNuevoRelacionesDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDatoFormularioRenta"));		
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonModificarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"ModificarDatoFormularioRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonModificarToolBarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarDatoFormularioRenta"));
			
			this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemModificarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarDatoFormularioRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonActualizarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"ActualizarDatoFormularioRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonActualizarToolBarDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDatoFormularioRenta"));
				
			this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemActualizarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDatoFormularioRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonEliminarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"EliminarDatoFormularioRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonEliminarToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarDatoFormularioRenta"));
						
			this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemEliminarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDatoFormularioRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonCancelarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"CancelarDatoFormularioRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonCancelarToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarDatoFormularioRenta"));
			
			this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemCancelarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDatoFormularioRenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDatoFormularioRenta"));		
		
		
		this.jButtonCerrarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"CerrarDatoFormularioRenta"));
		
		
		this.jButtonCerrarToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarDatoFormularioRenta"));
			
		this.jMenuItemCerrarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDatoFormularioRenta"));
			
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jMenuItemDetalleCerrarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDatoFormularioRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosDatoFormularioRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoFormularioRenta"));
		}
		
		this.jButtonCopiarToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarDatoFormularioRenta"));
			
		this.jButtonVerFormToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarDatoFormularioRenta"));
		
		this.jMenuItemGuardarCambiosDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDatoFormularioRenta"));
			
		this.jMenuItemCopiarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDatoFormularioRenta"));		
		
		this.jMenuItemVerFormDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDatoFormularioRenta"));		
		
		
		this.jButtonGuardarCambiosTablaDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDatoFormularioRenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDatoFormularioRenta"));
			
		this.jMenuItemGuardarCambiosTablaDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDatoFormularioRenta"));		
		
		
		
		this.jButtonRecargarInformacionDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionDatoFormularioRenta"));
					
		this.jButtonRecargarInformacionToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDatoFormularioRenta"));
		
		this.jMenuItemRecargarInformacionDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDatoFormularioRenta"));		
		
		
		
		this.jButtonAnterioresDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"AnterioresDatoFormularioRenta"));
		
		
		this.jButtonAnterioresToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDatoFormularioRenta"));
		
		this.jMenuItemAnterioresDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDatoFormularioRenta"));		
		
		
		this.jButtonSiguientesDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"SiguientesDatoFormularioRenta"));
		
		
		this.jButtonSiguientesToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDatoFormularioRenta"));
			
		this.jMenuItemSiguientesDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDatoFormularioRenta"));
			
		this.jMenuItemAbrirOrderByDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDatoFormularioRenta"));
			
		this.jMenuItemMostrarOcultarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDatoFormularioRenta"));
			
		this.jMenuItemDetalleAbrirOrderByDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDatoFormularioRenta"));
			
		this.jMenuItemDetalleMostarOcultarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDatoFormularioRenta"));		
		
		
		this.jButtonNuevoGuardarCambiosDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDatoFormularioRenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDatoFormularioRenta"));
			
		this.jMenuItemNuevoGuardarCambiosDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDatoFormularioRenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDatoFormularioRenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDatoFormularioRenta"));

		this.jCheckBoxSeleccionadosDatoFormularioRenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDatoFormularioRenta"));
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDatoFormularioRenta"));
		}
		
		
		this.jComboBoxTiposRelacionesDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesDatoFormularioRenta"));
			
		this.jComboBoxTiposAccionesDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesDatoFormularioRenta"));
					
		this.jComboBoxTiposSeleccionarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDatoFormularioRenta"));
			
		this.jTextFieldValorCampoGeneralDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDatoFormularioRenta"));		
		
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonidDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"idDatoFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_anioDatoFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_anioDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_mesDatoFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_mesDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtones_sustitutivaDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"es_sustitutivaDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonnumero_formularioDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_formularioDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtoncedula_representanteDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"cedula_representanteDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonnumero_fiscalDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_fiscalDatoFormularioRentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdAnioDatoFormularioRenta"));

			this.jButtonFK_IdMesDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdMesDatoFormularioRenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDatoFormularioRenta!=null) {
				this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoFormularioRenta"));
				this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoFormularioRenta"));
				this.jInternalFrameReporteDinamicoDatoFormularioRenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoFormularioRenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoFormularioRenta"));				
			//this.jButtonGenerarReporteDinamicoDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoFormularioRenta"));
			//this.jButtonGenerarExcelReporteDinamicoDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoFormularioRenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDatoFormularioRenta!=null) {
				this.jInternalFrameImportacionDatoFormularioRenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDatoFormularioRenta"));
				this.jInternalFrameImportacionDatoFormularioRenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDatoFormularioRenta"));
				this.jInternalFrameImportacionDatoFormularioRenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDatoFormularioRenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByDatoFormularioRenta"));
			
			this.jButtonAbrirOrderByToolBarDatoFormularioRenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDatoFormularioRenta"));			
			
			if(this.jInternalFrameOrderByDatoFormularioRenta!=null) {
				this.jInternalFrameOrderByDatoFormularioRenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDatoFormularioRenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoFormularioRenta.jTabbedPaneRelacionesDatoFormularioRenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDatoFormularioRenta"));
		
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
            		closingInternalFrameDatoFormularioRenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDatoFormularioRenta = (JInternalFrameBase)event.getSource();
	            	
	            DatoFormularioRentaBeanSwingJInternalFrame jInternalFrameParent=(DatoFormularioRentaBeanSwingJInternalFrame)jInternalFrameDetalleFormDatoFormularioRenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDatoFormularioRentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDatoFormularioRenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDatoFormularioRentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDatoFormularioRenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDatoFormularioRenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDatoFormularioRenta";
		inputMap = this.jButtonNuevoDatoFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDatoFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDatoFormularioRentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoFormularioRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDatoFormularioRenta";
		inputMap = this.jButtonNuevoRelacionesDatoFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDatoFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDatoFormularioRentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDatoFormularioRenta";
		inputMap = this.jButtonModificarDatoFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDatoFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDatoFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDatoFormularioRenta";
		inputMap = this.jButtonActualizarDatoFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDatoFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDatoFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDatoFormularioRenta";
		inputMap = this.jButtonEliminarDatoFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDatoFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDatoFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDatoFormularioRenta";
		inputMap = this.jButtonCancelarDatoFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDatoFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDatoFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDatoFormularioRenta";
		inputMap = this.jButtonCerrarDatoFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDatoFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDatoFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDatoFormularioRenta";
		inputMap = this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosDatoFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonGuardarCambiosDatoFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDatoFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDatoFormularioRenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDatoFormularioRentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDatoFormularioRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDatoFormularioRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDatoFormularioRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDatoFormularioRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDatoFormularioRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDatoFormularioRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonidDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"idDatoFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_anioDatoFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_anioDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDatoFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_mesDatoFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonid_mesDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtones_sustitutivaDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"es_sustitutivaDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonnumero_formularioDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_formularioDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtoncedula_representanteDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"cedula_representanteDatoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoFormularioRenta.jButtonnumero_fiscalDatoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_fiscalDatoFormularioRentaBusqueda"));
		
		
		this.jButtonFK_IdAnioDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdAnioDatoFormularioRenta"));

		this.jButtonFK_IdMesDatoFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdMesDatoFormularioRenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDatoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDatoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDatoFormularioRentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDatoFormularioRenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDatoFormularioRenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentaLogic.getDatoFormularioRentas()) {
					datoformulariorentaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentas) {
					datoformulariorentaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDatoFormularioRentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDatoFormularioRenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentaLogic.getDatoFormularioRentas()) {
						datoformulariorentaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentas) {
						datoformulariorentaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentaLogic.getDatoFormularioRentas()) {
					
						if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA)) {
							existe=true;
							datoformulariorentaAux.setes_sustitutiva(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentas) {
						
						if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA)) {
							existe=true;
							datoformulariorentaAux.setes_sustitutiva(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDatoFormularioRenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDatoFormularioRenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDatoFormularioRentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDatoFormularioRenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDatoFormularioRenta.getSelectedRows();
			
			DatoFormularioRenta datoformulariorentaLocal=new DatoFormularioRenta();
			
			//this.seleccionarTodosDatoFormularioRenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformulariorentaLocal =(DatoFormularioRenta) this.datoformulariorentaLogic.getDatoFormularioRentas().toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					datoformulariorentaLocal =(DatoFormularioRenta) this.datoformulariorentas.toArray()[this.jTableDatosDatoFormularioRenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				datoformulariorentaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentaLogic.getDatoFormularioRentas()) {
						datoformulariorentaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentas) {
						datoformulariorentaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDatoFormularioRenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDatoFormularioRenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDatoFormularioRenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDatoFormularioRentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDatoFormularioRentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDatoFormularioRentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDatoFormularioRenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDatoFormularioRenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentaLogic.getDatoFormularioRentas()) {
				
						if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO)) {
							existe=true;
							datoformulariorentaAux.setnumero_formulario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE)) {
							existe=true;
							datoformulariorentaAux.setcedula_representante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL)) {
							existe=true;
							datoformulariorentaAux.setnumero_fiscal(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentas) {
					
						if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO)) {
							existe=true;
							datoformulariorentaAux.setnumero_formulario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE)) {
							existe=true;
							datoformulariorentaAux.setcedula_representante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL)) {
							existe=true;
							datoformulariorentaAux.setnumero_fiscal(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDatoFormularioRentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDatoFormularioRenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDatoFormularioRenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDatoFormularioRenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDatoFormularioRenta) {				
					conSplash=true;//false;										
					
					//this.startProcessDatoFormularioRenta(conSplash);
				
					this.generarReporteDatoFormularioRentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDatoFormularioRentasSeleccionados();
				//this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDatoFormularioRentasSeleccionados(false);
				//this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDatoFormularioRentasSeleccionados(true);
				//this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDatoFormularioRenta();
				
				this.exportarDatoFormularioRentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDatoFormularioRentas();
				//this.importarDatoFormularioRentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDatoFormularioRenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDatoFormularioRentasSeleccionados();
				//this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Dato Formulario Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDatoFormularioRenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDatoFormularioRenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDatoFormularioRenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Dato Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setSelectedIndex(0);					
				}	
			} 			
			else if(DatoFormularioRentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDatoFormularioRenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDatoFormularioRenta(conSplash);
					
						//this.actualizarParametrosGeneralDatoFormularioRenta();
						
						this.generarReporteProcesoAccionDatoFormularioRentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DatoFormularioRentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Dato Formulario RentaS SELECCIONADOS?", "MANTENIMIENTO DE Dato Formulario Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDatoFormularioRenta();
				
						this.actualizarParametrosGeneralDatoFormularioRenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.datoformulariorentaReturnGeneral=datoformulariorentaLogic.procesarAccionDatoFormularioRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.datoformulariorentaLogic.getDatoFormularioRentas(),this.datoformulariorentaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDatoFormularioRentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDatoFormularioRenta();
					
					DatoFormularioRentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDatoFormularioRentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDatoFormularioRenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDatoFormularioRenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDatoFormularioRentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDatoFormularioRenta();
			
			if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();		
			DatoFormularioRenta datoformulariorenta=new DatoFormularioRenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDatoFormularioRenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDatoFormularioRenta.getSelectedItem();
			
			
			
			
			datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(datoformulariorentasSeleccionados.size()==1) {
				for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentasSeleccionados) {
					datoformulariorenta=datoformulariorentaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Formulario Renta")) {
					jButtonFormularioRentaActionPerformed(null,rowIndex,true,false,datoformulariorenta);
				}
				else if(this.sTipoRelacion.equals("Formulario Renta Extra")) {
					jButtonFormularioRentaExtraActionPerformed(null,rowIndex,true,false,datoformulariorenta);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDatoFormularioRenta();
			
      		//this.finishProcessDatoFormularioRenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDatoFormularioRentaReturnGeneral() throws Exception {
		if(this.datoformulariorentaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.datoformulariorentaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.datoformulariorentaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.datoformulariorentaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.datoformulariorentaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.datoformulariorentaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDatoFormularioRenta(false);
		}
		
		if(this.datoformulariorentaReturnGeneral.getConRetornoLista() || this.datoformulariorentaReturnGeneral.getConRetornoObjeto()) {
			if(this.datoformulariorentaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.datoformulariorentaLogic.setDatoFormularioRentas(this.datoformulariorentaReturnGeneral.getDatoFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.datoformulariorentaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.datoformulariorentaLogic.setDatoFormularioRenta(this.datoformulariorentaReturnGeneral.getDatoFormularioRenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDatoFormularioRenta(false);
		}
	}
	
	public void actualizarParametrosGeneralDatoFormularioRenta() throws Exception {
		
		
	}
	
	public ArrayList<DatoFormularioRenta> getDatoFormularioRentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDatoFormularioRenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentaLogic.getDatoFormularioRentas()) {
					if(datoformulariorentaAux.getIsSelected()) {
						datoformulariorentasSeleccionados.add(datoformulariorentaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoFormularioRenta datoformulariorentaAux:this.datoformulariorentas) {
					if(datoformulariorentaAux.getIsSelected()) {
						datoformulariorentasSeleccionados.add(datoformulariorentaAux);				
					}
				}
			}
			
			if(datoformulariorentasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						datoformulariorentasSeleccionados.addAll(this.datoformulariorentaLogic.getDatoFormularioRentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						datoformulariorentasSeleccionados.addAll(this.datoformulariorentas);				
					}
				}
			}
		} else {
			datoformulariorentasSeleccionados.add(this.datoformulariorenta);
		}
		
		return datoformulariorentasSeleccionados;
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
	
	public void generarReporteDatoFormularioRentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDatoFormularioRentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDatoFormularioRentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDatoFormularioRentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDatoFormularioRentasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesDatoFormularioRentasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Dato Formulario Renta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDatoFormularioRentasSeleccionados() throws Exception {
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();		
		
		datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDatoFormularioRentas("Todos",datoformulariorentasSeleccionados);
		
	}	
	
	public void generarReporteNormalDatoFormularioRentasSeleccionados() throws Exception {
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();		
		
		datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDatoFormularioRentas("Todos",datoformulariorentasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDatoFormularioRentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();
		
		datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDatoFormularioRentas("Todos",datoformulariorentasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDatoFormularioRentasSeleccionados() throws Exception {
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDatoFormularioRenta();
		
		
		datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDatoFormularioRenta();
		
		
		//this.generarReporteDatoFormularioRentas("Todos",datoformulariorentasSeleccionados ,datoformulariorentaImplementable,datoformulariorentaImplementableHome);
	}
	
	public void mostrarImportacionDatoFormularioRentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDatoFormularioRenta();
		
		this.abrirFrameImportacionDatoFormularioRenta();		
		
			
		//this.generarReporteDatoFormularioRentas("Todos",datoformulariorentasSeleccionados ,datoformulariorentaImplementable,datoformulariorentaImplementableHome);
	}
	
	public void importarDatoFormularioRentas() throws Exception {		
	
	}
	
	public void exportarDatoFormularioRentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDatoFormularioRentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDatoFormularioRentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDatoFormularioRentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Dato Formulario Renta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDatoFormularioRentasSeleccionados() throws Exception {
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();		
		
		datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformulariorenta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDatoFormularioRenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDatoFormularioRenta(datoformulariorentaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//datoformulariorentaAux.setsDetalleGeneralEntityReporte(datoformulariorentaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDatoFormularioRenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DatoFormularioRentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioRentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioRentaConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioRentaConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=datoformulariorenta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformulariorenta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformulariorenta.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformulariorenta.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformulariorenta.getes_sustitutiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformulariorenta.getnumero_formulario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformulariorenta.getcedula_representante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoformulariorenta.getnumero_fiscal();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDatoFormularioRentasSeleccionados() throws Exception {
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();		
		
		datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformulariorenta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DatoFormularioRentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDatoFormularioRenta(row);				
				iRow++;
			}				
			
			for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDatoFormularioRenta(datoformulariorentaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDatoFormularioRentasSeleccionados() throws Exception {
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();		
		
		datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoformulariorenta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("datoformulariorentas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("datoformulariorenta");
			//elementRoot.appendChild(element);
		
			for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentasSeleccionados) {
				element = document.createElement("datoformulariorenta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDatoFormularioRenta(datoformulariorentaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDatoFormularioRenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(datoformulariorenta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformulariorenta.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformulariorenta.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformulariorenta.getes_sustitutiva());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformulariorenta.getnumero_formulario());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformulariorenta.getcedula_representante());
		cell = row.createCell(iColumn++);cell.setCellValue(datoformulariorenta.getnumero_fiscal());				
	}
	
	public void setFilaDatosExportarXmlDatoFormularioRenta(DatoFormularioRenta datoformulariorenta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DatoFormularioRentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(datoformulariorenta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DatoFormularioRentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(datoformulariorenta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementanio_descripcion = document.createElement(DatoFormularioRentaConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(datoformulariorenta.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(DatoFormularioRentaConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(datoformulariorenta.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementes_sustitutiva = document.createElement(DatoFormularioRentaConstantesFunciones.ESSUSTITUTIVA);
		elementes_sustitutiva.appendChild(document.createTextNode(datoformulariorenta.getes_sustitutiva().toString().trim()));
		element.appendChild(elementes_sustitutiva);

		Element elementnumero_formulario = document.createElement(DatoFormularioRentaConstantesFunciones.NUMEROFORMULARIO);
		elementnumero_formulario.appendChild(document.createTextNode(datoformulariorenta.getnumero_formulario().trim()));
		element.appendChild(elementnumero_formulario);

		Element elementcedula_representante = document.createElement(DatoFormularioRentaConstantesFunciones.CEDULAREPRESENTANTE);
		elementcedula_representante.appendChild(document.createTextNode(datoformulariorenta.getcedula_representante().trim()));
		element.appendChild(elementcedula_representante);

		Element elementnumero_fiscal = document.createElement(DatoFormularioRentaConstantesFunciones.NUMEROFISCAL);
		elementnumero_fiscal.appendChild(document.createTextNode(datoformulariorenta.getnumero_fiscal().trim()));
		element.appendChild(elementnumero_fiscal);
	}
	
	public void generarReporteGroupGenericoDatoFormularioRentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados=new ArrayList<DatoFormularioRenta>();
		
		datoformulariorentasSeleccionados=this.getDatoFormularioRentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDatoFormularioRenta(datoformulariorentasSeleccionados);
		
		this.generarReporteDatoFormularioRentas("Todos",datoformulariorentasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDatoFormularioRenta(ArrayList<DatoFormularioRenta> datoformulariorentasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentasSeleccionados) {
				datoformulariorentaAux.setsDetalleGeneralEntityReporte(datoformulariorentaAux.toString());
			
				if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					datoformulariorentaAux.setsDescripcionGeneralEntityReporte1(datoformulariorentaAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					datoformulariorentaAux.setsDescripcionGeneralEntityReporte1(datoformulariorentaAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA)) {
					existe=true;
					datoformulariorentaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(datoformulariorentaAux.getes_sustitutiva()));
				}
				 else if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO)) {
					existe=true;
					datoformulariorentaAux.setsDescripcionGeneralEntityReporte1(datoformulariorentaAux.getnumero_formulario());
				}
				 else if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE)) {
					existe=true;
					datoformulariorentaAux.setsDescripcionGeneralEntityReporte1(datoformulariorentaAux.getcedula_representante());
				}
				 else if(sTipoSeleccionar.equals(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL)) {
					existe=true;
					datoformulariorentaAux.setsDescripcionGeneralEntityReporte1(datoformulariorentaAux.getnumero_fiscal());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoFormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDatoFormularioRenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDatoFormularioRenta=true;
				this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=true;
				this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=true;
			}
			
			this.isVisibilidadCeldaModificarDatoFormularioRenta=false;
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=false;
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=false;
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=false;
			this.isVisibilidadCeldaModificarDatoFormularioRenta=false;
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=true;
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=false;
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=false;
			this.isVisibilidadCeldaModificarDatoFormularioRenta=false;
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=true;
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=true;
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=false;
			this.isVisibilidadCeldaModificarDatoFormularioRenta=false;
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=true;
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=false;
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=true;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=true;
			this.isVisibilidadCeldaModificarDatoFormularioRenta=false;
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=false;
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=false;
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=false;
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=false;
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=false;
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=false;
			this.isVisibilidadCeldaModificarDatoFormularioRenta=true;
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=false;
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=false;
			this.isVisibilidadCeldaCancelarDatoFormularioRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoFormularioRenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DatoFormularioRentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=true;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=true;
		} else {
			this.actualizarEstadoPanelsDatoFormularioRenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDatoFormularioRenta=false;
			//this.isVisibilidadCeldaVerFormDatoFormularioRenta=false;
			this.isVisibilidadCeldaDuplicarDatoFormularioRenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!datoformulariorentaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=false;
		} else {
			this.isVisibilidadCeldaNuevoDatoFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			if(!datoformulariorentaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=false;												
			}
			
			this.jButtonCerrarDatoFormularioRenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDatoFormularioRenta=false;
		}
		
		if(!this.permiteMantenimiento(this.datoformulariorenta)) {
			this.isVisibilidadCeldaActualizarDatoFormularioRenta=false;
			this.isVisibilidadCeldaEliminarDatoFormularioRenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDatoFormularioRenta() {
		this.isVisibilidadCeldaNuevoDatoFormularioRenta=false;
		this.isVisibilidadCeldaGuardarCambiosDatoFormularioRenta=false;
	}
	
	public void actualizarEstadoPanelsDatoFormularioRenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDatoFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioRenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioRenta!=null) {
				this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioRenta!=null) {
				this.jScrollPanelDatosDatoFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoFormularioRenta!=null) {
				this.jPanelPaginacionDatoFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioRenta!=null) {
				this.jPanelParametrosReportesDatoFormularioRenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDatoFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioRenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioRenta!=null) {
				this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDatoFormularioRenta!=null) {
				this.jScrollPanelDatosDatoFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoFormularioRenta!=null) {
				this.jPanelPaginacionDatoFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioRenta!=null) {
				this.jPanelParametrosReportesDatoFormularioRenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDatoFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioRenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioRenta!=null) {
				this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioRenta!=null) {
				this.jScrollPanelDatosDatoFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoFormularioRenta!=null) {
				this.jPanelPaginacionDatoFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioRenta!=null) {
				this.jPanelParametrosReportesDatoFormularioRenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDatoFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioRenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioRenta!=null) {
				this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioRenta!=null) {
				this.jScrollPanelDatosDatoFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoFormularioRenta!=null) {
				this.jPanelPaginacionDatoFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioRenta!=null) {
				this.jPanelParametrosReportesDatoFormularioRenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDatoFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioRenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioRenta!=null) {
				this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioRenta!=null) {
				this.jScrollPanelDatosDatoFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoFormularioRenta!=null) {
				this.jPanelPaginacionDatoFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioRenta!=null) {
				this.jPanelParametrosReportesDatoFormularioRenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDatoFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioRenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioRenta!=null) {
				this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioRenta!=null) {
				this.jScrollPanelDatosDatoFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoFormularioRenta!=null) {
				this.jPanelPaginacionDatoFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioRenta!=null) {
				this.jPanelParametrosReportesDatoFormularioRenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDatoFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionDatoFormularioRenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioRenta!=null) {
				this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoFormularioRenta!=null) {
				this.jScrollPanelDatosDatoFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoFormularioRenta!=null) {
				this.jPanelPaginacionDatoFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoFormularioRenta!=null) {
				this.jPanelParametrosReportesDatoFormularioRenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDatoFormularioRenta!=null) {
					this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDatoFormularioRenta!=null) {
				this.jPanelParametrosReportesDatoFormularioRenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoFormularioRenta!=null) {
				this.jTabbedPaneBusquedasDatoFormularioRenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDatoFormularioRenta!=null) {
				this.jPanelParametrosReportesDatoFormularioRenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDatoFormularioRenta.remove(jPanelFK_IdAnioDatoFormularioRenta);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDatoFormularioRenta.remove(jPanelFK_IdMesDatoFormularioRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDatoFormularioRenta.remove(jPanelFK_IdAnioDatoFormularioRenta);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDatoFormularioRenta.remove(jPanelFK_IdMesDatoFormularioRenta);}
		}
		
	}
	
	

	public String registrarSesionDatoFormularioRentaParaFormularioRentas() throws Exception {
		Boolean isPaginaPopupFormularioRenta=false;

		try {

			if(this.datoformulariorentaSessionBean==null) {
				this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
			}

			if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaSessionBean==null) {
				this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaSessionBean=new FormularioRentaSessionBean();
			}

			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaSessionBean.setsPathNavegacionActual(datoformulariorentaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormularioRentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormularioRenta=this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormularioRenta(true);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRenta(DatoFormularioRentaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaSessionBean.setisBusquedaDesdeForeignKeySesionDatoFormularioRenta(true);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaSessionBean.setlidDatoFormularioRentaActual(this.idDatoFormularioRentaActual);

			datoformulariorentaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDatoFormularioRenta(true);
			datoformulariorentaSessionBean.setlIdDatoFormularioRentaActualForeignKey(this.idDatoFormularioRentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionDatoFormularioRentaParaFormularioRentaExtras() throws Exception {
		Boolean isPaginaPopupFormularioRentaExtra=false;

		try {

			if(this.datoformulariorentaSessionBean==null) {
				this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
			}

			if(this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraSessionBean==null) {
				this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraSessionBean=new FormularioRentaExtraSessionBean();
			}

			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraSessionBean.setsPathNavegacionActual(datoformulariorentaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormularioRentaExtra=this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormularioRentaExtra(true);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioRentaExtra(DatoFormularioRentaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraSessionBean.setisBusquedaDesdeForeignKeySesionDatoFormularioRenta(true);
			this.jInternalFrameDetalleFormDatoFormularioRenta.formulariorentaextraSessionBean.setlidDatoFormularioRentaActual(this.idDatoFormularioRentaActual);

			datoformulariorentaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDatoFormularioRenta(true);
			datoformulariorentaSessionBean.setlIdDatoFormularioRentaActualForeignKey(this.idDatoFormularioRentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DatoFormularioRentaSessionBean datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
		
		if(this.datoformulariorentaSessionBean==null) {
			this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
		}
		
		this.datoformulariorentaSessionBean.setsUltimaBusquedaDatoFormularioRenta(this.getsAccionBusqueda());
		this.datoformulariorentaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.datoformulariorentaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			datoformulariorentaSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			datoformulariorentaSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DatoFormularioRentaSessionBean datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
		
		if(this.datoformulariorentaSessionBean==null) {
			this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
		}
		
		if(this.datoformulariorentaSessionBean.getsUltimaBusquedaDatoFormularioRenta()!=null&&!this.datoformulariorentaSessionBean.getsUltimaBusquedaDatoFormularioRenta().equals("")) {
			this.setsAccionBusqueda(datoformulariorentaSessionBean.getsUltimaBusquedaDatoFormularioRenta());
			this.setiNumeroPaginacion(datoformulariorentaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(datoformulariorentaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(datoformulariorentaSessionBean.getid_anio());
				datoformulariorentaSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(datoformulariorentaSessionBean.getid_mes());
				datoformulariorentaSessionBean.setid_mes(null);
			}
		}
		
		this.datoformulariorentaSessionBean.setsUltimaBusquedaDatoFormularioRenta("");
		this.datoformulariorentaSessionBean.setiNumeroPaginacion(DatoFormularioRentaConstantesFunciones.INUMEROPAGINACION);
		this.datoformulariorentaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDatoFormularioRenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDatoFormularioRenta() {
		this.updateBorderResaltarBusquedasFormularioDatoFormularioRenta();
		this.updateVisibilidadBusquedasFormularioDatoFormularioRenta();
		this.updateHabilitarBusquedasFormularioDatoFormularioRenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioDatoFormularioRenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDatoFormularioRenta.getComponents().length>0) {
	

		if(this.datoformulariorentaConstantesFunciones.resaltarFK_IdAnioDatoFormularioRenta!=null) {
			index= this.jTabbedPaneBusquedasDatoFormularioRenta.indexOfComponent(this.jPanelFK_IdAnioDatoFormularioRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioRenta.getComponent(index);
				jPanel.setBorder(this.datoformulariorentaConstantesFunciones.resaltarFK_IdAnioDatoFormularioRenta);
			}
		}

		if(this.datoformulariorentaConstantesFunciones.resaltarFK_IdMesDatoFormularioRenta!=null) {
			index= this.jTabbedPaneBusquedasDatoFormularioRenta.indexOfComponent(this.jPanelFK_IdMesDatoFormularioRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioRenta.getComponent(index);
				jPanel.setBorder(this.datoformulariorentaConstantesFunciones.resaltarFK_IdMesDatoFormularioRenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDatoFormularioRenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDatoFormularioRenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDatoFormularioRenta.indexOfComponent(this.jPanelFK_IdAnioDatoFormularioRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datoformulariorentaConstantesFunciones.mostrarFK_IdAnioDatoFormularioRenta);
			if(!this.datoformulariorentaConstantesFunciones.mostrarFK_IdAnioDatoFormularioRenta && index>-1) {
				this.jTabbedPaneBusquedasDatoFormularioRenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasDatoFormularioRenta.indexOfComponent(this.jPanelFK_IdMesDatoFormularioRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datoformulariorentaConstantesFunciones.mostrarFK_IdMesDatoFormularioRenta);
			if(!this.datoformulariorentaConstantesFunciones.mostrarFK_IdMesDatoFormularioRenta && index>-1) {
				this.jTabbedPaneBusquedasDatoFormularioRenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDatoFormularioRenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDatoFormularioRenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDatoFormularioRenta.indexOfComponent(this.jPanelFK_IdAnioDatoFormularioRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datoformulariorentaConstantesFunciones.activarFK_IdAnioDatoFormularioRenta);
				this.jTabbedPaneBusquedasDatoFormularioRenta.setEnabledAt(index,this.datoformulariorentaConstantesFunciones.activarFK_IdAnioDatoFormularioRenta);
			}

			index= this.jTabbedPaneBusquedasDatoFormularioRenta.indexOfComponent(this.jPanelFK_IdMesDatoFormularioRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datoformulariorentaConstantesFunciones.activarFK_IdMesDatoFormularioRenta);
				this.jTabbedPaneBusquedasDatoFormularioRenta.setEnabledAt(index,this.datoformulariorentaConstantesFunciones.activarFK_IdMesDatoFormularioRenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDatoFormularioRenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasDatoFormularioRenta.indexOfComponent(this.jPanelFK_IdAnioDatoFormularioRenta);

			this.jTabbedPaneBusquedasDatoFormularioRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioRenta.getComponent(index);

			this.datoformulariorentaConstantesFunciones.setResaltarFK_IdAnioDatoFormularioRenta(resaltar);

			jPanel.setBorder(this.datoformulariorentaConstantesFunciones.resaltarFK_IdAnioDatoFormularioRenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasDatoFormularioRenta.indexOfComponent(this.jPanelFK_IdMesDatoFormularioRenta);

			this.jTabbedPaneBusquedasDatoFormularioRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoFormularioRenta.getComponent(index);

			this.datoformulariorentaConstantesFunciones.setResaltarFK_IdMesDatoFormularioRenta(resaltar);

			jPanel.setBorder(this.datoformulariorentaConstantesFunciones.resaltarFK_IdMesDatoFormularioRenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDatoFormularioRenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDatoFormularioRenta() throws Exception {

		if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDatoFormularioRenta();
		this.updateVisibilidadResaltarControlesFormularioDatoFormularioRenta();
		this.updateHabilitarResaltarControlesFormularioDatoFormularioRenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioDatoFormularioRenta() throws Exception {
		if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.datoformulariorentaConstantesFunciones.resaltaridDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.setBorder(this.datoformulariorentaConstantesFunciones.resaltaridDatoFormularioRenta);}
		if(this.datoformulariorentaConstantesFunciones.resaltarid_anioDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.setBorder(this.datoformulariorentaConstantesFunciones.resaltarid_anioDatoFormularioRenta);}
		if(this.datoformulariorentaConstantesFunciones.resaltarid_mesDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.setBorder(this.datoformulariorentaConstantesFunciones.resaltarid_mesDatoFormularioRenta);}
		if(this.datoformulariorentaConstantesFunciones.resaltares_sustitutivaDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxes_sustitutivaDatoFormularioRenta.setBorderPainted(true);this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxes_sustitutivaDatoFormularioRenta.setBorder(this.datoformulariorentaConstantesFunciones.resaltares_sustitutivaDatoFormularioRenta);}
		if(this.datoformulariorentaConstantesFunciones.resaltarnumero_formularioDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_formularioDatoFormularioRenta.setBorder(this.datoformulariorentaConstantesFunciones.resaltarnumero_formularioDatoFormularioRenta);}
		if(this.datoformulariorentaConstantesFunciones.resaltarcedula_representanteDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldcedula_representanteDatoFormularioRenta.setBorder(this.datoformulariorentaConstantesFunciones.resaltarcedula_representanteDatoFormularioRenta);}
		if(this.datoformulariorentaConstantesFunciones.resaltarnumero_fiscalDatoFormularioRenta!=null && this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_fiscalDatoFormularioRenta.setBorder(this.datoformulariorentaConstantesFunciones.resaltarnumero_fiscalDatoFormularioRenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDatoFormularioRenta() throws Exception {		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
	
		//this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostraridDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jPanelidDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostraridDatoFormularioRenta);
		//this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrarid_anioDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jPanelid_anioDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrarid_anioDatoFormularioRenta);
		//this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrarid_mesDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jPanelid_mesDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrarid_mesDatoFormularioRenta);
		//this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxes_sustitutivaDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrares_sustitutivaDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jPaneles_sustitutivaDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrares_sustitutivaDatoFormularioRenta);
		//this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_formularioDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrarnumero_formularioDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jPanelnumero_formularioDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrarnumero_formularioDatoFormularioRenta);
		//this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldcedula_representanteDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrarcedula_representanteDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jPanelcedula_representanteDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrarcedula_representanteDatoFormularioRenta);
		//this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_fiscalDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrarnumero_fiscalDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jPanelnumero_fiscalDatoFormularioRenta.setVisible(this.datoformulariorentaConstantesFunciones.mostrarnumero_fiscalDatoFormularioRenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDatoFormularioRenta() throws Exception {
		if(this.jInternalFrameDetalleFormDatoFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDatoFormularioRenta!=null) {
	
		this.jInternalFrameDetalleFormDatoFormularioRenta.jLabelidDatoFormularioRenta.setEnabled(this.datoformulariorentaConstantesFunciones.activaridDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_anioDatoFormularioRenta.setEnabled(this.datoformulariorentaConstantesFunciones.activarid_anioDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jComboBoxid_mesDatoFormularioRenta.setEnabled(this.datoformulariorentaConstantesFunciones.activarid_mesDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jCheckBoxes_sustitutivaDatoFormularioRenta.setEnabled(this.datoformulariorentaConstantesFunciones.activares_sustitutivaDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_formularioDatoFormularioRenta.setEnabled(this.datoformulariorentaConstantesFunciones.activarnumero_formularioDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldcedula_representanteDatoFormularioRenta.setEnabled(this.datoformulariorentaConstantesFunciones.activarcedula_representanteDatoFormularioRenta);
		this.jInternalFrameDetalleFormDatoFormularioRenta.jTextFieldnumero_fiscalDatoFormularioRenta.setEnabled(this.datoformulariorentaConstantesFunciones.activarnumero_fiscalDatoFormularioRenta);
		}
	}
	
		
}