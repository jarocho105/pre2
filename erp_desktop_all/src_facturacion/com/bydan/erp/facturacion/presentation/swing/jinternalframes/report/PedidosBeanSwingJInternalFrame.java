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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.facturacion.util.PedidosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.PedidosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.PedidosParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.PedidosBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

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
public class PedidosBeanSwingJInternalFrame extends PedidosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PedidosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Pedidos> pedidosValidator = new ClassValidator<Pedidos>(Pedidos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Pedidos pedidos;	
	public Pedidos pedidosAux;
	public Pedidos pedidosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Pedidos pedidosTotales;
	public Long idPedidosActual;
	public Long iIdNuevoPedidos=0L;
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

	public String sFinalQueryComboEstadoPedido="";

	public List<EstadoPedido> estadopedidosForeignKey;

	public List<EstadoPedido> getestadopedidosForeignKey() {
		return estadopedidosForeignKey;
	}

	public void setestadopedidosForeignKey(List<EstadoPedido> estadopedidosForeignKey) {
		this.estadopedidosForeignKey = estadopedidosForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoPedido estadopedidoForeignKey;

	public EstadoPedido getestadopedidoForeignKey() {
		return estadopedidoForeignKey;
	}

	public void setestadopedidoForeignKey(EstadoPedido estadopedidoForeignKey) {
		this.estadopedidoForeignKey = estadopedidoForeignKey;
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
	
	public Boolean isPermisoTodoPedidos;
	public Boolean isPermisoNuevoPedidos;
	public Boolean isPermisoActualizarPedidos;
	public Boolean isPermisoActualizarOriginalPedidos;
	public Boolean isPermisoEliminarPedidos;
	public Boolean isPermisoGuardarCambiosPedidos;
	public Boolean isPermisoConsultaPedidos;
	public Boolean isPermisoBusquedaPedidos;
	public Boolean isPermisoReportePedidos;
	public Boolean isPermisoPaginacionMedioPedidos;
	public Boolean isPermisoPaginacionAltoPedidos;
	public Boolean isPermisoPaginacionTodoPedidos;
	public Boolean isPermisoCopiarPedidos;
	public Boolean isPermisoVerFormPedidos;
	public Boolean isPermisoDuplicarPedidos;
	public Boolean isPermisoOrdenPedidos;
	
	
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
	
	public PedidosParameterReturnGeneral pedidosReturnGeneral;
	public PedidosParameterReturnGeneral pedidosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPedidos=false;
	public Boolean esParaAccionDesdeFormularioPedidos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PedidosSessionBeanAdditional pedidosSessionBeanAdditional=null;
	
	public PedidosSessionBeanAdditional getPedidosSessionBeanAdditional() {
		return this.pedidosSessionBeanAdditional;
	}
	
	public void setPedidosSessionBeanAdditional(PedidosSessionBeanAdditional pedidosSessionBeanAdditional) {
		try {
			this.pedidosSessionBeanAdditional=pedidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PedidosBeanSwingJInternalFrameAdditional pedidosBeanSwingJInternalFrameAdditional=null;
	//public class PedidosBeanSwingJInternalFrame
	
	public PedidosBeanSwingJInternalFrameAdditional getPedidosBeanSwingJInternalFrameAdditional() {
		return this.pedidosBeanSwingJInternalFrameAdditional;
	}
	
	public void setPedidosBeanSwingJInternalFrameAdditional(PedidosBeanSwingJInternalFrameAdditional pedidosBeanSwingJInternalFrameAdditional) {
		try {
			this.pedidosBeanSwingJInternalFrameAdditional=pedidosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PedidosLogic pedidosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Pedidos pedidosBean;
	public PedidosConstantesFunciones pedidosConstantesFunciones;
	//public PedidosParameterReturnGeneral pedidosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EstadoPedidoLogic estadopedidoLogic;
	
	//PARAMETROS
	
	
	//public List<Pedidos> pedidoss;	
	//public List<Pedidos> pedidossEliminados;
	//public List<Pedidos> pedidossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPedidos=false;
	public Boolean isVisibilidadCeldaDuplicarPedidos=true;
	public Boolean isVisibilidadCeldaCopiarPedidos=true;
	public Boolean isVisibilidadCeldaVerFormPedidos=true;
	public Boolean isVisibilidadCeldaOrdenPedidos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPedidos=false;
	public Boolean isVisibilidadCeldaModificarPedidos=false;
	public Boolean isVisibilidadCeldaActualizarPedidos=false;
	public Boolean isVisibilidadCeldaEliminarPedidos=false;
	public Boolean isVisibilidadCeldaCancelarPedidos=false;
	public Boolean isVisibilidadCeldaGuardarPedidos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPedidos=false;	
	
	
	public Boolean isVisibilidadBusquedaPedidos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoPedido=false;
	
	public Long getiIdNuevoPedidos() {
		return this.iIdNuevoPedidos;
	}

	public void setiIdNuevoPedidos(Long iIdNuevoPedidos) {
		this.iIdNuevoPedidos = iIdNuevoPedidos;
	}
	
	public Long getidPedidosActual() {
		return this.idPedidosActual;
	}

	public void setidPedidosActual(Long idPedidosActual) {
		this.idPedidosActual = idPedidosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Pedidos getpedidos() {
		return this.pedidos;
	}

	public void setpedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
	
	public Pedidos getpedidosAux() {
		return this.pedidosAux;
	}

	public void setpedidosAux(Pedidos pedidosAux) {
		this.pedidosAux = pedidosAux;
	}				
	
	public Pedidos getpedidosAnterior() {
		return this.pedidosAnterior;
	}

	public void setpedidosAnterior(Pedidos pedidosAnterior) {
		this.pedidosAnterior = pedidosAnterior;
	}	
	
	public Pedidos getpedidosTotales() {
		return this.pedidosTotales;
	}

	public void setpedidosTotales(Pedidos pedidosTotales) {
		this.pedidosTotales = pedidosTotales;
	}	
	
	public Pedidos getpedidosBean() {
		return this.pedidosBean;
	}

	public void setpedidosBean(Pedidos pedidosBean) {
		this.pedidosBean = pedidosBean;
	}	
	
	public PedidosParameterReturnGeneral getpedidosReturnGeneral() {
		return this.pedidosReturnGeneral;
	}

	public void setpedidosReturnGeneral(PedidosParameterReturnGeneral pedidosReturnGeneral) {
		this.pedidosReturnGeneral = pedidosReturnGeneral;
	}	
	
	
	public Long id_estado_pedidoBusquedaPedidos=-1L;

	public Long getid_estado_pedidoBusquedaPedidos() {
		return this.id_estado_pedidoBusquedaPedidos;
	}

	public void setid_estado_pedidoBusquedaPedidos(Long id_estado_pedidoBusquedaPedidos) {
		this.id_estado_pedidoBusquedaPedidos = id_estado_pedidoBusquedaPedidos;
	}

;
	public Date fecha_emision_desdeBusquedaPedidos=new Date();

	public Date getfecha_emision_desdeBusquedaPedidos() {
		return this.fecha_emision_desdeBusquedaPedidos;
	}

	public void setfecha_emision_desdeBusquedaPedidos(Date fecha_emision_desdeBusquedaPedidos) {
		this.fecha_emision_desdeBusquedaPedidos = fecha_emision_desdeBusquedaPedidos;
	}

;
	public Date fecha_emision_hastaBusquedaPedidos=new Date();

	public Date getfecha_emision_hastaBusquedaPedidos() {
		return this.fecha_emision_hastaBusquedaPedidos;
	}

	public void setfecha_emision_hastaBusquedaPedidos(Date fecha_emision_hastaBusquedaPedidos) {
		this.fecha_emision_hastaBusquedaPedidos = fecha_emision_hastaBusquedaPedidos;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_pedidoFK_IdEstadoPedido=-1L;

	public Long getid_estado_pedidoFK_IdEstadoPedido() {
		return this.id_estado_pedidoFK_IdEstadoPedido;
	}

	public void setid_estado_pedidoFK_IdEstadoPedido(Long id_estado_pedidoFK_IdEstadoPedido) {
		this.id_estado_pedidoFK_IdEstadoPedido = id_estado_pedidoFK_IdEstadoPedido;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PedidosLogic getPedidosLogic()	{		
		return pedidosLogic;
	}

	public void setPedidosLogic(PedidosLogic pedidosLogic) {
		this.pedidosLogic = pedidosLogic;
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
	
	public Boolean getIsEsNuevoPedidos() {
		return isEsNuevoPedidos;
	}

	public void setIsEsNuevoPedidos(Boolean isEsNuevoPedidos) {
		this.isEsNuevoPedidos = isEsNuevoPedidos;
	}

	public Boolean getEsParaAccionDesdeFormularioPedidos() {
		return esParaAccionDesdeFormularioPedidos;
	}
	
	public void setEsParaAccionDesdeFormularioPedidos(Boolean esParaAccionDesdeFormularioPedidos) {
		this.esParaAccionDesdeFormularioPedidos = esParaAccionDesdeFormularioPedidos;
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

			if(this.pedidosSessionBean==null) {
				this.pedidosSessionBean=new PedidosSessionBean();
			}

			if(!this.pedidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(pedidosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEstadoPedidosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadopedidosForeignKey=new ArrayList<EstadoPedido>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoPedidoLogic estadopedidoLogic=new EstadoPedidoLogic();

			//estadopedidoLogic.getEstadoPedidoDataAccess().setIsForForeingKeyData(true);

			if(this.pedidosSessionBean==null) {
				this.pedidosSessionBean=new PedidosSessionBean();
			}

			if(!this.pedidosSessionBean.getisBusquedaDesdeForeignKeySesionEstadoPedido()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadopedidoLogic.getEstadoPedidoDataAccess().setIsForForeingKeyData(true);

					estadopedidoLogic.getTodosEstadoPedidosWithConnection(sFinalQuery,new Pagination());

					this.estadopedidosForeignKey=estadopedidoLogic.getEstadoPedidos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoPedido(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadopedidoLogic.getEntityWithConnection(pedidosSessionBean.getlidEstadoPedidoActual());
					this.estadopedidosForeignKey.add(estadopedidoLogic.getEstadoPedido());
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

					if(this.pedidos!=null) {
						this.pedidos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPedidos!=null) {
						this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPedidos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPedidos!=null) {
						if(this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPedidosGenerico)throws Exception
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
				jComboBoxid_empresaPedidosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPedidosGenerico!=null && jComboBoxid_empresaPedidosGenerico.getItemCount()>0) {
					jComboBoxid_empresaPedidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoPedidoForeignKey(Long idEstadoPedidoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoPedido  estadopedidoTemp=null;

			for(EstadoPedido estadopedidoAux:estadopedidosForeignKey) {
				if(estadopedidoAux.getId()!=null && estadopedidoAux.getId().equals(idEstadoPedidoSeleccionado)) {
					estadopedidoTemp=estadopedidoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadopedidoTemp!=null) {

					if(this.pedidos!=null) {
						this.pedidos.setEstadoPedido(estadopedidoTemp);
					}

					if(this.jInternalFrameDetalleFormPedidos!=null) {
						this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.setSelectedItem(estadopedidoTemp);
					}
				} else {
					//jComboBoxid_estado_pedidoPedidos.setSelectedItem(estadopedidoTemp);
					if(this.jInternalFrameDetalleFormPedidos!=null) {
						if(this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPedidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadopedidoTemp!=null && jComboBoxid_estado_pedidoBusquedaPedidosPedidos!=null) {
						jComboBoxid_estado_pedidoBusquedaPedidosPedidos.setSelectedItem(estadopedidoTemp);
					} else {
						if(jComboBoxid_estado_pedidoBusquedaPedidosPedidos!=null) {
							//jComboBoxid_estado_pedidoBusquedaPedidosPedidos.setSelectedItem(estadopedidoTemp);
							if(jComboBoxid_estado_pedidoBusquedaPedidosPedidos.getItemCount()>0) {
								jComboBoxid_estado_pedidoBusquedaPedidosPedidos.setSelectedIndex(0);
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

	public String getActualEstadoPedidoForeignKeyDescripcion(Long idEstadoPedidoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoPedido  estadopedidoTemp=null;

			for(EstadoPedido estadopedidoAux:estadopedidosForeignKey) {
				if(estadopedidoAux.getId()!=null && estadopedidoAux.getId().equals(idEstadoPedidoSeleccionado)) {
					estadopedidoTemp=estadopedidoAux;
					break;
				}
			}


			sDescripcion=EstadoPedidoConstantesFunciones.getEstadoPedidoDescripcion(estadopedidoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoPedidoForeignKeyGenerico(Long idEstadoPedidoSeleccionado,JComboBox jComboBoxid_estado_pedidoPedidosGenerico)throws Exception
	{
		try
		{
			EstadoPedido  estadopedidoTemp=null;

			for(EstadoPedido estadopedidoAux:estadopedidosForeignKey) {
				if(estadopedidoAux.getId()!=null && estadopedidoAux.getId().equals(idEstadoPedidoSeleccionado)) {
					estadopedidoTemp=estadopedidoAux;
					break;
				}
			}

			if(estadopedidoTemp!=null) {
				jComboBoxid_estado_pedidoPedidosGenerico.setSelectedItem(estadopedidoTemp);
			} else {
				if(jComboBoxid_estado_pedidoPedidosGenerico!=null && jComboBoxid_estado_pedidoPedidosGenerico.getItemCount()>0) {
					jComboBoxid_estado_pedidoPedidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Pedidos pedidos,JComboBox jComboBoxid_empresaPedidosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPedidosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPedidosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				pedidos.setid_empresa(empresaAux.getId());
				pedidos.setempresa_descripcion(PedidosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				pedidos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoPedidoForeignKey(Pedidos pedidos,JComboBox jComboBoxid_estado_pedidoPedidosGenerico)throws Exception
	{
		try
		{
			EstadoPedido  estadopedidoAux=new EstadoPedido();

			if(jComboBoxid_estado_pedidoPedidosGenerico==null) {
				estadopedidoAux=(EstadoPedido)this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.getSelectedItem();
			} else {
				estadopedidoAux=(EstadoPedido)jComboBoxid_estado_pedidoPedidosGenerico.getSelectedItem();
			}

			if(estadopedidoAux!=null && estadopedidoAux.getId()!=null) {
				pedidos.setid_estado_pedido(estadopedidoAux.getId());
				pedidos.setestadopedido_descripcion(PedidosConstantesFunciones.getEstadoPedidoDescripcion(estadopedidoAux));
				pedidos.setEstadoPedido(estadopedidoAux);			}
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

					if(!PedidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidos!=null) { 
							this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidos!=null) { 
					}

					if(!PedidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoPedidosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoPedido=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidos!=null) { 
							this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.removeAllItems();

							for(EstadoPedido estadopedido:this.estadopedidosForeignKey) {
								this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.addItem(estadopedido);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidos!=null) { 
					}

					if(!PedidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPedidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_pedidoBusquedaPedidosPedidos.removeAllItems();

							for(EstadoPedido estadopedido:this.estadopedidosForeignKey) {
								this.jComboBoxid_estado_pedidoBusquedaPedidosPedidos.addItem(estadopedido);
							}
						}

						if(!PedidosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPedidos!=null) {
							this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidos!=null) {
							this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstadoPedidoForeignKey(EstadoPedido estadopedido,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidos!=null) {
							this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.setSelectedItem(estadopedido);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidos!=null) {
							this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_pedidoBusquedaPedidosPedidos.setSelectedItem(estadopedido);
						} else {
							this.jComboBoxid_estado_pedidoBusquedaPedidosPedidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPedidos() throws Exception {
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
		
	public PedidosParameterReturnGeneral getPedidosParameterGeneral() {
		return this.pedidosParameterGeneral;
	}
	
	public void setPedidosParameterGeneral(PedidosParameterReturnGeneral pedidosParameterGeneral) {
		this.pedidosParameterGeneral = pedidosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPedidos() {
		return isPermisoTodoPedidos;
	}

	public void setIsPermisoTodoPedidos(Boolean isPermisoTodoPedidos) {
		this.isPermisoTodoPedidos = isPermisoTodoPedidos;
	}

	public Boolean getIsPermisoNuevoPedidos() {
		return isPermisoNuevoPedidos;
	}

	public void setIsPermisoNuevoPedidos(Boolean isPermisoNuevoPedidos) {
		this.isPermisoNuevoPedidos = isPermisoNuevoPedidos;
	}

	public Boolean getIsPermisoActualizarPedidos() {
		return isPermisoActualizarPedidos;
	}

	public void setIsPermisoActualizarPedidos(Boolean isPermisoActualizarPedidos) {
		this.isPermisoActualizarPedidos = isPermisoActualizarPedidos;
	}

	public Boolean getIsPermisoEliminarPedidos() {
		return isPermisoEliminarPedidos;
	}

	public void setIsPermisoEliminarPedidos(Boolean isPermisoEliminarPedidos) {
		this.isPermisoEliminarPedidos = isPermisoEliminarPedidos;
	}

	public Boolean getIsPermisoGuardarCambiosPedidos() {
		return isPermisoGuardarCambiosPedidos;
	}

	public void setIsPermisoGuardarCambiosPedidos(Boolean isPermisoGuardarCambiosPedidos) {
		this.isPermisoGuardarCambiosPedidos = isPermisoGuardarCambiosPedidos;
	}
	
	public Boolean getIsPermisoConsultaPedidos() {
		return isPermisoConsultaPedidos;
	}

	public void setIsPermisoConsultaPedidos(Boolean isPermisoConsultaPedidos) {
		this.isPermisoConsultaPedidos = isPermisoConsultaPedidos;
	}

	public Boolean getIsPermisoBusquedaPedidos() {
		return isPermisoBusquedaPedidos;
	}

	public void setIsPermisoBusquedaPedidos(Boolean isPermisoBusquedaPedidos) {
		this.isPermisoBusquedaPedidos = isPermisoBusquedaPedidos;
	}

	public Boolean getIsPermisoReportePedidos() {
		return isPermisoReportePedidos;
	}

	public void setIsPermisoReportePedidos(Boolean isPermisoReportePedidos) {
		this.isPermisoReportePedidos = isPermisoReportePedidos;
	}
	
	public Boolean getIsPermisoPaginacionMedioPedidos() {
		return isPermisoPaginacionMedioPedidos;
	}

	public void setIsPermisoPaginacionMedioPedidos(Boolean isPermisoPaginacionMedioPedidos) {
		this.isPermisoPaginacionMedioPedidos = isPermisoPaginacionMedioPedidos;
	}
	
	public Boolean getIsPermisoPaginacionTodoPedidos() {
		return isPermisoPaginacionTodoPedidos;
	}

	public void setIsPermisoPaginacionTodoPedidos(Boolean isPermisoPaginacionTodoPedidos) {
		this.isPermisoPaginacionTodoPedidos = isPermisoPaginacionTodoPedidos;
	}
	
	public Boolean getIsPermisoPaginacionAltoPedidos() {
		return isPermisoPaginacionAltoPedidos;
	}

	public void setIsPermisoPaginacionAltoPedidos(Boolean isPermisoPaginacionAltoPedidos) {
		this.isPermisoPaginacionAltoPedidos = isPermisoPaginacionAltoPedidos;
	}
	
	public Boolean getIsPermisoCopiarPedidos() {
		return isPermisoCopiarPedidos;
	}

	public void setIsPermisoCopiarPedidos(Boolean isPermisoCopiarPedidos) {
		this.isPermisoCopiarPedidos = isPermisoCopiarPedidos;
	}
	
	public Boolean getIsPermisoVerFormPedidos() {
		return isPermisoVerFormPedidos;
	}

	public void setIsPermisoVerFormPedidos(Boolean isPermisoVerFormPedidos) {
		this.isPermisoVerFormPedidos = isPermisoVerFormPedidos;
	}
	
	public Boolean getIsPermisoDuplicarPedidos() {
		return isPermisoDuplicarPedidos;
	}

	public void setIsPermisoDuplicarPedidos(Boolean isPermisoDuplicarPedidos) {
		this.isPermisoDuplicarPedidos = isPermisoDuplicarPedidos;
	}
	
	public Boolean getIsPermisoOrdenPedidos() {
		return isPermisoOrdenPedidos;
	}

	public void setIsPermisoOrdenPedidos(Boolean isPermisoOrdenPedidos) {
		this.isPermisoOrdenPedidos = isPermisoOrdenPedidos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPedidos() {
		return isVisibilidadCeldaNuevoPedidos;
	}

	public void setIsVisibilidadCeldaNuevoPedidos(Boolean isVisibilidadCeldaNuevoPedidos) {
		this.isVisibilidadCeldaNuevoPedidos = isVisibilidadCeldaNuevoPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPedidos() {
		return isVisibilidadCeldaDuplicarPedidos;
	}

	public void setIsVisibilidadCeldaDuplicarPedidos(Boolean isVisibilidadCeldaDuplicarPedidos) {
		this.isVisibilidadCeldaDuplicarPedidos = isVisibilidadCeldaDuplicarPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPedidos() {
		return isVisibilidadCeldaCopiarPedidos;
	}

	public void setIsVisibilidadCeldaCopiarPedidos(Boolean isVisibilidadCeldaCopiarPedidos) {
		this.isVisibilidadCeldaCopiarPedidos = isVisibilidadCeldaCopiarPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPedidos() {
		return isVisibilidadCeldaVerFormPedidos;
	}

	public void setIsVisibilidadCeldaVerFormPedidos(Boolean isVisibilidadCeldaVerFormPedidos) {
		this.isVisibilidadCeldaVerFormPedidos = isVisibilidadCeldaVerFormPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPedidos() {
		return isVisibilidadCeldaOrdenPedidos;
	}

	public void setIsVisibilidadCeldaOrdenPedidos(Boolean isVisibilidadCeldaOrdenPedidos) {
		this.isVisibilidadCeldaOrdenPedidos = isVisibilidadCeldaOrdenPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPedidos() {
		return isVisibilidadCeldaNuevoRelacionesPedidos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPedidos(Boolean isVisibilidadCeldaNuevoRelacionesPedidos) {
		this.isVisibilidadCeldaNuevoRelacionesPedidos = isVisibilidadCeldaNuevoRelacionesPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPedidos() {
		return isVisibilidadCeldaModificarPedidos;
	}

	public void setIsVisibilidadCeldaModificarPedidos(Boolean isVisibilidadCeldaModificarPedidos) {
		this.isVisibilidadCeldaModificarPedidos = isVisibilidadCeldaModificarPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPedidos() {
		return isVisibilidadCeldaActualizarPedidos;
	}

	public void setIsVisibilidadCeldaActualizarPedidos(Boolean isVisibilidadCeldaActualizarPedidos) {
		this.isVisibilidadCeldaActualizarPedidos = isVisibilidadCeldaActualizarPedidos;
	}

	public Boolean getIsVisibilidadCeldaEliminarPedidos() {
		return isVisibilidadCeldaEliminarPedidos;
	}

	public void setIsVisibilidadCeldaEliminarPedidos(Boolean isVisibilidadCeldaEliminarPedidos) {
		this.isVisibilidadCeldaEliminarPedidos = isVisibilidadCeldaEliminarPedidos;
	}

	public Boolean getIsVisibilidadCeldaCancelarPedidos() {
		return isVisibilidadCeldaCancelarPedidos;
	}

	public void setIsVisibilidadCeldaCancelarPedidos(Boolean isVisibilidadCeldaCancelarPedidos) {
		this.isVisibilidadCeldaCancelarPedidos = isVisibilidadCeldaCancelarPedidos;
	}

	public Boolean getIsVisibilidadCeldaGuardarPedidos() {
		return isVisibilidadCeldaGuardarPedidos;
	}

	public void setIsVisibilidadCeldaGuardarPedidos(Boolean isVisibilidadCeldaGuardarPedidos) {
		this.isVisibilidadCeldaGuardarPedidos = isVisibilidadCeldaGuardarPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPedidos() {
		return isVisibilidadCeldaGuardarCambiosPedidos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPedidos(Boolean isVisibilidadCeldaGuardarCambiosPedidos) {
		this.isVisibilidadCeldaGuardarCambiosPedidos = isVisibilidadCeldaGuardarCambiosPedidos;
	}
		
	public PedidosSessionBean getpedidosSessionBean() {
		return this.pedidosSessionBean;
	}
	
	public void setpedidosSessionBean(PedidosSessionBean pedidosSessionBean) {
		this.pedidosSessionBean=pedidosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPedidos() {
		return this.isVisibilidadBusquedaPedidos;
	}

	public void setisVisibilidadBusquedaPedidos(Boolean isVisibilidadBusquedaPedidos) {
		this.isVisibilidadBusquedaPedidos=isVisibilidadBusquedaPedidos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoPedido() {
		return this.isVisibilidadFK_IdEstadoPedido;
	}

	public void setisVisibilidadFK_IdEstadoPedido(Boolean isVisibilidadFK_IdEstadoPedido) {
		this.isVisibilidadFK_IdEstadoPedido=isVisibilidadFK_IdEstadoPedido;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPedidos(Pedidos pedidos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(pedidos,null);
				this.setActualParaGuardarEstadoPedidoForeignKey(pedidos,null);
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
	
	public void bugActualizarReferenciaActual(Pedidos pedidos,Pedidos pedidosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPedidos(pedidos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		pedidosAux.setId(pedidos.getId());
		pedidosAux.setVersionRow(pedidos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(Pedidos pedidosLocal) throws Exception {
		
		if(this.pedidosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Pedidos pedidosLocal) throws Exception {	
		if(this.pedidosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				pedidosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoPedidoDetalleFormJInternalFrame.class)) {
				EstadoPedidoBeanSwingJInternalFrame estadopedidoBeanSwingJInternalFrameLocal=(EstadoPedidoBeanSwingJInternalFrame) ((EstadoPedidoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadopedidoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoPedido(estadopedidoBeanSwingJInternalFrameLocal.getestadopedido(),true);
				estadopedidoBeanSwingJInternalFrameLocal.actualizarLista(estadopedidoBeanSwingJInternalFrameLocal.estadopedido,this.estadopedidosForeignKey);

				estadopedidoBeanSwingJInternalFrameLocal.actualizarRelaciones(estadopedidoBeanSwingJInternalFrameLocal.estadopedido);

				pedidosLocal.setEstadoPedido(estadopedidoBeanSwingJInternalFrameLocal.estadopedido);

				this.addItemDefectoCombosForeignKeyEstadoPedido();
				this.cargarCombosFrameEstadoPedidosForeignKey("Formulario");
				this.setActualEstadoPedidoForeignKey(estadopedidoBeanSwingJInternalFrameLocal.estadopedido.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPedidosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = pedidosValidator.getInvalidValues(this.pedidos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Pedidos pedidos,List<Pedidos> pedidoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(Pedidos pedidos,List<Pedidos> pedidoss) throws Exception {
		try	{			
			PedidosConstantesFunciones.actualizarSelectedLista(pedidos,pedidoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Pedidos> pedidossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				pedidossLocal=this.pedidosLogic.getPedidoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				pedidossLocal=this.pedidoss;
			}
			//ARCHITECTURE
		
			for(Pedidos pedidosLocal:pedidossLocal) {
				if(this.permiteMantenimiento(pedidosLocal) && pedidosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PedidosConstantesFunciones.getPedidosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PedidosConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelnombre_completo_clientePedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosConstantesFunciones.NOMBREMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelnombre_monedaPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelnombre_zonaPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelnumeroPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelivaPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosConstantesFunciones.DESCUENTOVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabeldescuento_valorPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosConstantesFunciones.OTRO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelotroPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabeltotalPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelfecha_vencimientoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelfecha_emisionPedidos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPedidos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidos.jLabelnombre_completo_clientePedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidos.jLabelnombre_monedaPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidos.jLabelnombre_zonaPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidos.jLabelnumeroPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidos.jLabelivaPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidos.jLabeldescuento_valorPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidos.jLabelotroPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidos.jLabeltotalPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidos.jLabelfecha_vencimientoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidos.jLabelfecha_emisionPedidos,"");
		
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
		this.iIdNuevoPedidos--;	
		
		
		this.pedidosAux=new Pedidos();
		
		this.pedidosAux.setId(this.iIdNuevoPedidos);
		this.pedidosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pedidosLogic.getPedidoss().add(this.pedidosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.pedidoss.add(this.pedidosAux);
		}
		//ARCHITECTURE
		
		this.pedidos=this.pedidosAux;
		
		if(PedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPedidos(this.pedidos);
			this.setVariablesObjetoActualToFormularioForeignKeyPedidos(this.pedidos);
		}
				
		//this.setDefaultControlesPedidos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPedidos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPedidos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPedidos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPedidos(this.pedidosBean,this.pedidos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPedidos(this.pedidosReturnGeneral,this.pedidosBean,false);
		
		if(this.pedidosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPedidos(this.pedidosReturnGeneral.getPedidos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPedidos(this.pedidosReturnGeneral.getPedidos());
		}
		
		if(this.pedidosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPedidos(this.pedidosReturnGeneral.getPedidos(),classes);//this.pedidosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPedidos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPedidos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PedidosBeanSwingJInternalFrameAdditional.RecargarFormPedidos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPedidos(false);
						
			if(pedidosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PedidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidos();
			}
			
			this.actualizarVisualTableDatosPedidos();
			
			this.jTableDatosPedidos.setRowSelectionInterval(this.getIndiceNuevoPedidos(), this.getIndiceNuevoPedidos());
			
			this.seleccionarFilaTablaPedidosActual();
						
			this.actualizarEstadoCeldasBotonesPedidos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPedidos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emision_desdePedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarfecha_emision_desdePedidos);
		this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emision_hastaPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarfecha_emision_hastaPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextAreanombre_completo_clientePedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarnombre_completo_clientePedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_monedaPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarnombre_monedaPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_zonaPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarnombre_zonaPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldnumeroPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarnumeroPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldivaPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarivaPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFielddescuento_valorPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activardescuento_valorPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldotroPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarotroPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldtotalPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activartotalPedidos);
		this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_vencimientoPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarfecha_vencimientoPedidos);
		this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emisionPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarfecha_emisionPedidos);	
		//
		this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarid_empresaPedidos);
		this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.setEnabled(isHabilitar && this.pedidosConstantesFunciones.activarid_estado_pedidoPedidos);
	};
	
	public void setDefaultControlesPedidos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPedidos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.pedidosSessionBean.setConGuardarRelaciones(true);			
			this.pedidosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPedidos.jTabbedPaneRelacionesPedidos.setVisible(true);
			
					
		} else {
			//this.pedidosSessionBean.setConGuardarRelaciones(false);			
			this.pedidosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPedidos.jTabbedPaneRelacionesPedidos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPedidos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Pedidos pedidosAux:this.pedidosLogic.getPedidoss()) {
				if(pedidosAux.getId().equals(this.iIdNuevoPedidos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Pedidos pedidosAux:this.pedidoss) {
				if(pedidosAux.getId().equals(this.iIdNuevoPedidos)) {
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
	
	public int getIndiceActualPedidos(Pedidos pedidos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Pedidos pedidosAux:this.pedidosLogic.getPedidoss()) {
				if(pedidosAux.getId().equals(pedidos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Pedidos pedidosAux:this.pedidoss) {
				if(pedidosAux.getId().equals(pedidos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPedidos(Pedidos pedidosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Pedidos pedidosAux:this.pedidosLogic.getPedidoss()) {
				if(pedidosAux.getPedidosOriginal().getId().equals(pedidosOriginal.getId())) {
					existe=true;
					pedidosOriginal.setId(pedidosAux.getId());
					pedidosOriginal.setVersionRow(pedidosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Pedidos pedidosAux:this.pedidoss) {
				if(pedidosAux.getPedidosOriginal().getId().equals(pedidosOriginal.getId())) {
					existe=true;
					pedidosOriginal.setId(pedidosAux.getId());
					pedidosOriginal.setVersionRow(pedidosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPedidos(Boolean esParaCancelar) throws Exception {
		pedidossAux=new ArrayList<Pedidos>();
		pedidosAux=new Pedidos();
		
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Pedidos pedidosAux:this.pedidosLogic.getPedidoss()) {
					if(pedidosAux.getId()<0) {
						pedidossAux.add(pedidosAux);
					}		
				}
				this.iIdNuevoPedidos=0L;
				this.pedidosLogic.getPedidoss().removeAll(pedidossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Pedidos pedidosAux:this.pedidoss) {
					if(pedidosAux.getId()<0) {
						pedidossAux.add(pedidosAux);
					}		
				}
				this.iIdNuevoPedidos=0L;
				this.pedidoss.removeAll(pedidossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPedidos 
					&& this.pedidosLogic.getPedidoss().size()>0
					) {
					pedidosAux=this.pedidosLogic.getPedidoss().get(this.pedidosLogic.getPedidoss().size() - 1);
				
					if(pedidosAux.getId()<0) {
						this.pedidosLogic.getPedidoss().remove(pedidosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPedidos && this.pedidoss.size()>0) {
					pedidosAux=this.pedidoss.get(this.pedidoss.size() - 1);
				
					if(pedidosAux.getId()<0) {
						this.pedidoss.remove(pedidosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPedidos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(pedidos.getId()<0) {
				this.pedidosLogic.getPedidoss().remove(this.pedidos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(pedidos.getId()<0) {
				this.pedidoss.remove(this.pedidos);
			}
		}			
	}
	
	public void setEstadosInicialesPedidos(List<Pedidos> pedidossAux) throws Exception {
		PedidosConstantesFunciones.setEstadosInicialesPedidos(pedidossAux);
	}
	
	public void setEstadosInicialesPedidos(Pedidos pedidosAux) throws Exception {
		PedidosConstantesFunciones.setEstadosInicialesPedidos(pedidosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPedidosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPedidosActual()) {
				if(!this.isEsNuevoPedidos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPedidos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPedidosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pedidos ?", "MANTENIMIENTO DE Pedidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Pedidos pedidos) throws Exception {
		PedidosConstantesFunciones.seleccionarAsignar(this.pedidos,pedidos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPedidos=this.isPermisoActualizarOriginalPedidos;
			
			
			this.seleccionarAsignar(pedidos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesPedidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.pedidosSessionBean.setsFuncionBusquedaRapida(this.pedidosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPedidos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPedidos(esParaCancelar);				
				this.cancelarNuevoPedidos(esParaCancelar);								
			}
			
			this.pedidos=new Pedidos();
			
			this.inicializarPedidos();
			
			this.actualizarEstadoCeldasBotonesPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPedidos() throws Exception {
		try {
			PedidosConstantesFunciones.inicializarPedidos(this.pedidos);
			
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
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.pedidosLogic.getPedidoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePedidoss(String sAccionBusqueda,List<Pedidos> pedidossParaReportes) throws Exception {
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
					sPathReporteFinal="Pedidos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PedidosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PedidosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Pedidos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Pedidoses");		
		parameters.put("busquedapor", PedidosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePedidos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PedidosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PedidosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePedidos=new JRBeanArrayDataSource(PedidosJInternalFrame.TraerPedidosBeans(pedidossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePedidos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PedidosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PedidosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PedidosBean.TraerPedidosBeans(pedidossParaReportes).toArray()));
							
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
				this.generarExcelReportePedidoss(sAccionBusqueda,sTipoArchivoReporte,pedidossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPedidoss(sAccionBusqueda,sTipoArchivoReporte,pedidossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPedidosActionPerformed(null);
					//this.generarExcelReportePedidoss(sAccionBusqueda,sTipoArchivoReporte,pedidossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPedidoss(sAccionBusqueda,sTipoArchivoReporte,pedidossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPedidoss(sAccionBusqueda,sTipoArchivoReporte,pedidossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPedidoss(sAccionBusqueda,sTipoArchivoReporte,pedidossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePedidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<Pedidos> pedidossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Pedidoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPedidos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Pedidos pedidos : pedidossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PedidosConstantesFunciones.generarExcelReporteDataPedidos("NORMAL",row,workbook,pedidos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPedidos(String sTipo,Row row,Workbook workbook) {
		
		PedidosConstantesFunciones.generarExcelReporteHeaderPedidos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPedidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<Pedidos> pedidossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Pedidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Pedidos pedidos : pedidossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PedidosConstantesFunciones.getPedidosDescripcion(pedidos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_IDESTADOPEDIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_IDESTADOPEDIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getestadopedido_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_NOMBREMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_NOMBREMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getnombre_moneda());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_DESCUENTOVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_DESCUENTOVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getdescuento_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_OTRO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_OTRO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getotro());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidos.getfecha_emision());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPedidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<Pedidos> pedidossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Pedidos> pedidossRespaldo=null;
		
		classes=PedidosConstantesFunciones.getClassesRelationshipsOfPedidos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.pedidosLogic.setDatosCliente(this.datosCliente);
		this.pedidosLogic.setDatosDeep(this.datosDeep);
		this.pedidosLogic.setIsConDeep(true);
		
		pedidossRespaldo=this.pedidosLogic.getPedidoss();
		
		this.pedidosLogic.setPedidoss(pedidossParaReportes);	
		this.pedidosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		pedidossParaReportes=this.pedidosLogic.getPedidoss();
		this.pedidosLogic.setPedidoss(pedidossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Pedidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPedidos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Pedidos pedidos : pedidossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPedidos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PedidosConstantesFunciones.generarExcelReporteDataPedidos("NORMAL",row,workbook,pedidos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PedidosConstantesFunciones.getPedidosDescripcion(pedidos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPedidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPedidos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPedidos() throws Exception {		
		this.startProcessPedidos(true);
	}
	
	public void startProcessPedidos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPedidos ,this.jPanelParametrosReportesPedidos, this.jScrollPanelDatosPedidos,this.jPanelPaginacionPedidos, this.jScrollPanelDatosEdicionPedidos, this.jPanelAccionesPedidos,this.jPanelAccionesFormularioPedidos,this.jmenuBarPedidos,this.jmenuBarDetallePedidos,this.jTtoolBarPedidos,this.jTtoolBarDetallePedidos);		
		
		final JTabbedPane jTabbedPaneBusquedasPedidos=this.jTabbedPaneBusquedasPedidos; 
		
		final JPanel jPanelParametrosReportesPedidos=this.jPanelParametrosReportesPedidos;
		//final JScrollPane jScrollPanelDatosPedidos=this.jScrollPanelDatosPedidos;
		final JTable jTableDatosPedidos=this.jTableDatosPedidos;		
		final JPanel jPanelPaginacionPedidos=this.jPanelPaginacionPedidos;
		//final JScrollPane jScrollPanelDatosEdicionPedidos=this.jScrollPanelDatosEdicionPedidos;
		final JPanel jPanelAccionesPedidos=this.jPanelAccionesPedidos;
		
		JPanel jPanelCamposAuxiliarPedidos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPedidos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPedidos!=null) {
			jPanelCamposAuxiliarPedidos=this.jInternalFrameDetalleFormPedidos.jPanelCamposPedidos;
			jPanelAccionesFormularioAuxiliarPedidos=this.jInternalFrameDetalleFormPedidos.jPanelAccionesFormularioPedidos;
		}
		
		final JPanel jPanelCamposPedidos=jPanelCamposAuxiliarPedidos;
		final JPanel jPanelAccionesFormularioPedidos=jPanelAccionesFormularioAuxiliarPedidos;
		
		
		final JMenuBar jmenuBarPedidos=this.jmenuBarPedidos;
		final JToolBar jTtoolBarPedidos=this.jTtoolBarPedidos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPedidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPedidos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) {
			jmenuBarDetalleAuxiliarPedidos=this.jInternalFrameDetalleFormPedidos.jmenuBarDetallePedidos;
			jTtoolBarDetalleAuxiliarPedidos=this.jInternalFrameDetalleFormPedidos.jTtoolBarDetallePedidos;
		}
		
		final JMenuBar jmenuBarDetallePedidos=jmenuBarDetalleAuxiliarPedidos;
		final JToolBar jTtoolBarDetallePedidos=jTtoolBarDetalleAuxiliarPedidos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPedidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPedidos;
			processRunnable.jTableDatos=jTableDatosPedidos;
			processRunnable.jPanelCampos=jPanelCamposPedidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionPedidos;
			processRunnable.jPanelAcciones=jPanelAccionesPedidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPedidos;
			
			
			processRunnable.jmenuBar=jmenuBarPedidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePedidos;
			processRunnable.jTtoolBar=jTtoolBarPedidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePedidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPedidos ,jPanelParametrosReportesPedidos,jTableDatosPedidos, /*jScrollPanelDatosPedidos,*/jPanelCamposPedidos,jPanelPaginacionPedidos, /*jScrollPanelDatosEdicionPedidos,*/ jPanelAccionesPedidos,jPanelAccionesFormularioPedidos,jmenuBarPedidos,jmenuBarDetallePedidos,jTtoolBarPedidos,jTtoolBarDetallePedidos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPedidos ,jPanelParametrosReportesPedidos, jScrollPanelDatosPedidos,jPanelPaginacionPedidos, jScrollPanelDatosEdicionPedidos, jPanelAccionesPedidos,jPanelAccionesFormularioPedidos,jmenuBarPedidos,jmenuBarDetallePedidos,jTtoolBarPedidos,jTtoolBarDetallePedidos);
						
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
	
	public void finishProcessPedidos() {// throws Exception 
		this.finishProcessPedidos(true);
	}
	
	public void finishProcessPedidos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPedidos ,this.jPanelParametrosReportesPedidos, this.jScrollPanelDatosPedidos,this.jPanelPaginacionPedidos, this.jScrollPanelDatosEdicionPedidos, this.jPanelAccionesPedidos,this.jPanelAccionesFormularioPedidos,this.jmenuBarPedidos,this.jmenuBarDetallePedidos,this.jTtoolBarPedidos,this.jTtoolBarDetallePedidos);		
		
		final JTabbedPane jTabbedPaneBusquedasPedidos=this.jTabbedPaneBusquedasPedidos; 
		
		final JPanel jPanelParametrosReportesPedidos=this.jPanelParametrosReportesPedidos;
		//final JScrollPane jScrollPanelDatosPedidos=this.jScrollPanelDatosPedidos;
		final JTable jTableDatosPedidos=this.jTableDatosPedidos;		
		final JPanel jPanelPaginacionPedidos=this.jPanelPaginacionPedidos;
		//final JScrollPane jScrollPanelDatosEdicionPedidos=this.jScrollPanelDatosEdicionPedidos;
		final JPanel jPanelAccionesPedidos=this.jPanelAccionesPedidos;
		
		JPanel jPanelCamposAuxiliarPedidos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPedidos=new JPanel();
		
		if(this.jInternalFrameDetalleFormPedidos!=null) {
			jPanelCamposAuxiliarPedidos=this.jInternalFrameDetalleFormPedidos.jPanelCamposPedidos;
			jPanelAccionesFormularioAuxiliarPedidos=this.jInternalFrameDetalleFormPedidos.jPanelAccionesFormularioPedidos;
		}
		
		final JPanel jPanelCamposPedidos=jPanelCamposAuxiliarPedidos;
		final JPanel jPanelAccionesFormularioPedidos=jPanelAccionesFormularioAuxiliarPedidos;
		
		
		final JMenuBar jmenuBarPedidos=this.jmenuBarPedidos;		
		final JToolBar jTtoolBarPedidos=this.jTtoolBarPedidos;
				
		JMenuBar jmenuBarDetalleAuxiliarPedidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPedidos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPedidos!=null) {
			jmenuBarDetalleAuxiliarPedidos=this.jInternalFrameDetalleFormPedidos.jmenuBarDetallePedidos;
			jTtoolBarDetalleAuxiliarPedidos=this.jInternalFrameDetalleFormPedidos.jTtoolBarDetallePedidos;		
		}
		
		final JMenuBar jmenuBarDetallePedidos=jmenuBarDetalleAuxiliarPedidos;
		final JToolBar jTtoolBarDetallePedidos=jTtoolBarDetalleAuxiliarPedidos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPedidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPedidos;
			processRunnable.jTableDatos=jTableDatosPedidos;
			processRunnable.jPanelCampos=jPanelCamposPedidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionPedidos;
			processRunnable.jPanelAcciones=jPanelAccionesPedidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPedidos;
			
			
			processRunnable.jmenuBar=jmenuBarPedidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePedidos;
			processRunnable.jTtoolBar=jTtoolBarPedidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePedidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPedidos ,jPanelParametrosReportesPedidos, jTableDatosPedidos,/*jScrollPanelDatosPedidos,*/jPanelCamposPedidos,jPanelPaginacionPedidos, /*jScrollPanelDatosEdicionPedidos,*/ jPanelAccionesPedidos,jPanelAccionesFormularioPedidos,jmenuBarPedidos,jmenuBarDetallePedidos,jTtoolBarPedidos,jTtoolBarDetallePedidos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPedidos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPedidos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPedidos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPedidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPedidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePedidos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPedidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPedidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePedidos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.pedidosConstantesFunciones.getsFinalQueryPedidos();
		String  finalQueryPaginacionTodos=this.pedidosConstantesFunciones.getsFinalQueryPedidos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PedidosConstantesFunciones.getArrayColumnasGlobalesNoPedidos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PedidosConstantesFunciones.getArrayColumnasGlobalesPedidos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PedidosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.pedidossEliminados= new ArrayList<Pedidos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPedidos();
		
				///*PedidosSessionBean*/this.pedidosSessionBean=new PedidosSessionBean();
			
			if(this.pedidosSessionBean==null) {
				this.pedidosSessionBean=new PedidosSessionBean();
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
					this.iNumeroPaginacion=PedidosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PedidosConstantesFunciones.getClassesForeignKeysOfPedidos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/pedidos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			pedidossAux= new ArrayList<Pedidos>();
			
				
			pedidosLogic.setDatosCliente(this.datosCliente);
			pedidosLogic.setDatosDeep(this.datosDeep);
			pedidosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPedidos")) {
				this.sDetalleReporte=PedidosConstantesFunciones.getDetalleIndiceBusquedaPedidos(id_estado_pedidoBusquedaPedidos,fecha_emision_desdeBusquedaPedidos,fecha_emision_hastaBusquedaPedidos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidosLogic.getPedidossBusquedaPedidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_estado_pedidoBusquedaPedidos,fecha_emision_desdeBusquedaPedidos,fecha_emision_hastaBusquedaPedidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidosConstantesFunciones.getDetalleIndiceBusquedaPedidos(id_estado_pedidoBusquedaPedidos,fecha_emision_desdeBusquedaPedidos,fecha_emision_hastaBusquedaPedidos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidosConstantesFunciones.getDetalleIndiceBusquedaPedidos(id_estado_pedidoBusquedaPedidos,fecha_emision_desdeBusquedaPedidos,fecha_emision_hastaBusquedaPedidos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidosLogic.getPedidoss()==null||pedidosLogic.getPedidoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoss==null|| pedidoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidossAux=new ArrayList<Pedidos>();
						pedidossAux.addAll(pedidosLogic.getPedidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidossAux=new ArrayList<Pedidos>();
							pedidossAux.addAll(pedidoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidosLogic.getPedidossBusquedaPedidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_estado_pedidoBusquedaPedidos,fecha_emision_desdeBusquedaPedidos,fecha_emision_hastaBusquedaPedidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidosConstantesFunciones.getDetalleIndiceBusquedaPedidos(id_estado_pedidoBusquedaPedidos,fecha_emision_desdeBusquedaPedidos,fecha_emision_hastaBusquedaPedidos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidosConstantesFunciones.getDetalleIndiceBusquedaPedidos(id_estado_pedidoBusquedaPedidos,fecha_emision_desdeBusquedaPedidos,fecha_emision_hastaBusquedaPedidos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoss("BusquedaPedidos",pedidosLogic.getPedidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoss("BusquedaPedidos",pedidoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidosLogic.setPedidoss(new ArrayList<Pedidos>());
						pedidosLogic.getPedidoss().addAll(pedidossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoss=new ArrayList<Pedidos>();
							pedidoss.addAll(pedidossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPedidos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPedidos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pedidosLogic.getPedidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pedidosLogic.getPedidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Pedidos pedidos) {
		Boolean permite=true;
		
		if(this.pedidos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PedidosConstantesFunciones.getOrderByListaPedidos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PedidosConstantesFunciones.getOrderByListaPedidos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Pedidos pedidos:pedidosLogic.getPedidoss()) {
				if(pedidos.getsType().equals(Constantes2.S_TOTALES)) {
					pedidosTotales=pedidos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Pedidos pedidos:this.pedidoss) {
				if(pedidos.getsType().equals(Constantes2.S_TOTALES)) {
					pedidosTotales=pedidos;
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
			this.pedidosAux=new Pedidos();
			this.pedidosAux.setsType(Constantes2.S_TOTALES);
			this.pedidosAux.setIsNew(false);
			this.pedidosAux.setIsChanged(false);
			this.pedidosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//PedidosConstantesFunciones.TotalizarValoresFilaPedidos(this.pedidosLogic.getPedidoss(),this.pedidosAux);
				
				//this.pedidosLogic.getPedidoss().add(this.pedidosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PedidosConstantesFunciones.TotalizarValoresFilaPedidos(this.pedidoss,this.pedidosAux);
				
				this.pedidoss.add(this.pedidosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		pedidosTotales=new Pedidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pedidosLogic.getPedidoss().remove(pedidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pedidoss.remove(pedidosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		pedidosTotales=new Pedidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Pedidos pedidos:pedidosLogic.getPedidoss()) {
				if(pedidos.getsType().equals(Constantes2.S_TOTALES)) {
					pedidosTotales=pedidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PedidosConstantesFunciones.TotalizarValoresFilaPedidos(this.pedidosLogic.getPedidoss(),pedidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Pedidos pedidos:this.pedidoss) {
				if(pedidos.getsType().equals(Constantes2.S_TOTALES)) {
					pedidosTotales=pedidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PedidosConstantesFunciones.TotalizarValoresFilaPedidos(this.pedidoss,pedidosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPedidossBusquedaPedidos()throws Exception {
		try {
			sAccionBusqueda="BusquedaPedidos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidossFK_IdEstadoPedido()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoPedido";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPedidossBusquedaPedidos(String sFinalQuery,Long id_estado_pedido,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidosLogic.getPedidossBusquedaPedidos(sFinalQuery,this.pagination,id_estado_pedido,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidosLogic.getPedidossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidossFK_IdEstadoPedido(String sFinalQuery,Long id_estado_pedido)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidosLogic.getPedidossFK_IdEstadoPedido(sFinalQuery,this.pagination,id_estado_pedido);
				
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
	
	public void inicializarPermisosPedidos() {
		this.isPermisoTodoPedidos=false;
		this.isPermisoNuevoPedidos=false;
		this.isPermisoActualizarPedidos=false;
		this.isPermisoActualizarOriginalPedidos=false;
		this.isPermisoEliminarPedidos=false;
		this.isPermisoGuardarCambiosPedidos=false;
		this.isPermisoConsultaPedidos=true;
		this.isPermisoBusquedaPedidos=true;
		this.isPermisoReportePedidos=true;
		this.isPermisoOrdenPedidos=false;		
		this.isPermisoPaginacionMedioPedidos=false;		
		this.isPermisoPaginacionAltoPedidos=false;		
		this.isPermisoPaginacionTodoPedidos=false;		
		this.isPermisoCopiarPedidos=false;		
		this.isPermisoVerFormPedidos=false;		
		this.isPermisoDuplicarPedidos=false;
		this.isPermisoOrdenPedidos=false;
	}
	
	public void setPermisosUsuarioPedidos(Boolean isPermiso) {
		this.isPermisoTodoPedidos=isPermiso;
		this.isPermisoNuevoPedidos=isPermiso;
		this.isPermisoActualizarPedidos=isPermiso;
		this.isPermisoActualizarOriginalPedidos=isPermiso;
		this.isPermisoEliminarPedidos=isPermiso;
		this.isPermisoGuardarCambiosPedidos=isPermiso;
		this.isPermisoConsultaPedidos=isPermiso;
		this.isPermisoBusquedaPedidos=isPermiso;
		this.isPermisoReportePedidos=isPermiso;
		this.isPermisoOrdenPedidos=isPermiso;		
		this.isPermisoPaginacionMedioPedidos=isPermiso;		
		this.isPermisoPaginacionAltoPedidos=isPermiso;		
		this.isPermisoPaginacionTodoPedidos=isPermiso;		
		this.isPermisoCopiarPedidos=isPermiso;		
		this.isPermisoVerFormPedidos=isPermiso;		
		this.isPermisoDuplicarPedidos=isPermiso;
		this.isPermisoOrdenPedidos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPedidos(Boolean isPermiso) {
		//this.isPermisoTodoPedidos=isPermiso;
		this.isPermisoNuevoPedidos=isPermiso;
		this.isPermisoActualizarPedidos=isPermiso;
		this.isPermisoActualizarOriginalPedidos=isPermiso;
		this.isPermisoEliminarPedidos=isPermiso;
		this.isPermisoGuardarCambiosPedidos=isPermiso;
		//this.isPermisoConsultaPedidos=isPermiso;
		//this.isPermisoBusquedaPedidos=isPermiso;
		//this.isPermisoReportePedidos=isPermiso;
		//this.isPermisoOrdenPedidos=isPermiso;		
		//this.isPermisoPaginacionMedioPedidos=isPermiso;		
		//this.isPermisoPaginacionAltoPedidos=isPermiso;		
		//this.isPermisoPaginacionTodoPedidos=isPermiso;		
		//this.isPermisoCopiarPedidos=isPermiso;		
		//this.isPermisoDuplicarPedidos=isPermiso;
		//this.isPermisoOrdenPedidos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPedidosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PedidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPedidos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPedidosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPedidosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPedidosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPedidosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPedidos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PedidosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.pedidosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PedidosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPedidos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPedidos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPedidos=this.isPermisoActualizarPedidos;
			this.isPermisoEliminarPedidos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPedidos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPedidos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPedidos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPedidos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePedidos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPedidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPedidos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPedidos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPedidos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPedidos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPedidos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPedidos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPedidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.pedidosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPedidos.setToolTipText(this.jTableDatosPedidos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPedidos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPedidos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PedidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PedidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPedidos() throws Exception {
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
	public void inicializarCombosForeignKeyPedidosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.estadopedidosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPedidosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PedidosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoPedidoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEstadoPedidoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadopedidosForeignKey==null||this.estadopedidosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoPedidoConstantesFunciones.getArrayColumnasGlobalesEstadoPedido(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoPedidoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoPedidoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoPedidosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyPedidos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEstadoPedido();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.pedidosSessionBean==null) {
				this.pedidosSessionBean=new PedidosSessionBean();
			}

			if(!this.pedidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEstadoPedido()throws Exception {
		try {

			if(!this.pedidosSessionBean.getisBusquedaDesdeForeignKeySesionEstadoPedido()) {
				EstadoPedido estadopedido=new EstadoPedido();
				EstadoPedidoConstantesFunciones.setEstadoPedidoDescripcion(estadopedido,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadopedido.setId(null);

				if(!EstadoPedidoConstantesFunciones.ExisteEnLista(this.estadopedidosForeignKey,estadopedido,true)) {

					this.estadopedidosForeignKey.add(0,estadopedido);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPedidos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPedidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPedidos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPedidos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPedidos(Pedidos pedidos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPedidos(Pedidos pedidos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPedidos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPedidos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPedidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPedidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPedidos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPedidos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEstadoPedidosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPedidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoPedidosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPedidos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos!=null && this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos!=null && this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public PedidosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PedidosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PedidosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.pedidosSessionBean=new PedidosSessionBean(); 
		this.pedidosConstantesFunciones=new PedidosConstantesFunciones(); 
		this.pedidosBean=new Pedidos();//(this.pedidosConstantesFunciones); 		
		this.pedidosReturnGeneral=new PedidosParameterReturnGeneral(); 
		
		this.pedidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PedidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PedidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PedidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPedidos(true);
			
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
			
			this.pedidosConstantesFunciones=new PedidosConstantesFunciones(); 
			this.pedidosBean=new Pedidos();//this.pedidosConstantesFunciones); 			
			this.pedidosReturnGeneral=new PedidosParameterReturnGeneral(); 
		
			PedidosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedidos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.pedidos=new Pedidos();
			this.pedidoss = new ArrayList<Pedidos>();
			this.pedidossAux = new ArrayList<Pedidos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic=new PedidosLogic();
				this.pedidosLogic.getNewConnexionToDeep("");
			}
			
			//this.pedidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.pedidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPedidos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPedidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPedidos);	
					}
					
					if(this.jInternalFrameImportacionPedidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPedidos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPedidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPedidos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPedidos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPedidos);
				this.jInternalFrameDetalleFormPedidos.setVisible(false);
				this.jInternalFrameDetalleFormPedidos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPedidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPedidos);
					this.jInternalFrameReporteDinamicoPedidos.setVisible(false);
					this.jInternalFrameReporteDinamicoPedidos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPedidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPedidos);
					this.jInternalFrameImportacionPedidos.setVisible(false);
					this.jInternalFrameImportacionPedidos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPedidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPedidos);
					this.jInternalFrameOrderByPedidos.setVisible(false);
					this.jInternalFrameOrderByPedidos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPedidosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PedidosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.pedidosReturnGeneral=new PedidosParameterReturnGeneral();
			
			this.pedidosParameterGeneral=new PedidosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.pedidosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PedidosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.pedidosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PedidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pedidosSessionBean.getEsGuardarRelacionado(),this.pedidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PedidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pedidosSessionBean.getEsGuardarRelacionado(),this.pedidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPedidos=false;
			this.isVisibilidadCeldaDuplicarPedidos=true;
			this.isVisibilidadCeldaCopiarPedidos=true;
			this.isVisibilidadCeldaVerFormPedidos=true;
			this.isVisibilidadCeldaOrdenPedidos=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidos=false;
			this.isVisibilidadCeldaModificarPedidos=false;
			this.isVisibilidadCeldaActualizarPedidos=false;
			this.isVisibilidadCeldaEliminarPedidos=false;
			this.isVisibilidadCeldaCancelarPedidos=false;
			this.isVisibilidadCeldaGuardarPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosPedidos=false;
			
			
			this.isVisibilidadBusquedaPedidos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoPedido=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPedidos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPedidos(false);
			
			this.setPermisosUsuarioPedidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidosSessionBean.getEsGuardarRelacionado() 
				|| (this.pedidosSessionBean.getEsGuardarRelacionado() && this.pedidosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPedidosClasesRelacionadas();
			}
			
			if(this.pedidosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPedidosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PedidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPedidos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPedidos();
			}
			
			if(!this.isPermisoBusquedaPedidos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPedidos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PedidosConstantesFunciones.getTiposSeleccionarPedidos());
				
				this.tiposColumnasSelect=PedidosConstantesFunciones.getTiposSeleccionarPedidos(true);
				
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
			//if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPedidos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioPedidos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioPedidos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidos() ;
			
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
			this.estadopedidoLogic=new EstadoPedidoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				pedidosImplementable= (PedidosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PedidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				pedidosImplementableHome= (PedidosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PedidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.pedidoss= new ArrayList<Pedidos>();
			this.pedidossEliminados= new ArrayList<Pedidos>();
						
			this.isEsNuevoPedidos=false;
			this.esParaAccionDesdeFormularioPedidos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.estadopedidosForeignKey=new ArrayList<EstadoPedido>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPedidos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPedidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PedidosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PedidosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPedidos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPedidos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPedidos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPedidos();
			}
			
			PedidosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPedidos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPedidos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPedidos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPedidos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Pedidos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPedidos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPedidos")) {
				iIndex=this.jInternalFrameDetalleFormPedidos.jTabbedPaneRelacionesPedidos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPedidos.jTabbedPaneRelacionesPedidos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPedidos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPedidos();	
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
	
	public void cargarCombosForeignKeyPedidos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPedidos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPedidos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPedidosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPedidos();
		
		this.cargarCombosFrameForeignKeyPedidos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPedidos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPedidos();
		}
	}
	
	

	public void cargarCombosForeignKeyEstadoPedido(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoPedidoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoPedido();
				this.cargarCombosFrameEstadoPedidosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoPedido(this.estadopedidosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPedidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.pedidosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
			
			if(jTableDatosPedidos.getRowCount()>=1) {
				jTableDatosPedidos.removeRowSelectionInterval(0, jTableDatosPedidos.getRowCount()-1);						
			}
			
			this.isEsNuevoPedidos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPedidos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPedidos(true);			
			//this.pedidos=new Pedidos();
			//this.pedidos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidos() ;
			
			if(PedidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.pedidos);	
			this.actualizarInformacion("INFO_PADRE",false,this.pedidos);				
			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
			if(this.pedidosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Pedidos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPedidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPedidos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPedidos.getSelectedRows().length;			
			}
			
			pedidossSeleccionados=this.getPedidossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPedidos--;			
				//Pedidos pedidosAux= new Pedidos();			
				//pedidosAux.setId(this.iIdNuevoPedidos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Pedidos pedidosOrigen=new Pedidos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Pedidos pedidosOrigen : pedidossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							pedidosOrigen =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidosOrigen =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPedidos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.pedidos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPedidos(pedidosOrigen,this.pedidos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pedidosLogic.getPedidoss().add(this.pedidosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pedidoss.add(this.pedidosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPedidos(false);
				
				this.jTableDatosPedidos.setRowSelectionInterval(this.getIndiceNuevoPedidos(), this.getIndiceNuevoPedidos());
				
				int iLastRow =  this.jTableDatosPedidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPedidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPedidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();									
		
			Pedidos pedidosOrigen=new Pedidos();
			Pedidos pedidosDestino=new Pedidos();
				
			pedidossSeleccionados=this.getPedidossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPedidos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || pedidossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPedidos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidosOrigen =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pedidosOrigen =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidosDestino =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pedidosDestino =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				pedidosOrigen =pedidossSeleccionados.get(0);
				pedidosDestino =pedidossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPedidos(pedidosOrigen,pedidosDestino,true,false);
				
				pedidosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(pedidosDestino,pedidosLogic.getPedidoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pedidosDestino,pedidoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPedidos(false);
				
				//this.jTableDatosPedidos.setRowSelectionInterval(this.getIndiceNuevoPedidos(), this.getIndiceNuevoPedidos());
				
				int iLastRow =  this.jTableDatosPedidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPedidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPedidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPedidos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPedidos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPedidos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPedidos.setVisible(!isVisible);
			this.jPanelPaginacionPedidos.setVisible(!isVisible);
			this.jPanelAccionesPedidos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePedidos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPedidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPedidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPedidos();
			
			this.abrirFrameOrderByPedidos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPedidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePedidos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPedidos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPedidos.isMaximum()) {
					this.jInternalFrameDetalleFormPedidos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPedidos.setSize(this.jInternalFrameDetalleFormPedidos.iWidthFormulario,this.jInternalFrameDetalleFormPedidos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPedidos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPedidos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPedidos.isMaximum()) {
						this.jInternalFrameDetalleFormPedidos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPedidos.jContentPaneDetallePedidos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPedidos.jTabbedPaneRelacionesPedidos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPedidos.jContentPaneDetallePedidos.getWidth(),PedidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPedidos.jTabbedPaneRelacionesPedidos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPedidos.jContentPaneDetallePedidos.getWidth(),PedidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPedidos.jTabbedPaneRelacionesPedidos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPedidos.jContentPaneDetallePedidos.getWidth(),PedidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPedidos.setVisible(true);
	        this.jInternalFrameDetalleFormPedidos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPedidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPedidos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPedidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidos,false,this);
				} else {
					this.jInternalFrameOrderByPedidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPedidos);
				this.jInternalFrameOrderByPedidos.setVisible(false);
				this.jInternalFrameOrderByPedidos.setSelected(false);
				
				this.jInternalFrameOrderByPedidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPedidos"));
				
				this.inicializarActualizarBindingTablaOrderByPedidos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPedidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPedidos==null) {
				
				this.jInternalFrameImportacionPedidos=new ImportacionJInternalFrame(PedidosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPedidos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPedidos);
				this.jInternalFrameImportacionPedidos.setVisible(false);
				this.jInternalFrameImportacionPedidos.setSelected(false);


				this.jInternalFrameImportacionPedidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPedidos"));
				this.jInternalFrameImportacionPedidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPedidos"));
				this.jInternalFrameImportacionPedidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPedidos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPedidos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPedidos==null) {
				this.jInternalFrameReporteDinamicoPedidos=new ReporteDinamicoJInternalFrame(PedidosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPedidos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPedidos);
				this.jInternalFrameReporteDinamicoPedidos.setVisible(false);
				this.jInternalFrameReporteDinamicoPedidos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPedidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidos"));
				this.jInternalFrameReporteDinamicoPedidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidos"));
				this.jInternalFrameReporteDinamicoPedidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePedidos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPedidos);
			
	       	this.jInternalFrameDetalleFormPedidos.setVisible(false);
	        this.jInternalFrameDetalleFormPedidos.setSelected(false);
			
			//this.jInternalFrameDetalleFormPedidos.dispose();
			//this.jInternalFrameDetalleFormPedidos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPedidos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPedidos.setVisible(true);
	        this.jInternalFrameReporteDinamicoPedidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPedidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPedidos.setVisible(true);
	        this.jInternalFrameImportacionPedidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPedidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPedidos.setVisible(true);
	        this.jInternalFrameOrderByPedidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPedidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPedidos.setVisible(false);
	        this.jInternalFrameOrderByPedidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPedidos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPedidos.setVisible(false);
	        this.jInternalFrameReporteDinamicoPedidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPedidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPedidos.setVisible(false);
	        this.jInternalFrameImportacionPedidos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPedidos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPedidos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPedidos(true);
			//this.isEsNuevoPedidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPedidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidos(false) ;
			
			if(pedidosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PedidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPedidosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPedidos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPedidos(true);
			//this.isEsNuevoPedidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.pedidos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPedidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPedidos(false) ;
			
			if(PedidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEstadoPedido(List<EstadoPedido> estadopedidosForeignKey)throws Exception{
		TableColumn tableColumnEstadoPedido=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_IDESTADOPEDIDO));
		TableCellEditor tableCellEditorEstadoPedido =tableColumnEstadoPedido.getCellEditor();

		EstadoPedidoTableCell estadopedidoTableCellFk=(EstadoPedidoTableCell)tableCellEditorEstadoPedido;

		if(estadopedidoTableCellFk!=null) {
			estadopedidoTableCellFk.setestadopedidosForeignKey(estadopedidosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadopedidoTableCellFk.setRowActual(intSelectedRow);
			//estadopedidoTableCellFk.setestadopedidosForeignKeyActual(estadopedidosForeignKey);
		//}


		if(estadopedidoTableCellFk!=null) {
			estadopedidoTableCellFk.RecargarEstadoPedidosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPedidos(false);
			
			//if(!this.isEsNuevoPedidos) {								
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				
			}
			
			if(this.permiteMantenimiento(this.pedidos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.pedidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPedidos=true;
					this.inicializarActualizarBindingTablaPedidos(false);
					this.isEsNuevoPedidos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPedidos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPedidos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPedidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidos(false);
				
				this.habilitarDeshabilitarControlesPedidos(false);
			
												
				
				if(PedidosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePedidos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPedidosActionPerformed(evt,pedidosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPedidos(this.pedidos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPedidos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,pedidosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.pedidos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				this.pedidos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				this.pedidos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.pedidos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.pedidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PedidosModel) this.jTableDatosPedidos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPedidos=true;
				this.inicializarActualizarBindingTablaPedidos(false);
				this.isEsNuevoPedidos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPedidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidos(false);
				
				this.habilitarDeshabilitarControlesPedidos(false);
				
				
				
				if(PedidosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePedidos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPedidosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPedidos.getRowCount()>=1) {
				jTableDatosPedidos.removeRowSelectionInterval(0, jTableDatosPedidos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPedidos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPedidos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidos(false) ;
			
			this.isEsNuevoPedidos=false;
			
			if(PedidosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePedidos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPedidos(false);
				
				//SI ES MANUAL
				if(PedidosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPedidos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPedidos--;			
			//Pedidos pedidosAux= new Pedidos();			
			//pedidosAux.setId(this.iIdNuevoPedidos);
			
			if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPedidos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
			
			this.pedidos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.pedidosLogic.getPedidoss().add(this.pedidosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.pedidoss.add(this.pedidosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPedidos(false);
			
			this.jTableDatosPedidos.setRowSelectionInterval(this.getIndiceNuevoPedidos(), this.getIndiceNuevoPedidos());
			
			int iLastRow =  this.jTableDatosPedidos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPedidos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPedidos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPedidos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPedidos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidos(false);
			
			//SI ES MANUAL
			if(PedidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidos();
			}
			
			//this.abrirFrameTreePedidos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPedidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPedidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPedidos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPedidos.setFileImportacion(this.jInternalFrameImportacionPedidos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPedidos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPedidos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPedidos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPedidos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();		

		pedidossSeleccionados=this.getPedidossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PedidosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PedidosBaseDesign.jrxml";
			
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
			
			this.generarReportePedidoss("Todos",pedidossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPedidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosConstantesFunciones.LABEL_NOMBREMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreMoneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreMoneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreMoneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreMoneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosConstantesFunciones.LABEL_DESCUENTOVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuentoValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuentoValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuentoValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuentoValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosConstantesFunciones.LABEL_OTRO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPedidos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPedidos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case PedidosConstantesFunciones.LABEL_NOMBREMONEDA:
					sNombreCampoCategoria="nombre_moneda";
					break;

				case PedidosConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case PedidosConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case PedidosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case PedidosConstantesFunciones.LABEL_DESCUENTOVALOR:
					sNombreCampoCategoria="descuento_valor";
					break;

				case PedidosConstantesFunciones.LABEL_OTRO:
					sNombreCampoCategoria="otro";
					break;

				case PedidosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case PedidosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPedidos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case PedidosConstantesFunciones.LABEL_NOMBREMONEDA:
					sNombreCampoCategoriaValor="nombre_moneda";
					break;

				case PedidosConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case PedidosConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case PedidosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case PedidosConstantesFunciones.LABEL_DESCUENTOVALOR:
					sNombreCampoCategoriaValor="descuento_valor";
					break;

				case PedidosConstantesFunciones.LABEL_OTRO:
					sNombreCampoCategoriaValor="otro";
					break;

				case PedidosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case PedidosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPedidos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case PedidosConstantesFunciones.LABEL_NOMBREMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_moneda");
					break;

				case PedidosConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case PedidosConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case PedidosConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case PedidosConstantesFunciones.LABEL_DESCUENTOVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento_valor");
					break;

				case PedidosConstantesFunciones.LABEL_OTRO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Otro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"otro");
					break;

				case PedidosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case PedidosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
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
	
	public void jButtonGenerarExcelReporteDinamicoPedidosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();		
		
		pedidossSeleccionados=this.getPedidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Pedidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPedidos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PedidosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_IDESTADOPEDIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_IDESTADOPEDIDO);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getestadopedido_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_NOMBREMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_NOMBREMONEDA);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getnombre_moneda());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_IVA);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_DESCUENTOVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_DESCUENTOVALOR);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getdescuento_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_OTRO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_OTRO);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getotro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(Pedidos pedidos:pedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidos.getfecha_emision());
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
			//	this.getFilaCabeceraExportarExcelPedidos(row);				
			//	iRow++;
			//}				
			
			//for(Pedidos pedidosAux:pedidossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPedidos(pedidosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos",JOptionPane.INFORMATION_MESSAGE);
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
				this.pedidosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidos(false);
			
			//SI ES MANUAL
			if(PedidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidos(false);
			
			//SI ES MANUAL
			if(PedidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPedidos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidos(false);
			
			//SI ES MANUAL
			if(PedidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPedidos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPedidos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPedidos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPedidos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPedidos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPedidos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPedidos.setMinimumSize(dimensionMinimum);
		this.jTableDatosPedidos.setMaximumSize(dimensionMaximum);
		this.jTableDatosPedidos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPedidos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPedidos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPedidos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPedidos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPedidos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPedidos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPedidos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PedidosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PedidosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPedidos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPedidos();
		
		this.inicializarActualizarBindingBotonesManualPedidos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPedidos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPedidos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPedidos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPedidos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPedidos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePedidos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPedidos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPedidos.jCheckBoxPostAccionNuevoPedidos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPedidos.jCheckBoxPostAccionSinCerrarPedidos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPedidos.jCheckBoxPostAccionSinMensajePedidos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPedidos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPedidos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePedidos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPedidos!=null) {
				this.jInternalFrameDetalleFormPedidos.jCheckBoxPostAccionNuevoPedidos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPedidos.jCheckBoxPostAccionSinCerrarPedidos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPedidos.jCheckBoxPostAccionSinMensajePedidos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPedidos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPedidos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPedidos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPedidos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPedidos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPedidos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPedidos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPedidos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPedidos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPedidos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPedidos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPedidos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPedidos(Boolean esInicializar) throws Exception {
		try	{	
			if(PedidosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPedidos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPedidos() throws Exception {
		try	{
			if(PedidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPedidos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePedidos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPedidos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPedidos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPedidos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPedidos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPedidos.addItem(reporte);
			}
			
			
			if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPedidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPedidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPedidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPedidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPedidos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPedidos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPedidos!=null) {
				this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPedidos!=null) {
				this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPedidos!=null) {
				
				if(this.jInternalFrameReporteDinamicoPedidos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPedidos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPedidos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPedidos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPedidos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPedidos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPedidos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPedidos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PedidosConstantesFunciones.getTiposSeleccionarPedidos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPedidos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPedidos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPedidos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PedidosConstantesFunciones.getTiposSeleccionarPedidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPedidos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPedidos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPedidos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PedidosConstantesFunciones.getTiposSeleccionarPedidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPedidos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPedidos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPedidos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_estado_pedidoBusquedaPedidosPedidos.getSelectedItem()!=null){this.id_estado_pedidoBusquedaPedidos=((EstadoPedido)this.jComboBoxid_estado_pedidoBusquedaPedidosPedidos.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaPedidos=new Date(this.jDateChooserfecha_emision_desdeBusquedaPedidosPedidos.getDate().getTime());
		this.fecha_emision_hastaBusquedaPedidos=new Date(this.jDateChooserfecha_emision_hastaBusquedaPedidosPedidos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPedidos(Boolean esInicializar) throws Exception {				
		if(PedidosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPedidos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPedidos() throws Exception {
		this.inicializarActualizarBindingTablaPedidos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPedidos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPedidosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPedidos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=pedidosLogic.getPedidoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=pedidoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPedidos.setModel(new PedidosModel(this.pedidosLogic.getPedidoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPedidos.setModel(new PedidosModel(this.pedidoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPedidos!=null && this.jInternalFrameOrderByPedidos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPedidos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PedidosConstantesFunciones.SCLASSWEBTITULO,pedidosConstantesFunciones.resaltarSeleccionarPedidos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PedidosConstantesFunciones.SCLASSWEBTITULO,pedidosConstantesFunciones.resaltarSeleccionarPedidos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_ID));

		if(this.pedidosConstantesFunciones.mostraridPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidosConstantesFunciones.resaltaridPedidos,this.pedidosConstantesFunciones.activaridPedidos,iSizeTabla,this,true,"idPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidosConstantesFunciones.resaltaridPedidos,this.pedidosConstantesFunciones.activaridPedidos,this,true,"idPedidos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.pedidosConstantesFunciones.mostrarnombre_completo_clientePedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidosConstantesFunciones.resaltarnombre_completo_clientePedidos,this.pedidosConstantesFunciones.activarnombre_completo_clientePedidos,iSizeTabla,this,true,"nombre_completo_clientePedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidosConstantesFunciones.resaltarnombre_completo_clientePedidos,this.pedidosConstantesFunciones.activarnombre_completo_clientePedidos,this,true,"nombre_completo_clientePedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_NOMBREMONEDA));

		if(this.pedidosConstantesFunciones.mostrarnombre_monedaPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_NOMBREMONEDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidosConstantesFunciones.resaltarnombre_monedaPedidos,this.pedidosConstantesFunciones.activarnombre_monedaPedidos,iSizeTabla,this,true,"nombre_monedaPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidosConstantesFunciones.resaltarnombre_monedaPedidos,this.pedidosConstantesFunciones.activarnombre_monedaPedidos,this,true,"nombre_monedaPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_NOMBREZONA));

		if(this.pedidosConstantesFunciones.mostrarnombre_zonaPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidosConstantesFunciones.resaltarnombre_zonaPedidos,this.pedidosConstantesFunciones.activarnombre_zonaPedidos,iSizeTabla,this,true,"nombre_zonaPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidosConstantesFunciones.resaltarnombre_zonaPedidos,this.pedidosConstantesFunciones.activarnombre_zonaPedidos,this,true,"nombre_zonaPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_NUMERO));

		if(this.pedidosConstantesFunciones.mostrarnumeroPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidosConstantesFunciones.resaltarnumeroPedidos,this.pedidosConstantesFunciones.activarnumeroPedidos,iSizeTabla,this,true,"numeroPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidosConstantesFunciones.resaltarnumeroPedidos,this.pedidosConstantesFunciones.activarnumeroPedidos,this,true,"numeroPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_IVA));

		if(this.pedidosConstantesFunciones.mostrarivaPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidosConstantesFunciones.resaltarivaPedidos,this.pedidosConstantesFunciones.activarivaPedidos,iSizeTabla,this,true,"ivaPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidosConstantesFunciones.resaltarivaPedidos,this.pedidosConstantesFunciones.activarivaPedidos,this,true,"ivaPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_DESCUENTOVALOR));

		if(this.pedidosConstantesFunciones.mostrardescuento_valorPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_DESCUENTOVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidosConstantesFunciones.resaltardescuento_valorPedidos,this.pedidosConstantesFunciones.activardescuento_valorPedidos,iSizeTabla,this,true,"descuento_valorPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidosConstantesFunciones.resaltardescuento_valorPedidos,this.pedidosConstantesFunciones.activardescuento_valorPedidos,this,true,"descuento_valorPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_OTRO));

		if(this.pedidosConstantesFunciones.mostrarotroPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_OTRO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidosConstantesFunciones.resaltarotroPedidos,this.pedidosConstantesFunciones.activarotroPedidos,iSizeTabla,this,true,"otroPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidosConstantesFunciones.resaltarotroPedidos,this.pedidosConstantesFunciones.activarotroPedidos,this,true,"otroPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_TOTAL));

		if(this.pedidosConstantesFunciones.mostrartotalPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidosConstantesFunciones.resaltartotalPedidos,this.pedidosConstantesFunciones.activartotalPedidos,iSizeTabla,this,true,"totalPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidosConstantesFunciones.resaltartotalPedidos,this.pedidosConstantesFunciones.activartotalPedidos,this,true,"totalPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.pedidosConstantesFunciones.mostrarfecha_vencimientoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pedidosConstantesFunciones.resaltarfecha_vencimientoPedidos,this.pedidosConstantesFunciones.activarfecha_vencimientoPedidos,iSizeTabla,this,true,"fecha_vencimientoPedidos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pedidosConstantesFunciones.resaltarfecha_vencimientoPedidos,this.pedidosConstantesFunciones.activarfecha_vencimientoPedidos,this,true,"fecha_vencimientoPedidos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidos,PedidosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.pedidosConstantesFunciones.mostrarfecha_emisionPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pedidosConstantesFunciones.resaltarfecha_emisionPedidos,this.pedidosConstantesFunciones.activarfecha_emisionPedidos,iSizeTabla,this,true,"fecha_emisionPedidos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pedidosConstantesFunciones.resaltarfecha_emisionPedidos,this.pedidosConstantesFunciones.activarfecha_emisionPedidos,this,true,"fecha_emisionPedidos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPedidos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPedidos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPedidos && this.isPermisoGuardarCambiosPedidos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.pedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.pedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPedidos.addColumn(tableColumn);
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
			
			this.jTableDatosPedidos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPedidos && this.isPermisoGuardarCambiosPedidos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPedidos && this.isPermisoGuardarCambiosPedidos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPedidos.moveColumn(this.jTableDatosPedidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPedidos.moveColumn(this.jTableDatosPedidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPedidos.moveColumn(this.jTableDatosPedidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPedidos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPedidos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPedidos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPedidos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPedidos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPedidos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPedidos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPedidos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=pedidosLogic.getPedidoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=pedidoss.size()-1;
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
		//this.jTableDatosPedidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPedidos();
			
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
				
				//this.isEsNuevoPedidos=false;
					
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
				if(this.pedidosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPedidos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPedidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPedidos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.pedidos.getsType().equals("DUPLICADO")
				   || this.pedidos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPedidos=true;
				
				} else {
					this.isEsNuevoPedidos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
					if(this.pedidos.getId()>=0 && !this.pedidos.getIsNew()) {						
						this.isEsNuevoPedidos=false;
						
					} else {
						this.isEsNuevoPedidos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPedidos(esRelaciones);						
				
				this.seleccionarPedidos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.pedidos.getId()<0) {
					this.isEsNuevoPedidos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPedidos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPedidos(evt,rowIndex);
				}	
				
				if(this.pedidosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Pedidos: " + this.dDif); 
					}
				}								
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPedidos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.pedidos)) {
					if(this.pedidos.getId()>0) {
						this.pedidos.setIsDeleted(true);
						
						this.pedidossEliminados.add(this.pedidos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pedidosLogic.getPedidoss().remove(this.pedidos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pedidoss.remove(this.pedidos);				
					}
					
					
					((PedidosModel) this.jTableDatosPedidos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPedidos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPedidos) {
			
			if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPedidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPedidos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPedidos(this.pedidos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPedidos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPedidos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPedidos(Pedidos pedidos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPedidos(pedidos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPedidos(Pedidos pedidos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPedidos(pedidos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPedidos(pedidos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPedidos(pedidos);
	}
	
	public void setVariablesObjetoActualToFormularioPedidos(Pedidos pedidos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.setText(pedidos.getId().toString());
			this.jInternalFrameDetalleFormPedidos.jTextAreanombre_completo_clientePedidos.setText(pedidos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_monedaPedidos.setText(pedidos.getnombre_moneda());
			this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_zonaPedidos.setText(pedidos.getnombre_zona());
			this.jInternalFrameDetalleFormPedidos.jTextFieldnumeroPedidos.setText(pedidos.getnumero());
			this.jInternalFrameDetalleFormPedidos.jTextFieldivaPedidos.setText(pedidos.getiva().toString());
			this.jInternalFrameDetalleFormPedidos.jTextFielddescuento_valorPedidos.setText(pedidos.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormPedidos.jTextFieldotroPedidos.setText(pedidos.getotro().toString());
			this.jInternalFrameDetalleFormPedidos.jTextFieldtotalPedidos.setText(pedidos.gettotal().toString());
			this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_vencimientoPedidos.setDate(pedidos.getfecha_vencimiento());
			this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emisionPedidos.setDate(pedidos.getfecha_emision());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Pedidos pedidosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,pedidosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Pedidos pedidosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				pedidosLocal=this.pedidos;
			} else {
				pedidosLocal=this.pedidosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(pedidosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPedidos(pedidosLocal,true);
					
					if(pedidosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(pedidosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.pedidosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(pedidosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPedidos(Pedidos pedidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPedidos(pedidos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPedidos(pedidos);
	}
	
	public void setVariablesFormularioToObjetoActualPedidos(Pedidos pedidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPedidos(pedidos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPedidos(Pedidos pedidos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.getText()==null || this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.getText()=="" || this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.getText()=="Id") {
				this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.setText("0");
			}

			if(conColumnasBase) {pedidos.setId(Long.parseLong(this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelIdPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidos.setnombre_completo_cliente(this.jInternalFrameDetalleFormPedidos.jTextAreanombre_completo_clientePedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelnombre_completo_clientePedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidos.setnombre_moneda(this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_monedaPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_NOMBREMONEDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelnombre_monedaPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidos.setnombre_zona(this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_zonaPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelnombre_zonaPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidos.setnumero(this.jInternalFrameDetalleFormPedidos.jTextFieldnumeroPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelnumeroPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidos.setiva(Double.parseDouble(this.jInternalFrameDetalleFormPedidos.jTextFieldivaPedidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelivaPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidos.setdescuento_valor(Double.parseDouble(this.jInternalFrameDetalleFormPedidos.jTextFielddescuento_valorPedidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_DESCUENTOVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabeldescuento_valorPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidos.setotro(Double.parseDouble(this.jInternalFrameDetalleFormPedidos.jTextFieldotroPedidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_OTRO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelotroPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormPedidos.jTextFieldtotalPedidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabeltotalPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidos.setfecha_vencimiento(this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_vencimientoPedidos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelfecha_vencimientoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidos.setfecha_emision(this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emisionPedidos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidos.jLabelfecha_emisionPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPedidos(Pedidos pedidosBean,Pedidos pedidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPedidos(Pedidos pedidosOrigen,Pedidos pedidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pedidosOrigen.getId()!=null && !pedidosOrigen.getId().equals(0L))) {pedidos.setId(pedidosOrigen.getId());}}
			if(conDefault || (!conDefault && pedidosOrigen.getfecha_emision_desde()!=null && !pedidosOrigen.getfecha_emision_desde().equals(new Date()))) {pedidos.setfecha_emision_desde(pedidosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && pedidosOrigen.getfecha_emision_hasta()!=null && !pedidosOrigen.getfecha_emision_hasta().equals(new Date()))) {pedidos.setfecha_emision_hasta(pedidosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && pedidosOrigen.getnombre_completo_cliente()!=null && !pedidosOrigen.getnombre_completo_cliente().equals(""))) {pedidos.setnombre_completo_cliente(pedidosOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && pedidosOrigen.getnombre_moneda()!=null && !pedidosOrigen.getnombre_moneda().equals(""))) {pedidos.setnombre_moneda(pedidosOrigen.getnombre_moneda());}
			if(conDefault || (!conDefault && pedidosOrigen.getnombre_zona()!=null && !pedidosOrigen.getnombre_zona().equals(""))) {pedidos.setnombre_zona(pedidosOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && pedidosOrigen.getnumero()!=null && !pedidosOrigen.getnumero().equals(""))) {pedidos.setnumero(pedidosOrigen.getnumero());}
			if(conDefault || (!conDefault && pedidosOrigen.getiva()!=null && !pedidosOrigen.getiva().equals(0.0))) {pedidos.setiva(pedidosOrigen.getiva());}
			if(conDefault || (!conDefault && pedidosOrigen.getdescuento_valor()!=null && !pedidosOrigen.getdescuento_valor().equals(0.0))) {pedidos.setdescuento_valor(pedidosOrigen.getdescuento_valor());}
			if(conDefault || (!conDefault && pedidosOrigen.getotro()!=null && !pedidosOrigen.getotro().equals(0.0))) {pedidos.setotro(pedidosOrigen.getotro());}
			if(conDefault || (!conDefault && pedidosOrigen.gettotal()!=null && !pedidosOrigen.gettotal().equals(0.0))) {pedidos.settotal(pedidosOrigen.gettotal());}
			if(conDefault || (!conDefault && pedidosOrigen.getfecha_vencimiento()!=null && !pedidosOrigen.getfecha_vencimiento().equals(new Date()))) {pedidos.setfecha_vencimiento(pedidosOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && pedidosOrigen.getfecha_emision()!=null && !pedidosOrigen.getfecha_emision().equals(new Date()))) {pedidos.setfecha_emision(pedidosOrigen.getfecha_emision());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPedidos(Pedidos pedidos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.setText(pedidos.getId().toString());
			this.jInternalFrameDetalleFormPedidos.jTextAreanombre_completo_clientePedidos.setText(pedidos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_monedaPedidos.setText(pedidos.getnombre_moneda());
			this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_zonaPedidos.setText(pedidos.getnombre_zona());
			this.jInternalFrameDetalleFormPedidos.jTextFieldnumeroPedidos.setText(pedidos.getnumero());
			this.jInternalFrameDetalleFormPedidos.jTextFieldivaPedidos.setText(pedidos.getiva().toString());
			this.jInternalFrameDetalleFormPedidos.jTextFielddescuento_valorPedidos.setText(pedidos.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormPedidos.jTextFieldotroPedidos.setText(pedidos.getotro().toString());
			this.jInternalFrameDetalleFormPedidos.jTextFieldtotalPedidos.setText(pedidos.gettotal().toString());
			this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_vencimientoPedidos.setDate(pedidos.getfecha_vencimiento());
			this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emisionPedidos.setDate(pedidos.getfecha_emision());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPedidos(PedidosBean pedidosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.setText(pedidosBean.getId().toString());
			this.jInternalFrameDetalleFormPedidos.jTextAreanombre_completo_clientePedidos.setText(pedidosBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_monedaPedidos.setText(pedidosBean.getnombre_moneda());
			this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_zonaPedidos.setText(pedidosBean.getnombre_zona());
			this.jInternalFrameDetalleFormPedidos.jTextFieldnumeroPedidos.setText(pedidosBean.getnumero());
			this.jInternalFrameDetalleFormPedidos.jTextFieldivaPedidos.setText(pedidosBean.getiva().toString());
			this.jInternalFrameDetalleFormPedidos.jTextFielddescuento_valorPedidos.setText(pedidosBean.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormPedidos.jTextFieldotroPedidos.setText(pedidosBean.getotro().toString());
			this.jInternalFrameDetalleFormPedidos.jTextFieldtotalPedidos.setText(pedidosBean.gettotal().toString());
			this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_vencimientoPedidos.setDate(pedidosBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emisionPedidos.setDate(pedidosBean.getfecha_emision());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPedidos(PedidosParameterReturnGeneral pedidosReturnGeneral,PedidosBean pedidosBean,Boolean conDefault) throws Exception { 
		try {
			Pedidos pedidosLocal=new Pedidos();
			
			pedidosLocal=pedidosReturnGeneral.getPedidos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pedidosLocal.getId()!=null && !pedidosLocal.getId().equals(0L))) {pedidosBean.setId(pedidosLocal.getId());}}
			if(conDefault || (!conDefault && pedidosLocal.getnombre_completo_cliente()!=null && !pedidosLocal.getnombre_completo_cliente().equals(""))) {pedidosBean.setnombre_completo_cliente(pedidosLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && pedidosLocal.getnombre_moneda()!=null && !pedidosLocal.getnombre_moneda().equals(""))) {pedidosBean.setnombre_moneda(pedidosLocal.getnombre_moneda());}
			if(conDefault || (!conDefault && pedidosLocal.getnombre_zona()!=null && !pedidosLocal.getnombre_zona().equals(""))) {pedidosBean.setnombre_zona(pedidosLocal.getnombre_zona());}
			if(conDefault || (!conDefault && pedidosLocal.getnumero()!=null && !pedidosLocal.getnumero().equals(""))) {pedidosBean.setnumero(pedidosLocal.getnumero());}
			if(conDefault || (!conDefault && pedidosLocal.getiva()!=null && !pedidosLocal.getiva().equals(0.0))) {pedidosBean.setiva(pedidosLocal.getiva());}
			if(conDefault || (!conDefault && pedidosLocal.getdescuento_valor()!=null && !pedidosLocal.getdescuento_valor().equals(0.0))) {pedidosBean.setdescuento_valor(pedidosLocal.getdescuento_valor());}
			if(conDefault || (!conDefault && pedidosLocal.getotro()!=null && !pedidosLocal.getotro().equals(0.0))) {pedidosBean.setotro(pedidosLocal.getotro());}
			if(conDefault || (!conDefault && pedidosLocal.gettotal()!=null && !pedidosLocal.gettotal().equals(0.0))) {pedidosBean.settotal(pedidosLocal.gettotal());}
			if(conDefault || (!conDefault && pedidosLocal.getfecha_vencimiento()!=null && !pedidosLocal.getfecha_vencimiento().equals(new Date()))) {pedidosBean.setfecha_vencimiento(pedidosLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && pedidosLocal.getfecha_emision()!=null && !pedidosLocal.getfecha_emision().equals(new Date()))) {pedidosBean.setfecha_emision(pedidosLocal.getfecha_emision());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPedidosGenerico(Long idPedidosSeleccionado,JComboBox jComboBoxPedidos,List<Pedidos> pedidossLocal)throws Exception {
		try {
			Pedidos  pedidosTemp=null;

			for(Pedidos pedidosAux:pedidossLocal) {
				if(pedidosAux.getId()!=null && pedidosAux.getId().equals(idPedidosSeleccionado)) {
					pedidosTemp=pedidosAux;
					break;
				}
			}

			jComboBoxPedidos.setSelectedItem(pedidosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPedidosGenerico(JComboBox jComboBoxPedidos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPedidos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPedidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPedidos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPedidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidos=(Pedidos) pedidosLogic.getPedidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pedidos =(Pedidos) pedidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!pedidos.getIsNew() && !pedidos.getIsChanged() && !pedidos.getIsDeleted()) {
				sDescripcion=pedidos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=pedidos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("EstadoPedido")) {
			//sDescripcion=this.getActualEstadoPedidoForeignKeyDescripcion((Long)value);
			if(!pedidos.getIsNew() && !pedidos.getIsChanged() && !pedidos.getIsDeleted()) {
				sDescripcion=pedidos.getestadopedido_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoPedidoForeignKeyDescripcion((Long)value);
				sDescripcion=pedidos.getestadopedido_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Pedidos pedidosRow=new Pedidos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidosRow=(Pedidos) pedidosLogic.getPedidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pedidosRow=(Pedidos) pedidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPedidos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPedidos.setVisible((this.isVisibilidadCeldaNuevoPedidos && this.isPermisoNuevoPedidos));			
			this.jButtonDuplicarPedidos.setVisible((this.isVisibilidadCeldaDuplicarPedidos && this.isPermisoDuplicarPedidos));			
			this.jButtonCopiarPedidos.setVisible((this.isVisibilidadCeldaCopiarPedidos && this.isPermisoCopiarPedidos));
			this.jButtonVerFormPedidos.setVisible((this.isVisibilidadCeldaVerFormPedidos && this.isPermisoVerFormPedidos));
			
			this.jButtonAbrirOrderByPedidos.setVisible((this.isVisibilidadCeldaOrdenPedidos && this.isPermisoOrdenPedidos));			
			
			this.jButtonNuevoRelacionesPedidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidos && this.isPermisoNuevoPedidos));			
			this.jButtonNuevoGuardarCambiosPedidos.setVisible((this.isVisibilidadCeldaNuevoPedidos && this.isPermisoNuevoPedidos && this.isPermisoGuardarCambiosPedidos));
			
			if(this.jInternalFrameDetalleFormPedidos!=null) {
			this.jInternalFrameDetalleFormPedidos.jButtonModificarPedidos.setVisible((this.isVisibilidadCeldaModificarPedidos && this.isPermisoActualizarPedidos));	
			this.jInternalFrameDetalleFormPedidos.jButtonActualizarPedidos.setVisible((this.isVisibilidadCeldaActualizarPedidos && this.isPermisoActualizarPedidos));	
			this.jInternalFrameDetalleFormPedidos.jButtonEliminarPedidos.setVisible((this.isVisibilidadCeldaEliminarPedidos && this.isPermisoEliminarPedidos));
			this.jInternalFrameDetalleFormPedidos.jButtonCancelarPedidos.setVisible(this.isVisibilidadCeldaCancelarPedidos);							
			this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosPedidos.setVisible((this.isVisibilidadCeldaGuardarPedidos && this.isPermisoGuardarCambiosPedidos));			
			
			}
						
			this.jButtonGuardarCambiosTablaPedidos.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidos && this.isPermisoGuardarCambiosPedidos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPedidos.setVisible((this.isVisibilidadCeldaNuevoPedidos && this.isPermisoNuevoPedidos));						
			this.jButtonDuplicarToolBarPedidos.setVisible((this.isVisibilidadCeldaDuplicarPedidos && this.isPermisoDuplicarPedidos));						
			this.jButtonCopiarToolBarPedidos.setVisible((this.isVisibilidadCeldaCopiarPedidos && this.isPermisoCopiarPedidos));			
			this.jButtonVerFormToolBarPedidos.setVisible((this.isVisibilidadCeldaVerFormPedidos && this.isPermisoVerFormPedidos));			
			this.jButtonAbrirOrderByToolBarPedidos.setVisible((this.isVisibilidadCeldaOrdenPedidos && this.isPermisoOrdenPedidos));
			this.jButtonNuevoRelacionesToolBarPedidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidos && this.isPermisoNuevoPedidos));			
			this.jButtonNuevoGuardarCambiosToolBarPedidos.setVisible((this.isVisibilidadCeldaNuevoPedidos && this.isPermisoNuevoPedidos && this.isPermisoGuardarCambiosPedidos));			
			
			if(this.jInternalFrameDetalleFormPedidos!=null) {
			this.jInternalFrameDetalleFormPedidos.jButtonModificarToolBarPedidos.setVisible((this.isVisibilidadCeldaModificarPedidos && this.isPermisoActualizarPedidos));	
			this.jInternalFrameDetalleFormPedidos.jButtonActualizarToolBarPedidos.setVisible((this.isVisibilidadCeldaActualizarPedidos  && this.isPermisoActualizarPedidos));	
			this.jInternalFrameDetalleFormPedidos.jButtonEliminarToolBarPedidos.setVisible((this.isVisibilidadCeldaEliminarPedidos && this.isPermisoEliminarPedidos));
			this.jInternalFrameDetalleFormPedidos.jButtonCancelarToolBarPedidos.setVisible(this.isVisibilidadCeldaCancelarPedidos);				
			this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosToolBarPedidos.setVisible((this.isVisibilidadCeldaGuardarPedidos && this.isPermisoGuardarCambiosPedidos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPedidos.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidos && this.isPermisoGuardarCambiosPedidos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPedidos.setVisible((this.isVisibilidadCeldaNuevoPedidos && this.isPermisoNuevoPedidos));			
			this.jMenuItemDuplicarPedidos.setVisible((this.isVisibilidadCeldaDuplicarPedidos && this.isPermisoDuplicarPedidos));			
			this.jMenuItemCopiarPedidos.setVisible((this.isVisibilidadCeldaCopiarPedidos && this.isPermisoCopiarPedidos));			
			this.jMenuItemVerFormPedidos.setVisible((this.isVisibilidadCeldaVerFormPedidos && this.isPermisoVerFormPedidos));			
			this.jMenuItemAbrirOrderByPedidos.setVisible((this.isVisibilidadCeldaOrdenPedidos && this.isPermisoOrdenPedidos));			
			//this.jMenuItemMostrarOcultarPedidos.setVisible((this.isVisibilidadCeldaOrdenPedidos && this.isPermisoOrdenPedidos));
			this.jMenuItemDetalleAbrirOrderByPedidos.setVisible((this.isVisibilidadCeldaOrdenPedidos && this.isPermisoOrdenPedidos));			
			//this.jMenuItemDetalleMostrarOcultarPedidos.setVisible((this.isVisibilidadCeldaOrdenPedidos && this.isPermisoOrdenPedidos));			
			this.jMenuItemNuevoRelacionesPedidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidos && this.isPermisoNuevoPedidos));			
			this.jMenuItemNuevoGuardarCambiosPedidos.setVisible((this.isVisibilidadCeldaNuevoPedidos && this.isPermisoNuevoPedidos && this.isPermisoGuardarCambiosPedidos));									
			
			if(this.jInternalFrameDetalleFormPedidos!=null) {
			this.jInternalFrameDetalleFormPedidos.jMenuItemModificarPedidos.setVisible((this.isVisibilidadCeldaModificarPedidos && this.isPermisoActualizarPedidos));	
			this.jInternalFrameDetalleFormPedidos.jMenuItemActualizarPedidos.setVisible((this.isVisibilidadCeldaActualizarPedidos && this.isPermisoActualizarPedidos));	
			this.jInternalFrameDetalleFormPedidos.jMenuItemEliminarPedidos.setVisible((this.isVisibilidadCeldaEliminarPedidos && this.isPermisoEliminarPedidos));
			this.jInternalFrameDetalleFormPedidos.jMenuItemCancelarPedidos.setVisible(this.isVisibilidadCeldaCancelarPedidos);				
			}
			
			this.jMenuItemGuardarCambiosPedidos.setVisible((this.isVisibilidadCeldaGuardarPedidos && this.isPermisoGuardarCambiosPedidos));						
			this.jMenuItemGuardarCambiosTablaPedidos.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidos && this.isPermisoGuardarCambiosPedidos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPedidos=this.jButtonNuevoPedidos.isVisible();
			this.isVisibilidadCeldaDuplicarPedidos=this.jButtonDuplicarPedidos.isVisible();
			this.isVisibilidadCeldaCopiarPedidos=this.jButtonCopiarPedidos.isVisible();
			this.isVisibilidadCeldaVerFormPedidos=this.jButtonVerFormPedidos.isVisible();
			
			this.isVisibilidadCeldaOrdenPedidos=this.jButtonAbrirOrderByPedidos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPedidos=this.jButtonNuevoRelacionesPedidos.isVisible();
			this.isVisibilidadCeldaModificarPedidos=this.jButtonModificarPedidos.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidos!=null) {
			this.isVisibilidadCeldaActualizarPedidos=this.jInternalFrameDetalleFormPedidos.jButtonActualizarPedidos.isVisible();
			this.isVisibilidadCeldaEliminarPedidos=this.jInternalFrameDetalleFormPedidos.jButtonEliminarPedidos.isVisible();
			this.isVisibilidadCeldaCancelarPedidos=this.jInternalFrameDetalleFormPedidos.jButtonCancelarPedidos.isVisible();
			this.isVisibilidadCeldaGuardarPedidos=this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosPedidos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPedidos=this.jButtonGuardarCambiosTablaPedidos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPedidos=this.jButtonNuevoToolBarPedidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPedidos=this.jButtonNuevoRelacionesToolBarPedidos.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidos!=null) {
			this.isVisibilidadCeldaModificarPedidos=this.jInternalFrameDetalleFormPedidos.jButtonModificarToolBarPedidos.isVisible();
			this.isVisibilidadCeldaActualizarPedidos=this.jInternalFrameDetalleFormPedidos.jButtonActualizarToolBarPedidos.isVisible();
			this.isVisibilidadCeldaEliminarPedidos=this.jInternalFrameDetalleFormPedidos.jButtonEliminarToolBarPedidos.isVisible();
			this.isVisibilidadCeldaCancelarPedidos=this.jInternalFrameDetalleFormPedidos.jButtonCancelarToolBarPedidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPedidos=this.jButtonGuardarCambiosToolBarPedidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPedidos=this.jButtonGuardarCambiosTablaToolBarPedidos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPedidos=this.jMenuItemNuevoPedidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPedidos=this.jMenuItemNuevoRelacionesPedidos.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidos!=null) {
			this.isVisibilidadCeldaModificarPedidos=this.jInternalFrameDetalleFormPedidos.jMenuItemModificarPedidos.isVisible();
			this.isVisibilidadCeldaActualizarPedidos=this.jInternalFrameDetalleFormPedidos.jMenuItemActualizarPedidos.isVisible();
			this.isVisibilidadCeldaEliminarPedidos=this.jInternalFrameDetalleFormPedidos.jMenuItemEliminarPedidos.isVisible();
			this.isVisibilidadCeldaCancelarPedidos=this.jInternalFrameDetalleFormPedidos.jMenuItemCancelarPedidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPedidos=this.jMenuItemGuardarCambiosPedidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPedidos=this.jMenuItemGuardarCambiosTablaPedidos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPedidos(Boolean esInicializar) {
		if(PedidosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.pedidosSessionBean.getConGuardarRelaciones()) {
				//if(this.pedidosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPedidos();
			}
			
			this.inicializarActualizarBindingBotonesManualPedidos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPedidos() {
		this.jButtonNuevoPedidos.setVisible(this.isPermisoNuevoPedidos);			
		this.jButtonDuplicarPedidos.setVisible(this.isPermisoDuplicarPedidos);			
		this.jButtonCopiarPedidos.setVisible(this.isPermisoCopiarPedidos);			
		this.jButtonVerFormPedidos.setVisible(this.isPermisoVerFormPedidos);			
		
		this.jButtonAbrirOrderByPedidos.setVisible(this.isPermisoOrdenPedidos);					
		
		this.jButtonNuevoRelacionesPedidos.setVisible(this.isPermisoNuevoPedidos);			
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jButtonModificarPedidos.setVisible(this.isPermisoActualizarPedidos);	
			this.jInternalFrameDetalleFormPedidos.jButtonActualizarPedidos.setVisible(this.isPermisoActualizarPedidos);	
			this.jInternalFrameDetalleFormPedidos.jButtonEliminarPedidos.setVisible(this.isPermisoEliminarPedidos);
			this.jInternalFrameDetalleFormPedidos.jButtonCancelarPedidos.setVisible(this.isVisibilidadCeldaCancelarPedidos);						
			this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosPedidos.setVisible(this.isPermisoGuardarCambiosPedidos);							
		}
		
		this.jButtonGuardarCambiosTablaPedidos.setVisible(this.isPermisoActualizarPedidos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePedidos() {
		this.jInternalFrameDetalleFormPedidos.jButtonModificarPedidos.setVisible(this.isPermisoActualizarPedidos);	
		this.jInternalFrameDetalleFormPedidos.jButtonActualizarPedidos.setVisible(this.isPermisoActualizarPedidos);	
		this.jInternalFrameDetalleFormPedidos.jButtonEliminarPedidos.setVisible(this.isPermisoEliminarPedidos);
		this.jInternalFrameDetalleFormPedidos.jButtonCancelarPedidos.setVisible(this.isVisibilidadCeldaCancelarPedidos);							
		this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosPedidos.setVisible((this.isVisibilidadCeldaGuardarPedidos && this.isPermisoGuardarCambiosPedidos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPedidos() {
		if(PedidosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPedidos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPedidos() {
	}
	
	public void jTableDatosPedidosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPedidos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.pedidos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPedidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPedidos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.pedidosLogic.getConnexion());

				if(this.pedidos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.pedidos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidos=(TitledBorder)this.jScrollPanelDatosPedidos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPedidos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.pedidos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_pedidoPedidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadopedido=true;

			idTienePermisoestadopedido=this.tienePermisosUsuarioEnPaginaWebPedidos(EstadoPedidoConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadopedido) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);

				this.estadopedidoBeanSwingJInternalFrame=new EstadoPedidoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadopedidoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadopedidoBeanSwingJInternalFrame.getEstadoPedidoLogic().setConnexion(this.pedidosLogic.getConnexion());

				if(this.pedidos.getid_estado_pedido()!=null) {
					this.estadopedidoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadopedidoBeanSwingJInternalFrame.setIdActual(this.pedidos.getid_estado_pedido());
					this.estadopedidoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadopedidoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadopedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoPedido();
				}

				JInternalFrameBase jinternalFrame =this.estadopedidoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidos=(TitledBorder)this.jScrollPanelDatosPedidos.getBorder();
				TitledBorder titledBorderestadopedido=(TitledBorder)this.estadopedidoBeanSwingJInternalFrame.jScrollPanelDatosEstadoPedido.getBorder();

				titledBorderestadopedido.setTitle(titledBorderPedidos.getTitle() + " -> ESTADOPEDIDO");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_pedidoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getid_estado_pedido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_pedido = "+this.pedidos.getid_estado_pedido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdePedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.pedidos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.pedidos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clientePedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.pedidos.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_monedaPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getnombre_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_moneda like '%"+this.pedidos.getnombre_moneda()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.pedidos.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.pedidos.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.pedidos.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento_valorPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getdescuento_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento_valor = "+this.pedidos.getdescuento_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonotroPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getotro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where otro = "+this.pedidos.getotro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.pedidos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.pedidos.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidos(this.getpedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidos==null) {
						this.pedidos = new Pedidos();
					}

					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);
				}

				if(this.pedidos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.pedidos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPedidosPedidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidos(false,false);

			this.getPedidossBusquedaPedidos();

			this.inicializarActualizarBindingPedidos(false);

			//if(PedidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPedidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidos(false,false);

			this.getPedidossFK_IdEmpresa();

			this.inicializarActualizarBindingPedidos(false);

			//if(PedidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoPedidoPedidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidos(false,false);

			this.getPedidossFK_IdEstadoPedido();

			this.inicializarActualizarBindingPedidos(false);

			//if(PedidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePedidos() {
		if(this.jInternalFrameDetalleFormPedidos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPedidos!=null) {
			this.jInternalFrameDetalleFormPedidos.setVisible(false);	    			
			this.jInternalFrameDetalleFormPedidos.dispose();
			this.jInternalFrameDetalleFormPedidos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPedidos!=null) {
			this.jInternalFrameReporteDinamicoPedidos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPedidos.dispose();
			this.jInternalFrameReporteDinamicoPedidos=null;
		}
		
		if(this.jInternalFrameImportacionPedidos!=null) {
			this.jInternalFrameImportacionPedidos.setVisible(false);	    			
			this.jInternalFrameImportacionPedidos.dispose();
			this.jInternalFrameImportacionPedidos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPedidos();
			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
			
			if(sTipo.equals("NuevoPedidos")) {
				jButtonNuevoPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPedidos")) {
				jButtonDuplicarPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPedidos")) {
				jButtonCopiarPedidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormPedidos")) {
				jButtonVerFormPedidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPedidos")) {
				jButtonNuevoPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPedidos")) {
				jButtonDuplicarPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPedidos")) {
				jButtonNuevoPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPedidos")) {
				jButtonDuplicarPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPedidos")) {
				jButtonNuevoPedidosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPedidos")) {
				jButtonNuevoPedidosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPedidos")) {
				jButtonNuevoPedidosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPedidos")) {
				jButtonModificarPedidosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPedidos")) {
				jButtonModificarPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPedidos")) {
				jButtonModificarPedidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPedidos")) {
				jButtonActualizarPedidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPedidos")) {
				jButtonActualizarPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPedidos")) {
				jButtonActualizarPedidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarPedidos")) {
				jButtonEliminarPedidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPedidos")) {
				jButtonEliminarPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPedidos")) {
				jButtonEliminarPedidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarPedidos")) {
				jButtonCancelarPedidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPedidos")) {
				jButtonCancelarPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPedidos")) {
				jButtonCancelarPedidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarPedidos")) {
				jButtonCerrarPedidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPedidos")) {
				jButtonCerrarPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPedidos")) {
				jButtonCerrarPedidosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPedidos")) {
				jButtonMostrarOcultarPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPedidos")) {
				jButtonCancelarPedidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPedidos")) {
				jButtonGuardarCambiosPedidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPedidos")) {
				jButtonGuardarCambiosPedidosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPedidos")) {
				jButtonCopiarPedidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPedidos")) {
				jButtonVerFormPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPedidos")) {
				jButtonGuardarCambiosPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPedidos")) {
				jButtonCopiarPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPedidos")) {
				jButtonVerFormPedidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPedidos")) {
				jButtonGuardarCambiosPedidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPedidos")) {
				jButtonGuardarCambiosPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPedidos")) {
				jButtonGuardarCambiosPedidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPedidos")) {
				jButtonRecargarInformacionPedidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPedidos")) {
				jButtonRecargarInformacionPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPedidos")) {
				jButtonRecargarInformacionPedidosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPedidos")) {
				jButtonAnterioresPedidosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPedidos")) {
				jButtonAnterioresPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePedidos")) {
				jButtonAnterioresPedidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPedidos")) {
				jButtonSiguientesPedidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPedidos")) {
				jButtonSiguientesPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPedidos")) {
				jButtonSiguientesPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPedidos") || sTipo.equals("MenuItemDetalleAbrirOrderByPedidos")) {
				jButtonAbrirOrderByPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPedidos") || sTipo.equals("MenuItemDetalleMostrarOcultarPedidos")) {
				jButtonMostrarOcultarPedidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPedidos")) {
				jButtonNuevoGuardarCambiosPedidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPedidos")) {
				jButtonNuevoGuardarCambiosPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPedidos")) {
				jButtonNuevoGuardarCambiosPedidosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPedidos")) {
				jButtonCerrarReporteDinamicoPedidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPedidos")) {
				jButtonGenerarReporteDinamicoPedidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPedidos")) {
				
				jButtonGenerarExcelReporteDinamicoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPedidos")) {
				jButtonCerrarImportacionPedidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPedidos")) {
				
				jButtonGenerarImportacionPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPedidos")) {
				
				jButtonAbrirImportacionPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPedidos")) {
				jComboBoxTiposAccionesPedidosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPedidos")) {
				jComboBoxTiposRelacionesPedidosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPedidos")) {
				jComboBoxTiposAccionesPedidosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPedidos")) {
				
				jComboBoxTiposSeleccionarPedidosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPedidos")) {
				jTextFieldValorCampoGeneralPedidosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPedidos")) {
				jButtonAbrirOrderByPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPedidos")) {
				jButtonAbrirOrderByPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPedidos")) {
				jButtonCerrarOrderByPedidosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPedidosBusqueda")) {
				this.jButtonidPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPedidosUpdate")) {
				this.jButtonid_empresaPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPedidosBusqueda")) {
				this.jButtonid_empresaPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_pedidoPedidosUpdate")) {
				this.jButtonid_estado_pedidoPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_pedidoPedidosBusqueda")) {
				this.jButtonid_estado_pedidoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdePedidosBusqueda")) {
				this.jButtonfecha_emision_desdePedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaPedidosBusqueda")) {
				this.jButtonfecha_emision_hastaPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clientePedidosBusqueda")) {
				this.jButtonnombre_completo_clientePedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_monedaPedidosBusqueda")) {
				this.jButtonnombre_monedaPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaPedidosBusqueda")) {
				this.jButtonnombre_zonaPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroPedidosBusqueda")) {
				this.jButtonnumeroPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaPedidosBusqueda")) {
				this.jButtonivaPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_valorPedidosBusqueda")) {
				this.jButtondescuento_valorPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("otroPedidosBusqueda")) {
				this.jButtonotroPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalPedidosBusqueda")) {
				this.jButtontotalPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoPedidosBusqueda")) {
				this.jButtonfecha_vencimientoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPedidosBusqueda")) {
				this.jButtonfecha_emisionPedidosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPedidosPedidos")) {
				this.jButtonBusquedaPedidosPedidosActionPerformed(evt);
			}
			
			;
			
			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPedidos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				


				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Pedidos pedidosLocal=null;
			
			if(!this.getEsControlTabla()) {
				pedidosLocal=this.pedidos;
			} else {
				pedidosLocal=this.pedidosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
							
				
				


				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosAnterior =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidosAnterior =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
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
			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
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
			
			


			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
								
						
				


				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
								
				
				


				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosAnterior =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidosAnterior =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosAnterior =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidosAnterior =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
							
				
				


				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidosAnterior =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pedidosAnterior =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
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
			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
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
			
			


			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
								
				
				


				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosAnterior =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidosAnterior =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPedidos")) {
					jCheckBoxSeleccionarTodosPedidosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPedidos")) {
					jCheckBoxSeleccionadosPedidosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPedidos")) {
					
				}
				
				


				
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
												
				
				


				
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidosAnterior =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pedidosAnterior =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
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
			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
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
			
			


			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidos);
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
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
				
				


				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Pedidos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Pedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidosAnterior =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidosAnterior =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPedidos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPedidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPedidos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.pedidos =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.pedidos =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.pedidos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPedidos")) {
				
				}
				
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPedidos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPedidos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPedidos")) {
			
			}
			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPedidos();
			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
			if(sTipo.equals("NuevoPedidos")) {
				jButtonNuevoPedidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPedidos")) {
				jButtonDuplicarPedidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPedidos")) {
				jButtonCopiarPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPedidos")) {
				jButtonVerFormPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPedidos")) {
				jButtonNuevoPedidosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPedidos")) {
				jButtonModificarPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPedidos")) {
				jButtonActualizarPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPedidos")) {
				jButtonEliminarPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPedidos")) {
				jButtonGuardarCambiosPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPedidos")) {
				jButtonCancelarPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPedidos")) {
				jButtonCerrarPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPedidos")) {
				jButtonGuardarCambiosPedidosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPedidos")) {
				jButtonNuevoGuardarCambiosPedidosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPedidos")) {
				jButtonAbrirOrderByPedidosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPedidos")) {
				jButtonRecargarInformacionPedidosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPedidos")) {
				jButtonAnterioresPedidosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPedidos")) {
				jButtonSiguientesPedidosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPedidosBusqueda")) {
				this.jButtonidPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPedidosUpdate")) {
				this.jButtonid_empresaPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPedidosBusqueda")) {
				this.jButtonid_empresaPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_pedidoPedidosUpdate")) {
				this.jButtonid_estado_pedidoPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_pedidoPedidosBusqueda")) {
				this.jButtonid_estado_pedidoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdePedidosBusqueda")) {
				this.jButtonfecha_emision_desdePedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaPedidosBusqueda")) {
				this.jButtonfecha_emision_hastaPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clientePedidosBusqueda")) {
				this.jButtonnombre_completo_clientePedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_monedaPedidosBusqueda")) {
				this.jButtonnombre_monedaPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaPedidosBusqueda")) {
				this.jButtonnombre_zonaPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroPedidosBusqueda")) {
				this.jButtonnumeroPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaPedidosBusqueda")) {
				this.jButtonivaPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_valorPedidosBusqueda")) {
				this.jButtondescuento_valorPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("otroPedidosBusqueda")) {
				this.jButtonotroPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalPedidosBusqueda")) {
				this.jButtontotalPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoPedidosBusqueda")) {
				this.jButtonfecha_vencimientoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPedidosBusqueda")) {
				this.jButtonfecha_emisionPedidosBusquedaActionPerformed(evt);
			}
			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPedidos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePedidos")) {
				closingInternalFramePedidos();
				
			} else if(sTipo.equals("jButtonCancelarPedidos")) {
				JInternalFrameBase jInternalFrameDetalleFormPedidos = (JInternalFrameBase)evt.getSource();
	            	
	            PedidosBeanSwingJInternalFrame jInternalFrameParent=(PedidosBeanSwingJInternalFrame)jInternalFrameDetalleFormPedidos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPedidosActionPerformed(null);
			}
			
			PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pedidos,new Object(),this.pedidosParameterGeneral,this.pedidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPedidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPedidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPedidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.pedidos)) {
			if(!esControlTabla) {
				if(PedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);			
				}
				
				if(this.pedidosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPedidos(this.pedidos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPedidos(this.pedidosReturnGeneral,this.pedidosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.pedidosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPedidos(classes,this.pedidosReturnGeneral,this.pedidosBean,false);
					}
						
					if(this.pedidosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPedidos(this.pedidosReturnGeneral.getPedidos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPedidos(this.pedidosReturnGeneral.getPedidos());	
					}
						
					if(this.pedidosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPedidos(this.pedidosReturnGeneral.getPedidos(),classes);//this.pedidosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPedidos(this.pedidos,classes);//this.pedidosBean);									
				}
			
				if(PedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPedidos(this.pedidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidos(this.pedidos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.pedidosAnterior!=null) {
						this.pedidos=this.pedidosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pedidosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.pedidosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.pedidosReturnGeneral.getPedidos(),pedidosLogic.getPedidoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.pedidosReturnGeneral.getPedidos(),this.pedidoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPedidos.repaint();
				
				//((AbstractTableModel) this.jTableDatosPedidos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPedidos();
			}
		}
	}
	
	public void actualizarVisualTableDatosPedidos() throws Exception {
		
		PedidosModel pedidosModel=(PedidosModel)this.jTableDatosPedidos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidosModel.pedidoss=this.pedidosLogic.getPedidoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			pedidosModel.pedidoss=this.pedidoss;
		}
		
		
		((PedidosModel) this.jTableDatosPedidos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPedidos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpedidosAnterior(),this.pedidosLogic.getPedidoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpedidosAnterior(),this.pedidoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPedidos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPedidos(Pedidos pedidos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
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
										
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidos,new Object(),generalEntityParameterGeneral,this.pedidosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.pedidosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PedidosConstantesFunciones.getClassesRelationshipsOfPedidos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PedidosConstantesFunciones.getClassesRelationshipsFromStringsOfPedidos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPedidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidos,new Object(),generalEntityParameterGeneral,this.pedidosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPedidos(PedidosBean pedidosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPedidos(ArrayList<Classe> classes,PedidosReturnGeneral pedidosReturnGeneral,PedidosBean pedidosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPedidos(Pedidos pedidos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.pedidos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPedidos = new PedidosDetalleFormJInternalFrame(jDesktopPane,this.pedidosSessionBean.getConGuardarRelaciones(),this.pedidosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPedidos);
		this.jInternalFrameDetalleFormPedidos.setVisible(false);
		this.jInternalFrameDetalleFormPedidos.setSelected(false);						
		
		this.jInternalFrameDetalleFormPedidos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPedidos.pedidosLogic=this.pedidosLogic;
		
		this.cargarCombosFrameForeignKeyPedidos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePedidos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePedidos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPedidos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPedidos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPedidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPedidos"));
		
		this.jInternalFrameDetalleFormPedidos.jButtonModificarPedidos.addActionListener(new ButtonActionListener(this,"ModificarPedidos"));

		
		this.jInternalFrameDetalleFormPedidos.jButtonModificarToolBarPedidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarPedidos"));
					
		this.jInternalFrameDetalleFormPedidos.jMenuItemModificarPedidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarPedidos"));		
		
		
		
		this.jInternalFrameDetalleFormPedidos.jButtonActualizarPedidos.addActionListener (new ButtonActionListener(this,"ActualizarPedidos"));
		
		
		this.jInternalFrameDetalleFormPedidos.jButtonActualizarToolBarPedidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPedidos"));
						
		this.jInternalFrameDetalleFormPedidos.jMenuItemActualizarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPedidos"));		
		
		
		
		this.jInternalFrameDetalleFormPedidos.jButtonEliminarPedidos.addActionListener (new ButtonActionListener(this,"EliminarPedidos"));
		
		
		this.jInternalFrameDetalleFormPedidos.jButtonEliminarToolBarPedidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarPedidos"));
								
		this.jInternalFrameDetalleFormPedidos.jMenuItemEliminarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPedidos"));		
		
		
		
		this.jInternalFrameDetalleFormPedidos.jButtonCancelarPedidos.addActionListener (new ButtonActionListener(this,"CancelarPedidos"));
		
		
		this.jInternalFrameDetalleFormPedidos.jButtonCancelarToolBarPedidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarPedidos"));
					
		this.jInternalFrameDetalleFormPedidos.jMenuItemCancelarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPedidos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPedidos.jMenuItemDetalleCerrarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPedidos"));		
		
		
		
		this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosToolBarPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidos"));
		
		
		
		this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosToolBarPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidos"));
		
		
		
		this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPedidos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonidPedidosBusqueda.addActionListener(new ButtonActionListener(this,"idPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidos.jButtonid_empresaPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonid_empresaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidos.jButtonid_estado_pedidoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_estado_pedidoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonid_estado_pedidoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_pedidoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_emision_desdePedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdePedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_emision_hastaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnombre_completo_clientePedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clientePedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnombre_monedaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnombre_zonaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnumeroPedidosBusqueda.addActionListener(new ButtonActionListener(this,"numeroPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonivaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"ivaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtondescuento_valorPedidosBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonotroPedidosBusqueda.addActionListener(new ButtonActionListener(this,"otroPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtontotalPedidosBusqueda.addActionListener(new ButtonActionListener(this,"totalPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_vencimientoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_emisionPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPedidosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPedidos.jTabbedPaneRelacionesPedidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPedidos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePedidos"));
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPedidos"));
		}
		
		this.jTableDatosPedidos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPedidos"));
		
		this.jTableDatosPedidos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPedidos"));
		
		this.jButtonNuevoPedidos.addActionListener(new ButtonActionListener(this,"NuevoPedidos"));
		
		this.jButtonDuplicarPedidos.addActionListener(new ButtonActionListener(this,"DuplicarPedidos"));
		
		this.jButtonCopiarPedidos.addActionListener(new ButtonActionListener(this,"CopiarPedidos"));
		
		this.jButtonVerFormPedidos.addActionListener(new ButtonActionListener(this,"VerFormPedidos"));
		
		
		this.jButtonNuevoToolBarPedidos.addActionListener(new ButtonActionListener(this,"NuevoToolBarPedidos"));
			
		this.jButtonDuplicarToolBarPedidos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPedidos"));
			
		this.jMenuItemNuevoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPedidos"));
			
		this.jMenuItemDuplicarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPedidos"));		
		
		
		this.jButtonNuevoRelacionesPedidos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPedidos"));
		
		
		this.jButtonNuevoRelacionesToolBarPedidos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPedidos"));
			
		this.jMenuItemNuevoRelacionesPedidos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPedidos"));		
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jButtonModificarPedidos.addActionListener(new ButtonActionListener(this,"ModificarPedidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jButtonModificarToolBarPedidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarPedidos"));
			
			this.jInternalFrameDetalleFormPedidos.jMenuItemModificarPedidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarPedidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPedidos.jButtonActualizarPedidos.addActionListener (new ButtonActionListener(this,"ActualizarPedidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jButtonActualizarToolBarPedidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPedidos"));
				
			this.jInternalFrameDetalleFormPedidos.jMenuItemActualizarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPedidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jButtonEliminarPedidos.addActionListener (new ButtonActionListener(this,"EliminarPedidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jButtonEliminarToolBarPedidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarPedidos"));
						
			this.jInternalFrameDetalleFormPedidos.jMenuItemEliminarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPedidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jButtonCancelarPedidos.addActionListener (new ButtonActionListener(this,"CancelarPedidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jButtonCancelarToolBarPedidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarPedidos"));
			
			this.jInternalFrameDetalleFormPedidos.jMenuItemCancelarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPedidos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPedidos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPedidos"));		
		
		
		this.jButtonCerrarPedidos.addActionListener (new ButtonActionListener(this,"CerrarPedidos"));
		
		
		this.jButtonCerrarToolBarPedidos.addActionListener (new ButtonActionListener(this,"CerrarToolBarPedidos"));
			
		this.jMenuItemCerrarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPedidos"));
			
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jMenuItemDetalleCerrarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPedidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosPedidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosToolBarPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidos"));
		}
		
		this.jButtonCopiarToolBarPedidos.addActionListener (new ButtonActionListener(this,"CopiarToolBarPedidos"));
			
		this.jButtonVerFormToolBarPedidos.addActionListener (new ButtonActionListener(this,"VerFormToolBarPedidos"));
		
		this.jMenuItemGuardarCambiosPedidos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPedidos"));
			
		this.jMenuItemCopiarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPedidos"));		
		
		this.jMenuItemVerFormPedidos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPedidos"));		
		
		
		this.jButtonGuardarCambiosTablaPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPedidos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPedidos"));
			
		this.jMenuItemGuardarCambiosTablaPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPedidos"));		
		
		
		
		this.jButtonRecargarInformacionPedidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionPedidos"));
					
		this.jButtonRecargarInformacionToolBarPedidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPedidos"));
		
		this.jMenuItemRecargarInformacionPedidos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPedidos"));		
		
		
		
		this.jButtonAnterioresPedidos.addActionListener (new ButtonActionListener(this,"AnterioresPedidos"));
		
		
		this.jButtonAnterioresToolBarPedidos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPedidos"));
		
		this.jMenuItemAnterioresPedidos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPedidos"));		
		
		
		this.jButtonSiguientesPedidos.addActionListener (new ButtonActionListener(this,"SiguientesPedidos"));
		
		
		this.jButtonSiguientesToolBarPedidos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPedidos"));
			
		this.jMenuItemSiguientesPedidos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPedidos"));
			
		this.jMenuItemAbrirOrderByPedidos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPedidos"));
			
		this.jMenuItemMostrarOcultarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPedidos"));
			
		this.jMenuItemDetalleAbrirOrderByPedidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPedidos"));
			
		this.jMenuItemDetalleMostarOcultarPedidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPedidos"));		
		
		
		this.jButtonNuevoGuardarCambiosPedidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPedidos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPedidos"));
			
		this.jMenuItemNuevoGuardarCambiosPedidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPedidos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPedidos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPedidos"));

		this.jCheckBoxSeleccionadosPedidos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPedidos"));
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPedidos"));
		}
		
		
		this.jComboBoxTiposRelacionesPedidos.addActionListener (new ButtonActionListener(this,"TiposRelacionesPedidos"));
			
		this.jComboBoxTiposAccionesPedidos.addActionListener (new ButtonActionListener(this,"TiposAccionesPedidos"));
					
		this.jComboBoxTiposSeleccionarPedidos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPedidos"));
			
		this.jTextFieldValorCampoGeneralPedidos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPedidos"));		
		
		
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonidPedidosBusqueda.addActionListener(new ButtonActionListener(this,"idPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidos.jButtonid_empresaPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonid_empresaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidos.jButtonid_estado_pedidoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_estado_pedidoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonid_estado_pedidoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_pedidoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_emision_desdePedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdePedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_emision_hastaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnombre_completo_clientePedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clientePedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnombre_monedaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnombre_zonaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnumeroPedidosBusqueda.addActionListener(new ButtonActionListener(this,"numeroPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonivaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"ivaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtondescuento_valorPedidosBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonotroPedidosBusqueda.addActionListener(new ButtonActionListener(this,"otroPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtontotalPedidosBusqueda.addActionListener(new ButtonActionListener(this,"totalPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_vencimientoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_emisionPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPedidosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPedidosPedidos.addActionListener(new ButtonActionListener(this,"BusquedaPedidosPedidos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPedidos!=null) {
				this.jInternalFrameReporteDinamicoPedidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidos"));
				this.jInternalFrameReporteDinamicoPedidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidos"));
				this.jInternalFrameReporteDinamicoPedidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidos"));
			}
			
			//this.jButtonCerrarReporteDinamicoPedidos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidos"));				
			//this.jButtonGenerarReporteDinamicoPedidos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidos"));
			//this.jButtonGenerarExcelReporteDinamicoPedidos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPedidos!=null) {
				this.jInternalFrameImportacionPedidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPedidos"));
				this.jInternalFrameImportacionPedidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPedidos"));
				this.jInternalFrameImportacionPedidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPedidos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPedidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByPedidos"));
			
			this.jButtonAbrirOrderByToolBarPedidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPedidos"));			
			
			if(this.jInternalFrameOrderByPedidos!=null) {
				this.jInternalFrameOrderByPedidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPedidos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidos.jTabbedPaneRelacionesPedidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPedidos"));
		
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
            		closingInternalFramePedidos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPedidos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPedidos = (JInternalFrameBase)event.getSource();
	            	
	            PedidosBeanSwingJInternalFrame jInternalFrameParent=(PedidosBeanSwingJInternalFrame)jInternalFrameDetalleFormPedidos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPedidosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPedidos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPedidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPedidos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPedidos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPedidos";
		inputMap = this.jButtonNuevoPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPedidosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPedidos";
		inputMap = this.jButtonNuevoRelacionesPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPedidosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPedidos";
		inputMap = this.jButtonModificarPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPedidos";
		inputMap = this.jButtonActualizarPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPedidos";
		inputMap = this.jButtonEliminarPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPedidos";
		inputMap = this.jButtonCancelarPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPedidos";
		inputMap = this.jButtonCerrarPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPedidos";
		inputMap = this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPedidos.jButtonGuardarCambiosPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPedidos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPedidosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPedidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPedidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPedidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPedidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPedidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPedidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonidPedidosBusqueda.addActionListener(new ButtonActionListener(this,"idPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidos.jButtonid_empresaPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonid_empresaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidos.jButtonid_estado_pedidoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_estado_pedidoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonid_estado_pedidoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_pedidoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_emision_desdePedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdePedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_emision_hastaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnombre_completo_clientePedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clientePedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnombre_monedaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnombre_zonaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonnumeroPedidosBusqueda.addActionListener(new ButtonActionListener(this,"numeroPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonivaPedidosBusqueda.addActionListener(new ButtonActionListener(this,"ivaPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtondescuento_valorPedidosBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonotroPedidosBusqueda.addActionListener(new ButtonActionListener(this,"otroPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtontotalPedidosBusqueda.addActionListener(new ButtonActionListener(this,"totalPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_vencimientoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidos.jButtonfecha_emisionPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPedidosBusqueda"));
		
		
		this.jButtonBusquedaPedidosPedidos.addActionListener(new ButtonActionListener(this,"BusquedaPedidosPedidos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPedidosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPedidos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPedidos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Pedidos pedidosAux:this.pedidosLogic.getPedidoss()) {
					pedidosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Pedidos pedidosAux:pedidoss) {
					pedidosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPedidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPedidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Pedidos pedidosAux:this.pedidosLogic.getPedidoss()) {
						pedidosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Pedidos pedidosAux:pedidoss) {
						pedidosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Pedidos pedidosAux:this.pedidosLogic.getPedidoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Pedidos pedidosAux:pedidoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPedidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPedidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPedidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPedidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPedidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPedidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPedidos.getSelectedRows();
			
			Pedidos pedidosLocal=new Pedidos();
			
			//this.seleccionarTodosPedidos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidosLocal =(Pedidos) this.pedidosLogic.getPedidoss().toArray()[this.jTableDatosPedidos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					pedidosLocal =(Pedidos) this.pedidoss.toArray()[this.jTableDatosPedidos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				pedidosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Pedidos pedidosAux:this.pedidosLogic.getPedidoss()) {
						pedidosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Pedidos pedidosAux:pedidoss) {
						pedidosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPedidos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPedidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPedidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPedidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPedidosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPedidosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPedidosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPedidos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPedidos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Pedidos pedidosAux:this.pedidosLogic.getPedidoss()) {
				
						if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							pedidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							pedidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							pedidosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NOMBREMONEDA)) {
							existe=true;
							pedidosAux.setnombre_moneda(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							pedidosAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							pedidosAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							pedidosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_DESCUENTOVALOR)) {
							existe=true;
							pedidosAux.setdescuento_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_OTRO)) {
							existe=true;
							pedidosAux.setotro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							pedidosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							pedidosAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							pedidosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Pedidos pedidosAux:pedidoss) {
					
						if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							pedidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							pedidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							pedidosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NOMBREMONEDA)) {
							existe=true;
							pedidosAux.setnombre_moneda(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							pedidosAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							pedidosAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							pedidosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_DESCUENTOVALOR)) {
							existe=true;
							pedidosAux.setdescuento_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_OTRO)) {
							existe=true;
							pedidosAux.setotro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							pedidosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							pedidosAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							pedidosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPedidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPedidosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPedidos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPedidos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPedidos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePedidos) {				
					conSplash=true;//false;										
					
					//this.startProcessPedidos(conSplash);
				
					this.generarReportePedidossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPedidossSeleccionados();
				//this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPedidossSeleccionados(false);
				//this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPedidossSeleccionados(true);
				//this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPedidos();
				
				this.exportarPedidossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPedidoss();
				//this.importarPedidoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPedidos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPedidossSeleccionados();
				//this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pedidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPedidos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPedidos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPedidos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pedidos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.setSelectedIndex(0);					
				}	
			} 			
			else if(PedidosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePedidos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPedidos(conSplash);
					
						//this.actualizarParametrosGeneralPedidos();
						
						this.generarReporteProcesoAccionPedidossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PedidosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO PedidosES SELECCIONADOS?", "MANTENIMIENTO DE Pedidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPedidos();
				
						this.actualizarParametrosGeneralPedidos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.pedidosReturnGeneral=pedidosLogic.procesarAccionPedidossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.pedidosLogic.getPedidoss(),this.pedidosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPedidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPedidos();
					
					PedidosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPedidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPedidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPedidos.jComboBoxTiposAccionesFormularioPedidos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPedidos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPedidosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPedidos();
			
			if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();		
			Pedidos pedidos=new Pedidos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPedidos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPedidos.getSelectedItem();
			
			
			
			
			pedidossSeleccionados=this.getPedidossSeleccionados(true);
			//this.sTipoAccion;
			
			if(pedidossSeleccionados.size()==1) {
				for(Pedidos pedidosAux:pedidossSeleccionados) {
					pedidos=pedidosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPedidos();
			
      		//this.finishProcessPedidos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPedidosReturnGeneral() throws Exception {
		if(this.pedidosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.pedidosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.pedidosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.pedidosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.pedidosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.pedidosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPedidos(false);
		}
		
		if(this.pedidosReturnGeneral.getConRetornoLista() || this.pedidosReturnGeneral.getConRetornoObjeto()) {
			if(this.pedidosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.pedidosLogic.setPedidoss(this.pedidosReturnGeneral.getPedidoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingPedidos(false);
		}
	}
	
	public void actualizarParametrosGeneralPedidos() throws Exception {
		
		
	}
	
	public ArrayList<Pedidos> getPedidossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPedidos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Pedidos pedidosAux:pedidosLogic.getPedidoss()) {
					if(pedidosAux.getIsSelected()) {
						pedidossSeleccionados.add(pedidosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Pedidos pedidosAux:this.pedidoss) {
					if(pedidosAux.getIsSelected()) {
						pedidossSeleccionados.add(pedidosAux);				
					}
				}
			}
			
			if(pedidossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						pedidossSeleccionados.addAll(this.pedidosLogic.getPedidoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						pedidossSeleccionados.addAll(this.pedidoss);				
					}
				}
			}
		} else {
			pedidossSeleccionados.add(this.pedidos);
		}
		
		return pedidossSeleccionados;
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
	
	public void generarReportePedidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPedidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPedidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPedidossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPedidossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pedidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPedidossSeleccionados() throws Exception {
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();		
		
		pedidossSeleccionados=this.getPedidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePedidoss("Todos",pedidossSeleccionados);
		
	}	
	
	public void generarReporteNormalPedidossSeleccionados() throws Exception {
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();		
		
		pedidossSeleccionados=this.getPedidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePedidoss("Todos",pedidossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPedidossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();
		
		pedidossSeleccionados=this.getPedidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePedidoss("Todos",pedidossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPedidossSeleccionados() throws Exception {
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPedidos();
		
		
		pedidossSeleccionados=this.getPedidossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPedidos();
		
		
		//this.generarReportePedidoss("Todos",pedidossSeleccionados ,pedidosImplementable,pedidosImplementableHome);
	}
	
	public void mostrarImportacionPedidoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPedidos();
		
		this.abrirFrameImportacionPedidos();		
		
			
		//this.generarReportePedidoss("Todos",pedidossSeleccionados ,pedidosImplementable,pedidosImplementableHome);
	}
	
	public void importarPedidoss() throws Exception {		
	
	}
	
	public void exportarPedidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPedidossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPedidossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPedidossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pedidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPedidossSeleccionados() throws Exception {
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();		
		
		pedidossSeleccionados=this.getPedidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPedidos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Pedidos pedidosAux:pedidossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPedidos(pedidosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//pedidosAux.setsDetalleGeneralEntityReporte(pedidosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPedidos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_IDESTADOPEDIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_NOMBREMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_DESCUENTOVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_OTRO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosConstantesFunciones.LABEL_FECHAEMISION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPedidos(Pedidos pedidos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=pedidos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getestadopedido_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getnombre_moneda();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getdescuento_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getotro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidos.getfecha_emision().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPedidossSeleccionados() throws Exception {
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();		
		
		pedidossSeleccionados=this.getPedidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Pedidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPedidos(row);				
				iRow++;
			}				
			
			for(Pedidos pedidosAux:pedidossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPedidos(pedidosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPedidossSeleccionados() throws Exception {
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();		
		
		pedidossSeleccionados=this.getPedidossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("pedidoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("pedidos");
			//elementRoot.appendChild(element);
		
			for(Pedidos pedidosAux:pedidossSeleccionados) {
				element = document.createElement("pedidos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPedidos(pedidosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPedidos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_IDESTADOPEDIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_NOMBREMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_DESCUENTOVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_OTRO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosConstantesFunciones.LABEL_FECHAEMISION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPedidos(Pedidos pedidos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getestadopedido_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getnombre_moneda());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getdescuento_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getotro());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidos.getfecha_emision());				
	}
	
	public void setFilaDatosExportarXmlPedidos(Pedidos pedidos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PedidosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(pedidos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PedidosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(pedidos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PedidosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(pedidos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementestadopedido_descripcion = document.createElement(PedidosConstantesFunciones.IDESTADOPEDIDO);
		elementestadopedido_descripcion.appendChild(document.createTextNode(pedidos.getestadopedido_descripcion()));
		element.appendChild(elementestadopedido_descripcion);

		Element elementfecha_emision_desde = document.createElement(PedidosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(pedidos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(PedidosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(pedidos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_completo_cliente = document.createElement(PedidosConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(pedidos.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnombre_moneda = document.createElement(PedidosConstantesFunciones.NOMBREMONEDA);
		elementnombre_moneda.appendChild(document.createTextNode(pedidos.getnombre_moneda().trim()));
		element.appendChild(elementnombre_moneda);

		Element elementnombre_zona = document.createElement(PedidosConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(pedidos.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnumero = document.createElement(PedidosConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(pedidos.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementiva = document.createElement(PedidosConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(pedidos.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescuento_valor = document.createElement(PedidosConstantesFunciones.DESCUENTOVALOR);
		elementdescuento_valor.appendChild(document.createTextNode(pedidos.getdescuento_valor().toString().trim()));
		element.appendChild(elementdescuento_valor);

		Element elementotro = document.createElement(PedidosConstantesFunciones.OTRO);
		elementotro.appendChild(document.createTextNode(pedidos.getotro().toString().trim()));
		element.appendChild(elementotro);

		Element elementtotal = document.createElement(PedidosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(pedidos.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementfecha_vencimiento = document.createElement(PedidosConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(pedidos.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementfecha_emision = document.createElement(PedidosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(pedidos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);
	}
	
	public void generarReporteGroupGenericoPedidossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Pedidos> pedidossSeleccionados=new ArrayList<Pedidos>();
		
		pedidossSeleccionados=this.getPedidossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPedidos(pedidossSeleccionados);
		
		this.generarReportePedidoss("Todos",pedidossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPedidos(ArrayList<Pedidos> pedidossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Pedidos pedidosAux:pedidossSeleccionados) {
				pedidosAux.setsDetalleGeneralEntityReporte(pedidosAux.toString());
			
				if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					pedidosAux.setsDescripcionGeneralEntityReporte1(pedidosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_IDESTADOPEDIDO)) {
					existe=true;
					pedidosAux.setsDescripcionGeneralEntityReporte1(pedidosAux.getestadopedido_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					pedidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					pedidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					pedidosAux.setsDescripcionGeneralEntityReporte1(pedidosAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NOMBREMONEDA)) {
					existe=true;
					pedidosAux.setsDescripcionGeneralEntityReporte1(pedidosAux.getnombre_moneda());
				}
				 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					pedidosAux.setsDescripcionGeneralEntityReporte1(pedidosAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					pedidosAux.setsDescripcionGeneralEntityReporte1(pedidosAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					pedidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidosAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(PedidosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					pedidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidosAux.getfecha_emision()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPedidos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPedidos=true;
				this.isVisibilidadCeldaNuevoRelacionesPedidos=true;
				this.isVisibilidadCeldaGuardarCambiosPedidos=true;
			}
			
			this.isVisibilidadCeldaModificarPedidos=false;
			this.isVisibilidadCeldaActualizarPedidos=false;
			this.isVisibilidadCeldaEliminarPedidos=false;
			this.isVisibilidadCeldaCancelarPedidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidos=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPedidos=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosPedidos=false;
			this.isVisibilidadCeldaModificarPedidos=false;
			this.isVisibilidadCeldaActualizarPedidos=true;
			this.isVisibilidadCeldaEliminarPedidos=false;
			this.isVisibilidadCeldaCancelarPedidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidos=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPedidos=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosPedidos=false;
			this.isVisibilidadCeldaModificarPedidos=false;
			this.isVisibilidadCeldaActualizarPedidos=true;
			this.isVisibilidadCeldaEliminarPedidos=true;
			this.isVisibilidadCeldaCancelarPedidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidos=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPedidos=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosPedidos=false;
			this.isVisibilidadCeldaModificarPedidos=false;
			this.isVisibilidadCeldaActualizarPedidos=true;
			this.isVisibilidadCeldaEliminarPedidos=false;
			this.isVisibilidadCeldaCancelarPedidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidos=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPedidos=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidos=true;
			this.isVisibilidadCeldaGuardarCambiosPedidos=true;
			this.isVisibilidadCeldaModificarPedidos=false;
			this.isVisibilidadCeldaActualizarPedidos=false;
			this.isVisibilidadCeldaEliminarPedidos=false;
			this.isVisibilidadCeldaCancelarPedidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidos=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPedidos=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosPedidos=false;
			this.isVisibilidadCeldaActualizarPedidos=false;
			this.isVisibilidadCeldaEliminarPedidos=false;
			this.isVisibilidadCeldaCancelarPedidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidos=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPedidos=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosPedidos=false;
			this.isVisibilidadCeldaModificarPedidos=true;
			this.isVisibilidadCeldaActualizarPedidos=false;
			this.isVisibilidadCeldaEliminarPedidos=false;
			this.isVisibilidadCeldaCancelarPedidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidos=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PedidosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPedidos=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidos=true;
			this.isVisibilidadCeldaGuardarCambiosPedidos=true;
		} else {
			this.actualizarEstadoPanelsPedidos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPedidos=false;
			//this.isVisibilidadCeldaVerFormPedidos=false;
			this.isVisibilidadCeldaDuplicarPedidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!pedidosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPedidos=false;
		} else {
			this.isVisibilidadCeldaNuevoPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosPedidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(pedidosSessionBean.getEsGuardarRelacionado()) {
			if(!pedidosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPedidos=false;												
			}
			
			this.jButtonCerrarPedidos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPedidos=false;
		}
		
		if(!this.permiteMantenimiento(this.pedidos)) {
			this.isVisibilidadCeldaActualizarPedidos=false;
			this.isVisibilidadCeldaEliminarPedidos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoPedidos=false;
		this.isVisibilidadCeldaNuevoRelacionesPedidos=false;
		this.isVisibilidadCeldaGuardarCambiosPedidos=false;
		//this.isVisibilidadCeldaModificarPedidos=true;
		this.isVisibilidadCeldaActualizarPedidos=false;
		this.isVisibilidadCeldaEliminarPedidos=false;
		//this.isVisibilidadCeldaCancelarPedidos=true;			
		this.isVisibilidadCeldaGuardarPedidos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPedidos() {
	}
	
	public void actualizarEstadoPanelsPedidos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPedidos!=null) {
				this.jScrollPanelDatosEdicionPedidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidos!=null) {
				this.jTabbedPaneBusquedasPedidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidos!=null) {
				this.jScrollPanelDatosPedidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidos!=null) {
				this.jPanelPaginacionPedidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidos!=null) {
				this.jPanelParametrosReportesPedidos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPedidos!=null) {
				this.jScrollPanelDatosEdicionPedidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidos!=null) {
				this.jTabbedPaneBusquedasPedidos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPedidos!=null) {
				this.jScrollPanelDatosPedidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidos!=null) {
				this.jPanelPaginacionPedidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidos!=null) {
				this.jPanelParametrosReportesPedidos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPedidos!=null) {
				this.jScrollPanelDatosEdicionPedidos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidos!=null) {
				this.jTabbedPaneBusquedasPedidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPedidos!=null) {
				this.jScrollPanelDatosPedidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidos!=null) {
				this.jPanelPaginacionPedidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidos!=null) {
				this.jPanelParametrosReportesPedidos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPedidos!=null) {
				this.jScrollPanelDatosEdicionPedidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidos!=null) {
				this.jTabbedPaneBusquedasPedidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPedidos!=null) {
				this.jScrollPanelDatosPedidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidos!=null) {
				this.jPanelPaginacionPedidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidos!=null) {
				this.jPanelParametrosReportesPedidos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPedidos!=null) {
				this.jScrollPanelDatosEdicionPedidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidos!=null) {
				this.jTabbedPaneBusquedasPedidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidos!=null) {
				this.jScrollPanelDatosPedidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidos!=null) {
				this.jPanelPaginacionPedidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidos!=null) {
				this.jPanelParametrosReportesPedidos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPedidos!=null) {
				this.jScrollPanelDatosEdicionPedidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidos!=null) {
				this.jTabbedPaneBusquedasPedidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidos!=null) {
				this.jScrollPanelDatosPedidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidos!=null) {
				this.jPanelPaginacionPedidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidos!=null) {
				this.jPanelParametrosReportesPedidos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPedidos!=null) {
				this.jScrollPanelDatosEdicionPedidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidos!=null) {
				this.jTabbedPaneBusquedasPedidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidos!=null) {
				this.jScrollPanelDatosPedidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidos!=null) {
				this.jPanelPaginacionPedidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidos!=null) {
				this.jPanelParametrosReportesPedidos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.pedidosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPedidos!=null) {
					this.jTabbedPaneBusquedasPedidos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPedidos!=null) {
				this.jPanelParametrosReportesPedidos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.pedidosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidos!=null) {
				this.jTabbedPaneBusquedasPedidos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPedidos!=null) {
				this.jPanelParametrosReportesPedidos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPedidos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPedidos) {this.jTabbedPaneBusquedasPedidos.remove(jPanelBusquedaPedidosPedidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoPedido(Boolean isParaEstadoPedido){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoPedidoNegation=!isParaEstadoPedido;

			this.isVisibilidadBusquedaPedidos=isParaEstadoPedido;
			if(!this.isVisibilidadBusquedaPedidos) {this.jTabbedPaneBusquedasPedidos.remove(jPanelBusquedaPedidosPedidos);}
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
			
			this.inicializarActualizarBindingTablaPedidos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPedidos() {
		this.updateBorderResaltarBusquedasFormularioPedidos();
		this.updateVisibilidadBusquedasFormularioPedidos();
		this.updateHabilitarBusquedasFormularioPedidos();
	}
	
	public void updateBorderResaltarBusquedasFormularioPedidos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPedidos.getComponents().length>0) {
	

		if(this.pedidosConstantesFunciones.resaltarBusquedaPedidosPedidos!=null) {
			index= this.jTabbedPaneBusquedasPedidos.indexOfComponent(this.jPanelBusquedaPedidosPedidos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidos.getComponent(index);
				jPanel.setBorder(this.pedidosConstantesFunciones.resaltarBusquedaPedidosPedidos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPedidos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPedidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPedidos.indexOfComponent(this.jPanelBusquedaPedidosPedidos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidosConstantesFunciones.mostrarBusquedaPedidosPedidos);
			if(!this.pedidosConstantesFunciones.mostrarBusquedaPedidosPedidos && index>-1) {
				this.jTabbedPaneBusquedasPedidos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPedidos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPedidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPedidos.indexOfComponent(this.jPanelBusquedaPedidosPedidos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidosConstantesFunciones.activarBusquedaPedidosPedidos);
				this.jTabbedPaneBusquedasPedidos.setEnabledAt(index,this.pedidosConstantesFunciones.activarBusquedaPedidosPedidos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPedidos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPedidos")) {
			index= this.jTabbedPaneBusquedasPedidos.indexOfComponent(this.jPanelBusquedaPedidosPedidos);

			this.jTabbedPaneBusquedasPedidos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidos.getComponent(index);

			this.pedidosConstantesFunciones.setResaltarBusquedaPedidosPedidos(resaltar);

			jPanel.setBorder(this.pedidosConstantesFunciones.resaltarBusquedaPedidosPedidos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPedidos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPedidos() throws Exception {

		if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPedidos();
		this.updateVisibilidadResaltarControlesFormularioPedidos();
		this.updateHabilitarResaltarControlesFormularioPedidos();
		
	}
	
	public void updateBorderResaltarControlesFormularioPedidos() throws Exception {
		if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.pedidosConstantesFunciones.resaltaridPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.setBorder(this.pedidosConstantesFunciones.resaltaridPedidos);}
		if(this.pedidosConstantesFunciones.resaltarid_empresaPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.setBorder(this.pedidosConstantesFunciones.resaltarid_empresaPedidos);}
		if(this.pedidosConstantesFunciones.resaltarid_estado_pedidoPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.setBorder(this.pedidosConstantesFunciones.resaltarid_estado_pedidoPedidos);}
		if(this.pedidosConstantesFunciones.resaltarfecha_emision_desdePedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emision_desdePedidos.setBorder(this.pedidosConstantesFunciones.resaltarfecha_emision_desdePedidos);}
		if(this.pedidosConstantesFunciones.resaltarfecha_emision_hastaPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emision_hastaPedidos.setBorder(this.pedidosConstantesFunciones.resaltarfecha_emision_hastaPedidos);}
		if(this.pedidosConstantesFunciones.resaltarnombre_completo_clientePedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jTextAreanombre_completo_clientePedidos.setBorder(this.pedidosConstantesFunciones.resaltarnombre_completo_clientePedidos);}
		if(this.pedidosConstantesFunciones.resaltarnombre_monedaPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_monedaPedidos.setBorder(this.pedidosConstantesFunciones.resaltarnombre_monedaPedidos);}
		if(this.pedidosConstantesFunciones.resaltarnombre_zonaPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_zonaPedidos.setBorder(this.pedidosConstantesFunciones.resaltarnombre_zonaPedidos);}
		if(this.pedidosConstantesFunciones.resaltarnumeroPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jTextFieldnumeroPedidos.setBorder(this.pedidosConstantesFunciones.resaltarnumeroPedidos);}
		if(this.pedidosConstantesFunciones.resaltarivaPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jTextFieldivaPedidos.setBorder(this.pedidosConstantesFunciones.resaltarivaPedidos);}
		if(this.pedidosConstantesFunciones.resaltardescuento_valorPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jTextFielddescuento_valorPedidos.setBorder(this.pedidosConstantesFunciones.resaltardescuento_valorPedidos);}
		if(this.pedidosConstantesFunciones.resaltarotroPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jTextFieldotroPedidos.setBorder(this.pedidosConstantesFunciones.resaltarotroPedidos);}
		if(this.pedidosConstantesFunciones.resaltartotalPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jTextFieldtotalPedidos.setBorder(this.pedidosConstantesFunciones.resaltartotalPedidos);}
		if(this.pedidosConstantesFunciones.resaltarfecha_vencimientoPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_vencimientoPedidos.setBorder(this.pedidosConstantesFunciones.resaltarfecha_vencimientoPedidos);}
		if(this.pedidosConstantesFunciones.resaltarfecha_emisionPedidos!=null && this.jInternalFrameDetalleFormPedidos!=null) {this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emisionPedidos.setBorder(this.pedidosConstantesFunciones.resaltarfecha_emisionPedidos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPedidos() throws Exception {		
		if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPedidos!=null) {
	
		//this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.setVisible(this.pedidosConstantesFunciones.mostraridPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelidPedidos.setVisible(this.pedidosConstantesFunciones.mostraridPedidos);
		//this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.setVisible(this.pedidosConstantesFunciones.mostrarid_empresaPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelid_empresaPedidos.setVisible(this.pedidosConstantesFunciones.mostrarid_empresaPedidos);
		//this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.setVisible(this.pedidosConstantesFunciones.mostrarid_estado_pedidoPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelid_estado_pedidoPedidos.setVisible(this.pedidosConstantesFunciones.mostrarid_estado_pedidoPedidos);
		//this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emision_desdePedidos.setVisible(this.pedidosConstantesFunciones.mostrarfecha_emision_desdePedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelfecha_emision_desdePedidos.setVisible(this.pedidosConstantesFunciones.mostrarfecha_emision_desdePedidos);
		//this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emision_hastaPedidos.setVisible(this.pedidosConstantesFunciones.mostrarfecha_emision_hastaPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelfecha_emision_hastaPedidos.setVisible(this.pedidosConstantesFunciones.mostrarfecha_emision_hastaPedidos);
		//this.jInternalFrameDetalleFormPedidos.jTextAreanombre_completo_clientePedidos.setVisible(this.pedidosConstantesFunciones.mostrarnombre_completo_clientePedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelnombre_completo_clientePedidos.setVisible(this.pedidosConstantesFunciones.mostrarnombre_completo_clientePedidos);
		//this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_monedaPedidos.setVisible(this.pedidosConstantesFunciones.mostrarnombre_monedaPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelnombre_monedaPedidos.setVisible(this.pedidosConstantesFunciones.mostrarnombre_monedaPedidos);
		//this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_zonaPedidos.setVisible(this.pedidosConstantesFunciones.mostrarnombre_zonaPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelnombre_zonaPedidos.setVisible(this.pedidosConstantesFunciones.mostrarnombre_zonaPedidos);
		//this.jInternalFrameDetalleFormPedidos.jTextFieldnumeroPedidos.setVisible(this.pedidosConstantesFunciones.mostrarnumeroPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelnumeroPedidos.setVisible(this.pedidosConstantesFunciones.mostrarnumeroPedidos);
		//this.jInternalFrameDetalleFormPedidos.jTextFieldivaPedidos.setVisible(this.pedidosConstantesFunciones.mostrarivaPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelivaPedidos.setVisible(this.pedidosConstantesFunciones.mostrarivaPedidos);
		//this.jInternalFrameDetalleFormPedidos.jTextFielddescuento_valorPedidos.setVisible(this.pedidosConstantesFunciones.mostrardescuento_valorPedidos);
		this.jInternalFrameDetalleFormPedidos.jPaneldescuento_valorPedidos.setVisible(this.pedidosConstantesFunciones.mostrardescuento_valorPedidos);
		//this.jInternalFrameDetalleFormPedidos.jTextFieldotroPedidos.setVisible(this.pedidosConstantesFunciones.mostrarotroPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelotroPedidos.setVisible(this.pedidosConstantesFunciones.mostrarotroPedidos);
		//this.jInternalFrameDetalleFormPedidos.jTextFieldtotalPedidos.setVisible(this.pedidosConstantesFunciones.mostrartotalPedidos);
		this.jInternalFrameDetalleFormPedidos.jPaneltotalPedidos.setVisible(this.pedidosConstantesFunciones.mostrartotalPedidos);
		//this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_vencimientoPedidos.setVisible(this.pedidosConstantesFunciones.mostrarfecha_vencimientoPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelfecha_vencimientoPedidos.setVisible(this.pedidosConstantesFunciones.mostrarfecha_vencimientoPedidos);
		//this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emisionPedidos.setVisible(this.pedidosConstantesFunciones.mostrarfecha_emisionPedidos);
		this.jInternalFrameDetalleFormPedidos.jPanelfecha_emisionPedidos.setVisible(this.pedidosConstantesFunciones.mostrarfecha_emisionPedidos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPedidos() throws Exception {
		if(this.jInternalFrameDetalleFormPedidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPedidos!=null) {
	
		this.jInternalFrameDetalleFormPedidos.jLabelidPedidos.setEnabled(this.pedidosConstantesFunciones.activaridPedidos);
		this.jInternalFrameDetalleFormPedidos.jComboBoxid_empresaPedidos.setEnabled(this.pedidosConstantesFunciones.activarid_empresaPedidos);
		this.jInternalFrameDetalleFormPedidos.jComboBoxid_estado_pedidoPedidos.setEnabled(this.pedidosConstantesFunciones.activarid_estado_pedidoPedidos);
		this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emision_desdePedidos.setEnabled(this.pedidosConstantesFunciones.activarfecha_emision_desdePedidos);
		this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emision_hastaPedidos.setEnabled(this.pedidosConstantesFunciones.activarfecha_emision_hastaPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextAreanombre_completo_clientePedidos.setEnabled(this.pedidosConstantesFunciones.activarnombre_completo_clientePedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_monedaPedidos.setEnabled(this.pedidosConstantesFunciones.activarnombre_monedaPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldnombre_zonaPedidos.setEnabled(this.pedidosConstantesFunciones.activarnombre_zonaPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldnumeroPedidos.setEnabled(this.pedidosConstantesFunciones.activarnumeroPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldivaPedidos.setEnabled(this.pedidosConstantesFunciones.activarivaPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFielddescuento_valorPedidos.setEnabled(this.pedidosConstantesFunciones.activardescuento_valorPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldotroPedidos.setEnabled(this.pedidosConstantesFunciones.activarotroPedidos);
		this.jInternalFrameDetalleFormPedidos.jTextFieldtotalPedidos.setEnabled(this.pedidosConstantesFunciones.activartotalPedidos);
		this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_vencimientoPedidos.setEnabled(this.pedidosConstantesFunciones.activarfecha_vencimientoPedidos);
		this.jInternalFrameDetalleFormPedidos.jDateChooserfecha_emisionPedidos.setEnabled(this.pedidosConstantesFunciones.activarfecha_emisionPedidos);
		}
	}
	
		
}