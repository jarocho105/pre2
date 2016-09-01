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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.ConexionConstantesFunciones;
import com.bydan.erp.puntoventa.util.ConexionParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.ConexionParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.ConexionBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
public class ConexionBeanSwingJInternalFrame extends ConexionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConexionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Conexion> conexionValidator = new ClassValidator<Conexion>(Conexion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Conexion conexion;	
	public Conexion conexionAux;
	public Conexion conexionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Conexion conexionTotales;
	public Long idConexionActual;
	public Long iIdNuevoConexion=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboTipoConexion="";

	public List<TipoConexion> tipoconexionsForeignKey;

	public List<TipoConexion> gettipoconexionsForeignKey() {
		return tipoconexionsForeignKey;
	}

	public void settipoconexionsForeignKey(List<TipoConexion> tipoconexionsForeignKey) {
		this.tipoconexionsForeignKey = tipoconexionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoConexion tipoconexionForeignKey;

	public TipoConexion gettipoconexionForeignKey() {
		return tipoconexionForeignKey;
	}

	public void settipoconexionForeignKey(TipoConexion tipoconexionForeignKey) {
		this.tipoconexionForeignKey = tipoconexionForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosTarjetaCreditoConexion=false;

	public Boolean getIsTienePermisosTarjetaCreditoConexion() {
		return isTienePermisosTarjetaCreditoConexion;
	}

	public void setIsTienePermisosTarjetaCreditoConexion(Boolean isTienePermisosTarjetaCreditoConexion) {
		this.isTienePermisosTarjetaCreditoConexion= isTienePermisosTarjetaCreditoConexion;
	}


	public Boolean isTienePermisosNumeroRecap=false;

	public Boolean getIsTienePermisosNumeroRecap() {
		return isTienePermisosNumeroRecap;
	}

	public void setIsTienePermisosNumeroRecap(Boolean isTienePermisosNumeroRecap) {
		this.isTienePermisosNumeroRecap= isTienePermisosNumeroRecap;
	}


	public Boolean isTienePermisosFormaPagoPuntoVenta=false;

	public Boolean getIsTienePermisosFormaPagoPuntoVenta() {
		return isTienePermisosFormaPagoPuntoVenta;
	}

	public void setIsTienePermisosFormaPagoPuntoVenta(Boolean isTienePermisosFormaPagoPuntoVenta) {
		this.isTienePermisosFormaPagoPuntoVenta= isTienePermisosFormaPagoPuntoVenta;
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
	
	public Boolean isPermisoTodoConexion;
	public Boolean isPermisoNuevoConexion;
	public Boolean isPermisoActualizarConexion;
	public Boolean isPermisoActualizarOriginalConexion;
	public Boolean isPermisoEliminarConexion;
	public Boolean isPermisoGuardarCambiosConexion;
	public Boolean isPermisoConsultaConexion;
	public Boolean isPermisoBusquedaConexion;
	public Boolean isPermisoReporteConexion;
	public Boolean isPermisoPaginacionMedioConexion;
	public Boolean isPermisoPaginacionAltoConexion;
	public Boolean isPermisoPaginacionTodoConexion;
	public Boolean isPermisoCopiarConexion;
	public Boolean isPermisoVerFormConexion;
	public Boolean isPermisoDuplicarConexion;
	public Boolean isPermisoOrdenConexion;
	
	
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
	
	public ConexionParameterReturnGeneral conexionReturnGeneral;
	public ConexionParameterReturnGeneral conexionParameterGeneral;
	
	

	public TarjetaCreditoConexionLogic tarjetacreditoconexionLogic=null;

	public TarjetaCreditoConexionLogic getTarjetaCreditoConexionLogic() {
		return tarjetacreditoconexionLogic;
	}

	public void setTarjetaCreditoConexionLogic(TarjetaCreditoConexionLogic tarjetacreditoconexionLogic) {
		this.tarjetacreditoconexionLogic = tarjetacreditoconexionLogic;
	}


	public NumeroRecapLogic numerorecapLogic=null;

	public NumeroRecapLogic getNumeroRecapLogic() {
		return numerorecapLogic;
	}

	public void setNumeroRecapLogic(NumeroRecapLogic numerorecapLogic) {
		this.numerorecapLogic = numerorecapLogic;
	}


	public FormaPagoPuntoVentaLogic formapagopuntoventaLogic=null;

	public FormaPagoPuntoVentaLogic getFormaPagoPuntoVentaLogic() {
		return formapagopuntoventaLogic;
	}

	public void setFormaPagoPuntoVentaLogic(FormaPagoPuntoVentaLogic formapagopuntoventaLogic) {
		this.formapagopuntoventaLogic = formapagopuntoventaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConexion=false;
	public Boolean esParaAccionDesdeFormularioConexion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConexionSessionBeanAdditional conexionSessionBeanAdditional=null;
	
	public ConexionSessionBeanAdditional getConexionSessionBeanAdditional() {
		return this.conexionSessionBeanAdditional;
	}
	
	public void setConexionSessionBeanAdditional(ConexionSessionBeanAdditional conexionSessionBeanAdditional) {
		try {
			this.conexionSessionBeanAdditional=conexionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConexionBeanSwingJInternalFrameAdditional conexionBeanSwingJInternalFrameAdditional=null;
	//public class ConexionBeanSwingJInternalFrame
	
	public ConexionBeanSwingJInternalFrameAdditional getConexionBeanSwingJInternalFrameAdditional() {
		return this.conexionBeanSwingJInternalFrameAdditional;
	}
	
	public void setConexionBeanSwingJInternalFrameAdditional(ConexionBeanSwingJInternalFrameAdditional conexionBeanSwingJInternalFrameAdditional) {
		try {
			this.conexionBeanSwingJInternalFrameAdditional=conexionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConexionLogic conexionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Conexion conexionBean;
	public ConexionConstantesFunciones conexionConstantesFunciones;
	//public ConexionParameterReturnGeneral conexionReturnGeneral;
	
	//FK
	
	public TipoConexionLogic tipoconexionLogic;
	
	//PARAMETROS
	
	
	//public List<Conexion> conexions;	
	//public List<Conexion> conexionsEliminados;
	//public List<Conexion> conexionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConexion=false;
	public Boolean isVisibilidadCeldaDuplicarConexion=true;
	public Boolean isVisibilidadCeldaCopiarConexion=true;
	public Boolean isVisibilidadCeldaVerFormConexion=true;
	public Boolean isVisibilidadCeldaOrdenConexion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConexion=false;
	public Boolean isVisibilidadCeldaModificarConexion=false;
	public Boolean isVisibilidadCeldaActualizarConexion=false;
	public Boolean isVisibilidadCeldaEliminarConexion=false;
	public Boolean isVisibilidadCeldaCancelarConexion=false;
	public Boolean isVisibilidadCeldaGuardarConexion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConexion=false;	
	
	
	public Boolean isVisibilidadFK_IdTipoConexion=false;
	
	public Long getiIdNuevoConexion() {
		return this.iIdNuevoConexion;
	}

	public void setiIdNuevoConexion(Long iIdNuevoConexion) {
		this.iIdNuevoConexion = iIdNuevoConexion;
	}
	
	public Long getidConexionActual() {
		return this.idConexionActual;
	}

	public void setidConexionActual(Long idConexionActual) {
		this.idConexionActual = idConexionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Conexion getconexion() {
		return this.conexion;
	}

	public void setconexion(Conexion conexion) {
		this.conexion = conexion;
	}
	
	public Conexion getconexionAux() {
		return this.conexionAux;
	}

	public void setconexionAux(Conexion conexionAux) {
		this.conexionAux = conexionAux;
	}				
	
	public Conexion getconexionAnterior() {
		return this.conexionAnterior;
	}

	public void setconexionAnterior(Conexion conexionAnterior) {
		this.conexionAnterior = conexionAnterior;
	}	
	
	public Conexion getconexionTotales() {
		return this.conexionTotales;
	}

	public void setconexionTotales(Conexion conexionTotales) {
		this.conexionTotales = conexionTotales;
	}	
	
	public Conexion getconexionBean() {
		return this.conexionBean;
	}

	public void setconexionBean(Conexion conexionBean) {
		this.conexionBean = conexionBean;
	}	
	
	public ConexionParameterReturnGeneral getconexionReturnGeneral() {
		return this.conexionReturnGeneral;
	}

	public void setconexionReturnGeneral(ConexionParameterReturnGeneral conexionReturnGeneral) {
		this.conexionReturnGeneral = conexionReturnGeneral;
	}	
	
	
	public Long id_tipo_conexionFK_IdTipoConexion=-1L;

	public Long getid_tipo_conexionFK_IdTipoConexion() {
		return this.id_tipo_conexionFK_IdTipoConexion;
	}

	public void setid_tipo_conexionFK_IdTipoConexion(Long id_tipo_conexionFK_IdTipoConexion) {
		this.id_tipo_conexionFK_IdTipoConexion = id_tipo_conexionFK_IdTipoConexion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ConexionLogic getConexionLogic()	{		
		return conexionLogic;
	}

	public void setConexionLogic(ConexionLogic conexionLogic) {
		this.conexionLogic = conexionLogic;
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
	
	public Boolean getIsEsNuevoConexion() {
		return isEsNuevoConexion;
	}

	public void setIsEsNuevoConexion(Boolean isEsNuevoConexion) {
		this.isEsNuevoConexion = isEsNuevoConexion;
	}

	public Boolean getEsParaAccionDesdeFormularioConexion() {
		return esParaAccionDesdeFormularioConexion;
	}
	
	public void setEsParaAccionDesdeFormularioConexion(Boolean esParaAccionDesdeFormularioConexion) {
		this.esParaAccionDesdeFormularioConexion = esParaAccionDesdeFormularioConexion;
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
	
	
	public void cargarCombosTipoConexionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoconexionsForeignKey=new ArrayList<TipoConexion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoConexionLogic tipoconexionLogic=new TipoConexionLogic();

			tipoconexionLogic.getTipoConexionDataAccess().setIsForForeingKeyData(true);

			if(this.conexionSessionBean==null) {
				this.conexionSessionBean=new ConexionSessionBean();
			}

			if(!this.conexionSessionBean.getisBusquedaDesdeForeignKeySesionTipoConexion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconexionLogic.getTipoConexionDataAccess().setIsForForeingKeyData(true);

					tipoconexionLogic.getTodosTipoConexionsWithConnection(sFinalQuery,new Pagination());

					this.tipoconexionsForeignKey=tipoconexionLogic.getTipoConexions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoConexion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconexionLogic.getEntityWithConnection(conexionSessionBean.getlidTipoConexionActual());
					this.tipoconexionsForeignKey.add(tipoconexionLogic.getTipoConexion());
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

	
	
	public void setActualTipoConexionForeignKey(Long idTipoConexionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoConexion  tipoconexionTemp=null;

			for(TipoConexion tipoconexionAux:tipoconexionsForeignKey) {
				if(tipoconexionAux.getId()!=null && tipoconexionAux.getId().equals(idTipoConexionSeleccionado)) {
					tipoconexionTemp=tipoconexionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoconexionTemp!=null) {

					if(this.conexion!=null) {
						this.conexion.setTipoConexion(tipoconexionTemp);
					}

					if(this.jInternalFrameDetalleFormConexion!=null) {
						this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.setSelectedItem(tipoconexionTemp);
					}
				} else {
					//jComboBoxid_tipo_conexionConexion.setSelectedItem(tipoconexionTemp);
					if(this.jInternalFrameDetalleFormConexion!=null) {
						if(this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.getItemCount()>0) {
							this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoConexion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoconexionTemp!=null && jComboBoxid_tipo_conexionFK_IdTipoConexionConexion!=null) {
						jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.setSelectedItem(tipoconexionTemp);
					} else {
						if(jComboBoxid_tipo_conexionFK_IdTipoConexionConexion!=null) {
							//jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.setSelectedItem(tipoconexionTemp);
							if(jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.getItemCount()>0) {
								jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.setSelectedIndex(0);
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

	public String getActualTipoConexionForeignKeyDescripcion(Long idTipoConexionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoConexion  tipoconexionTemp=null;

			for(TipoConexion tipoconexionAux:tipoconexionsForeignKey) {
				if(tipoconexionAux.getId()!=null && tipoconexionAux.getId().equals(idTipoConexionSeleccionado)) {
					tipoconexionTemp=tipoconexionAux;
					break;
				}
			}


			sDescripcion=TipoConexionConstantesFunciones.getTipoConexionDescripcion(tipoconexionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoConexionForeignKeyGenerico(Long idTipoConexionSeleccionado,JComboBox jComboBoxid_tipo_conexionConexionGenerico)throws Exception
	{
		try
		{
			TipoConexion  tipoconexionTemp=null;

			for(TipoConexion tipoconexionAux:tipoconexionsForeignKey) {
				if(tipoconexionAux.getId()!=null && tipoconexionAux.getId().equals(idTipoConexionSeleccionado)) {
					tipoconexionTemp=tipoconexionAux;
					break;
				}
			}

			if(tipoconexionTemp!=null) {
				jComboBoxid_tipo_conexionConexionGenerico.setSelectedItem(tipoconexionTemp);
			} else {
				if(jComboBoxid_tipo_conexionConexionGenerico!=null && jComboBoxid_tipo_conexionConexionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_conexionConexionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoConexionForeignKey(Conexion conexion,JComboBox jComboBoxid_tipo_conexionConexionGenerico)throws Exception
	{
		try
		{
			TipoConexion  tipoconexionAux=new TipoConexion();

			if(jComboBoxid_tipo_conexionConexionGenerico==null) {
				tipoconexionAux=(TipoConexion)this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.getSelectedItem();
			} else {
				tipoconexionAux=(TipoConexion)jComboBoxid_tipo_conexionConexionGenerico.getSelectedItem();
			}

			if(tipoconexionAux!=null && tipoconexionAux.getId()!=null) {
				conexion.setid_tipo_conexion(tipoconexionAux.getId());
				conexion.settipoconexion_descripcion(ConexionConstantesFunciones.getTipoConexionDescripcion(tipoconexionAux));
				conexion.setTipoConexion(tipoconexionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoConexionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoConexion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConexionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConexion!=null) { 
							this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.removeAllItems();

							for(TipoConexion tipoconexion:this.tipoconexionsForeignKey) {
								this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.addItem(tipoconexion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConexion!=null) { 
					}

					if(!ConexionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoConexion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConexionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.removeAllItems();

							for(TipoConexion tipoconexion:this.tipoconexionsForeignKey) {
								this.jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.addItem(tipoconexion);
							}
						}

						if(!ConexionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoConexionForeignKey(TipoConexion tipoconexion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConexion!=null) {
							this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.setSelectedItem(tipoconexion);
						}
					} else {
						if(this.jInternalFrameDetalleFormConexion!=null) {
							this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.setSelectedItem(tipoconexion);
						} else {
							this.jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesConexion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ConexionConstantesFunciones.refrescarForeignKeysDescripcionesConexion(this.conexionLogic.getConexions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ConexionConstantesFunciones.refrescarForeignKeysDescripcionesConexion(this.conexions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(TipoConexion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//conexionLogic.setConexions(this.conexions);
			conexionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ConexionParameterReturnGeneral getConexionParameterGeneral() {
		return this.conexionParameterGeneral;
	}
	
	public void setConexionParameterGeneral(ConexionParameterReturnGeneral conexionParameterGeneral) {
		this.conexionParameterGeneral = conexionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConexion() {
		return isPermisoTodoConexion;
	}

	public void setIsPermisoTodoConexion(Boolean isPermisoTodoConexion) {
		this.isPermisoTodoConexion = isPermisoTodoConexion;
	}

	public Boolean getIsPermisoNuevoConexion() {
		return isPermisoNuevoConexion;
	}

	public void setIsPermisoNuevoConexion(Boolean isPermisoNuevoConexion) {
		this.isPermisoNuevoConexion = isPermisoNuevoConexion;
	}

	public Boolean getIsPermisoActualizarConexion() {
		return isPermisoActualizarConexion;
	}

	public void setIsPermisoActualizarConexion(Boolean isPermisoActualizarConexion) {
		this.isPermisoActualizarConexion = isPermisoActualizarConexion;
	}

	public Boolean getIsPermisoEliminarConexion() {
		return isPermisoEliminarConexion;
	}

	public void setIsPermisoEliminarConexion(Boolean isPermisoEliminarConexion) {
		this.isPermisoEliminarConexion = isPermisoEliminarConexion;
	}

	public Boolean getIsPermisoGuardarCambiosConexion() {
		return isPermisoGuardarCambiosConexion;
	}

	public void setIsPermisoGuardarCambiosConexion(Boolean isPermisoGuardarCambiosConexion) {
		this.isPermisoGuardarCambiosConexion = isPermisoGuardarCambiosConexion;
	}
	
	public Boolean getIsPermisoConsultaConexion() {
		return isPermisoConsultaConexion;
	}

	public void setIsPermisoConsultaConexion(Boolean isPermisoConsultaConexion) {
		this.isPermisoConsultaConexion = isPermisoConsultaConexion;
	}

	public Boolean getIsPermisoBusquedaConexion() {
		return isPermisoBusquedaConexion;
	}

	public void setIsPermisoBusquedaConexion(Boolean isPermisoBusquedaConexion) {
		this.isPermisoBusquedaConexion = isPermisoBusquedaConexion;
	}

	public Boolean getIsPermisoReporteConexion() {
		return isPermisoReporteConexion;
	}

	public void setIsPermisoReporteConexion(Boolean isPermisoReporteConexion) {
		this.isPermisoReporteConexion = isPermisoReporteConexion;
	}
	
	public Boolean getIsPermisoPaginacionMedioConexion() {
		return isPermisoPaginacionMedioConexion;
	}

	public void setIsPermisoPaginacionMedioConexion(Boolean isPermisoPaginacionMedioConexion) {
		this.isPermisoPaginacionMedioConexion = isPermisoPaginacionMedioConexion;
	}
	
	public Boolean getIsPermisoPaginacionTodoConexion() {
		return isPermisoPaginacionTodoConexion;
	}

	public void setIsPermisoPaginacionTodoConexion(Boolean isPermisoPaginacionTodoConexion) {
		this.isPermisoPaginacionTodoConexion = isPermisoPaginacionTodoConexion;
	}
	
	public Boolean getIsPermisoPaginacionAltoConexion() {
		return isPermisoPaginacionAltoConexion;
	}

	public void setIsPermisoPaginacionAltoConexion(Boolean isPermisoPaginacionAltoConexion) {
		this.isPermisoPaginacionAltoConexion = isPermisoPaginacionAltoConexion;
	}
	
	public Boolean getIsPermisoCopiarConexion() {
		return isPermisoCopiarConexion;
	}

	public void setIsPermisoCopiarConexion(Boolean isPermisoCopiarConexion) {
		this.isPermisoCopiarConexion = isPermisoCopiarConexion;
	}
	
	public Boolean getIsPermisoVerFormConexion() {
		return isPermisoVerFormConexion;
	}

	public void setIsPermisoVerFormConexion(Boolean isPermisoVerFormConexion) {
		this.isPermisoVerFormConexion = isPermisoVerFormConexion;
	}
	
	public Boolean getIsPermisoDuplicarConexion() {
		return isPermisoDuplicarConexion;
	}

	public void setIsPermisoDuplicarConexion(Boolean isPermisoDuplicarConexion) {
		this.isPermisoDuplicarConexion = isPermisoDuplicarConexion;
	}
	
	public Boolean getIsPermisoOrdenConexion() {
		return isPermisoOrdenConexion;
	}

	public void setIsPermisoOrdenConexion(Boolean isPermisoOrdenConexion) {
		this.isPermisoOrdenConexion = isPermisoOrdenConexion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConexion() {
		return isVisibilidadCeldaNuevoConexion;
	}

	public void setIsVisibilidadCeldaNuevoConexion(Boolean isVisibilidadCeldaNuevoConexion) {
		this.isVisibilidadCeldaNuevoConexion = isVisibilidadCeldaNuevoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConexion() {
		return isVisibilidadCeldaDuplicarConexion;
	}

	public void setIsVisibilidadCeldaDuplicarConexion(Boolean isVisibilidadCeldaDuplicarConexion) {
		this.isVisibilidadCeldaDuplicarConexion = isVisibilidadCeldaDuplicarConexion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConexion() {
		return isVisibilidadCeldaCopiarConexion;
	}

	public void setIsVisibilidadCeldaCopiarConexion(Boolean isVisibilidadCeldaCopiarConexion) {
		this.isVisibilidadCeldaCopiarConexion = isVisibilidadCeldaCopiarConexion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConexion() {
		return isVisibilidadCeldaVerFormConexion;
	}

	public void setIsVisibilidadCeldaVerFormConexion(Boolean isVisibilidadCeldaVerFormConexion) {
		this.isVisibilidadCeldaVerFormConexion = isVisibilidadCeldaVerFormConexion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConexion() {
		return isVisibilidadCeldaOrdenConexion;
	}

	public void setIsVisibilidadCeldaOrdenConexion(Boolean isVisibilidadCeldaOrdenConexion) {
		this.isVisibilidadCeldaOrdenConexion = isVisibilidadCeldaOrdenConexion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConexion() {
		return isVisibilidadCeldaNuevoRelacionesConexion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConexion(Boolean isVisibilidadCeldaNuevoRelacionesConexion) {
		this.isVisibilidadCeldaNuevoRelacionesConexion = isVisibilidadCeldaNuevoRelacionesConexion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConexion() {
		return isVisibilidadCeldaModificarConexion;
	}

	public void setIsVisibilidadCeldaModificarConexion(Boolean isVisibilidadCeldaModificarConexion) {
		this.isVisibilidadCeldaModificarConexion = isVisibilidadCeldaModificarConexion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConexion() {
		return isVisibilidadCeldaActualizarConexion;
	}

	public void setIsVisibilidadCeldaActualizarConexion(Boolean isVisibilidadCeldaActualizarConexion) {
		this.isVisibilidadCeldaActualizarConexion = isVisibilidadCeldaActualizarConexion;
	}

	public Boolean getIsVisibilidadCeldaEliminarConexion() {
		return isVisibilidadCeldaEliminarConexion;
	}

	public void setIsVisibilidadCeldaEliminarConexion(Boolean isVisibilidadCeldaEliminarConexion) {
		this.isVisibilidadCeldaEliminarConexion = isVisibilidadCeldaEliminarConexion;
	}

	public Boolean getIsVisibilidadCeldaCancelarConexion() {
		return isVisibilidadCeldaCancelarConexion;
	}

	public void setIsVisibilidadCeldaCancelarConexion(Boolean isVisibilidadCeldaCancelarConexion) {
		this.isVisibilidadCeldaCancelarConexion = isVisibilidadCeldaCancelarConexion;
	}

	public Boolean getIsVisibilidadCeldaGuardarConexion() {
		return isVisibilidadCeldaGuardarConexion;
	}

	public void setIsVisibilidadCeldaGuardarConexion(Boolean isVisibilidadCeldaGuardarConexion) {
		this.isVisibilidadCeldaGuardarConexion = isVisibilidadCeldaGuardarConexion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConexion() {
		return isVisibilidadCeldaGuardarCambiosConexion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConexion(Boolean isVisibilidadCeldaGuardarCambiosConexion) {
		this.isVisibilidadCeldaGuardarCambiosConexion = isVisibilidadCeldaGuardarCambiosConexion;
	}
		
	public ConexionSessionBean getconexionSessionBean() {
		return this.conexionSessionBean;
	}
	
	public void setconexionSessionBean(ConexionSessionBean conexionSessionBean) {
		this.conexionSessionBean=conexionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdTipoConexion() {
		return this.isVisibilidadFK_IdTipoConexion;
	}

	public void setisVisibilidadFK_IdTipoConexion(Boolean isVisibilidadFK_IdTipoConexion) {
		this.isVisibilidadFK_IdTipoConexion=isVisibilidadFK_IdTipoConexion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConexion(Conexion conexion)throws Exception {
		try {
			
				this.setActualParaGuardarTipoConexionForeignKey(conexion,null);
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
	
	public void bugActualizarReferenciaActual(Conexion conexion,Conexion conexionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConexion(conexion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		conexionAux.setId(conexion.getId());
		conexionAux.setVersionRow(conexion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessConexion();
		
			int intSelectedRow = this.jTableDatosConexion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualConexion(this.conexion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = conexionValidator.getInvalidValues(this.conexion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			conexionLogic.setDatosCliente(datosCliente);
			conexionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				conexionAux=new  Conexion();
				
				conexionAux.setIsNew(true);
				conexionAux.setIsChanged(true);
				
				conexionAux.setConexionOriginal(this.conexion);
				
				conexionAux.setId(this.conexion.getId());	
				conexionAux.setVersionRow(this.conexion.getVersionRow());	
				conexionAux.setid_tipo_conexion(this.conexion.getid_tipo_conexion());	
				conexionAux.setnombre(this.conexion.getnombre());	
				conexionAux.setnombre_maquina(this.conexion.getnombre_maquina());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.conexionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.conexionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(conexionAux,conexionLogic.getConexions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conexionAux,conexions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.conexionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conexionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conexionLogic.saveConexions();//WithConnection
						//conexionLogic.getSetVersionRowConexions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.conexion,conexionAux);
					
					this.refrescarForeignKeysDescripcionesConexion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conexionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().addAll(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionsEliminados);
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps().addAll(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapsEliminados);
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas().addAll(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexions.addAll(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionsEliminados);
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecaps.addAll(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapsEliminados);
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas.addAll(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conexionLogic.saveConexionRelaciones(conexionAux,this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions(),this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps(),this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());//WithConnection
								//conexionLogic.getSetVersionRowConexions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.conexion,conexionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.setTarjetaCreditoConexions(new ArrayList<TarjetaCreditoConexion>());
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.setNumeroRecaps(new ArrayList<NumeroRecap>());
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(new ArrayList<FormaPagoPuntoVenta>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexions= new ArrayList<TarjetaCreditoConexion>();
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecaps= new ArrayList<NumeroRecap>();
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas= new ArrayList<FormaPagoPuntoVenta>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();}
							conexionAux.setTarjetaCreditoConexions(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions());

							if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.quitarFilaTotales();}
							conexionAux.setNumeroRecaps(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps());

							if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							conexionAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.conexionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.conexionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(conexionAux,conexionLogic.getConexions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(conexionAux,conexions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.conexion,conexionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				conexionAux=new  Conexion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.conexionSessionBean.getEsGuardarRelacionado() 
					|| (this.conexionSessionBean.getEsGuardarRelacionado() && this.conexion.getId()>=0)) {
						
					conexionAux.setIsNew(false);
				}
				
				conexionAux.setIsDeleted(false);
			
				conexionAux.setId(this.conexion.getId());	
				conexionAux.setVersionRow(this.conexion.getVersionRow());	
				conexionAux.setid_tipo_conexion(this.conexion.getid_tipo_conexion());	
				conexionAux.setnombre(this.conexion.getnombre());	
				conexionAux.setnombre_maquina(this.conexion.getnombre_maquina());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(conexionAux,conexionLogic.getConexions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conexionAux,conexions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.conexionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conexionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conexionLogic.saveConexions();//WithConnection
						//conexionLogic.getSetVersionRowConexions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.conexion,conexionAux);
					
					this.refrescarForeignKeysDescripcionesConexion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conexionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().addAll(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionsEliminados);
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps().addAll(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapsEliminados);
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas().addAll(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexions.addAll(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionsEliminados);
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecaps.addAll(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapsEliminados);
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas.addAll(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conexionLogic.saveConexionRelaciones(conexionAux,this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions(),this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps(),this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());//WithConnection
								//conexionLogic.getSetVersionRowConexions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.conexion,conexionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.setTarjetaCreditoConexions(new ArrayList<TarjetaCreditoConexion>());
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.setNumeroRecaps(new ArrayList<NumeroRecap>());
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(new ArrayList<FormaPagoPuntoVenta>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexions= new ArrayList<TarjetaCreditoConexion>();
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecaps= new ArrayList<NumeroRecap>();
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas= new ArrayList<FormaPagoPuntoVenta>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();}
							conexionAux.setTarjetaCreditoConexions(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions());

							if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.quitarFilaTotales();}
							conexionAux.setNumeroRecaps(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps());

							if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							conexionAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.conexionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.conexionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(conexionAux,conexionLogic.getConexions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(conexionAux,conexions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.conexion,conexionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				conexionAux=new  Conexion();
				
				conexionAux.setIsNew(false);
				conexionAux.setIsChanged(false);
				
				conexionAux.setIsDeleted(true);
				
				conexionAux.setId(this.conexion.getId());	
				conexionAux.setVersionRow(this.conexion.getVersionRow());	
				conexionAux.setid_tipo_conexion(this.conexion.getid_tipo_conexion());	
				conexionAux.setnombre(this.conexion.getnombre());	
				conexionAux.setnombre_maquina(this.conexion.getnombre_maquina());	
				
				if(this.conexionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.conexionAux.getId()>=0) {	
						this.conexionsEliminados.add(conexionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(conexionAux,conexionLogic.getConexions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conexionAux,conexions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.conexionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conexionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conexionLogic.saveConexions();//WithConnection
						//conexionLogic.getSetVersionRowConexions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conexionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().addAll(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionsEliminados);
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps().addAll(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapsEliminados);
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas().addAll(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexions.addAll(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionsEliminados);
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecaps.addAll(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapsEliminados);
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas.addAll(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conexionLogic.saveConexionRelaciones(conexionAux,this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions(),this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps(),this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());//WithConnection
								//conexionLogic.getSetVersionRowConexions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.setTarjetaCreditoConexions(new ArrayList<TarjetaCreditoConexion>());
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.setNumeroRecaps(new ArrayList<NumeroRecap>());
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(new ArrayList<FormaPagoPuntoVenta>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexions= new ArrayList<TarjetaCreditoConexion>();
							this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecaps= new ArrayList<NumeroRecap>();
							this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas= new ArrayList<FormaPagoPuntoVenta>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.quitarFilaTotales();}
							conexionAux.setTarjetaCreditoConexions(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions());

							if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.quitarFilaTotales();}
							conexionAux.setNumeroRecaps(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps());

							if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							conexionAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.conexionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.conexionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(conexionAux,conexionLogic.getConexions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(conexionAux,conexions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.getConexions().addAll(this.conexionsEliminados);
					
					conexionLogic.saveConexions();//WithConnection
					//conexionLogic.getSetVersionRowConexions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesConexion();
				
				this.conexionsEliminados= new ArrayList<Conexion>();		
			}
			
			if(this.conexionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Conexion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Conexion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.conexion=conexionAux;
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
      		//this.finishProcessConexion();
      	}
		
	}	
	
	public void actualizarRelaciones(Conexion conexionLocal) throws Exception {
		
		if(this.conexionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				conexionLocal.setTarjetaCreditoConexions(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				conexionLocal.setNumeroRecaps(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps());
				conexionLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
			
			} else {
			
				conexionLocal.setTarjetaCreditoConexions(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexions);
				conexionLocal.setNumeroRecaps(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecaps);
				conexionLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Conexion conexionLocal) throws Exception {	
		if(this.conexionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoConexionDetalleFormJInternalFrame.class)) {
				TipoConexionBeanSwingJInternalFrame tipoconexionBeanSwingJInternalFrameLocal=(TipoConexionBeanSwingJInternalFrame) ((TipoConexionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoconexionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoConexion(tipoconexionBeanSwingJInternalFrameLocal.gettipoconexion(),true);
				tipoconexionBeanSwingJInternalFrameLocal.actualizarLista(tipoconexionBeanSwingJInternalFrameLocal.tipoconexion,this.tipoconexionsForeignKey);

				tipoconexionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoconexionBeanSwingJInternalFrameLocal.tipoconexion);

				conexionLocal.setTipoConexion(tipoconexionBeanSwingJInternalFrameLocal.tipoconexion);

				this.addItemDefectoCombosForeignKeyTipoConexion();
				this.cargarCombosFrameTipoConexionsForeignKey("Formulario");
				this.setActualTipoConexionForeignKey(tipoconexionBeanSwingJInternalFrameLocal.tipoconexion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConexionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConexion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = conexionValidator.getInvalidValues(this.conexion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Conexion conexion,List<Conexion> conexions) throws Exception {
		try	{		
			ConexionConstantesFunciones.actualizarLista(conexion,conexions,this.conexionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Conexion conexion,List<Conexion> conexions) throws Exception {
		try	{			
			ConexionConstantesFunciones.actualizarSelectedLista(conexion,conexions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Conexion> conexionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				conexionsLocal=this.conexionLogic.getConexions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				conexionsLocal=this.conexions;
			}
			//ARCHITECTURE
		
			for(Conexion conexionLocal:conexionsLocal) {
				if(this.permiteMantenimiento(conexionLocal) && conexionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConexionConstantesFunciones.getConexionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConexionConstantesFunciones.IDTIPOCONEXION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConexion.jLabelid_tipo_conexionConexion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConexionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConexion.jLabelnombreConexion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConexionConstantesFunciones.NOMBREMAQUINA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConexion.jLabelnombre_maquinaConexion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConexion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConexion.jLabelid_tipo_conexionConexion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConexion.jLabelnombreConexion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConexion.jLabelnombre_maquinaConexion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TarjetaCreditoConexion")) {
			if(this.conexion==null) {
				this.conexion= new Conexion();
			}

			if(this.conexionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoConexion
				this.setVariablesFormularioToObjetoActualConexion(this.conexion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);

				this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.gettarjetacreditoconexion().setConexion(this.conexion);
			}

			return;
		}
		 else  if(sTipo.equals("NumeroRecap")) {
			if(this.conexion==null) {
				this.conexion= new Conexion();
			}

			if(this.conexionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoConexion
				this.setVariablesFormularioToObjetoActualConexion(this.conexion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);

				this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.getnumerorecap().setConexion(this.conexion);
			}

			return;
		}
		 else  if(sTipo.equals("FormaPagoPuntoVenta")) {
			if(this.conexion==null) {
				this.conexion= new Conexion();
			}

			if(this.conexionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoConexion
				this.setVariablesFormularioToObjetoActualConexion(this.conexion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);

				this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.getformapagopuntoventa().setConexion(this.conexion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoConexion--;	
		
		
		this.conexionAux=new Conexion();
		
		this.conexionAux.setId(this.iIdNuevoConexion);
		this.conexionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conexionLogic.getConexions().add(this.conexionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.conexions.add(this.conexionAux);
		}
		//ARCHITECTURE
		
		this.conexion=this.conexionAux;
		
		if(ConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConexion(this.conexion);
			this.setVariablesObjetoActualToFormularioForeignKeyConexion(this.conexion);
		}
				
		//this.setDefaultControlesConexion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConexion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConexion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConexion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConexion(this.conexionBean,this.conexion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ConexionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.conexionSessionBean.getConGuardarRelaciones()) {
			classes=ConexionConstantesFunciones.getClassesRelationshipsOfConexion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.conexionReturnGeneral=conexionLogic.procesarEventosConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conexionLogic.getConexions(),this.conexion,this.conexionParameterGeneral,this.isEsNuevoConexion,classes);//this.conexionLogic.getConexion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConexion(this.conexionReturnGeneral,this.conexionBean,false);
		
		if(this.conexionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConexion(this.conexionReturnGeneral.getConexion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConexion(this.conexionReturnGeneral.getConexion());
		}
		
		if(this.conexionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConexion(this.conexionReturnGeneral.getConexion(),classes);//this.conexionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConexion(this.conexion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConexion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConexion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConexionBeanSwingJInternalFrameAdditional.RecargarFormConexion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConexion(false);
						
			if(conexionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado() && TarjetaCreditoConexionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTarjetaCreditoConexionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapSessionBean.getEsGuardarRelacionado() && NumeroRecapJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNumeroRecapActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ConexionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConexion();
			}
			
			this.actualizarVisualTableDatosConexion();
			
			this.jTableDatosConexion.setRowSelectionInterval(this.getIndiceNuevoConexion(), this.getIndiceNuevoConexion());
			
			this.seleccionarFilaTablaConexionActual();
						
			this.actualizarEstadoCeldasBotonesConexion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConexion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConexion.jTextAreanombreConexion.setEnabled(isHabilitar && this.conexionConstantesFunciones.activarnombreConexion);
		this.jInternalFrameDetalleFormConexion.jTextAreanombre_maquinaConexion.setEnabled(isHabilitar && this.conexionConstantesFunciones.activarnombre_maquinaConexion);	
		
		this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.setEnabled(isHabilitar && this.conexionConstantesFunciones.activarid_tipo_conexionConexion);
	};
	
	public void setDefaultControlesConexion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConexion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.conexionSessionBean.setConGuardarRelaciones(true);			
			this.conexionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.conexionSessionBean.setConGuardarRelaciones(false);			
			this.conexionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoConexion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Conexion conexionAux:this.conexionLogic.getConexions()) {
				if(conexionAux.getId().equals(this.iIdNuevoConexion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Conexion conexionAux:this.conexions) {
				if(conexionAux.getId().equals(this.iIdNuevoConexion)) {
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
	
	public int getIndiceActualConexion(Conexion conexion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Conexion conexionAux:this.conexionLogic.getConexions()) {
				if(conexionAux.getId().equals(conexion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Conexion conexionAux:this.conexions) {
				if(conexionAux.getId().equals(conexion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConexion(Conexion conexionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Conexion conexionAux:this.conexionLogic.getConexions()) {
				if(conexionAux.getConexionOriginal().getId().equals(conexionOriginal.getId())) {
					existe=true;
					conexionOriginal.setId(conexionAux.getId());
					conexionOriginal.setVersionRow(conexionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Conexion conexionAux:this.conexions) {
				if(conexionAux.getConexionOriginal().getId().equals(conexionOriginal.getId())) {
					existe=true;
					conexionOriginal.setId(conexionAux.getId());
					conexionOriginal.setVersionRow(conexionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConexion(Boolean esParaCancelar) throws Exception {
		conexionsAux=new ArrayList<Conexion>();
		conexionAux=new Conexion();
		
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Conexion conexionAux:this.conexionLogic.getConexions()) {
					if(conexionAux.getId()<0) {
						conexionsAux.add(conexionAux);
					}		
				}
				this.iIdNuevoConexion=0L;
				this.conexionLogic.getConexions().removeAll(conexionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Conexion conexionAux:this.conexions) {
					if(conexionAux.getId()<0) {
						conexionsAux.add(conexionAux);
					}		
				}
				this.iIdNuevoConexion=0L;
				this.conexions.removeAll(conexionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConexion 
					&& this.conexionLogic.getConexions().size()>0
					) {
					conexionAux=this.conexionLogic.getConexions().get(this.conexionLogic.getConexions().size() - 1);
				
					if(conexionAux.getId()<0) {
						this.conexionLogic.getConexions().remove(conexionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConexion && this.conexions.size()>0) {
					conexionAux=this.conexions.get(this.conexions.size() - 1);
				
					if(conexionAux.getId()<0) {
						this.conexions.remove(conexionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConexion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(conexion.getId()<0) {
				this.conexionLogic.getConexions().remove(this.conexion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(conexion.getId()<0) {
				this.conexions.remove(this.conexion);
			}
		}			
	}
	
	public void setEstadosInicialesConexion(List<Conexion> conexionsAux) throws Exception {
		ConexionConstantesFunciones.setEstadosInicialesConexion(conexionsAux);
	}
	
	public void setEstadosInicialesConexion(Conexion conexionAux) throws Exception {
		ConexionConstantesFunciones.setEstadosInicialesConexion(conexionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConexionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConexionActual()) {
				if(!this.isEsNuevoConexion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConexion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConexionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Conexion ?", "MANTENIMIENTO DE Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Conexion conexion) throws Exception {
		ConexionConstantesFunciones.seleccionarAsignar(this.conexion,conexion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConexion=this.isPermisoActualizarOriginalConexion;
			
			
			this.seleccionarAsignar(conexion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConexionConstantesFunciones.quitarEspaciosConexion(this.conexion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesConexion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.conexionSessionBean.setsFuncionBusquedaRapida(this.conexionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConexion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConexion(esParaCancelar);				
				this.cancelarNuevoConexion(esParaCancelar);								
			}
			
			this.conexion=new Conexion();
			
			this.inicializarConexion();
			
			this.actualizarEstadoCeldasBotonesConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConexion() throws Exception {
		try {
			ConexionConstantesFunciones.inicializarConexion(this.conexion);
			
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
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.conexionLogic.getConexions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConexions(String sAccionBusqueda,List<Conexion> conexionsParaReportes) throws Exception {
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
					sPathReporteFinal="Conexion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConexionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConexionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Conexion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Conexiones");		
		parameters.put("busquedapor", ConexionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TarjetaCreditoConexion.class));
			classes.add(new Classe(NumeroRecap.class));
			classes.add(new Classe(FormaPagoPuntoVenta.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ConexionLogic conexionLogicAuxiliar=new ConexionLogic();
					conexionLogicAuxiliar.setDatosCliente(conexionLogic.getDatosCliente());				
					conexionLogicAuxiliar.setConexions(conexionsParaReportes);
					
					conexionLogicAuxiliar.cargarRelacionesLoteForeignKeyConexionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					conexionsParaReportes=conexionLogicAuxiliar.getConexions();
					
					//conexionLogic.getNewConnexionToDeep();
					
					//for (Conexion conexion:conexionsParaReportes) {
					//	conexionLogic.deepLoad(conexion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//conexionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//conexionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTarjetaCreditoConexion = AuxiliarReportes.class.getResourceAsStream("TarjetaCreditoConexionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tarjetacreditoconexion", reportFileTarjetaCreditoConexion);

			InputStream reportFileNumeroRecap = AuxiliarReportes.class.getResourceAsStream("NumeroRecapDetalleRelacionesDesign.jasper");
			parameters.put("subreport_numerorecap", reportFileNumeroRecap);

			InputStream reportFileFormaPagoPuntoVenta = AuxiliarReportes.class.getResourceAsStream("FormaPagoPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formapagopuntoventa", reportFileFormaPagoPuntoVenta);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConexion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConexionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConexionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConexion=new JRBeanArrayDataSource(ConexionJInternalFrame.TraerConexionBeans(conexionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConexion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConexionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConexionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConexionBean.TraerConexionBeans(conexionsParaReportes).toArray()));
							
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
				this.generarExcelReporteConexions(sAccionBusqueda,sTipoArchivoReporte,conexionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConexions(sAccionBusqueda,sTipoArchivoReporte,conexionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConexionActionPerformed(null);
					//this.generarExcelReporteConexions(sAccionBusqueda,sTipoArchivoReporte,conexionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConexions(sAccionBusqueda,sTipoArchivoReporte,conexionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConexions(sAccionBusqueda,sTipoArchivoReporte,conexionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConexions(sAccionBusqueda,sTipoArchivoReporte,conexionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConexions(String sAccionBusqueda,String sTipoArchivoReporte,List<Conexion> conexionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conexion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Conexions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConexion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Conexion conexion : conexionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConexionConstantesFunciones.generarExcelReporteDataConexion("NORMAL",row,workbook,conexion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conexion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConexion(String sTipo,Row row,Workbook workbook) {
		
		ConexionConstantesFunciones.generarExcelReporteHeaderConexion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConexions(String sAccionBusqueda,String sTipoArchivoReporte,List<Conexion> conexionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conexion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Conexions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Conexion conexion : conexionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConexionConstantesFunciones.getConexionDescripcion(conexion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConexionConstantesFunciones.LABEL_IDTIPOCONEXION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConexionConstantesFunciones.LABEL_IDTIPOCONEXION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conexion.gettipoconexion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConexionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConexionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conexion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConexionConstantesFunciones.LABEL_NOMBREMAQUINA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConexionConstantesFunciones.LABEL_NOMBREMAQUINA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conexion.getnombre_maquina());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conexion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConexions(String sAccionBusqueda,String sTipoArchivoReporte,List<Conexion> conexionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Conexion> conexionsRespaldo=null;
		
		classes=ConexionConstantesFunciones.getClassesRelationshipsOfConexion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.conexionLogic.setDatosCliente(this.datosCliente);
		this.conexionLogic.setDatosDeep(this.datosDeep);
		this.conexionLogic.setIsConDeep(true);
		
		conexionsRespaldo=this.conexionLogic.getConexions();
		
		this.conexionLogic.setConexions(conexionsParaReportes);	
		this.conexionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		conexionsParaReportes=this.conexionLogic.getConexions();
		this.conexionLogic.setConexions(conexionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conexion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Conexions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConexion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Conexion conexion : conexionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConexion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConexionConstantesFunciones.generarExcelReporteDataConexion("NORMAL",row,workbook,conexion,cellStyleDataAux);
		
			
			


				//TarjetaCreditoConexion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO))) {

				if(conexion.getTarjetaCreditoConexions()!=null && conexion.getTarjetaCreditoConexions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TarjetaCreditoConexionConstantesFunciones.generarExcelReporteHeaderTarjetaCreditoConexion("RELACIONADO",row,workbook);
				}

				if(conexion.getTarjetaCreditoConexions()!=null) {
					i2=0;
					for(TarjetaCreditoConexion tarjetacreditoconexion : conexion.getTarjetaCreditoConexions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TarjetaCreditoConexionConstantesFunciones.generarExcelReporteDataTarjetaCreditoConexion("RELACIONADO",row,workbook,tarjetacreditoconexion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//NumeroRecap
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(NumeroRecapConstantesFunciones.SCLASSWEBTITULO))) {

				if(conexion.getNumeroRecaps()!=null && conexion.getNumeroRecaps().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(NumeroRecapConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					NumeroRecapConstantesFunciones.generarExcelReporteHeaderNumeroRecap("RELACIONADO",row,workbook);
				}

				if(conexion.getNumeroRecaps()!=null) {
					i2=0;
					for(NumeroRecap numerorecap : conexion.getNumeroRecaps()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						NumeroRecapConstantesFunciones.generarExcelReporteDataNumeroRecap("RELACIONADO",row,workbook,numerorecap,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FormaPagoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(conexion.getFormaPagoPuntoVentas()!=null && conexion.getFormaPagoPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormaPagoPuntoVentaConstantesFunciones.generarExcelReporteHeaderFormaPagoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(conexion.getFormaPagoPuntoVentas()!=null) {
					i2=0;
					for(FormaPagoPuntoVenta formapagopuntoventa : conexion.getFormaPagoPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormaPagoPuntoVentaConstantesFunciones.generarExcelReporteDataFormaPagoPuntoVenta("RELACIONADO",row,workbook,formapagopuntoventa,cellStyleDataAuxHijo);
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
		cell.setCellValue(ConexionConstantesFunciones.getConexionDescripcion(conexion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conexion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConexion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConexion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConexion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConexion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConexion() throws Exception {		
		this.startProcessConexion(true);
	}
	
	public void startProcessConexion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConexion ,this.jPanelParametrosReportesConexion, this.jScrollPanelDatosConexion,this.jPanelPaginacionConexion, this.jScrollPanelDatosEdicionConexion, this.jPanelAccionesConexion,this.jPanelAccionesFormularioConexion,this.jmenuBarConexion,this.jmenuBarDetalleConexion,this.jTtoolBarConexion,this.jTtoolBarDetalleConexion);		
		
		final JTabbedPane jTabbedPaneBusquedasConexion=this.jTabbedPaneBusquedasConexion; 
		
		final JPanel jPanelParametrosReportesConexion=this.jPanelParametrosReportesConexion;
		//final JScrollPane jScrollPanelDatosConexion=this.jScrollPanelDatosConexion;
		final JTable jTableDatosConexion=this.jTableDatosConexion;		
		final JPanel jPanelPaginacionConexion=this.jPanelPaginacionConexion;
		//final JScrollPane jScrollPanelDatosEdicionConexion=this.jScrollPanelDatosEdicionConexion;
		final JPanel jPanelAccionesConexion=this.jPanelAccionesConexion;
		
		JPanel jPanelCamposAuxiliarConexion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConexion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConexion!=null) {
			jPanelCamposAuxiliarConexion=this.jInternalFrameDetalleFormConexion.jPanelCamposConexion;
			jPanelAccionesFormularioAuxiliarConexion=this.jInternalFrameDetalleFormConexion.jPanelAccionesFormularioConexion;
		}
		
		final JPanel jPanelCamposConexion=jPanelCamposAuxiliarConexion;
		final JPanel jPanelAccionesFormularioConexion=jPanelAccionesFormularioAuxiliarConexion;
		
		
		final JMenuBar jmenuBarConexion=this.jmenuBarConexion;
		final JToolBar jTtoolBarConexion=this.jTtoolBarConexion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConexion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConexion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConexion!=null) {
			jmenuBarDetalleAuxiliarConexion=this.jInternalFrameDetalleFormConexion.jmenuBarDetalleConexion;
			jTtoolBarDetalleAuxiliarConexion=this.jInternalFrameDetalleFormConexion.jTtoolBarDetalleConexion;
		}
		
		final JMenuBar jmenuBarDetalleConexion=jmenuBarDetalleAuxiliarConexion;
		final JToolBar jTtoolBarDetalleConexion=jTtoolBarDetalleAuxiliarConexion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConexion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConexion;
			processRunnable.jTableDatos=jTableDatosConexion;
			processRunnable.jPanelCampos=jPanelCamposConexion;
			processRunnable.jPanelPaginacion=jPanelPaginacionConexion;
			processRunnable.jPanelAcciones=jPanelAccionesConexion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConexion;
			
			
			processRunnable.jmenuBar=jmenuBarConexion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConexion;
			processRunnable.jTtoolBar=jTtoolBarConexion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConexion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConexion ,jPanelParametrosReportesConexion,jTableDatosConexion, /*jScrollPanelDatosConexion,*/jPanelCamposConexion,jPanelPaginacionConexion, /*jScrollPanelDatosEdicionConexion,*/ jPanelAccionesConexion,jPanelAccionesFormularioConexion,jmenuBarConexion,jmenuBarDetalleConexion,jTtoolBarConexion,jTtoolBarDetalleConexion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConexion ,jPanelParametrosReportesConexion, jScrollPanelDatosConexion,jPanelPaginacionConexion, jScrollPanelDatosEdicionConexion, jPanelAccionesConexion,jPanelAccionesFormularioConexion,jmenuBarConexion,jmenuBarDetalleConexion,jTtoolBarConexion,jTtoolBarDetalleConexion);
						
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
	
	public void finishProcessConexion() {// throws Exception 
		this.finishProcessConexion(true);
	}
	
	public void finishProcessConexion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConexion ,this.jPanelParametrosReportesConexion, this.jScrollPanelDatosConexion,this.jPanelPaginacionConexion, this.jScrollPanelDatosEdicionConexion, this.jPanelAccionesConexion,this.jPanelAccionesFormularioConexion,this.jmenuBarConexion,this.jmenuBarDetalleConexion,this.jTtoolBarConexion,this.jTtoolBarDetalleConexion);		
		
		final JTabbedPane jTabbedPaneBusquedasConexion=this.jTabbedPaneBusquedasConexion; 
		
		final JPanel jPanelParametrosReportesConexion=this.jPanelParametrosReportesConexion;
		//final JScrollPane jScrollPanelDatosConexion=this.jScrollPanelDatosConexion;
		final JTable jTableDatosConexion=this.jTableDatosConexion;		
		final JPanel jPanelPaginacionConexion=this.jPanelPaginacionConexion;
		//final JScrollPane jScrollPanelDatosEdicionConexion=this.jScrollPanelDatosEdicionConexion;
		final JPanel jPanelAccionesConexion=this.jPanelAccionesConexion;
		
		JPanel jPanelCamposAuxiliarConexion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConexion=new JPanel();
		
		if(this.jInternalFrameDetalleFormConexion!=null) {
			jPanelCamposAuxiliarConexion=this.jInternalFrameDetalleFormConexion.jPanelCamposConexion;
			jPanelAccionesFormularioAuxiliarConexion=this.jInternalFrameDetalleFormConexion.jPanelAccionesFormularioConexion;
		}
		
		final JPanel jPanelCamposConexion=jPanelCamposAuxiliarConexion;
		final JPanel jPanelAccionesFormularioConexion=jPanelAccionesFormularioAuxiliarConexion;
		
		
		final JMenuBar jmenuBarConexion=this.jmenuBarConexion;		
		final JToolBar jTtoolBarConexion=this.jTtoolBarConexion;
				
		JMenuBar jmenuBarDetalleAuxiliarConexion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConexion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConexion!=null) {
			jmenuBarDetalleAuxiliarConexion=this.jInternalFrameDetalleFormConexion.jmenuBarDetalleConexion;
			jTtoolBarDetalleAuxiliarConexion=this.jInternalFrameDetalleFormConexion.jTtoolBarDetalleConexion;		
		}
		
		final JMenuBar jmenuBarDetalleConexion=jmenuBarDetalleAuxiliarConexion;
		final JToolBar jTtoolBarDetalleConexion=jTtoolBarDetalleAuxiliarConexion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConexion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConexion;
			processRunnable.jTableDatos=jTableDatosConexion;
			processRunnable.jPanelCampos=jPanelCamposConexion;
			processRunnable.jPanelPaginacion=jPanelPaginacionConexion;
			processRunnable.jPanelAcciones=jPanelAccionesConexion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConexion;
			
			
			processRunnable.jmenuBar=jmenuBarConexion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConexion;
			processRunnable.jTtoolBar=jTtoolBarConexion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConexion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConexion ,jPanelParametrosReportesConexion, jTableDatosConexion,/*jScrollPanelDatosConexion,*/jPanelCamposConexion,jPanelPaginacionConexion, /*jScrollPanelDatosEdicionConexion,*/ jPanelAccionesConexion,jPanelAccionesFormularioConexion,jmenuBarConexion,jmenuBarDetalleConexion,jTtoolBarConexion,jTtoolBarDetalleConexion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConexion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConexion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConexion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConexion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConexion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConexion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConexion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConexion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConexion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.conexionConstantesFunciones.getsFinalQueryConexion();
		String  finalQueryPaginacionTodos=this.conexionConstantesFunciones.getsFinalQueryConexion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConexionConstantesFunciones.getArrayColumnasGlobalesNoConexion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConexionConstantesFunciones.getArrayColumnasGlobalesConexion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConexionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.conexionsEliminados= new ArrayList<Conexion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConexion();
		
				///*ConexionSessionBean*/this.conexionSessionBean=new ConexionSessionBean();
			
			if(this.conexionSessionBean==null) {
				this.conexionSessionBean=new ConexionSessionBean();
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
					this.iNumeroPaginacion=ConexionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConexionConstantesFunciones.getClassesForeignKeysOfConexion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/conexion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			conexionsAux= new ArrayList<Conexion>();
			
				
			conexionLogic.setDatosCliente(this.datosCliente);
			conexionLogic.setDatosDeep(this.datosDeep);
			conexionLogic.setIsConDeep(true);
			
			
			conexionLogic.getConexionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					conexionLogic.getTodosConexions(finalQueryGlobal,pagination);
					
					//conexionLogic.getTodosConexionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(conexionLogic.getConexions()==null|| conexionLogic.getConexions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conexionsAux= new ArrayList<Conexion>();
							conexionsAux.addAll(conexionLogic.getConexions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conexionsAux= new ArrayList<Conexion>();
							conexionsAux.addAll(conexions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conexionLogic.getTodosConexions(finalQueryGlobal+"",this.pagination);												
							
							//conexionLogic.getTodosConexionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteConexions("Todos",conexionLogic.getConexions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conexionLogic.setConexions(new ArrayList<Conexion>());					
							conexionLogic.getConexions().addAll(conexionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conexions=new ArrayList<Conexion>();
							conexions.addAll(conexionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idConexion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idConexion=this.idActual;
				
				} else if(this.idConexionActual!=null && this.idConexionActual!=0L) {
					idConexion=idConexionActual;
				}
				
					
				this.sDetalleReporte=ConexionConstantesFunciones.getDetalleIndicePorId(idConexion);
				
				this.conexions=new ArrayList<Conexion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					conexionLogic.getEntity(idConexion);
					
					//conexionLogic.getEntityWithConnection(idConexion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conexionLogic.setConexions(new ArrayList<Conexion>());
					conexionLogic.getConexions().add(conexionLogic.getConexion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conexions=new ArrayList<Conexion>();
					this.conexions.add(conexion);
				}
				
				if(conexionLogic.getConexion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdTipoConexion")) {
				this.sDetalleReporte=ConexionConstantesFunciones.getDetalleIndiceFK_IdTipoConexion(id_tipo_conexionFK_IdTipoConexion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conexionLogic.getConexionsFK_IdTipoConexion(finalQueryGlobal,pagination,id_tipo_conexionFK_IdTipoConexion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConexionConstantesFunciones.getDetalleIndiceFK_IdTipoConexion(id_tipo_conexionFK_IdTipoConexion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConexionConstantesFunciones.getDetalleIndiceFK_IdTipoConexion(id_tipo_conexionFK_IdTipoConexion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conexionLogic.getConexions()==null||conexionLogic.getConexions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conexions==null|| conexions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conexionsAux=new ArrayList<Conexion>();
						conexionsAux.addAll(conexionLogic.getConexions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conexionsAux=new ArrayList<Conexion>();
							conexionsAux.addAll(conexions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conexionLogic.getConexionsFK_IdTipoConexion(finalQueryGlobal,pagination,id_tipo_conexionFK_IdTipoConexion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConexionConstantesFunciones.getDetalleIndiceFK_IdTipoConexion(id_tipo_conexionFK_IdTipoConexion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConexionConstantesFunciones.getDetalleIndiceFK_IdTipoConexion(id_tipo_conexionFK_IdTipoConexion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConexions("FK_IdTipoConexion",conexionLogic.getConexions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConexions("FK_IdTipoConexion",conexions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conexionLogic.setConexions(new ArrayList<Conexion>());
						conexionLogic.getConexions().addAll(conexionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conexions=new ArrayList<Conexion>();
							conexions.addAll(conexionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConexion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConexion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conexionLogic.getConexions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conexions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conexionLogic.getConexions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conexions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Conexion conexion) {
		Boolean permite=true;
		
		if(this.conexion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConexionConstantesFunciones.getOrderByListaConexion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConexionConstantesFunciones.getOrderByListaConexion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Conexion conexion:conexionLogic.getConexions()) {
				if(conexion.getsType().equals(Constantes2.S_TOTALES)) {
					conexionTotales=conexion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Conexion conexion:this.conexions) {
				if(conexion.getsType().equals(Constantes2.S_TOTALES)) {
					conexionTotales=conexion;
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
			this.conexionAux=new Conexion();
			this.conexionAux.setsType(Constantes2.S_TOTALES);
			this.conexionAux.setIsNew(false);
			this.conexionAux.setIsChanged(false);
			this.conexionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ConexionConstantesFunciones.TotalizarValoresFilaConexion(this.conexionLogic.getConexions(),this.conexionAux);
				
				this.conexionLogic.getConexions().add(this.conexionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConexionConstantesFunciones.TotalizarValoresFilaConexion(this.conexions,this.conexionAux);
				
				this.conexions.add(this.conexionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		conexionTotales=new Conexion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conexionLogic.getConexions().remove(conexionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conexions.remove(conexionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		conexionTotales=new Conexion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Conexion conexion:conexionLogic.getConexions()) {
				if(conexion.getsType().equals(Constantes2.S_TOTALES)) {
					conexionTotales=conexion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConexionConstantesFunciones.TotalizarValoresFilaConexion(this.conexionLogic.getConexions(),conexionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Conexion conexion:this.conexions) {
				if(conexion.getsType().equals(Constantes2.S_TOTALES)) {
					conexionTotales=conexion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConexionConstantesFunciones.TotalizarValoresFilaConexion(this.conexions,conexionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConexionsFK_IdTipoConexion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoConexion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConexionsFK_IdTipoConexion(String sFinalQuery,Long id_tipo_conexion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conexionLogic.getConexionsFK_IdTipoConexion(sFinalQuery,this.pagination,id_tipo_conexion);
				
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
	
	public void inicializarPermisosConexion() {
		this.isPermisoTodoConexion=false;
		this.isPermisoNuevoConexion=false;
		this.isPermisoActualizarConexion=false;
		this.isPermisoActualizarOriginalConexion=false;
		this.isPermisoEliminarConexion=false;
		this.isPermisoGuardarCambiosConexion=false;
		this.isPermisoConsultaConexion=false;
		this.isPermisoBusquedaConexion=false;
		this.isPermisoReporteConexion=false;		
		this.isPermisoOrdenConexion=false;		
		this.isPermisoPaginacionMedioConexion=false;		
		this.isPermisoPaginacionAltoConexion=false;
		this.isPermisoPaginacionTodoConexion=false;
		this.isPermisoCopiarConexion=false;		
		this.isPermisoVerFormConexion=false;		
		this.isPermisoDuplicarConexion=false;		
		this.isPermisoOrdenConexion=false;		
	}
	
	public void setPermisosUsuarioConexion(Boolean isPermiso) {
		this.isPermisoTodoConexion=isPermiso;
		this.isPermisoNuevoConexion=isPermiso;
		this.isPermisoActualizarConexion=isPermiso;
		this.isPermisoActualizarOriginalConexion=isPermiso;
		this.isPermisoEliminarConexion=isPermiso;
		this.isPermisoGuardarCambiosConexion=isPermiso;
		this.isPermisoConsultaConexion=isPermiso;
		this.isPermisoBusquedaConexion=isPermiso;
		this.isPermisoReporteConexion=isPermiso;
		this.isPermisoOrdenConexion=isPermiso;		
		this.isPermisoPaginacionMedioConexion=isPermiso;		
		this.isPermisoPaginacionAltoConexion=isPermiso;		
		this.isPermisoPaginacionTodoConexion=isPermiso;		
		this.isPermisoCopiarConexion=isPermiso;		
		this.isPermisoVerFormConexion=isPermiso;		
		this.isPermisoDuplicarConexion=isPermiso;
		this.isPermisoOrdenConexion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConexion(Boolean isPermiso) {
		//this.isPermisoTodoConexion=isPermiso;
		this.isPermisoNuevoConexion=isPermiso;
		this.isPermisoActualizarConexion=isPermiso;
		this.isPermisoActualizarOriginalConexion=isPermiso;
		this.isPermisoEliminarConexion=isPermiso;
		this.isPermisoGuardarCambiosConexion=isPermiso;
		//this.isPermisoConsultaConexion=isPermiso;
		//this.isPermisoBusquedaConexion=isPermiso;
		//this.isPermisoReporteConexion=isPermiso;
		//this.isPermisoOrdenConexion=isPermiso;		
		//this.isPermisoPaginacionMedioConexion=isPermiso;		
		//this.isPermisoPaginacionAltoConexion=isPermiso;		
		//this.isPermisoPaginacionTodoConexion=isPermiso;		
		//this.isPermisoCopiarConexion=isPermiso;		
		//this.isPermisoDuplicarConexion=isPermiso;
		//this.isPermisoOrdenConexion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConexionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TarjetaCreditoConexionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(NumeroRecapConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
		if(ConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTarjetaCreditoConexion=false;
		this.isTienePermisosTarjetaCreditoConexion=this.verificarGetPermisosUsuarioOpcionConexionClaseRelacionada(this.opcionsRelacionadas,TarjetaCreditoConexionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosNumeroRecap=false;
		this.isTienePermisosNumeroRecap=this.verificarGetPermisosUsuarioOpcionConexionClaseRelacionada(this.opcionsRelacionadas,NumeroRecapConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFormaPagoPuntoVenta=false;
		this.isTienePermisosFormaPagoPuntoVenta=this.verificarGetPermisosUsuarioOpcionConexionClaseRelacionada(this.opcionsRelacionadas,FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebConexion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConexionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTarjetaCreditoConexion=conPermiso;
		this.isTienePermisosNumeroRecap=conPermiso;
		this.isTienePermisosFormaPagoPuntoVenta=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioConexionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConexionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConexionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTarjetaCreditoConexion && this.jInternalFrameDetalleFormConexion!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.remove(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosNumeroRecap && this.jInternalFrameDetalleFormConexion!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.remove(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFormaPagoPuntoVenta && this.jInternalFrameDetalleFormConexion!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.remove(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioConexion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.conexionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConexionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConexion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConexion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConexion=this.isPermisoActualizarConexion;
			this.isPermisoEliminarConexion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConexion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConexion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConexion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConexion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConexion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConexion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConexion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConexion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConexion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConexion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConexion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConexion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConexion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.conexionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConexion.setToolTipText(this.jTableDatosConexion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConexion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConexion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConexion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTarjetaCreditoConexion && this.conexionConstantesFunciones.mostrarTarjetaCreditoConexionConexion && !ConexionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Tarjeta Credito Conexion");
			reporte.setsDescripcion("Tarjeta Credito Conexion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosNumeroRecap && this.conexionConstantesFunciones.mostrarNumeroRecapConexion && !ConexionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Numero Recap");
			reporte.setsDescripcion("Numero Recap");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFormaPagoPuntoVenta && this.conexionConstantesFunciones.mostrarFormaPagoPuntoVentaConexion && !ConexionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Forma Pago");
			reporte.setsDescripcion("Forma Pago");
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
	public void inicializarCombosForeignKeyConexionListas()throws Exception {
		try	{						
			
				this.tipoconexionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConexionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConexionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyConexionListas(false);
			} else {
			
				this.cargarCombosForeignKeyTipoConexionListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyTipoConexionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoconexionsForeignKey==null||this.tipoconexionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoConexionConstantesFunciones.getArrayColumnasGlobalesTipoConexion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoConexionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoConexionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoConexionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyConexionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ConexionParameterReturnGeneral conexionReturnGeneral=new ConexionParameterReturnGeneral();
						
			


				String finalQueryGlobalTipoConexion="";

				if(((this.tipoconexionsForeignKey==null||this.tipoconexionsForeignKey.size()<=0) && this.conexionConstantesFunciones.cargarid_tipo_conexionConexion)
					 || (this.esRecargarFks && this.conexionConstantesFunciones.cargarid_tipo_conexionConexion)) {

					if(!this.conexionSessionBean.getisBusquedaDesdeForeignKeySesionTipoConexion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoConexionConstantesFunciones.getArrayColumnasGlobalesTipoConexion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoConexion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoConexionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoConexion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoConexion, "");
						finalQueryGlobalTipoConexion+=TipoConexionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoConexionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoConexion=" WHERE " + ConstantesSql.ID + "="+conexionSessionBean.getlidTipoConexionActual();
					}
				} else {
					finalQueryGlobalTipoConexion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				conexionReturnGeneral=conexionLogic.cargarCombosLoteForeignKeyConexion(finalQueryGlobalTipoConexion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalTipoConexion.equals("NONE")) {
				this.tipoconexionsForeignKey=conexionReturnGeneral.gettipoconexionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyConexion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoConexion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoConexion()throws Exception {
		try {
			if(this.conexionSessionBean==null) {
				this.conexionSessionBean=new ConexionSessionBean();
			}

			if(!this.conexionSessionBean.getisBusquedaDesdeForeignKeySesionTipoConexion()) {
				TipoConexion tipoconexion=new TipoConexion();
				TipoConexionConstantesFunciones.setTipoConexionDescripcion(tipoconexion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoconexion.setId(null);

				if(!TipoConexionConstantesFunciones.ExisteEnLista(this.tipoconexionsForeignKey,tipoconexion,true)) {

					this.tipoconexionsForeignKey.add(0,tipoconexion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyConexion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConexion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConexion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConexion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConexion(Conexion conexion)throws Exception {	
		try {
			
			this.setActualTipoConexionForeignKey(conexion.getid_tipo_conexion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConexion(Conexion conexion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConexion()throws Exception {	
		try {
			
			this.setActualTipoConexionForeignKey(this.conexionConstantesFunciones.getid_tipo_conexion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConexion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConexion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConexion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConexion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConexion()throws Exception {
		try {
			

			this.cargarCombosFrameTipoConexionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConexion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoConexionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConexion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion!=null && this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.getItemCount()>0) {
				this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ConexionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConexionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConexionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.conexionSessionBean=new ConexionSessionBean(); 
		this.conexionConstantesFunciones=new ConexionConstantesFunciones(); 
		this.conexionBean=new Conexion();//(this.conexionConstantesFunciones); 		
		this.conexionReturnGeneral=new ConexionParameterReturnGeneral(); 
		
		this.conexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConexionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConexionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConexionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConexion(true);
			
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
			
			this.conexionConstantesFunciones=new ConexionConstantesFunciones(); 
			this.conexionBean=new Conexion();//this.conexionConstantesFunciones); 			
			this.conexionReturnGeneral=new ConexionParameterReturnGeneral(); 
		
			ConexionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conexion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.conexion=new Conexion();
			this.conexions = new ArrayList<Conexion>();
			this.conexionsAux = new ArrayList<Conexion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic=new ConexionLogic();
				this.conexionLogic.getNewConnexionToDeep("");
			}
			
			//this.conexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.conexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConexion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConexion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConexion);	
					}
					
					if(this.jInternalFrameImportacionConexion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConexion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConexion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConexion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConexion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConexion);
				this.jInternalFrameDetalleFormConexion.setVisible(false);
				this.jInternalFrameDetalleFormConexion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConexion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConexion);
					this.jInternalFrameReporteDinamicoConexion.setVisible(false);
					this.jInternalFrameReporteDinamicoConexion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConexion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConexion);
					this.jInternalFrameImportacionConexion.setVisible(false);
					this.jInternalFrameImportacionConexion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConexion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConexion);
					this.jInternalFrameOrderByConexion.setVisible(false);
					this.jInternalFrameOrderByConexion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConexionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConexionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.conexionReturnGeneral=new ConexionParameterReturnGeneral();
			
			this.conexionParameterGeneral=new ConexionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.conexionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.conexionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TarjetaCreditoConexionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(NumeroRecapConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConexionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conexionSessionBean.getEsGuardarRelacionado(),this.conexionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConexionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conexionSessionBean.getEsGuardarRelacionado(),this.conexionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConexion=false;
			this.isVisibilidadCeldaDuplicarConexion=true;
			this.isVisibilidadCeldaCopiarConexion=true;
			this.isVisibilidadCeldaVerFormConexion=true;
			this.isVisibilidadCeldaOrdenConexion=true;
			this.isVisibilidadCeldaNuevoRelacionesConexion=false;
			this.isVisibilidadCeldaModificarConexion=false;
			this.isVisibilidadCeldaActualizarConexion=false;
			this.isVisibilidadCeldaEliminarConexion=false;
			this.isVisibilidadCeldaCancelarConexion=false;
			this.isVisibilidadCeldaGuardarConexion=false;
			this.isVisibilidadCeldaGuardarCambiosConexion=false;
			
			
			this.isVisibilidadFK_IdTipoConexion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConexion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConexion(false);
			
			this.setPermisosUsuarioConexion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conexionSessionBean.getEsGuardarRelacionado() 
				|| (this.conexionSessionBean.getEsGuardarRelacionado() && this.conexionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConexionClasesRelacionadas();
			}
			
			if(this.conexionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConexionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConexionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConexion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConexion();
			}
			
			if(!this.isPermisoBusquedaConexion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConexion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conexionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioConexion,this.isPermisoPaginacionMedioConexion,this.isPermisoPaginacionTodoConexion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConexionConstantesFunciones.getTiposSeleccionarConexion());
				
				this.tiposColumnasSelect=ConexionConstantesFunciones.getTiposSeleccionarConexion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectConexion();				
				//this.tiposRelacionesSelect=ConexionConstantesFunciones.getTiposRelacionesConexion(true);
				
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
			//if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConexion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioConexion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioConexion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConexion() ;
			
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
			
			
			this.tarjetacreditoconexionLogic=new TarjetaCreditoConexionLogic();
			this.numerorecapLogic=new NumeroRecapLogic();
			this.formapagopuntoventaLogic=new FormaPagoPuntoVentaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.tipoconexionLogic=new TipoConexionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				conexionImplementable= (ConexionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConexionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				conexionImplementableHome= (ConexionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConexionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.conexions= new ArrayList<Conexion>();
			this.conexionsEliminados= new ArrayList<Conexion>();
						
			this.isEsNuevoConexion=false;
			this.esParaAccionDesdeFormularioConexion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipoconexionsForeignKey=new ArrayList<TipoConexion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConexion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConexion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConexionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConexionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConexion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConexion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConexion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConexion();
			}
			
			ConexionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConexion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConexion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConexion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConexion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Conexion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConexion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConexion")) {
				iIndex=this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConexion.getSelectedRow();	
				
				

				if(sTitle.equals("Forma Pagoes")) {
					if(!FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessConexion();

						this.cargarParteTabPanelRelacionadaFormaPagoPuntoVenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Numero Recapes")) {
					if(!NumeroRecapJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessConexion();

						this.cargarParteTabPanelRelacionadaNumeroRecap(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Tarjeta Credito Conexiones")) {
					if(!TarjetaCreditoConexionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessConexion();

						this.cargarParteTabPanelRelacionadaTarjetaCreditoConexion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConexion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormaPagoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormConexion.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(false,true,iIndex);
		this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();

		//this.jTabbedPaneRelacionesConexion.updateUI();
		//this.jTabbedPaneRelacionesConexion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesConexion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaNumeroRecap(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormConexion.cargarSessionConBeanSwingJInternalFrameNumeroRecap(false,true,iIndex);
		this.jButtonNumeroRecapActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaNumeroRecap();

		//this.jTabbedPaneRelacionesConexion.updateUI();
		//this.jTabbedPaneRelacionesConexion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesConexion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTarjetaCreditoConexion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormConexion.cargarSessionConBeanSwingJInternalFrameTarjetaCreditoConexion(false,true,iIndex);
		this.jButtonTarjetaCreditoConexionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTarjetaCreditoConexion();

		//this.jTabbedPaneRelacionesConexion.updateUI();
		//this.jTabbedPaneRelacionesConexion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesConexion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TarjetaCreditoConexion")) {
				int row=this.jTableDatosConexion.getSelectedRow();
				jButtonTarjetaCreditoConexionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("NumeroRecap")) {
				int row=this.jTableDatosConexion.getSelectedRow();
				jButtonNumeroRecapActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FormaPagoPuntoVenta")) {
				int row=this.jTableDatosConexion.getSelectedRow();
				jButtonFormaPagoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Tarjeta Credito Conexion")) {

					if(this.isTienePermisosTarjetaCreditoConexion && this.conexionConstantesFunciones.mostrarTarjetaCreditoConexionConexion && !ConexionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Tarjeta Credito Conexiones"+"("+TarjetaCreditoConexionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Tarjeta Credito Conexiones");

						if(conexionConstantesFunciones.resaltarTarjetaCreditoConexionConexion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(conexionConstantesFunciones.resaltarTarjetaCreditoConexionConexion);
						}

						jmenuItem.setEnabled(this.conexionConstantesFunciones.activarTarjetaCreditoConexionConexion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TarjetaCreditoConexion"));

						

						this.jInternalFrameDetalleFormConexion.jmenuDetalleConexion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Numero Recap")) {

					if(this.isTienePermisosNumeroRecap && this.conexionConstantesFunciones.mostrarNumeroRecapConexion && !ConexionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Numero Recapes"+"("+NumeroRecapConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Numero Recapes");

						if(conexionConstantesFunciones.resaltarNumeroRecapConexion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(conexionConstantesFunciones.resaltarNumeroRecapConexion);
						}

						jmenuItem.setEnabled(this.conexionConstantesFunciones.activarNumeroRecapConexion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"NumeroRecap"));

						

						this.jInternalFrameDetalleFormConexion.jmenuDetalleConexion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Forma Pago")) {

					if(this.isTienePermisosFormaPagoPuntoVenta && this.conexionConstantesFunciones.mostrarFormaPagoPuntoVentaConexion && !ConexionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Forma Pagoes"+"("+FormaPagoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Forma Pagoes");

						if(conexionConstantesFunciones.resaltarFormaPagoPuntoVentaConexion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(conexionConstantesFunciones.resaltarFormaPagoPuntoVentaConexion);
						}

						jmenuItem.setEnabled(this.conexionConstantesFunciones.activarFormaPagoPuntoVentaConexion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormaPagoPuntoVenta"));

						

						this.jInternalFrameDetalleFormConexion.jmenuDetalleConexion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyConexion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConexion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConexion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConexionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConexion();
		
		this.cargarCombosFrameForeignKeyConexion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConexion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConexion();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoConexion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoConexionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoConexion();
				this.cargarCombosFrameTipoConexionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoConexion(this.tipoconexionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoConexionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.conexionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
			
			if(jTableDatosConexion.getRowCount()>=1) {
				jTableDatosConexion.removeRowSelectionInterval(0, jTableDatosConexion.getRowCount()-1);						
			}
			
			this.isEsNuevoConexion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConexion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConexion(true);			
			//this.conexion=new Conexion();
			//this.conexion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConexion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConexion() ;
			
			if(ConexionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConexion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.conexion);	
			this.actualizarInformacion("INFO_PADRE",false,this.conexion);				
			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
			if(this.conexionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Conexion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConexionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConexion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConexion.getSelectedRows().length;			
			}
			
			conexionsSeleccionados=this.getConexionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConexion--;			
				//Conexion conexionAux= new Conexion();			
				//conexionAux.setId(this.iIdNuevoConexion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Conexion conexionOrigen=new Conexion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Conexion conexionOrigen : conexionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConexion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							conexionOrigen =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conexionOrigen =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConexion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.conexion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConexion(conexionOrigen,this.conexion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conexionLogic.getConexions().add(this.conexionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conexions.add(this.conexionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConexion(false);
				
				this.jTableDatosConexion.setRowSelectionInterval(this.getIndiceNuevoConexion(), this.getIndiceNuevoConexion());
				
				int iLastRow =  this.jTableDatosConexion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConexion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConexion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConexion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();									
		
			Conexion conexionOrigen=new Conexion();
			Conexion conexionDestino=new Conexion();
				
			conexionsSeleccionados=this.getConexionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConexion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || conexionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConexion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conexionOrigen =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conexionOrigen =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conexionDestino =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conexionDestino =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				conexionOrigen =conexionsSeleccionados.get(0);
				conexionDestino =conexionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConexion(conexionOrigen,conexionDestino,true,false);
				
				conexionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(conexionDestino,conexionLogic.getConexions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conexionDestino,conexions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConexion(false);
				
				//this.jTableDatosConexion.setRowSelectionInterval(this.getIndiceNuevoConexion(), this.getIndiceNuevoConexion());
				
				int iLastRow =  this.jTableDatosConexion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConexion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConexion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConexion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConexion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConexion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConexion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConexion.setVisible(!isVisible);
			this.jPanelPaginacionConexion.setVisible(!isVisible);
			this.jPanelAccionesConexion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConexion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConexion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConexion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConexion();
			
			this.abrirFrameOrderByConexion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConexion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConexion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConexion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConexion.isMaximum()) {
					this.jInternalFrameDetalleFormConexion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConexion.setSize(this.jInternalFrameDetalleFormConexion.iWidthFormulario,this.jInternalFrameDetalleFormConexion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConexion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConexion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConexion.isMaximum()) {
						this.jInternalFrameDetalleFormConexion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConexion.jContentPaneDetalleConexion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConexion.jContentPaneDetalleConexion.getWidth(),ConexionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConexion.jContentPaneDetalleConexion.getWidth(),ConexionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConexion.jContentPaneDetalleConexion.getWidth(),ConexionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();
					}

					if(NumeroRecapJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaNumeroRecap();
					}

					if(TarjetaCreditoConexionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTarjetaCreditoConexion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConexion.setVisible(true);
	        this.jInternalFrameDetalleFormConexion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConexion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConexion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConexion,false,this);
				} else {
					this.jInternalFrameOrderByConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConexion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConexion);
				this.jInternalFrameOrderByConexion.setVisible(false);
				this.jInternalFrameOrderByConexion.setSelected(false);
				
				this.jInternalFrameOrderByConexion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConexion"));
				
				this.inicializarActualizarBindingTablaOrderByConexion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConexion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConexion==null) {
				
				this.jInternalFrameImportacionConexion=new ImportacionJInternalFrame(ConexionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConexion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConexion);
				this.jInternalFrameImportacionConexion.setVisible(false);
				this.jInternalFrameImportacionConexion.setSelected(false);


				this.jInternalFrameImportacionConexion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConexion"));
				this.jInternalFrameImportacionConexion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConexion"));
				this.jInternalFrameImportacionConexion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConexion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConexion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConexion==null) {
				this.jInternalFrameReporteDinamicoConexion=new ReporteDinamicoJInternalFrame(ConexionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConexion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConexion);
				this.jInternalFrameReporteDinamicoConexion.setVisible(false);
				this.jInternalFrameReporteDinamicoConexion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConexion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConexion"));
				this.jInternalFrameReporteDinamicoConexion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConexion"));
				this.jInternalFrameReporteDinamicoConexion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConexion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConexion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormConexion.jContentPaneDetalleConexion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaNumeroRecap() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.jScrollPanelDatosNumeroRecap.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormConexion.jContentPaneDetalleConexion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.jScrollPanelDatosNumeroRecap.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.jScrollPanelDatosNumeroRecap.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.jScrollPanelDatosNumeroRecap.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTarjetaCreditoConexion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCreditoConexion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormConexion.jContentPaneDetalleConexion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCreditoConexion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCreditoConexion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCreditoConexion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleConexion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConexion);
			
	       	this.jInternalFrameDetalleFormConexion.setVisible(false);
	        this.jInternalFrameDetalleFormConexion.setSelected(false);
			
			//this.jInternalFrameDetalleFormConexion.dispose();
			//this.jInternalFrameDetalleFormConexion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConexion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConexion.setVisible(true);
	        this.jInternalFrameReporteDinamicoConexion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConexion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConexion.setVisible(true);
	        this.jInternalFrameImportacionConexion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConexion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConexion.setVisible(true);
	        this.jInternalFrameOrderByConexion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConexion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConexion.setVisible(false);
	        this.jInternalFrameOrderByConexion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConexion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConexion.setVisible(false);
	        this.jInternalFrameReporteDinamicoConexion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConexion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConexion.setVisible(false);
	        this.jInternalFrameImportacionConexion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConexion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConexion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConexion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConexion(true);
			//this.isEsNuevoConexion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConexion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConexion(false) ;
			
			if(conexionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado() && TarjetaCreditoConexionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTarjetaCreditoConexionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapSessionBean.getEsGuardarRelacionado() && NumeroRecapJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNumeroRecapActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ConexionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConexion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConexion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConexionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConexion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConexion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConexion(true);
			//this.isEsNuevoConexion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.conexion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConexion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConexion(false) ;
			
			if(ConexionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConexion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConexion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoConexion(List<TipoConexion> tipoconexionsForeignKey)throws Exception{
		TableColumn tableColumnTipoConexion=this.jTableDatosConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConexion,ConexionConstantesFunciones.LABEL_IDTIPOCONEXION));
		TableCellEditor tableCellEditorTipoConexion =tableColumnTipoConexion.getCellEditor();

		TipoConexionTableCell tipoconexionTableCellFk=(TipoConexionTableCell)tableCellEditorTipoConexion;

		if(tipoconexionTableCellFk!=null) {
			tipoconexionTableCellFk.settipoconexionsForeignKey(tipoconexionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConexion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoconexionTableCellFk.setRowActual(intSelectedRow);
			//tipoconexionTableCellFk.settipoconexionsForeignKeyActual(tipoconexionsForeignKey);
		//}


		if(tipoconexionTableCellFk!=null) {
			tipoconexionTableCellFk.RecargarTipoConexionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarConexionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConexion(false);
			
			//if(!this.isEsNuevoConexion) {								
				int intSelectedRow = this.jTableDatosConexion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConexion(this.conexion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
				
			}
			
			if(this.permiteMantenimiento(this.conexion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.conexionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConexion=true;
					this.inicializarActualizarBindingTablaConexion(false);
					this.isEsNuevoConexion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConexion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConexion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConexion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConexion(false);
				
				this.habilitarDeshabilitarControlesConexion(false);
			
												
				
				if(ConexionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConexion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConexionActionPerformed(evt,conexionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConexion(this.conexion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConexion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,conexionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.conexion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConexionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConexion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				this.conexion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				this.conexion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.conexion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.conexionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConexionModel) this.jTableDatosConexion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConexion=true;
				this.inicializarActualizarBindingTablaConexion(false);
				this.isEsNuevoConexion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConexion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConexion(false);
				
				this.habilitarDeshabilitarControlesConexion(false);
				
				
				
				if(ConexionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConexion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConexionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConexion.getRowCount()>=1) {
				jTableDatosConexion.removeRowSelectionInterval(0, jTableDatosConexion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConexion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConexion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConexion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConexion(false) ;
			
			this.isEsNuevoConexion=false;
			
			if(ConexionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConexion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConexion(false);
				
				//SI ES MANUAL
				if(ConexionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConexion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConexion--;			
			//Conexion conexionAux= new Conexion();			
			//conexionAux.setId(this.iIdNuevoConexion);
			
			if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConexion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
			
			this.conexion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.conexionLogic.getConexions().add(this.conexionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.conexions.add(this.conexionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConexion(false);
			
			this.jTableDatosConexion.setRowSelectionInterval(this.getIndiceNuevoConexion(), this.getIndiceNuevoConexion());
			
			int iLastRow =  this.jTableDatosConexion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConexion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConexion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConexion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConexion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConexion(false);
			
			//SI ES MANUAL
			if(ConexionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConexion();
			}
			
			//this.abrirFrameTreeConexion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConexionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ConexionES ?", "MANTENIMIENTO DE Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionConexion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralConexion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.conexionReturnGeneral=conexionLogic.procesarImportacionConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.conexionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarConexionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConexionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConexion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConexion.setFileImportacion(this.jInternalFrameImportacionConexion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConexion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConexion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConexion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConexion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();		

		conexionsSeleccionados=this.getConexionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConexion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConexion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConexionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConexionBaseDesign.jrxml";
			
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
			
			this.generarReporteConexions("Todos",conexionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConexion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConexion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConexionConstantesFunciones.LABEL_IDTIPOCONEXION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoConexion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoConexion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoConexion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoConexion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConexionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConexionConstantesFunciones.LABEL_NOMBREMAQUINA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreMaquina_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreMaquina_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreMaquina_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreMaquina_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoConexion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConexion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConexion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConexionConstantesFunciones.LABEL_IDTIPOCONEXION:
					sNombreCampoCategoria="id_tipo_conexion";
					break;

				case ConexionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ConexionConstantesFunciones.LABEL_NOMBREMAQUINA:
					sNombreCampoCategoria="nombre_maquina";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConexion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConexionConstantesFunciones.LABEL_IDTIPOCONEXION:
					sNombreCampoCategoriaValor="id_tipo_conexion";
					break;

				case ConexionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ConexionConstantesFunciones.LABEL_NOMBREMAQUINA:
					sNombreCampoCategoriaValor="nombre_maquina";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConexion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConexion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConexionConstantesFunciones.LABEL_IDTIPOCONEXION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Conexion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_conexion");
					break;

				case ConexionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ConexionConstantesFunciones.LABEL_NOMBREMAQUINA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Maquina",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_maquina");
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
	
	public void jButtonGenerarExcelReporteDinamicoConexionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();		
		
		conexionsSeleccionados=this.getConexionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conexion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Conexions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConexion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConexion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConexionConstantesFunciones.LABEL_IDTIPOCONEXION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConexionConstantesFunciones.LABEL_IDTIPOCONEXION);
					iRow++;

					for(Conexion conexion:conexionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conexion.gettipoconexion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConexionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConexionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Conexion conexion:conexionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conexion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConexionConstantesFunciones.LABEL_NOMBREMAQUINA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConexionConstantesFunciones.LABEL_NOMBREMAQUINA);
					iRow++;

					for(Conexion conexion:conexionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conexion.getnombre_maquina());
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
			//	this.getFilaCabeceraExportarExcelConexion(row);				
			//	iRow++;
			//}				
			
			//for(Conexion conexionAux:conexionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConexion(conexionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conexion",JOptionPane.INFORMATION_MESSAGE);
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
				this.conexionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConexion(false);
			
			//SI ES MANUAL
			if(ConexionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConexion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConexion(false);
			
			//SI ES MANUAL
			if(ConexionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConexion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConexion(false);
			
			//SI ES MANUAL
			if(ConexionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConexion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConexion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConexion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConexion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConexion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConexion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConexion.setMinimumSize(dimensionMinimum);
		this.jTableDatosConexion.setMaximumSize(dimensionMaximum);
		this.jTableDatosConexion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConexion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConexion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConexion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConexion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConexion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConexion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConexion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConexion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConexionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConexionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConexion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConexion();
		
		this.inicializarActualizarBindingBotonesManualConexion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConexion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConexion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConexion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConexion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConexion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConexion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConexion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConexion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConexion.jCheckBoxPostAccionNuevoConexion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConexion.jCheckBoxPostAccionSinCerrarConexion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConexion.jCheckBoxPostAccionSinMensajeConexion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConexion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConexion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConexion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConexion!=null) {
				this.jInternalFrameDetalleFormConexion.jCheckBoxPostAccionNuevoConexion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConexion.jCheckBoxPostAccionSinCerrarConexion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConexion.jCheckBoxPostAccionSinMensajeConexion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConexion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConexion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConexion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConexion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConexion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConexion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConexion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConexion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConexion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConexion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConexion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConexion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConexion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConexion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConexion(Boolean esInicializar) throws Exception {
		try	{	
			if(ConexionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConexion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConexion() throws Exception {
		try	{
			if(ConexionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConexion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConexion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConexion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConexion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConexion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConexion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConexion.addItem(reporte);
			}
			
			
			if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConexion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConexion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConexion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConexion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConexion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConexion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConexion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConexion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConexion!=null) {
				this.jInternalFrameReporteDinamicoConexion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConexion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConexion!=null) {
				this.jInternalFrameReporteDinamicoConexion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConexion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConexion!=null) {
				
				if(this.jInternalFrameReporteDinamicoConexion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConexion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConexion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConexion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConexion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConexion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConexion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.getSelectedItem()!=null){this.id_tipo_conexionFK_IdTipoConexion=((TipoConexion)this.jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConexion(Boolean esInicializar) throws Exception {				
		if(ConexionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConexion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConexion() throws Exception {
		this.inicializarActualizarBindingTablaConexion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConexion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConexion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConexion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConexion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConexionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConexion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConexion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConexionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConexionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConexionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConexionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConexion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConexion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConexionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConexion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConexion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=conexionLogic.getConexions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=conexions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConexion.setModel(new ConexionModel(this.conexionLogic.getConexions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConexion.setModel(new ConexionModel(this.conexions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConexion!=null && this.jInternalFrameOrderByConexion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConexion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConexion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConexionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConexionConstantesFunciones.SCLASSWEBTITULO,conexionConstantesFunciones.resaltarSeleccionarConexion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConexionConstantesFunciones.SCLASSWEBTITULO,conexionConstantesFunciones.resaltarSeleccionarConexion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConexion,ConexionConstantesFunciones.LABEL_ID));

		if(this.conexionConstantesFunciones.mostraridConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConexionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conexionConstantesFunciones.resaltaridConexion,this.conexionConstantesFunciones.activaridConexion,this,true,"idConexion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conexionConstantesFunciones.resaltaridConexion,this.conexionConstantesFunciones.activaridConexion,this,true,"idConexion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConexion,ConexionConstantesFunciones.LABEL_IDTIPOCONEXION));

		if(this.conexionConstantesFunciones.mostrarid_tipo_conexionConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConexionConstantesFunciones.LABEL_IDTIPOCONEXION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoConexionTableCell(this.tipoconexionsForeignKey,this.conexionConstantesFunciones.resaltarid_tipo_conexionConexion,this,this.conexionConstantesFunciones.activarid_tipo_conexionConexion));
			tableColumn.setCellEditor(new TipoConexionTableCell(this.tipoconexionsForeignKey,this.conexionConstantesFunciones.resaltarid_tipo_conexionConexion,this,this.conexionConstantesFunciones.activarid_tipo_conexionConexion,true,"id_tipo_conexionConexion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConexionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConexion,ConexionConstantesFunciones.LABEL_NOMBRE));

		if(this.conexionConstantesFunciones.mostrarnombreConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConexionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conexionConstantesFunciones.resaltarnombreConexion,this.conexionConstantesFunciones.activarnombreConexion,this,true,"nombreConexion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conexionConstantesFunciones.resaltarnombreConexion,this.conexionConstantesFunciones.activarnombreConexion,this,true,"nombreConexion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConexionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConexion,ConexionConstantesFunciones.LABEL_NOMBREMAQUINA));

		if(this.conexionConstantesFunciones.mostrarnombre_maquinaConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConexionConstantesFunciones.LABEL_NOMBREMAQUINA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conexionConstantesFunciones.resaltarnombre_maquinaConexion,this.conexionConstantesFunciones.activarnombre_maquinaConexion,this,true,"nombre_maquinaConexion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conexionConstantesFunciones.resaltarnombre_maquinaConexion,this.conexionConstantesFunciones.activarnombre_maquinaConexion,this,true,"nombre_maquinaConexion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConexionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.conexionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTarjetaCreditoConexion && this.conexionConstantesFunciones.mostrarTarjetaCreditoConexionConexion && !ConexionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Tarjeta Credito Conexiones");
				tableColumn.setHeaderValue("Tarjeta Credito Conexiones");
				tableColumn.setCellRenderer(new TarjetaCreditoConexionTableCell(conexionConstantesFunciones.resaltarTarjetaCreditoConexionConexion,this,this.conexionConstantesFunciones.activarTarjetaCreditoConexionConexion));
				tableColumn.setCellEditor(new TarjetaCreditoConexionTableCell(conexionConstantesFunciones.resaltarTarjetaCreditoConexionConexion,this,this.conexionConstantesFunciones.activarTarjetaCreditoConexionConexion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosConexion.addColumn(tableColumn);
			}

			if(this.isTienePermisosNumeroRecap && this.conexionConstantesFunciones.mostrarNumeroRecapConexion && !ConexionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Numero Recapes");
				tableColumn.setHeaderValue("Numero Recapes");
				tableColumn.setCellRenderer(new NumeroRecapTableCell(conexionConstantesFunciones.resaltarNumeroRecapConexion,this,this.conexionConstantesFunciones.activarNumeroRecapConexion));
				tableColumn.setCellEditor(new NumeroRecapTableCell(conexionConstantesFunciones.resaltarNumeroRecapConexion,this,this.conexionConstantesFunciones.activarNumeroRecapConexion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosConexion.addColumn(tableColumn);
			}

			if(this.isTienePermisosFormaPagoPuntoVenta && this.conexionConstantesFunciones.mostrarFormaPagoPuntoVentaConexion && !ConexionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Forma Pagoes");
				tableColumn.setHeaderValue("Forma Pagoes");
				tableColumn.setCellRenderer(new FormaPagoPuntoVentaTableCell(conexionConstantesFunciones.resaltarFormaPagoPuntoVentaConexion,this,this.conexionConstantesFunciones.activarFormaPagoPuntoVentaConexion));
				tableColumn.setCellEditor(new FormaPagoPuntoVentaTableCell(conexionConstantesFunciones.resaltarFormaPagoPuntoVentaConexion,this,this.conexionConstantesFunciones.activarFormaPagoPuntoVentaConexion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosConexion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conexionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conexionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConexion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conexionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conexionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConexion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConexion && this.isPermisoGuardarCambiosConexion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.conexionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.conexionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConexion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.conexionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosConexion.addColumn(tableColumn);
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
			
			this.jTableDatosConexion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConexion && this.isPermisoGuardarCambiosConexion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.conexionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConexion && this.isPermisoGuardarCambiosConexion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConexion.moveColumn(this.jTableDatosConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConexion.moveColumn(this.jTableDatosConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.conexionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosConexion.moveColumn(this.jTableDatosConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConexion.moveColumn(this.jTableDatosConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConexion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConexion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConexion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConexion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConexion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConexion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConexion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConexion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=conexionLogic.getConexions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=conexions.size()-1;
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
		//this.jTableDatosConexion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConexion();
			
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
				
				//this.isEsNuevoConexion=false;
					
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
				if(this.conexionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConexion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConexion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConexion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.conexion.getsType().equals("DUPLICADO")
				   || this.conexion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConexion=true;
				
				} else {
					this.isEsNuevoConexion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
					if(this.conexion.getId()>=0 && !this.conexion.getIsNew()) {						
						this.isEsNuevoConexion=false;
						
					} else {
						this.isEsNuevoConexion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConexion(esRelaciones);						
				
				this.seleccionarConexion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.conexion.getId()<0) {
					this.isEsNuevoConexion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConexion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConexion(evt,rowIndex);
				}	
				
				if(this.conexionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Conexion: " + this.dDif); 
					}
				}								
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConexion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.conexion)) {
					if(this.conexion.getId()>0) {
						this.conexion.setIsDeleted(true);
						
						this.conexionsEliminados.add(this.conexion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conexionLogic.getConexions().remove(this.conexion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conexions.remove(this.conexion);				
					}
					
					
					((ConexionModel) this.jTableDatosConexion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConexion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConexion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConexion) {
			
			if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConexion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConexion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConexion(this.conexion);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoConexion
					if(!this.conexionConstantesFunciones.cargarid_tipo_conexionConexion || this.conexionConstantesFunciones.event_dependid_tipo_conexionConexion) {
						//this.cargarCombosTipoConexionsForeignKeyLista(" where id="+this.conexion.getid_tipo_conexion());
									//this.inicializarActualizarBindingConexion(false,false);
						this.tipoconexionsForeignKey=new ArrayList<TipoConexion>();

						if(conexion.getTipoConexion()!=null) {
							this.tipoconexionsForeignKey.add(conexion.getTipoConexion());
						}

						this.addItemDefectoCombosForeignKeyTipoConexion();
						this.cargarCombosFrameTipoConexionsForeignKey("Todos");
					}
					this.setActualTipoConexionForeignKey(this.conexion.getid_tipo_conexion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConexion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConexion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConexion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConexion(Conexion conexion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConexion(conexion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConexion(Conexion conexion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConexion(conexion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConexion(conexion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConexion(conexion);
	}
	
	public void setVariablesObjetoActualToFormularioConexion(Conexion conexion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConexion.jLabelidConexion.setText(conexion.getId().toString());
			this.jInternalFrameDetalleFormConexion.jTextAreanombreConexion.setText(conexion.getnombre());
			this.jInternalFrameDetalleFormConexion.jTextAreanombre_maquinaConexion.setText(conexion.getnombre_maquina());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Conexion conexionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,conexionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Conexion conexionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				conexionLocal=this.conexion;
			} else {
				conexionLocal=this.conexionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(conexionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConexion(conexionLocal,true);
					
					if(conexionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(conexionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.conexionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(conexionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConexion(Conexion conexion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConexion(conexion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConexion(conexion);
	}
	
	public void setVariablesFormularioToObjetoActualConexion(Conexion conexion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConexion(conexion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConexion(Conexion conexion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConexion.jLabelidConexion.getText()==null || this.jInternalFrameDetalleFormConexion.jLabelidConexion.getText()=="" || this.jInternalFrameDetalleFormConexion.jLabelidConexion.getText()=="Id") {
				this.jInternalFrameDetalleFormConexion.jLabelidConexion.setText("0");
			}

			if(conColumnasBase) {conexion.setId(Long.parseLong(this.jInternalFrameDetalleFormConexion.jLabelidConexion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConexionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConexion.jLabelIdConexion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conexion.setnombre(this.jInternalFrameDetalleFormConexion.jTextAreanombreConexion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConexionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConexion.jLabelnombreConexion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conexion.setnombre_maquina(this.jInternalFrameDetalleFormConexion.jTextAreanombre_maquinaConexion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConexionConstantesFunciones.LABEL_NOMBREMAQUINA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConexion.jLabelnombre_maquinaConexion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConexion(Conexion conexionBean,Conexion conexion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && conexionBean.getid_tipo_conexion()!=null && !conexionBean.getid_tipo_conexion().equals(-1L))) {conexion.setid_tipo_conexion(conexionBean.getid_tipo_conexion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConexion(Conexion conexionOrigen,Conexion conexion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conexionOrigen.getId()!=null && !conexionOrigen.getId().equals(0L))) {conexion.setId(conexionOrigen.getId());}}
			if(conDefault || (!conDefault && conexionOrigen.getid_tipo_conexion()!=null && !conexionOrigen.getid_tipo_conexion().equals(-1L))) {conexion.setid_tipo_conexion(conexionOrigen.getid_tipo_conexion());}
			if(conDefault || (!conDefault && conexionOrigen.getnombre()!=null && !conexionOrigen.getnombre().equals(""))) {conexion.setnombre(conexionOrigen.getnombre());}
			if(conDefault || (!conDefault && conexionOrigen.getnombre_maquina()!=null && !conexionOrigen.getnombre_maquina().equals(""))) {conexion.setnombre_maquina(conexionOrigen.getnombre_maquina());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConexion(Conexion conexion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConexion.jLabelidConexion.setText(conexion.getId().toString());
			this.jInternalFrameDetalleFormConexion.jTextAreanombreConexion.setText(conexion.getnombre());
			this.jInternalFrameDetalleFormConexion.jTextAreanombre_maquinaConexion.setText(conexion.getnombre_maquina());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConexion(ConexionBean conexionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConexion.jLabelidConexion.setText(conexionBean.getId().toString());
			this.jInternalFrameDetalleFormConexion.jTextAreanombreConexion.setText(conexionBean.getnombre());
			this.jInternalFrameDetalleFormConexion.jTextAreanombre_maquinaConexion.setText(conexionBean.getnombre_maquina());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConexion(ConexionParameterReturnGeneral conexionReturnGeneral,ConexionBean conexionBean,Boolean conDefault) throws Exception { 
		try {
			Conexion conexionLocal=new Conexion();
			
			conexionLocal=conexionReturnGeneral.getConexion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conexionLocal.getId()!=null && !conexionLocal.getId().equals(0L))) {conexionBean.setId(conexionLocal.getId());}}
			if(conDefault || (!conDefault && conexionLocal.getid_tipo_conexion()!=null && !conexionLocal.getid_tipo_conexion().equals(-1L))) {conexionBean.setid_tipo_conexion(conexionLocal.getid_tipo_conexion());}
			if(conDefault || (!conDefault && conexionLocal.getnombre()!=null && !conexionLocal.getnombre().equals(""))) {conexionBean.setnombre(conexionLocal.getnombre());}
			if(conDefault || (!conDefault && conexionLocal.getnombre_maquina()!=null && !conexionLocal.getnombre_maquina().equals(""))) {conexionBean.setnombre_maquina(conexionLocal.getnombre_maquina());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConexionGenerico(Long idConexionSeleccionado,JComboBox jComboBoxConexion,List<Conexion> conexionsLocal)throws Exception {
		try {
			Conexion  conexionTemp=null;

			for(Conexion conexionAux:conexionsLocal) {
				if(conexionAux.getId()!=null && conexionAux.getId().equals(idConexionSeleccionado)) {
					conexionTemp=conexionAux;
					break;
				}
			}

			jComboBoxConexion.setSelectedItem(conexionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConexionGenerico(JComboBox jComboBoxConexion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConexion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConexion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConexion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConexion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("TarjetaCreditoConexion")) {
			jButtonTarjetaCreditoConexionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("NumeroRecap")) {
			jButtonNumeroRecapActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FormaPagoPuntoVenta")) {
			jButtonFormaPagoPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conexion=(Conexion) conexionLogic.getConexions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conexion =(Conexion) conexions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoConexion")) {
			//sDescripcion=this.getActualTipoConexionForeignKeyDescripcion((Long)value);
			if(!conexion.getIsNew() && !conexion.getIsChanged() && !conexion.getIsDeleted()) {
				sDescripcion=conexion.gettipoconexion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoConexionForeignKeyDescripcion((Long)value);
				sDescripcion=conexion.gettipoconexion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Conexion conexionRow=new Conexion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conexionRow=(Conexion) conexionLogic.getConexions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conexionRow=(Conexion) conexions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTarjetaCreditoConexionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Conexion conexion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormConexion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conexion = (Conexion)this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.conexion = (Conexion)this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(conexion!=null) {
						this.conexion = conexion;
					} else {
						this.conexion = new Conexion();
					}
				}

				if(this.isTienePermisosTarjetaCreditoConexion && this.permiteMantenimiento(this.conexion)) {
					TarjetaCreditoConexionBeanSwingJInternalFrame tarjetacreditoconexionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFramePopup=new TarjetaCreditoConexionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tarjetacreditoconexionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFramePopup;
					} else {
						tarjetacreditoconexionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame;
					}

					List<Conexion> conexions=new ArrayList<Conexion>();
					conexions.add(this.conexion);
					if(!esRelacionado) {
						//tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.setConGuardarRelaciones(false);
						//tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tarjetacreditoconexionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormConexion.cargarTarjetaCreditoConexionBeanSwingJInternalFrame(conexions,this.conexion,tarjetacreditoconexionBeanSwingJInternalFrame,/*conInicializar,*/tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.getConGuardarRelaciones(),tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
					tarjetacreditoconexionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tarjetacreditoconexionBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCreditoConexion("no_relacionado");

						tarjetacreditoconexionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TarjetaCreditoConexionConstantesFunciones.ITAMANIOFILATABLA + (TarjetaCreditoConexionConstantesFunciones.ITAMANIOFILATABLA/2));

						tarjetacreditoconexionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderConexion=(TitledBorder)this.jScrollPanelDatosConexion.getBorder();
						TitledBorder titledBorderTarjetaCreditoConexion=(TitledBorder)tarjetacreditoconexionBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCreditoConexion.getBorder();

						titledBorderTarjetaCreditoConexion.setTitle(titledBorderConexion.getTitle() + " -> Tarjeta Credito Conexion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tarjetacreditoconexionBeanSwingJInternalFrame);
						}

						tarjetacreditoconexionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tarjetacreditoconexionBeanSwingJInternalFrame);

						tarjetacreditoconexionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.conexionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Tarjeta Credito Conexion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonNumeroRecapActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Conexion conexion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormConexion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conexion = (Conexion)this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.conexion = (Conexion)this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(conexion!=null) {
						this.conexion = conexion;
					} else {
						this.conexion = new Conexion();
					}
				}

				if(this.isTienePermisosNumeroRecap && this.permiteMantenimiento(this.conexion)) {
					NumeroRecapBeanSwingJInternalFrame numerorecapBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFramePopup=new NumeroRecapBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						numerorecapBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFramePopup;
					} else {
						numerorecapBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame;
					}

					List<Conexion> conexions=new ArrayList<Conexion>();
					conexions.add(this.conexion);
					if(!esRelacionado) {
						//numerorecapBeanSwingJInternalFrame.numerorecapSessionBean.setConGuardarRelaciones(false);
						//numerorecapBeanSwingJInternalFrame.numerorecapSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					numerorecapBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormConexion.cargarNumeroRecapBeanSwingJInternalFrame(conexions,this.conexion,numerorecapBeanSwingJInternalFrame,/*conInicializar,*/numerorecapBeanSwingJInternalFrame.numerorecapSessionBean.getConGuardarRelaciones(),numerorecapBeanSwingJInternalFrame.numerorecapSessionBean.getEsGuardarRelacionado());
					numerorecapBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						numerorecapBeanSwingJInternalFrame.actualizarEstadoPanelsNumeroRecap("no_relacionado");

						numerorecapBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(NumeroRecapConstantesFunciones.ITAMANIOFILATABLA + (NumeroRecapConstantesFunciones.ITAMANIOFILATABLA/2));

						numerorecapBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderConexion=(TitledBorder)this.jScrollPanelDatosConexion.getBorder();
						TitledBorder titledBorderNumeroRecap=(TitledBorder)numerorecapBeanSwingJInternalFrame.jScrollPanelDatosNumeroRecap.getBorder();

						titledBorderNumeroRecap.setTitle(titledBorderConexion.getTitle() + " -> Numero Recap");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,numerorecapBeanSwingJInternalFrame);
						}

						numerorecapBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(numerorecapBeanSwingJInternalFrame);

						numerorecapBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.conexionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Numero Recap",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFormaPagoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Conexion conexion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormConexion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conexion = (Conexion)this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.conexion = (Conexion)this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(conexion!=null) {
						this.conexion = conexion;
					} else {
						this.conexion = new Conexion();
					}
				}

				if(this.isTienePermisosFormaPagoPuntoVenta && this.permiteMantenimiento(this.conexion)) {
					FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFramePopup;
					} else {
						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame;
					}

					List<Conexion> conexions=new ArrayList<Conexion>();
					conexions.add(this.conexion);
					if(!esRelacionado) {
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormConexion.cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(conexions,this.conexion,formapagopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getConGuardarRelaciones(),formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");

						formapagopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						formapagopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderConexion=(TitledBorder)this.jScrollPanelDatosConexion.getBorder();
						TitledBorder titledBorderFormaPagoPuntoVenta=(TitledBorder)formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getBorder();

						titledBorderFormaPagoPuntoVenta.setTitle(titledBorderConexion.getTitle() + " -> Forma Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formapagopuntoventaBeanSwingJInternalFrame);
						}

						formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formapagopuntoventaBeanSwingJInternalFrame);

						formapagopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.conexionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Forma Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConexion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConexion.setVisible((this.isVisibilidadCeldaNuevoConexion && this.isPermisoNuevoConexion));			
			this.jButtonDuplicarConexion.setVisible((this.isVisibilidadCeldaDuplicarConexion && this.isPermisoDuplicarConexion));			
			this.jButtonCopiarConexion.setVisible((this.isVisibilidadCeldaCopiarConexion && this.isPermisoCopiarConexion));
			this.jButtonVerFormConexion.setVisible((this.isVisibilidadCeldaVerFormConexion && this.isPermisoVerFormConexion));
			
			this.jButtonAbrirOrderByConexion.setVisible((this.isVisibilidadCeldaOrdenConexion && this.isPermisoOrdenConexion));			
			
			this.jButtonNuevoRelacionesConexion.setVisible((this.isVisibilidadCeldaNuevoRelacionesConexion && this.isPermisoNuevoConexion));			
			this.jButtonNuevoGuardarCambiosConexion.setVisible((this.isVisibilidadCeldaNuevoConexion && this.isPermisoNuevoConexion && this.isPermisoGuardarCambiosConexion));
			
			if(this.jInternalFrameDetalleFormConexion!=null) {
			this.jInternalFrameDetalleFormConexion.jButtonModificarConexion.setVisible((this.isVisibilidadCeldaModificarConexion && this.isPermisoActualizarConexion));	
			this.jInternalFrameDetalleFormConexion.jButtonActualizarConexion.setVisible((this.isVisibilidadCeldaActualizarConexion && this.isPermisoActualizarConexion));	
			this.jInternalFrameDetalleFormConexion.jButtonEliminarConexion.setVisible((this.isVisibilidadCeldaEliminarConexion && this.isPermisoEliminarConexion));
			this.jInternalFrameDetalleFormConexion.jButtonCancelarConexion.setVisible(this.isVisibilidadCeldaCancelarConexion);							
			this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosConexion.setVisible((this.isVisibilidadCeldaGuardarConexion && this.isPermisoGuardarCambiosConexion));			
			
			}
						
			this.jButtonGuardarCambiosTablaConexion.setVisible((this.isVisibilidadCeldaGuardarCambiosConexion && this.isPermisoGuardarCambiosConexion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConexion.setVisible((this.isVisibilidadCeldaNuevoConexion && this.isPermisoNuevoConexion));						
			this.jButtonDuplicarToolBarConexion.setVisible((this.isVisibilidadCeldaDuplicarConexion && this.isPermisoDuplicarConexion));						
			this.jButtonCopiarToolBarConexion.setVisible((this.isVisibilidadCeldaCopiarConexion && this.isPermisoCopiarConexion));			
			this.jButtonVerFormToolBarConexion.setVisible((this.isVisibilidadCeldaVerFormConexion && this.isPermisoVerFormConexion));			
			this.jButtonAbrirOrderByToolBarConexion.setVisible((this.isVisibilidadCeldaOrdenConexion && this.isPermisoOrdenConexion));
			this.jButtonNuevoRelacionesToolBarConexion.setVisible((this.isVisibilidadCeldaNuevoRelacionesConexion && this.isPermisoNuevoConexion));			
			this.jButtonNuevoGuardarCambiosToolBarConexion.setVisible((this.isVisibilidadCeldaNuevoConexion && this.isPermisoNuevoConexion && this.isPermisoGuardarCambiosConexion));			
			
			if(this.jInternalFrameDetalleFormConexion!=null) {
			this.jInternalFrameDetalleFormConexion.jButtonModificarToolBarConexion.setVisible((this.isVisibilidadCeldaModificarConexion && this.isPermisoActualizarConexion));	
			this.jInternalFrameDetalleFormConexion.jButtonActualizarToolBarConexion.setVisible((this.isVisibilidadCeldaActualizarConexion  && this.isPermisoActualizarConexion));	
			this.jInternalFrameDetalleFormConexion.jButtonEliminarToolBarConexion.setVisible((this.isVisibilidadCeldaEliminarConexion && this.isPermisoEliminarConexion));
			this.jInternalFrameDetalleFormConexion.jButtonCancelarToolBarConexion.setVisible(this.isVisibilidadCeldaCancelarConexion);				
			this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosToolBarConexion.setVisible((this.isVisibilidadCeldaGuardarConexion && this.isPermisoGuardarCambiosConexion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConexion.setVisible((this.isVisibilidadCeldaGuardarCambiosConexion && this.isPermisoGuardarCambiosConexion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConexion.setVisible((this.isVisibilidadCeldaNuevoConexion && this.isPermisoNuevoConexion));			
			this.jMenuItemDuplicarConexion.setVisible((this.isVisibilidadCeldaDuplicarConexion && this.isPermisoDuplicarConexion));			
			this.jMenuItemCopiarConexion.setVisible((this.isVisibilidadCeldaCopiarConexion && this.isPermisoCopiarConexion));			
			this.jMenuItemVerFormConexion.setVisible((this.isVisibilidadCeldaVerFormConexion && this.isPermisoVerFormConexion));			
			this.jMenuItemAbrirOrderByConexion.setVisible((this.isVisibilidadCeldaOrdenConexion && this.isPermisoOrdenConexion));			
			//this.jMenuItemMostrarOcultarConexion.setVisible((this.isVisibilidadCeldaOrdenConexion && this.isPermisoOrdenConexion));
			this.jMenuItemDetalleAbrirOrderByConexion.setVisible((this.isVisibilidadCeldaOrdenConexion && this.isPermisoOrdenConexion));			
			//this.jMenuItemDetalleMostrarOcultarConexion.setVisible((this.isVisibilidadCeldaOrdenConexion && this.isPermisoOrdenConexion));			
			this.jMenuItemNuevoRelacionesConexion.setVisible((this.isVisibilidadCeldaNuevoRelacionesConexion && this.isPermisoNuevoConexion));			
			this.jMenuItemNuevoGuardarCambiosConexion.setVisible((this.isVisibilidadCeldaNuevoConexion && this.isPermisoNuevoConexion && this.isPermisoGuardarCambiosConexion));									
			
			if(this.jInternalFrameDetalleFormConexion!=null) {
			this.jInternalFrameDetalleFormConexion.jMenuItemModificarConexion.setVisible((this.isVisibilidadCeldaModificarConexion && this.isPermisoActualizarConexion));	
			this.jInternalFrameDetalleFormConexion.jMenuItemActualizarConexion.setVisible((this.isVisibilidadCeldaActualizarConexion && this.isPermisoActualizarConexion));	
			this.jInternalFrameDetalleFormConexion.jMenuItemEliminarConexion.setVisible((this.isVisibilidadCeldaEliminarConexion && this.isPermisoEliminarConexion));
			this.jInternalFrameDetalleFormConexion.jMenuItemCancelarConexion.setVisible(this.isVisibilidadCeldaCancelarConexion);				
			}
			
			this.jMenuItemGuardarCambiosConexion.setVisible((this.isVisibilidadCeldaGuardarConexion && this.isPermisoGuardarCambiosConexion));						
			this.jMenuItemGuardarCambiosTablaConexion.setVisible((this.isVisibilidadCeldaGuardarCambiosConexion && this.isPermisoGuardarCambiosConexion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConexion=this.jButtonNuevoConexion.isVisible();
			this.isVisibilidadCeldaDuplicarConexion=this.jButtonDuplicarConexion.isVisible();
			this.isVisibilidadCeldaCopiarConexion=this.jButtonCopiarConexion.isVisible();
			this.isVisibilidadCeldaVerFormConexion=this.jButtonVerFormConexion.isVisible();
			
			this.isVisibilidadCeldaOrdenConexion=this.jButtonAbrirOrderByConexion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConexion=this.jButtonNuevoRelacionesConexion.isVisible();
			this.isVisibilidadCeldaModificarConexion=this.jButtonModificarConexion.isVisible();
			
			if(this.jInternalFrameDetalleFormConexion!=null) {
			this.isVisibilidadCeldaActualizarConexion=this.jInternalFrameDetalleFormConexion.jButtonActualizarConexion.isVisible();
			this.isVisibilidadCeldaEliminarConexion=this.jInternalFrameDetalleFormConexion.jButtonEliminarConexion.isVisible();
			this.isVisibilidadCeldaCancelarConexion=this.jInternalFrameDetalleFormConexion.jButtonCancelarConexion.isVisible();
			this.isVisibilidadCeldaGuardarConexion=this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosConexion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConexion=this.jButtonGuardarCambiosTablaConexion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConexion=this.jButtonNuevoToolBarConexion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConexion=this.jButtonNuevoRelacionesToolBarConexion.isVisible();
			
			if(this.jInternalFrameDetalleFormConexion!=null) {
			this.isVisibilidadCeldaModificarConexion=this.jInternalFrameDetalleFormConexion.jButtonModificarToolBarConexion.isVisible();
			this.isVisibilidadCeldaActualizarConexion=this.jInternalFrameDetalleFormConexion.jButtonActualizarToolBarConexion.isVisible();
			this.isVisibilidadCeldaEliminarConexion=this.jInternalFrameDetalleFormConexion.jButtonEliminarToolBarConexion.isVisible();
			this.isVisibilidadCeldaCancelarConexion=this.jInternalFrameDetalleFormConexion.jButtonCancelarToolBarConexion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConexion=this.jButtonGuardarCambiosToolBarConexion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConexion=this.jButtonGuardarCambiosTablaToolBarConexion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConexion=this.jMenuItemNuevoConexion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConexion=this.jMenuItemNuevoRelacionesConexion.isVisible();
			
			if(this.jInternalFrameDetalleFormConexion!=null) {
			this.isVisibilidadCeldaModificarConexion=this.jInternalFrameDetalleFormConexion.jMenuItemModificarConexion.isVisible();
			this.isVisibilidadCeldaActualizarConexion=this.jInternalFrameDetalleFormConexion.jMenuItemActualizarConexion.isVisible();
			this.isVisibilidadCeldaEliminarConexion=this.jInternalFrameDetalleFormConexion.jMenuItemEliminarConexion.isVisible();
			this.isVisibilidadCeldaCancelarConexion=this.jInternalFrameDetalleFormConexion.jMenuItemCancelarConexion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConexion=this.jMenuItemGuardarCambiosConexion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConexion=this.jMenuItemGuardarCambiosTablaConexion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConexion(Boolean esInicializar) {
		if(ConexionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.conexionSessionBean.getConGuardarRelaciones()) {
				//if(this.conexionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConexion();
			}
			
			this.inicializarActualizarBindingBotonesManualConexion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConexion() {
		this.jButtonNuevoConexion.setVisible(this.isPermisoNuevoConexion);			
		this.jButtonDuplicarConexion.setVisible(this.isPermisoDuplicarConexion);			
		this.jButtonCopiarConexion.setVisible(this.isPermisoCopiarConexion);			
		this.jButtonVerFormConexion.setVisible(this.isPermisoVerFormConexion);			
		
		this.jButtonAbrirOrderByConexion.setVisible(this.isPermisoOrdenConexion);					
		
		this.jButtonNuevoRelacionesConexion.setVisible(this.isPermisoNuevoConexion);			
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jButtonModificarConexion.setVisible(this.isPermisoActualizarConexion);	
			this.jInternalFrameDetalleFormConexion.jButtonActualizarConexion.setVisible(this.isPermisoActualizarConexion);	
			this.jInternalFrameDetalleFormConexion.jButtonEliminarConexion.setVisible(this.isPermisoEliminarConexion);
			this.jInternalFrameDetalleFormConexion.jButtonCancelarConexion.setVisible(this.isVisibilidadCeldaCancelarConexion);						
			this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosConexion.setVisible(this.isPermisoGuardarCambiosConexion);							
		}
		
		this.jButtonGuardarCambiosTablaConexion.setVisible(this.isPermisoActualizarConexion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConexion() {
		this.jInternalFrameDetalleFormConexion.jButtonModificarConexion.setVisible(this.isPermisoActualizarConexion);	
		this.jInternalFrameDetalleFormConexion.jButtonActualizarConexion.setVisible(this.isPermisoActualizarConexion);	
		this.jInternalFrameDetalleFormConexion.jButtonEliminarConexion.setVisible(this.isPermisoEliminarConexion);
		this.jInternalFrameDetalleFormConexion.jButtonCancelarConexion.setVisible(this.isVisibilidadCeldaCancelarConexion);							
		this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosConexion.setVisible((this.isVisibilidadCeldaGuardarConexion && this.isPermisoGuardarCambiosConexion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConexion() {
		if(ConexionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConexion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConexion() {
	}
	
	public void jTableDatosConexionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConexion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConexion(this.getconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conexion==null) {
						this.conexion = new Conexion();
					}

					this.setVariablesFormularioToObjetoActualConexion(this.conexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
				}

				if(this.conexion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.conexion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_conexionConexionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoconexion=true;

			idTienePermisotipoconexion=this.tienePermisosUsuarioEnPaginaWebConexion(TipoConexionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoconexion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConexion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConexion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConexion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConexion(this.getconexion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);

				this.tipoconexionBeanSwingJInternalFrame=new TipoConexionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoconexionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoconexionBeanSwingJInternalFrame.getTipoConexionLogic().setConnexion(this.conexionLogic.getConnexion());

				if(this.conexion.getid_tipo_conexion()!=null) {
					this.tipoconexionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoconexionBeanSwingJInternalFrame.setIdActual(this.conexion.getid_tipo_conexion());
					this.tipoconexionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoconexionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoconexionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoConexion();
				}

				JInternalFrameBase jinternalFrame =this.tipoconexionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConexion=(TitledBorder)this.jScrollPanelDatosConexion.getBorder();
				TitledBorder titledBordertipoconexion=(TitledBorder)this.tipoconexionBeanSwingJInternalFrame.jScrollPanelDatosTipoConexion.getBorder();

				titledBordertipoconexion.setTitle(titledBorderConexion.getTitle() + " -> Tipo Conexion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_conexionConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConexion(this.getconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conexion==null) {
						this.conexion = new Conexion();
					}

					this.setVariablesFormularioToObjetoActualConexion(this.conexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
				}

				if(this.conexion.getid_tipo_conexion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_conexion = "+this.conexion.getid_tipo_conexion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConexion(this.getconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conexion==null) {
						this.conexion = new Conexion();
					}

					this.setVariablesFormularioToObjetoActualConexion(this.conexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
				}

				if(this.conexion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.conexion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_maquinaConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConexion(this.getconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conexion==null) {
						this.conexion = new Conexion();
					}

					this.setVariablesFormularioToObjetoActualConexion(this.conexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);
				}

				if(this.conexion.getnombre_maquina()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_maquina like '%"+this.conexion.getnombre_maquina()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdTipoConexionConexionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConexion(false,false);

			this.getConexionsFK_IdTipoConexion();

			this.inicializarActualizarBindingConexion(false);

			//if(ConexionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConexion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conexionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConexion() {
		if(this.jInternalFrameDetalleFormConexion!=null) {
		

		if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormConexion!=null) {
			this.jInternalFrameDetalleFormConexion.setVisible(false);	    			
			this.jInternalFrameDetalleFormConexion.dispose();
			this.jInternalFrameDetalleFormConexion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConexion!=null) {
			this.jInternalFrameReporteDinamicoConexion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConexion.dispose();
			this.jInternalFrameReporteDinamicoConexion=null;
		}
		
		if(this.jInternalFrameImportacionConexion!=null) {
			this.jInternalFrameImportacionConexion.setVisible(false);	    			
			this.jInternalFrameImportacionConexion.dispose();
			this.jInternalFrameImportacionConexion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConexion();
			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
			
			if(sTipo.equals("NuevoConexion")) {
				jButtonNuevoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConexion")) {
				jButtonDuplicarConexionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConexion")) {
				jButtonCopiarConexionActionPerformed(evt);
			} else if(sTipo.equals("VerFormConexion")) {
				jButtonVerFormConexionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConexion")) {
				jButtonNuevoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConexion")) {
				jButtonDuplicarConexionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConexion")) {
				jButtonNuevoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConexion")) {
				jButtonDuplicarConexionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConexion")) {
				jButtonNuevoConexionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConexion")) {
				jButtonNuevoConexionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConexion")) {
				jButtonNuevoConexionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConexion")) {
				jButtonModificarConexionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConexion")) {
				jButtonModificarConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConexion")) {
				jButtonModificarConexionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConexion")) {
				jButtonActualizarConexionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConexion")) {
				jButtonActualizarConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConexion")) {
				jButtonActualizarConexionActionPerformed(evt);
			} else if(sTipo.equals("EliminarConexion")) {
				jButtonEliminarConexionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConexion")) {
				jButtonEliminarConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConexion")) {
				jButtonEliminarConexionActionPerformed(evt);
			} else if(sTipo.equals("CancelarConexion")) {
				jButtonCancelarConexionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConexion")) {
				jButtonCancelarConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConexion")) {
				jButtonCancelarConexionActionPerformed(evt);
			} else if(sTipo.equals("CerrarConexion")) {
				jButtonCerrarConexionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConexion")) {
				jButtonCerrarConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConexion")) {
				jButtonCerrarConexionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConexion")) {
				jButtonMostrarOcultarConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConexion")) {
				jButtonCancelarConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConexion")) {
				jButtonGuardarCambiosConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConexion")) {
				jButtonGuardarCambiosConexionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConexion")) {
				jButtonCopiarConexionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConexion")) {
				jButtonVerFormConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConexion")) {
				jButtonGuardarCambiosConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConexion")) {
				jButtonCopiarConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConexion")) {
				jButtonVerFormConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConexion")) {
				jButtonGuardarCambiosConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConexion")) {
				jButtonGuardarCambiosConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConexion")) {
				jButtonGuardarCambiosConexionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConexion")) {
				jButtonRecargarInformacionConexionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConexion")) {
				jButtonRecargarInformacionConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConexion")) {
				jButtonRecargarInformacionConexionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConexion")) {
				jButtonAnterioresConexionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConexion")) {
				jButtonAnterioresConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConexion")) {
				jButtonAnterioresConexionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConexion")) {
				jButtonSiguientesConexionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConexion")) {
				jButtonSiguientesConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConexion")) {
				jButtonSiguientesConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConexion") || sTipo.equals("MenuItemDetalleAbrirOrderByConexion")) {
				jButtonAbrirOrderByConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConexion") || sTipo.equals("MenuItemDetalleMostrarOcultarConexion")) {
				jButtonMostrarOcultarConexionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConexion")) {
				jButtonNuevoGuardarCambiosConexionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConexion")) {
				jButtonNuevoGuardarCambiosConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConexion")) {
				jButtonNuevoGuardarCambiosConexionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConexion")) {
				jButtonCerrarReporteDinamicoConexionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConexion")) {
				jButtonGenerarReporteDinamicoConexionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConexion")) {
				
				jButtonGenerarExcelReporteDinamicoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConexion")) {
				jButtonCerrarImportacionConexionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConexion")) {
				
				jButtonGenerarImportacionConexionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConexion")) {
				
				jButtonAbrirImportacionConexionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConexion")) {
				jComboBoxTiposAccionesConexionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConexion")) {
				jComboBoxTiposRelacionesConexionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConexion")) {
				jComboBoxTiposAccionesConexionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConexion")) {
				
				jComboBoxTiposSeleccionarConexionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConexion")) {
				jTextFieldValorCampoGeneralConexionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConexion")) {
				jButtonAbrirOrderByConexionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConexion")) {
				jButtonAbrirOrderByConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConexion")) {
				jButtonCerrarOrderByConexionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConexionBusqueda")) {
				this.jButtonidConexionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_conexionConexionUpdate")) {
				this.jButtonid_tipo_conexionConexionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_conexionConexionBusqueda")) {
				this.jButtonid_tipo_conexionConexionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConexionBusqueda")) {
				this.jButtonnombreConexionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_maquinaConexionBusqueda")) {
				this.jButtonnombre_maquinaConexionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoConexionConexion")) {
				this.jButtonFK_IdTipoConexionConexionActionPerformed(evt);
			}
			
			;
			
			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConexion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConexionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				


				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Conexion conexionLocal=null;
			
			if(!this.getEsControlTabla()) {
				conexionLocal=this.conexion;
			} else {
				conexionLocal=this.conexionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
							
				
				


				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionAnterior =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conexionAnterior =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
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
			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
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
			
			


			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConexionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
								
						
				


				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
								
				
				


				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionAnterior =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conexionAnterior =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionAnterior =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conexionAnterior =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConexionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
							
				
				


				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConexionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConexion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conexionAnterior =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conexionAnterior =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
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
			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
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
			
			


			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConexionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
								
				
				


				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionAnterior =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conexionAnterior =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConexionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConexionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConexion")) {
					jCheckBoxSeleccionarTodosConexionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConexion")) {
					jCheckBoxSeleccionadosConexionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConexion")) {
					
				}
				
				


				
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
												
				
				


				
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConexionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConexion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conexionAnterior =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conexionAnterior =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConexionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
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
			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
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
			
			


			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConexionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conexion);
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
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
				
				


				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conexion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conexionAnterior =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conexionAnterior =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConexion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConexionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConexion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.conexion =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.conexion =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.conexion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConexion")) {
				
				}
				
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConexion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConexion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConexion")) {
			
			}
			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConexion();
			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
			if(sTipo.equals("NuevoConexion")) {
				jButtonNuevoConexionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConexion")) {
				jButtonDuplicarConexionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConexion")) {
				jButtonCopiarConexionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConexion")) {
				jButtonVerFormConexionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConexion")) {
				jButtonNuevoConexionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConexion")) {
				jButtonModificarConexionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConexion")) {
				jButtonActualizarConexionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConexion")) {
				jButtonEliminarConexionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConexion")) {
				jButtonGuardarCambiosConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConexion")) {
				jButtonCancelarConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConexion")) {
				jButtonCerrarConexionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConexion")) {
				jButtonGuardarCambiosConexionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConexion")) {
				jButtonNuevoGuardarCambiosConexionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConexion")) {
				jButtonAbrirOrderByConexionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConexion")) {
				jButtonRecargarInformacionConexionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConexion")) {
				jButtonAnterioresConexionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConexion")) {
				jButtonSiguientesConexionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConexionBusqueda")) {
				this.jButtonidConexionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_conexionConexionUpdate")) {
				this.jButtonid_tipo_conexionConexionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_conexionConexionBusqueda")) {
				this.jButtonid_tipo_conexionConexionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConexionBusqueda")) {
				this.jButtonnombreConexionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_maquinaConexionBusqueda")) {
				this.jButtonnombre_maquinaConexionBusquedaActionPerformed(evt);
			}
			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConexion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConexion")) {
				closingInternalFrameConexion();
				
			} else if(sTipo.equals("jButtonCancelarConexion")) {
				JInternalFrameBase jInternalFrameDetalleFormConexion = (JInternalFrameBase)evt.getSource();
	            	
	            ConexionBeanSwingJInternalFrame jInternalFrameParent=(ConexionBeanSwingJInternalFrame)jInternalFrameDetalleFormConexion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConexionActionPerformed(null);
			}
			
			ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conexion,new Object(),this.conexionParameterGeneral,this.conexionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConexion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConexion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConexion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.conexion)) {
			if(!esControlTabla) {
				if(ConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConexion(this.conexion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);			
				}
				
				if(this.conexionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConexion(this.conexion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.conexionReturnGeneral=conexionLogic.procesarEventosConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conexionLogic.getConexions(),this.conexion,this.conexionParameterGeneral,this.isEsNuevoConexion,classes);//this.conexionLogic.getConexion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConexion(this.conexionReturnGeneral,this.conexionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.conexionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConexion(classes,this.conexionReturnGeneral,this.conexionBean,false);
					}
						
					if(this.conexionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConexion(this.conexionReturnGeneral.getConexion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConexion(this.conexionReturnGeneral.getConexion());	
					}
						
					if(this.conexionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConexion(this.conexionReturnGeneral.getConexion(),classes);//this.conexionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConexion(this.conexion,classes);//this.conexionBean);									
				}
			
				if(ConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConexion(this.conexion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConexion(this.conexion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.conexionAnterior!=null) {
						this.conexion=this.conexionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.conexionReturnGeneral=conexionLogic.procesarEventosConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conexionLogic.getConexions(),this.conexion,this.conexionParameterGeneral,this.isEsNuevoConexion,classes);//this.conexionLogic.getConexion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.conexionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.conexionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.conexionReturnGeneral.getConexion(),conexionLogic.getConexions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.conexionReturnGeneral.getConexion(),this.conexions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConexion.repaint();
				
				//((AbstractTableModel) this.jTableDatosConexion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConexion();
			}
		}
	}
	
	public void actualizarVisualTableDatosConexion() throws Exception {
		
		ConexionModel conexionModel=(ConexionModel)this.jTableDatosConexion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conexionModel.conexions=this.conexionLogic.getConexions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			conexionModel.conexions=this.conexions;
		}
		
		
		((ConexionModel) this.jTableDatosConexion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConexion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconexionAnterior(),this.conexionLogic.getConexions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconexionAnterior(),this.conexions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConexion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConexion(Conexion conexion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCreditoConexion.class)) {
					this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.setTarjetaCreditoConexions(conexion.getTarjetaCreditoConexions());
					this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NumeroRecap.class)) {
					this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.setNumeroRecaps(conexion.getNumeroRecaps());
					this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.inicializarActualizarBindingTablaNumeroRecap(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(conexion.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
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
										
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conexion,new Object(),generalEntityParameterGeneral,this.conexionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.conexionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConexionConstantesFunciones.getClassesRelationshipsOfConexion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConexionConstantesFunciones.getClassesRelationshipsFromStringsOfConexion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConexion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conexion,new Object(),generalEntityParameterGeneral,this.conexionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConexion(ConexionBean conexionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCreditoConexion.class)) {
					this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.setTarjetaCreditoConexions(conexion.getTarjetaCreditoConexions());
					this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NumeroRecap.class)) {
					this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.setNumeroRecaps(conexion.getNumeroRecaps());
					this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.inicializarActualizarBindingTablaNumeroRecap(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(conexion.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConexion(ArrayList<Classe> classes,ConexionReturnGeneral conexionReturnGeneral,ConexionBean conexionBean,Boolean conDefault) throws Exception {
		
			this.conexionBean.setTarjetaCreditoConexions(conexionReturnGeneral.getConexion().getTarjetaCreditoConexions());
			this.conexionBean.setNumeroRecaps(conexionReturnGeneral.getConexion().getNumeroRecaps());
			this.conexionBean.setFormaPagoPuntoVentas(conexionReturnGeneral.getConexion().getFormaPagoPuntoVentas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConexion(Conexion conexion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TarjetaCreditoConexion.class)) {
					conexion.setTarjetaCreditoConexions(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NumeroRecap.class)) {
					conexion.setNumeroRecaps(this.jInternalFrameDetalleFormConexion.numerorecapBeanSwingJInternalFrame.numerorecapLogic.getNumeroRecaps());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					conexion.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormConexion.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.conexion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConexion = new ConexionDetalleFormJInternalFrame(jDesktopPane,this.conexionSessionBean.getConGuardarRelaciones(),this.conexionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConexion);
		this.jInternalFrameDetalleFormConexion.setVisible(false);
		this.jInternalFrameDetalleFormConexion.setSelected(false);						
		
		this.jInternalFrameDetalleFormConexion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConexion.conexionLogic=this.conexionLogic;
		
		this.cargarCombosFrameForeignKeyConexion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConexion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConexion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConexion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConexion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConexion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConexion"));
		
		this.jInternalFrameDetalleFormConexion.jButtonModificarConexion.addActionListener(new ButtonActionListener(this,"ModificarConexion"));

		
		this.jInternalFrameDetalleFormConexion.jButtonModificarToolBarConexion.addActionListener(new ButtonActionListener(this,"ModificarToolBarConexion"));
					
		this.jInternalFrameDetalleFormConexion.jMenuItemModificarConexion.addActionListener(new ButtonActionListener(this,"MenuItemModificarConexion"));		
		
		
		
		this.jInternalFrameDetalleFormConexion.jButtonActualizarConexion.addActionListener (new ButtonActionListener(this,"ActualizarConexion"));
		
		
		this.jInternalFrameDetalleFormConexion.jButtonActualizarToolBarConexion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConexion"));
						
		this.jInternalFrameDetalleFormConexion.jMenuItemActualizarConexion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConexion"));		
		
		
		
		this.jInternalFrameDetalleFormConexion.jButtonEliminarConexion.addActionListener (new ButtonActionListener(this,"EliminarConexion"));
		
		
		this.jInternalFrameDetalleFormConexion.jButtonEliminarToolBarConexion.addActionListener (new ButtonActionListener(this,"EliminarToolBarConexion"));
								
		this.jInternalFrameDetalleFormConexion.jMenuItemEliminarConexion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConexion"));		
		
		
		
		this.jInternalFrameDetalleFormConexion.jButtonCancelarConexion.addActionListener (new ButtonActionListener(this,"CancelarConexion"));
		
		
		this.jInternalFrameDetalleFormConexion.jButtonCancelarToolBarConexion.addActionListener (new ButtonActionListener(this,"CancelarToolBarConexion"));
					
		this.jInternalFrameDetalleFormConexion.jMenuItemCancelarConexion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConexion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConexion.jMenuItemDetalleCerrarConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConexion"));		
		
		
		
		this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosToolBarConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConexion"));
		
		
		
		this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosToolBarConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConexion"));
		
		
		
		this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConexion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonidConexionBusqueda.addActionListener(new ButtonActionListener(this,"idConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConexion.jButtonid_tipo_conexionConexionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_conexionConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonid_tipo_conexionConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_conexionConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonnombreConexionBusqueda.addActionListener(new ButtonActionListener(this,"nombreConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonnombre_maquinaConexionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_maquinaConexionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConexion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConexion"));
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConexion"));
		}
		
		this.jTableDatosConexion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConexion"));
		
		this.jTableDatosConexion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConexion"));
		
		this.jButtonNuevoConexion.addActionListener(new ButtonActionListener(this,"NuevoConexion"));
		
		this.jButtonDuplicarConexion.addActionListener(new ButtonActionListener(this,"DuplicarConexion"));
		
		this.jButtonCopiarConexion.addActionListener(new ButtonActionListener(this,"CopiarConexion"));
		
		this.jButtonVerFormConexion.addActionListener(new ButtonActionListener(this,"VerFormConexion"));
		
		
		this.jButtonNuevoToolBarConexion.addActionListener(new ButtonActionListener(this,"NuevoToolBarConexion"));
			
		this.jButtonDuplicarToolBarConexion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConexion"));
			
		this.jMenuItemNuevoConexion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConexion"));
			
		this.jMenuItemDuplicarConexion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConexion"));		
		
		
		this.jButtonNuevoRelacionesConexion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConexion"));
		
		
		this.jButtonNuevoRelacionesToolBarConexion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConexion"));
			
		this.jMenuItemNuevoRelacionesConexion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConexion"));		
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jButtonModificarConexion.addActionListener(new ButtonActionListener(this,"ModificarConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jButtonModificarToolBarConexion.addActionListener(new ButtonActionListener(this,"ModificarToolBarConexion"));
			
			this.jInternalFrameDetalleFormConexion.jMenuItemModificarConexion.addActionListener(new ButtonActionListener(this,"MenuItemModificarConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConexion.jButtonActualizarConexion.addActionListener (new ButtonActionListener(this,"ActualizarConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jButtonActualizarToolBarConexion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConexion"));
				
			this.jInternalFrameDetalleFormConexion.jMenuItemActualizarConexion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jButtonEliminarConexion.addActionListener (new ButtonActionListener(this,"EliminarConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jButtonEliminarToolBarConexion.addActionListener (new ButtonActionListener(this,"EliminarToolBarConexion"));
						
			this.jInternalFrameDetalleFormConexion.jMenuItemEliminarConexion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jButtonCancelarConexion.addActionListener (new ButtonActionListener(this,"CancelarConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jButtonCancelarToolBarConexion.addActionListener (new ButtonActionListener(this,"CancelarToolBarConexion"));
			
			this.jInternalFrameDetalleFormConexion.jMenuItemCancelarConexion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConexion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConexion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConexion"));		
		
		
		this.jButtonCerrarConexion.addActionListener (new ButtonActionListener(this,"CerrarConexion"));
		
		
		this.jButtonCerrarToolBarConexion.addActionListener (new ButtonActionListener(this,"CerrarToolBarConexion"));
			
		this.jMenuItemCerrarConexion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConexion"));
			
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jMenuItemDetalleCerrarConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosToolBarConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConexion"));
		}
		
		this.jButtonCopiarToolBarConexion.addActionListener (new ButtonActionListener(this,"CopiarToolBarConexion"));
			
		this.jButtonVerFormToolBarConexion.addActionListener (new ButtonActionListener(this,"VerFormToolBarConexion"));
		
		this.jMenuItemGuardarCambiosConexion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConexion"));
			
		this.jMenuItemCopiarConexion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConexion"));		
		
		this.jMenuItemVerFormConexion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConexion"));		
		
		
		this.jButtonGuardarCambiosTablaConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConexion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConexion"));
			
		this.jMenuItemGuardarCambiosTablaConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConexion"));		
		
		
		
		this.jButtonRecargarInformacionConexion.addActionListener (new ButtonActionListener(this,"RecargarInformacionConexion"));
					
		this.jButtonRecargarInformacionToolBarConexion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConexion"));
		
		this.jMenuItemRecargarInformacionConexion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConexion"));		
		
		
		
		this.jButtonAnterioresConexion.addActionListener (new ButtonActionListener(this,"AnterioresConexion"));
		
		
		this.jButtonAnterioresToolBarConexion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConexion"));
		
		this.jMenuItemAnterioresConexion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConexion"));		
		
		
		this.jButtonSiguientesConexion.addActionListener (new ButtonActionListener(this,"SiguientesConexion"));
		
		
		this.jButtonSiguientesToolBarConexion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConexion"));
			
		this.jMenuItemSiguientesConexion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConexion"));
			
		this.jMenuItemAbrirOrderByConexion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConexion"));
			
		this.jMenuItemMostrarOcultarConexion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConexion"));
			
		this.jMenuItemDetalleAbrirOrderByConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConexion"));
			
		this.jMenuItemDetalleMostarOcultarConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConexion"));		
		
		
		this.jButtonNuevoGuardarCambiosConexion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConexion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConexion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConexion"));
			
		this.jMenuItemNuevoGuardarCambiosConexion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConexion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConexion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConexion"));

		this.jCheckBoxSeleccionadosConexion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConexion"));
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConexion"));
		}
		
		
		this.jComboBoxTiposRelacionesConexion.addActionListener (new ButtonActionListener(this,"TiposRelacionesConexion"));
			
		this.jComboBoxTiposAccionesConexion.addActionListener (new ButtonActionListener(this,"TiposAccionesConexion"));
					
		this.jComboBoxTiposSeleccionarConexion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConexion"));
			
		this.jTextFieldValorCampoGeneralConexion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConexion"));		
		
		
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonidConexionBusqueda.addActionListener(new ButtonActionListener(this,"idConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConexion.jButtonid_tipo_conexionConexionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_conexionConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonid_tipo_conexionConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_conexionConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonnombreConexionBusqueda.addActionListener(new ButtonActionListener(this,"nombreConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonnombre_maquinaConexionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_maquinaConexionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoConexionConexion.addActionListener(new ButtonActionListener(this,"FK_IdTipoConexionConexion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConexion!=null) {
				this.jInternalFrameReporteDinamicoConexion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConexion"));
				this.jInternalFrameReporteDinamicoConexion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConexion"));
				this.jInternalFrameReporteDinamicoConexion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConexion"));
			}
			
			//this.jButtonCerrarReporteDinamicoConexion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConexion"));				
			//this.jButtonGenerarReporteDinamicoConexion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConexion"));
			//this.jButtonGenerarExcelReporteDinamicoConexion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConexion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConexion!=null) {
				this.jInternalFrameImportacionConexion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConexion"));
				this.jInternalFrameImportacionConexion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConexion"));
				this.jInternalFrameImportacionConexion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConexion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConexion.addActionListener (new ButtonActionListener(this,"AbrirOrderByConexion"));
			
			this.jButtonAbrirOrderByToolBarConexion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConexion"));			
			
			if(this.jInternalFrameOrderByConexion!=null) {
				this.jInternalFrameOrderByConexion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConexion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConexion.jTabbedPaneRelacionesConexion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConexion"));
		
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
            		closingInternalFrameConexion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConexion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConexion = (JInternalFrameBase)event.getSource();
	            	
	            ConexionBeanSwingJInternalFrame jInternalFrameParent=(ConexionBeanSwingJInternalFrame)jInternalFrameDetalleFormConexion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConexionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConexion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConexionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConexion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConexion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConexionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConexionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConexionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConexion";
		inputMap = this.jButtonNuevoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConexionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConexionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConexionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConexionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConexion";
		inputMap = this.jButtonNuevoRelacionesConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConexionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConexion";
		inputMap = this.jButtonModificarConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConexion";
		inputMap = this.jButtonActualizarConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConexion";
		inputMap = this.jButtonEliminarConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConexion";
		inputMap = this.jButtonCancelarConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConexion";
		inputMap = this.jButtonCerrarConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConexion";
		inputMap = this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConexion.jButtonGuardarCambiosConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConexion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConexionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConexion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConexionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConexion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConexionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConexion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConexionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonidConexionBusqueda.addActionListener(new ButtonActionListener(this,"idConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConexion.jButtonid_tipo_conexionConexionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_conexionConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonid_tipo_conexionConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_conexionConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonnombreConexionBusqueda.addActionListener(new ButtonActionListener(this,"nombreConexionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConexion.jButtonnombre_maquinaConexionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_maquinaConexionBusqueda"));
		
		
		this.jButtonFK_IdTipoConexionConexion.addActionListener(new ButtonActionListener(this,"FK_IdTipoConexionConexion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConexionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConexion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConexion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Conexion conexionAux:this.conexionLogic.getConexions()) {
					conexionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Conexion conexionAux:conexions) {
					conexionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConexionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConexion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Conexion conexionAux:this.conexionLogic.getConexions()) {
						conexionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Conexion conexionAux:conexions) {
						conexionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Conexion conexionAux:this.conexionLogic.getConexions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Conexion conexionAux:conexions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConexion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConexion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConexion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConexion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConexionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConexion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConexion.getSelectedRows();
			
			Conexion conexionLocal=new Conexion();
			
			//this.seleccionarTodosConexion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conexionLocal =(Conexion) this.conexionLogic.getConexions().toArray()[this.jTableDatosConexion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					conexionLocal =(Conexion) this.conexions.toArray()[this.jTableDatosConexion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				conexionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Conexion conexionAux:this.conexionLogic.getConexions()) {
						conexionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Conexion conexionAux:conexions) {
						conexionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConexion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConexion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConexion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConexion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConexionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConexionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConexionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConexion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConexion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Conexion conexionAux:this.conexionLogic.getConexions()) {
				
						if(sTipoSeleccionar.equals(ConexionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							conexionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConexionConstantesFunciones.LABEL_NOMBREMAQUINA)) {
							existe=true;
							conexionAux.setnombre_maquina(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Conexion conexionAux:conexions) {
					
						if(sTipoSeleccionar.equals(ConexionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							conexionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConexionConstantesFunciones.LABEL_NOMBREMAQUINA)) {
							existe=true;
							conexionAux.setnombre_maquina(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConexion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConexionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConexion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConexion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConexion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConexion) {				
					conSplash=true;//false;										
					
					//this.startProcessConexion(conSplash);
				
					this.generarReporteConexionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConexionsSeleccionados();
				//this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConexionsSeleccionados(false);
				//this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConexionsSeleccionados(true);
				//this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConexion();
				
				this.exportarConexionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConexions();
				//this.importarConexions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConexion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConexionsSeleccionados();
				//this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConexion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConexion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConexion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Conexion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.setSelectedIndex(0);					
				}	
			} 			
			else if(ConexionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConexion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConexion(conSplash);
					
						//this.actualizarParametrosGeneralConexion();
						
						this.generarReporteProcesoAccionConexionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConexionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ConexionES SELECCIONADOS?", "MANTENIMIENTO DE Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConexion();
				
						this.actualizarParametrosGeneralConexion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.conexionReturnGeneral=conexionLogic.procesarAccionConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.conexionLogic.getConexions(),this.conexionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConexionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConexion();
					
					ConexionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConexionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConexion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConexion.jComboBoxTiposAccionesFormularioConexion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConexion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConexionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConexion();
			
			if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();		
			Conexion conexion=new Conexion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConexion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConexion.getSelectedItem();
			
			
			
			
			conexionsSeleccionados=this.getConexionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(conexionsSeleccionados.size()==1) {
				for(Conexion conexionAux:conexionsSeleccionados) {
					conexion=conexionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Tarjeta Credito Conexion")) {
					jButtonTarjetaCreditoConexionActionPerformed(null,rowIndex,true,false,conexion);
				}
				else if(this.sTipoRelacion.equals("Numero Recap")) {
					jButtonNumeroRecapActionPerformed(null,rowIndex,true,false,conexion);
				}
				else if(this.sTipoRelacion.equals("Forma Pago")) {
					jButtonFormaPagoPuntoVentaActionPerformed(null,rowIndex,true,false,conexion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConexion();
			
      		//this.finishProcessConexion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConexionReturnGeneral() throws Exception {
		if(this.conexionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.conexionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.conexionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.conexionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.conexionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.conexionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConexion(false);
		}
		
		if(this.conexionReturnGeneral.getConRetornoLista() || this.conexionReturnGeneral.getConRetornoObjeto()) {
			if(this.conexionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.conexionLogic.setConexions(this.conexionReturnGeneral.getConexions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.conexionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.conexionLogic.setConexion(this.conexionReturnGeneral.getConexion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingConexion(false);
		}
	}
	
	public void actualizarParametrosGeneralConexion() throws Exception {
		
		
	}
	
	public ArrayList<Conexion> getConexionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConexion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Conexion conexionAux:conexionLogic.getConexions()) {
					if(conexionAux.getIsSelected()) {
						conexionsSeleccionados.add(conexionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Conexion conexionAux:this.conexions) {
					if(conexionAux.getIsSelected()) {
						conexionsSeleccionados.add(conexionAux);				
					}
				}
			}
			
			if(conexionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						conexionsSeleccionados.addAll(this.conexionLogic.getConexions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						conexionsSeleccionados.addAll(this.conexions);				
					}
				}
			}
		} else {
			conexionsSeleccionados.add(this.conexion);
		}
		
		return conexionsSeleccionados;
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
	
	public void generarReporteConexionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConexionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConexionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConexionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConexionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesConexionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Conexion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConexionsSeleccionados() throws Exception {
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();		
		
		conexionsSeleccionados=this.getConexionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConexions("Todos",conexionsSeleccionados);
		
	}	
	
	public void generarReporteNormalConexionsSeleccionados() throws Exception {
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();		
		
		conexionsSeleccionados=this.getConexionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConexions("Todos",conexionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConexionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();
		
		conexionsSeleccionados=this.getConexionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConexions("Todos",conexionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConexionsSeleccionados() throws Exception {
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConexion();
		
		
		conexionsSeleccionados=this.getConexionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConexion();
		
		
		//this.generarReporteConexions("Todos",conexionsSeleccionados ,conexionImplementable,conexionImplementableHome);
	}
	
	public void mostrarImportacionConexions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConexion();
		
		this.abrirFrameImportacionConexion();		
		
			
		//this.generarReporteConexions("Todos",conexionsSeleccionados ,conexionImplementable,conexionImplementableHome);
	}
	
	public void importarConexions() throws Exception {		
	
	}
	
	public void exportarConexionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConexionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConexionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConexionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Conexion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConexionsSeleccionados() throws Exception {
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();		
		
		conexionsSeleccionados=this.getConexionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conexion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConexion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Conexion conexionAux:conexionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConexion(conexionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//conexionAux.setsDetalleGeneralEntityReporte(conexionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConexion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConexionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConexionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConexionConstantesFunciones.LABEL_IDTIPOCONEXION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConexionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConexionConstantesFunciones.LABEL_NOMBREMAQUINA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConexion(Conexion conexion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=conexion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=conexion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=conexion.gettipoconexion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conexion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conexion.getnombre_maquina();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConexionsSeleccionados() throws Exception {
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();		
		
		conexionsSeleccionados=this.getConexionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conexion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Conexions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConexion(row);				
				iRow++;
			}				
			
			for(Conexion conexionAux:conexionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConexion(conexionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConexionsSeleccionados() throws Exception {
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();		
		
		conexionsSeleccionados=this.getConexionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conexion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("conexions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("conexion");
			//elementRoot.appendChild(element);
		
			for(Conexion conexionAux:conexionsSeleccionados) {
				element = document.createElement("conexion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConexion(conexionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConexion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConexionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConexionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConexionConstantesFunciones.LABEL_IDTIPOCONEXION);
		cell = row.createCell(iColumn++);cell.setCellValue(ConexionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConexionConstantesFunciones.LABEL_NOMBREMAQUINA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConexion(Conexion conexion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(conexion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(conexion.gettipoconexion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conexion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(conexion.getnombre_maquina());				
	}
	
	public void setFilaDatosExportarXmlConexion(Conexion conexion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConexionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(conexion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConexionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(conexion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipoconexion_descripcion = document.createElement(ConexionConstantesFunciones.IDTIPOCONEXION);
		elementtipoconexion_descripcion.appendChild(document.createTextNode(conexion.gettipoconexion_descripcion()));
		element.appendChild(elementtipoconexion_descripcion);

		Element elementnombre = document.createElement(ConexionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(conexion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_maquina = document.createElement(ConexionConstantesFunciones.NOMBREMAQUINA);
		elementnombre_maquina.appendChild(document.createTextNode(conexion.getnombre_maquina().trim()));
		element.appendChild(elementnombre_maquina);
	}
	
	public void generarReporteGroupGenericoConexionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Conexion> conexionsSeleccionados=new ArrayList<Conexion>();
		
		conexionsSeleccionados=this.getConexionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConexion(conexionsSeleccionados);
		
		this.generarReporteConexions("Todos",conexionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConexion(ArrayList<Conexion> conexionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Conexion conexionAux:conexionsSeleccionados) {
				conexionAux.setsDetalleGeneralEntityReporte(conexionAux.toString());
			
				if(sTipoSeleccionar.equals(ConexionConstantesFunciones.LABEL_IDTIPOCONEXION)) {
					existe=true;
					conexionAux.setsDescripcionGeneralEntityReporte1(conexionAux.gettipoconexion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConexionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					conexionAux.setsDescripcionGeneralEntityReporte1(conexionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ConexionConstantesFunciones.LABEL_NOMBREMAQUINA)) {
					existe=true;
					conexionAux.setsDescripcionGeneralEntityReporte1(conexionAux.getnombre_maquina());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConexion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConexion=true;
				this.isVisibilidadCeldaNuevoRelacionesConexion=true;
				this.isVisibilidadCeldaGuardarCambiosConexion=true;
			}
			
			this.isVisibilidadCeldaModificarConexion=false;
			this.isVisibilidadCeldaActualizarConexion=false;
			this.isVisibilidadCeldaEliminarConexion=false;
			this.isVisibilidadCeldaCancelarConexion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarConexion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesConexion=false;
			this.isVisibilidadCeldaGuardarCambiosConexion=false;
			this.isVisibilidadCeldaModificarConexion=false;
			this.isVisibilidadCeldaActualizarConexion=true;
			this.isVisibilidadCeldaEliminarConexion=false;
			this.isVisibilidadCeldaCancelarConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarConexion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesConexion=false;
			this.isVisibilidadCeldaGuardarCambiosConexion=false;
			this.isVisibilidadCeldaModificarConexion=false;
			this.isVisibilidadCeldaActualizarConexion=true;
			this.isVisibilidadCeldaEliminarConexion=true;
			this.isVisibilidadCeldaCancelarConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarConexion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesConexion=false;
			this.isVisibilidadCeldaGuardarCambiosConexion=false;
			this.isVisibilidadCeldaModificarConexion=false;
			this.isVisibilidadCeldaActualizarConexion=true;
			this.isVisibilidadCeldaEliminarConexion=false;
			this.isVisibilidadCeldaCancelarConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConexion=false;
				} else {
					this.isVisibilidadCeldaGuardarConexion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConexion=true;
			this.isVisibilidadCeldaNuevoRelacionesConexion=true;
			this.isVisibilidadCeldaGuardarCambiosConexion=true;
			this.isVisibilidadCeldaModificarConexion=false;
			this.isVisibilidadCeldaActualizarConexion=false;
			this.isVisibilidadCeldaEliminarConexion=false;
			this.isVisibilidadCeldaCancelarConexion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarConexion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesConexion=false;
			this.isVisibilidadCeldaGuardarCambiosConexion=false;
			this.isVisibilidadCeldaActualizarConexion=false;
			this.isVisibilidadCeldaEliminarConexion=false;
			this.isVisibilidadCeldaCancelarConexion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConexion=false;
				} else {
					this.isVisibilidadCeldaGuardarConexion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesConexion=false;
			this.isVisibilidadCeldaGuardarCambiosConexion=false;
			this.isVisibilidadCeldaModificarConexion=true;
			this.isVisibilidadCeldaActualizarConexion=false;
			this.isVisibilidadCeldaEliminarConexion=false;
			this.isVisibilidadCeldaCancelarConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConexion=false;
				} else {
					this.isVisibilidadCeldaGuardarConexion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConexionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConexion=true;
			this.isVisibilidadCeldaNuevoRelacionesConexion=true;
			this.isVisibilidadCeldaGuardarCambiosConexion=true;
		} else {
			this.actualizarEstadoPanelsConexion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConexion=false;
			//this.isVisibilidadCeldaVerFormConexion=false;
			this.isVisibilidadCeldaDuplicarConexion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!conexionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConexion=false;
		} else {
			this.isVisibilidadCeldaNuevoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosConexion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(conexionSessionBean.getEsGuardarRelacionado()) {
			if(!conexionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConexion=false;												
			}
			
			this.jButtonCerrarConexion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConexion=false;
		}
		
		if(!this.permiteMantenimiento(this.conexion)) {
			this.isVisibilidadCeldaActualizarConexion=false;
			this.isVisibilidadCeldaEliminarConexion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConexion() {
		this.isVisibilidadCeldaNuevoConexion=false;
		this.isVisibilidadCeldaGuardarCambiosConexion=false;
	}
	
	public void actualizarEstadoPanelsConexion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConexion!=null) {
				this.jScrollPanelDatosEdicionConexion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConexion!=null) {
				this.jTabbedPaneBusquedasConexion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConexion!=null) {
				this.jScrollPanelDatosConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionConexion!=null) {
				this.jPanelPaginacionConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConexion!=null) {
				this.jPanelParametrosReportesConexion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConexion!=null) {
				this.jScrollPanelDatosEdicionConexion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConexion!=null) {
				this.jTabbedPaneBusquedasConexion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConexion!=null) {
				this.jScrollPanelDatosConexion.setVisible(false);
			}
			
			if(this.jPanelPaginacionConexion!=null) {
				this.jPanelPaginacionConexion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConexion!=null) {
				this.jPanelParametrosReportesConexion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConexion!=null) {
				this.jScrollPanelDatosEdicionConexion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConexion!=null) {
				this.jTabbedPaneBusquedasConexion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConexion!=null) {
				this.jScrollPanelDatosConexion.setVisible(false);
			}
			
			if(this.jPanelPaginacionConexion!=null) {
				this.jPanelPaginacionConexion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConexion!=null) {
				this.jPanelParametrosReportesConexion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConexion!=null) {
				this.jScrollPanelDatosEdicionConexion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConexion!=null) {
				this.jTabbedPaneBusquedasConexion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConexion!=null) {
				this.jScrollPanelDatosConexion.setVisible(false);
			}
			
			if(this.jPanelPaginacionConexion!=null) {
				this.jPanelPaginacionConexion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConexion!=null) {
				this.jPanelParametrosReportesConexion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConexion!=null) {
				this.jScrollPanelDatosEdicionConexion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConexion!=null) {
				this.jTabbedPaneBusquedasConexion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConexion!=null) {
				this.jScrollPanelDatosConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionConexion!=null) {
				this.jPanelPaginacionConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConexion!=null) {
				this.jPanelParametrosReportesConexion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConexion!=null) {
				this.jScrollPanelDatosEdicionConexion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConexion!=null) {
				this.jTabbedPaneBusquedasConexion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConexion!=null) {
				this.jScrollPanelDatosConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionConexion!=null) {
				this.jPanelPaginacionConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConexion!=null) {
				this.jPanelParametrosReportesConexion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConexion!=null) {
				this.jScrollPanelDatosEdicionConexion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConexion!=null) {
				this.jTabbedPaneBusquedasConexion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConexion!=null) {
				this.jScrollPanelDatosConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionConexion!=null) {
				this.jPanelPaginacionConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConexion!=null) {
				this.jPanelParametrosReportesConexion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.conexionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConexion!=null) {
					this.jTabbedPaneBusquedasConexion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConexion!=null) {
				this.jPanelParametrosReportesConexion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.conexionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConexion!=null) {
				this.jTabbedPaneBusquedasConexion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConexion!=null) {
				this.jPanelParametrosReportesConexion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoConexion(Boolean isParaTipoConexion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoConexionNegation=!isParaTipoConexion;

			this.isVisibilidadFK_IdTipoConexion=isParaTipoConexion;
			if(!this.isVisibilidadFK_IdTipoConexion) {this.jTabbedPaneBusquedasConexion.remove(jPanelFK_IdTipoConexionConexion);}
		}
		
	}
	
	

	public String registrarSesionConexionParaTarjetaCreditoConexiones() throws Exception {
		Boolean isPaginaPopupTarjetaCreditoConexion=false;

		try {

			if(this.conexionSessionBean==null) {
				this.conexionSessionBean=new ConexionSessionBean();
			}

			if(this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionSessionBean==null) {
				this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
			}

			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionSessionBean.setsPathNavegacionActual(conexionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTarjetaCreditoConexion=this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTarjetaCreditoConexion(true);
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTarjetaCreditoConexion(ConexionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionSessionBean.setisBusquedaDesdeForeignKeySesionConexion(true);
			this.jInternalFrameDetalleFormConexion.tarjetacreditoconexionSessionBean.setlidConexionActual(this.idConexionActual);

			conexionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConexion(true);
			conexionSessionBean.setlIdConexionActualForeignKey(this.idConexionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionConexionParaNumeroRecapes() throws Exception {
		Boolean isPaginaPopupNumeroRecap=false;

		try {

			if(this.conexionSessionBean==null) {
				this.conexionSessionBean=new ConexionSessionBean();
			}

			if(this.jInternalFrameDetalleFormConexion.numerorecapSessionBean==null) {
				this.jInternalFrameDetalleFormConexion.numerorecapSessionBean=new NumeroRecapSessionBean();
			}

			this.jInternalFrameDetalleFormConexion.numerorecapSessionBean.setsPathNavegacionActual(conexionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+NumeroRecapConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormConexion.numerorecapSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupNumeroRecap=this.jInternalFrameDetalleFormConexion.numerorecapSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormConexion.numerorecapSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeNumeroRecap(true);
			this.jInternalFrameDetalleFormConexion.numerorecapSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeNumeroRecap(ConexionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormConexion.numerorecapSessionBean.setisBusquedaDesdeForeignKeySesionConexion(true);
			this.jInternalFrameDetalleFormConexion.numerorecapSessionBean.setlidConexionActual(this.idConexionActual);

			conexionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConexion(true);
			conexionSessionBean.setlIdConexionActualForeignKey(this.idConexionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionConexionParaFormaPagoPuntoVentaes() throws Exception {
		Boolean isPaginaPopupFormaPagoPuntoVenta=false;

		try {

			if(this.conexionSessionBean==null) {
				this.conexionSessionBean=new ConexionSessionBean();
			}

			if(this.jInternalFrameDetalleFormConexion.formapagopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormConexion.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormConexion.formapagopuntoventaSessionBean.setsPathNavegacionActual(conexionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormaPagoPuntoVenta=this.jInternalFrameDetalleFormConexion.formapagopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(true);
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(ConexionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionConexion(true);
			this.jInternalFrameDetalleFormConexion.formapagopuntoventaSessionBean.setlidConexionActual(this.idConexionActual);

			conexionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConexion(true);
			conexionSessionBean.setlIdConexionActualForeignKey(this.idConexionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ConexionSessionBean conexionSessionBean=new ConexionSessionBean();
		
		if(this.conexionSessionBean==null) {
			this.conexionSessionBean=new ConexionSessionBean();
		}
		
		this.conexionSessionBean.setsUltimaBusquedaConexion(this.getsAccionBusqueda());
		this.conexionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.conexionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdTipoConexion")) {
			conexionSessionBean.setid_tipo_conexion(this.getid_tipo_conexionFK_IdTipoConexion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ConexionSessionBean conexionSessionBean=new ConexionSessionBean();
		
		if(this.conexionSessionBean==null) {
			this.conexionSessionBean=new ConexionSessionBean();
		}
		
		if(this.conexionSessionBean.getsUltimaBusquedaConexion()!=null&&!this.conexionSessionBean.getsUltimaBusquedaConexion().equals("")) {
			this.setsAccionBusqueda(conexionSessionBean.getsUltimaBusquedaConexion());
			this.setiNumeroPaginacion(conexionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(conexionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdTipoConexion")) {
				this.setid_tipo_conexionFK_IdTipoConexion(conexionSessionBean.getid_tipo_conexion());
				conexionSessionBean.setid_tipo_conexion(-1L);
			}
		}
		
		this.conexionSessionBean.setsUltimaBusquedaConexion("");
		this.conexionSessionBean.setiNumeroPaginacion(ConexionConstantesFunciones.INUMEROPAGINACION);
		this.conexionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaConexion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConexion() {
		this.updateBorderResaltarBusquedasFormularioConexion();
		this.updateVisibilidadBusquedasFormularioConexion();
		this.updateHabilitarBusquedasFormularioConexion();
	}
	
	public void updateBorderResaltarBusquedasFormularioConexion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConexion.getComponents().length>0) {
	

		if(this.conexionConstantesFunciones.resaltarFK_IdTipoConexionConexion!=null) {
			index= this.jTabbedPaneBusquedasConexion.indexOfComponent(this.jPanelFK_IdTipoConexionConexion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConexion.getComponent(index);
				jPanel.setBorder(this.conexionConstantesFunciones.resaltarFK_IdTipoConexionConexion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConexion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConexion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConexion.indexOfComponent(this.jPanelFK_IdTipoConexionConexion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConexion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.conexionConstantesFunciones.mostrarFK_IdTipoConexionConexion);
			if(!this.conexionConstantesFunciones.mostrarFK_IdTipoConexionConexion && index>-1) {
				this.jTabbedPaneBusquedasConexion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConexion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConexion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConexion.indexOfComponent(this.jPanelFK_IdTipoConexionConexion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConexion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.conexionConstantesFunciones.activarFK_IdTipoConexionConexion);
				this.jTabbedPaneBusquedasConexion.setEnabledAt(index,this.conexionConstantesFunciones.activarFK_IdTipoConexionConexion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConexion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoConexion")) {
			index= this.jTabbedPaneBusquedasConexion.indexOfComponent(this.jPanelFK_IdTipoConexionConexion);

			this.jTabbedPaneBusquedasConexion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConexion.getComponent(index);

			this.conexionConstantesFunciones.setResaltarFK_IdTipoConexionConexion(resaltar);

			jPanel.setBorder(this.conexionConstantesFunciones.resaltarFK_IdTipoConexionConexion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConexion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConexion() throws Exception {

		if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConexion();
		this.updateVisibilidadResaltarControlesFormularioConexion();
		this.updateHabilitarResaltarControlesFormularioConexion();
		
	}
	
	public void updateBorderResaltarControlesFormularioConexion() throws Exception {
		if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.conexionConstantesFunciones.resaltaridConexion!=null && this.jInternalFrameDetalleFormConexion!=null) {this.jInternalFrameDetalleFormConexion.jLabelidConexion.setBorder(this.conexionConstantesFunciones.resaltaridConexion);}
		if(this.conexionConstantesFunciones.resaltarid_tipo_conexionConexion!=null && this.jInternalFrameDetalleFormConexion!=null) {this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.setBorder(this.conexionConstantesFunciones.resaltarid_tipo_conexionConexion);}
		if(this.conexionConstantesFunciones.resaltarnombreConexion!=null && this.jInternalFrameDetalleFormConexion!=null) {this.jInternalFrameDetalleFormConexion.jTextAreanombreConexion.setBorder(this.conexionConstantesFunciones.resaltarnombreConexion);}
		if(this.conexionConstantesFunciones.resaltarnombre_maquinaConexion!=null && this.jInternalFrameDetalleFormConexion!=null) {this.jInternalFrameDetalleFormConexion.jTextAreanombre_maquinaConexion.setBorder(this.conexionConstantesFunciones.resaltarnombre_maquinaConexion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConexion() throws Exception {		
		if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConexion!=null) {
	
		//this.jInternalFrameDetalleFormConexion.jLabelidConexion.setVisible(this.conexionConstantesFunciones.mostraridConexion);
		this.jInternalFrameDetalleFormConexion.jPanelidConexion.setVisible(this.conexionConstantesFunciones.mostraridConexion);
		//this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.setVisible(this.conexionConstantesFunciones.mostrarid_tipo_conexionConexion);
		this.jInternalFrameDetalleFormConexion.jPanelid_tipo_conexionConexion.setVisible(this.conexionConstantesFunciones.mostrarid_tipo_conexionConexion);
		//this.jInternalFrameDetalleFormConexion.jTextAreanombreConexion.setVisible(this.conexionConstantesFunciones.mostrarnombreConexion);
		this.jInternalFrameDetalleFormConexion.jPanelnombreConexion.setVisible(this.conexionConstantesFunciones.mostrarnombreConexion);
		//this.jInternalFrameDetalleFormConexion.jTextAreanombre_maquinaConexion.setVisible(this.conexionConstantesFunciones.mostrarnombre_maquinaConexion);
		this.jInternalFrameDetalleFormConexion.jPanelnombre_maquinaConexion.setVisible(this.conexionConstantesFunciones.mostrarnombre_maquinaConexion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConexion() throws Exception {
		if(this.jInternalFrameDetalleFormConexion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConexion!=null) {
	
		this.jInternalFrameDetalleFormConexion.jLabelidConexion.setEnabled(this.conexionConstantesFunciones.activaridConexion);
		this.jInternalFrameDetalleFormConexion.jComboBoxid_tipo_conexionConexion.setEnabled(this.conexionConstantesFunciones.activarid_tipo_conexionConexion);
		this.jInternalFrameDetalleFormConexion.jTextAreanombreConexion.setEnabled(this.conexionConstantesFunciones.activarnombreConexion);
		this.jInternalFrameDetalleFormConexion.jTextAreanombre_maquinaConexion.setEnabled(this.conexionConstantesFunciones.activarnombre_maquinaConexion);
		}
	}
	
		
}