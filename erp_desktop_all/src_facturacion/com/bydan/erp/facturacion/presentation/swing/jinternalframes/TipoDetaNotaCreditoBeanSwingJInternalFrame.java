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

import com.bydan.erp.facturacion.util.TipoDetaNotaCreditoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoDetaNotaCreditoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoDetaNotaCreditoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoDetaNotaCreditoBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoDetaNotaCreditoBeanSwingJInternalFrame extends TipoDetaNotaCreditoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDetaNotaCreditoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDetaNotaCredito> tipodetanotacreditoValidator = new ClassValidator<TipoDetaNotaCredito>(TipoDetaNotaCredito.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDetaNotaCredito tipodetanotacredito;	
	public TipoDetaNotaCredito tipodetanotacreditoAux;
	public TipoDetaNotaCredito tipodetanotacreditoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDetaNotaCredito tipodetanotacreditoTotales;
	public Long idTipoDetaNotaCreditoActual;
	public Long iIdNuevoTipoDetaNotaCredito=0L;
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
	
	public Boolean isPermisoTodoTipoDetaNotaCredito;
	public Boolean isPermisoNuevoTipoDetaNotaCredito;
	public Boolean isPermisoActualizarTipoDetaNotaCredito;
	public Boolean isPermisoActualizarOriginalTipoDetaNotaCredito;
	public Boolean isPermisoEliminarTipoDetaNotaCredito;
	public Boolean isPermisoGuardarCambiosTipoDetaNotaCredito;
	public Boolean isPermisoConsultaTipoDetaNotaCredito;
	public Boolean isPermisoBusquedaTipoDetaNotaCredito;
	public Boolean isPermisoReporteTipoDetaNotaCredito;
	public Boolean isPermisoPaginacionMedioTipoDetaNotaCredito;
	public Boolean isPermisoPaginacionAltoTipoDetaNotaCredito;
	public Boolean isPermisoPaginacionTodoTipoDetaNotaCredito;
	public Boolean isPermisoCopiarTipoDetaNotaCredito;
	public Boolean isPermisoVerFormTipoDetaNotaCredito;
	public Boolean isPermisoDuplicarTipoDetaNotaCredito;
	public Boolean isPermisoOrdenTipoDetaNotaCredito;
	
	
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
	
	public TipoDetaNotaCreditoParameterReturnGeneral tipodetanotacreditoReturnGeneral;
	public TipoDetaNotaCreditoParameterReturnGeneral tipodetanotacreditoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDetaNotaCredito=false;
	public Boolean esParaAccionDesdeFormularioTipoDetaNotaCredito=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoDetaNotaCreditoSessionBeanAdditional tipodetanotacreditoSessionBeanAdditional=null;
	
	public TipoDetaNotaCreditoSessionBeanAdditional getTipoDetaNotaCreditoSessionBeanAdditional() {
		return this.tipodetanotacreditoSessionBeanAdditional;
	}
	
	public void setTipoDetaNotaCreditoSessionBeanAdditional(TipoDetaNotaCreditoSessionBeanAdditional tipodetanotacreditoSessionBeanAdditional) {
		try {
			this.tipodetanotacreditoSessionBeanAdditional=tipodetanotacreditoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional tipodetanotacreditoBeanSwingJInternalFrameAdditional=null;
	//public class TipoDetaNotaCreditoBeanSwingJInternalFrame
	
	public TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional getTipoDetaNotaCreditoBeanSwingJInternalFrameAdditional() {
		return this.tipodetanotacreditoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoDetaNotaCreditoBeanSwingJInternalFrameAdditional(TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional tipodetanotacreditoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipodetanotacreditoBeanSwingJInternalFrameAdditional=tipodetanotacreditoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDetaNotaCreditoLogic tipodetanotacreditoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDetaNotaCredito tipodetanotacreditoBean;
	public TipoDetaNotaCreditoConstantesFunciones tipodetanotacreditoConstantesFunciones;
	//public TipoDetaNotaCreditoParameterReturnGeneral tipodetanotacreditoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDetaNotaCredito> tipodetanotacreditos;	
	//public List<TipoDetaNotaCredito> tipodetanotacreditosEliminados;
	//public List<TipoDetaNotaCredito> tipodetanotacreditosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDetaNotaCredito=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDetaNotaCredito=true;
	public Boolean isVisibilidadCeldaCopiarTipoDetaNotaCredito=true;
	public Boolean isVisibilidadCeldaVerFormTipoDetaNotaCredito=true;
	public Boolean isVisibilidadCeldaOrdenTipoDetaNotaCredito=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=false;
	public Boolean isVisibilidadCeldaModificarTipoDetaNotaCredito=false;
	public Boolean isVisibilidadCeldaActualizarTipoDetaNotaCredito=false;
	public Boolean isVisibilidadCeldaEliminarTipoDetaNotaCredito=false;
	public Boolean isVisibilidadCeldaCancelarTipoDetaNotaCredito=false;
	public Boolean isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoDetaNotaCredito() {
		return this.iIdNuevoTipoDetaNotaCredito;
	}

	public void setiIdNuevoTipoDetaNotaCredito(Long iIdNuevoTipoDetaNotaCredito) {
		this.iIdNuevoTipoDetaNotaCredito = iIdNuevoTipoDetaNotaCredito;
	}
	
	public Long getidTipoDetaNotaCreditoActual() {
		return this.idTipoDetaNotaCreditoActual;
	}

	public void setidTipoDetaNotaCreditoActual(Long idTipoDetaNotaCreditoActual) {
		this.idTipoDetaNotaCreditoActual = idTipoDetaNotaCreditoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDetaNotaCredito gettipodetanotacredito() {
		return this.tipodetanotacredito;
	}

	public void settipodetanotacredito(TipoDetaNotaCredito tipodetanotacredito) {
		this.tipodetanotacredito = tipodetanotacredito;
	}
	
	public TipoDetaNotaCredito gettipodetanotacreditoAux() {
		return this.tipodetanotacreditoAux;
	}

	public void settipodetanotacreditoAux(TipoDetaNotaCredito tipodetanotacreditoAux) {
		this.tipodetanotacreditoAux = tipodetanotacreditoAux;
	}				
	
	public TipoDetaNotaCredito gettipodetanotacreditoAnterior() {
		return this.tipodetanotacreditoAnterior;
	}

	public void settipodetanotacreditoAnterior(TipoDetaNotaCredito tipodetanotacreditoAnterior) {
		this.tipodetanotacreditoAnterior = tipodetanotacreditoAnterior;
	}	
	
	public TipoDetaNotaCredito gettipodetanotacreditoTotales() {
		return this.tipodetanotacreditoTotales;
	}

	public void settipodetanotacreditoTotales(TipoDetaNotaCredito tipodetanotacreditoTotales) {
		this.tipodetanotacreditoTotales = tipodetanotacreditoTotales;
	}	
	
	public TipoDetaNotaCredito gettipodetanotacreditoBean() {
		return this.tipodetanotacreditoBean;
	}

	public void settipodetanotacreditoBean(TipoDetaNotaCredito tipodetanotacreditoBean) {
		this.tipodetanotacreditoBean = tipodetanotacreditoBean;
	}	
	
	public TipoDetaNotaCreditoParameterReturnGeneral gettipodetanotacreditoReturnGeneral() {
		return this.tipodetanotacreditoReturnGeneral;
	}

	public void settipodetanotacreditoReturnGeneral(TipoDetaNotaCreditoParameterReturnGeneral tipodetanotacreditoReturnGeneral) {
		this.tipodetanotacreditoReturnGeneral = tipodetanotacreditoReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoDetaNotaCreditoLogic getTipoDetaNotaCreditoLogic()	{		
		return tipodetanotacreditoLogic;
	}

	public void setTipoDetaNotaCreditoLogic(TipoDetaNotaCreditoLogic tipodetanotacreditoLogic) {
		this.tipodetanotacreditoLogic = tipodetanotacreditoLogic;
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
	
	public Boolean getIsEsNuevoTipoDetaNotaCredito() {
		return isEsNuevoTipoDetaNotaCredito;
	}

	public void setIsEsNuevoTipoDetaNotaCredito(Boolean isEsNuevoTipoDetaNotaCredito) {
		this.isEsNuevoTipoDetaNotaCredito = isEsNuevoTipoDetaNotaCredito;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDetaNotaCredito() {
		return esParaAccionDesdeFormularioTipoDetaNotaCredito;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDetaNotaCredito(Boolean esParaAccionDesdeFormularioTipoDetaNotaCredito) {
		this.esParaAccionDesdeFormularioTipoDetaNotaCredito = esParaAccionDesdeFormularioTipoDetaNotaCredito;
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

			if(this.tipodetanotacreditoSessionBean==null) {
				this.tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean();
			}

			if(!this.tipodetanotacreditoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipodetanotacreditoSessionBean.getlidEmpresaActual());
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

					if(this.tipodetanotacredito!=null) {
						this.tipodetanotacredito.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
						this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoDetaNotaCredito.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
						if(this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoDetaNotaCreditoGenerico)throws Exception
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
				jComboBoxid_empresaTipoDetaNotaCreditoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoDetaNotaCreditoGenerico!=null && jComboBoxid_empresaTipoDetaNotaCreditoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoDetaNotaCreditoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoDetaNotaCredito tipodetanotacredito,JComboBox jComboBoxid_empresaTipoDetaNotaCreditoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoDetaNotaCreditoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoDetaNotaCreditoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipodetanotacredito.setid_empresa(empresaAux.getId());
				tipodetanotacredito.setempresa_descripcion(TipoDetaNotaCreditoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipodetanotacredito.setEmpresa(empresaAux);			}
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

					if(!TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { 
							this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { 
					}

					if(!TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
							this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
							this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoDetaNotaCredito() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDetaNotaCreditoConstantesFunciones.refrescarForeignKeysDescripcionesTipoDetaNotaCredito(this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDetaNotaCreditoConstantesFunciones.refrescarForeignKeysDescripcionesTipoDetaNotaCredito(this.tipodetanotacreditos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodetanotacreditoLogic.setTipoDetaNotaCreditos(this.tipodetanotacreditos);
			tipodetanotacreditoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDetaNotaCreditoParameterReturnGeneral getTipoDetaNotaCreditoParameterGeneral() {
		return this.tipodetanotacreditoParameterGeneral;
	}
	
	public void setTipoDetaNotaCreditoParameterGeneral(TipoDetaNotaCreditoParameterReturnGeneral tipodetanotacreditoParameterGeneral) {
		this.tipodetanotacreditoParameterGeneral = tipodetanotacreditoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDetaNotaCredito() {
		return isPermisoTodoTipoDetaNotaCredito;
	}

	public void setIsPermisoTodoTipoDetaNotaCredito(Boolean isPermisoTodoTipoDetaNotaCredito) {
		this.isPermisoTodoTipoDetaNotaCredito = isPermisoTodoTipoDetaNotaCredito;
	}

	public Boolean getIsPermisoNuevoTipoDetaNotaCredito() {
		return isPermisoNuevoTipoDetaNotaCredito;
	}

	public void setIsPermisoNuevoTipoDetaNotaCredito(Boolean isPermisoNuevoTipoDetaNotaCredito) {
		this.isPermisoNuevoTipoDetaNotaCredito = isPermisoNuevoTipoDetaNotaCredito;
	}

	public Boolean getIsPermisoActualizarTipoDetaNotaCredito() {
		return isPermisoActualizarTipoDetaNotaCredito;
	}

	public void setIsPermisoActualizarTipoDetaNotaCredito(Boolean isPermisoActualizarTipoDetaNotaCredito) {
		this.isPermisoActualizarTipoDetaNotaCredito = isPermisoActualizarTipoDetaNotaCredito;
	}

	public Boolean getIsPermisoEliminarTipoDetaNotaCredito() {
		return isPermisoEliminarTipoDetaNotaCredito;
	}

	public void setIsPermisoEliminarTipoDetaNotaCredito(Boolean isPermisoEliminarTipoDetaNotaCredito) {
		this.isPermisoEliminarTipoDetaNotaCredito = isPermisoEliminarTipoDetaNotaCredito;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDetaNotaCredito() {
		return isPermisoGuardarCambiosTipoDetaNotaCredito;
	}

	public void setIsPermisoGuardarCambiosTipoDetaNotaCredito(Boolean isPermisoGuardarCambiosTipoDetaNotaCredito) {
		this.isPermisoGuardarCambiosTipoDetaNotaCredito = isPermisoGuardarCambiosTipoDetaNotaCredito;
	}
	
	public Boolean getIsPermisoConsultaTipoDetaNotaCredito() {
		return isPermisoConsultaTipoDetaNotaCredito;
	}

	public void setIsPermisoConsultaTipoDetaNotaCredito(Boolean isPermisoConsultaTipoDetaNotaCredito) {
		this.isPermisoConsultaTipoDetaNotaCredito = isPermisoConsultaTipoDetaNotaCredito;
	}

	public Boolean getIsPermisoBusquedaTipoDetaNotaCredito() {
		return isPermisoBusquedaTipoDetaNotaCredito;
	}

	public void setIsPermisoBusquedaTipoDetaNotaCredito(Boolean isPermisoBusquedaTipoDetaNotaCredito) {
		this.isPermisoBusquedaTipoDetaNotaCredito = isPermisoBusquedaTipoDetaNotaCredito;
	}

	public Boolean getIsPermisoReporteTipoDetaNotaCredito() {
		return isPermisoReporteTipoDetaNotaCredito;
	}

	public void setIsPermisoReporteTipoDetaNotaCredito(Boolean isPermisoReporteTipoDetaNotaCredito) {
		this.isPermisoReporteTipoDetaNotaCredito = isPermisoReporteTipoDetaNotaCredito;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDetaNotaCredito() {
		return isPermisoPaginacionMedioTipoDetaNotaCredito;
	}

	public void setIsPermisoPaginacionMedioTipoDetaNotaCredito(Boolean isPermisoPaginacionMedioTipoDetaNotaCredito) {
		this.isPermisoPaginacionMedioTipoDetaNotaCredito = isPermisoPaginacionMedioTipoDetaNotaCredito;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDetaNotaCredito() {
		return isPermisoPaginacionTodoTipoDetaNotaCredito;
	}

	public void setIsPermisoPaginacionTodoTipoDetaNotaCredito(Boolean isPermisoPaginacionTodoTipoDetaNotaCredito) {
		this.isPermisoPaginacionTodoTipoDetaNotaCredito = isPermisoPaginacionTodoTipoDetaNotaCredito;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDetaNotaCredito() {
		return isPermisoPaginacionAltoTipoDetaNotaCredito;
	}

	public void setIsPermisoPaginacionAltoTipoDetaNotaCredito(Boolean isPermisoPaginacionAltoTipoDetaNotaCredito) {
		this.isPermisoPaginacionAltoTipoDetaNotaCredito = isPermisoPaginacionAltoTipoDetaNotaCredito;
	}
	
	public Boolean getIsPermisoCopiarTipoDetaNotaCredito() {
		return isPermisoCopiarTipoDetaNotaCredito;
	}

	public void setIsPermisoCopiarTipoDetaNotaCredito(Boolean isPermisoCopiarTipoDetaNotaCredito) {
		this.isPermisoCopiarTipoDetaNotaCredito = isPermisoCopiarTipoDetaNotaCredito;
	}
	
	public Boolean getIsPermisoVerFormTipoDetaNotaCredito() {
		return isPermisoVerFormTipoDetaNotaCredito;
	}

	public void setIsPermisoVerFormTipoDetaNotaCredito(Boolean isPermisoVerFormTipoDetaNotaCredito) {
		this.isPermisoVerFormTipoDetaNotaCredito = isPermisoVerFormTipoDetaNotaCredito;
	}
	
	public Boolean getIsPermisoDuplicarTipoDetaNotaCredito() {
		return isPermisoDuplicarTipoDetaNotaCredito;
	}

	public void setIsPermisoDuplicarTipoDetaNotaCredito(Boolean isPermisoDuplicarTipoDetaNotaCredito) {
		this.isPermisoDuplicarTipoDetaNotaCredito = isPermisoDuplicarTipoDetaNotaCredito;
	}
	
	public Boolean getIsPermisoOrdenTipoDetaNotaCredito() {
		return isPermisoOrdenTipoDetaNotaCredito;
	}

	public void setIsPermisoOrdenTipoDetaNotaCredito(Boolean isPermisoOrdenTipoDetaNotaCredito) {
		this.isPermisoOrdenTipoDetaNotaCredito = isPermisoOrdenTipoDetaNotaCredito;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDetaNotaCredito() {
		return isVisibilidadCeldaNuevoTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaNuevoTipoDetaNotaCredito(Boolean isVisibilidadCeldaNuevoTipoDetaNotaCredito) {
		this.isVisibilidadCeldaNuevoTipoDetaNotaCredito = isVisibilidadCeldaNuevoTipoDetaNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDetaNotaCredito() {
		return isVisibilidadCeldaDuplicarTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDetaNotaCredito(Boolean isVisibilidadCeldaDuplicarTipoDetaNotaCredito) {
		this.isVisibilidadCeldaDuplicarTipoDetaNotaCredito = isVisibilidadCeldaDuplicarTipoDetaNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDetaNotaCredito() {
		return isVisibilidadCeldaCopiarTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaCopiarTipoDetaNotaCredito(Boolean isVisibilidadCeldaCopiarTipoDetaNotaCredito) {
		this.isVisibilidadCeldaCopiarTipoDetaNotaCredito = isVisibilidadCeldaCopiarTipoDetaNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDetaNotaCredito() {
		return isVisibilidadCeldaVerFormTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaVerFormTipoDetaNotaCredito(Boolean isVisibilidadCeldaVerFormTipoDetaNotaCredito) {
		this.isVisibilidadCeldaVerFormTipoDetaNotaCredito = isVisibilidadCeldaVerFormTipoDetaNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDetaNotaCredito() {
		return isVisibilidadCeldaOrdenTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaOrdenTipoDetaNotaCredito(Boolean isVisibilidadCeldaOrdenTipoDetaNotaCredito) {
		this.isVisibilidadCeldaOrdenTipoDetaNotaCredito = isVisibilidadCeldaOrdenTipoDetaNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito() {
		return isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito(Boolean isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito = isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDetaNotaCredito() {
		return isVisibilidadCeldaModificarTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaModificarTipoDetaNotaCredito(Boolean isVisibilidadCeldaModificarTipoDetaNotaCredito) {
		this.isVisibilidadCeldaModificarTipoDetaNotaCredito = isVisibilidadCeldaModificarTipoDetaNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDetaNotaCredito() {
		return isVisibilidadCeldaActualizarTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaActualizarTipoDetaNotaCredito(Boolean isVisibilidadCeldaActualizarTipoDetaNotaCredito) {
		this.isVisibilidadCeldaActualizarTipoDetaNotaCredito = isVisibilidadCeldaActualizarTipoDetaNotaCredito;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDetaNotaCredito() {
		return isVisibilidadCeldaEliminarTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaEliminarTipoDetaNotaCredito(Boolean isVisibilidadCeldaEliminarTipoDetaNotaCredito) {
		this.isVisibilidadCeldaEliminarTipoDetaNotaCredito = isVisibilidadCeldaEliminarTipoDetaNotaCredito;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDetaNotaCredito() {
		return isVisibilidadCeldaCancelarTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaCancelarTipoDetaNotaCredito(Boolean isVisibilidadCeldaCancelarTipoDetaNotaCredito) {
		this.isVisibilidadCeldaCancelarTipoDetaNotaCredito = isVisibilidadCeldaCancelarTipoDetaNotaCredito;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDetaNotaCredito() {
		return isVisibilidadCeldaGuardarTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaGuardarTipoDetaNotaCredito(Boolean isVisibilidadCeldaGuardarTipoDetaNotaCredito) {
		this.isVisibilidadCeldaGuardarTipoDetaNotaCredito = isVisibilidadCeldaGuardarTipoDetaNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito() {
		return isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito(Boolean isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito) {
		this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito = isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito;
	}
		
	public TipoDetaNotaCreditoSessionBean gettipodetanotacreditoSessionBean() {
		return this.tipodetanotacreditoSessionBean;
	}
	
	public void settipodetanotacreditoSessionBean(TipoDetaNotaCreditoSessionBean tipodetanotacreditoSessionBean) {
		this.tipodetanotacreditoSessionBean=tipodetanotacreditoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipodetanotacredito,null);
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
	
	public void bugActualizarReferenciaActual(TipoDetaNotaCredito tipodetanotacredito,TipoDetaNotaCredito tipodetanotacreditoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDetaNotaCredito(tipodetanotacredito);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodetanotacreditoAux.setId(tipodetanotacredito.getId());
		tipodetanotacreditoAux.setVersionRow(tipodetanotacredito.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDetaNotaCredito();
		
			int intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.tipodetanotacredito,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodetanotacreditoValidator.getInvalidValues(this.tipodetanotacredito);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodetanotacreditoLogic.setDatosCliente(datosCliente);
			tipodetanotacreditoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodetanotacreditoAux=new  TipoDetaNotaCredito();
				
				tipodetanotacreditoAux.setIsNew(true);
				tipodetanotacreditoAux.setIsChanged(true);
				
				tipodetanotacreditoAux.setTipoDetaNotaCreditoOriginal(this.tipodetanotacredito);
				
				tipodetanotacreditoAux.setId(this.tipodetanotacredito.getId());	
				tipodetanotacreditoAux.setVersionRow(this.tipodetanotacredito.getVersionRow());	
				tipodetanotacreditoAux.setid_empresa(this.tipodetanotacredito.getid_empresa());	
				tipodetanotacreditoAux.setcodigo(this.tipodetanotacredito.getcodigo());	
				tipodetanotacreditoAux.setnombre(this.tipodetanotacredito.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodetanotacreditoAux,tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetanotacreditoAux,tipodetanotacreditos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditoLogic.saveTipoDetaNotaCreditos();//WithConnection
						//tipodetanotacreditoLogic.getSetVersionRowTipoDetaNotaCreditos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodetanotacredito,tipodetanotacreditoAux);
					
					this.refrescarForeignKeysDescripcionesTipoDetaNotaCredito();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodetanotacreditoLogic.saveTipoDetaNotaCreditoRelaciones(tipodetanotacreditoAux);//WithConnection
								//tipodetanotacreditoLogic.getSetVersionRowTipoDetaNotaCreditos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipodetanotacredito,tipodetanotacreditoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipodetanotacreditoAux,tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipodetanotacreditoAux,tipodetanotacreditos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipodetanotacredito,tipodetanotacreditoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodetanotacreditoAux=new  TipoDetaNotaCredito();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado() && this.tipodetanotacredito.getId()>=0)) {
						
					tipodetanotacreditoAux.setIsNew(false);
				}
				
				tipodetanotacreditoAux.setIsDeleted(false);
			
				tipodetanotacreditoAux.setId(this.tipodetanotacredito.getId());	
				tipodetanotacreditoAux.setVersionRow(this.tipodetanotacredito.getVersionRow());	
				tipodetanotacreditoAux.setid_empresa(this.tipodetanotacredito.getid_empresa());	
				tipodetanotacreditoAux.setcodigo(this.tipodetanotacredito.getcodigo());	
				tipodetanotacreditoAux.setnombre(this.tipodetanotacredito.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodetanotacreditoAux,tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetanotacreditoAux,tipodetanotacreditos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditoLogic.saveTipoDetaNotaCreditos();//WithConnection
						//tipodetanotacreditoLogic.getSetVersionRowTipoDetaNotaCreditos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodetanotacredito,tipodetanotacreditoAux);
					
					this.refrescarForeignKeysDescripcionesTipoDetaNotaCredito();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodetanotacreditoLogic.saveTipoDetaNotaCreditoRelaciones(tipodetanotacreditoAux);//WithConnection
								//tipodetanotacreditoLogic.getSetVersionRowTipoDetaNotaCreditos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipodetanotacredito,tipodetanotacreditoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipodetanotacreditoAux,tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipodetanotacreditoAux,tipodetanotacreditos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipodetanotacredito,tipodetanotacreditoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodetanotacreditoAux=new  TipoDetaNotaCredito();
				
				tipodetanotacreditoAux.setIsNew(false);
				tipodetanotacreditoAux.setIsChanged(false);
				
				tipodetanotacreditoAux.setIsDeleted(true);
				
				tipodetanotacreditoAux.setId(this.tipodetanotacredito.getId());	
				tipodetanotacreditoAux.setVersionRow(this.tipodetanotacredito.getVersionRow());	
				tipodetanotacreditoAux.setid_empresa(this.tipodetanotacredito.getid_empresa());	
				tipodetanotacreditoAux.setcodigo(this.tipodetanotacredito.getcodigo());	
				tipodetanotacreditoAux.setnombre(this.tipodetanotacredito.getnombre());	
				
				if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodetanotacreditoAux.getId()>=0) {	
						this.tipodetanotacreditosEliminados.add(tipodetanotacreditoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodetanotacreditoAux,tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetanotacreditoAux,tipodetanotacreditos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditoLogic.saveTipoDetaNotaCreditos();//WithConnection
						//tipodetanotacreditoLogic.getSetVersionRowTipoDetaNotaCreditos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodetanotacreditoLogic.saveTipoDetaNotaCreditoRelaciones(tipodetanotacreditoAux);//WithConnection
								//tipodetanotacreditoLogic.getSetVersionRowTipoDetaNotaCreditos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipodetanotacreditoAux,tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipodetanotacreditoAux,tipodetanotacreditos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().addAll(this.tipodetanotacreditosEliminados);
					
					tipodetanotacreditoLogic.saveTipoDetaNotaCreditos();//WithConnection
					//tipodetanotacreditoLogic.getSetVersionRowTipoDetaNotaCreditos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDetaNotaCredito();
				
				this.tipodetanotacreditosEliminados= new ArrayList<TipoDetaNotaCredito>();		
			}
			
			if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Detalle Nota Credito GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Detalle Nota Credito",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodetanotacredito=tipodetanotacreditoAux;
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
      		//this.finishProcessTipoDetaNotaCredito();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDetaNotaCredito tipodetanotacreditoLocal) throws Exception {
		
		if(this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDetaNotaCredito tipodetanotacreditoLocal) throws Exception {	
		if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipodetanotacreditoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDetaNotaCreditoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodetanotacreditoValidator.getInvalidValues(this.tipodetanotacredito);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDetaNotaCredito tipodetanotacredito,List<TipoDetaNotaCredito> tipodetanotacreditos) throws Exception {
		try	{		
			TipoDetaNotaCreditoConstantesFunciones.actualizarLista(tipodetanotacredito,tipodetanotacreditos,this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDetaNotaCredito tipodetanotacredito,List<TipoDetaNotaCredito> tipodetanotacreditos) throws Exception {
		try	{			
			TipoDetaNotaCreditoConstantesFunciones.actualizarSelectedLista(tipodetanotacredito,tipodetanotacreditos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDetaNotaCredito> tipodetanotacreditosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodetanotacreditosLocal=this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodetanotacreditosLocal=this.tipodetanotacreditos;
			}
			//ARCHITECTURE
		
			for(TipoDetaNotaCredito tipodetanotacreditoLocal:tipodetanotacreditosLocal) {
				if(this.permiteMantenimiento(tipodetanotacreditoLocal) && tipodetanotacreditoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDetaNotaCreditoConstantesFunciones.getTipoDetaNotaCreditoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDetaNotaCreditoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelid_empresaTipoDetaNotaCredito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDetaNotaCreditoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelcodigoTipoDetaNotaCredito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDetaNotaCreditoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelnombreTipoDetaNotaCredito,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelid_empresaTipoDetaNotaCredito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelcodigoTipoDetaNotaCredito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelnombreTipoDetaNotaCredito,"");
		
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
		this.iIdNuevoTipoDetaNotaCredito--;	
		
		
		this.tipodetanotacreditoAux=new TipoDetaNotaCredito();
		
		this.tipodetanotacreditoAux.setId(this.iIdNuevoTipoDetaNotaCredito);
		this.tipodetanotacreditoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().add(this.tipodetanotacreditoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodetanotacreditos.add(this.tipodetanotacreditoAux);
		}
		//ARCHITECTURE
		
		this.tipodetanotacredito=this.tipodetanotacreditoAux;
		
		if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDetaNotaCredito(this.tipodetanotacredito);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDetaNotaCredito(this.tipodetanotacredito);
		}
				
		//this.setDefaultControlesTipoDetaNotaCredito();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDetaNotaCredito();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDetaNotaCredito();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetaNotaCredito();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDetaNotaCredito(this.tipodetanotacreditoBean,this.tipodetanotacredito,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
			classes=TipoDetaNotaCreditoConstantesFunciones.getClassesRelationshipsOfTipoDetaNotaCredito(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodetanotacreditoReturnGeneral=tipodetanotacreditoLogic.procesarEventosTipoDetaNotaCreditosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos(),this.tipodetanotacredito,this.tipodetanotacreditoParameterGeneral,this.isEsNuevoTipoDetaNotaCredito,classes);//this.tipodetanotacreditoLogic.getTipoDetaNotaCredito()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDetaNotaCredito(this.tipodetanotacreditoReturnGeneral,this.tipodetanotacreditoBean,false);
		
		if(this.tipodetanotacreditoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDetaNotaCredito(this.tipodetanotacreditoReturnGeneral.getTipoDetaNotaCredito());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDetaNotaCredito(this.tipodetanotacreditoReturnGeneral.getTipoDetaNotaCredito());
		}
		
		if(this.tipodetanotacreditoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDetaNotaCredito(this.tipodetanotacreditoReturnGeneral.getTipoDetaNotaCredito(),classes);//this.tipodetanotacreditoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.tipodetanotacredito,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDetaNotaCredito();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDetaNotaCredito();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.RecargarFormTipoDetaNotaCredito(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDetaNotaCredito(false);
						
			if(tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetaNotaCredito();
			}
			
			this.actualizarVisualTableDatosTipoDetaNotaCredito();
			
			this.jTableDatosTipoDetaNotaCredito.setRowSelectionInterval(this.getIndiceNuevoTipoDetaNotaCredito(), this.getIndiceNuevoTipoDetaNotaCredito());
			
			this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
						
			this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDetaNotaCredito(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextFieldcodigoTipoDetaNotaCredito.setEnabled(isHabilitar && this.tipodetanotacreditoConstantesFunciones.activarcodigoTipoDetaNotaCredito);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextAreanombreTipoDetaNotaCredito.setEnabled(isHabilitar && this.tipodetanotacreditoConstantesFunciones.activarnombreTipoDetaNotaCredito);	
		//
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.setEnabled(isHabilitar && this.tipodetanotacreditoConstantesFunciones.activarid_empresaTipoDetaNotaCredito);
	};
	
	public void setDefaultControlesTipoDetaNotaCredito() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDetaNotaCredito(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodetanotacreditoSessionBean.setConGuardarRelaciones(true);			
			this.tipodetanotacreditoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTabbedPaneRelacionesTipoDetaNotaCredito.setVisible(true);
			
					
		} else {
			//this.tipodetanotacreditoSessionBean.setConGuardarRelaciones(false);			
			this.tipodetanotacreditoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTabbedPaneRelacionesTipoDetaNotaCredito.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoDetaNotaCredito() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
				if(tipodetanotacreditoAux.getId().equals(this.iIdNuevoTipoDetaNotaCredito)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditos) {
				if(tipodetanotacreditoAux.getId().equals(this.iIdNuevoTipoDetaNotaCredito)) {
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
	
	public int getIndiceActualTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
				if(tipodetanotacreditoAux.getId().equals(tipodetanotacredito.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditos) {
				if(tipodetanotacreditoAux.getId().equals(tipodetanotacredito.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacreditoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
				if(tipodetanotacreditoAux.getTipoDetaNotaCreditoOriginal().getId().equals(tipodetanotacreditoOriginal.getId())) {
					existe=true;
					tipodetanotacreditoOriginal.setId(tipodetanotacreditoAux.getId());
					tipodetanotacreditoOriginal.setVersionRow(tipodetanotacreditoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditos) {
				if(tipodetanotacreditoAux.getTipoDetaNotaCreditoOriginal().getId().equals(tipodetanotacreditoOriginal.getId())) {
					existe=true;
					tipodetanotacreditoOriginal.setId(tipodetanotacreditoAux.getId());
					tipodetanotacreditoOriginal.setVersionRow(tipodetanotacreditoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDetaNotaCredito(Boolean esParaCancelar) throws Exception {
		tipodetanotacreditosAux=new ArrayList<TipoDetaNotaCredito>();
		tipodetanotacreditoAux=new TipoDetaNotaCredito();
		
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
					if(tipodetanotacreditoAux.getId()<0) {
						tipodetanotacreditosAux.add(tipodetanotacreditoAux);
					}		
				}
				this.iIdNuevoTipoDetaNotaCredito=0L;
				this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().removeAll(tipodetanotacreditosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditos) {
					if(tipodetanotacreditoAux.getId()<0) {
						tipodetanotacreditosAux.add(tipodetanotacreditoAux);
					}		
				}
				this.iIdNuevoTipoDetaNotaCredito=0L;
				this.tipodetanotacreditos.removeAll(tipodetanotacreditosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDetaNotaCredito 
					&& this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size()>0
					) {
					tipodetanotacreditoAux=this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().get(this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size() - 1);
				
					if(tipodetanotacreditoAux.getId()<0) {
						this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().remove(tipodetanotacreditoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDetaNotaCredito && this.tipodetanotacreditos.size()>0) {
					tipodetanotacreditoAux=this.tipodetanotacreditos.get(this.tipodetanotacreditos.size() - 1);
				
					if(tipodetanotacreditoAux.getId()<0) {
						this.tipodetanotacreditos.remove(tipodetanotacreditoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDetaNotaCredito(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodetanotacredito.getId()<0) {
				this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().remove(this.tipodetanotacredito);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodetanotacredito.getId()<0) {
				this.tipodetanotacreditos.remove(this.tipodetanotacredito);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDetaNotaCredito(List<TipoDetaNotaCredito> tipodetanotacreditosAux) throws Exception {
		TipoDetaNotaCreditoConstantesFunciones.setEstadosInicialesTipoDetaNotaCredito(tipodetanotacreditosAux);
	}
	
	public void setEstadosInicialesTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacreditoAux) throws Exception {
		TipoDetaNotaCreditoConstantesFunciones.setEstadosInicialesTipoDetaNotaCredito(tipodetanotacreditoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDetaNotaCreditoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDetaNotaCreditoActual()) {
				if(!this.isEsNuevoTipoDetaNotaCredito) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDetaNotaCredito=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDetaNotaCreditoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Detalle Nota Credito ?", "MANTENIMIENTO DE Tipo Detalle Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDetaNotaCredito tipodetanotacredito) throws Exception {
		TipoDetaNotaCreditoConstantesFunciones.seleccionarAsignar(this.tipodetanotacredito,tipodetanotacredito);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDetaNotaCredito=this.isPermisoActualizarOriginalTipoDetaNotaCredito;
			
			
			this.seleccionarAsignar(tipodetanotacredito);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDetaNotaCreditoConstantesFunciones.quitarEspaciosTipoDetaNotaCredito(this.tipodetanotacredito,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodetanotacreditoSessionBean.setsFuncionBusquedaRapida(this.tipodetanotacreditoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDetaNotaCredito) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDetaNotaCredito(esParaCancelar);				
				this.cancelarNuevoTipoDetaNotaCredito(esParaCancelar);								
			}
			
			this.tipodetanotacredito=new TipoDetaNotaCredito();
			
			this.inicializarTipoDetaNotaCredito();
			
			this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDetaNotaCredito() throws Exception {
		try {
			TipoDetaNotaCreditoConstantesFunciones.inicializarTipoDetaNotaCredito(this.tipodetanotacredito);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDetaNotaCreditos(String sAccionBusqueda,List<TipoDetaNotaCredito> tipodetanotacreditosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDetaNotaCredito"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDetaNotaCreditoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDetaNotaCreditoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDetaNotaCredito"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Detalle Nota Creditos");		
		parameters.put("busquedapor", TipoDetaNotaCreditoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDetaNotaCredito=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDetaNotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDetaNotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDetaNotaCredito=new JRBeanArrayDataSource(TipoDetaNotaCreditoJInternalFrame.TraerTipoDetaNotaCreditoBeans(tipodetanotacreditosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDetaNotaCredito);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDetaNotaCreditoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDetaNotaCreditoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDetaNotaCreditoBean.TraerTipoDetaNotaCreditoBeans(tipodetanotacreditosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDetaNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,tipodetanotacreditosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDetaNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,tipodetanotacreditosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDetaNotaCreditoActionPerformed(null);
					//this.generarExcelReporteTipoDetaNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,tipodetanotacreditosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDetaNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,tipodetanotacreditosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDetaNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,tipodetanotacreditosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDetaNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,tipodetanotacreditosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDetaNotaCreditos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetaNotaCredito> tipodetanotacreditosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetanotacredito";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetaNotaCreditos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDetaNotaCredito("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDetaNotaCredito tipodetanotacredito : tipodetanotacreditosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDetaNotaCreditoConstantesFunciones.generarExcelReporteDataTipoDetaNotaCredito("NORMAL",row,workbook,tipodetanotacredito,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Nota Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDetaNotaCredito(String sTipo,Row row,Workbook workbook) {
		
		TipoDetaNotaCreditoConstantesFunciones.generarExcelReporteHeaderTipoDetaNotaCredito(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDetaNotaCreditos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetaNotaCredito> tipodetanotacreditosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetanotacredito_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetaNotaCreditos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDetaNotaCredito tipodetanotacredito : tipodetanotacreditosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.getTipoDetaNotaCreditoDescripcion(tipodetanotacredito));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetanotacredito.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetanotacredito.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetanotacredito.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Nota Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDetaNotaCreditos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetaNotaCredito> tipodetanotacreditosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDetaNotaCredito> tipodetanotacreditosRespaldo=null;
		
		classes=TipoDetaNotaCreditoConstantesFunciones.getClassesRelationshipsOfTipoDetaNotaCredito(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodetanotacreditoLogic.setDatosCliente(this.datosCliente);
		this.tipodetanotacreditoLogic.setDatosDeep(this.datosDeep);
		this.tipodetanotacreditoLogic.setIsConDeep(true);
		
		tipodetanotacreditosRespaldo=this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos();
		
		this.tipodetanotacreditoLogic.setTipoDetaNotaCreditos(tipodetanotacreditosParaReportes);	
		this.tipodetanotacreditoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodetanotacreditosParaReportes=this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos();
		this.tipodetanotacreditoLogic.setTipoDetaNotaCreditos(tipodetanotacreditosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetanotacredito_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetaNotaCreditos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDetaNotaCredito("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDetaNotaCredito tipodetanotacredito : tipodetanotacreditosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDetaNotaCredito("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDetaNotaCreditoConstantesFunciones.generarExcelReporteDataTipoDetaNotaCredito("NORMAL",row,workbook,tipodetanotacredito,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.getTipoDetaNotaCreditoDescripcion(tipodetanotacredito));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Nota Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDetaNotaCredito() throws Exception {		
		this.startProcessTipoDetaNotaCredito(true);
	}
	
	public void startProcessTipoDetaNotaCredito(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDetaNotaCredito ,this.jPanelParametrosReportesTipoDetaNotaCredito, this.jScrollPanelDatosTipoDetaNotaCredito,this.jPanelPaginacionTipoDetaNotaCredito, this.jScrollPanelDatosEdicionTipoDetaNotaCredito, this.jPanelAccionesTipoDetaNotaCredito,this.jPanelAccionesFormularioTipoDetaNotaCredito,this.jmenuBarTipoDetaNotaCredito,this.jmenuBarDetalleTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,this.jTtoolBarDetalleTipoDetaNotaCredito);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDetaNotaCredito=this.jTabbedPaneBusquedasTipoDetaNotaCredito; 
		
		final JPanel jPanelParametrosReportesTipoDetaNotaCredito=this.jPanelParametrosReportesTipoDetaNotaCredito;
		//final JScrollPane jScrollPanelDatosTipoDetaNotaCredito=this.jScrollPanelDatosTipoDetaNotaCredito;
		final JTable jTableDatosTipoDetaNotaCredito=this.jTableDatosTipoDetaNotaCredito;		
		final JPanel jPanelPaginacionTipoDetaNotaCredito=this.jPanelPaginacionTipoDetaNotaCredito;
		//final JScrollPane jScrollPanelDatosEdicionTipoDetaNotaCredito=this.jScrollPanelDatosEdicionTipoDetaNotaCredito;
		final JPanel jPanelAccionesTipoDetaNotaCredito=this.jPanelAccionesTipoDetaNotaCredito;
		
		JPanel jPanelCamposAuxiliarTipoDetaNotaCredito=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDetaNotaCredito=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			jPanelCamposAuxiliarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jPanelCamposTipoDetaNotaCredito;
			jPanelAccionesFormularioAuxiliarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jPanelAccionesFormularioTipoDetaNotaCredito;
		}
		
		final JPanel jPanelCamposTipoDetaNotaCredito=jPanelCamposAuxiliarTipoDetaNotaCredito;
		final JPanel jPanelAccionesFormularioTipoDetaNotaCredito=jPanelAccionesFormularioAuxiliarTipoDetaNotaCredito;
		
		
		final JMenuBar jmenuBarTipoDetaNotaCredito=this.jmenuBarTipoDetaNotaCredito;
		final JToolBar jTtoolBarTipoDetaNotaCredito=this.jTtoolBarTipoDetaNotaCredito;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDetaNotaCredito=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDetaNotaCredito=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			jmenuBarDetalleAuxiliarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jmenuBarDetalleTipoDetaNotaCredito;
			jTtoolBarDetalleAuxiliarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTtoolBarDetalleTipoDetaNotaCredito;
		}
		
		final JMenuBar jmenuBarDetalleTipoDetaNotaCredito=jmenuBarDetalleAuxiliarTipoDetaNotaCredito;
		final JToolBar jTtoolBarDetalleTipoDetaNotaCredito=jTtoolBarDetalleAuxiliarTipoDetaNotaCredito;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDetaNotaCredito;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDetaNotaCredito;
			processRunnable.jTableDatos=jTableDatosTipoDetaNotaCredito;
			processRunnable.jPanelCampos=jPanelCamposTipoDetaNotaCredito;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDetaNotaCredito;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDetaNotaCredito;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDetaNotaCredito;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDetaNotaCredito;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDetaNotaCredito;
			processRunnable.jTtoolBar=jTtoolBarTipoDetaNotaCredito;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDetaNotaCredito;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDetaNotaCredito ,jPanelParametrosReportesTipoDetaNotaCredito,jTableDatosTipoDetaNotaCredito, /*jScrollPanelDatosTipoDetaNotaCredito,*/jPanelCamposTipoDetaNotaCredito,jPanelPaginacionTipoDetaNotaCredito, /*jScrollPanelDatosEdicionTipoDetaNotaCredito,*/ jPanelAccionesTipoDetaNotaCredito,jPanelAccionesFormularioTipoDetaNotaCredito,jmenuBarTipoDetaNotaCredito,jmenuBarDetalleTipoDetaNotaCredito,jTtoolBarTipoDetaNotaCredito,jTtoolBarDetalleTipoDetaNotaCredito);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDetaNotaCredito ,jPanelParametrosReportesTipoDetaNotaCredito, jScrollPanelDatosTipoDetaNotaCredito,jPanelPaginacionTipoDetaNotaCredito, jScrollPanelDatosEdicionTipoDetaNotaCredito, jPanelAccionesTipoDetaNotaCredito,jPanelAccionesFormularioTipoDetaNotaCredito,jmenuBarTipoDetaNotaCredito,jmenuBarDetalleTipoDetaNotaCredito,jTtoolBarTipoDetaNotaCredito,jTtoolBarDetalleTipoDetaNotaCredito);
						
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
	
	public void finishProcessTipoDetaNotaCredito() {// throws Exception 
		this.finishProcessTipoDetaNotaCredito(true);
	}
	
	public void finishProcessTipoDetaNotaCredito(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDetaNotaCredito ,this.jPanelParametrosReportesTipoDetaNotaCredito, this.jScrollPanelDatosTipoDetaNotaCredito,this.jPanelPaginacionTipoDetaNotaCredito, this.jScrollPanelDatosEdicionTipoDetaNotaCredito, this.jPanelAccionesTipoDetaNotaCredito,this.jPanelAccionesFormularioTipoDetaNotaCredito,this.jmenuBarTipoDetaNotaCredito,this.jmenuBarDetalleTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,this.jTtoolBarDetalleTipoDetaNotaCredito);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDetaNotaCredito=this.jTabbedPaneBusquedasTipoDetaNotaCredito; 
		
		final JPanel jPanelParametrosReportesTipoDetaNotaCredito=this.jPanelParametrosReportesTipoDetaNotaCredito;
		//final JScrollPane jScrollPanelDatosTipoDetaNotaCredito=this.jScrollPanelDatosTipoDetaNotaCredito;
		final JTable jTableDatosTipoDetaNotaCredito=this.jTableDatosTipoDetaNotaCredito;		
		final JPanel jPanelPaginacionTipoDetaNotaCredito=this.jPanelPaginacionTipoDetaNotaCredito;
		//final JScrollPane jScrollPanelDatosEdicionTipoDetaNotaCredito=this.jScrollPanelDatosEdicionTipoDetaNotaCredito;
		final JPanel jPanelAccionesTipoDetaNotaCredito=this.jPanelAccionesTipoDetaNotaCredito;
		
		JPanel jPanelCamposAuxiliarTipoDetaNotaCredito=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDetaNotaCredito=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			jPanelCamposAuxiliarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jPanelCamposTipoDetaNotaCredito;
			jPanelAccionesFormularioAuxiliarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jPanelAccionesFormularioTipoDetaNotaCredito;
		}
		
		final JPanel jPanelCamposTipoDetaNotaCredito=jPanelCamposAuxiliarTipoDetaNotaCredito;
		final JPanel jPanelAccionesFormularioTipoDetaNotaCredito=jPanelAccionesFormularioAuxiliarTipoDetaNotaCredito;
		
		
		final JMenuBar jmenuBarTipoDetaNotaCredito=this.jmenuBarTipoDetaNotaCredito;		
		final JToolBar jTtoolBarTipoDetaNotaCredito=this.jTtoolBarTipoDetaNotaCredito;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDetaNotaCredito=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDetaNotaCredito=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			jmenuBarDetalleAuxiliarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jmenuBarDetalleTipoDetaNotaCredito;
			jTtoolBarDetalleAuxiliarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTtoolBarDetalleTipoDetaNotaCredito;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDetaNotaCredito=jmenuBarDetalleAuxiliarTipoDetaNotaCredito;
		final JToolBar jTtoolBarDetalleTipoDetaNotaCredito=jTtoolBarDetalleAuxiliarTipoDetaNotaCredito;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDetaNotaCredito;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDetaNotaCredito;
			processRunnable.jTableDatos=jTableDatosTipoDetaNotaCredito;
			processRunnable.jPanelCampos=jPanelCamposTipoDetaNotaCredito;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDetaNotaCredito;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDetaNotaCredito;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDetaNotaCredito;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDetaNotaCredito;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDetaNotaCredito;
			processRunnable.jTtoolBar=jTtoolBarTipoDetaNotaCredito;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDetaNotaCredito;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDetaNotaCredito ,jPanelParametrosReportesTipoDetaNotaCredito, jTableDatosTipoDetaNotaCredito,/*jScrollPanelDatosTipoDetaNotaCredito,*/jPanelCamposTipoDetaNotaCredito,jPanelPaginacionTipoDetaNotaCredito, /*jScrollPanelDatosEdicionTipoDetaNotaCredito,*/ jPanelAccionesTipoDetaNotaCredito,jPanelAccionesFormularioTipoDetaNotaCredito,jmenuBarTipoDetaNotaCredito,jmenuBarDetalleTipoDetaNotaCredito,jTtoolBarTipoDetaNotaCredito,jTtoolBarDetalleTipoDetaNotaCredito));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDetaNotaCredito(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDetaNotaCredito(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDetaNotaCredito(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDetaNotaCredito(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDetaNotaCredito,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDetaNotaCredito,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDetaNotaCredito(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDetaNotaCredito,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDetaNotaCredito,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodetanotacreditoConstantesFunciones.getsFinalQueryTipoDetaNotaCredito();
		String  finalQueryPaginacionTodos=this.tipodetanotacreditoConstantesFunciones.getsFinalQueryTipoDetaNotaCredito();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDetaNotaCreditoConstantesFunciones.getArrayColumnasGlobalesNoTipoDetaNotaCredito(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDetaNotaCreditoConstantesFunciones.getArrayColumnasGlobalesTipoDetaNotaCredito(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDetaNotaCreditoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodetanotacreditosEliminados= new ArrayList<TipoDetaNotaCredito>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDetaNotaCredito();
		
				///*TipoDetaNotaCreditoSessionBean*/this.tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean();
			
			if(this.tipodetanotacreditoSessionBean==null) {
				this.tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean();
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
					this.iNumeroPaginacion=TipoDetaNotaCreditoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDetaNotaCreditoConstantesFunciones.getClassesForeignKeysOfTipoDetaNotaCredito(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodetanotacredito."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodetanotacreditosAux= new ArrayList<TipoDetaNotaCredito>();
			
				
			tipodetanotacreditoLogic.setDatosCliente(this.datosCliente);
			tipodetanotacreditoLogic.setDatosDeep(this.datosDeep);
			tipodetanotacreditoLogic.setIsConDeep(true);
			
			
			tipodetanotacreditoLogic.getTipoDetaNotaCreditoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodetanotacreditoLogic.getTodosTipoDetaNotaCreditos(finalQueryGlobal,pagination);
					
					//tipodetanotacreditoLogic.getTodosTipoDetaNotaCreditosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodetanotacreditoLogic.getTipoDetaNotaCreditos()==null|| tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetanotacreditosAux= new ArrayList<TipoDetaNotaCredito>();
							tipodetanotacreditosAux.addAll(tipodetanotacreditoLogic.getTipoDetaNotaCreditos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetanotacreditosAux= new ArrayList<TipoDetaNotaCredito>();
							tipodetanotacreditosAux.addAll(tipodetanotacreditos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetanotacreditoLogic.getTodosTipoDetaNotaCreditos(finalQueryGlobal+"",this.pagination);												
							
							//tipodetanotacreditoLogic.getTodosTipoDetaNotaCreditosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDetaNotaCreditos("Todos",tipodetanotacreditoLogic.getTipoDetaNotaCreditos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetanotacreditoLogic.setTipoDetaNotaCreditos(new ArrayList<TipoDetaNotaCredito>());					
							tipodetanotacreditoLogic.getTipoDetaNotaCreditos().addAll(tipodetanotacreditosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetanotacreditos=new ArrayList<TipoDetaNotaCredito>();
							tipodetanotacreditos.addAll(tipodetanotacreditosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDetaNotaCredito=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDetaNotaCredito=this.idActual;
				
				} else if(this.idTipoDetaNotaCreditoActual!=null && this.idTipoDetaNotaCreditoActual!=0L) {
					idTipoDetaNotaCredito=idTipoDetaNotaCreditoActual;
				}
				
					
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndicePorId(idTipoDetaNotaCredito);
				
				this.tipodetanotacreditos=new ArrayList<TipoDetaNotaCredito>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodetanotacreditoLogic.getEntity(idTipoDetaNotaCredito);
					
					//tipodetanotacreditoLogic.getEntityWithConnection(idTipoDetaNotaCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetanotacreditoLogic.setTipoDetaNotaCreditos(new ArrayList<TipoDetaNotaCredito>());
					tipodetanotacreditoLogic.getTipoDetaNotaCreditos().add(tipodetanotacreditoLogic.getTipoDetaNotaCredito());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetanotacreditos=new ArrayList<TipoDetaNotaCredito>();
					this.tipodetanotacreditos.add(tipodetanotacredito);
				}
				
				if(tipodetanotacreditoLogic.getTipoDetaNotaCredito()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodetanotacreditoLogic.getTipoDetaNotaCreditosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodetanotacreditoLogic.getTipoDetaNotaCreditos()==null||tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodetanotacreditos==null|| tipodetanotacreditos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditosAux=new ArrayList<TipoDetaNotaCredito>();
						tipodetanotacreditosAux.addAll(tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetanotacreditosAux=new ArrayList<TipoDetaNotaCredito>();
							tipodetanotacreditosAux.addAll(tipodetanotacreditos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodetanotacreditoLogic.getTipoDetaNotaCreditosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDetaNotaCreditos("BusquedaPorCodigo",tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDetaNotaCreditos("BusquedaPorCodigo",tipodetanotacreditos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditoLogic.setTipoDetaNotaCreditos(new ArrayList<TipoDetaNotaCredito>());
						tipodetanotacreditoLogic.getTipoDetaNotaCreditos().addAll(tipodetanotacreditosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetanotacreditos=new ArrayList<TipoDetaNotaCredito>();
							tipodetanotacreditos.addAll(tipodetanotacreditosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodetanotacreditoLogic.getTipoDetaNotaCreditosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodetanotacreditoLogic.getTipoDetaNotaCreditos()==null||tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodetanotacreditos==null|| tipodetanotacreditos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditosAux=new ArrayList<TipoDetaNotaCredito>();
						tipodetanotacreditosAux.addAll(tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetanotacreditosAux=new ArrayList<TipoDetaNotaCredito>();
							tipodetanotacreditosAux.addAll(tipodetanotacreditos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodetanotacreditoLogic.getTipoDetaNotaCreditosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDetaNotaCreditos("BusquedaPorNombre",tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDetaNotaCreditos("BusquedaPorNombre",tipodetanotacreditos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditoLogic.setTipoDetaNotaCreditos(new ArrayList<TipoDetaNotaCredito>());
						tipodetanotacreditoLogic.getTipoDetaNotaCreditos().addAll(tipodetanotacreditosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetanotacreditos=new ArrayList<TipoDetaNotaCredito>();
							tipodetanotacreditos.addAll(tipodetanotacreditosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodetanotacreditoLogic.getTipoDetaNotaCreditosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodetanotacreditoLogic.getTipoDetaNotaCreditos()==null||tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodetanotacreditos==null|| tipodetanotacreditos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditosAux=new ArrayList<TipoDetaNotaCredito>();
						tipodetanotacreditosAux.addAll(tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetanotacreditosAux=new ArrayList<TipoDetaNotaCredito>();
							tipodetanotacreditosAux.addAll(tipodetanotacreditos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodetanotacreditoLogic.getTipoDetaNotaCreditosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaNotaCreditoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDetaNotaCreditos("FK_IdEmpresa",tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDetaNotaCreditos("FK_IdEmpresa",tipodetanotacreditos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditoLogic.setTipoDetaNotaCreditos(new ArrayList<TipoDetaNotaCredito>());
						tipodetanotacreditoLogic.getTipoDetaNotaCreditos().addAll(tipodetanotacreditosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetanotacreditos=new ArrayList<TipoDetaNotaCredito>();
							tipodetanotacreditos.addAll(tipodetanotacreditosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDetaNotaCredito();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDetaNotaCredito();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetanotacreditos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetanotacreditos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDetaNotaCredito tipodetanotacredito) {
		Boolean permite=true;
		
		if(this.tipodetanotacredito.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDetaNotaCreditoConstantesFunciones.getOrderByListaTipoDetaNotaCredito();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDetaNotaCreditoConstantesFunciones.getOrderByListaTipoDetaNotaCredito();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetaNotaCredito tipodetanotacredito:tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
				if(tipodetanotacredito.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetanotacreditoTotales=tipodetanotacredito;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetaNotaCredito tipodetanotacredito:this.tipodetanotacreditos) {
				if(tipodetanotacredito.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetanotacreditoTotales=tipodetanotacredito;
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
			this.tipodetanotacreditoAux=new TipoDetaNotaCredito();
			this.tipodetanotacreditoAux.setsType(Constantes2.S_TOTALES);
			this.tipodetanotacreditoAux.setIsNew(false);
			this.tipodetanotacreditoAux.setIsChanged(false);
			this.tipodetanotacreditoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDetaNotaCreditoConstantesFunciones.TotalizarValoresFilaTipoDetaNotaCredito(this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos(),this.tipodetanotacreditoAux);
				
				this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().add(this.tipodetanotacreditoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDetaNotaCreditoConstantesFunciones.TotalizarValoresFilaTipoDetaNotaCredito(this.tipodetanotacreditos,this.tipodetanotacreditoAux);
				
				this.tipodetanotacreditos.add(this.tipodetanotacreditoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodetanotacreditoTotales=new TipoDetaNotaCredito();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().remove(tipodetanotacreditoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodetanotacreditos.remove(tipodetanotacreditoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodetanotacreditoTotales=new TipoDetaNotaCredito();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetaNotaCredito tipodetanotacredito:tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
				if(tipodetanotacredito.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetanotacreditoTotales=tipodetanotacredito;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDetaNotaCreditoConstantesFunciones.TotalizarValoresFilaTipoDetaNotaCredito(this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos(),tipodetanotacreditoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetaNotaCredito tipodetanotacredito:this.tipodetanotacreditos) {
				if(tipodetanotacredito.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetanotacreditoTotales=tipodetanotacredito;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDetaNotaCreditoConstantesFunciones.TotalizarValoresFilaTipoDetaNotaCredito(this.tipodetanotacreditos,tipodetanotacreditoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDetaNotaCreditosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDetaNotaCreditosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDetaNotaCreditosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDetaNotaCreditosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetanotacreditoLogic.getTipoDetaNotaCreditosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDetaNotaCreditosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetanotacreditoLogic.getTipoDetaNotaCreditosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDetaNotaCreditosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetanotacreditoLogic.getTipoDetaNotaCreditosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoDetaNotaCredito() {
		this.isPermisoTodoTipoDetaNotaCredito=false;
		this.isPermisoNuevoTipoDetaNotaCredito=false;
		this.isPermisoActualizarTipoDetaNotaCredito=false;
		this.isPermisoActualizarOriginalTipoDetaNotaCredito=false;
		this.isPermisoEliminarTipoDetaNotaCredito=false;
		this.isPermisoGuardarCambiosTipoDetaNotaCredito=false;
		this.isPermisoConsultaTipoDetaNotaCredito=false;
		this.isPermisoBusquedaTipoDetaNotaCredito=false;
		this.isPermisoReporteTipoDetaNotaCredito=false;		
		this.isPermisoOrdenTipoDetaNotaCredito=false;		
		this.isPermisoPaginacionMedioTipoDetaNotaCredito=false;		
		this.isPermisoPaginacionAltoTipoDetaNotaCredito=false;
		this.isPermisoPaginacionTodoTipoDetaNotaCredito=false;
		this.isPermisoCopiarTipoDetaNotaCredito=false;		
		this.isPermisoVerFormTipoDetaNotaCredito=false;		
		this.isPermisoDuplicarTipoDetaNotaCredito=false;		
		this.isPermisoOrdenTipoDetaNotaCredito=false;		
	}
	
	public void setPermisosUsuarioTipoDetaNotaCredito(Boolean isPermiso) {
		this.isPermisoTodoTipoDetaNotaCredito=isPermiso;
		this.isPermisoNuevoTipoDetaNotaCredito=isPermiso;
		this.isPermisoActualizarTipoDetaNotaCredito=isPermiso;
		this.isPermisoActualizarOriginalTipoDetaNotaCredito=isPermiso;
		this.isPermisoEliminarTipoDetaNotaCredito=isPermiso;
		this.isPermisoGuardarCambiosTipoDetaNotaCredito=isPermiso;
		this.isPermisoConsultaTipoDetaNotaCredito=isPermiso;
		this.isPermisoBusquedaTipoDetaNotaCredito=isPermiso;
		this.isPermisoReporteTipoDetaNotaCredito=isPermiso;
		this.isPermisoOrdenTipoDetaNotaCredito=isPermiso;		
		this.isPermisoPaginacionMedioTipoDetaNotaCredito=isPermiso;		
		this.isPermisoPaginacionAltoTipoDetaNotaCredito=isPermiso;		
		this.isPermisoPaginacionTodoTipoDetaNotaCredito=isPermiso;		
		this.isPermisoCopiarTipoDetaNotaCredito=isPermiso;		
		this.isPermisoVerFormTipoDetaNotaCredito=isPermiso;		
		this.isPermisoDuplicarTipoDetaNotaCredito=isPermiso;
		this.isPermisoOrdenTipoDetaNotaCredito=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDetaNotaCredito(Boolean isPermiso) {
		//this.isPermisoTodoTipoDetaNotaCredito=isPermiso;
		this.isPermisoNuevoTipoDetaNotaCredito=isPermiso;
		this.isPermisoActualizarTipoDetaNotaCredito=isPermiso;
		this.isPermisoActualizarOriginalTipoDetaNotaCredito=isPermiso;
		this.isPermisoEliminarTipoDetaNotaCredito=isPermiso;
		this.isPermisoGuardarCambiosTipoDetaNotaCredito=isPermiso;
		//this.isPermisoConsultaTipoDetaNotaCredito=isPermiso;
		//this.isPermisoBusquedaTipoDetaNotaCredito=isPermiso;
		//this.isPermisoReporteTipoDetaNotaCredito=isPermiso;
		//this.isPermisoOrdenTipoDetaNotaCredito=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDetaNotaCredito=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDetaNotaCredito=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDetaNotaCredito=isPermiso;		
		//this.isPermisoCopiarTipoDetaNotaCredito=isPermiso;		
		//this.isPermisoDuplicarTipoDetaNotaCredito=isPermiso;
		//this.isPermisoOrdenTipoDetaNotaCredito=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDetaNotaCreditoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoDetaNotaCreditoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDetaNotaCredito(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDetaNotaCreditoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDetaNotaCreditoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDetaNotaCreditoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDetaNotaCreditoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoDetaNotaCredito() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDetaNotaCreditoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDetaNotaCreditoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDetaNotaCredito=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDetaNotaCredito=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDetaNotaCredito=this.isPermisoActualizarTipoDetaNotaCredito;
			this.isPermisoEliminarTipoDetaNotaCredito=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDetaNotaCredito=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDetaNotaCredito=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDetaNotaCredito=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDetaNotaCredito=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDetaNotaCredito=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDetaNotaCredito=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDetaNotaCredito=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDetaNotaCredito=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDetaNotaCredito=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDetaNotaCredito=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDetaNotaCredito=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDetaNotaCredito=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDetaNotaCredito=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDetaNotaCredito.setToolTipText(this.jTableDatosTipoDetaNotaCredito.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDetaNotaCredito(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDetaNotaCredito(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDetaNotaCreditoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDetaNotaCreditoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDetaNotaCredito() throws Exception {
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
	public void inicializarCombosForeignKeyTipoDetaNotaCreditoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDetaNotaCreditoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDetaNotaCreditoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDetaNotaCreditoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoDetaNotaCreditoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDetaNotaCreditoParameterReturnGeneral tipodetanotacreditoReturnGeneral=new TipoDetaNotaCreditoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipodetanotacreditoConstantesFunciones.cargarid_empresaTipoDetaNotaCredito)
					 || (this.esRecargarFks && this.tipodetanotacreditoConstantesFunciones.cargarid_empresaTipoDetaNotaCredito)) {

					if(!this.tipodetanotacreditoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipodetanotacreditoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodetanotacreditoReturnGeneral=tipodetanotacreditoLogic.cargarCombosLoteForeignKeyTipoDetaNotaCredito(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipodetanotacreditoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDetaNotaCredito()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipodetanotacreditoSessionBean==null) {
				this.tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean();
			}

			if(!this.tipodetanotacreditoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoDetaNotaCredito()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDetaNotaCredito(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDetaNotaCredito()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetaNotaCredito();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDetaNotaCredito()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetaNotaCredito()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDetaNotaCredito()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDetaNotaCredito()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDetaNotaCredito()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDetaNotaCredito()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDetaNotaCredito(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDetaNotaCredito()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito!=null && this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoDetaNotaCreditoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDetaNotaCreditoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDetaNotaCreditoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean(); 
		this.tipodetanotacreditoConstantesFunciones=new TipoDetaNotaCreditoConstantesFunciones(); 
		this.tipodetanotacreditoBean=new TipoDetaNotaCredito();//(this.tipodetanotacreditoConstantesFunciones); 		
		this.tipodetanotacreditoReturnGeneral=new TipoDetaNotaCreditoParameterReturnGeneral(); 
		
		this.tipodetanotacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetanotacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDetaNotaCreditoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDetaNotaCreditoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDetaNotaCreditoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDetaNotaCredito(true);
			
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
			
			this.tipodetanotacreditoConstantesFunciones=new TipoDetaNotaCreditoConstantesFunciones(); 
			this.tipodetanotacreditoBean=new TipoDetaNotaCredito();//this.tipodetanotacreditoConstantesFunciones); 			
			this.tipodetanotacreditoReturnGeneral=new TipoDetaNotaCreditoParameterReturnGeneral(); 
		
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Detalle Nota Credito Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodetanotacredito=new TipoDetaNotaCredito();
			this.tipodetanotacreditos = new ArrayList<TipoDetaNotaCredito>();
			this.tipodetanotacreditosAux = new ArrayList<TipoDetaNotaCredito>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic=new TipoDetaNotaCreditoLogic();
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodetanotacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodetanotacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDetaNotaCredito);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDetaNotaCredito);	
					}
					
					if(this.jInternalFrameImportacionTipoDetaNotaCredito!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDetaNotaCredito);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDetaNotaCredito!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDetaNotaCredito);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDetaNotaCredito);
				this.jInternalFrameDetalleFormTipoDetaNotaCredito.setVisible(false);
				this.jInternalFrameDetalleFormTipoDetaNotaCredito.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito);
					this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDetaNotaCredito!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDetaNotaCredito);
					this.jInternalFrameImportacionTipoDetaNotaCredito.setVisible(false);
					this.jInternalFrameImportacionTipoDetaNotaCredito.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDetaNotaCredito!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDetaNotaCredito);
					this.jInternalFrameOrderByTipoDetaNotaCredito.setVisible(false);
					this.jInternalFrameOrderByTipoDetaNotaCredito.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDetaNotaCreditoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDetaNotaCreditoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodetanotacreditoReturnGeneral=new TipoDetaNotaCreditoParameterReturnGeneral();
			
			this.tipodetanotacreditoParameterGeneral=new TipoDetaNotaCreditoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodetanotacreditoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDetaNotaCreditoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDetaNotaCreditoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado(),this.tipodetanotacreditoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDetaNotaCreditoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado(),this.tipodetanotacreditoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaDuplicarTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaCopiarTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaVerFormTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaOrdenTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaModificarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDetaNotaCredito();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDetaNotaCredito(false);
			
			this.setPermisosUsuarioTipoDetaNotaCredito();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado() && this.tipodetanotacreditoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDetaNotaCreditoClasesRelacionadas();
			}
			
			if(this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDetaNotaCreditoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDetaNotaCredito();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDetaNotaCredito();
			}
			
			if(!this.isPermisoBusquedaTipoDetaNotaCredito) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDetaNotaCredito,this.isPermisoPaginacionMedioTipoDetaNotaCredito,this.isPermisoPaginacionTodoTipoDetaNotaCredito);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDetaNotaCreditoConstantesFunciones.getTiposSeleccionarTipoDetaNotaCredito());
				
				this.tiposColumnasSelect=TipoDetaNotaCreditoConstantesFunciones.getTiposSeleccionarTipoDetaNotaCredito(true);
				
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
			//if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDetaNotaCredito();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoDetaNotaCredito(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoDetaNotaCredito(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetaNotaCredito() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipodetanotacreditoImplementable= (TipoDetaNotaCreditoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDetaNotaCreditoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodetanotacreditoImplementableHome= (TipoDetaNotaCreditoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDetaNotaCreditoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodetanotacreditos= new ArrayList<TipoDetaNotaCredito>();
			this.tipodetanotacreditosEliminados= new ArrayList<TipoDetaNotaCredito>();
						
			this.isEsNuevoTipoDetaNotaCredito=false;
			this.esParaAccionDesdeFormularioTipoDetaNotaCredito=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDetaNotaCredito(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDetaNotaCredito();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDetaNotaCreditoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDetaNotaCredito(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDetaNotaCredito();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDetaNotaCredito();
			}
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDetaNotaCredito.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDetaNotaCredito.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDetaNotaCredito.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDetaNotaCredito(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDetaNotaCredito: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDetaNotaCredito() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDetaNotaCredito")) {
				iIndex=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTabbedPaneRelacionesTipoDetaNotaCredito.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTabbedPaneRelacionesTipoDetaNotaCredito.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDetaNotaCredito();	
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
	
	public void cargarCombosForeignKeyTipoDetaNotaCredito(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDetaNotaCredito(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDetaNotaCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDetaNotaCreditoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDetaNotaCredito();
		
		this.cargarCombosFrameForeignKeyTipoDetaNotaCredito();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDetaNotaCredito();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDetaNotaCredito();
		}
	}
	
	
	
	public void jButtonNuevoTipoDetaNotaCreditoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
			
			if(jTableDatosTipoDetaNotaCredito.getRowCount()>=1) {
				jTableDatosTipoDetaNotaCredito.removeRowSelectionInterval(0, jTableDatosTipoDetaNotaCredito.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDetaNotaCredito=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDetaNotaCredito(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDetaNotaCredito(true);			
			//this.tipodetanotacredito=new TipoDetaNotaCredito();
			//this.tipodetanotacredito.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetaNotaCredito(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetaNotaCredito() ;
			
			if(TipoDetaNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetaNotaCredito(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodetanotacredito);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);				
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
			if(this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDetaNotaCredito: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDetaNotaCreditoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDetaNotaCredito.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDetaNotaCredito.getSelectedRows().length;			
			}
			
			tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDetaNotaCredito--;			
				//TipoDetaNotaCredito tipodetanotacreditoAux= new TipoDetaNotaCredito();			
				//tipodetanotacreditoAux.setId(this.iIdNuevoTipoDetaNotaCredito);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDetaNotaCredito tipodetanotacreditoOrigen=new TipoDetaNotaCredito();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDetaNotaCredito tipodetanotacreditoOrigen : tipodetanotacreditosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodetanotacreditoOrigen =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetanotacreditoOrigen =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDetaNotaCredito();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodetanotacredito.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDetaNotaCredito(tipodetanotacreditoOrigen,this.tipodetanotacredito,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().add(this.tipodetanotacreditoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodetanotacreditos.add(this.tipodetanotacreditoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
				
				this.jTableDatosTipoDetaNotaCredito.setRowSelectionInterval(this.getIndiceNuevoTipoDetaNotaCredito(), this.getIndiceNuevoTipoDetaNotaCredito());
				
				int iLastRow =  this.jTableDatosTipoDetaNotaCredito.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDetaNotaCredito.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDetaNotaCredito.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();									
		
			TipoDetaNotaCredito tipodetanotacreditoOrigen=new TipoDetaNotaCredito();
			TipoDetaNotaCredito tipodetanotacreditoDestino=new TipoDetaNotaCredito();
				
			tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDetaNotaCredito.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodetanotacreditosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDetaNotaCredito.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditoOrigen =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodetanotacreditoOrigen =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetanotacreditoDestino =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodetanotacreditoDestino =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodetanotacreditoOrigen =tipodetanotacreditosSeleccionados.get(0);
				tipodetanotacreditoDestino =tipodetanotacreditosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDetaNotaCredito(tipodetanotacreditoOrigen,tipodetanotacreditoDestino,true,false);
				
				tipodetanotacreditoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodetanotacreditoDestino,tipodetanotacreditoLogic.getTipoDetaNotaCreditos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetanotacreditoDestino,tipodetanotacreditos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
				
				//this.jTableDatosTipoDetaNotaCredito.setRowSelectionInterval(this.getIndiceNuevoTipoDetaNotaCredito(), this.getIndiceNuevoTipoDetaNotaCredito());
				
				int iLastRow =  this.jTableDatosTipoDetaNotaCredito.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDetaNotaCredito.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDetaNotaCredito.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDetaNotaCredito.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDetaNotaCredito.setVisible(!isVisible);
			this.jPanelPaginacionTipoDetaNotaCredito.setVisible(!isVisible);
			this.jPanelAccionesTipoDetaNotaCredito.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDetaNotaCredito();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDetaNotaCredito();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDetaNotaCredito();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDetaNotaCredito();
			
			this.abrirFrameOrderByTipoDetaNotaCredito();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDetaNotaCredito();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDetaNotaCredito(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDetaNotaCredito);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDetaNotaCredito.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDetaNotaCredito.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDetaNotaCredito.setSize(this.jInternalFrameDetalleFormTipoDetaNotaCredito.iWidthFormulario,this.jInternalFrameDetalleFormTipoDetaNotaCredito.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDetaNotaCredito.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDetaNotaCredito.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDetaNotaCredito.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDetaNotaCredito.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDetaNotaCredito.jContentPaneDetalleTipoDetaNotaCredito.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTabbedPaneRelacionesTipoDetaNotaCredito.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDetaNotaCredito.jContentPaneDetalleTipoDetaNotaCredito.getWidth(),TipoDetaNotaCreditoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTabbedPaneRelacionesTipoDetaNotaCredito.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDetaNotaCredito.jContentPaneDetalleTipoDetaNotaCredito.getWidth(),TipoDetaNotaCreditoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTabbedPaneRelacionesTipoDetaNotaCredito.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDetaNotaCredito.jContentPaneDetalleTipoDetaNotaCredito.getWidth(),TipoDetaNotaCreditoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDetaNotaCredito.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDetaNotaCredito.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDetaNotaCredito() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDetaNotaCredito==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDetaNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetaNotaCredito,false,this);
				} else {
					this.jInternalFrameOrderByTipoDetaNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetaNotaCredito,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDetaNotaCredito);
				this.jInternalFrameOrderByTipoDetaNotaCredito.setVisible(false);
				this.jInternalFrameOrderByTipoDetaNotaCredito.setSelected(false);
				
				this.jInternalFrameOrderByTipoDetaNotaCredito.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDetaNotaCredito"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDetaNotaCredito();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDetaNotaCredito() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDetaNotaCredito==null) {
				
				this.jInternalFrameImportacionTipoDetaNotaCredito=new ImportacionJInternalFrame(TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDetaNotaCredito);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDetaNotaCredito);
				this.jInternalFrameImportacionTipoDetaNotaCredito.setVisible(false);
				this.jInternalFrameImportacionTipoDetaNotaCredito.setSelected(false);


				this.jInternalFrameImportacionTipoDetaNotaCredito.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDetaNotaCredito"));
				this.jInternalFrameImportacionTipoDetaNotaCredito.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDetaNotaCredito"));
				this.jInternalFrameImportacionTipoDetaNotaCredito.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDetaNotaCredito"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDetaNotaCredito() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito==null) {
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito=new ReporteDinamicoJInternalFrame(TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDetaNotaCredito);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito);
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetaNotaCredito"));
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetaNotaCredito"));
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetaNotaCredito"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetaNotaCredito();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoDetaNotaCredito() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDetaNotaCredito);
			
	       	this.jInternalFrameDetalleFormTipoDetaNotaCredito.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDetaNotaCredito.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDetaNotaCredito.dispose();
			//this.jInternalFrameDetalleFormTipoDetaNotaCredito=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDetaNotaCredito() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDetaNotaCredito() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDetaNotaCredito.setVisible(true);
	        this.jInternalFrameImportacionTipoDetaNotaCredito.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDetaNotaCredito() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDetaNotaCredito.setVisible(true);
	        this.jInternalFrameOrderByTipoDetaNotaCredito.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDetaNotaCredito() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDetaNotaCredito.setVisible(false);
	        this.jInternalFrameOrderByTipoDetaNotaCredito.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDetaNotaCredito() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDetaNotaCredito() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDetaNotaCredito.setVisible(false);
	        this.jInternalFrameImportacionTipoDetaNotaCredito.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDetaNotaCredito(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDetaNotaCredito(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDetaNotaCredito(true);
			//this.isEsNuevoTipoDetaNotaCredito=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetaNotaCredito(false) ;
			
			if(tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoDetaNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetaNotaCredito(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetaNotaCredito(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDetaNotaCreditoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDetaNotaCredito(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDetaNotaCredito(true);
			//this.isEsNuevoTipoDetaNotaCredito=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodetanotacredito.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDetaNotaCredito(false) ;
			
			if(TipoDetaNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetaNotaCredito(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetaNotaCredito(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDetaNotaCredito(false);
			
			//if(!this.isEsNuevoTipoDetaNotaCredito) {								
				int intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.tipodetanotacredito,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
				
			}
			
			if(this.permiteMantenimiento(this.tipodetanotacredito)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDetaNotaCredito=true;
					this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
					this.isEsNuevoTipoDetaNotaCredito=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDetaNotaCredito=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDetaNotaCredito=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDetaNotaCredito(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetaNotaCredito(false);
				
				this.habilitarDeshabilitarControlesTipoDetaNotaCredito(false);
			
												
				
				if(TipoDetaNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDetaNotaCredito();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,tipodetanotacreditoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDetaNotaCredito(this.tipodetanotacredito,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDetaNotaCredito.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodetanotacreditoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodetanotacredito.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				this.tipodetanotacredito.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				this.tipodetanotacredito.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodetanotacredito)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDetaNotaCreditoModel) this.jTableDatosTipoDetaNotaCredito.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDetaNotaCredito=true;
				this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
				this.isEsNuevoTipoDetaNotaCredito=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDetaNotaCredito(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetaNotaCredito(false);
				
				this.habilitarDeshabilitarControlesTipoDetaNotaCredito(false);
				
				
				
				if(TipoDetaNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDetaNotaCredito();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDetaNotaCredito.getRowCount()>=1) {
				jTableDatosTipoDetaNotaCredito.removeRowSelectionInterval(0, jTableDatosTipoDetaNotaCredito.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDetaNotaCredito(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetaNotaCredito(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetaNotaCredito(false) ;
			
			this.isEsNuevoTipoDetaNotaCredito=false;
			
			if(TipoDetaNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDetaNotaCredito();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDetaNotaCredito(false);
				
				//SI ES MANUAL
				if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDetaNotaCredito();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDetaNotaCredito--;			
			//TipoDetaNotaCredito tipodetanotacreditoAux= new TipoDetaNotaCredito();			
			//tipodetanotacreditoAux.setId(this.iIdNuevoTipoDetaNotaCredito);
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDetaNotaCredito();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
			
			this.tipodetanotacredito.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().add(this.tipodetanotacreditoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodetanotacreditos.add(this.tipodetanotacreditoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
			
			this.jTableDatosTipoDetaNotaCredito.setRowSelectionInterval(this.getIndiceNuevoTipoDetaNotaCredito(), this.getIndiceNuevoTipoDetaNotaCredito());
			
			int iLastRow =  this.jTableDatosTipoDetaNotaCredito.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDetaNotaCredito.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDetaNotaCredito.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetaNotaCredito(false);
			
			//SI ES MANUAL
			if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetaNotaCredito();
			}
			
			//this.abrirFrameTreeTipoDetaNotaCredito();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Detalle Nota CreditoS ?", "MANTENIMIENTO DE Tipo Detalle Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDetaNotaCredito.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDetaNotaCredito();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodetanotacreditoReturnGeneral=tipodetanotacreditoLogic.procesarImportacionTipoDetaNotaCreditosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodetanotacreditoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDetaNotaCreditoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDetaNotaCredito.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDetaNotaCredito.setFileImportacion(this.jInternalFrameImportacionTipoDetaNotaCredito.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDetaNotaCredito.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDetaNotaCredito.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDetaNotaCredito.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDetaNotaCredito.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();		

		tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDetaNotaCreditoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDetaNotaCreditoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDetaNotaCreditos("Todos",tipodetanotacreditosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();		
		
		tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetanotacredito";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDetaNotaCreditos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoDetaNotaCredito tipodetanotacredito:tipodetanotacreditosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetanotacredito.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDetaNotaCredito tipodetanotacredito:tipodetanotacreditosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetanotacredito.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDetaNotaCredito tipodetanotacredito:tipodetanotacreditosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetanotacredito.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDetaNotaCredito(row);				
			//	iRow++;
			//}				
			
			//for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDetaNotaCredito(tipodetanotacreditoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Nota Credito",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetaNotaCredito(false);
			
			//SI ES MANUAL
			if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetaNotaCredito();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetaNotaCredito(false);
			
			//SI ES MANUAL
			if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDetaNotaCredito();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetaNotaCredito(false);
			
			//SI ES MANUAL
			if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDetaNotaCredito();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDetaNotaCredito() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDetaNotaCredito.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDetaNotaCredito.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDetaNotaCredito.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDetaNotaCredito.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDetaNotaCredito.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDetaNotaCredito.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDetaNotaCredito.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDetaNotaCredito(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDetaNotaCredito(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDetaNotaCredito(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDetaNotaCredito(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDetaNotaCredito(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDetaNotaCredito(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetaNotaCredito(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDetaNotaCredito(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDetaNotaCredito() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDetaNotaCredito();
		
		this.inicializarActualizarBindingBotonesManualTipoDetaNotaCredito(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDetaNotaCredito();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetaNotaCredito() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetaNotaCredito(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetaNotaCredito(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDetaNotaCredito.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDetaNotaCredito.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jCheckBoxPostAccionNuevoTipoDetaNotaCredito.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jCheckBoxPostAccionSinCerrarTipoDetaNotaCredito.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jCheckBoxPostAccionSinMensajeTipoDetaNotaCredito.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDetaNotaCredito.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDetaNotaCredito.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
				this.jInternalFrameDetalleFormTipoDetaNotaCredito.jCheckBoxPostAccionNuevoTipoDetaNotaCredito.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDetaNotaCredito.jCheckBoxPostAccionSinCerrarTipoDetaNotaCredito.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDetaNotaCredito.jCheckBoxPostAccionSinMensajeTipoDetaNotaCredito.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDetaNotaCredito.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDetaNotaCredito.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDetaNotaCredito.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDetaNotaCredito.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDetaNotaCredito.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDetaNotaCredito.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDetaNotaCredito(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetaNotaCredito(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetaNotaCredito() throws Exception {
		try	{
			if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDetaNotaCredito();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDetaNotaCredito() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDetaNotaCredito() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDetaNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDetaNotaCredito.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDetaNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDetaNotaCredito.addItem(reporte);
			}
			
			
			if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDetaNotaCredito.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDetaNotaCredito.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDetaNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDetaNotaCredito.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDetaNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDetaNotaCredito.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetaNotaCredito();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetaNotaCredito() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito!=null) {
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito!=null) {
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDetaNotaCredito()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoDetaNotaCredito.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoDetaNotaCredito.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDetaNotaCredito(Boolean esInicializar) throws Exception {				
		if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDetaNotaCredito();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDetaNotaCredito() throws Exception {
		this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDetaNotaCredito() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDetaNotaCreditoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDetaNotaCreditoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDetaNotaCreditoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaNotaCreditoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDetaNotaCreditoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDetaNotaCreditoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDetaNotaCredito(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodetanotacreditos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDetaNotaCredito.setModel(new TipoDetaNotaCreditoModel(this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDetaNotaCredito.setModel(new TipoDetaNotaCreditoModel(this.tipodetanotacreditos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDetaNotaCredito!=null && this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDetaNotaCredito();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaNotaCredito,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDetaNotaCreditoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO,tipodetanotacreditoConstantesFunciones.resaltarSeleccionarTipoDetaNotaCredito,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO,tipodetanotacreditoConstantesFunciones.resaltarSeleccionarTipoDetaNotaCredito,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaNotaCredito,TipoDetaNotaCreditoConstantesFunciones.LABEL_ID));

		if(this.tipodetanotacreditoConstantesFunciones.mostraridTipoDetaNotaCredito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetaNotaCreditoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodetanotacreditoConstantesFunciones.resaltaridTipoDetaNotaCredito,this.tipodetanotacreditoConstantesFunciones.activaridTipoDetaNotaCredito,this,true,"idTipoDetaNotaCredito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetanotacreditoConstantesFunciones.resaltaridTipoDetaNotaCredito,this.tipodetanotacreditoConstantesFunciones.activaridTipoDetaNotaCredito,this,true,"idTipoDetaNotaCredito","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaNotaCredito,TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipodetanotacreditoConstantesFunciones.mostrarid_empresaTipoDetaNotaCredito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipodetanotacreditoConstantesFunciones.resaltarid_empresaTipoDetaNotaCredito,this,this.tipodetanotacreditoConstantesFunciones.activarid_empresaTipoDetaNotaCredito));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipodetanotacreditoConstantesFunciones.resaltarid_empresaTipoDetaNotaCredito,this,this.tipodetanotacreditoConstantesFunciones.activarid_empresaTipoDetaNotaCredito,false,"id_empresaTipoDetaNotaCredito","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDetaNotaCreditoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaNotaCredito,TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO));

		if(this.tipodetanotacreditoConstantesFunciones.mostrarcodigoTipoDetaNotaCredito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodetanotacreditoConstantesFunciones.resaltarcodigoTipoDetaNotaCredito,this.tipodetanotacreditoConstantesFunciones.activarcodigoTipoDetaNotaCredito,this,true,"codigoTipoDetaNotaCredito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetanotacreditoConstantesFunciones.resaltarcodigoTipoDetaNotaCredito,this.tipodetanotacreditoConstantesFunciones.activarcodigoTipoDetaNotaCredito,this,true,"codigoTipoDetaNotaCredito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDetaNotaCreditoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaNotaCredito,TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodetanotacreditoConstantesFunciones.mostrarnombreTipoDetaNotaCredito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodetanotacreditoConstantesFunciones.resaltarnombreTipoDetaNotaCredito,this.tipodetanotacreditoConstantesFunciones.activarnombreTipoDetaNotaCredito,this,true,"nombreTipoDetaNotaCredito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetanotacreditoConstantesFunciones.resaltarnombreTipoDetaNotaCredito,this.tipodetanotacreditoConstantesFunciones.activarnombreTipoDetaNotaCredito,this,true,"nombreTipoDetaNotaCredito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDetaNotaCreditoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDetaNotaCredito.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDetaNotaCredito.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDetaNotaCredito.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDetaNotaCredito.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDetaNotaCredito.moveColumn(this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDetaNotaCredito.moveColumn(this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDetaNotaCredito.moveColumn(this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDetaNotaCredito.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDetaNotaCredito.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDetaNotaCredito,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDetaNotaCredito.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDetaNotaCredito.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDetaNotaCredito.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodetanotacreditos.size()-1;
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
		//this.jTableDatosTipoDetaNotaCredito.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDetaNotaCredito();
			
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
				
				//this.isEsNuevoTipoDetaNotaCredito=false;
					
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
				if(this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDetaNotaCredito.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDetaNotaCredito.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodetanotacredito.getsType().equals("DUPLICADO")
				   || this.tipodetanotacredito.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDetaNotaCredito=true;
				
				} else {
					this.isEsNuevoTipoDetaNotaCredito=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodetanotacredito.getId()>=0 && !this.tipodetanotacredito.getIsNew()) {						
						this.isEsNuevoTipoDetaNotaCredito=false;
						
					} else {
						this.isEsNuevoTipoDetaNotaCredito=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDetaNotaCredito(esRelaciones);						
				
				this.seleccionarTipoDetaNotaCredito(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodetanotacredito.getId()<0) {
					this.isEsNuevoTipoDetaNotaCredito=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDetaNotaCredito(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDetaNotaCredito(evt,rowIndex);
				}	
				
				if(this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDetaNotaCredito: " + this.dDif); 
					}
				}								
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDetaNotaCredito(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodetanotacredito)) {
					if(this.tipodetanotacredito.getId()>0) {
						this.tipodetanotacredito.setIsDeleted(true);
						
						this.tipodetanotacreditosEliminados.add(this.tipodetanotacredito);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().remove(this.tipodetanotacredito);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodetanotacreditos.remove(this.tipodetanotacredito);				
					}
					
					
					((TipoDetaNotaCreditoModel) this.jTableDatosTipoDetaNotaCredito.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDetaNotaCredito(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDetaNotaCredito) {
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDetaNotaCredito.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDetaNotaCredito.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDetaNotaCredito(this.tipodetanotacredito);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipodetanotacreditoConstantesFunciones.cargarid_empresaTipoDetaNotaCredito || this.tipodetanotacreditoConstantesFunciones.event_dependid_empresaTipoDetaNotaCredito) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipodetanotacredito.getid_empresa());
									//this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipodetanotacredito.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipodetanotacredito.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipodetanotacredito.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDetaNotaCredito("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDetaNotaCredito(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetaNotaCredito() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDetaNotaCredito(tipodetanotacredito,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDetaNotaCredito(tipodetanotacredito);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDetaNotaCredito(tipodetanotacredito,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDetaNotaCredito(tipodetanotacredito);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.setText(tipodetanotacredito.getId().toString());
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextFieldcodigoTipoDetaNotaCredito.setText(tipodetanotacredito.getcodigo());
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextAreanombreTipoDetaNotaCredito.setText(tipodetanotacredito.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDetaNotaCredito tipodetanotacreditoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodetanotacreditoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDetaNotaCredito tipodetanotacreditoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodetanotacreditoLocal=this.tipodetanotacredito;
			} else {
				tipodetanotacreditoLocal=this.tipodetanotacreditoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodetanotacreditoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDetaNotaCredito(tipodetanotacreditoLocal,true);
					
					if(tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodetanotacreditoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodetanotacreditoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(tipodetanotacredito,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(tipodetanotacredito);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(tipodetanotacredito,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.getText()==null || this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.getText()=="" || this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.setText("0");
			}

			if(conColumnasBase) {tipodetanotacredito.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetaNotaCreditoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelIdTipoDetaNotaCredito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodetanotacredito.setcodigo(this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextFieldcodigoTipoDetaNotaCredito.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelcodigoTipoDetaNotaCredito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodetanotacredito.setnombre(this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextAreanombreTipoDetaNotaCredito.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelnombreTipoDetaNotaCredito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacreditoBean,TipoDetaNotaCredito tipodetanotacredito,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacreditoOrigen,TipoDetaNotaCredito tipodetanotacredito,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodetanotacreditoOrigen.getId()!=null && !tipodetanotacreditoOrigen.getId().equals(0L))) {tipodetanotacredito.setId(tipodetanotacreditoOrigen.getId());}}
			if(conDefault || (!conDefault && tipodetanotacreditoOrigen.getcodigo()!=null && !tipodetanotacreditoOrigen.getcodigo().equals(""))) {tipodetanotacredito.setcodigo(tipodetanotacreditoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodetanotacreditoOrigen.getnombre()!=null && !tipodetanotacreditoOrigen.getnombre().equals(""))) {tipodetanotacredito.setnombre(tipodetanotacreditoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.setText(tipodetanotacredito.getId().toString());
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextFieldcodigoTipoDetaNotaCredito.setText(tipodetanotacredito.getcodigo());
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextAreanombreTipoDetaNotaCredito.setText(tipodetanotacredito.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDetaNotaCredito(TipoDetaNotaCreditoBean tipodetanotacreditoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.setText(tipodetanotacreditoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextFieldcodigoTipoDetaNotaCredito.setText(tipodetanotacreditoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextAreanombreTipoDetaNotaCredito.setText(tipodetanotacreditoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDetaNotaCredito(TipoDetaNotaCreditoParameterReturnGeneral tipodetanotacreditoReturnGeneral,TipoDetaNotaCreditoBean tipodetanotacreditoBean,Boolean conDefault) throws Exception { 
		try {
			TipoDetaNotaCredito tipodetanotacreditoLocal=new TipoDetaNotaCredito();
			
			tipodetanotacreditoLocal=tipodetanotacreditoReturnGeneral.getTipoDetaNotaCredito();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodetanotacreditoLocal.getId()!=null && !tipodetanotacreditoLocal.getId().equals(0L))) {tipodetanotacreditoBean.setId(tipodetanotacreditoLocal.getId());}}
			if(conDefault || (!conDefault && tipodetanotacreditoLocal.getcodigo()!=null && !tipodetanotacreditoLocal.getcodigo().equals(""))) {tipodetanotacreditoBean.setcodigo(tipodetanotacreditoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodetanotacreditoLocal.getnombre()!=null && !tipodetanotacreditoLocal.getnombre().equals(""))) {tipodetanotacreditoBean.setnombre(tipodetanotacreditoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDetaNotaCreditoGenerico(Long idTipoDetaNotaCreditoSeleccionado,JComboBox jComboBoxTipoDetaNotaCredito,List<TipoDetaNotaCredito> tipodetanotacreditosLocal)throws Exception {
		try {
			TipoDetaNotaCredito  tipodetanotacreditoTemp=null;

			for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditosLocal) {
				if(tipodetanotacreditoAux.getId()!=null && tipodetanotacreditoAux.getId().equals(idTipoDetaNotaCreditoSeleccionado)) {
					tipodetanotacreditoTemp=tipodetanotacreditoAux;
					break;
				}
			}

			jComboBoxTipoDetaNotaCredito.setSelectedItem(tipodetanotacreditoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDetaNotaCreditoGenerico(JComboBox jComboBoxTipoDetaNotaCredito,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDetaNotaCredito.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDetaNotaCredito.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDetaNotaCredito.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDetaNotaCredito.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetanotacredito=(TipoDetaNotaCredito) tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodetanotacredito =(TipoDetaNotaCredito) tipodetanotacreditos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipodetanotacredito.getIsNew() && !tipodetanotacredito.getIsChanged() && !tipodetanotacredito.getIsDeleted()) {
				sDescripcion=tipodetanotacredito.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipodetanotacredito.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDetaNotaCredito tipodetanotacreditoRow=new TipoDetaNotaCredito();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetanotacreditoRow=(TipoDetaNotaCredito) tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodetanotacreditoRow=(TipoDetaNotaCredito) tipodetanotacreditos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDetaNotaCredito(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaNuevoTipoDetaNotaCredito && this.isPermisoNuevoTipoDetaNotaCredito));			
			this.jButtonDuplicarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaDuplicarTipoDetaNotaCredito && this.isPermisoDuplicarTipoDetaNotaCredito));			
			this.jButtonCopiarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaCopiarTipoDetaNotaCredito && this.isPermisoCopiarTipoDetaNotaCredito));
			this.jButtonVerFormTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaVerFormTipoDetaNotaCredito && this.isPermisoVerFormTipoDetaNotaCredito));
			
			this.jButtonAbrirOrderByTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaOrdenTipoDetaNotaCredito && this.isPermisoOrdenTipoDetaNotaCredito));			
			
			this.jButtonNuevoRelacionesTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito && this.isPermisoNuevoTipoDetaNotaCredito));			
			this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaNuevoTipoDetaNotaCredito && this.isPermisoNuevoTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito));
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonModificarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaModificarTipoDetaNotaCredito && this.isPermisoActualizarTipoDetaNotaCredito));	
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonActualizarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaActualizarTipoDetaNotaCredito && this.isPermisoActualizarTipoDetaNotaCredito));	
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonEliminarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaEliminarTipoDetaNotaCredito && this.isPermisoEliminarTipoDetaNotaCredito));
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonCancelarTipoDetaNotaCredito.setVisible(this.isVisibilidadCeldaCancelarTipoDetaNotaCredito);							
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaGuardarTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaNuevoTipoDetaNotaCredito && this.isPermisoNuevoTipoDetaNotaCredito));						
			this.jButtonDuplicarToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaDuplicarTipoDetaNotaCredito && this.isPermisoDuplicarTipoDetaNotaCredito));						
			this.jButtonCopiarToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaCopiarTipoDetaNotaCredito && this.isPermisoCopiarTipoDetaNotaCredito));			
			this.jButtonVerFormToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaVerFormTipoDetaNotaCredito && this.isPermisoVerFormTipoDetaNotaCredito));			
			this.jButtonAbrirOrderByToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaOrdenTipoDetaNotaCredito && this.isPermisoOrdenTipoDetaNotaCredito));
			this.jButtonNuevoRelacionesToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito && this.isPermisoNuevoTipoDetaNotaCredito));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaNuevoTipoDetaNotaCredito && this.isPermisoNuevoTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito));			
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonModificarToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaModificarTipoDetaNotaCredito && this.isPermisoActualizarTipoDetaNotaCredito));	
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonActualizarToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaActualizarTipoDetaNotaCredito  && this.isPermisoActualizarTipoDetaNotaCredito));	
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonEliminarToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaEliminarTipoDetaNotaCredito && this.isPermisoEliminarTipoDetaNotaCredito));
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonCancelarToolBarTipoDetaNotaCredito.setVisible(this.isVisibilidadCeldaCancelarTipoDetaNotaCredito);				
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaGuardarTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaNuevoTipoDetaNotaCredito && this.isPermisoNuevoTipoDetaNotaCredito));			
			this.jMenuItemDuplicarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaDuplicarTipoDetaNotaCredito && this.isPermisoDuplicarTipoDetaNotaCredito));			
			this.jMenuItemCopiarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaCopiarTipoDetaNotaCredito && this.isPermisoCopiarTipoDetaNotaCredito));			
			this.jMenuItemVerFormTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaVerFormTipoDetaNotaCredito && this.isPermisoVerFormTipoDetaNotaCredito));			
			this.jMenuItemAbrirOrderByTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaOrdenTipoDetaNotaCredito && this.isPermisoOrdenTipoDetaNotaCredito));			
			//this.jMenuItemMostrarOcultarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaOrdenTipoDetaNotaCredito && this.isPermisoOrdenTipoDetaNotaCredito));
			this.jMenuItemDetalleAbrirOrderByTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaOrdenTipoDetaNotaCredito && this.isPermisoOrdenTipoDetaNotaCredito));			
			//this.jMenuItemDetalleMostrarOcultarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaOrdenTipoDetaNotaCredito && this.isPermisoOrdenTipoDetaNotaCredito));			
			this.jMenuItemNuevoRelacionesTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito && this.isPermisoNuevoTipoDetaNotaCredito));			
			this.jMenuItemNuevoGuardarCambiosTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaNuevoTipoDetaNotaCredito && this.isPermisoNuevoTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito));									
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemModificarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaModificarTipoDetaNotaCredito && this.isPermisoActualizarTipoDetaNotaCredito));	
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemActualizarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaActualizarTipoDetaNotaCredito && this.isPermisoActualizarTipoDetaNotaCredito));	
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemEliminarTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaEliminarTipoDetaNotaCredito && this.isPermisoEliminarTipoDetaNotaCredito));
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemCancelarTipoDetaNotaCredito.setVisible(this.isVisibilidadCeldaCancelarTipoDetaNotaCredito);				
			}
			
			this.jMenuItemGuardarCambiosTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaGuardarTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito));						
			this.jMenuItemGuardarCambiosTablaTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=this.jButtonNuevoTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDetaNotaCredito=this.jButtonDuplicarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaCopiarTipoDetaNotaCredito=this.jButtonCopiarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaVerFormTipoDetaNotaCredito=this.jButtonVerFormTipoDetaNotaCredito.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDetaNotaCredito=this.jButtonAbrirOrderByTipoDetaNotaCredito.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=this.jButtonNuevoRelacionesTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaModificarTipoDetaNotaCredito=this.jButtonModificarTipoDetaNotaCredito.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonActualizarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonEliminarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonCancelarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosTipoDetaNotaCredito.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=this.jButtonNuevoToolBarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=this.jButtonNuevoRelacionesToolBarTipoDetaNotaCredito.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			this.isVisibilidadCeldaModificarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonModificarToolBarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonActualizarToolBarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonEliminarToolBarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonCancelarToolBarTipoDetaNotaCredito.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=this.jButtonGuardarCambiosToolBarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=this.jButtonGuardarCambiosTablaToolBarTipoDetaNotaCredito.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=this.jMenuItemNuevoTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=this.jMenuItemNuevoRelacionesTipoDetaNotaCredito.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			this.isVisibilidadCeldaModificarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemModificarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemActualizarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemEliminarTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemCancelarTipoDetaNotaCredito.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=this.jMenuItemGuardarCambiosTipoDetaNotaCredito.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=this.jMenuItemGuardarCambiosTablaTipoDetaNotaCredito.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDetaNotaCredito(Boolean esInicializar) {
		if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDetaNotaCredito();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDetaNotaCredito(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDetaNotaCredito() {
		this.jButtonNuevoTipoDetaNotaCredito.setVisible(this.isPermisoNuevoTipoDetaNotaCredito);			
		this.jButtonDuplicarTipoDetaNotaCredito.setVisible(this.isPermisoDuplicarTipoDetaNotaCredito);			
		this.jButtonCopiarTipoDetaNotaCredito.setVisible(this.isPermisoCopiarTipoDetaNotaCredito);			
		this.jButtonVerFormTipoDetaNotaCredito.setVisible(this.isPermisoVerFormTipoDetaNotaCredito);			
		
		this.jButtonAbrirOrderByTipoDetaNotaCredito.setVisible(this.isPermisoOrdenTipoDetaNotaCredito);					
		
		this.jButtonNuevoRelacionesTipoDetaNotaCredito.setVisible(this.isPermisoNuevoTipoDetaNotaCredito);			
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonModificarTipoDetaNotaCredito.setVisible(this.isPermisoActualizarTipoDetaNotaCredito);	
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonActualizarTipoDetaNotaCredito.setVisible(this.isPermisoActualizarTipoDetaNotaCredito);	
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonEliminarTipoDetaNotaCredito.setVisible(this.isPermisoEliminarTipoDetaNotaCredito);
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonCancelarTipoDetaNotaCredito.setVisible(this.isVisibilidadCeldaCancelarTipoDetaNotaCredito);						
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosTipoDetaNotaCredito.setVisible(this.isPermisoGuardarCambiosTipoDetaNotaCredito);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.setVisible(this.isPermisoActualizarTipoDetaNotaCredito);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDetaNotaCredito() {
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonModificarTipoDetaNotaCredito.setVisible(this.isPermisoActualizarTipoDetaNotaCredito);	
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonActualizarTipoDetaNotaCredito.setVisible(this.isPermisoActualizarTipoDetaNotaCredito);	
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonEliminarTipoDetaNotaCredito.setVisible(this.isPermisoEliminarTipoDetaNotaCredito);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonCancelarTipoDetaNotaCredito.setVisible(this.isVisibilidadCeldaCancelarTipoDetaNotaCredito);							
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosTipoDetaNotaCredito.setVisible((this.isVisibilidadCeldaGuardarTipoDetaNotaCredito && this.isPermisoGuardarCambiosTipoDetaNotaCredito));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDetaNotaCredito() {
		if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDetaNotaCredito();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDetaNotaCredito() {
	}
	
	public void jTableDatosTipoDetaNotaCreditoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDetaNotaCredito(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDetaNotaCreditoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.gettipodetanotacredito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetanotacredito==null) {
						this.tipodetanotacredito = new TipoDetaNotaCredito();
					}

					this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.tipodetanotacredito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
				}

				if(this.tipodetanotacredito.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodetanotacredito.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetaNotaCredito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoDetaNotaCreditoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoDetaNotaCredito(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDetaNotaCredito.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDetaNotaCredito.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.gettipodetanotacredito(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipodetanotacreditoLogic.getConnexion());

				if(this.tipodetanotacredito.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipodetanotacredito.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDetaNotaCredito=(TitledBorder)this.jScrollPanelDatosTipoDetaNotaCredito.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoDetaNotaCredito.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoDetaNotaCreditoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.gettipodetanotacredito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetanotacredito==null) {
						this.tipodetanotacredito = new TipoDetaNotaCredito();
					}

					this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.tipodetanotacredito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
				}

				if(this.tipodetanotacredito.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipodetanotacredito.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetaNotaCredito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDetaNotaCreditoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.gettipodetanotacredito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetanotacredito==null) {
						this.tipodetanotacredito = new TipoDetaNotaCredito();
					}

					this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.tipodetanotacredito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
				}

				if(this.tipodetanotacredito.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodetanotacredito.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetaNotaCredito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDetaNotaCreditoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.gettipodetanotacredito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetanotacredito==null) {
						this.tipodetanotacredito = new TipoDetaNotaCredito();
					}

					this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.tipodetanotacredito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);
				}

				if(this.tipodetanotacredito.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodetanotacredito.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetaNotaCredito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);

			this.getTipoDetaNotaCreditosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoDetaNotaCredito(false);

			//if(TipoDetaNotaCreditoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);

			this.getTipoDetaNotaCreditosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoDetaNotaCredito(false);

			//if(TipoDetaNotaCreditoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoDetaNotaCreditoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);

			this.getTipoDetaNotaCreditosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoDetaNotaCredito(false);

			//if(TipoDetaNotaCreditoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetanotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDetaNotaCredito() {
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.dispose();
			this.jInternalFrameDetalleFormTipoDetaNotaCredito=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito!=null) {
			this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.dispose();
			this.jInternalFrameReporteDinamicoTipoDetaNotaCredito=null;
		}
		
		if(this.jInternalFrameImportacionTipoDetaNotaCredito!=null) {
			this.jInternalFrameImportacionTipoDetaNotaCredito.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDetaNotaCredito.dispose();
			this.jInternalFrameImportacionTipoDetaNotaCredito=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDetaNotaCredito();
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDetaNotaCredito")) {
				jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDetaNotaCredito")) {
				jButtonDuplicarTipoDetaNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDetaNotaCredito")) {
				jButtonCopiarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDetaNotaCredito")) {
				jButtonVerFormTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDetaNotaCredito")) {
				jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDetaNotaCredito")) {
				jButtonDuplicarTipoDetaNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDetaNotaCredito")) {
				jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDetaNotaCredito")) {
				jButtonDuplicarTipoDetaNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDetaNotaCredito")) {
				jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDetaNotaCredito")) {
				jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDetaNotaCredito")) {
				jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDetaNotaCredito")) {
				jButtonModificarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDetaNotaCredito")) {
				jButtonModificarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDetaNotaCredito")) {
				jButtonModificarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDetaNotaCredito")) {
				jButtonActualizarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDetaNotaCredito")) {
				jButtonActualizarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDetaNotaCredito")) {
				jButtonActualizarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDetaNotaCredito")) {
				jButtonEliminarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDetaNotaCredito")) {
				jButtonEliminarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDetaNotaCredito")) {
				jButtonEliminarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDetaNotaCredito")) {
				jButtonCancelarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDetaNotaCredito")) {
				jButtonCancelarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDetaNotaCredito")) {
				jButtonCancelarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDetaNotaCredito")) {
				jButtonCerrarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDetaNotaCredito")) {
				jButtonCerrarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDetaNotaCredito")) {
				jButtonCerrarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDetaNotaCredito")) {
				jButtonMostrarOcultarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDetaNotaCredito")) {
				jButtonCancelarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDetaNotaCredito")) {
				jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDetaNotaCredito")) {
				jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDetaNotaCredito")) {
				jButtonCopiarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDetaNotaCredito")) {
				jButtonVerFormTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDetaNotaCredito")) {
				jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDetaNotaCredito")) {
				jButtonCopiarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDetaNotaCredito")) {
				jButtonVerFormTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDetaNotaCredito")) {
				jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDetaNotaCredito")) {
				jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDetaNotaCredito")) {
				jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDetaNotaCredito")) {
				jButtonRecargarInformacionTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDetaNotaCredito")) {
				jButtonRecargarInformacionTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDetaNotaCredito")) {
				jButtonRecargarInformacionTipoDetaNotaCreditoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDetaNotaCredito")) {
				jButtonAnterioresTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDetaNotaCredito")) {
				jButtonAnterioresTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDetaNotaCredito")) {
				jButtonAnterioresTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDetaNotaCredito")) {
				jButtonSiguientesTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDetaNotaCredito")) {
				jButtonSiguientesTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDetaNotaCredito")) {
				jButtonSiguientesTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDetaNotaCredito") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDetaNotaCredito")) {
				jButtonAbrirOrderByTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDetaNotaCredito") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDetaNotaCredito")) {
				jButtonMostrarOcultarTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDetaNotaCredito")) {
				jButtonNuevoGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDetaNotaCredito")) {
				jButtonNuevoGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDetaNotaCredito")) {
				jButtonNuevoGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDetaNotaCredito")) {
				jButtonCerrarReporteDinamicoTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDetaNotaCredito")) {
				jButtonGenerarReporteDinamicoTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDetaNotaCredito")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDetaNotaCredito")) {
				jButtonCerrarImportacionTipoDetaNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDetaNotaCredito")) {
				
				jButtonGenerarImportacionTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDetaNotaCredito")) {
				
				jButtonAbrirImportacionTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDetaNotaCredito")) {
				jComboBoxTiposAccionesTipoDetaNotaCreditoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDetaNotaCredito")) {
				jComboBoxTiposRelacionesTipoDetaNotaCreditoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDetaNotaCredito")) {
				jComboBoxTiposAccionesTipoDetaNotaCreditoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDetaNotaCredito")) {
				
				jComboBoxTiposSeleccionarTipoDetaNotaCreditoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDetaNotaCredito")) {
				jTextFieldValorCampoGeneralTipoDetaNotaCreditoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDetaNotaCredito")) {
				jButtonAbrirOrderByTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDetaNotaCredito")) {
				jButtonAbrirOrderByTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDetaNotaCredito")) {
				jButtonCerrarOrderByTipoDetaNotaCreditoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDetaNotaCreditoBusqueda")) {
				this.jButtonidTipoDetaNotaCreditoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDetaNotaCreditoUpdate")) {
				this.jButtonid_empresaTipoDetaNotaCreditoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDetaNotaCreditoBusqueda")) {
				this.jButtonid_empresaTipoDetaNotaCreditoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDetaNotaCreditoBusqueda")) {
				this.jButtoncodigoTipoDetaNotaCreditoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDetaNotaCreditoBusqueda")) {
				this.jButtonnombreTipoDetaNotaCreditoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoDetaNotaCredito")) {
				this.jButtonBusquedaPorCodigoTipoDetaNotaCreditoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoDetaNotaCredito")) {
				this.jButtonBusquedaPorNombreTipoDetaNotaCreditoActionPerformed(evt);
			}
			
			;
			
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDetaNotaCredito();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				


				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDetaNotaCredito tipodetanotacreditoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodetanotacreditoLocal=this.tipodetanotacredito;
			} else {
				tipodetanotacreditoLocal=this.tipodetanotacreditoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
							
				
				


				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
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
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
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
			
			


			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
								
						
				


				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
								
				
				


				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
							
				
				


				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
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
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
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
			
			


			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
								
				
				


				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDetaNotaCredito")) {
					jCheckBoxSeleccionarTodosTipoDetaNotaCreditoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDetaNotaCredito")) {
					jCheckBoxSeleccionadosTipoDetaNotaCreditoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDetaNotaCredito")) {
					
				}
				
				


				
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
												
				
				


				
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
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
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
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
			
			


			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetanotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetanotacredito);
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
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
				
				


				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaNotaCredito.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaNotaCreditoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetanotacreditoAnterior =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDetaNotaCredito")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDetaNotaCreditoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDetaNotaCredito.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodetanotacredito =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodetanotacredito);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDetaNotaCredito")) {
				
				}
				
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDetaNotaCredito")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDetaNotaCredito.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDetaNotaCredito")) {
			
			}
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDetaNotaCredito();
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDetaNotaCredito")) {
				jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDetaNotaCredito")) {
				jButtonDuplicarTipoDetaNotaCreditoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDetaNotaCredito")) {
				jButtonCopiarTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDetaNotaCredito")) {
				jButtonVerFormTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDetaNotaCredito")) {
				jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDetaNotaCredito")) {
				jButtonModificarTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDetaNotaCredito")) {
				jButtonActualizarTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDetaNotaCredito")) {
				jButtonEliminarTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDetaNotaCredito")) {
				jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDetaNotaCredito")) {
				jButtonCancelarTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDetaNotaCredito")) {
				jButtonCerrarTipoDetaNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDetaNotaCredito")) {
				jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDetaNotaCredito")) {
				jButtonNuevoGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDetaNotaCredito")) {
				jButtonAbrirOrderByTipoDetaNotaCreditoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDetaNotaCredito")) {
				jButtonRecargarInformacionTipoDetaNotaCreditoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDetaNotaCredito")) {
				jButtonAnterioresTipoDetaNotaCreditoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDetaNotaCredito")) {
				jButtonSiguientesTipoDetaNotaCreditoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDetaNotaCreditoBusqueda")) {
				this.jButtonidTipoDetaNotaCreditoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDetaNotaCreditoUpdate")) {
				this.jButtonid_empresaTipoDetaNotaCreditoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDetaNotaCreditoBusqueda")) {
				this.jButtonid_empresaTipoDetaNotaCreditoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDetaNotaCreditoBusqueda")) {
				this.jButtoncodigoTipoDetaNotaCreditoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDetaNotaCreditoBusqueda")) {
				this.jButtonnombreTipoDetaNotaCreditoBusquedaActionPerformed(evt);
			}
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDetaNotaCredito();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDetaNotaCredito")) {
				closingInternalFrameTipoDetaNotaCredito();
				
			} else if(sTipo.equals("jButtonCancelarTipoDetaNotaCredito")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDetaNotaCredito = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDetaNotaCreditoBeanSwingJInternalFrame jInternalFrameParent=(TipoDetaNotaCreditoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDetaNotaCredito.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDetaNotaCreditoActionPerformed(null);
			}
			
			TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodetanotacredito,new Object(),this.tipodetanotacreditoParameterGeneral,this.tipodetanotacreditoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDetaNotaCredito(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDetaNotaCredito(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDetaNotaCredito(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodetanotacredito)) {
			if(!esControlTabla) {
				if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.tipodetanotacredito,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);			
				}
				
				if(this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDetaNotaCredito(this.tipodetanotacredito,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodetanotacreditoReturnGeneral=tipodetanotacreditoLogic.procesarEventosTipoDetaNotaCreditosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos(),this.tipodetanotacredito,this.tipodetanotacreditoParameterGeneral,this.isEsNuevoTipoDetaNotaCredito,classes);//this.tipodetanotacreditoLogic.getTipoDetaNotaCredito()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDetaNotaCredito(this.tipodetanotacreditoReturnGeneral,this.tipodetanotacreditoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDetaNotaCredito(classes,this.tipodetanotacreditoReturnGeneral,this.tipodetanotacreditoBean,false);
					}
						
					if(this.tipodetanotacreditoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDetaNotaCredito(this.tipodetanotacreditoReturnGeneral.getTipoDetaNotaCredito());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDetaNotaCredito(this.tipodetanotacreditoReturnGeneral.getTipoDetaNotaCredito());	
					}
						
					if(this.tipodetanotacreditoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDetaNotaCredito(this.tipodetanotacreditoReturnGeneral.getTipoDetaNotaCredito(),classes);//this.tipodetanotacreditoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDetaNotaCredito(this.tipodetanotacredito,classes);//this.tipodetanotacreditoBean);									
				}
			
				if(TipoDetaNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDetaNotaCredito(this.tipodetanotacredito,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaNotaCredito(this.tipodetanotacredito);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodetanotacreditoAnterior!=null) {
						this.tipodetanotacredito=this.tipodetanotacreditoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodetanotacreditoReturnGeneral=tipodetanotacreditoLogic.procesarEventosTipoDetaNotaCreditosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos(),this.tipodetanotacredito,this.tipodetanotacreditoParameterGeneral,this.isEsNuevoTipoDetaNotaCredito,classes);//this.tipodetanotacreditoLogic.getTipoDetaNotaCredito()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodetanotacreditoReturnGeneral.getTipoDetaNotaCredito(),tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodetanotacreditoReturnGeneral.getTipoDetaNotaCredito(),this.tipodetanotacreditos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDetaNotaCredito.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDetaNotaCredito.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDetaNotaCredito();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDetaNotaCredito() throws Exception {
		
		TipoDetaNotaCreditoModel tipodetanotacreditoModel=(TipoDetaNotaCreditoModel)this.jTableDatosTipoDetaNotaCredito.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetanotacreditoModel.tipodetanotacreditos=this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodetanotacreditoModel.tipodetanotacreditos=this.tipodetanotacreditos;
		}
		
		
		((TipoDetaNotaCreditoModel) this.jTableDatosTipoDetaNotaCredito.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDetaNotaCredito() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodetanotacreditoAnterior(),this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodetanotacreditoAnterior(),this.tipodetanotacreditos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDetaNotaCredito();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
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
										
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetanotacredito,new Object(),generalEntityParameterGeneral,this.tipodetanotacreditoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDetaNotaCreditoConstantesFunciones.getClassesRelationshipsOfTipoDetaNotaCredito(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDetaNotaCreditoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDetaNotaCredito(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDetaNotaCredito(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetanotacredito,new Object(),generalEntityParameterGeneral,this.tipodetanotacreditoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDetaNotaCredito(TipoDetaNotaCreditoBean tipodetanotacreditoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDetaNotaCredito(ArrayList<Classe> classes,TipoDetaNotaCreditoReturnGeneral tipodetanotacreditoReturnGeneral,TipoDetaNotaCreditoBean tipodetanotacreditoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipodetanotacredito)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito = new TipoDetaNotaCreditoDetalleFormJInternalFrame(jDesktopPane,this.tipodetanotacreditoSessionBean.getConGuardarRelaciones(),this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDetaNotaCredito);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.setVisible(false);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.tipodetanotacreditoLogic=this.tipodetanotacreditoLogic;
		
		this.cargarCombosFrameForeignKeyTipoDetaNotaCredito("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDetaNotaCredito();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDetaNotaCredito();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDetaNotaCredito("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDetaNotaCredito();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDetaNotaCredito"));
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonModificarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"ModificarTipoDetaNotaCredito"));

		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonModificarToolBarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDetaNotaCredito"));
					
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemModificarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDetaNotaCredito"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonActualizarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"ActualizarTipoDetaNotaCredito"));
		
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonActualizarToolBarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDetaNotaCredito"));
						
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemActualizarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDetaNotaCredito"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonEliminarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"EliminarTipoDetaNotaCredito"));
		
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonEliminarToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDetaNotaCredito"));
								
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemEliminarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDetaNotaCredito"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonCancelarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"CancelarTipoDetaNotaCredito"));
		
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonCancelarToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDetaNotaCredito"));
					
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemCancelarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDetaNotaCredito"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemDetalleCerrarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDetaNotaCredito"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetaNotaCredito"));
		
		
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetaNotaCredito"));
		
		
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDetaNotaCredito"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonidTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetaNotaCreditoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonid_empresaTipoDetaNotaCreditoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaNotaCreditoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonid_empresaTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtoncodigoTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetaNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonnombreTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetaNotaCreditoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTabbedPaneRelacionesTipoDetaNotaCredito.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDetaNotaCredito"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDetaNotaCredito"));
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDetaNotaCredito"));
		}
		
		this.jTableDatosTipoDetaNotaCredito.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDetaNotaCredito"));
		
		this.jTableDatosTipoDetaNotaCredito.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDetaNotaCredito"));
		
		this.jButtonNuevoTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"NuevoTipoDetaNotaCredito"));
		
		this.jButtonDuplicarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"DuplicarTipoDetaNotaCredito"));
		
		this.jButtonCopiarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"CopiarTipoDetaNotaCredito"));
		
		this.jButtonVerFormTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"VerFormTipoDetaNotaCredito"));
		
		
		this.jButtonNuevoToolBarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDetaNotaCredito"));
			
		this.jButtonDuplicarToolBarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDetaNotaCredito"));
			
		this.jMenuItemNuevoTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDetaNotaCredito"));
			
		this.jMenuItemDuplicarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDetaNotaCredito"));		
		
		
		this.jButtonNuevoRelacionesTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDetaNotaCredito"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDetaNotaCredito"));
			
		this.jMenuItemNuevoRelacionesTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDetaNotaCredito"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonModificarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"ModificarTipoDetaNotaCredito"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonModificarToolBarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDetaNotaCredito"));
			
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemModificarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDetaNotaCredito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonActualizarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"ActualizarTipoDetaNotaCredito"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonActualizarToolBarTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDetaNotaCredito"));
				
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemActualizarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDetaNotaCredito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonEliminarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"EliminarTipoDetaNotaCredito"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonEliminarToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDetaNotaCredito"));
						
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemEliminarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDetaNotaCredito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonCancelarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"CancelarTipoDetaNotaCredito"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonCancelarToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDetaNotaCredito"));
			
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemCancelarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDetaNotaCredito"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDetaNotaCredito"));		
		
		
		this.jButtonCerrarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"CerrarTipoDetaNotaCredito"));
		
		
		this.jButtonCerrarToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDetaNotaCredito"));
			
		this.jMenuItemCerrarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDetaNotaCredito"));
			
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jMenuItemDetalleCerrarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDetaNotaCredito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDetaNotaCredito"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetaNotaCredito"));
		}
		
		this.jButtonCopiarToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDetaNotaCredito"));
			
		this.jButtonVerFormToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDetaNotaCredito"));
		
		this.jMenuItemGuardarCambiosTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDetaNotaCredito"));
			
		this.jMenuItemCopiarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDetaNotaCredito"));		
		
		this.jMenuItemVerFormTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDetaNotaCredito"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDetaNotaCredito"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDetaNotaCredito"));
			
		this.jMenuItemGuardarCambiosTablaTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDetaNotaCredito"));		
		
		
		
		this.jButtonRecargarInformacionTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDetaNotaCredito"));
					
		this.jButtonRecargarInformacionToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDetaNotaCredito"));
		
		this.jMenuItemRecargarInformacionTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDetaNotaCredito"));		
		
		
		
		this.jButtonAnterioresTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"AnterioresTipoDetaNotaCredito"));
		
		
		this.jButtonAnterioresToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDetaNotaCredito"));
		
		this.jMenuItemAnterioresTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDetaNotaCredito"));		
		
		
		this.jButtonSiguientesTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"SiguientesTipoDetaNotaCredito"));
		
		
		this.jButtonSiguientesToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDetaNotaCredito"));
			
		this.jMenuItemSiguientesTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDetaNotaCredito"));
			
		this.jMenuItemAbrirOrderByTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDetaNotaCredito"));
			
		this.jMenuItemMostrarOcultarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDetaNotaCredito"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDetaNotaCredito"));
			
		this.jMenuItemDetalleMostarOcultarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDetaNotaCredito"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDetaNotaCredito"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDetaNotaCredito"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDetaNotaCredito"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDetaNotaCredito"));

		this.jCheckBoxSeleccionadosTipoDetaNotaCredito.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDetaNotaCredito"));
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDetaNotaCredito"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDetaNotaCredito"));
			
		this.jComboBoxTiposAccionesTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDetaNotaCredito"));
					
		this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDetaNotaCredito"));
			
		this.jTextFieldValorCampoGeneralTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDetaNotaCredito"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonidTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetaNotaCreditoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonid_empresaTipoDetaNotaCreditoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaNotaCreditoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonid_empresaTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtoncodigoTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetaNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonnombreTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetaNotaCreditoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDetaNotaCredito"));

			this.jButtonBusquedaPorNombreTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDetaNotaCredito"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDetaNotaCredito!=null) {
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetaNotaCredito"));
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetaNotaCredito"));
				this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetaNotaCredito"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetaNotaCredito"));				
			//this.jButtonGenerarReporteDinamicoTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetaNotaCredito"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetaNotaCredito"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDetaNotaCredito!=null) {
				this.jInternalFrameImportacionTipoDetaNotaCredito.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDetaNotaCredito"));
				this.jInternalFrameImportacionTipoDetaNotaCredito.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDetaNotaCredito"));
				this.jInternalFrameImportacionTipoDetaNotaCredito.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDetaNotaCredito"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDetaNotaCredito"));
			
			this.jButtonAbrirOrderByToolBarTipoDetaNotaCredito.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDetaNotaCredito"));			
			
			if(this.jInternalFrameOrderByTipoDetaNotaCredito!=null) {
				this.jInternalFrameOrderByTipoDetaNotaCredito.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDetaNotaCredito"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTabbedPaneRelacionesTipoDetaNotaCredito.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDetaNotaCredito"));
		
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
            		closingInternalFrameTipoDetaNotaCredito();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDetaNotaCredito = (JInternalFrameBase)event.getSource();
	            	
	            TipoDetaNotaCreditoBeanSwingJInternalFrame jInternalFrameParent=(TipoDetaNotaCreditoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDetaNotaCredito.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDetaNotaCreditoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDetaNotaCredito.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDetaNotaCreditoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDetaNotaCredito.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDetaNotaCredito.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDetaNotaCredito";
		inputMap = this.jButtonNuevoTipoDetaNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDetaNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDetaNotaCredito";
		inputMap = this.jButtonNuevoRelacionesTipoDetaNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDetaNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDetaNotaCreditoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDetaNotaCredito";
		inputMap = this.jButtonModificarTipoDetaNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDetaNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDetaNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDetaNotaCredito";
		inputMap = this.jButtonActualizarTipoDetaNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDetaNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDetaNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDetaNotaCredito";
		inputMap = this.jButtonEliminarTipoDetaNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDetaNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDetaNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDetaNotaCredito";
		inputMap = this.jButtonCancelarTipoDetaNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDetaNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDetaNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDetaNotaCredito";
		inputMap = this.jButtonCerrarTipoDetaNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDetaNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDetaNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDetaNotaCredito";
		inputMap = this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosTipoDetaNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonGuardarCambiosTipoDetaNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDetaNotaCreditoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDetaNotaCredito.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDetaNotaCreditoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDetaNotaCreditoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDetaNotaCredito.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDetaNotaCreditoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonidTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetaNotaCreditoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonid_empresaTipoDetaNotaCreditoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaNotaCreditoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonid_empresaTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtoncodigoTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetaNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jButtonnombreTipoDetaNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetaNotaCreditoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDetaNotaCredito"));

		this.jButtonBusquedaPorNombreTipoDetaNotaCredito.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDetaNotaCredito"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDetaNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDetaNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDetaNotaCreditoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDetaNotaCredito(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
					tipodetanotacreditoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditos) {
					tipodetanotacreditoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDetaNotaCreditoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
						tipodetanotacreditoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditos) {
						tipodetanotacreditoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDetaNotaCredito.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDetaNotaCredito.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaNotaCredito,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDetaNotaCreditoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDetaNotaCredito.getSelectedRows();
			
			TipoDetaNotaCredito tipodetanotacreditoLocal=new TipoDetaNotaCredito();
			
			//this.seleccionarTodosTipoDetaNotaCredito(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetanotacreditoLocal =(TipoDetaNotaCredito) this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos().toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodetanotacreditoLocal =(TipoDetaNotaCredito) this.tipodetanotacreditos.toArray()[this.jTableDatosTipoDetaNotaCredito.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodetanotacreditoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
						tipodetanotacreditoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditos) {
						tipodetanotacreditoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDetaNotaCredito.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDetaNotaCredito.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaNotaCredito,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDetaNotaCreditoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDetaNotaCreditoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDetaNotaCreditoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDetaNotaCredito.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
				
						if(sTipoSeleccionar.equals(TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodetanotacreditoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodetanotacreditoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditos) {
					
						if(sTipoSeleccionar.equals(TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodetanotacreditoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodetanotacreditoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDetaNotaCreditoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDetaNotaCredito=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDetaNotaCredito.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDetaNotaCredito) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDetaNotaCredito(conSplash);
				
					this.generarReporteTipoDetaNotaCreditosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDetaNotaCreditosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDetaNotaCreditosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDetaNotaCreditosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDetaNotaCredito();
				
				this.exportarTipoDetaNotaCreditosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDetaNotaCreditos();
				//this.importarTipoDetaNotaCreditos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDetaNotaCredito();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDetaNotaCreditosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Detalle Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDetaNotaCredito();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDetaNotaCredito)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDetaNotaCredito(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Detalle Nota Credito",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoDetaNotaCreditoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoDetaNotaCredito) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoDetaNotaCredito(conSplash);
					
						//this.actualizarParametrosGeneralTipoDetaNotaCredito();
						
						this.generarReporteProcesoAccionTipoDetaNotaCreditosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Detalle Nota CreditoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Detalle Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoDetaNotaCredito();
				
						this.actualizarParametrosGeneralTipoDetaNotaCredito();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipodetanotacreditoReturnGeneral=tipodetanotacreditoLogic.procesarAccionTipoDetaNotaCreditosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos(),this.tipodetanotacreditoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoDetaNotaCreditoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDetaNotaCredito();
					
					TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoDetaNotaCreditoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDetaNotaCredito.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDetaNotaCredito(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDetaNotaCreditoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDetaNotaCredito();
			
			if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();		
			TipoDetaNotaCredito tipodetanotacredito=new TipoDetaNotaCredito();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDetaNotaCredito(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDetaNotaCredito.getSelectedItem();
			
			
			
			
			tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodetanotacreditosSeleccionados.size()==1) {
				for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditosSeleccionados) {
					tipodetanotacredito=tipodetanotacreditoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDetaNotaCredito();
			
      		//this.finishProcessTipoDetaNotaCredito(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDetaNotaCreditoReturnGeneral() throws Exception {
		if(this.tipodetanotacreditoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodetanotacreditoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodetanotacreditoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodetanotacreditoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodetanotacreditoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodetanotacreditoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDetaNotaCredito(false);
		}
		
		if(this.tipodetanotacreditoReturnGeneral.getConRetornoLista() || this.tipodetanotacreditoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodetanotacreditoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodetanotacreditoLogic.setTipoDetaNotaCreditos(this.tipodetanotacreditoReturnGeneral.getTipoDetaNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodetanotacreditoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodetanotacreditoLogic.setTipoDetaNotaCredito(this.tipodetanotacreditoReturnGeneral.getTipoDetaNotaCredito());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDetaNotaCredito(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDetaNotaCredito() throws Exception {
		
		
	}
	
	public ArrayList<TipoDetaNotaCredito> getTipoDetaNotaCreditosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDetaNotaCredito) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditoLogic.getTipoDetaNotaCreditos()) {
					if(tipodetanotacreditoAux.getIsSelected()) {
						tipodetanotacreditosSeleccionados.add(tipodetanotacreditoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetaNotaCredito tipodetanotacreditoAux:this.tipodetanotacreditos) {
					if(tipodetanotacreditoAux.getIsSelected()) {
						tipodetanotacreditosSeleccionados.add(tipodetanotacreditoAux);				
					}
				}
			}
			
			if(tipodetanotacreditosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodetanotacreditosSeleccionados.addAll(this.tipodetanotacreditoLogic.getTipoDetaNotaCreditos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodetanotacreditosSeleccionados.addAll(this.tipodetanotacreditos);				
					}
				}
			}
		} else {
			tipodetanotacreditosSeleccionados.add(this.tipodetanotacredito);
		}
		
		return tipodetanotacreditosSeleccionados;
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
	
	public void generarReporteTipoDetaNotaCreditosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDetaNotaCreditosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDetaNotaCreditosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDetaNotaCreditosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDetaNotaCreditosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Detalle Nota Credito",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDetaNotaCreditosSeleccionados() throws Exception {
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();		
		
		tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDetaNotaCreditos("Todos",tipodetanotacreditosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDetaNotaCreditosSeleccionados() throws Exception {
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();		
		
		tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDetaNotaCreditos("Todos",tipodetanotacreditosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDetaNotaCreditosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();
		
		tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDetaNotaCreditos("Todos",tipodetanotacreditosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDetaNotaCreditosSeleccionados() throws Exception {
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDetaNotaCredito();
		
		
		tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDetaNotaCredito();
		
		
		//this.generarReporteTipoDetaNotaCreditos("Todos",tipodetanotacreditosSeleccionados ,tipodetanotacreditoImplementable,tipodetanotacreditoImplementableHome);
	}
	
	public void mostrarImportacionTipoDetaNotaCreditos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDetaNotaCredito();
		
		this.abrirFrameImportacionTipoDetaNotaCredito();		
		
			
		//this.generarReporteTipoDetaNotaCreditos("Todos",tipodetanotacreditosSeleccionados ,tipodetanotacreditoImplementable,tipodetanotacreditoImplementableHome);
	}
	
	public void importarTipoDetaNotaCreditos() throws Exception {		
	
	}
	
	public void exportarTipoDetaNotaCreditosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDetaNotaCreditosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDetaNotaCreditosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDetaNotaCreditosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Detalle Nota Credito",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDetaNotaCreditosSeleccionados() throws Exception {
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();		
		
		tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetanotacredito."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDetaNotaCredito(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDetaNotaCredito(tipodetanotacreditoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodetanotacreditoAux.setsDetalleGeneralEntityReporte(tipodetanotacreditoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDetaNotaCredito(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDetaNotaCreditoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetaNotaCreditoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodetanotacredito.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetanotacredito.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetanotacredito.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetanotacredito.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetanotacredito.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDetaNotaCreditosSeleccionados() throws Exception {
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();		
		
		tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetanotacredito.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDetaNotaCreditos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDetaNotaCredito(row);				
				iRow++;
			}				
			
			for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDetaNotaCredito(tipodetanotacreditoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDetaNotaCreditosSeleccionados() throws Exception {
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();		
		
		tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetanotacredito.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodetanotacreditos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodetanotacredito");
			//elementRoot.appendChild(element);
		
			for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditosSeleccionados) {
				element = document.createElement("tipodetanotacredito");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDetaNotaCredito(tipodetanotacreditoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDetaNotaCredito(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetanotacredito.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetanotacredito.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetanotacredito.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetanotacredito.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDetaNotaCredito(TipoDetaNotaCredito tipodetanotacredito,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDetaNotaCreditoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodetanotacredito.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDetaNotaCreditoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodetanotacredito.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoDetaNotaCreditoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipodetanotacredito.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoDetaNotaCreditoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodetanotacredito.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDetaNotaCreditoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodetanotacredito.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDetaNotaCreditosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados=new ArrayList<TipoDetaNotaCredito>();
		
		tipodetanotacreditosSeleccionados=this.getTipoDetaNotaCreditosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDetaNotaCredito(tipodetanotacreditosSeleccionados);
		
		this.generarReporteTipoDetaNotaCreditos("Todos",tipodetanotacreditosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDetaNotaCredito(ArrayList<TipoDetaNotaCredito> tipodetanotacreditosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDetaNotaCredito tipodetanotacreditoAux:tipodetanotacreditosSeleccionados) {
				tipodetanotacreditoAux.setsDetalleGeneralEntityReporte(tipodetanotacreditoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipodetanotacreditoAux.setsDescripcionGeneralEntityReporte1(tipodetanotacreditoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodetanotacreditoAux.setsDescripcionGeneralEntityReporte1(tipodetanotacreditoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodetanotacreditoAux.setsDescripcionGeneralEntityReporte1(tipodetanotacreditoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDetaNotaCredito(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaModificarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaModificarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaModificarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaModificarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaModificarTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaCancelarTipoDetaNotaCredito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaNotaCredito=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDetaNotaCreditoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=true;
		} else {
			this.actualizarEstadoPanelsTipoDetaNotaCredito(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDetaNotaCredito=false;
			//this.isVisibilidadCeldaVerFormTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaDuplicarTipoDetaNotaCredito=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaNotaCredito=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
			if(!tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=false;												
			}
			
			this.jButtonCerrarTipoDetaNotaCredito.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaNotaCredito=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodetanotacredito)) {
			this.isVisibilidadCeldaActualizarTipoDetaNotaCredito=false;
			this.isVisibilidadCeldaEliminarTipoDetaNotaCredito=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDetaNotaCredito() {
	}
	
	public void actualizarEstadoPanelsTipoDetaNotaCredito(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaNotaCredito!=null) {
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosTipoDetaNotaCredito.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetaNotaCredito!=null) {
				this.jPanelPaginacionTipoDetaNotaCredito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetaNotaCredito!=null) {
				this.jPanelParametrosReportesTipoDetaNotaCredito.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaNotaCredito!=null) {
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosTipoDetaNotaCredito.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetaNotaCredito!=null) {
				this.jPanelPaginacionTipoDetaNotaCredito.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetaNotaCredito!=null) {
				this.jPanelParametrosReportesTipoDetaNotaCredito.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaNotaCredito!=null) {
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosTipoDetaNotaCredito.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetaNotaCredito!=null) {
				this.jPanelPaginacionTipoDetaNotaCredito.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetaNotaCredito!=null) {
				this.jPanelParametrosReportesTipoDetaNotaCredito.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaNotaCredito!=null) {
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosTipoDetaNotaCredito.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetaNotaCredito!=null) {
				this.jPanelPaginacionTipoDetaNotaCredito.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetaNotaCredito!=null) {
				this.jPanelParametrosReportesTipoDetaNotaCredito.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaNotaCredito!=null) {
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosTipoDetaNotaCredito.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetaNotaCredito!=null) {
				this.jPanelPaginacionTipoDetaNotaCredito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetaNotaCredito!=null) {
				this.jPanelParametrosReportesTipoDetaNotaCredito.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaNotaCredito!=null) {
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosTipoDetaNotaCredito.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetaNotaCredito!=null) {
				this.jPanelPaginacionTipoDetaNotaCredito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetaNotaCredito!=null) {
				this.jPanelParametrosReportesTipoDetaNotaCredito.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaNotaCredito!=null) {
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaNotaCredito!=null) {
				this.jScrollPanelDatosTipoDetaNotaCredito.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetaNotaCredito!=null) {
				this.jPanelPaginacionTipoDetaNotaCredito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetaNotaCredito!=null) {
				this.jPanelParametrosReportesTipoDetaNotaCredito.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDetaNotaCredito!=null) {
					this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDetaNotaCredito!=null) {
				this.jPanelParametrosReportesTipoDetaNotaCredito.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaNotaCredito!=null) {
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDetaNotaCredito!=null) {
				this.jPanelParametrosReportesTipoDetaNotaCredito.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoDetaNotaCredito.remove(jPanelBusquedaPorCodigoTipoDetaNotaCredito);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoDetaNotaCredito.remove(jPanelBusquedaPorNombreTipoDetaNotaCredito);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDetaNotaCreditoSessionBean tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean();
		
		if(this.tipodetanotacreditoSessionBean==null) {
			this.tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean();
		}
		
		this.tipodetanotacreditoSessionBean.setsUltimaBusquedaTipoDetaNotaCredito(this.getsAccionBusqueda());
		this.tipodetanotacreditoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodetanotacreditoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipodetanotacreditoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipodetanotacreditoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipodetanotacreditoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDetaNotaCreditoSessionBean tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean();
		
		if(this.tipodetanotacreditoSessionBean==null) {
			this.tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean();
		}
		
		if(this.tipodetanotacreditoSessionBean.getsUltimaBusquedaTipoDetaNotaCredito()!=null&&!this.tipodetanotacreditoSessionBean.getsUltimaBusquedaTipoDetaNotaCredito().equals("")) {
			this.setsAccionBusqueda(tipodetanotacreditoSessionBean.getsUltimaBusquedaTipoDetaNotaCredito());
			this.setiNumeroPaginacion(tipodetanotacreditoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodetanotacreditoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipodetanotacreditoSessionBean.getcodigo());
				tipodetanotacreditoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipodetanotacreditoSessionBean.getnombre());
				tipodetanotacreditoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipodetanotacreditoSessionBean.getid_empresa());
				tipodetanotacreditoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipodetanotacreditoSessionBean.setsUltimaBusquedaTipoDetaNotaCredito("");
		this.tipodetanotacreditoSessionBean.setiNumeroPaginacion(TipoDetaNotaCreditoConstantesFunciones.INUMEROPAGINACION);
		this.tipodetanotacreditoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDetaNotaCredito(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDetaNotaCredito() {
		this.updateBorderResaltarBusquedasFormularioTipoDetaNotaCredito();
		this.updateVisibilidadBusquedasFormularioTipoDetaNotaCredito();
		this.updateHabilitarBusquedasFormularioTipoDetaNotaCredito();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDetaNotaCredito() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponents().length>0) {
	

		if(this.tipodetanotacreditoConstantesFunciones.resaltarBusquedaPorCodigoTipoDetaNotaCredito!=null) {
			index= this.jTabbedPaneBusquedasTipoDetaNotaCredito.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetaNotaCredito);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponent(index);
				jPanel.setBorder(this.tipodetanotacreditoConstantesFunciones.resaltarBusquedaPorCodigoTipoDetaNotaCredito);
			}
		}

		if(this.tipodetanotacreditoConstantesFunciones.resaltarBusquedaPorNombreTipoDetaNotaCredito!=null) {
			index= this.jTabbedPaneBusquedasTipoDetaNotaCredito.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetaNotaCredito);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponent(index);
				jPanel.setBorder(this.tipodetanotacreditoConstantesFunciones.resaltarBusquedaPorNombreTipoDetaNotaCredito);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDetaNotaCredito() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDetaNotaCredito.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetaNotaCredito);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodetanotacreditoConstantesFunciones.mostrarBusquedaPorCodigoTipoDetaNotaCredito);
			if(!this.tipodetanotacreditoConstantesFunciones.mostrarBusquedaPorCodigoTipoDetaNotaCredito && index>-1) {
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDetaNotaCredito.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetaNotaCredito);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodetanotacreditoConstantesFunciones.mostrarBusquedaPorNombreTipoDetaNotaCredito);
			if(!this.tipodetanotacreditoConstantesFunciones.mostrarBusquedaPorNombreTipoDetaNotaCredito && index>-1) {
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDetaNotaCredito() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDetaNotaCredito.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetaNotaCredito);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodetanotacreditoConstantesFunciones.activarBusquedaPorCodigoTipoDetaNotaCredito);
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setEnabledAt(index,this.tipodetanotacreditoConstantesFunciones.activarBusquedaPorCodigoTipoDetaNotaCredito);
			}

			index= this.jTabbedPaneBusquedasTipoDetaNotaCredito.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetaNotaCredito);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodetanotacreditoConstantesFunciones.activarBusquedaPorNombreTipoDetaNotaCredito);
				this.jTabbedPaneBusquedasTipoDetaNotaCredito.setEnabledAt(index,this.tipodetanotacreditoConstantesFunciones.activarBusquedaPorNombreTipoDetaNotaCredito);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDetaNotaCredito(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoDetaNotaCredito.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetaNotaCredito);

			this.jTabbedPaneBusquedasTipoDetaNotaCredito.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponent(index);

			this.tipodetanotacreditoConstantesFunciones.setResaltarBusquedaPorCodigoTipoDetaNotaCredito(resaltar);

			jPanel.setBorder(this.tipodetanotacreditoConstantesFunciones.resaltarBusquedaPorCodigoTipoDetaNotaCredito);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoDetaNotaCredito.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetaNotaCredito);

			this.jTabbedPaneBusquedasTipoDetaNotaCredito.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaNotaCredito.getComponent(index);

			this.tipodetanotacreditoConstantesFunciones.setResaltarBusquedaPorNombreTipoDetaNotaCredito(resaltar);

			jPanel.setBorder(this.tipodetanotacreditoConstantesFunciones.resaltarBusquedaPorNombreTipoDetaNotaCredito);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoDetaNotaCredito.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDetaNotaCredito() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDetaNotaCredito();
		this.updateVisibilidadResaltarControlesFormularioTipoDetaNotaCredito();
		this.updateHabilitarResaltarControlesFormularioTipoDetaNotaCredito();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDetaNotaCredito() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodetanotacreditoConstantesFunciones.resaltaridTipoDetaNotaCredito!=null && this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.setBorder(this.tipodetanotacreditoConstantesFunciones.resaltaridTipoDetaNotaCredito);}
		if(this.tipodetanotacreditoConstantesFunciones.resaltarid_empresaTipoDetaNotaCredito!=null && this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.setBorder(this.tipodetanotacreditoConstantesFunciones.resaltarid_empresaTipoDetaNotaCredito);}
		if(this.tipodetanotacreditoConstantesFunciones.resaltarcodigoTipoDetaNotaCredito!=null && this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextFieldcodigoTipoDetaNotaCredito.setBorder(this.tipodetanotacreditoConstantesFunciones.resaltarcodigoTipoDetaNotaCredito);}
		if(this.tipodetanotacreditoConstantesFunciones.resaltarnombreTipoDetaNotaCredito!=null && this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextAreanombreTipoDetaNotaCredito.setBorder(this.tipodetanotacreditoConstantesFunciones.resaltarnombreTipoDetaNotaCredito);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDetaNotaCredito() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
	
		//this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.setVisible(this.tipodetanotacreditoConstantesFunciones.mostraridTipoDetaNotaCredito);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jPanelidTipoDetaNotaCredito.setVisible(this.tipodetanotacreditoConstantesFunciones.mostraridTipoDetaNotaCredito);
		//this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.setVisible(this.tipodetanotacreditoConstantesFunciones.mostrarid_empresaTipoDetaNotaCredito);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jPanelid_empresaTipoDetaNotaCredito.setVisible(this.tipodetanotacreditoConstantesFunciones.mostrarid_empresaTipoDetaNotaCredito);
		//this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextFieldcodigoTipoDetaNotaCredito.setVisible(this.tipodetanotacreditoConstantesFunciones.mostrarcodigoTipoDetaNotaCredito);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jPanelcodigoTipoDetaNotaCredito.setVisible(this.tipodetanotacreditoConstantesFunciones.mostrarcodigoTipoDetaNotaCredito);
		//this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextAreanombreTipoDetaNotaCredito.setVisible(this.tipodetanotacreditoConstantesFunciones.mostrarnombreTipoDetaNotaCredito);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jPanelnombreTipoDetaNotaCredito.setVisible(this.tipodetanotacreditoConstantesFunciones.mostrarnombreTipoDetaNotaCredito);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDetaNotaCredito() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDetaNotaCredito!=null) {
	
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jLabelidTipoDetaNotaCredito.setEnabled(this.tipodetanotacreditoConstantesFunciones.activaridTipoDetaNotaCredito);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jComboBoxid_empresaTipoDetaNotaCredito.setEnabled(this.tipodetanotacreditoConstantesFunciones.activarid_empresaTipoDetaNotaCredito);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextFieldcodigoTipoDetaNotaCredito.setEnabled(this.tipodetanotacreditoConstantesFunciones.activarcodigoTipoDetaNotaCredito);
		this.jInternalFrameDetalleFormTipoDetaNotaCredito.jTextAreanombreTipoDetaNotaCredito.setEnabled(this.tipodetanotacreditoConstantesFunciones.activarnombreTipoDetaNotaCredito);
		}
	}
	
		
}