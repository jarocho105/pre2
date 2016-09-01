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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TipoNotaCreditoSoliConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoNotaCreditoSoliParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoNotaCreditoSoliParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoNotaCreditoSoliBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoNotaCreditoSoliBeanSwingJInternalFrame extends TipoNotaCreditoSoliJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoNotaCreditoSoliBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoNotaCreditoSoli> tiponotacreditosoliValidator = new ClassValidator<TipoNotaCreditoSoli>(TipoNotaCreditoSoli.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoNotaCreditoSoli tiponotacreditosoli;	
	public TipoNotaCreditoSoli tiponotacreditosoliAux;
	public TipoNotaCreditoSoli tiponotacreditosoliAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoNotaCreditoSoli tiponotacreditosoliTotales;
	public Long idTipoNotaCreditoSoliActual;
	public Long iIdNuevoTipoNotaCreditoSoli=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosNotaCreditoSoli=false;

	public Boolean getIsTienePermisosNotaCreditoSoli() {
		return isTienePermisosNotaCreditoSoli;
	}

	public void setIsTienePermisosNotaCreditoSoli(Boolean isTienePermisosNotaCreditoSoli) {
		this.isTienePermisosNotaCreditoSoli= isTienePermisosNotaCreditoSoli;
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
	
	public Boolean isPermisoTodoTipoNotaCreditoSoli;
	public Boolean isPermisoNuevoTipoNotaCreditoSoli;
	public Boolean isPermisoActualizarTipoNotaCreditoSoli;
	public Boolean isPermisoActualizarOriginalTipoNotaCreditoSoli;
	public Boolean isPermisoEliminarTipoNotaCreditoSoli;
	public Boolean isPermisoGuardarCambiosTipoNotaCreditoSoli;
	public Boolean isPermisoConsultaTipoNotaCreditoSoli;
	public Boolean isPermisoBusquedaTipoNotaCreditoSoli;
	public Boolean isPermisoReporteTipoNotaCreditoSoli;
	public Boolean isPermisoPaginacionMedioTipoNotaCreditoSoli;
	public Boolean isPermisoPaginacionAltoTipoNotaCreditoSoli;
	public Boolean isPermisoPaginacionTodoTipoNotaCreditoSoli;
	public Boolean isPermisoCopiarTipoNotaCreditoSoli;
	public Boolean isPermisoVerFormTipoNotaCreditoSoli;
	public Boolean isPermisoDuplicarTipoNotaCreditoSoli;
	public Boolean isPermisoOrdenTipoNotaCreditoSoli;
	
	
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
	
	public TipoNotaCreditoSoliParameterReturnGeneral tiponotacreditosoliReturnGeneral;
	public TipoNotaCreditoSoliParameterReturnGeneral tiponotacreditosoliParameterGeneral;
	
	

	public NotaCreditoSoliLogic notacreditosoliLogic=null;

	public NotaCreditoSoliLogic getNotaCreditoSoliLogic() {
		return notacreditosoliLogic;
	}

	public void setNotaCreditoSoliLogic(NotaCreditoSoliLogic notacreditosoliLogic) {
		this.notacreditosoliLogic = notacreditosoliLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoNotaCreditoSoli=false;
	public Boolean esParaAccionDesdeFormularioTipoNotaCreditoSoli=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoNotaCreditoSoliSessionBeanAdditional tiponotacreditosoliSessionBeanAdditional=null;
	
	public TipoNotaCreditoSoliSessionBeanAdditional getTipoNotaCreditoSoliSessionBeanAdditional() {
		return this.tiponotacreditosoliSessionBeanAdditional;
	}
	
	public void setTipoNotaCreditoSoliSessionBeanAdditional(TipoNotaCreditoSoliSessionBeanAdditional tiponotacreditosoliSessionBeanAdditional) {
		try {
			this.tiponotacreditosoliSessionBeanAdditional=tiponotacreditosoliSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional tiponotacreditosoliBeanSwingJInternalFrameAdditional=null;
	//public class TipoNotaCreditoSoliBeanSwingJInternalFrame
	
	public TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional getTipoNotaCreditoSoliBeanSwingJInternalFrameAdditional() {
		return this.tiponotacreditosoliBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoNotaCreditoSoliBeanSwingJInternalFrameAdditional(TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional tiponotacreditosoliBeanSwingJInternalFrameAdditional) {
		try {
			this.tiponotacreditosoliBeanSwingJInternalFrameAdditional=tiponotacreditosoliBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoNotaCreditoSoliLogic tiponotacreditosoliLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoNotaCreditoSoli tiponotacreditosoliBean;
	public TipoNotaCreditoSoliConstantesFunciones tiponotacreditosoliConstantesFunciones;
	//public TipoNotaCreditoSoliParameterReturnGeneral tiponotacreditosoliReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoNotaCreditoSoli> tiponotacreditosolis;	
	//public List<TipoNotaCreditoSoli> tiponotacreditosolisEliminados;
	//public List<TipoNotaCreditoSoli> tiponotacreditosolisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoNotaCreditoSoli=false;
	public Boolean isVisibilidadCeldaDuplicarTipoNotaCreditoSoli=true;
	public Boolean isVisibilidadCeldaCopiarTipoNotaCreditoSoli=true;
	public Boolean isVisibilidadCeldaVerFormTipoNotaCreditoSoli=true;
	public Boolean isVisibilidadCeldaOrdenTipoNotaCreditoSoli=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=false;
	public Boolean isVisibilidadCeldaModificarTipoNotaCreditoSoli=false;
	public Boolean isVisibilidadCeldaActualizarTipoNotaCreditoSoli=false;
	public Boolean isVisibilidadCeldaEliminarTipoNotaCreditoSoli=false;
	public Boolean isVisibilidadCeldaCancelarTipoNotaCreditoSoli=false;
	public Boolean isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=false;	
	
	
	
	public Long getiIdNuevoTipoNotaCreditoSoli() {
		return this.iIdNuevoTipoNotaCreditoSoli;
	}

	public void setiIdNuevoTipoNotaCreditoSoli(Long iIdNuevoTipoNotaCreditoSoli) {
		this.iIdNuevoTipoNotaCreditoSoli = iIdNuevoTipoNotaCreditoSoli;
	}
	
	public Long getidTipoNotaCreditoSoliActual() {
		return this.idTipoNotaCreditoSoliActual;
	}

	public void setidTipoNotaCreditoSoliActual(Long idTipoNotaCreditoSoliActual) {
		this.idTipoNotaCreditoSoliActual = idTipoNotaCreditoSoliActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoNotaCreditoSoli gettiponotacreditosoli() {
		return this.tiponotacreditosoli;
	}

	public void settiponotacreditosoli(TipoNotaCreditoSoli tiponotacreditosoli) {
		this.tiponotacreditosoli = tiponotacreditosoli;
	}
	
	public TipoNotaCreditoSoli gettiponotacreditosoliAux() {
		return this.tiponotacreditosoliAux;
	}

	public void settiponotacreditosoliAux(TipoNotaCreditoSoli tiponotacreditosoliAux) {
		this.tiponotacreditosoliAux = tiponotacreditosoliAux;
	}				
	
	public TipoNotaCreditoSoli gettiponotacreditosoliAnterior() {
		return this.tiponotacreditosoliAnterior;
	}

	public void settiponotacreditosoliAnterior(TipoNotaCreditoSoli tiponotacreditosoliAnterior) {
		this.tiponotacreditosoliAnterior = tiponotacreditosoliAnterior;
	}	
	
	public TipoNotaCreditoSoli gettiponotacreditosoliTotales() {
		return this.tiponotacreditosoliTotales;
	}

	public void settiponotacreditosoliTotales(TipoNotaCreditoSoli tiponotacreditosoliTotales) {
		this.tiponotacreditosoliTotales = tiponotacreditosoliTotales;
	}	
	
	public TipoNotaCreditoSoli gettiponotacreditosoliBean() {
		return this.tiponotacreditosoliBean;
	}

	public void settiponotacreditosoliBean(TipoNotaCreditoSoli tiponotacreditosoliBean) {
		this.tiponotacreditosoliBean = tiponotacreditosoliBean;
	}	
	
	public TipoNotaCreditoSoliParameterReturnGeneral gettiponotacreditosoliReturnGeneral() {
		return this.tiponotacreditosoliReturnGeneral;
	}

	public void settiponotacreditosoliReturnGeneral(TipoNotaCreditoSoliParameterReturnGeneral tiponotacreditosoliReturnGeneral) {
		this.tiponotacreditosoliReturnGeneral = tiponotacreditosoliReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoNotaCreditoSoliLogic getTipoNotaCreditoSoliLogic()	{		
		return tiponotacreditosoliLogic;
	}

	public void setTipoNotaCreditoSoliLogic(TipoNotaCreditoSoliLogic tiponotacreditosoliLogic) {
		this.tiponotacreditosoliLogic = tiponotacreditosoliLogic;
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
	
	public Boolean getIsEsNuevoTipoNotaCreditoSoli() {
		return isEsNuevoTipoNotaCreditoSoli;
	}

	public void setIsEsNuevoTipoNotaCreditoSoli(Boolean isEsNuevoTipoNotaCreditoSoli) {
		this.isEsNuevoTipoNotaCreditoSoli = isEsNuevoTipoNotaCreditoSoli;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoNotaCreditoSoli() {
		return esParaAccionDesdeFormularioTipoNotaCreditoSoli;
	}
	
	public void setEsParaAccionDesdeFormularioTipoNotaCreditoSoli(Boolean esParaAccionDesdeFormularioTipoNotaCreditoSoli) {
		this.esParaAccionDesdeFormularioTipoNotaCreditoSoli = esParaAccionDesdeFormularioTipoNotaCreditoSoli;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoNotaCreditoSoli() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoNotaCreditoSoliConstantesFunciones.refrescarForeignKeysDescripcionesTipoNotaCreditoSoli(this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoNotaCreditoSoliConstantesFunciones.refrescarForeignKeysDescripcionesTipoNotaCreditoSoli(this.tiponotacreditosolis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiponotacreditosoliLogic.setTipoNotaCreditoSolis(this.tiponotacreditosolis);
			tiponotacreditosoliLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoNotaCreditoSoliParameterReturnGeneral getTipoNotaCreditoSoliParameterGeneral() {
		return this.tiponotacreditosoliParameterGeneral;
	}
	
	public void setTipoNotaCreditoSoliParameterGeneral(TipoNotaCreditoSoliParameterReturnGeneral tiponotacreditosoliParameterGeneral) {
		this.tiponotacreditosoliParameterGeneral = tiponotacreditosoliParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoNotaCreditoSoli() {
		return isPermisoTodoTipoNotaCreditoSoli;
	}

	public void setIsPermisoTodoTipoNotaCreditoSoli(Boolean isPermisoTodoTipoNotaCreditoSoli) {
		this.isPermisoTodoTipoNotaCreditoSoli = isPermisoTodoTipoNotaCreditoSoli;
	}

	public Boolean getIsPermisoNuevoTipoNotaCreditoSoli() {
		return isPermisoNuevoTipoNotaCreditoSoli;
	}

	public void setIsPermisoNuevoTipoNotaCreditoSoli(Boolean isPermisoNuevoTipoNotaCreditoSoli) {
		this.isPermisoNuevoTipoNotaCreditoSoli = isPermisoNuevoTipoNotaCreditoSoli;
	}

	public Boolean getIsPermisoActualizarTipoNotaCreditoSoli() {
		return isPermisoActualizarTipoNotaCreditoSoli;
	}

	public void setIsPermisoActualizarTipoNotaCreditoSoli(Boolean isPermisoActualizarTipoNotaCreditoSoli) {
		this.isPermisoActualizarTipoNotaCreditoSoli = isPermisoActualizarTipoNotaCreditoSoli;
	}

	public Boolean getIsPermisoEliminarTipoNotaCreditoSoli() {
		return isPermisoEliminarTipoNotaCreditoSoli;
	}

	public void setIsPermisoEliminarTipoNotaCreditoSoli(Boolean isPermisoEliminarTipoNotaCreditoSoli) {
		this.isPermisoEliminarTipoNotaCreditoSoli = isPermisoEliminarTipoNotaCreditoSoli;
	}

	public Boolean getIsPermisoGuardarCambiosTipoNotaCreditoSoli() {
		return isPermisoGuardarCambiosTipoNotaCreditoSoli;
	}

	public void setIsPermisoGuardarCambiosTipoNotaCreditoSoli(Boolean isPermisoGuardarCambiosTipoNotaCreditoSoli) {
		this.isPermisoGuardarCambiosTipoNotaCreditoSoli = isPermisoGuardarCambiosTipoNotaCreditoSoli;
	}
	
	public Boolean getIsPermisoConsultaTipoNotaCreditoSoli() {
		return isPermisoConsultaTipoNotaCreditoSoli;
	}

	public void setIsPermisoConsultaTipoNotaCreditoSoli(Boolean isPermisoConsultaTipoNotaCreditoSoli) {
		this.isPermisoConsultaTipoNotaCreditoSoli = isPermisoConsultaTipoNotaCreditoSoli;
	}

	public Boolean getIsPermisoBusquedaTipoNotaCreditoSoli() {
		return isPermisoBusquedaTipoNotaCreditoSoli;
	}

	public void setIsPermisoBusquedaTipoNotaCreditoSoli(Boolean isPermisoBusquedaTipoNotaCreditoSoli) {
		this.isPermisoBusquedaTipoNotaCreditoSoli = isPermisoBusquedaTipoNotaCreditoSoli;
	}

	public Boolean getIsPermisoReporteTipoNotaCreditoSoli() {
		return isPermisoReporteTipoNotaCreditoSoli;
	}

	public void setIsPermisoReporteTipoNotaCreditoSoli(Boolean isPermisoReporteTipoNotaCreditoSoli) {
		this.isPermisoReporteTipoNotaCreditoSoli = isPermisoReporteTipoNotaCreditoSoli;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoNotaCreditoSoli() {
		return isPermisoPaginacionMedioTipoNotaCreditoSoli;
	}

	public void setIsPermisoPaginacionMedioTipoNotaCreditoSoli(Boolean isPermisoPaginacionMedioTipoNotaCreditoSoli) {
		this.isPermisoPaginacionMedioTipoNotaCreditoSoli = isPermisoPaginacionMedioTipoNotaCreditoSoli;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoNotaCreditoSoli() {
		return isPermisoPaginacionTodoTipoNotaCreditoSoli;
	}

	public void setIsPermisoPaginacionTodoTipoNotaCreditoSoli(Boolean isPermisoPaginacionTodoTipoNotaCreditoSoli) {
		this.isPermisoPaginacionTodoTipoNotaCreditoSoli = isPermisoPaginacionTodoTipoNotaCreditoSoli;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoNotaCreditoSoli() {
		return isPermisoPaginacionAltoTipoNotaCreditoSoli;
	}

	public void setIsPermisoPaginacionAltoTipoNotaCreditoSoli(Boolean isPermisoPaginacionAltoTipoNotaCreditoSoli) {
		this.isPermisoPaginacionAltoTipoNotaCreditoSoli = isPermisoPaginacionAltoTipoNotaCreditoSoli;
	}
	
	public Boolean getIsPermisoCopiarTipoNotaCreditoSoli() {
		return isPermisoCopiarTipoNotaCreditoSoli;
	}

	public void setIsPermisoCopiarTipoNotaCreditoSoli(Boolean isPermisoCopiarTipoNotaCreditoSoli) {
		this.isPermisoCopiarTipoNotaCreditoSoli = isPermisoCopiarTipoNotaCreditoSoli;
	}
	
	public Boolean getIsPermisoVerFormTipoNotaCreditoSoli() {
		return isPermisoVerFormTipoNotaCreditoSoli;
	}

	public void setIsPermisoVerFormTipoNotaCreditoSoli(Boolean isPermisoVerFormTipoNotaCreditoSoli) {
		this.isPermisoVerFormTipoNotaCreditoSoli = isPermisoVerFormTipoNotaCreditoSoli;
	}
	
	public Boolean getIsPermisoDuplicarTipoNotaCreditoSoli() {
		return isPermisoDuplicarTipoNotaCreditoSoli;
	}

	public void setIsPermisoDuplicarTipoNotaCreditoSoli(Boolean isPermisoDuplicarTipoNotaCreditoSoli) {
		this.isPermisoDuplicarTipoNotaCreditoSoli = isPermisoDuplicarTipoNotaCreditoSoli;
	}
	
	public Boolean getIsPermisoOrdenTipoNotaCreditoSoli() {
		return isPermisoOrdenTipoNotaCreditoSoli;
	}

	public void setIsPermisoOrdenTipoNotaCreditoSoli(Boolean isPermisoOrdenTipoNotaCreditoSoli) {
		this.isPermisoOrdenTipoNotaCreditoSoli = isPermisoOrdenTipoNotaCreditoSoli;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoNotaCreditoSoli() {
		return isVisibilidadCeldaNuevoTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaNuevoTipoNotaCreditoSoli(Boolean isVisibilidadCeldaNuevoTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli = isVisibilidadCeldaNuevoTipoNotaCreditoSoli;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoNotaCreditoSoli() {
		return isVisibilidadCeldaDuplicarTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaDuplicarTipoNotaCreditoSoli(Boolean isVisibilidadCeldaDuplicarTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaDuplicarTipoNotaCreditoSoli = isVisibilidadCeldaDuplicarTipoNotaCreditoSoli;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoNotaCreditoSoli() {
		return isVisibilidadCeldaCopiarTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaCopiarTipoNotaCreditoSoli(Boolean isVisibilidadCeldaCopiarTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaCopiarTipoNotaCreditoSoli = isVisibilidadCeldaCopiarTipoNotaCreditoSoli;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoNotaCreditoSoli() {
		return isVisibilidadCeldaVerFormTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaVerFormTipoNotaCreditoSoli(Boolean isVisibilidadCeldaVerFormTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaVerFormTipoNotaCreditoSoli = isVisibilidadCeldaVerFormTipoNotaCreditoSoli;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoNotaCreditoSoli() {
		return isVisibilidadCeldaOrdenTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaOrdenTipoNotaCreditoSoli(Boolean isVisibilidadCeldaOrdenTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaOrdenTipoNotaCreditoSoli = isVisibilidadCeldaOrdenTipoNotaCreditoSoli;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli() {
		return isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli(Boolean isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli = isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoNotaCreditoSoli() {
		return isVisibilidadCeldaModificarTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaModificarTipoNotaCreditoSoli(Boolean isVisibilidadCeldaModificarTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaModificarTipoNotaCreditoSoli = isVisibilidadCeldaModificarTipoNotaCreditoSoli;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoNotaCreditoSoli() {
		return isVisibilidadCeldaActualizarTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaActualizarTipoNotaCreditoSoli(Boolean isVisibilidadCeldaActualizarTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli = isVisibilidadCeldaActualizarTipoNotaCreditoSoli;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoNotaCreditoSoli() {
		return isVisibilidadCeldaEliminarTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaEliminarTipoNotaCreditoSoli(Boolean isVisibilidadCeldaEliminarTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli = isVisibilidadCeldaEliminarTipoNotaCreditoSoli;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoNotaCreditoSoli() {
		return isVisibilidadCeldaCancelarTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaCancelarTipoNotaCreditoSoli(Boolean isVisibilidadCeldaCancelarTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli = isVisibilidadCeldaCancelarTipoNotaCreditoSoli;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoNotaCreditoSoli() {
		return isVisibilidadCeldaGuardarTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaGuardarTipoNotaCreditoSoli(Boolean isVisibilidadCeldaGuardarTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli = isVisibilidadCeldaGuardarTipoNotaCreditoSoli;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli() {
		return isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli(Boolean isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli) {
		this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli = isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli;
	}
		
	public TipoNotaCreditoSoliSessionBean gettiponotacreditosoliSessionBean() {
		return this.tiponotacreditosoliSessionBean;
	}
	
	public void settiponotacreditosoliSessionBean(TipoNotaCreditoSoliSessionBean tiponotacreditosoliSessionBean) {
		this.tiponotacreditosoliSessionBean=tiponotacreditosoliSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoNotaCreditoSoli tiponotacreditosoli,TipoNotaCreditoSoli tiponotacreditosoliAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoNotaCreditoSoli(tiponotacreditosoli);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiponotacreditosoliAux.setId(tiponotacreditosoli.getId());
		tiponotacreditosoliAux.setVersionRow(tiponotacreditosoli.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoNotaCreditoSoli();
		
			int intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoli,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiponotacreditosoliValidator.getInvalidValues(this.tiponotacreditosoli);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiponotacreditosoliLogic.setDatosCliente(datosCliente);
			tiponotacreditosoliLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiponotacreditosoliAux=new  TipoNotaCreditoSoli();
				
				tiponotacreditosoliAux.setIsNew(true);
				tiponotacreditosoliAux.setIsChanged(true);
				
				tiponotacreditosoliAux.setTipoNotaCreditoSoliOriginal(this.tiponotacreditosoli);
				
				tiponotacreditosoliAux.setId(this.tiponotacreditosoli.getId());	
				tiponotacreditosoliAux.setVersionRow(this.tiponotacreditosoli.getVersionRow());	
				tiponotacreditosoliAux.setcodigo(this.tiponotacreditosoli.getcodigo());	
				tiponotacreditosoliAux.setnombre(this.tiponotacreditosoli.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiponotacreditosoliAux,tiponotacreditosoliLogic.getTipoNotaCreditoSolis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponotacreditosoliAux,tiponotacreditosolis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponotacreditosoliLogic.saveTipoNotaCreditoSolis();//WithConnection
						//tiponotacreditosoliLogic.getSetVersionRowTipoNotaCreditoSolis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiponotacreditosoli,tiponotacreditosoliAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolis.addAll(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponotacreditosoliLogic.saveTipoNotaCreditoSoliRelaciones(tiponotacreditosoliAux,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());//WithConnection
								//tiponotacreditosoliLogic.getSetVersionRowTipoNotaCreditoSolis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiponotacreditosoli,tiponotacreditosoliAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(new ArrayList<NotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolis= new ArrayList<NotaCreditoSoli>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponotacreditosoliAux.setNotaCreditoSolis(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiponotacreditosoliAux,tiponotacreditosoliLogic.getTipoNotaCreditoSolis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiponotacreditosoliAux,tiponotacreditosolis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiponotacreditosoli,tiponotacreditosoliAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiponotacreditosoliAux=new  TipoNotaCreditoSoli();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado() 
					|| (this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado() && this.tiponotacreditosoli.getId()>=0)) {
						
					tiponotacreditosoliAux.setIsNew(false);
				}
				
				tiponotacreditosoliAux.setIsDeleted(false);
			
				tiponotacreditosoliAux.setId(this.tiponotacreditosoli.getId());	
				tiponotacreditosoliAux.setVersionRow(this.tiponotacreditosoli.getVersionRow());	
				tiponotacreditosoliAux.setcodigo(this.tiponotacreditosoli.getcodigo());	
				tiponotacreditosoliAux.setnombre(this.tiponotacreditosoli.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiponotacreditosoliAux,tiponotacreditosoliLogic.getTipoNotaCreditoSolis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponotacreditosoliAux,tiponotacreditosolis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponotacreditosoliLogic.saveTipoNotaCreditoSolis();//WithConnection
						//tiponotacreditosoliLogic.getSetVersionRowTipoNotaCreditoSolis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiponotacreditosoli,tiponotacreditosoliAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolis.addAll(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponotacreditosoliLogic.saveTipoNotaCreditoSoliRelaciones(tiponotacreditosoliAux,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());//WithConnection
								//tiponotacreditosoliLogic.getSetVersionRowTipoNotaCreditoSolis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiponotacreditosoli,tiponotacreditosoliAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(new ArrayList<NotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolis= new ArrayList<NotaCreditoSoli>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponotacreditosoliAux.setNotaCreditoSolis(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiponotacreditosoliAux,tiponotacreditosoliLogic.getTipoNotaCreditoSolis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiponotacreditosoliAux,tiponotacreditosolis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiponotacreditosoli,tiponotacreditosoliAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiponotacreditosoliAux=new  TipoNotaCreditoSoli();
				
				tiponotacreditosoliAux.setIsNew(false);
				tiponotacreditosoliAux.setIsChanged(false);
				
				tiponotacreditosoliAux.setIsDeleted(true);
				
				tiponotacreditosoliAux.setId(this.tiponotacreditosoli.getId());	
				tiponotacreditosoliAux.setVersionRow(this.tiponotacreditosoli.getVersionRow());	
				tiponotacreditosoliAux.setcodigo(this.tiponotacreditosoli.getcodigo());	
				tiponotacreditosoliAux.setnombre(this.tiponotacreditosoli.getnombre());	
				
				if(this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiponotacreditosoliAux.getId()>=0) {	
						this.tiponotacreditosolisEliminados.add(tiponotacreditosoliAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiponotacreditosoliAux,tiponotacreditosoliLogic.getTipoNotaCreditoSolis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponotacreditosoliAux,tiponotacreditosolis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponotacreditosoliLogic.saveTipoNotaCreditoSolis();//WithConnection
						//tiponotacreditosoliLogic.getSetVersionRowTipoNotaCreditoSolis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolis.addAll(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jInternalFrameDetalleFormNotaCreditoSoli.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponotacreditosoliLogic.saveTipoNotaCreditoSoliRelaciones(tiponotacreditosoliAux,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());//WithConnection
								//tiponotacreditosoliLogic.getSetVersionRowTipoNotaCreditoSolis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(new ArrayList<NotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolis= new ArrayList<NotaCreditoSoli>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponotacreditosoliAux.setNotaCreditoSolis(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiponotacreditosoliAux,tiponotacreditosoliLogic.getTipoNotaCreditoSolis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiponotacreditosoliAux,tiponotacreditosolis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().addAll(this.tiponotacreditosolisEliminados);
					
					tiponotacreditosoliLogic.saveTipoNotaCreditoSolis();//WithConnection
					//tiponotacreditosoliLogic.getSetVersionRowTipoNotaCreditoSolis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tiponotacreditosolisEliminados= new ArrayList<TipoNotaCreditoSoli>();		
			}
			
			if(this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Solicitud Nota Credito GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Solicitud Nota Credito",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiponotacreditosoli=tiponotacreditosoliAux;
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
      		//this.finishProcessTipoNotaCreditoSoli();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoNotaCreditoSoli tiponotacreditosoliLocal) throws Exception {
		
		if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiponotacreditosoliLocal.setNotaCreditoSolis(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
			
			} else {
			
				tiponotacreditosoliLocal.setNotaCreditoSolis(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosolis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoNotaCreditoSoli tiponotacreditosoliLocal) throws Exception {	
		if(this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoNotaCreditoSoliActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiponotacreditosoliValidator.getInvalidValues(this.tiponotacreditosoli);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoNotaCreditoSoli tiponotacreditosoli,List<TipoNotaCreditoSoli> tiponotacreditosolis) throws Exception {
		try	{		
			TipoNotaCreditoSoliConstantesFunciones.actualizarLista(tiponotacreditosoli,tiponotacreditosolis,this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoNotaCreditoSoli tiponotacreditosoli,List<TipoNotaCreditoSoli> tiponotacreditosolis) throws Exception {
		try	{			
			TipoNotaCreditoSoliConstantesFunciones.actualizarSelectedLista(tiponotacreditosoli,tiponotacreditosolis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoNotaCreditoSoli> tiponotacreditosolisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiponotacreditosolisLocal=this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiponotacreditosolisLocal=this.tiponotacreditosolis;
			}
			//ARCHITECTURE
		
			for(TipoNotaCreditoSoli tiponotacreditosoliLocal:tiponotacreditosolisLocal) {
				if(this.permiteMantenimiento(tiponotacreditosoliLocal) && tiponotacreditosoliLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoNotaCreditoSoliConstantesFunciones.getTipoNotaCreditoSoliLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoNotaCreditoSoliConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jLabelcodigoTipoNotaCreditoSoli,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoNotaCreditoSoliConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jLabelnombreTipoNotaCreditoSoli,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jLabelcodigoTipoNotaCreditoSoli,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jLabelnombreTipoNotaCreditoSoli,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("NotaCreditoSoli")) {
			if(this.tiponotacreditosoli==null) {
				this.tiponotacreditosoli= new TipoNotaCreditoSoli();
			}

			if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoNotaCreditoSoli
				this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoli,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);

				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.getnotacreditosoli().setTipoNotaCreditoSoli(this.tiponotacreditosoli);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoNotaCreditoSoli--;	
		
		
		this.tiponotacreditosoliAux=new TipoNotaCreditoSoli();
		
		this.tiponotacreditosoliAux.setId(this.iIdNuevoTipoNotaCreditoSoli);
		this.tiponotacreditosoliAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().add(this.tiponotacreditosoliAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiponotacreditosolis.add(this.tiponotacreditosoliAux);
		}
		//ARCHITECTURE
		
		this.tiponotacreditosoli=this.tiponotacreditosoliAux;
		
		if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoNotaCreditoSoli(this.tiponotacreditosoli);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoNotaCreditoSoli(this.tiponotacreditosoli);
		}
				
		//this.setDefaultControlesTipoNotaCreditoSoli();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoNotaCreditoSoli();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoNotaCreditoSoli();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNotaCreditoSoli();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoliBean,this.tiponotacreditosoli,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
			classes=TipoNotaCreditoSoliConstantesFunciones.getClassesRelationshipsOfTipoNotaCreditoSoli(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiponotacreditosoliReturnGeneral=tiponotacreditosoliLogic.procesarEventosTipoNotaCreditoSolisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis(),this.tiponotacreditosoli,this.tiponotacreditosoliParameterGeneral,this.isEsNuevoTipoNotaCreditoSoli,classes);//this.tiponotacreditosoliLogic.getTipoNotaCreditoSoli()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoNotaCreditoSoli(this.tiponotacreditosoliReturnGeneral,this.tiponotacreditosoliBean,false);
		
		if(this.tiponotacreditosoliReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoNotaCreditoSoli(this.tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoNotaCreditoSoli(this.tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli());
		}
		
		if(this.tiponotacreditosoliReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoNotaCreditoSoli(this.tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli(),classes);//this.tiponotacreditosoliBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoli,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoNotaCreditoSoli();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoNotaCreditoSoli();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.RecargarFormTipoNotaCreditoSoli(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
						
			if(tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getEsGuardarRelacionado() && NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoSoliActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNotaCreditoSoli();
			}
			
			this.actualizarVisualTableDatosTipoNotaCreditoSoli();
			
			this.jTableDatosTipoNotaCreditoSoli.setRowSelectionInterval(this.getIndiceNuevoTipoNotaCreditoSoli(), this.getIndiceNuevoTipoNotaCreditoSoli());
			
			this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
						
			this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoNotaCreditoSoli(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldcodigoTipoNotaCreditoSoli.setEnabled(isHabilitar && this.tiponotacreditosoliConstantesFunciones.activarcodigoTipoNotaCreditoSoli);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextAreanombreTipoNotaCreditoSoli.setEnabled(isHabilitar && this.tiponotacreditosoliConstantesFunciones.activarnombreTipoNotaCreditoSoli);	
		
	};
	
	public void setDefaultControlesTipoNotaCreditoSoli() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoNotaCreditoSoli(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiponotacreditosoliSessionBean.setConGuardarRelaciones(true);			
			this.tiponotacreditosoliSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTabbedPaneRelacionesTipoNotaCreditoSoli.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiponotacreditosoliSessionBean.setConGuardarRelaciones(false);			
			this.tiponotacreditosoliSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTabbedPaneRelacionesTipoNotaCreditoSoli.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoNotaCreditoSoli() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
				if(tiponotacreditosoliAux.getId().equals(this.iIdNuevoTipoNotaCreditoSoli)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosolis) {
				if(tiponotacreditosoliAux.getId().equals(this.iIdNuevoTipoNotaCreditoSoli)) {
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
	
	public int getIndiceActualTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
				if(tiponotacreditosoliAux.getId().equals(tiponotacreditosoli.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosolis) {
				if(tiponotacreditosoliAux.getId().equals(tiponotacreditosoli.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoliOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
				if(tiponotacreditosoliAux.getTipoNotaCreditoSoliOriginal().getId().equals(tiponotacreditosoliOriginal.getId())) {
					existe=true;
					tiponotacreditosoliOriginal.setId(tiponotacreditosoliAux.getId());
					tiponotacreditosoliOriginal.setVersionRow(tiponotacreditosoliAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosolis) {
				if(tiponotacreditosoliAux.getTipoNotaCreditoSoliOriginal().getId().equals(tiponotacreditosoliOriginal.getId())) {
					existe=true;
					tiponotacreditosoliOriginal.setId(tiponotacreditosoliAux.getId());
					tiponotacreditosoliOriginal.setVersionRow(tiponotacreditosoliAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoNotaCreditoSoli(Boolean esParaCancelar) throws Exception {
		tiponotacreditosolisAux=new ArrayList<TipoNotaCreditoSoli>();
		tiponotacreditosoliAux=new TipoNotaCreditoSoli();
		
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
					if(tiponotacreditosoliAux.getId()<0) {
						tiponotacreditosolisAux.add(tiponotacreditosoliAux);
					}		
				}
				this.iIdNuevoTipoNotaCreditoSoli=0L;
				this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().removeAll(tiponotacreditosolisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosolis) {
					if(tiponotacreditosoliAux.getId()<0) {
						tiponotacreditosolisAux.add(tiponotacreditosoliAux);
					}		
				}
				this.iIdNuevoTipoNotaCreditoSoli=0L;
				this.tiponotacreditosolis.removeAll(tiponotacreditosolisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoNotaCreditoSoli 
					&& this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().size()>0
					) {
					tiponotacreditosoliAux=this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().get(this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().size() - 1);
				
					if(tiponotacreditosoliAux.getId()<0) {
						this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().remove(tiponotacreditosoliAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoNotaCreditoSoli && this.tiponotacreditosolis.size()>0) {
					tiponotacreditosoliAux=this.tiponotacreditosolis.get(this.tiponotacreditosolis.size() - 1);
				
					if(tiponotacreditosoliAux.getId()<0) {
						this.tiponotacreditosolis.remove(tiponotacreditosoliAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoNotaCreditoSoli(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiponotacreditosoli.getId()<0) {
				this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().remove(this.tiponotacreditosoli);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiponotacreditosoli.getId()<0) {
				this.tiponotacreditosolis.remove(this.tiponotacreditosoli);
			}
		}			
	}
	
	public void setEstadosInicialesTipoNotaCreditoSoli(List<TipoNotaCreditoSoli> tiponotacreditosolisAux) throws Exception {
		TipoNotaCreditoSoliConstantesFunciones.setEstadosInicialesTipoNotaCreditoSoli(tiponotacreditosolisAux);
	}
	
	public void setEstadosInicialesTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoliAux) throws Exception {
		TipoNotaCreditoSoliConstantesFunciones.setEstadosInicialesTipoNotaCreditoSoli(tiponotacreditosoliAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoNotaCreditoSoliActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoNotaCreditoSoliActual()) {
				if(!this.isEsNuevoTipoNotaCreditoSoli) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoNotaCreditoSoli=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoNotaCreditoSoliActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Solicitud Nota Credito ?", "MANTENIMIENTO DE Tipo Solicitud Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoNotaCreditoSoli tiponotacreditosoli) throws Exception {
		TipoNotaCreditoSoliConstantesFunciones.seleccionarAsignar(this.tiponotacreditosoli,tiponotacreditosoli);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoNotaCreditoSoli=this.isPermisoActualizarOriginalTipoNotaCreditoSoli;
			
			
			this.seleccionarAsignar(tiponotacreditosoli);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoNotaCreditoSoliConstantesFunciones.quitarEspaciosTipoNotaCreditoSoli(this.tiponotacreditosoli,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiponotacreditosoliSessionBean.setsFuncionBusquedaRapida(this.tiponotacreditosoliSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoNotaCreditoSoli) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoNotaCreditoSoli(esParaCancelar);				
				this.cancelarNuevoTipoNotaCreditoSoli(esParaCancelar);								
			}
			
			this.tiponotacreditosoli=new TipoNotaCreditoSoli();
			
			this.inicializarTipoNotaCreditoSoli();
			
			this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoNotaCreditoSoli() throws Exception {
		try {
			TipoNotaCreditoSoliConstantesFunciones.inicializarTipoNotaCreditoSoli(this.tiponotacreditosoli);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoNotaCreditoSolis(String sAccionBusqueda,List<TipoNotaCreditoSoli> tiponotacreditosolisParaReportes) throws Exception {
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
					sPathReporteFinal="TipoNotaCreditoSoli"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoNotaCreditoSoliMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoNotaCreditoSoliMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoNotaCreditoSoli"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Solicitud Nota Creditos");		
		parameters.put("busquedapor", TipoNotaCreditoSoliConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(NotaCreditoSoli.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoNotaCreditoSoliLogic tiponotacreditosoliLogicAuxiliar=new TipoNotaCreditoSoliLogic();
					tiponotacreditosoliLogicAuxiliar.setDatosCliente(tiponotacreditosoliLogic.getDatosCliente());				
					tiponotacreditosoliLogicAuxiliar.setTipoNotaCreditoSolis(tiponotacreditosolisParaReportes);
					
					tiponotacreditosoliLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoNotaCreditoSoliWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiponotacreditosolisParaReportes=tiponotacreditosoliLogicAuxiliar.getTipoNotaCreditoSolis();
					
					//tiponotacreditosoliLogic.getNewConnexionToDeep();
					
					//for (TipoNotaCreditoSoli tiponotacreditosoli:tiponotacreditosolisParaReportes) {
					//	tiponotacreditosoliLogic.deepLoad(tiponotacreditosoli, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiponotacreditosoliLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiponotacreditosoliLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileNotaCreditoSoli = AuxiliarReportes.class.getResourceAsStream("NotaCreditoSoliDetalleRelacionesDesign.jasper");
			parameters.put("subreport_notacreditosoli", reportFileNotaCreditoSoli);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoNotaCreditoSoli=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoNotaCreditoSoliConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoNotaCreditoSoliConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoNotaCreditoSoli=new JRBeanArrayDataSource(TipoNotaCreditoSoliJInternalFrame.TraerTipoNotaCreditoSoliBeans(tiponotacreditosolisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoNotaCreditoSoli);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoNotaCreditoSoliConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoNotaCreditoSoliConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoNotaCreditoSoliBean.TraerTipoNotaCreditoSoliBeans(tiponotacreditosolisParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoNotaCreditoSolis(sAccionBusqueda,sTipoArchivoReporte,tiponotacreditosolisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoNotaCreditoSolis(sAccionBusqueda,sTipoArchivoReporte,tiponotacreditosolisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoliActionPerformed(null);
					//this.generarExcelReporteTipoNotaCreditoSolis(sAccionBusqueda,sTipoArchivoReporte,tiponotacreditosolisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoNotaCreditoSolis(sAccionBusqueda,sTipoArchivoReporte,tiponotacreditosolisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoNotaCreditoSolis(sAccionBusqueda,sTipoArchivoReporte,tiponotacreditosolisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoNotaCreditoSolis(sAccionBusqueda,sTipoArchivoReporte,tiponotacreditosolisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoNotaCreditoSolis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNotaCreditoSoli> tiponotacreditosolisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponotacreditosoli";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNotaCreditoSolis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoNotaCreditoSoli("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoNotaCreditoSoli tiponotacreditosoli : tiponotacreditosolisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoNotaCreditoSoliConstantesFunciones.generarExcelReporteDataTipoNotaCreditoSoli("NORMAL",row,workbook,tiponotacreditosoli,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Solicitud Nota Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoNotaCreditoSoli(String sTipo,Row row,Workbook workbook) {
		
		TipoNotaCreditoSoliConstantesFunciones.generarExcelReporteHeaderTipoNotaCreditoSoli(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoNotaCreditoSolis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNotaCreditoSoli> tiponotacreditosolisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponotacreditosoli_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNotaCreditoSolis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoNotaCreditoSoli tiponotacreditosoli : tiponotacreditosolisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoNotaCreditoSoliConstantesFunciones.getTipoNotaCreditoSoliDescripcion(tiponotacreditosoli));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiponotacreditosoli.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiponotacreditosoli.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Solicitud Nota Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoNotaCreditoSolis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNotaCreditoSoli> tiponotacreditosolisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoNotaCreditoSoli> tiponotacreditosolisRespaldo=null;
		
		classes=TipoNotaCreditoSoliConstantesFunciones.getClassesRelationshipsOfTipoNotaCreditoSoli(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiponotacreditosoliLogic.setDatosCliente(this.datosCliente);
		this.tiponotacreditosoliLogic.setDatosDeep(this.datosDeep);
		this.tiponotacreditosoliLogic.setIsConDeep(true);
		
		tiponotacreditosolisRespaldo=this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis();
		
		this.tiponotacreditosoliLogic.setTipoNotaCreditoSolis(tiponotacreditosolisParaReportes);	
		this.tiponotacreditosoliLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiponotacreditosolisParaReportes=this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis();
		this.tiponotacreditosoliLogic.setTipoNotaCreditoSolis(tiponotacreditosolisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponotacreditosoli_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNotaCreditoSolis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoNotaCreditoSoli("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoNotaCreditoSoli tiponotacreditosoli : tiponotacreditosolisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoNotaCreditoSoli("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoNotaCreditoSoliConstantesFunciones.generarExcelReporteDataTipoNotaCreditoSoli("NORMAL",row,workbook,tiponotacreditosoli,cellStyleDataAux);
		
			
			


				//NotaCreditoSoli
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiponotacreditosoli.getNotaCreditoSolis()!=null && tiponotacreditosoli.getNotaCreditoSolis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					NotaCreditoSoliConstantesFunciones.generarExcelReporteHeaderNotaCreditoSoli("RELACIONADO",row,workbook);
				}

				if(tiponotacreditosoli.getNotaCreditoSolis()!=null) {
					i2=0;
					for(NotaCreditoSoli notacreditosoli : tiponotacreditosoli.getNotaCreditoSolis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						NotaCreditoSoliConstantesFunciones.generarExcelReporteDataNotaCreditoSoli("RELACIONADO",row,workbook,notacreditosoli,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoNotaCreditoSoliConstantesFunciones.getTipoNotaCreditoSoliDescripcion(tiponotacreditosoli));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Solicitud Nota Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoNotaCreditoSoli() throws Exception {		
		this.startProcessTipoNotaCreditoSoli(true);
	}
	
	public void startProcessTipoNotaCreditoSoli(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoNotaCreditoSoli, this.jScrollPanelDatosTipoNotaCreditoSoli,this.jPanelPaginacionTipoNotaCreditoSoli, this.jScrollPanelDatosEdicionTipoNotaCreditoSoli, this.jPanelAccionesTipoNotaCreditoSoli,this.jPanelAccionesFormularioTipoNotaCreditoSoli,this.jmenuBarTipoNotaCreditoSoli,this.jmenuBarDetalleTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,this.jTtoolBarDetalleTipoNotaCreditoSoli);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoNotaCreditoSoli=null; 
		
		final JPanel jPanelParametrosReportesTipoNotaCreditoSoli=this.jPanelParametrosReportesTipoNotaCreditoSoli;
		//final JScrollPane jScrollPanelDatosTipoNotaCreditoSoli=this.jScrollPanelDatosTipoNotaCreditoSoli;
		final JTable jTableDatosTipoNotaCreditoSoli=this.jTableDatosTipoNotaCreditoSoli;		
		final JPanel jPanelPaginacionTipoNotaCreditoSoli=this.jPanelPaginacionTipoNotaCreditoSoli;
		//final JScrollPane jScrollPanelDatosEdicionTipoNotaCreditoSoli=this.jScrollPanelDatosEdicionTipoNotaCreditoSoli;
		final JPanel jPanelAccionesTipoNotaCreditoSoli=this.jPanelAccionesTipoNotaCreditoSoli;
		
		JPanel jPanelCamposAuxiliarTipoNotaCreditoSoli=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoNotaCreditoSoli=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			jPanelCamposAuxiliarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jPanelCamposTipoNotaCreditoSoli;
			jPanelAccionesFormularioAuxiliarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jPanelAccionesFormularioTipoNotaCreditoSoli;
		}
		
		final JPanel jPanelCamposTipoNotaCreditoSoli=jPanelCamposAuxiliarTipoNotaCreditoSoli;
		final JPanel jPanelAccionesFormularioTipoNotaCreditoSoli=jPanelAccionesFormularioAuxiliarTipoNotaCreditoSoli;
		
		
		final JMenuBar jmenuBarTipoNotaCreditoSoli=this.jmenuBarTipoNotaCreditoSoli;
		final JToolBar jTtoolBarTipoNotaCreditoSoli=this.jTtoolBarTipoNotaCreditoSoli;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoNotaCreditoSoli=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoNotaCreditoSoli=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			jmenuBarDetalleAuxiliarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jmenuBarDetalleTipoNotaCreditoSoli;
			jTtoolBarDetalleAuxiliarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTtoolBarDetalleTipoNotaCreditoSoli;
		}
		
		final JMenuBar jmenuBarDetalleTipoNotaCreditoSoli=jmenuBarDetalleAuxiliarTipoNotaCreditoSoli;
		final JToolBar jTtoolBarDetalleTipoNotaCreditoSoli=jTtoolBarDetalleAuxiliarTipoNotaCreditoSoli;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoNotaCreditoSoli;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoNotaCreditoSoli;
			processRunnable.jTableDatos=jTableDatosTipoNotaCreditoSoli;
			processRunnable.jPanelCampos=jPanelCamposTipoNotaCreditoSoli;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoNotaCreditoSoli;
			processRunnable.jPanelAcciones=jPanelAccionesTipoNotaCreditoSoli;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoNotaCreditoSoli;
			
			
			processRunnable.jmenuBar=jmenuBarTipoNotaCreditoSoli;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoNotaCreditoSoli;
			processRunnable.jTtoolBar=jTtoolBarTipoNotaCreditoSoli;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoNotaCreditoSoli;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoNotaCreditoSoli ,jPanelParametrosReportesTipoNotaCreditoSoli,jTableDatosTipoNotaCreditoSoli, /*jScrollPanelDatosTipoNotaCreditoSoli,*/jPanelCamposTipoNotaCreditoSoli,jPanelPaginacionTipoNotaCreditoSoli, /*jScrollPanelDatosEdicionTipoNotaCreditoSoli,*/ jPanelAccionesTipoNotaCreditoSoli,jPanelAccionesFormularioTipoNotaCreditoSoli,jmenuBarTipoNotaCreditoSoli,jmenuBarDetalleTipoNotaCreditoSoli,jTtoolBarTipoNotaCreditoSoli,jTtoolBarDetalleTipoNotaCreditoSoli);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoNotaCreditoSoli, jScrollPanelDatosTipoNotaCreditoSoli,jPanelPaginacionTipoNotaCreditoSoli, jScrollPanelDatosEdicionTipoNotaCreditoSoli, jPanelAccionesTipoNotaCreditoSoli,jPanelAccionesFormularioTipoNotaCreditoSoli,jmenuBarTipoNotaCreditoSoli,jmenuBarDetalleTipoNotaCreditoSoli,jTtoolBarTipoNotaCreditoSoli,jTtoolBarDetalleTipoNotaCreditoSoli);
						
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
	
	public void finishProcessTipoNotaCreditoSoli() {// throws Exception 
		this.finishProcessTipoNotaCreditoSoli(true);
	}
	
	public void finishProcessTipoNotaCreditoSoli(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoNotaCreditoSoli, this.jScrollPanelDatosTipoNotaCreditoSoli,this.jPanelPaginacionTipoNotaCreditoSoli, this.jScrollPanelDatosEdicionTipoNotaCreditoSoli, this.jPanelAccionesTipoNotaCreditoSoli,this.jPanelAccionesFormularioTipoNotaCreditoSoli,this.jmenuBarTipoNotaCreditoSoli,this.jmenuBarDetalleTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,this.jTtoolBarDetalleTipoNotaCreditoSoli);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoNotaCreditoSoli=null; 
		
		final JPanel jPanelParametrosReportesTipoNotaCreditoSoli=this.jPanelParametrosReportesTipoNotaCreditoSoli;
		//final JScrollPane jScrollPanelDatosTipoNotaCreditoSoli=this.jScrollPanelDatosTipoNotaCreditoSoli;
		final JTable jTableDatosTipoNotaCreditoSoli=this.jTableDatosTipoNotaCreditoSoli;		
		final JPanel jPanelPaginacionTipoNotaCreditoSoli=this.jPanelPaginacionTipoNotaCreditoSoli;
		//final JScrollPane jScrollPanelDatosEdicionTipoNotaCreditoSoli=this.jScrollPanelDatosEdicionTipoNotaCreditoSoli;
		final JPanel jPanelAccionesTipoNotaCreditoSoli=this.jPanelAccionesTipoNotaCreditoSoli;
		
		JPanel jPanelCamposAuxiliarTipoNotaCreditoSoli=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoNotaCreditoSoli=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			jPanelCamposAuxiliarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jPanelCamposTipoNotaCreditoSoli;
			jPanelAccionesFormularioAuxiliarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jPanelAccionesFormularioTipoNotaCreditoSoli;
		}
		
		final JPanel jPanelCamposTipoNotaCreditoSoli=jPanelCamposAuxiliarTipoNotaCreditoSoli;
		final JPanel jPanelAccionesFormularioTipoNotaCreditoSoli=jPanelAccionesFormularioAuxiliarTipoNotaCreditoSoli;
		
		
		final JMenuBar jmenuBarTipoNotaCreditoSoli=this.jmenuBarTipoNotaCreditoSoli;		
		final JToolBar jTtoolBarTipoNotaCreditoSoli=this.jTtoolBarTipoNotaCreditoSoli;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoNotaCreditoSoli=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoNotaCreditoSoli=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			jmenuBarDetalleAuxiliarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jmenuBarDetalleTipoNotaCreditoSoli;
			jTtoolBarDetalleAuxiliarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTtoolBarDetalleTipoNotaCreditoSoli;		
		}
		
		final JMenuBar jmenuBarDetalleTipoNotaCreditoSoli=jmenuBarDetalleAuxiliarTipoNotaCreditoSoli;
		final JToolBar jTtoolBarDetalleTipoNotaCreditoSoli=jTtoolBarDetalleAuxiliarTipoNotaCreditoSoli;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoNotaCreditoSoli;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoNotaCreditoSoli;
			processRunnable.jTableDatos=jTableDatosTipoNotaCreditoSoli;
			processRunnable.jPanelCampos=jPanelCamposTipoNotaCreditoSoli;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoNotaCreditoSoli;
			processRunnable.jPanelAcciones=jPanelAccionesTipoNotaCreditoSoli;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoNotaCreditoSoli;
			
			
			processRunnable.jmenuBar=jmenuBarTipoNotaCreditoSoli;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoNotaCreditoSoli;
			processRunnable.jTtoolBar=jTtoolBarTipoNotaCreditoSoli;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoNotaCreditoSoli;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoNotaCreditoSoli ,jPanelParametrosReportesTipoNotaCreditoSoli, jTableDatosTipoNotaCreditoSoli,/*jScrollPanelDatosTipoNotaCreditoSoli,*/jPanelCamposTipoNotaCreditoSoli,jPanelPaginacionTipoNotaCreditoSoli, /*jScrollPanelDatosEdicionTipoNotaCreditoSoli,*/ jPanelAccionesTipoNotaCreditoSoli,jPanelAccionesFormularioTipoNotaCreditoSoli,jmenuBarTipoNotaCreditoSoli,jmenuBarDetalleTipoNotaCreditoSoli,jTtoolBarTipoNotaCreditoSoli,jTtoolBarDetalleTipoNotaCreditoSoli));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoNotaCreditoSoli(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoNotaCreditoSoli(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoNotaCreditoSoli(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoNotaCreditoSoli(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoNotaCreditoSoli,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoNotaCreditoSoli,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoNotaCreditoSoli(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoNotaCreditoSoli,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoNotaCreditoSoli,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiponotacreditosoliConstantesFunciones.getsFinalQueryTipoNotaCreditoSoli();
		String  finalQueryPaginacionTodos=this.tiponotacreditosoliConstantesFunciones.getsFinalQueryTipoNotaCreditoSoli();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoNotaCreditoSoliConstantesFunciones.getArrayColumnasGlobalesNoTipoNotaCreditoSoli(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoNotaCreditoSoliConstantesFunciones.getArrayColumnasGlobalesTipoNotaCreditoSoli(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoNotaCreditoSoliConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiponotacreditosolisEliminados= new ArrayList<TipoNotaCreditoSoli>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoNotaCreditoSoli();
		
				///*TipoNotaCreditoSoliSessionBean*/this.tiponotacreditosoliSessionBean=new TipoNotaCreditoSoliSessionBean();
			
			if(this.tiponotacreditosoliSessionBean==null) {
				this.tiponotacreditosoliSessionBean=new TipoNotaCreditoSoliSessionBean();
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
					this.iNumeroPaginacion=TipoNotaCreditoSoliConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoNotaCreditoSoliConstantesFunciones.getClassesForeignKeysOfTipoNotaCreditoSoli(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiponotacreditosoli."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiponotacreditosolisAux= new ArrayList<TipoNotaCreditoSoli>();
			
				
			tiponotacreditosoliLogic.setDatosCliente(this.datosCliente);
			tiponotacreditosoliLogic.setDatosDeep(this.datosDeep);
			tiponotacreditosoliLogic.setIsConDeep(true);
			
			
			tiponotacreditosoliLogic.getTipoNotaCreditoSoliDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiponotacreditosoliLogic.getTodosTipoNotaCreditoSolis(finalQueryGlobal,pagination);
					
					//tiponotacreditosoliLogic.getTodosTipoNotaCreditoSolisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiponotacreditosoliLogic.getTipoNotaCreditoSolis()==null|| tiponotacreditosoliLogic.getTipoNotaCreditoSolis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponotacreditosolisAux= new ArrayList<TipoNotaCreditoSoli>();
							tiponotacreditosolisAux.addAll(tiponotacreditosoliLogic.getTipoNotaCreditoSolis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponotacreditosolisAux= new ArrayList<TipoNotaCreditoSoli>();
							tiponotacreditosolisAux.addAll(tiponotacreditosolis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponotacreditosoliLogic.getTodosTipoNotaCreditoSolis(finalQueryGlobal+"",this.pagination);												
							
							//tiponotacreditosoliLogic.getTodosTipoNotaCreditoSolisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoNotaCreditoSolis("Todos",tiponotacreditosoliLogic.getTipoNotaCreditoSolis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponotacreditosoliLogic.setTipoNotaCreditoSolis(new ArrayList<TipoNotaCreditoSoli>());					
							tiponotacreditosoliLogic.getTipoNotaCreditoSolis().addAll(tiponotacreditosolisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponotacreditosolis=new ArrayList<TipoNotaCreditoSoli>();
							tiponotacreditosolis.addAll(tiponotacreditosolisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoNotaCreditoSoli=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoNotaCreditoSoli=this.idActual;
				
				} else if(this.idTipoNotaCreditoSoliActual!=null && this.idTipoNotaCreditoSoliActual!=0L) {
					idTipoNotaCreditoSoli=idTipoNotaCreditoSoliActual;
				}
				
					
				this.sDetalleReporte=TipoNotaCreditoSoliConstantesFunciones.getDetalleIndicePorId(idTipoNotaCreditoSoli);
				
				this.tiponotacreditosolis=new ArrayList<TipoNotaCreditoSoli>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiponotacreditosoliLogic.getEntity(idTipoNotaCreditoSoli);
					
					//tiponotacreditosoliLogic.getEntityWithConnection(idTipoNotaCreditoSoli);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponotacreditosoliLogic.setTipoNotaCreditoSolis(new ArrayList<TipoNotaCreditoSoli>());
					tiponotacreditosoliLogic.getTipoNotaCreditoSolis().add(tiponotacreditosoliLogic.getTipoNotaCreditoSoli());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiponotacreditosolis=new ArrayList<TipoNotaCreditoSoli>();
					this.tiponotacreditosolis.add(tiponotacreditosoli);
				}
				
				if(tiponotacreditosoliLogic.getTipoNotaCreditoSoli()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoNotaCreditoSoli();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoNotaCreditoSoli();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiponotacreditosoliLogic.getTipoNotaCreditoSolis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponotacreditosolis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiponotacreditosoliLogic.getTipoNotaCreditoSolis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponotacreditosolis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoNotaCreditoSoli tiponotacreditosoli) {
		Boolean permite=true;
		
		if(this.tiponotacreditosoli.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoNotaCreditoSoliConstantesFunciones.getOrderByListaTipoNotaCreditoSoli();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoNotaCreditoSoliConstantesFunciones.getOrderByListaTipoNotaCreditoSoli();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNotaCreditoSoli tiponotacreditosoli:tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
				if(tiponotacreditosoli.getsType().equals(Constantes2.S_TOTALES)) {
					tiponotacreditosoliTotales=tiponotacreditosoli;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNotaCreditoSoli tiponotacreditosoli:this.tiponotacreditosolis) {
				if(tiponotacreditosoli.getsType().equals(Constantes2.S_TOTALES)) {
					tiponotacreditosoliTotales=tiponotacreditosoli;
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
			this.tiponotacreditosoliAux=new TipoNotaCreditoSoli();
			this.tiponotacreditosoliAux.setsType(Constantes2.S_TOTALES);
			this.tiponotacreditosoliAux.setIsNew(false);
			this.tiponotacreditosoliAux.setIsChanged(false);
			this.tiponotacreditosoliAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoNotaCreditoSoliConstantesFunciones.TotalizarValoresFilaTipoNotaCreditoSoli(this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis(),this.tiponotacreditosoliAux);
				
				this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().add(this.tiponotacreditosoliAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoNotaCreditoSoliConstantesFunciones.TotalizarValoresFilaTipoNotaCreditoSoli(this.tiponotacreditosolis,this.tiponotacreditosoliAux);
				
				this.tiponotacreditosolis.add(this.tiponotacreditosoliAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiponotacreditosoliTotales=new TipoNotaCreditoSoli();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().remove(tiponotacreditosoliTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiponotacreditosolis.remove(tiponotacreditosoliTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiponotacreditosoliTotales=new TipoNotaCreditoSoli();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNotaCreditoSoli tiponotacreditosoli:tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
				if(tiponotacreditosoli.getsType().equals(Constantes2.S_TOTALES)) {
					tiponotacreditosoliTotales=tiponotacreditosoli;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoNotaCreditoSoliConstantesFunciones.TotalizarValoresFilaTipoNotaCreditoSoli(this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis(),tiponotacreditosoliTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNotaCreditoSoli tiponotacreditosoli:this.tiponotacreditosolis) {
				if(tiponotacreditosoli.getsType().equals(Constantes2.S_TOTALES)) {
					tiponotacreditosoliTotales=tiponotacreditosoli;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoNotaCreditoSoliConstantesFunciones.TotalizarValoresFilaTipoNotaCreditoSoli(this.tiponotacreditosolis,tiponotacreditosoliTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoNotaCreditoSoli() {
		this.isPermisoTodoTipoNotaCreditoSoli=false;
		this.isPermisoNuevoTipoNotaCreditoSoli=false;
		this.isPermisoActualizarTipoNotaCreditoSoli=false;
		this.isPermisoActualizarOriginalTipoNotaCreditoSoli=false;
		this.isPermisoEliminarTipoNotaCreditoSoli=false;
		this.isPermisoGuardarCambiosTipoNotaCreditoSoli=false;
		this.isPermisoConsultaTipoNotaCreditoSoli=false;
		this.isPermisoBusquedaTipoNotaCreditoSoli=false;
		this.isPermisoReporteTipoNotaCreditoSoli=false;		
		this.isPermisoOrdenTipoNotaCreditoSoli=false;		
		this.isPermisoPaginacionMedioTipoNotaCreditoSoli=false;		
		this.isPermisoPaginacionAltoTipoNotaCreditoSoli=false;
		this.isPermisoPaginacionTodoTipoNotaCreditoSoli=false;
		this.isPermisoCopiarTipoNotaCreditoSoli=false;		
		this.isPermisoVerFormTipoNotaCreditoSoli=false;		
		this.isPermisoDuplicarTipoNotaCreditoSoli=false;		
		this.isPermisoOrdenTipoNotaCreditoSoli=false;		
	}
	
	public void setPermisosUsuarioTipoNotaCreditoSoli(Boolean isPermiso) {
		this.isPermisoTodoTipoNotaCreditoSoli=isPermiso;
		this.isPermisoNuevoTipoNotaCreditoSoli=isPermiso;
		this.isPermisoActualizarTipoNotaCreditoSoli=isPermiso;
		this.isPermisoActualizarOriginalTipoNotaCreditoSoli=isPermiso;
		this.isPermisoEliminarTipoNotaCreditoSoli=isPermiso;
		this.isPermisoGuardarCambiosTipoNotaCreditoSoli=isPermiso;
		this.isPermisoConsultaTipoNotaCreditoSoli=isPermiso;
		this.isPermisoBusquedaTipoNotaCreditoSoli=isPermiso;
		this.isPermisoReporteTipoNotaCreditoSoli=isPermiso;
		this.isPermisoOrdenTipoNotaCreditoSoli=isPermiso;		
		this.isPermisoPaginacionMedioTipoNotaCreditoSoli=isPermiso;		
		this.isPermisoPaginacionAltoTipoNotaCreditoSoli=isPermiso;		
		this.isPermisoPaginacionTodoTipoNotaCreditoSoli=isPermiso;		
		this.isPermisoCopiarTipoNotaCreditoSoli=isPermiso;		
		this.isPermisoVerFormTipoNotaCreditoSoli=isPermiso;		
		this.isPermisoDuplicarTipoNotaCreditoSoli=isPermiso;
		this.isPermisoOrdenTipoNotaCreditoSoli=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoNotaCreditoSoli(Boolean isPermiso) {
		//this.isPermisoTodoTipoNotaCreditoSoli=isPermiso;
		this.isPermisoNuevoTipoNotaCreditoSoli=isPermiso;
		this.isPermisoActualizarTipoNotaCreditoSoli=isPermiso;
		this.isPermisoActualizarOriginalTipoNotaCreditoSoli=isPermiso;
		this.isPermisoEliminarTipoNotaCreditoSoli=isPermiso;
		this.isPermisoGuardarCambiosTipoNotaCreditoSoli=isPermiso;
		//this.isPermisoConsultaTipoNotaCreditoSoli=isPermiso;
		//this.isPermisoBusquedaTipoNotaCreditoSoli=isPermiso;
		//this.isPermisoReporteTipoNotaCreditoSoli=isPermiso;
		//this.isPermisoOrdenTipoNotaCreditoSoli=isPermiso;		
		//this.isPermisoPaginacionMedioTipoNotaCreditoSoli=isPermiso;		
		//this.isPermisoPaginacionAltoTipoNotaCreditoSoli=isPermiso;		
		//this.isPermisoPaginacionTodoTipoNotaCreditoSoli=isPermiso;		
		//this.isPermisoCopiarTipoNotaCreditoSoli=isPermiso;		
		//this.isPermisoDuplicarTipoNotaCreditoSoli=isPermiso;
		//this.isPermisoOrdenTipoNotaCreditoSoli=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoNotaCreditoSoliClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(NotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
		if(TipoNotaCreditoSoliJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosNotaCreditoSoli=false;
		this.isTienePermisosNotaCreditoSoli=this.verificarGetPermisosUsuarioOpcionTipoNotaCreditoSoliClaseRelacionada(this.opcionsRelacionadas,NotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoNotaCreditoSoli(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoNotaCreditoSoliClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosNotaCreditoSoli=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoNotaCreditoSoliClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoNotaCreditoSoliClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoNotaCreditoSoliClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosNotaCreditoSoli && this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTabbedPaneRelacionesTipoNotaCreditoSoli.remove(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoNotaCreditoSoli() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoNotaCreditoSoliJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoNotaCreditoSoliConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoNotaCreditoSoli=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoNotaCreditoSoli=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoNotaCreditoSoli=this.isPermisoActualizarTipoNotaCreditoSoli;
			this.isPermisoEliminarTipoNotaCreditoSoli=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoNotaCreditoSoli=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoNotaCreditoSoli=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoNotaCreditoSoli=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoNotaCreditoSoli=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoNotaCreditoSoli=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoNotaCreditoSoli=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoNotaCreditoSoli=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoNotaCreditoSoli=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoNotaCreditoSoli=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoNotaCreditoSoli=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoNotaCreditoSoli=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoNotaCreditoSoli=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoNotaCreditoSoli=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoNotaCreditoSoli.setToolTipText(this.jTableDatosTipoNotaCreditoSoli.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoNotaCreditoSoli(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoNotaCreditoSoli(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoNotaCreditoSoliJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoNotaCreditoSoliJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoNotaCreditoSoli() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosNotaCreditoSoli && this.tiponotacreditosoliConstantesFunciones.mostrarNotaCreditoSoliTipoNotaCreditoSoli && !TipoNotaCreditoSoliConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Solicitud Nota Credito");
			reporte.setsDescripcion("Solicitud Nota Credito");
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
	
		
	public void inicializarCombosForeignKeyTipoNotaCreditoSoliListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoNotaCreditoSoliListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoNotaCreditoSoliJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoNotaCreditoSoliListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoNotaCreditoSoliListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoNotaCreditoSoli()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoNotaCreditoSoli()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoNotaCreditoSoli(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoNotaCreditoSoli()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNotaCreditoSoli();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoNotaCreditoSoli()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNotaCreditoSoli()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoNotaCreditoSoli()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoNotaCreditoSoli()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoNotaCreditoSoli()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoNotaCreditoSoli()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoNotaCreditoSoli(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoNotaCreditoSoli()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoNotaCreditoSoliBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoNotaCreditoSoliBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoNotaCreditoSoliBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiponotacreditosoliSessionBean=new TipoNotaCreditoSoliSessionBean(); 
		this.tiponotacreditosoliConstantesFunciones=new TipoNotaCreditoSoliConstantesFunciones(); 
		this.tiponotacreditosoliBean=new TipoNotaCreditoSoli();//(this.tiponotacreditosoliConstantesFunciones); 		
		this.tiponotacreditosoliReturnGeneral=new TipoNotaCreditoSoliParameterReturnGeneral(); 
		
		this.tiponotacreditosoliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponotacreditosoliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoNotaCreditoSoliBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoNotaCreditoSoliBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoNotaCreditoSoliBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoNotaCreditoSoli(true);
			
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
			
			this.tiponotacreditosoliConstantesFunciones=new TipoNotaCreditoSoliConstantesFunciones(); 
			this.tiponotacreditosoliBean=new TipoNotaCreditoSoli();//this.tiponotacreditosoliConstantesFunciones); 			
			this.tiponotacreditosoliReturnGeneral=new TipoNotaCreditoSoliParameterReturnGeneral(); 
		
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Solicitud Nota Credito Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiponotacreditosoli=new TipoNotaCreditoSoli();
			this.tiponotacreditosolis = new ArrayList<TipoNotaCreditoSoli>();
			this.tiponotacreditosolisAux = new ArrayList<TipoNotaCreditoSoli>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic=new TipoNotaCreditoSoliLogic();
				this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
			}
			
			//this.tiponotacreditosoliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiponotacreditosoliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoNotaCreditoSoli);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli);	
					}
					
					if(this.jInternalFrameImportacionTipoNotaCreditoSoli!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoNotaCreditoSoli);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoNotaCreditoSoli!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoNotaCreditoSoli);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoNotaCreditoSoli);
				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setVisible(false);
				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli);
					this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoNotaCreditoSoli!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoNotaCreditoSoli);
					this.jInternalFrameImportacionTipoNotaCreditoSoli.setVisible(false);
					this.jInternalFrameImportacionTipoNotaCreditoSoli.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoNotaCreditoSoli!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoNotaCreditoSoli);
					this.jInternalFrameOrderByTipoNotaCreditoSoli.setVisible(false);
					this.jInternalFrameOrderByTipoNotaCreditoSoli.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoNotaCreditoSoliActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoNotaCreditoSoliConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiponotacreditosoliReturnGeneral=new TipoNotaCreditoSoliParameterReturnGeneral();
			
			this.tiponotacreditosoliParameterGeneral=new TipoNotaCreditoSoliParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiponotacreditosoliLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoNotaCreditoSoliJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(NotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoNotaCreditoSoliConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado(),this.tiponotacreditosoliSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoNotaCreditoSoliConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado(),this.tiponotacreditosoliSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaDuplicarTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaCopiarTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaVerFormTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaOrdenTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaModificarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoNotaCreditoSoli();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoNotaCreditoSoli(false);
			
			this.setPermisosUsuarioTipoNotaCreditoSoli();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado() 
				|| (this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado() && this.tiponotacreditosoliSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoNotaCreditoSoliClasesRelacionadas();
			}
			
			if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoNotaCreditoSoliClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoNotaCreditoSoli();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoNotaCreditoSoli();
			}
			
			if(!this.isPermisoBusquedaTipoNotaCreditoSoli) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoNotaCreditoSoli,this.isPermisoPaginacionMedioTipoNotaCreditoSoli,this.isPermisoPaginacionTodoTipoNotaCreditoSoli);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoNotaCreditoSoliConstantesFunciones.getTiposSeleccionarTipoNotaCreditoSoli());
				
				this.tiposColumnasSelect=TipoNotaCreditoSoliConstantesFunciones.getTiposSeleccionarTipoNotaCreditoSoli(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoNotaCreditoSoli();				
				//this.tiposRelacionesSelect=TipoNotaCreditoSoliConstantesFunciones.getTiposRelacionesTipoNotaCreditoSoli(true);
				
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
			//if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoNotaCreditoSoli();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoNotaCreditoSoli(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoNotaCreditoSoli(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNotaCreditoSoli() ;
			
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
			
			
			this.notacreditosoliLogic=new NotaCreditoSoliLogic(); 
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
				tiponotacreditosoliImplementable= (TipoNotaCreditoSoliImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoNotaCreditoSoliConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiponotacreditosoliImplementableHome= (TipoNotaCreditoSoliImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoNotaCreditoSoliConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiponotacreditosolis= new ArrayList<TipoNotaCreditoSoli>();
			this.tiponotacreditosolisEliminados= new ArrayList<TipoNotaCreditoSoli>();
						
			this.isEsNuevoTipoNotaCreditoSoli=false;
			this.esParaAccionDesdeFormularioTipoNotaCreditoSoli=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoNotaCreditoSoli(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoNotaCreditoSoli();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoNotaCreditoSoliConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoNotaCreditoSoli(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoNotaCreditoSoli();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoNotaCreditoSoli();
			}
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoNotaCreditoSoli(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoNotaCreditoSoli: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoNotaCreditoSoli() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoNotaCreditoSoli")) {
				iIndex=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTabbedPaneRelacionesTipoNotaCreditoSoli.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTabbedPaneRelacionesTipoNotaCreditoSoli.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();	
				
				

				if(sTitle.equals("Solicitud Nota Creditos")) {
					if(!NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoNotaCreditoSoli();

						this.cargarParteTabPanelRelacionadaNotaCreditoSoli(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoNotaCreditoSoli();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaNotaCreditoSoli(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(false,true,iIndex);
		this.jButtonNotaCreditoSoliActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaNotaCreditoSoli();

		//this.jTabbedPaneRelacionesTipoNotaCreditoSoli.updateUI();
		//this.jTabbedPaneRelacionesTipoNotaCreditoSoli.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoNotaCreditoSoli.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("NotaCreditoSoli")) {
				int row=this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
				jButtonNotaCreditoSoliActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Solicitud Nota Credito")) {

					if(this.isTienePermisosNotaCreditoSoli && this.tiponotacreditosoliConstantesFunciones.mostrarNotaCreditoSoliTipoNotaCreditoSoli && !TipoNotaCreditoSoliConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Solicitud Nota Creditos"+"("+NotaCreditoSoliConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Solicitud Nota Creditos");

						if(tiponotacreditosoliConstantesFunciones.resaltarNotaCreditoSoliTipoNotaCreditoSoli!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiponotacreditosoliConstantesFunciones.resaltarNotaCreditoSoliTipoNotaCreditoSoli);
						}

						jmenuItem.setEnabled(this.tiponotacreditosoliConstantesFunciones.activarNotaCreditoSoliTipoNotaCreditoSoli);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"NotaCreditoSoli"));

						

						this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jmenuDetalleTipoNotaCreditoSoli.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoNotaCreditoSoli(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoNotaCreditoSoli(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoNotaCreditoSoli(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoNotaCreditoSoliListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoNotaCreditoSoli();
		
		this.cargarCombosFrameForeignKeyTipoNotaCreditoSoli();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoNotaCreditoSoli();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoNotaCreditoSoli();
		}
	}
	
	
	
	public void jButtonNuevoTipoNotaCreditoSoliActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
			
			if(jTableDatosTipoNotaCreditoSoli.getRowCount()>=1) {
				jTableDatosTipoNotaCreditoSoli.removeRowSelectionInterval(0, jTableDatosTipoNotaCreditoSoli.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoNotaCreditoSoli=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoNotaCreditoSoli(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoNotaCreditoSoli(true);			
			//this.tiponotacreditosoli=new TipoNotaCreditoSoli();
			//this.tiponotacreditosoli.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNotaCreditoSoli(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNotaCreditoSoli() ;
			
			if(TipoNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNotaCreditoSoli(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiponotacreditosoli);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);				
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
			if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoNotaCreditoSoli: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoNotaCreditoSoliActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoNotaCreditoSoli.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoNotaCreditoSoli.getSelectedRows().length;			
			}
			
			tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoNotaCreditoSoli--;			
				//TipoNotaCreditoSoli tiponotacreditosoliAux= new TipoNotaCreditoSoli();			
				//tiponotacreditosoliAux.setId(this.iIdNuevoTipoNotaCreditoSoli);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoNotaCreditoSoli tiponotacreditosoliOrigen=new TipoNotaCreditoSoli();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoNotaCreditoSoli tiponotacreditosoliOrigen : tiponotacreditosolisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiponotacreditosoliOrigen =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponotacreditosoliOrigen =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoNotaCreditoSoli();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiponotacreditosoli.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoNotaCreditoSoli(tiponotacreditosoliOrigen,this.tiponotacreditosoli,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().add(this.tiponotacreditosoliAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiponotacreditosolis.add(this.tiponotacreditosoliAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
				
				this.jTableDatosTipoNotaCreditoSoli.setRowSelectionInterval(this.getIndiceNuevoTipoNotaCreditoSoli(), this.getIndiceNuevoTipoNotaCreditoSoli());
				
				int iLastRow =  this.jTableDatosTipoNotaCreditoSoli.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoNotaCreditoSoli.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoNotaCreditoSoli.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();									
		
			TipoNotaCreditoSoli tiponotacreditosoliOrigen=new TipoNotaCreditoSoli();
			TipoNotaCreditoSoli tiponotacreditosoliDestino=new TipoNotaCreditoSoli();
				
			tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoNotaCreditoSoli.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiponotacreditosolisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoNotaCreditoSoli.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponotacreditosoliOrigen =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiponotacreditosoliOrigen =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponotacreditosoliDestino =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiponotacreditosoliDestino =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiponotacreditosoliOrigen =tiponotacreditosolisSeleccionados.get(0);
				tiponotacreditosoliDestino =tiponotacreditosolisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoNotaCreditoSoli(tiponotacreditosoliOrigen,tiponotacreditosoliDestino,true,false);
				
				tiponotacreditosoliDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiponotacreditosoliDestino,tiponotacreditosoliLogic.getTipoNotaCreditoSolis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponotacreditosoliDestino,tiponotacreditosolis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
				
				//this.jTableDatosTipoNotaCreditoSoli.setRowSelectionInterval(this.getIndiceNuevoTipoNotaCreditoSoli(), this.getIndiceNuevoTipoNotaCreditoSoli());
				
				int iLastRow =  this.jTableDatosTipoNotaCreditoSoli.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoNotaCreditoSoli.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoNotaCreditoSoli.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoNotaCreditoSoli.isVisible();
			
			
			this.jPanelParametrosReportesTipoNotaCreditoSoli.setVisible(!isVisible);
			this.jPanelPaginacionTipoNotaCreditoSoli.setVisible(!isVisible);
			this.jPanelAccionesTipoNotaCreditoSoli.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoNotaCreditoSoli();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoNotaCreditoSoli();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoNotaCreditoSoli();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoNotaCreditoSoli();
			
			this.abrirFrameOrderByTipoNotaCreditoSoli();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoNotaCreditoSoli();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoNotaCreditoSoli(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoNotaCreditoSoli);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.isMaximum()) {
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setSize(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.iWidthFormulario,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoNotaCreditoSoli.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoNotaCreditoSoli.isMaximum()) {
						this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jContentPaneDetalleTipoNotaCreditoSoli.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTabbedPaneRelacionesTipoNotaCreditoSoli.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jContentPaneDetalleTipoNotaCreditoSoli.getWidth(),TipoNotaCreditoSoliConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTabbedPaneRelacionesTipoNotaCreditoSoli.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jContentPaneDetalleTipoNotaCreditoSoli.getWidth(),TipoNotaCreditoSoliConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTabbedPaneRelacionesTipoNotaCreditoSoli.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jContentPaneDetalleTipoNotaCreditoSoli.getWidth(),TipoNotaCreditoSoliConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaNotaCreditoSoli();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setVisible(true);
	        this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoNotaCreditoSoli() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoNotaCreditoSoli==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoNotaCreditoSoli=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNotaCreditoSoli,false,this);
				} else {
					this.jInternalFrameOrderByTipoNotaCreditoSoli=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNotaCreditoSoli,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoNotaCreditoSoli);
				this.jInternalFrameOrderByTipoNotaCreditoSoli.setVisible(false);
				this.jInternalFrameOrderByTipoNotaCreditoSoli.setSelected(false);
				
				this.jInternalFrameOrderByTipoNotaCreditoSoli.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoNotaCreditoSoli"));
				
				this.inicializarActualizarBindingTablaOrderByTipoNotaCreditoSoli();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoNotaCreditoSoli() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoNotaCreditoSoli==null) {
				
				this.jInternalFrameImportacionTipoNotaCreditoSoli=new ImportacionJInternalFrame(TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoNotaCreditoSoli);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoNotaCreditoSoli);
				this.jInternalFrameImportacionTipoNotaCreditoSoli.setVisible(false);
				this.jInternalFrameImportacionTipoNotaCreditoSoli.setSelected(false);


				this.jInternalFrameImportacionTipoNotaCreditoSoli.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoNotaCreditoSoli"));
				this.jInternalFrameImportacionTipoNotaCreditoSoli.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoNotaCreditoSoli"));
				this.jInternalFrameImportacionTipoNotaCreditoSoli.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoNotaCreditoSoli"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoNotaCreditoSoli() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli==null) {
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli=new ReporteDinamicoJInternalFrame(TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli);
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNotaCreditoSoli"));
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNotaCreditoSoli"));
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNotaCreditoSoli"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNotaCreditoSoli();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaNotaCreditoSoli() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jContentPaneDetalleTipoNotaCreditoSoli.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoNotaCreditoSoli() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoNotaCreditoSoli);
			
	       	this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setVisible(false);
	        this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoNotaCreditoSoli.dispose();
			//this.jInternalFrameDetalleFormTipoNotaCreditoSoli=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoNotaCreditoSoli() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoNotaCreditoSoli() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoNotaCreditoSoli.setVisible(true);
	        this.jInternalFrameImportacionTipoNotaCreditoSoli.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoNotaCreditoSoli() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setVisible(true);
	        this.jInternalFrameOrderByTipoNotaCreditoSoli.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoNotaCreditoSoli() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setVisible(false);
	        this.jInternalFrameOrderByTipoNotaCreditoSoli.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoNotaCreditoSoli() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoNotaCreditoSoli() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoNotaCreditoSoli.setVisible(false);
	        this.jInternalFrameImportacionTipoNotaCreditoSoli.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoNotaCreditoSoli(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoNotaCreditoSoli(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoNotaCreditoSoli(true);
			//this.isEsNuevoTipoNotaCreditoSoli=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNotaCreditoSoli(false) ;
			
			if(tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getEsGuardarRelacionado() && NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoSoliActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNotaCreditoSoli(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNotaCreditoSoli(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoNotaCreditoSoliActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoNotaCreditoSoli(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoNotaCreditoSoli(true);
			//this.isEsNuevoTipoNotaCreditoSoli=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiponotacreditosoli.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoNotaCreditoSoli(false) ;
			
			if(TipoNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNotaCreditoSoli(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNotaCreditoSoli(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoNotaCreditoSoli(false);
			
			//if(!this.isEsNuevoTipoNotaCreditoSoli) {								
				int intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoli,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
				
			}
			
			if(this.permiteMantenimiento(this.tiponotacreditosoli)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoNotaCreditoSoli=true;
					this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
					this.isEsNuevoTipoNotaCreditoSoli=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoNotaCreditoSoli=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoNotaCreditoSoli=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoNotaCreditoSoli(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNotaCreditoSoli(false);
				
				this.habilitarDeshabilitarControlesTipoNotaCreditoSoli(false);
			
												
				
				if(TipoNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoNotaCreditoSoli();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,tiponotacreditosoliSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoNotaCreditoSoli(this.tiponotacreditosoli,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoNotaCreditoSoli.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiponotacreditosoliSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiponotacreditosoli.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				this.tiponotacreditosoli.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				this.tiponotacreditosoli.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiponotacreditosoli)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoNotaCreditoSoliModel) this.jTableDatosTipoNotaCreditoSoli.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoNotaCreditoSoli=true;
				this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
				this.isEsNuevoTipoNotaCreditoSoli=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoNotaCreditoSoli(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNotaCreditoSoli(false);
				
				this.habilitarDeshabilitarControlesTipoNotaCreditoSoli(false);
				
				
				
				if(TipoNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoNotaCreditoSoli();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoNotaCreditoSoli.getRowCount()>=1) {
				jTableDatosTipoNotaCreditoSoli.removeRowSelectionInterval(0, jTableDatosTipoNotaCreditoSoli.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoNotaCreditoSoli(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNotaCreditoSoli(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNotaCreditoSoli(false) ;
			
			this.isEsNuevoTipoNotaCreditoSoli=false;
			
			if(TipoNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoNotaCreditoSoli();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
				
				//SI ES MANUAL
				if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoNotaCreditoSoli();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoNotaCreditoSoli--;			
			//TipoNotaCreditoSoli tiponotacreditosoliAux= new TipoNotaCreditoSoli();			
			//tiponotacreditosoliAux.setId(this.iIdNuevoTipoNotaCreditoSoli);
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoNotaCreditoSoli();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
			
			this.tiponotacreditosoli.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().add(this.tiponotacreditosoliAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiponotacreditosolis.add(this.tiponotacreditosoliAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
			
			this.jTableDatosTipoNotaCreditoSoli.setRowSelectionInterval(this.getIndiceNuevoTipoNotaCreditoSoli(), this.getIndiceNuevoTipoNotaCreditoSoli());
			
			int iLastRow =  this.jTableDatosTipoNotaCreditoSoli.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoNotaCreditoSoli.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoNotaCreditoSoli.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
			
			//SI ES MANUAL
			if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNotaCreditoSoli();
			}
			
			//this.abrirFrameTreeTipoNotaCreditoSoli();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Solicitud Nota CreditoS ?", "MANTENIMIENTO DE Tipo Solicitud Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoNotaCreditoSoli.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoNotaCreditoSoli();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiponotacreditosoliReturnGeneral=tiponotacreditosoliLogic.procesarImportacionTipoNotaCreditoSolisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiponotacreditosoliParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoNotaCreditoSoliReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoNotaCreditoSoli.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoNotaCreditoSoli.setFileImportacion(this.jInternalFrameImportacionTipoNotaCreditoSoli.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoNotaCreditoSoli.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoNotaCreditoSoli.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoNotaCreditoSoli.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoNotaCreditoSoli.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();		

		tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoNotaCreditoSoliBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoNotaCreditoSoliBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoNotaCreditoSolis("Todos",tiponotacreditosolisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Solicitud Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();		
		
		tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponotacreditosoli";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoNotaCreditoSolis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoNotaCreditoSoli tiponotacreditosoli:tiponotacreditosolisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponotacreditosoli.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoNotaCreditoSoli tiponotacreditosoli:tiponotacreditosolisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponotacreditosoli.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoNotaCreditoSoli(row);				
			//	iRow++;
			//}				
			
			//for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoNotaCreditoSoli(tiponotacreditosoliAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Solicitud Nota Credito",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
			
			//SI ES MANUAL
			if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNotaCreditoSoli();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
			
			//SI ES MANUAL
			if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoNotaCreditoSoli();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoNotaCreditoSoliActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
			
			//SI ES MANUAL
			if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoNotaCreditoSoli();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoNotaCreditoSoli() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoNotaCreditoSoli.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoNotaCreditoSoli.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoNotaCreditoSoli.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoNotaCreditoSoli.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoNotaCreditoSoli.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoNotaCreditoSoli.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoNotaCreditoSoli.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoNotaCreditoSoli(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoNotaCreditoSoli(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoNotaCreditoSoli(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoNotaCreditoSoli(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoNotaCreditoSoli(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNotaCreditoSoli(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoNotaCreditoSoli(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoNotaCreditoSoli() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoNotaCreditoSoli();
		
		this.inicializarActualizarBindingBotonesManualTipoNotaCreditoSoli(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoNotaCreditoSoli();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNotaCreditoSoli() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNotaCreditoSoli(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNotaCreditoSoli(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoNotaCreditoSoli.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoNotaCreditoSoli.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jCheckBoxPostAccionNuevoTipoNotaCreditoSoli.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jCheckBoxPostAccionSinCerrarTipoNotaCreditoSoli.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jCheckBoxPostAccionSinMensajeTipoNotaCreditoSoli.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoNotaCreditoSoli.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoNotaCreditoSoli.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jCheckBoxPostAccionNuevoTipoNotaCreditoSoli.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jCheckBoxPostAccionSinCerrarTipoNotaCreditoSoli.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jCheckBoxPostAccionSinMensajeTipoNotaCreditoSoli.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoNotaCreditoSoli.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoNotaCreditoSoli.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoNotaCreditoSoli.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoNotaCreditoSoli(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNotaCreditoSoli(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoNotaCreditoSoli() throws Exception {
		try	{
			if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoNotaCreditoSoli();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoNotaCreditoSoli() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoNotaCreditoSoli() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoNotaCreditoSoli.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoNotaCreditoSoli.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.addItem(reporte);
			}
			
			
			if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoNotaCreditoSoli.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoNotaCreditoSoli.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoNotaCreditoSoli.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoNotaCreditoSoli.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNotaCreditoSoli();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNotaCreditoSoli() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli!=null) {
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli!=null) {
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoNotaCreditoSoli()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoNotaCreditoSoli(Boolean esInicializar) throws Exception {				
		if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoNotaCreditoSoli();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoNotaCreditoSoli() throws Exception {
		this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoNotaCreditoSoli() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoNotaCreditoSoliPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoNotaCreditoSoliPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoNotaCreditoSoliOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNotaCreditoSoliOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoNotaCreditoSoliPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoNotaCreditoSoliPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoNotaCreditoSoli(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiponotacreditosoliLogic.getTipoNotaCreditoSolis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiponotacreditosolis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoNotaCreditoSoli.setModel(new TipoNotaCreditoSoliModel(this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoNotaCreditoSoli.setModel(new TipoNotaCreditoSoliModel(this.tiponotacreditosolis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoNotaCreditoSoli!=null && this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoNotaCreditoSoli();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNotaCreditoSoli,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoNotaCreditoSoliPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO,tiponotacreditosoliConstantesFunciones.resaltarSeleccionarTipoNotaCreditoSoli,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO,tiponotacreditosoliConstantesFunciones.resaltarSeleccionarTipoNotaCreditoSoli,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNotaCreditoSoli,TipoNotaCreditoSoliConstantesFunciones.LABEL_ID));

		if(this.tiponotacreditosoliConstantesFunciones.mostraridTipoNotaCreditoSoli && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNotaCreditoSoliConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiponotacreditosoliConstantesFunciones.resaltaridTipoNotaCreditoSoli,this.tiponotacreditosoliConstantesFunciones.activaridTipoNotaCreditoSoli,this,true,"idTipoNotaCreditoSoli","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponotacreditosoliConstantesFunciones.resaltaridTipoNotaCreditoSoli,this.tiponotacreditosoliConstantesFunciones.activaridTipoNotaCreditoSoli,this,true,"idTipoNotaCreditoSoli","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNotaCreditoSoli,TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO));

		if(this.tiponotacreditosoliConstantesFunciones.mostrarcodigoTipoNotaCreditoSoli && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiponotacreditosoliConstantesFunciones.resaltarcodigoTipoNotaCreditoSoli,this.tiponotacreditosoliConstantesFunciones.activarcodigoTipoNotaCreditoSoli,this,true,"codigoTipoNotaCreditoSoli","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponotacreditosoliConstantesFunciones.resaltarcodigoTipoNotaCreditoSoli,this.tiponotacreditosoliConstantesFunciones.activarcodigoTipoNotaCreditoSoli,this,true,"codigoTipoNotaCreditoSoli","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoNotaCreditoSoliPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNotaCreditoSoli,TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE));

		if(this.tiponotacreditosoliConstantesFunciones.mostrarnombreTipoNotaCreditoSoli && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiponotacreditosoliConstantesFunciones.resaltarnombreTipoNotaCreditoSoli,this.tiponotacreditosoliConstantesFunciones.activarnombreTipoNotaCreditoSoli,this,true,"nombreTipoNotaCreditoSoli","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponotacreditosoliConstantesFunciones.resaltarnombreTipoNotaCreditoSoli,this.tiponotacreditosoliConstantesFunciones.activarnombreTipoNotaCreditoSoli,this,true,"nombreTipoNotaCreditoSoli","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoNotaCreditoSoliPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosNotaCreditoSoli && this.tiponotacreditosoliConstantesFunciones.mostrarNotaCreditoSoliTipoNotaCreditoSoli && !TipoNotaCreditoSoliConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Solicitud Nota Creditos");
				tableColumn.setHeaderValue("Solicitud Nota Creditos");
				tableColumn.setCellRenderer(new NotaCreditoSoliTableCell(tiponotacreditosoliConstantesFunciones.resaltarNotaCreditoSoliTipoNotaCreditoSoli,this,this.tiponotacreditosoliConstantesFunciones.activarNotaCreditoSoliTipoNotaCreditoSoli));
				tableColumn.setCellEditor(new NotaCreditoSoliTableCell(tiponotacreditosoliConstantesFunciones.resaltarNotaCreditoSoliTipoNotaCreditoSoli,this,this.tiponotacreditosoliConstantesFunciones.activarNotaCreditoSoliTipoNotaCreditoSoli));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoNotaCreditoSoli.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoNotaCreditoSoli.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoNotaCreditoSoli.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoNotaCreditoSoli.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoNotaCreditoSoli.addColumn(tableColumn);
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
			
			this.jTableDatosTipoNotaCreditoSoli.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoNotaCreditoSoli.moveColumn(this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoNotaCreditoSoli.moveColumn(this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoNotaCreditoSoli.moveColumn(this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoNotaCreditoSoli.moveColumn(this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoNotaCreditoSoli.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoNotaCreditoSoli.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoNotaCreditoSoli,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoNotaCreditoSoli.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoNotaCreditoSoli.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoNotaCreditoSoli.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiponotacreditosoliLogic.getTipoNotaCreditoSolis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiponotacreditosolis.size()-1;
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
		//this.jTableDatosTipoNotaCreditoSoli.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoNotaCreditoSoli();
			
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
				
				//this.isEsNuevoTipoNotaCreditoSoli=false;
					
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
				if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoNotaCreditoSoli.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiponotacreditosoli.getsType().equals("DUPLICADO")
				   || this.tiponotacreditosoli.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoNotaCreditoSoli=true;
				
				} else {
					this.isEsNuevoTipoNotaCreditoSoli=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
					if(this.tiponotacreditosoli.getId()>=0 && !this.tiponotacreditosoli.getIsNew()) {						
						this.isEsNuevoTipoNotaCreditoSoli=false;
						
					} else {
						this.isEsNuevoTipoNotaCreditoSoli=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoNotaCreditoSoli(esRelaciones);						
				
				this.seleccionarTipoNotaCreditoSoli(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiponotacreditosoli.getId()<0) {
					this.isEsNuevoTipoNotaCreditoSoli=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoNotaCreditoSoli(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoNotaCreditoSoli(evt,rowIndex);
				}	
				
				if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoNotaCreditoSoli: " + this.dDif); 
					}
				}								
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoNotaCreditoSoli(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiponotacreditosoli)) {
					if(this.tiponotacreditosoli.getId()>0) {
						this.tiponotacreditosoli.setIsDeleted(true);
						
						this.tiponotacreditosolisEliminados.add(this.tiponotacreditosoli);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().remove(this.tiponotacreditosoli);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiponotacreditosolis.remove(this.tiponotacreditosoli);				
					}
					
					
					((TipoNotaCreditoSoliModel) this.jTableDatosTipoNotaCreditoSoli.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoNotaCreditoSoli(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoNotaCreditoSoli) {
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoNotaCreditoSoli.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoNotaCreditoSoli(this.tiponotacreditosoli);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoNotaCreditoSoli("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoNotaCreditoSoli(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNotaCreditoSoli() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoNotaCreditoSoli(tiponotacreditosoli,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoNotaCreditoSoli(tiponotacreditosoli);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoNotaCreditoSoli(tiponotacreditosoli,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoNotaCreditoSoli(tiponotacreditosoli);
	}
	
	public void setVariablesObjetoActualToFormularioTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.setText(tiponotacreditosoli.getId().toString());
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldcodigoTipoNotaCreditoSoli.setText(tiponotacreditosoli.getcodigo());
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextAreanombreTipoNotaCreditoSoli.setText(tiponotacreditosoli.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoNotaCreditoSoli tiponotacreditosoliLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiponotacreditosoliLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoNotaCreditoSoli tiponotacreditosoliLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiponotacreditosoliLocal=this.tiponotacreditosoli;
			} else {
				tiponotacreditosoliLocal=this.tiponotacreditosoliAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiponotacreditosoliLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoNotaCreditoSoli(tiponotacreditosoliLocal,true);
					
					if(tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiponotacreditosoliLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiponotacreditosoliLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(tiponotacreditosoli,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(tiponotacreditosoli);
	}
	
	public void setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(tiponotacreditosoli,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.getText()==null || this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.getText()=="" || this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.setText("0");
			}

			if(conColumnasBase) {tiponotacreditosoli.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNotaCreditoSoliConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jLabelIdTipoNotaCreditoSoli,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiponotacreditosoli.setcodigo(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldcodigoTipoNotaCreditoSoli.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jLabelcodigoTipoNotaCreditoSoli,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiponotacreditosoli.setnombre(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextAreanombreTipoNotaCreditoSoli.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jLabelnombreTipoNotaCreditoSoli,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoliBean,TipoNotaCreditoSoli tiponotacreditosoli,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoliOrigen,TipoNotaCreditoSoli tiponotacreditosoli,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiponotacreditosoliOrigen.getId()!=null && !tiponotacreditosoliOrigen.getId().equals(0L))) {tiponotacreditosoli.setId(tiponotacreditosoliOrigen.getId());}}
			if(conDefault || (!conDefault && tiponotacreditosoliOrigen.getcodigo()!=null && !tiponotacreditosoliOrigen.getcodigo().equals(""))) {tiponotacreditosoli.setcodigo(tiponotacreditosoliOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiponotacreditosoliOrigen.getnombre()!=null && !tiponotacreditosoliOrigen.getnombre().equals(""))) {tiponotacreditosoli.setnombre(tiponotacreditosoliOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.setText(tiponotacreditosoli.getId().toString());
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldcodigoTipoNotaCreditoSoli.setText(tiponotacreditosoli.getcodigo());
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextAreanombreTipoNotaCreditoSoli.setText(tiponotacreditosoli.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoNotaCreditoSoli(TipoNotaCreditoSoliBean tiponotacreditosoliBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.setText(tiponotacreditosoliBean.getId().toString());
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldcodigoTipoNotaCreditoSoli.setText(tiponotacreditosoliBean.getcodigo());
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextAreanombreTipoNotaCreditoSoli.setText(tiponotacreditosoliBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoNotaCreditoSoli(TipoNotaCreditoSoliParameterReturnGeneral tiponotacreditosoliReturnGeneral,TipoNotaCreditoSoliBean tiponotacreditosoliBean,Boolean conDefault) throws Exception { 
		try {
			TipoNotaCreditoSoli tiponotacreditosoliLocal=new TipoNotaCreditoSoli();
			
			tiponotacreditosoliLocal=tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiponotacreditosoliLocal.getId()!=null && !tiponotacreditosoliLocal.getId().equals(0L))) {tiponotacreditosoliBean.setId(tiponotacreditosoliLocal.getId());}}
			if(conDefault || (!conDefault && tiponotacreditosoliLocal.getcodigo()!=null && !tiponotacreditosoliLocal.getcodigo().equals(""))) {tiponotacreditosoliBean.setcodigo(tiponotacreditosoliLocal.getcodigo());}
			if(conDefault || (!conDefault && tiponotacreditosoliLocal.getnombre()!=null && !tiponotacreditosoliLocal.getnombre().equals(""))) {tiponotacreditosoliBean.setnombre(tiponotacreditosoliLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoNotaCreditoSoliGenerico(Long idTipoNotaCreditoSoliSeleccionado,JComboBox jComboBoxTipoNotaCreditoSoli,List<TipoNotaCreditoSoli> tiponotacreditosolisLocal)throws Exception {
		try {
			TipoNotaCreditoSoli  tiponotacreditosoliTemp=null;

			for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolisLocal) {
				if(tiponotacreditosoliAux.getId()!=null && tiponotacreditosoliAux.getId().equals(idTipoNotaCreditoSoliSeleccionado)) {
					tiponotacreditosoliTemp=tiponotacreditosoliAux;
					break;
				}
			}

			jComboBoxTipoNotaCreditoSoli.setSelectedItem(tiponotacreditosoliTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoNotaCreditoSoliGenerico(JComboBox jComboBoxTipoNotaCreditoSoli,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoNotaCreditoSoli.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoNotaCreditoSoli.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoNotaCreditoSoli.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoNotaCreditoSoli.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("NotaCreditoSoli")) {
			jButtonNotaCreditoSoliActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponotacreditosoli=(TipoNotaCreditoSoli) tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiponotacreditosoli =(TipoNotaCreditoSoli) tiponotacreditosolis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoNotaCreditoSoli tiponotacreditosoliRow=new TipoNotaCreditoSoli();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponotacreditosoliRow=(TipoNotaCreditoSoli) tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiponotacreditosoliRow=(TipoNotaCreditoSoli) tiponotacreditosolis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonNotaCreditoSoliActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoNotaCreditoSoli tiponotacreditosoli) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponotacreditosoli = (TipoNotaCreditoSoli)this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiponotacreditosoli = (TipoNotaCreditoSoli)this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiponotacreditosoli!=null) {
						this.tiponotacreditosoli = tiponotacreditosoli;
					} else {
						this.tiponotacreditosoli = new TipoNotaCreditoSoli();
					}
				}

				if(this.isTienePermisosNotaCreditoSoli && this.permiteMantenimiento(this.tiponotacreditosoli)) {
					NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFramePopup=new NotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						notacreditosoliBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFramePopup;
					} else {
						notacreditosoliBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame;
					}

					List<TipoNotaCreditoSoli> tiponotacreditosolis=new ArrayList<TipoNotaCreditoSoli>();
					tiponotacreditosolis.add(this.tiponotacreditosoli);
					if(!esRelacionado) {
						//notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setConGuardarRelaciones(false);
						//notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					notacreditosoliBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.cargarNotaCreditoSoliBeanSwingJInternalFrame(tiponotacreditosolis,this.tiponotacreditosoli,notacreditosoliBeanSwingJInternalFrame,/*conInicializar,*/notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getConGuardarRelaciones(),notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getEsGuardarRelacionado());
					notacreditosoliBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("no_relacionado");

						notacreditosoliBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(NotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA + (NotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA/2));

						notacreditosoliBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoNotaCreditoSoli=(TitledBorder)this.jScrollPanelDatosTipoNotaCreditoSoli.getBorder();
						TitledBorder titledBorderNotaCreditoSoli=(TitledBorder)notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.getBorder();

						titledBorderNotaCreditoSoli.setTitle(titledBorderTipoNotaCreditoSoli.getTitle() + " -> Solicitud Nota Credito");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,notacreditosoliBeanSwingJInternalFrame);
						}

						notacreditosoliBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(notacreditosoliBeanSwingJInternalFrame);

						notacreditosoliBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Solicitud Nota Credito",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoNotaCreditoSoli(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli && this.isPermisoNuevoTipoNotaCreditoSoli));			
			this.jButtonDuplicarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaDuplicarTipoNotaCreditoSoli && this.isPermisoDuplicarTipoNotaCreditoSoli));			
			this.jButtonCopiarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaCopiarTipoNotaCreditoSoli && this.isPermisoCopiarTipoNotaCreditoSoli));
			this.jButtonVerFormTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaVerFormTipoNotaCreditoSoli && this.isPermisoVerFormTipoNotaCreditoSoli));
			
			this.jButtonAbrirOrderByTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaOrdenTipoNotaCreditoSoli && this.isPermisoOrdenTipoNotaCreditoSoli));			
			
			this.jButtonNuevoRelacionesTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli && this.isPermisoNuevoTipoNotaCreditoSoli));			
			this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli && this.isPermisoNuevoTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli));
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonModificarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaModificarTipoNotaCreditoSoli && this.isPermisoActualizarTipoNotaCreditoSoli));	
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonActualizarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli && this.isPermisoActualizarTipoNotaCreditoSoli));	
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonEliminarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli && this.isPermisoEliminarTipoNotaCreditoSoli));
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonCancelarTipoNotaCreditoSoli.setVisible(this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli);							
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli && this.isPermisoNuevoTipoNotaCreditoSoli));						
			this.jButtonDuplicarToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaDuplicarTipoNotaCreditoSoli && this.isPermisoDuplicarTipoNotaCreditoSoli));						
			this.jButtonCopiarToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaCopiarTipoNotaCreditoSoli && this.isPermisoCopiarTipoNotaCreditoSoli));			
			this.jButtonVerFormToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaVerFormTipoNotaCreditoSoli && this.isPermisoVerFormTipoNotaCreditoSoli));			
			this.jButtonAbrirOrderByToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaOrdenTipoNotaCreditoSoli && this.isPermisoOrdenTipoNotaCreditoSoli));
			this.jButtonNuevoRelacionesToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli && this.isPermisoNuevoTipoNotaCreditoSoli));			
			this.jButtonNuevoGuardarCambiosToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli && this.isPermisoNuevoTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli));			
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonModificarToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaModificarTipoNotaCreditoSoli && this.isPermisoActualizarTipoNotaCreditoSoli));	
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonActualizarToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli  && this.isPermisoActualizarTipoNotaCreditoSoli));	
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonEliminarToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli && this.isPermisoEliminarTipoNotaCreditoSoli));
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonCancelarToolBarTipoNotaCreditoSoli.setVisible(this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli);				
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli && this.isPermisoNuevoTipoNotaCreditoSoli));			
			this.jMenuItemDuplicarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaDuplicarTipoNotaCreditoSoli && this.isPermisoDuplicarTipoNotaCreditoSoli));			
			this.jMenuItemCopiarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaCopiarTipoNotaCreditoSoli && this.isPermisoCopiarTipoNotaCreditoSoli));			
			this.jMenuItemVerFormTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaVerFormTipoNotaCreditoSoli && this.isPermisoVerFormTipoNotaCreditoSoli));			
			this.jMenuItemAbrirOrderByTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaOrdenTipoNotaCreditoSoli && this.isPermisoOrdenTipoNotaCreditoSoli));			
			//this.jMenuItemMostrarOcultarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaOrdenTipoNotaCreditoSoli && this.isPermisoOrdenTipoNotaCreditoSoli));
			this.jMenuItemDetalleAbrirOrderByTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaOrdenTipoNotaCreditoSoli && this.isPermisoOrdenTipoNotaCreditoSoli));			
			//this.jMenuItemDetalleMostrarOcultarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaOrdenTipoNotaCreditoSoli && this.isPermisoOrdenTipoNotaCreditoSoli));			
			this.jMenuItemNuevoRelacionesTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli && this.isPermisoNuevoTipoNotaCreditoSoli));			
			this.jMenuItemNuevoGuardarCambiosTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli && this.isPermisoNuevoTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli));									
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemModificarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaModificarTipoNotaCreditoSoli && this.isPermisoActualizarTipoNotaCreditoSoli));	
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemActualizarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli && this.isPermisoActualizarTipoNotaCreditoSoli));	
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemEliminarTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli && this.isPermisoEliminarTipoNotaCreditoSoli));
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemCancelarTipoNotaCreditoSoli.setVisible(this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli);				
			}
			
			this.jMenuItemGuardarCambiosTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli));						
			this.jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=this.jButtonNuevoTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaDuplicarTipoNotaCreditoSoli=this.jButtonDuplicarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaCopiarTipoNotaCreditoSoli=this.jButtonCopiarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaVerFormTipoNotaCreditoSoli=this.jButtonVerFormTipoNotaCreditoSoli.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoNotaCreditoSoli=this.jButtonAbrirOrderByTipoNotaCreditoSoli.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=this.jButtonNuevoRelacionesTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaModificarTipoNotaCreditoSoli=this.jButtonModificarTipoNotaCreditoSoli.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonActualizarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonEliminarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonCancelarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosTipoNotaCreditoSoli.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=this.jButtonNuevoToolBarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=this.jButtonNuevoRelacionesToolBarTipoNotaCreditoSoli.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			this.isVisibilidadCeldaModificarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonModificarToolBarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonActualizarToolBarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonEliminarToolBarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonCancelarToolBarTipoNotaCreditoSoli.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=this.jButtonGuardarCambiosToolBarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=this.jButtonGuardarCambiosTablaToolBarTipoNotaCreditoSoli.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=this.jMenuItemNuevoTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=this.jMenuItemNuevoRelacionesTipoNotaCreditoSoli.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			this.isVisibilidadCeldaModificarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemModificarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemActualizarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemEliminarTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemCancelarTipoNotaCreditoSoli.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=this.jMenuItemGuardarCambiosTipoNotaCreditoSoli.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=this.jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoNotaCreditoSoli(Boolean esInicializar) {
		if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
				//if(this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoNotaCreditoSoli();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoNotaCreditoSoli(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoNotaCreditoSoli() {
		this.jButtonNuevoTipoNotaCreditoSoli.setVisible(this.isPermisoNuevoTipoNotaCreditoSoli);			
		this.jButtonDuplicarTipoNotaCreditoSoli.setVisible(this.isPermisoDuplicarTipoNotaCreditoSoli);			
		this.jButtonCopiarTipoNotaCreditoSoli.setVisible(this.isPermisoCopiarTipoNotaCreditoSoli);			
		this.jButtonVerFormTipoNotaCreditoSoli.setVisible(this.isPermisoVerFormTipoNotaCreditoSoli);			
		
		this.jButtonAbrirOrderByTipoNotaCreditoSoli.setVisible(this.isPermisoOrdenTipoNotaCreditoSoli);					
		
		this.jButtonNuevoRelacionesTipoNotaCreditoSoli.setVisible(this.isPermisoNuevoTipoNotaCreditoSoli);			
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonModificarTipoNotaCreditoSoli.setVisible(this.isPermisoActualizarTipoNotaCreditoSoli);	
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonActualizarTipoNotaCreditoSoli.setVisible(this.isPermisoActualizarTipoNotaCreditoSoli);	
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonEliminarTipoNotaCreditoSoli.setVisible(this.isPermisoEliminarTipoNotaCreditoSoli);
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonCancelarTipoNotaCreditoSoli.setVisible(this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli);						
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosTipoNotaCreditoSoli.setVisible(this.isPermisoGuardarCambiosTipoNotaCreditoSoli);							
		}
		
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.setVisible(this.isPermisoActualizarTipoNotaCreditoSoli);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoNotaCreditoSoli() {
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonModificarTipoNotaCreditoSoli.setVisible(this.isPermisoActualizarTipoNotaCreditoSoli);	
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonActualizarTipoNotaCreditoSoli.setVisible(this.isPermisoActualizarTipoNotaCreditoSoli);	
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonEliminarTipoNotaCreditoSoli.setVisible(this.isPermisoEliminarTipoNotaCreditoSoli);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonCancelarTipoNotaCreditoSoli.setVisible(this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli);							
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosTipoNotaCreditoSoli.setVisible((this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli && this.isPermisoGuardarCambiosTipoNotaCreditoSoli));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoNotaCreditoSoli() {
		if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoNotaCreditoSoli();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoNotaCreditoSoli() {
	}
	
	public void jTableDatosTipoNotaCreditoSoliListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoNotaCreditoSoli(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoNotaCreditoSoliBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.gettiponotacreditosoli(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponotacreditosoli==null) {
						this.tiponotacreditosoli = new TipoNotaCreditoSoli();
					}

					this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoli,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
				}

				if(this.tiponotacreditosoli.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiponotacreditosoli.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoNotaCreditoSoliBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.gettiponotacreditosoli(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponotacreditosoli==null) {
						this.tiponotacreditosoli = new TipoNotaCreditoSoli();
					}

					this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoli,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
				}

				if(this.tiponotacreditosoli.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiponotacreditosoli.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoNotaCreditoSoliBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.gettiponotacreditosoli(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponotacreditosoli==null) {
						this.tiponotacreditosoli = new TipoNotaCreditoSoli();
					}

					this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoli,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);
				}

				if(this.tiponotacreditosoli.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiponotacreditosoli.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoNotaCreditoSoli() {
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
		

		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.dispose();
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli!=null) {
			this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.dispose();
			this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli=null;
		}
		
		if(this.jInternalFrameImportacionTipoNotaCreditoSoli!=null) {
			this.jInternalFrameImportacionTipoNotaCreditoSoli.setVisible(false);	    			
			this.jInternalFrameImportacionTipoNotaCreditoSoli.dispose();
			this.jInternalFrameImportacionTipoNotaCreditoSoli=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoNotaCreditoSoli();
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoNotaCreditoSoli")) {
				jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoNotaCreditoSoli")) {
				jButtonDuplicarTipoNotaCreditoSoliActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoNotaCreditoSoli")) {
				jButtonCopiarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoNotaCreditoSoli")) {
				jButtonVerFormTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoNotaCreditoSoli")) {
				jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoNotaCreditoSoli")) {
				jButtonDuplicarTipoNotaCreditoSoliActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoNotaCreditoSoli")) {
				jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoNotaCreditoSoli")) {
				jButtonDuplicarTipoNotaCreditoSoliActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoNotaCreditoSoli")) {
				jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoNotaCreditoSoli")) {
				jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoNotaCreditoSoli")) {
				jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoNotaCreditoSoli")) {
				jButtonModificarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoNotaCreditoSoli")) {
				jButtonModificarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoNotaCreditoSoli")) {
				jButtonModificarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoNotaCreditoSoli")) {
				jButtonActualizarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoNotaCreditoSoli")) {
				jButtonActualizarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoNotaCreditoSoli")) {
				jButtonActualizarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoNotaCreditoSoli")) {
				jButtonEliminarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoNotaCreditoSoli")) {
				jButtonEliminarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoNotaCreditoSoli")) {
				jButtonEliminarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoNotaCreditoSoli")) {
				jButtonCancelarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoNotaCreditoSoli")) {
				jButtonCancelarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoNotaCreditoSoli")) {
				jButtonCancelarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoNotaCreditoSoli")) {
				jButtonCerrarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoNotaCreditoSoli")) {
				jButtonCerrarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoNotaCreditoSoli")) {
				jButtonCerrarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoNotaCreditoSoli")) {
				jButtonMostrarOcultarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoNotaCreditoSoli")) {
				jButtonCancelarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoNotaCreditoSoli")) {
				jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoNotaCreditoSoli")) {
				jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoNotaCreditoSoli")) {
				jButtonCopiarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoNotaCreditoSoli")) {
				jButtonVerFormTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoNotaCreditoSoli")) {
				jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoNotaCreditoSoli")) {
				jButtonCopiarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoNotaCreditoSoli")) {
				jButtonVerFormTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoNotaCreditoSoli")) {
				jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoNotaCreditoSoli")) {
				jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoNotaCreditoSoli")) {
				jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoNotaCreditoSoli")) {
				jButtonRecargarInformacionTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoNotaCreditoSoli")) {
				jButtonRecargarInformacionTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoNotaCreditoSoli")) {
				jButtonRecargarInformacionTipoNotaCreditoSoliActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoNotaCreditoSoli")) {
				jButtonAnterioresTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoNotaCreditoSoli")) {
				jButtonAnterioresTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoNotaCreditoSoli")) {
				jButtonAnterioresTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoNotaCreditoSoli")) {
				jButtonSiguientesTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoNotaCreditoSoli")) {
				jButtonSiguientesTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoNotaCreditoSoli")) {
				jButtonSiguientesTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoNotaCreditoSoli") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoNotaCreditoSoli")) {
				jButtonAbrirOrderByTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoNotaCreditoSoli") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoNotaCreditoSoli")) {
				jButtonMostrarOcultarTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoNotaCreditoSoli")) {
				jButtonNuevoGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoNotaCreditoSoli")) {
				jButtonNuevoGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoNotaCreditoSoli")) {
				jButtonNuevoGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoNotaCreditoSoli")) {
				jButtonCerrarReporteDinamicoTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoNotaCreditoSoli")) {
				jButtonGenerarReporteDinamicoTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoNotaCreditoSoli")) {
				
				jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoNotaCreditoSoli")) {
				jButtonCerrarImportacionTipoNotaCreditoSoliActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoNotaCreditoSoli")) {
				
				jButtonGenerarImportacionTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoNotaCreditoSoli")) {
				
				jButtonAbrirImportacionTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoNotaCreditoSoli")) {
				jComboBoxTiposAccionesTipoNotaCreditoSoliActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoNotaCreditoSoli")) {
				jComboBoxTiposRelacionesTipoNotaCreditoSoliActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoNotaCreditoSoli")) {
				jComboBoxTiposAccionesTipoNotaCreditoSoliActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoNotaCreditoSoli")) {
				
				jComboBoxTiposSeleccionarTipoNotaCreditoSoliActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoNotaCreditoSoli")) {
				jTextFieldValorCampoGeneralTipoNotaCreditoSoliActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoNotaCreditoSoli")) {
				jButtonAbrirOrderByTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoNotaCreditoSoli")) {
				jButtonAbrirOrderByTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoNotaCreditoSoli")) {
				jButtonCerrarOrderByTipoNotaCreditoSoliActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoNotaCreditoSoliBusqueda")) {
				this.jButtonidTipoNotaCreditoSoliBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoNotaCreditoSoliBusqueda")) {
				this.jButtoncodigoTipoNotaCreditoSoliBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoNotaCreditoSoliBusqueda")) {
				this.jButtonnombreTipoNotaCreditoSoliBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoNotaCreditoSoli();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				


				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoNotaCreditoSoli tiponotacreditosoliLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiponotacreditosoliLocal=this.tiponotacreditosoli;
			} else {
				tiponotacreditosoliLocal=this.tiponotacreditosoliAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
							
				
				


				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
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
			
			


			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
								
						
				


				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
								
				
				


				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
							
				
				


				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
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
			
			


			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
								
				
				


				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoNotaCreditoSoli")) {
					jCheckBoxSeleccionarTodosTipoNotaCreditoSoliItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoNotaCreditoSoli")) {
					jCheckBoxSeleccionadosTipoNotaCreditoSoliItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoNotaCreditoSoli")) {
					
				}
				
				


				
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
												
				
				


				
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
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
			
			


			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponotacreditosoli);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponotacreditosoli);
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
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
				
				


				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNotaCreditoSoli.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNotaCreditoSoli.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNotaCreditoSoliActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponotacreditosoliAnterior =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoNotaCreditoSoli")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoNotaCreditoSoliListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoNotaCreditoSoli.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiponotacreditosoli =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiponotacreditosoli);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoNotaCreditoSoli")) {
				
				}
				
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoNotaCreditoSoli")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoNotaCreditoSoli.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoNotaCreditoSoli")) {
			
			}
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoNotaCreditoSoli();
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
			if(sTipo.equals("NuevoTipoNotaCreditoSoli")) {
				jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoNotaCreditoSoli")) {
				jButtonDuplicarTipoNotaCreditoSoliActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoNotaCreditoSoli")) {
				jButtonCopiarTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoNotaCreditoSoli")) {
				jButtonVerFormTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoNotaCreditoSoli")) {
				jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoNotaCreditoSoli")) {
				jButtonModificarTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoNotaCreditoSoli")) {
				jButtonActualizarTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoNotaCreditoSoli")) {
				jButtonEliminarTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoNotaCreditoSoli")) {
				jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoNotaCreditoSoli")) {
				jButtonCancelarTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoNotaCreditoSoli")) {
				jButtonCerrarTipoNotaCreditoSoliActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoNotaCreditoSoli")) {
				jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoNotaCreditoSoli")) {
				jButtonNuevoGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoNotaCreditoSoli")) {
				jButtonAbrirOrderByTipoNotaCreditoSoliActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoNotaCreditoSoli")) {
				jButtonRecargarInformacionTipoNotaCreditoSoliActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoNotaCreditoSoli")) {
				jButtonAnterioresTipoNotaCreditoSoliActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoNotaCreditoSoli")) {
				jButtonSiguientesTipoNotaCreditoSoliActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoNotaCreditoSoliBusqueda")) {
				this.jButtonidTipoNotaCreditoSoliBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoNotaCreditoSoliBusqueda")) {
				this.jButtoncodigoTipoNotaCreditoSoliBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoNotaCreditoSoliBusqueda")) {
				this.jButtonnombreTipoNotaCreditoSoliBusquedaActionPerformed(evt);
			}
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoNotaCreditoSoli();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoNotaCreditoSoli")) {
				closingInternalFrameTipoNotaCreditoSoli();
				
			} else if(sTipo.equals("jButtonCancelarTipoNotaCreditoSoli")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoNotaCreditoSoli = (JInternalFrameBase)evt.getSource();
	            	
	            TipoNotaCreditoSoliBeanSwingJInternalFrame jInternalFrameParent=(TipoNotaCreditoSoliBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoNotaCreditoSoli.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoNotaCreditoSoliActionPerformed(null);
			}
			
			TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiponotacreditosoli,new Object(),this.tiponotacreditosoliParameterGeneral,this.tiponotacreditosoliReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoNotaCreditoSoli(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoNotaCreditoSoli(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoNotaCreditoSoli(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiponotacreditosoli)) {
			if(!esControlTabla) {
				if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoli,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);			
				}
				
				if(this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoli,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiponotacreditosoliReturnGeneral=tiponotacreditosoliLogic.procesarEventosTipoNotaCreditoSolisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis(),this.tiponotacreditosoli,this.tiponotacreditosoliParameterGeneral,this.isEsNuevoTipoNotaCreditoSoli,classes);//this.tiponotacreditosoliLogic.getTipoNotaCreditoSoli()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoNotaCreditoSoli(this.tiponotacreditosoliReturnGeneral,this.tiponotacreditosoliBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoNotaCreditoSoli(classes,this.tiponotacreditosoliReturnGeneral,this.tiponotacreditosoliBean,false);
					}
						
					if(this.tiponotacreditosoliReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoNotaCreditoSoli(this.tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoNotaCreditoSoli(this.tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli());	
					}
						
					if(this.tiponotacreditosoliReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoNotaCreditoSoli(this.tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli(),classes);//this.tiponotacreditosoliBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoNotaCreditoSoli(this.tiponotacreditosoli,classes);//this.tiponotacreditosoliBean);									
				}
			
				if(TipoNotaCreditoSoliJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoNotaCreditoSoli(this.tiponotacreditosoli,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNotaCreditoSoli(this.tiponotacreditosoli);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiponotacreditosoliAnterior!=null) {
						this.tiponotacreditosoli=this.tiponotacreditosoliAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiponotacreditosoliReturnGeneral=tiponotacreditosoliLogic.procesarEventosTipoNotaCreditoSolisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis(),this.tiponotacreditosoli,this.tiponotacreditosoliParameterGeneral,this.isEsNuevoTipoNotaCreditoSoli,classes);//this.tiponotacreditosoliLogic.getTipoNotaCreditoSoli()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli(),tiponotacreditosoliLogic.getTipoNotaCreditoSolis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli(),this.tiponotacreditosolis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoNotaCreditoSoli.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoNotaCreditoSoli.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoNotaCreditoSoli();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoNotaCreditoSoli() throws Exception {
		
		TipoNotaCreditoSoliModel tiponotacreditosoliModel=(TipoNotaCreditoSoliModel)this.jTableDatosTipoNotaCreditoSoli.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponotacreditosoliModel.tiponotacreditosolis=this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiponotacreditosoliModel.tiponotacreditosolis=this.tiponotacreditosolis;
		}
		
		
		((TipoNotaCreditoSoliModel) this.jTableDatosTipoNotaCreditoSoli.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoNotaCreditoSoli() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiponotacreditosoliAnterior(),this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiponotacreditosoliAnterior(),this.tiponotacreditosolis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoNotaCreditoSoli();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoSoli.class)) {
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(tiponotacreditosoli.getNotaCreditoSolis());
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoSoli(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
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
										
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponotacreditosoli,new Object(),generalEntityParameterGeneral,this.tiponotacreditosoliReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoNotaCreditoSoliConstantesFunciones.getClassesRelationshipsOfTipoNotaCreditoSoli(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoNotaCreditoSoliConstantesFunciones.getClassesRelationshipsFromStringsOfTipoNotaCreditoSoli(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoNotaCreditoSoli(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponotacreditosoli,new Object(),generalEntityParameterGeneral,this.tiponotacreditosoliReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoNotaCreditoSoli(TipoNotaCreditoSoliBean tiponotacreditosoliBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoSoli.class)) {
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(tiponotacreditosoli.getNotaCreditoSolis());
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoSoli(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoNotaCreditoSoli(ArrayList<Classe> classes,TipoNotaCreditoSoliReturnGeneral tiponotacreditosoliReturnGeneral,TipoNotaCreditoSoliBean tiponotacreditosoliBean,Boolean conDefault) throws Exception {
		
			this.tiponotacreditosoliBean.setNotaCreditoSolis(tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli().getNotaCreditoSolis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoSoli.class)) {
					tiponotacreditosoli.setNotaCreditoSolis(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tiponotacreditosoli)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli = new TipoNotaCreditoSoliDetalleFormJInternalFrame(jDesktopPane,this.tiponotacreditosoliSessionBean.getConGuardarRelaciones(),this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoNotaCreditoSoli);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setVisible(false);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.tiponotacreditosoliLogic=this.tiponotacreditosoliLogic;
		
		this.cargarCombosFrameForeignKeyTipoNotaCreditoSoli("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoNotaCreditoSoli();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoNotaCreditoSoli();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoNotaCreditoSoli("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoNotaCreditoSoli();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoNotaCreditoSoli"));
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonModificarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"ModificarTipoNotaCreditoSoli"));

		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonModificarToolBarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoNotaCreditoSoli"));
					
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemModificarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoNotaCreditoSoli"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonActualizarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"ActualizarTipoNotaCreditoSoli"));
		
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonActualizarToolBarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoNotaCreditoSoli"));
						
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemActualizarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoNotaCreditoSoli"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonEliminarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"EliminarTipoNotaCreditoSoli"));
		
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonEliminarToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoNotaCreditoSoli"));
								
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemEliminarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoNotaCreditoSoli"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonCancelarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"CancelarTipoNotaCreditoSoli"));
		
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonCancelarToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoNotaCreditoSoli"));
					
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemCancelarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoNotaCreditoSoli"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemDetalleCerrarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoNotaCreditoSoli"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNotaCreditoSoli"));
		
		
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNotaCreditoSoli"));
		
		
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoNotaCreditoSoli"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonidTipoNotaCreditoSoliBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNotaCreditoSoliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtoncodigoTipoNotaCreditoSoliBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNotaCreditoSoliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonnombreTipoNotaCreditoSoliBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNotaCreditoSoliBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTabbedPaneRelacionesTipoNotaCreditoSoli.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoNotaCreditoSoli"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoNotaCreditoSoli"));
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoNotaCreditoSoli"));
		}
		
		this.jTableDatosTipoNotaCreditoSoli.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoNotaCreditoSoli"));
		
		this.jTableDatosTipoNotaCreditoSoli.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoNotaCreditoSoli"));
		
		this.jButtonNuevoTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"NuevoTipoNotaCreditoSoli"));
		
		this.jButtonDuplicarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"DuplicarTipoNotaCreditoSoli"));
		
		this.jButtonCopiarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"CopiarTipoNotaCreditoSoli"));
		
		this.jButtonVerFormTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"VerFormTipoNotaCreditoSoli"));
		
		
		this.jButtonNuevoToolBarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoNotaCreditoSoli"));
			
		this.jButtonDuplicarToolBarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoNotaCreditoSoli"));
			
		this.jMenuItemNuevoTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoNotaCreditoSoli"));
			
		this.jMenuItemDuplicarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoNotaCreditoSoli"));		
		
		
		this.jButtonNuevoRelacionesTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoNotaCreditoSoli"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoNotaCreditoSoli"));
			
		this.jMenuItemNuevoRelacionesTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoNotaCreditoSoli"));		
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonModificarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"ModificarTipoNotaCreditoSoli"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonModificarToolBarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoNotaCreditoSoli"));
			
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemModificarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoNotaCreditoSoli"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonActualizarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"ActualizarTipoNotaCreditoSoli"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonActualizarToolBarTipoNotaCreditoSoli.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoNotaCreditoSoli"));
				
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemActualizarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoNotaCreditoSoli"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonEliminarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"EliminarTipoNotaCreditoSoli"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonEliminarToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoNotaCreditoSoli"));
						
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemEliminarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoNotaCreditoSoli"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonCancelarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"CancelarTipoNotaCreditoSoli"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonCancelarToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoNotaCreditoSoli"));
			
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemCancelarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoNotaCreditoSoli"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoNotaCreditoSoli"));		
		
		
		this.jButtonCerrarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"CerrarTipoNotaCreditoSoli"));
		
		
		this.jButtonCerrarToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoNotaCreditoSoli"));
			
		this.jMenuItemCerrarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoNotaCreditoSoli"));
			
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jMenuItemDetalleCerrarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoNotaCreditoSoli"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoNotaCreditoSoli"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNotaCreditoSoli"));
		}
		
		this.jButtonCopiarToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoNotaCreditoSoli"));
			
		this.jButtonVerFormToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoNotaCreditoSoli"));
		
		this.jMenuItemGuardarCambiosTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoNotaCreditoSoli"));
			
		this.jMenuItemCopiarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoNotaCreditoSoli"));		
		
		this.jMenuItemVerFormTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoNotaCreditoSoli"));		
		
		
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoNotaCreditoSoli"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoNotaCreditoSoli"));
			
		this.jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoNotaCreditoSoli"));		
		
		
		
		this.jButtonRecargarInformacionTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoNotaCreditoSoli"));
					
		this.jButtonRecargarInformacionToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoNotaCreditoSoli"));
		
		this.jMenuItemRecargarInformacionTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoNotaCreditoSoli"));		
		
		
		
		this.jButtonAnterioresTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"AnterioresTipoNotaCreditoSoli"));
		
		
		this.jButtonAnterioresToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoNotaCreditoSoli"));
		
		this.jMenuItemAnterioresTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoNotaCreditoSoli"));		
		
		
		this.jButtonSiguientesTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"SiguientesTipoNotaCreditoSoli"));
		
		
		this.jButtonSiguientesToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoNotaCreditoSoli"));
			
		this.jMenuItemSiguientesTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoNotaCreditoSoli"));
			
		this.jMenuItemAbrirOrderByTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoNotaCreditoSoli"));
			
		this.jMenuItemMostrarOcultarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoNotaCreditoSoli"));
			
		this.jMenuItemDetalleAbrirOrderByTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoNotaCreditoSoli"));
			
		this.jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoNotaCreditoSoli"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoNotaCreditoSoli"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoNotaCreditoSoli"));
			
		this.jMenuItemNuevoGuardarCambiosTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoNotaCreditoSoli"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoNotaCreditoSoli"));

		this.jCheckBoxSeleccionadosTipoNotaCreditoSoli.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoNotaCreditoSoli"));
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoNotaCreditoSoli"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoNotaCreditoSoli"));
			
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoNotaCreditoSoli"));
					
		this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoNotaCreditoSoli"));
			
		this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoNotaCreditoSoli"));		
		
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonidTipoNotaCreditoSoliBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNotaCreditoSoliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtoncodigoTipoNotaCreditoSoliBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNotaCreditoSoliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonnombreTipoNotaCreditoSoliBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNotaCreditoSoliBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli!=null) {
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNotaCreditoSoli"));
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNotaCreditoSoli"));
				this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNotaCreditoSoli"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNotaCreditoSoli"));				
			//this.jButtonGenerarReporteDinamicoTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNotaCreditoSoli"));
			//this.jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNotaCreditoSoli"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoNotaCreditoSoli!=null) {
				this.jInternalFrameImportacionTipoNotaCreditoSoli.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoNotaCreditoSoli"));
				this.jInternalFrameImportacionTipoNotaCreditoSoli.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoNotaCreditoSoli"));
				this.jInternalFrameImportacionTipoNotaCreditoSoli.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoNotaCreditoSoli"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoNotaCreditoSoli"));
			
			this.jButtonAbrirOrderByToolBarTipoNotaCreditoSoli.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoNotaCreditoSoli"));			
			
			if(this.jInternalFrameOrderByTipoNotaCreditoSoli!=null) {
				this.jInternalFrameOrderByTipoNotaCreditoSoli.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoNotaCreditoSoli"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTabbedPaneRelacionesTipoNotaCreditoSoli.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoNotaCreditoSoli"));
		
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
            		closingInternalFrameTipoNotaCreditoSoli();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoNotaCreditoSoli = (JInternalFrameBase)event.getSource();
	            	
	            TipoNotaCreditoSoliBeanSwingJInternalFrame jInternalFrameParent=(TipoNotaCreditoSoliBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoNotaCreditoSoli.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoNotaCreditoSoliActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoNotaCreditoSoli.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoNotaCreditoSoliListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoNotaCreditoSoli.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoNotaCreditoSoli.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoNotaCreditoSoli";
		inputMap = this.jButtonNuevoTipoNotaCreditoSoli.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoNotaCreditoSoli.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoNotaCreditoSoli";
		inputMap = this.jButtonNuevoRelacionesTipoNotaCreditoSoli.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoNotaCreditoSoli.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoNotaCreditoSoliActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoNotaCreditoSoli";
		inputMap = this.jButtonModificarTipoNotaCreditoSoli.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoNotaCreditoSoli.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoNotaCreditoSoliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoNotaCreditoSoli";
		inputMap = this.jButtonActualizarTipoNotaCreditoSoli.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoNotaCreditoSoli.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoNotaCreditoSoliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoNotaCreditoSoli";
		inputMap = this.jButtonEliminarTipoNotaCreditoSoli.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoNotaCreditoSoli.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoNotaCreditoSoliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoNotaCreditoSoli";
		inputMap = this.jButtonCancelarTipoNotaCreditoSoli.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoNotaCreditoSoli.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoNotaCreditoSoliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoNotaCreditoSoli";
		inputMap = this.jButtonCerrarTipoNotaCreditoSoli.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoNotaCreditoSoli.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoNotaCreditoSoliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoNotaCreditoSoli";
		inputMap = this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosTipoNotaCreditoSoli.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonGuardarCambiosTipoNotaCreditoSoli.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoNotaCreditoSoliItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoNotaCreditoSoli.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoNotaCreditoSoliActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoNotaCreditoSoliActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoNotaCreditoSoliActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonidTipoNotaCreditoSoliBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNotaCreditoSoliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtoncodigoTipoNotaCreditoSoliBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNotaCreditoSoliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jButtonnombreTipoNotaCreditoSoliBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNotaCreditoSoliBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoNotaCreditoSoli.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoNotaCreditoSoliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoNotaCreditoSoliActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoNotaCreditoSoli(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
					tiponotacreditosoliAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolis) {
					tiponotacreditosoliAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoNotaCreditoSoliItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
						tiponotacreditosoliAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolis) {
						tiponotacreditosoliAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoNotaCreditoSoli.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoNotaCreditoSoli.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoNotaCreditoSoli,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoNotaCreditoSoliItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoNotaCreditoSoli.getSelectedRows();
			
			TipoNotaCreditoSoli tiponotacreditosoliLocal=new TipoNotaCreditoSoli();
			
			//this.seleccionarTodosTipoNotaCreditoSoli(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponotacreditosoliLocal =(TipoNotaCreditoSoli) this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis().toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiponotacreditosoliLocal =(TipoNotaCreditoSoli) this.tiponotacreditosolis.toArray()[this.jTableDatosTipoNotaCreditoSoli.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiponotacreditosoliLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
						tiponotacreditosoliAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolis) {
						tiponotacreditosoliAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoNotaCreditoSoli.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoNotaCreditoSoli.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoNotaCreditoSoli,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoNotaCreditoSoliItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoNotaCreditoSoliParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoNotaCreditoSoliActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
				
						if(sTipoSeleccionar.equals(TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiponotacreditosoliAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiponotacreditosoliAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolis) {
					
						if(sTipoSeleccionar.equals(TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiponotacreditosoliAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiponotacreditosoliAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoNotaCreditoSoliActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoNotaCreditoSoli=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoNotaCreditoSoli.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoNotaCreditoSoli) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoNotaCreditoSoli(conSplash);
				
					this.generarReporteTipoNotaCreditoSolisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoNotaCreditoSolisSeleccionados();
				//this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoNotaCreditoSolisSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoNotaCreditoSolisSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoNotaCreditoSoli();
				
				this.exportarTipoNotaCreditoSolisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoNotaCreditoSolis();
				//this.importarTipoNotaCreditoSolis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoNotaCreditoSoli();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoNotaCreditoSolisSeleccionados();
				//this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Solicitud Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoNotaCreditoSoli();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoNotaCreditoSoli)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoNotaCreditoSoli(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Solicitud Nota Credito",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoNotaCreditoSoliBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoNotaCreditoSoli) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoNotaCreditoSoli(conSplash);
					
						//this.actualizarParametrosGeneralTipoNotaCreditoSoli();
						
						this.generarReporteProcesoAccionTipoNotaCreditoSolisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Solicitud Nota CreditoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Solicitud Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoNotaCreditoSoli();
				
						this.actualizarParametrosGeneralTipoNotaCreditoSoli();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiponotacreditosoliReturnGeneral=tiponotacreditosoliLogic.procesarAccionTipoNotaCreditoSolisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis(),this.tiponotacreditosoliParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoNotaCreditoSoliReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoNotaCreditoSoli();
					
					TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoNotaCreditoSoliReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoNotaCreditoSoli(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoNotaCreditoSoliActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoNotaCreditoSoli();
			
			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();		
			TipoNotaCreditoSoli tiponotacreditosoli=new TipoNotaCreditoSoli();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoNotaCreditoSoli.getSelectedItem();
			
			
			
			
			tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiponotacreditosolisSeleccionados.size()==1) {
				for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolisSeleccionados) {
					tiponotacreditosoli=tiponotacreditosoliAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Solicitud Nota Credito")) {
					jButtonNotaCreditoSoliActionPerformed(null,rowIndex,true,false,tiponotacreditosoli);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoNotaCreditoSoli();
			
      		//this.finishProcessTipoNotaCreditoSoli(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoNotaCreditoSoliReturnGeneral() throws Exception {
		if(this.tiponotacreditosoliReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiponotacreditosoliReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiponotacreditosoliReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiponotacreditosoliReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiponotacreditosoliReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiponotacreditosoliReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
		}
		
		if(this.tiponotacreditosoliReturnGeneral.getConRetornoLista() || this.tiponotacreditosoliReturnGeneral.getConRetornoObjeto()) {
			if(this.tiponotacreditosoliReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiponotacreditosoliLogic.setTipoNotaCreditoSolis(this.tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSolis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiponotacreditosoliReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiponotacreditosoliLogic.setTipoNotaCreditoSoli(this.tiponotacreditosoliReturnGeneral.getTipoNotaCreditoSoli());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoNotaCreditoSoli(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoNotaCreditoSoli() throws Exception {
		
		
	}
	
	public ArrayList<TipoNotaCreditoSoli> getTipoNotaCreditoSolisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoNotaCreditoSoli) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosoliLogic.getTipoNotaCreditoSolis()) {
					if(tiponotacreditosoliAux.getIsSelected()) {
						tiponotacreditosolisSeleccionados.add(tiponotacreditosoliAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNotaCreditoSoli tiponotacreditosoliAux:this.tiponotacreditosolis) {
					if(tiponotacreditosoliAux.getIsSelected()) {
						tiponotacreditosolisSeleccionados.add(tiponotacreditosoliAux);				
					}
				}
			}
			
			if(tiponotacreditosolisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiponotacreditosolisSeleccionados.addAll(this.tiponotacreditosoliLogic.getTipoNotaCreditoSolis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiponotacreditosolisSeleccionados.addAll(this.tiponotacreditosolis);				
					}
				}
			}
		} else {
			tiponotacreditosolisSeleccionados.add(this.tiponotacreditosoli);
		}
		
		return tiponotacreditosolisSeleccionados;
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
	
	public void generarReporteTipoNotaCreditoSolisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoNotaCreditoSolisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoNotaCreditoSolisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoNotaCreditoSolisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoNotaCreditoSolisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoNotaCreditoSolisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Solicitud Nota Credito",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoNotaCreditoSolisSeleccionados() throws Exception {
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();		
		
		tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoNotaCreditoSolis("Todos",tiponotacreditosolisSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoNotaCreditoSolisSeleccionados() throws Exception {
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();		
		
		tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoNotaCreditoSolis("Todos",tiponotacreditosolisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoNotaCreditoSolisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();
		
		tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoNotaCreditoSolis("Todos",tiponotacreditosolisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoNotaCreditoSolisSeleccionados() throws Exception {
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoNotaCreditoSoli();
		
		
		tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoNotaCreditoSoli();
		
		
		//this.generarReporteTipoNotaCreditoSolis("Todos",tiponotacreditosolisSeleccionados ,tiponotacreditosoliImplementable,tiponotacreditosoliImplementableHome);
	}
	
	public void mostrarImportacionTipoNotaCreditoSolis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoNotaCreditoSoli();
		
		this.abrirFrameImportacionTipoNotaCreditoSoli();		
		
			
		//this.generarReporteTipoNotaCreditoSolis("Todos",tiponotacreditosolisSeleccionados ,tiponotacreditosoliImplementable,tiponotacreditosoliImplementableHome);
	}
	
	public void importarTipoNotaCreditoSolis() throws Exception {		
	
	}
	
	public void exportarTipoNotaCreditoSolisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoNotaCreditoSolisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoNotaCreditoSolisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoNotaCreditoSolisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Solicitud Nota Credito",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoNotaCreditoSolisSeleccionados() throws Exception {
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();		
		
		tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponotacreditosoli."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoNotaCreditoSoli(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoNotaCreditoSoli(tiponotacreditosoliAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiponotacreditosoliAux.setsDetalleGeneralEntityReporte(tiponotacreditosoliAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Solicitud Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoNotaCreditoSoli(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoNotaCreditoSoliConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNotaCreditoSoliConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiponotacreditosoli.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponotacreditosoli.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponotacreditosoli.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponotacreditosoli.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoNotaCreditoSolisSeleccionados() throws Exception {
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();		
		
		tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponotacreditosoli.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoNotaCreditoSolis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoNotaCreditoSoli(row);				
				iRow++;
			}				
			
			for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoNotaCreditoSoli(tiponotacreditosoliAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Solicitud Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoNotaCreditoSolisSeleccionados() throws Exception {
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();		
		
		tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponotacreditosoli.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiponotacreditosolis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiponotacreditosoli");
			//elementRoot.appendChild(element);
		
			for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolisSeleccionados) {
				element = document.createElement("tiponotacreditosoli");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoNotaCreditoSoli(tiponotacreditosoliAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Solicitud Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoNotaCreditoSoli(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNotaCreditoSoliConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNotaCreditoSoliConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiponotacreditosoli.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponotacreditosoli.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponotacreditosoli.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoNotaCreditoSoli(TipoNotaCreditoSoli tiponotacreditosoli,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoNotaCreditoSoliConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiponotacreditosoli.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoNotaCreditoSoliConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiponotacreditosoli.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoNotaCreditoSoliConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiponotacreditosoli.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoNotaCreditoSoliConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiponotacreditosoli.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoNotaCreditoSolisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados=new ArrayList<TipoNotaCreditoSoli>();
		
		tiponotacreditosolisSeleccionados=this.getTipoNotaCreditoSolisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoNotaCreditoSoli(tiponotacreditosolisSeleccionados);
		
		this.generarReporteTipoNotaCreditoSolis("Todos",tiponotacreditosolisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoNotaCreditoSoli(ArrayList<TipoNotaCreditoSoli> tiponotacreditosolisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoNotaCreditoSoli tiponotacreditosoliAux:tiponotacreditosolisSeleccionados) {
				tiponotacreditosoliAux.setsDetalleGeneralEntityReporte(tiponotacreditosoliAux.toString());
			
				if(sTipoSeleccionar.equals(TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiponotacreditosoliAux.setsDescripcionGeneralEntityReporte1(tiponotacreditosoliAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiponotacreditosoliAux.setsDescripcionGeneralEntityReporte1(tiponotacreditosoliAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNotaCreditoSoliConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoNotaCreditoSoli(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=true;
				this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=true;
			}
			
			this.isVisibilidadCeldaModificarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaModificarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaModificarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaModificarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaModificarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaModificarTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaCancelarTipoNotaCreditoSoli=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNotaCreditoSoli=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=true;
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=true;
		} else {
			this.actualizarEstadoPanelsTipoNotaCreditoSoli(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoNotaCreditoSoli=false;
			//this.isVisibilidadCeldaVerFormTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaDuplicarTipoNotaCreditoSoli=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			if(!tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=false;												
			}
			
			this.jButtonCerrarTipoNotaCreditoSoli.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoNotaCreditoSoli=false;
		}
		
		if(!this.permiteMantenimiento(this.tiponotacreditosoli)) {
			this.isVisibilidadCeldaActualizarTipoNotaCreditoSoli=false;
			this.isVisibilidadCeldaEliminarTipoNotaCreditoSoli=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoNotaCreditoSoli() {
		this.isVisibilidadCeldaNuevoTipoNotaCreditoSoli=false;
		this.isVisibilidadCeldaGuardarCambiosTipoNotaCreditoSoli=false;
	}
	
	public void actualizarEstadoPanelsTipoNotaCreditoSoli(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosTipoNotaCreditoSoli.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNotaCreditoSoli!=null) {
				this.jPanelPaginacionTipoNotaCreditoSoli.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNotaCreditoSoli!=null) {
				this.jPanelParametrosReportesTipoNotaCreditoSoli.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosTipoNotaCreditoSoli.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNotaCreditoSoli!=null) {
				this.jPanelPaginacionTipoNotaCreditoSoli.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNotaCreditoSoli!=null) {
				this.jPanelParametrosReportesTipoNotaCreditoSoli.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosTipoNotaCreditoSoli.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNotaCreditoSoli!=null) {
				this.jPanelPaginacionTipoNotaCreditoSoli.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNotaCreditoSoli!=null) {
				this.jPanelParametrosReportesTipoNotaCreditoSoli.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosTipoNotaCreditoSoli.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNotaCreditoSoli!=null) {
				this.jPanelPaginacionTipoNotaCreditoSoli.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNotaCreditoSoli!=null) {
				this.jPanelParametrosReportesTipoNotaCreditoSoli.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosTipoNotaCreditoSoli.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNotaCreditoSoli!=null) {
				this.jPanelPaginacionTipoNotaCreditoSoli.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNotaCreditoSoli!=null) {
				this.jPanelParametrosReportesTipoNotaCreditoSoli.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosTipoNotaCreditoSoli.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNotaCreditoSoli!=null) {
				this.jPanelPaginacionTipoNotaCreditoSoli.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNotaCreditoSoli!=null) {
				this.jPanelParametrosReportesTipoNotaCreditoSoli.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoNotaCreditoSoli!=null) {
				this.jScrollPanelDatosTipoNotaCreditoSoli.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNotaCreditoSoli!=null) {
				this.jPanelPaginacionTipoNotaCreditoSoli.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNotaCreditoSoli!=null) {
				this.jPanelParametrosReportesTipoNotaCreditoSoli.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoNotaCreditoSoliParaNotaCreditoSolis() throws Exception {
		Boolean isPaginaPopupNotaCreditoSoli=false;

		try {

			if(this.tiponotacreditosoliSessionBean==null) {
				this.tiponotacreditosoliSessionBean=new TipoNotaCreditoSoliSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliSessionBean==null) {
				this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
			}

			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliSessionBean.setsPathNavegacionActual(tiponotacreditosoliSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupNotaCreditoSoli=this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoSoli(true);
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoSoli(TipoNotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionTipoNotaCreditoSoli(true);
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli.notacreditosoliSessionBean.setlidTipoNotaCreditoSoliActual(this.idTipoNotaCreditoSoliActual);

			tiponotacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoNotaCreditoSoli(true);
			tiponotacreditosoliSessionBean.setlIdTipoNotaCreditoSoliActualForeignKey(this.idTipoNotaCreditoSoliActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoNotaCreditoSoliSessionBean tiponotacreditosoliSessionBean=new TipoNotaCreditoSoliSessionBean();
		
		if(this.tiponotacreditosoliSessionBean==null) {
			this.tiponotacreditosoliSessionBean=new TipoNotaCreditoSoliSessionBean();
		}
		
		this.tiponotacreditosoliSessionBean.setsUltimaBusquedaTipoNotaCreditoSoli(this.getsAccionBusqueda());
		this.tiponotacreditosoliSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiponotacreditosoliSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoNotaCreditoSoliSessionBean tiponotacreditosoliSessionBean=new TipoNotaCreditoSoliSessionBean();
		
		if(this.tiponotacreditosoliSessionBean==null) {
			this.tiponotacreditosoliSessionBean=new TipoNotaCreditoSoliSessionBean();
		}
		
		if(this.tiponotacreditosoliSessionBean.getsUltimaBusquedaTipoNotaCreditoSoli()!=null&&!this.tiponotacreditosoliSessionBean.getsUltimaBusquedaTipoNotaCreditoSoli().equals("")) {
			this.setsAccionBusqueda(tiponotacreditosoliSessionBean.getsUltimaBusquedaTipoNotaCreditoSoli());
			this.setiNumeroPaginacion(tiponotacreditosoliSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiponotacreditosoliSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tiponotacreditosoliSessionBean.setsUltimaBusquedaTipoNotaCreditoSoli("");
		this.tiponotacreditosoliSessionBean.setiNumeroPaginacion(TipoNotaCreditoSoliConstantesFunciones.INUMEROPAGINACION);
		this.tiponotacreditosoliSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoNotaCreditoSoli(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoNotaCreditoSoli() {
		this.updateBorderResaltarBusquedasFormularioTipoNotaCreditoSoli();
		this.updateVisibilidadBusquedasFormularioTipoNotaCreditoSoli();
		this.updateHabilitarBusquedasFormularioTipoNotaCreditoSoli();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoNotaCreditoSoli() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoNotaCreditoSoli() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoNotaCreditoSoli() {
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
	
	public void updateControlesFormularioTipoNotaCreditoSoli() throws Exception {

		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoNotaCreditoSoli();
		this.updateVisibilidadResaltarControlesFormularioTipoNotaCreditoSoli();
		this.updateHabilitarResaltarControlesFormularioTipoNotaCreditoSoli();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoNotaCreditoSoli() throws Exception {
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiponotacreditosoliConstantesFunciones.resaltaridTipoNotaCreditoSoli!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.setBorder(this.tiponotacreditosoliConstantesFunciones.resaltaridTipoNotaCreditoSoli);}
		if(this.tiponotacreditosoliConstantesFunciones.resaltarcodigoTipoNotaCreditoSoli!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldcodigoTipoNotaCreditoSoli.setBorder(this.tiponotacreditosoliConstantesFunciones.resaltarcodigoTipoNotaCreditoSoli);}
		if(this.tiponotacreditosoliConstantesFunciones.resaltarnombreTipoNotaCreditoSoli!=null && this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextAreanombreTipoNotaCreditoSoli.setBorder(this.tiponotacreditosoliConstantesFunciones.resaltarnombreTipoNotaCreditoSoli);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoNotaCreditoSoli() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
	
		//this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.setVisible(this.tiponotacreditosoliConstantesFunciones.mostraridTipoNotaCreditoSoli);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jPanelidTipoNotaCreditoSoli.setVisible(this.tiponotacreditosoliConstantesFunciones.mostraridTipoNotaCreditoSoli);
		//this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldcodigoTipoNotaCreditoSoli.setVisible(this.tiponotacreditosoliConstantesFunciones.mostrarcodigoTipoNotaCreditoSoli);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jPanelcodigoTipoNotaCreditoSoli.setVisible(this.tiponotacreditosoliConstantesFunciones.mostrarcodigoTipoNotaCreditoSoli);
		//this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextAreanombreTipoNotaCreditoSoli.setVisible(this.tiponotacreditosoliConstantesFunciones.mostrarnombreTipoNotaCreditoSoli);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jPanelnombreTipoNotaCreditoSoli.setVisible(this.tiponotacreditosoliConstantesFunciones.mostrarnombreTipoNotaCreditoSoli);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoNotaCreditoSoli() throws Exception {
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoNotaCreditoSoli!=null) {
	
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldidTipoNotaCreditoSoli.setEnabled(this.tiponotacreditosoliConstantesFunciones.activaridTipoNotaCreditoSoli);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextFieldcodigoTipoNotaCreditoSoli.setEnabled(this.tiponotacreditosoliConstantesFunciones.activarcodigoTipoNotaCreditoSoli);
		this.jInternalFrameDetalleFormTipoNotaCreditoSoli.jTextAreanombreTipoNotaCreditoSoli.setEnabled(this.tiponotacreditosoliConstantesFunciones.activarnombreTipoNotaCreditoSoli);
		}
	}
	
		
}