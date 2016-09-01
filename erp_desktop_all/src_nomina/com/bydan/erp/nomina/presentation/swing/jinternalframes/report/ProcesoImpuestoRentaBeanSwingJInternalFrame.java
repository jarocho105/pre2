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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.nomina.util.ProcesoImpuestoRentaConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoImpuestoRentaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoImpuestoRentaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoImpuestoRentaBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

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
public class ProcesoImpuestoRentaBeanSwingJInternalFrame extends ProcesoImpuestoRentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoImpuestoRentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoImpuestoRenta> procesoimpuestorentaValidator = new ClassValidator<ProcesoImpuestoRenta>(ProcesoImpuestoRenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoImpuestoRenta procesoimpuestorenta;	
	public ProcesoImpuestoRenta procesoimpuestorentaAux;
	public ProcesoImpuestoRenta procesoimpuestorentaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoImpuestoRenta procesoimpuestorentaTotales;
	public Long idProcesoImpuestoRentaActual;
	public Long iIdNuevoProcesoImpuestoRenta=0L;
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
	
	public Boolean isPermisoTodoProcesoImpuestoRenta;
	public Boolean isPermisoNuevoProcesoImpuestoRenta;
	public Boolean isPermisoActualizarProcesoImpuestoRenta;
	public Boolean isPermisoActualizarOriginalProcesoImpuestoRenta;
	public Boolean isPermisoEliminarProcesoImpuestoRenta;
	public Boolean isPermisoGuardarCambiosProcesoImpuestoRenta;
	public Boolean isPermisoConsultaProcesoImpuestoRenta;
	public Boolean isPermisoBusquedaProcesoImpuestoRenta;
	public Boolean isPermisoReporteProcesoImpuestoRenta;
	public Boolean isPermisoPaginacionMedioProcesoImpuestoRenta;
	public Boolean isPermisoPaginacionAltoProcesoImpuestoRenta;
	public Boolean isPermisoPaginacionTodoProcesoImpuestoRenta;
	public Boolean isPermisoCopiarProcesoImpuestoRenta;
	public Boolean isPermisoVerFormProcesoImpuestoRenta;
	public Boolean isPermisoDuplicarProcesoImpuestoRenta;
	public Boolean isPermisoOrdenProcesoImpuestoRenta;
	
	
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
	
	public ProcesoImpuestoRentaParameterReturnGeneral procesoimpuestorentaReturnGeneral;
	public ProcesoImpuestoRentaParameterReturnGeneral procesoimpuestorentaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoImpuestoRenta=false;
	public Boolean esParaAccionDesdeFormularioProcesoImpuestoRenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoImpuestoRentaSessionBeanAdditional procesoimpuestorentaSessionBeanAdditional=null;
	
	public ProcesoImpuestoRentaSessionBeanAdditional getProcesoImpuestoRentaSessionBeanAdditional() {
		return this.procesoimpuestorentaSessionBeanAdditional;
	}
	
	public void setProcesoImpuestoRentaSessionBeanAdditional(ProcesoImpuestoRentaSessionBeanAdditional procesoimpuestorentaSessionBeanAdditional) {
		try {
			this.procesoimpuestorentaSessionBeanAdditional=procesoimpuestorentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional procesoimpuestorentaBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoImpuestoRentaBeanSwingJInternalFrame
	
	public ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional getProcesoImpuestoRentaBeanSwingJInternalFrameAdditional() {
		return this.procesoimpuestorentaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoImpuestoRentaBeanSwingJInternalFrameAdditional(ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional procesoimpuestorentaBeanSwingJInternalFrameAdditional) {
		try {
			this.procesoimpuestorentaBeanSwingJInternalFrameAdditional=procesoimpuestorentaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoImpuestoRentaLogic procesoimpuestorentaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoImpuestoRenta procesoimpuestorentaBean;
	public ProcesoImpuestoRentaConstantesFunciones procesoimpuestorentaConstantesFunciones;
	//public ProcesoImpuestoRentaParameterReturnGeneral procesoimpuestorentaReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoImpuestoRenta> procesoimpuestorentas;	
	//public List<ProcesoImpuestoRenta> procesoimpuestorentasEliminados;
	//public List<ProcesoImpuestoRenta> procesoimpuestorentasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoImpuestoRenta=true;
	public Boolean isVisibilidadCeldaCopiarProcesoImpuestoRenta=true;
	public Boolean isVisibilidadCeldaVerFormProcesoImpuestoRenta=true;
	public Boolean isVisibilidadCeldaOrdenProcesoImpuestoRenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaModificarProcesoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaActualizarProcesoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaEliminarProcesoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaCancelarProcesoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoImpuestoRenta=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	
	public Long getiIdNuevoProcesoImpuestoRenta() {
		return this.iIdNuevoProcesoImpuestoRenta;
	}

	public void setiIdNuevoProcesoImpuestoRenta(Long iIdNuevoProcesoImpuestoRenta) {
		this.iIdNuevoProcesoImpuestoRenta = iIdNuevoProcesoImpuestoRenta;
	}
	
	public Long getidProcesoImpuestoRentaActual() {
		return this.idProcesoImpuestoRentaActual;
	}

	public void setidProcesoImpuestoRentaActual(Long idProcesoImpuestoRentaActual) {
		this.idProcesoImpuestoRentaActual = idProcesoImpuestoRentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoImpuestoRenta getprocesoimpuestorenta() {
		return this.procesoimpuestorenta;
	}

	public void setprocesoimpuestorenta(ProcesoImpuestoRenta procesoimpuestorenta) {
		this.procesoimpuestorenta = procesoimpuestorenta;
	}
	
	public ProcesoImpuestoRenta getprocesoimpuestorentaAux() {
		return this.procesoimpuestorentaAux;
	}

	public void setprocesoimpuestorentaAux(ProcesoImpuestoRenta procesoimpuestorentaAux) {
		this.procesoimpuestorentaAux = procesoimpuestorentaAux;
	}				
	
	public ProcesoImpuestoRenta getprocesoimpuestorentaAnterior() {
		return this.procesoimpuestorentaAnterior;
	}

	public void setprocesoimpuestorentaAnterior(ProcesoImpuestoRenta procesoimpuestorentaAnterior) {
		this.procesoimpuestorentaAnterior = procesoimpuestorentaAnterior;
	}	
	
	public ProcesoImpuestoRenta getprocesoimpuestorentaTotales() {
		return this.procesoimpuestorentaTotales;
	}

	public void setprocesoimpuestorentaTotales(ProcesoImpuestoRenta procesoimpuestorentaTotales) {
		this.procesoimpuestorentaTotales = procesoimpuestorentaTotales;
	}	
	
	public ProcesoImpuestoRenta getprocesoimpuestorentaBean() {
		return this.procesoimpuestorentaBean;
	}

	public void setprocesoimpuestorentaBean(ProcesoImpuestoRenta procesoimpuestorentaBean) {
		this.procesoimpuestorentaBean = procesoimpuestorentaBean;
	}	
	
	public ProcesoImpuestoRentaParameterReturnGeneral getprocesoimpuestorentaReturnGeneral() {
		return this.procesoimpuestorentaReturnGeneral;
	}

	public void setprocesoimpuestorentaReturnGeneral(ProcesoImpuestoRentaParameterReturnGeneral procesoimpuestorentaReturnGeneral) {
		this.procesoimpuestorentaReturnGeneral = procesoimpuestorentaReturnGeneral;
	}	
	
	
	public Long id_anioBusquedaProcesoImpuestoRenta=null;

	public Long getid_anioBusquedaProcesoImpuestoRenta() {
		return this.id_anioBusquedaProcesoImpuestoRenta;
	}

	public void setid_anioBusquedaProcesoImpuestoRenta(Long id_anioBusquedaProcesoImpuestoRenta) {
		this.id_anioBusquedaProcesoImpuestoRenta = id_anioBusquedaProcesoImpuestoRenta;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoImpuestoRentaLogic getProcesoImpuestoRentaLogic()	{		
		return procesoimpuestorentaLogic;
	}

	public void setProcesoImpuestoRentaLogic(ProcesoImpuestoRentaLogic procesoimpuestorentaLogic) {
		this.procesoimpuestorentaLogic = procesoimpuestorentaLogic;
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
	
	public Boolean getIsEsNuevoProcesoImpuestoRenta() {
		return isEsNuevoProcesoImpuestoRenta;
	}

	public void setIsEsNuevoProcesoImpuestoRenta(Boolean isEsNuevoProcesoImpuestoRenta) {
		this.isEsNuevoProcesoImpuestoRenta = isEsNuevoProcesoImpuestoRenta;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoImpuestoRenta() {
		return esParaAccionDesdeFormularioProcesoImpuestoRenta;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoImpuestoRenta(Boolean esParaAccionDesdeFormularioProcesoImpuestoRenta) {
		this.esParaAccionDesdeFormularioProcesoImpuestoRenta = esParaAccionDesdeFormularioProcesoImpuestoRenta;
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

			if(this.procesoimpuestorentaSessionBean==null) {
				this.procesoimpuestorentaSessionBean=new ProcesoImpuestoRentaSessionBean();
			}

			if(!this.procesoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(procesoimpuestorentaSessionBean.getlidAnioActual());
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

					if(this.procesoimpuestorenta!=null) {
						this.procesoimpuestorenta.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
						this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioProcesoImpuestoRenta.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
						if(this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoImpuestoRenta") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta!=null) {
						jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta!=null) {
							//jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.getItemCount()>0) {
								jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioProcesoImpuestoRentaGenerico)throws Exception
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
				jComboBoxid_anioProcesoImpuestoRentaGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioProcesoImpuestoRentaGenerico!=null && jComboBoxid_anioProcesoImpuestoRentaGenerico.getItemCount()>0) {
					jComboBoxid_anioProcesoImpuestoRentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(ProcesoImpuestoRenta procesoimpuestorenta,JComboBox jComboBoxid_anioProcesoImpuestoRentaGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioProcesoImpuestoRentaGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioProcesoImpuestoRentaGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				procesoimpuestorenta.setid_anio(anioAux.getId());
				procesoimpuestorenta.setanio_descripcion(ProcesoImpuestoRentaConstantesFunciones.getAnioDescripcion(anioAux));
				procesoimpuestorenta.setAnio(anioAux);			}
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

					if(!ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { 
							this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { 
					}

					if(!ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoImpuestoRenta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.addItem(anio);
							}
						}

						if(!ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoImpuestoRenta() throws Exception {
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
		
	public ProcesoImpuestoRentaParameterReturnGeneral getProcesoImpuestoRentaParameterGeneral() {
		return this.procesoimpuestorentaParameterGeneral;
	}
	
	public void setProcesoImpuestoRentaParameterGeneral(ProcesoImpuestoRentaParameterReturnGeneral procesoimpuestorentaParameterGeneral) {
		this.procesoimpuestorentaParameterGeneral = procesoimpuestorentaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoImpuestoRenta() {
		return isPermisoTodoProcesoImpuestoRenta;
	}

	public void setIsPermisoTodoProcesoImpuestoRenta(Boolean isPermisoTodoProcesoImpuestoRenta) {
		this.isPermisoTodoProcesoImpuestoRenta = isPermisoTodoProcesoImpuestoRenta;
	}

	public Boolean getIsPermisoNuevoProcesoImpuestoRenta() {
		return isPermisoNuevoProcesoImpuestoRenta;
	}

	public void setIsPermisoNuevoProcesoImpuestoRenta(Boolean isPermisoNuevoProcesoImpuestoRenta) {
		this.isPermisoNuevoProcesoImpuestoRenta = isPermisoNuevoProcesoImpuestoRenta;
	}

	public Boolean getIsPermisoActualizarProcesoImpuestoRenta() {
		return isPermisoActualizarProcesoImpuestoRenta;
	}

	public void setIsPermisoActualizarProcesoImpuestoRenta(Boolean isPermisoActualizarProcesoImpuestoRenta) {
		this.isPermisoActualizarProcesoImpuestoRenta = isPermisoActualizarProcesoImpuestoRenta;
	}

	public Boolean getIsPermisoEliminarProcesoImpuestoRenta() {
		return isPermisoEliminarProcesoImpuestoRenta;
	}

	public void setIsPermisoEliminarProcesoImpuestoRenta(Boolean isPermisoEliminarProcesoImpuestoRenta) {
		this.isPermisoEliminarProcesoImpuestoRenta = isPermisoEliminarProcesoImpuestoRenta;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoImpuestoRenta() {
		return isPermisoGuardarCambiosProcesoImpuestoRenta;
	}

	public void setIsPermisoGuardarCambiosProcesoImpuestoRenta(Boolean isPermisoGuardarCambiosProcesoImpuestoRenta) {
		this.isPermisoGuardarCambiosProcesoImpuestoRenta = isPermisoGuardarCambiosProcesoImpuestoRenta;
	}
	
	public Boolean getIsPermisoConsultaProcesoImpuestoRenta() {
		return isPermisoConsultaProcesoImpuestoRenta;
	}

	public void setIsPermisoConsultaProcesoImpuestoRenta(Boolean isPermisoConsultaProcesoImpuestoRenta) {
		this.isPermisoConsultaProcesoImpuestoRenta = isPermisoConsultaProcesoImpuestoRenta;
	}

	public Boolean getIsPermisoBusquedaProcesoImpuestoRenta() {
		return isPermisoBusquedaProcesoImpuestoRenta;
	}

	public void setIsPermisoBusquedaProcesoImpuestoRenta(Boolean isPermisoBusquedaProcesoImpuestoRenta) {
		this.isPermisoBusquedaProcesoImpuestoRenta = isPermisoBusquedaProcesoImpuestoRenta;
	}

	public Boolean getIsPermisoReporteProcesoImpuestoRenta() {
		return isPermisoReporteProcesoImpuestoRenta;
	}

	public void setIsPermisoReporteProcesoImpuestoRenta(Boolean isPermisoReporteProcesoImpuestoRenta) {
		this.isPermisoReporteProcesoImpuestoRenta = isPermisoReporteProcesoImpuestoRenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoImpuestoRenta() {
		return isPermisoPaginacionMedioProcesoImpuestoRenta;
	}

	public void setIsPermisoPaginacionMedioProcesoImpuestoRenta(Boolean isPermisoPaginacionMedioProcesoImpuestoRenta) {
		this.isPermisoPaginacionMedioProcesoImpuestoRenta = isPermisoPaginacionMedioProcesoImpuestoRenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoImpuestoRenta() {
		return isPermisoPaginacionTodoProcesoImpuestoRenta;
	}

	public void setIsPermisoPaginacionTodoProcesoImpuestoRenta(Boolean isPermisoPaginacionTodoProcesoImpuestoRenta) {
		this.isPermisoPaginacionTodoProcesoImpuestoRenta = isPermisoPaginacionTodoProcesoImpuestoRenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoImpuestoRenta() {
		return isPermisoPaginacionAltoProcesoImpuestoRenta;
	}

	public void setIsPermisoPaginacionAltoProcesoImpuestoRenta(Boolean isPermisoPaginacionAltoProcesoImpuestoRenta) {
		this.isPermisoPaginacionAltoProcesoImpuestoRenta = isPermisoPaginacionAltoProcesoImpuestoRenta;
	}
	
	public Boolean getIsPermisoCopiarProcesoImpuestoRenta() {
		return isPermisoCopiarProcesoImpuestoRenta;
	}

	public void setIsPermisoCopiarProcesoImpuestoRenta(Boolean isPermisoCopiarProcesoImpuestoRenta) {
		this.isPermisoCopiarProcesoImpuestoRenta = isPermisoCopiarProcesoImpuestoRenta;
	}
	
	public Boolean getIsPermisoVerFormProcesoImpuestoRenta() {
		return isPermisoVerFormProcesoImpuestoRenta;
	}

	public void setIsPermisoVerFormProcesoImpuestoRenta(Boolean isPermisoVerFormProcesoImpuestoRenta) {
		this.isPermisoVerFormProcesoImpuestoRenta = isPermisoVerFormProcesoImpuestoRenta;
	}
	
	public Boolean getIsPermisoDuplicarProcesoImpuestoRenta() {
		return isPermisoDuplicarProcesoImpuestoRenta;
	}

	public void setIsPermisoDuplicarProcesoImpuestoRenta(Boolean isPermisoDuplicarProcesoImpuestoRenta) {
		this.isPermisoDuplicarProcesoImpuestoRenta = isPermisoDuplicarProcesoImpuestoRenta;
	}
	
	public Boolean getIsPermisoOrdenProcesoImpuestoRenta() {
		return isPermisoOrdenProcesoImpuestoRenta;
	}

	public void setIsPermisoOrdenProcesoImpuestoRenta(Boolean isPermisoOrdenProcesoImpuestoRenta) {
		this.isPermisoOrdenProcesoImpuestoRenta = isPermisoOrdenProcesoImpuestoRenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoImpuestoRenta() {
		return isVisibilidadCeldaNuevoProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaNuevoProcesoImpuestoRenta(Boolean isVisibilidadCeldaNuevoProcesoImpuestoRenta) {
		this.isVisibilidadCeldaNuevoProcesoImpuestoRenta = isVisibilidadCeldaNuevoProcesoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoImpuestoRenta() {
		return isVisibilidadCeldaDuplicarProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoImpuestoRenta(Boolean isVisibilidadCeldaDuplicarProcesoImpuestoRenta) {
		this.isVisibilidadCeldaDuplicarProcesoImpuestoRenta = isVisibilidadCeldaDuplicarProcesoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoImpuestoRenta() {
		return isVisibilidadCeldaCopiarProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaCopiarProcesoImpuestoRenta(Boolean isVisibilidadCeldaCopiarProcesoImpuestoRenta) {
		this.isVisibilidadCeldaCopiarProcesoImpuestoRenta = isVisibilidadCeldaCopiarProcesoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoImpuestoRenta() {
		return isVisibilidadCeldaVerFormProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaVerFormProcesoImpuestoRenta(Boolean isVisibilidadCeldaVerFormProcesoImpuestoRenta) {
		this.isVisibilidadCeldaVerFormProcesoImpuestoRenta = isVisibilidadCeldaVerFormProcesoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoImpuestoRenta() {
		return isVisibilidadCeldaOrdenProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaOrdenProcesoImpuestoRenta(Boolean isVisibilidadCeldaOrdenProcesoImpuestoRenta) {
		this.isVisibilidadCeldaOrdenProcesoImpuestoRenta = isVisibilidadCeldaOrdenProcesoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta() {
		return isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta(Boolean isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta = isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoImpuestoRenta() {
		return isVisibilidadCeldaModificarProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaModificarProcesoImpuestoRenta(Boolean isVisibilidadCeldaModificarProcesoImpuestoRenta) {
		this.isVisibilidadCeldaModificarProcesoImpuestoRenta = isVisibilidadCeldaModificarProcesoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoImpuestoRenta() {
		return isVisibilidadCeldaActualizarProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaActualizarProcesoImpuestoRenta(Boolean isVisibilidadCeldaActualizarProcesoImpuestoRenta) {
		this.isVisibilidadCeldaActualizarProcesoImpuestoRenta = isVisibilidadCeldaActualizarProcesoImpuestoRenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoImpuestoRenta() {
		return isVisibilidadCeldaEliminarProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaEliminarProcesoImpuestoRenta(Boolean isVisibilidadCeldaEliminarProcesoImpuestoRenta) {
		this.isVisibilidadCeldaEliminarProcesoImpuestoRenta = isVisibilidadCeldaEliminarProcesoImpuestoRenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoImpuestoRenta() {
		return isVisibilidadCeldaCancelarProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaCancelarProcesoImpuestoRenta(Boolean isVisibilidadCeldaCancelarProcesoImpuestoRenta) {
		this.isVisibilidadCeldaCancelarProcesoImpuestoRenta = isVisibilidadCeldaCancelarProcesoImpuestoRenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoImpuestoRenta() {
		return isVisibilidadCeldaGuardarProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaGuardarProcesoImpuestoRenta(Boolean isVisibilidadCeldaGuardarProcesoImpuestoRenta) {
		this.isVisibilidadCeldaGuardarProcesoImpuestoRenta = isVisibilidadCeldaGuardarProcesoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta() {
		return isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta(Boolean isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta) {
		this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta = isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta;
	}
		
	public ProcesoImpuestoRentaSessionBean getprocesoimpuestorentaSessionBean() {
		return this.procesoimpuestorentaSessionBean;
	}
	
	public void setprocesoimpuestorentaSessionBean(ProcesoImpuestoRentaSessionBean procesoimpuestorentaSessionBean) {
		this.procesoimpuestorentaSessionBean=procesoimpuestorentaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoImpuestoRenta() {
		return this.isVisibilidadBusquedaProcesoImpuestoRenta;
	}

	public void setisVisibilidadBusquedaProcesoImpuestoRenta(Boolean isVisibilidadBusquedaProcesoImpuestoRenta) {
		this.isVisibilidadBusquedaProcesoImpuestoRenta=isVisibilidadBusquedaProcesoImpuestoRenta;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(procesoimpuestorenta,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoImpuestoRenta procesoimpuestorenta,ProcesoImpuestoRenta procesoimpuestorentaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoImpuestoRenta(procesoimpuestorenta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesoimpuestorentaAux.setId(procesoimpuestorenta.getId());
		procesoimpuestorentaAux.setVersionRow(procesoimpuestorenta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoImpuestoRenta procesoimpuestorentaLocal) throws Exception {
		
		if(this.procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoImpuestoRenta procesoimpuestorentaLocal) throws Exception {	
		if(this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				procesoimpuestorentaLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoImpuestoRentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesoimpuestorentaValidator.getInvalidValues(this.procesoimpuestorenta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoImpuestoRenta procesoimpuestorenta,List<ProcesoImpuestoRenta> procesoimpuestorentas) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoImpuestoRenta procesoimpuestorenta,List<ProcesoImpuestoRenta> procesoimpuestorentas) throws Exception {
		try	{			
			ProcesoImpuestoRentaConstantesFunciones.actualizarSelectedLista(procesoimpuestorenta,procesoimpuestorentas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoImpuestoRenta> procesoimpuestorentasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesoimpuestorentasLocal=this.procesoimpuestorentaLogic.getProcesoImpuestoRentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesoimpuestorentasLocal=this.procesoimpuestorentas;
			}
			//ARCHITECTURE
		
			for(ProcesoImpuestoRenta procesoimpuestorentaLocal:procesoimpuestorentasLocal) {
				if(this.permiteMantenimiento(procesoimpuestorentaLocal) && procesoimpuestorentaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoImpuestoRentaConstantesFunciones.getProcesoImpuestoRentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoImpuestoRentaConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelid_anioProcesoImpuestoRenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelid_anioProcesoImpuestoRenta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoProcesoImpuestoRenta--;	
		
		
		this.procesoimpuestorentaAux=new ProcesoImpuestoRenta();
		
		this.procesoimpuestorentaAux.setId(this.iIdNuevoProcesoImpuestoRenta);
		this.procesoimpuestorentaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().add(this.procesoimpuestorentaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesoimpuestorentas.add(this.procesoimpuestorentaAux);
		}
		//ARCHITECTURE
		
		this.procesoimpuestorenta=this.procesoimpuestorentaAux;
		
		if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoImpuestoRenta(this.procesoimpuestorenta);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoImpuestoRenta(this.procesoimpuestorenta);
		}
				
		//this.setDefaultControlesProcesoImpuestoRenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoImpuestoRenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoImpuestoRenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoImpuestoRenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoImpuestoRenta(this.procesoimpuestorentaBean,this.procesoimpuestorenta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoImpuestoRenta(this.procesoimpuestorentaReturnGeneral,this.procesoimpuestorentaBean,false);
		
		if(this.procesoimpuestorentaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoImpuestoRenta(this.procesoimpuestorentaReturnGeneral.getProcesoImpuestoRenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoImpuestoRenta(this.procesoimpuestorentaReturnGeneral.getProcesoImpuestoRenta());
		}
		
		if(this.procesoimpuestorentaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoImpuestoRenta(this.procesoimpuestorentaReturnGeneral.getProcesoImpuestoRenta(),classes);//this.procesoimpuestorentaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(this.procesoimpuestorenta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoImpuestoRenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoImpuestoRenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.RecargarFormProcesoImpuestoRenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoImpuestoRenta(false);
						
			if(procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoImpuestoRenta();
			}
			
			this.actualizarVisualTableDatosProcesoImpuestoRenta();
			
			this.jTableDatosProcesoImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoProcesoImpuestoRenta(), this.getIndiceNuevoProcesoImpuestoRenta());
			
			this.seleccionarFilaTablaProcesoImpuestoRentaActual();
						
			this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoImpuestoRenta(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.setEnabled(isHabilitar && this.procesoimpuestorentaConstantesFunciones.activarid_anioProcesoImpuestoRenta);
	};
	
	public void setDefaultControlesProcesoImpuestoRenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoImpuestoRenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesoimpuestorentaSessionBean.setConGuardarRelaciones(true);			
			this.procesoimpuestorentaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTabbedPaneRelacionesProcesoImpuestoRenta.setVisible(true);
			
					
		} else {
			//this.procesoimpuestorentaSessionBean.setConGuardarRelaciones(false);			
			this.procesoimpuestorentaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTabbedPaneRelacionesProcesoImpuestoRenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoImpuestoRenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
				if(procesoimpuestorentaAux.getId().equals(this.iIdNuevoProcesoImpuestoRenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentas) {
				if(procesoimpuestorentaAux.getId().equals(this.iIdNuevoProcesoImpuestoRenta)) {
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
	
	public int getIndiceActualProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
				if(procesoimpuestorentaAux.getId().equals(procesoimpuestorenta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentas) {
				if(procesoimpuestorentaAux.getId().equals(procesoimpuestorenta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorentaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
				if(procesoimpuestorentaAux.getProcesoImpuestoRentaOriginal().getId().equals(procesoimpuestorentaOriginal.getId())) {
					existe=true;
					procesoimpuestorentaOriginal.setId(procesoimpuestorentaAux.getId());
					procesoimpuestorentaOriginal.setVersionRow(procesoimpuestorentaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentas) {
				if(procesoimpuestorentaAux.getProcesoImpuestoRentaOriginal().getId().equals(procesoimpuestorentaOriginal.getId())) {
					existe=true;
					procesoimpuestorentaOriginal.setId(procesoimpuestorentaAux.getId());
					procesoimpuestorentaOriginal.setVersionRow(procesoimpuestorentaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoImpuestoRenta(Boolean esParaCancelar) throws Exception {
		procesoimpuestorentasAux=new ArrayList<ProcesoImpuestoRenta>();
		procesoimpuestorentaAux=new ProcesoImpuestoRenta();
		
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
					if(procesoimpuestorentaAux.getId()<0) {
						procesoimpuestorentasAux.add(procesoimpuestorentaAux);
					}		
				}
				this.iIdNuevoProcesoImpuestoRenta=0L;
				this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().removeAll(procesoimpuestorentasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentas) {
					if(procesoimpuestorentaAux.getId()<0) {
						procesoimpuestorentasAux.add(procesoimpuestorentaAux);
					}		
				}
				this.iIdNuevoProcesoImpuestoRenta=0L;
				this.procesoimpuestorentas.removeAll(procesoimpuestorentasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoImpuestoRenta 
					&& this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().size()>0
					) {
					procesoimpuestorentaAux=this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().get(this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().size() - 1);
				
					if(procesoimpuestorentaAux.getId()<0) {
						this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().remove(procesoimpuestorentaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoImpuestoRenta && this.procesoimpuestorentas.size()>0) {
					procesoimpuestorentaAux=this.procesoimpuestorentas.get(this.procesoimpuestorentas.size() - 1);
				
					if(procesoimpuestorentaAux.getId()<0) {
						this.procesoimpuestorentas.remove(procesoimpuestorentaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoImpuestoRenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesoimpuestorenta.getId()<0) {
				this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().remove(this.procesoimpuestorenta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesoimpuestorenta.getId()<0) {
				this.procesoimpuestorentas.remove(this.procesoimpuestorenta);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoImpuestoRenta(List<ProcesoImpuestoRenta> procesoimpuestorentasAux) throws Exception {
		ProcesoImpuestoRentaConstantesFunciones.setEstadosInicialesProcesoImpuestoRenta(procesoimpuestorentasAux);
	}
	
	public void setEstadosInicialesProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorentaAux) throws Exception {
		ProcesoImpuestoRentaConstantesFunciones.setEstadosInicialesProcesoImpuestoRenta(procesoimpuestorentaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoImpuestoRentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoImpuestoRentaActual()) {
				if(!this.isEsNuevoProcesoImpuestoRenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoImpuestoRenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoImpuestoRentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Impuesto Renta ?", "MANTENIMIENTO DE Proceso Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoImpuestoRenta procesoimpuestorenta) throws Exception {
		ProcesoImpuestoRentaConstantesFunciones.seleccionarAsignar(this.procesoimpuestorenta,procesoimpuestorenta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoImpuestoRenta=this.isPermisoActualizarOriginalProcesoImpuestoRenta;
			
			
			this.seleccionarAsignar(procesoimpuestorenta);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesoimpuestorentaSessionBean.setsFuncionBusquedaRapida(this.procesoimpuestorentaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoImpuestoRenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoImpuestoRenta(esParaCancelar);				
				this.cancelarNuevoProcesoImpuestoRenta(esParaCancelar);								
			}
			
			this.procesoimpuestorenta=new ProcesoImpuestoRenta();
			
			this.inicializarProcesoImpuestoRenta();
			
			this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoImpuestoRenta() throws Exception {
		try {
			ProcesoImpuestoRentaConstantesFunciones.inicializarProcesoImpuestoRenta(this.procesoimpuestorenta);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoImpuestoRentas(String sAccionBusqueda,List<ProcesoImpuestoRenta> procesoimpuestorentasParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoImpuestoRenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoImpuestoRentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoImpuestoRentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoImpuestoRenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Impuesto Rentas");		
		parameters.put("busquedapor", ProcesoImpuestoRentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoImpuestoRenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoImpuestoRenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoImpuestoRentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoImpuestoRentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoImpuestoRentaBean.TraerProcesoImpuestoRentaBeans(procesoimpuestorentasParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,procesoimpuestorentasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,procesoimpuestorentasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoImpuestoRentaActionPerformed(null);
					//this.generarExcelReporteProcesoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,procesoimpuestorentasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,procesoimpuestorentasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,procesoimpuestorentasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,procesoimpuestorentasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoImpuestoRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoImpuestoRenta> procesoimpuestorentasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoimpuestorenta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoImpuestoRentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoImpuestoRenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoImpuestoRenta procesoimpuestorenta : procesoimpuestorentasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoImpuestoRentaConstantesFunciones.generarExcelReporteDataProcesoImpuestoRenta("NORMAL",row,workbook,procesoimpuestorenta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoImpuestoRenta(String sTipo,Row row,Workbook workbook) {
		
		ProcesoImpuestoRentaConstantesFunciones.generarExcelReporteHeaderProcesoImpuestoRenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoImpuestoRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoImpuestoRenta> procesoimpuestorentasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoimpuestorenta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoImpuestoRentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoImpuestoRenta procesoimpuestorenta : procesoimpuestorentasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoImpuestoRentaConstantesFunciones.getProcesoImpuestoRentaDescripcion(procesoimpuestorenta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoimpuestorenta.getanio_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoImpuestoRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoImpuestoRenta> procesoimpuestorentasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoImpuestoRenta> procesoimpuestorentasRespaldo=null;
		
		classes=ProcesoImpuestoRentaConstantesFunciones.getClassesRelationshipsOfProcesoImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesoimpuestorentaLogic.setDatosCliente(this.datosCliente);
		this.procesoimpuestorentaLogic.setDatosDeep(this.datosDeep);
		this.procesoimpuestorentaLogic.setIsConDeep(true);
		
		procesoimpuestorentasRespaldo=this.procesoimpuestorentaLogic.getProcesoImpuestoRentas();
		
		this.procesoimpuestorentaLogic.setProcesoImpuestoRentas(procesoimpuestorentasParaReportes);	
		this.procesoimpuestorentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesoimpuestorentasParaReportes=this.procesoimpuestorentaLogic.getProcesoImpuestoRentas();
		this.procesoimpuestorentaLogic.setProcesoImpuestoRentas(procesoimpuestorentasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoimpuestorenta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoImpuestoRentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoImpuestoRenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoImpuestoRenta procesoimpuestorenta : procesoimpuestorentasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoImpuestoRenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoImpuestoRentaConstantesFunciones.generarExcelReporteDataProcesoImpuestoRenta("NORMAL",row,workbook,procesoimpuestorenta,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoImpuestoRentaConstantesFunciones.getProcesoImpuestoRentaDescripcion(procesoimpuestorenta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoImpuestoRenta() throws Exception {		
		this.startProcessProcesoImpuestoRenta(true);
	}
	
	public void startProcessProcesoImpuestoRenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoImpuestoRenta ,this.jPanelParametrosReportesProcesoImpuestoRenta, this.jScrollPanelDatosProcesoImpuestoRenta,this.jPanelPaginacionProcesoImpuestoRenta, this.jScrollPanelDatosEdicionProcesoImpuestoRenta, this.jPanelAccionesProcesoImpuestoRenta,this.jPanelAccionesFormularioProcesoImpuestoRenta,this.jmenuBarProcesoImpuestoRenta,this.jmenuBarDetalleProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,this.jTtoolBarDetalleProcesoImpuestoRenta);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoImpuestoRenta=this.jTabbedPaneBusquedasProcesoImpuestoRenta; 
		
		final JPanel jPanelParametrosReportesProcesoImpuestoRenta=this.jPanelParametrosReportesProcesoImpuestoRenta;
		//final JScrollPane jScrollPanelDatosProcesoImpuestoRenta=this.jScrollPanelDatosProcesoImpuestoRenta;
		final JTable jTableDatosProcesoImpuestoRenta=this.jTableDatosProcesoImpuestoRenta;		
		final JPanel jPanelPaginacionProcesoImpuestoRenta=this.jPanelPaginacionProcesoImpuestoRenta;
		//final JScrollPane jScrollPanelDatosEdicionProcesoImpuestoRenta=this.jScrollPanelDatosEdicionProcesoImpuestoRenta;
		final JPanel jPanelAccionesProcesoImpuestoRenta=this.jPanelAccionesProcesoImpuestoRenta;
		
		JPanel jPanelCamposAuxiliarProcesoImpuestoRenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoImpuestoRenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			jPanelCamposAuxiliarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jPanelCamposProcesoImpuestoRenta;
			jPanelAccionesFormularioAuxiliarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jPanelAccionesFormularioProcesoImpuestoRenta;
		}
		
		final JPanel jPanelCamposProcesoImpuestoRenta=jPanelCamposAuxiliarProcesoImpuestoRenta;
		final JPanel jPanelAccionesFormularioProcesoImpuestoRenta=jPanelAccionesFormularioAuxiliarProcesoImpuestoRenta;
		
		
		final JMenuBar jmenuBarProcesoImpuestoRenta=this.jmenuBarProcesoImpuestoRenta;
		final JToolBar jTtoolBarProcesoImpuestoRenta=this.jTtoolBarProcesoImpuestoRenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoImpuestoRenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoImpuestoRenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			jmenuBarDetalleAuxiliarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jmenuBarDetalleProcesoImpuestoRenta;
			jTtoolBarDetalleAuxiliarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTtoolBarDetalleProcesoImpuestoRenta;
		}
		
		final JMenuBar jmenuBarDetalleProcesoImpuestoRenta=jmenuBarDetalleAuxiliarProcesoImpuestoRenta;
		final JToolBar jTtoolBarDetalleProcesoImpuestoRenta=jTtoolBarDetalleAuxiliarProcesoImpuestoRenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoImpuestoRenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoImpuestoRenta;
			processRunnable.jTableDatos=jTableDatosProcesoImpuestoRenta;
			processRunnable.jPanelCampos=jPanelCamposProcesoImpuestoRenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoImpuestoRenta;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoImpuestoRenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoImpuestoRenta;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoImpuestoRenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoImpuestoRenta;
			processRunnable.jTtoolBar=jTtoolBarProcesoImpuestoRenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoImpuestoRenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoImpuestoRenta ,jPanelParametrosReportesProcesoImpuestoRenta,jTableDatosProcesoImpuestoRenta, /*jScrollPanelDatosProcesoImpuestoRenta,*/jPanelCamposProcesoImpuestoRenta,jPanelPaginacionProcesoImpuestoRenta, /*jScrollPanelDatosEdicionProcesoImpuestoRenta,*/ jPanelAccionesProcesoImpuestoRenta,jPanelAccionesFormularioProcesoImpuestoRenta,jmenuBarProcesoImpuestoRenta,jmenuBarDetalleProcesoImpuestoRenta,jTtoolBarProcesoImpuestoRenta,jTtoolBarDetalleProcesoImpuestoRenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoImpuestoRenta ,jPanelParametrosReportesProcesoImpuestoRenta, jScrollPanelDatosProcesoImpuestoRenta,jPanelPaginacionProcesoImpuestoRenta, jScrollPanelDatosEdicionProcesoImpuestoRenta, jPanelAccionesProcesoImpuestoRenta,jPanelAccionesFormularioProcesoImpuestoRenta,jmenuBarProcesoImpuestoRenta,jmenuBarDetalleProcesoImpuestoRenta,jTtoolBarProcesoImpuestoRenta,jTtoolBarDetalleProcesoImpuestoRenta);
						
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
	
	public void finishProcessProcesoImpuestoRenta() {// throws Exception 
		this.finishProcessProcesoImpuestoRenta(true);
	}
	
	public void finishProcessProcesoImpuestoRenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoImpuestoRenta ,this.jPanelParametrosReportesProcesoImpuestoRenta, this.jScrollPanelDatosProcesoImpuestoRenta,this.jPanelPaginacionProcesoImpuestoRenta, this.jScrollPanelDatosEdicionProcesoImpuestoRenta, this.jPanelAccionesProcesoImpuestoRenta,this.jPanelAccionesFormularioProcesoImpuestoRenta,this.jmenuBarProcesoImpuestoRenta,this.jmenuBarDetalleProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,this.jTtoolBarDetalleProcesoImpuestoRenta);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoImpuestoRenta=this.jTabbedPaneBusquedasProcesoImpuestoRenta; 
		
		final JPanel jPanelParametrosReportesProcesoImpuestoRenta=this.jPanelParametrosReportesProcesoImpuestoRenta;
		//final JScrollPane jScrollPanelDatosProcesoImpuestoRenta=this.jScrollPanelDatosProcesoImpuestoRenta;
		final JTable jTableDatosProcesoImpuestoRenta=this.jTableDatosProcesoImpuestoRenta;		
		final JPanel jPanelPaginacionProcesoImpuestoRenta=this.jPanelPaginacionProcesoImpuestoRenta;
		//final JScrollPane jScrollPanelDatosEdicionProcesoImpuestoRenta=this.jScrollPanelDatosEdicionProcesoImpuestoRenta;
		final JPanel jPanelAccionesProcesoImpuestoRenta=this.jPanelAccionesProcesoImpuestoRenta;
		
		JPanel jPanelCamposAuxiliarProcesoImpuestoRenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoImpuestoRenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			jPanelCamposAuxiliarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jPanelCamposProcesoImpuestoRenta;
			jPanelAccionesFormularioAuxiliarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jPanelAccionesFormularioProcesoImpuestoRenta;
		}
		
		final JPanel jPanelCamposProcesoImpuestoRenta=jPanelCamposAuxiliarProcesoImpuestoRenta;
		final JPanel jPanelAccionesFormularioProcesoImpuestoRenta=jPanelAccionesFormularioAuxiliarProcesoImpuestoRenta;
		
		
		final JMenuBar jmenuBarProcesoImpuestoRenta=this.jmenuBarProcesoImpuestoRenta;		
		final JToolBar jTtoolBarProcesoImpuestoRenta=this.jTtoolBarProcesoImpuestoRenta;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoImpuestoRenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoImpuestoRenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			jmenuBarDetalleAuxiliarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jmenuBarDetalleProcesoImpuestoRenta;
			jTtoolBarDetalleAuxiliarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTtoolBarDetalleProcesoImpuestoRenta;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoImpuestoRenta=jmenuBarDetalleAuxiliarProcesoImpuestoRenta;
		final JToolBar jTtoolBarDetalleProcesoImpuestoRenta=jTtoolBarDetalleAuxiliarProcesoImpuestoRenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoImpuestoRenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoImpuestoRenta;
			processRunnable.jTableDatos=jTableDatosProcesoImpuestoRenta;
			processRunnable.jPanelCampos=jPanelCamposProcesoImpuestoRenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoImpuestoRenta;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoImpuestoRenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoImpuestoRenta;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoImpuestoRenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoImpuestoRenta;
			processRunnable.jTtoolBar=jTtoolBarProcesoImpuestoRenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoImpuestoRenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoImpuestoRenta ,jPanelParametrosReportesProcesoImpuestoRenta, jTableDatosProcesoImpuestoRenta,/*jScrollPanelDatosProcesoImpuestoRenta,*/jPanelCamposProcesoImpuestoRenta,jPanelPaginacionProcesoImpuestoRenta, /*jScrollPanelDatosEdicionProcesoImpuestoRenta,*/ jPanelAccionesProcesoImpuestoRenta,jPanelAccionesFormularioProcesoImpuestoRenta,jmenuBarProcesoImpuestoRenta,jmenuBarDetalleProcesoImpuestoRenta,jTtoolBarProcesoImpuestoRenta,jTtoolBarDetalleProcesoImpuestoRenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoImpuestoRenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoImpuestoRenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoImpuestoRenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoImpuestoRenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoImpuestoRenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoImpuestoRenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoImpuestoRenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoImpuestoRenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoImpuestoRenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesoimpuestorentaConstantesFunciones.getsFinalQueryProcesoImpuestoRenta();
		String  finalQueryPaginacionTodos=this.procesoimpuestorentaConstantesFunciones.getsFinalQueryProcesoImpuestoRenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoImpuestoRentaConstantesFunciones.getArrayColumnasGlobalesNoProcesoImpuestoRenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoImpuestoRentaConstantesFunciones.getArrayColumnasGlobalesProcesoImpuestoRenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoImpuestoRentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesoimpuestorentasEliminados= new ArrayList<ProcesoImpuestoRenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoImpuestoRenta();
		
				///*ProcesoImpuestoRentaSessionBean*/this.procesoimpuestorentaSessionBean=new ProcesoImpuestoRentaSessionBean();
			
			if(this.procesoimpuestorentaSessionBean==null) {
				this.procesoimpuestorentaSessionBean=new ProcesoImpuestoRentaSessionBean();
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
					this.iNumeroPaginacion=ProcesoImpuestoRentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoImpuestoRentaConstantesFunciones.getClassesForeignKeysOfProcesoImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesoimpuestorenta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesoimpuestorentasAux= new ArrayList<ProcesoImpuestoRenta>();
			
				
			procesoimpuestorentaLogic.setDatosCliente(this.datosCliente);
			procesoimpuestorentaLogic.setDatosDeep(this.datosDeep);
			procesoimpuestorentaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoImpuestoRenta")) {
				this.sDetalleReporte=ProcesoImpuestoRentaConstantesFunciones.getDetalleIndiceBusquedaProcesoImpuestoRenta(id_anioBusquedaProcesoImpuestoRenta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesoimpuestorentaLogic.getProcesoImpuestoRentasBusquedaProcesoImpuestoRenta(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoImpuestoRenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoImpuestoRentaConstantesFunciones.getDetalleIndiceBusquedaProcesoImpuestoRenta(id_anioBusquedaProcesoImpuestoRenta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoImpuestoRentaConstantesFunciones.getDetalleIndiceBusquedaProcesoImpuestoRenta(id_anioBusquedaProcesoImpuestoRenta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesoimpuestorentaLogic.getProcesoImpuestoRentas()==null||procesoimpuestorentaLogic.getProcesoImpuestoRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesoimpuestorentas==null|| procesoimpuestorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoimpuestorentasAux=new ArrayList<ProcesoImpuestoRenta>();
						procesoimpuestorentasAux.addAll(procesoimpuestorentaLogic.getProcesoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoimpuestorentasAux=new ArrayList<ProcesoImpuestoRenta>();
							procesoimpuestorentasAux.addAll(procesoimpuestorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesoimpuestorentaLogic.getProcesoImpuestoRentasBusquedaProcesoImpuestoRenta(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoImpuestoRenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoImpuestoRentaConstantesFunciones.getDetalleIndiceBusquedaProcesoImpuestoRenta(id_anioBusquedaProcesoImpuestoRenta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoImpuestoRentaConstantesFunciones.getDetalleIndiceBusquedaProcesoImpuestoRenta(id_anioBusquedaProcesoImpuestoRenta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoImpuestoRentas("BusquedaProcesoImpuestoRenta",procesoimpuestorentaLogic.getProcesoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoImpuestoRentas("BusquedaProcesoImpuestoRenta",procesoimpuestorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoimpuestorentaLogic.setProcesoImpuestoRentas(new ArrayList<ProcesoImpuestoRenta>());
						procesoimpuestorentaLogic.getProcesoImpuestoRentas().addAll(procesoimpuestorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoimpuestorentas=new ArrayList<ProcesoImpuestoRenta>();
							procesoimpuestorentas.addAll(procesoimpuestorentasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoImpuestoRenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoImpuestoRenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoimpuestorentaLogic.getProcesoImpuestoRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoimpuestorentas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoimpuestorentaLogic.getProcesoImpuestoRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoimpuestorentas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoImpuestoRenta procesoimpuestorenta) {
		Boolean permite=true;
		
		if(this.procesoimpuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoImpuestoRentaConstantesFunciones.getOrderByListaProcesoImpuestoRenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoImpuestoRentaConstantesFunciones.getOrderByListaProcesoImpuestoRenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoImpuestoRenta procesoimpuestorenta:procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
				if(procesoimpuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					procesoimpuestorentaTotales=procesoimpuestorenta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoImpuestoRenta procesoimpuestorenta:this.procesoimpuestorentas) {
				if(procesoimpuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					procesoimpuestorentaTotales=procesoimpuestorenta;
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
			this.procesoimpuestorentaAux=new ProcesoImpuestoRenta();
			this.procesoimpuestorentaAux.setsType(Constantes2.S_TOTALES);
			this.procesoimpuestorentaAux.setIsNew(false);
			this.procesoimpuestorentaAux.setIsChanged(false);
			this.procesoimpuestorentaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoImpuestoRentaConstantesFunciones.TotalizarValoresFilaProcesoImpuestoRenta(this.procesoimpuestorentaLogic.getProcesoImpuestoRentas(),this.procesoimpuestorentaAux);
				
				//this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().add(this.procesoimpuestorentaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoImpuestoRentaConstantesFunciones.TotalizarValoresFilaProcesoImpuestoRenta(this.procesoimpuestorentas,this.procesoimpuestorentaAux);
				
				this.procesoimpuestorentas.add(this.procesoimpuestorentaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesoimpuestorentaTotales=new ProcesoImpuestoRenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().remove(procesoimpuestorentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoimpuestorentas.remove(procesoimpuestorentaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesoimpuestorentaTotales=new ProcesoImpuestoRenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoImpuestoRenta procesoimpuestorenta:procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
				if(procesoimpuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					procesoimpuestorentaTotales=procesoimpuestorenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoImpuestoRentaConstantesFunciones.TotalizarValoresFilaProcesoImpuestoRenta(this.procesoimpuestorentaLogic.getProcesoImpuestoRentas(),procesoimpuestorentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoImpuestoRenta procesoimpuestorenta:this.procesoimpuestorentas) {
				if(procesoimpuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					procesoimpuestorentaTotales=procesoimpuestorenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoImpuestoRentaConstantesFunciones.TotalizarValoresFilaProcesoImpuestoRenta(this.procesoimpuestorentas,procesoimpuestorentaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoImpuestoRentasBusquedaProcesoImpuestoRenta()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoImpuestoRenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoImpuestoRentasFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoImpuestoRentasBusquedaProcesoImpuestoRenta(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoimpuestorentaLogic.getProcesoImpuestoRentasBusquedaProcesoImpuestoRenta(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoImpuestoRentasFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoimpuestorentaLogic.getProcesoImpuestoRentasFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosProcesoImpuestoRenta() {
		this.isPermisoTodoProcesoImpuestoRenta=false;
		this.isPermisoNuevoProcesoImpuestoRenta=false;
		this.isPermisoActualizarProcesoImpuestoRenta=false;
		this.isPermisoActualizarOriginalProcesoImpuestoRenta=false;
		this.isPermisoEliminarProcesoImpuestoRenta=false;
		this.isPermisoGuardarCambiosProcesoImpuestoRenta=false;
		this.isPermisoConsultaProcesoImpuestoRenta=true;
		this.isPermisoBusquedaProcesoImpuestoRenta=true;
		this.isPermisoReporteProcesoImpuestoRenta=true;
		this.isPermisoOrdenProcesoImpuestoRenta=false;		
		this.isPermisoPaginacionMedioProcesoImpuestoRenta=false;		
		this.isPermisoPaginacionAltoProcesoImpuestoRenta=false;		
		this.isPermisoPaginacionTodoProcesoImpuestoRenta=false;		
		this.isPermisoCopiarProcesoImpuestoRenta=false;		
		this.isPermisoVerFormProcesoImpuestoRenta=false;		
		this.isPermisoDuplicarProcesoImpuestoRenta=false;
		this.isPermisoOrdenProcesoImpuestoRenta=false;
	}
	
	public void setPermisosUsuarioProcesoImpuestoRenta(Boolean isPermiso) {
		this.isPermisoTodoProcesoImpuestoRenta=isPermiso;
		this.isPermisoNuevoProcesoImpuestoRenta=isPermiso;
		this.isPermisoActualizarProcesoImpuestoRenta=isPermiso;
		this.isPermisoActualizarOriginalProcesoImpuestoRenta=isPermiso;
		this.isPermisoEliminarProcesoImpuestoRenta=isPermiso;
		this.isPermisoGuardarCambiosProcesoImpuestoRenta=isPermiso;
		this.isPermisoConsultaProcesoImpuestoRenta=isPermiso;
		this.isPermisoBusquedaProcesoImpuestoRenta=isPermiso;
		this.isPermisoReporteProcesoImpuestoRenta=isPermiso;
		this.isPermisoOrdenProcesoImpuestoRenta=isPermiso;		
		this.isPermisoPaginacionMedioProcesoImpuestoRenta=isPermiso;		
		this.isPermisoPaginacionAltoProcesoImpuestoRenta=isPermiso;		
		this.isPermisoPaginacionTodoProcesoImpuestoRenta=isPermiso;		
		this.isPermisoCopiarProcesoImpuestoRenta=isPermiso;		
		this.isPermisoVerFormProcesoImpuestoRenta=isPermiso;		
		this.isPermisoDuplicarProcesoImpuestoRenta=isPermiso;
		this.isPermisoOrdenProcesoImpuestoRenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoImpuestoRenta(Boolean isPermiso) {
		//this.isPermisoTodoProcesoImpuestoRenta=isPermiso;
		this.isPermisoNuevoProcesoImpuestoRenta=isPermiso;
		this.isPermisoActualizarProcesoImpuestoRenta=isPermiso;
		this.isPermisoActualizarOriginalProcesoImpuestoRenta=isPermiso;
		this.isPermisoEliminarProcesoImpuestoRenta=isPermiso;
		this.isPermisoGuardarCambiosProcesoImpuestoRenta=isPermiso;
		//this.isPermisoConsultaProcesoImpuestoRenta=isPermiso;
		//this.isPermisoBusquedaProcesoImpuestoRenta=isPermiso;
		//this.isPermisoReporteProcesoImpuestoRenta=isPermiso;
		//this.isPermisoOrdenProcesoImpuestoRenta=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoImpuestoRenta=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoImpuestoRenta=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoImpuestoRenta=isPermiso;		
		//this.isPermisoCopiarProcesoImpuestoRenta=isPermiso;		
		//this.isPermisoDuplicarProcesoImpuestoRenta=isPermiso;
		//this.isPermisoOrdenProcesoImpuestoRenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoImpuestoRentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoImpuestoRenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoImpuestoRentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoImpuestoRentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoImpuestoRentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoImpuestoRentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoImpuestoRenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoImpuestoRentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoImpuestoRenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoImpuestoRenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoImpuestoRenta=this.isPermisoActualizarProcesoImpuestoRenta;
			this.isPermisoEliminarProcesoImpuestoRenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoImpuestoRenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoImpuestoRenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoImpuestoRenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoImpuestoRenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoImpuestoRenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoImpuestoRenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoImpuestoRenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoImpuestoRenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoImpuestoRenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoImpuestoRenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoImpuestoRenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoImpuestoRenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoImpuestoRenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoImpuestoRenta.setToolTipText(this.jTableDatosProcesoImpuestoRenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoImpuestoRenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoImpuestoRenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoImpuestoRenta() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyProcesoImpuestoRentaListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoImpuestoRentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoImpuestoRentaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoImpuestoRenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.procesoimpuestorentaSessionBean==null) {
				this.procesoimpuestorentaSessionBean=new ProcesoImpuestoRentaSessionBean();
			}

			if(!this.procesoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoImpuestoRenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoImpuestoRenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoImpuestoRenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoImpuestoRenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoImpuestoRenta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoImpuestoRenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoImpuestoRenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoImpuestoRenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoImpuestoRenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoImpuestoRenta()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoImpuestoRenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoImpuestoRenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta!=null && this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ProcesoImpuestoRentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoImpuestoRentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoImpuestoRentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesoimpuestorentaSessionBean=new ProcesoImpuestoRentaSessionBean(); 
		this.procesoimpuestorentaConstantesFunciones=new ProcesoImpuestoRentaConstantesFunciones(); 
		this.procesoimpuestorentaBean=new ProcesoImpuestoRenta();//(this.procesoimpuestorentaConstantesFunciones); 		
		this.procesoimpuestorentaReturnGeneral=new ProcesoImpuestoRentaParameterReturnGeneral(); 
		
		this.procesoimpuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoimpuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoImpuestoRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoImpuestoRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoImpuestoRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoImpuestoRenta(true);
			
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
			
			this.procesoimpuestorentaConstantesFunciones=new ProcesoImpuestoRentaConstantesFunciones(); 
			this.procesoimpuestorentaBean=new ProcesoImpuestoRenta();//this.procesoimpuestorentaConstantesFunciones); 			
			this.procesoimpuestorentaReturnGeneral=new ProcesoImpuestoRentaParameterReturnGeneral(); 
		
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Impuesto Renta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesoimpuestorenta=new ProcesoImpuestoRenta();
			this.procesoimpuestorentas = new ArrayList<ProcesoImpuestoRenta>();
			this.procesoimpuestorentasAux = new ArrayList<ProcesoImpuestoRenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic=new ProcesoImpuestoRentaLogic();
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			//this.procesoimpuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesoimpuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoImpuestoRenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoImpuestoRenta);	
					}
					
					if(this.jInternalFrameImportacionProcesoImpuestoRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoImpuestoRenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoImpuestoRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoImpuestoRenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoImpuestoRenta);
				this.jInternalFrameDetalleFormProcesoImpuestoRenta.setVisible(false);
				this.jInternalFrameDetalleFormProcesoImpuestoRenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta);
					this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoImpuestoRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoImpuestoRenta);
					this.jInternalFrameImportacionProcesoImpuestoRenta.setVisible(false);
					this.jInternalFrameImportacionProcesoImpuestoRenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoImpuestoRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoImpuestoRenta);
					this.jInternalFrameOrderByProcesoImpuestoRenta.setVisible(false);
					this.jInternalFrameOrderByProcesoImpuestoRenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoImpuestoRentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoImpuestoRentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesoimpuestorentaReturnGeneral=new ProcesoImpuestoRentaParameterReturnGeneral();
			
			this.procesoimpuestorentaParameterGeneral=new ProcesoImpuestoRentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesoimpuestorentaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoImpuestoRentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado(),this.procesoimpuestorentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoImpuestoRentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado(),this.procesoimpuestorentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaDuplicarProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaCopiarProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaVerFormProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaOrdenProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaModificarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=false;
			
			
			this.isVisibilidadBusquedaProcesoImpuestoRenta=true;
			this.isVisibilidadFK_IdAnio=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoImpuestoRenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoImpuestoRenta(false);
			
			this.setPermisosUsuarioProcesoImpuestoRenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado() 
				|| (this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado() && this.procesoimpuestorentaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoImpuestoRentaClasesRelacionadas();
			}
			
			if(this.procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoImpuestoRentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoImpuestoRenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoImpuestoRenta();
			}
			
			if(!this.isPermisoBusquedaProcesoImpuestoRenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoImpuestoRentaConstantesFunciones.getTiposSeleccionarProcesoImpuestoRenta());
				
				this.tiposColumnasSelect=ProcesoImpuestoRentaConstantesFunciones.getTiposSeleccionarProcesoImpuestoRenta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoImpuestoRenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoImpuestoRenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoImpuestoRenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoImpuestoRenta() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.anioLogic=new AnioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesoimpuestorentaImplementable= (ProcesoImpuestoRentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoImpuestoRentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesoimpuestorentaImplementableHome= (ProcesoImpuestoRentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoImpuestoRentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesoimpuestorentas= new ArrayList<ProcesoImpuestoRenta>();
			this.procesoimpuestorentasEliminados= new ArrayList<ProcesoImpuestoRenta>();
						
			this.isEsNuevoProcesoImpuestoRenta=false;
			this.esParaAccionDesdeFormularioProcesoImpuestoRenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoImpuestoRenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoImpuestoRenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoImpuestoRentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoImpuestoRenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoImpuestoRenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoImpuestoRenta();
			}
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoImpuestoRenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoImpuestoRenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoImpuestoRenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoImpuestoRenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoImpuestoRenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoImpuestoRenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoImpuestoRenta")) {
				iIndex=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTabbedPaneRelacionesProcesoImpuestoRenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTabbedPaneRelacionesProcesoImpuestoRenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoImpuestoRenta();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyProcesoImpuestoRenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoImpuestoRenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoImpuestoRenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoImpuestoRentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoImpuestoRenta();
		
		this.cargarCombosFrameForeignKeyProcesoImpuestoRenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoImpuestoRenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoImpuestoRenta();
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
	
	public void jButtonNuevoProcesoImpuestoRentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
			
			if(jTableDatosProcesoImpuestoRenta.getRowCount()>=1) {
				jTableDatosProcesoImpuestoRenta.removeRowSelectionInterval(0, jTableDatosProcesoImpuestoRenta.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoImpuestoRenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoImpuestoRenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoImpuestoRenta(true);			
			//this.procesoimpuestorenta=new ProcesoImpuestoRenta();
			//this.procesoimpuestorenta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoImpuestoRenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoImpuestoRenta() ;
			
			if(ProcesoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoImpuestoRenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesoimpuestorenta);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);				
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
			if(this.procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoImpuestoRenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoImpuestoRentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoImpuestoRenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoImpuestoRenta.getSelectedRows().length;			
			}
			
			procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoImpuestoRenta--;			
				//ProcesoImpuestoRenta procesoimpuestorentaAux= new ProcesoImpuestoRenta();			
				//procesoimpuestorentaAux.setId(this.iIdNuevoProcesoImpuestoRenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoImpuestoRenta procesoimpuestorentaOrigen=new ProcesoImpuestoRenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoImpuestoRenta procesoimpuestorentaOrigen : procesoimpuestorentasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesoimpuestorentaOrigen =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoimpuestorentaOrigen =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoImpuestoRenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesoimpuestorenta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoImpuestoRenta(procesoimpuestorentaOrigen,this.procesoimpuestorenta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().add(this.procesoimpuestorentaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoimpuestorentas.add(this.procesoimpuestorentaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
				
				this.jTableDatosProcesoImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoProcesoImpuestoRenta(), this.getIndiceNuevoProcesoImpuestoRenta());
				
				int iLastRow =  this.jTableDatosProcesoImpuestoRenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoImpuestoRenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoImpuestoRenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();									
		
			ProcesoImpuestoRenta procesoimpuestorentaOrigen=new ProcesoImpuestoRenta();
			ProcesoImpuestoRenta procesoimpuestorentaDestino=new ProcesoImpuestoRenta();
				
			procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoImpuestoRenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesoimpuestorentasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoImpuestoRenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoimpuestorentaOrigen =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoimpuestorentaOrigen =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoimpuestorentaDestino =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoimpuestorentaDestino =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesoimpuestorentaOrigen =procesoimpuestorentasSeleccionados.get(0);
				procesoimpuestorentaDestino =procesoimpuestorentasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoImpuestoRenta(procesoimpuestorentaOrigen,procesoimpuestorentaDestino,true,false);
				
				procesoimpuestorentaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesoimpuestorentaDestino,procesoimpuestorentaLogic.getProcesoImpuestoRentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesoimpuestorentaDestino,procesoimpuestorentas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
				
				//this.jTableDatosProcesoImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoProcesoImpuestoRenta(), this.getIndiceNuevoProcesoImpuestoRenta());
				
				int iLastRow =  this.jTableDatosProcesoImpuestoRenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoImpuestoRenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoImpuestoRenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoImpuestoRenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(!isVisible);
			this.jPanelPaginacionProcesoImpuestoRenta.setVisible(!isVisible);
			this.jPanelAccionesProcesoImpuestoRenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoImpuestoRenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoImpuestoRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoImpuestoRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoImpuestoRenta();
			
			this.abrirFrameOrderByProcesoImpuestoRenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoImpuestoRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoImpuestoRenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoImpuestoRenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoImpuestoRenta.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoImpuestoRenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoImpuestoRenta.setSize(this.jInternalFrameDetalleFormProcesoImpuestoRenta.iWidthFormulario,this.jInternalFrameDetalleFormProcesoImpuestoRenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoImpuestoRenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoImpuestoRenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoImpuestoRenta.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoImpuestoRenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoImpuestoRenta.jContentPaneDetalleProcesoImpuestoRenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTabbedPaneRelacionesProcesoImpuestoRenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoImpuestoRenta.jContentPaneDetalleProcesoImpuestoRenta.getWidth(),ProcesoImpuestoRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTabbedPaneRelacionesProcesoImpuestoRenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoImpuestoRenta.jContentPaneDetalleProcesoImpuestoRenta.getWidth(),ProcesoImpuestoRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTabbedPaneRelacionesProcesoImpuestoRenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoImpuestoRenta.jContentPaneDetalleProcesoImpuestoRenta.getWidth(),ProcesoImpuestoRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoImpuestoRenta.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoImpuestoRenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoImpuestoRenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoImpuestoRenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoImpuestoRenta,false,this);
				} else {
					this.jInternalFrameOrderByProcesoImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoImpuestoRenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoImpuestoRenta);
				this.jInternalFrameOrderByProcesoImpuestoRenta.setVisible(false);
				this.jInternalFrameOrderByProcesoImpuestoRenta.setSelected(false);
				
				this.jInternalFrameOrderByProcesoImpuestoRenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoImpuestoRenta"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoImpuestoRenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoImpuestoRenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoImpuestoRenta==null) {
				
				this.jInternalFrameImportacionProcesoImpuestoRenta=new ImportacionJInternalFrame(ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoImpuestoRenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoImpuestoRenta);
				this.jInternalFrameImportacionProcesoImpuestoRenta.setVisible(false);
				this.jInternalFrameImportacionProcesoImpuestoRenta.setSelected(false);


				this.jInternalFrameImportacionProcesoImpuestoRenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoImpuestoRenta"));
				this.jInternalFrameImportacionProcesoImpuestoRenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoImpuestoRenta"));
				this.jInternalFrameImportacionProcesoImpuestoRenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoImpuestoRenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoImpuestoRenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta==null) {
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta=new ReporteDinamicoJInternalFrame(ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoImpuestoRenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta);
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoImpuestoRenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoImpuestoRenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoImpuestoRenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoImpuestoRenta);
			
	       	this.jInternalFrameDetalleFormProcesoImpuestoRenta.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoImpuestoRenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoImpuestoRenta.dispose();
			//this.jInternalFrameDetalleFormProcesoImpuestoRenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoImpuestoRenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoImpuestoRenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoImpuestoRenta.setVisible(true);
	        this.jInternalFrameImportacionProcesoImpuestoRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoImpuestoRenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoImpuestoRenta.setVisible(true);
	        this.jInternalFrameOrderByProcesoImpuestoRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoImpuestoRenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoImpuestoRenta.setVisible(false);
	        this.jInternalFrameOrderByProcesoImpuestoRenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoImpuestoRenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoImpuestoRenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoImpuestoRenta.setVisible(false);
	        this.jInternalFrameImportacionProcesoImpuestoRenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoImpuestoRenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoImpuestoRenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoImpuestoRenta(true);
			//this.isEsNuevoProcesoImpuestoRenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoImpuestoRenta(false) ;
			
			if(procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoImpuestoRenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoImpuestoRenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoImpuestoRentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoImpuestoRenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoImpuestoRenta(true);
			//this.isEsNuevoProcesoImpuestoRenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesoimpuestorenta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoImpuestoRenta(false) ;
			
			if(ProcesoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoImpuestoRenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoImpuestoRenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoImpuestoRenta,ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoImpuestoRenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoImpuestoRenta(false);
			
			//if(!this.isEsNuevoProcesoImpuestoRenta) {								
				int intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(this.procesoimpuestorenta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);
				
			}
			
			if(this.permiteMantenimiento(this.procesoimpuestorenta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoImpuestoRenta=true;
					this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
					this.isEsNuevoProcesoImpuestoRenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoImpuestoRenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoImpuestoRenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoImpuestoRenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoImpuestoRenta(false);
				
				this.habilitarDeshabilitarControlesProcesoImpuestoRenta(false);
			
												
				
				if(ProcesoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoImpuestoRenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,procesoimpuestorentaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoImpuestoRenta(this.procesoimpuestorenta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoImpuestoRenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesoimpuestorentaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesoimpuestorenta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				this.procesoimpuestorenta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				this.procesoimpuestorenta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesoimpuestorenta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoImpuestoRentaModel) this.jTableDatosProcesoImpuestoRenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoImpuestoRenta=true;
				this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
				this.isEsNuevoProcesoImpuestoRenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoImpuestoRenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoImpuestoRenta(false);
				
				this.habilitarDeshabilitarControlesProcesoImpuestoRenta(false);
				
				
				
				if(ProcesoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoImpuestoRenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoImpuestoRenta.getRowCount()>=1) {
				jTableDatosProcesoImpuestoRenta.removeRowSelectionInterval(0, jTableDatosProcesoImpuestoRenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoImpuestoRenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoImpuestoRenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoImpuestoRenta(false) ;
			
			this.isEsNuevoProcesoImpuestoRenta=false;
			
			if(ProcesoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoImpuestoRenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoImpuestoRenta(false);
				
				//SI ES MANUAL
				if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoImpuestoRenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoImpuestoRenta--;			
			//ProcesoImpuestoRenta procesoimpuestorentaAux= new ProcesoImpuestoRenta();			
			//procesoimpuestorentaAux.setId(this.iIdNuevoProcesoImpuestoRenta);
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoImpuestoRenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);
			
			this.procesoimpuestorenta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().add(this.procesoimpuestorentaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesoimpuestorentas.add(this.procesoimpuestorentaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
			
			this.jTableDatosProcesoImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoProcesoImpuestoRenta(), this.getIndiceNuevoProcesoImpuestoRenta());
			
			int iLastRow =  this.jTableDatosProcesoImpuestoRenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoImpuestoRenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoImpuestoRenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoImpuestoRenta(false);
			
			//SI ES MANUAL
			if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoImpuestoRenta();
			}
			
			//this.abrirFrameTreeProcesoImpuestoRenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoImpuestoRenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoImpuestoRenta.setFileImportacion(this.jInternalFrameImportacionProcesoImpuestoRenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoImpuestoRenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoImpuestoRenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoImpuestoRenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoImpuestoRenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();		

		procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoImpuestoRentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoImpuestoRentaBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoImpuestoRentas("Todos",procesoimpuestorentasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();		
		
		procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoimpuestorenta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoImpuestoRentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(ProcesoImpuestoRenta procesoimpuestorenta:procesoimpuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoimpuestorenta.getanio_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProcesoImpuestoRenta(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoImpuestoRenta(procesoimpuestorentaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoImpuestoRenta(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoImpuestoRenta(false);
			
			//SI ES MANUAL
			if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoImpuestoRenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoImpuestoRenta(false);
			
			//SI ES MANUAL
			if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoImpuestoRenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoImpuestoRenta(false);
			
			//SI ES MANUAL
			if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoImpuestoRenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoImpuestoRenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoImpuestoRenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoImpuestoRenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoImpuestoRenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoImpuestoRenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoImpuestoRenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoImpuestoRenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoImpuestoRenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoImpuestoRenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoImpuestoRenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoImpuestoRenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoImpuestoRenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoImpuestoRenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoImpuestoRenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoImpuestoRenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoImpuestoRenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoImpuestoRenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoImpuestoRenta();
		
		this.inicializarActualizarBindingBotonesManualProcesoImpuestoRenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoImpuestoRenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoImpuestoRenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoImpuestoRenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoImpuestoRenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoImpuestoRenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoImpuestoRenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jCheckBoxPostAccionNuevoProcesoImpuestoRenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jCheckBoxPostAccionSinCerrarProcesoImpuestoRenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jCheckBoxPostAccionSinMensajeProcesoImpuestoRenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoImpuestoRenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoImpuestoRenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
				this.jInternalFrameDetalleFormProcesoImpuestoRenta.jCheckBoxPostAccionNuevoProcesoImpuestoRenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoImpuestoRenta.jCheckBoxPostAccionSinCerrarProcesoImpuestoRenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoImpuestoRenta.jCheckBoxPostAccionSinMensajeProcesoImpuestoRenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoImpuestoRenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoImpuestoRenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoImpuestoRenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoImpuestoRenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoImpuestoRenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoImpuestoRenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoImpuestoRenta(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoImpuestoRenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoImpuestoRenta() throws Exception {
		try	{
			if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoImpuestoRenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoImpuestoRenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoImpuestoRenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoImpuestoRenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoImpuestoRenta.addItem(reporte);
			}
			
			
			if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoImpuestoRenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoImpuestoRenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoImpuestoRenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoImpuestoRenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoImpuestoRenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoImpuestoRenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta!=null) {
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta!=null) {
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoImpuestoRenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.getSelectedItem()!=null){this.id_anioBusquedaProcesoImpuestoRenta=((Anio)this.jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoImpuestoRenta(Boolean esInicializar) throws Exception {				
		if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoImpuestoRenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoImpuestoRenta() throws Exception {
		this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoImpuestoRenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoImpuestoRentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoImpuestoRentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoImpuestoRentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoImpuestoRentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoImpuestoRentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoImpuestoRentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoImpuestoRenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesoimpuestorentaLogic.getProcesoImpuestoRentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesoimpuestorentas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoImpuestoRenta.setModel(new ProcesoImpuestoRentaModel(this.procesoimpuestorentaLogic.getProcesoImpuestoRentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoImpuestoRenta.setModel(new ProcesoImpuestoRentaModel(this.procesoimpuestorentas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoImpuestoRenta!=null && this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoImpuestoRenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoImpuestoRenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoImpuestoRentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,procesoimpuestorentaConstantesFunciones.resaltarSeleccionarProcesoImpuestoRenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,procesoimpuestorentaConstantesFunciones.resaltarSeleccionarProcesoImpuestoRenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoImpuestoRenta,ProcesoImpuestoRentaConstantesFunciones.LABEL_ID));

		if(this.procesoimpuestorentaConstantesFunciones.mostraridProcesoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoImpuestoRentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesoimpuestorentaConstantesFunciones.resaltaridProcesoImpuestoRenta,this.procesoimpuestorentaConstantesFunciones.activaridProcesoImpuestoRenta,this,true,"idProcesoImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesoimpuestorentaConstantesFunciones.resaltaridProcesoImpuestoRenta,this.procesoimpuestorentaConstantesFunciones.activaridProcesoImpuestoRenta,this,true,"idProcesoImpuestoRenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoImpuestoRenta,ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO));

		if(this.procesoimpuestorentaConstantesFunciones.mostrarid_anioProcesoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.procesoimpuestorentaConstantesFunciones.resaltarid_anioProcesoImpuestoRenta,this,this.procesoimpuestorentaConstantesFunciones.activarid_anioProcesoImpuestoRenta));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.procesoimpuestorentaConstantesFunciones.resaltarid_anioProcesoImpuestoRenta,this,this.procesoimpuestorentaConstantesFunciones.activarid_anioProcesoImpuestoRenta,true,"id_anioProcesoImpuestoRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoImpuestoRenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoImpuestoRenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoImpuestoRenta.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoImpuestoRenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoImpuestoRenta.moveColumn(this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoImpuestoRenta.moveColumn(this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoImpuestoRenta.moveColumn(this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoImpuestoRenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoImpuestoRenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoImpuestoRenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoImpuestoRenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoImpuestoRenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoImpuestoRenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesoimpuestorentaLogic.getProcesoImpuestoRentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesoimpuestorentas.size()-1;
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
		//this.jTableDatosProcesoImpuestoRenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoImpuestoRenta();
			
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
				
				//this.isEsNuevoProcesoImpuestoRenta=false;
					
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
				if(this.procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoImpuestoRenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoImpuestoRenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesoimpuestorenta.getsType().equals("DUPLICADO")
				   || this.procesoimpuestorenta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoImpuestoRenta=true;
				
				} else {
					this.isEsNuevoProcesoImpuestoRenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					if(this.procesoimpuestorenta.getId()>=0 && !this.procesoimpuestorenta.getIsNew()) {						
						this.isEsNuevoProcesoImpuestoRenta=false;
						
					} else {
						this.isEsNuevoProcesoImpuestoRenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoImpuestoRenta(esRelaciones);						
				
				this.seleccionarProcesoImpuestoRenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesoimpuestorenta.getId()<0) {
					this.isEsNuevoProcesoImpuestoRenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoImpuestoRenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoImpuestoRenta(evt,rowIndex);
				}	
				
				if(this.procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoImpuestoRenta: " + this.dDif); 
					}
				}								
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoImpuestoRenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesoimpuestorenta)) {
					if(this.procesoimpuestorenta.getId()>0) {
						this.procesoimpuestorenta.setIsDeleted(true);
						
						this.procesoimpuestorentasEliminados.add(this.procesoimpuestorenta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().remove(this.procesoimpuestorenta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoimpuestorentas.remove(this.procesoimpuestorenta);				
					}
					
					
					((ProcesoImpuestoRentaModel) this.jTableDatosProcesoImpuestoRenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoImpuestoRenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoImpuestoRenta) {
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoImpuestoRenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoImpuestoRenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoImpuestoRenta(this.procesoimpuestorenta);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.procesoimpuestorentaConstantesFunciones.cargarid_anioProcesoImpuestoRenta || this.procesoimpuestorentaConstantesFunciones.event_dependid_anioProcesoImpuestoRenta) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.procesoimpuestorenta.getid_anio());
									//this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(procesoimpuestorenta.getAnio()!=null) {
							this.aniosForeignKey.add(procesoimpuestorenta.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.procesoimpuestorenta.getid_anio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoImpuestoRenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoImpuestoRenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoImpuestoRenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoImpuestoRenta(procesoimpuestorenta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoImpuestoRenta(procesoimpuestorenta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoImpuestoRenta(procesoimpuestorenta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoImpuestoRenta(procesoimpuestorenta);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.setText(procesoimpuestorenta.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoImpuestoRenta procesoimpuestorentaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesoimpuestorentaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoImpuestoRenta procesoimpuestorentaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesoimpuestorentaLocal=this.procesoimpuestorenta;
			} else {
				procesoimpuestorentaLocal=this.procesoimpuestorentaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesoimpuestorentaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoImpuestoRenta(procesoimpuestorentaLocal,true);
					
					if(procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesoimpuestorentaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesoimpuestorentaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(procesoimpuestorenta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(procesoimpuestorenta);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(procesoimpuestorenta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.getText()==null || this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.getText()=="" || this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.setText("0");
			}

			if(conColumnasBase) {procesoimpuestorenta.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoImpuestoRentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelIdProcesoImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorentaBean,ProcesoImpuestoRenta procesoimpuestorenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorentaOrigen,ProcesoImpuestoRenta procesoimpuestorenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoimpuestorentaOrigen.getId()!=null && !procesoimpuestorentaOrigen.getId().equals(0L))) {procesoimpuestorenta.setId(procesoimpuestorentaOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.setText(procesoimpuestorenta.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoImpuestoRenta(ProcesoImpuestoRentaBean procesoimpuestorentaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.setText(procesoimpuestorentaBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoImpuestoRenta(ProcesoImpuestoRentaParameterReturnGeneral procesoimpuestorentaReturnGeneral,ProcesoImpuestoRentaBean procesoimpuestorentaBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoImpuestoRenta procesoimpuestorentaLocal=new ProcesoImpuestoRenta();
			
			procesoimpuestorentaLocal=procesoimpuestorentaReturnGeneral.getProcesoImpuestoRenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoimpuestorentaLocal.getId()!=null && !procesoimpuestorentaLocal.getId().equals(0L))) {procesoimpuestorentaBean.setId(procesoimpuestorentaLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoImpuestoRentaGenerico(Long idProcesoImpuestoRentaSeleccionado,JComboBox jComboBoxProcesoImpuestoRenta,List<ProcesoImpuestoRenta> procesoimpuestorentasLocal)throws Exception {
		try {
			ProcesoImpuestoRenta  procesoimpuestorentaTemp=null;

			for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentasLocal) {
				if(procesoimpuestorentaAux.getId()!=null && procesoimpuestorentaAux.getId().equals(idProcesoImpuestoRentaSeleccionado)) {
					procesoimpuestorentaTemp=procesoimpuestorentaAux;
					break;
				}
			}

			jComboBoxProcesoImpuestoRenta.setSelectedItem(procesoimpuestorentaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoImpuestoRentaGenerico(JComboBox jComboBoxProcesoImpuestoRenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoImpuestoRenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoImpuestoRenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoImpuestoRenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoImpuestoRenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoimpuestorenta=(ProcesoImpuestoRenta) procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoimpuestorenta =(ProcesoImpuestoRenta) procesoimpuestorentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!procesoimpuestorenta.getIsNew() && !procesoimpuestorenta.getIsChanged() && !procesoimpuestorenta.getIsDeleted()) {
				sDescripcion=procesoimpuestorenta.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=procesoimpuestorenta.getanio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoImpuestoRenta procesoimpuestorentaRow=new ProcesoImpuestoRenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoimpuestorentaRow=(ProcesoImpuestoRenta) procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoimpuestorentaRow=(ProcesoImpuestoRenta) procesoimpuestorentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoImpuestoRenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoProcesoImpuestoRenta && this.isPermisoNuevoProcesoImpuestoRenta));			
			this.jButtonDuplicarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaDuplicarProcesoImpuestoRenta && this.isPermisoDuplicarProcesoImpuestoRenta));			
			this.jButtonCopiarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaCopiarProcesoImpuestoRenta && this.isPermisoCopiarProcesoImpuestoRenta));
			this.jButtonVerFormProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaVerFormProcesoImpuestoRenta && this.isPermisoVerFormProcesoImpuestoRenta));
			
			this.jButtonAbrirOrderByProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenProcesoImpuestoRenta && this.isPermisoOrdenProcesoImpuestoRenta));			
			
			this.jButtonNuevoRelacionesProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta && this.isPermisoNuevoProcesoImpuestoRenta));			
			this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoProcesoImpuestoRenta && this.isPermisoNuevoProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta));
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonModificarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaModificarProcesoImpuestoRenta && this.isPermisoActualizarProcesoImpuestoRenta));	
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonActualizarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaActualizarProcesoImpuestoRenta && this.isPermisoActualizarProcesoImpuestoRenta));	
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonEliminarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaEliminarProcesoImpuestoRenta && this.isPermisoEliminarProcesoImpuestoRenta));
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonCancelarProcesoImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarProcesoImpuestoRenta);							
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoProcesoImpuestoRenta && this.isPermisoNuevoProcesoImpuestoRenta));						
			this.jButtonDuplicarToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaDuplicarProcesoImpuestoRenta && this.isPermisoDuplicarProcesoImpuestoRenta));						
			this.jButtonCopiarToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaCopiarProcesoImpuestoRenta && this.isPermisoCopiarProcesoImpuestoRenta));			
			this.jButtonVerFormToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaVerFormProcesoImpuestoRenta && this.isPermisoVerFormProcesoImpuestoRenta));			
			this.jButtonAbrirOrderByToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenProcesoImpuestoRenta && this.isPermisoOrdenProcesoImpuestoRenta));
			this.jButtonNuevoRelacionesToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta && this.isPermisoNuevoProcesoImpuestoRenta));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoProcesoImpuestoRenta && this.isPermisoNuevoProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta));			
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonModificarToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaModificarProcesoImpuestoRenta && this.isPermisoActualizarProcesoImpuestoRenta));	
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonActualizarToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaActualizarProcesoImpuestoRenta  && this.isPermisoActualizarProcesoImpuestoRenta));	
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonEliminarToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaEliminarProcesoImpuestoRenta && this.isPermisoEliminarProcesoImpuestoRenta));
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonCancelarToolBarProcesoImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarProcesoImpuestoRenta);				
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoProcesoImpuestoRenta && this.isPermisoNuevoProcesoImpuestoRenta));			
			this.jMenuItemDuplicarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaDuplicarProcesoImpuestoRenta && this.isPermisoDuplicarProcesoImpuestoRenta));			
			this.jMenuItemCopiarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaCopiarProcesoImpuestoRenta && this.isPermisoCopiarProcesoImpuestoRenta));			
			this.jMenuItemVerFormProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaVerFormProcesoImpuestoRenta && this.isPermisoVerFormProcesoImpuestoRenta));			
			this.jMenuItemAbrirOrderByProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenProcesoImpuestoRenta && this.isPermisoOrdenProcesoImpuestoRenta));			
			//this.jMenuItemMostrarOcultarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenProcesoImpuestoRenta && this.isPermisoOrdenProcesoImpuestoRenta));
			this.jMenuItemDetalleAbrirOrderByProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenProcesoImpuestoRenta && this.isPermisoOrdenProcesoImpuestoRenta));			
			//this.jMenuItemDetalleMostrarOcultarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenProcesoImpuestoRenta && this.isPermisoOrdenProcesoImpuestoRenta));			
			this.jMenuItemNuevoRelacionesProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta && this.isPermisoNuevoProcesoImpuestoRenta));			
			this.jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoProcesoImpuestoRenta && this.isPermisoNuevoProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta));									
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemModificarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaModificarProcesoImpuestoRenta && this.isPermisoActualizarProcesoImpuestoRenta));	
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemActualizarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaActualizarProcesoImpuestoRenta && this.isPermisoActualizarProcesoImpuestoRenta));	
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemEliminarProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaEliminarProcesoImpuestoRenta && this.isPermisoEliminarProcesoImpuestoRenta));
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemCancelarProcesoImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarProcesoImpuestoRenta);				
			}
			
			this.jMenuItemGuardarCambiosProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta));						
			this.jMenuItemGuardarCambiosTablaProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=this.jButtonNuevoProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoImpuestoRenta=this.jButtonDuplicarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCopiarProcesoImpuestoRenta=this.jButtonCopiarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaVerFormProcesoImpuestoRenta=this.jButtonVerFormProcesoImpuestoRenta.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoImpuestoRenta=this.jButtonAbrirOrderByProcesoImpuestoRenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=this.jButtonNuevoRelacionesProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaModificarProcesoImpuestoRenta=this.jButtonModificarProcesoImpuestoRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonActualizarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonEliminarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonCancelarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosProcesoImpuestoRenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=this.jButtonNuevoToolBarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=this.jButtonNuevoRelacionesToolBarProcesoImpuestoRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			this.isVisibilidadCeldaModificarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonModificarToolBarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonActualizarToolBarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonEliminarToolBarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonCancelarToolBarProcesoImpuestoRenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=this.jButtonGuardarCambiosToolBarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=this.jButtonGuardarCambiosTablaToolBarProcesoImpuestoRenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=this.jMenuItemNuevoProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=this.jMenuItemNuevoRelacionesProcesoImpuestoRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			this.isVisibilidadCeldaModificarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemModificarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemActualizarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemEliminarProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemCancelarProcesoImpuestoRenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=this.jMenuItemGuardarCambiosProcesoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=this.jMenuItemGuardarCambiosTablaProcesoImpuestoRenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoImpuestoRenta(Boolean esInicializar) {
		if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
				//if(this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoImpuestoRenta();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoImpuestoRenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoImpuestoRenta() {
		this.jButtonNuevoProcesoImpuestoRenta.setVisible(this.isPermisoNuevoProcesoImpuestoRenta);			
		this.jButtonDuplicarProcesoImpuestoRenta.setVisible(this.isPermisoDuplicarProcesoImpuestoRenta);			
		this.jButtonCopiarProcesoImpuestoRenta.setVisible(this.isPermisoCopiarProcesoImpuestoRenta);			
		this.jButtonVerFormProcesoImpuestoRenta.setVisible(this.isPermisoVerFormProcesoImpuestoRenta);			
		
		this.jButtonAbrirOrderByProcesoImpuestoRenta.setVisible(this.isPermisoOrdenProcesoImpuestoRenta);					
		
		this.jButtonNuevoRelacionesProcesoImpuestoRenta.setVisible(this.isPermisoNuevoProcesoImpuestoRenta);			
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonModificarProcesoImpuestoRenta.setVisible(this.isPermisoActualizarProcesoImpuestoRenta);	
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonActualizarProcesoImpuestoRenta.setVisible(this.isPermisoActualizarProcesoImpuestoRenta);	
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonEliminarProcesoImpuestoRenta.setVisible(this.isPermisoEliminarProcesoImpuestoRenta);
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonCancelarProcesoImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarProcesoImpuestoRenta);						
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosProcesoImpuestoRenta.setVisible(this.isPermisoGuardarCambiosProcesoImpuestoRenta);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.setVisible(this.isPermisoActualizarProcesoImpuestoRenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoImpuestoRenta() {
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonModificarProcesoImpuestoRenta.setVisible(this.isPermisoActualizarProcesoImpuestoRenta);	
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonActualizarProcesoImpuestoRenta.setVisible(this.isPermisoActualizarProcesoImpuestoRenta);	
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonEliminarProcesoImpuestoRenta.setVisible(this.isPermisoEliminarProcesoImpuestoRenta);
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonCancelarProcesoImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarProcesoImpuestoRenta);							
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosProcesoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarProcesoImpuestoRenta && this.isPermisoGuardarCambiosProcesoImpuestoRenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoImpuestoRenta() {
		if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoImpuestoRenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoImpuestoRenta() {
	}
	
	public void jTableDatosProcesoImpuestoRentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoImpuestoRenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(this.getprocesoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoimpuestorenta==null) {
						this.procesoimpuestorenta = new ProcesoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(this.procesoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);
				}

				if(this.procesoimpuestorenta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesoimpuestorenta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioProcesoImpuestoRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebProcesoImpuestoRenta(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoImpuestoRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoImpuestoRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(this.getprocesoimpuestorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.procesoimpuestorentaLogic.getConnexion());

				if(this.procesoimpuestorenta.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.procesoimpuestorenta.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoImpuestoRenta=(TitledBorder)this.jScrollPanelDatosProcesoImpuestoRenta.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderProcesoImpuestoRenta.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioProcesoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(this.getprocesoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoimpuestorenta==null) {
						this.procesoimpuestorenta = new ProcesoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(this.procesoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);
				}

				if(this.procesoimpuestorenta.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.procesoimpuestorenta.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);

			this.getProcesoImpuestoRentasBusquedaProcesoImpuestoRenta();

			this.inicializarActualizarBindingProcesoImpuestoRenta(false);

			//if(ProcesoImpuestoRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioProcesoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);

			this.getProcesoImpuestoRentasFK_IdAnio();

			this.inicializarActualizarBindingProcesoImpuestoRenta(false);

			//if(ProcesoImpuestoRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoImpuestoRenta() {
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.dispose();
			this.jInternalFrameDetalleFormProcesoImpuestoRenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta!=null) {
			this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.dispose();
			this.jInternalFrameReporteDinamicoProcesoImpuestoRenta=null;
		}
		
		if(this.jInternalFrameImportacionProcesoImpuestoRenta!=null) {
			this.jInternalFrameImportacionProcesoImpuestoRenta.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoImpuestoRenta.dispose();
			this.jInternalFrameImportacionProcesoImpuestoRenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoImpuestoRenta();
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoImpuestoRenta")) {
				jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoImpuestoRenta")) {
				jButtonDuplicarProcesoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoImpuestoRenta")) {
				jButtonCopiarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoImpuestoRenta")) {
				jButtonVerFormProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoImpuestoRenta")) {
				jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoImpuestoRenta")) {
				jButtonDuplicarProcesoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoImpuestoRenta")) {
				jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoImpuestoRenta")) {
				jButtonDuplicarProcesoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoImpuestoRenta")) {
				jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoImpuestoRenta")) {
				jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoImpuestoRenta")) {
				jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoImpuestoRenta")) {
				jButtonModificarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoImpuestoRenta")) {
				jButtonModificarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoImpuestoRenta")) {
				jButtonModificarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoImpuestoRenta")) {
				jButtonActualizarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoImpuestoRenta")) {
				jButtonActualizarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoImpuestoRenta")) {
				jButtonActualizarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoImpuestoRenta")) {
				jButtonEliminarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoImpuestoRenta")) {
				jButtonEliminarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoImpuestoRenta")) {
				jButtonEliminarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoImpuestoRenta")) {
				jButtonCancelarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoImpuestoRenta")) {
				jButtonCancelarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoImpuestoRenta")) {
				jButtonCancelarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoImpuestoRenta")) {
				jButtonCerrarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoImpuestoRenta")) {
				jButtonCerrarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoImpuestoRenta")) {
				jButtonCerrarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoImpuestoRenta")) {
				jButtonMostrarOcultarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoImpuestoRenta")) {
				jButtonCancelarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoImpuestoRenta")) {
				jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoImpuestoRenta")) {
				jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoImpuestoRenta")) {
				jButtonCopiarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoImpuestoRenta")) {
				jButtonVerFormProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoImpuestoRenta")) {
				jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoImpuestoRenta")) {
				jButtonCopiarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoImpuestoRenta")) {
				jButtonVerFormProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoImpuestoRenta")) {
				jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoImpuestoRenta")) {
				jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoImpuestoRenta")) {
				jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoImpuestoRenta")) {
				jButtonRecargarInformacionProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoImpuestoRenta")) {
				jButtonRecargarInformacionProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoImpuestoRenta")) {
				jButtonRecargarInformacionProcesoImpuestoRentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoImpuestoRenta")) {
				jButtonAnterioresProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoImpuestoRenta")) {
				jButtonAnterioresProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoImpuestoRenta")) {
				jButtonAnterioresProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoImpuestoRenta")) {
				jButtonSiguientesProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoImpuestoRenta")) {
				jButtonSiguientesProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoImpuestoRenta")) {
				jButtonSiguientesProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoImpuestoRenta") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoImpuestoRenta")) {
				jButtonAbrirOrderByProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoImpuestoRenta") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoImpuestoRenta")) {
				jButtonMostrarOcultarProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoImpuestoRenta")) {
				jButtonNuevoGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoImpuestoRenta")) {
				jButtonNuevoGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoImpuestoRenta")) {
				jButtonNuevoGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoImpuestoRenta")) {
				jButtonProcesarInformacionProcesoImpuestoRentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoImpuestoRenta")) {
				jButtonCerrarReporteDinamicoProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoImpuestoRenta")) {
				jButtonGenerarReporteDinamicoProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoImpuestoRenta")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoImpuestoRenta")) {
				jButtonCerrarImportacionProcesoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoImpuestoRenta")) {
				
				jButtonGenerarImportacionProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoImpuestoRenta")) {
				
				jButtonAbrirImportacionProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoImpuestoRenta")) {
				jComboBoxTiposAccionesProcesoImpuestoRentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoImpuestoRenta")) {
				jComboBoxTiposRelacionesProcesoImpuestoRentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoImpuestoRenta")) {
				jComboBoxTiposAccionesProcesoImpuestoRentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoImpuestoRenta")) {
				
				jComboBoxTiposSeleccionarProcesoImpuestoRentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoImpuestoRenta")) {
				jTextFieldValorCampoGeneralProcesoImpuestoRentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoImpuestoRenta")) {
				jButtonAbrirOrderByProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoImpuestoRenta")) {
				jButtonAbrirOrderByProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoImpuestoRenta")) {
				jButtonCerrarOrderByProcesoImpuestoRentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoImpuestoRentaBusqueda")) {
				this.jButtonidProcesoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoImpuestoRentaUpdate")) {
				this.jButtonid_anioProcesoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoImpuestoRentaBusqueda")) {
				this.jButtonid_anioProcesoImpuestoRentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoImpuestoRentaProcesoImpuestoRenta")) {
				this.jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRentaActionPerformed(evt);
			}
			
			;
			
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoImpuestoRenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoImpuestoRentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				


				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoImpuestoRenta procesoimpuestorentaLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesoimpuestorentaLocal=this.procesoimpuestorenta;
			} else {
				procesoimpuestorentaLocal=this.procesoimpuestorentaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
							
				
				


				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
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
			
			


			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoImpuestoRentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
								
						
				


				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
								
				
				


				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoImpuestoRentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
							
				
				


				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoImpuestoRentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
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
			
			


			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoImpuestoRentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
								
				
				


				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoImpuestoRentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoImpuestoRentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoImpuestoRenta")) {
					jCheckBoxSeleccionarTodosProcesoImpuestoRentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoImpuestoRenta")) {
					jCheckBoxSeleccionadosProcesoImpuestoRentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoImpuestoRenta")) {
					
				}
				
				


				
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
												
				
				


				
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoImpuestoRentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoImpuestoRentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
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
			
			


			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoImpuestoRentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoimpuestorenta);
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
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
				
				


				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoImpuestoRenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoimpuestorentaAnterior =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoImpuestoRenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoImpuestoRentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoImpuestoRenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesoimpuestorenta =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesoimpuestorenta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoImpuestoRenta")) {
				
				}
				
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoImpuestoRenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoImpuestoRenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoImpuestoRenta")) {
			
			}
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoImpuestoRenta();
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoImpuestoRenta")) {
				jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoImpuestoRenta")) {
				jButtonDuplicarProcesoImpuestoRentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoImpuestoRenta")) {
				jButtonCopiarProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoImpuestoRenta")) {
				jButtonVerFormProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoImpuestoRenta")) {
				jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoImpuestoRenta")) {
				jButtonModificarProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoImpuestoRenta")) {
				jButtonActualizarProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoImpuestoRenta")) {
				jButtonEliminarProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoImpuestoRenta")) {
				jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoImpuestoRenta")) {
				jButtonCancelarProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoImpuestoRenta")) {
				jButtonCerrarProcesoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoImpuestoRenta")) {
				jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoImpuestoRenta")) {
				jButtonNuevoGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoImpuestoRenta")) {
				jButtonAbrirOrderByProcesoImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoImpuestoRenta")) {
				jButtonRecargarInformacionProcesoImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoImpuestoRenta")) {
				jButtonAnterioresProcesoImpuestoRentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoImpuestoRenta")) {
				jButtonSiguientesProcesoImpuestoRentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoImpuestoRentaBusqueda")) {
				this.jButtonidProcesoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoImpuestoRentaUpdate")) {
				this.jButtonid_anioProcesoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoImpuestoRentaBusqueda")) {
				this.jButtonid_anioProcesoImpuestoRentaBusquedaActionPerformed(evt);
			}
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoImpuestoRenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoImpuestoRenta")) {
				closingInternalFrameProcesoImpuestoRenta();
				
			} else if(sTipo.equals("jButtonCancelarProcesoImpuestoRenta")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoImpuestoRenta = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoImpuestoRentaBeanSwingJInternalFrame jInternalFrameParent=(ProcesoImpuestoRentaBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoImpuestoRenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoImpuestoRentaActionPerformed(null);
			}
			
			ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoimpuestorenta,new Object(),this.procesoimpuestorentaParameterGeneral,this.procesoimpuestorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoImpuestoRenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoImpuestoRenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoImpuestoRenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesoimpuestorenta)) {
			if(!esControlTabla) {
				if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(this.procesoimpuestorenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);			
				}
				
				if(this.procesoimpuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoImpuestoRenta(this.procesoimpuestorenta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoImpuestoRenta(this.procesoimpuestorentaReturnGeneral,this.procesoimpuestorentaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesoimpuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoImpuestoRenta(classes,this.procesoimpuestorentaReturnGeneral,this.procesoimpuestorentaBean,false);
					}
						
					if(this.procesoimpuestorentaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoImpuestoRenta(this.procesoimpuestorentaReturnGeneral.getProcesoImpuestoRenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoImpuestoRenta(this.procesoimpuestorentaReturnGeneral.getProcesoImpuestoRenta());	
					}
						
					if(this.procesoimpuestorentaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoImpuestoRenta(this.procesoimpuestorentaReturnGeneral.getProcesoImpuestoRenta(),classes);//this.procesoimpuestorentaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoImpuestoRenta(this.procesoimpuestorenta,classes);//this.procesoimpuestorentaBean);									
				}
			
				if(ProcesoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoImpuestoRenta(this.procesoimpuestorenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoImpuestoRenta(this.procesoimpuestorenta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesoimpuestorentaAnterior!=null) {
						this.procesoimpuestorenta=this.procesoimpuestorentaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesoimpuestorentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesoimpuestorentaReturnGeneral.getProcesoImpuestoRenta(),procesoimpuestorentaLogic.getProcesoImpuestoRentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesoimpuestorentaReturnGeneral.getProcesoImpuestoRenta(),this.procesoimpuestorentas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoImpuestoRenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoImpuestoRenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoImpuestoRenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoImpuestoRenta() throws Exception {
		
		ProcesoImpuestoRentaModel procesoimpuestorentaModel=(ProcesoImpuestoRentaModel)this.jTableDatosProcesoImpuestoRenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoimpuestorentaModel.procesoimpuestorentas=this.procesoimpuestorentaLogic.getProcesoImpuestoRentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesoimpuestorentaModel.procesoimpuestorentas=this.procesoimpuestorentas;
		}
		
		
		((ProcesoImpuestoRentaModel) this.jTableDatosProcesoImpuestoRenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoImpuestoRenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesoimpuestorentaAnterior(),this.procesoimpuestorentaLogic.getProcesoImpuestoRentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesoimpuestorentaAnterior(),this.procesoimpuestorentas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoImpuestoRenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
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
										
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoimpuestorenta,new Object(),generalEntityParameterGeneral,this.procesoimpuestorentaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoImpuestoRentaConstantesFunciones.getClassesRelationshipsOfProcesoImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoImpuestoRentaConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoImpuestoRenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoImpuestoRenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoimpuestorenta,new Object(),generalEntityParameterGeneral,this.procesoimpuestorentaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoImpuestoRenta(ProcesoImpuestoRentaBean procesoimpuestorentaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoImpuestoRenta(ArrayList<Classe> classes,ProcesoImpuestoRentaReturnGeneral procesoimpuestorentaReturnGeneral,ProcesoImpuestoRentaBean procesoimpuestorentaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesoimpuestorenta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta = new ProcesoImpuestoRentaDetalleFormJInternalFrame(jDesktopPane,this.procesoimpuestorentaSessionBean.getConGuardarRelaciones(),this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoImpuestoRenta);
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.setVisible(false);
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.procesoimpuestorentaLogic=this.procesoimpuestorentaLogic;
		
		this.cargarCombosFrameForeignKeyProcesoImpuestoRenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoImpuestoRenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoImpuestoRenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoImpuestoRenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoImpuestoRenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoImpuestoRenta"));
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonModificarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarProcesoImpuestoRenta"));

		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonModificarToolBarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoImpuestoRenta"));
					
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemModificarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonActualizarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"ActualizarProcesoImpuestoRenta"));
		
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonActualizarToolBarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoImpuestoRenta"));
						
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemActualizarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonEliminarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarProcesoImpuestoRenta"));
		
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonEliminarToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoImpuestoRenta"));
								
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemEliminarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonCancelarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarProcesoImpuestoRenta"));
		
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonCancelarToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoImpuestoRenta"));
					
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemCancelarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoImpuestoRenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemDetalleCerrarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoImpuestoRenta"));
		
		
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoImpuestoRenta"));
		
		
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoImpuestoRenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonidProcesoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonid_anioProcesoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonid_anioProcesoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoImpuestoRentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTabbedPaneRelacionesProcesoImpuestoRenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoImpuestoRenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoImpuestoRenta"));
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoImpuestoRenta"));
		}
		
		this.jTableDatosProcesoImpuestoRenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoImpuestoRenta"));
		
		this.jTableDatosProcesoImpuestoRenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoImpuestoRenta"));
		
		this.jButtonNuevoProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"NuevoProcesoImpuestoRenta"));
		
		this.jButtonDuplicarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"DuplicarProcesoImpuestoRenta"));
		
		this.jButtonCopiarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"CopiarProcesoImpuestoRenta"));
		
		this.jButtonVerFormProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"VerFormProcesoImpuestoRenta"));
		
		
		this.jButtonNuevoToolBarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoImpuestoRenta"));
			
		this.jButtonDuplicarToolBarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoImpuestoRenta"));
			
		this.jMenuItemNuevoProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoImpuestoRenta"));
			
		this.jMenuItemDuplicarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoImpuestoRenta"));		
		
		
		this.jButtonNuevoRelacionesProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoImpuestoRenta"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoImpuestoRenta"));
			
		this.jMenuItemNuevoRelacionesProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoImpuestoRenta"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonModificarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarProcesoImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonModificarToolBarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoImpuestoRenta"));
			
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemModificarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonActualizarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"ActualizarProcesoImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonActualizarToolBarProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoImpuestoRenta"));
				
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemActualizarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonEliminarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarProcesoImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonEliminarToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoImpuestoRenta"));
						
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemEliminarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonCancelarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarProcesoImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonCancelarToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoImpuestoRenta"));
			
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemCancelarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoImpuestoRenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoImpuestoRenta"));		
		
		
		this.jButtonCerrarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CerrarProcesoImpuestoRenta"));
		
		
		this.jButtonCerrarToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoImpuestoRenta"));
			
		this.jMenuItemCerrarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoImpuestoRenta"));
			
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jMenuItemDetalleCerrarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoImpuestoRenta"));
		}
		
		this.jButtonCopiarToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoImpuestoRenta"));
			
		this.jButtonVerFormToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoImpuestoRenta"));
		
		this.jMenuItemGuardarCambiosProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoImpuestoRenta"));
			
		this.jMenuItemCopiarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoImpuestoRenta"));		
		
		this.jMenuItemVerFormProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoImpuestoRenta"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoImpuestoRenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoImpuestoRenta"));
			
		this.jMenuItemGuardarCambiosTablaProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoImpuestoRenta"));		
		
		
		
		this.jButtonRecargarInformacionProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoImpuestoRenta"));
					
		this.jButtonRecargarInformacionToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoImpuestoRenta"));
		
		this.jMenuItemRecargarInformacionProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoImpuestoRenta"));		
		
		
		
		this.jButtonAnterioresProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"AnterioresProcesoImpuestoRenta"));
		
		
		this.jButtonAnterioresToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoImpuestoRenta"));
		
		this.jMenuItemAnterioresProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoImpuestoRenta"));		
		
		
		this.jButtonSiguientesProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"SiguientesProcesoImpuestoRenta"));
		
		
		this.jButtonSiguientesToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoImpuestoRenta"));
			
		this.jMenuItemSiguientesProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoImpuestoRenta"));
			
		this.jMenuItemAbrirOrderByProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoImpuestoRenta"));
			
		this.jMenuItemMostrarOcultarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoImpuestoRenta"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoImpuestoRenta"));
			
		this.jMenuItemDetalleMostarOcultarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoImpuestoRenta"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoImpuestoRenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoImpuestoRenta"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoImpuestoRenta"));		
		
		
		this.jButtonProcesarInformacionProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoImpuestoRenta"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoImpuestoRenta"));

		this.jCheckBoxSeleccionadosProcesoImpuestoRenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoImpuestoRenta"));
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoImpuestoRenta"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoImpuestoRenta"));
			
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoImpuestoRenta"));
					
		this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoImpuestoRenta"));
			
		this.jTextFieldValorCampoGeneralProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoImpuestoRenta"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonidProcesoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonid_anioProcesoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonid_anioProcesoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoImpuestoRentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"BusquedaProcesoImpuestoRentaProcesoImpuestoRenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoImpuestoRenta!=null) {
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoImpuestoRenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoImpuestoRenta"));				
			//this.jButtonGenerarReporteDinamicoProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoImpuestoRenta"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoImpuestoRenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoImpuestoRenta!=null) {
				this.jInternalFrameImportacionProcesoImpuestoRenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoImpuestoRenta"));
				this.jInternalFrameImportacionProcesoImpuestoRenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoImpuestoRenta"));
				this.jInternalFrameImportacionProcesoImpuestoRenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoImpuestoRenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoImpuestoRenta"));
			
			this.jButtonAbrirOrderByToolBarProcesoImpuestoRenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoImpuestoRenta"));			
			
			if(this.jInternalFrameOrderByProcesoImpuestoRenta!=null) {
				this.jInternalFrameOrderByProcesoImpuestoRenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoImpuestoRenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta.jTabbedPaneRelacionesProcesoImpuestoRenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoImpuestoRenta"));
		
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
            		closingInternalFrameProcesoImpuestoRenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoImpuestoRenta = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoImpuestoRentaBeanSwingJInternalFrame jInternalFrameParent=(ProcesoImpuestoRentaBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoImpuestoRenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoImpuestoRentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoImpuestoRenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoImpuestoRentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoImpuestoRenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoImpuestoRenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoImpuestoRenta";
		inputMap = this.jButtonNuevoProcesoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoImpuestoRenta";
		inputMap = this.jButtonNuevoRelacionesProcesoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoImpuestoRentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoImpuestoRenta";
		inputMap = this.jButtonModificarProcesoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoImpuestoRenta";
		inputMap = this.jButtonActualizarProcesoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoImpuestoRenta";
		inputMap = this.jButtonEliminarProcesoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoImpuestoRenta";
		inputMap = this.jButtonCancelarProcesoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoImpuestoRenta";
		inputMap = this.jButtonCerrarProcesoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoImpuestoRenta";
		inputMap = this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosProcesoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonGuardarCambiosProcesoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoImpuestoRentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoImpuestoRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoImpuestoRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoImpuestoRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoImpuestoRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoImpuestoRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonidProcesoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonid_anioProcesoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jButtonid_anioProcesoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoImpuestoRentaBusqueda"));
		
		
		this.jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.addActionListener(new ButtonActionListener(this,"BusquedaProcesoImpuestoRentaProcesoImpuestoRenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoImpuestoRentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoImpuestoRenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
					procesoimpuestorentaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentas) {
					procesoimpuestorentaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoImpuestoRentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
						procesoimpuestorentaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentas) {
						procesoimpuestorentaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoImpuestoRenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoImpuestoRenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoImpuestoRenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoImpuestoRentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoImpuestoRenta.getSelectedRows();
			
			ProcesoImpuestoRenta procesoimpuestorentaLocal=new ProcesoImpuestoRenta();
			
			//this.seleccionarTodosProcesoImpuestoRenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesoimpuestorentaLocal =(ProcesoImpuestoRenta) this.procesoimpuestorentaLogic.getProcesoImpuestoRentas().toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesoimpuestorentaLocal =(ProcesoImpuestoRenta) this.procesoimpuestorentas.toArray()[this.jTableDatosProcesoImpuestoRenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesoimpuestorentaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
						procesoimpuestorentaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentas) {
						procesoimpuestorentaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoImpuestoRenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoImpuestoRenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoImpuestoRenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoImpuestoRentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoImpuestoRentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoImpuestoRentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoImpuestoRenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentas) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoImpuestoRentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoImpuestoRenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoImpuestoRenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoImpuestoRenta) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoImpuestoRenta(conSplash);
				
					this.generarReporteProcesoImpuestoRentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoImpuestoRentasSeleccionados();
				//this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoImpuestoRentasSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoImpuestoRentasSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoImpuestoRenta();
				
				this.exportarProcesoImpuestoRentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoImpuestoRentas();
				//this.importarProcesoImpuestoRentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoImpuestoRenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoImpuestoRentasSeleccionados();
				//this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoImpuestoRenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoImpuestoRenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoImpuestoRenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoImpuestoRentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoImpuestoRenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoImpuestoRenta(conSplash);
					
						//this.actualizarParametrosGeneralProcesoImpuestoRenta();
						
						this.generarReporteProcesoAccionProcesoImpuestoRentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Impuesto RentaS SELECCIONADOS?", "MANTENIMIENTO DE Proceso Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoImpuestoRenta();
				
						this.actualizarParametrosGeneralProcesoImpuestoRenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesoimpuestorentaReturnGeneral=procesoimpuestorentaLogic.procesarAccionProcesoImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesoimpuestorentaLogic.getProcesoImpuestoRentas(),this.procesoimpuestorentaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoImpuestoRentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoImpuestoRenta();
					
					ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoImpuestoRentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoImpuestoRenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoImpuestoRenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoImpuestoRentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoImpuestoRenta();
			
			if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();		
			ProcesoImpuestoRenta procesoimpuestorenta=new ProcesoImpuestoRenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoImpuestoRenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoImpuestoRenta.getSelectedItem();
			
			
			
			
			procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesoimpuestorentasSeleccionados.size()==1) {
				for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentasSeleccionados) {
					procesoimpuestorenta=procesoimpuestorentaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoImpuestoRenta();
			
      		//this.finishProcessProcesoImpuestoRenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoImpuestoRentaReturnGeneral() throws Exception {
		if(this.procesoimpuestorentaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesoimpuestorentaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesoimpuestorentaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesoimpuestorentaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesoimpuestorentaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesoimpuestorentaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoImpuestoRenta(false);
		}
		
		if(this.procesoimpuestorentaReturnGeneral.getConRetornoLista() || this.procesoimpuestorentaReturnGeneral.getConRetornoObjeto()) {
			if(this.procesoimpuestorentaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesoimpuestorentaLogic.setProcesoImpuestoRentas(this.procesoimpuestorentaReturnGeneral.getProcesoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoImpuestoRenta(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoImpuestoRenta() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoImpuestoRenta> getProcesoImpuestoRentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoImpuestoRenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentaLogic.getProcesoImpuestoRentas()) {
					if(procesoimpuestorentaAux.getIsSelected()) {
						procesoimpuestorentasSeleccionados.add(procesoimpuestorentaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoImpuestoRenta procesoimpuestorentaAux:this.procesoimpuestorentas) {
					if(procesoimpuestorentaAux.getIsSelected()) {
						procesoimpuestorentasSeleccionados.add(procesoimpuestorentaAux);				
					}
				}
			}
			
			if(procesoimpuestorentasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesoimpuestorentasSeleccionados.addAll(this.procesoimpuestorentaLogic.getProcesoImpuestoRentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesoimpuestorentasSeleccionados.addAll(this.procesoimpuestorentas);				
					}
				}
			}
		} else {
			procesoimpuestorentasSeleccionados.add(this.procesoimpuestorenta);
		}
		
		return procesoimpuestorentasSeleccionados;
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
	
	public void generarReporteProcesoImpuestoRentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoImpuestoRentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoImpuestoRentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoImpuestoRentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoImpuestoRentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Impuesto Renta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();		
		
		procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoImpuestoRentas("Todos",procesoimpuestorentasSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();		
		
		procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoImpuestoRentas("Todos",procesoimpuestorentasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoImpuestoRentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();
		
		procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoImpuestoRentas("Todos",procesoimpuestorentasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoImpuestoRenta();
		
		
		procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoImpuestoRenta();
		
		
		//this.generarReporteProcesoImpuestoRentas("Todos",procesoimpuestorentasSeleccionados ,procesoimpuestorentaImplementable,procesoimpuestorentaImplementableHome);
	}
	
	public void mostrarImportacionProcesoImpuestoRentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoImpuestoRenta();
		
		this.abrirFrameImportacionProcesoImpuestoRenta();		
		
			
		//this.generarReporteProcesoImpuestoRentas("Todos",procesoimpuestorentasSeleccionados ,procesoimpuestorentaImplementable,procesoimpuestorentaImplementableHome);
	}
	
	public void importarProcesoImpuestoRentas() throws Exception {		
	
	}
	
	public void exportarProcesoImpuestoRentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoImpuestoRentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoImpuestoRentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoImpuestoRentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Impuesto Renta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();		
		
		procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoimpuestorenta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoImpuestoRenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoImpuestoRenta(procesoimpuestorentaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesoimpuestorentaAux.setsDetalleGeneralEntityReporte(procesoimpuestorentaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoImpuestoRenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoImpuestoRentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoImpuestoRentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesoimpuestorenta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoimpuestorenta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoimpuestorenta.getanio_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();		
		
		procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoimpuestorenta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoImpuestoRentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoImpuestoRenta(row);				
				iRow++;
			}				
			
			for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoImpuestoRenta(procesoimpuestorentaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();		
		
		procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoimpuestorenta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesoimpuestorentas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesoimpuestorenta");
			//elementRoot.appendChild(element);
		
			for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentasSeleccionados) {
				element = document.createElement("procesoimpuestorenta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoImpuestoRenta(procesoimpuestorentaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoImpuestoRenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoImpuestoRentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoImpuestoRentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesoimpuestorenta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoimpuestorenta.getanio_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProcesoImpuestoRenta(ProcesoImpuestoRenta procesoimpuestorenta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoImpuestoRentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesoimpuestorenta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoImpuestoRentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesoimpuestorenta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementanio_descripcion = document.createElement(ProcesoImpuestoRentaConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(procesoimpuestorenta.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);
	}
	
	public void generarReporteGroupGenericoProcesoImpuestoRentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados=new ArrayList<ProcesoImpuestoRenta>();
		
		procesoimpuestorentasSeleccionados=this.getProcesoImpuestoRentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoImpuestoRenta(procesoimpuestorentasSeleccionados);
		
		this.generarReporteProcesoImpuestoRentas("Todos",procesoimpuestorentasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoImpuestoRenta(ArrayList<ProcesoImpuestoRenta> procesoimpuestorentasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoImpuestoRenta procesoimpuestorentaAux:procesoimpuestorentasSeleccionados) {
				procesoimpuestorentaAux.setsDetalleGeneralEntityReporte(procesoimpuestorentaAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					procesoimpuestorentaAux.setsDescripcionGeneralEntityReporte1(procesoimpuestorentaAux.getanio_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoImpuestoRenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaModificarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaModificarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaModificarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaModificarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaModificarProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoImpuestoRentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=true;
		} else {
			this.actualizarEstadoPanelsProcesoImpuestoRenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoImpuestoRenta=false;
			//this.isVisibilidadCeldaVerFormProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaDuplicarProcesoImpuestoRenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			if(!procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;												
			}
			
			this.jButtonCerrarProcesoImpuestoRenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;
		}
		
		if(!this.permiteMantenimiento(this.procesoimpuestorenta)) {
			this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoImpuestoRenta=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoImpuestoRenta=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoImpuestoRenta=false;
		//this.isVisibilidadCeldaModificarProcesoImpuestoRenta=true;
		this.isVisibilidadCeldaActualizarProcesoImpuestoRenta=false;
		this.isVisibilidadCeldaEliminarProcesoImpuestoRenta=false;
		//this.isVisibilidadCeldaCancelarProcesoImpuestoRenta=true;			
		this.isVisibilidadCeldaGuardarProcesoImpuestoRenta=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoImpuestoRenta() {
	}
	
	public void actualizarEstadoPanelsProcesoImpuestoRenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosProcesoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoImpuestoRenta!=null) {
				this.jPanelPaginacionProcesoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoImpuestoRenta!=null) {
				this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosProcesoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoImpuestoRenta!=null) {
				this.jPanelPaginacionProcesoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoImpuestoRenta!=null) {
				this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosProcesoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoImpuestoRenta!=null) {
				this.jPanelPaginacionProcesoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoImpuestoRenta!=null) {
				this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosProcesoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoImpuestoRenta!=null) {
				this.jPanelPaginacionProcesoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoImpuestoRenta!=null) {
				this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosProcesoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoImpuestoRenta!=null) {
				this.jPanelPaginacionProcesoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoImpuestoRenta!=null) {
				this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosProcesoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoImpuestoRenta!=null) {
				this.jPanelPaginacionProcesoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoImpuestoRenta!=null) {
				this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoImpuestoRenta!=null) {
				this.jScrollPanelDatosProcesoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoImpuestoRenta!=null) {
				this.jPanelPaginacionProcesoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoImpuestoRenta!=null) {
				this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoImpuestoRenta!=null) {
					this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoImpuestoRenta!=null) {
				this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoImpuestoRenta!=null) {
				this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaProcesoImpuestoRenta=isParaAnio;
			if(!this.isVisibilidadBusquedaProcesoImpuestoRenta) {this.jTabbedPaneBusquedasProcesoImpuestoRenta.remove(jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProcesoImpuestoRenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoImpuestoRenta() {
		this.updateBorderResaltarBusquedasFormularioProcesoImpuestoRenta();
		this.updateVisibilidadBusquedasFormularioProcesoImpuestoRenta();
		this.updateHabilitarBusquedasFormularioProcesoImpuestoRenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoImpuestoRenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoImpuestoRenta.getComponents().length>0) {
	

		if(this.procesoimpuestorentaConstantesFunciones.resaltarBusquedaProcesoImpuestoRentaProcesoImpuestoRenta!=null) {
			index= this.jTabbedPaneBusquedasProcesoImpuestoRenta.indexOfComponent(this.jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoImpuestoRenta.getComponent(index);
				jPanel.setBorder(this.procesoimpuestorentaConstantesFunciones.resaltarBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoImpuestoRenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoImpuestoRenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoImpuestoRenta.indexOfComponent(this.jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoImpuestoRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesoimpuestorentaConstantesFunciones.mostrarBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);
			if(!this.procesoimpuestorentaConstantesFunciones.mostrarBusquedaProcesoImpuestoRentaProcesoImpuestoRenta && index>-1) {
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoImpuestoRenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoImpuestoRenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoImpuestoRenta.indexOfComponent(this.jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoImpuestoRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesoimpuestorentaConstantesFunciones.activarBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);
				this.jTabbedPaneBusquedasProcesoImpuestoRenta.setEnabledAt(index,this.procesoimpuestorentaConstantesFunciones.activarBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoImpuestoRenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoImpuestoRenta")) {
			index= this.jTabbedPaneBusquedasProcesoImpuestoRenta.indexOfComponent(this.jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);

			this.jTabbedPaneBusquedasProcesoImpuestoRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoImpuestoRenta.getComponent(index);

			this.procesoimpuestorentaConstantesFunciones.setResaltarBusquedaProcesoImpuestoRentaProcesoImpuestoRenta(resaltar);

			jPanel.setBorder(this.procesoimpuestorentaConstantesFunciones.resaltarBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoImpuestoRenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoImpuestoRenta() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoImpuestoRenta();
		this.updateVisibilidadResaltarControlesFormularioProcesoImpuestoRenta();
		this.updateHabilitarResaltarControlesFormularioProcesoImpuestoRenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoImpuestoRenta() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesoimpuestorentaConstantesFunciones.resaltaridProcesoImpuestoRenta!=null && this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.setBorder(this.procesoimpuestorentaConstantesFunciones.resaltaridProcesoImpuestoRenta);}
		if(this.procesoimpuestorentaConstantesFunciones.resaltarid_anioProcesoImpuestoRenta!=null && this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.setBorder(this.procesoimpuestorentaConstantesFunciones.resaltarid_anioProcesoImpuestoRenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoImpuestoRenta() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
	
		//this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.setVisible(this.procesoimpuestorentaConstantesFunciones.mostraridProcesoImpuestoRenta);
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jPanelidProcesoImpuestoRenta.setVisible(this.procesoimpuestorentaConstantesFunciones.mostraridProcesoImpuestoRenta);
		//this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.setVisible(this.procesoimpuestorentaConstantesFunciones.mostrarid_anioProcesoImpuestoRenta);
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jPanelid_anioProcesoImpuestoRenta.setVisible(this.procesoimpuestorentaConstantesFunciones.mostrarid_anioProcesoImpuestoRenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoImpuestoRenta() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoImpuestoRenta!=null) {
	
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jLabelidProcesoImpuestoRenta.setEnabled(this.procesoimpuestorentaConstantesFunciones.activaridProcesoImpuestoRenta);
		this.jInternalFrameDetalleFormProcesoImpuestoRenta.jComboBoxid_anioProcesoImpuestoRenta.setEnabled(this.procesoimpuestorentaConstantesFunciones.activarid_anioProcesoImpuestoRenta);
		}
	}
	
		
}