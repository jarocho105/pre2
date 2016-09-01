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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;




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

import com.bydan.erp.importaciones.util.TipoTerminosImporConstantesFunciones;
import com.bydan.erp.importaciones.util.TipoTerminosImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.TipoTerminosImporParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.TipoTerminosImporBean;
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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoTerminosImporBeanSwingJInternalFrame extends TipoTerminosImporJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoTerminosImporBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoTerminosImpor> tipoterminosimporValidator = new ClassValidator<TipoTerminosImpor>(TipoTerminosImpor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoTerminosImpor tipoterminosimpor;	
	public TipoTerminosImpor tipoterminosimporAux;
	public TipoTerminosImpor tipoterminosimporAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoTerminosImpor tipoterminosimporTotales;
	public Long idTipoTerminosImporActual;
	public Long iIdNuevoTipoTerminosImpor=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoTipoTerminosImpor;
	public Boolean isPermisoNuevoTipoTerminosImpor;
	public Boolean isPermisoActualizarTipoTerminosImpor;
	public Boolean isPermisoActualizarOriginalTipoTerminosImpor;
	public Boolean isPermisoEliminarTipoTerminosImpor;
	public Boolean isPermisoGuardarCambiosTipoTerminosImpor;
	public Boolean isPermisoConsultaTipoTerminosImpor;
	public Boolean isPermisoBusquedaTipoTerminosImpor;
	public Boolean isPermisoReporteTipoTerminosImpor;
	public Boolean isPermisoPaginacionMedioTipoTerminosImpor;
	public Boolean isPermisoPaginacionAltoTipoTerminosImpor;
	public Boolean isPermisoPaginacionTodoTipoTerminosImpor;
	public Boolean isPermisoCopiarTipoTerminosImpor;
	public Boolean isPermisoVerFormTipoTerminosImpor;
	public Boolean isPermisoDuplicarTipoTerminosImpor;
	public Boolean isPermisoOrdenTipoTerminosImpor;
	
	
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
	
	public TipoTerminosImporParameterReturnGeneral tipoterminosimporReturnGeneral;
	public TipoTerminosImporParameterReturnGeneral tipoterminosimporParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoTerminosImpor=false;
	public Boolean esParaAccionDesdeFormularioTipoTerminosImpor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoTerminosImporLogic tipoterminosimporLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoTerminosImpor tipoterminosimporBean;
	public TipoTerminosImporConstantesFunciones tipoterminosimporConstantesFunciones;
	//public TipoTerminosImporParameterReturnGeneral tipoterminosimporReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoTerminosImpor> tipoterminosimpors;	
	//public List<TipoTerminosImpor> tipoterminosimporsEliminados;
	//public List<TipoTerminosImpor> tipoterminosimporsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoTerminosImpor=false;
	public Boolean isVisibilidadCeldaDuplicarTipoTerminosImpor=true;
	public Boolean isVisibilidadCeldaCopiarTipoTerminosImpor=true;
	public Boolean isVisibilidadCeldaVerFormTipoTerminosImpor=true;
	public Boolean isVisibilidadCeldaOrdenTipoTerminosImpor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=false;
	public Boolean isVisibilidadCeldaModificarTipoTerminosImpor=false;
	public Boolean isVisibilidadCeldaActualizarTipoTerminosImpor=false;
	public Boolean isVisibilidadCeldaEliminarTipoTerminosImpor=false;
	public Boolean isVisibilidadCeldaCancelarTipoTerminosImpor=false;
	public Boolean isVisibilidadCeldaGuardarTipoTerminosImpor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=false;	
	
	
	
	public Long getiIdNuevoTipoTerminosImpor() {
		return this.iIdNuevoTipoTerminosImpor;
	}

	public void setiIdNuevoTipoTerminosImpor(Long iIdNuevoTipoTerminosImpor) {
		this.iIdNuevoTipoTerminosImpor = iIdNuevoTipoTerminosImpor;
	}
	
	public Long getidTipoTerminosImporActual() {
		return this.idTipoTerminosImporActual;
	}

	public void setidTipoTerminosImporActual(Long idTipoTerminosImporActual) {
		this.idTipoTerminosImporActual = idTipoTerminosImporActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoTerminosImpor gettipoterminosimpor() {
		return this.tipoterminosimpor;
	}

	public void settipoterminosimpor(TipoTerminosImpor tipoterminosimpor) {
		this.tipoterminosimpor = tipoterminosimpor;
	}
	
	public TipoTerminosImpor gettipoterminosimporAux() {
		return this.tipoterminosimporAux;
	}

	public void settipoterminosimporAux(TipoTerminosImpor tipoterminosimporAux) {
		this.tipoterminosimporAux = tipoterminosimporAux;
	}				
	
	public TipoTerminosImpor gettipoterminosimporAnterior() {
		return this.tipoterminosimporAnterior;
	}

	public void settipoterminosimporAnterior(TipoTerminosImpor tipoterminosimporAnterior) {
		this.tipoterminosimporAnterior = tipoterminosimporAnterior;
	}	
	
	public TipoTerminosImpor gettipoterminosimporTotales() {
		return this.tipoterminosimporTotales;
	}

	public void settipoterminosimporTotales(TipoTerminosImpor tipoterminosimporTotales) {
		this.tipoterminosimporTotales = tipoterminosimporTotales;
	}	
	
	public TipoTerminosImpor gettipoterminosimporBean() {
		return this.tipoterminosimporBean;
	}

	public void settipoterminosimporBean(TipoTerminosImpor tipoterminosimporBean) {
		this.tipoterminosimporBean = tipoterminosimporBean;
	}	
	
	public TipoTerminosImporParameterReturnGeneral gettipoterminosimporReturnGeneral() {
		return this.tipoterminosimporReturnGeneral;
	}

	public void settipoterminosimporReturnGeneral(TipoTerminosImporParameterReturnGeneral tipoterminosimporReturnGeneral) {
		this.tipoterminosimporReturnGeneral = tipoterminosimporReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoTerminosImporLogic getTipoTerminosImporLogic()	{		
		return tipoterminosimporLogic;
	}

	public void setTipoTerminosImporLogic(TipoTerminosImporLogic tipoterminosimporLogic) {
		this.tipoterminosimporLogic = tipoterminosimporLogic;
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
	
	public Boolean getIsEsNuevoTipoTerminosImpor() {
		return isEsNuevoTipoTerminosImpor;
	}

	public void setIsEsNuevoTipoTerminosImpor(Boolean isEsNuevoTipoTerminosImpor) {
		this.isEsNuevoTipoTerminosImpor = isEsNuevoTipoTerminosImpor;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoTerminosImpor() {
		return esParaAccionDesdeFormularioTipoTerminosImpor;
	}
	
	public void setEsParaAccionDesdeFormularioTipoTerminosImpor(Boolean esParaAccionDesdeFormularioTipoTerminosImpor) {
		this.esParaAccionDesdeFormularioTipoTerminosImpor = esParaAccionDesdeFormularioTipoTerminosImpor;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoTerminosImpor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoTerminosImporConstantesFunciones.refrescarForeignKeysDescripcionesTipoTerminosImpor(this.tipoterminosimporLogic.getTipoTerminosImpors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoTerminosImporConstantesFunciones.refrescarForeignKeysDescripcionesTipoTerminosImpor(this.tipoterminosimpors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoterminosimporLogic.setTipoTerminosImpors(this.tipoterminosimpors);
			tipoterminosimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoTerminosImporParameterReturnGeneral getTipoTerminosImporParameterGeneral() {
		return this.tipoterminosimporParameterGeneral;
	}
	
	public void setTipoTerminosImporParameterGeneral(TipoTerminosImporParameterReturnGeneral tipoterminosimporParameterGeneral) {
		this.tipoterminosimporParameterGeneral = tipoterminosimporParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoTerminosImpor() {
		return isPermisoTodoTipoTerminosImpor;
	}

	public void setIsPermisoTodoTipoTerminosImpor(Boolean isPermisoTodoTipoTerminosImpor) {
		this.isPermisoTodoTipoTerminosImpor = isPermisoTodoTipoTerminosImpor;
	}

	public Boolean getIsPermisoNuevoTipoTerminosImpor() {
		return isPermisoNuevoTipoTerminosImpor;
	}

	public void setIsPermisoNuevoTipoTerminosImpor(Boolean isPermisoNuevoTipoTerminosImpor) {
		this.isPermisoNuevoTipoTerminosImpor = isPermisoNuevoTipoTerminosImpor;
	}

	public Boolean getIsPermisoActualizarTipoTerminosImpor() {
		return isPermisoActualizarTipoTerminosImpor;
	}

	public void setIsPermisoActualizarTipoTerminosImpor(Boolean isPermisoActualizarTipoTerminosImpor) {
		this.isPermisoActualizarTipoTerminosImpor = isPermisoActualizarTipoTerminosImpor;
	}

	public Boolean getIsPermisoEliminarTipoTerminosImpor() {
		return isPermisoEliminarTipoTerminosImpor;
	}

	public void setIsPermisoEliminarTipoTerminosImpor(Boolean isPermisoEliminarTipoTerminosImpor) {
		this.isPermisoEliminarTipoTerminosImpor = isPermisoEliminarTipoTerminosImpor;
	}

	public Boolean getIsPermisoGuardarCambiosTipoTerminosImpor() {
		return isPermisoGuardarCambiosTipoTerminosImpor;
	}

	public void setIsPermisoGuardarCambiosTipoTerminosImpor(Boolean isPermisoGuardarCambiosTipoTerminosImpor) {
		this.isPermisoGuardarCambiosTipoTerminosImpor = isPermisoGuardarCambiosTipoTerminosImpor;
	}
	
	public Boolean getIsPermisoConsultaTipoTerminosImpor() {
		return isPermisoConsultaTipoTerminosImpor;
	}

	public void setIsPermisoConsultaTipoTerminosImpor(Boolean isPermisoConsultaTipoTerminosImpor) {
		this.isPermisoConsultaTipoTerminosImpor = isPermisoConsultaTipoTerminosImpor;
	}

	public Boolean getIsPermisoBusquedaTipoTerminosImpor() {
		return isPermisoBusquedaTipoTerminosImpor;
	}

	public void setIsPermisoBusquedaTipoTerminosImpor(Boolean isPermisoBusquedaTipoTerminosImpor) {
		this.isPermisoBusquedaTipoTerminosImpor = isPermisoBusquedaTipoTerminosImpor;
	}

	public Boolean getIsPermisoReporteTipoTerminosImpor() {
		return isPermisoReporteTipoTerminosImpor;
	}

	public void setIsPermisoReporteTipoTerminosImpor(Boolean isPermisoReporteTipoTerminosImpor) {
		this.isPermisoReporteTipoTerminosImpor = isPermisoReporteTipoTerminosImpor;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoTerminosImpor() {
		return isPermisoPaginacionMedioTipoTerminosImpor;
	}

	public void setIsPermisoPaginacionMedioTipoTerminosImpor(Boolean isPermisoPaginacionMedioTipoTerminosImpor) {
		this.isPermisoPaginacionMedioTipoTerminosImpor = isPermisoPaginacionMedioTipoTerminosImpor;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoTerminosImpor() {
		return isPermisoPaginacionTodoTipoTerminosImpor;
	}

	public void setIsPermisoPaginacionTodoTipoTerminosImpor(Boolean isPermisoPaginacionTodoTipoTerminosImpor) {
		this.isPermisoPaginacionTodoTipoTerminosImpor = isPermisoPaginacionTodoTipoTerminosImpor;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoTerminosImpor() {
		return isPermisoPaginacionAltoTipoTerminosImpor;
	}

	public void setIsPermisoPaginacionAltoTipoTerminosImpor(Boolean isPermisoPaginacionAltoTipoTerminosImpor) {
		this.isPermisoPaginacionAltoTipoTerminosImpor = isPermisoPaginacionAltoTipoTerminosImpor;
	}
	
	public Boolean getIsPermisoCopiarTipoTerminosImpor() {
		return isPermisoCopiarTipoTerminosImpor;
	}

	public void setIsPermisoCopiarTipoTerminosImpor(Boolean isPermisoCopiarTipoTerminosImpor) {
		this.isPermisoCopiarTipoTerminosImpor = isPermisoCopiarTipoTerminosImpor;
	}
	
	public Boolean getIsPermisoVerFormTipoTerminosImpor() {
		return isPermisoVerFormTipoTerminosImpor;
	}

	public void setIsPermisoVerFormTipoTerminosImpor(Boolean isPermisoVerFormTipoTerminosImpor) {
		this.isPermisoVerFormTipoTerminosImpor = isPermisoVerFormTipoTerminosImpor;
	}
	
	public Boolean getIsPermisoDuplicarTipoTerminosImpor() {
		return isPermisoDuplicarTipoTerminosImpor;
	}

	public void setIsPermisoDuplicarTipoTerminosImpor(Boolean isPermisoDuplicarTipoTerminosImpor) {
		this.isPermisoDuplicarTipoTerminosImpor = isPermisoDuplicarTipoTerminosImpor;
	}
	
	public Boolean getIsPermisoOrdenTipoTerminosImpor() {
		return isPermisoOrdenTipoTerminosImpor;
	}

	public void setIsPermisoOrdenTipoTerminosImpor(Boolean isPermisoOrdenTipoTerminosImpor) {
		this.isPermisoOrdenTipoTerminosImpor = isPermisoOrdenTipoTerminosImpor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoTerminosImpor() {
		return isVisibilidadCeldaNuevoTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaNuevoTipoTerminosImpor(Boolean isVisibilidadCeldaNuevoTipoTerminosImpor) {
		this.isVisibilidadCeldaNuevoTipoTerminosImpor = isVisibilidadCeldaNuevoTipoTerminosImpor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoTerminosImpor() {
		return isVisibilidadCeldaDuplicarTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaDuplicarTipoTerminosImpor(Boolean isVisibilidadCeldaDuplicarTipoTerminosImpor) {
		this.isVisibilidadCeldaDuplicarTipoTerminosImpor = isVisibilidadCeldaDuplicarTipoTerminosImpor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoTerminosImpor() {
		return isVisibilidadCeldaCopiarTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaCopiarTipoTerminosImpor(Boolean isVisibilidadCeldaCopiarTipoTerminosImpor) {
		this.isVisibilidadCeldaCopiarTipoTerminosImpor = isVisibilidadCeldaCopiarTipoTerminosImpor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoTerminosImpor() {
		return isVisibilidadCeldaVerFormTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaVerFormTipoTerminosImpor(Boolean isVisibilidadCeldaVerFormTipoTerminosImpor) {
		this.isVisibilidadCeldaVerFormTipoTerminosImpor = isVisibilidadCeldaVerFormTipoTerminosImpor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoTerminosImpor() {
		return isVisibilidadCeldaOrdenTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaOrdenTipoTerminosImpor(Boolean isVisibilidadCeldaOrdenTipoTerminosImpor) {
		this.isVisibilidadCeldaOrdenTipoTerminosImpor = isVisibilidadCeldaOrdenTipoTerminosImpor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoTerminosImpor() {
		return isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoTerminosImpor(Boolean isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor) {
		this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor = isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoTerminosImpor() {
		return isVisibilidadCeldaModificarTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaModificarTipoTerminosImpor(Boolean isVisibilidadCeldaModificarTipoTerminosImpor) {
		this.isVisibilidadCeldaModificarTipoTerminosImpor = isVisibilidadCeldaModificarTipoTerminosImpor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoTerminosImpor() {
		return isVisibilidadCeldaActualizarTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaActualizarTipoTerminosImpor(Boolean isVisibilidadCeldaActualizarTipoTerminosImpor) {
		this.isVisibilidadCeldaActualizarTipoTerminosImpor = isVisibilidadCeldaActualizarTipoTerminosImpor;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoTerminosImpor() {
		return isVisibilidadCeldaEliminarTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaEliminarTipoTerminosImpor(Boolean isVisibilidadCeldaEliminarTipoTerminosImpor) {
		this.isVisibilidadCeldaEliminarTipoTerminosImpor = isVisibilidadCeldaEliminarTipoTerminosImpor;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoTerminosImpor() {
		return isVisibilidadCeldaCancelarTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaCancelarTipoTerminosImpor(Boolean isVisibilidadCeldaCancelarTipoTerminosImpor) {
		this.isVisibilidadCeldaCancelarTipoTerminosImpor = isVisibilidadCeldaCancelarTipoTerminosImpor;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoTerminosImpor() {
		return isVisibilidadCeldaGuardarTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaGuardarTipoTerminosImpor(Boolean isVisibilidadCeldaGuardarTipoTerminosImpor) {
		this.isVisibilidadCeldaGuardarTipoTerminosImpor = isVisibilidadCeldaGuardarTipoTerminosImpor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoTerminosImpor() {
		return isVisibilidadCeldaGuardarCambiosTipoTerminosImpor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoTerminosImpor(Boolean isVisibilidadCeldaGuardarCambiosTipoTerminosImpor) {
		this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor = isVisibilidadCeldaGuardarCambiosTipoTerminosImpor;
	}
		
	public TipoTerminosImporSessionBean gettipoterminosimporSessionBean() {
		return this.tipoterminosimporSessionBean;
	}
	
	public void settipoterminosimporSessionBean(TipoTerminosImporSessionBean tipoterminosimporSessionBean) {
		this.tipoterminosimporSessionBean=tipoterminosimporSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(TipoTerminosImpor tipoterminosimpor,TipoTerminosImpor tipoterminosimporAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoTerminosImpor(tipoterminosimpor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoterminosimporAux.setId(tipoterminosimpor.getId());
		tipoterminosimporAux.setVersionRow(tipoterminosimpor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoTerminosImpor();
		
			int intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.tipoterminosimpor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoterminosimporValidator.getInvalidValues(this.tipoterminosimpor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoterminosimporLogic.setDatosCliente(datosCliente);
			tipoterminosimporLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoterminosimporAux=new  TipoTerminosImpor();
				
				tipoterminosimporAux.setIsNew(true);
				tipoterminosimporAux.setIsChanged(true);
				
				tipoterminosimporAux.setTipoTerminosImporOriginal(this.tipoterminosimpor);
				
				tipoterminosimporAux.setId(this.tipoterminosimpor.getId());	
				tipoterminosimporAux.setVersionRow(this.tipoterminosimpor.getVersionRow());	
				tipoterminosimporAux.setcodigo(this.tipoterminosimpor.getcodigo());	
				tipoterminosimporAux.setnombre(this.tipoterminosimpor.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoterminosimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoterminosimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoterminosimporAux,tipoterminosimporLogic.getTipoTerminosImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoterminosimporAux,tipoterminosimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoterminosimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoterminosimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoterminosimporLogic.saveTipoTerminosImpors();//WithConnection
						//tipoterminosimporLogic.getSetVersionRowTipoTerminosImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoterminosimpor,tipoterminosimporAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoterminosimporAux=new  TipoTerminosImpor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoterminosimporSessionBean.getEsGuardarRelacionado() && this.tipoterminosimpor.getId()>=0)) {
						
					tipoterminosimporAux.setIsNew(false);
				}
				
				tipoterminosimporAux.setIsDeleted(false);
			
				tipoterminosimporAux.setId(this.tipoterminosimpor.getId());	
				tipoterminosimporAux.setVersionRow(this.tipoterminosimpor.getVersionRow());	
				tipoterminosimporAux.setcodigo(this.tipoterminosimpor.getcodigo());	
				tipoterminosimporAux.setnombre(this.tipoterminosimpor.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoterminosimporAux,tipoterminosimporLogic.getTipoTerminosImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoterminosimporAux,tipoterminosimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoterminosimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoterminosimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoterminosimporLogic.saveTipoTerminosImpors();//WithConnection
						//tipoterminosimporLogic.getSetVersionRowTipoTerminosImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoterminosimpor,tipoterminosimporAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoterminosimporAux=new  TipoTerminosImpor();
				
				tipoterminosimporAux.setIsNew(false);
				tipoterminosimporAux.setIsChanged(false);
				
				tipoterminosimporAux.setIsDeleted(true);
				
				tipoterminosimporAux.setId(this.tipoterminosimpor.getId());	
				tipoterminosimporAux.setVersionRow(this.tipoterminosimpor.getVersionRow());	
				tipoterminosimporAux.setcodigo(this.tipoterminosimpor.getcodigo());	
				tipoterminosimporAux.setnombre(this.tipoterminosimpor.getnombre());	
				
				if(this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoterminosimporAux.getId()>=0) {	
						this.tipoterminosimporsEliminados.add(tipoterminosimporAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoterminosimporAux,tipoterminosimporLogic.getTipoTerminosImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoterminosimporAux,tipoterminosimpors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoterminosimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoterminosimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoterminosimporLogic.saveTipoTerminosImpors();//WithConnection
						//tipoterminosimporLogic.getSetVersionRowTipoTerminosImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.getTipoTerminosImpors().addAll(this.tipoterminosimporsEliminados);
					
					tipoterminosimporLogic.saveTipoTerminosImpors();//WithConnection
					//tipoterminosimporLogic.getSetVersionRowTipoTerminosImpors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoterminosimporsEliminados= new ArrayList<TipoTerminosImpor>();		
			}
			
			if(this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Terminos GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Terminos",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoterminosimpor=tipoterminosimporAux;
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
      		//this.finishProcessTipoTerminosImpor();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoTerminosImpor tipoterminosimporLocal) throws Exception {
		
		if(this.tipoterminosimporSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoTerminosImpor tipoterminosimporLocal) throws Exception {	
		if(this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoTerminosImporActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoterminosimporValidator.getInvalidValues(this.tipoterminosimpor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoTerminosImpor tipoterminosimpor,List<TipoTerminosImpor> tipoterminosimpors) throws Exception {
		try	{		
			TipoTerminosImporConstantesFunciones.actualizarLista(tipoterminosimpor,tipoterminosimpors,this.tipoterminosimporSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoTerminosImpor tipoterminosimpor,List<TipoTerminosImpor> tipoterminosimpors) throws Exception {
		try	{			
			TipoTerminosImporConstantesFunciones.actualizarSelectedLista(tipoterminosimpor,tipoterminosimpors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoTerminosImpor> tipoterminosimporsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoterminosimporsLocal=this.tipoterminosimporLogic.getTipoTerminosImpors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoterminosimporsLocal=this.tipoterminosimpors;
			}
			//ARCHITECTURE
		
			for(TipoTerminosImpor tipoterminosimporLocal:tipoterminosimporsLocal) {
				if(this.permiteMantenimiento(tipoterminosimporLocal) && tipoterminosimporLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoTerminosImporConstantesFunciones.getTipoTerminosImporLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoTerminosImporConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTerminosImpor.jLabelcodigoTipoTerminosImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTerminosImporConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTerminosImpor.jLabelnombreTipoTerminosImpor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTerminosImpor.jLabelcodigoTipoTerminosImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTerminosImpor.jLabelnombreTipoTerminosImpor,"");
		
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
		this.iIdNuevoTipoTerminosImpor--;	
		
		
		this.tipoterminosimporAux=new TipoTerminosImpor();
		
		this.tipoterminosimporAux.setId(this.iIdNuevoTipoTerminosImpor);
		this.tipoterminosimporAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoterminosimporLogic.getTipoTerminosImpors().add(this.tipoterminosimporAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoterminosimpors.add(this.tipoterminosimporAux);
		}
		//ARCHITECTURE
		
		this.tipoterminosimpor=this.tipoterminosimporAux;
		
		if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoTerminosImpor(this.tipoterminosimpor);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTerminosImpor(this.tipoterminosimpor);
		}
				
		//this.setDefaultControlesTipoTerminosImpor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoTerminosImpor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoTerminosImpor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTerminosImpor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTerminosImpor(this.tipoterminosimporBean,this.tipoterminosimpor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoTerminosImporConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoterminosimporSessionBean.getConGuardarRelaciones()) {
			classes=TipoTerminosImporConstantesFunciones.getClassesRelationshipsOfTipoTerminosImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoterminosimporReturnGeneral=tipoterminosimporLogic.procesarEventosTipoTerminosImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoterminosimporLogic.getTipoTerminosImpors(),this.tipoterminosimpor,this.tipoterminosimporParameterGeneral,this.isEsNuevoTipoTerminosImpor,classes);//this.tipoterminosimporLogic.getTipoTerminosImpor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoTerminosImpor(this.tipoterminosimporReturnGeneral,this.tipoterminosimporBean,false);
		
		if(this.tipoterminosimporReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTerminosImpor(this.tipoterminosimporReturnGeneral.getTipoTerminosImpor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoTerminosImpor(this.tipoterminosimporReturnGeneral.getTipoTerminosImpor());
		}
		
		if(this.tipoterminosimporReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoTerminosImpor(this.tipoterminosimporReturnGeneral.getTipoTerminosImpor(),classes);//this.tipoterminosimporBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.tipoterminosimpor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoTerminosImpor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoTerminosImpor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoTerminosImpor(false);
						
			if(tipoterminosimporSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTerminosImpor();
			}
			
			this.actualizarVisualTableDatosTipoTerminosImpor();
			
			this.jTableDatosTipoTerminosImpor.setRowSelectionInterval(this.getIndiceNuevoTipoTerminosImpor(), this.getIndiceNuevoTipoTerminosImpor());
			
			this.seleccionarFilaTablaTipoTerminosImporActual();
						
			this.actualizarEstadoCeldasBotonesTipoTerminosImpor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoTerminosImpor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldcodigoTipoTerminosImpor.setEnabled(isHabilitar && this.tipoterminosimporConstantesFunciones.activarcodigoTipoTerminosImpor);
		this.jInternalFrameDetalleFormTipoTerminosImpor.jTextAreanombreTipoTerminosImpor.setEnabled(isHabilitar && this.tipoterminosimporConstantesFunciones.activarnombreTipoTerminosImpor);	
		
	};
	
	public void setDefaultControlesTipoTerminosImpor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoTerminosImpor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoterminosimporSessionBean.setConGuardarRelaciones(true);			
			this.tipoterminosimporSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTabbedPaneRelacionesTipoTerminosImpor.setVisible(true);
			
					
		} else {
			//this.tipoterminosimporSessionBean.setConGuardarRelaciones(false);			
			this.tipoterminosimporSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTabbedPaneRelacionesTipoTerminosImpor.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoTerminosImpor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimporLogic.getTipoTerminosImpors()) {
				if(tipoterminosimporAux.getId().equals(this.iIdNuevoTipoTerminosImpor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimpors) {
				if(tipoterminosimporAux.getId().equals(this.iIdNuevoTipoTerminosImpor)) {
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
	
	public int getIndiceActualTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimporLogic.getTipoTerminosImpors()) {
				if(tipoterminosimporAux.getId().equals(tipoterminosimpor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimpors) {
				if(tipoterminosimporAux.getId().equals(tipoterminosimpor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoTerminosImpor(TipoTerminosImpor tipoterminosimporOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimporLogic.getTipoTerminosImpors()) {
				if(tipoterminosimporAux.getTipoTerminosImporOriginal().getId().equals(tipoterminosimporOriginal.getId())) {
					existe=true;
					tipoterminosimporOriginal.setId(tipoterminosimporAux.getId());
					tipoterminosimporOriginal.setVersionRow(tipoterminosimporAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimpors) {
				if(tipoterminosimporAux.getTipoTerminosImporOriginal().getId().equals(tipoterminosimporOriginal.getId())) {
					existe=true;
					tipoterminosimporOriginal.setId(tipoterminosimporAux.getId());
					tipoterminosimporOriginal.setVersionRow(tipoterminosimporAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoTerminosImpor(Boolean esParaCancelar) throws Exception {
		tipoterminosimporsAux=new ArrayList<TipoTerminosImpor>();
		tipoterminosimporAux=new TipoTerminosImpor();
		
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimporLogic.getTipoTerminosImpors()) {
					if(tipoterminosimporAux.getId()<0) {
						tipoterminosimporsAux.add(tipoterminosimporAux);
					}		
				}
				this.iIdNuevoTipoTerminosImpor=0L;
				this.tipoterminosimporLogic.getTipoTerminosImpors().removeAll(tipoterminosimporsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimpors) {
					if(tipoterminosimporAux.getId()<0) {
						tipoterminosimporsAux.add(tipoterminosimporAux);
					}		
				}
				this.iIdNuevoTipoTerminosImpor=0L;
				this.tipoterminosimpors.removeAll(tipoterminosimporsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoTerminosImpor 
					&& this.tipoterminosimporLogic.getTipoTerminosImpors().size()>0
					) {
					tipoterminosimporAux=this.tipoterminosimporLogic.getTipoTerminosImpors().get(this.tipoterminosimporLogic.getTipoTerminosImpors().size() - 1);
				
					if(tipoterminosimporAux.getId()<0) {
						this.tipoterminosimporLogic.getTipoTerminosImpors().remove(tipoterminosimporAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoTerminosImpor && this.tipoterminosimpors.size()>0) {
					tipoterminosimporAux=this.tipoterminosimpors.get(this.tipoterminosimpors.size() - 1);
				
					if(tipoterminosimporAux.getId()<0) {
						this.tipoterminosimpors.remove(tipoterminosimporAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoTerminosImpor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoterminosimpor.getId()<0) {
				this.tipoterminosimporLogic.getTipoTerminosImpors().remove(this.tipoterminosimpor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoterminosimpor.getId()<0) {
				this.tipoterminosimpors.remove(this.tipoterminosimpor);
			}
		}			
	}
	
	public void setEstadosInicialesTipoTerminosImpor(List<TipoTerminosImpor> tipoterminosimporsAux) throws Exception {
		TipoTerminosImporConstantesFunciones.setEstadosInicialesTipoTerminosImpor(tipoterminosimporsAux);
	}
	
	public void setEstadosInicialesTipoTerminosImpor(TipoTerminosImpor tipoterminosimporAux) throws Exception {
		TipoTerminosImporConstantesFunciones.setEstadosInicialesTipoTerminosImpor(tipoterminosimporAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoTerminosImporActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoTerminosImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoTerminosImporActual()) {
				if(!this.isEsNuevoTipoTerminosImpor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoTerminosImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoTerminosImpor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoTerminosImporActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Terminos ?", "MANTENIMIENTO DE Tipo Terminos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoTerminosImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoTerminosImpor tipoterminosimpor) throws Exception {
		TipoTerminosImporConstantesFunciones.seleccionarAsignar(this.tipoterminosimpor,tipoterminosimpor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoTerminosImpor=this.isPermisoActualizarOriginalTipoTerminosImpor;
			
			
			this.seleccionarAsignar(tipoterminosimpor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTerminosImporConstantesFunciones.quitarEspaciosTipoTerminosImpor(this.tipoterminosimpor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoTerminosImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoterminosimporSessionBean.setsFuncionBusquedaRapida(this.tipoterminosimporSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoTerminosImpor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoTerminosImpor(esParaCancelar);				
				this.cancelarNuevoTipoTerminosImpor(esParaCancelar);								
			}
			
			this.tipoterminosimpor=new TipoTerminosImpor();
			
			this.inicializarTipoTerminosImpor();
			
			this.actualizarEstadoCeldasBotonesTipoTerminosImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoTerminosImpor() throws Exception {
		try {
			TipoTerminosImporConstantesFunciones.inicializarTipoTerminosImpor(this.tipoterminosimpor);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoterminosimporLogic.getTipoTerminosImpors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoTerminosImpors(String sAccionBusqueda,List<TipoTerminosImpor> tipoterminosimporsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoTerminosImpor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoTerminosImporMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoTerminosImporMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoTerminosImpor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Terminoss");		
		parameters.put("busquedapor", TipoTerminosImporConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoTerminosImpor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoTerminosImporConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoTerminosImporConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoTerminosImpor=new JRBeanArrayDataSource(TipoTerminosImporJInternalFrame.TraerTipoTerminosImporBeans(tipoterminosimporsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoTerminosImpor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoTerminosImporConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoTerminosImporConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoTerminosImporBean.TraerTipoTerminosImporBeans(tipoterminosimporsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoTerminosImpors(sAccionBusqueda,sTipoArchivoReporte,tipoterminosimporsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoTerminosImpors(sAccionBusqueda,sTipoArchivoReporte,tipoterminosimporsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoTerminosImporActionPerformed(null);
					//this.generarExcelReporteTipoTerminosImpors(sAccionBusqueda,sTipoArchivoReporte,tipoterminosimporsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoTerminosImpors(sAccionBusqueda,sTipoArchivoReporte,tipoterminosimporsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoTerminosImpors(sAccionBusqueda,sTipoArchivoReporte,tipoterminosimporsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoTerminosImpors(sAccionBusqueda,sTipoArchivoReporte,tipoterminosimporsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoTerminosImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTerminosImpor> tipoterminosimporsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoterminosimpor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTerminosImpors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTerminosImpor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoTerminosImpor tipoterminosimpor : tipoterminosimporsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoTerminosImporConstantesFunciones.generarExcelReporteDataTipoTerminosImpor("NORMAL",row,workbook,tipoterminosimpor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Terminos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoTerminosImpor(String sTipo,Row row,Workbook workbook) {
		
		TipoTerminosImporConstantesFunciones.generarExcelReporteHeaderTipoTerminosImpor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoTerminosImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTerminosImpor> tipoterminosimporsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoterminosimpor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTerminosImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoTerminosImpor tipoterminosimpor : tipoterminosimporsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoTerminosImporConstantesFunciones.getTipoTerminosImporDescripcion(tipoterminosimpor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTerminosImporConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTerminosImporConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoterminosimpor.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTerminosImporConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTerminosImporConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoterminosimpor.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Terminos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoTerminosImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTerminosImpor> tipoterminosimporsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoTerminosImpor> tipoterminosimporsRespaldo=null;
		
		classes=TipoTerminosImporConstantesFunciones.getClassesRelationshipsOfTipoTerminosImpor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoterminosimporLogic.setDatosCliente(this.datosCliente);
		this.tipoterminosimporLogic.setDatosDeep(this.datosDeep);
		this.tipoterminosimporLogic.setIsConDeep(true);
		
		tipoterminosimporsRespaldo=this.tipoterminosimporLogic.getTipoTerminosImpors();
		
		this.tipoterminosimporLogic.setTipoTerminosImpors(tipoterminosimporsParaReportes);	
		this.tipoterminosimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoterminosimporsParaReportes=this.tipoterminosimporLogic.getTipoTerminosImpors();
		this.tipoterminosimporLogic.setTipoTerminosImpors(tipoterminosimporsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoterminosimpor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTerminosImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTerminosImpor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoTerminosImpor tipoterminosimpor : tipoterminosimporsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoTerminosImpor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoTerminosImporConstantesFunciones.generarExcelReporteDataTipoTerminosImpor("NORMAL",row,workbook,tipoterminosimpor,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoTerminosImporConstantesFunciones.getTipoTerminosImporDescripcion(tipoterminosimpor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Terminos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoTerminosImpor() throws Exception {		
		this.startProcessTipoTerminosImpor(true);
	}
	
	public void startProcessTipoTerminosImpor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoTerminosImpor, this.jScrollPanelDatosTipoTerminosImpor,this.jPanelPaginacionTipoTerminosImpor, this.jScrollPanelDatosEdicionTipoTerminosImpor, this.jPanelAccionesTipoTerminosImpor,this.jPanelAccionesFormularioTipoTerminosImpor,this.jmenuBarTipoTerminosImpor,this.jmenuBarDetalleTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,this.jTtoolBarDetalleTipoTerminosImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTerminosImpor=null; 
		
		final JPanel jPanelParametrosReportesTipoTerminosImpor=this.jPanelParametrosReportesTipoTerminosImpor;
		//final JScrollPane jScrollPanelDatosTipoTerminosImpor=this.jScrollPanelDatosTipoTerminosImpor;
		final JTable jTableDatosTipoTerminosImpor=this.jTableDatosTipoTerminosImpor;		
		final JPanel jPanelPaginacionTipoTerminosImpor=this.jPanelPaginacionTipoTerminosImpor;
		//final JScrollPane jScrollPanelDatosEdicionTipoTerminosImpor=this.jScrollPanelDatosEdicionTipoTerminosImpor;
		final JPanel jPanelAccionesTipoTerminosImpor=this.jPanelAccionesTipoTerminosImpor;
		
		JPanel jPanelCamposAuxiliarTipoTerminosImpor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoTerminosImpor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			jPanelCamposAuxiliarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jPanelCamposTipoTerminosImpor;
			jPanelAccionesFormularioAuxiliarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jPanelAccionesFormularioTipoTerminosImpor;
		}
		
		final JPanel jPanelCamposTipoTerminosImpor=jPanelCamposAuxiliarTipoTerminosImpor;
		final JPanel jPanelAccionesFormularioTipoTerminosImpor=jPanelAccionesFormularioAuxiliarTipoTerminosImpor;
		
		
		final JMenuBar jmenuBarTipoTerminosImpor=this.jmenuBarTipoTerminosImpor;
		final JToolBar jTtoolBarTipoTerminosImpor=this.jTtoolBarTipoTerminosImpor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoTerminosImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTerminosImpor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			jmenuBarDetalleAuxiliarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jmenuBarDetalleTipoTerminosImpor;
			jTtoolBarDetalleAuxiliarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jTtoolBarDetalleTipoTerminosImpor;
		}
		
		final JMenuBar jmenuBarDetalleTipoTerminosImpor=jmenuBarDetalleAuxiliarTipoTerminosImpor;
		final JToolBar jTtoolBarDetalleTipoTerminosImpor=jTtoolBarDetalleAuxiliarTipoTerminosImpor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTerminosImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTerminosImpor;
			processRunnable.jTableDatos=jTableDatosTipoTerminosImpor;
			processRunnable.jPanelCampos=jPanelCamposTipoTerminosImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTerminosImpor;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTerminosImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTerminosImpor;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTerminosImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTerminosImpor;
			processRunnable.jTtoolBar=jTtoolBarTipoTerminosImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTerminosImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTerminosImpor ,jPanelParametrosReportesTipoTerminosImpor,jTableDatosTipoTerminosImpor, /*jScrollPanelDatosTipoTerminosImpor,*/jPanelCamposTipoTerminosImpor,jPanelPaginacionTipoTerminosImpor, /*jScrollPanelDatosEdicionTipoTerminosImpor,*/ jPanelAccionesTipoTerminosImpor,jPanelAccionesFormularioTipoTerminosImpor,jmenuBarTipoTerminosImpor,jmenuBarDetalleTipoTerminosImpor,jTtoolBarTipoTerminosImpor,jTtoolBarDetalleTipoTerminosImpor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoTerminosImpor, jScrollPanelDatosTipoTerminosImpor,jPanelPaginacionTipoTerminosImpor, jScrollPanelDatosEdicionTipoTerminosImpor, jPanelAccionesTipoTerminosImpor,jPanelAccionesFormularioTipoTerminosImpor,jmenuBarTipoTerminosImpor,jmenuBarDetalleTipoTerminosImpor,jTtoolBarTipoTerminosImpor,jTtoolBarDetalleTipoTerminosImpor);
						
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
	
	public void finishProcessTipoTerminosImpor() {// throws Exception 
		this.finishProcessTipoTerminosImpor(true);
	}
	
	public void finishProcessTipoTerminosImpor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoTerminosImpor, this.jScrollPanelDatosTipoTerminosImpor,this.jPanelPaginacionTipoTerminosImpor, this.jScrollPanelDatosEdicionTipoTerminosImpor, this.jPanelAccionesTipoTerminosImpor,this.jPanelAccionesFormularioTipoTerminosImpor,this.jmenuBarTipoTerminosImpor,this.jmenuBarDetalleTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,this.jTtoolBarDetalleTipoTerminosImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTerminosImpor=null; 
		
		final JPanel jPanelParametrosReportesTipoTerminosImpor=this.jPanelParametrosReportesTipoTerminosImpor;
		//final JScrollPane jScrollPanelDatosTipoTerminosImpor=this.jScrollPanelDatosTipoTerminosImpor;
		final JTable jTableDatosTipoTerminosImpor=this.jTableDatosTipoTerminosImpor;		
		final JPanel jPanelPaginacionTipoTerminosImpor=this.jPanelPaginacionTipoTerminosImpor;
		//final JScrollPane jScrollPanelDatosEdicionTipoTerminosImpor=this.jScrollPanelDatosEdicionTipoTerminosImpor;
		final JPanel jPanelAccionesTipoTerminosImpor=this.jPanelAccionesTipoTerminosImpor;
		
		JPanel jPanelCamposAuxiliarTipoTerminosImpor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoTerminosImpor=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			jPanelCamposAuxiliarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jPanelCamposTipoTerminosImpor;
			jPanelAccionesFormularioAuxiliarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jPanelAccionesFormularioTipoTerminosImpor;
		}
		
		final JPanel jPanelCamposTipoTerminosImpor=jPanelCamposAuxiliarTipoTerminosImpor;
		final JPanel jPanelAccionesFormularioTipoTerminosImpor=jPanelAccionesFormularioAuxiliarTipoTerminosImpor;
		
		
		final JMenuBar jmenuBarTipoTerminosImpor=this.jmenuBarTipoTerminosImpor;		
		final JToolBar jTtoolBarTipoTerminosImpor=this.jTtoolBarTipoTerminosImpor;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoTerminosImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTerminosImpor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			jmenuBarDetalleAuxiliarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jmenuBarDetalleTipoTerminosImpor;
			jTtoolBarDetalleAuxiliarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jTtoolBarDetalleTipoTerminosImpor;		
		}
		
		final JMenuBar jmenuBarDetalleTipoTerminosImpor=jmenuBarDetalleAuxiliarTipoTerminosImpor;
		final JToolBar jTtoolBarDetalleTipoTerminosImpor=jTtoolBarDetalleAuxiliarTipoTerminosImpor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTerminosImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTerminosImpor;
			processRunnable.jTableDatos=jTableDatosTipoTerminosImpor;
			processRunnable.jPanelCampos=jPanelCamposTipoTerminosImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTerminosImpor;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTerminosImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTerminosImpor;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTerminosImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTerminosImpor;
			processRunnable.jTtoolBar=jTtoolBarTipoTerminosImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTerminosImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoTerminosImpor ,jPanelParametrosReportesTipoTerminosImpor, jTableDatosTipoTerminosImpor,/*jScrollPanelDatosTipoTerminosImpor,*/jPanelCamposTipoTerminosImpor,jPanelPaginacionTipoTerminosImpor, /*jScrollPanelDatosEdicionTipoTerminosImpor,*/ jPanelAccionesTipoTerminosImpor,jPanelAccionesFormularioTipoTerminosImpor,jmenuBarTipoTerminosImpor,jmenuBarDetalleTipoTerminosImpor,jTtoolBarTipoTerminosImpor,jTtoolBarDetalleTipoTerminosImpor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoTerminosImpor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoTerminosImpor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoTerminosImpor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoTerminosImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoTerminosImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoTerminosImpor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoTerminosImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoTerminosImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoTerminosImpor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoterminosimporConstantesFunciones.getsFinalQueryTipoTerminosImpor();
		String  finalQueryPaginacionTodos=this.tipoterminosimporConstantesFunciones.getsFinalQueryTipoTerminosImpor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoTerminosImporConstantesFunciones.getArrayColumnasGlobalesNoTipoTerminosImpor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoTerminosImporConstantesFunciones.getArrayColumnasGlobalesTipoTerminosImpor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoTerminosImporConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoterminosimporsEliminados= new ArrayList<TipoTerminosImpor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoTerminosImpor();
		
				///*TipoTerminosImporSessionBean*/this.tipoterminosimporSessionBean=new TipoTerminosImporSessionBean();
			
			if(this.tipoterminosimporSessionBean==null) {
				this.tipoterminosimporSessionBean=new TipoTerminosImporSessionBean();
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
					this.iNumeroPaginacion=TipoTerminosImporConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoTerminosImporConstantesFunciones.getClassesForeignKeysOfTipoTerminosImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoterminosimpor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoterminosimporsAux= new ArrayList<TipoTerminosImpor>();
			
				
			tipoterminosimporLogic.setDatosCliente(this.datosCliente);
			tipoterminosimporLogic.setDatosDeep(this.datosDeep);
			tipoterminosimporLogic.setIsConDeep(true);
			
			
			tipoterminosimporLogic.getTipoTerminosImporDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoterminosimporLogic.getTodosTipoTerminosImpors(finalQueryGlobal,pagination);
					
					//tipoterminosimporLogic.getTodosTipoTerminosImporsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoterminosimporLogic.getTipoTerminosImpors()==null|| tipoterminosimporLogic.getTipoTerminosImpors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoterminosimporsAux= new ArrayList<TipoTerminosImpor>();
							tipoterminosimporsAux.addAll(tipoterminosimporLogic.getTipoTerminosImpors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoterminosimporsAux= new ArrayList<TipoTerminosImpor>();
							tipoterminosimporsAux.addAll(tipoterminosimpors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoterminosimporLogic.getTodosTipoTerminosImpors(finalQueryGlobal+"",this.pagination);												
							
							//tipoterminosimporLogic.getTodosTipoTerminosImporsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoTerminosImpors("Todos",tipoterminosimporLogic.getTipoTerminosImpors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoterminosimporLogic.setTipoTerminosImpors(new ArrayList<TipoTerminosImpor>());					
							tipoterminosimporLogic.getTipoTerminosImpors().addAll(tipoterminosimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoterminosimpors=new ArrayList<TipoTerminosImpor>();
							tipoterminosimpors.addAll(tipoterminosimporsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoTerminosImpor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoTerminosImpor=this.idActual;
				
				} else if(this.idTipoTerminosImporActual!=null && this.idTipoTerminosImporActual!=0L) {
					idTipoTerminosImpor=idTipoTerminosImporActual;
				}
				
					
				this.sDetalleReporte=TipoTerminosImporConstantesFunciones.getDetalleIndicePorId(idTipoTerminosImpor);
				
				this.tipoterminosimpors=new ArrayList<TipoTerminosImpor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoterminosimporLogic.getEntity(idTipoTerminosImpor);
					
					//tipoterminosimporLogic.getEntityWithConnection(idTipoTerminosImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoterminosimporLogic.setTipoTerminosImpors(new ArrayList<TipoTerminosImpor>());
					tipoterminosimporLogic.getTipoTerminosImpors().add(tipoterminosimporLogic.getTipoTerminosImpor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoterminosimpors=new ArrayList<TipoTerminosImpor>();
					this.tipoterminosimpors.add(tipoterminosimpor);
				}
				
				if(tipoterminosimporLogic.getTipoTerminosImpor()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoTerminosImpor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoTerminosImpor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoterminosimporLogic.getTipoTerminosImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoterminosimpors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoterminosimporLogic.getTipoTerminosImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoterminosimpors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoTerminosImpor tipoterminosimpor) {
		Boolean permite=true;
		
		if(this.tipoterminosimpor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoTerminosImporConstantesFunciones.getOrderByListaTipoTerminosImpor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoTerminosImporConstantesFunciones.getOrderByListaTipoTerminosImpor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTerminosImpor tipoterminosimpor:tipoterminosimporLogic.getTipoTerminosImpors()) {
				if(tipoterminosimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipoterminosimporTotales=tipoterminosimpor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTerminosImpor tipoterminosimpor:this.tipoterminosimpors) {
				if(tipoterminosimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipoterminosimporTotales=tipoterminosimpor;
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
			this.tipoterminosimporAux=new TipoTerminosImpor();
			this.tipoterminosimporAux.setsType(Constantes2.S_TOTALES);
			this.tipoterminosimporAux.setIsNew(false);
			this.tipoterminosimporAux.setIsChanged(false);
			this.tipoterminosimporAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoTerminosImporConstantesFunciones.TotalizarValoresFilaTipoTerminosImpor(this.tipoterminosimporLogic.getTipoTerminosImpors(),this.tipoterminosimporAux);
				
				this.tipoterminosimporLogic.getTipoTerminosImpors().add(this.tipoterminosimporAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoTerminosImporConstantesFunciones.TotalizarValoresFilaTipoTerminosImpor(this.tipoterminosimpors,this.tipoterminosimporAux);
				
				this.tipoterminosimpors.add(this.tipoterminosimporAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoterminosimporTotales=new TipoTerminosImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoterminosimporLogic.getTipoTerminosImpors().remove(tipoterminosimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoterminosimpors.remove(tipoterminosimporTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoterminosimporTotales=new TipoTerminosImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTerminosImpor tipoterminosimpor:tipoterminosimporLogic.getTipoTerminosImpors()) {
				if(tipoterminosimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipoterminosimporTotales=tipoterminosimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTerminosImporConstantesFunciones.TotalizarValoresFilaTipoTerminosImpor(this.tipoterminosimporLogic.getTipoTerminosImpors(),tipoterminosimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTerminosImpor tipoterminosimpor:this.tipoterminosimpors) {
				if(tipoterminosimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipoterminosimporTotales=tipoterminosimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTerminosImporConstantesFunciones.TotalizarValoresFilaTipoTerminosImpor(this.tipoterminosimpors,tipoterminosimporTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoTerminosImpor() {
		this.isPermisoTodoTipoTerminosImpor=false;
		this.isPermisoNuevoTipoTerminosImpor=false;
		this.isPermisoActualizarTipoTerminosImpor=false;
		this.isPermisoActualizarOriginalTipoTerminosImpor=false;
		this.isPermisoEliminarTipoTerminosImpor=false;
		this.isPermisoGuardarCambiosTipoTerminosImpor=false;
		this.isPermisoConsultaTipoTerminosImpor=false;
		this.isPermisoBusquedaTipoTerminosImpor=false;
		this.isPermisoReporteTipoTerminosImpor=false;		
		this.isPermisoOrdenTipoTerminosImpor=false;		
		this.isPermisoPaginacionMedioTipoTerminosImpor=false;		
		this.isPermisoPaginacionAltoTipoTerminosImpor=false;
		this.isPermisoPaginacionTodoTipoTerminosImpor=false;
		this.isPermisoCopiarTipoTerminosImpor=false;		
		this.isPermisoVerFormTipoTerminosImpor=false;		
		this.isPermisoDuplicarTipoTerminosImpor=false;		
		this.isPermisoOrdenTipoTerminosImpor=false;		
	}
	
	public void setPermisosUsuarioTipoTerminosImpor(Boolean isPermiso) {
		this.isPermisoTodoTipoTerminosImpor=isPermiso;
		this.isPermisoNuevoTipoTerminosImpor=isPermiso;
		this.isPermisoActualizarTipoTerminosImpor=isPermiso;
		this.isPermisoActualizarOriginalTipoTerminosImpor=isPermiso;
		this.isPermisoEliminarTipoTerminosImpor=isPermiso;
		this.isPermisoGuardarCambiosTipoTerminosImpor=isPermiso;
		this.isPermisoConsultaTipoTerminosImpor=isPermiso;
		this.isPermisoBusquedaTipoTerminosImpor=isPermiso;
		this.isPermisoReporteTipoTerminosImpor=isPermiso;
		this.isPermisoOrdenTipoTerminosImpor=isPermiso;		
		this.isPermisoPaginacionMedioTipoTerminosImpor=isPermiso;		
		this.isPermisoPaginacionAltoTipoTerminosImpor=isPermiso;		
		this.isPermisoPaginacionTodoTipoTerminosImpor=isPermiso;		
		this.isPermisoCopiarTipoTerminosImpor=isPermiso;		
		this.isPermisoVerFormTipoTerminosImpor=isPermiso;		
		this.isPermisoDuplicarTipoTerminosImpor=isPermiso;
		this.isPermisoOrdenTipoTerminosImpor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoTerminosImpor(Boolean isPermiso) {
		//this.isPermisoTodoTipoTerminosImpor=isPermiso;
		this.isPermisoNuevoTipoTerminosImpor=isPermiso;
		this.isPermisoActualizarTipoTerminosImpor=isPermiso;
		this.isPermisoActualizarOriginalTipoTerminosImpor=isPermiso;
		this.isPermisoEliminarTipoTerminosImpor=isPermiso;
		this.isPermisoGuardarCambiosTipoTerminosImpor=isPermiso;
		//this.isPermisoConsultaTipoTerminosImpor=isPermiso;
		//this.isPermisoBusquedaTipoTerminosImpor=isPermiso;
		//this.isPermisoReporteTipoTerminosImpor=isPermiso;
		//this.isPermisoOrdenTipoTerminosImpor=isPermiso;		
		//this.isPermisoPaginacionMedioTipoTerminosImpor=isPermiso;		
		//this.isPermisoPaginacionAltoTipoTerminosImpor=isPermiso;		
		//this.isPermisoPaginacionTodoTipoTerminosImpor=isPermiso;		
		//this.isPermisoCopiarTipoTerminosImpor=isPermiso;		
		//this.isPermisoDuplicarTipoTerminosImpor=isPermiso;
		//this.isPermisoOrdenTipoTerminosImpor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoTerminosImporClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoTerminosImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoTerminosImpor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoTerminosImporClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoTerminosImporClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoTerminosImporClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoTerminosImporClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoTerminosImpor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoTerminosImporJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoTerminosImporConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoTerminosImpor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoTerminosImpor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoTerminosImpor=this.isPermisoActualizarTipoTerminosImpor;
			this.isPermisoEliminarTipoTerminosImpor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoTerminosImpor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoTerminosImpor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoTerminosImpor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoTerminosImpor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoTerminosImpor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTerminosImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoTerminosImpor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoTerminosImpor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoTerminosImpor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoTerminosImpor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoTerminosImpor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoTerminosImpor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTerminosImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoTerminosImpor.setToolTipText(this.jTableDatosTipoTerminosImpor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoTerminosImpor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoTerminosImpor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoTerminosImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoTerminosImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoTerminosImpor() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoTerminosImporListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoTerminosImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoTerminosImporJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoTerminosImporListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoTerminosImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoTerminosImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoTerminosImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoTerminosImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoTerminosImpor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTerminosImpor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoTerminosImpor()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTerminosImpor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoTerminosImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoTerminosImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoTerminosImpor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoTerminosImpor()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoTerminosImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoTerminosImpor()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoTerminosImporBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoTerminosImporBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoTerminosImporBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoterminosimporSessionBean=new TipoTerminosImporSessionBean(); 
		this.tipoterminosimporConstantesFunciones=new TipoTerminosImporConstantesFunciones(); 
		this.tipoterminosimporBean=new TipoTerminosImpor();//(this.tipoterminosimporConstantesFunciones); 		
		this.tipoterminosimporReturnGeneral=new TipoTerminosImporParameterReturnGeneral(); 
		
		this.tipoterminosimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoterminosimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoTerminosImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoTerminosImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoTerminosImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoTerminosImpor(true);
			
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
			
			this.tipoterminosimporConstantesFunciones=new TipoTerminosImporConstantesFunciones(); 
			this.tipoterminosimporBean=new TipoTerminosImpor();//this.tipoterminosimporConstantesFunciones); 			
			this.tipoterminosimporReturnGeneral=new TipoTerminosImporParameterReturnGeneral(); 
		
			TipoTerminosImporBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Terminos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoterminosimpor=new TipoTerminosImpor();
			this.tipoterminosimpors = new ArrayList<TipoTerminosImpor>();
			this.tipoterminosimporsAux = new ArrayList<TipoTerminosImpor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic=new TipoTerminosImporLogic();
				this.tipoterminosimporLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoterminosimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoterminosimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoTerminosImpor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoTerminosImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTerminosImpor);	
					}
					
					if(this.jInternalFrameImportacionTipoTerminosImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTerminosImpor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoTerminosImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoTerminosImpor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTerminosImpor);
				this.jInternalFrameDetalleFormTipoTerminosImpor.setVisible(false);
				this.jInternalFrameDetalleFormTipoTerminosImpor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoTerminosImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTerminosImpor);
					this.jInternalFrameReporteDinamicoTipoTerminosImpor.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoTerminosImpor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoTerminosImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoTerminosImpor);
					this.jInternalFrameImportacionTipoTerminosImpor.setVisible(false);
					this.jInternalFrameImportacionTipoTerminosImpor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoTerminosImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoTerminosImpor);
					this.jInternalFrameOrderByTipoTerminosImpor.setVisible(false);
					this.jInternalFrameOrderByTipoTerminosImpor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoTerminosImporActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoTerminosImporConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoterminosimporReturnGeneral=new TipoTerminosImporParameterReturnGeneral();
			
			this.tipoterminosimporParameterGeneral=new TipoTerminosImporParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoterminosimporLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoTerminosImporJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTerminosImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoterminosimporSessionBean.getEsGuardarRelacionado(),this.tipoterminosimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTerminosImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoterminosimporSessionBean.getEsGuardarRelacionado(),this.tipoterminosimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=false;
			this.isVisibilidadCeldaDuplicarTipoTerminosImpor=true;
			this.isVisibilidadCeldaCopiarTipoTerminosImpor=true;
			this.isVisibilidadCeldaVerFormTipoTerminosImpor=true;
			this.isVisibilidadCeldaOrdenTipoTerminosImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=false;
			this.isVisibilidadCeldaModificarTipoTerminosImpor=false;
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=false;
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=false;
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=false;
			this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoTerminosImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoTerminosImpor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoTerminosImpor(false);
			
			this.setPermisosUsuarioTipoTerminosImpor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoterminosimporSessionBean.getEsGuardarRelacionado() && this.tipoterminosimporSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoTerminosImporClasesRelacionadas();
			}
			
			if(this.tipoterminosimporSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoTerminosImporClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoTerminosImpor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoTerminosImpor();
			}
			
			if(!this.isPermisoBusquedaTipoTerminosImpor) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoTerminosImpor,this.isPermisoPaginacionMedioTipoTerminosImpor,this.isPermisoPaginacionTodoTipoTerminosImpor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoTerminosImporConstantesFunciones.getTiposSeleccionarTipoTerminosImpor());
				
				this.tiposColumnasSelect=TipoTerminosImporConstantesFunciones.getTiposSeleccionarTipoTerminosImpor(true);
				
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
			//if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoTerminosImpor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoTerminosImpor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoTerminosImpor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTerminosImpor() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoterminosimporImplementable= (TipoTerminosImporImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTerminosImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoterminosimporImplementableHome= (TipoTerminosImporImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTerminosImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoterminosimpors= new ArrayList<TipoTerminosImpor>();
			this.tipoterminosimporsEliminados= new ArrayList<TipoTerminosImpor>();
						
			this.isEsNuevoTipoTerminosImpor=false;
			this.esParaAccionDesdeFormularioTipoTerminosImpor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoTerminosImpor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoTerminosImpor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoTerminosImporConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoTerminosImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoTerminosImpor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoTerminosImpor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoTerminosImpor();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoTerminosImpor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoTerminosImpor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoTerminosImpor() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoTerminosImpor")) {
				iIndex=this.jInternalFrameDetalleFormTipoTerminosImpor.jTabbedPaneRelacionesTipoTerminosImpor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoTerminosImpor.jTabbedPaneRelacionesTipoTerminosImpor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoTerminosImpor();	
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
	
	public void cargarCombosForeignKeyTipoTerminosImpor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoTerminosImpor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoTerminosImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoTerminosImporListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoTerminosImpor();
		
		this.cargarCombosFrameForeignKeyTipoTerminosImpor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoTerminosImpor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoTerminosImpor();
		}
	}
	
	
	
	public void jButtonNuevoTipoTerminosImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoterminosimporSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
			
			if(jTableDatosTipoTerminosImpor.getRowCount()>=1) {
				jTableDatosTipoTerminosImpor.removeRowSelectionInterval(0, jTableDatosTipoTerminosImpor.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoTerminosImpor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoTerminosImpor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoTerminosImpor(true);			
			//this.tipoterminosimpor=new TipoTerminosImpor();
			//this.tipoterminosimpor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTerminosImpor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTerminosImpor() ;
			
			if(TipoTerminosImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTerminosImpor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoterminosimpor);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);				
			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
			if(this.tipoterminosimporSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoTerminosImpor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoTerminosImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoTerminosImpor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoTerminosImpor.getSelectedRows().length;			
			}
			
			tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoTerminosImpor--;			
				//TipoTerminosImpor tipoterminosimporAux= new TipoTerminosImpor();			
				//tipoterminosimporAux.setId(this.iIdNuevoTipoTerminosImpor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoTerminosImpor tipoterminosimporOrigen=new TipoTerminosImpor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoTerminosImpor tipoterminosimporOrigen : tipoterminosimporsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoterminosimporOrigen =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoterminosimporOrigen =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoTerminosImpor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoterminosimpor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoTerminosImpor(tipoterminosimporOrigen,this.tipoterminosimpor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoterminosimporLogic.getTipoTerminosImpors().add(this.tipoterminosimporAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoterminosimpors.add(this.tipoterminosimporAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
				
				this.jTableDatosTipoTerminosImpor.setRowSelectionInterval(this.getIndiceNuevoTipoTerminosImpor(), this.getIndiceNuevoTipoTerminosImpor());
				
				int iLastRow =  this.jTableDatosTipoTerminosImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTerminosImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTerminosImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();									
		
			TipoTerminosImpor tipoterminosimporOrigen=new TipoTerminosImpor();
			TipoTerminosImpor tipoterminosimporDestino=new TipoTerminosImpor();
				
			tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoTerminosImpor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoterminosimporsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoTerminosImpor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoterminosimporOrigen =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoterminosimporOrigen =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoterminosimporDestino =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoterminosimporDestino =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoterminosimporOrigen =tipoterminosimporsSeleccionados.get(0);
				tipoterminosimporDestino =tipoterminosimporsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoTerminosImpor(tipoterminosimporOrigen,tipoterminosimporDestino,true,false);
				
				tipoterminosimporDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoterminosimporDestino,tipoterminosimporLogic.getTipoTerminosImpors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoterminosimporDestino,tipoterminosimpors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
				
				//this.jTableDatosTipoTerminosImpor.setRowSelectionInterval(this.getIndiceNuevoTipoTerminosImpor(), this.getIndiceNuevoTipoTerminosImpor());
				
				int iLastRow =  this.jTableDatosTipoTerminosImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTerminosImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTerminosImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoTerminosImpor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoTerminosImpor.isVisible();
			
			
			this.jPanelParametrosReportesTipoTerminosImpor.setVisible(!isVisible);
			this.jPanelPaginacionTipoTerminosImpor.setVisible(!isVisible);
			this.jPanelAccionesTipoTerminosImpor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoTerminosImpor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoTerminosImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoTerminosImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoTerminosImpor();
			
			this.abrirFrameOrderByTipoTerminosImpor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoTerminosImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoTerminosImpor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTerminosImpor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoTerminosImpor.isMaximum()) {
					this.jInternalFrameDetalleFormTipoTerminosImpor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoTerminosImpor.setSize(this.jInternalFrameDetalleFormTipoTerminosImpor.iWidthFormulario,this.jInternalFrameDetalleFormTipoTerminosImpor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoTerminosImpor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoTerminosImpor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoTerminosImpor.isMaximum()) {
						this.jInternalFrameDetalleFormTipoTerminosImpor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoTerminosImpor.jContentPaneDetalleTipoTerminosImpor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoTerminosImpor.jTabbedPaneRelacionesTipoTerminosImpor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoTerminosImpor.jContentPaneDetalleTipoTerminosImpor.getWidth(),TipoTerminosImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTerminosImpor.jTabbedPaneRelacionesTipoTerminosImpor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoTerminosImpor.jContentPaneDetalleTipoTerminosImpor.getWidth(),TipoTerminosImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTerminosImpor.jTabbedPaneRelacionesTipoTerminosImpor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoTerminosImpor.jContentPaneDetalleTipoTerminosImpor.getWidth(),TipoTerminosImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoTerminosImpor.setVisible(true);
	        this.jInternalFrameDetalleFormTipoTerminosImpor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoTerminosImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoTerminosImpor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoTerminosImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTerminosImpor,false,this);
				} else {
					this.jInternalFrameOrderByTipoTerminosImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTerminosImpor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoTerminosImpor);
				this.jInternalFrameOrderByTipoTerminosImpor.setVisible(false);
				this.jInternalFrameOrderByTipoTerminosImpor.setSelected(false);
				
				this.jInternalFrameOrderByTipoTerminosImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTerminosImpor"));
				
				this.inicializarActualizarBindingTablaOrderByTipoTerminosImpor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoTerminosImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoTerminosImpor==null) {
				
				this.jInternalFrameImportacionTipoTerminosImpor=new ImportacionJInternalFrame(TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTerminosImpor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoTerminosImpor);
				this.jInternalFrameImportacionTipoTerminosImpor.setVisible(false);
				this.jInternalFrameImportacionTipoTerminosImpor.setSelected(false);


				this.jInternalFrameImportacionTipoTerminosImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTerminosImpor"));
				this.jInternalFrameImportacionTipoTerminosImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTerminosImpor"));
				this.jInternalFrameImportacionTipoTerminosImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTerminosImpor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoTerminosImpor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoTerminosImpor==null) {
				this.jInternalFrameReporteDinamicoTipoTerminosImpor=new ReporteDinamicoJInternalFrame(TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTerminosImpor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTerminosImpor);
				this.jInternalFrameReporteDinamicoTipoTerminosImpor.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoTerminosImpor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTerminosImpor"));
				this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTerminosImpor"));
				this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTerminosImpor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTerminosImpor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoTerminosImpor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTerminosImpor);
			
	       	this.jInternalFrameDetalleFormTipoTerminosImpor.setVisible(false);
	        this.jInternalFrameDetalleFormTipoTerminosImpor.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoTerminosImpor.dispose();
			//this.jInternalFrameDetalleFormTipoTerminosImpor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoTerminosImpor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoTerminosImpor.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoTerminosImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoTerminosImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoTerminosImpor.setVisible(true);
	        this.jInternalFrameImportacionTipoTerminosImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoTerminosImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoTerminosImpor.setVisible(true);
	        this.jInternalFrameOrderByTipoTerminosImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoTerminosImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoTerminosImpor.setVisible(false);
	        this.jInternalFrameOrderByTipoTerminosImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoTerminosImpor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoTerminosImpor.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoTerminosImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoTerminosImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoTerminosImpor.setVisible(false);
	        this.jInternalFrameImportacionTipoTerminosImpor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoTerminosImpor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoTerminosImpor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoTerminosImpor(true);
			//this.isEsNuevoTipoTerminosImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoTerminosImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTerminosImpor(false) ;
			
			if(tipoterminosimporSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoTerminosImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTerminosImpor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTerminosImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoTerminosImporActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoTerminosImpor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoTerminosImpor(true);
			//this.isEsNuevoTipoTerminosImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoterminosimpor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoTerminosImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoTerminosImpor(false) ;
			
			if(TipoTerminosImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTerminosImpor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTerminosImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoTerminosImpor(false);
			
			//if(!this.isEsNuevoTipoTerminosImpor) {								
				int intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.tipoterminosimpor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
				
			}
			
			if(this.permiteMantenimiento(this.tipoterminosimpor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoTerminosImpor=true;
					this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
					this.isEsNuevoTipoTerminosImpor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoTerminosImpor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoTerminosImpor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTerminosImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTerminosImpor(false);
				
				this.habilitarDeshabilitarControlesTipoTerminosImpor(false);
			
												
				
				if(TipoTerminosImporJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoTerminosImpor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoTerminosImporActionPerformed(evt,tipoterminosimporSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoTerminosImpor(this.tipoterminosimpor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoTerminosImpor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoterminosimporSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoterminosimpor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				this.tipoterminosimpor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				this.tipoterminosimpor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoterminosimpor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoTerminosImporModel) this.jTableDatosTipoTerminosImpor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoTerminosImpor=true;
				this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
				this.isEsNuevoTipoTerminosImpor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTerminosImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTerminosImpor(false);
				
				this.habilitarDeshabilitarControlesTipoTerminosImpor(false);
				
				
				
				if(TipoTerminosImporJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoTerminosImpor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoTerminosImpor.getRowCount()>=1) {
				jTableDatosTipoTerminosImpor.removeRowSelectionInterval(0, jTableDatosTipoTerminosImpor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoTerminosImpor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTerminosImpor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTerminosImpor(false) ;
			
			this.isEsNuevoTipoTerminosImpor=false;
			
			if(TipoTerminosImporJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoTerminosImpor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoTerminosImpor(false);
				
				//SI ES MANUAL
				if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoTerminosImpor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoTerminosImpor--;			
			//TipoTerminosImpor tipoterminosimporAux= new TipoTerminosImpor();			
			//tipoterminosimporAux.setId(this.iIdNuevoTipoTerminosImpor);
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoTerminosImpor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
			
			this.tipoterminosimpor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoterminosimporLogic.getTipoTerminosImpors().add(this.tipoterminosimporAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoterminosimpors.add(this.tipoterminosimporAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
			
			this.jTableDatosTipoTerminosImpor.setRowSelectionInterval(this.getIndiceNuevoTipoTerminosImpor(), this.getIndiceNuevoTipoTerminosImpor());
			
			int iLastRow =  this.jTableDatosTipoTerminosImpor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoTerminosImpor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoTerminosImpor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoTerminosImpor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTerminosImpor(false);
			
			//SI ES MANUAL
			if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTerminosImpor();
			}
			
			//this.abrirFrameTreeTipoTerminosImpor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo TerminosS ?", "MANTENIMIENTO DE Tipo Terminos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoTerminosImpor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoTerminosImpor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoterminosimporReturnGeneral=tipoterminosimporLogic.procesarImportacionTipoTerminosImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoterminosimporParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoTerminosImporReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoTerminosImpor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoTerminosImpor.setFileImportacion(this.jInternalFrameImportacionTipoTerminosImpor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoTerminosImpor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoTerminosImpor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoTerminosImpor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoTerminosImpor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();		

		tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoTerminosImporBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoTerminosImporBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoTerminosImpors("Todos",tipoterminosimporsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Terminos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTerminosImporConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTerminosImporConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoTerminosImporConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoTerminosImporConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoTerminosImporConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoTerminosImporConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTerminosImporConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoTerminosImporConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();		
		
		tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoterminosimpor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoTerminosImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoTerminosImporConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTerminosImporConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoTerminosImpor tipoterminosimpor:tipoterminosimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoterminosimpor.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTerminosImporConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTerminosImporConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoTerminosImpor tipoterminosimpor:tipoterminosimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoterminosimpor.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoTerminosImpor(row);				
			//	iRow++;
			//}				
			
			//for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimporsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoTerminosImpor(tipoterminosimporAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Terminos",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoterminosimporLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTerminosImpor(false);
			
			//SI ES MANUAL
			if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTerminosImpor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTerminosImpor(false);
			
			//SI ES MANUAL
			if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTerminosImpor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoTerminosImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTerminosImpor(false);
			
			//SI ES MANUAL
			if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTerminosImpor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoterminosimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoTerminosImpor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoTerminosImpor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoTerminosImpor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoTerminosImpor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoTerminosImpor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoTerminosImpor.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoTerminosImpor.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoTerminosImpor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoTerminosImpor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoTerminosImpor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoTerminosImpor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoTerminosImpor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoTerminosImpor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoTerminosImpor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTerminosImpor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoTerminosImpor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoTerminosImpor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoTerminosImpor();
		
		this.inicializarActualizarBindingBotonesManualTipoTerminosImpor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTerminosImpor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTerminosImpor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTerminosImpor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTerminosImpor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoTerminosImpor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoTerminosImpor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoTerminosImpor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoTerminosImpor.jCheckBoxPostAccionNuevoTipoTerminosImpor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoTerminosImpor.jCheckBoxPostAccionSinCerrarTipoTerminosImpor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoTerminosImpor.jCheckBoxPostAccionSinMensajeTipoTerminosImpor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoTerminosImpor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoTerminosImpor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoTerminosImpor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
				this.jInternalFrameDetalleFormTipoTerminosImpor.jCheckBoxPostAccionNuevoTipoTerminosImpor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoTerminosImpor.jCheckBoxPostAccionSinCerrarTipoTerminosImpor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoTerminosImpor.jCheckBoxPostAccionSinMensajeTipoTerminosImpor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoTerminosImpor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoTerminosImpor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoTerminosImpor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoTerminosImpor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoTerminosImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoTerminosImpor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoTerminosImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoTerminosImpor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoTerminosImpor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoTerminosImpor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoTerminosImpor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoTerminosImpor(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTerminosImpor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoTerminosImpor() throws Exception {
		try	{
			if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTerminosImpor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTerminosImpor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTerminosImpor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoTerminosImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoTerminosImpor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoTerminosImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoTerminosImpor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoTerminosImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoTerminosImpor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoTerminosImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoTerminosImpor.addItem(reporte);
			}
			
			
			if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoTerminosImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoTerminosImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoTerminosImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoTerminosImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoTerminosImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoTerminosImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoTerminosImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoTerminosImpor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoTerminosImpor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTerminosImpor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTerminosImpor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTerminosImpor!=null) {
				this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTerminosImpor!=null) {
				this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoTerminosImpor!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoTerminosImpor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoTerminosImpor(Boolean esInicializar) throws Exception {				
		if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTerminosImpor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoTerminosImpor() throws Exception {
		this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoTerminosImpor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoTerminosImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoTerminosImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoTerminosImporOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTerminosImporOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoTerminosImporPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoTerminosImporPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoTerminosImpor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoterminosimporLogic.getTipoTerminosImpors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoterminosimpors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoTerminosImpor.setModel(new TipoTerminosImporModel(this.tipoterminosimporLogic.getTipoTerminosImpors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoTerminosImpor.setModel(new TipoTerminosImporModel(this.tipoterminosimpors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoTerminosImpor!=null && this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoTerminosImpor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoTerminosImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTerminosImpor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoTerminosImporPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO,tipoterminosimporConstantesFunciones.resaltarSeleccionarTipoTerminosImpor,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO,tipoterminosimporConstantesFunciones.resaltarSeleccionarTipoTerminosImpor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoTerminosImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTerminosImpor,TipoTerminosImporConstantesFunciones.LABEL_ID));

		if(this.tipoterminosimporConstantesFunciones.mostraridTipoTerminosImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTerminosImporConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoterminosimporConstantesFunciones.resaltaridTipoTerminosImpor,this.tipoterminosimporConstantesFunciones.activaridTipoTerminosImpor,this,true,"idTipoTerminosImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoterminosimporConstantesFunciones.resaltaridTipoTerminosImpor,this.tipoterminosimporConstantesFunciones.activaridTipoTerminosImpor,this,true,"idTipoTerminosImpor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTerminosImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTerminosImpor,TipoTerminosImporConstantesFunciones.LABEL_CODIGO));

		if(this.tipoterminosimporConstantesFunciones.mostrarcodigoTipoTerminosImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTerminosImporConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoterminosimporConstantesFunciones.resaltarcodigoTipoTerminosImpor,this.tipoterminosimporConstantesFunciones.activarcodigoTipoTerminosImpor,this,true,"codigoTipoTerminosImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoterminosimporConstantesFunciones.resaltarcodigoTipoTerminosImpor,this.tipoterminosimporConstantesFunciones.activarcodigoTipoTerminosImpor,this,true,"codigoTipoTerminosImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTerminosImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTerminosImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTerminosImpor,TipoTerminosImporConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoterminosimporConstantesFunciones.mostrarnombreTipoTerminosImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTerminosImporConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoterminosimporConstantesFunciones.resaltarnombreTipoTerminosImpor,this.tipoterminosimporConstantesFunciones.activarnombreTipoTerminosImpor,this,true,"nombreTipoTerminosImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoterminosimporConstantesFunciones.resaltarnombreTipoTerminosImpor,this.tipoterminosimporConstantesFunciones.activarnombreTipoTerminosImpor,this,true,"nombreTipoTerminosImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTerminosImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoterminosimporSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoterminosimporSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTerminosImpor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoterminosimporSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoterminosimporSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTerminosImpor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoterminosimporSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoterminosimporSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoTerminosImpor.addColumn(tableColumn);
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
			
			this.jTableDatosTipoTerminosImpor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoTerminosImpor.moveColumn(this.jTableDatosTipoTerminosImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoTerminosImpor.moveColumn(this.jTableDatosTipoTerminosImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoTerminosImpor.moveColumn(this.jTableDatosTipoTerminosImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoTerminosImpor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoTerminosImpor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoTerminosImpor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoTerminosImpor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoTerminosImpor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoTerminosImpor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoTerminosImpor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoTerminosImpor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoterminosimporLogic.getTipoTerminosImpors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoterminosimpors.size()-1;
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
		//this.jTableDatosTipoTerminosImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoTerminosImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoTerminosImpor();
			
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
				
				//this.isEsNuevoTipoTerminosImpor=false;
					
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
				if(this.tipoterminosimporSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTerminosImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTerminosImpor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoterminosimpor.getsType().equals("DUPLICADO")
				   || this.tipoterminosimpor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoTerminosImpor=true;
				
				} else {
					this.isEsNuevoTipoTerminosImpor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoterminosimpor.getId()>=0 && !this.tipoterminosimpor.getIsNew()) {						
						this.isEsNuevoTipoTerminosImpor=false;
						
					} else {
						this.isEsNuevoTipoTerminosImpor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoTerminosImpor(esRelaciones);						
				
				this.seleccionarTipoTerminosImpor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoterminosimpor.getId()<0) {
					this.isEsNuevoTipoTerminosImpor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoTerminosImpor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoTerminosImpor(evt,rowIndex);
				}	
				
				if(this.tipoterminosimporSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoTerminosImpor: " + this.dDif); 
					}
				}								
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoTerminosImpor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoterminosimpor)) {
					if(this.tipoterminosimpor.getId()>0) {
						this.tipoterminosimpor.setIsDeleted(true);
						
						this.tipoterminosimporsEliminados.add(this.tipoterminosimpor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoterminosimporLogic.getTipoTerminosImpors().remove(this.tipoterminosimpor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoterminosimpors.remove(this.tipoterminosimpor);				
					}
					
					
					((TipoTerminosImporModel) this.jTableDatosTipoTerminosImpor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTerminosImpor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoTerminosImpor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoTerminosImpor) {
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTerminosImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTerminosImpor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoTerminosImpor(this.tipoterminosimpor);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoTerminosImpor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoTerminosImpor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTerminosImpor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoTerminosImpor(tipoterminosimpor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoTerminosImpor(tipoterminosimpor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoTerminosImpor(tipoterminosimpor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoTerminosImpor(tipoterminosimpor);
	}
	
	public void setVariablesObjetoActualToFormularioTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.setText(tipoterminosimpor.getId().toString());
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldcodigoTipoTerminosImpor.setText(tipoterminosimpor.getcodigo());
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTextAreanombreTipoTerminosImpor.setText(tipoterminosimpor.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoTerminosImpor tipoterminosimporLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoterminosimporLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoTerminosImpor tipoterminosimporLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoterminosimporLocal=this.tipoterminosimpor;
			} else {
				tipoterminosimporLocal=this.tipoterminosimporAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoterminosimporLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoTerminosImpor(tipoterminosimporLocal,true);
					
					if(tipoterminosimporSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoterminosimporLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoterminosimporLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTerminosImpor(tipoterminosimpor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(tipoterminosimpor);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTerminosImpor(tipoterminosimpor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.getText()==null || this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.getText()=="" || this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.setText("0");
			}

			if(conColumnasBase) {tipoterminosimpor.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTerminosImporConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTerminosImpor.jLabelIdTipoTerminosImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoterminosimpor.setcodigo(this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldcodigoTipoTerminosImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTerminosImporConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTerminosImpor.jLabelcodigoTipoTerminosImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoterminosimpor.setnombre(this.jInternalFrameDetalleFormTipoTerminosImpor.jTextAreanombreTipoTerminosImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTerminosImporConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTerminosImpor.jLabelnombreTipoTerminosImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTerminosImpor(TipoTerminosImpor tipoterminosimporBean,TipoTerminosImpor tipoterminosimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoTerminosImpor(TipoTerminosImpor tipoterminosimporOrigen,TipoTerminosImpor tipoterminosimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoterminosimporOrigen.getId()!=null && !tipoterminosimporOrigen.getId().equals(0L))) {tipoterminosimpor.setId(tipoterminosimporOrigen.getId());}}
			if(conDefault || (!conDefault && tipoterminosimporOrigen.getcodigo()!=null && !tipoterminosimporOrigen.getcodigo().equals(""))) {tipoterminosimpor.setcodigo(tipoterminosimporOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoterminosimporOrigen.getnombre()!=null && !tipoterminosimporOrigen.getnombre().equals(""))) {tipoterminosimpor.setnombre(tipoterminosimporOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.setText(tipoterminosimpor.getId().toString());
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldcodigoTipoTerminosImpor.setText(tipoterminosimpor.getcodigo());
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTextAreanombreTipoTerminosImpor.setText(tipoterminosimpor.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTerminosImpor(TipoTerminosImporBean tipoterminosimporBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.setText(tipoterminosimporBean.getId().toString());
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldcodigoTipoTerminosImpor.setText(tipoterminosimporBean.getcodigo());
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTextAreanombreTipoTerminosImpor.setText(tipoterminosimporBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoTerminosImpor(TipoTerminosImporParameterReturnGeneral tipoterminosimporReturnGeneral,TipoTerminosImporBean tipoterminosimporBean,Boolean conDefault) throws Exception { 
		try {
			TipoTerminosImpor tipoterminosimporLocal=new TipoTerminosImpor();
			
			tipoterminosimporLocal=tipoterminosimporReturnGeneral.getTipoTerminosImpor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoterminosimporLocal.getId()!=null && !tipoterminosimporLocal.getId().equals(0L))) {tipoterminosimporBean.setId(tipoterminosimporLocal.getId());}}
			if(conDefault || (!conDefault && tipoterminosimporLocal.getcodigo()!=null && !tipoterminosimporLocal.getcodigo().equals(""))) {tipoterminosimporBean.setcodigo(tipoterminosimporLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoterminosimporLocal.getnombre()!=null && !tipoterminosimporLocal.getnombre().equals(""))) {tipoterminosimporBean.setnombre(tipoterminosimporLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoTerminosImporGenerico(Long idTipoTerminosImporSeleccionado,JComboBox jComboBoxTipoTerminosImpor,List<TipoTerminosImpor> tipoterminosimporsLocal)throws Exception {
		try {
			TipoTerminosImpor  tipoterminosimporTemp=null;

			for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimporsLocal) {
				if(tipoterminosimporAux.getId()!=null && tipoterminosimporAux.getId().equals(idTipoTerminosImporSeleccionado)) {
					tipoterminosimporTemp=tipoterminosimporAux;
					break;
				}
			}

			jComboBoxTipoTerminosImpor.setSelectedItem(tipoterminosimporTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoTerminosImporGenerico(JComboBox jComboBoxTipoTerminosImpor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoTerminosImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTerminosImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoTerminosImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTerminosImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTerminosImpor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoTerminosImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTerminosImpor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoTerminosImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoTerminosImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoTerminosImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoterminosimpor=(TipoTerminosImpor) tipoterminosimporLogic.getTipoTerminosImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoterminosimpor =(TipoTerminosImpor) tipoterminosimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoTerminosImpor tipoterminosimporRow=new TipoTerminosImpor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoterminosimporRow=(TipoTerminosImpor) tipoterminosimporLogic.getTipoTerminosImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoterminosimporRow=(TipoTerminosImpor) tipoterminosimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoTerminosImpor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoTerminosImpor.setVisible((this.isVisibilidadCeldaNuevoTipoTerminosImpor && this.isPermisoNuevoTipoTerminosImpor));			
			this.jButtonDuplicarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaDuplicarTipoTerminosImpor && this.isPermisoDuplicarTipoTerminosImpor));			
			this.jButtonCopiarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaCopiarTipoTerminosImpor && this.isPermisoCopiarTipoTerminosImpor));
			this.jButtonVerFormTipoTerminosImpor.setVisible((this.isVisibilidadCeldaVerFormTipoTerminosImpor && this.isPermisoVerFormTipoTerminosImpor));
			
			this.jButtonAbrirOrderByTipoTerminosImpor.setVisible((this.isVisibilidadCeldaOrdenTipoTerminosImpor && this.isPermisoOrdenTipoTerminosImpor));			
			
			this.jButtonNuevoRelacionesTipoTerminosImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor && this.isPermisoNuevoTipoTerminosImpor));			
			this.jButtonNuevoGuardarCambiosTipoTerminosImpor.setVisible((this.isVisibilidadCeldaNuevoTipoTerminosImpor && this.isPermisoNuevoTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor));
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonModificarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaModificarTipoTerminosImpor && this.isPermisoActualizarTipoTerminosImpor));	
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonActualizarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaActualizarTipoTerminosImpor && this.isPermisoActualizarTipoTerminosImpor));	
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonEliminarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaEliminarTipoTerminosImpor && this.isPermisoEliminarTipoTerminosImpor));
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonCancelarTipoTerminosImpor.setVisible(this.isVisibilidadCeldaCancelarTipoTerminosImpor);							
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosTipoTerminosImpor.setVisible((this.isVisibilidadCeldaGuardarTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoTerminosImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaNuevoTipoTerminosImpor && this.isPermisoNuevoTipoTerminosImpor));						
			this.jButtonDuplicarToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaDuplicarTipoTerminosImpor && this.isPermisoDuplicarTipoTerminosImpor));						
			this.jButtonCopiarToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaCopiarTipoTerminosImpor && this.isPermisoCopiarTipoTerminosImpor));			
			this.jButtonVerFormToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaVerFormTipoTerminosImpor && this.isPermisoVerFormTipoTerminosImpor));			
			this.jButtonAbrirOrderByToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaOrdenTipoTerminosImpor && this.isPermisoOrdenTipoTerminosImpor));
			this.jButtonNuevoRelacionesToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor && this.isPermisoNuevoTipoTerminosImpor));			
			this.jButtonNuevoGuardarCambiosToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaNuevoTipoTerminosImpor && this.isPermisoNuevoTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor));			
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonModificarToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaModificarTipoTerminosImpor && this.isPermisoActualizarTipoTerminosImpor));	
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonActualizarToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaActualizarTipoTerminosImpor  && this.isPermisoActualizarTipoTerminosImpor));	
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonEliminarToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaEliminarTipoTerminosImpor && this.isPermisoEliminarTipoTerminosImpor));
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonCancelarToolBarTipoTerminosImpor.setVisible(this.isVisibilidadCeldaCancelarTipoTerminosImpor);				
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaGuardarTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoTerminosImpor.setVisible((this.isVisibilidadCeldaNuevoTipoTerminosImpor && this.isPermisoNuevoTipoTerminosImpor));			
			this.jMenuItemDuplicarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaDuplicarTipoTerminosImpor && this.isPermisoDuplicarTipoTerminosImpor));			
			this.jMenuItemCopiarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaCopiarTipoTerminosImpor && this.isPermisoCopiarTipoTerminosImpor));			
			this.jMenuItemVerFormTipoTerminosImpor.setVisible((this.isVisibilidadCeldaVerFormTipoTerminosImpor && this.isPermisoVerFormTipoTerminosImpor));			
			this.jMenuItemAbrirOrderByTipoTerminosImpor.setVisible((this.isVisibilidadCeldaOrdenTipoTerminosImpor && this.isPermisoOrdenTipoTerminosImpor));			
			//this.jMenuItemMostrarOcultarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaOrdenTipoTerminosImpor && this.isPermisoOrdenTipoTerminosImpor));
			this.jMenuItemDetalleAbrirOrderByTipoTerminosImpor.setVisible((this.isVisibilidadCeldaOrdenTipoTerminosImpor && this.isPermisoOrdenTipoTerminosImpor));			
			//this.jMenuItemDetalleMostrarOcultarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaOrdenTipoTerminosImpor && this.isPermisoOrdenTipoTerminosImpor));			
			this.jMenuItemNuevoRelacionesTipoTerminosImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor && this.isPermisoNuevoTipoTerminosImpor));			
			this.jMenuItemNuevoGuardarCambiosTipoTerminosImpor.setVisible((this.isVisibilidadCeldaNuevoTipoTerminosImpor && this.isPermisoNuevoTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor));									
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemModificarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaModificarTipoTerminosImpor && this.isPermisoActualizarTipoTerminosImpor));	
			this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemActualizarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaActualizarTipoTerminosImpor && this.isPermisoActualizarTipoTerminosImpor));	
			this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemEliminarTipoTerminosImpor.setVisible((this.isVisibilidadCeldaEliminarTipoTerminosImpor && this.isPermisoEliminarTipoTerminosImpor));
			this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemCancelarTipoTerminosImpor.setVisible(this.isVisibilidadCeldaCancelarTipoTerminosImpor);				
			}
			
			this.jMenuItemGuardarCambiosTipoTerminosImpor.setVisible((this.isVisibilidadCeldaGuardarTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor));						
			this.jMenuItemGuardarCambiosTablaTipoTerminosImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=this.jButtonNuevoTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaDuplicarTipoTerminosImpor=this.jButtonDuplicarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaCopiarTipoTerminosImpor=this.jButtonCopiarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaVerFormTipoTerminosImpor=this.jButtonVerFormTipoTerminosImpor.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoTerminosImpor=this.jButtonAbrirOrderByTipoTerminosImpor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=this.jButtonNuevoRelacionesTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaModificarTipoTerminosImpor=this.jButtonModificarTipoTerminosImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonActualizarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonEliminarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonCancelarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaGuardarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosTipoTerminosImpor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=this.jButtonGuardarCambiosTablaTipoTerminosImpor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=this.jButtonNuevoToolBarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=this.jButtonNuevoRelacionesToolBarTipoTerminosImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			this.isVisibilidadCeldaModificarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonModificarToolBarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonActualizarToolBarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonEliminarToolBarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonCancelarToolBarTipoTerminosImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTerminosImpor=this.jButtonGuardarCambiosToolBarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=this.jButtonGuardarCambiosTablaToolBarTipoTerminosImpor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=this.jMenuItemNuevoTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=this.jMenuItemNuevoRelacionesTipoTerminosImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			this.isVisibilidadCeldaModificarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemModificarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemActualizarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemEliminarTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemCancelarTipoTerminosImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTerminosImpor=this.jMenuItemGuardarCambiosTipoTerminosImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=this.jMenuItemGuardarCambiosTablaTipoTerminosImpor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoTerminosImpor(Boolean esInicializar) {
		if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoterminosimporSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTerminosImpor();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoTerminosImpor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoTerminosImpor() {
		this.jButtonNuevoTipoTerminosImpor.setVisible(this.isPermisoNuevoTipoTerminosImpor);			
		this.jButtonDuplicarTipoTerminosImpor.setVisible(this.isPermisoDuplicarTipoTerminosImpor);			
		this.jButtonCopiarTipoTerminosImpor.setVisible(this.isPermisoCopiarTipoTerminosImpor);			
		this.jButtonVerFormTipoTerminosImpor.setVisible(this.isPermisoVerFormTipoTerminosImpor);			
		
		this.jButtonAbrirOrderByTipoTerminosImpor.setVisible(this.isPermisoOrdenTipoTerminosImpor);					
		
		this.jButtonNuevoRelacionesTipoTerminosImpor.setVisible(this.isPermisoNuevoTipoTerminosImpor);			
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonModificarTipoTerminosImpor.setVisible(this.isPermisoActualizarTipoTerminosImpor);	
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonActualizarTipoTerminosImpor.setVisible(this.isPermisoActualizarTipoTerminosImpor);	
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonEliminarTipoTerminosImpor.setVisible(this.isPermisoEliminarTipoTerminosImpor);
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonCancelarTipoTerminosImpor.setVisible(this.isVisibilidadCeldaCancelarTipoTerminosImpor);						
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosTipoTerminosImpor.setVisible(this.isPermisoGuardarCambiosTipoTerminosImpor);							
		}
		
		this.jButtonGuardarCambiosTablaTipoTerminosImpor.setVisible(this.isPermisoActualizarTipoTerminosImpor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTerminosImpor() {
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonModificarTipoTerminosImpor.setVisible(this.isPermisoActualizarTipoTerminosImpor);	
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonActualizarTipoTerminosImpor.setVisible(this.isPermisoActualizarTipoTerminosImpor);	
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonEliminarTipoTerminosImpor.setVisible(this.isPermisoEliminarTipoTerminosImpor);
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonCancelarTipoTerminosImpor.setVisible(this.isVisibilidadCeldaCancelarTipoTerminosImpor);							
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosTipoTerminosImpor.setVisible((this.isVisibilidadCeldaGuardarTipoTerminosImpor && this.isPermisoGuardarCambiosTipoTerminosImpor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoTerminosImpor() {
		if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoTerminosImpor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoTerminosImpor() {
	}
	
	public void jTableDatosTipoTerminosImporListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoTerminosImpor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoTerminosImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.gettipoterminosimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoterminosimpor==null) {
						this.tipoterminosimpor = new TipoTerminosImpor();
					}

					this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.tipoterminosimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
				}

				if(this.tipoterminosimpor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoterminosimpor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTerminosImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoTerminosImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.gettipoterminosimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoterminosimpor==null) {
						this.tipoterminosimpor = new TipoTerminosImpor();
					}

					this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.tipoterminosimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
				}

				if(this.tipoterminosimpor.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoterminosimpor.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTerminosImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoTerminosImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.gettipoterminosimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoterminosimpor==null) {
						this.tipoterminosimpor = new TipoTerminosImpor();
					}

					this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.tipoterminosimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);
				}

				if(this.tipoterminosimpor.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoterminosimpor.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTerminosImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoTerminosImpor() {
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoTerminosImpor.dispose();
			this.jInternalFrameDetalleFormTipoTerminosImpor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoTerminosImpor!=null) {
			this.jInternalFrameReporteDinamicoTipoTerminosImpor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoTerminosImpor.dispose();
			this.jInternalFrameReporteDinamicoTipoTerminosImpor=null;
		}
		
		if(this.jInternalFrameImportacionTipoTerminosImpor!=null) {
			this.jInternalFrameImportacionTipoTerminosImpor.setVisible(false);	    			
			this.jInternalFrameImportacionTipoTerminosImpor.dispose();
			this.jInternalFrameImportacionTipoTerminosImpor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoTerminosImpor();
			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoTerminosImpor")) {
				jButtonNuevoTipoTerminosImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoTerminosImpor")) {
				jButtonDuplicarTipoTerminosImporActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoTerminosImpor")) {
				jButtonCopiarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoTerminosImpor")) {
				jButtonVerFormTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoTerminosImpor")) {
				jButtonNuevoTipoTerminosImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoTerminosImpor")) {
				jButtonDuplicarTipoTerminosImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoTerminosImpor")) {
				jButtonNuevoTipoTerminosImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoTerminosImpor")) {
				jButtonDuplicarTipoTerminosImporActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoTerminosImpor")) {
				jButtonNuevoTipoTerminosImporActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoTerminosImpor")) {
				jButtonNuevoTipoTerminosImporActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoTerminosImpor")) {
				jButtonNuevoTipoTerminosImporActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoTerminosImpor")) {
				jButtonModificarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoTerminosImpor")) {
				jButtonModificarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoTerminosImpor")) {
				jButtonModificarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoTerminosImpor")) {
				jButtonActualizarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoTerminosImpor")) {
				jButtonActualizarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoTerminosImpor")) {
				jButtonActualizarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoTerminosImpor")) {
				jButtonEliminarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoTerminosImpor")) {
				jButtonEliminarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoTerminosImpor")) {
				jButtonEliminarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoTerminosImpor")) {
				jButtonCancelarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoTerminosImpor")) {
				jButtonCancelarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoTerminosImpor")) {
				jButtonCancelarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoTerminosImpor")) {
				jButtonCerrarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoTerminosImpor")) {
				jButtonCerrarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoTerminosImpor")) {
				jButtonCerrarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoTerminosImpor")) {
				jButtonMostrarOcultarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoTerminosImpor")) {
				jButtonCancelarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoTerminosImpor")) {
				jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoTerminosImpor")) {
				jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoTerminosImpor")) {
				jButtonCopiarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoTerminosImpor")) {
				jButtonVerFormTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoTerminosImpor")) {
				jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoTerminosImpor")) {
				jButtonCopiarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoTerminosImpor")) {
				jButtonVerFormTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoTerminosImpor")) {
				jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoTerminosImpor")) {
				jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoTerminosImpor")) {
				jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoTerminosImpor")) {
				jButtonRecargarInformacionTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoTerminosImpor")) {
				jButtonRecargarInformacionTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoTerminosImpor")) {
				jButtonRecargarInformacionTipoTerminosImporActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoTerminosImpor")) {
				jButtonAnterioresTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoTerminosImpor")) {
				jButtonAnterioresTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoTerminosImpor")) {
				jButtonAnterioresTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoTerminosImpor")) {
				jButtonSiguientesTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoTerminosImpor")) {
				jButtonSiguientesTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoTerminosImpor")) {
				jButtonSiguientesTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoTerminosImpor") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoTerminosImpor")) {
				jButtonAbrirOrderByTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoTerminosImpor") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoTerminosImpor")) {
				jButtonMostrarOcultarTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTerminosImpor")) {
				jButtonNuevoGuardarCambiosTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoTerminosImpor")) {
				jButtonNuevoGuardarCambiosTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoTerminosImpor")) {
				jButtonNuevoGuardarCambiosTipoTerminosImporActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoTerminosImpor")) {
				jButtonCerrarReporteDinamicoTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoTerminosImpor")) {
				jButtonGenerarReporteDinamicoTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoTerminosImpor")) {
				
				jButtonGenerarExcelReporteDinamicoTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoTerminosImpor")) {
				jButtonCerrarImportacionTipoTerminosImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoTerminosImpor")) {
				
				jButtonGenerarImportacionTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoTerminosImpor")) {
				
				jButtonAbrirImportacionTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoTerminosImpor")) {
				jComboBoxTiposAccionesTipoTerminosImporActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoTerminosImpor")) {
				jComboBoxTiposRelacionesTipoTerminosImporActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoTerminosImpor")) {
				jComboBoxTiposAccionesTipoTerminosImporActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoTerminosImpor")) {
				
				jComboBoxTiposSeleccionarTipoTerminosImporActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoTerminosImpor")) {
				jTextFieldValorCampoGeneralTipoTerminosImporActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoTerminosImpor")) {
				jButtonAbrirOrderByTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoTerminosImpor")) {
				jButtonAbrirOrderByTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoTerminosImpor")) {
				jButtonCerrarOrderByTipoTerminosImporActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTerminosImporBusqueda")) {
				this.jButtonidTipoTerminosImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoTerminosImporBusqueda")) {
				this.jButtoncodigoTipoTerminosImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTerminosImporBusqueda")) {
				this.jButtonnombreTipoTerminosImporBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoTerminosImpor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTerminosImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				


				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoTerminosImpor tipoterminosimporLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoterminosimporLocal=this.tipoterminosimpor;
			} else {
				tipoterminosimporLocal=this.tipoterminosimporAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
							
				
				


				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTerminosImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
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
			
			


			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTerminosImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
								
						
				


				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
								
				
				


				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTerminosImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTerminosImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTerminosImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
							
				
				


				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTerminosImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
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
			
			


			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTerminosImporActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
								
				
				


				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTerminosImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTerminosImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTerminosImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoTerminosImpor")) {
					jCheckBoxSeleccionarTodosTipoTerminosImporItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoTerminosImpor")) {
					jCheckBoxSeleccionadosTipoTerminosImporItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoTerminosImpor")) {
					
				}
				
				


				
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
												
				
				


				
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTerminosImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTerminosImporActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
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
			
			


			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTerminosImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoterminosimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoterminosimpor);
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
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
				
				


				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTerminosImpor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTerminosImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTerminosImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoterminosimporAnterior =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoTerminosImpor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoTerminosImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoTerminosImpor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoterminosimpor =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoterminosimpor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoTerminosImpor")) {
				
				}
				
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoTerminosImpor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoTerminosImpor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoTerminosImpor")) {
			
			}
			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoTerminosImpor();
			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
			if(sTipo.equals("NuevoTipoTerminosImpor")) {
				jButtonNuevoTipoTerminosImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoTerminosImpor")) {
				jButtonDuplicarTipoTerminosImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoTerminosImpor")) {
				jButtonCopiarTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoTerminosImpor")) {
				jButtonVerFormTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoTerminosImpor")) {
				jButtonNuevoTipoTerminosImporActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoTerminosImpor")) {
				jButtonModificarTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoTerminosImpor")) {
				jButtonActualizarTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoTerminosImpor")) {
				jButtonEliminarTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoTerminosImpor")) {
				jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoTerminosImpor")) {
				jButtonCancelarTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoTerminosImpor")) {
				jButtonCerrarTipoTerminosImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoTerminosImpor")) {
				jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTerminosImpor")) {
				jButtonNuevoGuardarCambiosTipoTerminosImporActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoTerminosImpor")) {
				jButtonAbrirOrderByTipoTerminosImporActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoTerminosImpor")) {
				jButtonRecargarInformacionTipoTerminosImporActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoTerminosImpor")) {
				jButtonAnterioresTipoTerminosImporActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoTerminosImpor")) {
				jButtonSiguientesTipoTerminosImporActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTerminosImporBusqueda")) {
				this.jButtonidTipoTerminosImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoTerminosImporBusqueda")) {
				this.jButtoncodigoTipoTerminosImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTerminosImporBusqueda")) {
				this.jButtonnombreTipoTerminosImporBusquedaActionPerformed(evt);
			}
			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoTerminosImpor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoTerminosImpor")) {
				closingInternalFrameTipoTerminosImpor();
				
			} else if(sTipo.equals("jButtonCancelarTipoTerminosImpor")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoTerminosImpor = (JInternalFrameBase)evt.getSource();
	            	
	            TipoTerminosImporBeanSwingJInternalFrame jInternalFrameParent=(TipoTerminosImporBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTerminosImpor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoTerminosImporActionPerformed(null);
			}
			
			TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoterminosimpor,new Object(),this.tipoterminosimporParameterGeneral,this.tipoterminosimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoTerminosImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoTerminosImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoTerminosImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoterminosimpor)) {
			if(!esControlTabla) {
				if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.tipoterminosimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);			
				}
				
				if(this.tipoterminosimporSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoTerminosImpor(this.tipoterminosimpor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoterminosimporReturnGeneral=tipoterminosimporLogic.procesarEventosTipoTerminosImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoterminosimporLogic.getTipoTerminosImpors(),this.tipoterminosimpor,this.tipoterminosimporParameterGeneral,this.isEsNuevoTipoTerminosImpor,classes);//this.tipoterminosimporLogic.getTipoTerminosImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoTerminosImpor(this.tipoterminosimporReturnGeneral,this.tipoterminosimporBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoterminosimporSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoTerminosImpor(classes,this.tipoterminosimporReturnGeneral,this.tipoterminosimporBean,false);
					}
						
					if(this.tipoterminosimporReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoTerminosImpor(this.tipoterminosimporReturnGeneral.getTipoTerminosImpor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoTerminosImpor(this.tipoterminosimporReturnGeneral.getTipoTerminosImpor());	
					}
						
					if(this.tipoterminosimporReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoTerminosImpor(this.tipoterminosimporReturnGeneral.getTipoTerminosImpor(),classes);//this.tipoterminosimporBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoTerminosImpor(this.tipoterminosimpor,classes);//this.tipoterminosimporBean);									
				}
			
				if(TipoTerminosImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoTerminosImpor(this.tipoterminosimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTerminosImpor(this.tipoterminosimpor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoterminosimporAnterior!=null) {
						this.tipoterminosimpor=this.tipoterminosimporAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoterminosimporReturnGeneral=tipoterminosimporLogic.procesarEventosTipoTerminosImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoterminosimporLogic.getTipoTerminosImpors(),this.tipoterminosimpor,this.tipoterminosimporParameterGeneral,this.isEsNuevoTipoTerminosImpor,classes);//this.tipoterminosimporLogic.getTipoTerminosImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoterminosimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoterminosimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoterminosimporReturnGeneral.getTipoTerminosImpor(),tipoterminosimporLogic.getTipoTerminosImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoterminosimporReturnGeneral.getTipoTerminosImpor(),this.tipoterminosimpors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoTerminosImpor.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoTerminosImpor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoTerminosImpor();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoTerminosImpor() throws Exception {
		
		TipoTerminosImporModel tipoterminosimporModel=(TipoTerminosImporModel)this.jTableDatosTipoTerminosImpor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoterminosimporModel.tipoterminosimpors=this.tipoterminosimporLogic.getTipoTerminosImpors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoterminosimporModel.tipoterminosimpors=this.tipoterminosimpors;
		}
		
		
		((TipoTerminosImporModel) this.jTableDatosTipoTerminosImpor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoTerminosImpor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoterminosimporAnterior(),this.tipoterminosimporLogic.getTipoTerminosImpors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoterminosimporAnterior(),this.tipoterminosimpors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoTerminosImpor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
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
										
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoterminosimpor,new Object(),generalEntityParameterGeneral,this.tipoterminosimporReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoterminosimporSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoTerminosImporConstantesFunciones.getClassesRelationshipsOfTipoTerminosImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoTerminosImporConstantesFunciones.getClassesRelationshipsFromStringsOfTipoTerminosImpor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoTerminosImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoTerminosImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoterminosimpor,new Object(),generalEntityParameterGeneral,this.tipoterminosimporReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoTerminosImpor(TipoTerminosImporBean tipoterminosimporBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoTerminosImpor(ArrayList<Classe> classes,TipoTerminosImporReturnGeneral tipoterminosimporReturnGeneral,TipoTerminosImporBean tipoterminosimporBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoterminosimpor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoTerminosImpor = new TipoTerminosImporDetalleFormJInternalFrame(jDesktopPane,this.tipoterminosimporSessionBean.getConGuardarRelaciones(),this.tipoterminosimporSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTerminosImpor);
		this.jInternalFrameDetalleFormTipoTerminosImpor.setVisible(false);
		this.jInternalFrameDetalleFormTipoTerminosImpor.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.tipoterminosimporLogic=this.tipoterminosimporLogic;
		
		this.cargarCombosFrameForeignKeyTipoTerminosImpor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTerminosImpor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTerminosImpor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoTerminosImpor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoTerminosImpor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTerminosImpor"));
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonModificarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"ModificarTipoTerminosImpor"));

		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonModificarToolBarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTerminosImpor"));
					
		this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemModificarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTerminosImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonActualizarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"ActualizarTipoTerminosImpor"));
		
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonActualizarToolBarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTerminosImpor"));
						
		this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemActualizarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTerminosImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonEliminarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"EliminarTipoTerminosImpor"));
		
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonEliminarToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTerminosImpor"));
								
		this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemEliminarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTerminosImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonCancelarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"CancelarTipoTerminosImpor"));
		
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonCancelarToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTerminosImpor"));
					
		this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemCancelarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTerminosImpor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemDetalleCerrarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTerminosImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTerminosImpor"));
		
		
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTerminosImpor"));
		
		
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTerminosImpor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonidTipoTerminosImporBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTerminosImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtoncodigoTipoTerminosImporBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTerminosImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonnombreTipoTerminosImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTerminosImporBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoTerminosImpor.jTabbedPaneRelacionesTipoTerminosImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTerminosImpor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoTerminosImpor"));
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTerminosImpor"));
		}
		
		this.jTableDatosTipoTerminosImpor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoTerminosImpor"));
		
		this.jTableDatosTipoTerminosImpor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoTerminosImpor"));
		
		this.jButtonNuevoTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"NuevoTipoTerminosImpor"));
		
		this.jButtonDuplicarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"DuplicarTipoTerminosImpor"));
		
		this.jButtonCopiarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"CopiarTipoTerminosImpor"));
		
		this.jButtonVerFormTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"VerFormTipoTerminosImpor"));
		
		
		this.jButtonNuevoToolBarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoTerminosImpor"));
			
		this.jButtonDuplicarToolBarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoTerminosImpor"));
			
		this.jMenuItemNuevoTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoTerminosImpor"));
			
		this.jMenuItemDuplicarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoTerminosImpor"));		
		
		
		this.jButtonNuevoRelacionesTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoTerminosImpor"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoTerminosImpor"));
			
		this.jMenuItemNuevoRelacionesTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoTerminosImpor"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonModificarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"ModificarTipoTerminosImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonModificarToolBarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTerminosImpor"));
			
			this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemModificarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTerminosImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonActualizarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"ActualizarTipoTerminosImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonActualizarToolBarTipoTerminosImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTerminosImpor"));
				
			this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemActualizarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTerminosImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonEliminarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"EliminarTipoTerminosImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonEliminarToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTerminosImpor"));
						
			this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemEliminarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTerminosImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonCancelarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"CancelarTipoTerminosImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonCancelarToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTerminosImpor"));
			
			this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemCancelarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTerminosImpor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoTerminosImpor"));		
		
		
		this.jButtonCerrarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"CerrarTipoTerminosImpor"));
		
		
		this.jButtonCerrarToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoTerminosImpor"));
			
		this.jMenuItemCerrarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoTerminosImpor"));
			
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jMenuItemDetalleCerrarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTerminosImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoTerminosImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTerminosImpor"));
		}
		
		this.jButtonCopiarToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoTerminosImpor"));
			
		this.jButtonVerFormToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoTerminosImpor"));
		
		this.jMenuItemGuardarCambiosTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoTerminosImpor"));
			
		this.jMenuItemCopiarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoTerminosImpor"));		
		
		this.jMenuItemVerFormTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoTerminosImpor"));		
		
		
		this.jButtonGuardarCambiosTablaTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTerminosImpor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoTerminosImpor"));
			
		this.jMenuItemGuardarCambiosTablaTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTerminosImpor"));		
		
		
		
		this.jButtonRecargarInformacionTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoTerminosImpor"));
					
		this.jButtonRecargarInformacionToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoTerminosImpor"));
		
		this.jMenuItemRecargarInformacionTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoTerminosImpor"));		
		
		
		
		this.jButtonAnterioresTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"AnterioresTipoTerminosImpor"));
		
		
		this.jButtonAnterioresToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoTerminosImpor"));
		
		this.jMenuItemAnterioresTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoTerminosImpor"));		
		
		
		this.jButtonSiguientesTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"SiguientesTipoTerminosImpor"));
		
		
		this.jButtonSiguientesToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoTerminosImpor"));
			
		this.jMenuItemSiguientesTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoTerminosImpor"));
			
		this.jMenuItemAbrirOrderByTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoTerminosImpor"));
			
		this.jMenuItemMostrarOcultarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoTerminosImpor"));
			
		this.jMenuItemDetalleAbrirOrderByTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoTerminosImpor"));
			
		this.jMenuItemDetalleMostarOcultarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoTerminosImpor"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoTerminosImpor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoTerminosImpor"));
			
		this.jMenuItemNuevoGuardarCambiosTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoTerminosImpor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoTerminosImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoTerminosImpor"));

		this.jCheckBoxSeleccionadosTipoTerminosImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoTerminosImpor"));
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTerminosImpor"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoTerminosImpor"));
			
		this.jComboBoxTiposAccionesTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoTerminosImpor"));
					
		this.jComboBoxTiposSeleccionarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoTerminosImpor"));
			
		this.jTextFieldValorCampoGeneralTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoTerminosImpor"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonidTipoTerminosImporBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTerminosImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtoncodigoTipoTerminosImporBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTerminosImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonnombreTipoTerminosImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTerminosImporBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoTerminosImpor!=null) {
				this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTerminosImpor"));
				this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTerminosImpor"));
				this.jInternalFrameReporteDinamicoTipoTerminosImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTerminosImpor"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTerminosImpor"));				
			//this.jButtonGenerarReporteDinamicoTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTerminosImpor"));
			//this.jButtonGenerarExcelReporteDinamicoTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTerminosImpor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoTerminosImpor!=null) {
				this.jInternalFrameImportacionTipoTerminosImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTerminosImpor"));
				this.jInternalFrameImportacionTipoTerminosImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTerminosImpor"));
				this.jInternalFrameImportacionTipoTerminosImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTerminosImpor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoTerminosImpor"));
			
			this.jButtonAbrirOrderByToolBarTipoTerminosImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoTerminosImpor"));			
			
			if(this.jInternalFrameOrderByTipoTerminosImpor!=null) {
				this.jInternalFrameOrderByTipoTerminosImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTerminosImpor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTerminosImpor.jTabbedPaneRelacionesTipoTerminosImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTerminosImpor"));
		
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
            		closingInternalFrameTipoTerminosImpor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoTerminosImpor = (JInternalFrameBase)event.getSource();
	            	
	            TipoTerminosImporBeanSwingJInternalFrame jInternalFrameParent=(TipoTerminosImporBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTerminosImpor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoTerminosImporActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoTerminosImpor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoTerminosImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoTerminosImpor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoTerminosImpor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTerminosImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTerminosImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTerminosImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoTerminosImpor";
		inputMap = this.jButtonNuevoTipoTerminosImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoTerminosImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTerminosImporActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTerminosImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTerminosImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTerminosImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoTerminosImpor";
		inputMap = this.jButtonNuevoRelacionesTipoTerminosImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoTerminosImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTerminosImporActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoTerminosImpor";
		inputMap = this.jButtonModificarTipoTerminosImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoTerminosImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoTerminosImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoTerminosImpor";
		inputMap = this.jButtonActualizarTipoTerminosImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoTerminosImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoTerminosImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoTerminosImpor";
		inputMap = this.jButtonEliminarTipoTerminosImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoTerminosImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoTerminosImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoTerminosImpor";
		inputMap = this.jButtonCancelarTipoTerminosImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoTerminosImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoTerminosImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoTerminosImpor";
		inputMap = this.jButtonCerrarTipoTerminosImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoTerminosImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoTerminosImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoTerminosImpor";
		inputMap = this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosTipoTerminosImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonGuardarCambiosTipoTerminosImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoTerminosImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoTerminosImpor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoTerminosImporItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoTerminosImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoTerminosImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoTerminosImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoTerminosImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoTerminosImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoTerminosImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonidTipoTerminosImporBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTerminosImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtoncodigoTipoTerminosImporBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTerminosImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTerminosImpor.jButtonnombreTipoTerminosImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTerminosImporBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoTerminosImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoTerminosImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoTerminosImporActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoTerminosImpor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoTerminosImpor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimporLogic.getTipoTerminosImpors()) {
					tipoterminosimporAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimpors) {
					tipoterminosimporAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoTerminosImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTerminosImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimporLogic.getTipoTerminosImpors()) {
						tipoterminosimporAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimpors) {
						tipoterminosimporAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimporLogic.getTipoTerminosImpors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimpors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTerminosImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTerminosImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTerminosImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoTerminosImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTerminosImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoTerminosImpor.getSelectedRows();
			
			TipoTerminosImpor tipoterminosimporLocal=new TipoTerminosImpor();
			
			//this.seleccionarTodosTipoTerminosImpor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoterminosimporLocal =(TipoTerminosImpor) this.tipoterminosimporLogic.getTipoTerminosImpors().toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoterminosimporLocal =(TipoTerminosImpor) this.tipoterminosimpors.toArray()[this.jTableDatosTipoTerminosImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoterminosimporLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimporLogic.getTipoTerminosImpors()) {
						tipoterminosimporAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimpors) {
						tipoterminosimporAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTerminosImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTerminosImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTerminosImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoTerminosImporItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoTerminosImporParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoTerminosImporActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoTerminosImpor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoTerminosImpor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimporLogic.getTipoTerminosImpors()) {
				
						if(sTipoSeleccionar.equals(TipoTerminosImporConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoterminosimporAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTerminosImporConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoterminosimporAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimpors) {
					
						if(sTipoSeleccionar.equals(TipoTerminosImporConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoterminosimporAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTerminosImporConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoterminosimporAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoTerminosImporActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoTerminosImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoTerminosImpor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoTerminosImpor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoTerminosImpor) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoTerminosImpor(conSplash);
				
					this.generarReporteTipoTerminosImporsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTerminosImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoTerminosImporsSeleccionados();
				//this.jComboBoxTiposAccionesTipoTerminosImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTerminosImporsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoTerminosImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTerminosImporsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoTerminosImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTerminosImpor();
				
				this.exportarTipoTerminosImporsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTerminosImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoTerminosImpors();
				//this.importarTipoTerminosImpors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTerminosImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTerminosImpor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoTerminosImporsSeleccionados();
				//this.jComboBoxTiposAccionesTipoTerminosImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Terminos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoTerminosImpor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoTerminosImpor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoTerminosImpor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Terminos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTerminosImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTerminosImpor.jComboBoxTiposAccionesFormularioTipoTerminosImpor.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoTerminosImpor();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoTerminosImpor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoTerminosImporActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoTerminosImpor();
			
			if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();		
			TipoTerminosImpor tipoterminosimpor=new TipoTerminosImpor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoTerminosImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoTerminosImpor.getSelectedItem();
			
			
			
			
			tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoterminosimporsSeleccionados.size()==1) {
				for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimporsSeleccionados) {
					tipoterminosimpor=tipoterminosimporAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoTerminosImpor();
			
      		//this.finishProcessTipoTerminosImpor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoTerminosImporReturnGeneral() throws Exception {
		if(this.tipoterminosimporReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoterminosimporReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoterminosimporReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoterminosimporReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoterminosimporReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoterminosimporReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoTerminosImpor(false);
		}
		
		if(this.tipoterminosimporReturnGeneral.getConRetornoLista() || this.tipoterminosimporReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoterminosimporReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoterminosimporLogic.setTipoTerminosImpors(this.tipoterminosimporReturnGeneral.getTipoTerminosImpors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoterminosimporReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoterminosimporLogic.setTipoTerminosImpor(this.tipoterminosimporReturnGeneral.getTipoTerminosImpor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoTerminosImpor(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoTerminosImpor() throws Exception {
		
		
	}
	
	public ArrayList<TipoTerminosImpor> getTipoTerminosImporsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoTerminosImpor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimporLogic.getTipoTerminosImpors()) {
					if(tipoterminosimporAux.getIsSelected()) {
						tipoterminosimporsSeleccionados.add(tipoterminosimporAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTerminosImpor tipoterminosimporAux:this.tipoterminosimpors) {
					if(tipoterminosimporAux.getIsSelected()) {
						tipoterminosimporsSeleccionados.add(tipoterminosimporAux);				
					}
				}
			}
			
			if(tipoterminosimporsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoterminosimporsSeleccionados.addAll(this.tipoterminosimporLogic.getTipoTerminosImpors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoterminosimporsSeleccionados.addAll(this.tipoterminosimpors);				
					}
				}
			}
		} else {
			tipoterminosimporsSeleccionados.add(this.tipoterminosimpor);
		}
		
		return tipoterminosimporsSeleccionados;
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
	
	public void generarReporteTipoTerminosImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoTerminosImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoTerminosImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTerminosImporsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTerminosImporsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Terminos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoTerminosImporsSeleccionados() throws Exception {
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();		
		
		tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoTerminosImpors("Todos",tipoterminosimporsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoTerminosImporsSeleccionados() throws Exception {
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();		
		
		tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoTerminosImpors("Todos",tipoterminosimporsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoTerminosImporsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();
		
		tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoTerminosImpors("Todos",tipoterminosimporsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoTerminosImporsSeleccionados() throws Exception {
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoTerminosImpor();
		
		
		tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoTerminosImpor();
		
		
		//this.generarReporteTipoTerminosImpors("Todos",tipoterminosimporsSeleccionados ,tipoterminosimporImplementable,tipoterminosimporImplementableHome);
	}
	
	public void mostrarImportacionTipoTerminosImpors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoTerminosImpor();
		
		this.abrirFrameImportacionTipoTerminosImpor();		
		
			
		//this.generarReporteTipoTerminosImpors("Todos",tipoterminosimporsSeleccionados ,tipoterminosimporImplementable,tipoterminosimporImplementableHome);
	}
	
	public void importarTipoTerminosImpors() throws Exception {		
	
	}
	
	public void exportarTipoTerminosImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoTerminosImporsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoTerminosImporsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoTerminosImporsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Terminos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoTerminosImporsSeleccionados() throws Exception {
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();		
		
		tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoterminosimpor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoTerminosImpor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimporsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoTerminosImpor(tipoterminosimporAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoterminosimporAux.setsDetalleGeneralEntityReporte(tipoterminosimporAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Terminos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoTerminosImpor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoTerminosImporConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTerminosImporConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTerminosImporConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTerminosImporConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoterminosimpor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoterminosimpor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoterminosimpor.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoterminosimpor.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoTerminosImporsSeleccionados() throws Exception {
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();		
		
		tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoterminosimpor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoTerminosImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoTerminosImpor(row);				
				iRow++;
			}				
			
			for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimporsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoTerminosImpor(tipoterminosimporAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Terminos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoTerminosImporsSeleccionados() throws Exception {
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();		
		
		tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoterminosimpor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoterminosimpors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoterminosimpor");
			//elementRoot.appendChild(element);
		
			for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimporsSeleccionados) {
				element = document.createElement("tipoterminosimpor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoTerminosImpor(tipoterminosimporAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Terminos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoTerminosImpor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTerminosImporConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTerminosImporConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoTerminosImporConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTerminosImporConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoterminosimpor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoterminosimpor.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoterminosimpor.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoTerminosImpor(TipoTerminosImpor tipoterminosimpor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoTerminosImporConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoterminosimpor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoTerminosImporConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoterminosimpor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoTerminosImporConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoterminosimpor.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoTerminosImporConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoterminosimpor.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoTerminosImporsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados=new ArrayList<TipoTerminosImpor>();
		
		tipoterminosimporsSeleccionados=this.getTipoTerminosImporsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoTerminosImpor(tipoterminosimporsSeleccionados);
		
		this.generarReporteTipoTerminosImpors("Todos",tipoterminosimporsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoTerminosImpor(ArrayList<TipoTerminosImpor> tipoterminosimporsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoTerminosImpor tipoterminosimporAux:tipoterminosimporsSeleccionados) {
				tipoterminosimporAux.setsDetalleGeneralEntityReporte(tipoterminosimporAux.toString());
			
				if(sTipoSeleccionar.equals(TipoTerminosImporConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoterminosimporAux.setsDescripcionGeneralEntityReporte1(tipoterminosimporAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoTerminosImporConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoterminosimporAux.setsDescripcionGeneralEntityReporte1(tipoterminosimporAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTerminosImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoTerminosImpor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoTerminosImpor=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=true;
				this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=true;
			}
			
			this.isVisibilidadCeldaModificarTipoTerminosImpor=false;
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=false;
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=false;
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=false;
			this.isVisibilidadCeldaModificarTipoTerminosImpor=false;
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=true;
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=false;
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=false;
			this.isVisibilidadCeldaModificarTipoTerminosImpor=false;
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=true;
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=true;
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=false;
			this.isVisibilidadCeldaModificarTipoTerminosImpor=false;
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=true;
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=false;
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=true;
			this.isVisibilidadCeldaModificarTipoTerminosImpor=false;
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=false;
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=false;
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=false;
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=false;
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=false;
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=false;
			this.isVisibilidadCeldaModificarTipoTerminosImpor=true;
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=false;
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=false;
			this.isVisibilidadCeldaCancelarTipoTerminosImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTerminosImpor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoTerminosImporJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=true;
		} else {
			this.actualizarEstadoPanelsTipoTerminosImpor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoTerminosImpor=false;
			//this.isVisibilidadCeldaVerFormTipoTerminosImpor=false;
			this.isVisibilidadCeldaDuplicarTipoTerminosImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoterminosimporSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoTerminosImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTerminosImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
			if(!tipoterminosimporSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=false;												
			}
			
			this.jButtonCerrarTipoTerminosImpor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTerminosImpor=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoterminosimpor)) {
			this.isVisibilidadCeldaActualizarTipoTerminosImpor=false;
			this.isVisibilidadCeldaEliminarTipoTerminosImpor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTerminosImpor() {
	}
	
	public void actualizarEstadoPanelsTipoTerminosImpor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoTerminosImpor!=null) {
				this.jScrollPanelDatosEdicionTipoTerminosImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTerminosImpor!=null) {
				this.jScrollPanelDatosTipoTerminosImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTerminosImpor!=null) {
				this.jPanelPaginacionTipoTerminosImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTerminosImpor!=null) {
				this.jPanelParametrosReportesTipoTerminosImpor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoTerminosImpor!=null) {
				this.jScrollPanelDatosEdicionTipoTerminosImpor.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoTerminosImpor!=null) {
				this.jScrollPanelDatosTipoTerminosImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTerminosImpor!=null) {
				this.jPanelPaginacionTipoTerminosImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTerminosImpor!=null) {
				this.jPanelParametrosReportesTipoTerminosImpor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoTerminosImpor!=null) {
				this.jScrollPanelDatosEdicionTipoTerminosImpor.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoTerminosImpor!=null) {
				this.jScrollPanelDatosTipoTerminosImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTerminosImpor!=null) {
				this.jPanelPaginacionTipoTerminosImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTerminosImpor!=null) {
				this.jPanelParametrosReportesTipoTerminosImpor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoTerminosImpor!=null) {
				this.jScrollPanelDatosEdicionTipoTerminosImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTerminosImpor!=null) {
				this.jScrollPanelDatosTipoTerminosImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTerminosImpor!=null) {
				this.jPanelPaginacionTipoTerminosImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTerminosImpor!=null) {
				this.jPanelParametrosReportesTipoTerminosImpor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoTerminosImpor!=null) {
				this.jScrollPanelDatosEdicionTipoTerminosImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTerminosImpor!=null) {
				this.jScrollPanelDatosTipoTerminosImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTerminosImpor!=null) {
				this.jPanelPaginacionTipoTerminosImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTerminosImpor!=null) {
				this.jPanelParametrosReportesTipoTerminosImpor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoTerminosImpor!=null) {
				this.jScrollPanelDatosEdicionTipoTerminosImpor.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoTerminosImpor!=null) {
				this.jScrollPanelDatosTipoTerminosImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTerminosImpor!=null) {
				this.jPanelPaginacionTipoTerminosImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTerminosImpor!=null) {
				this.jPanelParametrosReportesTipoTerminosImpor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoTerminosImpor!=null) {
				this.jScrollPanelDatosEdicionTipoTerminosImpor.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoTerminosImpor!=null) {
				this.jScrollPanelDatosTipoTerminosImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTerminosImpor!=null) {
				this.jPanelPaginacionTipoTerminosImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTerminosImpor!=null) {
				this.jPanelParametrosReportesTipoTerminosImpor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoTerminosImporSessionBean tipoterminosimporSessionBean=new TipoTerminosImporSessionBean();
		
		if(this.tipoterminosimporSessionBean==null) {
			this.tipoterminosimporSessionBean=new TipoTerminosImporSessionBean();
		}
		
		this.tipoterminosimporSessionBean.setsUltimaBusquedaTipoTerminosImpor(this.getsAccionBusqueda());
		this.tipoterminosimporSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoterminosimporSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoTerminosImporSessionBean tipoterminosimporSessionBean=new TipoTerminosImporSessionBean();
		
		if(this.tipoterminosimporSessionBean==null) {
			this.tipoterminosimporSessionBean=new TipoTerminosImporSessionBean();
		}
		
		if(this.tipoterminosimporSessionBean.getsUltimaBusquedaTipoTerminosImpor()!=null&&!this.tipoterminosimporSessionBean.getsUltimaBusquedaTipoTerminosImpor().equals("")) {
			this.setsAccionBusqueda(tipoterminosimporSessionBean.getsUltimaBusquedaTipoTerminosImpor());
			this.setiNumeroPaginacion(tipoterminosimporSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoterminosimporSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoterminosimporSessionBean.setsUltimaBusquedaTipoTerminosImpor("");
		this.tipoterminosimporSessionBean.setiNumeroPaginacion(TipoTerminosImporConstantesFunciones.INUMEROPAGINACION);
		this.tipoterminosimporSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoTerminosImpor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoTerminosImpor() {
		this.updateBorderResaltarBusquedasFormularioTipoTerminosImpor();
		this.updateVisibilidadBusquedasFormularioTipoTerminosImpor();
		this.updateHabilitarBusquedasFormularioTipoTerminosImpor();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoTerminosImpor() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoTerminosImpor() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoTerminosImpor() {
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
	
	public void updateControlesFormularioTipoTerminosImpor() throws Exception {

		if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoTerminosImpor();
		this.updateVisibilidadResaltarControlesFormularioTipoTerminosImpor();
		this.updateHabilitarResaltarControlesFormularioTipoTerminosImpor();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoTerminosImpor() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoterminosimporConstantesFunciones.resaltaridTipoTerminosImpor!=null && this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.setBorder(this.tipoterminosimporConstantesFunciones.resaltaridTipoTerminosImpor);}
		if(this.tipoterminosimporConstantesFunciones.resaltarcodigoTipoTerminosImpor!=null && this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldcodigoTipoTerminosImpor.setBorder(this.tipoterminosimporConstantesFunciones.resaltarcodigoTipoTerminosImpor);}
		if(this.tipoterminosimporConstantesFunciones.resaltarnombreTipoTerminosImpor!=null && this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {this.jInternalFrameDetalleFormTipoTerminosImpor.jTextAreanombreTipoTerminosImpor.setBorder(this.tipoterminosimporConstantesFunciones.resaltarnombreTipoTerminosImpor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoTerminosImpor() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
	
		//this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.setVisible(this.tipoterminosimporConstantesFunciones.mostraridTipoTerminosImpor);
		this.jInternalFrameDetalleFormTipoTerminosImpor.jPanelidTipoTerminosImpor.setVisible(this.tipoterminosimporConstantesFunciones.mostraridTipoTerminosImpor);
		//this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldcodigoTipoTerminosImpor.setVisible(this.tipoterminosimporConstantesFunciones.mostrarcodigoTipoTerminosImpor);
		this.jInternalFrameDetalleFormTipoTerminosImpor.jPanelcodigoTipoTerminosImpor.setVisible(this.tipoterminosimporConstantesFunciones.mostrarcodigoTipoTerminosImpor);
		//this.jInternalFrameDetalleFormTipoTerminosImpor.jTextAreanombreTipoTerminosImpor.setVisible(this.tipoterminosimporConstantesFunciones.mostrarnombreTipoTerminosImpor);
		this.jInternalFrameDetalleFormTipoTerminosImpor.jPanelnombreTipoTerminosImpor.setVisible(this.tipoterminosimporConstantesFunciones.mostrarnombreTipoTerminosImpor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoTerminosImpor() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTerminosImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTerminosImpor!=null) {
	
		this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldidTipoTerminosImpor.setEnabled(this.tipoterminosimporConstantesFunciones.activaridTipoTerminosImpor);
		this.jInternalFrameDetalleFormTipoTerminosImpor.jTextFieldcodigoTipoTerminosImpor.setEnabled(this.tipoterminosimporConstantesFunciones.activarcodigoTipoTerminosImpor);
		this.jInternalFrameDetalleFormTipoTerminosImpor.jTextAreanombreTipoTerminosImpor.setEnabled(this.tipoterminosimporConstantesFunciones.activarnombreTipoTerminosImpor);
		}
	}
	
		
}