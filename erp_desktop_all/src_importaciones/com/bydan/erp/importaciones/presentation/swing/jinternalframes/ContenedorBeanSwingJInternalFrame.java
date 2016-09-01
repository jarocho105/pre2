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

import com.bydan.erp.importaciones.util.ContenedorConstantesFunciones;
import com.bydan.erp.importaciones.util.ContenedorParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.ContenedorParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.ContenedorBean;
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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ContenedorBeanSwingJInternalFrame extends ContenedorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ContenedorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Contenedor> contenedorValidator = new ClassValidator<Contenedor>(Contenedor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Contenedor contenedor;	
	public Contenedor contenedorAux;
	public Contenedor contenedorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Contenedor contenedorTotales;
	public Long idContenedorActual;
	public Long iIdNuevoContenedor=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboPedido="";

	public List<Pedido> pedidosForeignKey;

	public List<Pedido> getpedidosForeignKey() {
		return pedidosForeignKey;
	}

	public void setpedidosForeignKey(List<Pedido> pedidosForeignKey) {
		this.pedidosForeignKey = pedidosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pedido pedidoForeignKey;

	public Pedido getpedidoForeignKey() {
		return pedidoForeignKey;
	}

	public void setpedidoForeignKey(Pedido pedidoForeignKey) {
		this.pedidoForeignKey = pedidoForeignKey;
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
	
	public Boolean isPermisoTodoContenedor;
	public Boolean isPermisoNuevoContenedor;
	public Boolean isPermisoActualizarContenedor;
	public Boolean isPermisoActualizarOriginalContenedor;
	public Boolean isPermisoEliminarContenedor;
	public Boolean isPermisoGuardarCambiosContenedor;
	public Boolean isPermisoConsultaContenedor;
	public Boolean isPermisoBusquedaContenedor;
	public Boolean isPermisoReporteContenedor;
	public Boolean isPermisoPaginacionMedioContenedor;
	public Boolean isPermisoPaginacionAltoContenedor;
	public Boolean isPermisoPaginacionTodoContenedor;
	public Boolean isPermisoCopiarContenedor;
	public Boolean isPermisoVerFormContenedor;
	public Boolean isPermisoDuplicarContenedor;
	public Boolean isPermisoOrdenContenedor;
	
	
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
	
	public ContenedorParameterReturnGeneral contenedorReturnGeneral;
	public ContenedorParameterReturnGeneral contenedorParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoContenedor=false;
	public Boolean esParaAccionDesdeFormularioContenedor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ContenedorSessionBeanAdditional contenedorSessionBeanAdditional=null;
	
	public ContenedorSessionBeanAdditional getContenedorSessionBeanAdditional() {
		return this.contenedorSessionBeanAdditional;
	}
	
	public void setContenedorSessionBeanAdditional(ContenedorSessionBeanAdditional contenedorSessionBeanAdditional) {
		try {
			this.contenedorSessionBeanAdditional=contenedorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ContenedorBeanSwingJInternalFrameAdditional contenedorBeanSwingJInternalFrameAdditional=null;
	//public class ContenedorBeanSwingJInternalFrame
	
	public ContenedorBeanSwingJInternalFrameAdditional getContenedorBeanSwingJInternalFrameAdditional() {
		return this.contenedorBeanSwingJInternalFrameAdditional;
	}
	
	public void setContenedorBeanSwingJInternalFrameAdditional(ContenedorBeanSwingJInternalFrameAdditional contenedorBeanSwingJInternalFrameAdditional) {
		try {
			this.contenedorBeanSwingJInternalFrameAdditional=contenedorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ContenedorLogic contenedorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Contenedor contenedorBean;
	public ContenedorConstantesFunciones contenedorConstantesFunciones;
	//public ContenedorParameterReturnGeneral contenedorReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public PedidoLogic pedidoLogic;
	
	//PARAMETROS
	
	
	//public List<Contenedor> contenedors;	
	//public List<Contenedor> contenedorsEliminados;
	//public List<Contenedor> contenedorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoContenedor=false;
	public Boolean isVisibilidadCeldaDuplicarContenedor=true;
	public Boolean isVisibilidadCeldaCopiarContenedor=true;
	public Boolean isVisibilidadCeldaVerFormContenedor=true;
	public Boolean isVisibilidadCeldaOrdenContenedor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesContenedor=false;
	public Boolean isVisibilidadCeldaModificarContenedor=false;
	public Boolean isVisibilidadCeldaActualizarContenedor=false;
	public Boolean isVisibilidadCeldaEliminarContenedor=false;
	public Boolean isVisibilidadCeldaCancelarContenedor=false;
	public Boolean isVisibilidadCeldaGuardarContenedor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosContenedor=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPedido=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoContenedor() {
		return this.iIdNuevoContenedor;
	}

	public void setiIdNuevoContenedor(Long iIdNuevoContenedor) {
		this.iIdNuevoContenedor = iIdNuevoContenedor;
	}
	
	public Long getidContenedorActual() {
		return this.idContenedorActual;
	}

	public void setidContenedorActual(Long idContenedorActual) {
		this.idContenedorActual = idContenedorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Contenedor getcontenedor() {
		return this.contenedor;
	}

	public void setcontenedor(Contenedor contenedor) {
		this.contenedor = contenedor;
	}
	
	public Contenedor getcontenedorAux() {
		return this.contenedorAux;
	}

	public void setcontenedorAux(Contenedor contenedorAux) {
		this.contenedorAux = contenedorAux;
	}				
	
	public Contenedor getcontenedorAnterior() {
		return this.contenedorAnterior;
	}

	public void setcontenedorAnterior(Contenedor contenedorAnterior) {
		this.contenedorAnterior = contenedorAnterior;
	}	
	
	public Contenedor getcontenedorTotales() {
		return this.contenedorTotales;
	}

	public void setcontenedorTotales(Contenedor contenedorTotales) {
		this.contenedorTotales = contenedorTotales;
	}	
	
	public Contenedor getcontenedorBean() {
		return this.contenedorBean;
	}

	public void setcontenedorBean(Contenedor contenedorBean) {
		this.contenedorBean = contenedorBean;
	}	
	
	public ContenedorParameterReturnGeneral getcontenedorReturnGeneral() {
		return this.contenedorReturnGeneral;
	}

	public void setcontenedorReturnGeneral(ContenedorParameterReturnGeneral contenedorReturnGeneral) {
		this.contenedorReturnGeneral = contenedorReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_pedidoFK_IdPedido=-1L;

	public Long getid_pedidoFK_IdPedido() {
		return this.id_pedidoFK_IdPedido;
	}

	public void setid_pedidoFK_IdPedido(Long id_pedidoFK_IdPedido) {
		this.id_pedidoFK_IdPedido = id_pedidoFK_IdPedido;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ContenedorLogic getContenedorLogic()	{		
		return contenedorLogic;
	}

	public void setContenedorLogic(ContenedorLogic contenedorLogic) {
		this.contenedorLogic = contenedorLogic;
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
	
	public Boolean getIsEsNuevoContenedor() {
		return isEsNuevoContenedor;
	}

	public void setIsEsNuevoContenedor(Boolean isEsNuevoContenedor) {
		this.isEsNuevoContenedor = isEsNuevoContenedor;
	}

	public Boolean getEsParaAccionDesdeFormularioContenedor() {
		return esParaAccionDesdeFormularioContenedor;
	}
	
	public void setEsParaAccionDesdeFormularioContenedor(Boolean esParaAccionDesdeFormularioContenedor) {
		this.esParaAccionDesdeFormularioContenedor = esParaAccionDesdeFormularioContenedor;
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

			if(this.contenedorSessionBean==null) {
				this.contenedorSessionBean=new ContenedorSessionBean();
			}

			if(!this.contenedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(contenedorSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.contenedorSessionBean==null) {
				this.contenedorSessionBean=new ContenedorSessionBean();
			}

			if(!this.contenedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(contenedorSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosPedidosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.pedidosForeignKey=new ArrayList<Pedido>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PedidoLogic pedidoLogic=new PedidoLogic();

			//pedidoLogic.getPedidoDataAccess().setIsForForeingKeyData(true);

			if(this.contenedorSessionBean==null) {
				this.contenedorSessionBean=new ContenedorSessionBean();
			}

			if(!this.contenedorSessionBean.getisBusquedaDesdeForeignKeySesionPedido()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoLogic.getPedidoDataAccess().setIsForForeingKeyData(true);

					pedidoLogic.getTodosPedidosWithConnection(sFinalQuery,new Pagination());

					this.pedidosForeignKey=pedidoLogic.getPedidos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPedido(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoLogic.getEntityWithConnection(contenedorSessionBean.getlidPedidoActual());
					this.pedidosForeignKey.add(pedidoLogic.getPedido());
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

					if(this.contenedor!=null) {
						this.contenedor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormContenedor!=null) {
						this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaContenedor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormContenedor!=null) {
						if(this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaContenedorGenerico)throws Exception
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
				jComboBoxid_empresaContenedorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaContenedorGenerico!=null && jComboBoxid_empresaContenedorGenerico.getItemCount()>0) {
					jComboBoxid_empresaContenedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.contenedor!=null) {
						this.contenedor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormContenedor!=null) {
						this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalContenedor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormContenedor!=null) {
						if(this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalContenedorGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalContenedorGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalContenedorGenerico!=null && jComboBoxid_sucursalContenedorGenerico.getItemCount()>0) {
					jComboBoxid_sucursalContenedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPedidoForeignKey(Long idPedidoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pedido  pedidoTemp=null;

			for(Pedido pedidoAux:pedidosForeignKey) {
				if(pedidoAux.getId()!=null && pedidoAux.getId().equals(idPedidoSeleccionado)) {
					pedidoTemp=pedidoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(pedidoTemp!=null) {

					if(this.contenedor!=null) {
						this.contenedor.setPedido(pedidoTemp);
					}

					if(this.jInternalFrameDetalleFormContenedor!=null) {
						this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.setSelectedItem(pedidoTemp);
					}
				} else {
					//jComboBoxid_pedidoContenedor.setSelectedItem(pedidoTemp);
					if(this.jInternalFrameDetalleFormContenedor!=null) {
						if(this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPedido") || sFormularioTipoBusqueda.equals("Todos")){
					if(pedidoTemp!=null && jComboBoxid_pedidoFK_IdPedidoContenedor!=null) {
						jComboBoxid_pedidoFK_IdPedidoContenedor.setSelectedItem(pedidoTemp);
					} else {
						if(jComboBoxid_pedidoFK_IdPedidoContenedor!=null) {
							//jComboBoxid_pedidoFK_IdPedidoContenedor.setSelectedItem(pedidoTemp);
							if(jComboBoxid_pedidoFK_IdPedidoContenedor.getItemCount()>0) {
								jComboBoxid_pedidoFK_IdPedidoContenedor.setSelectedIndex(0);
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

	public String getActualPedidoForeignKeyDescripcion(Long idPedidoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pedido  pedidoTemp=null;

			for(Pedido pedidoAux:pedidosForeignKey) {
				if(pedidoAux.getId()!=null && pedidoAux.getId().equals(idPedidoSeleccionado)) {
					pedidoTemp=pedidoAux;
					break;
				}
			}


			sDescripcion=PedidoConstantesFunciones.getPedidoDescripcion(pedidoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPedidoForeignKeyGenerico(Long idPedidoSeleccionado,JComboBox jComboBoxid_pedidoContenedorGenerico)throws Exception
	{
		try
		{
			Pedido  pedidoTemp=null;

			for(Pedido pedidoAux:pedidosForeignKey) {
				if(pedidoAux.getId()!=null && pedidoAux.getId().equals(idPedidoSeleccionado)) {
					pedidoTemp=pedidoAux;
					break;
				}
			}

			if(pedidoTemp!=null) {
				jComboBoxid_pedidoContenedorGenerico.setSelectedItem(pedidoTemp);
			} else {
				if(jComboBoxid_pedidoContenedorGenerico!=null && jComboBoxid_pedidoContenedorGenerico.getItemCount()>0) {
					jComboBoxid_pedidoContenedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Contenedor contenedor,JComboBox jComboBoxid_empresaContenedorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaContenedorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaContenedorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				contenedor.setid_empresa(empresaAux.getId());
				contenedor.setempresa_descripcion(ContenedorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				contenedor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Contenedor contenedor,JComboBox jComboBoxid_sucursalContenedorGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalContenedorGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalContenedorGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				contenedor.setid_sucursal(sucursalAux.getId());
				contenedor.setsucursal_descripcion(ContenedorConstantesFunciones.getSucursalDescripcion(sucursalAux));
				contenedor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPedidoForeignKey(Contenedor contenedor,JComboBox jComboBoxid_pedidoContenedorGenerico)throws Exception
	{
		try
		{
			Pedido  pedidoAux=new Pedido();

			if(jComboBoxid_pedidoContenedorGenerico==null) {
				pedidoAux=(Pedido)this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.getSelectedItem();
			} else {
				pedidoAux=(Pedido)jComboBoxid_pedidoContenedorGenerico.getSelectedItem();
			}

			if(pedidoAux!=null && pedidoAux.getId()!=null) {
				contenedor.setid_pedido(pedidoAux.getId());
				contenedor.setpedido_descripcion(ContenedorConstantesFunciones.getPedidoDescripcion(pedidoAux));
				contenedor.setPedido(pedidoAux);			}
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

					if(!ContenedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormContenedor!=null) { 
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormContenedor!=null) { 
					}

					if(!ContenedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ContenedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormContenedor!=null) { 
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormContenedor!=null) { 
					}

					if(!ContenedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePedidosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPedido=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ContenedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormContenedor!=null) { 
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.removeAllItems();

							for(Pedido pedido:this.pedidosForeignKey) {
								this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.addItem(pedido);
							}
						}
					}

					if(this.jInternalFrameDetalleFormContenedor!=null) { 
					}

					if(!ContenedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPedido") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ContenedorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_pedidoFK_IdPedidoContenedor.removeAllItems();

							for(Pedido pedido:this.pedidosForeignKey) {
								this.jComboBoxid_pedidoFK_IdPedidoContenedor.addItem(pedido);
							}
						}

						if(!ContenedorJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormContenedor!=null) {
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormContenedor!=null) {
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormContenedor!=null) {
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormContenedor!=null) {
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePedidoForeignKey(Pedido pedido,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormContenedor!=null) {
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.setSelectedItem(pedido);
						}
					} else {
						if(this.jInternalFrameDetalleFormContenedor!=null) {
							this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_pedidoFK_IdPedidoContenedor.setSelectedItem(pedido);
						} else {
							this.jComboBoxid_pedidoFK_IdPedidoContenedor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesContenedor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ContenedorConstantesFunciones.refrescarForeignKeysDescripcionesContenedor(this.contenedorLogic.getContenedors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ContenedorConstantesFunciones.refrescarForeignKeysDescripcionesContenedor(this.contenedors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Pedido.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//contenedorLogic.setContenedors(this.contenedors);
			contenedorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ContenedorParameterReturnGeneral getContenedorParameterGeneral() {
		return this.contenedorParameterGeneral;
	}
	
	public void setContenedorParameterGeneral(ContenedorParameterReturnGeneral contenedorParameterGeneral) {
		this.contenedorParameterGeneral = contenedorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoContenedor() {
		return isPermisoTodoContenedor;
	}

	public void setIsPermisoTodoContenedor(Boolean isPermisoTodoContenedor) {
		this.isPermisoTodoContenedor = isPermisoTodoContenedor;
	}

	public Boolean getIsPermisoNuevoContenedor() {
		return isPermisoNuevoContenedor;
	}

	public void setIsPermisoNuevoContenedor(Boolean isPermisoNuevoContenedor) {
		this.isPermisoNuevoContenedor = isPermisoNuevoContenedor;
	}

	public Boolean getIsPermisoActualizarContenedor() {
		return isPermisoActualizarContenedor;
	}

	public void setIsPermisoActualizarContenedor(Boolean isPermisoActualizarContenedor) {
		this.isPermisoActualizarContenedor = isPermisoActualizarContenedor;
	}

	public Boolean getIsPermisoEliminarContenedor() {
		return isPermisoEliminarContenedor;
	}

	public void setIsPermisoEliminarContenedor(Boolean isPermisoEliminarContenedor) {
		this.isPermisoEliminarContenedor = isPermisoEliminarContenedor;
	}

	public Boolean getIsPermisoGuardarCambiosContenedor() {
		return isPermisoGuardarCambiosContenedor;
	}

	public void setIsPermisoGuardarCambiosContenedor(Boolean isPermisoGuardarCambiosContenedor) {
		this.isPermisoGuardarCambiosContenedor = isPermisoGuardarCambiosContenedor;
	}
	
	public Boolean getIsPermisoConsultaContenedor() {
		return isPermisoConsultaContenedor;
	}

	public void setIsPermisoConsultaContenedor(Boolean isPermisoConsultaContenedor) {
		this.isPermisoConsultaContenedor = isPermisoConsultaContenedor;
	}

	public Boolean getIsPermisoBusquedaContenedor() {
		return isPermisoBusquedaContenedor;
	}

	public void setIsPermisoBusquedaContenedor(Boolean isPermisoBusquedaContenedor) {
		this.isPermisoBusquedaContenedor = isPermisoBusquedaContenedor;
	}

	public Boolean getIsPermisoReporteContenedor() {
		return isPermisoReporteContenedor;
	}

	public void setIsPermisoReporteContenedor(Boolean isPermisoReporteContenedor) {
		this.isPermisoReporteContenedor = isPermisoReporteContenedor;
	}
	
	public Boolean getIsPermisoPaginacionMedioContenedor() {
		return isPermisoPaginacionMedioContenedor;
	}

	public void setIsPermisoPaginacionMedioContenedor(Boolean isPermisoPaginacionMedioContenedor) {
		this.isPermisoPaginacionMedioContenedor = isPermisoPaginacionMedioContenedor;
	}
	
	public Boolean getIsPermisoPaginacionTodoContenedor() {
		return isPermisoPaginacionTodoContenedor;
	}

	public void setIsPermisoPaginacionTodoContenedor(Boolean isPermisoPaginacionTodoContenedor) {
		this.isPermisoPaginacionTodoContenedor = isPermisoPaginacionTodoContenedor;
	}
	
	public Boolean getIsPermisoPaginacionAltoContenedor() {
		return isPermisoPaginacionAltoContenedor;
	}

	public void setIsPermisoPaginacionAltoContenedor(Boolean isPermisoPaginacionAltoContenedor) {
		this.isPermisoPaginacionAltoContenedor = isPermisoPaginacionAltoContenedor;
	}
	
	public Boolean getIsPermisoCopiarContenedor() {
		return isPermisoCopiarContenedor;
	}

	public void setIsPermisoCopiarContenedor(Boolean isPermisoCopiarContenedor) {
		this.isPermisoCopiarContenedor = isPermisoCopiarContenedor;
	}
	
	public Boolean getIsPermisoVerFormContenedor() {
		return isPermisoVerFormContenedor;
	}

	public void setIsPermisoVerFormContenedor(Boolean isPermisoVerFormContenedor) {
		this.isPermisoVerFormContenedor = isPermisoVerFormContenedor;
	}
	
	public Boolean getIsPermisoDuplicarContenedor() {
		return isPermisoDuplicarContenedor;
	}

	public void setIsPermisoDuplicarContenedor(Boolean isPermisoDuplicarContenedor) {
		this.isPermisoDuplicarContenedor = isPermisoDuplicarContenedor;
	}
	
	public Boolean getIsPermisoOrdenContenedor() {
		return isPermisoOrdenContenedor;
	}

	public void setIsPermisoOrdenContenedor(Boolean isPermisoOrdenContenedor) {
		this.isPermisoOrdenContenedor = isPermisoOrdenContenedor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoContenedor() {
		return isVisibilidadCeldaNuevoContenedor;
	}

	public void setIsVisibilidadCeldaNuevoContenedor(Boolean isVisibilidadCeldaNuevoContenedor) {
		this.isVisibilidadCeldaNuevoContenedor = isVisibilidadCeldaNuevoContenedor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarContenedor() {
		return isVisibilidadCeldaDuplicarContenedor;
	}

	public void setIsVisibilidadCeldaDuplicarContenedor(Boolean isVisibilidadCeldaDuplicarContenedor) {
		this.isVisibilidadCeldaDuplicarContenedor = isVisibilidadCeldaDuplicarContenedor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarContenedor() {
		return isVisibilidadCeldaCopiarContenedor;
	}

	public void setIsVisibilidadCeldaCopiarContenedor(Boolean isVisibilidadCeldaCopiarContenedor) {
		this.isVisibilidadCeldaCopiarContenedor = isVisibilidadCeldaCopiarContenedor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormContenedor() {
		return isVisibilidadCeldaVerFormContenedor;
	}

	public void setIsVisibilidadCeldaVerFormContenedor(Boolean isVisibilidadCeldaVerFormContenedor) {
		this.isVisibilidadCeldaVerFormContenedor = isVisibilidadCeldaVerFormContenedor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenContenedor() {
		return isVisibilidadCeldaOrdenContenedor;
	}

	public void setIsVisibilidadCeldaOrdenContenedor(Boolean isVisibilidadCeldaOrdenContenedor) {
		this.isVisibilidadCeldaOrdenContenedor = isVisibilidadCeldaOrdenContenedor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesContenedor() {
		return isVisibilidadCeldaNuevoRelacionesContenedor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesContenedor(Boolean isVisibilidadCeldaNuevoRelacionesContenedor) {
		this.isVisibilidadCeldaNuevoRelacionesContenedor = isVisibilidadCeldaNuevoRelacionesContenedor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarContenedor() {
		return isVisibilidadCeldaModificarContenedor;
	}

	public void setIsVisibilidadCeldaModificarContenedor(Boolean isVisibilidadCeldaModificarContenedor) {
		this.isVisibilidadCeldaModificarContenedor = isVisibilidadCeldaModificarContenedor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarContenedor() {
		return isVisibilidadCeldaActualizarContenedor;
	}

	public void setIsVisibilidadCeldaActualizarContenedor(Boolean isVisibilidadCeldaActualizarContenedor) {
		this.isVisibilidadCeldaActualizarContenedor = isVisibilidadCeldaActualizarContenedor;
	}

	public Boolean getIsVisibilidadCeldaEliminarContenedor() {
		return isVisibilidadCeldaEliminarContenedor;
	}

	public void setIsVisibilidadCeldaEliminarContenedor(Boolean isVisibilidadCeldaEliminarContenedor) {
		this.isVisibilidadCeldaEliminarContenedor = isVisibilidadCeldaEliminarContenedor;
	}

	public Boolean getIsVisibilidadCeldaCancelarContenedor() {
		return isVisibilidadCeldaCancelarContenedor;
	}

	public void setIsVisibilidadCeldaCancelarContenedor(Boolean isVisibilidadCeldaCancelarContenedor) {
		this.isVisibilidadCeldaCancelarContenedor = isVisibilidadCeldaCancelarContenedor;
	}

	public Boolean getIsVisibilidadCeldaGuardarContenedor() {
		return isVisibilidadCeldaGuardarContenedor;
	}

	public void setIsVisibilidadCeldaGuardarContenedor(Boolean isVisibilidadCeldaGuardarContenedor) {
		this.isVisibilidadCeldaGuardarContenedor = isVisibilidadCeldaGuardarContenedor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosContenedor() {
		return isVisibilidadCeldaGuardarCambiosContenedor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosContenedor(Boolean isVisibilidadCeldaGuardarCambiosContenedor) {
		this.isVisibilidadCeldaGuardarCambiosContenedor = isVisibilidadCeldaGuardarCambiosContenedor;
	}
		
	public ContenedorSessionBean getcontenedorSessionBean() {
		return this.contenedorSessionBean;
	}
	
	public void setcontenedorSessionBean(ContenedorSessionBean contenedorSessionBean) {
		this.contenedorSessionBean=contenedorSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPedido() {
		return this.isVisibilidadFK_IdPedido;
	}

	public void setisVisibilidadFK_IdPedido(Boolean isVisibilidadFK_IdPedido) {
		this.isVisibilidadFK_IdPedido=isVisibilidadFK_IdPedido;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysContenedor(Contenedor contenedor)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(contenedor,null);
				this.setActualParaGuardarSucursalForeignKey(contenedor,null);
				this.setActualParaGuardarPedidoForeignKey(contenedor,null);
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
	
	public void bugActualizarReferenciaActual(Contenedor contenedor,Contenedor contenedorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalContenedor(contenedor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		contenedorAux.setId(contenedor.getId());
		contenedorAux.setVersionRow(contenedor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessContenedor();
		
			int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = contenedorValidator.getInvalidValues(this.contenedor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			contenedorLogic.setDatosCliente(datosCliente);
			contenedorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				contenedorAux=new  Contenedor();
				
				contenedorAux.setIsNew(true);
				contenedorAux.setIsChanged(true);
				
				contenedorAux.setContenedorOriginal(this.contenedor);
				
				contenedorAux.setId(this.contenedor.getId());	
				contenedorAux.setVersionRow(this.contenedor.getVersionRow());	
				contenedorAux.setid_empresa(this.contenedor.getid_empresa());	
				contenedorAux.setid_sucursal(this.contenedor.getid_sucursal());	
				contenedorAux.setid_pedido(this.contenedor.getid_pedido());	
				contenedorAux.setnumero(this.contenedor.getnumero());	
				contenedorAux.setnumero_bl(this.contenedor.getnumero_bl());	
				contenedorAux.setdescripcion(this.contenedor.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.contenedorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.contenedorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(contenedorAux,contenedorLogic.getContenedors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contenedorAux,contenedors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.contenedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.contenedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorLogic.saveContenedors();//WithConnection
						//contenedorLogic.getSetVersionRowContenedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.contenedor,contenedorAux);
					
					this.refrescarForeignKeysDescripcionesContenedor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.contenedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								contenedorLogic.saveContenedorRelaciones(contenedorAux);//WithConnection
								//contenedorLogic.getSetVersionRowContenedors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.contenedor,contenedorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.contenedorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.contenedorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(contenedorAux,contenedorLogic.getContenedors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(contenedorAux,contenedors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.contenedor,contenedorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				contenedorAux=new  Contenedor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.contenedorSessionBean.getEsGuardarRelacionado() 
					|| (this.contenedorSessionBean.getEsGuardarRelacionado() && this.contenedor.getId()>=0)) {
						
					contenedorAux.setIsNew(false);
				}
				
				contenedorAux.setIsDeleted(false);
			
				contenedorAux.setId(this.contenedor.getId());	
				contenedorAux.setVersionRow(this.contenedor.getVersionRow());	
				contenedorAux.setid_empresa(this.contenedor.getid_empresa());	
				contenedorAux.setid_sucursal(this.contenedor.getid_sucursal());	
				contenedorAux.setid_pedido(this.contenedor.getid_pedido());	
				contenedorAux.setnumero(this.contenedor.getnumero());	
				contenedorAux.setnumero_bl(this.contenedor.getnumero_bl());	
				contenedorAux.setdescripcion(this.contenedor.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(contenedorAux,contenedorLogic.getContenedors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contenedorAux,contenedors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.contenedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.contenedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorLogic.saveContenedors();//WithConnection
						//contenedorLogic.getSetVersionRowContenedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.contenedor,contenedorAux);
					
					this.refrescarForeignKeysDescripcionesContenedor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.contenedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								contenedorLogic.saveContenedorRelaciones(contenedorAux);//WithConnection
								//contenedorLogic.getSetVersionRowContenedors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.contenedor,contenedorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.contenedorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.contenedorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(contenedorAux,contenedorLogic.getContenedors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(contenedorAux,contenedors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.contenedor,contenedorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				contenedorAux=new  Contenedor();
				
				contenedorAux.setIsNew(false);
				contenedorAux.setIsChanged(false);
				
				contenedorAux.setIsDeleted(true);
				
				contenedorAux.setId(this.contenedor.getId());	
				contenedorAux.setVersionRow(this.contenedor.getVersionRow());	
				contenedorAux.setid_empresa(this.contenedor.getid_empresa());	
				contenedorAux.setid_sucursal(this.contenedor.getid_sucursal());	
				contenedorAux.setid_pedido(this.contenedor.getid_pedido());	
				contenedorAux.setnumero(this.contenedor.getnumero());	
				contenedorAux.setnumero_bl(this.contenedor.getnumero_bl());	
				contenedorAux.setdescripcion(this.contenedor.getdescripcion());	
				
				if(this.contenedorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.contenedorAux.getId()>=0) {	
						this.contenedorsEliminados.add(contenedorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(contenedorAux,contenedorLogic.getContenedors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contenedorAux,contenedors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.contenedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.contenedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorLogic.saveContenedors();//WithConnection
						//contenedorLogic.getSetVersionRowContenedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.contenedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								contenedorLogic.saveContenedorRelaciones(contenedorAux);//WithConnection
								//contenedorLogic.getSetVersionRowContenedors();//WithConnection
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
							if(this.contenedorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.contenedorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(contenedorAux,contenedorLogic.getContenedors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(contenedorAux,contenedors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.getContenedors().addAll(this.contenedorsEliminados);
					
					contenedorLogic.saveContenedors();//WithConnection
					//contenedorLogic.getSetVersionRowContenedors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesContenedor();
				
				this.contenedorsEliminados= new ArrayList<Contenedor>();		
			}
			
			if(this.contenedorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Contenedor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Contenedor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.contenedor=contenedorAux;
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
      		//this.finishProcessContenedor();
      	}
		
	}	
	
	public void actualizarRelaciones(Contenedor contenedorLocal) throws Exception {
		
		if(this.contenedorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Contenedor contenedorLocal) throws Exception {	
		if(this.contenedorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				contenedorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				contenedorLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PedidoDetalleFormJInternalFrame.class)) {
				PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrameLocal=(PedidoBeanSwingJInternalFrame) ((PedidoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				pedidoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPedido(pedidoBeanSwingJInternalFrameLocal.getpedido(),true);
				pedidoBeanSwingJInternalFrameLocal.actualizarLista(pedidoBeanSwingJInternalFrameLocal.pedido,this.pedidosForeignKey);

				pedidoBeanSwingJInternalFrameLocal.actualizarRelaciones(pedidoBeanSwingJInternalFrameLocal.pedido);

				contenedorLocal.setPedido(pedidoBeanSwingJInternalFrameLocal.pedido);

				this.addItemDefectoCombosForeignKeyPedido();
				this.cargarCombosFramePedidosForeignKey("Formulario");
				this.setActualPedidoForeignKey(pedidoBeanSwingJInternalFrameLocal.pedido.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarContenedorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = contenedorValidator.getInvalidValues(this.contenedor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Contenedor contenedor,List<Contenedor> contenedors) throws Exception {
		try	{		
			ContenedorConstantesFunciones.actualizarLista(contenedor,contenedors,this.contenedorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Contenedor contenedor,List<Contenedor> contenedors) throws Exception {
		try	{			
			ContenedorConstantesFunciones.actualizarSelectedLista(contenedor,contenedors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Contenedor> contenedorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				contenedorsLocal=this.contenedorLogic.getContenedors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				contenedorsLocal=this.contenedors;
			}
			//ARCHITECTURE
		
			for(Contenedor contenedorLocal:contenedorsLocal) {
				if(this.permiteMantenimiento(contenedorLocal) && contenedorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ContenedorConstantesFunciones.getContenedorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ContenedorConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContenedor.jLabelid_empresaContenedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContenedorConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContenedor.jLabelid_sucursalContenedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContenedorConstantesFunciones.IDPEDIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContenedor.jLabelid_pedidoContenedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContenedorConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContenedor.jLabelnumeroContenedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContenedorConstantesFunciones.NUMEROBL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContenedor.jLabelnumero_blContenedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ContenedorConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContenedor.jLabeldescripcionContenedor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormContenedor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContenedor.jLabelid_empresaContenedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContenedor.jLabelid_sucursalContenedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContenedor.jLabelid_pedidoContenedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContenedor.jLabelnumeroContenedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContenedor.jLabelnumero_blContenedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContenedor.jLabeldescripcionContenedor,"");
		
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
		this.iIdNuevoContenedor--;	
		
		
		this.contenedorAux=new Contenedor();
		
		this.contenedorAux.setId(this.iIdNuevoContenedor);
		this.contenedorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.contenedorLogic.getContenedors().add(this.contenedorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.contenedors.add(this.contenedorAux);
		}
		//ARCHITECTURE
		
		this.contenedor=this.contenedorAux;
		
		if(ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioContenedor(this.contenedor);
			this.setVariablesObjetoActualToFormularioForeignKeyContenedor(this.contenedor);
		}
				
		//this.setDefaultControlesContenedor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyContenedor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyContenedor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyContenedor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualContenedor(this.contenedorBean,this.contenedor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ContenedorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.contenedorSessionBean.getConGuardarRelaciones()) {
			classes=ContenedorConstantesFunciones.getClassesRelationshipsOfContenedor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.contenedorReturnGeneral=contenedorLogic.procesarEventosContenedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.contenedorLogic.getContenedors(),this.contenedor,this.contenedorParameterGeneral,this.isEsNuevoContenedor,classes);//this.contenedorLogic.getContenedor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanContenedor(this.contenedorReturnGeneral,this.contenedorBean,false);
		
		if(this.contenedorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyContenedor(this.contenedorReturnGeneral.getContenedor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioContenedor(this.contenedorReturnGeneral.getContenedor());
		}
		
		if(this.contenedorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioContenedor(this.contenedorReturnGeneral.getContenedor(),classes);//this.contenedorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyContenedor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyContenedor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ContenedorBeanSwingJInternalFrameAdditional.RecargarFormContenedor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingContenedor(false);
						
			if(contenedorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ContenedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContenedor();
			}
			
			this.actualizarVisualTableDatosContenedor();
			
			this.jTableDatosContenedor.setRowSelectionInterval(this.getIndiceNuevoContenedor(), this.getIndiceNuevoContenedor());
			
			this.seleccionarFilaTablaContenedorActual();
						
			this.actualizarEstadoCeldasBotonesContenedor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesContenedor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormContenedor.jTextFieldnumeroContenedor.setEnabled(isHabilitar && this.contenedorConstantesFunciones.activarnumeroContenedor);
		this.jInternalFrameDetalleFormContenedor.jTextFieldnumero_blContenedor.setEnabled(isHabilitar && this.contenedorConstantesFunciones.activarnumero_blContenedor);
		this.jInternalFrameDetalleFormContenedor.jTextAreadescripcionContenedor.setEnabled(isHabilitar && this.contenedorConstantesFunciones.activardescripcionContenedor);	
		//
		this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.setEnabled(isHabilitar && this.contenedorConstantesFunciones.activarid_empresaContenedor);//
		this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.setEnabled(isHabilitar && this.contenedorConstantesFunciones.activarid_sucursalContenedor);
		this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.setEnabled(isHabilitar && this.contenedorConstantesFunciones.activarid_pedidoContenedor);
	};
	
	public void setDefaultControlesContenedor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoContenedor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.contenedorSessionBean.setConGuardarRelaciones(true);			
			this.contenedorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormContenedor.jTabbedPaneRelacionesContenedor.setVisible(true);
			
					
		} else {
			//this.contenedorSessionBean.setConGuardarRelaciones(false);			
			this.contenedorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormContenedor.jTabbedPaneRelacionesContenedor.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoContenedor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Contenedor contenedorAux:this.contenedorLogic.getContenedors()) {
				if(contenedorAux.getId().equals(this.iIdNuevoContenedor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Contenedor contenedorAux:this.contenedors) {
				if(contenedorAux.getId().equals(this.iIdNuevoContenedor)) {
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
	
	public int getIndiceActualContenedor(Contenedor contenedor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Contenedor contenedorAux:this.contenedorLogic.getContenedors()) {
				if(contenedorAux.getId().equals(contenedor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Contenedor contenedorAux:this.contenedors) {
				if(contenedorAux.getId().equals(contenedor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalContenedor(Contenedor contenedorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Contenedor contenedorAux:this.contenedorLogic.getContenedors()) {
				if(contenedorAux.getContenedorOriginal().getId().equals(contenedorOriginal.getId())) {
					existe=true;
					contenedorOriginal.setId(contenedorAux.getId());
					contenedorOriginal.setVersionRow(contenedorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Contenedor contenedorAux:this.contenedors) {
				if(contenedorAux.getContenedorOriginal().getId().equals(contenedorOriginal.getId())) {
					existe=true;
					contenedorOriginal.setId(contenedorAux.getId());
					contenedorOriginal.setVersionRow(contenedorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosContenedor(Boolean esParaCancelar) throws Exception {
		contenedorsAux=new ArrayList<Contenedor>();
		contenedorAux=new Contenedor();
		
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Contenedor contenedorAux:this.contenedorLogic.getContenedors()) {
					if(contenedorAux.getId()<0) {
						contenedorsAux.add(contenedorAux);
					}		
				}
				this.iIdNuevoContenedor=0L;
				this.contenedorLogic.getContenedors().removeAll(contenedorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Contenedor contenedorAux:this.contenedors) {
					if(contenedorAux.getId()<0) {
						contenedorsAux.add(contenedorAux);
					}		
				}
				this.iIdNuevoContenedor=0L;
				this.contenedors.removeAll(contenedorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoContenedor 
					&& this.contenedorLogic.getContenedors().size()>0
					) {
					contenedorAux=this.contenedorLogic.getContenedors().get(this.contenedorLogic.getContenedors().size() - 1);
				
					if(contenedorAux.getId()<0) {
						this.contenedorLogic.getContenedors().remove(contenedorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoContenedor && this.contenedors.size()>0) {
					contenedorAux=this.contenedors.get(this.contenedors.size() - 1);
				
					if(contenedorAux.getId()<0) {
						this.contenedors.remove(contenedorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoContenedor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(contenedor.getId()<0) {
				this.contenedorLogic.getContenedors().remove(this.contenedor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(contenedor.getId()<0) {
				this.contenedors.remove(this.contenedor);
			}
		}			
	}
	
	public void setEstadosInicialesContenedor(List<Contenedor> contenedorsAux) throws Exception {
		ContenedorConstantesFunciones.setEstadosInicialesContenedor(contenedorsAux);
	}
	
	public void setEstadosInicialesContenedor(Contenedor contenedorAux) throws Exception {
		ContenedorConstantesFunciones.setEstadosInicialesContenedor(contenedorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarContenedorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesContenedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarContenedorActual()) {
				if(!this.isEsNuevoContenedor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesContenedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoContenedor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarContenedorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Contenedor ?", "MANTENIMIENTO DE Contenedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesContenedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Contenedor contenedor) throws Exception {
		ContenedorConstantesFunciones.seleccionarAsignar(this.contenedor,contenedor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarContenedor=this.isPermisoActualizarOriginalContenedor;
			
			
			this.seleccionarAsignar(contenedor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ContenedorConstantesFunciones.quitarEspaciosContenedor(this.contenedor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesContenedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.contenedorSessionBean.setsFuncionBusquedaRapida(this.contenedorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoContenedor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosContenedor(esParaCancelar);				
				this.cancelarNuevoContenedor(esParaCancelar);								
			}
			
			this.contenedor=new Contenedor();
			
			this.inicializarContenedor();
			
			this.actualizarEstadoCeldasBotonesContenedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarContenedor() throws Exception {
		try {
			ContenedorConstantesFunciones.inicializarContenedor(this.contenedor);
			
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
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.contenedorLogic.getContenedors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteContenedors(String sAccionBusqueda,List<Contenedor> contenedorsParaReportes) throws Exception {
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
					sPathReporteFinal="Contenedor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ContenedorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ContenedorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Contenedor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Contenedores");		
		parameters.put("busquedapor", ContenedorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceContenedor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ContenedorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ContenedorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceContenedor=new JRBeanArrayDataSource(ContenedorJInternalFrame.TraerContenedorBeans(contenedorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceContenedor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ContenedorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ContenedorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ContenedorBean.TraerContenedorBeans(contenedorsParaReportes).toArray()));
							
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
				this.generarExcelReporteContenedors(sAccionBusqueda,sTipoArchivoReporte,contenedorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalContenedors(sAccionBusqueda,sTipoArchivoReporte,contenedorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoContenedorActionPerformed(null);
					//this.generarExcelReporteContenedors(sAccionBusqueda,sTipoArchivoReporte,contenedorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalContenedors(sAccionBusqueda,sTipoArchivoReporte,contenedorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesContenedors(sAccionBusqueda,sTipoArchivoReporte,contenedorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesContenedors(sAccionBusqueda,sTipoArchivoReporte,contenedorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteContenedors(String sAccionBusqueda,String sTipoArchivoReporte,List<Contenedor> contenedorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contenedor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Contenedors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderContenedor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Contenedor contenedor : contenedorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ContenedorConstantesFunciones.generarExcelReporteDataContenedor("NORMAL",row,workbook,contenedor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contenedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderContenedor(String sTipo,Row row,Workbook workbook) {
		
		ContenedorConstantesFunciones.generarExcelReporteHeaderContenedor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalContenedors(String sAccionBusqueda,String sTipoArchivoReporte,List<Contenedor> contenedorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contenedor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Contenedors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Contenedor contenedor : contenedorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ContenedorConstantesFunciones.getContenedorDescripcion(contenedor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContenedorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContenedorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contenedor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContenedorConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContenedorConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contenedor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContenedorConstantesFunciones.LABEL_IDPEDIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContenedorConstantesFunciones.LABEL_IDPEDIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contenedor.getpedido_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContenedorConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContenedorConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contenedor.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContenedorConstantesFunciones.LABEL_NUMEROBL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContenedorConstantesFunciones.LABEL_NUMEROBL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contenedor.getnumero_bl());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContenedorConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContenedorConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contenedor.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contenedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesContenedors(String sAccionBusqueda,String sTipoArchivoReporte,List<Contenedor> contenedorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Contenedor> contenedorsRespaldo=null;
		
		classes=ContenedorConstantesFunciones.getClassesRelationshipsOfContenedor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.contenedorLogic.setDatosCliente(this.datosCliente);
		this.contenedorLogic.setDatosDeep(this.datosDeep);
		this.contenedorLogic.setIsConDeep(true);
		
		contenedorsRespaldo=this.contenedorLogic.getContenedors();
		
		this.contenedorLogic.setContenedors(contenedorsParaReportes);	
		this.contenedorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		contenedorsParaReportes=this.contenedorLogic.getContenedors();
		this.contenedorLogic.setContenedors(contenedorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contenedor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Contenedors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderContenedor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Contenedor contenedor : contenedorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderContenedor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ContenedorConstantesFunciones.generarExcelReporteDataContenedor("NORMAL",row,workbook,contenedor,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ContenedorConstantesFunciones.getContenedorDescripcion(contenedor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contenedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoContenedor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContenedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoContenedor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContenedor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessContenedor() throws Exception {		
		this.startProcessContenedor(true);
	}
	
	public void startProcessContenedor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasContenedor ,this.jPanelParametrosReportesContenedor, this.jScrollPanelDatosContenedor,this.jPanelPaginacionContenedor, this.jScrollPanelDatosEdicionContenedor, this.jPanelAccionesContenedor,this.jPanelAccionesFormularioContenedor,this.jmenuBarContenedor,this.jmenuBarDetalleContenedor,this.jTtoolBarContenedor,this.jTtoolBarDetalleContenedor);		
		
		final JTabbedPane jTabbedPaneBusquedasContenedor=this.jTabbedPaneBusquedasContenedor; 
		
		final JPanel jPanelParametrosReportesContenedor=this.jPanelParametrosReportesContenedor;
		//final JScrollPane jScrollPanelDatosContenedor=this.jScrollPanelDatosContenedor;
		final JTable jTableDatosContenedor=this.jTableDatosContenedor;		
		final JPanel jPanelPaginacionContenedor=this.jPanelPaginacionContenedor;
		//final JScrollPane jScrollPanelDatosEdicionContenedor=this.jScrollPanelDatosEdicionContenedor;
		final JPanel jPanelAccionesContenedor=this.jPanelAccionesContenedor;
		
		JPanel jPanelCamposAuxiliarContenedor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarContenedor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormContenedor!=null) {
			jPanelCamposAuxiliarContenedor=this.jInternalFrameDetalleFormContenedor.jPanelCamposContenedor;
			jPanelAccionesFormularioAuxiliarContenedor=this.jInternalFrameDetalleFormContenedor.jPanelAccionesFormularioContenedor;
		}
		
		final JPanel jPanelCamposContenedor=jPanelCamposAuxiliarContenedor;
		final JPanel jPanelAccionesFormularioContenedor=jPanelAccionesFormularioAuxiliarContenedor;
		
		
		final JMenuBar jmenuBarContenedor=this.jmenuBarContenedor;
		final JToolBar jTtoolBarContenedor=this.jTtoolBarContenedor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarContenedor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarContenedor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) {
			jmenuBarDetalleAuxiliarContenedor=this.jInternalFrameDetalleFormContenedor.jmenuBarDetalleContenedor;
			jTtoolBarDetalleAuxiliarContenedor=this.jInternalFrameDetalleFormContenedor.jTtoolBarDetalleContenedor;
		}
		
		final JMenuBar jmenuBarDetalleContenedor=jmenuBarDetalleAuxiliarContenedor;
		final JToolBar jTtoolBarDetalleContenedor=jTtoolBarDetalleAuxiliarContenedor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasContenedor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesContenedor;
			processRunnable.jTableDatos=jTableDatosContenedor;
			processRunnable.jPanelCampos=jPanelCamposContenedor;
			processRunnable.jPanelPaginacion=jPanelPaginacionContenedor;
			processRunnable.jPanelAcciones=jPanelAccionesContenedor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioContenedor;
			
			
			processRunnable.jmenuBar=jmenuBarContenedor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleContenedor;
			processRunnable.jTtoolBar=jTtoolBarContenedor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleContenedor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasContenedor ,jPanelParametrosReportesContenedor,jTableDatosContenedor, /*jScrollPanelDatosContenedor,*/jPanelCamposContenedor,jPanelPaginacionContenedor, /*jScrollPanelDatosEdicionContenedor,*/ jPanelAccionesContenedor,jPanelAccionesFormularioContenedor,jmenuBarContenedor,jmenuBarDetalleContenedor,jTtoolBarContenedor,jTtoolBarDetalleContenedor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasContenedor ,jPanelParametrosReportesContenedor, jScrollPanelDatosContenedor,jPanelPaginacionContenedor, jScrollPanelDatosEdicionContenedor, jPanelAccionesContenedor,jPanelAccionesFormularioContenedor,jmenuBarContenedor,jmenuBarDetalleContenedor,jTtoolBarContenedor,jTtoolBarDetalleContenedor);
						
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
	
	public void finishProcessContenedor() {// throws Exception 
		this.finishProcessContenedor(true);
	}
	
	public void finishProcessContenedor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasContenedor ,this.jPanelParametrosReportesContenedor, this.jScrollPanelDatosContenedor,this.jPanelPaginacionContenedor, this.jScrollPanelDatosEdicionContenedor, this.jPanelAccionesContenedor,this.jPanelAccionesFormularioContenedor,this.jmenuBarContenedor,this.jmenuBarDetalleContenedor,this.jTtoolBarContenedor,this.jTtoolBarDetalleContenedor);		
		
		final JTabbedPane jTabbedPaneBusquedasContenedor=this.jTabbedPaneBusquedasContenedor; 
		
		final JPanel jPanelParametrosReportesContenedor=this.jPanelParametrosReportesContenedor;
		//final JScrollPane jScrollPanelDatosContenedor=this.jScrollPanelDatosContenedor;
		final JTable jTableDatosContenedor=this.jTableDatosContenedor;		
		final JPanel jPanelPaginacionContenedor=this.jPanelPaginacionContenedor;
		//final JScrollPane jScrollPanelDatosEdicionContenedor=this.jScrollPanelDatosEdicionContenedor;
		final JPanel jPanelAccionesContenedor=this.jPanelAccionesContenedor;
		
		JPanel jPanelCamposAuxiliarContenedor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarContenedor=new JPanel();
		
		if(this.jInternalFrameDetalleFormContenedor!=null) {
			jPanelCamposAuxiliarContenedor=this.jInternalFrameDetalleFormContenedor.jPanelCamposContenedor;
			jPanelAccionesFormularioAuxiliarContenedor=this.jInternalFrameDetalleFormContenedor.jPanelAccionesFormularioContenedor;
		}
		
		final JPanel jPanelCamposContenedor=jPanelCamposAuxiliarContenedor;
		final JPanel jPanelAccionesFormularioContenedor=jPanelAccionesFormularioAuxiliarContenedor;
		
		
		final JMenuBar jmenuBarContenedor=this.jmenuBarContenedor;		
		final JToolBar jTtoolBarContenedor=this.jTtoolBarContenedor;
				
		JMenuBar jmenuBarDetalleAuxiliarContenedor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarContenedor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormContenedor!=null) {
			jmenuBarDetalleAuxiliarContenedor=this.jInternalFrameDetalleFormContenedor.jmenuBarDetalleContenedor;
			jTtoolBarDetalleAuxiliarContenedor=this.jInternalFrameDetalleFormContenedor.jTtoolBarDetalleContenedor;		
		}
		
		final JMenuBar jmenuBarDetalleContenedor=jmenuBarDetalleAuxiliarContenedor;
		final JToolBar jTtoolBarDetalleContenedor=jTtoolBarDetalleAuxiliarContenedor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasContenedor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesContenedor;
			processRunnable.jTableDatos=jTableDatosContenedor;
			processRunnable.jPanelCampos=jPanelCamposContenedor;
			processRunnable.jPanelPaginacion=jPanelPaginacionContenedor;
			processRunnable.jPanelAcciones=jPanelAccionesContenedor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioContenedor;
			
			
			processRunnable.jmenuBar=jmenuBarContenedor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleContenedor;
			processRunnable.jTtoolBar=jTtoolBarContenedor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleContenedor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasContenedor ,jPanelParametrosReportesContenedor, jTableDatosContenedor,/*jScrollPanelDatosContenedor,*/jPanelCamposContenedor,jPanelPaginacionContenedor, /*jScrollPanelDatosEdicionContenedor,*/ jPanelAccionesContenedor,jPanelAccionesFormularioContenedor,jmenuBarContenedor,jmenuBarDetalleContenedor,jTtoolBarContenedor,jTtoolBarDetalleContenedor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesContenedor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarContenedor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuContenedor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarContenedor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarContenedor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleContenedor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuContenedor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarContenedor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleContenedor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.contenedorConstantesFunciones.getsFinalQueryContenedor();
		String  finalQueryPaginacionTodos=this.contenedorConstantesFunciones.getsFinalQueryContenedor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ContenedorConstantesFunciones.getArrayColumnasGlobalesNoContenedor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ContenedorConstantesFunciones.getArrayColumnasGlobalesContenedor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ContenedorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.contenedorsEliminados= new ArrayList<Contenedor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessContenedor();
		
				///*ContenedorSessionBean*/this.contenedorSessionBean=new ContenedorSessionBean();
			
			if(this.contenedorSessionBean==null) {
				this.contenedorSessionBean=new ContenedorSessionBean();
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
					this.iNumeroPaginacion=ContenedorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ContenedorConstantesFunciones.getClassesForeignKeysOfContenedor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/contenedor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			contenedorsAux= new ArrayList<Contenedor>();
			
				
			contenedorLogic.setDatosCliente(this.datosCliente);
			contenedorLogic.setDatosDeep(this.datosDeep);
			contenedorLogic.setIsConDeep(true);
			
			
			contenedorLogic.getContenedorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					contenedorLogic.getTodosContenedors(finalQueryGlobal,pagination);
					
					//contenedorLogic.getTodosContenedorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(contenedorLogic.getContenedors()==null|| contenedorLogic.getContenedors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							contenedorsAux= new ArrayList<Contenedor>();
							contenedorsAux.addAll(contenedorLogic.getContenedors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contenedorsAux= new ArrayList<Contenedor>();
							contenedorsAux.addAll(contenedors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							contenedorLogic.getTodosContenedors(finalQueryGlobal+"",this.pagination);												
							
							//contenedorLogic.getTodosContenedorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteContenedors("Todos",contenedorLogic.getContenedors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							contenedorLogic.setContenedors(new ArrayList<Contenedor>());					
							contenedorLogic.getContenedors().addAll(contenedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contenedors=new ArrayList<Contenedor>();
							contenedors.addAll(contenedorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idContenedor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idContenedor=this.idActual;
				
				} else if(this.idContenedorActual!=null && this.idContenedorActual!=0L) {
					idContenedor=idContenedorActual;
				}
				
					
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndicePorId(idContenedor);
				
				this.contenedors=new ArrayList<Contenedor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					contenedorLogic.getEntity(idContenedor);
					
					//contenedorLogic.getEntityWithConnection(idContenedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contenedorLogic.setContenedors(new ArrayList<Contenedor>());
					contenedorLogic.getContenedors().add(contenedorLogic.getContenedor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contenedors=new ArrayList<Contenedor>();
					this.contenedors.add(contenedor);
				}
				
				if(contenedorLogic.getContenedor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					contenedorLogic.getContenedorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=contenedorLogic.getContenedors()==null||contenedorLogic.getContenedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=contenedors==null|| contenedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorsAux=new ArrayList<Contenedor>();
						contenedorsAux.addAll(contenedorLogic.getContenedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contenedorsAux=new ArrayList<Contenedor>();
							contenedorsAux.addAll(contenedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							contenedorLogic.getContenedorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteContenedors("FK_IdEmpresa",contenedorLogic.getContenedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteContenedors("FK_IdEmpresa",contenedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorLogic.setContenedors(new ArrayList<Contenedor>());
						contenedorLogic.getContenedors().addAll(contenedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contenedors=new ArrayList<Contenedor>();
							contenedors.addAll(contenedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPedido")) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdPedido(id_pedidoFK_IdPedido);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					contenedorLogic.getContenedorsFK_IdPedido(finalQueryGlobal,pagination,id_pedidoFK_IdPedido);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdPedido(id_pedidoFK_IdPedido);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdPedido(id_pedidoFK_IdPedido);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=contenedorLogic.getContenedors()==null||contenedorLogic.getContenedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=contenedors==null|| contenedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorsAux=new ArrayList<Contenedor>();
						contenedorsAux.addAll(contenedorLogic.getContenedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contenedorsAux=new ArrayList<Contenedor>();
							contenedorsAux.addAll(contenedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							contenedorLogic.getContenedorsFK_IdPedido(finalQueryGlobal,pagination,id_pedidoFK_IdPedido);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdPedido(id_pedidoFK_IdPedido);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdPedido(id_pedidoFK_IdPedido);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteContenedors("FK_IdPedido",contenedorLogic.getContenedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteContenedors("FK_IdPedido",contenedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorLogic.setContenedors(new ArrayList<Contenedor>());
						contenedorLogic.getContenedors().addAll(contenedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contenedors=new ArrayList<Contenedor>();
							contenedors.addAll(contenedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					contenedorLogic.getContenedorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=contenedorLogic.getContenedors()==null||contenedorLogic.getContenedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=contenedors==null|| contenedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorsAux=new ArrayList<Contenedor>();
						contenedorsAux.addAll(contenedorLogic.getContenedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contenedorsAux=new ArrayList<Contenedor>();
							contenedorsAux.addAll(contenedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							contenedorLogic.getContenedorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ContenedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteContenedors("FK_IdSucursal",contenedorLogic.getContenedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteContenedors("FK_IdSucursal",contenedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorLogic.setContenedors(new ArrayList<Contenedor>());
						contenedorLogic.getContenedors().addAll(contenedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contenedors=new ArrayList<Contenedor>();
							contenedors.addAll(contenedorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesContenedor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessContenedor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=contenedorLogic.getContenedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=contenedors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=contenedorLogic.getContenedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=contenedors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Contenedor contenedor) {
		Boolean permite=true;
		
		if(this.contenedor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ContenedorConstantesFunciones.getOrderByListaContenedor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ContenedorConstantesFunciones.getOrderByListaContenedor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Contenedor contenedor:contenedorLogic.getContenedors()) {
				if(contenedor.getsType().equals(Constantes2.S_TOTALES)) {
					contenedorTotales=contenedor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Contenedor contenedor:this.contenedors) {
				if(contenedor.getsType().equals(Constantes2.S_TOTALES)) {
					contenedorTotales=contenedor;
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
			this.contenedorAux=new Contenedor();
			this.contenedorAux.setsType(Constantes2.S_TOTALES);
			this.contenedorAux.setIsNew(false);
			this.contenedorAux.setIsChanged(false);
			this.contenedorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ContenedorConstantesFunciones.TotalizarValoresFilaContenedor(this.contenedorLogic.getContenedors(),this.contenedorAux);
				
				this.contenedorLogic.getContenedors().add(this.contenedorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ContenedorConstantesFunciones.TotalizarValoresFilaContenedor(this.contenedors,this.contenedorAux);
				
				this.contenedors.add(this.contenedorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		contenedorTotales=new Contenedor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.contenedorLogic.getContenedors().remove(contenedorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.contenedors.remove(contenedorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		contenedorTotales=new Contenedor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Contenedor contenedor:contenedorLogic.getContenedors()) {
				if(contenedor.getsType().equals(Constantes2.S_TOTALES)) {
					contenedorTotales=contenedor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ContenedorConstantesFunciones.TotalizarValoresFilaContenedor(this.contenedorLogic.getContenedors(),contenedorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Contenedor contenedor:this.contenedors) {
				if(contenedor.getsType().equals(Constantes2.S_TOTALES)) {
					contenedorTotales=contenedor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ContenedorConstantesFunciones.TotalizarValoresFilaContenedor(this.contenedors,contenedorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getContenedorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getContenedorsFK_IdPedido()throws Exception {
		try {
			sAccionBusqueda="FK_IdPedido";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getContenedorsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getContenedorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contenedorLogic.getContenedorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getContenedorsFK_IdPedido(String sFinalQuery,Long id_pedido)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contenedorLogic.getContenedorsFK_IdPedido(sFinalQuery,this.pagination,id_pedido);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getContenedorsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contenedorLogic.getContenedorsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosContenedor() {
		this.isPermisoTodoContenedor=false;
		this.isPermisoNuevoContenedor=false;
		this.isPermisoActualizarContenedor=false;
		this.isPermisoActualizarOriginalContenedor=false;
		this.isPermisoEliminarContenedor=false;
		this.isPermisoGuardarCambiosContenedor=false;
		this.isPermisoConsultaContenedor=false;
		this.isPermisoBusquedaContenedor=false;
		this.isPermisoReporteContenedor=false;		
		this.isPermisoOrdenContenedor=false;		
		this.isPermisoPaginacionMedioContenedor=false;		
		this.isPermisoPaginacionAltoContenedor=false;
		this.isPermisoPaginacionTodoContenedor=false;
		this.isPermisoCopiarContenedor=false;		
		this.isPermisoVerFormContenedor=false;		
		this.isPermisoDuplicarContenedor=false;		
		this.isPermisoOrdenContenedor=false;		
	}
	
	public void setPermisosUsuarioContenedor(Boolean isPermiso) {
		this.isPermisoTodoContenedor=isPermiso;
		this.isPermisoNuevoContenedor=isPermiso;
		this.isPermisoActualizarContenedor=isPermiso;
		this.isPermisoActualizarOriginalContenedor=isPermiso;
		this.isPermisoEliminarContenedor=isPermiso;
		this.isPermisoGuardarCambiosContenedor=isPermiso;
		this.isPermisoConsultaContenedor=isPermiso;
		this.isPermisoBusquedaContenedor=isPermiso;
		this.isPermisoReporteContenedor=isPermiso;
		this.isPermisoOrdenContenedor=isPermiso;		
		this.isPermisoPaginacionMedioContenedor=isPermiso;		
		this.isPermisoPaginacionAltoContenedor=isPermiso;		
		this.isPermisoPaginacionTodoContenedor=isPermiso;		
		this.isPermisoCopiarContenedor=isPermiso;		
		this.isPermisoVerFormContenedor=isPermiso;		
		this.isPermisoDuplicarContenedor=isPermiso;
		this.isPermisoOrdenContenedor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioContenedor(Boolean isPermiso) {
		//this.isPermisoTodoContenedor=isPermiso;
		this.isPermisoNuevoContenedor=isPermiso;
		this.isPermisoActualizarContenedor=isPermiso;
		this.isPermisoActualizarOriginalContenedor=isPermiso;
		this.isPermisoEliminarContenedor=isPermiso;
		this.isPermisoGuardarCambiosContenedor=isPermiso;
		//this.isPermisoConsultaContenedor=isPermiso;
		//this.isPermisoBusquedaContenedor=isPermiso;
		//this.isPermisoReporteContenedor=isPermiso;
		//this.isPermisoOrdenContenedor=isPermiso;		
		//this.isPermisoPaginacionMedioContenedor=isPermiso;		
		//this.isPermisoPaginacionAltoContenedor=isPermiso;		
		//this.isPermisoPaginacionTodoContenedor=isPermiso;		
		//this.isPermisoCopiarContenedor=isPermiso;		
		//this.isPermisoDuplicarContenedor=isPermiso;
		//this.isPermisoOrdenContenedor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioContenedorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ContenedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebContenedor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioContenedorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioContenedorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionContenedorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioContenedorClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioContenedor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ContenedorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.contenedorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ContenedorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoContenedor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarContenedor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalContenedor=this.isPermisoActualizarContenedor;
			this.isPermisoEliminarContenedor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosContenedor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaContenedor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaContenedor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoContenedor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteContenedor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenContenedor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioContenedor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoContenedor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoContenedor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarContenedor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormContenedor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarContenedor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenContenedor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.contenedorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosContenedor.setToolTipText(this.jTableDatosContenedor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioContenedor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioContenedor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ContenedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ContenedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioContenedor() throws Exception {
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
	public void inicializarCombosForeignKeyContenedorListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.pedidosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyContenedorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ContenedorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyContenedorListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPedidoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPedidoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.pedidosForeignKey==null||this.pedidosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PedidoConstantesFunciones.getArrayColumnasGlobalesPedido(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PedidoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PedidoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPedidosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyContenedorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ContenedorParameterReturnGeneral contenedorReturnGeneral=new ContenedorParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.contenedorConstantesFunciones.cargarid_empresaContenedor)
					 || (this.esRecargarFks && this.contenedorConstantesFunciones.cargarid_empresaContenedor)) {

					if(!this.contenedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+contenedorSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.contenedorConstantesFunciones.cargarid_sucursalContenedor)
					 || (this.esRecargarFks && this.contenedorConstantesFunciones.cargarid_sucursalContenedor)) {

					if(!this.contenedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+contenedorSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalPedido="";

				if(((this.pedidosForeignKey==null||this.pedidosForeignKey.size()<=0) && this.contenedorConstantesFunciones.cargarid_pedidoContenedor)
					 || (this.esRecargarFks && this.contenedorConstantesFunciones.cargarid_pedidoContenedor)) {

					if(!this.contenedorSessionBean.getisBusquedaDesdeForeignKeySesionPedido()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PedidoConstantesFunciones.getArrayColumnasGlobalesPedido(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPedido=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PedidoConstantesFunciones.TABLENAME);

						finalQueryGlobalPedido=Funciones.GetFinalQueryAppend(finalQueryGlobalPedido, "");
						finalQueryGlobalPedido+=PedidoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPedidosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPedido=" WHERE " + ConstantesSql.ID + "="+contenedorSessionBean.getlidPedidoActual();
					}
				} else {
					finalQueryGlobalPedido="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				contenedorReturnGeneral=contenedorLogic.cargarCombosLoteForeignKeyContenedor(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalPedido);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=contenedorReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=contenedorReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalPedido.equals("NONE")) {
				this.pedidosForeignKey=contenedorReturnGeneral.getpedidosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyContenedor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyPedido();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.contenedorSessionBean==null) {
				this.contenedorSessionBean=new ContenedorSessionBean();
			}

			if(!this.contenedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.contenedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPedido()throws Exception {
		try {

			if(!this.contenedorSessionBean.getisBusquedaDesdeForeignKeySesionPedido()) {
				Pedido pedido=new Pedido();
				PedidoConstantesFunciones.setPedidoDescripcion(pedido,Constantes.SMENSAJE_ESCOJA_OPCION);
				pedido.setId(null);

				if(!PedidoConstantesFunciones.ExisteEnLista(this.pedidosForeignKey,pedido,true)) {

					this.pedidosForeignKey.add(0,pedido);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyContenedor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyContenedor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyContenedor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyContenedor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyContenedor(Contenedor contenedor)throws Exception {	
		try {
			
			this.setActualPedidoForeignKey(contenedor.getid_pedido(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyContenedor(Contenedor contenedor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyContenedor()throws Exception {	
		try {
			
			this.setActualPedidoForeignKey(this.contenedorConstantesFunciones.getid_pedido(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyContenedor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyContenedor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyContenedor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroContenedor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyContenedor()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFramePedidosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyContenedor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePedidosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyContenedor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor!=null && this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor!=null && this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor!=null && this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ContenedorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ContenedorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ContenedorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.contenedorSessionBean=new ContenedorSessionBean(); 
		this.contenedorConstantesFunciones=new ContenedorConstantesFunciones(); 
		this.contenedorBean=new Contenedor();//(this.contenedorConstantesFunciones); 		
		this.contenedorReturnGeneral=new ContenedorParameterReturnGeneral(); 
		
		this.contenedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.contenedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ContenedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ContenedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ContenedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessContenedor(true);
			
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
			
			this.contenedorConstantesFunciones=new ContenedorConstantesFunciones(); 
			this.contenedorBean=new Contenedor();//this.contenedorConstantesFunciones); 			
			this.contenedorReturnGeneral=new ContenedorParameterReturnGeneral(); 
		
			ContenedorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Contenedor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.contenedor=new Contenedor();
			this.contenedors = new ArrayList<Contenedor>();
			this.contenedorsAux = new ArrayList<Contenedor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic=new ContenedorLogic();
				this.contenedorLogic.getNewConnexionToDeep("");
			}
			
			//this.contenedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.contenedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormContenedor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoContenedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoContenedor);	
					}
					
					if(this.jInternalFrameImportacionContenedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionContenedor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByContenedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByContenedor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormContenedor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormContenedor);
				this.jInternalFrameDetalleFormContenedor.setVisible(false);
				this.jInternalFrameDetalleFormContenedor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoContenedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoContenedor);
					this.jInternalFrameReporteDinamicoContenedor.setVisible(false);
					this.jInternalFrameReporteDinamicoContenedor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionContenedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionContenedor);
					this.jInternalFrameImportacionContenedor.setVisible(false);
					this.jInternalFrameImportacionContenedor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByContenedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByContenedor);
					this.jInternalFrameOrderByContenedor.setVisible(false);
					this.jInternalFrameOrderByContenedor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idContenedorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ContenedorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.contenedorReturnGeneral=new ContenedorParameterReturnGeneral();
			
			this.contenedorParameterGeneral=new ContenedorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.contenedorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ContenedorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.contenedorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ContenedorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.contenedorSessionBean.getEsGuardarRelacionado(),this.contenedorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ContenedorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.contenedorSessionBean.getEsGuardarRelacionado(),this.contenedorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoContenedor=false;
			this.isVisibilidadCeldaDuplicarContenedor=true;
			this.isVisibilidadCeldaCopiarContenedor=true;
			this.isVisibilidadCeldaVerFormContenedor=true;
			this.isVisibilidadCeldaOrdenContenedor=true;
			this.isVisibilidadCeldaNuevoRelacionesContenedor=false;
			this.isVisibilidadCeldaModificarContenedor=false;
			this.isVisibilidadCeldaActualizarContenedor=false;
			this.isVisibilidadCeldaEliminarContenedor=false;
			this.isVisibilidadCeldaCancelarContenedor=false;
			this.isVisibilidadCeldaGuardarContenedor=false;
			this.isVisibilidadCeldaGuardarCambiosContenedor=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPedido=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesContenedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosContenedor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioContenedor(false);
			
			this.setPermisosUsuarioContenedor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.contenedorSessionBean.getEsGuardarRelacionado() 
				|| (this.contenedorSessionBean.getEsGuardarRelacionado() && this.contenedorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioContenedorClasesRelacionadas();
			}
			
			if(this.contenedorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioContenedorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ContenedorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosContenedor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualContenedor();
			}
			
			if(!this.isPermisoBusquedaContenedor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasContenedor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioContenedor,this.isPermisoPaginacionMedioContenedor,this.isPermisoPaginacionTodoContenedor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ContenedorConstantesFunciones.getTiposSeleccionarContenedor());
				
				this.tiposColumnasSelect=ContenedorConstantesFunciones.getTiposSeleccionarContenedor(true);
				
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
			//if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioContenedor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioContenedor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioContenedor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesContenedor() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.pedidoLogic=new PedidoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				contenedorImplementable= (ContenedorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ContenedorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				contenedorImplementableHome= (ContenedorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ContenedorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.contenedors= new ArrayList<Contenedor>();
			this.contenedorsEliminados= new ArrayList<Contenedor>();
						
			this.isEsNuevoContenedor=false;
			this.esParaAccionDesdeFormularioContenedor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.pedidosForeignKey=new ArrayList<Pedido>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyContenedor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroContenedor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ContenedorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ContenedorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesContenedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingContenedor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormContenedor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioContenedor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioContenedor();
			}
			
			ContenedorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasContenedor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasContenedor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasContenedor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessContenedor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Contenedor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectContenedor() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesContenedor")) {
				iIndex=this.jInternalFrameDetalleFormContenedor.jTabbedPaneRelacionesContenedor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormContenedor.jTabbedPaneRelacionesContenedor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosContenedor.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessContenedor();	
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
	
	public void cargarCombosForeignKeyContenedor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyContenedor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyContenedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyContenedorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyContenedor();
		
		this.cargarCombosFrameForeignKeyContenedor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyContenedor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyContenedor();
		}
	}
	
	

	public void cargarCombosForeignKeyPedido(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPedidoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPedido();
				this.cargarCombosFramePedidosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPedido(this.pedidosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoContenedorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.contenedorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
			
			if(jTableDatosContenedor.getRowCount()>=1) {
				jTableDatosContenedor.removeRowSelectionInterval(0, jTableDatosContenedor.getRowCount()-1);						
			}
			
			this.isEsNuevoContenedor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoContenedor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesContenedor(true);			
			//this.contenedor=new Contenedor();
			//this.contenedor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContenedor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContenedor() ;
			
			if(ContenedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContenedor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.contenedor);	
			this.actualizarInformacion("INFO_PADRE",false,this.contenedor);				
			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
			if(this.contenedorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Contenedor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarContenedorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosContenedor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosContenedor.getSelectedRows().length;			
			}
			
			contenedorsSeleccionados=this.getContenedorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoContenedor--;			
				//Contenedor contenedorAux= new Contenedor();			
				//contenedorAux.setId(this.iIdNuevoContenedor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Contenedor contenedorOrigen=new Contenedor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Contenedor contenedorOrigen : contenedorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							contenedorOrigen =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contenedorOrigen =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaContenedor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.contenedor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosContenedor(contenedorOrigen,this.contenedor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.contenedorLogic.getContenedors().add(this.contenedorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.contenedors.add(this.contenedorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaContenedor(false);
				
				this.jTableDatosContenedor.setRowSelectionInterval(this.getIndiceNuevoContenedor(), this.getIndiceNuevoContenedor());
				
				int iLastRow =  this.jTableDatosContenedor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosContenedor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosContenedor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaContenedor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();									
		
			Contenedor contenedorOrigen=new Contenedor();
			Contenedor contenedorDestino=new Contenedor();
				
			contenedorsSeleccionados=this.getContenedorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosContenedor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || contenedorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosContenedor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorOrigen =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						contenedorOrigen =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contenedorDestino =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						contenedorDestino =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				contenedorOrigen =contenedorsSeleccionados.get(0);
				contenedorDestino =contenedorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosContenedor(contenedorOrigen,contenedorDestino,true,false);
				
				contenedorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(contenedorDestino,contenedorLogic.getContenedors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contenedorDestino,contenedors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaContenedor(false);
				
				//this.jTableDatosContenedor.setRowSelectionInterval(this.getIndiceNuevoContenedor(), this.getIndiceNuevoContenedor());
				
				int iLastRow =  this.jTableDatosContenedor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosContenedor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosContenedor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaContenedor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormContenedor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesContenedor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasContenedor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesContenedor.setVisible(!isVisible);
			this.jPanelPaginacionContenedor.setVisible(!isVisible);
			this.jPanelAccionesContenedor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameContenedor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoContenedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionContenedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByContenedor();
			
			this.abrirFrameOrderByContenedor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByContenedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleContenedor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormContenedor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormContenedor.isMaximum()) {
					this.jInternalFrameDetalleFormContenedor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormContenedor.setSize(this.jInternalFrameDetalleFormContenedor.iWidthFormulario,this.jInternalFrameDetalleFormContenedor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormContenedor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormContenedor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormContenedor.isMaximum()) {
						this.jInternalFrameDetalleFormContenedor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormContenedor.jContentPaneDetalleContenedor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormContenedor.jTabbedPaneRelacionesContenedor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormContenedor.jContentPaneDetalleContenedor.getWidth(),ContenedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormContenedor.jTabbedPaneRelacionesContenedor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormContenedor.jContentPaneDetalleContenedor.getWidth(),ContenedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormContenedor.jTabbedPaneRelacionesContenedor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormContenedor.jContentPaneDetalleContenedor.getWidth(),ContenedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormContenedor.setVisible(true);
	        this.jInternalFrameDetalleFormContenedor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByContenedor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByContenedor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByContenedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContenedor,false,this);
				} else {
					this.jInternalFrameOrderByContenedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContenedor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByContenedor);
				this.jInternalFrameOrderByContenedor.setVisible(false);
				this.jInternalFrameOrderByContenedor.setSelected(false);
				
				this.jInternalFrameOrderByContenedor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByContenedor"));
				
				this.inicializarActualizarBindingTablaOrderByContenedor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionContenedor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionContenedor==null) {
				
				this.jInternalFrameImportacionContenedor=new ImportacionJInternalFrame(ContenedorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionContenedor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionContenedor);
				this.jInternalFrameImportacionContenedor.setVisible(false);
				this.jInternalFrameImportacionContenedor.setSelected(false);


				this.jInternalFrameImportacionContenedor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionContenedor"));
				this.jInternalFrameImportacionContenedor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionContenedor"));
				this.jInternalFrameImportacionContenedor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionContenedor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoContenedor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoContenedor==null) {
				this.jInternalFrameReporteDinamicoContenedor=new ReporteDinamicoJInternalFrame(ContenedorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoContenedor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoContenedor);
				this.jInternalFrameReporteDinamicoContenedor.setVisible(false);
				this.jInternalFrameReporteDinamicoContenedor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoContenedor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContenedor"));
				this.jInternalFrameReporteDinamicoContenedor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContenedor"));
				this.jInternalFrameReporteDinamicoContenedor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContenedor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContenedor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleContenedor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormContenedor);
			
	       	this.jInternalFrameDetalleFormContenedor.setVisible(false);
	        this.jInternalFrameDetalleFormContenedor.setSelected(false);
			
			//this.jInternalFrameDetalleFormContenedor.dispose();
			//this.jInternalFrameDetalleFormContenedor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoContenedor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoContenedor.setVisible(true);
	        this.jInternalFrameReporteDinamicoContenedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionContenedor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionContenedor.setVisible(true);
	        this.jInternalFrameImportacionContenedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByContenedor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByContenedor.setVisible(true);
	        this.jInternalFrameOrderByContenedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByContenedor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByContenedor.setVisible(false);
	        this.jInternalFrameOrderByContenedor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoContenedor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoContenedor.setVisible(false);
	        this.jInternalFrameReporteDinamicoContenedor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionContenedor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionContenedor.setVisible(false);
	        this.jInternalFrameImportacionContenedor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarContenedor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarContenedor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesContenedor(true);
			//this.isEsNuevoContenedor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesContenedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContenedor(false) ;
			
			if(contenedorSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ContenedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContenedor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContenedor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaContenedorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarContenedor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesContenedor(true);
			//this.isEsNuevoContenedor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.contenedor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesContenedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesContenedor(false) ;
			
			if(ContenedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContenedor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContenedor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaPedido(List<Pedido> pedidosForeignKey)throws Exception{
		TableColumn tableColumnPedido=this.jTableDatosContenedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContenedor,ContenedorConstantesFunciones.LABEL_IDPEDIDO));
		TableCellEditor tableCellEditorPedido =tableColumnPedido.getCellEditor();

		PedidoTableCell pedidoTableCellFk=(PedidoTableCell)tableCellEditorPedido;

		if(pedidoTableCellFk!=null) {
			pedidoTableCellFk.setpedidosForeignKey(pedidosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosContenedor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//pedidoTableCellFk.setRowActual(intSelectedRow);
			//pedidoTableCellFk.setpedidosForeignKeyActual(pedidosForeignKey);
		//}


		if(pedidoTableCellFk!=null) {
			pedidoTableCellFk.RecargarPedidosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesContenedor(false);
			
			//if(!this.isEsNuevoContenedor) {								
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
				
			}
			
			if(this.permiteMantenimiento(this.contenedor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.contenedorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoContenedor=true;
					this.inicializarActualizarBindingTablaContenedor(false);
					this.isEsNuevoContenedor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoContenedor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoContenedor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesContenedor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContenedor(false);
				
				this.habilitarDeshabilitarControlesContenedor(false);
			
												
				
				if(ContenedorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleContenedor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoContenedorActionPerformed(evt,contenedorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualContenedor(this.contenedor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosContenedor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,contenedorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.contenedor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarContenedorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				this.contenedor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				this.contenedor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.contenedor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.contenedorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ContenedorModel) this.jTableDatosContenedor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoContenedor=true;
				this.inicializarActualizarBindingTablaContenedor(false);
				this.isEsNuevoContenedor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesContenedor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContenedor(false);
				
				this.habilitarDeshabilitarControlesContenedor(false);
				
				
				
				if(ContenedorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleContenedor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarContenedorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosContenedor.getRowCount()>=1) {
				jTableDatosContenedor.removeRowSelectionInterval(0, jTableDatosContenedor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesContenedor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaContenedor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContenedor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContenedor(false) ;
			
			this.isEsNuevoContenedor=false;
			
			if(ContenedorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleContenedor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosContenedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingContenedor(false);
				
				//SI ES MANUAL
				if(ContenedorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualContenedor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosContenedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoContenedor--;			
			//Contenedor contenedorAux= new Contenedor();			
			//contenedorAux.setId(this.iIdNuevoContenedor);
			
			if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaContenedor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
			
			this.contenedor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.contenedorLogic.getContenedors().add(this.contenedorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.contenedors.add(this.contenedorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaContenedor(false);
			
			this.jTableDatosContenedor.setRowSelectionInterval(this.getIndiceNuevoContenedor(), this.getIndiceNuevoContenedor());
			
			int iLastRow =  this.jTableDatosContenedor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosContenedor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosContenedor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaContenedor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionContenedorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingContenedor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContenedor(false);
			
			//SI ES MANUAL
			if(ContenedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContenedor();
			}
			
			//this.abrirFrameTreeContenedor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionContenedorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ContenedorES ?", "MANTENIMIENTO DE Contenedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionContenedor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralContenedor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.contenedorReturnGeneral=contenedorLogic.procesarImportacionContenedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.contenedorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarContenedorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionContenedorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionContenedor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionContenedor.setFileImportacion(this.jInternalFrameImportacionContenedor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionContenedor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionContenedor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionContenedor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionContenedor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoContenedorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();		

		contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContenedor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContenedor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ContenedorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ContenedorBaseDesign.jrxml";
			
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
			
			this.generarReporteContenedors("Todos",contenedorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contenedor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoContenedor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContenedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ContenedorConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContenedorConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContenedorConstantesFunciones.LABEL_IDPEDIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pedido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pedido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pedido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pedido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContenedorConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContenedorConstantesFunciones.LABEL_NUMEROBL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroBl_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroBl_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroBl_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroBl_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ContenedorConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoContenedor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoContenedor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoContenedor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ContenedorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ContenedorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ContenedorConstantesFunciones.LABEL_IDPEDIDO:
					sNombreCampoCategoria="id_pedido";
					break;

				case ContenedorConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case ContenedorConstantesFunciones.LABEL_NUMEROBL:
					sNombreCampoCategoria="numero_bl";
					break;

				case ContenedorConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoContenedor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ContenedorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ContenedorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ContenedorConstantesFunciones.LABEL_IDPEDIDO:
					sNombreCampoCategoriaValor="id_pedido";
					break;

				case ContenedorConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case ContenedorConstantesFunciones.LABEL_NUMEROBL:
					sNombreCampoCategoriaValor="numero_bl";
					break;

				case ContenedorConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoContenedor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContenedor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ContenedorConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ContenedorConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ContenedorConstantesFunciones.LABEL_IDPEDIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pedido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pedido");
					break;

				case ContenedorConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case ContenedorConstantesFunciones.LABEL_NUMEROBL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Bl",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_bl");
					break;

				case ContenedorConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoContenedorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();		
		
		contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contenedor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Contenedors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoContenedor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoContenedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ContenedorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContenedorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Contenedor contenedor:contenedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contenedor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContenedorConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContenedorConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Contenedor contenedor:contenedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contenedor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContenedorConstantesFunciones.LABEL_IDPEDIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContenedorConstantesFunciones.LABEL_IDPEDIDO);
					iRow++;

					for(Contenedor contenedor:contenedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contenedor.getpedido_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContenedorConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContenedorConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(Contenedor contenedor:contenedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contenedor.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContenedorConstantesFunciones.LABEL_NUMEROBL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContenedorConstantesFunciones.LABEL_NUMEROBL);
					iRow++;

					for(Contenedor contenedor:contenedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contenedor.getnumero_bl());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ContenedorConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContenedorConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Contenedor contenedor:contenedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contenedor.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelContenedor(row);				
			//	iRow++;
			//}				
			
			//for(Contenedor contenedorAux:contenedorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelContenedor(contenedorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contenedor",JOptionPane.INFORMATION_MESSAGE);
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
				this.contenedorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContenedor(false);
			
			//SI ES MANUAL
			if(ContenedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContenedor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresContenedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContenedor(false);
			
			//SI ES MANUAL
			if(ContenedorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualContenedor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesContenedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContenedor(false);
			
			//SI ES MANUAL
			if(ContenedorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualContenedor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaContenedor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosContenedor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosContenedor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosContenedor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosContenedor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosContenedor.setMinimumSize(dimensionMinimum);
		this.jTableDatosContenedor.setMaximumSize(dimensionMaximum);
		this.jTableDatosContenedor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingContenedor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingContenedor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingContenedor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaContenedor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesContenedor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasContenedor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesContenedor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesContenedor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ContenedorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualContenedor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaContenedor();
		
		this.inicializarActualizarBindingBotonesManualContenedor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualContenedor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesContenedor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualContenedor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualContenedor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosContenedor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosContenedor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteContenedor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormContenedor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormContenedor.jCheckBoxPostAccionNuevoContenedor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormContenedor.jCheckBoxPostAccionSinCerrarContenedor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormContenedor.jCheckBoxPostAccionSinMensajeContenedor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosContenedor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosContenedor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteContenedor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormContenedor!=null) {
				this.jInternalFrameDetalleFormContenedor.jCheckBoxPostAccionNuevoContenedor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormContenedor.jCheckBoxPostAccionSinCerrarContenedor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormContenedor.jCheckBoxPostAccionSinMensajeContenedor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionContenedor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionContenedor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormContenedor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesContenedor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoContenedor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContenedor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesContenedor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesContenedor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarContenedor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesContenedor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoContenedor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContenedor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesContenedor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralContenedor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesContenedor(Boolean esInicializar) throws Exception {
		try	{	
			if(ContenedorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualContenedor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesContenedor() throws Exception {
		try	{
			if(ContenedorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualContenedor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleContenedor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualContenedor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesContenedor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesContenedor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesContenedor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesContenedor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesContenedor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesContenedor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionContenedor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionContenedor.addItem(reporte);
			}
			
			
			if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionContenedor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionContenedor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesContenedor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesContenedor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesContenedor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesContenedor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarContenedor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarContenedor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarContenedor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContenedor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContenedor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoContenedor!=null) {
				this.jInternalFrameReporteDinamicoContenedor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoContenedor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoContenedor!=null) {
				this.jInternalFrameReporteDinamicoContenedor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoContenedor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoContenedor!=null) {
				
				if(this.jInternalFrameReporteDinamicoContenedor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoContenedor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoContenedor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoContenedor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoContenedor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoContenedor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualContenedor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_pedidoFK_IdPedidoContenedor.getSelectedItem()!=null){this.id_pedidoFK_IdPedido=((Pedido)this.jComboBoxid_pedidoFK_IdPedidoContenedor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasContenedor(Boolean esInicializar) throws Exception {				
		if(ContenedorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualContenedor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaContenedor() throws Exception {
		this.inicializarActualizarBindingTablaContenedor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByContenedor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosContenedorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContenedorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaContenedor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=contenedorLogic.getContenedors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=contenedors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosContenedor.setModel(new ContenedorModel(this.contenedorLogic.getContenedors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosContenedor.setModel(new ContenedorModel(this.contenedors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByContenedor!=null && this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByContenedor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosContenedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContenedor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ContenedorConstantesFunciones.SCLASSWEBTITULO,contenedorConstantesFunciones.resaltarSeleccionarContenedor,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ContenedorConstantesFunciones.SCLASSWEBTITULO,contenedorConstantesFunciones.resaltarSeleccionarContenedor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosContenedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContenedor,ContenedorConstantesFunciones.LABEL_ID));

		if(this.contenedorConstantesFunciones.mostraridContenedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContenedorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.contenedorConstantesFunciones.resaltaridContenedor,this.contenedorConstantesFunciones.activaridContenedor,this,true,"idContenedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contenedorConstantesFunciones.resaltaridContenedor,this.contenedorConstantesFunciones.activaridContenedor,this,true,"idContenedor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContenedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContenedor,ContenedorConstantesFunciones.LABEL_IDEMPRESA));

		if(this.contenedorConstantesFunciones.mostrarid_empresaContenedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContenedorConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.contenedorConstantesFunciones.resaltarid_empresaContenedor,this,this.contenedorConstantesFunciones.activarid_empresaContenedor));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.contenedorConstantesFunciones.resaltarid_empresaContenedor,this,this.contenedorConstantesFunciones.activarid_empresaContenedor,false,"id_empresaContenedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContenedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContenedor,ContenedorConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.contenedorConstantesFunciones.mostrarid_sucursalContenedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContenedorConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.contenedorConstantesFunciones.resaltarid_sucursalContenedor,this,this.contenedorConstantesFunciones.activarid_sucursalContenedor));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.contenedorConstantesFunciones.resaltarid_sucursalContenedor,this,this.contenedorConstantesFunciones.activarid_sucursalContenedor,false,"id_sucursalContenedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContenedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContenedor,ContenedorConstantesFunciones.LABEL_IDPEDIDO));

		if(this.contenedorConstantesFunciones.mostrarid_pedidoContenedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContenedorConstantesFunciones.LABEL_IDPEDIDO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PedidoTableCell(this.pedidosForeignKey,this.contenedorConstantesFunciones.resaltarid_pedidoContenedor,this,this.contenedorConstantesFunciones.activarid_pedidoContenedor));
			tableColumn.setCellEditor(new PedidoTableCell(this.pedidosForeignKey,this.contenedorConstantesFunciones.resaltarid_pedidoContenedor,this,this.contenedorConstantesFunciones.activarid_pedidoContenedor,true,"id_pedidoContenedor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContenedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContenedor,ContenedorConstantesFunciones.LABEL_NUMERO));

		if(this.contenedorConstantesFunciones.mostrarnumeroContenedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContenedorConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contenedorConstantesFunciones.resaltarnumeroContenedor,this.contenedorConstantesFunciones.activarnumeroContenedor,this,true,"numeroContenedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contenedorConstantesFunciones.resaltarnumeroContenedor,this.contenedorConstantesFunciones.activarnumeroContenedor,this,true,"numeroContenedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContenedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContenedor,ContenedorConstantesFunciones.LABEL_NUMEROBL));

		if(this.contenedorConstantesFunciones.mostrarnumero_blContenedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContenedorConstantesFunciones.LABEL_NUMEROBL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contenedorConstantesFunciones.resaltarnumero_blContenedor,this.contenedorConstantesFunciones.activarnumero_blContenedor,this,true,"numero_blContenedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contenedorConstantesFunciones.resaltarnumero_blContenedor,this.contenedorConstantesFunciones.activarnumero_blContenedor,this,true,"numero_blContenedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContenedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContenedor,ContenedorConstantesFunciones.LABEL_DESCRIPCION));

		if(this.contenedorConstantesFunciones.mostrardescripcionContenedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContenedorConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contenedorConstantesFunciones.resaltardescripcionContenedor,this.contenedorConstantesFunciones.activardescripcionContenedor,this,true,"descripcionContenedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contenedorConstantesFunciones.resaltardescripcionContenedor,this.contenedorConstantesFunciones.activardescripcionContenedor,this,true,"descripcionContenedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContenedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.contenedorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.contenedorSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosContenedor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.contenedorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.contenedorSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosContenedor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarContenedor && this.isPermisoGuardarCambiosContenedor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.contenedorSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.contenedorSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosContenedor.addColumn(tableColumn);
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
			
			this.jTableDatosContenedor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarContenedor && this.isPermisoGuardarCambiosContenedor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarContenedor && this.isPermisoGuardarCambiosContenedor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosContenedor.moveColumn(this.jTableDatosContenedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosContenedor.moveColumn(this.jTableDatosContenedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosContenedor.moveColumn(this.jTableDatosContenedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosContenedor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosContenedor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosContenedor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosContenedor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosContenedor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosContenedor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosContenedor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosContenedor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=contenedorLogic.getContenedors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=contenedors.size()-1;
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
		//this.jTableDatosContenedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosContenedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosContenedor();
			
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
				
				//this.isEsNuevoContenedor=false;
					
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
				if(this.contenedorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormContenedor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosContenedor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosContenedor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.contenedor.getsType().equals("DUPLICADO")
				   || this.contenedor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoContenedor=true;
				
				} else {
					this.isEsNuevoContenedor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
					if(this.contenedor.getId()>=0 && !this.contenedor.getIsNew()) {						
						this.isEsNuevoContenedor=false;
						
					} else {
						this.isEsNuevoContenedor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoContenedor(esRelaciones);						
				
				this.seleccionarContenedor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.contenedor.getId()<0) {
					this.isEsNuevoContenedor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarContenedor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarContenedor(evt,rowIndex);
				}	
				
				if(this.contenedorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Contenedor: " + this.dDif); 
					}
				}								
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarContenedor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.contenedor)) {
					if(this.contenedor.getId()>0) {
						this.contenedor.setIsDeleted(true);
						
						this.contenedorsEliminados.add(this.contenedor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.contenedorLogic.getContenedors().remove(this.contenedor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.contenedors.remove(this.contenedor);				
					}
					
					
					((ContenedorModel) this.jTableDatosContenedor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaContenedor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarContenedor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoContenedor) {
			
			if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosContenedor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosContenedor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioContenedor(this.contenedor);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.contenedorConstantesFunciones.cargarid_empresaContenedor || this.contenedorConstantesFunciones.event_dependid_empresaContenedor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.contenedor.getid_empresa());
									//this.inicializarActualizarBindingContenedor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(contenedor.getEmpresa()!=null) {
							this.empresasForeignKey.add(contenedor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.contenedor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.contenedorConstantesFunciones.cargarid_sucursalContenedor || this.contenedorConstantesFunciones.event_dependid_sucursalContenedor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.contenedor.getid_sucursal());
									//this.inicializarActualizarBindingContenedor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(contenedor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(contenedor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.contenedor.getid_sucursal(),false,"Formulario");

					//Pedido
					if(!this.contenedorConstantesFunciones.cargarid_pedidoContenedor || this.contenedorConstantesFunciones.event_dependid_pedidoContenedor) {
						//this.cargarCombosPedidosForeignKeyLista(" where id="+this.contenedor.getid_pedido());
									//this.inicializarActualizarBindingContenedor(false,false);
						this.pedidosForeignKey=new ArrayList<Pedido>();

						if(contenedor.getPedido()!=null) {
							this.pedidosForeignKey.add(contenedor.getPedido());
						}

						this.addItemDefectoCombosForeignKeyPedido();
						this.cargarCombosFramePedidosForeignKey("Todos");
					}
					this.setActualPedidoForeignKey(this.contenedor.getid_pedido(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesContenedor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesContenedor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContenedor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoContenedor(Contenedor contenedor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoContenedor(contenedor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoContenedor(Contenedor contenedor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioContenedor(contenedor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyContenedor(contenedor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyContenedor(contenedor);
	}
	
	public void setVariablesObjetoActualToFormularioContenedor(Contenedor contenedor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.setText(contenedor.getId().toString());
			this.jInternalFrameDetalleFormContenedor.jTextFieldnumeroContenedor.setText(contenedor.getnumero());
			this.jInternalFrameDetalleFormContenedor.jTextFieldnumero_blContenedor.setText(contenedor.getnumero_bl());
			this.jInternalFrameDetalleFormContenedor.jTextAreadescripcionContenedor.setText(contenedor.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Contenedor contenedorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,contenedorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Contenedor contenedorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				contenedorLocal=this.contenedor;
			} else {
				contenedorLocal=this.contenedorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(contenedorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoContenedor(contenedorLocal,true);
					
					if(contenedorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(contenedorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.contenedorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(contenedorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoContenedor(Contenedor contenedor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualContenedor(contenedor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysContenedor(contenedor);
	}
	
	public void setVariablesFormularioToObjetoActualContenedor(Contenedor contenedor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualContenedor(contenedor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualContenedor(Contenedor contenedor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.getText()==null || this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.getText()=="" || this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.getText()=="Id") {
				this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.setText("0");
			}

			if(conColumnasBase) {contenedor.setId(Long.parseLong(this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContenedorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContenedor.jLabelIdContenedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contenedor.setnumero(this.jInternalFrameDetalleFormContenedor.jTextFieldnumeroContenedor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContenedorConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContenedor.jLabelnumeroContenedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contenedor.setnumero_bl(this.jInternalFrameDetalleFormContenedor.jTextFieldnumero_blContenedor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContenedorConstantesFunciones.LABEL_NUMEROBL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContenedor.jLabelnumero_blContenedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contenedor.setdescripcion(this.jInternalFrameDetalleFormContenedor.jTextAreadescripcionContenedor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContenedorConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContenedor.jLabeldescripcionContenedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualContenedor(Contenedor contenedorBean,Contenedor contenedor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && contenedorBean.getid_pedido()!=null && !contenedorBean.getid_pedido().equals(-1L))) {contenedor.setid_pedido(contenedorBean.getid_pedido());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosContenedor(Contenedor contenedorOrigen,Contenedor contenedor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && contenedorOrigen.getId()!=null && !contenedorOrigen.getId().equals(0L))) {contenedor.setId(contenedorOrigen.getId());}}
			if(conDefault || (!conDefault && contenedorOrigen.getid_pedido()!=null && !contenedorOrigen.getid_pedido().equals(-1L))) {contenedor.setid_pedido(contenedorOrigen.getid_pedido());}
			if(conDefault || (!conDefault && contenedorOrigen.getnumero()!=null && !contenedorOrigen.getnumero().equals(""))) {contenedor.setnumero(contenedorOrigen.getnumero());}
			if(conDefault || (!conDefault && contenedorOrigen.getnumero_bl()!=null && !contenedorOrigen.getnumero_bl().equals(""))) {contenedor.setnumero_bl(contenedorOrigen.getnumero_bl());}
			if(conDefault || (!conDefault && contenedorOrigen.getdescripcion()!=null && !contenedorOrigen.getdescripcion().equals(""))) {contenedor.setdescripcion(contenedorOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioContenedor(Contenedor contenedor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.setText(contenedor.getId().toString());
			this.jInternalFrameDetalleFormContenedor.jTextFieldnumeroContenedor.setText(contenedor.getnumero());
			this.jInternalFrameDetalleFormContenedor.jTextFieldnumero_blContenedor.setText(contenedor.getnumero_bl());
			this.jInternalFrameDetalleFormContenedor.jTextAreadescripcionContenedor.setText(contenedor.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioContenedor(ContenedorBean contenedorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.setText(contenedorBean.getId().toString());
			this.jInternalFrameDetalleFormContenedor.jTextFieldnumeroContenedor.setText(contenedorBean.getnumero());
			this.jInternalFrameDetalleFormContenedor.jTextFieldnumero_blContenedor.setText(contenedorBean.getnumero_bl());
			this.jInternalFrameDetalleFormContenedor.jTextAreadescripcionContenedor.setText(contenedorBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanContenedor(ContenedorParameterReturnGeneral contenedorReturnGeneral,ContenedorBean contenedorBean,Boolean conDefault) throws Exception { 
		try {
			Contenedor contenedorLocal=new Contenedor();
			
			contenedorLocal=contenedorReturnGeneral.getContenedor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && contenedorLocal.getId()!=null && !contenedorLocal.getId().equals(0L))) {contenedorBean.setId(contenedorLocal.getId());}}
			if(conDefault || (!conDefault && contenedorLocal.getid_pedido()!=null && !contenedorLocal.getid_pedido().equals(-1L))) {contenedorBean.setid_pedido(contenedorLocal.getid_pedido());}
			if(conDefault || (!conDefault && contenedorLocal.getnumero()!=null && !contenedorLocal.getnumero().equals(""))) {contenedorBean.setnumero(contenedorLocal.getnumero());}
			if(conDefault || (!conDefault && contenedorLocal.getnumero_bl()!=null && !contenedorLocal.getnumero_bl().equals(""))) {contenedorBean.setnumero_bl(contenedorLocal.getnumero_bl());}
			if(conDefault || (!conDefault && contenedorLocal.getdescripcion()!=null && !contenedorLocal.getdescripcion().equals(""))) {contenedorBean.setdescripcion(contenedorLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxContenedorGenerico(Long idContenedorSeleccionado,JComboBox jComboBoxContenedor,List<Contenedor> contenedorsLocal)throws Exception {
		try {
			Contenedor  contenedorTemp=null;

			for(Contenedor contenedorAux:contenedorsLocal) {
				if(contenedorAux.getId()!=null && contenedorAux.getId().equals(idContenedorSeleccionado)) {
					contenedorTemp=contenedorAux;
					break;
				}
			}

			jComboBoxContenedor.setSelectedItem(contenedorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxContenedorGenerico(JComboBox jComboBoxContenedor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxContenedor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxContenedor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxContenedor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxContenedor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			contenedor=(Contenedor) contenedorLogic.getContenedors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			contenedor =(Contenedor) contenedors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!contenedor.getIsNew() && !contenedor.getIsChanged() && !contenedor.getIsDeleted()) {
				sDescripcion=contenedor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=contenedor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!contenedor.getIsNew() && !contenedor.getIsChanged() && !contenedor.getIsDeleted()) {
				sDescripcion=contenedor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=contenedor.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Pedido")) {
			//sDescripcion=this.getActualPedidoForeignKeyDescripcion((Long)value);
			if(!contenedor.getIsNew() && !contenedor.getIsChanged() && !contenedor.getIsDeleted()) {
				sDescripcion=contenedor.getpedido_descripcion();
			} else {
				//sDescripcion=this.getActualPedidoForeignKeyDescripcion((Long)value);
				sDescripcion=contenedor.getpedido_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Contenedor contenedorRow=new Contenedor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			contenedorRow=(Contenedor) contenedorLogic.getContenedors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			contenedorRow=(Contenedor) contenedors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualContenedor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoContenedor.setVisible((this.isVisibilidadCeldaNuevoContenedor && this.isPermisoNuevoContenedor));			
			this.jButtonDuplicarContenedor.setVisible((this.isVisibilidadCeldaDuplicarContenedor && this.isPermisoDuplicarContenedor));			
			this.jButtonCopiarContenedor.setVisible((this.isVisibilidadCeldaCopiarContenedor && this.isPermisoCopiarContenedor));
			this.jButtonVerFormContenedor.setVisible((this.isVisibilidadCeldaVerFormContenedor && this.isPermisoVerFormContenedor));
			
			this.jButtonAbrirOrderByContenedor.setVisible((this.isVisibilidadCeldaOrdenContenedor && this.isPermisoOrdenContenedor));			
			
			this.jButtonNuevoRelacionesContenedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesContenedor && this.isPermisoNuevoContenedor));			
			this.jButtonNuevoGuardarCambiosContenedor.setVisible((this.isVisibilidadCeldaNuevoContenedor && this.isPermisoNuevoContenedor && this.isPermisoGuardarCambiosContenedor));
			
			if(this.jInternalFrameDetalleFormContenedor!=null) {
			this.jInternalFrameDetalleFormContenedor.jButtonModificarContenedor.setVisible((this.isVisibilidadCeldaModificarContenedor && this.isPermisoActualizarContenedor));	
			this.jInternalFrameDetalleFormContenedor.jButtonActualizarContenedor.setVisible((this.isVisibilidadCeldaActualizarContenedor && this.isPermisoActualizarContenedor));	
			this.jInternalFrameDetalleFormContenedor.jButtonEliminarContenedor.setVisible((this.isVisibilidadCeldaEliminarContenedor && this.isPermisoEliminarContenedor));
			this.jInternalFrameDetalleFormContenedor.jButtonCancelarContenedor.setVisible(this.isVisibilidadCeldaCancelarContenedor);							
			this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosContenedor.setVisible((this.isVisibilidadCeldaGuardarContenedor && this.isPermisoGuardarCambiosContenedor));			
			
			}
						
			this.jButtonGuardarCambiosTablaContenedor.setVisible((this.isVisibilidadCeldaGuardarCambiosContenedor && this.isPermisoGuardarCambiosContenedor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarContenedor.setVisible((this.isVisibilidadCeldaNuevoContenedor && this.isPermisoNuevoContenedor));						
			this.jButtonDuplicarToolBarContenedor.setVisible((this.isVisibilidadCeldaDuplicarContenedor && this.isPermisoDuplicarContenedor));						
			this.jButtonCopiarToolBarContenedor.setVisible((this.isVisibilidadCeldaCopiarContenedor && this.isPermisoCopiarContenedor));			
			this.jButtonVerFormToolBarContenedor.setVisible((this.isVisibilidadCeldaVerFormContenedor && this.isPermisoVerFormContenedor));			
			this.jButtonAbrirOrderByToolBarContenedor.setVisible((this.isVisibilidadCeldaOrdenContenedor && this.isPermisoOrdenContenedor));
			this.jButtonNuevoRelacionesToolBarContenedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesContenedor && this.isPermisoNuevoContenedor));			
			this.jButtonNuevoGuardarCambiosToolBarContenedor.setVisible((this.isVisibilidadCeldaNuevoContenedor && this.isPermisoNuevoContenedor && this.isPermisoGuardarCambiosContenedor));			
			
			if(this.jInternalFrameDetalleFormContenedor!=null) {
			this.jInternalFrameDetalleFormContenedor.jButtonModificarToolBarContenedor.setVisible((this.isVisibilidadCeldaModificarContenedor && this.isPermisoActualizarContenedor));	
			this.jInternalFrameDetalleFormContenedor.jButtonActualizarToolBarContenedor.setVisible((this.isVisibilidadCeldaActualizarContenedor  && this.isPermisoActualizarContenedor));	
			this.jInternalFrameDetalleFormContenedor.jButtonEliminarToolBarContenedor.setVisible((this.isVisibilidadCeldaEliminarContenedor && this.isPermisoEliminarContenedor));
			this.jInternalFrameDetalleFormContenedor.jButtonCancelarToolBarContenedor.setVisible(this.isVisibilidadCeldaCancelarContenedor);				
			this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosToolBarContenedor.setVisible((this.isVisibilidadCeldaGuardarContenedor && this.isPermisoGuardarCambiosContenedor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarContenedor.setVisible((this.isVisibilidadCeldaGuardarCambiosContenedor && this.isPermisoGuardarCambiosContenedor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoContenedor.setVisible((this.isVisibilidadCeldaNuevoContenedor && this.isPermisoNuevoContenedor));			
			this.jMenuItemDuplicarContenedor.setVisible((this.isVisibilidadCeldaDuplicarContenedor && this.isPermisoDuplicarContenedor));			
			this.jMenuItemCopiarContenedor.setVisible((this.isVisibilidadCeldaCopiarContenedor && this.isPermisoCopiarContenedor));			
			this.jMenuItemVerFormContenedor.setVisible((this.isVisibilidadCeldaVerFormContenedor && this.isPermisoVerFormContenedor));			
			this.jMenuItemAbrirOrderByContenedor.setVisible((this.isVisibilidadCeldaOrdenContenedor && this.isPermisoOrdenContenedor));			
			//this.jMenuItemMostrarOcultarContenedor.setVisible((this.isVisibilidadCeldaOrdenContenedor && this.isPermisoOrdenContenedor));
			this.jMenuItemDetalleAbrirOrderByContenedor.setVisible((this.isVisibilidadCeldaOrdenContenedor && this.isPermisoOrdenContenedor));			
			//this.jMenuItemDetalleMostrarOcultarContenedor.setVisible((this.isVisibilidadCeldaOrdenContenedor && this.isPermisoOrdenContenedor));			
			this.jMenuItemNuevoRelacionesContenedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesContenedor && this.isPermisoNuevoContenedor));			
			this.jMenuItemNuevoGuardarCambiosContenedor.setVisible((this.isVisibilidadCeldaNuevoContenedor && this.isPermisoNuevoContenedor && this.isPermisoGuardarCambiosContenedor));									
			
			if(this.jInternalFrameDetalleFormContenedor!=null) {
			this.jInternalFrameDetalleFormContenedor.jMenuItemModificarContenedor.setVisible((this.isVisibilidadCeldaModificarContenedor && this.isPermisoActualizarContenedor));	
			this.jInternalFrameDetalleFormContenedor.jMenuItemActualizarContenedor.setVisible((this.isVisibilidadCeldaActualizarContenedor && this.isPermisoActualizarContenedor));	
			this.jInternalFrameDetalleFormContenedor.jMenuItemEliminarContenedor.setVisible((this.isVisibilidadCeldaEliminarContenedor && this.isPermisoEliminarContenedor));
			this.jInternalFrameDetalleFormContenedor.jMenuItemCancelarContenedor.setVisible(this.isVisibilidadCeldaCancelarContenedor);				
			}
			
			this.jMenuItemGuardarCambiosContenedor.setVisible((this.isVisibilidadCeldaGuardarContenedor && this.isPermisoGuardarCambiosContenedor));						
			this.jMenuItemGuardarCambiosTablaContenedor.setVisible((this.isVisibilidadCeldaGuardarCambiosContenedor && this.isPermisoGuardarCambiosContenedor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoContenedor=this.jButtonNuevoContenedor.isVisible();
			this.isVisibilidadCeldaDuplicarContenedor=this.jButtonDuplicarContenedor.isVisible();
			this.isVisibilidadCeldaCopiarContenedor=this.jButtonCopiarContenedor.isVisible();
			this.isVisibilidadCeldaVerFormContenedor=this.jButtonVerFormContenedor.isVisible();
			
			this.isVisibilidadCeldaOrdenContenedor=this.jButtonAbrirOrderByContenedor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesContenedor=this.jButtonNuevoRelacionesContenedor.isVisible();
			this.isVisibilidadCeldaModificarContenedor=this.jButtonModificarContenedor.isVisible();
			
			if(this.jInternalFrameDetalleFormContenedor!=null) {
			this.isVisibilidadCeldaActualizarContenedor=this.jInternalFrameDetalleFormContenedor.jButtonActualizarContenedor.isVisible();
			this.isVisibilidadCeldaEliminarContenedor=this.jInternalFrameDetalleFormContenedor.jButtonEliminarContenedor.isVisible();
			this.isVisibilidadCeldaCancelarContenedor=this.jInternalFrameDetalleFormContenedor.jButtonCancelarContenedor.isVisible();
			this.isVisibilidadCeldaGuardarContenedor=this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosContenedor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosContenedor=this.jButtonGuardarCambiosTablaContenedor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoContenedor=this.jButtonNuevoToolBarContenedor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesContenedor=this.jButtonNuevoRelacionesToolBarContenedor.isVisible();
			
			if(this.jInternalFrameDetalleFormContenedor!=null) {
			this.isVisibilidadCeldaModificarContenedor=this.jInternalFrameDetalleFormContenedor.jButtonModificarToolBarContenedor.isVisible();
			this.isVisibilidadCeldaActualizarContenedor=this.jInternalFrameDetalleFormContenedor.jButtonActualizarToolBarContenedor.isVisible();
			this.isVisibilidadCeldaEliminarContenedor=this.jInternalFrameDetalleFormContenedor.jButtonEliminarToolBarContenedor.isVisible();
			this.isVisibilidadCeldaCancelarContenedor=this.jInternalFrameDetalleFormContenedor.jButtonCancelarToolBarContenedor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarContenedor=this.jButtonGuardarCambiosToolBarContenedor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosContenedor=this.jButtonGuardarCambiosTablaToolBarContenedor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoContenedor=this.jMenuItemNuevoContenedor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesContenedor=this.jMenuItemNuevoRelacionesContenedor.isVisible();
			
			if(this.jInternalFrameDetalleFormContenedor!=null) {
			this.isVisibilidadCeldaModificarContenedor=this.jInternalFrameDetalleFormContenedor.jMenuItemModificarContenedor.isVisible();
			this.isVisibilidadCeldaActualizarContenedor=this.jInternalFrameDetalleFormContenedor.jMenuItemActualizarContenedor.isVisible();
			this.isVisibilidadCeldaEliminarContenedor=this.jInternalFrameDetalleFormContenedor.jMenuItemEliminarContenedor.isVisible();
			this.isVisibilidadCeldaCancelarContenedor=this.jInternalFrameDetalleFormContenedor.jMenuItemCancelarContenedor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarContenedor=this.jMenuItemGuardarCambiosContenedor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosContenedor=this.jMenuItemGuardarCambiosTablaContenedor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesContenedor(Boolean esInicializar) {
		if(ContenedorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.contenedorSessionBean.getConGuardarRelaciones()) {
				//if(this.contenedorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesContenedor();
			}
			
			this.inicializarActualizarBindingBotonesManualContenedor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualContenedor() {
		this.jButtonNuevoContenedor.setVisible(this.isPermisoNuevoContenedor);			
		this.jButtonDuplicarContenedor.setVisible(this.isPermisoDuplicarContenedor);			
		this.jButtonCopiarContenedor.setVisible(this.isPermisoCopiarContenedor);			
		this.jButtonVerFormContenedor.setVisible(this.isPermisoVerFormContenedor);			
		
		this.jButtonAbrirOrderByContenedor.setVisible(this.isPermisoOrdenContenedor);					
		
		this.jButtonNuevoRelacionesContenedor.setVisible(this.isPermisoNuevoContenedor);			
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jButtonModificarContenedor.setVisible(this.isPermisoActualizarContenedor);	
			this.jInternalFrameDetalleFormContenedor.jButtonActualizarContenedor.setVisible(this.isPermisoActualizarContenedor);	
			this.jInternalFrameDetalleFormContenedor.jButtonEliminarContenedor.setVisible(this.isPermisoEliminarContenedor);
			this.jInternalFrameDetalleFormContenedor.jButtonCancelarContenedor.setVisible(this.isVisibilidadCeldaCancelarContenedor);						
			this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosContenedor.setVisible(this.isPermisoGuardarCambiosContenedor);							
		}
		
		this.jButtonGuardarCambiosTablaContenedor.setVisible(this.isPermisoActualizarContenedor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleContenedor() {
		this.jInternalFrameDetalleFormContenedor.jButtonModificarContenedor.setVisible(this.isPermisoActualizarContenedor);	
		this.jInternalFrameDetalleFormContenedor.jButtonActualizarContenedor.setVisible(this.isPermisoActualizarContenedor);	
		this.jInternalFrameDetalleFormContenedor.jButtonEliminarContenedor.setVisible(this.isPermisoEliminarContenedor);
		this.jInternalFrameDetalleFormContenedor.jButtonCancelarContenedor.setVisible(this.isVisibilidadCeldaCancelarContenedor);							
		this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosContenedor.setVisible((this.isVisibilidadCeldaGuardarContenedor && this.isPermisoGuardarCambiosContenedor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosContenedor() {
		if(ContenedorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualContenedor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesContenedor() {
	}
	
	public void jTableDatosContenedorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarContenedor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidContenedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContenedor(this.getcontenedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contenedor==null) {
						this.contenedor = new Contenedor();
					}

					this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
				}

				if(this.contenedor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.contenedor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContenedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaContenedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebContenedor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosContenedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosContenedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualContenedor(this.getcontenedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.contenedorLogic.getConnexion());

				if(this.contenedor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.contenedor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderContenedor=(TitledBorder)this.jScrollPanelDatosContenedor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderContenedor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaContenedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContenedor(this.getcontenedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contenedor==null) {
						this.contenedor = new Contenedor();
					}

					this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
				}

				if(this.contenedor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.contenedor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContenedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalContenedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebContenedor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosContenedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosContenedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualContenedor(this.getcontenedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.contenedorLogic.getConnexion());

				if(this.contenedor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.contenedor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderContenedor=(TitledBorder)this.jScrollPanelDatosContenedor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderContenedor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalContenedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContenedor(this.getcontenedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contenedor==null) {
						this.contenedor = new Contenedor();
					}

					this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
				}

				if(this.contenedor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.contenedor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContenedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_pedidoContenedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopedido=true;

			idTienePermisopedido=this.tienePermisosUsuarioEnPaginaWebContenedor(PedidoConstantesFunciones.CLASSNAME);

			if(idTienePermisopedido) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosContenedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosContenedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualContenedor(this.getcontenedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);

				this.pedidoBeanSwingJInternalFrame=new PedidoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.pedidoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.pedidoBeanSwingJInternalFrame.getPedidoLogic().setConnexion(this.contenedorLogic.getConnexion());

				if(this.contenedor.getid_pedido()!=null) {
					this.pedidoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.pedidoBeanSwingJInternalFrame.setIdActual(this.contenedor.getid_pedido());
					this.pedidoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.pedidoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.pedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedido();
				}

				JInternalFrameBase jinternalFrame =this.pedidoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderContenedor=(TitledBorder)this.jScrollPanelDatosContenedor.getBorder();
				TitledBorder titledBorderpedido=(TitledBorder)this.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.getBorder();

				titledBorderpedido.setTitle(titledBorderContenedor.getTitle() + " -> Pedido");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_pedidoContenedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContenedor(this.getcontenedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contenedor==null) {
						this.contenedor = new Contenedor();
					}

					this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
				}

				if(this.contenedor.getid_pedido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pedido = "+this.contenedor.getid_pedido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContenedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroContenedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContenedor(this.getcontenedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contenedor==null) {
						this.contenedor = new Contenedor();
					}

					this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
				}

				if(this.contenedor.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.contenedor.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContenedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_blContenedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContenedor(this.getcontenedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contenedor==null) {
						this.contenedor = new Contenedor();
					}

					this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
				}

				if(this.contenedor.getnumero_bl()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_bl like '%"+this.contenedor.getnumero_bl()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContenedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionContenedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContenedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContenedor(this.getcontenedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contenedor==null) {
						this.contenedor = new Contenedor();
					}

					this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);
				}

				if(this.contenedor.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.contenedor.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContenedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaContenedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingContenedor(false,false);

			this.getContenedorsFK_IdEmpresa();

			this.inicializarActualizarBindingContenedor(false);

			//if(ContenedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingContenedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPedidoContenedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingContenedor(false,false);

			this.getContenedorsFK_IdPedido();

			this.inicializarActualizarBindingContenedor(false);

			//if(ContenedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingContenedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalContenedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingContenedor(false,false);

			this.getContenedorsFK_IdSucursal();

			this.inicializarActualizarBindingContenedor(false);

			//if(ContenedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingContenedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contenedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameContenedor() {
		if(this.jInternalFrameDetalleFormContenedor!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormContenedor!=null) {
			this.jInternalFrameDetalleFormContenedor.setVisible(false);	    			
			this.jInternalFrameDetalleFormContenedor.dispose();
			this.jInternalFrameDetalleFormContenedor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoContenedor!=null) {
			this.jInternalFrameReporteDinamicoContenedor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoContenedor.dispose();
			this.jInternalFrameReporteDinamicoContenedor=null;
		}
		
		if(this.jInternalFrameImportacionContenedor!=null) {
			this.jInternalFrameImportacionContenedor.setVisible(false);	    			
			this.jInternalFrameImportacionContenedor.dispose();
			this.jInternalFrameImportacionContenedor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessContenedor();
			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
			
			if(sTipo.equals("NuevoContenedor")) {
				jButtonNuevoContenedorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarContenedor")) {
				jButtonDuplicarContenedorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarContenedor")) {
				jButtonCopiarContenedorActionPerformed(evt);
			} else if(sTipo.equals("VerFormContenedor")) {
				jButtonVerFormContenedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarContenedor")) {
				jButtonNuevoContenedorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarContenedor")) {
				jButtonDuplicarContenedorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoContenedor")) {
				jButtonNuevoContenedorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarContenedor")) {
				jButtonDuplicarContenedorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesContenedor")) {
				jButtonNuevoContenedorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarContenedor")) {
				jButtonNuevoContenedorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesContenedor")) {
				jButtonNuevoContenedorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarContenedor")) {
				jButtonModificarContenedorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarContenedor")) {
				jButtonModificarContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarContenedor")) {
				jButtonModificarContenedorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarContenedor")) {
				jButtonActualizarContenedorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarContenedor")) {
				jButtonActualizarContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarContenedor")) {
				jButtonActualizarContenedorActionPerformed(evt);
			} else if(sTipo.equals("EliminarContenedor")) {
				jButtonEliminarContenedorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarContenedor")) {
				jButtonEliminarContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarContenedor")) {
				jButtonEliminarContenedorActionPerformed(evt);
			} else if(sTipo.equals("CancelarContenedor")) {
				jButtonCancelarContenedorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarContenedor")) {
				jButtonCancelarContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarContenedor")) {
				jButtonCancelarContenedorActionPerformed(evt);
			} else if(sTipo.equals("CerrarContenedor")) {
				jButtonCerrarContenedorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarContenedor")) {
				jButtonCerrarContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarContenedor")) {
				jButtonCerrarContenedorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarContenedor")) {
				jButtonMostrarOcultarContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarContenedor")) {
				jButtonCancelarContenedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosContenedor")) {
				jButtonGuardarCambiosContenedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarContenedor")) {
				jButtonGuardarCambiosContenedorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarContenedor")) {
				jButtonCopiarContenedorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarContenedor")) {
				jButtonVerFormContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosContenedor")) {
				jButtonGuardarCambiosContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarContenedor")) {
				jButtonCopiarContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormContenedor")) {
				jButtonVerFormContenedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaContenedor")) {
				jButtonGuardarCambiosContenedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarContenedor")) {
				jButtonGuardarCambiosContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaContenedor")) {
				jButtonGuardarCambiosContenedorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionContenedor")) {
				jButtonRecargarInformacionContenedorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarContenedor")) {
				jButtonRecargarInformacionContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionContenedor")) {
				jButtonRecargarInformacionContenedorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresContenedor")) {
				jButtonAnterioresContenedorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarContenedor")) {
				jButtonAnterioresContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreContenedor")) {
				jButtonAnterioresContenedorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesContenedor")) {
				jButtonSiguientesContenedorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarContenedor")) {
				jButtonSiguientesContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesContenedor")) {
				jButtonSiguientesContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByContenedor") || sTipo.equals("MenuItemDetalleAbrirOrderByContenedor")) {
				jButtonAbrirOrderByContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarContenedor") || sTipo.equals("MenuItemDetalleMostrarOcultarContenedor")) {
				jButtonMostrarOcultarContenedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosContenedor")) {
				jButtonNuevoGuardarCambiosContenedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarContenedor")) {
				jButtonNuevoGuardarCambiosContenedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosContenedor")) {
				jButtonNuevoGuardarCambiosContenedorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoContenedor")) {
				jButtonCerrarReporteDinamicoContenedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoContenedor")) {
				jButtonGenerarReporteDinamicoContenedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoContenedor")) {
				
				jButtonGenerarExcelReporteDinamicoContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionContenedor")) {
				jButtonCerrarImportacionContenedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionContenedor")) {
				
				jButtonGenerarImportacionContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionContenedor")) {
				
				jButtonAbrirImportacionContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesContenedor")) {
				jComboBoxTiposAccionesContenedorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesContenedor")) {
				jComboBoxTiposRelacionesContenedorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioContenedor")) {
				jComboBoxTiposAccionesContenedorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarContenedor")) {
				
				jComboBoxTiposSeleccionarContenedorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralContenedor")) {
				jTextFieldValorCampoGeneralContenedorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByContenedor")) {
				jButtonAbrirOrderByContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarContenedor")) {
				jButtonAbrirOrderByContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByContenedor")) {
				jButtonCerrarOrderByContenedorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idContenedorBusqueda")) {
				this.jButtonidContenedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaContenedorUpdate")) {
				this.jButtonid_empresaContenedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaContenedorBusqueda")) {
				this.jButtonid_empresaContenedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalContenedorUpdate")) {
				this.jButtonid_sucursalContenedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalContenedorBusqueda")) {
				this.jButtonid_sucursalContenedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pedidoContenedorUpdate")) {
				this.jButtonid_pedidoContenedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pedidoContenedorBusqueda")) {
				this.jButtonid_pedidoContenedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroContenedorBusqueda")) {
				this.jButtonnumeroContenedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_blContenedorBusqueda")) {
				this.jButtonnumero_blContenedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionContenedorBusqueda")) {
				this.jButtondescripcionContenedorBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPedidoContenedor")) {
				this.jButtonFK_IdPedidoContenedorActionPerformed(evt);
			}
			
			;
			
			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessContenedor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContenedorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				


				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Contenedor contenedorLocal=null;
			
			if(!this.getEsControlTabla()) {
				contenedorLocal=this.contenedor;
			} else {
				contenedorLocal=this.contenedorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
							
				
				


				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContenedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorAnterior =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contenedorAnterior =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
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
			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
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
			
			


			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContenedorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
								
						
				


				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
								
				
				


				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContenedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorAnterior =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contenedorAnterior =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContenedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorAnterior =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contenedorAnterior =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContenedorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
							
				
				


				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContenedorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contenedorAnterior =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.contenedorAnterior =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
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
			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
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
			
			


			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContenedorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
								
				
				


				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContenedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorAnterior =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contenedorAnterior =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContenedorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContenedorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosContenedor")) {
					jCheckBoxSeleccionarTodosContenedorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosContenedor")) {
					jCheckBoxSeleccionadosContenedorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarContenedor")) {
					
				}
				
				


				
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
												
				
				


				
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContenedorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contenedorAnterior =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.contenedorAnterior =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContenedorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
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
			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
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
			
			


			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContenedorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contenedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contenedor);
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
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
				
				


				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contenedor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contenedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContenedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contenedorAnterior =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contenedorAnterior =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarContenedor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosContenedorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosContenedor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.contenedor =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.contenedor =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.contenedor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarContenedor")) {
				
				}
				
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarContenedor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosContenedor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarContenedor")) {
			
			}
			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessContenedor();
			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
			if(sTipo.equals("NuevoContenedor")) {
				jButtonNuevoContenedorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarContenedor")) {
				jButtonDuplicarContenedorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarContenedor")) {
				jButtonCopiarContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormContenedor")) {
				jButtonVerFormContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesContenedor")) {
				jButtonNuevoContenedorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarContenedor")) {
				jButtonModificarContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarContenedor")) {
				jButtonActualizarContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarContenedor")) {
				jButtonEliminarContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaContenedor")) {
				jButtonGuardarCambiosContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarContenedor")) {
				jButtonCancelarContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarContenedor")) {
				jButtonCerrarContenedorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosContenedor")) {
				jButtonGuardarCambiosContenedorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosContenedor")) {
				jButtonNuevoGuardarCambiosContenedorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByContenedor")) {
				jButtonAbrirOrderByContenedorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionContenedor")) {
				jButtonRecargarInformacionContenedorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresContenedor")) {
				jButtonAnterioresContenedorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesContenedor")) {
				jButtonSiguientesContenedorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idContenedorBusqueda")) {
				this.jButtonidContenedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaContenedorUpdate")) {
				this.jButtonid_empresaContenedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaContenedorBusqueda")) {
				this.jButtonid_empresaContenedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalContenedorUpdate")) {
				this.jButtonid_sucursalContenedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalContenedorBusqueda")) {
				this.jButtonid_sucursalContenedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pedidoContenedorUpdate")) {
				this.jButtonid_pedidoContenedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pedidoContenedorBusqueda")) {
				this.jButtonid_pedidoContenedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroContenedorBusqueda")) {
				this.jButtonnumeroContenedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_blContenedorBusqueda")) {
				this.jButtonnumero_blContenedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionContenedorBusqueda")) {
				this.jButtondescripcionContenedorBusquedaActionPerformed(evt);
			}
			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessContenedor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameContenedor")) {
				closingInternalFrameContenedor();
				
			} else if(sTipo.equals("jButtonCancelarContenedor")) {
				JInternalFrameBase jInternalFrameDetalleFormContenedor = (JInternalFrameBase)evt.getSource();
	            	
	            ContenedorBeanSwingJInternalFrame jInternalFrameParent=(ContenedorBeanSwingJInternalFrame)jInternalFrameDetalleFormContenedor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarContenedorActionPerformed(null);
			}
			
			ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.contenedor,new Object(),this.contenedorParameterGeneral,this.contenedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormContenedor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormContenedor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormContenedor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.contenedor)) {
			if(!esControlTabla) {
				if(ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);			
				}
				
				if(this.contenedorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualContenedor(this.contenedor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.contenedorReturnGeneral=contenedorLogic.procesarEventosContenedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.contenedorLogic.getContenedors(),this.contenedor,this.contenedorParameterGeneral,this.isEsNuevoContenedor,classes);//this.contenedorLogic.getContenedor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanContenedor(this.contenedorReturnGeneral,this.contenedorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.contenedorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanContenedor(classes,this.contenedorReturnGeneral,this.contenedorBean,false);
					}
						
					if(this.contenedorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyContenedor(this.contenedorReturnGeneral.getContenedor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioContenedor(this.contenedorReturnGeneral.getContenedor());	
					}
						
					if(this.contenedorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioContenedor(this.contenedorReturnGeneral.getContenedor(),classes);//this.contenedorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioContenedor(this.contenedor,classes);//this.contenedorBean);									
				}
			
				if(ContenedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualContenedor(this.contenedor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysContenedor(this.contenedor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.contenedorAnterior!=null) {
						this.contenedor=this.contenedorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.contenedorReturnGeneral=contenedorLogic.procesarEventosContenedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.contenedorLogic.getContenedors(),this.contenedor,this.contenedorParameterGeneral,this.isEsNuevoContenedor,classes);//this.contenedorLogic.getContenedor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.contenedorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.contenedorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.contenedorReturnGeneral.getContenedor(),contenedorLogic.getContenedors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.contenedorReturnGeneral.getContenedor(),this.contenedors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosContenedor.repaint();
				
				//((AbstractTableModel) this.jTableDatosContenedor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosContenedor();
			}
		}
	}
	
	public void actualizarVisualTableDatosContenedor() throws Exception {
		
		ContenedorModel contenedorModel=(ContenedorModel)this.jTableDatosContenedor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			contenedorModel.contenedors=this.contenedorLogic.getContenedors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			contenedorModel.contenedors=this.contenedors;
		}
		
		
		((ContenedorModel) this.jTableDatosContenedor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaContenedor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcontenedorAnterior(),this.contenedorLogic.getContenedors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcontenedorAnterior(),this.contenedors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosContenedor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioContenedor(Contenedor contenedor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
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
										
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.contenedor,new Object(),generalEntityParameterGeneral,this.contenedorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.contenedorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ContenedorConstantesFunciones.getClassesRelationshipsOfContenedor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ContenedorConstantesFunciones.getClassesRelationshipsFromStringsOfContenedor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormContenedor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ContenedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.contenedor,new Object(),generalEntityParameterGeneral,this.contenedorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioContenedor(ContenedorBean contenedorBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanContenedor(ArrayList<Classe> classes,ContenedorReturnGeneral contenedorReturnGeneral,ContenedorBean contenedorBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualContenedor(Contenedor contenedor,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.contenedor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormContenedor = new ContenedorDetalleFormJInternalFrame(jDesktopPane,this.contenedorSessionBean.getConGuardarRelaciones(),this.contenedorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormContenedor);
		this.jInternalFrameDetalleFormContenedor.setVisible(false);
		this.jInternalFrameDetalleFormContenedor.setSelected(false);						
		
		this.jInternalFrameDetalleFormContenedor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormContenedor.contenedorLogic=this.contenedorLogic;
		
		this.cargarCombosFrameForeignKeyContenedor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleContenedor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleContenedor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyContenedor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyContenedor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormContenedor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarContenedor"));
		
		this.jInternalFrameDetalleFormContenedor.jButtonModificarContenedor.addActionListener(new ButtonActionListener(this,"ModificarContenedor"));

		
		this.jInternalFrameDetalleFormContenedor.jButtonModificarToolBarContenedor.addActionListener(new ButtonActionListener(this,"ModificarToolBarContenedor"));
					
		this.jInternalFrameDetalleFormContenedor.jMenuItemModificarContenedor.addActionListener(new ButtonActionListener(this,"MenuItemModificarContenedor"));		
		
		
		
		this.jInternalFrameDetalleFormContenedor.jButtonActualizarContenedor.addActionListener (new ButtonActionListener(this,"ActualizarContenedor"));
		
		
		this.jInternalFrameDetalleFormContenedor.jButtonActualizarToolBarContenedor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarContenedor"));
						
		this.jInternalFrameDetalleFormContenedor.jMenuItemActualizarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarContenedor"));		
		
		
		
		this.jInternalFrameDetalleFormContenedor.jButtonEliminarContenedor.addActionListener (new ButtonActionListener(this,"EliminarContenedor"));
		
		
		this.jInternalFrameDetalleFormContenedor.jButtonEliminarToolBarContenedor.addActionListener (new ButtonActionListener(this,"EliminarToolBarContenedor"));
								
		this.jInternalFrameDetalleFormContenedor.jMenuItemEliminarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarContenedor"));		
		
		
		
		this.jInternalFrameDetalleFormContenedor.jButtonCancelarContenedor.addActionListener (new ButtonActionListener(this,"CancelarContenedor"));
		
		
		this.jInternalFrameDetalleFormContenedor.jButtonCancelarToolBarContenedor.addActionListener (new ButtonActionListener(this,"CancelarToolBarContenedor"));
					
		this.jInternalFrameDetalleFormContenedor.jMenuItemCancelarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarContenedor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormContenedor.jMenuItemDetalleCerrarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarContenedor"));		
		
		
		
		this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosToolBarContenedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContenedor"));
		
		
		
		this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosToolBarContenedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContenedor"));
		
		
		
		this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioContenedor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonidContenedorBusqueda.addActionListener(new ButtonActionListener(this,"idContenedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContenedor.jButtonid_empresaContenedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaContenedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonid_empresaContenedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaContenedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContenedor.jButtonid_sucursalContenedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalContenedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonid_sucursalContenedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalContenedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContenedor.jButtonid_pedidoContenedorUpdate.addActionListener(new ButtonActionListener(this,"id_pedidoContenedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonid_pedidoContenedorBusqueda.addActionListener(new ButtonActionListener(this,"id_pedidoContenedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonnumeroContenedorBusqueda.addActionListener(new ButtonActionListener(this,"numeroContenedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonnumero_blContenedorBusqueda.addActionListener(new ButtonActionListener(this,"numero_blContenedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtondescripcionContenedorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionContenedorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormContenedor.jTabbedPaneRelacionesContenedor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesContenedor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameContenedor"));
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarContenedor"));
		}
		
		this.jTableDatosContenedor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarContenedor"));
		
		this.jTableDatosContenedor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarContenedor"));
		
		this.jButtonNuevoContenedor.addActionListener(new ButtonActionListener(this,"NuevoContenedor"));
		
		this.jButtonDuplicarContenedor.addActionListener(new ButtonActionListener(this,"DuplicarContenedor"));
		
		this.jButtonCopiarContenedor.addActionListener(new ButtonActionListener(this,"CopiarContenedor"));
		
		this.jButtonVerFormContenedor.addActionListener(new ButtonActionListener(this,"VerFormContenedor"));
		
		
		this.jButtonNuevoToolBarContenedor.addActionListener(new ButtonActionListener(this,"NuevoToolBarContenedor"));
			
		this.jButtonDuplicarToolBarContenedor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarContenedor"));
			
		this.jMenuItemNuevoContenedor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoContenedor"));
			
		this.jMenuItemDuplicarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarContenedor"));		
		
		
		this.jButtonNuevoRelacionesContenedor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesContenedor"));
		
		
		this.jButtonNuevoRelacionesToolBarContenedor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarContenedor"));
			
		this.jMenuItemNuevoRelacionesContenedor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesContenedor"));		
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jButtonModificarContenedor.addActionListener(new ButtonActionListener(this,"ModificarContenedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jButtonModificarToolBarContenedor.addActionListener(new ButtonActionListener(this,"ModificarToolBarContenedor"));
			
			this.jInternalFrameDetalleFormContenedor.jMenuItemModificarContenedor.addActionListener(new ButtonActionListener(this,"MenuItemModificarContenedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormContenedor.jButtonActualizarContenedor.addActionListener (new ButtonActionListener(this,"ActualizarContenedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jButtonActualizarToolBarContenedor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarContenedor"));
				
			this.jInternalFrameDetalleFormContenedor.jMenuItemActualizarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarContenedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jButtonEliminarContenedor.addActionListener (new ButtonActionListener(this,"EliminarContenedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jButtonEliminarToolBarContenedor.addActionListener (new ButtonActionListener(this,"EliminarToolBarContenedor"));
						
			this.jInternalFrameDetalleFormContenedor.jMenuItemEliminarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarContenedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jButtonCancelarContenedor.addActionListener (new ButtonActionListener(this,"CancelarContenedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jButtonCancelarToolBarContenedor.addActionListener (new ButtonActionListener(this,"CancelarToolBarContenedor"));
			
			this.jInternalFrameDetalleFormContenedor.jMenuItemCancelarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarContenedor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarContenedor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarContenedor"));		
		
		
		this.jButtonCerrarContenedor.addActionListener (new ButtonActionListener(this,"CerrarContenedor"));
		
		
		this.jButtonCerrarToolBarContenedor.addActionListener (new ButtonActionListener(this,"CerrarToolBarContenedor"));
			
		this.jMenuItemCerrarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarContenedor"));
			
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jMenuItemDetalleCerrarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarContenedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosContenedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosContenedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosToolBarContenedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContenedor"));
		}
		
		this.jButtonCopiarToolBarContenedor.addActionListener (new ButtonActionListener(this,"CopiarToolBarContenedor"));
			
		this.jButtonVerFormToolBarContenedor.addActionListener (new ButtonActionListener(this,"VerFormToolBarContenedor"));
		
		this.jMenuItemGuardarCambiosContenedor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosContenedor"));
			
		this.jMenuItemCopiarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarContenedor"));		
		
		this.jMenuItemVerFormContenedor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormContenedor"));		
		
		
		this.jButtonGuardarCambiosTablaContenedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaContenedor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarContenedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarContenedor"));
			
		this.jMenuItemGuardarCambiosTablaContenedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaContenedor"));		
		
		
		
		this.jButtonRecargarInformacionContenedor.addActionListener (new ButtonActionListener(this,"RecargarInformacionContenedor"));
					
		this.jButtonRecargarInformacionToolBarContenedor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarContenedor"));
		
		this.jMenuItemRecargarInformacionContenedor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionContenedor"));		
		
		
		
		this.jButtonAnterioresContenedor.addActionListener (new ButtonActionListener(this,"AnterioresContenedor"));
		
		
		this.jButtonAnterioresToolBarContenedor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarContenedor"));
		
		this.jMenuItemAnterioresContenedor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresContenedor"));		
		
		
		this.jButtonSiguientesContenedor.addActionListener (new ButtonActionListener(this,"SiguientesContenedor"));
		
		
		this.jButtonSiguientesToolBarContenedor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarContenedor"));
			
		this.jMenuItemSiguientesContenedor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesContenedor"));
			
		this.jMenuItemAbrirOrderByContenedor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByContenedor"));
			
		this.jMenuItemMostrarOcultarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarContenedor"));
			
		this.jMenuItemDetalleAbrirOrderByContenedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByContenedor"));
			
		this.jMenuItemDetalleMostarOcultarContenedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarContenedor"));		
		
		
		this.jButtonNuevoGuardarCambiosContenedor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosContenedor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarContenedor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarContenedor"));
			
		this.jMenuItemNuevoGuardarCambiosContenedor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosContenedor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosContenedor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosContenedor"));

		this.jCheckBoxSeleccionadosContenedor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosContenedor"));
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioContenedor"));
		}
		
		
		this.jComboBoxTiposRelacionesContenedor.addActionListener (new ButtonActionListener(this,"TiposRelacionesContenedor"));
			
		this.jComboBoxTiposAccionesContenedor.addActionListener (new ButtonActionListener(this,"TiposAccionesContenedor"));
					
		this.jComboBoxTiposSeleccionarContenedor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarContenedor"));
			
		this.jTextFieldValorCampoGeneralContenedor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralContenedor"));		
		
		
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonidContenedorBusqueda.addActionListener(new ButtonActionListener(this,"idContenedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContenedor.jButtonid_empresaContenedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaContenedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonid_empresaContenedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaContenedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContenedor.jButtonid_sucursalContenedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalContenedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonid_sucursalContenedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalContenedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContenedor.jButtonid_pedidoContenedorUpdate.addActionListener(new ButtonActionListener(this,"id_pedidoContenedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonid_pedidoContenedorBusqueda.addActionListener(new ButtonActionListener(this,"id_pedidoContenedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonnumeroContenedorBusqueda.addActionListener(new ButtonActionListener(this,"numeroContenedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonnumero_blContenedorBusqueda.addActionListener(new ButtonActionListener(this,"numero_blContenedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtondescripcionContenedorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionContenedorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPedidoContenedor.addActionListener(new ButtonActionListener(this,"FK_IdPedidoContenedor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoContenedor!=null) {
				this.jInternalFrameReporteDinamicoContenedor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContenedor"));
				this.jInternalFrameReporteDinamicoContenedor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContenedor"));
				this.jInternalFrameReporteDinamicoContenedor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContenedor"));
			}
			
			//this.jButtonCerrarReporteDinamicoContenedor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContenedor"));				
			//this.jButtonGenerarReporteDinamicoContenedor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContenedor"));
			//this.jButtonGenerarExcelReporteDinamicoContenedor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContenedor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionContenedor!=null) {
				this.jInternalFrameImportacionContenedor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionContenedor"));
				this.jInternalFrameImportacionContenedor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionContenedor"));
				this.jInternalFrameImportacionContenedor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionContenedor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByContenedor.addActionListener (new ButtonActionListener(this,"AbrirOrderByContenedor"));
			
			this.jButtonAbrirOrderByToolBarContenedor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarContenedor"));			
			
			if(this.jInternalFrameOrderByContenedor!=null) {
				this.jInternalFrameOrderByContenedor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByContenedor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormContenedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContenedor.jTabbedPaneRelacionesContenedor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesContenedor"));
		
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
            		closingInternalFrameContenedor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormContenedor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormContenedor = (JInternalFrameBase)event.getSource();
	            	
	            ContenedorBeanSwingJInternalFrame jInternalFrameParent=(ContenedorBeanSwingJInternalFrame)jInternalFrameDetalleFormContenedor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarContenedorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosContenedor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosContenedorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosContenedor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosContenedor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContenedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContenedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContenedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoContenedor";
		inputMap = this.jButtonNuevoContenedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoContenedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoContenedorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContenedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContenedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContenedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesContenedor";
		inputMap = this.jButtonNuevoRelacionesContenedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesContenedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoContenedorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarContenedor";
		inputMap = this.jButtonModificarContenedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarContenedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarContenedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarContenedor";
		inputMap = this.jButtonActualizarContenedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarContenedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarContenedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarContenedor";
		inputMap = this.jButtonEliminarContenedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarContenedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarContenedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarContenedor";
		inputMap = this.jButtonCancelarContenedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarContenedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarContenedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarContenedor";
		inputMap = this.jButtonCerrarContenedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarContenedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarContenedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosContenedor";
		inputMap = this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosContenedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormContenedor.jButtonGuardarCambiosContenedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosContenedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosContenedor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosContenedorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesContenedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesContenedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarContenedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarContenedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralContenedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralContenedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonidContenedorBusqueda.addActionListener(new ButtonActionListener(this,"idContenedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContenedor.jButtonid_empresaContenedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaContenedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonid_empresaContenedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaContenedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContenedor.jButtonid_sucursalContenedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalContenedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonid_sucursalContenedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalContenedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormContenedor.jButtonid_pedidoContenedorUpdate.addActionListener(new ButtonActionListener(this,"id_pedidoContenedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonid_pedidoContenedorBusqueda.addActionListener(new ButtonActionListener(this,"id_pedidoContenedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonnumeroContenedorBusqueda.addActionListener(new ButtonActionListener(this,"numeroContenedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtonnumero_blContenedorBusqueda.addActionListener(new ButtonActionListener(this,"numero_blContenedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContenedor.jButtondescripcionContenedorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionContenedorBusqueda"));
		
		
		this.jButtonFK_IdPedidoContenedor.addActionListener(new ButtonActionListener(this,"FK_IdPedidoContenedor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionContenedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionContenedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarContenedorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarContenedor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosContenedor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Contenedor contenedorAux:this.contenedorLogic.getContenedors()) {
					contenedorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Contenedor contenedorAux:contenedors) {
					contenedorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosContenedorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingContenedor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Contenedor contenedorAux:this.contenedorLogic.getContenedors()) {
						contenedorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Contenedor contenedorAux:contenedors) {
						contenedorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Contenedor contenedorAux:this.contenedorLogic.getContenedors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Contenedor contenedorAux:contenedors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaContenedor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosContenedor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosContenedor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosContenedor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosContenedorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingContenedor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosContenedor.getSelectedRows();
			
			Contenedor contenedorLocal=new Contenedor();
			
			//this.seleccionarTodosContenedor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contenedorLocal =(Contenedor) this.contenedorLogic.getContenedors().toArray()[this.jTableDatosContenedor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					contenedorLocal =(Contenedor) this.contenedors.toArray()[this.jTableDatosContenedor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				contenedorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Contenedor contenedorAux:this.contenedorLogic.getContenedors()) {
						contenedorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Contenedor contenedorAux:contenedors) {
						contenedorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaContenedor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosContenedor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosContenedor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosContenedor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualContenedorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarContenedorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralContenedorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingContenedor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralContenedor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Contenedor contenedorAux:this.contenedorLogic.getContenedors()) {
				
						if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							contenedorAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_NUMEROBL)) {
							existe=true;
							contenedorAux.setnumero_bl(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							contenedorAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Contenedor contenedorAux:contenedors) {
					
						if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							contenedorAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_NUMEROBL)) {
							existe=true;
							contenedorAux.setnumero_bl(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							contenedorAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaContenedor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesContenedorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingContenedor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioContenedor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesContenedor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteContenedor) {				
					conSplash=true;//false;										
					
					//this.startProcessContenedor(conSplash);
				
					this.generarReporteContenedorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoContenedorsSeleccionados();
				//this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoContenedorsSeleccionados(false);
				//this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoContenedorsSeleccionados(true);
				//this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessContenedor();
				
				this.exportarContenedorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionContenedors();
				//this.importarContenedors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessContenedor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelContenedorsSeleccionados();
				//this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Contenedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessContenedor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoContenedor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyContenedor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Contenedor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.setSelectedIndex(0);					
				}	
			} 			
			else if(ContenedorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteContenedor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessContenedor(conSplash);
					
						//this.actualizarParametrosGeneralContenedor();
						
						this.generarReporteProcesoAccionContenedorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ContenedorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ContenedorES SELECCIONADOS?", "MANTENIMIENTO DE Contenedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessContenedor();
				
						this.actualizarParametrosGeneralContenedor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.contenedorReturnGeneral=contenedorLogic.procesarAccionContenedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.contenedorLogic.getContenedors(),this.contenedorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarContenedorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralContenedor();
					
					ContenedorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarContenedorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesContenedor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormContenedor.jComboBoxTiposAccionesFormularioContenedor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessContenedor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesContenedorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessContenedor();
			
			if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();		
			Contenedor contenedor=new Contenedor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingContenedor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesContenedor.getSelectedItem();
			
			
			
			
			contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(contenedorsSeleccionados.size()==1) {
				for(Contenedor contenedorAux:contenedorsSeleccionados) {
					contenedor=contenedorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessContenedor();
			
      		//this.finishProcessContenedor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarContenedorReturnGeneral() throws Exception {
		if(this.contenedorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.contenedorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.contenedorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.contenedorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.contenedorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.contenedorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingContenedor(false);
		}
		
		if(this.contenedorReturnGeneral.getConRetornoLista() || this.contenedorReturnGeneral.getConRetornoObjeto()) {
			if(this.contenedorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.contenedorLogic.setContenedors(this.contenedorReturnGeneral.getContenedors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.contenedorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.contenedorLogic.setContenedor(this.contenedorReturnGeneral.getContenedor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingContenedor(false);
		}
	}
	
	public void actualizarParametrosGeneralContenedor() throws Exception {
		
		
	}
	
	public ArrayList<Contenedor> getContenedorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioContenedor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Contenedor contenedorAux:contenedorLogic.getContenedors()) {
					if(contenedorAux.getIsSelected()) {
						contenedorsSeleccionados.add(contenedorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Contenedor contenedorAux:this.contenedors) {
					if(contenedorAux.getIsSelected()) {
						contenedorsSeleccionados.add(contenedorAux);				
					}
				}
			}
			
			if(contenedorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						contenedorsSeleccionados.addAll(this.contenedorLogic.getContenedors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						contenedorsSeleccionados.addAll(this.contenedors);				
					}
				}
			}
		} else {
			contenedorsSeleccionados.add(this.contenedor);
		}
		
		return contenedorsSeleccionados;
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
	
	public void generarReporteContenedorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalContenedorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoContenedorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoContenedorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoContenedorsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Contenedor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesContenedorsSeleccionados() throws Exception {
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();		
		
		contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteContenedors("Todos",contenedorsSeleccionados);
		
	}	
	
	public void generarReporteNormalContenedorsSeleccionados() throws Exception {
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();		
		
		contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteContenedors("Todos",contenedorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionContenedorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();
		
		contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteContenedors("Todos",contenedorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoContenedorsSeleccionados() throws Exception {
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoContenedor();
		
		
		contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoContenedor();
		
		
		//this.generarReporteContenedors("Todos",contenedorsSeleccionados ,contenedorImplementable,contenedorImplementableHome);
	}
	
	public void mostrarImportacionContenedors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionContenedor();
		
		this.abrirFrameImportacionContenedor();		
		
			
		//this.generarReporteContenedors("Todos",contenedorsSeleccionados ,contenedorImplementable,contenedorImplementableHome);
	}
	
	public void importarContenedors() throws Exception {		
	
	}
	
	public void exportarContenedorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelContenedorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoContenedorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlContenedorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Contenedor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoContenedorsSeleccionados() throws Exception {
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();		
		
		contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contenedor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarContenedor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Contenedor contenedorAux:contenedorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarContenedor(contenedorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//contenedorAux.setsDetalleGeneralEntityReporte(contenedorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contenedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarContenedor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ContenedorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContenedorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContenedorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContenedorConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContenedorConstantesFunciones.LABEL_IDPEDIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContenedorConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContenedorConstantesFunciones.LABEL_NUMEROBL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContenedorConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarContenedor(Contenedor contenedor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=contenedor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=contenedor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=contenedor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contenedor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contenedor.getpedido_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contenedor.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contenedor.getnumero_bl();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=contenedor.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelContenedorsSeleccionados() throws Exception {
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();		
		
		contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contenedor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Contenedors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelContenedor(row);				
				iRow++;
			}				
			
			for(Contenedor contenedorAux:contenedorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelContenedor(contenedorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contenedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlContenedorsSeleccionados() throws Exception {
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();		
		
		contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contenedor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("contenedors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("contenedor");
			//elementRoot.appendChild(element);
		
			for(Contenedor contenedorAux:contenedorsSeleccionados) {
				element = document.createElement("contenedor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlContenedor(contenedorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contenedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelContenedor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ContenedorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ContenedorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ContenedorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ContenedorConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ContenedorConstantesFunciones.LABEL_IDPEDIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(ContenedorConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(ContenedorConstantesFunciones.LABEL_NUMEROBL);
		cell = row.createCell(iColumn++);cell.setCellValue(ContenedorConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelContenedor(Contenedor contenedor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(contenedor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(contenedor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(contenedor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(contenedor.getpedido_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(contenedor.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(contenedor.getnumero_bl());
		cell = row.createCell(iColumn++);cell.setCellValue(contenedor.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlContenedor(Contenedor contenedor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ContenedorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(contenedor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ContenedorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(contenedor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ContenedorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(contenedor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ContenedorConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(contenedor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementpedido_descripcion = document.createElement(ContenedorConstantesFunciones.IDPEDIDO);
		elementpedido_descripcion.appendChild(document.createTextNode(contenedor.getpedido_descripcion()));
		element.appendChild(elementpedido_descripcion);

		Element elementnumero = document.createElement(ContenedorConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(contenedor.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementnumero_bl = document.createElement(ContenedorConstantesFunciones.NUMEROBL);
		elementnumero_bl.appendChild(document.createTextNode(contenedor.getnumero_bl().trim()));
		element.appendChild(elementnumero_bl);

		Element elementdescripcion = document.createElement(ContenedorConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(contenedor.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoContenedorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Contenedor> contenedorsSeleccionados=new ArrayList<Contenedor>();
		
		contenedorsSeleccionados=this.getContenedorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoContenedor(contenedorsSeleccionados);
		
		this.generarReporteContenedors("Todos",contenedorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoContenedor(ArrayList<Contenedor> contenedorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Contenedor contenedorAux:contenedorsSeleccionados) {
				contenedorAux.setsDetalleGeneralEntityReporte(contenedorAux.toString());
			
				if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					contenedorAux.setsDescripcionGeneralEntityReporte1(contenedorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					contenedorAux.setsDescripcionGeneralEntityReporte1(contenedorAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_IDPEDIDO)) {
					existe=true;
					contenedorAux.setsDescripcionGeneralEntityReporte1(contenedorAux.getpedido_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					contenedorAux.setsDescripcionGeneralEntityReporte1(contenedorAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_NUMEROBL)) {
					existe=true;
					contenedorAux.setsDescripcionGeneralEntityReporte1(contenedorAux.getnumero_bl());
				}
				 else if(sTipoSeleccionar.equals(ContenedorConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					contenedorAux.setsDescripcionGeneralEntityReporte1(contenedorAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContenedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesContenedor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoContenedor=true;
				this.isVisibilidadCeldaNuevoRelacionesContenedor=true;
				this.isVisibilidadCeldaGuardarCambiosContenedor=true;
			}
			
			this.isVisibilidadCeldaModificarContenedor=false;
			this.isVisibilidadCeldaActualizarContenedor=false;
			this.isVisibilidadCeldaEliminarContenedor=false;
			this.isVisibilidadCeldaCancelarContenedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContenedor=true;
				} else {
					this.isVisibilidadCeldaGuardarContenedor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoContenedor=false;
			this.isVisibilidadCeldaNuevoRelacionesContenedor=false;
			this.isVisibilidadCeldaGuardarCambiosContenedor=false;
			this.isVisibilidadCeldaModificarContenedor=false;
			this.isVisibilidadCeldaActualizarContenedor=true;
			this.isVisibilidadCeldaEliminarContenedor=false;
			this.isVisibilidadCeldaCancelarContenedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContenedor=true;
				} else {
					this.isVisibilidadCeldaGuardarContenedor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoContenedor=false;
			this.isVisibilidadCeldaNuevoRelacionesContenedor=false;
			this.isVisibilidadCeldaGuardarCambiosContenedor=false;
			this.isVisibilidadCeldaModificarContenedor=false;
			this.isVisibilidadCeldaActualizarContenedor=true;
			this.isVisibilidadCeldaEliminarContenedor=true;
			this.isVisibilidadCeldaCancelarContenedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContenedor=true;
				} else {
					this.isVisibilidadCeldaGuardarContenedor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoContenedor=false;
			this.isVisibilidadCeldaNuevoRelacionesContenedor=false;
			this.isVisibilidadCeldaGuardarCambiosContenedor=false;
			this.isVisibilidadCeldaModificarContenedor=false;
			this.isVisibilidadCeldaActualizarContenedor=true;
			this.isVisibilidadCeldaEliminarContenedor=false;
			this.isVisibilidadCeldaCancelarContenedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContenedor=false;
				} else {
					this.isVisibilidadCeldaGuardarContenedor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoContenedor=true;
			this.isVisibilidadCeldaNuevoRelacionesContenedor=true;
			this.isVisibilidadCeldaGuardarCambiosContenedor=true;
			this.isVisibilidadCeldaModificarContenedor=false;
			this.isVisibilidadCeldaActualizarContenedor=false;
			this.isVisibilidadCeldaEliminarContenedor=false;
			this.isVisibilidadCeldaCancelarContenedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContenedor=true;
				} else {
					this.isVisibilidadCeldaGuardarContenedor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoContenedor=false;
			this.isVisibilidadCeldaNuevoRelacionesContenedor=false;
			this.isVisibilidadCeldaGuardarCambiosContenedor=false;
			this.isVisibilidadCeldaActualizarContenedor=false;
			this.isVisibilidadCeldaEliminarContenedor=false;
			this.isVisibilidadCeldaCancelarContenedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContenedor=false;
				} else {
					this.isVisibilidadCeldaGuardarContenedor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoContenedor=false;
			this.isVisibilidadCeldaNuevoRelacionesContenedor=false;
			this.isVisibilidadCeldaGuardarCambiosContenedor=false;
			this.isVisibilidadCeldaModificarContenedor=true;
			this.isVisibilidadCeldaActualizarContenedor=false;
			this.isVisibilidadCeldaEliminarContenedor=false;
			this.isVisibilidadCeldaCancelarContenedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContenedor=false;
				} else {
					this.isVisibilidadCeldaGuardarContenedor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ContenedorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoContenedor=true;
			this.isVisibilidadCeldaNuevoRelacionesContenedor=true;
			this.isVisibilidadCeldaGuardarCambiosContenedor=true;
		} else {
			this.actualizarEstadoPanelsContenedor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarContenedor=false;
			//this.isVisibilidadCeldaVerFormContenedor=false;
			this.isVisibilidadCeldaDuplicarContenedor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!contenedorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesContenedor=false;
		} else {
			this.isVisibilidadCeldaNuevoContenedor=false;
			this.isVisibilidadCeldaGuardarCambiosContenedor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(contenedorSessionBean.getEsGuardarRelacionado()) {
			if(!contenedorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesContenedor=false;												
			}
			
			this.jButtonCerrarContenedor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesContenedor=false;
		}
		
		if(!this.permiteMantenimiento(this.contenedor)) {
			this.isVisibilidadCeldaActualizarContenedor=false;
			this.isVisibilidadCeldaEliminarContenedor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesContenedor() {
	}
	
	public void actualizarEstadoPanelsContenedor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionContenedor!=null) {
				this.jScrollPanelDatosEdicionContenedor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContenedor!=null) {
				this.jTabbedPaneBusquedasContenedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosContenedor!=null) {
				this.jScrollPanelDatosContenedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionContenedor!=null) {
				this.jPanelPaginacionContenedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContenedor!=null) {
				this.jPanelParametrosReportesContenedor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionContenedor!=null) {
				this.jScrollPanelDatosEdicionContenedor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContenedor!=null) {
				this.jTabbedPaneBusquedasContenedor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosContenedor!=null) {
				this.jScrollPanelDatosContenedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionContenedor!=null) {
				this.jPanelPaginacionContenedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContenedor!=null) {
				this.jPanelParametrosReportesContenedor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionContenedor!=null) {
				this.jScrollPanelDatosEdicionContenedor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContenedor!=null) {
				this.jTabbedPaneBusquedasContenedor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosContenedor!=null) {
				this.jScrollPanelDatosContenedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionContenedor!=null) {
				this.jPanelPaginacionContenedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContenedor!=null) {
				this.jPanelParametrosReportesContenedor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionContenedor!=null) {
				this.jScrollPanelDatosEdicionContenedor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContenedor!=null) {
				this.jTabbedPaneBusquedasContenedor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosContenedor!=null) {
				this.jScrollPanelDatosContenedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionContenedor!=null) {
				this.jPanelPaginacionContenedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContenedor!=null) {
				this.jPanelParametrosReportesContenedor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionContenedor!=null) {
				this.jScrollPanelDatosEdicionContenedor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContenedor!=null) {
				this.jTabbedPaneBusquedasContenedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosContenedor!=null) {
				this.jScrollPanelDatosContenedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionContenedor!=null) {
				this.jPanelPaginacionContenedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContenedor!=null) {
				this.jPanelParametrosReportesContenedor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionContenedor!=null) {
				this.jScrollPanelDatosEdicionContenedor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContenedor!=null) {
				this.jTabbedPaneBusquedasContenedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosContenedor!=null) {
				this.jScrollPanelDatosContenedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionContenedor!=null) {
				this.jPanelPaginacionContenedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContenedor!=null) {
				this.jPanelParametrosReportesContenedor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionContenedor!=null) {
				this.jScrollPanelDatosEdicionContenedor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContenedor!=null) {
				this.jTabbedPaneBusquedasContenedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosContenedor!=null) {
				this.jScrollPanelDatosContenedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionContenedor!=null) {
				this.jPanelPaginacionContenedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContenedor!=null) {
				this.jPanelParametrosReportesContenedor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.contenedorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasContenedor!=null) {
					this.jTabbedPaneBusquedasContenedor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesContenedor!=null) {
				this.jPanelParametrosReportesContenedor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.contenedorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasContenedor!=null) {
				this.jTabbedPaneBusquedasContenedor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesContenedor!=null) {
				this.jPanelParametrosReportesContenedor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdPedido=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPedido) {this.jTabbedPaneBusquedasContenedor.remove(jPanelFK_IdPedidoContenedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdPedido=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPedido) {this.jTabbedPaneBusquedasContenedor.remove(jPanelFK_IdPedidoContenedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaPedido(Boolean isParaPedido){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPedidoNegation=!isParaPedido;

			this.isVisibilidadFK_IdPedido=isParaPedido;
			if(!this.isVisibilidadFK_IdPedido) {this.jTabbedPaneBusquedasContenedor.remove(jPanelFK_IdPedidoContenedor);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ContenedorSessionBean contenedorSessionBean=new ContenedorSessionBean();
		
		if(this.contenedorSessionBean==null) {
			this.contenedorSessionBean=new ContenedorSessionBean();
		}
		
		this.contenedorSessionBean.setsUltimaBusquedaContenedor(this.getsAccionBusqueda());
		this.contenedorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.contenedorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			contenedorSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPedido")) {
			contenedorSessionBean.setid_pedido(this.getid_pedidoFK_IdPedido());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			contenedorSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ContenedorSessionBean contenedorSessionBean=new ContenedorSessionBean();
		
		if(this.contenedorSessionBean==null) {
			this.contenedorSessionBean=new ContenedorSessionBean();
		}
		
		if(this.contenedorSessionBean.getsUltimaBusquedaContenedor()!=null&&!this.contenedorSessionBean.getsUltimaBusquedaContenedor().equals("")) {
			this.setsAccionBusqueda(contenedorSessionBean.getsUltimaBusquedaContenedor());
			this.setiNumeroPaginacion(contenedorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(contenedorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(contenedorSessionBean.getid_empresa());
				contenedorSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPedido")) {
				this.setid_pedidoFK_IdPedido(contenedorSessionBean.getid_pedido());
				contenedorSessionBean.setid_pedido(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(contenedorSessionBean.getid_sucursal());
				contenedorSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.contenedorSessionBean.setsUltimaBusquedaContenedor("");
		this.contenedorSessionBean.setiNumeroPaginacion(ContenedorConstantesFunciones.INUMEROPAGINACION);
		this.contenedorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaContenedor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioContenedor() {
		this.updateBorderResaltarBusquedasFormularioContenedor();
		this.updateVisibilidadBusquedasFormularioContenedor();
		this.updateHabilitarBusquedasFormularioContenedor();
	}
	
	public void updateBorderResaltarBusquedasFormularioContenedor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasContenedor.getComponents().length>0) {
	

		if(this.contenedorConstantesFunciones.resaltarFK_IdPedidoContenedor!=null) {
			index= this.jTabbedPaneBusquedasContenedor.indexOfComponent(this.jPanelFK_IdPedidoContenedor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasContenedor.getComponent(index);
				jPanel.setBorder(this.contenedorConstantesFunciones.resaltarFK_IdPedidoContenedor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioContenedor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasContenedor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasContenedor.indexOfComponent(this.jPanelFK_IdPedidoContenedor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasContenedor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.contenedorConstantesFunciones.mostrarFK_IdPedidoContenedor);
			if(!this.contenedorConstantesFunciones.mostrarFK_IdPedidoContenedor && index>-1) {
				this.jTabbedPaneBusquedasContenedor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioContenedor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasContenedor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasContenedor.indexOfComponent(this.jPanelFK_IdPedidoContenedor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasContenedor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.contenedorConstantesFunciones.activarFK_IdPedidoContenedor);
				this.jTabbedPaneBusquedasContenedor.setEnabledAt(index,this.contenedorConstantesFunciones.activarFK_IdPedidoContenedor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaContenedor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPedido")) {
			index= this.jTabbedPaneBusquedasContenedor.indexOfComponent(this.jPanelFK_IdPedidoContenedor);

			this.jTabbedPaneBusquedasContenedor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasContenedor.getComponent(index);

			this.contenedorConstantesFunciones.setResaltarFK_IdPedidoContenedor(resaltar);

			jPanel.setBorder(this.contenedorConstantesFunciones.resaltarFK_IdPedidoContenedor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarContenedor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioContenedor() throws Exception {

		if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioContenedor();
		this.updateVisibilidadResaltarControlesFormularioContenedor();
		this.updateHabilitarResaltarControlesFormularioContenedor();
		
	}
	
	public void updateBorderResaltarControlesFormularioContenedor() throws Exception {
		if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.contenedorConstantesFunciones.resaltaridContenedor!=null && this.jInternalFrameDetalleFormContenedor!=null) {this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.setBorder(this.contenedorConstantesFunciones.resaltaridContenedor);}
		if(this.contenedorConstantesFunciones.resaltarid_empresaContenedor!=null && this.jInternalFrameDetalleFormContenedor!=null) {this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.setBorder(this.contenedorConstantesFunciones.resaltarid_empresaContenedor);}
		if(this.contenedorConstantesFunciones.resaltarid_sucursalContenedor!=null && this.jInternalFrameDetalleFormContenedor!=null) {this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.setBorder(this.contenedorConstantesFunciones.resaltarid_sucursalContenedor);}
		if(this.contenedorConstantesFunciones.resaltarid_pedidoContenedor!=null && this.jInternalFrameDetalleFormContenedor!=null) {this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.setBorder(this.contenedorConstantesFunciones.resaltarid_pedidoContenedor);}
		if(this.contenedorConstantesFunciones.resaltarnumeroContenedor!=null && this.jInternalFrameDetalleFormContenedor!=null) {this.jInternalFrameDetalleFormContenedor.jTextFieldnumeroContenedor.setBorder(this.contenedorConstantesFunciones.resaltarnumeroContenedor);}
		if(this.contenedorConstantesFunciones.resaltarnumero_blContenedor!=null && this.jInternalFrameDetalleFormContenedor!=null) {this.jInternalFrameDetalleFormContenedor.jTextFieldnumero_blContenedor.setBorder(this.contenedorConstantesFunciones.resaltarnumero_blContenedor);}
		if(this.contenedorConstantesFunciones.resaltardescripcionContenedor!=null && this.jInternalFrameDetalleFormContenedor!=null) {this.jInternalFrameDetalleFormContenedor.jTextAreadescripcionContenedor.setBorder(this.contenedorConstantesFunciones.resaltardescripcionContenedor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioContenedor() throws Exception {		
		if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormContenedor!=null) {
	
		//this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.setVisible(this.contenedorConstantesFunciones.mostraridContenedor);
		this.jInternalFrameDetalleFormContenedor.jPanelidContenedor.setVisible(this.contenedorConstantesFunciones.mostraridContenedor);
		//this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.setVisible(this.contenedorConstantesFunciones.mostrarid_empresaContenedor);
		this.jInternalFrameDetalleFormContenedor.jPanelid_empresaContenedor.setVisible(this.contenedorConstantesFunciones.mostrarid_empresaContenedor);
		//this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.setVisible(this.contenedorConstantesFunciones.mostrarid_sucursalContenedor);
		this.jInternalFrameDetalleFormContenedor.jPanelid_sucursalContenedor.setVisible(this.contenedorConstantesFunciones.mostrarid_sucursalContenedor);
		//this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.setVisible(this.contenedorConstantesFunciones.mostrarid_pedidoContenedor);
		this.jInternalFrameDetalleFormContenedor.jPanelid_pedidoContenedor.setVisible(this.contenedorConstantesFunciones.mostrarid_pedidoContenedor);
		//this.jInternalFrameDetalleFormContenedor.jTextFieldnumeroContenedor.setVisible(this.contenedorConstantesFunciones.mostrarnumeroContenedor);
		this.jInternalFrameDetalleFormContenedor.jPanelnumeroContenedor.setVisible(this.contenedorConstantesFunciones.mostrarnumeroContenedor);
		//this.jInternalFrameDetalleFormContenedor.jTextFieldnumero_blContenedor.setVisible(this.contenedorConstantesFunciones.mostrarnumero_blContenedor);
		this.jInternalFrameDetalleFormContenedor.jPanelnumero_blContenedor.setVisible(this.contenedorConstantesFunciones.mostrarnumero_blContenedor);
		//this.jInternalFrameDetalleFormContenedor.jTextAreadescripcionContenedor.setVisible(this.contenedorConstantesFunciones.mostrardescripcionContenedor);
		this.jInternalFrameDetalleFormContenedor.jPaneldescripcionContenedor.setVisible(this.contenedorConstantesFunciones.mostrardescripcionContenedor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioContenedor() throws Exception {
		if(this.jInternalFrameDetalleFormContenedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormContenedor!=null) {
	
		this.jInternalFrameDetalleFormContenedor.jLabelidContenedor.setEnabled(this.contenedorConstantesFunciones.activaridContenedor);
		this.jInternalFrameDetalleFormContenedor.jComboBoxid_empresaContenedor.setEnabled(this.contenedorConstantesFunciones.activarid_empresaContenedor);
		this.jInternalFrameDetalleFormContenedor.jComboBoxid_sucursalContenedor.setEnabled(this.contenedorConstantesFunciones.activarid_sucursalContenedor);
		this.jInternalFrameDetalleFormContenedor.jComboBoxid_pedidoContenedor.setEnabled(this.contenedorConstantesFunciones.activarid_pedidoContenedor);
		this.jInternalFrameDetalleFormContenedor.jTextFieldnumeroContenedor.setEnabled(this.contenedorConstantesFunciones.activarnumeroContenedor);
		this.jInternalFrameDetalleFormContenedor.jTextFieldnumero_blContenedor.setEnabled(this.contenedorConstantesFunciones.activarnumero_blContenedor);
		this.jInternalFrameDetalleFormContenedor.jTextAreadescripcionContenedor.setEnabled(this.contenedorConstantesFunciones.activardescripcionContenedor);
		}
	}
	
		
}