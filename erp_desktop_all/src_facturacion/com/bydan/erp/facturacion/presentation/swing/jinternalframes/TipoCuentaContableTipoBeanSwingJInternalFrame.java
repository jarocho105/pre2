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

import com.bydan.erp.facturacion.util.TipoCuentaContableTipoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoCuentaContableTipoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoCuentaContableTipoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoCuentaContableTipoBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class TipoCuentaContableTipoBeanSwingJInternalFrame extends TipoCuentaContableTipoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCuentaContableTipoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCuentaContableTipo> tipocuentacontabletipoValidator = new ClassValidator<TipoCuentaContableTipo>(TipoCuentaContableTipo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCuentaContableTipo tipocuentacontabletipo;	
	public TipoCuentaContableTipo tipocuentacontabletipoAux;
	public TipoCuentaContableTipo tipocuentacontabletipoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCuentaContableTipo tipocuentacontabletipoTotales;
	public Long idTipoCuentaContableTipoActual;
	public Long iIdNuevoTipoCuentaContableTipo=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCuentaContableTipo=false;

	public Boolean getIsTienePermisosCuentaContableTipo() {
		return isTienePermisosCuentaContableTipo;
	}

	public void setIsTienePermisosCuentaContableTipo(Boolean isTienePermisosCuentaContableTipo) {
		this.isTienePermisosCuentaContableTipo= isTienePermisosCuentaContableTipo;
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
	
	public Boolean isPermisoTodoTipoCuentaContableTipo;
	public Boolean isPermisoNuevoTipoCuentaContableTipo;
	public Boolean isPermisoActualizarTipoCuentaContableTipo;
	public Boolean isPermisoActualizarOriginalTipoCuentaContableTipo;
	public Boolean isPermisoEliminarTipoCuentaContableTipo;
	public Boolean isPermisoGuardarCambiosTipoCuentaContableTipo;
	public Boolean isPermisoConsultaTipoCuentaContableTipo;
	public Boolean isPermisoBusquedaTipoCuentaContableTipo;
	public Boolean isPermisoReporteTipoCuentaContableTipo;
	public Boolean isPermisoPaginacionMedioTipoCuentaContableTipo;
	public Boolean isPermisoPaginacionAltoTipoCuentaContableTipo;
	public Boolean isPermisoPaginacionTodoTipoCuentaContableTipo;
	public Boolean isPermisoCopiarTipoCuentaContableTipo;
	public Boolean isPermisoVerFormTipoCuentaContableTipo;
	public Boolean isPermisoDuplicarTipoCuentaContableTipo;
	public Boolean isPermisoOrdenTipoCuentaContableTipo;
	
	
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
	
	public TipoCuentaContableTipoParameterReturnGeneral tipocuentacontabletipoReturnGeneral;
	public TipoCuentaContableTipoParameterReturnGeneral tipocuentacontabletipoParameterGeneral;
	
	

	public CuentaContableTipoLogic cuentacontabletipoLogic=null;

	public CuentaContableTipoLogic getCuentaContableTipoLogic() {
		return cuentacontabletipoLogic;
	}

	public void setCuentaContableTipoLogic(CuentaContableTipoLogic cuentacontabletipoLogic) {
		this.cuentacontabletipoLogic = cuentacontabletipoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCuentaContableTipo=false;
	public Boolean esParaAccionDesdeFormularioTipoCuentaContableTipo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoCuentaContableTipoSessionBeanAdditional tipocuentacontabletipoSessionBeanAdditional=null;
	
	public TipoCuentaContableTipoSessionBeanAdditional getTipoCuentaContableTipoSessionBeanAdditional() {
		return this.tipocuentacontabletipoSessionBeanAdditional;
	}
	
	public void setTipoCuentaContableTipoSessionBeanAdditional(TipoCuentaContableTipoSessionBeanAdditional tipocuentacontabletipoSessionBeanAdditional) {
		try {
			this.tipocuentacontabletipoSessionBeanAdditional=tipocuentacontabletipoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoCuentaContableTipoBeanSwingJInternalFrameAdditional tipocuentacontabletipoBeanSwingJInternalFrameAdditional=null;
	//public class TipoCuentaContableTipoBeanSwingJInternalFrame
	
	public TipoCuentaContableTipoBeanSwingJInternalFrameAdditional getTipoCuentaContableTipoBeanSwingJInternalFrameAdditional() {
		return this.tipocuentacontabletipoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoCuentaContableTipoBeanSwingJInternalFrameAdditional(TipoCuentaContableTipoBeanSwingJInternalFrameAdditional tipocuentacontabletipoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocuentacontabletipoBeanSwingJInternalFrameAdditional=tipocuentacontabletipoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCuentaContableTipoLogic tipocuentacontabletipoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCuentaContableTipo tipocuentacontabletipoBean;
	public TipoCuentaContableTipoConstantesFunciones tipocuentacontabletipoConstantesFunciones;
	//public TipoCuentaContableTipoParameterReturnGeneral tipocuentacontabletipoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoCuentaContableTipo> tipocuentacontabletipos;	
	//public List<TipoCuentaContableTipo> tipocuentacontabletiposEliminados;
	//public List<TipoCuentaContableTipo> tipocuentacontabletiposAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCuentaContableTipo=true;
	public Boolean isVisibilidadCeldaCopiarTipoCuentaContableTipo=true;
	public Boolean isVisibilidadCeldaVerFormTipoCuentaContableTipo=true;
	public Boolean isVisibilidadCeldaOrdenTipoCuentaContableTipo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaModificarTipoCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaActualizarTipoCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaEliminarTipoCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaCancelarTipoCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoCuentaContableTipo() {
		return this.iIdNuevoTipoCuentaContableTipo;
	}

	public void setiIdNuevoTipoCuentaContableTipo(Long iIdNuevoTipoCuentaContableTipo) {
		this.iIdNuevoTipoCuentaContableTipo = iIdNuevoTipoCuentaContableTipo;
	}
	
	public Long getidTipoCuentaContableTipoActual() {
		return this.idTipoCuentaContableTipoActual;
	}

	public void setidTipoCuentaContableTipoActual(Long idTipoCuentaContableTipoActual) {
		this.idTipoCuentaContableTipoActual = idTipoCuentaContableTipoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCuentaContableTipo gettipocuentacontabletipo() {
		return this.tipocuentacontabletipo;
	}

	public void settipocuentacontabletipo(TipoCuentaContableTipo tipocuentacontabletipo) {
		this.tipocuentacontabletipo = tipocuentacontabletipo;
	}
	
	public TipoCuentaContableTipo gettipocuentacontabletipoAux() {
		return this.tipocuentacontabletipoAux;
	}

	public void settipocuentacontabletipoAux(TipoCuentaContableTipo tipocuentacontabletipoAux) {
		this.tipocuentacontabletipoAux = tipocuentacontabletipoAux;
	}				
	
	public TipoCuentaContableTipo gettipocuentacontabletipoAnterior() {
		return this.tipocuentacontabletipoAnterior;
	}

	public void settipocuentacontabletipoAnterior(TipoCuentaContableTipo tipocuentacontabletipoAnterior) {
		this.tipocuentacontabletipoAnterior = tipocuentacontabletipoAnterior;
	}	
	
	public TipoCuentaContableTipo gettipocuentacontabletipoTotales() {
		return this.tipocuentacontabletipoTotales;
	}

	public void settipocuentacontabletipoTotales(TipoCuentaContableTipo tipocuentacontabletipoTotales) {
		this.tipocuentacontabletipoTotales = tipocuentacontabletipoTotales;
	}	
	
	public TipoCuentaContableTipo gettipocuentacontabletipoBean() {
		return this.tipocuentacontabletipoBean;
	}

	public void settipocuentacontabletipoBean(TipoCuentaContableTipo tipocuentacontabletipoBean) {
		this.tipocuentacontabletipoBean = tipocuentacontabletipoBean;
	}	
	
	public TipoCuentaContableTipoParameterReturnGeneral gettipocuentacontabletipoReturnGeneral() {
		return this.tipocuentacontabletipoReturnGeneral;
	}

	public void settipocuentacontabletipoReturnGeneral(TipoCuentaContableTipoParameterReturnGeneral tipocuentacontabletipoReturnGeneral) {
		this.tipocuentacontabletipoReturnGeneral = tipocuentacontabletipoReturnGeneral;
	}	
	
	
	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCuentaContableTipoLogic getTipoCuentaContableTipoLogic()	{		
		return tipocuentacontabletipoLogic;
	}

	public void setTipoCuentaContableTipoLogic(TipoCuentaContableTipoLogic tipocuentacontabletipoLogic) {
		this.tipocuentacontabletipoLogic = tipocuentacontabletipoLogic;
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
	
	public Boolean getIsEsNuevoTipoCuentaContableTipo() {
		return isEsNuevoTipoCuentaContableTipo;
	}

	public void setIsEsNuevoTipoCuentaContableTipo(Boolean isEsNuevoTipoCuentaContableTipo) {
		this.isEsNuevoTipoCuentaContableTipo = isEsNuevoTipoCuentaContableTipo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCuentaContableTipo() {
		return esParaAccionDesdeFormularioTipoCuentaContableTipo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCuentaContableTipo(Boolean esParaAccionDesdeFormularioTipoCuentaContableTipo) {
		this.esParaAccionDesdeFormularioTipoCuentaContableTipo = esParaAccionDesdeFormularioTipoCuentaContableTipo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoCuentaContableTipo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCuentaContableTipoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCuentaContableTipo(this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCuentaContableTipoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCuentaContableTipo(this.tipocuentacontabletipos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocuentacontabletipoLogic.setTipoCuentaContableTipos(this.tipocuentacontabletipos);
			tipocuentacontabletipoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCuentaContableTipoParameterReturnGeneral getTipoCuentaContableTipoParameterGeneral() {
		return this.tipocuentacontabletipoParameterGeneral;
	}
	
	public void setTipoCuentaContableTipoParameterGeneral(TipoCuentaContableTipoParameterReturnGeneral tipocuentacontabletipoParameterGeneral) {
		this.tipocuentacontabletipoParameterGeneral = tipocuentacontabletipoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCuentaContableTipo() {
		return isPermisoTodoTipoCuentaContableTipo;
	}

	public void setIsPermisoTodoTipoCuentaContableTipo(Boolean isPermisoTodoTipoCuentaContableTipo) {
		this.isPermisoTodoTipoCuentaContableTipo = isPermisoTodoTipoCuentaContableTipo;
	}

	public Boolean getIsPermisoNuevoTipoCuentaContableTipo() {
		return isPermisoNuevoTipoCuentaContableTipo;
	}

	public void setIsPermisoNuevoTipoCuentaContableTipo(Boolean isPermisoNuevoTipoCuentaContableTipo) {
		this.isPermisoNuevoTipoCuentaContableTipo = isPermisoNuevoTipoCuentaContableTipo;
	}

	public Boolean getIsPermisoActualizarTipoCuentaContableTipo() {
		return isPermisoActualizarTipoCuentaContableTipo;
	}

	public void setIsPermisoActualizarTipoCuentaContableTipo(Boolean isPermisoActualizarTipoCuentaContableTipo) {
		this.isPermisoActualizarTipoCuentaContableTipo = isPermisoActualizarTipoCuentaContableTipo;
	}

	public Boolean getIsPermisoEliminarTipoCuentaContableTipo() {
		return isPermisoEliminarTipoCuentaContableTipo;
	}

	public void setIsPermisoEliminarTipoCuentaContableTipo(Boolean isPermisoEliminarTipoCuentaContableTipo) {
		this.isPermisoEliminarTipoCuentaContableTipo = isPermisoEliminarTipoCuentaContableTipo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCuentaContableTipo() {
		return isPermisoGuardarCambiosTipoCuentaContableTipo;
	}

	public void setIsPermisoGuardarCambiosTipoCuentaContableTipo(Boolean isPermisoGuardarCambiosTipoCuentaContableTipo) {
		this.isPermisoGuardarCambiosTipoCuentaContableTipo = isPermisoGuardarCambiosTipoCuentaContableTipo;
	}
	
	public Boolean getIsPermisoConsultaTipoCuentaContableTipo() {
		return isPermisoConsultaTipoCuentaContableTipo;
	}

	public void setIsPermisoConsultaTipoCuentaContableTipo(Boolean isPermisoConsultaTipoCuentaContableTipo) {
		this.isPermisoConsultaTipoCuentaContableTipo = isPermisoConsultaTipoCuentaContableTipo;
	}

	public Boolean getIsPermisoBusquedaTipoCuentaContableTipo() {
		return isPermisoBusquedaTipoCuentaContableTipo;
	}

	public void setIsPermisoBusquedaTipoCuentaContableTipo(Boolean isPermisoBusquedaTipoCuentaContableTipo) {
		this.isPermisoBusquedaTipoCuentaContableTipo = isPermisoBusquedaTipoCuentaContableTipo;
	}

	public Boolean getIsPermisoReporteTipoCuentaContableTipo() {
		return isPermisoReporteTipoCuentaContableTipo;
	}

	public void setIsPermisoReporteTipoCuentaContableTipo(Boolean isPermisoReporteTipoCuentaContableTipo) {
		this.isPermisoReporteTipoCuentaContableTipo = isPermisoReporteTipoCuentaContableTipo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCuentaContableTipo() {
		return isPermisoPaginacionMedioTipoCuentaContableTipo;
	}

	public void setIsPermisoPaginacionMedioTipoCuentaContableTipo(Boolean isPermisoPaginacionMedioTipoCuentaContableTipo) {
		this.isPermisoPaginacionMedioTipoCuentaContableTipo = isPermisoPaginacionMedioTipoCuentaContableTipo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCuentaContableTipo() {
		return isPermisoPaginacionTodoTipoCuentaContableTipo;
	}

	public void setIsPermisoPaginacionTodoTipoCuentaContableTipo(Boolean isPermisoPaginacionTodoTipoCuentaContableTipo) {
		this.isPermisoPaginacionTodoTipoCuentaContableTipo = isPermisoPaginacionTodoTipoCuentaContableTipo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCuentaContableTipo() {
		return isPermisoPaginacionAltoTipoCuentaContableTipo;
	}

	public void setIsPermisoPaginacionAltoTipoCuentaContableTipo(Boolean isPermisoPaginacionAltoTipoCuentaContableTipo) {
		this.isPermisoPaginacionAltoTipoCuentaContableTipo = isPermisoPaginacionAltoTipoCuentaContableTipo;
	}
	
	public Boolean getIsPermisoCopiarTipoCuentaContableTipo() {
		return isPermisoCopiarTipoCuentaContableTipo;
	}

	public void setIsPermisoCopiarTipoCuentaContableTipo(Boolean isPermisoCopiarTipoCuentaContableTipo) {
		this.isPermisoCopiarTipoCuentaContableTipo = isPermisoCopiarTipoCuentaContableTipo;
	}
	
	public Boolean getIsPermisoVerFormTipoCuentaContableTipo() {
		return isPermisoVerFormTipoCuentaContableTipo;
	}

	public void setIsPermisoVerFormTipoCuentaContableTipo(Boolean isPermisoVerFormTipoCuentaContableTipo) {
		this.isPermisoVerFormTipoCuentaContableTipo = isPermisoVerFormTipoCuentaContableTipo;
	}
	
	public Boolean getIsPermisoDuplicarTipoCuentaContableTipo() {
		return isPermisoDuplicarTipoCuentaContableTipo;
	}

	public void setIsPermisoDuplicarTipoCuentaContableTipo(Boolean isPermisoDuplicarTipoCuentaContableTipo) {
		this.isPermisoDuplicarTipoCuentaContableTipo = isPermisoDuplicarTipoCuentaContableTipo;
	}
	
	public Boolean getIsPermisoOrdenTipoCuentaContableTipo() {
		return isPermisoOrdenTipoCuentaContableTipo;
	}

	public void setIsPermisoOrdenTipoCuentaContableTipo(Boolean isPermisoOrdenTipoCuentaContableTipo) {
		this.isPermisoOrdenTipoCuentaContableTipo = isPermisoOrdenTipoCuentaContableTipo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCuentaContableTipo() {
		return isVisibilidadCeldaNuevoTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaNuevoTipoCuentaContableTipo(Boolean isVisibilidadCeldaNuevoTipoCuentaContableTipo) {
		this.isVisibilidadCeldaNuevoTipoCuentaContableTipo = isVisibilidadCeldaNuevoTipoCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCuentaContableTipo() {
		return isVisibilidadCeldaDuplicarTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCuentaContableTipo(Boolean isVisibilidadCeldaDuplicarTipoCuentaContableTipo) {
		this.isVisibilidadCeldaDuplicarTipoCuentaContableTipo = isVisibilidadCeldaDuplicarTipoCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCuentaContableTipo() {
		return isVisibilidadCeldaCopiarTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaCopiarTipoCuentaContableTipo(Boolean isVisibilidadCeldaCopiarTipoCuentaContableTipo) {
		this.isVisibilidadCeldaCopiarTipoCuentaContableTipo = isVisibilidadCeldaCopiarTipoCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCuentaContableTipo() {
		return isVisibilidadCeldaVerFormTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaVerFormTipoCuentaContableTipo(Boolean isVisibilidadCeldaVerFormTipoCuentaContableTipo) {
		this.isVisibilidadCeldaVerFormTipoCuentaContableTipo = isVisibilidadCeldaVerFormTipoCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCuentaContableTipo() {
		return isVisibilidadCeldaOrdenTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaOrdenTipoCuentaContableTipo(Boolean isVisibilidadCeldaOrdenTipoCuentaContableTipo) {
		this.isVisibilidadCeldaOrdenTipoCuentaContableTipo = isVisibilidadCeldaOrdenTipoCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo() {
		return isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo(Boolean isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo = isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCuentaContableTipo() {
		return isVisibilidadCeldaModificarTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaModificarTipoCuentaContableTipo(Boolean isVisibilidadCeldaModificarTipoCuentaContableTipo) {
		this.isVisibilidadCeldaModificarTipoCuentaContableTipo = isVisibilidadCeldaModificarTipoCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCuentaContableTipo() {
		return isVisibilidadCeldaActualizarTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaActualizarTipoCuentaContableTipo(Boolean isVisibilidadCeldaActualizarTipoCuentaContableTipo) {
		this.isVisibilidadCeldaActualizarTipoCuentaContableTipo = isVisibilidadCeldaActualizarTipoCuentaContableTipo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCuentaContableTipo() {
		return isVisibilidadCeldaEliminarTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaEliminarTipoCuentaContableTipo(Boolean isVisibilidadCeldaEliminarTipoCuentaContableTipo) {
		this.isVisibilidadCeldaEliminarTipoCuentaContableTipo = isVisibilidadCeldaEliminarTipoCuentaContableTipo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCuentaContableTipo() {
		return isVisibilidadCeldaCancelarTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaCancelarTipoCuentaContableTipo(Boolean isVisibilidadCeldaCancelarTipoCuentaContableTipo) {
		this.isVisibilidadCeldaCancelarTipoCuentaContableTipo = isVisibilidadCeldaCancelarTipoCuentaContableTipo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCuentaContableTipo() {
		return isVisibilidadCeldaGuardarTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaGuardarTipoCuentaContableTipo(Boolean isVisibilidadCeldaGuardarTipoCuentaContableTipo) {
		this.isVisibilidadCeldaGuardarTipoCuentaContableTipo = isVisibilidadCeldaGuardarTipoCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo() {
		return isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo(Boolean isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo) {
		this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo = isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo;
	}
		
	public TipoCuentaContableTipoSessionBean gettipocuentacontabletipoSessionBean() {
		return this.tipocuentacontabletipoSessionBean;
	}
	
	public void settipocuentacontabletipoSessionBean(TipoCuentaContableTipoSessionBean tipocuentacontabletipoSessionBean) {
		this.tipocuentacontabletipoSessionBean=tipocuentacontabletipoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoCuentaContableTipo tipocuentacontabletipo,TipoCuentaContableTipo tipocuentacontabletipoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCuentaContableTipo(tipocuentacontabletipo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocuentacontabletipoAux.setId(tipocuentacontabletipo.getId());
		tipocuentacontabletipoAux.setVersionRow(tipocuentacontabletipo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCuentaContableTipo();
		
			int intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(this.tipocuentacontabletipo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocuentacontabletipoValidator.getInvalidValues(this.tipocuentacontabletipo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocuentacontabletipoLogic.setDatosCliente(datosCliente);
			tipocuentacontabletipoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocuentacontabletipoAux=new  TipoCuentaContableTipo();
				
				tipocuentacontabletipoAux.setIsNew(true);
				tipocuentacontabletipoAux.setIsChanged(true);
				
				tipocuentacontabletipoAux.setTipoCuentaContableTipoOriginal(this.tipocuentacontabletipo);
				
				tipocuentacontabletipoAux.setId(this.tipocuentacontabletipo.getId());	
				tipocuentacontabletipoAux.setVersionRow(this.tipocuentacontabletipo.getVersionRow());	
				tipocuentacontabletipoAux.setnombre(this.tipocuentacontabletipo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentacontabletipoLogic.saveTipoCuentaContableTipos();//WithConnection
						//tipocuentacontabletipoLogic.getSetVersionRowTipoCuentaContableTipos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocuentacontabletipo,tipocuentacontabletipoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos().addAll(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletiposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipos.addAll(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletiposEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuentacontabletipoLogic.saveTipoCuentaContableTipoRelaciones(tipocuentacontabletipoAux,this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());//WithConnection
								//tipocuentacontabletipoLogic.getSetVersionRowTipoCuentaContableTipos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocuentacontabletipo,tipocuentacontabletipoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.setCuentaContableTipos(new ArrayList<CuentaContableTipo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipos= new ArrayList<CuentaContableTipo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentacontabletipoAux.setCuentaContableTipos(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocuentacontabletipo,tipocuentacontabletipoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocuentacontabletipoAux=new  TipoCuentaContableTipo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado() && this.tipocuentacontabletipo.getId()>=0)) {
						
					tipocuentacontabletipoAux.setIsNew(false);
				}
				
				tipocuentacontabletipoAux.setIsDeleted(false);
			
				tipocuentacontabletipoAux.setId(this.tipocuentacontabletipo.getId());	
				tipocuentacontabletipoAux.setVersionRow(this.tipocuentacontabletipo.getVersionRow());	
				tipocuentacontabletipoAux.setnombre(this.tipocuentacontabletipo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentacontabletipoLogic.saveTipoCuentaContableTipos();//WithConnection
						//tipocuentacontabletipoLogic.getSetVersionRowTipoCuentaContableTipos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocuentacontabletipo,tipocuentacontabletipoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos().addAll(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletiposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipos.addAll(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletiposEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuentacontabletipoLogic.saveTipoCuentaContableTipoRelaciones(tipocuentacontabletipoAux,this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());//WithConnection
								//tipocuentacontabletipoLogic.getSetVersionRowTipoCuentaContableTipos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocuentacontabletipo,tipocuentacontabletipoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.setCuentaContableTipos(new ArrayList<CuentaContableTipo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipos= new ArrayList<CuentaContableTipo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentacontabletipoAux.setCuentaContableTipos(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocuentacontabletipo,tipocuentacontabletipoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocuentacontabletipoAux=new  TipoCuentaContableTipo();
				
				tipocuentacontabletipoAux.setIsNew(false);
				tipocuentacontabletipoAux.setIsChanged(false);
				
				tipocuentacontabletipoAux.setIsDeleted(true);
				
				tipocuentacontabletipoAux.setId(this.tipocuentacontabletipo.getId());	
				tipocuentacontabletipoAux.setVersionRow(this.tipocuentacontabletipo.getVersionRow());	
				tipocuentacontabletipoAux.setnombre(this.tipocuentacontabletipo.getnombre());	
				
				if(this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocuentacontabletipoAux.getId()>=0) {	
						this.tipocuentacontabletiposEliminados.add(tipocuentacontabletipoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentacontabletipoLogic.saveTipoCuentaContableTipos();//WithConnection
						//tipocuentacontabletipoLogic.getSetVersionRowTipoCuentaContableTipos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos().addAll(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletiposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipos.addAll(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletiposEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuentacontabletipoLogic.saveTipoCuentaContableTipoRelaciones(tipocuentacontabletipoAux,this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());//WithConnection
								//tipocuentacontabletipoLogic.getSetVersionRowTipoCuentaContableTipos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.setCuentaContableTipos(new ArrayList<CuentaContableTipo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipos= new ArrayList<CuentaContableTipo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentacontabletipoAux.setCuentaContableTipos(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocuentacontabletipoAux,tipocuentacontabletipos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().addAll(this.tipocuentacontabletiposEliminados);
					
					tipocuentacontabletipoLogic.saveTipoCuentaContableTipos();//WithConnection
					//tipocuentacontabletipoLogic.getSetVersionRowTipoCuentaContableTipos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipocuentacontabletiposEliminados= new ArrayList<TipoCuentaContableTipo>();		
			}
			
			if(this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Cuenta Contable Tipo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocuentacontabletipo=tipocuentacontabletipoAux;
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
      		//this.finishProcessTipoCuentaContableTipo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCuentaContableTipo tipocuentacontabletipoLocal) throws Exception {
		
		if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocuentacontabletipoLocal.setCuentaContableTipos(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());
			
			} else {
			
				tipocuentacontabletipoLocal.setCuentaContableTipos(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCuentaContableTipo tipocuentacontabletipoLocal) throws Exception {	
		if(this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoCuentaContableTipoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocuentacontabletipoValidator.getInvalidValues(this.tipocuentacontabletipo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCuentaContableTipo tipocuentacontabletipo,List<TipoCuentaContableTipo> tipocuentacontabletipos) throws Exception {
		try	{		
			TipoCuentaContableTipoConstantesFunciones.actualizarLista(tipocuentacontabletipo,tipocuentacontabletipos,this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCuentaContableTipo tipocuentacontabletipo,List<TipoCuentaContableTipo> tipocuentacontabletipos) throws Exception {
		try	{			
			TipoCuentaContableTipoConstantesFunciones.actualizarSelectedLista(tipocuentacontabletipo,tipocuentacontabletipos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCuentaContableTipo> tipocuentacontabletiposLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocuentacontabletiposLocal=this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocuentacontabletiposLocal=this.tipocuentacontabletipos;
			}
			//ARCHITECTURE
		
			for(TipoCuentaContableTipo tipocuentacontabletipoLocal:tipocuentacontabletiposLocal) {
				if(this.permiteMantenimiento(tipocuentacontabletipoLocal) && tipocuentacontabletipoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCuentaContableTipoConstantesFunciones.getTipoCuentaContableTipoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCuentaContableTipoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaContableTipo.jLabelnombreTipoCuentaContableTipo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuentaContableTipo.jLabelnombreTipoCuentaContableTipo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CuentaContableTipo")) {
			if(this.tipocuentacontabletipo==null) {
				this.tipocuentacontabletipo= new TipoCuentaContableTipo();
			}

			if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCuentaContableTipo
				this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(this.tipocuentacontabletipo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);

				this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.getcuentacontabletipo().setTipoCuentaContableTipo(this.tipocuentacontabletipo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCuentaContableTipo--;	
		
		
		this.tipocuentacontabletipoAux=new TipoCuentaContableTipo();
		
		this.tipocuentacontabletipoAux.setId(this.iIdNuevoTipoCuentaContableTipo);
		this.tipocuentacontabletipoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().add(this.tipocuentacontabletipoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocuentacontabletipos.add(this.tipocuentacontabletipoAux);
		}
		//ARCHITECTURE
		
		this.tipocuentacontabletipo=this.tipocuentacontabletipoAux;
		
		if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCuentaContableTipo(this.tipocuentacontabletipo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaContableTipo(this.tipocuentacontabletipo);
		}
				
		//this.setDefaultControlesTipoCuentaContableTipo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCuentaContableTipo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCuentaContableTipo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaContableTipo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCuentaContableTipo(this.tipocuentacontabletipoBean,this.tipocuentacontabletipo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
			classes=TipoCuentaContableTipoConstantesFunciones.getClassesRelationshipsOfTipoCuentaContableTipo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocuentacontabletipoReturnGeneral=tipocuentacontabletipoLogic.procesarEventosTipoCuentaContableTiposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos(),this.tipocuentacontabletipo,this.tipocuentacontabletipoParameterGeneral,this.isEsNuevoTipoCuentaContableTipo,classes);//this.tipocuentacontabletipoLogic.getTipoCuentaContableTipo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCuentaContableTipo(this.tipocuentacontabletipoReturnGeneral,this.tipocuentacontabletipoBean,false);
		
		if(this.tipocuentacontabletipoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaContableTipo(this.tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCuentaContableTipo(this.tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo());
		}
		
		if(this.tipocuentacontabletipoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaContableTipo(this.tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo(),classes);//this.tipocuentacontabletipoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(this.tipocuentacontabletipo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCuentaContableTipo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCuentaContableTipo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.RecargarFormTipoCuentaContableTipo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCuentaContableTipo(false);
						
			if(tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.getEsGuardarRelacionado() && CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContableTipoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaContableTipo();
			}
			
			this.actualizarVisualTableDatosTipoCuentaContableTipo();
			
			this.jTableDatosTipoCuentaContableTipo.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaContableTipo(), this.getIndiceNuevoTipoCuentaContableTipo());
			
			this.seleccionarFilaTablaTipoCuentaContableTipoActual();
						
			this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCuentaContableTipo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextAreanombreTipoCuentaContableTipo.setEnabled(isHabilitar && this.tipocuentacontabletipoConstantesFunciones.activarnombreTipoCuentaContableTipo);	
		
	};
	
	public void setDefaultControlesTipoCuentaContableTipo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCuentaContableTipo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocuentacontabletipoSessionBean.setConGuardarRelaciones(true);			
			this.tipocuentacontabletipoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTabbedPaneRelacionesTipoCuentaContableTipo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocuentacontabletipoSessionBean.setConGuardarRelaciones(false);			
			this.tipocuentacontabletipoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTabbedPaneRelacionesTipoCuentaContableTipo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCuentaContableTipo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
				if(tipocuentacontabletipoAux.getId().equals(this.iIdNuevoTipoCuentaContableTipo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipos) {
				if(tipocuentacontabletipoAux.getId().equals(this.iIdNuevoTipoCuentaContableTipo)) {
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
	
	public int getIndiceActualTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
				if(tipocuentacontabletipoAux.getId().equals(tipocuentacontabletipo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipos) {
				if(tipocuentacontabletipoAux.getId().equals(tipocuentacontabletipo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
				if(tipocuentacontabletipoAux.getTipoCuentaContableTipoOriginal().getId().equals(tipocuentacontabletipoOriginal.getId())) {
					existe=true;
					tipocuentacontabletipoOriginal.setId(tipocuentacontabletipoAux.getId());
					tipocuentacontabletipoOriginal.setVersionRow(tipocuentacontabletipoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipos) {
				if(tipocuentacontabletipoAux.getTipoCuentaContableTipoOriginal().getId().equals(tipocuentacontabletipoOriginal.getId())) {
					existe=true;
					tipocuentacontabletipoOriginal.setId(tipocuentacontabletipoAux.getId());
					tipocuentacontabletipoOriginal.setVersionRow(tipocuentacontabletipoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCuentaContableTipo(Boolean esParaCancelar) throws Exception {
		tipocuentacontabletiposAux=new ArrayList<TipoCuentaContableTipo>();
		tipocuentacontabletipoAux=new TipoCuentaContableTipo();
		
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
					if(tipocuentacontabletipoAux.getId()<0) {
						tipocuentacontabletiposAux.add(tipocuentacontabletipoAux);
					}		
				}
				this.iIdNuevoTipoCuentaContableTipo=0L;
				this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().removeAll(tipocuentacontabletiposAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipos) {
					if(tipocuentacontabletipoAux.getId()<0) {
						tipocuentacontabletiposAux.add(tipocuentacontabletipoAux);
					}		
				}
				this.iIdNuevoTipoCuentaContableTipo=0L;
				this.tipocuentacontabletipos.removeAll(tipocuentacontabletiposAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCuentaContableTipo 
					&& this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size()>0
					) {
					tipocuentacontabletipoAux=this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().get(this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size() - 1);
				
					if(tipocuentacontabletipoAux.getId()<0) {
						this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().remove(tipocuentacontabletipoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCuentaContableTipo && this.tipocuentacontabletipos.size()>0) {
					tipocuentacontabletipoAux=this.tipocuentacontabletipos.get(this.tipocuentacontabletipos.size() - 1);
				
					if(tipocuentacontabletipoAux.getId()<0) {
						this.tipocuentacontabletipos.remove(tipocuentacontabletipoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCuentaContableTipo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocuentacontabletipo.getId()<0) {
				this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().remove(this.tipocuentacontabletipo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocuentacontabletipo.getId()<0) {
				this.tipocuentacontabletipos.remove(this.tipocuentacontabletipo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCuentaContableTipo(List<TipoCuentaContableTipo> tipocuentacontabletiposAux) throws Exception {
		TipoCuentaContableTipoConstantesFunciones.setEstadosInicialesTipoCuentaContableTipo(tipocuentacontabletiposAux);
	}
	
	public void setEstadosInicialesTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipoAux) throws Exception {
		TipoCuentaContableTipoConstantesFunciones.setEstadosInicialesTipoCuentaContableTipo(tipocuentacontabletipoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCuentaContableTipoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCuentaContableTipoActual()) {
				if(!this.isEsNuevoTipoCuentaContableTipo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCuentaContableTipo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCuentaContableTipoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Cuenta Contable Tipo ?", "MANTENIMIENTO DE Tipo Cuenta Contable Tipo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCuentaContableTipo tipocuentacontabletipo) throws Exception {
		TipoCuentaContableTipoConstantesFunciones.seleccionarAsignar(this.tipocuentacontabletipo,tipocuentacontabletipo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCuentaContableTipo=this.isPermisoActualizarOriginalTipoCuentaContableTipo;
			
			
			this.seleccionarAsignar(tipocuentacontabletipo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCuentaContableTipoConstantesFunciones.quitarEspaciosTipoCuentaContableTipo(this.tipocuentacontabletipo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocuentacontabletipoSessionBean.setsFuncionBusquedaRapida(this.tipocuentacontabletipoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCuentaContableTipo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCuentaContableTipo(esParaCancelar);				
				this.cancelarNuevoTipoCuentaContableTipo(esParaCancelar);								
			}
			
			this.tipocuentacontabletipo=new TipoCuentaContableTipo();
			
			this.inicializarTipoCuentaContableTipo();
			
			this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCuentaContableTipo() throws Exception {
		try {
			TipoCuentaContableTipoConstantesFunciones.inicializarTipoCuentaContableTipo(this.tipocuentacontabletipo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCuentaContableTipos(String sAccionBusqueda,List<TipoCuentaContableTipo> tipocuentacontabletiposParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCuentaContableTipo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCuentaContableTipoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCuentaContableTipoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCuentaContableTipo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Cuenta Contable Tipos");		
		parameters.put("busquedapor", TipoCuentaContableTipoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CuentaContableTipo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoCuentaContableTipoLogic tipocuentacontabletipoLogicAuxiliar=new TipoCuentaContableTipoLogic();
					tipocuentacontabletipoLogicAuxiliar.setDatosCliente(tipocuentacontabletipoLogic.getDatosCliente());				
					tipocuentacontabletipoLogicAuxiliar.setTipoCuentaContableTipos(tipocuentacontabletiposParaReportes);
					
					tipocuentacontabletipoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCuentaContableTipoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocuentacontabletiposParaReportes=tipocuentacontabletipoLogicAuxiliar.getTipoCuentaContableTipos();
					
					//tipocuentacontabletipoLogic.getNewConnexionToDeep();
					
					//for (TipoCuentaContableTipo tipocuentacontabletipo:tipocuentacontabletiposParaReportes) {
					//	tipocuentacontabletipoLogic.deepLoad(tipocuentacontabletipo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocuentacontabletipoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocuentacontabletipoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCuentaContableTipo = AuxiliarReportes.class.getResourceAsStream("CuentaContableTipoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuentacontabletipo", reportFileCuentaContableTipo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCuentaContableTipo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCuentaContableTipoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCuentaContableTipoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCuentaContableTipo=new JRBeanArrayDataSource(TipoCuentaContableTipoJInternalFrame.TraerTipoCuentaContableTipoBeans(tipocuentacontabletiposParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCuentaContableTipo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCuentaContableTipoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCuentaContableTipoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCuentaContableTipoBean.TraerTipoCuentaContableTipoBeans(tipocuentacontabletiposParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,tipocuentacontabletiposParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,tipocuentacontabletiposParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipoActionPerformed(null);
					//this.generarExcelReporteTipoCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,tipocuentacontabletiposParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,tipocuentacontabletiposParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,tipocuentacontabletiposParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,tipocuentacontabletiposParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCuentaContableTipos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaContableTipo> tipocuentacontabletiposParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentacontabletipo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaContableTipos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCuentaContableTipo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCuentaContableTipo tipocuentacontabletipo : tipocuentacontabletiposParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCuentaContableTipoConstantesFunciones.generarExcelReporteDataTipoCuentaContableTipo("NORMAL",row,workbook,tipocuentacontabletipo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCuentaContableTipo(String sTipo,Row row,Workbook workbook) {
		
		TipoCuentaContableTipoConstantesFunciones.generarExcelReporteHeaderTipoCuentaContableTipo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCuentaContableTipos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaContableTipo> tipocuentacontabletiposParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentacontabletipo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaContableTipos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCuentaContableTipo tipocuentacontabletipo : tipocuentacontabletiposParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCuentaContableTipoConstantesFunciones.getTipoCuentaContableTipoDescripcion(tipocuentacontabletipo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuentacontabletipo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCuentaContableTipos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaContableTipo> tipocuentacontabletiposParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCuentaContableTipo> tipocuentacontabletiposRespaldo=null;
		
		classes=TipoCuentaContableTipoConstantesFunciones.getClassesRelationshipsOfTipoCuentaContableTipo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocuentacontabletipoLogic.setDatosCliente(this.datosCliente);
		this.tipocuentacontabletipoLogic.setDatosDeep(this.datosDeep);
		this.tipocuentacontabletipoLogic.setIsConDeep(true);
		
		tipocuentacontabletiposRespaldo=this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos();
		
		this.tipocuentacontabletipoLogic.setTipoCuentaContableTipos(tipocuentacontabletiposParaReportes);	
		this.tipocuentacontabletipoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocuentacontabletiposParaReportes=this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos();
		this.tipocuentacontabletipoLogic.setTipoCuentaContableTipos(tipocuentacontabletiposRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentacontabletipo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaContableTipos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCuentaContableTipo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCuentaContableTipo tipocuentacontabletipo : tipocuentacontabletiposParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCuentaContableTipo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCuentaContableTipoConstantesFunciones.generarExcelReporteDataTipoCuentaContableTipo("NORMAL",row,workbook,tipocuentacontabletipo,cellStyleDataAux);
		
			
			


				//CuentaContableTipo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocuentacontabletipo.getCuentaContableTipos()!=null && tipocuentacontabletipo.getCuentaContableTipos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuentaContableTipoConstantesFunciones.generarExcelReporteHeaderCuentaContableTipo("RELACIONADO",row,workbook);
				}

				if(tipocuentacontabletipo.getCuentaContableTipos()!=null) {
					i2=0;
					for(CuentaContableTipo cuentacontabletipo : tipocuentacontabletipo.getCuentaContableTipos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuentaContableTipoConstantesFunciones.generarExcelReporteDataCuentaContableTipo("RELACIONADO",row,workbook,cuentacontabletipo,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoCuentaContableTipoConstantesFunciones.getTipoCuentaContableTipoDescripcion(tipocuentacontabletipo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCuentaContableTipo() throws Exception {		
		this.startProcessTipoCuentaContableTipo(true);
	}
	
	public void startProcessTipoCuentaContableTipo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCuentaContableTipo ,this.jPanelParametrosReportesTipoCuentaContableTipo, this.jScrollPanelDatosTipoCuentaContableTipo,this.jPanelPaginacionTipoCuentaContableTipo, this.jScrollPanelDatosEdicionTipoCuentaContableTipo, this.jPanelAccionesTipoCuentaContableTipo,this.jPanelAccionesFormularioTipoCuentaContableTipo,this.jmenuBarTipoCuentaContableTipo,this.jmenuBarDetalleTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,this.jTtoolBarDetalleTipoCuentaContableTipo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCuentaContableTipo=this.jTabbedPaneBusquedasTipoCuentaContableTipo; 
		
		final JPanel jPanelParametrosReportesTipoCuentaContableTipo=this.jPanelParametrosReportesTipoCuentaContableTipo;
		//final JScrollPane jScrollPanelDatosTipoCuentaContableTipo=this.jScrollPanelDatosTipoCuentaContableTipo;
		final JTable jTableDatosTipoCuentaContableTipo=this.jTableDatosTipoCuentaContableTipo;		
		final JPanel jPanelPaginacionTipoCuentaContableTipo=this.jPanelPaginacionTipoCuentaContableTipo;
		//final JScrollPane jScrollPanelDatosEdicionTipoCuentaContableTipo=this.jScrollPanelDatosEdicionTipoCuentaContableTipo;
		final JPanel jPanelAccionesTipoCuentaContableTipo=this.jPanelAccionesTipoCuentaContableTipo;
		
		JPanel jPanelCamposAuxiliarTipoCuentaContableTipo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCuentaContableTipo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			jPanelCamposAuxiliarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jPanelCamposTipoCuentaContableTipo;
			jPanelAccionesFormularioAuxiliarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jPanelAccionesFormularioTipoCuentaContableTipo;
		}
		
		final JPanel jPanelCamposTipoCuentaContableTipo=jPanelCamposAuxiliarTipoCuentaContableTipo;
		final JPanel jPanelAccionesFormularioTipoCuentaContableTipo=jPanelAccionesFormularioAuxiliarTipoCuentaContableTipo;
		
		
		final JMenuBar jmenuBarTipoCuentaContableTipo=this.jmenuBarTipoCuentaContableTipo;
		final JToolBar jTtoolBarTipoCuentaContableTipo=this.jTtoolBarTipoCuentaContableTipo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCuentaContableTipo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCuentaContableTipo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			jmenuBarDetalleAuxiliarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jmenuBarDetalleTipoCuentaContableTipo;
			jTtoolBarDetalleAuxiliarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTtoolBarDetalleTipoCuentaContableTipo;
		}
		
		final JMenuBar jmenuBarDetalleTipoCuentaContableTipo=jmenuBarDetalleAuxiliarTipoCuentaContableTipo;
		final JToolBar jTtoolBarDetalleTipoCuentaContableTipo=jTtoolBarDetalleAuxiliarTipoCuentaContableTipo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCuentaContableTipo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCuentaContableTipo;
			processRunnable.jTableDatos=jTableDatosTipoCuentaContableTipo;
			processRunnable.jPanelCampos=jPanelCamposTipoCuentaContableTipo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCuentaContableTipo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCuentaContableTipo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCuentaContableTipo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCuentaContableTipo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCuentaContableTipo;
			processRunnable.jTtoolBar=jTtoolBarTipoCuentaContableTipo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCuentaContableTipo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCuentaContableTipo ,jPanelParametrosReportesTipoCuentaContableTipo,jTableDatosTipoCuentaContableTipo, /*jScrollPanelDatosTipoCuentaContableTipo,*/jPanelCamposTipoCuentaContableTipo,jPanelPaginacionTipoCuentaContableTipo, /*jScrollPanelDatosEdicionTipoCuentaContableTipo,*/ jPanelAccionesTipoCuentaContableTipo,jPanelAccionesFormularioTipoCuentaContableTipo,jmenuBarTipoCuentaContableTipo,jmenuBarDetalleTipoCuentaContableTipo,jTtoolBarTipoCuentaContableTipo,jTtoolBarDetalleTipoCuentaContableTipo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCuentaContableTipo ,jPanelParametrosReportesTipoCuentaContableTipo, jScrollPanelDatosTipoCuentaContableTipo,jPanelPaginacionTipoCuentaContableTipo, jScrollPanelDatosEdicionTipoCuentaContableTipo, jPanelAccionesTipoCuentaContableTipo,jPanelAccionesFormularioTipoCuentaContableTipo,jmenuBarTipoCuentaContableTipo,jmenuBarDetalleTipoCuentaContableTipo,jTtoolBarTipoCuentaContableTipo,jTtoolBarDetalleTipoCuentaContableTipo);
						
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
	
	public void finishProcessTipoCuentaContableTipo() {// throws Exception 
		this.finishProcessTipoCuentaContableTipo(true);
	}
	
	public void finishProcessTipoCuentaContableTipo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCuentaContableTipo ,this.jPanelParametrosReportesTipoCuentaContableTipo, this.jScrollPanelDatosTipoCuentaContableTipo,this.jPanelPaginacionTipoCuentaContableTipo, this.jScrollPanelDatosEdicionTipoCuentaContableTipo, this.jPanelAccionesTipoCuentaContableTipo,this.jPanelAccionesFormularioTipoCuentaContableTipo,this.jmenuBarTipoCuentaContableTipo,this.jmenuBarDetalleTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,this.jTtoolBarDetalleTipoCuentaContableTipo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCuentaContableTipo=this.jTabbedPaneBusquedasTipoCuentaContableTipo; 
		
		final JPanel jPanelParametrosReportesTipoCuentaContableTipo=this.jPanelParametrosReportesTipoCuentaContableTipo;
		//final JScrollPane jScrollPanelDatosTipoCuentaContableTipo=this.jScrollPanelDatosTipoCuentaContableTipo;
		final JTable jTableDatosTipoCuentaContableTipo=this.jTableDatosTipoCuentaContableTipo;		
		final JPanel jPanelPaginacionTipoCuentaContableTipo=this.jPanelPaginacionTipoCuentaContableTipo;
		//final JScrollPane jScrollPanelDatosEdicionTipoCuentaContableTipo=this.jScrollPanelDatosEdicionTipoCuentaContableTipo;
		final JPanel jPanelAccionesTipoCuentaContableTipo=this.jPanelAccionesTipoCuentaContableTipo;
		
		JPanel jPanelCamposAuxiliarTipoCuentaContableTipo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCuentaContableTipo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			jPanelCamposAuxiliarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jPanelCamposTipoCuentaContableTipo;
			jPanelAccionesFormularioAuxiliarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jPanelAccionesFormularioTipoCuentaContableTipo;
		}
		
		final JPanel jPanelCamposTipoCuentaContableTipo=jPanelCamposAuxiliarTipoCuentaContableTipo;
		final JPanel jPanelAccionesFormularioTipoCuentaContableTipo=jPanelAccionesFormularioAuxiliarTipoCuentaContableTipo;
		
		
		final JMenuBar jmenuBarTipoCuentaContableTipo=this.jmenuBarTipoCuentaContableTipo;		
		final JToolBar jTtoolBarTipoCuentaContableTipo=this.jTtoolBarTipoCuentaContableTipo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCuentaContableTipo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCuentaContableTipo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			jmenuBarDetalleAuxiliarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jmenuBarDetalleTipoCuentaContableTipo;
			jTtoolBarDetalleAuxiliarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTtoolBarDetalleTipoCuentaContableTipo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCuentaContableTipo=jmenuBarDetalleAuxiliarTipoCuentaContableTipo;
		final JToolBar jTtoolBarDetalleTipoCuentaContableTipo=jTtoolBarDetalleAuxiliarTipoCuentaContableTipo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCuentaContableTipo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCuentaContableTipo;
			processRunnable.jTableDatos=jTableDatosTipoCuentaContableTipo;
			processRunnable.jPanelCampos=jPanelCamposTipoCuentaContableTipo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCuentaContableTipo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCuentaContableTipo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCuentaContableTipo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCuentaContableTipo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCuentaContableTipo;
			processRunnable.jTtoolBar=jTtoolBarTipoCuentaContableTipo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCuentaContableTipo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCuentaContableTipo ,jPanelParametrosReportesTipoCuentaContableTipo, jTableDatosTipoCuentaContableTipo,/*jScrollPanelDatosTipoCuentaContableTipo,*/jPanelCamposTipoCuentaContableTipo,jPanelPaginacionTipoCuentaContableTipo, /*jScrollPanelDatosEdicionTipoCuentaContableTipo,*/ jPanelAccionesTipoCuentaContableTipo,jPanelAccionesFormularioTipoCuentaContableTipo,jmenuBarTipoCuentaContableTipo,jmenuBarDetalleTipoCuentaContableTipo,jTtoolBarTipoCuentaContableTipo,jTtoolBarDetalleTipoCuentaContableTipo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCuentaContableTipo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCuentaContableTipo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCuentaContableTipo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCuentaContableTipo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCuentaContableTipo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCuentaContableTipo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCuentaContableTipo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCuentaContableTipo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCuentaContableTipo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocuentacontabletipoConstantesFunciones.getsFinalQueryTipoCuentaContableTipo();
		String  finalQueryPaginacionTodos=this.tipocuentacontabletipoConstantesFunciones.getsFinalQueryTipoCuentaContableTipo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCuentaContableTipoConstantesFunciones.getArrayColumnasGlobalesNoTipoCuentaContableTipo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCuentaContableTipoConstantesFunciones.getArrayColumnasGlobalesTipoCuentaContableTipo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCuentaContableTipoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocuentacontabletiposEliminados= new ArrayList<TipoCuentaContableTipo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCuentaContableTipo();
		
				///*TipoCuentaContableTipoSessionBean*/this.tipocuentacontabletipoSessionBean=new TipoCuentaContableTipoSessionBean();
			
			if(this.tipocuentacontabletipoSessionBean==null) {
				this.tipocuentacontabletipoSessionBean=new TipoCuentaContableTipoSessionBean();
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
					this.iNumeroPaginacion=TipoCuentaContableTipoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCuentaContableTipoConstantesFunciones.getClassesForeignKeysOfTipoCuentaContableTipo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocuentacontabletipo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocuentacontabletiposAux= new ArrayList<TipoCuentaContableTipo>();
			
				
			tipocuentacontabletipoLogic.setDatosCliente(this.datosCliente);
			tipocuentacontabletipoLogic.setDatosDeep(this.datosDeep);
			tipocuentacontabletipoLogic.setIsConDeep(true);
			
			
			tipocuentacontabletipoLogic.getTipoCuentaContableTipoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocuentacontabletipoLogic.getTodosTipoCuentaContableTipos(finalQueryGlobal,pagination);
					
					//tipocuentacontabletipoLogic.getTodosTipoCuentaContableTiposWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocuentacontabletipoLogic.getTipoCuentaContableTipos()==null|| tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentacontabletiposAux= new ArrayList<TipoCuentaContableTipo>();
							tipocuentacontabletiposAux.addAll(tipocuentacontabletipoLogic.getTipoCuentaContableTipos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentacontabletiposAux= new ArrayList<TipoCuentaContableTipo>();
							tipocuentacontabletiposAux.addAll(tipocuentacontabletipos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentacontabletipoLogic.getTodosTipoCuentaContableTipos(finalQueryGlobal+"",this.pagination);												
							
							//tipocuentacontabletipoLogic.getTodosTipoCuentaContableTiposWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCuentaContableTipos("Todos",tipocuentacontabletipoLogic.getTipoCuentaContableTipos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentacontabletipoLogic.setTipoCuentaContableTipos(new ArrayList<TipoCuentaContableTipo>());					
							tipocuentacontabletipoLogic.getTipoCuentaContableTipos().addAll(tipocuentacontabletiposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentacontabletipos=new ArrayList<TipoCuentaContableTipo>();
							tipocuentacontabletipos.addAll(tipocuentacontabletiposAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCuentaContableTipo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCuentaContableTipo=this.idActual;
				
				} else if(this.idTipoCuentaContableTipoActual!=null && this.idTipoCuentaContableTipoActual!=0L) {
					idTipoCuentaContableTipo=idTipoCuentaContableTipoActual;
				}
				
					
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndicePorId(idTipoCuentaContableTipo);
				
				this.tipocuentacontabletipos=new ArrayList<TipoCuentaContableTipo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocuentacontabletipoLogic.getEntity(idTipoCuentaContableTipo);
					
					//tipocuentacontabletipoLogic.getEntityWithConnection(idTipoCuentaContableTipo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentacontabletipoLogic.setTipoCuentaContableTipos(new ArrayList<TipoCuentaContableTipo>());
					tipocuentacontabletipoLogic.getTipoCuentaContableTipos().add(tipocuentacontabletipoLogic.getTipoCuentaContableTipo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentacontabletipos=new ArrayList<TipoCuentaContableTipo>();
					this.tipocuentacontabletipos.add(tipocuentacontabletipo);
				}
				
				if(tipocuentacontabletipoLogic.getTipoCuentaContableTipo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocuentacontabletipoLogic.getTipoCuentaContableTiposBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocuentacontabletipoLogic.getTipoCuentaContableTipos()==null||tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocuentacontabletipos==null|| tipocuentacontabletipos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentacontabletiposAux=new ArrayList<TipoCuentaContableTipo>();
						tipocuentacontabletiposAux.addAll(tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentacontabletiposAux=new ArrayList<TipoCuentaContableTipo>();
							tipocuentacontabletiposAux.addAll(tipocuentacontabletipos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocuentacontabletipoLogic.getTipoCuentaContableTiposBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCuentaContableTipos("BusquedaPorId",tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCuentaContableTipos("BusquedaPorId",tipocuentacontabletipos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentacontabletipoLogic.setTipoCuentaContableTipos(new ArrayList<TipoCuentaContableTipo>());
						tipocuentacontabletipoLogic.getTipoCuentaContableTipos().addAll(tipocuentacontabletiposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentacontabletipos=new ArrayList<TipoCuentaContableTipo>();
							tipocuentacontabletipos.addAll(tipocuentacontabletiposAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocuentacontabletipoLogic.getTipoCuentaContableTiposBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocuentacontabletipoLogic.getTipoCuentaContableTipos()==null||tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocuentacontabletipos==null|| tipocuentacontabletipos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentacontabletiposAux=new ArrayList<TipoCuentaContableTipo>();
						tipocuentacontabletiposAux.addAll(tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentacontabletiposAux=new ArrayList<TipoCuentaContableTipo>();
							tipocuentacontabletiposAux.addAll(tipocuentacontabletipos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocuentacontabletipoLogic.getTipoCuentaContableTiposBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCuentaContableTipos("BusquedaPorNombre",tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCuentaContableTipos("BusquedaPorNombre",tipocuentacontabletipos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentacontabletipoLogic.setTipoCuentaContableTipos(new ArrayList<TipoCuentaContableTipo>());
						tipocuentacontabletipoLogic.getTipoCuentaContableTipos().addAll(tipocuentacontabletiposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentacontabletipos=new ArrayList<TipoCuentaContableTipo>();
							tipocuentacontabletipos.addAll(tipocuentacontabletiposAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCuentaContableTipo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCuentaContableTipo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentacontabletipos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentacontabletipos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCuentaContableTipo tipocuentacontabletipo) {
		Boolean permite=true;
		
		if(this.tipocuentacontabletipo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCuentaContableTipoConstantesFunciones.getOrderByListaTipoCuentaContableTipo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCuentaContableTipoConstantesFunciones.getOrderByListaTipoCuentaContableTipo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaContableTipo tipocuentacontabletipo:tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
				if(tipocuentacontabletipo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentacontabletipoTotales=tipocuentacontabletipo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaContableTipo tipocuentacontabletipo:this.tipocuentacontabletipos) {
				if(tipocuentacontabletipo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentacontabletipoTotales=tipocuentacontabletipo;
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
			this.tipocuentacontabletipoAux=new TipoCuentaContableTipo();
			this.tipocuentacontabletipoAux.setsType(Constantes2.S_TOTALES);
			this.tipocuentacontabletipoAux.setIsNew(false);
			this.tipocuentacontabletipoAux.setIsChanged(false);
			this.tipocuentacontabletipoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCuentaContableTipoConstantesFunciones.TotalizarValoresFilaTipoCuentaContableTipo(this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos(),this.tipocuentacontabletipoAux);
				
				this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().add(this.tipocuentacontabletipoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCuentaContableTipoConstantesFunciones.TotalizarValoresFilaTipoCuentaContableTipo(this.tipocuentacontabletipos,this.tipocuentacontabletipoAux);
				
				this.tipocuentacontabletipos.add(this.tipocuentacontabletipoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocuentacontabletipoTotales=new TipoCuentaContableTipo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().remove(tipocuentacontabletipoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocuentacontabletipos.remove(tipocuentacontabletipoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocuentacontabletipoTotales=new TipoCuentaContableTipo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaContableTipo tipocuentacontabletipo:tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
				if(tipocuentacontabletipo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentacontabletipoTotales=tipocuentacontabletipo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCuentaContableTipoConstantesFunciones.TotalizarValoresFilaTipoCuentaContableTipo(this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos(),tipocuentacontabletipoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaContableTipo tipocuentacontabletipo:this.tipocuentacontabletipos) {
				if(tipocuentacontabletipo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentacontabletipoTotales=tipocuentacontabletipo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCuentaContableTipoConstantesFunciones.TotalizarValoresFilaTipoCuentaContableTipo(this.tipocuentacontabletipos,tipocuentacontabletipoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCuentaContableTiposBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCuentaContableTiposBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCuentaContableTipoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoCuentaContableTiposBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentacontabletipoLogic.getTipoCuentaContableTiposBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCuentaContableTiposBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentacontabletipoLogic.getTipoCuentaContableTiposBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCuentaContableTipoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentacontabletipoLogic.getTipoCuentaContableTipoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoCuentaContableTipo() {
		this.isPermisoTodoTipoCuentaContableTipo=false;
		this.isPermisoNuevoTipoCuentaContableTipo=false;
		this.isPermisoActualizarTipoCuentaContableTipo=false;
		this.isPermisoActualizarOriginalTipoCuentaContableTipo=false;
		this.isPermisoEliminarTipoCuentaContableTipo=false;
		this.isPermisoGuardarCambiosTipoCuentaContableTipo=false;
		this.isPermisoConsultaTipoCuentaContableTipo=false;
		this.isPermisoBusquedaTipoCuentaContableTipo=false;
		this.isPermisoReporteTipoCuentaContableTipo=false;		
		this.isPermisoOrdenTipoCuentaContableTipo=false;		
		this.isPermisoPaginacionMedioTipoCuentaContableTipo=false;		
		this.isPermisoPaginacionAltoTipoCuentaContableTipo=false;
		this.isPermisoPaginacionTodoTipoCuentaContableTipo=false;
		this.isPermisoCopiarTipoCuentaContableTipo=false;		
		this.isPermisoVerFormTipoCuentaContableTipo=false;		
		this.isPermisoDuplicarTipoCuentaContableTipo=false;		
		this.isPermisoOrdenTipoCuentaContableTipo=false;		
	}
	
	public void setPermisosUsuarioTipoCuentaContableTipo(Boolean isPermiso) {
		this.isPermisoTodoTipoCuentaContableTipo=isPermiso;
		this.isPermisoNuevoTipoCuentaContableTipo=isPermiso;
		this.isPermisoActualizarTipoCuentaContableTipo=isPermiso;
		this.isPermisoActualizarOriginalTipoCuentaContableTipo=isPermiso;
		this.isPermisoEliminarTipoCuentaContableTipo=isPermiso;
		this.isPermisoGuardarCambiosTipoCuentaContableTipo=isPermiso;
		this.isPermisoConsultaTipoCuentaContableTipo=isPermiso;
		this.isPermisoBusquedaTipoCuentaContableTipo=isPermiso;
		this.isPermisoReporteTipoCuentaContableTipo=isPermiso;
		this.isPermisoOrdenTipoCuentaContableTipo=isPermiso;		
		this.isPermisoPaginacionMedioTipoCuentaContableTipo=isPermiso;		
		this.isPermisoPaginacionAltoTipoCuentaContableTipo=isPermiso;		
		this.isPermisoPaginacionTodoTipoCuentaContableTipo=isPermiso;		
		this.isPermisoCopiarTipoCuentaContableTipo=isPermiso;		
		this.isPermisoVerFormTipoCuentaContableTipo=isPermiso;		
		this.isPermisoDuplicarTipoCuentaContableTipo=isPermiso;
		this.isPermisoOrdenTipoCuentaContableTipo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCuentaContableTipo(Boolean isPermiso) {
		//this.isPermisoTodoTipoCuentaContableTipo=isPermiso;
		this.isPermisoNuevoTipoCuentaContableTipo=isPermiso;
		this.isPermisoActualizarTipoCuentaContableTipo=isPermiso;
		this.isPermisoActualizarOriginalTipoCuentaContableTipo=isPermiso;
		this.isPermisoEliminarTipoCuentaContableTipo=isPermiso;
		this.isPermisoGuardarCambiosTipoCuentaContableTipo=isPermiso;
		//this.isPermisoConsultaTipoCuentaContableTipo=isPermiso;
		//this.isPermisoBusquedaTipoCuentaContableTipo=isPermiso;
		//this.isPermisoReporteTipoCuentaContableTipo=isPermiso;
		//this.isPermisoOrdenTipoCuentaContableTipo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCuentaContableTipo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCuentaContableTipo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCuentaContableTipo=isPermiso;		
		//this.isPermisoCopiarTipoCuentaContableTipo=isPermiso;		
		//this.isPermisoDuplicarTipoCuentaContableTipo=isPermiso;
		//this.isPermisoOrdenTipoCuentaContableTipo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCuentaContableTipoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CuentaContableTipoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCuentaContableTipoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCuentaContableTipo=false;
		this.isTienePermisosCuentaContableTipo=this.verificarGetPermisosUsuarioOpcionTipoCuentaContableTipoClaseRelacionada(this.opcionsRelacionadas,CuentaContableTipoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCuentaContableTipo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCuentaContableTipoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCuentaContableTipo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCuentaContableTipoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCuentaContableTipoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCuentaContableTipoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCuentaContableTipo && this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTabbedPaneRelacionesTipoCuentaContableTipo.remove(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCuentaContableTipo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCuentaContableTipoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCuentaContableTipoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCuentaContableTipo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCuentaContableTipo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCuentaContableTipo=this.isPermisoActualizarTipoCuentaContableTipo;
			this.isPermisoEliminarTipoCuentaContableTipo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCuentaContableTipo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCuentaContableTipo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCuentaContableTipo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCuentaContableTipo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCuentaContableTipo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCuentaContableTipo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCuentaContableTipo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCuentaContableTipo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCuentaContableTipo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCuentaContableTipo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCuentaContableTipo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCuentaContableTipo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCuentaContableTipo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCuentaContableTipo.setToolTipText(this.jTableDatosTipoCuentaContableTipo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCuentaContableTipo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCuentaContableTipo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCuentaContableTipoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCuentaContableTipoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCuentaContableTipo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCuentaContableTipo && this.tipocuentacontabletipoConstantesFunciones.mostrarCuentaContableTipoTipoCuentaContableTipo && !TipoCuentaContableTipoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuenta Contable Tipo");
			reporte.setsDescripcion("Cuenta Contable Tipo");
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
	
		
	public void inicializarCombosForeignKeyTipoCuentaContableTipoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCuentaContableTipoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCuentaContableTipoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCuentaContableTipoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoCuentaContableTipoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCuentaContableTipo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoCuentaContableTipo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCuentaContableTipo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCuentaContableTipo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaContableTipo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCuentaContableTipo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaContableTipo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCuentaContableTipo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCuentaContableTipo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCuentaContableTipo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCuentaContableTipo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCuentaContableTipo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCuentaContableTipo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoCuentaContableTipoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCuentaContableTipoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCuentaContableTipoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocuentacontabletipoSessionBean=new TipoCuentaContableTipoSessionBean(); 
		this.tipocuentacontabletipoConstantesFunciones=new TipoCuentaContableTipoConstantesFunciones(); 
		this.tipocuentacontabletipoBean=new TipoCuentaContableTipo();//(this.tipocuentacontabletipoConstantesFunciones); 		
		this.tipocuentacontabletipoReturnGeneral=new TipoCuentaContableTipoParameterReturnGeneral(); 
		
		this.tipocuentacontabletipoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentacontabletipoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCuentaContableTipoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCuentaContableTipoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCuentaContableTipoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCuentaContableTipo(true);
			
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
			
			this.tipocuentacontabletipoConstantesFunciones=new TipoCuentaContableTipoConstantesFunciones(); 
			this.tipocuentacontabletipoBean=new TipoCuentaContableTipo();//this.tipocuentacontabletipoConstantesFunciones); 			
			this.tipocuentacontabletipoReturnGeneral=new TipoCuentaContableTipoParameterReturnGeneral(); 
		
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuenta Contable Tipo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocuentacontabletipo=new TipoCuentaContableTipo();
			this.tipocuentacontabletipos = new ArrayList<TipoCuentaContableTipo>();
			this.tipocuentacontabletiposAux = new ArrayList<TipoCuentaContableTipo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic=new TipoCuentaContableTipoLogic();
				this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocuentacontabletipoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocuentacontabletipoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCuentaContableTipo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCuentaContableTipo);	
					}
					
					if(this.jInternalFrameImportacionTipoCuentaContableTipo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCuentaContableTipo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCuentaContableTipo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCuentaContableTipo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCuentaContableTipo);
				this.jInternalFrameDetalleFormTipoCuentaContableTipo.setVisible(false);
				this.jInternalFrameDetalleFormTipoCuentaContableTipo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo);
					this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCuentaContableTipo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCuentaContableTipo);
					this.jInternalFrameImportacionTipoCuentaContableTipo.setVisible(false);
					this.jInternalFrameImportacionTipoCuentaContableTipo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCuentaContableTipo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCuentaContableTipo);
					this.jInternalFrameOrderByTipoCuentaContableTipo.setVisible(false);
					this.jInternalFrameOrderByTipoCuentaContableTipo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCuentaContableTipoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCuentaContableTipoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocuentacontabletipoReturnGeneral=new TipoCuentaContableTipoParameterReturnGeneral();
			
			this.tipocuentacontabletipoParameterGeneral=new TipoCuentaContableTipoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocuentacontabletipoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCuentaContableTipoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CuentaContableTipoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCuentaContableTipoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado(),this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCuentaContableTipoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado(),this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaDuplicarTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaCopiarTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaVerFormTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaOrdenTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaModificarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=false;
			
			
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCuentaContableTipo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCuentaContableTipo(false);
			
			this.setPermisosUsuarioTipoCuentaContableTipo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado() && this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCuentaContableTipoClasesRelacionadas();
			}
			
			if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCuentaContableTipoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCuentaContableTipo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCuentaContableTipo();
			}
			
			if(!this.isPermisoBusquedaTipoCuentaContableTipo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCuentaContableTipo,this.isPermisoPaginacionMedioTipoCuentaContableTipo,this.isPermisoPaginacionTodoTipoCuentaContableTipo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCuentaContableTipoConstantesFunciones.getTiposSeleccionarTipoCuentaContableTipo());
				
				this.tiposColumnasSelect=TipoCuentaContableTipoConstantesFunciones.getTiposSeleccionarTipoCuentaContableTipo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCuentaContableTipo();				
				//this.tiposRelacionesSelect=TipoCuentaContableTipoConstantesFunciones.getTiposRelacionesTipoCuentaContableTipo(true);
				
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
			//if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCuentaContableTipo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoCuentaContableTipo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoCuentaContableTipo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaContableTipo() ;
			
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
			
			
			this.cuentacontabletipoLogic=new CuentaContableTipoLogic(); 
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
				tipocuentacontabletipoImplementable= (TipoCuentaContableTipoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCuentaContableTipoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocuentacontabletipoImplementableHome= (TipoCuentaContableTipoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCuentaContableTipoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocuentacontabletipos= new ArrayList<TipoCuentaContableTipo>();
			this.tipocuentacontabletiposEliminados= new ArrayList<TipoCuentaContableTipo>();
						
			this.isEsNuevoTipoCuentaContableTipo=false;
			this.esParaAccionDesdeFormularioTipoCuentaContableTipo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCuentaContableTipo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCuentaContableTipo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCuentaContableTipoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCuentaContableTipo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCuentaContableTipo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCuentaContableTipo();
			}
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCuentaContableTipo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCuentaContableTipo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCuentaContableTipo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCuentaContableTipo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCuentaContableTipo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCuentaContableTipo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCuentaContableTipo")) {
				iIndex=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTabbedPaneRelacionesTipoCuentaContableTipo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTabbedPaneRelacionesTipoCuentaContableTipo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();	
				
				

				if(sTitle.equals("Cuenta Contable Tipos")) {
					if(!CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCuentaContableTipo();

						this.cargarParteTabPanelRelacionadaCuentaContableTipo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCuentaContableTipo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCuentaContableTipo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.cargarSessionConBeanSwingJInternalFrameCuentaContableTipo(false,true,iIndex);
		this.jButtonCuentaContableTipoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuentaContableTipo();

		//this.jTabbedPaneRelacionesTipoCuentaContableTipo.updateUI();
		//this.jTabbedPaneRelacionesTipoCuentaContableTipo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCuentaContableTipo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CuentaContableTipo")) {
				int row=this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
				jButtonCuentaContableTipoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cuenta Contable Tipo")) {

					if(this.isTienePermisosCuentaContableTipo && this.tipocuentacontabletipoConstantesFunciones.mostrarCuentaContableTipoTipoCuentaContableTipo && !TipoCuentaContableTipoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuenta Contable Tipos"+"("+CuentaContableTipoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuenta Contable Tipos");

						if(tipocuentacontabletipoConstantesFunciones.resaltarCuentaContableTipoTipoCuentaContableTipo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocuentacontabletipoConstantesFunciones.resaltarCuentaContableTipoTipoCuentaContableTipo);
						}

						jmenuItem.setEnabled(this.tipocuentacontabletipoConstantesFunciones.activarCuentaContableTipoTipoCuentaContableTipo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CuentaContableTipo"));

						

						this.jInternalFrameDetalleFormTipoCuentaContableTipo.jmenuDetalleTipoCuentaContableTipo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCuentaContableTipo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCuentaContableTipo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCuentaContableTipo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCuentaContableTipoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCuentaContableTipo();
		
		this.cargarCombosFrameForeignKeyTipoCuentaContableTipo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCuentaContableTipo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCuentaContableTipo();
		}
	}
	
	
	
	public void jButtonNuevoTipoCuentaContableTipoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
			
			if(jTableDatosTipoCuentaContableTipo.getRowCount()>=1) {
				jTableDatosTipoCuentaContableTipo.removeRowSelectionInterval(0, jTableDatosTipoCuentaContableTipo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCuentaContableTipo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCuentaContableTipo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCuentaContableTipo(true);			
			//this.tipocuentacontabletipo=new TipoCuentaContableTipo();
			//this.tipocuentacontabletipo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaContableTipo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaContableTipo() ;
			
			if(TipoCuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaContableTipo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocuentacontabletipo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);				
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
			if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCuentaContableTipo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCuentaContableTipoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCuentaContableTipo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCuentaContableTipo.getSelectedRows().length;			
			}
			
			tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCuentaContableTipo--;			
				//TipoCuentaContableTipo tipocuentacontabletipoAux= new TipoCuentaContableTipo();			
				//tipocuentacontabletipoAux.setId(this.iIdNuevoTipoCuentaContableTipo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCuentaContableTipo tipocuentacontabletipoOrigen=new TipoCuentaContableTipo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCuentaContableTipo tipocuentacontabletipoOrigen : tipocuentacontabletiposSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocuentacontabletipoOrigen =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentacontabletipoOrigen =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCuentaContableTipo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocuentacontabletipo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCuentaContableTipo(tipocuentacontabletipoOrigen,this.tipocuentacontabletipo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().add(this.tipocuentacontabletipoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocuentacontabletipos.add(this.tipocuentacontabletipoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
				
				this.jTableDatosTipoCuentaContableTipo.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaContableTipo(), this.getIndiceNuevoTipoCuentaContableTipo());
				
				int iLastRow =  this.jTableDatosTipoCuentaContableTipo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCuentaContableTipo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCuentaContableTipo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();									
		
			TipoCuentaContableTipo tipocuentacontabletipoOrigen=new TipoCuentaContableTipo();
			TipoCuentaContableTipo tipocuentacontabletipoDestino=new TipoCuentaContableTipo();
				
			tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCuentaContableTipo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocuentacontabletiposSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCuentaContableTipo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentacontabletipoOrigen =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocuentacontabletipoOrigen =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentacontabletipoDestino =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocuentacontabletipoDestino =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocuentacontabletipoOrigen =tipocuentacontabletiposSeleccionados.get(0);
				tipocuentacontabletipoDestino =tipocuentacontabletiposSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCuentaContableTipo(tipocuentacontabletipoOrigen,tipocuentacontabletipoDestino,true,false);
				
				tipocuentacontabletipoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocuentacontabletipoDestino,tipocuentacontabletipoLogic.getTipoCuentaContableTipos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentacontabletipoDestino,tipocuentacontabletipos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
				
				//this.jTableDatosTipoCuentaContableTipo.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaContableTipo(), this.getIndiceNuevoTipoCuentaContableTipo());
				
				int iLastRow =  this.jTableDatosTipoCuentaContableTipo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCuentaContableTipo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCuentaContableTipo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCuentaContableTipo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCuentaContableTipo.setVisible(!isVisible);
			this.jPanelPaginacionTipoCuentaContableTipo.setVisible(!isVisible);
			this.jPanelAccionesTipoCuentaContableTipo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCuentaContableTipo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCuentaContableTipo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCuentaContableTipo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCuentaContableTipo();
			
			this.abrirFrameOrderByTipoCuentaContableTipo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCuentaContableTipo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCuentaContableTipo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCuentaContableTipo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCuentaContableTipo.setSize(this.jInternalFrameDetalleFormTipoCuentaContableTipo.iWidthFormulario,this.jInternalFrameDetalleFormTipoCuentaContableTipo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCuentaContableTipo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCuentaContableTipo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCuentaContableTipo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCuentaContableTipo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.jContentPaneDetalleTipoCuentaContableTipo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTabbedPaneRelacionesTipoCuentaContableTipo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaContableTipo.jContentPaneDetalleTipoCuentaContableTipo.getWidth(),TipoCuentaContableTipoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTabbedPaneRelacionesTipoCuentaContableTipo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaContableTipo.jContentPaneDetalleTipoCuentaContableTipo.getWidth(),TipoCuentaContableTipoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTabbedPaneRelacionesTipoCuentaContableTipo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaContableTipo.jContentPaneDetalleTipoCuentaContableTipo.getWidth(),TipoCuentaContableTipoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuentaContableTipo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCuentaContableTipo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCuentaContableTipo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCuentaContableTipo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCuentaContableTipo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCuentaContableTipo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaContableTipo,false,this);
				} else {
					this.jInternalFrameOrderByTipoCuentaContableTipo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaContableTipo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCuentaContableTipo);
				this.jInternalFrameOrderByTipoCuentaContableTipo.setVisible(false);
				this.jInternalFrameOrderByTipoCuentaContableTipo.setSelected(false);
				
				this.jInternalFrameOrderByTipoCuentaContableTipo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCuentaContableTipo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCuentaContableTipo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCuentaContableTipo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCuentaContableTipo==null) {
				
				this.jInternalFrameImportacionTipoCuentaContableTipo=new ImportacionJInternalFrame(TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCuentaContableTipo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCuentaContableTipo);
				this.jInternalFrameImportacionTipoCuentaContableTipo.setVisible(false);
				this.jInternalFrameImportacionTipoCuentaContableTipo.setSelected(false);


				this.jInternalFrameImportacionTipoCuentaContableTipo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCuentaContableTipo"));
				this.jInternalFrameImportacionTipoCuentaContableTipo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCuentaContableTipo"));
				this.jInternalFrameImportacionTipoCuentaContableTipo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCuentaContableTipo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCuentaContableTipo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo==null) {
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo=new ReporteDinamicoJInternalFrame(TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCuentaContableTipo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo);
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaContableTipo"));
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaContableTipo"));
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaContableTipo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaContableTipo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCuentaContableTipo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContableTipo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCuentaContableTipo.jContentPaneDetalleTipoCuentaContableTipo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContableTipo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContableTipo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContableTipo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCuentaContableTipo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCuentaContableTipo);
			
	       	this.jInternalFrameDetalleFormTipoCuentaContableTipo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCuentaContableTipo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCuentaContableTipo.dispose();
			//this.jInternalFrameDetalleFormTipoCuentaContableTipo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCuentaContableTipo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCuentaContableTipo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCuentaContableTipo.setVisible(true);
	        this.jInternalFrameImportacionTipoCuentaContableTipo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCuentaContableTipo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCuentaContableTipo.setVisible(true);
	        this.jInternalFrameOrderByTipoCuentaContableTipo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCuentaContableTipo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCuentaContableTipo.setVisible(false);
	        this.jInternalFrameOrderByTipoCuentaContableTipo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCuentaContableTipo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCuentaContableTipo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCuentaContableTipo.setVisible(false);
	        this.jInternalFrameImportacionTipoCuentaContableTipo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCuentaContableTipo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCuentaContableTipo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCuentaContableTipo(true);
			//this.isEsNuevoTipoCuentaContableTipo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaContableTipo(false) ;
			
			if(tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.getEsGuardarRelacionado() && CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContableTipoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaContableTipo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaContableTipo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCuentaContableTipoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCuentaContableTipo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCuentaContableTipo(true);
			//this.isEsNuevoTipoCuentaContableTipo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocuentacontabletipo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCuentaContableTipo(false) ;
			
			if(TipoCuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaContableTipo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaContableTipo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCuentaContableTipo(false);
			
			//if(!this.isEsNuevoTipoCuentaContableTipo) {								
				int intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(this.tipocuentacontabletipo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);
				
			}
			
			if(this.permiteMantenimiento(this.tipocuentacontabletipo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCuentaContableTipo=true;
					this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
					this.isEsNuevoTipoCuentaContableTipo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCuentaContableTipo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCuentaContableTipo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCuentaContableTipo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaContableTipo(false);
				
				this.habilitarDeshabilitarControlesTipoCuentaContableTipo(false);
			
												
				
				if(TipoCuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCuentaContableTipo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,tipocuentacontabletipoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCuentaContableTipo(this.tipocuentacontabletipo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCuentaContableTipo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocuentacontabletipoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocuentacontabletipo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				this.tipocuentacontabletipo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				this.tipocuentacontabletipo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocuentacontabletipo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCuentaContableTipoModel) this.jTableDatosTipoCuentaContableTipo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCuentaContableTipo=true;
				this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
				this.isEsNuevoTipoCuentaContableTipo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCuentaContableTipo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaContableTipo(false);
				
				this.habilitarDeshabilitarControlesTipoCuentaContableTipo(false);
				
				
				
				if(TipoCuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCuentaContableTipo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCuentaContableTipo.getRowCount()>=1) {
				jTableDatosTipoCuentaContableTipo.removeRowSelectionInterval(0, jTableDatosTipoCuentaContableTipo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCuentaContableTipo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaContableTipo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaContableTipo(false) ;
			
			this.isEsNuevoTipoCuentaContableTipo=false;
			
			if(TipoCuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCuentaContableTipo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCuentaContableTipo(false);
				
				//SI ES MANUAL
				if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCuentaContableTipo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCuentaContableTipo--;			
			//TipoCuentaContableTipo tipocuentacontabletipoAux= new TipoCuentaContableTipo();			
			//tipocuentacontabletipoAux.setId(this.iIdNuevoTipoCuentaContableTipo);
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCuentaContableTipo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);
			
			this.tipocuentacontabletipo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().add(this.tipocuentacontabletipoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocuentacontabletipos.add(this.tipocuentacontabletipoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
			
			this.jTableDatosTipoCuentaContableTipo.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaContableTipo(), this.getIndiceNuevoTipoCuentaContableTipo());
			
			int iLastRow =  this.jTableDatosTipoCuentaContableTipo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCuentaContableTipo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCuentaContableTipo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCuentaContableTipo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaContableTipo(false);
			
			//SI ES MANUAL
			if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaContableTipo();
			}
			
			//this.abrirFrameTreeTipoCuentaContableTipo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Cuenta Contable TipoS ?", "MANTENIMIENTO DE Tipo Cuenta Contable Tipo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCuentaContableTipo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCuentaContableTipo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocuentacontabletipoReturnGeneral=tipocuentacontabletipoLogic.procesarImportacionTipoCuentaContableTiposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocuentacontabletipoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCuentaContableTipoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCuentaContableTipo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCuentaContableTipo.setFileImportacion(this.jInternalFrameImportacionTipoCuentaContableTipo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCuentaContableTipo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCuentaContableTipo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCuentaContableTipo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCuentaContableTipo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();		

		tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCuentaContableTipoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCuentaContableTipoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCuentaContableTipos("Todos",tipocuentacontabletiposSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();		
		
		tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentacontabletipo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCuentaContableTipos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCuentaContableTipo tipocuentacontabletipo:tipocuentacontabletiposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuentacontabletipo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCuentaContableTipo(row);				
			//	iRow++;
			//}				
			
			//for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletiposSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCuentaContableTipo(tipocuentacontabletipoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaContableTipo(false);
			
			//SI ES MANUAL
			if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaContableTipo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaContableTipo(false);
			
			//SI ES MANUAL
			if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCuentaContableTipo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaContableTipo(false);
			
			//SI ES MANUAL
			if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCuentaContableTipo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCuentaContableTipo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCuentaContableTipo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCuentaContableTipo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCuentaContableTipo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCuentaContableTipo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCuentaContableTipo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCuentaContableTipo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCuentaContableTipo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCuentaContableTipo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCuentaContableTipo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCuentaContableTipo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCuentaContableTipo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCuentaContableTipo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCuentaContableTipo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaContableTipo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCuentaContableTipo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCuentaContableTipo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCuentaContableTipo();
		
		this.inicializarActualizarBindingBotonesManualTipoCuentaContableTipo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCuentaContableTipo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaContableTipo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaContableTipo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaContableTipo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCuentaContableTipo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCuentaContableTipo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jCheckBoxPostAccionNuevoTipoCuentaContableTipo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jCheckBoxPostAccionSinCerrarTipoCuentaContableTipo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jCheckBoxPostAccionSinMensajeTipoCuentaContableTipo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCuentaContableTipo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCuentaContableTipo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
				this.jInternalFrameDetalleFormTipoCuentaContableTipo.jCheckBoxPostAccionNuevoTipoCuentaContableTipo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCuentaContableTipo.jCheckBoxPostAccionSinCerrarTipoCuentaContableTipo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCuentaContableTipo.jCheckBoxPostAccionSinMensajeTipoCuentaContableTipo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCuentaContableTipo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCuentaContableTipo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCuentaContableTipo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCuentaContableTipo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCuentaContableTipo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCuentaContableTipo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCuentaContableTipo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaContableTipo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaContableTipo() throws Exception {
		try	{
			if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCuentaContableTipo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCuentaContableTipo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCuentaContableTipo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCuentaContableTipo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCuentaContableTipo.addItem(reporte);
			}
			
			
			if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCuentaContableTipo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCuentaContableTipo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCuentaContableTipo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCuentaContableTipo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaContableTipo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaContableTipo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCuentaContableTipo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaPorId=Long.parseLong(this.jTextFieldidTipoCuentaContableTipoBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoCuentaContableTipo.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCuentaContableTipo(Boolean esInicializar) throws Exception {				
		if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCuentaContableTipo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCuentaContableTipo() throws Exception {
		this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCuentaContableTipo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCuentaContableTipoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCuentaContableTipoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCuentaContableTipoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaContableTipoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCuentaContableTipoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCuentaContableTipoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCuentaContableTipo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocuentacontabletipos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCuentaContableTipo.setModel(new TipoCuentaContableTipoModel(this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCuentaContableTipo.setModel(new TipoCuentaContableTipoModel(this.tipocuentacontabletipos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCuentaContableTipo!=null && this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCuentaContableTipo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaContableTipo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCuentaContableTipoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,tipocuentacontabletipoConstantesFunciones.resaltarSeleccionarTipoCuentaContableTipo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,tipocuentacontabletipoConstantesFunciones.resaltarSeleccionarTipoCuentaContableTipo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaContableTipo,TipoCuentaContableTipoConstantesFunciones.LABEL_ID));

		if(this.tipocuentacontabletipoConstantesFunciones.mostraridTipoCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaContableTipoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocuentacontabletipoConstantesFunciones.resaltaridTipoCuentaContableTipo,this.tipocuentacontabletipoConstantesFunciones.activaridTipoCuentaContableTipo,this,true,"idTipoCuentaContableTipo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuentacontabletipoConstantesFunciones.resaltaridTipoCuentaContableTipo,this.tipocuentacontabletipoConstantesFunciones.activaridTipoCuentaContableTipo,this,true,"idTipoCuentaContableTipo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaContableTipo,TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocuentacontabletipoConstantesFunciones.mostrarnombreTipoCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocuentacontabletipoConstantesFunciones.resaltarnombreTipoCuentaContableTipo,this.tipocuentacontabletipoConstantesFunciones.activarnombreTipoCuentaContableTipo,this,true,"nombreTipoCuentaContableTipo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuentacontabletipoConstantesFunciones.resaltarnombreTipoCuentaContableTipo,this.tipocuentacontabletipoConstantesFunciones.activarnombreTipoCuentaContableTipo,this,true,"nombreTipoCuentaContableTipo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoCuentaContableTipoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCuentaContableTipo && this.tipocuentacontabletipoConstantesFunciones.mostrarCuentaContableTipoTipoCuentaContableTipo && !TipoCuentaContableTipoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuenta Contable Tipos");
				tableColumn.setHeaderValue("Cuenta Contable Tipos");
				tableColumn.setCellRenderer(new CuentaContableTipoTableCell(tipocuentacontabletipoConstantesFunciones.resaltarCuentaContableTipoTipoCuentaContableTipo,this,this.tipocuentacontabletipoConstantesFunciones.activarCuentaContableTipoTipoCuentaContableTipo));
				tableColumn.setCellEditor(new CuentaContableTipoTableCell(tipocuentacontabletipoConstantesFunciones.resaltarCuentaContableTipoTipoCuentaContableTipo,this,this.tipocuentacontabletipoConstantesFunciones.activarCuentaContableTipoTipoCuentaContableTipo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCuentaContableTipo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCuentaContableTipo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCuentaContableTipo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCuentaContableTipo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoCuentaContableTipo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCuentaContableTipo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCuentaContableTipo.moveColumn(this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCuentaContableTipo.moveColumn(this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCuentaContableTipo.moveColumn(this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCuentaContableTipo.moveColumn(this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCuentaContableTipo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCuentaContableTipo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCuentaContableTipo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCuentaContableTipo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCuentaContableTipo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCuentaContableTipo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocuentacontabletipos.size()-1;
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
		//this.jTableDatosTipoCuentaContableTipo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCuentaContableTipo();
			
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
				
				//this.isEsNuevoTipoCuentaContableTipo=false;
					
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
				if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCuentaContableTipo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCuentaContableTipo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocuentacontabletipo.getsType().equals("DUPLICADO")
				   || this.tipocuentacontabletipo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCuentaContableTipo=true;
				
				} else {
					this.isEsNuevoTipoCuentaContableTipo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocuentacontabletipo.getId()>=0 && !this.tipocuentacontabletipo.getIsNew()) {						
						this.isEsNuevoTipoCuentaContableTipo=false;
						
					} else {
						this.isEsNuevoTipoCuentaContableTipo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCuentaContableTipo(esRelaciones);						
				
				this.seleccionarTipoCuentaContableTipo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocuentacontabletipo.getId()<0) {
					this.isEsNuevoTipoCuentaContableTipo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCuentaContableTipo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCuentaContableTipo(evt,rowIndex);
				}	
				
				if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCuentaContableTipo: " + this.dDif); 
					}
				}								
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCuentaContableTipo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocuentacontabletipo)) {
					if(this.tipocuentacontabletipo.getId()>0) {
						this.tipocuentacontabletipo.setIsDeleted(true);
						
						this.tipocuentacontabletiposEliminados.add(this.tipocuentacontabletipo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().remove(this.tipocuentacontabletipo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocuentacontabletipos.remove(this.tipocuentacontabletipo);				
					}
					
					
					((TipoCuentaContableTipoModel) this.jTableDatosTipoCuentaContableTipo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCuentaContableTipo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCuentaContableTipo) {
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCuentaContableTipo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCuentaContableTipo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCuentaContableTipo(this.tipocuentacontabletipo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCuentaContableTipo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCuentaContableTipo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaContableTipo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCuentaContableTipo(tipocuentacontabletipo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCuentaContableTipo(tipocuentacontabletipo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCuentaContableTipo(tipocuentacontabletipo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaContableTipo(tipocuentacontabletipo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.setText(tipocuentacontabletipo.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextAreanombreTipoCuentaContableTipo.setText(tipocuentacontabletipo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCuentaContableTipo tipocuentacontabletipoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocuentacontabletipoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCuentaContableTipo tipocuentacontabletipoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocuentacontabletipoLocal=this.tipocuentacontabletipo;
			} else {
				tipocuentacontabletipoLocal=this.tipocuentacontabletipoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocuentacontabletipoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCuentaContableTipo(tipocuentacontabletipoLocal,true);
					
					if(tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocuentacontabletipoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocuentacontabletipoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(tipocuentacontabletipo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(tipocuentacontabletipo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(tipocuentacontabletipo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.getText()==null || this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.getText()=="" || this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.setText("0");
			}

			if(conColumnasBase) {tipocuentacontabletipo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuentaContableTipoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaContableTipo.jLabelIdTipoCuentaContableTipo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocuentacontabletipo.setnombre(this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextAreanombreTipoCuentaContableTipo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaContableTipo.jLabelnombreTipoCuentaContableTipo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipoBean,TipoCuentaContableTipo tipocuentacontabletipo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipoOrigen,TipoCuentaContableTipo tipocuentacontabletipo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocuentacontabletipoOrigen.getId()!=null && !tipocuentacontabletipoOrigen.getId().equals(0L))) {tipocuentacontabletipo.setId(tipocuentacontabletipoOrigen.getId());}}
			if(conDefault || (!conDefault && tipocuentacontabletipoOrigen.getnombre()!=null && !tipocuentacontabletipoOrigen.getnombre().equals(""))) {tipocuentacontabletipo.setnombre(tipocuentacontabletipoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.setText(tipocuentacontabletipo.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextAreanombreTipoCuentaContableTipo.setText(tipocuentacontabletipo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCuentaContableTipo(TipoCuentaContableTipoBean tipocuentacontabletipoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.setText(tipocuentacontabletipoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextAreanombreTipoCuentaContableTipo.setText(tipocuentacontabletipoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCuentaContableTipo(TipoCuentaContableTipoParameterReturnGeneral tipocuentacontabletipoReturnGeneral,TipoCuentaContableTipoBean tipocuentacontabletipoBean,Boolean conDefault) throws Exception { 
		try {
			TipoCuentaContableTipo tipocuentacontabletipoLocal=new TipoCuentaContableTipo();
			
			tipocuentacontabletipoLocal=tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocuentacontabletipoLocal.getId()!=null && !tipocuentacontabletipoLocal.getId().equals(0L))) {tipocuentacontabletipoBean.setId(tipocuentacontabletipoLocal.getId());}}
			if(conDefault || (!conDefault && tipocuentacontabletipoLocal.getnombre()!=null && !tipocuentacontabletipoLocal.getnombre().equals(""))) {tipocuentacontabletipoBean.setnombre(tipocuentacontabletipoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCuentaContableTipoGenerico(Long idTipoCuentaContableTipoSeleccionado,JComboBox jComboBoxTipoCuentaContableTipo,List<TipoCuentaContableTipo> tipocuentacontabletiposLocal)throws Exception {
		try {
			TipoCuentaContableTipo  tipocuentacontabletipoTemp=null;

			for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletiposLocal) {
				if(tipocuentacontabletipoAux.getId()!=null && tipocuentacontabletipoAux.getId().equals(idTipoCuentaContableTipoSeleccionado)) {
					tipocuentacontabletipoTemp=tipocuentacontabletipoAux;
					break;
				}
			}

			jComboBoxTipoCuentaContableTipo.setSelectedItem(tipocuentacontabletipoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCuentaContableTipoGenerico(JComboBox jComboBoxTipoCuentaContableTipo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCuentaContableTipo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCuentaContableTipo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCuentaContableTipo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCuentaContableTipo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("CuentaContableTipo")) {
			jButtonCuentaContableTipoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentacontabletipo=(TipoCuentaContableTipo) tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocuentacontabletipo =(TipoCuentaContableTipo) tipocuentacontabletipos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCuentaContableTipo tipocuentacontabletipoRow=new TipoCuentaContableTipo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentacontabletipoRow=(TipoCuentaContableTipo) tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocuentacontabletipoRow=(TipoCuentaContableTipo) tipocuentacontabletipos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCuentaContableTipoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCuentaContableTipo tipocuentacontabletipo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentacontabletipo = (TipoCuentaContableTipo)this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocuentacontabletipo = (TipoCuentaContableTipo)this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocuentacontabletipo!=null) {
						this.tipocuentacontabletipo = tipocuentacontabletipo;
					} else {
						this.tipocuentacontabletipo = new TipoCuentaContableTipo();
					}
				}

				if(this.isTienePermisosCuentaContableTipo && this.permiteMantenimiento(this.tipocuentacontabletipo)) {
					CuentaContableTipoBeanSwingJInternalFrame cuentacontabletipoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFramePopup=new CuentaContableTipoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuentacontabletipoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFramePopup;
					} else {
						cuentacontabletipoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame;
					}

					List<TipoCuentaContableTipo> tipocuentacontabletipos=new ArrayList<TipoCuentaContableTipo>();
					tipocuentacontabletipos.add(this.tipocuentacontabletipo);
					if(!esRelacionado) {
						//cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setConGuardarRelaciones(false);
						//cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuentacontabletipoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.cargarCuentaContableTipoBeanSwingJInternalFrame(tipocuentacontabletipos,this.tipocuentacontabletipo,cuentacontabletipoBeanSwingJInternalFrame,/*conInicializar,*/cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.getConGuardarRelaciones(),cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
					cuentacontabletipoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuentacontabletipoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContableTipo("no_relacionado");

						cuentacontabletipoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuentaContableTipoConstantesFunciones.ITAMANIOFILATABLA + (CuentaContableTipoConstantesFunciones.ITAMANIOFILATABLA/2));

						cuentacontabletipoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosTipoCuentaContableTipo.getBorder();
						TitledBorder titledBorderCuentaContableTipo=(TitledBorder)cuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContableTipo.getBorder();

						titledBorderCuentaContableTipo.setTitle(titledBorderTipoCuentaContableTipo.getTitle() + " -> Cuenta Contable Tipo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontabletipoBeanSwingJInternalFrame);
						}

						cuentacontabletipoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuentacontabletipoBeanSwingJInternalFrame);

						cuentacontabletipoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuenta Contable Tipo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCuentaContableTipo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaContableTipo && this.isPermisoNuevoTipoCuentaContableTipo));			
			this.jButtonDuplicarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaContableTipo && this.isPermisoDuplicarTipoCuentaContableTipo));			
			this.jButtonCopiarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaContableTipo && this.isPermisoCopiarTipoCuentaContableTipo));
			this.jButtonVerFormTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaContableTipo && this.isPermisoVerFormTipoCuentaContableTipo));
			
			this.jButtonAbrirOrderByTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaContableTipo && this.isPermisoOrdenTipoCuentaContableTipo));			
			
			this.jButtonNuevoRelacionesTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo && this.isPermisoNuevoTipoCuentaContableTipo));			
			this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaContableTipo && this.isPermisoNuevoTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo));
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonModificarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaModificarTipoCuentaContableTipo && this.isPermisoActualizarTipoCuentaContableTipo));	
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonActualizarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaContableTipo && this.isPermisoActualizarTipoCuentaContableTipo));	
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonEliminarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaContableTipo && this.isPermisoEliminarTipoCuentaContableTipo));
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonCancelarTipoCuentaContableTipo.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaContableTipo);							
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaContableTipo && this.isPermisoNuevoTipoCuentaContableTipo));						
			this.jButtonDuplicarToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaContableTipo && this.isPermisoDuplicarTipoCuentaContableTipo));						
			this.jButtonCopiarToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaContableTipo && this.isPermisoCopiarTipoCuentaContableTipo));			
			this.jButtonVerFormToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaContableTipo && this.isPermisoVerFormTipoCuentaContableTipo));			
			this.jButtonAbrirOrderByToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaContableTipo && this.isPermisoOrdenTipoCuentaContableTipo));
			this.jButtonNuevoRelacionesToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo && this.isPermisoNuevoTipoCuentaContableTipo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaContableTipo && this.isPermisoNuevoTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo));			
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonModificarToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaModificarTipoCuentaContableTipo && this.isPermisoActualizarTipoCuentaContableTipo));	
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonActualizarToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaContableTipo  && this.isPermisoActualizarTipoCuentaContableTipo));	
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonEliminarToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaContableTipo && this.isPermisoEliminarTipoCuentaContableTipo));
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonCancelarToolBarTipoCuentaContableTipo.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaContableTipo);				
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaContableTipo && this.isPermisoNuevoTipoCuentaContableTipo));			
			this.jMenuItemDuplicarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaContableTipo && this.isPermisoDuplicarTipoCuentaContableTipo));			
			this.jMenuItemCopiarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaContableTipo && this.isPermisoCopiarTipoCuentaContableTipo));			
			this.jMenuItemVerFormTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaContableTipo && this.isPermisoVerFormTipoCuentaContableTipo));			
			this.jMenuItemAbrirOrderByTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaContableTipo && this.isPermisoOrdenTipoCuentaContableTipo));			
			//this.jMenuItemMostrarOcultarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaContableTipo && this.isPermisoOrdenTipoCuentaContableTipo));
			this.jMenuItemDetalleAbrirOrderByTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaContableTipo && this.isPermisoOrdenTipoCuentaContableTipo));			
			//this.jMenuItemDetalleMostrarOcultarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaContableTipo && this.isPermisoOrdenTipoCuentaContableTipo));			
			this.jMenuItemNuevoRelacionesTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo && this.isPermisoNuevoTipoCuentaContableTipo));			
			this.jMenuItemNuevoGuardarCambiosTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaContableTipo && this.isPermisoNuevoTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo));									
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemModificarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaModificarTipoCuentaContableTipo && this.isPermisoActualizarTipoCuentaContableTipo));	
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemActualizarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaContableTipo && this.isPermisoActualizarTipoCuentaContableTipo));	
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemEliminarTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaContableTipo && this.isPermisoEliminarTipoCuentaContableTipo));
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemCancelarTipoCuentaContableTipo.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaContableTipo);				
			}
			
			this.jMenuItemGuardarCambiosTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo));						
			this.jMenuItemGuardarCambiosTablaTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=this.jButtonNuevoTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCuentaContableTipo=this.jButtonDuplicarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaCopiarTipoCuentaContableTipo=this.jButtonCopiarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaVerFormTipoCuentaContableTipo=this.jButtonVerFormTipoCuentaContableTipo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCuentaContableTipo=this.jButtonAbrirOrderByTipoCuentaContableTipo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=this.jButtonNuevoRelacionesTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaModificarTipoCuentaContableTipo=this.jButtonModificarTipoCuentaContableTipo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonActualizarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonEliminarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonCancelarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosTipoCuentaContableTipo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=this.jButtonNuevoToolBarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=this.jButtonNuevoRelacionesToolBarTipoCuentaContableTipo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			this.isVisibilidadCeldaModificarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonModificarToolBarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonActualizarToolBarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonEliminarToolBarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonCancelarToolBarTipoCuentaContableTipo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=this.jButtonGuardarCambiosToolBarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=this.jButtonGuardarCambiosTablaToolBarTipoCuentaContableTipo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=this.jMenuItemNuevoTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=this.jMenuItemNuevoRelacionesTipoCuentaContableTipo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			this.isVisibilidadCeldaModificarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemModificarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemActualizarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemEliminarTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemCancelarTipoCuentaContableTipo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=this.jMenuItemGuardarCambiosTipoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=this.jMenuItemGuardarCambiosTablaTipoCuentaContableTipo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCuentaContableTipo(Boolean esInicializar) {
		if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCuentaContableTipo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCuentaContableTipo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCuentaContableTipo() {
		this.jButtonNuevoTipoCuentaContableTipo.setVisible(this.isPermisoNuevoTipoCuentaContableTipo);			
		this.jButtonDuplicarTipoCuentaContableTipo.setVisible(this.isPermisoDuplicarTipoCuentaContableTipo);			
		this.jButtonCopiarTipoCuentaContableTipo.setVisible(this.isPermisoCopiarTipoCuentaContableTipo);			
		this.jButtonVerFormTipoCuentaContableTipo.setVisible(this.isPermisoVerFormTipoCuentaContableTipo);			
		
		this.jButtonAbrirOrderByTipoCuentaContableTipo.setVisible(this.isPermisoOrdenTipoCuentaContableTipo);					
		
		this.jButtonNuevoRelacionesTipoCuentaContableTipo.setVisible(this.isPermisoNuevoTipoCuentaContableTipo);			
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonModificarTipoCuentaContableTipo.setVisible(this.isPermisoActualizarTipoCuentaContableTipo);	
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonActualizarTipoCuentaContableTipo.setVisible(this.isPermisoActualizarTipoCuentaContableTipo);	
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonEliminarTipoCuentaContableTipo.setVisible(this.isPermisoEliminarTipoCuentaContableTipo);
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonCancelarTipoCuentaContableTipo.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaContableTipo);						
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosTipoCuentaContableTipo.setVisible(this.isPermisoGuardarCambiosTipoCuentaContableTipo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.setVisible(this.isPermisoActualizarTipoCuentaContableTipo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCuentaContableTipo() {
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonModificarTipoCuentaContableTipo.setVisible(this.isPermisoActualizarTipoCuentaContableTipo);	
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonActualizarTipoCuentaContableTipo.setVisible(this.isPermisoActualizarTipoCuentaContableTipo);	
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonEliminarTipoCuentaContableTipo.setVisible(this.isPermisoEliminarTipoCuentaContableTipo);
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonCancelarTipoCuentaContableTipo.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaContableTipo);							
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosTipoCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaContableTipo && this.isPermisoGuardarCambiosTipoCuentaContableTipo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCuentaContableTipo() {
		if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCuentaContableTipo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCuentaContableTipo() {
	}
	
	public void jTableDatosTipoCuentaContableTipoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCuentaContableTipo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(this.gettipocuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentacontabletipo==null) {
						this.tipocuentacontabletipo = new TipoCuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(this.tipocuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);
				}

				if(this.tipocuentacontabletipo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocuentacontabletipo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(this.gettipocuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentacontabletipo==null) {
						this.tipocuentacontabletipo = new TipoCuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(this.tipocuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);
				}

				if(this.tipocuentacontabletipo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocuentacontabletipo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCuentaContableTipo(false,false);

			this.getTipoCuentaContableTiposBusquedaPorId();

			this.inicializarActualizarBindingTipoCuentaContableTipo(false);

			//if(TipoCuentaContableTipoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCuentaContableTipo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCuentaContableTipo(false,false);

			this.getTipoCuentaContableTiposBusquedaPorNombre();

			this.inicializarActualizarBindingTipoCuentaContableTipo(false);

			//if(TipoCuentaContableTipoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCuentaContableTipo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCuentaContableTipo() {
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.dispose();
			this.jInternalFrameDetalleFormTipoCuentaContableTipo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo!=null) {
			this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.dispose();
			this.jInternalFrameReporteDinamicoTipoCuentaContableTipo=null;
		}
		
		if(this.jInternalFrameImportacionTipoCuentaContableTipo!=null) {
			this.jInternalFrameImportacionTipoCuentaContableTipo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCuentaContableTipo.dispose();
			this.jInternalFrameImportacionTipoCuentaContableTipo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCuentaContableTipo();
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCuentaContableTipo")) {
				jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCuentaContableTipo")) {
				jButtonDuplicarTipoCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCuentaContableTipo")) {
				jButtonCopiarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCuentaContableTipo")) {
				jButtonVerFormTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCuentaContableTipo")) {
				jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCuentaContableTipo")) {
				jButtonDuplicarTipoCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCuentaContableTipo")) {
				jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCuentaContableTipo")) {
				jButtonDuplicarTipoCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCuentaContableTipo")) {
				jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCuentaContableTipo")) {
				jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCuentaContableTipo")) {
				jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCuentaContableTipo")) {
				jButtonModificarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCuentaContableTipo")) {
				jButtonModificarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCuentaContableTipo")) {
				jButtonModificarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCuentaContableTipo")) {
				jButtonActualizarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCuentaContableTipo")) {
				jButtonActualizarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCuentaContableTipo")) {
				jButtonActualizarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCuentaContableTipo")) {
				jButtonEliminarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCuentaContableTipo")) {
				jButtonEliminarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCuentaContableTipo")) {
				jButtonEliminarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCuentaContableTipo")) {
				jButtonCancelarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCuentaContableTipo")) {
				jButtonCancelarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCuentaContableTipo")) {
				jButtonCancelarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCuentaContableTipo")) {
				jButtonCerrarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCuentaContableTipo")) {
				jButtonCerrarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCuentaContableTipo")) {
				jButtonCerrarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCuentaContableTipo")) {
				jButtonMostrarOcultarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCuentaContableTipo")) {
				jButtonCancelarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCuentaContableTipo")) {
				jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCuentaContableTipo")) {
				jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCuentaContableTipo")) {
				jButtonCopiarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCuentaContableTipo")) {
				jButtonVerFormTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCuentaContableTipo")) {
				jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCuentaContableTipo")) {
				jButtonCopiarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCuentaContableTipo")) {
				jButtonVerFormTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCuentaContableTipo")) {
				jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCuentaContableTipo")) {
				jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCuentaContableTipo")) {
				jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCuentaContableTipo")) {
				jButtonRecargarInformacionTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCuentaContableTipo")) {
				jButtonRecargarInformacionTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCuentaContableTipo")) {
				jButtonRecargarInformacionTipoCuentaContableTipoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCuentaContableTipo")) {
				jButtonAnterioresTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCuentaContableTipo")) {
				jButtonAnterioresTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCuentaContableTipo")) {
				jButtonAnterioresTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCuentaContableTipo")) {
				jButtonSiguientesTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCuentaContableTipo")) {
				jButtonSiguientesTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCuentaContableTipo")) {
				jButtonSiguientesTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCuentaContableTipo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCuentaContableTipo")) {
				jButtonAbrirOrderByTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCuentaContableTipo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCuentaContableTipo")) {
				jButtonMostrarOcultarTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCuentaContableTipo")) {
				jButtonNuevoGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCuentaContableTipo")) {
				jButtonNuevoGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCuentaContableTipo")) {
				jButtonNuevoGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCuentaContableTipo")) {
				jButtonCerrarReporteDinamicoTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCuentaContableTipo")) {
				jButtonGenerarReporteDinamicoTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCuentaContableTipo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCuentaContableTipo")) {
				jButtonCerrarImportacionTipoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCuentaContableTipo")) {
				
				jButtonGenerarImportacionTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCuentaContableTipo")) {
				
				jButtonAbrirImportacionTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCuentaContableTipo")) {
				jComboBoxTiposAccionesTipoCuentaContableTipoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCuentaContableTipo")) {
				jComboBoxTiposRelacionesTipoCuentaContableTipoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCuentaContableTipo")) {
				jComboBoxTiposAccionesTipoCuentaContableTipoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCuentaContableTipo")) {
				
				jComboBoxTiposSeleccionarTipoCuentaContableTipoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCuentaContableTipo")) {
				jTextFieldValorCampoGeneralTipoCuentaContableTipoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCuentaContableTipo")) {
				jButtonAbrirOrderByTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCuentaContableTipo")) {
				jButtonAbrirOrderByTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCuentaContableTipo")) {
				jButtonCerrarOrderByTipoCuentaContableTipoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCuentaContableTipoBusqueda")) {
				this.jButtonidTipoCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCuentaContableTipoBusqueda")) {
				this.jButtonnombreTipoCuentaContableTipoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdTipoCuentaContableTipo")) {
				this.jButtonBusquedaPorIdTipoCuentaContableTipoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoCuentaContableTipo")) {
				this.jButtonBusquedaPorNombreTipoCuentaContableTipoActionPerformed(evt);
			}
			
			;
			
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCuentaContableTipo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaContableTipoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				


				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCuentaContableTipo tipocuentacontabletipoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocuentacontabletipoLocal=this.tipocuentacontabletipo;
			} else {
				tipocuentacontabletipoLocal=this.tipocuentacontabletipoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
							
				
				


				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaContableTipoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
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
			
			


			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaContableTipoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
								
						
				


				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
								
				
				


				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaContableTipoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaContableTipoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaContableTipoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
							
				
				


				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaContableTipoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
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
			
			


			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaContableTipoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
								
				
				


				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaContableTipoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaContableTipoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaContableTipoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCuentaContableTipo")) {
					jCheckBoxSeleccionarTodosTipoCuentaContableTipoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCuentaContableTipo")) {
					jCheckBoxSeleccionadosTipoCuentaContableTipoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCuentaContableTipo")) {
					
				}
				
				


				
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
												
				
				


				
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaContableTipoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaContableTipoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
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
			
			


			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaContableTipoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentacontabletipo);
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
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
				
				


				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaContableTipo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaContableTipoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentacontabletipoAnterior =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCuentaContableTipo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCuentaContableTipoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCuentaContableTipo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocuentacontabletipo =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocuentacontabletipo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCuentaContableTipo")) {
				
				}
				
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCuentaContableTipo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCuentaContableTipo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCuentaContableTipo")) {
			
			}
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCuentaContableTipo();
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCuentaContableTipo")) {
				jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCuentaContableTipo")) {
				jButtonDuplicarTipoCuentaContableTipoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCuentaContableTipo")) {
				jButtonCopiarTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCuentaContableTipo")) {
				jButtonVerFormTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCuentaContableTipo")) {
				jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCuentaContableTipo")) {
				jButtonModificarTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCuentaContableTipo")) {
				jButtonActualizarTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCuentaContableTipo")) {
				jButtonEliminarTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCuentaContableTipo")) {
				jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCuentaContableTipo")) {
				jButtonCancelarTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCuentaContableTipo")) {
				jButtonCerrarTipoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCuentaContableTipo")) {
				jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCuentaContableTipo")) {
				jButtonNuevoGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCuentaContableTipo")) {
				jButtonAbrirOrderByTipoCuentaContableTipoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCuentaContableTipo")) {
				jButtonRecargarInformacionTipoCuentaContableTipoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCuentaContableTipo")) {
				jButtonAnterioresTipoCuentaContableTipoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCuentaContableTipo")) {
				jButtonSiguientesTipoCuentaContableTipoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCuentaContableTipoBusqueda")) {
				this.jButtonidTipoCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCuentaContableTipoBusqueda")) {
				this.jButtonnombreTipoCuentaContableTipoBusquedaActionPerformed(evt);
			}
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCuentaContableTipo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCuentaContableTipo")) {
				closingInternalFrameTipoCuentaContableTipo();
				
			} else if(sTipo.equals("jButtonCancelarTipoCuentaContableTipo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCuentaContableTipo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCuentaContableTipoBeanSwingJInternalFrame jInternalFrameParent=(TipoCuentaContableTipoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCuentaContableTipo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCuentaContableTipoActionPerformed(null);
			}
			
			TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocuentacontabletipo,new Object(),this.tipocuentacontabletipoParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCuentaContableTipo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCuentaContableTipo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCuentaContableTipo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocuentacontabletipo)) {
			if(!esControlTabla) {
				if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(this.tipocuentacontabletipo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);			
				}
				
				if(this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCuentaContableTipo(this.tipocuentacontabletipo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocuentacontabletipoReturnGeneral=tipocuentacontabletipoLogic.procesarEventosTipoCuentaContableTiposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos(),this.tipocuentacontabletipo,this.tipocuentacontabletipoParameterGeneral,this.isEsNuevoTipoCuentaContableTipo,classes);//this.tipocuentacontabletipoLogic.getTipoCuentaContableTipo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCuentaContableTipo(this.tipocuentacontabletipoReturnGeneral,this.tipocuentacontabletipoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCuentaContableTipo(classes,this.tipocuentacontabletipoReturnGeneral,this.tipocuentacontabletipoBean,false);
					}
						
					if(this.tipocuentacontabletipoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaContableTipo(this.tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCuentaContableTipo(this.tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo());	
					}
						
					if(this.tipocuentacontabletipoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaContableTipo(this.tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo(),classes);//this.tipocuentacontabletipoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaContableTipo(this.tipocuentacontabletipo,classes);//this.tipocuentacontabletipoBean);									
				}
			
				if(TipoCuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCuentaContableTipo(this.tipocuentacontabletipo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaContableTipo(this.tipocuentacontabletipo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocuentacontabletipoAnterior!=null) {
						this.tipocuentacontabletipo=this.tipocuentacontabletipoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocuentacontabletipoReturnGeneral=tipocuentacontabletipoLogic.procesarEventosTipoCuentaContableTiposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos(),this.tipocuentacontabletipo,this.tipocuentacontabletipoParameterGeneral,this.isEsNuevoTipoCuentaContableTipo,classes);//this.tipocuentacontabletipoLogic.getTipoCuentaContableTipo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo(),tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo(),this.tipocuentacontabletipos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCuentaContableTipo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCuentaContableTipo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCuentaContableTipo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCuentaContableTipo() throws Exception {
		
		TipoCuentaContableTipoModel tipocuentacontabletipoModel=(TipoCuentaContableTipoModel)this.jTableDatosTipoCuentaContableTipo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentacontabletipoModel.tipocuentacontabletipos=this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocuentacontabletipoModel.tipocuentacontabletipos=this.tipocuentacontabletipos;
		}
		
		
		((TipoCuentaContableTipoModel) this.jTableDatosTipoCuentaContableTipo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCuentaContableTipo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocuentacontabletipoAnterior(),this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocuentacontabletipoAnterior(),this.tipocuentacontabletipos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCuentaContableTipo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContableTipo.class)) {
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.setCuentaContableTipos(tipocuentacontabletipo.getCuentaContableTipos());
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContableTipo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
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
										
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentacontabletipo,new Object(),generalEntityParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCuentaContableTipoConstantesFunciones.getClassesRelationshipsOfTipoCuentaContableTipo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCuentaContableTipoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCuentaContableTipo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCuentaContableTipo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentacontabletipo,new Object(),generalEntityParameterGeneral,this.tipocuentacontabletipoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCuentaContableTipo(TipoCuentaContableTipoBean tipocuentacontabletipoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContableTipo.class)) {
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.setCuentaContableTipos(tipocuentacontabletipo.getCuentaContableTipos());
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContableTipo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCuentaContableTipo(ArrayList<Classe> classes,TipoCuentaContableTipoReturnGeneral tipocuentacontabletipoReturnGeneral,TipoCuentaContableTipoBean tipocuentacontabletipoBean,Boolean conDefault) throws Exception {
		
			this.tipocuentacontabletipoBean.setCuentaContableTipos(tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo().getCuentaContableTipos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContableTipo.class)) {
					tipocuentacontabletipo.setCuentaContableTipos(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoLogic.getCuentaContableTipos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocuentacontabletipo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo = new TipoCuentaContableTipoDetalleFormJInternalFrame(jDesktopPane,this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones(),this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCuentaContableTipo);
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.setVisible(false);
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.tipocuentacontabletipoLogic=this.tipocuentacontabletipoLogic;
		
		this.cargarCombosFrameForeignKeyTipoCuentaContableTipo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCuentaContableTipo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCuentaContableTipo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCuentaContableTipo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCuentaContableTipo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCuentaContableTipo"));
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonModificarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ModificarTipoCuentaContableTipo"));

		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonModificarToolBarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCuentaContableTipo"));
					
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemModificarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCuentaContableTipo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonActualizarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"ActualizarTipoCuentaContableTipo"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonActualizarToolBarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCuentaContableTipo"));
						
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemActualizarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCuentaContableTipo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonEliminarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"EliminarTipoCuentaContableTipo"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonEliminarToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCuentaContableTipo"));
								
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemEliminarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCuentaContableTipo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonCancelarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CancelarTipoCuentaContableTipo"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonCancelarToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCuentaContableTipo"));
					
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemCancelarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCuentaContableTipo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemDetalleCerrarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCuentaContableTipo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaContableTipo"));
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaContableTipo"));
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCuentaContableTipo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonidTipoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaContableTipoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonnombreTipoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuentaContableTipoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTabbedPaneRelacionesTipoCuentaContableTipo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCuentaContableTipo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCuentaContableTipo"));
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCuentaContableTipo"));
		}
		
		this.jTableDatosTipoCuentaContableTipo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCuentaContableTipo"));
		
		this.jTableDatosTipoCuentaContableTipo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCuentaContableTipo"));
		
		this.jButtonNuevoTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"NuevoTipoCuentaContableTipo"));
		
		this.jButtonDuplicarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"DuplicarTipoCuentaContableTipo"));
		
		this.jButtonCopiarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"CopiarTipoCuentaContableTipo"));
		
		this.jButtonVerFormTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"VerFormTipoCuentaContableTipo"));
		
		
		this.jButtonNuevoToolBarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCuentaContableTipo"));
			
		this.jButtonDuplicarToolBarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCuentaContableTipo"));
			
		this.jMenuItemNuevoTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCuentaContableTipo"));
			
		this.jMenuItemDuplicarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCuentaContableTipo"));		
		
		
		this.jButtonNuevoRelacionesTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCuentaContableTipo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCuentaContableTipo"));
			
		this.jMenuItemNuevoRelacionesTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCuentaContableTipo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonModificarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ModificarTipoCuentaContableTipo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonModificarToolBarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCuentaContableTipo"));
			
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemModificarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCuentaContableTipo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonActualizarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"ActualizarTipoCuentaContableTipo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonActualizarToolBarTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCuentaContableTipo"));
				
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemActualizarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCuentaContableTipo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonEliminarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"EliminarTipoCuentaContableTipo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonEliminarToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCuentaContableTipo"));
						
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemEliminarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCuentaContableTipo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonCancelarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CancelarTipoCuentaContableTipo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonCancelarToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCuentaContableTipo"));
			
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemCancelarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCuentaContableTipo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCuentaContableTipo"));		
		
		
		this.jButtonCerrarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CerrarTipoCuentaContableTipo"));
		
		
		this.jButtonCerrarToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCuentaContableTipo"));
			
		this.jMenuItemCerrarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCuentaContableTipo"));
			
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jMenuItemDetalleCerrarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCuentaContableTipo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCuentaContableTipo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaContableTipo"));
		}
		
		this.jButtonCopiarToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCuentaContableTipo"));
			
		this.jButtonVerFormToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCuentaContableTipo"));
		
		this.jMenuItemGuardarCambiosTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCuentaContableTipo"));
			
		this.jMenuItemCopiarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCuentaContableTipo"));		
		
		this.jMenuItemVerFormTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCuentaContableTipo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCuentaContableTipo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCuentaContableTipo"));
			
		this.jMenuItemGuardarCambiosTablaTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCuentaContableTipo"));		
		
		
		
		this.jButtonRecargarInformacionTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCuentaContableTipo"));
					
		this.jButtonRecargarInformacionToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCuentaContableTipo"));
		
		this.jMenuItemRecargarInformacionTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCuentaContableTipo"));		
		
		
		
		this.jButtonAnterioresTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"AnterioresTipoCuentaContableTipo"));
		
		
		this.jButtonAnterioresToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCuentaContableTipo"));
		
		this.jMenuItemAnterioresTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCuentaContableTipo"));		
		
		
		this.jButtonSiguientesTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"SiguientesTipoCuentaContableTipo"));
		
		
		this.jButtonSiguientesToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCuentaContableTipo"));
			
		this.jMenuItemSiguientesTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCuentaContableTipo"));
			
		this.jMenuItemAbrirOrderByTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCuentaContableTipo"));
			
		this.jMenuItemMostrarOcultarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCuentaContableTipo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCuentaContableTipo"));
			
		this.jMenuItemDetalleMostarOcultarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCuentaContableTipo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCuentaContableTipo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCuentaContableTipo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCuentaContableTipo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCuentaContableTipo"));

		this.jCheckBoxSeleccionadosTipoCuentaContableTipo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCuentaContableTipo"));
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCuentaContableTipo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCuentaContableTipo"));
			
		this.jComboBoxTiposAccionesTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCuentaContableTipo"));
					
		this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCuentaContableTipo"));
			
		this.jTextFieldValorCampoGeneralTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCuentaContableTipo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonidTipoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaContableTipoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonnombreTipoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuentaContableTipoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoCuentaContableTipo"));

			this.jButtonBusquedaPorNombreTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoCuentaContableTipo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaContableTipo!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaContableTipo"));
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaContableTipo"));
				this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaContableTipo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaContableTipo"));				
			//this.jButtonGenerarReporteDinamicoTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaContableTipo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaContableTipo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCuentaContableTipo!=null) {
				this.jInternalFrameImportacionTipoCuentaContableTipo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCuentaContableTipo"));
				this.jInternalFrameImportacionTipoCuentaContableTipo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCuentaContableTipo"));
				this.jInternalFrameImportacionTipoCuentaContableTipo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCuentaContableTipo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCuentaContableTipo"));
			
			this.jButtonAbrirOrderByToolBarTipoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCuentaContableTipo"));			
			
			if(this.jInternalFrameOrderByTipoCuentaContableTipo!=null) {
				this.jInternalFrameOrderByTipoCuentaContableTipo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCuentaContableTipo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTabbedPaneRelacionesTipoCuentaContableTipo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCuentaContableTipo"));
		
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
            		closingInternalFrameTipoCuentaContableTipo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCuentaContableTipo = (JInternalFrameBase)event.getSource();
	            	
	            TipoCuentaContableTipoBeanSwingJInternalFrame jInternalFrameParent=(TipoCuentaContableTipoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCuentaContableTipo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCuentaContableTipoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCuentaContableTipo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCuentaContableTipoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCuentaContableTipo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCuentaContableTipo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCuentaContableTipo";
		inputMap = this.jButtonNuevoTipoCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCuentaContableTipo";
		inputMap = this.jButtonNuevoRelacionesTipoCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCuentaContableTipoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCuentaContableTipo";
		inputMap = this.jButtonModificarTipoCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCuentaContableTipo";
		inputMap = this.jButtonActualizarTipoCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCuentaContableTipo";
		inputMap = this.jButtonEliminarTipoCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCuentaContableTipo";
		inputMap = this.jButtonCancelarTipoCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCuentaContableTipo";
		inputMap = this.jButtonCerrarTipoCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCuentaContableTipo";
		inputMap = this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosTipoCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonGuardarCambiosTipoCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCuentaContableTipoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCuentaContableTipo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCuentaContableTipoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCuentaContableTipoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCuentaContableTipo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCuentaContableTipoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonidTipoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaContableTipoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jButtonnombreTipoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuentaContableTipoBusqueda"));
		
		
		this.jButtonBusquedaPorIdTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoCuentaContableTipo"));

		this.jButtonBusquedaPorNombreTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoCuentaContableTipo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCuentaContableTipoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCuentaContableTipo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
					tipocuentacontabletipoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletipos) {
					tipocuentacontabletipoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCuentaContableTipoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCuentaContableTipo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
						tipocuentacontabletipoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletipos) {
						tipocuentacontabletipoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletipos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCuentaContableTipo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCuentaContableTipo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaContableTipo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCuentaContableTipoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCuentaContableTipo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCuentaContableTipo.getSelectedRows();
			
			TipoCuentaContableTipo tipocuentacontabletipoLocal=new TipoCuentaContableTipo();
			
			//this.seleccionarTodosTipoCuentaContableTipo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentacontabletipoLocal =(TipoCuentaContableTipo) this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos().toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocuentacontabletipoLocal =(TipoCuentaContableTipo) this.tipocuentacontabletipos.toArray()[this.jTableDatosTipoCuentaContableTipo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocuentacontabletipoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
						tipocuentacontabletipoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletipos) {
						tipocuentacontabletipoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCuentaContableTipo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCuentaContableTipo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaContableTipo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCuentaContableTipoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCuentaContableTipoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCuentaContableTipoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCuentaContableTipo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCuentaContableTipo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
				
						if(sTipoSeleccionar.equals(TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocuentacontabletipoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletipos) {
					
						if(sTipoSeleccionar.equals(TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocuentacontabletipoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCuentaContableTipoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCuentaContableTipo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCuentaContableTipo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCuentaContableTipo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCuentaContableTipo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCuentaContableTipo(conSplash);
				
					this.generarReporteTipoCuentaContableTiposSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCuentaContableTiposSeleccionados();
				//this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCuentaContableTiposSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCuentaContableTiposSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCuentaContableTipo();
				
				this.exportarTipoCuentaContableTiposSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCuentaContableTipos();
				//this.importarTipoCuentaContableTipos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCuentaContableTipo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCuentaContableTiposSeleccionados();
				//this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Cuenta Contable Tipo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCuentaContableTipo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCuentaContableTipo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCuentaContableTipo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoCuentaContableTipoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoCuentaContableTipo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoCuentaContableTipo(conSplash);
					
						//this.actualizarParametrosGeneralTipoCuentaContableTipo();
						
						this.generarReporteProcesoAccionTipoCuentaContableTiposSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Cuenta Contable TipoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Cuenta Contable Tipo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoCuentaContableTipo();
				
						this.actualizarParametrosGeneralTipoCuentaContableTipo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocuentacontabletipoReturnGeneral=tipocuentacontabletipoLogic.procesarAccionTipoCuentaContableTiposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos(),this.tipocuentacontabletipoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoCuentaContableTipoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCuentaContableTipo();
					
					TipoCuentaContableTipoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoCuentaContableTipoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCuentaContableTipo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCuentaContableTipo.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCuentaContableTipo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCuentaContableTipoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCuentaContableTipo();
			
			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();		
			TipoCuentaContableTipo tipocuentacontabletipo=new TipoCuentaContableTipo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCuentaContableTipo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCuentaContableTipo.getSelectedItem();
			
			
			
			
			tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocuentacontabletiposSeleccionados.size()==1) {
				for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletiposSeleccionados) {
					tipocuentacontabletipo=tipocuentacontabletipoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cuenta Contable Tipo")) {
					jButtonCuentaContableTipoActionPerformed(null,rowIndex,true,false,tipocuentacontabletipo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCuentaContableTipo();
			
      		//this.finishProcessTipoCuentaContableTipo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCuentaContableTipoReturnGeneral() throws Exception {
		if(this.tipocuentacontabletipoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocuentacontabletipoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocuentacontabletipoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocuentacontabletipoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocuentacontabletipoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocuentacontabletipoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCuentaContableTipo(false);
		}
		
		if(this.tipocuentacontabletipoReturnGeneral.getConRetornoLista() || this.tipocuentacontabletipoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocuentacontabletipoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocuentacontabletipoLogic.setTipoCuentaContableTipos(this.tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocuentacontabletipoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocuentacontabletipoLogic.setTipoCuentaContableTipo(this.tipocuentacontabletipoReturnGeneral.getTipoCuentaContableTipo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCuentaContableTipo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCuentaContableTipo() throws Exception {
		
		
	}
	
	public ArrayList<TipoCuentaContableTipo> getTipoCuentaContableTiposSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCuentaContableTipo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletipoLogic.getTipoCuentaContableTipos()) {
					if(tipocuentacontabletipoAux.getIsSelected()) {
						tipocuentacontabletiposSeleccionados.add(tipocuentacontabletipoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaContableTipo tipocuentacontabletipoAux:this.tipocuentacontabletipos) {
					if(tipocuentacontabletipoAux.getIsSelected()) {
						tipocuentacontabletiposSeleccionados.add(tipocuentacontabletipoAux);				
					}
				}
			}
			
			if(tipocuentacontabletiposSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocuentacontabletiposSeleccionados.addAll(this.tipocuentacontabletipoLogic.getTipoCuentaContableTipos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocuentacontabletiposSeleccionados.addAll(this.tipocuentacontabletipos);				
					}
				}
			}
		} else {
			tipocuentacontabletiposSeleccionados.add(this.tipocuentacontabletipo);
		}
		
		return tipocuentacontabletiposSeleccionados;
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
	
	public void generarReporteTipoCuentaContableTiposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCuentaContableTiposSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCuentaContableTiposSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCuentaContableTiposSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCuentaContableTiposSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCuentaContableTiposSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Cuenta Contable Tipo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();		
		
		tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCuentaContableTipos("Todos",tipocuentacontabletiposSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();		
		
		tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCuentaContableTipos("Todos",tipocuentacontabletiposSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCuentaContableTiposSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();
		
		tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCuentaContableTipos("Todos",tipocuentacontabletiposSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCuentaContableTipo();
		
		
		tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCuentaContableTipo();
		
		
		//this.generarReporteTipoCuentaContableTipos("Todos",tipocuentacontabletiposSeleccionados ,tipocuentacontabletipoImplementable,tipocuentacontabletipoImplementableHome);
	}
	
	public void mostrarImportacionTipoCuentaContableTipos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCuentaContableTipo();
		
		this.abrirFrameImportacionTipoCuentaContableTipo();		
		
			
		//this.generarReporteTipoCuentaContableTipos("Todos",tipocuentacontabletiposSeleccionados ,tipocuentacontabletipoImplementable,tipocuentacontabletipoImplementableHome);
	}
	
	public void importarTipoCuentaContableTipos() throws Exception {		
	
	}
	
	public void exportarTipoCuentaContableTiposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCuentaContableTiposSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCuentaContableTiposSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCuentaContableTiposSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Cuenta Contable Tipo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();		
		
		tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentacontabletipo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCuentaContableTipo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletiposSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCuentaContableTipo(tipocuentacontabletipoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocuentacontabletipoAux.setsDetalleGeneralEntityReporte(tipocuentacontabletipoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCuentaContableTipo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCuentaContableTipoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaContableTipoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocuentacontabletipo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentacontabletipo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentacontabletipo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();		
		
		tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentacontabletipo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCuentaContableTipos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCuentaContableTipo(row);				
				iRow++;
			}				
			
			for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletiposSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCuentaContableTipo(tipocuentacontabletipoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();		
		
		tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentacontabletipo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocuentacontabletipos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocuentacontabletipo");
			//elementRoot.appendChild(element);
		
			for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletiposSeleccionados) {
				element = document.createElement("tipocuentacontabletipo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCuentaContableTipo(tipocuentacontabletipoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCuentaContableTipo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaContableTipoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaContableTipoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentacontabletipo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentacontabletipo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCuentaContableTipo(TipoCuentaContableTipo tipocuentacontabletipo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCuentaContableTipoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocuentacontabletipo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCuentaContableTipoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocuentacontabletipo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoCuentaContableTipoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocuentacontabletipo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCuentaContableTiposSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados=new ArrayList<TipoCuentaContableTipo>();
		
		tipocuentacontabletiposSeleccionados=this.getTipoCuentaContableTiposSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCuentaContableTipo(tipocuentacontabletiposSeleccionados);
		
		this.generarReporteTipoCuentaContableTipos("Todos",tipocuentacontabletiposSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCuentaContableTipo(ArrayList<TipoCuentaContableTipo> tipocuentacontabletiposSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletiposSeleccionados) {
				tipocuentacontabletipoAux.setsDetalleGeneralEntityReporte(tipocuentacontabletipoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocuentacontabletipoAux.setsDescripcionGeneralEntityReporte1(tipocuentacontabletipoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCuentaContableTipo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaModificarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaModificarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaModificarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaModificarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaModificarTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarTipoCuentaContableTipo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaContableTipo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCuentaContableTipoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=true;
		} else {
			this.actualizarEstadoPanelsTipoCuentaContableTipo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCuentaContableTipo=false;
			//this.isVisibilidadCeldaVerFormTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaDuplicarTipoCuentaContableTipo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			if(!tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=false;												
			}
			
			this.jButtonCerrarTipoCuentaContableTipo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaContableTipo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocuentacontabletipo)) {
			this.isVisibilidadCeldaActualizarTipoCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarTipoCuentaContableTipo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCuentaContableTipo() {
		this.isVisibilidadCeldaNuevoTipoCuentaContableTipo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCuentaContableTipo=false;
	}
	
	public void actualizarEstadoPanelsTipoCuentaContableTipo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosTipoCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaContableTipo!=null) {
				this.jPanelPaginacionTipoCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaContableTipo!=null) {
				this.jPanelParametrosReportesTipoCuentaContableTipo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosTipoCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaContableTipo!=null) {
				this.jPanelPaginacionTipoCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaContableTipo!=null) {
				this.jPanelParametrosReportesTipoCuentaContableTipo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosTipoCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaContableTipo!=null) {
				this.jPanelPaginacionTipoCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaContableTipo!=null) {
				this.jPanelParametrosReportesTipoCuentaContableTipo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosTipoCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaContableTipo!=null) {
				this.jPanelPaginacionTipoCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaContableTipo!=null) {
				this.jPanelParametrosReportesTipoCuentaContableTipo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosTipoCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaContableTipo!=null) {
				this.jPanelPaginacionTipoCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaContableTipo!=null) {
				this.jPanelParametrosReportesTipoCuentaContableTipo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosTipoCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaContableTipo!=null) {
				this.jPanelPaginacionTipoCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaContableTipo!=null) {
				this.jPanelParametrosReportesTipoCuentaContableTipo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaContableTipo!=null) {
				this.jScrollPanelDatosTipoCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaContableTipo!=null) {
				this.jPanelPaginacionTipoCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaContableTipo!=null) {
				this.jPanelParametrosReportesTipoCuentaContableTipo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCuentaContableTipo!=null) {
					this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCuentaContableTipo!=null) {
				this.jPanelParametrosReportesTipoCuentaContableTipo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCuentaContableTipo!=null) {
				this.jPanelParametrosReportesTipoCuentaContableTipo.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoCuentaContableTipoParaCuentaContableTipos() throws Exception {
		Boolean isPaginaPopupCuentaContableTipo=false;

		try {

			if(this.tipocuentacontabletipoSessionBean==null) {
				this.tipocuentacontabletipoSessionBean=new TipoCuentaContableTipoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoSessionBean.setsPathNavegacionActual(tipocuentacontabletipoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuentaContableTipo=this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContableTipo(true);
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContableTipo(TipoCuentaContableTipoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaContableTipo(true);
			this.jInternalFrameDetalleFormTipoCuentaContableTipo.cuentacontabletipoSessionBean.setlidTipoCuentaContableTipoActual(this.idTipoCuentaContableTipoActual);

			tipocuentacontabletipoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaContableTipo(true);
			tipocuentacontabletipoSessionBean.setlIdTipoCuentaContableTipoActualForeignKey(this.idTipoCuentaContableTipoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCuentaContableTipoSessionBean tipocuentacontabletipoSessionBean=new TipoCuentaContableTipoSessionBean();
		
		if(this.tipocuentacontabletipoSessionBean==null) {
			this.tipocuentacontabletipoSessionBean=new TipoCuentaContableTipoSessionBean();
		}
		
		this.tipocuentacontabletipoSessionBean.setsUltimaBusquedaTipoCuentaContableTipo(this.getsAccionBusqueda());
		this.tipocuentacontabletipoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocuentacontabletipoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tipocuentacontabletipoSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipocuentacontabletipoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCuentaContableTipoSessionBean tipocuentacontabletipoSessionBean=new TipoCuentaContableTipoSessionBean();
		
		if(this.tipocuentacontabletipoSessionBean==null) {
			this.tipocuentacontabletipoSessionBean=new TipoCuentaContableTipoSessionBean();
		}
		
		if(this.tipocuentacontabletipoSessionBean.getsUltimaBusquedaTipoCuentaContableTipo()!=null&&!this.tipocuentacontabletipoSessionBean.getsUltimaBusquedaTipoCuentaContableTipo().equals("")) {
			this.setsAccionBusqueda(tipocuentacontabletipoSessionBean.getsUltimaBusquedaTipoCuentaContableTipo());
			this.setiNumeroPaginacion(tipocuentacontabletipoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocuentacontabletipoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tipocuentacontabletipoSessionBean.getid());
				tipocuentacontabletipoSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipocuentacontabletipoSessionBean.getnombre());
				tipocuentacontabletipoSessionBean.setnombre("");
			}
		}
		
		this.tipocuentacontabletipoSessionBean.setsUltimaBusquedaTipoCuentaContableTipo("");
		this.tipocuentacontabletipoSessionBean.setiNumeroPaginacion(TipoCuentaContableTipoConstantesFunciones.INUMEROPAGINACION);
		this.tipocuentacontabletipoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCuentaContableTipo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCuentaContableTipo() {
		this.updateBorderResaltarBusquedasFormularioTipoCuentaContableTipo();
		this.updateVisibilidadBusquedasFormularioTipoCuentaContableTipo();
		this.updateHabilitarBusquedasFormularioTipoCuentaContableTipo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCuentaContableTipo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponents().length>0) {
	

		if(this.tipocuentacontabletipoConstantesFunciones.resaltarBusquedaPorIdTipoCuentaContableTipo!=null) {
			index= this.jTabbedPaneBusquedasTipoCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorIdTipoCuentaContableTipo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponent(index);
				jPanel.setBorder(this.tipocuentacontabletipoConstantesFunciones.resaltarBusquedaPorIdTipoCuentaContableTipo);
			}
		}

		if(this.tipocuentacontabletipoConstantesFunciones.resaltarBusquedaPorNombreTipoCuentaContableTipo!=null) {
			index= this.jTabbedPaneBusquedasTipoCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCuentaContableTipo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponent(index);
				jPanel.setBorder(this.tipocuentacontabletipoConstantesFunciones.resaltarBusquedaPorNombreTipoCuentaContableTipo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCuentaContableTipo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorIdTipoCuentaContableTipo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocuentacontabletipoConstantesFunciones.mostrarBusquedaPorIdTipoCuentaContableTipo);
			if(!this.tipocuentacontabletipoConstantesFunciones.mostrarBusquedaPorIdTipoCuentaContableTipo && index>-1) {
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCuentaContableTipo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocuentacontabletipoConstantesFunciones.mostrarBusquedaPorNombreTipoCuentaContableTipo);
			if(!this.tipocuentacontabletipoConstantesFunciones.mostrarBusquedaPorNombreTipoCuentaContableTipo && index>-1) {
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCuentaContableTipo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorIdTipoCuentaContableTipo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocuentacontabletipoConstantesFunciones.activarBusquedaPorIdTipoCuentaContableTipo);
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setEnabledAt(index,this.tipocuentacontabletipoConstantesFunciones.activarBusquedaPorIdTipoCuentaContableTipo);
			}

			index= this.jTabbedPaneBusquedasTipoCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCuentaContableTipo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocuentacontabletipoConstantesFunciones.activarBusquedaPorNombreTipoCuentaContableTipo);
				this.jTabbedPaneBusquedasTipoCuentaContableTipo.setEnabledAt(index,this.tipocuentacontabletipoConstantesFunciones.activarBusquedaPorNombreTipoCuentaContableTipo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCuentaContableTipo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorIdTipoCuentaContableTipo);

			this.jTabbedPaneBusquedasTipoCuentaContableTipo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponent(index);

			this.tipocuentacontabletipoConstantesFunciones.setResaltarBusquedaPorIdTipoCuentaContableTipo(resaltar);

			jPanel.setBorder(this.tipocuentacontabletipoConstantesFunciones.resaltarBusquedaPorIdTipoCuentaContableTipo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCuentaContableTipo);

			this.jTabbedPaneBusquedasTipoCuentaContableTipo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaContableTipo.getComponent(index);

			this.tipocuentacontabletipoConstantesFunciones.setResaltarBusquedaPorNombreTipoCuentaContableTipo(resaltar);

			jPanel.setBorder(this.tipocuentacontabletipoConstantesFunciones.resaltarBusquedaPorNombreTipoCuentaContableTipo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoCuentaContableTipo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCuentaContableTipo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCuentaContableTipo();
		this.updateVisibilidadResaltarControlesFormularioTipoCuentaContableTipo();
		this.updateHabilitarResaltarControlesFormularioTipoCuentaContableTipo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCuentaContableTipo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocuentacontabletipoConstantesFunciones.resaltaridTipoCuentaContableTipo!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.setBorder(this.tipocuentacontabletipoConstantesFunciones.resaltaridTipoCuentaContableTipo);}
		if(this.tipocuentacontabletipoConstantesFunciones.resaltarnombreTipoCuentaContableTipo!=null && this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextAreanombreTipoCuentaContableTipo.setBorder(this.tipocuentacontabletipoConstantesFunciones.resaltarnombreTipoCuentaContableTipo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCuentaContableTipo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
	
		//this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.setVisible(this.tipocuentacontabletipoConstantesFunciones.mostraridTipoCuentaContableTipo);
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jPanelidTipoCuentaContableTipo.setVisible(this.tipocuentacontabletipoConstantesFunciones.mostraridTipoCuentaContableTipo);
		//this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextAreanombreTipoCuentaContableTipo.setVisible(this.tipocuentacontabletipoConstantesFunciones.mostrarnombreTipoCuentaContableTipo);
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jPanelnombreTipoCuentaContableTipo.setVisible(this.tipocuentacontabletipoConstantesFunciones.mostrarnombreTipoCuentaContableTipo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCuentaContableTipo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaContableTipo!=null) {
	
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextFieldidTipoCuentaContableTipo.setEnabled(this.tipocuentacontabletipoConstantesFunciones.activaridTipoCuentaContableTipo);
		this.jInternalFrameDetalleFormTipoCuentaContableTipo.jTextAreanombreTipoCuentaContableTipo.setEnabled(this.tipocuentacontabletipoConstantesFunciones.activarnombreTipoCuentaContableTipo);
		}
	}
	
		
}