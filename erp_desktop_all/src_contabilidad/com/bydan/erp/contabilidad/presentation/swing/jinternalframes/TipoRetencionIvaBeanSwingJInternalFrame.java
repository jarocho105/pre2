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

import com.bydan.erp.contabilidad.util.TipoRetencionIvaConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoRetencionIvaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoRetencionIvaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoRetencionIvaBean;
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

import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoRetencionIvaBeanSwingJInternalFrame extends TipoRetencionIvaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRetencionIvaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRetencionIva> tiporetencionivaValidator = new ClassValidator<TipoRetencionIva>(TipoRetencionIva.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRetencionIva tiporetencioniva;	
	public TipoRetencionIva tiporetencionivaAux;
	public TipoRetencionIva tiporetencionivaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRetencionIva tiporetencionivaTotales;
	public Long idTipoRetencionIvaActual;
	public Long iIdNuevoTipoRetencionIva=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosTransaccionLocal=false;

	public Boolean getIsTienePermisosTransaccionLocal() {
		return isTienePermisosTransaccionLocal;
	}

	public void setIsTienePermisosTransaccionLocal(Boolean isTienePermisosTransaccionLocal) {
		this.isTienePermisosTransaccionLocal= isTienePermisosTransaccionLocal;
	}


	public Boolean isTienePermisosTarjetaCredito=false;

	public Boolean getIsTienePermisosTarjetaCredito() {
		return isTienePermisosTarjetaCredito;
	}

	public void setIsTienePermisosTarjetaCredito(Boolean isTienePermisosTarjetaCredito) {
		this.isTienePermisosTarjetaCredito= isTienePermisosTarjetaCredito;
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
	
	public Boolean isPermisoTodoTipoRetencionIva;
	public Boolean isPermisoNuevoTipoRetencionIva;
	public Boolean isPermisoActualizarTipoRetencionIva;
	public Boolean isPermisoActualizarOriginalTipoRetencionIva;
	public Boolean isPermisoEliminarTipoRetencionIva;
	public Boolean isPermisoGuardarCambiosTipoRetencionIva;
	public Boolean isPermisoConsultaTipoRetencionIva;
	public Boolean isPermisoBusquedaTipoRetencionIva;
	public Boolean isPermisoReporteTipoRetencionIva;
	public Boolean isPermisoPaginacionMedioTipoRetencionIva;
	public Boolean isPermisoPaginacionAltoTipoRetencionIva;
	public Boolean isPermisoPaginacionTodoTipoRetencionIva;
	public Boolean isPermisoCopiarTipoRetencionIva;
	public Boolean isPermisoVerFormTipoRetencionIva;
	public Boolean isPermisoDuplicarTipoRetencionIva;
	public Boolean isPermisoOrdenTipoRetencionIva;
	
	
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
	
	public TipoRetencionIvaParameterReturnGeneral tiporetencionivaReturnGeneral;
	public TipoRetencionIvaParameterReturnGeneral tiporetencionivaParameterGeneral;
	
	

	public TransaccionLocalLogic transaccionlocalLogic=null;

	public TransaccionLocalLogic getTransaccionLocalLogic() {
		return transaccionlocalLogic;
	}

	public void setTransaccionLocalLogic(TransaccionLocalLogic transaccionlocalLogic) {
		this.transaccionlocalLogic = transaccionlocalLogic;
	}


	public TarjetaCreditoLogic tarjetacreditoLogic=null;

	public TarjetaCreditoLogic getTarjetaCreditoLogic() {
		return tarjetacreditoLogic;
	}

	public void setTarjetaCreditoLogic(TarjetaCreditoLogic tarjetacreditoLogic) {
		this.tarjetacreditoLogic = tarjetacreditoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRetencionIva=false;
	public Boolean esParaAccionDesdeFormularioTipoRetencionIva=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoRetencionIvaSessionBeanAdditional tiporetencionivaSessionBeanAdditional=null;
	
	public TipoRetencionIvaSessionBeanAdditional getTipoRetencionIvaSessionBeanAdditional() {
		return this.tiporetencionivaSessionBeanAdditional;
	}
	
	public void setTipoRetencionIvaSessionBeanAdditional(TipoRetencionIvaSessionBeanAdditional tiporetencionivaSessionBeanAdditional) {
		try {
			this.tiporetencionivaSessionBeanAdditional=tiporetencionivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoRetencionIvaBeanSwingJInternalFrameAdditional tiporetencionivaBeanSwingJInternalFrameAdditional=null;
	//public class TipoRetencionIvaBeanSwingJInternalFrame
	
	public TipoRetencionIvaBeanSwingJInternalFrameAdditional getTipoRetencionIvaBeanSwingJInternalFrameAdditional() {
		return this.tiporetencionivaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoRetencionIvaBeanSwingJInternalFrameAdditional(TipoRetencionIvaBeanSwingJInternalFrameAdditional tiporetencionivaBeanSwingJInternalFrameAdditional) {
		try {
			this.tiporetencionivaBeanSwingJInternalFrameAdditional=tiporetencionivaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRetencionIvaLogic tiporetencionivaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRetencionIva tiporetencionivaBean;
	public TipoRetencionIvaConstantesFunciones tiporetencionivaConstantesFunciones;
	//public TipoRetencionIvaParameterReturnGeneral tiporetencionivaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoRetencionIva> tiporetencionivas;	
	//public List<TipoRetencionIva> tiporetencionivasEliminados;
	//public List<TipoRetencionIva> tiporetencionivasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRetencionIva=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRetencionIva=true;
	public Boolean isVisibilidadCeldaCopiarTipoRetencionIva=true;
	public Boolean isVisibilidadCeldaVerFormTipoRetencionIva=true;
	public Boolean isVisibilidadCeldaOrdenTipoRetencionIva=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=false;
	public Boolean isVisibilidadCeldaModificarTipoRetencionIva=false;
	public Boolean isVisibilidadCeldaActualizarTipoRetencionIva=false;
	public Boolean isVisibilidadCeldaEliminarTipoRetencionIva=false;
	public Boolean isVisibilidadCeldaCancelarTipoRetencionIva=false;
	public Boolean isVisibilidadCeldaGuardarTipoRetencionIva=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRetencionIva=false;	
	
	
	
	public Long getiIdNuevoTipoRetencionIva() {
		return this.iIdNuevoTipoRetencionIva;
	}

	public void setiIdNuevoTipoRetencionIva(Long iIdNuevoTipoRetencionIva) {
		this.iIdNuevoTipoRetencionIva = iIdNuevoTipoRetencionIva;
	}
	
	public Long getidTipoRetencionIvaActual() {
		return this.idTipoRetencionIvaActual;
	}

	public void setidTipoRetencionIvaActual(Long idTipoRetencionIvaActual) {
		this.idTipoRetencionIvaActual = idTipoRetencionIvaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRetencionIva gettiporetencioniva() {
		return this.tiporetencioniva;
	}

	public void settiporetencioniva(TipoRetencionIva tiporetencioniva) {
		this.tiporetencioniva = tiporetencioniva;
	}
	
	public TipoRetencionIva gettiporetencionivaAux() {
		return this.tiporetencionivaAux;
	}

	public void settiporetencionivaAux(TipoRetencionIva tiporetencionivaAux) {
		this.tiporetencionivaAux = tiporetencionivaAux;
	}				
	
	public TipoRetencionIva gettiporetencionivaAnterior() {
		return this.tiporetencionivaAnterior;
	}

	public void settiporetencionivaAnterior(TipoRetencionIva tiporetencionivaAnterior) {
		this.tiporetencionivaAnterior = tiporetencionivaAnterior;
	}	
	
	public TipoRetencionIva gettiporetencionivaTotales() {
		return this.tiporetencionivaTotales;
	}

	public void settiporetencionivaTotales(TipoRetencionIva tiporetencionivaTotales) {
		this.tiporetencionivaTotales = tiporetencionivaTotales;
	}	
	
	public TipoRetencionIva gettiporetencionivaBean() {
		return this.tiporetencionivaBean;
	}

	public void settiporetencionivaBean(TipoRetencionIva tiporetencionivaBean) {
		this.tiporetencionivaBean = tiporetencionivaBean;
	}	
	
	public TipoRetencionIvaParameterReturnGeneral gettiporetencionivaReturnGeneral() {
		return this.tiporetencionivaReturnGeneral;
	}

	public void settiporetencionivaReturnGeneral(TipoRetencionIvaParameterReturnGeneral tiporetencionivaReturnGeneral) {
		this.tiporetencionivaReturnGeneral = tiporetencionivaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoRetencionIvaLogic getTipoRetencionIvaLogic()	{		
		return tiporetencionivaLogic;
	}

	public void setTipoRetencionIvaLogic(TipoRetencionIvaLogic tiporetencionivaLogic) {
		this.tiporetencionivaLogic = tiporetencionivaLogic;
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
	
	public Boolean getIsEsNuevoTipoRetencionIva() {
		return isEsNuevoTipoRetencionIva;
	}

	public void setIsEsNuevoTipoRetencionIva(Boolean isEsNuevoTipoRetencionIva) {
		this.isEsNuevoTipoRetencionIva = isEsNuevoTipoRetencionIva;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRetencionIva() {
		return esParaAccionDesdeFormularioTipoRetencionIva;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRetencionIva(Boolean esParaAccionDesdeFormularioTipoRetencionIva) {
		this.esParaAccionDesdeFormularioTipoRetencionIva = esParaAccionDesdeFormularioTipoRetencionIva;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoRetencionIva() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRetencionIvaConstantesFunciones.refrescarForeignKeysDescripcionesTipoRetencionIva(this.tiporetencionivaLogic.getTipoRetencionIvas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRetencionIvaConstantesFunciones.refrescarForeignKeysDescripcionesTipoRetencionIva(this.tiporetencionivas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporetencionivaLogic.setTipoRetencionIvas(this.tiporetencionivas);
			tiporetencionivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRetencionIvaParameterReturnGeneral getTipoRetencionIvaParameterGeneral() {
		return this.tiporetencionivaParameterGeneral;
	}
	
	public void setTipoRetencionIvaParameterGeneral(TipoRetencionIvaParameterReturnGeneral tiporetencionivaParameterGeneral) {
		this.tiporetencionivaParameterGeneral = tiporetencionivaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRetencionIva() {
		return isPermisoTodoTipoRetencionIva;
	}

	public void setIsPermisoTodoTipoRetencionIva(Boolean isPermisoTodoTipoRetencionIva) {
		this.isPermisoTodoTipoRetencionIva = isPermisoTodoTipoRetencionIva;
	}

	public Boolean getIsPermisoNuevoTipoRetencionIva() {
		return isPermisoNuevoTipoRetencionIva;
	}

	public void setIsPermisoNuevoTipoRetencionIva(Boolean isPermisoNuevoTipoRetencionIva) {
		this.isPermisoNuevoTipoRetencionIva = isPermisoNuevoTipoRetencionIva;
	}

	public Boolean getIsPermisoActualizarTipoRetencionIva() {
		return isPermisoActualizarTipoRetencionIva;
	}

	public void setIsPermisoActualizarTipoRetencionIva(Boolean isPermisoActualizarTipoRetencionIva) {
		this.isPermisoActualizarTipoRetencionIva = isPermisoActualizarTipoRetencionIva;
	}

	public Boolean getIsPermisoEliminarTipoRetencionIva() {
		return isPermisoEliminarTipoRetencionIva;
	}

	public void setIsPermisoEliminarTipoRetencionIva(Boolean isPermisoEliminarTipoRetencionIva) {
		this.isPermisoEliminarTipoRetencionIva = isPermisoEliminarTipoRetencionIva;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRetencionIva() {
		return isPermisoGuardarCambiosTipoRetencionIva;
	}

	public void setIsPermisoGuardarCambiosTipoRetencionIva(Boolean isPermisoGuardarCambiosTipoRetencionIva) {
		this.isPermisoGuardarCambiosTipoRetencionIva = isPermisoGuardarCambiosTipoRetencionIva;
	}
	
	public Boolean getIsPermisoConsultaTipoRetencionIva() {
		return isPermisoConsultaTipoRetencionIva;
	}

	public void setIsPermisoConsultaTipoRetencionIva(Boolean isPermisoConsultaTipoRetencionIva) {
		this.isPermisoConsultaTipoRetencionIva = isPermisoConsultaTipoRetencionIva;
	}

	public Boolean getIsPermisoBusquedaTipoRetencionIva() {
		return isPermisoBusquedaTipoRetencionIva;
	}

	public void setIsPermisoBusquedaTipoRetencionIva(Boolean isPermisoBusquedaTipoRetencionIva) {
		this.isPermisoBusquedaTipoRetencionIva = isPermisoBusquedaTipoRetencionIva;
	}

	public Boolean getIsPermisoReporteTipoRetencionIva() {
		return isPermisoReporteTipoRetencionIva;
	}

	public void setIsPermisoReporteTipoRetencionIva(Boolean isPermisoReporteTipoRetencionIva) {
		this.isPermisoReporteTipoRetencionIva = isPermisoReporteTipoRetencionIva;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRetencionIva() {
		return isPermisoPaginacionMedioTipoRetencionIva;
	}

	public void setIsPermisoPaginacionMedioTipoRetencionIva(Boolean isPermisoPaginacionMedioTipoRetencionIva) {
		this.isPermisoPaginacionMedioTipoRetencionIva = isPermisoPaginacionMedioTipoRetencionIva;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRetencionIva() {
		return isPermisoPaginacionTodoTipoRetencionIva;
	}

	public void setIsPermisoPaginacionTodoTipoRetencionIva(Boolean isPermisoPaginacionTodoTipoRetencionIva) {
		this.isPermisoPaginacionTodoTipoRetencionIva = isPermisoPaginacionTodoTipoRetencionIva;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRetencionIva() {
		return isPermisoPaginacionAltoTipoRetencionIva;
	}

	public void setIsPermisoPaginacionAltoTipoRetencionIva(Boolean isPermisoPaginacionAltoTipoRetencionIva) {
		this.isPermisoPaginacionAltoTipoRetencionIva = isPermisoPaginacionAltoTipoRetencionIva;
	}
	
	public Boolean getIsPermisoCopiarTipoRetencionIva() {
		return isPermisoCopiarTipoRetencionIva;
	}

	public void setIsPermisoCopiarTipoRetencionIva(Boolean isPermisoCopiarTipoRetencionIva) {
		this.isPermisoCopiarTipoRetencionIva = isPermisoCopiarTipoRetencionIva;
	}
	
	public Boolean getIsPermisoVerFormTipoRetencionIva() {
		return isPermisoVerFormTipoRetencionIva;
	}

	public void setIsPermisoVerFormTipoRetencionIva(Boolean isPermisoVerFormTipoRetencionIva) {
		this.isPermisoVerFormTipoRetencionIva = isPermisoVerFormTipoRetencionIva;
	}
	
	public Boolean getIsPermisoDuplicarTipoRetencionIva() {
		return isPermisoDuplicarTipoRetencionIva;
	}

	public void setIsPermisoDuplicarTipoRetencionIva(Boolean isPermisoDuplicarTipoRetencionIva) {
		this.isPermisoDuplicarTipoRetencionIva = isPermisoDuplicarTipoRetencionIva;
	}
	
	public Boolean getIsPermisoOrdenTipoRetencionIva() {
		return isPermisoOrdenTipoRetencionIva;
	}

	public void setIsPermisoOrdenTipoRetencionIva(Boolean isPermisoOrdenTipoRetencionIva) {
		this.isPermisoOrdenTipoRetencionIva = isPermisoOrdenTipoRetencionIva;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRetencionIva() {
		return isVisibilidadCeldaNuevoTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaNuevoTipoRetencionIva(Boolean isVisibilidadCeldaNuevoTipoRetencionIva) {
		this.isVisibilidadCeldaNuevoTipoRetencionIva = isVisibilidadCeldaNuevoTipoRetencionIva;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRetencionIva() {
		return isVisibilidadCeldaDuplicarTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRetencionIva(Boolean isVisibilidadCeldaDuplicarTipoRetencionIva) {
		this.isVisibilidadCeldaDuplicarTipoRetencionIva = isVisibilidadCeldaDuplicarTipoRetencionIva;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRetencionIva() {
		return isVisibilidadCeldaCopiarTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaCopiarTipoRetencionIva(Boolean isVisibilidadCeldaCopiarTipoRetencionIva) {
		this.isVisibilidadCeldaCopiarTipoRetencionIva = isVisibilidadCeldaCopiarTipoRetencionIva;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRetencionIva() {
		return isVisibilidadCeldaVerFormTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaVerFormTipoRetencionIva(Boolean isVisibilidadCeldaVerFormTipoRetencionIva) {
		this.isVisibilidadCeldaVerFormTipoRetencionIva = isVisibilidadCeldaVerFormTipoRetencionIva;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRetencionIva() {
		return isVisibilidadCeldaOrdenTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaOrdenTipoRetencionIva(Boolean isVisibilidadCeldaOrdenTipoRetencionIva) {
		this.isVisibilidadCeldaOrdenTipoRetencionIva = isVisibilidadCeldaOrdenTipoRetencionIva;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRetencionIva() {
		return isVisibilidadCeldaNuevoRelacionesTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRetencionIva(Boolean isVisibilidadCeldaNuevoRelacionesTipoRetencionIva) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva = isVisibilidadCeldaNuevoRelacionesTipoRetencionIva;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRetencionIva() {
		return isVisibilidadCeldaModificarTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaModificarTipoRetencionIva(Boolean isVisibilidadCeldaModificarTipoRetencionIva) {
		this.isVisibilidadCeldaModificarTipoRetencionIva = isVisibilidadCeldaModificarTipoRetencionIva;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRetencionIva() {
		return isVisibilidadCeldaActualizarTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaActualizarTipoRetencionIva(Boolean isVisibilidadCeldaActualizarTipoRetencionIva) {
		this.isVisibilidadCeldaActualizarTipoRetencionIva = isVisibilidadCeldaActualizarTipoRetencionIva;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRetencionIva() {
		return isVisibilidadCeldaEliminarTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaEliminarTipoRetencionIva(Boolean isVisibilidadCeldaEliminarTipoRetencionIva) {
		this.isVisibilidadCeldaEliminarTipoRetencionIva = isVisibilidadCeldaEliminarTipoRetencionIva;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRetencionIva() {
		return isVisibilidadCeldaCancelarTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaCancelarTipoRetencionIva(Boolean isVisibilidadCeldaCancelarTipoRetencionIva) {
		this.isVisibilidadCeldaCancelarTipoRetencionIva = isVisibilidadCeldaCancelarTipoRetencionIva;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRetencionIva() {
		return isVisibilidadCeldaGuardarTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaGuardarTipoRetencionIva(Boolean isVisibilidadCeldaGuardarTipoRetencionIva) {
		this.isVisibilidadCeldaGuardarTipoRetencionIva = isVisibilidadCeldaGuardarTipoRetencionIva;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRetencionIva() {
		return isVisibilidadCeldaGuardarCambiosTipoRetencionIva;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRetencionIva(Boolean isVisibilidadCeldaGuardarCambiosTipoRetencionIva) {
		this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva = isVisibilidadCeldaGuardarCambiosTipoRetencionIva;
	}
		
	public TipoRetencionIvaSessionBean gettiporetencionivaSessionBean() {
		return this.tiporetencionivaSessionBean;
	}
	
	public void settiporetencionivaSessionBean(TipoRetencionIvaSessionBean tiporetencionivaSessionBean) {
		this.tiporetencionivaSessionBean=tiporetencionivaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(TipoRetencionIva tiporetencioniva)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoRetencionIva tiporetencioniva,TipoRetencionIva tiporetencionivaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRetencionIva(tiporetencioniva);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporetencionivaAux.setId(tiporetencioniva.getId());
		tiporetencionivaAux.setVersionRow(tiporetencioniva.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRetencionIva();
		
			int intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.tiporetencioniva,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporetencionivaValidator.getInvalidValues(this.tiporetencioniva);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporetencionivaLogic.setDatosCliente(datosCliente);
			tiporetencionivaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporetencionivaAux=new  TipoRetencionIva();
				
				tiporetencionivaAux.setIsNew(true);
				tiporetencionivaAux.setIsChanged(true);
				
				tiporetencionivaAux.setTipoRetencionIvaOriginal(this.tiporetencioniva);
				
				tiporetencionivaAux.setId(this.tiporetencioniva.getId());	
				tiporetencionivaAux.setVersionRow(this.tiporetencioniva.getVersionRow());	
				tiporetencionivaAux.setcodigo(this.tiporetencioniva.getcodigo());	
				tiporetencionivaAux.setnombre(this.tiporetencioniva.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporetencionivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporetencionivaAux,tiporetencionivaLogic.getTipoRetencionIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionivaAux,tiporetencionivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporetencionivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionivaLogic.saveTipoRetencionIvas();//WithConnection
						//tiporetencionivaLogic.getSetVersionRowTipoRetencionIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporetencioniva,tiporetencionivaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos().addAll(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos.addAll(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporetencionivaLogic.saveTipoRetencionIvaRelaciones(tiporetencionivaAux,this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());//WithConnection
								//tiporetencionivaLogic.getSetVersionRowTipoRetencionIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporetencioniva,tiporetencionivaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(new ArrayList<TarjetaCredito>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos= new ArrayList<TarjetaCredito>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporetencionivaAux.setTransaccionLocals(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporetencionivaAux.setTarjetaCreditos(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporetencionivaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporetencionivaAux,tiporetencionivaLogic.getTipoRetencionIvas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporetencionivaAux,tiporetencionivas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporetencioniva,tiporetencionivaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporetencionivaAux=new  TipoRetencionIva();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporetencionivaSessionBean.getEsGuardarRelacionado() && this.tiporetencioniva.getId()>=0)) {
						
					tiporetencionivaAux.setIsNew(false);
				}
				
				tiporetencionivaAux.setIsDeleted(false);
			
				tiporetencionivaAux.setId(this.tiporetencioniva.getId());	
				tiporetencionivaAux.setVersionRow(this.tiporetencioniva.getVersionRow());	
				tiporetencionivaAux.setcodigo(this.tiporetencioniva.getcodigo());	
				tiporetencionivaAux.setnombre(this.tiporetencioniva.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporetencionivaAux,tiporetencionivaLogic.getTipoRetencionIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionivaAux,tiporetencionivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporetencionivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionivaLogic.saveTipoRetencionIvas();//WithConnection
						//tiporetencionivaLogic.getSetVersionRowTipoRetencionIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporetencioniva,tiporetencionivaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos().addAll(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos.addAll(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporetencionivaLogic.saveTipoRetencionIvaRelaciones(tiporetencionivaAux,this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());//WithConnection
								//tiporetencionivaLogic.getSetVersionRowTipoRetencionIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporetencioniva,tiporetencionivaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(new ArrayList<TarjetaCredito>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos= new ArrayList<TarjetaCredito>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporetencionivaAux.setTransaccionLocals(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporetencionivaAux.setTarjetaCreditos(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporetencionivaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporetencionivaAux,tiporetencionivaLogic.getTipoRetencionIvas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporetencionivaAux,tiporetencionivas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporetencioniva,tiporetencionivaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporetencionivaAux=new  TipoRetencionIva();
				
				tiporetencionivaAux.setIsNew(false);
				tiporetencionivaAux.setIsChanged(false);
				
				tiporetencionivaAux.setIsDeleted(true);
				
				tiporetencionivaAux.setId(this.tiporetencioniva.getId());	
				tiporetencionivaAux.setVersionRow(this.tiporetencioniva.getVersionRow());	
				tiporetencionivaAux.setcodigo(this.tiporetencioniva.getcodigo());	
				tiporetencionivaAux.setnombre(this.tiporetencioniva.getnombre());	
				
				if(this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporetencionivaAux.getId()>=0) {	
						this.tiporetencionivasEliminados.add(tiporetencionivaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporetencionivaAux,tiporetencionivaLogic.getTipoRetencionIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionivaAux,tiporetencionivas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporetencionivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionivaLogic.saveTipoRetencionIvas();//WithConnection
						//tiporetencionivaLogic.getSetVersionRowTipoRetencionIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos().addAll(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos.addAll(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.tarjetacreditodescuentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jInternalFrameDetalleFormTarjetaCredito.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporetencionivaLogic.saveTipoRetencionIvaRelaciones(tiporetencionivaAux,this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());//WithConnection
								//tiporetencionivaLogic.getSetVersionRowTipoRetencionIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(new ArrayList<TarjetaCredito>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos= new ArrayList<TarjetaCredito>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporetencionivaAux.setTransaccionLocals(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporetencionivaAux.setTarjetaCreditos(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporetencionivaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporetencionivaAux,tiporetencionivaLogic.getTipoRetencionIvas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporetencionivaAux,tiporetencionivas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.getTipoRetencionIvas().addAll(this.tiporetencionivasEliminados);
					
					tiporetencionivaLogic.saveTipoRetencionIvas();//WithConnection
					//tiporetencionivaLogic.getSetVersionRowTipoRetencionIvas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tiporetencionivasEliminados= new ArrayList<TipoRetencionIva>();		
			}
			
			if(this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Retencion Iva GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Retencion Iva",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporetencioniva=tiporetencionivaAux;
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
      		//this.finishProcessTipoRetencionIva();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRetencionIva tiporetencionivaLocal) throws Exception {
		
		if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiporetencionivaLocal.setTransaccionLocals(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
				tiporetencionivaLocal.setTarjetaCreditos(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
			
			} else {
			
				tiporetencionivaLocal.setTransaccionLocals(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals);
				tiporetencionivaLocal.setTarjetaCreditos(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRetencionIva tiporetencionivaLocal) throws Exception {	
		if(this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoRetencionIvaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporetencionivaValidator.getInvalidValues(this.tiporetencioniva);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRetencionIva tiporetencioniva,List<TipoRetencionIva> tiporetencionivas) throws Exception {
		try	{		
			TipoRetencionIvaConstantesFunciones.actualizarLista(tiporetencioniva,tiporetencionivas,this.tiporetencionivaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRetencionIva tiporetencioniva,List<TipoRetencionIva> tiporetencionivas) throws Exception {
		try	{			
			TipoRetencionIvaConstantesFunciones.actualizarSelectedLista(tiporetencioniva,tiporetencionivas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRetencionIva> tiporetencionivasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporetencionivasLocal=this.tiporetencionivaLogic.getTipoRetencionIvas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporetencionivasLocal=this.tiporetencionivas;
			}
			//ARCHITECTURE
		
			for(TipoRetencionIva tiporetencionivaLocal:tiporetencionivasLocal) {
				if(this.permiteMantenimiento(tiporetencionivaLocal) && tiporetencionivaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRetencionIvaConstantesFunciones.getTipoRetencionIvaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRetencionIvaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionIva.jLabelcodigoTipoRetencionIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionIvaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionIva.jLabelnombreTipoRetencionIva,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionIva.jLabelcodigoTipoRetencionIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionIva.jLabelnombreTipoRetencionIva,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TransaccionLocal")) {
			if(this.tiporetencioniva==null) {
				this.tiporetencioniva= new TipoRetencionIva();
			}

			if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoRetencionIva
				this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.tiporetencioniva,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);

				this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.gettransaccionlocal().setTipoRetencionIva(this.tiporetencioniva);
			}

			return;
		}
		 else  if(sTipo.equals("TarjetaCredito")) {
			if(this.tiporetencioniva==null) {
				this.tiporetencioniva= new TipoRetencionIva();
			}

			if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoRetencionIva
				this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.tiporetencioniva,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);

				this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.gettarjetacredito().setTipoRetencionIva(this.tiporetencioniva);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoRetencionIva--;	
		
		
		this.tiporetencionivaAux=new TipoRetencionIva();
		
		this.tiporetencionivaAux.setId(this.iIdNuevoTipoRetencionIva);
		this.tiporetencionivaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporetencionivaLogic.getTipoRetencionIvas().add(this.tiporetencionivaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporetencionivas.add(this.tiporetencionivaAux);
		}
		//ARCHITECTURE
		
		this.tiporetencioniva=this.tiporetencionivaAux;
		
		if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRetencionIva(this.tiporetencioniva);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencionIva(this.tiporetencioniva);
		}
				
		//this.setDefaultControlesTipoRetencionIva();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRetencionIva();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRetencionIva();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRetencionIva();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRetencionIva(this.tiporetencionivaBean,this.tiporetencioniva,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
			classes=TipoRetencionIvaConstantesFunciones.getClassesRelationshipsOfTipoRetencionIva(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporetencionivaReturnGeneral=tiporetencionivaLogic.procesarEventosTipoRetencionIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporetencionivaLogic.getTipoRetencionIvas(),this.tiporetencioniva,this.tiporetencionivaParameterGeneral,this.isEsNuevoTipoRetencionIva,classes);//this.tiporetencionivaLogic.getTipoRetencionIva()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRetencionIva(this.tiporetencionivaReturnGeneral,this.tiporetencionivaBean,false);
		
		if(this.tiporetencionivaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencionIva(this.tiporetencionivaReturnGeneral.getTipoRetencionIva());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRetencionIva(this.tiporetencionivaReturnGeneral.getTipoRetencionIva());
		}
		
		if(this.tiporetencionivaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRetencionIva(this.tiporetencionivaReturnGeneral.getTipoRetencionIva(),classes);//this.tiporetencionivaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.tiporetencioniva,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRetencionIva();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRetencionIva();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.RecargarFormTipoRetencionIva(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRetencionIva(false);
						
			if(tiporetencionivaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getEsGuardarRelacionado() && TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTarjetaCreditoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRetencionIva();
			}
			
			this.actualizarVisualTableDatosTipoRetencionIva();
			
			this.jTableDatosTipoRetencionIva.setRowSelectionInterval(this.getIndiceNuevoTipoRetencionIva(), this.getIndiceNuevoTipoRetencionIva());
			
			this.seleccionarFilaTablaTipoRetencionIvaActual();
						
			this.actualizarEstadoCeldasBotonesTipoRetencionIva("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRetencionIva(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldcodigoTipoRetencionIva.setEnabled(isHabilitar && this.tiporetencionivaConstantesFunciones.activarcodigoTipoRetencionIva);
		this.jInternalFrameDetalleFormTipoRetencionIva.jTextAreanombreTipoRetencionIva.setEnabled(isHabilitar && this.tiporetencionivaConstantesFunciones.activarnombreTipoRetencionIva);	
		
	};
	
	public void setDefaultControlesTipoRetencionIva() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRetencionIva(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporetencionivaSessionBean.setConGuardarRelaciones(true);			
			this.tiporetencionivaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiporetencionivaSessionBean.setConGuardarRelaciones(false);			
			this.tiporetencionivaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoRetencionIva() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivaLogic.getTipoRetencionIvas()) {
				if(tiporetencionivaAux.getId().equals(this.iIdNuevoTipoRetencionIva)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivas) {
				if(tiporetencionivaAux.getId().equals(this.iIdNuevoTipoRetencionIva)) {
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
	
	public int getIndiceActualTipoRetencionIva(TipoRetencionIva tiporetencioniva,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivaLogic.getTipoRetencionIvas()) {
				if(tiporetencionivaAux.getId().equals(tiporetencioniva.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivas) {
				if(tiporetencionivaAux.getId().equals(tiporetencioniva.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRetencionIva(TipoRetencionIva tiporetencionivaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivaLogic.getTipoRetencionIvas()) {
				if(tiporetencionivaAux.getTipoRetencionIvaOriginal().getId().equals(tiporetencionivaOriginal.getId())) {
					existe=true;
					tiporetencionivaOriginal.setId(tiporetencionivaAux.getId());
					tiporetencionivaOriginal.setVersionRow(tiporetencionivaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivas) {
				if(tiporetencionivaAux.getTipoRetencionIvaOriginal().getId().equals(tiporetencionivaOriginal.getId())) {
					existe=true;
					tiporetencionivaOriginal.setId(tiporetencionivaAux.getId());
					tiporetencionivaOriginal.setVersionRow(tiporetencionivaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRetencionIva(Boolean esParaCancelar) throws Exception {
		tiporetencionivasAux=new ArrayList<TipoRetencionIva>();
		tiporetencionivaAux=new TipoRetencionIva();
		
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivaLogic.getTipoRetencionIvas()) {
					if(tiporetencionivaAux.getId()<0) {
						tiporetencionivasAux.add(tiporetencionivaAux);
					}		
				}
				this.iIdNuevoTipoRetencionIva=0L;
				this.tiporetencionivaLogic.getTipoRetencionIvas().removeAll(tiporetencionivasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivas) {
					if(tiporetencionivaAux.getId()<0) {
						tiporetencionivasAux.add(tiporetencionivaAux);
					}		
				}
				this.iIdNuevoTipoRetencionIva=0L;
				this.tiporetencionivas.removeAll(tiporetencionivasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRetencionIva 
					&& this.tiporetencionivaLogic.getTipoRetencionIvas().size()>0
					) {
					tiporetencionivaAux=this.tiporetencionivaLogic.getTipoRetencionIvas().get(this.tiporetencionivaLogic.getTipoRetencionIvas().size() - 1);
				
					if(tiporetencionivaAux.getId()<0) {
						this.tiporetencionivaLogic.getTipoRetencionIvas().remove(tiporetencionivaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRetencionIva && this.tiporetencionivas.size()>0) {
					tiporetencionivaAux=this.tiporetencionivas.get(this.tiporetencionivas.size() - 1);
				
					if(tiporetencionivaAux.getId()<0) {
						this.tiporetencionivas.remove(tiporetencionivaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRetencionIva(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporetencioniva.getId()<0) {
				this.tiporetencionivaLogic.getTipoRetencionIvas().remove(this.tiporetencioniva);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporetencioniva.getId()<0) {
				this.tiporetencionivas.remove(this.tiporetencioniva);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRetencionIva(List<TipoRetencionIva> tiporetencionivasAux) throws Exception {
		TipoRetencionIvaConstantesFunciones.setEstadosInicialesTipoRetencionIva(tiporetencionivasAux);
	}
	
	public void setEstadosInicialesTipoRetencionIva(TipoRetencionIva tiporetencionivaAux) throws Exception {
		TipoRetencionIvaConstantesFunciones.setEstadosInicialesTipoRetencionIva(tiporetencionivaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRetencionIvaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRetencionIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRetencionIvaActual()) {
				if(!this.isEsNuevoTipoRetencionIva) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRetencionIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRetencionIva=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRetencionIvaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Retencion Iva ?", "MANTENIMIENTO DE Tipo Retencion Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRetencionIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRetencionIva tiporetencioniva) throws Exception {
		TipoRetencionIvaConstantesFunciones.seleccionarAsignar(this.tiporetencioniva,tiporetencioniva);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRetencionIva=this.isPermisoActualizarOriginalTipoRetencionIva;
			
			
			this.seleccionarAsignar(tiporetencioniva);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRetencionIvaConstantesFunciones.quitarEspaciosTipoRetencionIva(this.tiporetencioniva,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRetencionIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporetencionivaSessionBean.setsFuncionBusquedaRapida(this.tiporetencionivaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRetencionIva) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRetencionIva(esParaCancelar);				
				this.cancelarNuevoTipoRetencionIva(esParaCancelar);								
			}
			
			this.tiporetencioniva=new TipoRetencionIva();
			
			this.inicializarTipoRetencionIva();
			
			this.actualizarEstadoCeldasBotonesTipoRetencionIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRetencionIva() throws Exception {
		try {
			TipoRetencionIvaConstantesFunciones.inicializarTipoRetencionIva(this.tiporetencioniva);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporetencionivaLogic.getTipoRetencionIvas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRetencionIvas(String sAccionBusqueda,List<TipoRetencionIva> tiporetencionivasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRetencionIva"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRetencionIvaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRetencionIvaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRetencionIva"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Retencion Ivas");		
		parameters.put("busquedapor", TipoRetencionIvaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TransaccionLocal.class));
			classes.add(new Classe(TarjetaCredito.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoRetencionIvaLogic tiporetencionivaLogicAuxiliar=new TipoRetencionIvaLogic();
					tiporetencionivaLogicAuxiliar.setDatosCliente(tiporetencionivaLogic.getDatosCliente());				
					tiporetencionivaLogicAuxiliar.setTipoRetencionIvas(tiporetencionivasParaReportes);
					
					tiporetencionivaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoRetencionIvaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiporetencionivasParaReportes=tiporetencionivaLogicAuxiliar.getTipoRetencionIvas();
					
					//tiporetencionivaLogic.getNewConnexionToDeep();
					
					//for (TipoRetencionIva tiporetencioniva:tiporetencionivasParaReportes) {
					//	tiporetencionivaLogic.deepLoad(tiporetencioniva, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiporetencionivaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiporetencionivaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTransaccionLocal = AuxiliarReportes.class.getResourceAsStream("TransaccionLocalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_transaccionlocal", reportFileTransaccionLocal);

			InputStream reportFileTarjetaCredito = AuxiliarReportes.class.getResourceAsStream("TarjetaCreditoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tarjetacredito", reportFileTarjetaCredito);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRetencionIva=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRetencionIvaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRetencionIvaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRetencionIva=new JRBeanArrayDataSource(TipoRetencionIvaJInternalFrame.TraerTipoRetencionIvaBeans(tiporetencionivasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRetencionIva);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRetencionIvaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRetencionIvaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRetencionIvaBean.TraerTipoRetencionIvaBeans(tiporetencionivasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRetencionIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionivasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRetencionIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionivasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRetencionIvaActionPerformed(null);
					//this.generarExcelReporteTipoRetencionIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionivasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRetencionIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionivasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRetencionIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionivasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRetencionIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionivasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRetencionIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRetencionIva> tiporetencionivasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencioniva";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetencionIvas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRetencionIva("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRetencionIva tiporetencioniva : tiporetencionivasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRetencionIvaConstantesFunciones.generarExcelReporteDataTipoRetencionIva("NORMAL",row,workbook,tiporetencioniva,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRetencionIva(String sTipo,Row row,Workbook workbook) {
		
		TipoRetencionIvaConstantesFunciones.generarExcelReporteHeaderTipoRetencionIva(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRetencionIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRetencionIva> tiporetencionivasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencioniva_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetencionIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRetencionIva tiporetencioniva : tiporetencionivasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRetencionIvaConstantesFunciones.getTipoRetencionIvaDescripcion(tiporetencioniva));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionIvaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionIvaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencioniva.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencioniva.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRetencionIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRetencionIva> tiporetencionivasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRetencionIva> tiporetencionivasRespaldo=null;
		
		classes=TipoRetencionIvaConstantesFunciones.getClassesRelationshipsOfTipoRetencionIva(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporetencionivaLogic.setDatosCliente(this.datosCliente);
		this.tiporetencionivaLogic.setDatosDeep(this.datosDeep);
		this.tiporetencionivaLogic.setIsConDeep(true);
		
		tiporetencionivasRespaldo=this.tiporetencionivaLogic.getTipoRetencionIvas();
		
		this.tiporetencionivaLogic.setTipoRetencionIvas(tiporetencionivasParaReportes);	
		this.tiporetencionivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporetencionivasParaReportes=this.tiporetencionivaLogic.getTipoRetencionIvas();
		this.tiporetencionivaLogic.setTipoRetencionIvas(tiporetencionivasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencioniva_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetencionIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRetencionIva("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRetencionIva tiporetencioniva : tiporetencionivasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRetencionIva("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRetencionIvaConstantesFunciones.generarExcelReporteDataTipoRetencionIva("NORMAL",row,workbook,tiporetencioniva,cellStyleDataAux);
		
			
			


				//TransaccionLocal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiporetencioniva.getTransaccionLocals()!=null && tiporetencioniva.getTransaccionLocals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TransaccionLocalConstantesFunciones.generarExcelReporteHeaderTransaccionLocal("RELACIONADO",row,workbook);
				}

				if(tiporetencioniva.getTransaccionLocals()!=null) {
					i2=0;
					for(TransaccionLocal transaccionlocal : tiporetencioniva.getTransaccionLocals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TransaccionLocalConstantesFunciones.generarExcelReporteDataTransaccionLocal("RELACIONADO",row,workbook,transaccionlocal,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//TarjetaCredito
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiporetencioniva.getTarjetaCreditos()!=null && tiporetencioniva.getTarjetaCreditos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TarjetaCreditoConstantesFunciones.generarExcelReporteHeaderTarjetaCredito("RELACIONADO",row,workbook);
				}

				if(tiporetencioniva.getTarjetaCreditos()!=null) {
					i2=0;
					for(TarjetaCredito tarjetacredito : tiporetencioniva.getTarjetaCreditos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TarjetaCreditoConstantesFunciones.generarExcelReporteDataTarjetaCredito("RELACIONADO",row,workbook,tarjetacredito,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoRetencionIvaConstantesFunciones.getTipoRetencionIvaDescripcion(tiporetencioniva));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRetencionIva() throws Exception {		
		this.startProcessTipoRetencionIva(true);
	}
	
	public void startProcessTipoRetencionIva(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoRetencionIva, this.jScrollPanelDatosTipoRetencionIva,this.jPanelPaginacionTipoRetencionIva, this.jScrollPanelDatosEdicionTipoRetencionIva, this.jPanelAccionesTipoRetencionIva,this.jPanelAccionesFormularioTipoRetencionIva,this.jmenuBarTipoRetencionIva,this.jmenuBarDetalleTipoRetencionIva,this.jTtoolBarTipoRetencionIva,this.jTtoolBarDetalleTipoRetencionIva);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRetencionIva=null; 
		
		final JPanel jPanelParametrosReportesTipoRetencionIva=this.jPanelParametrosReportesTipoRetencionIva;
		//final JScrollPane jScrollPanelDatosTipoRetencionIva=this.jScrollPanelDatosTipoRetencionIva;
		final JTable jTableDatosTipoRetencionIva=this.jTableDatosTipoRetencionIva;		
		final JPanel jPanelPaginacionTipoRetencionIva=this.jPanelPaginacionTipoRetencionIva;
		//final JScrollPane jScrollPanelDatosEdicionTipoRetencionIva=this.jScrollPanelDatosEdicionTipoRetencionIva;
		final JPanel jPanelAccionesTipoRetencionIva=this.jPanelAccionesTipoRetencionIva;
		
		JPanel jPanelCamposAuxiliarTipoRetencionIva=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRetencionIva=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			jPanelCamposAuxiliarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jPanelCamposTipoRetencionIva;
			jPanelAccionesFormularioAuxiliarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jPanelAccionesFormularioTipoRetencionIva;
		}
		
		final JPanel jPanelCamposTipoRetencionIva=jPanelCamposAuxiliarTipoRetencionIva;
		final JPanel jPanelAccionesFormularioTipoRetencionIva=jPanelAccionesFormularioAuxiliarTipoRetencionIva;
		
		
		final JMenuBar jmenuBarTipoRetencionIva=this.jmenuBarTipoRetencionIva;
		final JToolBar jTtoolBarTipoRetencionIva=this.jTtoolBarTipoRetencionIva;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRetencionIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRetencionIva=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			jmenuBarDetalleAuxiliarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jmenuBarDetalleTipoRetencionIva;
			jTtoolBarDetalleAuxiliarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jTtoolBarDetalleTipoRetencionIva;
		}
		
		final JMenuBar jmenuBarDetalleTipoRetencionIva=jmenuBarDetalleAuxiliarTipoRetencionIva;
		final JToolBar jTtoolBarDetalleTipoRetencionIva=jTtoolBarDetalleAuxiliarTipoRetencionIva;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRetencionIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRetencionIva;
			processRunnable.jTableDatos=jTableDatosTipoRetencionIva;
			processRunnable.jPanelCampos=jPanelCamposTipoRetencionIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRetencionIva;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRetencionIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRetencionIva;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRetencionIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRetencionIva;
			processRunnable.jTtoolBar=jTtoolBarTipoRetencionIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRetencionIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRetencionIva ,jPanelParametrosReportesTipoRetencionIva,jTableDatosTipoRetencionIva, /*jScrollPanelDatosTipoRetencionIva,*/jPanelCamposTipoRetencionIva,jPanelPaginacionTipoRetencionIva, /*jScrollPanelDatosEdicionTipoRetencionIva,*/ jPanelAccionesTipoRetencionIva,jPanelAccionesFormularioTipoRetencionIva,jmenuBarTipoRetencionIva,jmenuBarDetalleTipoRetencionIva,jTtoolBarTipoRetencionIva,jTtoolBarDetalleTipoRetencionIva);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoRetencionIva, jScrollPanelDatosTipoRetencionIva,jPanelPaginacionTipoRetencionIva, jScrollPanelDatosEdicionTipoRetencionIva, jPanelAccionesTipoRetencionIva,jPanelAccionesFormularioTipoRetencionIva,jmenuBarTipoRetencionIva,jmenuBarDetalleTipoRetencionIva,jTtoolBarTipoRetencionIva,jTtoolBarDetalleTipoRetencionIva);
						
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
	
	public void finishProcessTipoRetencionIva() {// throws Exception 
		this.finishProcessTipoRetencionIva(true);
	}
	
	public void finishProcessTipoRetencionIva(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoRetencionIva, this.jScrollPanelDatosTipoRetencionIva,this.jPanelPaginacionTipoRetencionIva, this.jScrollPanelDatosEdicionTipoRetencionIva, this.jPanelAccionesTipoRetencionIva,this.jPanelAccionesFormularioTipoRetencionIva,this.jmenuBarTipoRetencionIva,this.jmenuBarDetalleTipoRetencionIva,this.jTtoolBarTipoRetencionIva,this.jTtoolBarDetalleTipoRetencionIva);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRetencionIva=null; 
		
		final JPanel jPanelParametrosReportesTipoRetencionIva=this.jPanelParametrosReportesTipoRetencionIva;
		//final JScrollPane jScrollPanelDatosTipoRetencionIva=this.jScrollPanelDatosTipoRetencionIva;
		final JTable jTableDatosTipoRetencionIva=this.jTableDatosTipoRetencionIva;		
		final JPanel jPanelPaginacionTipoRetencionIva=this.jPanelPaginacionTipoRetencionIva;
		//final JScrollPane jScrollPanelDatosEdicionTipoRetencionIva=this.jScrollPanelDatosEdicionTipoRetencionIva;
		final JPanel jPanelAccionesTipoRetencionIva=this.jPanelAccionesTipoRetencionIva;
		
		JPanel jPanelCamposAuxiliarTipoRetencionIva=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRetencionIva=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			jPanelCamposAuxiliarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jPanelCamposTipoRetencionIva;
			jPanelAccionesFormularioAuxiliarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jPanelAccionesFormularioTipoRetencionIva;
		}
		
		final JPanel jPanelCamposTipoRetencionIva=jPanelCamposAuxiliarTipoRetencionIva;
		final JPanel jPanelAccionesFormularioTipoRetencionIva=jPanelAccionesFormularioAuxiliarTipoRetencionIva;
		
		
		final JMenuBar jmenuBarTipoRetencionIva=this.jmenuBarTipoRetencionIva;		
		final JToolBar jTtoolBarTipoRetencionIva=this.jTtoolBarTipoRetencionIva;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRetencionIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRetencionIva=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			jmenuBarDetalleAuxiliarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jmenuBarDetalleTipoRetencionIva;
			jTtoolBarDetalleAuxiliarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jTtoolBarDetalleTipoRetencionIva;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRetencionIva=jmenuBarDetalleAuxiliarTipoRetencionIva;
		final JToolBar jTtoolBarDetalleTipoRetencionIva=jTtoolBarDetalleAuxiliarTipoRetencionIva;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRetencionIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRetencionIva;
			processRunnable.jTableDatos=jTableDatosTipoRetencionIva;
			processRunnable.jPanelCampos=jPanelCamposTipoRetencionIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRetencionIva;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRetencionIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRetencionIva;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRetencionIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRetencionIva;
			processRunnable.jTtoolBar=jTtoolBarTipoRetencionIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRetencionIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRetencionIva ,jPanelParametrosReportesTipoRetencionIva, jTableDatosTipoRetencionIva,/*jScrollPanelDatosTipoRetencionIva,*/jPanelCamposTipoRetencionIva,jPanelPaginacionTipoRetencionIva, /*jScrollPanelDatosEdicionTipoRetencionIva,*/ jPanelAccionesTipoRetencionIva,jPanelAccionesFormularioTipoRetencionIva,jmenuBarTipoRetencionIva,jmenuBarDetalleTipoRetencionIva,jTtoolBarTipoRetencionIva,jTtoolBarDetalleTipoRetencionIva));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRetencionIva(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRetencionIva(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRetencionIva(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRetencionIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRetencionIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRetencionIva,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRetencionIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRetencionIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRetencionIva,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporetencionivaConstantesFunciones.getsFinalQueryTipoRetencionIva();
		String  finalQueryPaginacionTodos=this.tiporetencionivaConstantesFunciones.getsFinalQueryTipoRetencionIva();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRetencionIvaConstantesFunciones.getArrayColumnasGlobalesNoTipoRetencionIva(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRetencionIvaConstantesFunciones.getArrayColumnasGlobalesTipoRetencionIva(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRetencionIvaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporetencionivasEliminados= new ArrayList<TipoRetencionIva>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRetencionIva();
		
				///*TipoRetencionIvaSessionBean*/this.tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean();
			
			if(this.tiporetencionivaSessionBean==null) {
				this.tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean();
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
					this.iNumeroPaginacion=TipoRetencionIvaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRetencionIvaConstantesFunciones.getClassesForeignKeysOfTipoRetencionIva(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporetencioniva."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporetencionivasAux= new ArrayList<TipoRetencionIva>();
			
				
			tiporetencionivaLogic.setDatosCliente(this.datosCliente);
			tiporetencionivaLogic.setDatosDeep(this.datosDeep);
			tiporetencionivaLogic.setIsConDeep(true);
			
			
			tiporetencionivaLogic.getTipoRetencionIvaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporetencionivaLogic.getTodosTipoRetencionIvas(finalQueryGlobal,pagination);
					
					//tiporetencionivaLogic.getTodosTipoRetencionIvasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporetencionivaLogic.getTipoRetencionIvas()==null|| tiporetencionivaLogic.getTipoRetencionIvas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporetencionivasAux= new ArrayList<TipoRetencionIva>();
							tiporetencionivasAux.addAll(tiporetencionivaLogic.getTipoRetencionIvas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionivasAux= new ArrayList<TipoRetencionIva>();
							tiporetencionivasAux.addAll(tiporetencionivas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporetencionivaLogic.getTodosTipoRetencionIvas(finalQueryGlobal+"",this.pagination);												
							
							//tiporetencionivaLogic.getTodosTipoRetencionIvasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRetencionIvas("Todos",tiporetencionivaLogic.getTipoRetencionIvas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporetencionivaLogic.setTipoRetencionIvas(new ArrayList<TipoRetencionIva>());					
							tiporetencionivaLogic.getTipoRetencionIvas().addAll(tiporetencionivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionivas=new ArrayList<TipoRetencionIva>();
							tiporetencionivas.addAll(tiporetencionivasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRetencionIva=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRetencionIva=this.idActual;
				
				} else if(this.idTipoRetencionIvaActual!=null && this.idTipoRetencionIvaActual!=0L) {
					idTipoRetencionIva=idTipoRetencionIvaActual;
				}
				
					
				this.sDetalleReporte=TipoRetencionIvaConstantesFunciones.getDetalleIndicePorId(idTipoRetencionIva);
				
				this.tiporetencionivas=new ArrayList<TipoRetencionIva>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporetencionivaLogic.getEntity(idTipoRetencionIva);
					
					//tiporetencionivaLogic.getEntityWithConnection(idTipoRetencionIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionivaLogic.setTipoRetencionIvas(new ArrayList<TipoRetencionIva>());
					tiporetencionivaLogic.getTipoRetencionIvas().add(tiporetencionivaLogic.getTipoRetencionIva());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencionivas=new ArrayList<TipoRetencionIva>();
					this.tiporetencionivas.add(tiporetencioniva);
				}
				
				if(tiporetencionivaLogic.getTipoRetencionIva()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRetencionIva();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRetencionIva();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporetencionivaLogic.getTipoRetencionIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetencionivas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporetencionivaLogic.getTipoRetencionIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetencionivas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRetencionIva tiporetencioniva) {
		Boolean permite=true;
		
		if(this.tiporetencioniva.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRetencionIvaConstantesFunciones.getOrderByListaTipoRetencionIva();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRetencionIvaConstantesFunciones.getOrderByListaTipoRetencionIva();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencionIva tiporetencioniva:tiporetencionivaLogic.getTipoRetencionIvas()) {
				if(tiporetencioniva.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionivaTotales=tiporetencioniva;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencionIva tiporetencioniva:this.tiporetencionivas) {
				if(tiporetencioniva.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionivaTotales=tiporetencioniva;
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
			this.tiporetencionivaAux=new TipoRetencionIva();
			this.tiporetencionivaAux.setsType(Constantes2.S_TOTALES);
			this.tiporetencionivaAux.setIsNew(false);
			this.tiporetencionivaAux.setIsChanged(false);
			this.tiporetencionivaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRetencionIvaConstantesFunciones.TotalizarValoresFilaTipoRetencionIva(this.tiporetencionivaLogic.getTipoRetencionIvas(),this.tiporetencionivaAux);
				
				this.tiporetencionivaLogic.getTipoRetencionIvas().add(this.tiporetencionivaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRetencionIvaConstantesFunciones.TotalizarValoresFilaTipoRetencionIva(this.tiporetencionivas,this.tiporetencionivaAux);
				
				this.tiporetencionivas.add(this.tiporetencionivaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporetencionivaTotales=new TipoRetencionIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporetencionivaLogic.getTipoRetencionIvas().remove(tiporetencionivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporetencionivas.remove(tiporetencionivaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporetencionivaTotales=new TipoRetencionIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencionIva tiporetencioniva:tiporetencionivaLogic.getTipoRetencionIvas()) {
				if(tiporetencioniva.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionivaTotales=tiporetencioniva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRetencionIvaConstantesFunciones.TotalizarValoresFilaTipoRetencionIva(this.tiporetencionivaLogic.getTipoRetencionIvas(),tiporetencionivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencionIva tiporetencioniva:this.tiporetencionivas) {
				if(tiporetencioniva.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionivaTotales=tiporetencioniva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRetencionIvaConstantesFunciones.TotalizarValoresFilaTipoRetencionIva(this.tiporetencionivas,tiporetencionivaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoRetencionIva() {
		this.isPermisoTodoTipoRetencionIva=false;
		this.isPermisoNuevoTipoRetencionIva=false;
		this.isPermisoActualizarTipoRetencionIva=false;
		this.isPermisoActualizarOriginalTipoRetencionIva=false;
		this.isPermisoEliminarTipoRetencionIva=false;
		this.isPermisoGuardarCambiosTipoRetencionIva=false;
		this.isPermisoConsultaTipoRetencionIva=false;
		this.isPermisoBusquedaTipoRetencionIva=false;
		this.isPermisoReporteTipoRetencionIva=false;		
		this.isPermisoOrdenTipoRetencionIva=false;		
		this.isPermisoPaginacionMedioTipoRetencionIva=false;		
		this.isPermisoPaginacionAltoTipoRetencionIva=false;
		this.isPermisoPaginacionTodoTipoRetencionIva=false;
		this.isPermisoCopiarTipoRetencionIva=false;		
		this.isPermisoVerFormTipoRetencionIva=false;		
		this.isPermisoDuplicarTipoRetencionIva=false;		
		this.isPermisoOrdenTipoRetencionIva=false;		
	}
	
	public void setPermisosUsuarioTipoRetencionIva(Boolean isPermiso) {
		this.isPermisoTodoTipoRetencionIva=isPermiso;
		this.isPermisoNuevoTipoRetencionIva=isPermiso;
		this.isPermisoActualizarTipoRetencionIva=isPermiso;
		this.isPermisoActualizarOriginalTipoRetencionIva=isPermiso;
		this.isPermisoEliminarTipoRetencionIva=isPermiso;
		this.isPermisoGuardarCambiosTipoRetencionIva=isPermiso;
		this.isPermisoConsultaTipoRetencionIva=isPermiso;
		this.isPermisoBusquedaTipoRetencionIva=isPermiso;
		this.isPermisoReporteTipoRetencionIva=isPermiso;
		this.isPermisoOrdenTipoRetencionIva=isPermiso;		
		this.isPermisoPaginacionMedioTipoRetencionIva=isPermiso;		
		this.isPermisoPaginacionAltoTipoRetencionIva=isPermiso;		
		this.isPermisoPaginacionTodoTipoRetencionIva=isPermiso;		
		this.isPermisoCopiarTipoRetencionIva=isPermiso;		
		this.isPermisoVerFormTipoRetencionIva=isPermiso;		
		this.isPermisoDuplicarTipoRetencionIva=isPermiso;
		this.isPermisoOrdenTipoRetencionIva=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRetencionIva(Boolean isPermiso) {
		//this.isPermisoTodoTipoRetencionIva=isPermiso;
		this.isPermisoNuevoTipoRetencionIva=isPermiso;
		this.isPermisoActualizarTipoRetencionIva=isPermiso;
		this.isPermisoActualizarOriginalTipoRetencionIva=isPermiso;
		this.isPermisoEliminarTipoRetencionIva=isPermiso;
		this.isPermisoGuardarCambiosTipoRetencionIva=isPermiso;
		//this.isPermisoConsultaTipoRetencionIva=isPermiso;
		//this.isPermisoBusquedaTipoRetencionIva=isPermiso;
		//this.isPermisoReporteTipoRetencionIva=isPermiso;
		//this.isPermisoOrdenTipoRetencionIva=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRetencionIva=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRetencionIva=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRetencionIva=isPermiso;		
		//this.isPermisoCopiarTipoRetencionIva=isPermiso;		
		//this.isPermisoDuplicarTipoRetencionIva=isPermiso;
		//this.isPermisoOrdenTipoRetencionIva=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRetencionIvaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(TarjetaCreditoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoRetencionIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTransaccionLocal=false;
		this.isTienePermisosTransaccionLocal=this.verificarGetPermisosUsuarioOpcionTipoRetencionIvaClaseRelacionada(this.opcionsRelacionadas,TransaccionLocalConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosTarjetaCredito=false;
		this.isTienePermisosTarjetaCredito=this.verificarGetPermisosUsuarioOpcionTipoRetencionIvaClaseRelacionada(this.opcionsRelacionadas,TarjetaCreditoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRetencionIva(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRetencionIvaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTransaccionLocal=conPermiso;
		this.isTienePermisosTarjetaCredito=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRetencionIvaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRetencionIvaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRetencionIvaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTransaccionLocal && this.jInternalFrameDetalleFormTipoRetencionIva!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.remove(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosTarjetaCredito && this.jInternalFrameDetalleFormTipoRetencionIva!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.remove(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoRetencionIva() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRetencionIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRetencionIvaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRetencionIva=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRetencionIva=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRetencionIva=this.isPermisoActualizarTipoRetencionIva;
			this.isPermisoEliminarTipoRetencionIva=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRetencionIva=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRetencionIva=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRetencionIva=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRetencionIva=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRetencionIva=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRetencionIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRetencionIva=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRetencionIva=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRetencionIva=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRetencionIva=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRetencionIva=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRetencionIva=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRetencionIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRetencionIva.setToolTipText(this.jTableDatosTipoRetencionIva.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRetencionIva(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRetencionIva(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRetencionIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRetencionIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRetencionIva() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTransaccionLocal && this.tiporetencionivaConstantesFunciones.mostrarTransaccionLocalTipoRetencionIva && !TipoRetencionIvaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Transaccion Local");
			reporte.setsDescripcion("Transaccion Local");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosTarjetaCredito && this.tiporetencionivaConstantesFunciones.mostrarTarjetaCreditoTipoRetencionIva && !TipoRetencionIvaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Tarjeta Credito");
			reporte.setsDescripcion("Tarjeta Credito");
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
	
		
	public void inicializarCombosForeignKeyTipoRetencionIvaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRetencionIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRetencionIvaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRetencionIvaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoRetencionIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRetencionIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoRetencionIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRetencionIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRetencionIva()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRetencionIva();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRetencionIva(TipoRetencionIva tiporetencioniva)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRetencionIva(TipoRetencionIva tiporetencioniva,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRetencionIva()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRetencionIva()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRetencionIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRetencionIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRetencionIva()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRetencionIva()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRetencionIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRetencionIva()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoRetencionIvaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRetencionIvaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRetencionIvaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean(); 
		this.tiporetencionivaConstantesFunciones=new TipoRetencionIvaConstantesFunciones(); 
		this.tiporetencionivaBean=new TipoRetencionIva();//(this.tiporetencionivaConstantesFunciones); 		
		this.tiporetencionivaReturnGeneral=new TipoRetencionIvaParameterReturnGeneral(); 
		
		this.tiporetencionivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporetencionivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRetencionIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRetencionIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRetencionIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRetencionIva(true);
			
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
			
			this.tiporetencionivaConstantesFunciones=new TipoRetencionIvaConstantesFunciones(); 
			this.tiporetencionivaBean=new TipoRetencionIva();//this.tiporetencionivaConstantesFunciones); 			
			this.tiporetencionivaReturnGeneral=new TipoRetencionIvaParameterReturnGeneral(); 
		
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Retencion Iva Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporetencioniva=new TipoRetencionIva();
			this.tiporetencionivas = new ArrayList<TipoRetencionIva>();
			this.tiporetencionivasAux = new ArrayList<TipoRetencionIva>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic=new TipoRetencionIvaLogic();
				this.tiporetencionivaLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporetencionivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporetencionivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRetencionIva);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRetencionIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRetencionIva);	
					}
					
					if(this.jInternalFrameImportacionTipoRetencionIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRetencionIva);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRetencionIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRetencionIva);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRetencionIva);
				this.jInternalFrameDetalleFormTipoRetencionIva.setVisible(false);
				this.jInternalFrameDetalleFormTipoRetencionIva.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRetencionIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRetencionIva);
					this.jInternalFrameReporteDinamicoTipoRetencionIva.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRetencionIva.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRetencionIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRetencionIva);
					this.jInternalFrameImportacionTipoRetencionIva.setVisible(false);
					this.jInternalFrameImportacionTipoRetencionIva.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRetencionIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRetencionIva);
					this.jInternalFrameOrderByTipoRetencionIva.setVisible(false);
					this.jInternalFrameOrderByTipoRetencionIva.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRetencionIvaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRetencionIvaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporetencionivaReturnGeneral=new TipoRetencionIvaParameterReturnGeneral();
			
			this.tiporetencionivaParameterGeneral=new TipoRetencionIvaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporetencionivaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRetencionIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(TarjetaCreditoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRetencionIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporetencionivaSessionBean.getEsGuardarRelacionado(),this.tiporetencionivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRetencionIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporetencionivaSessionBean.getEsGuardarRelacionado(),this.tiporetencionivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRetencionIva=false;
			this.isVisibilidadCeldaDuplicarTipoRetencionIva=true;
			this.isVisibilidadCeldaCopiarTipoRetencionIva=true;
			this.isVisibilidadCeldaVerFormTipoRetencionIva=true;
			this.isVisibilidadCeldaOrdenTipoRetencionIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=false;
			this.isVisibilidadCeldaModificarTipoRetencionIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionIva=false;
			this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRetencionIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRetencionIva();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRetencionIva(false);
			
			this.setPermisosUsuarioTipoRetencionIva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporetencionivaSessionBean.getEsGuardarRelacionado() && this.tiporetencionivaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRetencionIvaClasesRelacionadas();
			}
			
			if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRetencionIvaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRetencionIva();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRetencionIva();
			}
			
			if(!this.isPermisoBusquedaTipoRetencionIva) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRetencionIva,this.isPermisoPaginacionMedioTipoRetencionIva,this.isPermisoPaginacionTodoTipoRetencionIva);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRetencionIvaConstantesFunciones.getTiposSeleccionarTipoRetencionIva());
				
				this.tiposColumnasSelect=TipoRetencionIvaConstantesFunciones.getTiposSeleccionarTipoRetencionIva(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoRetencionIva();				
				//this.tiposRelacionesSelect=TipoRetencionIvaConstantesFunciones.getTiposRelacionesTipoRetencionIva(true);
				
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
			//if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRetencionIva();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoRetencionIva(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoRetencionIva(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencionIva() ;
			
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
			
			
			this.transaccionlocalLogic=new TransaccionLocalLogic();
			this.tarjetacreditoLogic=new TarjetaCreditoLogic(); 
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
				tiporetencionivaImplementable= (TipoRetencionIvaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRetencionIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporetencionivaImplementableHome= (TipoRetencionIvaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRetencionIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporetencionivas= new ArrayList<TipoRetencionIva>();
			this.tiporetencionivasEliminados= new ArrayList<TipoRetencionIva>();
						
			this.isEsNuevoTipoRetencionIva=false;
			this.esParaAccionDesdeFormularioTipoRetencionIva=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRetencionIva(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRetencionIva();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRetencionIvaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRetencionIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRetencionIva(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRetencionIva();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRetencionIva();
			}
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRetencionIva(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRetencionIva: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRetencionIva() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRetencionIva")) {
				iIndex=this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();	
				
				

				if(sTitle.equals("Tarjeta Creditos")) {
					if(!TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoRetencionIva();

						this.cargarParteTabPanelRelacionadaTarjetaCredito(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Transaccion Locales")) {
					if(!TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoRetencionIva();

						this.cargarParteTabPanelRelacionadaTransaccionLocal(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRetencionIva();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaTarjetaCredito(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoRetencionIva.cargarSessionConBeanSwingJInternalFrameTarjetaCredito(false,true,iIndex);
		this.jButtonTarjetaCreditoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTarjetaCredito();

		//this.jTabbedPaneRelacionesTipoRetencionIva.updateUI();
		//this.jTabbedPaneRelacionesTipoRetencionIva.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoRetencionIva.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTransaccionLocal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoRetencionIva.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(false,true,iIndex);
		this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTransaccionLocal();

		//this.jTabbedPaneRelacionesTipoRetencionIva.updateUI();
		//this.jTabbedPaneRelacionesTipoRetencionIva.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoRetencionIva.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TransaccionLocal")) {
				int row=this.jTableDatosTipoRetencionIva.getSelectedRow();
				jButtonTransaccionLocalActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("TarjetaCredito")) {
				int row=this.jTableDatosTipoRetencionIva.getSelectedRow();
				jButtonTarjetaCreditoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Transaccion Local")) {

					if(this.isTienePermisosTransaccionLocal && this.tiporetencionivaConstantesFunciones.mostrarTransaccionLocalTipoRetencionIva && !TipoRetencionIvaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Transaccion Locales"+"("+TransaccionLocalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Transaccion Locales");

						if(tiporetencionivaConstantesFunciones.resaltarTransaccionLocalTipoRetencionIva!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiporetencionivaConstantesFunciones.resaltarTransaccionLocalTipoRetencionIva);
						}

						jmenuItem.setEnabled(this.tiporetencionivaConstantesFunciones.activarTransaccionLocalTipoRetencionIva);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TransaccionLocal"));

						

						this.jInternalFrameDetalleFormTipoRetencionIva.jmenuDetalleTipoRetencionIva.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Tarjeta Credito")) {

					if(this.isTienePermisosTarjetaCredito && this.tiporetencionivaConstantesFunciones.mostrarTarjetaCreditoTipoRetencionIva && !TipoRetencionIvaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Tarjeta Creditos"+"("+TarjetaCreditoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Tarjeta Creditos");

						if(tiporetencionivaConstantesFunciones.resaltarTarjetaCreditoTipoRetencionIva!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiporetencionivaConstantesFunciones.resaltarTarjetaCreditoTipoRetencionIva);
						}

						jmenuItem.setEnabled(this.tiporetencionivaConstantesFunciones.activarTarjetaCreditoTipoRetencionIva);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TarjetaCredito"));

						

						this.jInternalFrameDetalleFormTipoRetencionIva.jmenuDetalleTipoRetencionIva.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoRetencionIva(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRetencionIva(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRetencionIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRetencionIvaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRetencionIva();
		
		this.cargarCombosFrameForeignKeyTipoRetencionIva();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRetencionIva();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRetencionIva();
		}
	}
	
	
	
	public void jButtonNuevoTipoRetencionIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
			
			if(jTableDatosTipoRetencionIva.getRowCount()>=1) {
				jTableDatosTipoRetencionIva.removeRowSelectionInterval(0, jTableDatosTipoRetencionIva.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRetencionIva=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRetencionIva(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRetencionIva(true);			
			//this.tiporetencioniva=new TipoRetencionIva();
			//this.tiporetencioniva.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRetencionIva(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencionIva() ;
			
			if(TipoRetencionIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRetencionIva(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporetencioniva);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);				
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
			if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRetencionIva: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRetencionIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRetencionIva.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRetencionIva.getSelectedRows().length;			
			}
			
			tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRetencionIva--;			
				//TipoRetencionIva tiporetencionivaAux= new TipoRetencionIva();			
				//tiporetencionivaAux.setId(this.iIdNuevoTipoRetencionIva);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRetencionIva tiporetencionivaOrigen=new TipoRetencionIva();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRetencionIva tiporetencionivaOrigen : tiporetencionivasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporetencionivaOrigen =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionivaOrigen =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRetencionIva();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporetencioniva.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRetencionIva(tiporetencionivaOrigen,this.tiporetencioniva,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporetencionivaLogic.getTipoRetencionIvas().add(this.tiporetencionivaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporetencionivas.add(this.tiporetencionivaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRetencionIva(false);
				
				this.jTableDatosTipoRetencionIva.setRowSelectionInterval(this.getIndiceNuevoTipoRetencionIva(), this.getIndiceNuevoTipoRetencionIva());
				
				int iLastRow =  this.jTableDatosTipoRetencionIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRetencionIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRetencionIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRetencionIva(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();									
		
			TipoRetencionIva tiporetencionivaOrigen=new TipoRetencionIva();
			TipoRetencionIva tiporetencionivaDestino=new TipoRetencionIva();
				
			tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRetencionIva.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporetencionivasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRetencionIva.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionivaOrigen =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporetencionivaOrigen =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionivaDestino =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporetencionivaDestino =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporetencionivaOrigen =tiporetencionivasSeleccionados.get(0);
				tiporetencionivaDestino =tiporetencionivasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRetencionIva(tiporetencionivaOrigen,tiporetencionivaDestino,true,false);
				
				tiporetencionivaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporetencionivaDestino,tiporetencionivaLogic.getTipoRetencionIvas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionivaDestino,tiporetencionivas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRetencionIva(false);
				
				//this.jTableDatosTipoRetencionIva.setRowSelectionInterval(this.getIndiceNuevoTipoRetencionIva(), this.getIndiceNuevoTipoRetencionIva());
				
				int iLastRow =  this.jTableDatosTipoRetencionIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRetencionIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRetencionIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRetencionIva(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRetencionIva.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRetencionIva.isVisible();
			
			
			this.jPanelParametrosReportesTipoRetencionIva.setVisible(!isVisible);
			this.jPanelPaginacionTipoRetencionIva.setVisible(!isVisible);
			this.jPanelAccionesTipoRetencionIva.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRetencionIva();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRetencionIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRetencionIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRetencionIva();
			
			this.abrirFrameOrderByTipoRetencionIva();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRetencionIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRetencionIva(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRetencionIva);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRetencionIva.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRetencionIva.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRetencionIva.setSize(this.jInternalFrameDetalleFormTipoRetencionIva.iWidthFormulario,this.jInternalFrameDetalleFormTipoRetencionIva.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRetencionIva.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRetencionIva.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRetencionIva.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRetencionIva.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRetencionIva.jContentPaneDetalleTipoRetencionIva.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRetencionIva.jContentPaneDetalleTipoRetencionIva.getWidth(),TipoRetencionIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRetencionIva.jContentPaneDetalleTipoRetencionIva.getWidth(),TipoRetencionIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRetencionIva.jContentPaneDetalleTipoRetencionIva.getWidth(),TipoRetencionIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTarjetaCredito();
					}

					if(TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTransaccionLocal();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRetencionIva.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRetencionIva.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRetencionIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRetencionIva==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRetencionIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencionIva,false,this);
				} else {
					this.jInternalFrameOrderByTipoRetencionIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencionIva,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRetencionIva);
				this.jInternalFrameOrderByTipoRetencionIva.setVisible(false);
				this.jInternalFrameOrderByTipoRetencionIva.setSelected(false);
				
				this.jInternalFrameOrderByTipoRetencionIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRetencionIva"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRetencionIva();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRetencionIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRetencionIva==null) {
				
				this.jInternalFrameImportacionTipoRetencionIva=new ImportacionJInternalFrame(TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRetencionIva);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRetencionIva);
				this.jInternalFrameImportacionTipoRetencionIva.setVisible(false);
				this.jInternalFrameImportacionTipoRetencionIva.setSelected(false);


				this.jInternalFrameImportacionTipoRetencionIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRetencionIva"));
				this.jInternalFrameImportacionTipoRetencionIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRetencionIva"));
				this.jInternalFrameImportacionTipoRetencionIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRetencionIva"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRetencionIva() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRetencionIva==null) {
				this.jInternalFrameReporteDinamicoTipoRetencionIva=new ReporteDinamicoJInternalFrame(TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRetencionIva);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRetencionIva);
				this.jInternalFrameReporteDinamicoTipoRetencionIva.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRetencionIva.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRetencionIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRetencionIva"));
				this.jInternalFrameReporteDinamicoTipoRetencionIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRetencionIva"));
				this.jInternalFrameReporteDinamicoTipoRetencionIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRetencionIva"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRetencionIva();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaTarjetaCredito() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoRetencionIva.jContentPaneDetalleTipoRetencionIva.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTransaccionLocal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoRetencionIva.jContentPaneDetalleTipoRetencionIva.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoRetencionIva() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRetencionIva);
			
	       	this.jInternalFrameDetalleFormTipoRetencionIva.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRetencionIva.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRetencionIva.dispose();
			//this.jInternalFrameDetalleFormTipoRetencionIva=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRetencionIva() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRetencionIva.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRetencionIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRetencionIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRetencionIva.setVisible(true);
	        this.jInternalFrameImportacionTipoRetencionIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRetencionIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRetencionIva.setVisible(true);
	        this.jInternalFrameOrderByTipoRetencionIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRetencionIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRetencionIva.setVisible(false);
	        this.jInternalFrameOrderByTipoRetencionIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRetencionIva() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRetencionIva.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRetencionIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRetencionIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRetencionIva.setVisible(false);
	        this.jInternalFrameImportacionTipoRetencionIva.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRetencionIva(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRetencionIva(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRetencionIva(true);
			//this.isEsNuevoTipoRetencionIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRetencionIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRetencionIva(false) ;
			
			if(tiporetencionivaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getEsGuardarRelacionado() && TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTarjetaCreditoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoRetencionIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRetencionIva(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencionIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRetencionIvaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRetencionIva(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRetencionIva(true);
			//this.isEsNuevoTipoRetencionIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporetencioniva.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRetencionIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRetencionIva(false) ;
			
			if(TipoRetencionIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRetencionIva(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencionIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRetencionIva(false);
			
			//if(!this.isEsNuevoTipoRetencionIva) {								
				int intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.tiporetencioniva,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
				
			}
			
			if(this.permiteMantenimiento(this.tiporetencioniva)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRetencionIva=true;
					this.inicializarActualizarBindingTablaTipoRetencionIva(false);
					this.isEsNuevoTipoRetencionIva=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRetencionIva=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRetencionIva=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRetencionIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRetencionIva(false);
				
				this.habilitarDeshabilitarControlesTipoRetencionIva(false);
			
												
				
				if(TipoRetencionIvaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRetencionIva();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRetencionIvaActionPerformed(evt,tiporetencionivaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRetencionIva(this.tiporetencioniva,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRetencionIva.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporetencionivaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporetencioniva.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				this.tiporetencioniva.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				this.tiporetencioniva.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporetencioniva)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRetencionIvaModel) this.jTableDatosTipoRetencionIva.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRetencionIva=true;
				this.inicializarActualizarBindingTablaTipoRetencionIva(false);
				this.isEsNuevoTipoRetencionIva=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRetencionIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRetencionIva(false);
				
				this.habilitarDeshabilitarControlesTipoRetencionIva(false);
				
				
				
				if(TipoRetencionIvaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRetencionIva();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRetencionIva.getRowCount()>=1) {
				jTableDatosTipoRetencionIva.removeRowSelectionInterval(0, jTableDatosTipoRetencionIva.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRetencionIva(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRetencionIva(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRetencionIva(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencionIva(false) ;
			
			this.isEsNuevoTipoRetencionIva=false;
			
			if(TipoRetencionIvaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRetencionIva();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRetencionIva(false);
				
				//SI ES MANUAL
				if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRetencionIva();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRetencionIva--;			
			//TipoRetencionIva tiporetencionivaAux= new TipoRetencionIva();			
			//tiporetencionivaAux.setId(this.iIdNuevoTipoRetencionIva);
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRetencionIva();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
			
			this.tiporetencioniva.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporetencionivaLogic.getTipoRetencionIvas().add(this.tiporetencionivaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporetencionivas.add(this.tiporetencionivaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRetencionIva(false);
			
			this.jTableDatosTipoRetencionIva.setRowSelectionInterval(this.getIndiceNuevoTipoRetencionIva(), this.getIndiceNuevoTipoRetencionIva());
			
			int iLastRow =  this.jTableDatosTipoRetencionIva.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRetencionIva.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRetencionIva.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRetencionIva(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRetencionIva(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencionIva(false);
			
			//SI ES MANUAL
			if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRetencionIva();
			}
			
			//this.abrirFrameTreeTipoRetencionIva();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Retencion IvaS ?", "MANTENIMIENTO DE Tipo Retencion Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRetencionIva.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRetencionIva();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporetencionivaReturnGeneral=tiporetencionivaLogic.procesarImportacionTipoRetencionIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporetencionivaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRetencionIvaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRetencionIva.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRetencionIva.setFileImportacion(this.jInternalFrameImportacionTipoRetencionIva.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRetencionIva.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRetencionIva.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRetencionIva.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRetencionIva.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();		

		tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRetencionIvaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRetencionIvaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRetencionIvas("Todos",tiporetencionivasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Iva",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRetencionIvaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoRetencionIva.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRetencionIvaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRetencionIvaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRetencionIvaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();		
		
		tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencioniva";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRetencionIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRetencionIvaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionIvaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoRetencionIva tiporetencioniva:tiporetencionivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencioniva.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRetencionIva tiporetencioniva:tiporetencionivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencioniva.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoRetencionIva(row);				
			//	iRow++;
			//}				
			
			//for(TipoRetencionIva tiporetencionivaAux:tiporetencionivasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRetencionIva(tiporetencionivaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Iva",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporetencionivaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencionIva(false);
			
			//SI ES MANUAL
			if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRetencionIva();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencionIva(false);
			
			//SI ES MANUAL
			if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRetencionIva();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRetencionIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencionIva(false);
			
			//SI ES MANUAL
			if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRetencionIva();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRetencionIva() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRetencionIva.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRetencionIva.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRetencionIva.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRetencionIva.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRetencionIva.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRetencionIva.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRetencionIva.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRetencionIva(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRetencionIva(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRetencionIva(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRetencionIva(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRetencionIva(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRetencionIva(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencionIva(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRetencionIva(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRetencionIva() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRetencionIva();
		
		this.inicializarActualizarBindingBotonesManualTipoRetencionIva(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRetencionIva();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencionIva() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRetencionIva(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRetencionIva(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRetencionIva.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRetencionIva.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRetencionIva.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRetencionIva.jCheckBoxPostAccionNuevoTipoRetencionIva.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRetencionIva.jCheckBoxPostAccionSinCerrarTipoRetencionIva.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRetencionIva.jCheckBoxPostAccionSinMensajeTipoRetencionIva.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRetencionIva.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRetencionIva.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRetencionIva.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
				this.jInternalFrameDetalleFormTipoRetencionIva.jCheckBoxPostAccionNuevoTipoRetencionIva.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRetencionIva.jCheckBoxPostAccionSinCerrarTipoRetencionIva.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRetencionIva.jCheckBoxPostAccionSinMensajeTipoRetencionIva.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRetencionIva.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRetencionIva.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRetencionIva.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRetencionIva!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRetencionIva.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRetencionIva.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRetencionIva.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRetencionIva.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRetencionIva!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRetencionIva.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRetencionIva.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRetencionIva(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRetencionIva(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencionIva() throws Exception {
		try	{
			if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRetencionIva();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRetencionIva() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRetencionIva() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRetencionIva.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRetencionIva.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRetencionIva.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRetencionIva.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRetencionIva.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRetencionIva.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRetencionIva.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRetencionIva.addItem(reporte);
			}
			
			
			if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRetencionIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRetencionIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRetencionIva.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRetencionIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRetencionIva.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRetencionIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRetencionIva.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRetencionIva.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRetencionIva.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRetencionIva();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRetencionIva() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRetencionIva!=null) {
				this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRetencionIva!=null) {
				this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRetencionIva.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRetencionIva!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRetencionIva.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRetencionIva()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRetencionIva(Boolean esInicializar) throws Exception {				
		if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRetencionIva();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRetencionIva() throws Exception {
		this.inicializarActualizarBindingTablaTipoRetencionIva(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRetencionIva() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRetencionIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRetencionIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRetencionIvaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionIvaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRetencionIvaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRetencionIvaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRetencionIva(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporetencionivaLogic.getTipoRetencionIvas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporetencionivas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRetencionIva.setModel(new TipoRetencionIvaModel(this.tiporetencionivaLogic.getTipoRetencionIvas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRetencionIva.setModel(new TipoRetencionIvaModel(this.tiporetencionivas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRetencionIva!=null && this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRetencionIva();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRetencionIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionIva,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRetencionIvaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO,tiporetencionivaConstantesFunciones.resaltarSeleccionarTipoRetencionIva,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO,tiporetencionivaConstantesFunciones.resaltarSeleccionarTipoRetencionIva,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRetencionIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionIva,TipoRetencionIvaConstantesFunciones.LABEL_ID));

		if(this.tiporetencionivaConstantesFunciones.mostraridTipoRetencionIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionIvaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporetencionivaConstantesFunciones.resaltaridTipoRetencionIva,this.tiporetencionivaConstantesFunciones.activaridTipoRetencionIva,this,true,"idTipoRetencionIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionivaConstantesFunciones.resaltaridTipoRetencionIva,this.tiporetencionivaConstantesFunciones.activaridTipoRetencionIva,this,true,"idTipoRetencionIva","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionIva,TipoRetencionIvaConstantesFunciones.LABEL_CODIGO));

		if(this.tiporetencionivaConstantesFunciones.mostrarcodigoTipoRetencionIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionIvaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporetencionivaConstantesFunciones.resaltarcodigoTipoRetencionIva,this.tiporetencionivaConstantesFunciones.activarcodigoTipoRetencionIva,this,true,"codigoTipoRetencionIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionivaConstantesFunciones.resaltarcodigoTipoRetencionIva,this.tiporetencionivaConstantesFunciones.activarcodigoTipoRetencionIva,this,true,"codigoTipoRetencionIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRetencionIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionIva,TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporetencionivaConstantesFunciones.mostrarnombreTipoRetencionIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporetencionivaConstantesFunciones.resaltarnombreTipoRetencionIva,this.tiporetencionivaConstantesFunciones.activarnombreTipoRetencionIva,this,true,"nombreTipoRetencionIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionivaConstantesFunciones.resaltarnombreTipoRetencionIva,this.tiporetencionivaConstantesFunciones.activarnombreTipoRetencionIva,this,true,"nombreTipoRetencionIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRetencionIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTransaccionLocal && this.tiporetencionivaConstantesFunciones.mostrarTransaccionLocalTipoRetencionIva && !TipoRetencionIvaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Transaccion Locales");
				tableColumn.setHeaderValue("Transaccion Locales");
				tableColumn.setCellRenderer(new TransaccionLocalTableCell(tiporetencionivaConstantesFunciones.resaltarTransaccionLocalTipoRetencionIva,this,this.tiporetencionivaConstantesFunciones.activarTransaccionLocalTipoRetencionIva));
				tableColumn.setCellEditor(new TransaccionLocalTableCell(tiporetencionivaConstantesFunciones.resaltarTransaccionLocalTipoRetencionIva,this,this.tiporetencionivaConstantesFunciones.activarTransaccionLocalTipoRetencionIva));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoRetencionIva.addColumn(tableColumn);
			}

			if(this.isTienePermisosTarjetaCredito && this.tiporetencionivaConstantesFunciones.mostrarTarjetaCreditoTipoRetencionIva && !TipoRetencionIvaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Tarjeta Creditos");
				tableColumn.setHeaderValue("Tarjeta Creditos");
				tableColumn.setCellRenderer(new TarjetaCreditoTableCell(tiporetencionivaConstantesFunciones.resaltarTarjetaCreditoTipoRetencionIva,this,this.tiporetencionivaConstantesFunciones.activarTarjetaCreditoTipoRetencionIva));
				tableColumn.setCellEditor(new TarjetaCreditoTableCell(tiporetencionivaConstantesFunciones.resaltarTarjetaCreditoTipoRetencionIva,this,this.tiporetencionivaConstantesFunciones.activarTarjetaCreditoTipoRetencionIva));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoRetencionIva.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporetencionivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporetencionivaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRetencionIva.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporetencionivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporetencionivaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRetencionIva.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporetencionivaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporetencionivaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRetencionIva.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoRetencionIva.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRetencionIva.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRetencionIva.moveColumn(this.jTableDatosTipoRetencionIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRetencionIva.moveColumn(this.jTableDatosTipoRetencionIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoRetencionIva.moveColumn(this.jTableDatosTipoRetencionIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRetencionIva.moveColumn(this.jTableDatosTipoRetencionIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRetencionIva.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRetencionIva.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRetencionIva,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRetencionIva.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRetencionIva.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRetencionIva.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRetencionIva.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRetencionIva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporetencionivaLogic.getTipoRetencionIvas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporetencionivas.size()-1;
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
		//this.jTableDatosTipoRetencionIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRetencionIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRetencionIva();
			
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
				
				//this.isEsNuevoTipoRetencionIva=false;
					
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
				if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRetencionIva==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRetencionIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRetencionIva.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporetencioniva.getsType().equals("DUPLICADO")
				   || this.tiporetencioniva.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRetencionIva=true;
				
				} else {
					this.isEsNuevoTipoRetencionIva=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporetencioniva.getId()>=0 && !this.tiporetencioniva.getIsNew()) {						
						this.isEsNuevoTipoRetencionIva=false;
						
					} else {
						this.isEsNuevoTipoRetencionIva=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRetencionIva(esRelaciones);						
				
				this.seleccionarTipoRetencionIva(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporetencioniva.getId()<0) {
					this.isEsNuevoTipoRetencionIva=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRetencionIva(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRetencionIva(evt,rowIndex);
				}	
				
				if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRetencionIva: " + this.dDif); 
					}
				}								
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRetencionIva(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporetencioniva)) {
					if(this.tiporetencioniva.getId()>0) {
						this.tiporetencioniva.setIsDeleted(true);
						
						this.tiporetencionivasEliminados.add(this.tiporetencioniva);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporetencionivaLogic.getTipoRetencionIvas().remove(this.tiporetencioniva);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporetencionivas.remove(this.tiporetencioniva);				
					}
					
					
					((TipoRetencionIvaModel) this.jTableDatosTipoRetencionIva.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRetencionIva(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRetencionIva(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRetencionIva) {
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRetencionIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRetencionIva.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRetencionIva(this.tiporetencioniva);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRetencionIva("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRetencionIva(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRetencionIva() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRetencionIva(TipoRetencionIva tiporetencioniva) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRetencionIva(tiporetencioniva,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRetencionIva(TipoRetencionIva tiporetencioniva,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRetencionIva(tiporetencioniva);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRetencionIva(tiporetencioniva,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencionIva(tiporetencioniva);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRetencionIva(TipoRetencionIva tiporetencioniva) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.setText(tiporetencioniva.getId().toString());
			this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldcodigoTipoRetencionIva.setText(tiporetencioniva.getcodigo());
			this.jInternalFrameDetalleFormTipoRetencionIva.jTextAreanombreTipoRetencionIva.setText(tiporetencioniva.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRetencionIva tiporetencionivaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporetencionivaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRetencionIva tiporetencionivaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporetencionivaLocal=this.tiporetencioniva;
			} else {
				tiporetencionivaLocal=this.tiporetencionivaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporetencionivaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRetencionIva(tiporetencionivaLocal,true);
					
					if(tiporetencionivaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporetencionivaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporetencionivaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRetencionIva(TipoRetencionIva tiporetencioniva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRetencionIva(tiporetencioniva,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(tiporetencioniva);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRetencionIva(TipoRetencionIva tiporetencioniva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRetencionIva(tiporetencioniva,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRetencionIva(TipoRetencionIva tiporetencioniva,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.getText()==null || this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.getText()=="" || this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.setText("0");
			}

			if(conColumnasBase) {tiporetencioniva.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionIvaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionIva.jLabelIdTipoRetencionIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencioniva.setcodigo(this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldcodigoTipoRetencionIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionIvaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionIva.jLabelcodigoTipoRetencionIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencioniva.setnombre(this.jInternalFrameDetalleFormTipoRetencionIva.jTextAreanombreTipoRetencionIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionIva.jLabelnombreTipoRetencionIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRetencionIva(TipoRetencionIva tiporetencionivaBean,TipoRetencionIva tiporetencioniva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRetencionIva(TipoRetencionIva tiporetencionivaOrigen,TipoRetencionIva tiporetencioniva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporetencionivaOrigen.getId()!=null && !tiporetencionivaOrigen.getId().equals(0L))) {tiporetencioniva.setId(tiporetencionivaOrigen.getId());}}
			if(conDefault || (!conDefault && tiporetencionivaOrigen.getcodigo()!=null && !tiporetencionivaOrigen.getcodigo().equals(""))) {tiporetencioniva.setcodigo(tiporetencionivaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiporetencionivaOrigen.getnombre()!=null && !tiporetencionivaOrigen.getnombre().equals(""))) {tiporetencioniva.setnombre(tiporetencionivaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRetencionIva(TipoRetencionIva tiporetencioniva) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.setText(tiporetencioniva.getId().toString());
			this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldcodigoTipoRetencionIva.setText(tiporetencioniva.getcodigo());
			this.jInternalFrameDetalleFormTipoRetencionIva.jTextAreanombreTipoRetencionIva.setText(tiporetencioniva.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRetencionIva(TipoRetencionIvaBean tiporetencionivaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.setText(tiporetencionivaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldcodigoTipoRetencionIva.setText(tiporetencionivaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoRetencionIva.jTextAreanombreTipoRetencionIva.setText(tiporetencionivaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRetencionIva(TipoRetencionIvaParameterReturnGeneral tiporetencionivaReturnGeneral,TipoRetencionIvaBean tiporetencionivaBean,Boolean conDefault) throws Exception { 
		try {
			TipoRetencionIva tiporetencionivaLocal=new TipoRetencionIva();
			
			tiporetencionivaLocal=tiporetencionivaReturnGeneral.getTipoRetencionIva();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporetencionivaLocal.getId()!=null && !tiporetencionivaLocal.getId().equals(0L))) {tiporetencionivaBean.setId(tiporetencionivaLocal.getId());}}
			if(conDefault || (!conDefault && tiporetencionivaLocal.getcodigo()!=null && !tiporetencionivaLocal.getcodigo().equals(""))) {tiporetencionivaBean.setcodigo(tiporetencionivaLocal.getcodigo());}
			if(conDefault || (!conDefault && tiporetencionivaLocal.getnombre()!=null && !tiporetencionivaLocal.getnombre().equals(""))) {tiporetencionivaBean.setnombre(tiporetencionivaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRetencionIvaGenerico(Long idTipoRetencionIvaSeleccionado,JComboBox jComboBoxTipoRetencionIva,List<TipoRetencionIva> tiporetencionivasLocal)throws Exception {
		try {
			TipoRetencionIva  tiporetencionivaTemp=null;

			for(TipoRetencionIva tiporetencionivaAux:tiporetencionivasLocal) {
				if(tiporetencionivaAux.getId()!=null && tiporetencionivaAux.getId().equals(idTipoRetencionIvaSeleccionado)) {
					tiporetencionivaTemp=tiporetencionivaAux;
					break;
				}
			}

			jComboBoxTipoRetencionIva.setSelectedItem(tiporetencionivaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRetencionIvaGenerico(JComboBox jComboBoxTipoRetencionIva,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRetencionIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRetencionIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRetencionIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRetencionIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRetencionIva.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRetencionIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRetencionIva.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRetencionIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRetencionIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRetencionIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("TransaccionLocal")) {
			jButtonTransaccionLocalActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("TarjetaCredito")) {
			jButtonTarjetaCreditoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporetencioniva=(TipoRetencionIva) tiporetencionivaLogic.getTipoRetencionIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporetencioniva =(TipoRetencionIva) tiporetencionivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRetencionIva tiporetencionivaRow=new TipoRetencionIva();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporetencionivaRow=(TipoRetencionIva) tiporetencionivaLogic.getTipoRetencionIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporetencionivaRow=(TipoRetencionIva) tiporetencionivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTransaccionLocalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoRetencionIva tiporetencioniva) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoRetencionIva==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencioniva = (TipoRetencionIva)this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiporetencioniva = (TipoRetencionIva)this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiporetencioniva!=null) {
						this.tiporetencioniva = tiporetencioniva;
					} else {
						this.tiporetencioniva = new TipoRetencionIva();
					}
				}

				if(this.isTienePermisosTransaccionLocal && this.permiteMantenimiento(this.tiporetencioniva)) {
					TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFramePopup;
					} else {
						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame;
					}

					List<TipoRetencionIva> tiporetencionivas=new ArrayList<TipoRetencionIva>();
					tiporetencionivas.add(this.tiporetencioniva);
					if(!esRelacionado) {
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setConGuardarRelaciones(false);
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoRetencionIva.cargarTransaccionLocalBeanSwingJInternalFrame(tiporetencionivas,this.tiporetencioniva,transaccionlocalBeanSwingJInternalFrame,/*conInicializar,*/transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getConGuardarRelaciones(),transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado());
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");

						transaccionlocalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA + (TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA/2));

						transaccionlocalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoRetencionIva=(TitledBorder)this.jScrollPanelDatosTipoRetencionIva.getBorder();
						TitledBorder titledBorderTransaccionLocal=(TitledBorder)transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getBorder();

						titledBorderTransaccionLocal.setTitle(titledBorderTipoRetencionIva.getTitle() + " -> Transaccion Local");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,transaccionlocalBeanSwingJInternalFrame);
						}

						transaccionlocalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(transaccionlocalBeanSwingJInternalFrame);

						transaccionlocalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Transaccion Local",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonTarjetaCreditoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoRetencionIva tiporetencioniva) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoRetencionIva==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencioniva = (TipoRetencionIva)this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiporetencioniva = (TipoRetencionIva)this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiporetencioniva!=null) {
						this.tiporetencioniva = tiporetencioniva;
					} else {
						this.tiporetencioniva = new TipoRetencionIva();
					}
				}

				if(this.isTienePermisosTarjetaCredito && this.permiteMantenimiento(this.tiporetencioniva)) {
					TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFramePopup=new TarjetaCreditoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tarjetacreditoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFramePopup;
					} else {
						tarjetacreditoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame;
					}

					List<TipoRetencionIva> tiporetencionivas=new ArrayList<TipoRetencionIva>();
					tiporetencionivas.add(this.tiporetencioniva);
					if(!esRelacionado) {
						//tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setConGuardarRelaciones(false);
						//tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tarjetacreditoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoRetencionIva.cargarTarjetaCreditoBeanSwingJInternalFrame(tiporetencionivas,this.tiporetencioniva,tarjetacreditoBeanSwingJInternalFrame,/*conInicializar,*/tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getConGuardarRelaciones(),tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.getEsGuardarRelacionado());
					tarjetacreditoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCredito("no_relacionado");

						tarjetacreditoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TarjetaCreditoConstantesFunciones.ITAMANIOFILATABLA + (TarjetaCreditoConstantesFunciones.ITAMANIOFILATABLA/2));

						tarjetacreditoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoRetencionIva=(TitledBorder)this.jScrollPanelDatosTipoRetencionIva.getBorder();
						TitledBorder titledBorderTarjetaCredito=(TitledBorder)tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.getBorder();

						titledBorderTarjetaCredito.setTitle(titledBorderTipoRetencionIva.getTitle() + " -> Tarjeta Credito");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tarjetacreditoBeanSwingJInternalFrame);
						}

						tarjetacreditoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tarjetacreditoBeanSwingJInternalFrame);

						tarjetacreditoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Tarjeta Credito",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRetencionIva(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRetencionIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionIva && this.isPermisoNuevoTipoRetencionIva));			
			this.jButtonDuplicarTipoRetencionIva.setVisible((this.isVisibilidadCeldaDuplicarTipoRetencionIva && this.isPermisoDuplicarTipoRetencionIva));			
			this.jButtonCopiarTipoRetencionIva.setVisible((this.isVisibilidadCeldaCopiarTipoRetencionIva && this.isPermisoCopiarTipoRetencionIva));
			this.jButtonVerFormTipoRetencionIva.setVisible((this.isVisibilidadCeldaVerFormTipoRetencionIva && this.isPermisoVerFormTipoRetencionIva));
			
			this.jButtonAbrirOrderByTipoRetencionIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionIva && this.isPermisoOrdenTipoRetencionIva));			
			
			this.jButtonNuevoRelacionesTipoRetencionIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva && this.isPermisoNuevoTipoRetencionIva));			
			this.jButtonNuevoGuardarCambiosTipoRetencionIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionIva && this.isPermisoNuevoTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva));
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonModificarTipoRetencionIva.setVisible((this.isVisibilidadCeldaModificarTipoRetencionIva && this.isPermisoActualizarTipoRetencionIva));	
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonActualizarTipoRetencionIva.setVisible((this.isVisibilidadCeldaActualizarTipoRetencionIva && this.isPermisoActualizarTipoRetencionIva));	
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonEliminarTipoRetencionIva.setVisible((this.isVisibilidadCeldaEliminarTipoRetencionIva && this.isPermisoEliminarTipoRetencionIva));
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonCancelarTipoRetencionIva.setVisible(this.isVisibilidadCeldaCancelarTipoRetencionIva);							
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosTipoRetencionIva.setVisible((this.isVisibilidadCeldaGuardarTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRetencionIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionIva && this.isPermisoNuevoTipoRetencionIva));						
			this.jButtonDuplicarToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaDuplicarTipoRetencionIva && this.isPermisoDuplicarTipoRetencionIva));						
			this.jButtonCopiarToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaCopiarTipoRetencionIva && this.isPermisoCopiarTipoRetencionIva));			
			this.jButtonVerFormToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaVerFormTipoRetencionIva && this.isPermisoVerFormTipoRetencionIva));			
			this.jButtonAbrirOrderByToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionIva && this.isPermisoOrdenTipoRetencionIva));
			this.jButtonNuevoRelacionesToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva && this.isPermisoNuevoTipoRetencionIva));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionIva && this.isPermisoNuevoTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva));			
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonModificarToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaModificarTipoRetencionIva && this.isPermisoActualizarTipoRetencionIva));	
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonActualizarToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaActualizarTipoRetencionIva  && this.isPermisoActualizarTipoRetencionIva));	
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonEliminarToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaEliminarTipoRetencionIva && this.isPermisoEliminarTipoRetencionIva));
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonCancelarToolBarTipoRetencionIva.setVisible(this.isVisibilidadCeldaCancelarTipoRetencionIva);				
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaGuardarTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRetencionIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRetencionIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionIva && this.isPermisoNuevoTipoRetencionIva));			
			this.jMenuItemDuplicarTipoRetencionIva.setVisible((this.isVisibilidadCeldaDuplicarTipoRetencionIva && this.isPermisoDuplicarTipoRetencionIva));			
			this.jMenuItemCopiarTipoRetencionIva.setVisible((this.isVisibilidadCeldaCopiarTipoRetencionIva && this.isPermisoCopiarTipoRetencionIva));			
			this.jMenuItemVerFormTipoRetencionIva.setVisible((this.isVisibilidadCeldaVerFormTipoRetencionIva && this.isPermisoVerFormTipoRetencionIva));			
			this.jMenuItemAbrirOrderByTipoRetencionIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionIva && this.isPermisoOrdenTipoRetencionIva));			
			//this.jMenuItemMostrarOcultarTipoRetencionIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionIva && this.isPermisoOrdenTipoRetencionIva));
			this.jMenuItemDetalleAbrirOrderByTipoRetencionIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionIva && this.isPermisoOrdenTipoRetencionIva));			
			//this.jMenuItemDetalleMostrarOcultarTipoRetencionIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionIva && this.isPermisoOrdenTipoRetencionIva));			
			this.jMenuItemNuevoRelacionesTipoRetencionIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva && this.isPermisoNuevoTipoRetencionIva));			
			this.jMenuItemNuevoGuardarCambiosTipoRetencionIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionIva && this.isPermisoNuevoTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva));									
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemModificarTipoRetencionIva.setVisible((this.isVisibilidadCeldaModificarTipoRetencionIva && this.isPermisoActualizarTipoRetencionIva));	
			this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemActualizarTipoRetencionIva.setVisible((this.isVisibilidadCeldaActualizarTipoRetencionIva && this.isPermisoActualizarTipoRetencionIva));	
			this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemEliminarTipoRetencionIva.setVisible((this.isVisibilidadCeldaEliminarTipoRetencionIva && this.isPermisoEliminarTipoRetencionIva));
			this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemCancelarTipoRetencionIva.setVisible(this.isVisibilidadCeldaCancelarTipoRetencionIva);				
			}
			
			this.jMenuItemGuardarCambiosTipoRetencionIva.setVisible((this.isVisibilidadCeldaGuardarTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva));						
			this.jMenuItemGuardarCambiosTablaTipoRetencionIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRetencionIva=this.jButtonNuevoTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRetencionIva=this.jButtonDuplicarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaCopiarTipoRetencionIva=this.jButtonCopiarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaVerFormTipoRetencionIva=this.jButtonVerFormTipoRetencionIva.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRetencionIva=this.jButtonAbrirOrderByTipoRetencionIva.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=this.jButtonNuevoRelacionesTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaModificarTipoRetencionIva=this.jButtonModificarTipoRetencionIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			this.isVisibilidadCeldaActualizarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jButtonActualizarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jButtonEliminarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jButtonCancelarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaGuardarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosTipoRetencionIva.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=this.jButtonGuardarCambiosTablaTipoRetencionIva.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRetencionIva=this.jButtonNuevoToolBarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=this.jButtonNuevoRelacionesToolBarTipoRetencionIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			this.isVisibilidadCeldaModificarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jButtonModificarToolBarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaActualizarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jButtonActualizarToolBarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jButtonEliminarToolBarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jButtonCancelarToolBarTipoRetencionIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRetencionIva=this.jButtonGuardarCambiosToolBarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=this.jButtonGuardarCambiosTablaToolBarTipoRetencionIva.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRetencionIva=this.jMenuItemNuevoTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=this.jMenuItemNuevoRelacionesTipoRetencionIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			this.isVisibilidadCeldaModificarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemModificarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaActualizarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemActualizarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemEliminarTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoRetencionIva=this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemCancelarTipoRetencionIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRetencionIva=this.jMenuItemGuardarCambiosTipoRetencionIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=this.jMenuItemGuardarCambiosTablaTipoRetencionIva.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRetencionIva(Boolean esInicializar) {
		if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRetencionIva();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRetencionIva(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRetencionIva() {
		this.jButtonNuevoTipoRetencionIva.setVisible(this.isPermisoNuevoTipoRetencionIva);			
		this.jButtonDuplicarTipoRetencionIva.setVisible(this.isPermisoDuplicarTipoRetencionIva);			
		this.jButtonCopiarTipoRetencionIva.setVisible(this.isPermisoCopiarTipoRetencionIva);			
		this.jButtonVerFormTipoRetencionIva.setVisible(this.isPermisoVerFormTipoRetencionIva);			
		
		this.jButtonAbrirOrderByTipoRetencionIva.setVisible(this.isPermisoOrdenTipoRetencionIva);					
		
		this.jButtonNuevoRelacionesTipoRetencionIva.setVisible(this.isPermisoNuevoTipoRetencionIva);			
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonModificarTipoRetencionIva.setVisible(this.isPermisoActualizarTipoRetencionIva);	
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonActualizarTipoRetencionIva.setVisible(this.isPermisoActualizarTipoRetencionIva);	
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonEliminarTipoRetencionIva.setVisible(this.isPermisoEliminarTipoRetencionIva);
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonCancelarTipoRetencionIva.setVisible(this.isVisibilidadCeldaCancelarTipoRetencionIva);						
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosTipoRetencionIva.setVisible(this.isPermisoGuardarCambiosTipoRetencionIva);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRetencionIva.setVisible(this.isPermisoActualizarTipoRetencionIva);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRetencionIva() {
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonModificarTipoRetencionIva.setVisible(this.isPermisoActualizarTipoRetencionIva);	
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonActualizarTipoRetencionIva.setVisible(this.isPermisoActualizarTipoRetencionIva);	
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonEliminarTipoRetencionIva.setVisible(this.isPermisoEliminarTipoRetencionIva);
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonCancelarTipoRetencionIva.setVisible(this.isVisibilidadCeldaCancelarTipoRetencionIva);							
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosTipoRetencionIva.setVisible((this.isVisibilidadCeldaGuardarTipoRetencionIva && this.isPermisoGuardarCambiosTipoRetencionIva));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRetencionIva() {
		if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRetencionIva();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRetencionIva() {
	}
	
	public void jTableDatosTipoRetencionIvaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRetencionIva(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRetencionIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.gettiporetencioniva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencioniva==null) {
						this.tiporetencioniva = new TipoRetencionIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.tiporetencioniva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
				}

				if(this.tiporetencioniva.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporetencioniva.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoRetencionIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.gettiporetencioniva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencioniva==null) {
						this.tiporetencioniva = new TipoRetencionIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.tiporetencioniva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
				}

				if(this.tiporetencioniva.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiporetencioniva.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRetencionIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.gettiporetencioniva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencioniva==null) {
						this.tiporetencioniva = new TipoRetencionIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.tiporetencioniva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);
				}

				if(this.tiporetencioniva.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporetencioniva.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoRetencionIva() {
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
		

		if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
			this.jInternalFrameDetalleFormTipoRetencionIva.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRetencionIva.dispose();
			this.jInternalFrameDetalleFormTipoRetencionIva=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRetencionIva!=null) {
			this.jInternalFrameReporteDinamicoTipoRetencionIva.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRetencionIva.dispose();
			this.jInternalFrameReporteDinamicoTipoRetencionIva=null;
		}
		
		if(this.jInternalFrameImportacionTipoRetencionIva!=null) {
			this.jInternalFrameImportacionTipoRetencionIva.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRetencionIva.dispose();
			this.jInternalFrameImportacionTipoRetencionIva=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRetencionIva();
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRetencionIva")) {
				jButtonNuevoTipoRetencionIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRetencionIva")) {
				jButtonDuplicarTipoRetencionIvaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRetencionIva")) {
				jButtonCopiarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRetencionIva")) {
				jButtonVerFormTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRetencionIva")) {
				jButtonNuevoTipoRetencionIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRetencionIva")) {
				jButtonDuplicarTipoRetencionIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRetencionIva")) {
				jButtonNuevoTipoRetencionIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRetencionIva")) {
				jButtonDuplicarTipoRetencionIvaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRetencionIva")) {
				jButtonNuevoTipoRetencionIvaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRetencionIva")) {
				jButtonNuevoTipoRetencionIvaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRetencionIva")) {
				jButtonNuevoTipoRetencionIvaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRetencionIva")) {
				jButtonModificarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRetencionIva")) {
				jButtonModificarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRetencionIva")) {
				jButtonModificarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRetencionIva")) {
				jButtonActualizarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRetencionIva")) {
				jButtonActualizarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRetencionIva")) {
				jButtonActualizarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRetencionIva")) {
				jButtonEliminarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRetencionIva")) {
				jButtonEliminarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRetencionIva")) {
				jButtonEliminarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRetencionIva")) {
				jButtonCancelarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRetencionIva")) {
				jButtonCancelarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRetencionIva")) {
				jButtonCancelarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRetencionIva")) {
				jButtonCerrarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRetencionIva")) {
				jButtonCerrarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRetencionIva")) {
				jButtonCerrarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRetencionIva")) {
				jButtonMostrarOcultarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRetencionIva")) {
				jButtonCancelarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRetencionIva")) {
				jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRetencionIva")) {
				jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRetencionIva")) {
				jButtonCopiarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRetencionIva")) {
				jButtonVerFormTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRetencionIva")) {
				jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRetencionIva")) {
				jButtonCopiarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRetencionIva")) {
				jButtonVerFormTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRetencionIva")) {
				jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRetencionIva")) {
				jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRetencionIva")) {
				jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRetencionIva")) {
				jButtonRecargarInformacionTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRetencionIva")) {
				jButtonRecargarInformacionTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRetencionIva")) {
				jButtonRecargarInformacionTipoRetencionIvaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRetencionIva")) {
				jButtonAnterioresTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRetencionIva")) {
				jButtonAnterioresTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRetencionIva")) {
				jButtonAnterioresTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRetencionIva")) {
				jButtonSiguientesTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRetencionIva")) {
				jButtonSiguientesTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRetencionIva")) {
				jButtonSiguientesTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRetencionIva") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRetencionIva")) {
				jButtonAbrirOrderByTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRetencionIva") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRetencionIva")) {
				jButtonMostrarOcultarTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRetencionIva")) {
				jButtonNuevoGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRetencionIva")) {
				jButtonNuevoGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRetencionIva")) {
				jButtonNuevoGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRetencionIva")) {
				jButtonCerrarReporteDinamicoTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRetencionIva")) {
				jButtonGenerarReporteDinamicoTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRetencionIva")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRetencionIva")) {
				jButtonCerrarImportacionTipoRetencionIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRetencionIva")) {
				
				jButtonGenerarImportacionTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRetencionIva")) {
				
				jButtonAbrirImportacionTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRetencionIva")) {
				jComboBoxTiposAccionesTipoRetencionIvaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRetencionIva")) {
				jComboBoxTiposRelacionesTipoRetencionIvaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRetencionIva")) {
				jComboBoxTiposAccionesTipoRetencionIvaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRetencionIva")) {
				
				jComboBoxTiposSeleccionarTipoRetencionIvaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRetencionIva")) {
				jTextFieldValorCampoGeneralTipoRetencionIvaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRetencionIva")) {
				jButtonAbrirOrderByTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRetencionIva")) {
				jButtonAbrirOrderByTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRetencionIva")) {
				jButtonCerrarOrderByTipoRetencionIvaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRetencionIvaBusqueda")) {
				this.jButtonidTipoRetencionIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRetencionIvaBusqueda")) {
				this.jButtoncodigoTipoRetencionIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRetencionIvaBusqueda")) {
				this.jButtonnombreTipoRetencionIvaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRetencionIva();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				


				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRetencionIva tiporetencionivaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporetencionivaLocal=this.tiporetencioniva;
			} else {
				tiporetencionivaLocal=this.tiporetencionivaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
							
				
				


				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
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
			
			


			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
								
						
				


				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
								
				
				


				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
							
				
				


				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
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
			
			


			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionIvaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
								
				
				


				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRetencionIva")) {
					jCheckBoxSeleccionarTodosTipoRetencionIvaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRetencionIva")) {
					jCheckBoxSeleccionadosTipoRetencionIvaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRetencionIva")) {
					
				}
				
				


				
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
												
				
				


				
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionIvaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
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
			
			


			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencioniva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencioniva);
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
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
				
				


				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionIva.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionivaAnterior =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRetencionIva")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRetencionIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRetencionIva.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporetencioniva =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporetencioniva);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRetencionIva")) {
				
				}
				
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRetencionIva")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRetencionIva.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRetencionIva")) {
			
			}
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRetencionIva();
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRetencionIva")) {
				jButtonNuevoTipoRetencionIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRetencionIva")) {
				jButtonDuplicarTipoRetencionIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRetencionIva")) {
				jButtonCopiarTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRetencionIva")) {
				jButtonVerFormTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRetencionIva")) {
				jButtonNuevoTipoRetencionIvaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRetencionIva")) {
				jButtonModificarTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRetencionIva")) {
				jButtonActualizarTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRetencionIva")) {
				jButtonEliminarTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRetencionIva")) {
				jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRetencionIva")) {
				jButtonCancelarTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRetencionIva")) {
				jButtonCerrarTipoRetencionIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRetencionIva")) {
				jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRetencionIva")) {
				jButtonNuevoGuardarCambiosTipoRetencionIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRetencionIva")) {
				jButtonAbrirOrderByTipoRetencionIvaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRetencionIva")) {
				jButtonRecargarInformacionTipoRetencionIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRetencionIva")) {
				jButtonAnterioresTipoRetencionIvaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRetencionIva")) {
				jButtonSiguientesTipoRetencionIvaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRetencionIvaBusqueda")) {
				this.jButtonidTipoRetencionIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRetencionIvaBusqueda")) {
				this.jButtoncodigoTipoRetencionIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRetencionIvaBusqueda")) {
				this.jButtonnombreTipoRetencionIvaBusquedaActionPerformed(evt);
			}
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRetencionIva();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRetencionIva")) {
				closingInternalFrameTipoRetencionIva();
				
			} else if(sTipo.equals("jButtonCancelarTipoRetencionIva")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRetencionIva = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRetencionIvaBeanSwingJInternalFrame jInternalFrameParent=(TipoRetencionIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRetencionIva.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRetencionIvaActionPerformed(null);
			}
			
			TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporetencioniva,new Object(),this.tiporetencionivaParameterGeneral,this.tiporetencionivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRetencionIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRetencionIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRetencionIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporetencioniva)) {
			if(!esControlTabla) {
				if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.tiporetencioniva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);			
				}
				
				if(this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRetencionIva(this.tiporetencioniva,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporetencionivaReturnGeneral=tiporetencionivaLogic.procesarEventosTipoRetencionIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencionivaLogic.getTipoRetencionIvas(),this.tiporetencioniva,this.tiporetencionivaParameterGeneral,this.isEsNuevoTipoRetencionIva,classes);//this.tiporetencionivaLogic.getTipoRetencionIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRetencionIva(this.tiporetencionivaReturnGeneral,this.tiporetencionivaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRetencionIva(classes,this.tiporetencionivaReturnGeneral,this.tiporetencionivaBean,false);
					}
						
					if(this.tiporetencionivaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencionIva(this.tiporetencionivaReturnGeneral.getTipoRetencionIva());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRetencionIva(this.tiporetencionivaReturnGeneral.getTipoRetencionIva());	
					}
						
					if(this.tiporetencionivaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRetencionIva(this.tiporetencionivaReturnGeneral.getTipoRetencionIva(),classes);//this.tiporetencionivaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRetencionIva(this.tiporetencioniva,classes);//this.tiporetencionivaBean);									
				}
			
				if(TipoRetencionIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRetencionIva(this.tiporetencioniva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionIva(this.tiporetencioniva);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporetencionivaAnterior!=null) {
						this.tiporetencioniva=this.tiporetencionivaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporetencionivaReturnGeneral=tiporetencionivaLogic.procesarEventosTipoRetencionIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencionivaLogic.getTipoRetencionIvas(),this.tiporetencioniva,this.tiporetencionivaParameterGeneral,this.isEsNuevoTipoRetencionIva,classes);//this.tiporetencionivaLogic.getTipoRetencionIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporetencionivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporetencionivaReturnGeneral.getTipoRetencionIva(),tiporetencionivaLogic.getTipoRetencionIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporetencionivaReturnGeneral.getTipoRetencionIva(),this.tiporetencionivas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRetencionIva.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRetencionIva.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRetencionIva();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRetencionIva() throws Exception {
		
		TipoRetencionIvaModel tiporetencionivaModel=(TipoRetencionIvaModel)this.jTableDatosTipoRetencionIva.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporetencionivaModel.tiporetencionivas=this.tiporetencionivaLogic.getTipoRetencionIvas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporetencionivaModel.tiporetencionivas=this.tiporetencionivas;
		}
		
		
		((TipoRetencionIvaModel) this.jTableDatosTipoRetencionIva.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRetencionIva() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporetencionivaAnterior(),this.tiporetencionivaLogic.getTipoRetencionIvas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporetencionivaAnterior(),this.tiporetencionivas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRetencionIva();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRetencionIva(TipoRetencionIva tiporetencioniva,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(tiporetencioniva.getTransaccionLocals());
					this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCredito.class)) {
					this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(tiporetencioniva.getTarjetaCreditos());
					this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
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
										
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencioniva,new Object(),generalEntityParameterGeneral,this.tiporetencionivaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRetencionIvaConstantesFunciones.getClassesRelationshipsOfTipoRetencionIva(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRetencionIvaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRetencionIva(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRetencionIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRetencionIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencioniva,new Object(),generalEntityParameterGeneral,this.tiporetencionivaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRetencionIva(TipoRetencionIvaBean tiporetencionivaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(tiporetencioniva.getTransaccionLocals());
					this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCredito.class)) {
					this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.setTarjetaCreditos(tiporetencioniva.getTarjetaCreditos());
					this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRetencionIva(ArrayList<Classe> classes,TipoRetencionIvaReturnGeneral tiporetencionivaReturnGeneral,TipoRetencionIvaBean tiporetencionivaBean,Boolean conDefault) throws Exception {
		
			this.tiporetencionivaBean.setTransaccionLocals(tiporetencionivaReturnGeneral.getTipoRetencionIva().getTransaccionLocals());
			this.tiporetencionivaBean.setTarjetaCreditos(tiporetencionivaReturnGeneral.getTipoRetencionIva().getTarjetaCreditos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRetencionIva(TipoRetencionIva tiporetencioniva,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					tiporetencioniva.setTransaccionLocals(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCredito.class)) {
					tiporetencioniva.setTarjetaCreditos(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoLogic.getTarjetaCreditos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tiporetencioniva)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRetencionIva = new TipoRetencionIvaDetalleFormJInternalFrame(jDesktopPane,this.tiporetencionivaSessionBean.getConGuardarRelaciones(),this.tiporetencionivaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRetencionIva);
		this.jInternalFrameDetalleFormTipoRetencionIva.setVisible(false);
		this.jInternalFrameDetalleFormTipoRetencionIva.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRetencionIva.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRetencionIva.tiporetencionivaLogic=this.tiporetencionivaLogic;
		
		this.cargarCombosFrameForeignKeyTipoRetencionIva("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRetencionIva();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRetencionIva();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRetencionIva("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRetencionIva();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRetencionIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRetencionIva"));
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonModificarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"ModificarTipoRetencionIva"));

		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonModificarToolBarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRetencionIva"));
					
		this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemModificarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRetencionIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonActualizarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"ActualizarTipoRetencionIva"));
		
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonActualizarToolBarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRetencionIva"));
						
		this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemActualizarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRetencionIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonEliminarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"EliminarTipoRetencionIva"));
		
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonEliminarToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRetencionIva"));
								
		this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemEliminarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRetencionIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonCancelarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"CancelarTipoRetencionIva"));
		
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonCancelarToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRetencionIva"));
					
		this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemCancelarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRetencionIva"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemDetalleCerrarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRetencionIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRetencionIva"));
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRetencionIva"));
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRetencionIva"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonidTipoRetencionIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRetencionIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtoncodigoTipoRetencionIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRetencionIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonnombreTipoRetencionIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRetencionIvaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRetencionIva"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRetencionIva"));
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRetencionIva"));
		}
		
		this.jTableDatosTipoRetencionIva.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRetencionIva"));
		
		this.jTableDatosTipoRetencionIva.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRetencionIva"));
		
		this.jButtonNuevoTipoRetencionIva.addActionListener(new ButtonActionListener(this,"NuevoTipoRetencionIva"));
		
		this.jButtonDuplicarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"DuplicarTipoRetencionIva"));
		
		this.jButtonCopiarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"CopiarTipoRetencionIva"));
		
		this.jButtonVerFormTipoRetencionIva.addActionListener(new ButtonActionListener(this,"VerFormTipoRetencionIva"));
		
		
		this.jButtonNuevoToolBarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRetencionIva"));
			
		this.jButtonDuplicarToolBarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRetencionIva"));
			
		this.jMenuItemNuevoTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRetencionIva"));
			
		this.jMenuItemDuplicarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRetencionIva"));		
		
		
		this.jButtonNuevoRelacionesTipoRetencionIva.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRetencionIva"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRetencionIva"));
			
		this.jMenuItemNuevoRelacionesTipoRetencionIva.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRetencionIva"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonModificarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"ModificarTipoRetencionIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonModificarToolBarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRetencionIva"));
			
			this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemModificarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRetencionIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonActualizarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"ActualizarTipoRetencionIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonActualizarToolBarTipoRetencionIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRetencionIva"));
				
			this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemActualizarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRetencionIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonEliminarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"EliminarTipoRetencionIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonEliminarToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRetencionIva"));
						
			this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemEliminarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRetencionIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonCancelarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"CancelarTipoRetencionIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonCancelarToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRetencionIva"));
			
			this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemCancelarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRetencionIva"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRetencionIva"));		
		
		
		this.jButtonCerrarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"CerrarTipoRetencionIva"));
		
		
		this.jButtonCerrarToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRetencionIva"));
			
		this.jMenuItemCerrarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRetencionIva"));
			
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jMenuItemDetalleCerrarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRetencionIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosTipoRetencionIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRetencionIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRetencionIva"));
		}
		
		this.jButtonCopiarToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRetencionIva"));
			
		this.jButtonVerFormToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRetencionIva"));
		
		this.jMenuItemGuardarCambiosTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRetencionIva"));
			
		this.jMenuItemCopiarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRetencionIva"));		
		
		this.jMenuItemVerFormTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRetencionIva"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRetencionIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRetencionIva"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRetencionIva"));
			
		this.jMenuItemGuardarCambiosTablaTipoRetencionIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRetencionIva"));		
		
		
		
		this.jButtonRecargarInformacionTipoRetencionIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRetencionIva"));
					
		this.jButtonRecargarInformacionToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRetencionIva"));
		
		this.jMenuItemRecargarInformacionTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRetencionIva"));		
		
		
		
		this.jButtonAnterioresTipoRetencionIva.addActionListener (new ButtonActionListener(this,"AnterioresTipoRetencionIva"));
		
		
		this.jButtonAnterioresToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRetencionIva"));
		
		this.jMenuItemAnterioresTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRetencionIva"));		
		
		
		this.jButtonSiguientesTipoRetencionIva.addActionListener (new ButtonActionListener(this,"SiguientesTipoRetencionIva"));
		
		
		this.jButtonSiguientesToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRetencionIva"));
			
		this.jMenuItemSiguientesTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRetencionIva"));
			
		this.jMenuItemAbrirOrderByTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRetencionIva"));
			
		this.jMenuItemMostrarOcultarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRetencionIva"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRetencionIva"));
			
		this.jMenuItemDetalleMostarOcultarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRetencionIva"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRetencionIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRetencionIva"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRetencionIva"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRetencionIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRetencionIva"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRetencionIva.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRetencionIva"));

		this.jCheckBoxSeleccionadosTipoRetencionIva.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRetencionIva"));
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRetencionIva"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRetencionIva.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRetencionIva"));
			
		this.jComboBoxTiposAccionesTipoRetencionIva.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRetencionIva"));
					
		this.jComboBoxTiposSeleccionarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRetencionIva"));
			
		this.jTextFieldValorCampoGeneralTipoRetencionIva.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRetencionIva"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonidTipoRetencionIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRetencionIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtoncodigoTipoRetencionIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRetencionIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonnombreTipoRetencionIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRetencionIvaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRetencionIva!=null) {
				this.jInternalFrameReporteDinamicoTipoRetencionIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRetencionIva"));
				this.jInternalFrameReporteDinamicoTipoRetencionIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRetencionIva"));
				this.jInternalFrameReporteDinamicoTipoRetencionIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRetencionIva"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRetencionIva.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRetencionIva"));				
			//this.jButtonGenerarReporteDinamicoTipoRetencionIva.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRetencionIva"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRetencionIva.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRetencionIva"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRetencionIva!=null) {
				this.jInternalFrameImportacionTipoRetencionIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRetencionIva"));
				this.jInternalFrameImportacionTipoRetencionIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRetencionIva"));
				this.jInternalFrameImportacionTipoRetencionIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRetencionIva"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRetencionIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRetencionIva"));
			
			this.jButtonAbrirOrderByToolBarTipoRetencionIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRetencionIva"));			
			
			if(this.jInternalFrameOrderByTipoRetencionIva!=null) {
				this.jInternalFrameOrderByTipoRetencionIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRetencionIva"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionIva.jTabbedPaneRelacionesTipoRetencionIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRetencionIva"));
		
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
            		closingInternalFrameTipoRetencionIva();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRetencionIva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRetencionIva = (JInternalFrameBase)event.getSource();
	            	
	            TipoRetencionIvaBeanSwingJInternalFrame jInternalFrameParent=(TipoRetencionIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRetencionIva.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRetencionIvaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRetencionIva.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRetencionIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRetencionIva.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRetencionIva.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRetencionIva";
		inputMap = this.jButtonNuevoTipoRetencionIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRetencionIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRetencionIvaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRetencionIva";
		inputMap = this.jButtonNuevoRelacionesTipoRetencionIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRetencionIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRetencionIvaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRetencionIva";
		inputMap = this.jButtonModificarTipoRetencionIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRetencionIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRetencionIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRetencionIva";
		inputMap = this.jButtonActualizarTipoRetencionIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRetencionIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRetencionIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRetencionIva";
		inputMap = this.jButtonEliminarTipoRetencionIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRetencionIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRetencionIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRetencionIva";
		inputMap = this.jButtonCancelarTipoRetencionIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRetencionIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRetencionIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRetencionIva";
		inputMap = this.jButtonCerrarTipoRetencionIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRetencionIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRetencionIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRetencionIva";
		inputMap = this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosTipoRetencionIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonGuardarCambiosTipoRetencionIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRetencionIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRetencionIva.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRetencionIvaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRetencionIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRetencionIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRetencionIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRetencionIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRetencionIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRetencionIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonidTipoRetencionIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRetencionIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtoncodigoTipoRetencionIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRetencionIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionIva.jButtonnombreTipoRetencionIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRetencionIvaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRetencionIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRetencionIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRetencionIvaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRetencionIva.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRetencionIva(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivaLogic.getTipoRetencionIvas()) {
					tiporetencionivaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencionIva tiporetencionivaAux:tiporetencionivas) {
					tiporetencionivaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRetencionIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRetencionIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivaLogic.getTipoRetencionIvas()) {
						tiporetencionivaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRetencionIva tiporetencionivaAux:tiporetencionivas) {
						tiporetencionivaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivaLogic.getTipoRetencionIvas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRetencionIva tiporetencionivaAux:tiporetencionivas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRetencionIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRetencionIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRetencionIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRetencionIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRetencionIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRetencionIva.getSelectedRows();
			
			TipoRetencionIva tiporetencionivaLocal=new TipoRetencionIva();
			
			//this.seleccionarTodosTipoRetencionIva(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionivaLocal =(TipoRetencionIva) this.tiporetencionivaLogic.getTipoRetencionIvas().toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporetencionivaLocal =(TipoRetencionIva) this.tiporetencionivas.toArray()[this.jTableDatosTipoRetencionIva.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporetencionivaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivaLogic.getTipoRetencionIvas()) {
						tiporetencionivaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRetencionIva tiporetencionivaAux:tiporetencionivas) {
						tiporetencionivaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRetencionIva(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRetencionIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRetencionIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRetencionIvaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRetencionIvaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRetencionIvaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRetencionIva(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRetencionIva.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivaLogic.getTipoRetencionIvas()) {
				
						if(sTipoSeleccionar.equals(TipoRetencionIvaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporetencionivaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporetencionivaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencionIva tiporetencionivaAux:tiporetencionivas) {
					
						if(sTipoSeleccionar.equals(TipoRetencionIvaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporetencionivaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporetencionivaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRetencionIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRetencionIvaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRetencionIva(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRetencionIva=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRetencionIva.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRetencionIva) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRetencionIva(conSplash);
				
					this.generarReporteTipoRetencionIvasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRetencionIvasSeleccionados();
				//this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRetencionIvasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRetencionIvasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRetencionIva();
				
				this.exportarTipoRetencionIvasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRetencionIvas();
				//this.importarTipoRetencionIvas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRetencionIva();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRetencionIvasSeleccionados();
				//this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Retencion Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRetencionIva();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRetencionIva)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRetencionIva(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Retencion Iva",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoRetencionIvaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoRetencionIva) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoRetencionIva(conSplash);
					
						//this.actualizarParametrosGeneralTipoRetencionIva();
						
						this.generarReporteProcesoAccionTipoRetencionIvasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoRetencionIvaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Retencion IvaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Retencion Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoRetencionIva();
				
						this.actualizarParametrosGeneralTipoRetencionIva();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiporetencionivaReturnGeneral=tiporetencionivaLogic.procesarAccionTipoRetencionIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiporetencionivaLogic.getTipoRetencionIvas(),this.tiporetencionivaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoRetencionIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRetencionIva();
					
					TipoRetencionIvaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoRetencionIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRetencionIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRetencionIva.jComboBoxTiposAccionesFormularioTipoRetencionIva.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRetencionIva(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRetencionIvaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRetencionIva();
			
			if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();		
			TipoRetencionIva tiporetencioniva=new TipoRetencionIva();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRetencionIva(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRetencionIva.getSelectedItem();
			
			
			
			
			tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporetencionivasSeleccionados.size()==1) {
				for(TipoRetencionIva tiporetencionivaAux:tiporetencionivasSeleccionados) {
					tiporetencioniva=tiporetencionivaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Transaccion Local")) {
					jButtonTransaccionLocalActionPerformed(null,rowIndex,true,false,tiporetencioniva);
				}
				else if(this.sTipoRelacion.equals("Tarjeta Credito")) {
					jButtonTarjetaCreditoActionPerformed(null,rowIndex,true,false,tiporetencioniva);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRetencionIva();
			
      		//this.finishProcessTipoRetencionIva(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRetencionIvaReturnGeneral() throws Exception {
		if(this.tiporetencionivaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporetencionivaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporetencionivaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporetencionivaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporetencionivaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporetencionivaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRetencionIva(false);
		}
		
		if(this.tiporetencionivaReturnGeneral.getConRetornoLista() || this.tiporetencionivaReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporetencionivaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporetencionivaLogic.setTipoRetencionIvas(this.tiporetencionivaReturnGeneral.getTipoRetencionIvas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporetencionivaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporetencionivaLogic.setTipoRetencionIva(this.tiporetencionivaReturnGeneral.getTipoRetencionIva());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRetencionIva(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRetencionIva() throws Exception {
		
		
	}
	
	public ArrayList<TipoRetencionIva> getTipoRetencionIvasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRetencionIva) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRetencionIva tiporetencionivaAux:tiporetencionivaLogic.getTipoRetencionIvas()) {
					if(tiporetencionivaAux.getIsSelected()) {
						tiporetencionivasSeleccionados.add(tiporetencionivaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencionIva tiporetencionivaAux:this.tiporetencionivas) {
					if(tiporetencionivaAux.getIsSelected()) {
						tiporetencionivasSeleccionados.add(tiporetencionivaAux);				
					}
				}
			}
			
			if(tiporetencionivasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporetencionivasSeleccionados.addAll(this.tiporetencionivaLogic.getTipoRetencionIvas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporetencionivasSeleccionados.addAll(this.tiporetencionivas);				
					}
				}
			}
		} else {
			tiporetencionivasSeleccionados.add(this.tiporetencioniva);
		}
		
		return tiporetencionivasSeleccionados;
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
	
	public void generarReporteTipoRetencionIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRetencionIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRetencionIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRetencionIvasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRetencionIvasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoRetencionIvasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Retencion Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRetencionIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();		
		
		tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRetencionIvas("Todos",tiporetencionivasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRetencionIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();		
		
		tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRetencionIvas("Todos",tiporetencionivasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRetencionIvasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();
		
		tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRetencionIvas("Todos",tiporetencionivasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRetencionIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRetencionIva();
		
		
		tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRetencionIva();
		
		
		//this.generarReporteTipoRetencionIvas("Todos",tiporetencionivasSeleccionados ,tiporetencionivaImplementable,tiporetencionivaImplementableHome);
	}
	
	public void mostrarImportacionTipoRetencionIvas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRetencionIva();
		
		this.abrirFrameImportacionTipoRetencionIva();		
		
			
		//this.generarReporteTipoRetencionIvas("Todos",tiporetencionivasSeleccionados ,tiporetencionivaImplementable,tiporetencionivaImplementableHome);
	}
	
	public void importarTipoRetencionIvas() throws Exception {		
	
	}
	
	public void exportarTipoRetencionIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRetencionIvasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRetencionIvasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRetencionIvasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Retencion Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRetencionIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();		
		
		tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencioniva."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRetencionIva(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRetencionIva tiporetencionivaAux:tiporetencionivasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRetencionIva(tiporetencionivaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporetencionivaAux.setsDetalleGeneralEntityReporte(tiporetencionivaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRetencionIva(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRetencionIvaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionIvaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionIvaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRetencionIva(TipoRetencionIva tiporetencioniva,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporetencioniva.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencioniva.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencioniva.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencioniva.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRetencionIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();		
		
		tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencioniva.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRetencionIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRetencionIva(row);				
				iRow++;
			}				
			
			for(TipoRetencionIva tiporetencionivaAux:tiporetencionivasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRetencionIva(tiporetencionivaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRetencionIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();		
		
		tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencioniva.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporetencionivas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporetencioniva");
			//elementRoot.appendChild(element);
		
			for(TipoRetencionIva tiporetencionivaAux:tiporetencionivasSeleccionados) {
				element = document.createElement("tiporetencioniva");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRetencionIva(tiporetencionivaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRetencionIva(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionIvaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionIvaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionIvaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRetencionIva(TipoRetencionIva tiporetencioniva,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencioniva.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencioniva.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencioniva.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoRetencionIva(TipoRetencionIva tiporetencioniva,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRetencionIvaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporetencioniva.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRetencionIvaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporetencioniva.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoRetencionIvaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiporetencioniva.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoRetencionIvaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporetencioniva.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoRetencionIvasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados=new ArrayList<TipoRetencionIva>();
		
		tiporetencionivasSeleccionados=this.getTipoRetencionIvasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRetencionIva(tiporetencionivasSeleccionados);
		
		this.generarReporteTipoRetencionIvas("Todos",tiporetencionivasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRetencionIva(ArrayList<TipoRetencionIva> tiporetencionivasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRetencionIva tiporetencionivaAux:tiporetencionivasSeleccionados) {
				tiporetencionivaAux.setsDetalleGeneralEntityReporte(tiporetencionivaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRetencionIvaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiporetencionivaAux.setsDescripcionGeneralEntityReporte1(tiporetencionivaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporetencionivaAux.setsDescripcionGeneralEntityReporte1(tiporetencionivaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRetencionIva(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRetencionIva=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRetencionIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRetencionIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=false;
			this.isVisibilidadCeldaModificarTipoRetencionIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionIva=true;
			this.isVisibilidadCeldaEliminarTipoRetencionIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRetencionIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=false;
			this.isVisibilidadCeldaModificarTipoRetencionIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionIva=true;
			this.isVisibilidadCeldaEliminarTipoRetencionIva=true;
			this.isVisibilidadCeldaCancelarTipoRetencionIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRetencionIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=false;
			this.isVisibilidadCeldaModificarTipoRetencionIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionIva=true;
			this.isVisibilidadCeldaEliminarTipoRetencionIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRetencionIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=true;
			this.isVisibilidadCeldaModificarTipoRetencionIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRetencionIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRetencionIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=false;
			this.isVisibilidadCeldaModificarTipoRetencionIva=true;
			this.isVisibilidadCeldaActualizarTipoRetencionIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionIva=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRetencionIvaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRetencionIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=true;
		} else {
			this.actualizarEstadoPanelsTipoRetencionIva(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRetencionIva=false;
			//this.isVisibilidadCeldaVerFormTipoRetencionIva=false;
			this.isVisibilidadCeldaDuplicarTipoRetencionIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporetencionivaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRetencionIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
			if(!tiporetencionivaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=false;												
			}
			
			this.jButtonCerrarTipoRetencionIva.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionIva=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporetencioniva)) {
			this.isVisibilidadCeldaActualizarTipoRetencionIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionIva=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRetencionIva() {
		this.isVisibilidadCeldaNuevoTipoRetencionIva=false;
		this.isVisibilidadCeldaGuardarCambiosTipoRetencionIva=false;
	}
	
	public void actualizarEstadoPanelsTipoRetencionIva(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRetencionIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionIva!=null) {
				this.jScrollPanelDatosTipoRetencionIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencionIva!=null) {
				this.jPanelPaginacionTipoRetencionIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionIva!=null) {
				this.jPanelParametrosReportesTipoRetencionIva.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRetencionIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionIva.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRetencionIva!=null) {
				this.jScrollPanelDatosTipoRetencionIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRetencionIva!=null) {
				this.jPanelPaginacionTipoRetencionIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionIva!=null) {
				this.jPanelParametrosReportesTipoRetencionIva.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRetencionIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionIva.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionIva!=null) {
				this.jScrollPanelDatosTipoRetencionIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRetencionIva!=null) {
				this.jPanelPaginacionTipoRetencionIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionIva!=null) {
				this.jPanelParametrosReportesTipoRetencionIva.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRetencionIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionIva!=null) {
				this.jScrollPanelDatosTipoRetencionIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRetencionIva!=null) {
				this.jPanelPaginacionTipoRetencionIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionIva!=null) {
				this.jPanelParametrosReportesTipoRetencionIva.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRetencionIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionIva!=null) {
				this.jScrollPanelDatosTipoRetencionIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencionIva!=null) {
				this.jPanelPaginacionTipoRetencionIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionIva!=null) {
				this.jPanelParametrosReportesTipoRetencionIva.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRetencionIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionIva.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionIva!=null) {
				this.jScrollPanelDatosTipoRetencionIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencionIva!=null) {
				this.jPanelPaginacionTipoRetencionIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionIva!=null) {
				this.jPanelParametrosReportesTipoRetencionIva.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRetencionIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionIva.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionIva!=null) {
				this.jScrollPanelDatosTipoRetencionIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencionIva!=null) {
				this.jPanelPaginacionTipoRetencionIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionIva!=null) {
				this.jPanelParametrosReportesTipoRetencionIva.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoRetencionIvaParaTransaccionLocales() throws Exception {
		Boolean isPaginaPopupTransaccionLocal=false;

		try {

			if(this.tiporetencionivaSessionBean==null) {
				this.tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalSessionBean==null) {
				this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
			}

			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalSessionBean.setsPathNavegacionActual(tiporetencionivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTransaccionLocal=this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal(true);
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal(TipoRetencionIvaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionTipoRetencionIva(true);
			this.jInternalFrameDetalleFormTipoRetencionIva.transaccionlocalSessionBean.setlidTipoRetencionIvaActual(this.idTipoRetencionIvaActual);

			tiporetencionivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIva(true);
			tiporetencionivaSessionBean.setlIdTipoRetencionIvaActualForeignKey(this.idTipoRetencionIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoRetencionIvaParaTarjetaCreditos() throws Exception {
		Boolean isPaginaPopupTarjetaCredito=false;

		try {

			if(this.tiporetencionivaSessionBean==null) {
				this.tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoSessionBean.setsPathNavegacionActual(tiporetencionivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTarjetaCredito=this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTarjetaCredito(true);
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCredito(TipoRetencionIvaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoSessionBean.setisBusquedaDesdeForeignKeySesionTipoRetencionIva(true);
			this.jInternalFrameDetalleFormTipoRetencionIva.tarjetacreditoSessionBean.setlidTipoRetencionIvaActual(this.idTipoRetencionIvaActual);

			tiporetencionivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIva(true);
			tiporetencionivaSessionBean.setlIdTipoRetencionIvaActualForeignKey(this.idTipoRetencionIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRetencionIvaSessionBean tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean();
		
		if(this.tiporetencionivaSessionBean==null) {
			this.tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean();
		}
		
		this.tiporetencionivaSessionBean.setsUltimaBusquedaTipoRetencionIva(this.getsAccionBusqueda());
		this.tiporetencionivaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporetencionivaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRetencionIvaSessionBean tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean();
		
		if(this.tiporetencionivaSessionBean==null) {
			this.tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean();
		}
		
		if(this.tiporetencionivaSessionBean.getsUltimaBusquedaTipoRetencionIva()!=null&&!this.tiporetencionivaSessionBean.getsUltimaBusquedaTipoRetencionIva().equals("")) {
			this.setsAccionBusqueda(tiporetencionivaSessionBean.getsUltimaBusquedaTipoRetencionIva());
			this.setiNumeroPaginacion(tiporetencionivaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporetencionivaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tiporetencionivaSessionBean.setsUltimaBusquedaTipoRetencionIva("");
		this.tiporetencionivaSessionBean.setiNumeroPaginacion(TipoRetencionIvaConstantesFunciones.INUMEROPAGINACION);
		this.tiporetencionivaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRetencionIva(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRetencionIva() {
		this.updateBorderResaltarBusquedasFormularioTipoRetencionIva();
		this.updateVisibilidadBusquedasFormularioTipoRetencionIva();
		this.updateHabilitarBusquedasFormularioTipoRetencionIva();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRetencionIva() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRetencionIva() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoRetencionIva() {
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
	
	public void updateControlesFormularioTipoRetencionIva() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRetencionIva();
		this.updateVisibilidadResaltarControlesFormularioTipoRetencionIva();
		this.updateHabilitarResaltarControlesFormularioTipoRetencionIva();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRetencionIva() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporetencionivaConstantesFunciones.resaltaridTipoRetencionIva!=null && this.jInternalFrameDetalleFormTipoRetencionIva!=null) {this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.setBorder(this.tiporetencionivaConstantesFunciones.resaltaridTipoRetencionIva);}
		if(this.tiporetencionivaConstantesFunciones.resaltarcodigoTipoRetencionIva!=null && this.jInternalFrameDetalleFormTipoRetencionIva!=null) {this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldcodigoTipoRetencionIva.setBorder(this.tiporetencionivaConstantesFunciones.resaltarcodigoTipoRetencionIva);}
		if(this.tiporetencionivaConstantesFunciones.resaltarnombreTipoRetencionIva!=null && this.jInternalFrameDetalleFormTipoRetencionIva!=null) {this.jInternalFrameDetalleFormTipoRetencionIva.jTextAreanombreTipoRetencionIva.setBorder(this.tiporetencionivaConstantesFunciones.resaltarnombreTipoRetencionIva);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRetencionIva() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
	
		//this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.setVisible(this.tiporetencionivaConstantesFunciones.mostraridTipoRetencionIva);
		this.jInternalFrameDetalleFormTipoRetencionIva.jPanelidTipoRetencionIva.setVisible(this.tiporetencionivaConstantesFunciones.mostraridTipoRetencionIva);
		//this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldcodigoTipoRetencionIva.setVisible(this.tiporetencionivaConstantesFunciones.mostrarcodigoTipoRetencionIva);
		this.jInternalFrameDetalleFormTipoRetencionIva.jPanelcodigoTipoRetencionIva.setVisible(this.tiporetencionivaConstantesFunciones.mostrarcodigoTipoRetencionIva);
		//this.jInternalFrameDetalleFormTipoRetencionIva.jTextAreanombreTipoRetencionIva.setVisible(this.tiporetencionivaConstantesFunciones.mostrarnombreTipoRetencionIva);
		this.jInternalFrameDetalleFormTipoRetencionIva.jPanelnombreTipoRetencionIva.setVisible(this.tiporetencionivaConstantesFunciones.mostrarnombreTipoRetencionIva);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRetencionIva() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRetencionIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRetencionIva!=null) {
	
		this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldidTipoRetencionIva.setEnabled(this.tiporetencionivaConstantesFunciones.activaridTipoRetencionIva);
		this.jInternalFrameDetalleFormTipoRetencionIva.jTextFieldcodigoTipoRetencionIva.setEnabled(this.tiporetencionivaConstantesFunciones.activarcodigoTipoRetencionIva);
		this.jInternalFrameDetalleFormTipoRetencionIva.jTextAreanombreTipoRetencionIva.setEnabled(this.tiporetencionivaConstantesFunciones.activarnombreTipoRetencionIva);
		}
	}
	
		
}